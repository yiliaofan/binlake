package com.jd.binlog.util;

public interface ConstUtils {
    /**
     * zk counter path: for retry times and kill times
     */
    String ZK_COUNTER_PATH = "/counter";

    /**
     * dynamic node for binlog offset information
     */
    String ZK_DYNAMIC_PATH = "/dynamic";

    /**
     * terminal node in case of gtid of binlog file pos
     */
    String ZK_TERMINAL_PATH = "/terminal";

    /**
     * candidate path for candidate wave nodes
     */
    String ZK_CANDIDATE_PATH = "/candidate";

    /**
     * leader path for leader specified
     */
    String ZK_LEADER_PATH = "/leader";

    /**
     * error path to store error and error info
     */
    String ZK_ERROR_PATH = "/error";

    /***
     * alarm path for user including phone and email
     */
    String ZK_ALARM_PATH = "/alarm";

    /***
     * zk admin path on the MySQL node path
     */
    String ZK_ADMIN_PATH = "/admin";

    /***
     * max retry times
     */
    int MAX_RETRY_TIMES = 100;

    /**
     * half an hour for max wait then just retry
     */
    long HALF_AN_HOUR = 30 * 60 * 1000;

    /**
     * milli seconds
     *
     * @param ts
     * @return
     */
    static long MaxWait(long ts) {
        if (ts > HALF_AN_HOUR) {
            return HALF_AN_HOUR;
        }

        return ts;
    }
}
