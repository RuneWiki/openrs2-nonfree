import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static599 {

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
	public static int anInt9786;

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "Lclient!la;")
	public static Class196 aClass196_126;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
	public static synchronized void method8385() {
		if (Static351.anObject13 != null) {
			return;
		}
		try {
			@Pc(9) Class local9 = Class.forName("java.lang.management.ManagementFactory");
			@Pc(22) Method local22 = local9.getDeclaredMethod("getPlatformMBeanServer", null);
			@Pc(27) Object local27 = local22.invoke(null, (Object[]) null);
			@Pc(60) Method local60 = local9.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), String.class, Class.class);
			Static351.anObject13 = local60.invoke(null, local27, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
		} catch (@Pc(81) Exception local81) {
			System.out.println("HeapDump setup error:");
			local81.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IB)V")
	public static void method8387(@OriginalArg(0) int arg0) {
		if (Static233.anIntArray229 == null || Static233.anIntArray229.length < arg0) {
			Static233.anIntArray229 = new int[arg0];
		}
	}
}
