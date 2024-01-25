import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static525 {

	@OriginalMember(owner = "client!rr", name = "e", descriptor = "I")
	public static int anInt8702;

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "[I")
	public static final int[] anIntArray558 = new int[3];

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_124 = new Class376(89, 2);

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)V")
	public static synchronized void method7360() {
		if (Static197.anObject8 != null) {
			return;
		}
		try {
			@Pc(14) Class local14 = Class.forName("java.lang.management.ManagementFactory");
			@Pc(19) Method local19 = local14.getDeclaredMethod("getPlatformMBeanServer", (Class[]) null);
			@Pc(24) Object local24 = local19.invoke((Object) null, (Object[]) null);
			@Pc(57) Method local57 = local14.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), String.class, Class.class);
			Static197.anObject8 = local57.invoke((Object) null, local24, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
		} catch (@Pc(78) Exception local78) {
			System.out.println("HeapDump setup error:");
			local78.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZLclient!so;)I")
	public static int method7361(@OriginalArg(1) Class330 arg0) {
		if (Static553.aClass330_11 == arg0) {
			return 5120;
		} else if (Static553.aClass330_12 == arg0) {
			return 5122;
		} else if (arg0 == Static553.aClass330_13) {
			return 5124;
		} else if (Static553.aClass330_14 == arg0) {
			return 5121;
		} else if (Static553.aClass330_15 == arg0) {
			return 5123;
		} else if (Static553.aClass330_16 == arg0) {
			return 5125;
		} else if (arg0 == Static553.aClass330_17) {
			return 5131;
		} else if (Static553.aClass330_18 == arg0) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
