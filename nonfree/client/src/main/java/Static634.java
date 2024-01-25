import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static634 {

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(I)V")
	public static synchronized void method8764() {
		if (Static318.anObject11 != null) {
			return;
		}
		try {
			@Pc(9) Class local9 = Class.forName("java.lang.management.ManagementFactory");
			@Pc(14) Method local14 = local9.getDeclaredMethod("getPlatformMBeanServer", (Class[]) null);
			@Pc(19) Object local19 = local14.invoke((Object) null, (Object[]) null);
			@Pc(56) Method local56 = local9.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), String.class, Class.class);
			Static318.anObject11 = local56.invoke((Object) null, local19, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
		} catch (@Pc(77) Exception local77) {
			System.out.println("HeapDump setup error:");
			local77.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(IJII)V")
	public static void method8765(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10 = (int) arg1 >> 14 & 0x1F;
		@Pc(20) int local20 = (int) arg1 >> 20 & 0x3;
		@Pc(27) int local27 = (int) (arg1 >>> 32) & Integer.MAX_VALUE;
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static588.method8257(0, arg2, local20, 0, local10, 0, true, arg0);
			return;
		}
		@Pc(43) Class283 local43 = Static525.aClass371_4.method8554(local27);
		@Pc(51) int local51;
		@Pc(54) int local54;
		if (local20 == 0 || local20 == 2) {
			local51 = local43.anInt7838;
			local54 = local43.anInt7822;
		} else {
			local54 = local43.anInt7838;
			local51 = local43.anInt7822;
		}
		@Pc(65) int local65 = local43.anInt7810;
		if (local20 != 0) {
			local65 = (local65 << local20 & 0xF) + (local65 >> 4 - local20);
		}
		Static588.method8257(local65, arg2, 0, local51, 0, local54, true, arg0);
	}
}
