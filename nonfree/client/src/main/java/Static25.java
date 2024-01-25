import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "F")
	public static float aFloat4;

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "[S")
	public static short[] aShortArray5;

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(B)V")
	public static synchronized void method352() {
		if (Static536.anObject18 != null) {
			return;
		}
		try {
			@Pc(9) Class local9 = Class.forName("java.lang.management.ManagementFactory");
			@Pc(14) Method local14 = local9.getDeclaredMethod("getPlatformMBeanServer", (Class[]) null);
			@Pc(23) Object local23 = local14.invoke((Object) null, (Object[]) null);
			@Pc(56) Method local56 = local9.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), String.class, Class.class);
			Static536.anObject18 = local56.invoke((Object) null, local23, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
		} catch (@Pc(77) Exception local77) {
			System.out.println("HeapDump setup error:");
			local77.printStackTrace();
		}
	}
}
