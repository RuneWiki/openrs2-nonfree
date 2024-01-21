import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "[Lclient!oe;")
	public static Class2_Sub1_Sub4_Sub3[] aClass2_Sub1_Sub4_Sub3Array1;

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "Lclient!cd;")
	public static Class10 aClass10_33 = Static51.method932(" )2> ");

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "Lclient!cd;")
	public static Class10 aClass10_34 = Static51.method932("Konfig geladen)3");

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "Lclient!cd;")
	private static Class10 aClass10_38 = Static51.method932("Your ignore list is full)3 Max of 100 users)3");

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "Lclient!cd;")
	public static Class10 aClass10_35 = aClass10_38;

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "Lclient!cd;")
	public static Class10 aClass10_36 = Static51.method932("Cabbage");

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
	public static int anInt41 = 0;

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "Lclient!cd;")
	public static Class10 aClass10_37 = Static51.method932("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!fa;Z)V")
	public static void method34(@OriginalArg(0) Class23 arg0) {
		if (Static142.anInt3158 == arg0.anInt1078) {
			Static152.aBooleanArray14[arg0.anInt1096] = true;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
	public static void method35() {
		aClass2_Sub1_Sub4_Sub3Array1 = null;
		aClass10_35 = null;
		aClass10_36 = null;
		aClass10_34 = null;
		aClass10_33 = null;
		aClass10_37 = null;
		aClass10_38 = null;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z[Lclient!cd;)Lclient!cd;")
	public static Class10 method36(@OriginalArg(1) Class10[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static123.method1979(0, arg0, arg0.length);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!cg;BLclient!cg;)V")
	public static void method37(@OriginalArg(0) Class2_Sub1_Sub4_Sub1_Sub1 arg0, @OriginalArg(2) Class2_Sub1_Sub4_Sub1_Sub1 arg1) {
		if (Static133.aBoolean132) {
			Static71.method1207(arg0, arg1);
			return;
		}
		if (Static49.anInt1185 == 0 || Static49.anInt1185 == 5) {
			arg1.method510(Static32.aClass10_396, 382, 225, 16777215, -1);
			Static172.method2018(230, 233, 304, 34, 9179409);
			Static172.method2018(231, 234, 302, 32, 0);
			Static172.method2026(232, 235, Static30.anInt813 * 3, 30, 9179409);
			Static172.method2026(Static30.anInt813 * 3 + 232, 235, 300 - Static30.anInt813 * 3, 30, 0);
			arg1.method510(Static95.aClass10_943, 382, 256, 16777215, -1);
		}
		@Pc(108) short local108;
		@Pc(116) int local116;
		if (Static49.anInt1185 == 20) {
			Static105.aClass2_Sub1_Sub4_Sub3_5.method1874(382 - Static105.aClass2_Sub1_Sub4_Sub3_5.anInt2635 / 2, -(Static105.aClass2_Sub1_Sub4_Sub3_5.anInt2632 / 2) + 271);
			local108 = 211;
			arg1.method510(Static95.aClass10_948, 382, 211, 16776960, 0);
			local116 = local108 + 15;
			arg1.method510(Static95.aClass10_940, 382, 226, 16776960, 0);
			@Pc(124) int local124 = local116 + 15;
			arg1.method510(Static95.aClass10_947, 382, 241, 16776960, 0);
			@Pc(132) int local132 = local124 + 15;
			@Pc(133) int local133 = local132 + 10;
			arg1.method532(method36(new Class10[] { Static177.aClass10_1608, Static35.method525(Static95.aClass10_951) }), 272, 266, 16777215, 0);
			@Pc(153) int local153 = local133 + 15;
			arg1.method532(method36(new Class10[] { Static63.aClass10_688, Static95.aClass10_945.method335() }), 274, 281, 16777215, 0);
			@Pc(174) int local174 = local153 + 15;
		}
		if (Static49.anInt1185 == 10) {
			Static105.aClass2_Sub1_Sub4_Sub3_5.method1874(202, 171);
			if (Static20.anInt499 == 0) {
				local108 = 251;
				arg1.method510(Static19.aClass10_232, 382, 251, 16776960, 0);
				local116 = local108 + 30;
				Static53.aClass2_Sub1_Sub4_Sub3_2.method1874(229, 271);
				arg1.method522(Static25.aClass10_328, 229, 271, 144, 40, 16777215, 0, 1, 1, 0);
				Static53.aClass2_Sub1_Sub4_Sub3_2.method1874(389, 271);
				arg1.method522(Static41.aClass10_486, 389, 271, 144, 40, 16777215, 0, 1, 1, 0);
			} else if (Static20.anInt499 == 2) {
				local108 = 211;
				arg1.method510(Static95.aClass10_948, 382, 211, 16776960, 0);
				local116 = local108 + 15;
				arg1.method510(Static95.aClass10_940, 382, 226, 16776960, 0);
				local116 += 15;
				arg1.method510(Static95.aClass10_947, 382, 241, 16776960, 0);
				@Pc(295) boolean local295;
				if (Static70.anInt1677 == 0 && Static14.anInt386 % 40 < 20 && Static62.aBoolean66) {
					local295 = true;
				} else {
					local295 = false;
				}
				local116 += 15;
				local116 += 10;
				arg1.method532(method36(new Class10[] { Static177.aClass10_1608, Static35.method525(Static95.aClass10_951), local295 ? Static1.aClass10_3 : Static95.aClass10_949 }), 272, 266, 16777215, 0);
				local116 += 15;
				if (Static70.anInt1677 == 1 && Static14.anInt386 % 40 < 20 && Static62.aBoolean66) {
					local295 = true;
				} else {
					local295 = false;
				}
				arg1.method532(method36(new Class10[] { Static63.aClass10_688, Static95.aClass10_945.method335(), local295 ? Static1.aClass10_3 : Static95.aClass10_949 }), 274, 281, 16777215, 0);
				local116 += 15;
				Static53.aClass2_Sub1_Sub4_Sub3_2.method1874(229, 301);
				arg1.method510(Static156.aClass10_1460, 302, 326, 16777215, 0);
				Static53.aClass2_Sub1_Sub4_Sub3_2.method1874(389, 301);
				arg1.method510(Static135.aClass10_1305, 462, 326, 16777215, 0);
			} else if (Static20.anInt499 == 3) {
				arg1.method510(Static6.aClass10_97, 382, 211, 16776960, 0);
				local108 = 236;
				arg1.method510(Static77.aClass10_782, 382, 236, 16777215, 0);
				local116 = local108 + 15;
				arg1.method510(Static104.aClass10_1040, 382, 251, 16777215, 0);
				local116 += 15;
				arg1.method510(Static14.aClass10_182, 382, 266, 16777215, 0);
				local116 += 15;
				arg1.method510(Static67.aClass10_1264, 382, 281, 16777215, 0);
				local116 += 15;
				Static53.aClass2_Sub1_Sub4_Sub3_2.method1874(309, 301);
				arg1.method510(Static135.aClass10_1305, 382, 326, 16777215, 0);
			}
		}
		if (Static86.anInt1946 != 1) {
			if (Static46.anInt1145 > 0) {
				Static167.method1471(Static46.anInt1145);
				Static46.anInt1145 = 0;
			}
			Static81.method1307();
		}
		Static30.aClass2_Sub1_Sub4_Sub3Array9[Static155.aBoolean149 ? 1 : 0].method1874(725, 463);
		if (Static49.anInt1185 <= 5 || Static111.anInt2520 == 2 || Static130.anInt2891 != 0) {
			return;
		}
		if (Static28.aClass2_Sub1_Sub4_Sub3_1 == null) {
			Static28.aClass2_Sub1_Sub4_Sub3_1 = Static2.method33(Static26.aClass29_Sub1_17, Static28.aClass10_363, Static95.aClass10_949);
			return;
		}
		Static28.aClass2_Sub1_Sub4_Sub3_1.method1874(5, 463);
		arg1.method510(method36(new Class10[] { Static130.aClass10_1251, Static164.aClass10_1532, Static164.method2485(Static12.anInt363) }), 55, 478, 16777215, 0);
		if (Static129.aClass5_1 == null) {
			arg0.method510(Static24.aClass10_260, 55, 492, 16777215, 0);
		} else {
			arg0.method510(Static7.aClass10_109, 55, 492, 16777215, 0);
		}
	}
}
