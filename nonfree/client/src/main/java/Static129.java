import java.lang.reflect.Method;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!er", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray12 = new int[6][];

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method2161(@OriginalArg(0) long arg0) {
		Static471.aCalendar1.setTime(new Date(arg0));
		@Pc(13) int local13 = Static471.aCalendar1.get(7);
		@Pc(17) int local17 = Static471.aCalendar1.get(5);
		@Pc(21) int local21 = Static471.aCalendar1.get(2);
		@Pc(25) int local25 = Static471.aCalendar1.get(1);
		@Pc(29) int local29 = Static471.aCalendar1.get(11);
		@Pc(38) int local38 = Static471.aCalendar1.get(12);
		@Pc(42) int local42 = Static471.aCalendar1.get(13);
		return Static258.aStringArray79[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static558.aStringArray176[local21] + "-" + local25 + " " + local29 / 10 + local29 % 10 + ":" + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V")
	public static synchronized void method2162() {
		if (Static149.anObject19 != null) {
			return;
		}
		try {
			@Pc(14) Class local14 = Class.forName("java.lang.management.ManagementFactory");
			@Pc(19) Method local19 = local14.getDeclaredMethod("getPlatformMBeanServer", null);
			@Pc(24) Object local24 = local19.invoke(null, (Object[]) null);
			@Pc(57) Method local57 = local14.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), String.class, Class.class);
			Static149.anObject19 = local57.invoke(null, local24, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
		} catch (@Pc(78) Exception local78) {
			System.out.println("HeapDump setup error:");
			local78.printStackTrace();
		}
	}
}
