import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!lu", name = "i", descriptor = "I")
	public static int anInt6039;

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString75 = null;

	@OriginalMember(owner = "client!lu", name = "f", descriptor = "Lclient!ke;")
	public static final Class189 aClass189_4 = new Class189(16);

	@OriginalMember(owner = "client!lu", name = "g", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_84 = new Class289(63, 3);

	@OriginalMember(owner = "client!lu", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString76 = null;

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIZ)Z")
	public static boolean method5135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static440.method6454(arg0, arg1) || Static454.method6568(arg1, arg0);
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!gga;I)Lclient!hga;")
	public static Class141 method5136(@OriginalArg(0) Class6_Sub23 arg0) {
		@Pc(12) Class141 local12 = new Class141();
		local12.anInt3636 = arg0.method8363();
		local12.aClass6_Sub4_Sub13_1 = Static418.aClass377_1.method8763(local12.anInt3636);
		return local12;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(B)V")
	public static synchronized void method5137() {
		if (Static493.anObject22 != null) {
			return;
		}
		try {
			@Pc(17) Class local17 = Class.forName("java.lang.management.ManagementFactory");
			@Pc(22) Method local22 = local17.getDeclaredMethod("getPlatformMBeanServer", (Class[]) null);
			@Pc(27) Object local27 = local22.invoke((Object) null, (Object[]) null);
			@Pc(60) Method local60 = local17.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), String.class, Class.class);
			Static493.anObject22 = local60.invoke((Object) null, local27, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
		} catch (@Pc(81) Exception local81) {
			System.out.println("HeapDump setup error:");
			local81.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)V")
	public static void method5138() {
		if (Static625.method8609(Static556.anInt9319) || Static261.method3800(Static556.anInt9319)) {
			Static134.method2042(5000, Static542.anInt9140 >> 12, Static23.anInt564 >> 12);
		} else {
			@Pc(35) int local35 = Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anIntArray302[0] >> 3;
			@Pc(42) int local42 = Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anIntArray301[0] >> 3;
			if (local35 >= 0 && Static491.anInt9856 >> 3 > local35 && local42 >= 0 && local42 < Static393.anInt6574 >> 3) {
				Static134.method2042(5000, local42, local35);
			} else {
				Static134.method2042(0, Static393.anInt6574 >> 4, Static491.anInt9856 >> 4);
			}
		}
		Static440.method6453();
		Static645.method8803();
		Static484.method7050();
		Static154.method2170();
	}
}
