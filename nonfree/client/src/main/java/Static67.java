import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "J")
	public static long aLong45;

	@OriginalMember(owner = "client!ci", name = "g", descriptor = "[Lclient!hk;")
	public static Class155[] aClass155Array3;

	// $FF: synthetic field
	@OriginalMember(owner = "client!ci", name = "d", descriptor = "Ljava/lang/Class;")
	private static Class aClass6;

	// $FF: synthetic field
	@OriginalMember(owner = "client!ci", name = "f", descriptor = "Ljava/lang/Class;")
	private static Class aClass7;

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
	public static int anInt1117 = 0;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IB)V")
	public static void method1109(@OriginalArg(0) int arg0) {
		@Pc(14) Class5_Sub1_Sub18 local14 = Static123.method1827((long) arg0, 17);
		local14.method7444();
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
	public static synchronized void method1110() {
		if (Static224.anObject9 != null) {
			return;
		}
		try {
			@Pc(12) Class local12 = Class.forName("java.lang.management.ManagementFactory");
			@Pc(19) Method local19 = local12.getDeclaredMethod("getPlatformMBeanServer", (Class[]) null);
			@Pc(31) Object local31 = local19.invoke((Object) null, (Object[]) null);
			@Pc(74) Method local74 = local12.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), aClass6 == null ? (aClass6 = Class59.a("java.lang.String")) : aClass6, aClass7 == null ? (aClass7 = Class59.a("java.lang.Class")) : aClass7);
			Static224.anObject9 = local74.invoke((Object) null, local31, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
		} catch (@Pc(99) Exception local99) {
			System.out.println("HeapDump setup error:");
			local99.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZZ)Z")
	public static boolean method1112(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}
}
