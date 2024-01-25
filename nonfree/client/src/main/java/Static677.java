import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static677 {

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "Lclient!eu;")
	public static Class97 aClass97_3;

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "I")
	public static int anInt10887 = 1;

	@OriginalMember(owner = "client!wv", name = "e", descriptor = "I")
	public static int anInt10890 = 0;

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IZ)I")
	public static int method9371(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 >>> 1;
		@Pc(18) int local18 = local12 | local12 >>> 1;
		@Pc(24) int local24 = local18 | local18 >>> 2;
		@Pc(30) int local30 = local24 | local24 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return ~local42 & arg0;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Z)V")
	public static synchronized void method9373() {
		if (Static82.anObject3 != null) {
			return;
		}
		try {
			@Pc(9) Class local9 = Class.forName("java.lang.management.ManagementFactory");
			@Pc(14) Method local14 = local9.getDeclaredMethod("getPlatformMBeanServer", (Class[]) null);
			@Pc(19) Object local19 = local14.invoke((Object) null, (Object[]) null);
			@Pc(52) Method local52 = local9.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), String.class, Class.class);
			Static82.anObject3 = local52.invoke((Object) null, local19, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
		} catch (@Pc(78) Exception local78) {
			System.out.println("HeapDump setup error:");
			local78.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(JI)V")
	public static void method9374(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(11) InterruptedException local11) {
		}
	}
}
