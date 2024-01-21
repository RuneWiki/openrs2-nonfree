import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!vf", name = "A", descriptor = "Lclient!vf;")
	public static Class79 aClass79_5;

	@OriginalMember(owner = "client!vf", name = "G", descriptor = "I")
	public static int anInt3064;

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "Lclient!ec;")
	private static Class22 aClass22_945 = Static60.method1113(" from your ignore list first");

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "Lclient!ec;")
	public static Class22 aClass22_946 = Static60.method1113("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!vf", name = "m", descriptor = "Lclient!ec;")
	public static Class22 aClass22_947 = aClass22_945;

	@OriginalMember(owner = "client!vf", name = "n", descriptor = "I")
	public static int anInt3052 = 0;

	@OriginalMember(owner = "client!vf", name = "p", descriptor = "[[S")
	public static short[][] aShortArrayArray5 = new short[][] { new short[0], { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!vf", name = "x", descriptor = "I")
	public static int anInt3059 = 0;

	@OriginalMember(owner = "client!vf", name = "z", descriptor = "Lclient!ec;")
	public static Class22 aClass22_948 = Static60.method1113("Cabbage");

	@OriginalMember(owner = "client!vf", name = "I", descriptor = "Lclient!ec;")
	public static Class22 aClass22_949 = Static60.method1113(":");

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IB)V")
	public static void method1980() {
		Static60.anInt1790 = 2;
		Static132.anInt3135 = -1;
		Static80.anInt2197 = 1;
		Static30.aClass20_17 = null;
		Static49.anInt1330 = 0;
		Static101.aBoolean232 = false;
		Static105.anInt2640 = -1;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)Lclient!ee;")
	public static Class4_Sub1_Sub4 method1981(@OriginalArg(1) int arg0) {
		@Pc(6) Class4_Sub1_Sub4 local6 = (Class4_Sub1_Sub4) Static2.aClass33_1.method998((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(25) byte[] local25 = Static75.aClass20_36.method597(1, arg0);
		local6 = new Class4_Sub1_Sub4();
		if (local25 != null) {
			local6.method509(arg0, new Class4_Sub11(local25));
		}
		local6.method510();
		Static2.aClass33_1.method997((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "(I)V")
	public static void method1989() {
		aClass79_5 = null;
		aClass22_946 = null;
		aClass22_948 = null;
		aShortArrayArray5 = null;
		aClass22_947 = null;
		aClass22_949 = null;
		aClass22_945 = null;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!ec;I)V")
	public static void method1990(@OriginalArg(0) Class22 arg0) {
		if (Static122.anInt1377 >= 2) {
			if (arg0.method480(Static2.aClass22_7)) {
				System.gc();
			}
			if (arg0.method480(Static72.aClass22_531)) {
				Static54.method1025();
			}
			if (arg0.method480(Static70.aClass22_512)) {
				Static132.aBoolean283 = true;
			}
			if (arg0.method480(Static56.aClass22_393)) {
				Static132.aBoolean283 = false;
			}
			if (arg0.method480(Static16.aClass22_126)) {
				for (@Pc(42) int local42 = 0; local42 < 4; local42++) {
					for (@Pc(46) int local46 = 1; local46 < 103; local46++) {
						for (@Pc(50) int local50 = 1; local50 < 103; local50++) {
							Static87.aClass60Array1[local42].anIntArrayArray27[local46][local50] = 0;
						}
					}
				}
			}
			if (arg0.method480(Static37.aClass22_256) && Static57.anInt1741 == 2) {
				throw new RuntimeException();
			}
			if (arg0.method471(Static117.aClass22_895)) {
				Static76.anInt2022 = arg0.method477(12).method484().method470();
				Static65.method1153(Static44.method856(new Class22[] { Static52.aClass22_366, Static134.method2042(Static76.anInt2022) }), 0, null);
			}
			if (arg0.method480(Static120.aClass22_908)) {
				Static123.aBoolean278 = true;
			}
		}
		Static38.aClass4_Sub11_Sub1_1.method752(89);
		Static38.aClass4_Sub11_Sub1_1.method701(arg0.method449() - 1);
		Static38.aClass4_Sub11_Sub1_1.method708(arg0.method477(2));
	}

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "(I)V")
	public static void method1991() {
		@Pc(14) boolean local14 = false;
		while (!local14) {
			local14 = true;
			for (@Pc(20) int local20 = 0; local20 < Static99.anInt2589 - 1; local20++) {
				if (Static38.anIntArray111[local20] < 1000 && Static38.anIntArray111[local20 + 1] > 1000) {
					@Pc(40) Class22 local40 = Static48.aClass22Array9[local20];
					local14 = false;
					Static48.aClass22Array9[local20] = Static48.aClass22Array9[local20 + 1];
					Static48.aClass22Array9[local20 + 1] = local40;
					@Pc(60) Class22 local60 = Static90.aClass22Array18[local20];
					Static90.aClass22Array18[local20] = Static90.aClass22Array18[local20 + 1];
					Static90.aClass22Array18[local20 + 1] = local60;
					@Pc(78) int local78 = Static38.anIntArray111[local20];
					Static38.anIntArray111[local20] = Static38.anIntArray111[local20 + 1];
					Static38.anIntArray111[local20 + 1] = local78;
					@Pc(96) int local96 = Static101.anIntArray290[local20];
					Static101.anIntArray290[local20] = Static101.anIntArray290[local20 + 1];
					Static101.anIntArray290[local20 + 1] = local96;
					@Pc(114) int local114 = Static133.anIntArray344[local20];
					Static133.anIntArray344[local20] = Static133.anIntArray344[local20 + 1];
					Static133.anIntArray344[local20 + 1] = local114;
					@Pc(132) int local132 = Static113.anIntArray306[local20];
					Static113.anIntArray306[local20] = Static113.anIntArray306[local20 + 1];
					Static113.anIntArray306[local20 + 1] = local132;
				}
			}
		}
	}
}
