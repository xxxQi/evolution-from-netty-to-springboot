package com.attackonarchitect.listener.webcontext;

/**
 * @description:
 */
public class ServletContextAttributeEvent {

    private String name;
    private Object value;









    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
