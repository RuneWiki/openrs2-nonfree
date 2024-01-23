import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!mn", name = "Jb", descriptor = "Lclient!rj;")
	public static Class2_Sub3_Sub1 aClass2_Sub3_Sub1_6;

	@OriginalMember(owner = "client!mn", name = "q", descriptor = "Z")
	public static boolean aBoolean281 = false;

	@OriginalMember(owner = "client!mn", name = "Z", descriptor = "I")
	public static volatile int anInt3486 = 0;

	@OriginalMember(owner = "client!mn", name = "lb", descriptor = "I")
	public static int anInt3495 = 0;

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method2850(@OriginalArg(1) String arg0) {
		System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(III)V")
	public static void method2859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class2_Sub3_Sub16 local14 = Static119.method2204(arg0, 7);
		local14.method2718();
		local14.anInt3327 = arg1;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZI)V")
	public static void method2866(@OriginalArg(0) boolean arg0) {
		if (arg0 != Static84.aBoolean59) {
			Static84.aBoolean59 = arg0;
			Static212.method3612();
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Z)V")
	public static void method2867() {
		Static102.anInt2234 = 0;
		Static67.anInt6137 = 0;
		Static116.method2120();
		Static199.method3364();
		Static292.method4850();
		@Pc(17) int local17;
		for (local17 = 0; local17 < Static67.anInt6137; local17++) {
			@Pc(28) int local28 = Static33.anIntArray51[local17];
			if (Static148.anInt3168 != Static201.aClass36_Sub3_Sub1Array1[local28].anInt5091) {
				if (Static201.aClass36_Sub3_Sub1Array1[local28].aClass33_1.method722()) {
					Static17.method355(Static201.aClass36_Sub3_Sub1Array1[local28]);
				}
				Static201.aClass36_Sub3_Sub1Array1[local28].method2418(null);
				Static201.aClass36_Sub3_Sub1Array1[local28] = null;
			}
		}
		if (Static4.anInt151 != Static250.aClass2_Sub26_Sub1_2.anInt5328) {
			throw new RuntimeException("gnp1 pos:" + Static250.aClass2_Sub26_Sub1_2.anInt5328 + " psize:" + Static4.anInt151);
		}
		for (local17 = 0; local17 < Static71.anInt1550; local17++) {
			if (Static201.aClass36_Sub3_Sub1Array1[Static9.anIntArray12[local17]] == null) {
				throw new RuntimeException("gnp2 pos:" + local17 + " size:" + Static71.anInt1550);
			}
		}
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(ZI)V")
	public static void method2868() {
		Static137.aClass46_22.method1068(5);
		Static144.aClass46_23.method1068(5);
	}
}
