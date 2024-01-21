import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!wi", name = "ab", descriptor = "[[B")
	public static byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!wi", name = "bb", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_2122 = Static193.method3027("Loaded interfaces");

	@OriginalMember(owner = "client!wi", name = "db", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_2123 = Static193.method3027("Login");

	@OriginalMember(owner = "client!wi", name = "fb", descriptor = "Lclient!oc;")
	public static Class70 aClass70_2124 = aClass70_2122;

	@OriginalMember(owner = "client!wi", name = "ib", descriptor = "Lclient!oc;")
	public static Class70 aClass70_2125 = aClass70_2123;

	@OriginalMember(owner = "client!wi", name = "jb", descriptor = "I")
	public static int anInt4284 = 0;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)V")
	public static void method3338() {
		for (@Pc(15) Class3_Sub22 local15 = (Class3_Sub22) Static95.aClass10_53.method267(); local15 != null; local15 = (Class3_Sub22) Static95.aClass10_53.method268()) {
			if (local15.anInt3550 == -1) {
				local15.anInt3535 = 0;
				Static196.method3058(local15);
			} else {
				local15.method3320();
			}
		}
	}

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "(I)V")
	public static void method3339() {
		@Pc(6) int local6 = (Static144.aClass26_Sub2_Sub1_1.anInt2593 >> 7) + Static30.anInt695;
		Static203.anInt4145 = 0;
		@Pc(24) int local24 = Static55.anInt1184 + (Static144.aClass26_Sub2_Sub1_1.anInt2611 >> 7);
		if (local6 >= 3053 && local6 <= 3156 && local24 >= 3056 && local24 <= 3136) {
			Static203.anInt4145 = 1;
		}
		if (local6 >= 3072 && local6 <= 3118 && local24 >= 9492 && local24 <= 9535) {
			Static203.anInt4145 = 1;
		}
		if (Static203.anInt4145 == 1 && local6 >= 3139 && local6 <= 3199 && local24 >= 3008 && local24 <= 3062) {
			Static203.anInt4145 = 0;
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!ke;II)Z")
	public static boolean method3340(@OriginalArg(0) Class52 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) byte[] local13 = arg0.method1557(arg1);
		if (local13 == null) {
			return false;
		} else {
			Static73.method1043(local13);
			return true;
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILclient!v;Lclient!v;)V")
	public static void method3342(@OriginalArg(1) Class3_Sub3_Sub2_Sub4_Sub1 arg0, @OriginalArg(2) Class3_Sub3_Sub2_Sub4_Sub1 arg1) {
		if (Static149.aBoolean142) {
			Static35.method611(arg0, arg1);
			return;
		}
		if (Static15.anInt351 == 0 || Static15.anInt351 == 5) {
			arg1.method3121(Static83.aClass70_818, 382, 225, 16777215, -1);
			Static104.method3097(230, 233, 304, 34, 9179409);
			Static104.method3097(231, 234, 302, 32, 0);
			Static104.method3079(232, 235, Static72.anInt1428 * 3, 30, 9179409);
			Static104.method3079(Static72.anInt1428 * 3 + 232, 235, 300 - Static72.anInt1428 * 3, 30, 0);
			arg1.method3121(Static198.aClass70_1990, 382, 256, 16777215, -1);
		}
		@Pc(116) short local116;
		@Pc(124) int local124;
		if (Static15.anInt351 == 20) {
			Static93.aClass3_Sub3_Sub2_Sub2_3.method2333(382 - Static93.aClass3_Sub3_Sub2_Sub2_3.anInt3220 / 2, -(Static93.aClass3_Sub3_Sub2_Sub2_3.anInt3216 / 2) + 271);
			local116 = 211;
			arg1.method3121(Static198.aClass70_1987, 382, 211, 16776960, 0);
			local124 = local116 + 15;
			arg1.method3121(Static198.aClass70_1991, 382, 226, 16776960, 0);
			@Pc(132) int local132 = local124 + 15;
			arg1.method3121(Static198.aClass70_1995, 382, 241, 16776960, 0);
			@Pc(140) int local140 = local132 + 15;
			@Pc(141) int local141 = local140 + 10;
			arg1.method3126(Static207.method3296(new Class70[] { Static115.aClass70_1126, Static173.method3101(Static198.aClass70_1992) }), 272, 266, 16777215, 0);
			@Pc(161) int local161 = local141 + 15;
			arg1.method3126(Static207.method3296(new Class70[] { Static147.aClass70_1424, Static198.aClass70_1993.method2054() }), 274, 281, 16777215, 0);
			@Pc(182) int local182 = local161 + 15;
		}
		if (Static15.anInt351 == 10) {
			Static93.aClass3_Sub3_Sub2_Sub2_3.method2333(202, 171);
			if (Static186.anInt3812 == 0) {
				local116 = 251;
				arg1.method3121(Static133.aClass70_1245, 382, 251, 16776960, 0);
				local124 = local116 + 30;
				Static201.aClass3_Sub3_Sub2_Sub2_4.method2333(229, 271);
				arg1.method3128(Static148.aClass70_1429, 229, 271, 144, 40, 16777215, 0, 1, 1, 0);
				Static201.aClass3_Sub3_Sub2_Sub2_4.method2333(389, 271);
				arg1.method3128(Static65.aClass70_638, 389, 271, 144, 40, 16777215, 0, 1, 1, 0);
			} else if (Static186.anInt3812 == 2) {
				local116 = 211;
				arg1.method3121(Static198.aClass70_1987, 382, 211, 16776960, 0);
				local124 = local116 + 15;
				arg1.method3121(Static198.aClass70_1991, 382, 226, 16776960, 0);
				local124 += 15;
				arg1.method3121(Static198.aClass70_1995, 382, 241, 16776960, 0);
				local124 += 15;
				@Pc(306) boolean local306;
				if (Static134.anInt2675 == 0 && Static184.anInt3760 % 40 < 20 && Static68.aBoolean84) {
					local306 = true;
				} else {
					local306 = false;
				}
				local124 += 10;
				arg1.method3126(Static207.method3296(new Class70[] { Static115.aClass70_1126, Static173.method3101(Static198.aClass70_1992), local306 ? Static124.aClass70_1890 : Static198.aClass70_1994 }), 272, 266, 16777215, 0);
				local124 += 15;
				if (Static134.anInt2675 == 1 && Static184.anInt3760 % 40 < 20 && Static68.aBoolean84) {
					local306 = true;
				} else {
					local306 = false;
				}
				arg1.method3126(Static207.method3296(new Class70[] { Static147.aClass70_1424, Static198.aClass70_1993.method2054(), local306 ? Static124.aClass70_1890 : Static198.aClass70_1994 }), 274, 281, 16777215, 0);
				Static201.aClass3_Sub3_Sub2_Sub2_4.method2333(229, 301);
				arg1.method3121(aClass70_2125, 302, 326, 16777215, 0);
				Static201.aClass3_Sub3_Sub2_Sub2_4.method2333(389, 301);
				arg1.method3121(Static13.aClass70_135, 462, 326, 16777215, 0);
				local124 += 15;
			} else if (Static186.anInt3812 == 3) {
				arg1.method3121(Static121.aClass70_1174, 382, 211, 16776960, 0);
				local116 = 236;
				arg1.method3121(Static96.aClass70_992, 382, 236, 16777215, 0);
				local124 = local116 + 15;
				arg1.method3121(Static199.aClass70_1996, 382, 251, 16777215, 0);
				local124 += 15;
				arg1.method3121(Static189.aClass70_1874, 382, 266, 16777215, 0);
				local124 += 15;
				arg1.method3121(Static204.aClass70_2069, 382, 281, 16777215, 0);
				local124 += 15;
				Static201.aClass3_Sub3_Sub2_Sub2_4.method2333(309, 301);
				arg1.method3121(Static13.aClass70_135, 382, 326, 16777215, 0);
			}
		}
		if (Static55.anInt1196 != 1) {
			if (Static122.anInt2470 > 0) {
				Static149.method2167(Static122.anInt2470);
				Static122.anInt2470 = 0;
			}
			Static191.method2999();
		}
		Static57.aClass3_Sub3_Sub2_Sub2Array2[Static153.aBoolean147 ? 1 : 0].method2333(725, 463);
		if (Static15.anInt351 <= 5 || Static17.anInt361 == 2) {
			return;
		}
		if (Static65.aClass3_Sub3_Sub2_Sub2_2 == null) {
			Static65.aClass3_Sub3_Sub2_Sub2_2 = Static21.method344(Static138.aClass52_Sub1_20, Static98.anInt2024);
		}
		if (Static65.aClass3_Sub3_Sub2_Sub2_2 == null) {
			return;
		}
		Static65.aClass3_Sub3_Sub2_Sub2_2.method2333(5, 463);
		arg1.method3121(Static207.method3296(new Class70[] { Static123.aClass70_1184, Static36.aClass70_392, Static107.method2404(Static143.anInt2933) }), 55, 478, 16777215, 0);
		if (Static152.aClass49_1 == null) {
			arg0.method3121(Static91.aClass70_924, 55, 492, 16777215, 0);
			return;
		}
		arg0.method3121(Static163.aClass70_1596, 55, 492, 16777215, 0);
		return;
	}
}
