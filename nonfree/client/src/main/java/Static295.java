import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "[I")
	public static int[] anIntArray313;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)V")
	public static synchronized void method5067() {
		if (Static45.anObject1 != null) {
			return;
		}
		try {
			@Pc(9) Class local9 = Class.forName("java.lang.management.ManagementFactory");
			@Pc(14) Method local14 = local9.getDeclaredMethod("getPlatformMBeanServer", (Class[]) null);
			@Pc(19) Object local19 = local14.invoke((Object) null, (Object[]) null);
			@Pc(57) Method local57 = local9.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), String.class, Class.class);
			Static45.anObject1 = local57.invoke((Object) null, local19, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
		} catch (@Pc(78) Exception local78) {
			System.out.println("HeapDump setup error:");
			local78.printStackTrace();
		}
	}
}
