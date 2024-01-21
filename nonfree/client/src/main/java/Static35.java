import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!de", name = "J", descriptor = "[Lclient!hh;")
	public static Class42[] aClass42Array2;

	@OriginalMember(owner = "client!de", name = "z", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_268 = Static151.method2243("gr-Un:");

	@OriginalMember(owner = "client!de", name = "A", descriptor = "I")
	public static int anInt838 = 0;

	@OriginalMember(owner = "client!de", name = "D", descriptor = "I")
	public static int anInt841 = 0;

	@OriginalMember(owner = "client!de", name = "F", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_269 = Static151.method2243(" <col=00ff80>");

	@OriginalMember(owner = "client!de", name = "H", descriptor = "[I")
	public static final int[] anIntArray65 = new int[200];

	@OriginalMember(owner = "client!de", name = "I", descriptor = "Lclient!ii;")
	public static Class47 aClass47_4 = null;

	@OriginalMember(owner = "client!de", name = "N", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_270 = Static151.method2243("leuchten1:");

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(II)V")
	public static void method606(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static184.aBooleanArray12[arg0]) {
			return;
		}
		Static121.aClass71_23.method2115(arg0);
		if (Static89.aClass47ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(30) boolean local30 = true;
		for (@Pc(32) int local32 = 0; local32 < Static89.aClass47ArrayArray1[arg0].length; local32++) {
			if (Static89.aClass47ArrayArray1[arg0][local32] != null) {
				if (Static89.aClass47ArrayArray1[arg0][local32].anInt1870 == 2) {
					local30 = false;
				} else {
					Static89.aClass47ArrayArray1[arg0][local32] = null;
				}
			}
		}
		if (local30) {
			Static89.aClass47ArrayArray1[arg0] = null;
		}
		Static184.aBooleanArray12[arg0] = false;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(III)Z")
	public static boolean method607(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IILclient!ii;BI)V")
	public static void method609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class47 arg2, @OriginalArg(4) int arg3) {
		Static8.method148();
		Static212.method3095(arg0, arg3, arg0 + arg2.anInt1910, arg2.anInt1858 + arg3);
		if (Static6.anInt182 == 2 || Static6.anInt182 == 5) {
			Static212.method3099(arg0, arg3, arg2.anIntArray171, arg2.anIntArray168);
		} else {
			@Pc(33) int local33 = Static151.anInt3204 + Static203.anInt4219 & 0x7FF;
			@Pc(41) int local41 = Static186.aClass7_Sub2_Sub2_1.anInt3046 / 32 + 48;
			@Pc(49) int local49 = 464 - Static186.aClass7_Sub2_Sub2_1.anInt3085 / 32;
			((Class2_Sub1_Sub2_Sub1) Static76.aClass2_Sub1_Sub2_2).method282(arg0, arg3, arg2.anInt1910, arg2.anInt1858, local41, local49, local33, Static206.anInt397 + 256, arg2.anIntArray171, arg2.anIntArray168);
			@Pc(87) int local87;
			@Pc(101) int local101;
			for (@Pc(71) int local71 = 0; local71 < Static144.anInt3102; local71++) {
				local87 = Static181.anIntArray333[local71] * 4 + 2 - Static186.aClass7_Sub2_Sub2_1.anInt3046 / 32;
				local101 = Static64.anIntArray105[local71] * 4 + 2 - Static186.aClass7_Sub2_Sub2_1.anInt3085 / 32;
				@Pc(107) Class2_Sub1_Sub11 local107 = Static60.method844(Static23.anIntArray56[local71]);
				if (local107.anIntArray133 != null) {
					local107 = local107.method1062();
					if (local107 == null || local107.anInt1557 == -1) {
						continue;
					}
				}
				Static194.method2774(local101, arg3, local87, Static15.aClass2_Sub1_Sub2Array1[local107.anInt1557], arg0, arg2);
			}
			@Pc(184) int local184;
			for (local87 = 0; local87 < 104; local87++) {
				for (local101 = 0; local101 < 104; local101++) {
					@Pc(158) Class13 local158 = Static13.aClass13ArrayArrayArray1[Static126.anInt2806][local87][local101];
					if (local158 != null) {
						@Pc(172) int local172 = local87 * 4 + 2 - Static186.aClass7_Sub2_Sub2_1.anInt3046 / 32;
						local184 = local101 * 4 + 2 - Static186.aClass7_Sub2_Sub2_1.anInt3085 / 32;
						Static194.method2774(local184, arg3, local172, Static34.aClass2_Sub1_Sub2Array3[0], arg0, arg2);
					}
				}
			}
			@Pc(252) int local252;
			for (local101 = 0; local101 < Static118.anInt2607; local101++) {
				@Pc(216) Class7_Sub2_Sub1 local216 = Static9.aClass7_Sub2_Sub1Array1[Static199.anIntArray373[local101]];
				if (local216 != null && local216.method2177()) {
					@Pc(225) Class2_Sub1_Sub20 local225 = local216.aClass2_Sub1_Sub20_1;
					if (local225 != null && local225.anIntArray304 != null) {
						local225 = local225.method2451();
					}
					if (local225 != null && local225.aBoolean151 && local225.aBoolean153) {
						local252 = local216.anInt3085 / 32 - Static186.aClass7_Sub2_Sub2_1.anInt3085 / 32;
						local184 = local216.anInt3046 / 32 - Static186.aClass7_Sub2_Sub2_1.anInt3046 / 32;
						Static194.method2774(local252, arg3, local184, Static34.aClass2_Sub1_Sub2Array3[1], arg0, arg2);
					}
				}
			}
			for (@Pc(282) int local282 = 0; local282 < Static145.anInt3126; local282++) {
				@Pc(290) Class7_Sub2_Sub2 local290 = Static62.aClass7_Sub2_Sub2Array1[Static28.anIntArray60[local282]];
				if (local290 != null && local290.method2177()) {
					local252 = local290.anInt3085 / 32 - Static186.aClass7_Sub2_Sub2_1.anInt3085 / 32;
					@Pc(309) boolean local309 = false;
					local184 = local290.anInt3046 / 32 - Static186.aClass7_Sub2_Sub2_1.anInt3046 / 32;
					@Pc(325) long local325 = local290.aClass62_1072.method1843();
					for (@Pc(327) int local327 = 0; local327 < Static29.anInt714; local327++) {
						if (local325 == Static124.aLongArray7[local327] && anIntArray65[local327] != 0) {
							local309 = true;
							break;
						}
					}
					@Pc(357) boolean local357 = false;
					if (Static186.aClass7_Sub2_Sub2_1.anInt3114 != 0 && local290.anInt3114 != 0 && Static186.aClass7_Sub2_Sub2_1.anInt3114 == local290.anInt3114) {
						local357 = true;
					}
					if (local309) {
						Static194.method2774(local252, arg3, local184, Static34.aClass2_Sub1_Sub2Array3[3], arg0, arg2);
					} else if (local357) {
						Static194.method2774(local252, arg3, local184, Static34.aClass2_Sub1_Sub2Array3[4], arg0, arg2);
					} else {
						Static194.method2774(local252, arg3, local184, Static34.aClass2_Sub1_Sub2Array3[2], arg0, arg2);
					}
				}
			}
			local184 = 0;
			@Pc(427) Class32[] local427 = Static181.aClass32Array1;
			@Pc(516) int local516;
			while (local184 < local427.length) {
				@Pc(433) Class32 local433 = local427[local184];
				if (local433 != null && local433.anInt1118 != 0 && Static25.anInt581 % 20 < 10) {
					@Pc(477) int local477;
					@Pc(487) int local487;
					if (local433.anInt1118 == 1 && local433.anInt1120 >= 0 && Static9.aClass7_Sub2_Sub1Array1.length > local433.anInt1120) {
						@Pc(464) Class7_Sub2_Sub1 local464 = Static9.aClass7_Sub2_Sub1Array1[local433.anInt1120];
						if (local464 != null) {
							local477 = local464.anInt3085 / 32 - Static186.aClass7_Sub2_Sub2_1.anInt3085 / 32;
							local487 = local464.anInt3046 / 32 - Static186.aClass7_Sub2_Sub2_1.anInt3046 / 32;
							Static44.method689(local487, local433.anInt1126, local477, arg2, arg0, arg3);
						}
					}
					if (local433.anInt1118 == 2) {
						local516 = (local433.anInt1116 - Static116.anInt2535) * 4 + 2 - Static186.aClass7_Sub2_Sub2_1.anInt3046 / 32;
						local487 = (local433.anInt1117 - Static153.anInt3278) * 4 + 2 - Static186.aClass7_Sub2_Sub2_1.anInt3085 / 32;
						Static44.method689(local516, local433.anInt1126, local487, arg2, arg0, arg3);
					}
					if (local433.anInt1118 == 10 && local433.anInt1120 >= 0 && Static62.aClass7_Sub2_Sub2Array1.length > local433.anInt1120) {
						@Pc(567) Class7_Sub2_Sub2 local567 = Static62.aClass7_Sub2_Sub2Array1[local433.anInt1120];
						if (local567 != null) {
							local487 = local567.anInt3046 / 32 - Static186.aClass7_Sub2_Sub2_1.anInt3046 / 32;
							local477 = local567.anInt3085 / 32 - Static186.aClass7_Sub2_Sub2_1.anInt3085 / 32;
							Static44.method689(local487, local433.anInt1126, local477, arg2, arg0, arg3);
						}
					}
				}
				local184++;
			}
			if (Static11.anInt310 != 0) {
				local252 = Static11.anInt310 * 4 + 2 - Static186.aClass7_Sub2_Sub2_1.anInt3046 / 32;
				local516 = Static76.anInt1575 * 4 + 2 - Static186.aClass7_Sub2_Sub2_1.anInt3085 / 32;
				Static194.method2774(local516, arg3, local252, Static117.aClass2_Sub1_Sub2_3, arg0, arg2);
			}
			Static212.method3103(arg0 + arg2.anInt1910 / 2 - 1, arg3 + -1 + arg2.anInt1858 / 2, 3, 3, 16777215);
		}
		Static32.aBooleanArray3[arg1] = true;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BI)I")
	public static int method610(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
