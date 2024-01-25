import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static662 {

	@OriginalMember(owner = "client!waa", name = "c", descriptor = "I")
	public static int anInt10244;

	// $FF: synthetic field
	@OriginalMember(owner = "client!waa", name = "a", descriptor = "Ljava/lang/Class;")
	private static Class aClass22;

	// $FF: synthetic field
	@OriginalMember(owner = "client!waa", name = "d", descriptor = "Ljava/lang/Class;")
	private static Class aClass23;

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(I)V")
	public static synchronized void method8830() {
		if (Static441.anObject15 != null) {
			return;
		}
		try {
			@Pc(12) Class local12 = Class.forName("java.lang.management.ManagementFactory");
			@Pc(27) Method local27 = local12.getDeclaredMethod("getPlatformMBeanServer", (Class[]) null);
			@Pc(32) Object local32 = local27.invoke((Object) null, (Object[]) null);
			@Pc(75) Method local75 = local12.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), aClass22 == null ? (aClass22 = Class386.a("java.lang.String")) : aClass22, aClass23 == null ? (aClass23 = Class386.a("java.lang.Class")) : aClass23);
			Static441.anObject15 = local75.invoke((Object) null, local32, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
		} catch (@Pc(100) Exception local100) {
			System.out.println("HeapDump setup error:");
			local100.printStackTrace();
		}
	}
}
