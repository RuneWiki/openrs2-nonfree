import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!lc", name = "D", descriptor = "[I")
	public static int[] anIntArray293;

	@OriginalMember(owner = "client!lc", name = "F", descriptor = "Lclient!sf;")
	public static Class5 aClass5_55;

	@OriginalMember(owner = "client!lc", name = "X", descriptor = "Lclient!sf;")
	public static Class5 aClass5_56;

	@OriginalMember(owner = "client!lc", name = "B", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1014 = Static106.method1849("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!lc", name = "cb", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1020 = Static106.method1849("Your account has been disabled)3");

	@OriginalMember(owner = "client!lc", name = "E", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1015 = aClass66_1020;

	@OriginalMember(owner = "client!lc", name = "J", descriptor = "I")
	public static int anInt1921 = 0;

	@OriginalMember(owner = "client!lc", name = "K", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1016 = Static106.method1849("(Y");

	@OriginalMember(owner = "client!lc", name = "L", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1017 = Static106.method1849("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!lc", name = "S", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1018 = Static106.method1849(" )2>");

	@OriginalMember(owner = "client!lc", name = "T", descriptor = "Ljava/util/Random;")
	public static Random aRandom1 = new Random();

	@OriginalMember(owner = "client!lc", name = "V", descriptor = "I")
	public static int anInt1927 = 0;

	@OriginalMember(owner = "client!lc", name = "bb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1019 = Static106.method1849("<col=ff0000>");

	@OriginalMember(owner = "client!lc", name = "gb", descriptor = "[Z")
	public static boolean[] aBooleanArray12 = new boolean[5];

	@OriginalMember(owner = "client!lc", name = "ib", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1022 = Static106.method1849("Malformed login packet)3");

	@OriginalMember(owner = "client!lc", name = "hb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1021 = aClass66_1022;

	@OriginalMember(owner = "client!lc", name = "jb", descriptor = "I")
	public static int anInt1934 = 0;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILclient!sf;IIZI)V")
	public static void method1352(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		Static103.anInt2540 = arg2;
		Static20.anInt622 = 1;
		Static16.anInt490 = 10000;
		Static15.aClass5_93 = arg1;
		Static3.aBoolean3 = false;
		Static23.anInt684 = arg0;
		Static39.anInt988 = arg3;
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
	public static void method1353() {
		aClass66_1019 = null;
		aClass66_1016 = null;
		aClass66_1015 = null;
		aClass5_55 = null;
		aClass66_1021 = null;
		aClass66_1018 = null;
		aClass66_1022 = null;
		aClass66_1020 = null;
		aClass5_56 = null;
		aBooleanArray12 = null;
		aRandom1 = null;
		anIntArray293 = null;
		aClass66_1014 = null;
		aClass66_1017 = null;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIZII)V")
	public static void method1354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static84.anInt2224 == 0 && !Static51.aBoolean65) {
			Static98.method1749(Static131.aClass66_1541, 46, arg3 - arg0, arg2 - arg1, 0, Static13.aClass66_284);
		}
		@Pc(31) int local31 = -1;
		for (@Pc(33) int local33 = 0; local33 < Static62.anInt1912; local33++) {
			@Pc(39) int local39 = Static62.anIntArray272[local33];
			@Pc(43) int local43 = local39 & 0x7F;
			@Pc(49) int local49 = local39 >> 7 & 0x7F;
			@Pc(55) int local55 = local39 >> 29 & 0x3;
			@Pc(61) int local61 = local39 >> 14 & 0x7FFF;
			if (local39 != local31) {
				local31 = local39;
				@Pc(152) int local152;
				if (local55 == 2 && Static129.aClass9_1.method311(Static22.anInt635, local43, local49, local39) >= 0) {
					@Pc(89) Class1_Sub1_Sub9 local89 = Static122.method1995(local61);
					if (local89.anIntArray338 != null) {
						local89 = local89.method1440();
					}
					if (local89 == null) {
						continue;
					}
					if (Static84.anInt2224 == 1) {
						Static98.method1749(Static11.aClass66_241, 2, local49, local43, local39, Static41.method897(new Class66[] { Static42.aClass66_710, Static83.aClass66_1182, local89.aClass66_1125 }));
					} else if (!Static51.aBoolean65) {
						@Pc(142) Class66[] local142 = local89.aClass66Array12;
						if (Static89.aBoolean97) {
							local142 = Static98.method1752(local142);
						}
						if (local142 != null) {
							for (local152 = 4; local152 >= 0; local152--) {
								if (local142[local152] != null) {
									@Pc(164) short local164 = 0;
									if (local152 == 0) {
										local164 = 49;
									}
									if (local152 == 1) {
										local164 = 5;
									}
									if (local152 == 2) {
										local164 = 38;
									}
									if (local152 == 3) {
										local164 = 7;
									}
									if (local152 == 4) {
										local164 = 1005;
									}
									Static98.method1749(local142[local152], local164, local49, local43, local39, Static41.method897(new Class66[] { Static67.aClass66_905, local89.aClass66_1125 }));
								}
							}
						}
						Static98.method1749(Static14.aClass66_304, 1001, local49, local43, local89.anInt2066 << 14, Static41.method897(new Class66[] { Static67.aClass66_905, local89.aClass66_1125 }));
					} else if ((Static128.anInt2909 & 0x4) == 4) {
						Static98.method1749(Static87.aClass66_1277, 21, local49, local43, local39, Static41.method897(new Class66[] { Static27.aClass66_445, Static83.aClass66_1182, local89.aClass66_1125 }));
					}
				}
				@Pc(305) int local305;
				@Pc(313) Class1_Sub1_Sub1_Sub5_Sub1 local313;
				@Pc(370) Class1_Sub1_Sub1_Sub5_Sub2 local370;
				if (local55 == 1) {
					@Pc(282) Class1_Sub1_Sub1_Sub5_Sub1 local282 = Static73.aClass1_Sub1_Sub1_Sub5_Sub1Array3[local61];
					if (local282.aClass1_Sub1_Sub5_1.anInt1474 == 1 && (local282.anInt1261 & 0x7F) == 64 && (local282.anInt1271 & 0x7F) == 64) {
						for (local305 = 0; local305 < Static33.anInt854; local305++) {
							local313 = Static73.aClass1_Sub1_Sub1_Sub5_Sub1Array3[Static54.anIntArray248[local305]];
							if (local313 != null && local313 != local282 && local313.aClass1_Sub1_Sub5_1.anInt1474 == 1 && local282.anInt1261 == local313.anInt1261 && local282.anInt1271 == local313.anInt1271) {
								Static29.method559(local49, local313.aClass1_Sub1_Sub5_1, local43, Static54.anIntArray248[local305]);
							}
						}
						for (local152 = 0; local152 < Static111.anInt2653; local152++) {
							local370 = Static85.aClass1_Sub1_Sub1_Sub5_Sub2Array1[Static51.anIntArray239[local152]];
							if (local370 != null && local370.anInt1261 == local282.anInt1261 && local370.anInt1271 == local282.anInt1271) {
								Static39.method840(local49, local43, Static51.anIntArray239[local152], local370);
							}
						}
					}
					Static29.method559(local49, local282.aClass1_Sub1_Sub5_1, local43, local61);
				}
				if (local55 == 0) {
					@Pc(407) Class1_Sub1_Sub1_Sub5_Sub2 local407 = Static85.aClass1_Sub1_Sub1_Sub5_Sub2Array1[local61];
					if ((local407.anInt1261 & 0x7F) == 64 && (local407.anInt1271 & 0x7F) == 64) {
						for (local305 = 0; local305 < Static33.anInt854; local305++) {
							local313 = Static73.aClass1_Sub1_Sub1_Sub5_Sub1Array3[Static54.anIntArray248[local305]];
							if (local313 != null && local313.aClass1_Sub1_Sub5_1.anInt1474 == 1 && local313.anInt1261 == local407.anInt1261 && local407.anInt1271 == local313.anInt1271) {
								Static29.method559(local49, local313.aClass1_Sub1_Sub5_1, local43, Static54.anIntArray248[local305]);
							}
						}
						for (local152 = 0; local152 < Static111.anInt2653; local152++) {
							local370 = Static85.aClass1_Sub1_Sub1_Sub5_Sub2Array1[Static51.anIntArray239[local152]];
							if (local370 != null && local407 != local370 && local370.anInt1261 == local407.anInt1261 && local407.anInt1271 == local370.anInt1271) {
								Static39.method840(local49, local43, Static51.anIntArray239[local152], local370);
							}
						}
					}
					Static39.method840(local49, local43, local61, local407);
				}
				if (local55 == 3) {
					@Pc(529) Class61 local529 = Static101.aClass61ArrayArrayArray1[Static22.anInt635][local43][local49];
					if (local529 != null) {
						for (@Pc(536) Class1_Sub1_Sub1_Sub1 local536 = (Class1_Sub1_Sub1_Sub1) local529.method1753(); local536 != null; local536 = (Class1_Sub1_Sub1_Sub1) local529.method1750()) {
							@Pc(543) Class1_Sub1_Sub6 local543 = Static20.method496(local536.anInt72);
							if (Static84.anInt2224 == 1) {
								Static98.method1749(Static11.aClass66_241, 24, local49, local43, local536.anInt72, Static41.method897(new Class66[] { Static42.aClass66_710, Static123.aClass66_1658, local543.aClass66_847 }));
							} else if (!Static51.aBoolean65) {
								@Pc(588) Class66[] local588 = local543.aClass66Array8;
								if (Static89.aBoolean97) {
									local588 = Static98.method1752(local588);
								}
								for (@Pc(596) int local596 = 4; local596 >= 0; local596--) {
									if (local588 != null && local588[local596] != null) {
										@Pc(610) byte local610 = 0;
										if (local596 == 0) {
											local610 = 23;
										}
										if (local596 == 1) {
											local610 = 14;
										}
										if (local596 == 2) {
											local610 = 26;
										}
										if (local596 == 3) {
											local610 = 37;
										}
										if (local596 == 4) {
											local610 = 50;
										}
										Static98.method1749(local588[local596], local610, local49, local43, local536.anInt72, Static41.method897(new Class66[] { Static68.aClass66_1060, local543.aClass66_847 }));
									} else if (local596 == 2) {
										Static98.method1749(Static22.aClass66_390, 26, local49, local43, local536.anInt72, Static41.method897(new Class66[] { Static68.aClass66_1060, local543.aClass66_847 }));
									}
								}
								Static98.method1749(Static14.aClass66_304, 1003, local49, local43, local536.anInt72, Static41.method897(new Class66[] { Static68.aClass66_1060, local543.aClass66_847 }));
							} else if ((Static128.anInt2909 & 0x1) == 1) {
								Static98.method1749(Static87.aClass66_1277, 18, local49, local43, local536.anInt72, Static41.method897(new Class66[] { Static27.aClass66_445, Static123.aClass66_1658, local543.aClass66_847 }));
							}
						}
					}
				}
			}
		}
	}
}
