import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static466 {

	@OriginalMember(owner = "client!qr", name = "e", descriptor = "[[I")
	public static int[][] anIntArrayArray45;

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_90 = new Class257(7, -1);

	@OriginalMember(owner = "client!qr", name = "d", descriptor = "I")
	public static final int anInt8484 = 1406;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(BZ)V")
	public static void method7017() {
		@Pc(19) Class8_Sub31 local19 = Static51.method1418(Static633.aClass257_116, Static608.aClass336_1);
		Static262.method4604(local19);
		for (@Pc(27) Class8_Sub51 local27 = (Class8_Sub51) Static218.aClass253_14.method6593(); local27 != null; local27 = (Class8_Sub51) Static218.aClass253_14.method6595()) {
			if (!local27.method8639()) {
				local27 = (Class8_Sub51) Static218.aClass253_14.method6593();
				if (local27 == null) {
					break;
				}
			}
			if (local27.anInt10453 == 0) {
				Static406.method6452(true, local27, true);
			}
		}
		if (Static523.aClass331_16 != null) {
			Static86.method2113(Static523.aClass331_16);
			Static523.aClass331_16 = null;
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)V")
	public static void method7018() {
		Static566.aClass369_6.method8408();
		Static627.aClass107_5.method3242();
		Static314.aClass79_1.method2531();
		Static437.aClass199_3.method5349();
		Static297.aClass338_1.method7855();
		Static497.aClass258_21.method6650();
		Static28.aClass220_1.method5669();
		Static202.aClass333_2.method7820();
		Static418.aClass293_1.method7162();
		Static198.aClass161_1.method4577();
		Static472.aClass202_4.method5419();
		Static76.aClass67_1.method2156();
		Static612.aClass12_4.method135();
		Static216.aClass356_1.method8257();
		Static144.aClass274_1.method6930();
		Static527.aClass321_1.method7499();
		Static274.aClass270_1.method6824();
		Static543.aClass364_1.method8369();
		Static454.aClass166_2.method4639();
		Static6.aClass233_1.method6151();
		Static406.method6449();
		Static415.method6520();
		Static493.method7209();
		Static204.method3778();
		Static365.method5683();
		Static439.aClass236_76.method6245();
		Static135.aClass236_25.method6245();
		Static231.aClass236_41.method6245();
		Static468.aClass236_107.method6245();
		Static273.aClass236_52.method6245();
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(I)V")
	public static synchronized void method7019() {
		if (Static635.anObject24 != null) {
			return;
		}
		try {
			@Pc(14) Class local14 = Class.forName("java.lang.management.ManagementFactory");
			@Pc(19) Method local19 = local14.getDeclaredMethod("getPlatformMBeanServer", null);
			@Pc(24) Object local24 = local19.invoke(null, (Object[]) null);
			@Pc(57) Method local57 = local14.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), String.class, Class.class);
			Static635.anObject24 = local57.invoke(null, local24, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
		} catch (@Pc(78) Exception local78) {
			System.out.println("HeapDump setup error:");
			local78.printStackTrace();
		}
	}
}
