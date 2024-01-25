import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "Lclient!vh;")
	public static Class362 aClass362_2;

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
	public static int anInt4833 = 0;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V")
	public static synchronized void method4068() {
		if (Static466.anObject17 != null) {
			return;
		}
		try {
			@Pc(13) Class local13 = Class.forName("java.lang.management.ManagementFactory");
			@Pc(18) Method local18 = local13.getDeclaredMethod("getPlatformMBeanServer", null);
			@Pc(23) Object local23 = local18.invoke(null, (Object[]) null);
			@Pc(56) Method local56 = local13.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), String.class, Class.class);
			Static466.anObject17 = local56.invoke(null, local23, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
		} catch (@Pc(77) Exception local77) {
			System.out.println("HeapDump setup error:");
			local77.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method4069(@OriginalArg(0) Class95 arg0) {
		for (@Pc(10) Class13_Sub9 local10 = (Class13_Sub9) Static82.aClass171_1.method3745(); local10 != null; local10 = (Class13_Sub9) Static82.aClass171_1.method3744()) {
			if (local10.aBoolean493) {
				local10.method5647(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZLjava/lang/String;ILjava/lang/String;)V")
	public static void method4070(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		Static507.anInt8408 = 2;
		Static500.anInt8131 = arg1;
		Static575.method7863(false, arg2, arg0);
	}
}
