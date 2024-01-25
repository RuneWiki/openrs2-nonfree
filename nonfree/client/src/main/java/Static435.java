import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static435 {

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "I")
	public static int anInt7762;

	@OriginalMember(owner = "client!qt", name = "c", descriptor = "I")
	public static int anInt7764 = 0;

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)V")
	public static synchronized void method6198() {
		if (Static443.anObject19 != null) {
			return;
		}
		try {
			@Pc(14) Class local14 = Class.forName("java.lang.management.ManagementFactory");
			@Pc(19) Method local19 = local14.getDeclaredMethod("getPlatformMBeanServer", null);
			@Pc(24) Object local24 = local19.invoke(null, (Object[]) null);
			@Pc(57) Method local57 = local14.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), String.class, Class.class);
			Static443.anObject19 = local57.invoke(null, local24, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
		} catch (@Pc(78) Exception local78) {
			System.out.println("HeapDump setup error:");
			local78.printStackTrace();
		}
	}
}
