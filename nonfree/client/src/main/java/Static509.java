import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static509 {

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "[Lclient!kga;")
	public static final Class3_Sub1_Sub12[] aClass3_Sub1_Sub12Array4 = new Class3_Sub1_Sub12[14];

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(I)V")
	public static synchronized void method7393() {
		if (Static365.anObject11 != null) {
			return;
		}
		try {
			@Pc(13) Class local13 = Class.forName("java.lang.management.ManagementFactory");
			@Pc(18) Method local18 = local13.getDeclaredMethod("getPlatformMBeanServer", null);
			@Pc(23) Object local23 = local18.invoke(null, (Object[]) null);
			@Pc(56) Method local56 = local13.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), String.class, Class.class);
			Static365.anObject11 = local56.invoke(null, local23, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
		} catch (@Pc(77) Exception local77) {
			System.out.println("HeapDump setup error:");
			local77.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(BII)Z")
	public static boolean method7394(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
