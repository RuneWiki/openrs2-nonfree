import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!mq", name = "z", descriptor = "Lclient!oh;")
	public static Class10 aClass10_1;

	@OriginalMember(owner = "client!mq", name = "A", descriptor = "I")
	public static int anInt4366;

	@OriginalMember(owner = "client!mq", name = "m", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_88 = new Class254(46, 2);

	@OriginalMember(owner = "client!mq", name = "y", descriptor = "Lclient!cv;")
	public static final Class51 aClass51_14 = new Class51(16);

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(Z)V")
	public static void method3624() {
		Static135.aClass123_2.method2914();
		Static121.aClass104_2.method2057();
		Static160.aClass122_5.method2744();
		Static251.aClass207_2.method4979();
		Static268.aClass26_1.method434();
		Static388.aClass193_3.method4255();
		Static322.aClass45_5.method696();
		Static294.aClass125_2.method2960();
		Static82.aClass260_1.method5911();
		Static157.aClass255_1.method5815();
		Static117.aClass81_1.method1627();
		Static86.aClass103_2.method2052();
		Static50.aClass177_1.method3800();
		Static192.aClass75_1.method1518();
		Static183.aClass30_1.method482();
		Static377.aClass243_1.method5511();
		Static347.aClass163_1.method3571();
		Static40.aClass165_1.method3593();
		Static394.aClass86_2.method1713();
		Static96.aClass39_1.method581();
		Static166.method2594();
		Static342.method4927();
		Static74.method1102();
		Static166.method2596();
		Static291.aClass151_187.method3297(5);
		Static111.aClass151_55.method3297(5);
		Static323.aClass151_139.method3297(5);
		Static320.aClass151_136.method3297(5);
		Static354.aClass151_155.method3297(5);
	}

	@OriginalMember(owner = "client!mq", name = "d", descriptor = "(I)Lclient!a;")
	public static Class1_Sub1_Sub1 method3625() {
		@Pc(12) Class1_Sub1_Sub1 local12 = (Class1_Sub1_Sub1) Static439.aClass247_12.method5591();
		if (local12 != null) {
			local12.method5965();
			local12.method5893();
			return local12;
		}
		do {
			local12 = (Class1_Sub1_Sub1) Static375.aClass247_11.method5591();
			if (local12 == null) {
				return null;
			}
			if (local12.method31() > Static107.method1707()) {
				return null;
			}
			local12.method5965();
			local12.method5893();
		} while ((local12.aLong231 & Long.MIN_VALUE) == 0L);
		return local12;
	}
}
