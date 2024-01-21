import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!db", name = "a", descriptor = "Lclient!va;")
	public static Class64 aClass64_1;

	@OriginalMember(owner = "client!db", name = "A", descriptor = "I")
	public static int anInt431;

	@OriginalMember(owner = "client!db", name = "c", descriptor = "I")
	public static int anInt418 = 0;

	@OriginalMember(owner = "client!db", name = "j", descriptor = "I")
	public static int anInt424 = 0;

	@OriginalMember(owner = "client!db", name = "y", descriptor = "Lclient!hb;")
	private static Class27 aClass27_231 = Static87.method1648("Your profile will be transferred in:");

	@OriginalMember(owner = "client!db", name = "k", descriptor = "Lclient!hb;")
	public static Class27 aClass27_227 = aClass27_231;

	@OriginalMember(owner = "client!db", name = "m", descriptor = "Lclient!hb;")
	public static Class27 aClass27_228 = Static87.method1648(" hat sich ausgeloggt)3");

	@OriginalMember(owner = "client!db", name = "n", descriptor = "Lclient!hb;")
	public static Class27 aClass27_229 = Static87.method1648("Lade Sprites )2 ");

	@OriginalMember(owner = "client!db", name = "q", descriptor = "Lclient!hb;")
	public static Class27 aClass27_230 = Static87.method1648("b12_full");

	@OriginalMember(owner = "client!db", name = "r", descriptor = "[I")
	public static int[] anIntArray60 = new int[2000];

	@OriginalMember(owner = "client!db", name = "s", descriptor = "I")
	public static int anInt427 = 0;

	@OriginalMember(owner = "client!db", name = "u", descriptor = "[I")
	public static int[] anIntArray61 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)V")
	public static void method314() {
		try {
			@Pc(6) Graphics local6 = Static19.aCanvas1.getGraphics();
			Static102.aClass12_78.method671(553, local6, 205);
		} catch (@Pc(19) Exception local19) {
			Static19.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V")
	public static void method319() {
		anIntArray61 = null;
		aClass27_228 = null;
		aClass64_1 = null;
		aClass27_230 = null;
		aClass27_229 = null;
		aClass27_227 = null;
		aClass27_231 = null;
		anIntArray60 = null;
	}

	@OriginalMember(owner = "client!db", name = "d", descriptor = "(I)V")
	public static void method320() {
		Static24.aBoolean35 = true;
		Static2.method17();
		if (Static97.aBoolean112) {
			Static31.aClass3_Sub3_Sub2_Sub1_1.method603(Static45.aClass27_173, 239, 40, 0);
			Static31.aClass3_Sub3_Sub2_Sub1_1.method603(Static98.method1779(new Class27[] { Static45.aClass27_175, Static4.aClass27_1335 }), 239, 60, 128);
		} else if (Static68.anInt1744 == 1) {
			Static31.aClass3_Sub3_Sub2_Sub1_1.method603(Static91.aClass27_1182, 239, 40, 0);
			Static31.aClass3_Sub3_Sub2_Sub1_1.method603(Static98.method1779(new Class27[] { Static45.aClass27_179, Static4.aClass27_1335 }), 239, 60, 128);
		} else if (Static68.anInt1744 == 2) {
			Static31.aClass3_Sub3_Sub2_Sub1_1.method603(Static85.aClass27_1089, 239, 40, 0);
			Static31.aClass3_Sub3_Sub2_Sub1_1.method603(Static98.method1779(new Class27[] { Static45.aClass27_179, Static4.aClass27_1335 }), 239, 60, 128);
		} else {
			@Pc(121) int local121;
			@Pc(123) int local123;
			@Pc(114) Class3_Sub3_Sub2_Sub1 local114;
			if (Static68.anInt1744 == 3) {
				if (Static45.aClass27_179 != Static45.aClass27_174) {
					Static105.method1887(Static45.aClass27_179);
					Static45.aClass27_174 = Static45.aClass27_179;
				}
				local114 = Static88.aClass3_Sub3_Sub2_Sub1_2;
				Static95.method1325(0, 0, 463, 77);
				for (local121 = 0; local121 < Static87.anInt2340; local121++) {
					local123 = local121 * 14 + 18 - Static85.anInt2296;
					if (local123 > 0 && local123 < 110) {
						local114.method603(Static101.aClass27Array15[local121], 239, local123, 0);
					}
				}
				Static95.method1327();
				if (Static87.anInt2340 > 5) {
					Static107.method1901(0, 77, 463, Static85.anInt2296, Static87.anInt2340 * 14 + 7);
				}
				if (Static45.aClass27_179.method765() == 0) {
					Static31.aClass3_Sub3_Sub2_Sub1_1.method603(Static76.aClass27_1007, 239, 40, 255);
				} else if (Static87.anInt2340 == 0) {
					Static31.aClass3_Sub3_Sub2_Sub1_1.method603(Static52.aClass27_680, 239, 40, 0);
				}
				local114.method603(Static98.method1779(new Class27[] { Static45.aClass27_179, Static4.aClass27_1335 }), 239, 90, 0);
				Static95.method1326(0, 77, 479, 0);
			} else if (Static109.aClass27_960 == null) {
				@Pc(103) boolean local103;
				if (Static84.anInt2220 != -1) {
					local103 = Static28.method616(0, 0, -1, 479, 96, 2, 0, Static84.anInt2220);
					if (!local103) {
						Static13.aBoolean40 = true;
					}
				} else if (Static64.anInt1661 == -1) {
					local114 = Static88.aClass3_Sub3_Sub2_Sub1_2;
					Static95.method1325(0, 0, 463, 77);
					local121 = 0;
					for (local123 = 0; local123 < 100; local123++) {
						if (Static81.aClass27Array13[local123] != null) {
							@Pc(137) int local137 = Static74.anInt2075 + 70 - local121 * 14;
							@Pc(141) int local141 = Static81.anIntArray333[local123];
							@Pc(143) byte local143 = 0;
							@Pc(147) Class27 local147 = Static55.aClass27Array8[local123];
							if (local147 != null && local147.method751(Static4.aClass27_1330)) {
								local147 = local147.method731(5);
								local143 = 1;
							}
							if (local147 != null && local147.method751(Static42.aClass27_600)) {
								local143 = 2;
								local147 = local147.method731(5);
							}
							if (local141 == 0) {
								local121++;
								if (local137 > 0 && local137 < 110) {
									local114.method610(Static81.aClass27Array13[local123], 4, local137, 0);
								}
							}
							@Pc(228) int local228;
							if ((local141 == 1 || local141 == 2) && (local141 == 1 || Static76.anInt2134 == 0 || Static76.anInt2134 == 1 && Static50.method971(local147))) {
								if (local137 > 0 && local137 < 110) {
									local228 = 4;
									if (local143 == 1) {
										Static76.aClass3_Sub3_Sub2_Sub4Array5[0].method1332(4, local137 - 12);
										local228 += 14;
									}
									if (local143 == 2) {
										Static76.aClass3_Sub3_Sub2_Sub4Array5[1].method1332(local228, local137 - 12);
										local228 += 14;
									}
									local114.method610(Static98.method1779(new Class27[] { local147, Static78.aClass27_1024 }), local228, local137, 0);
									local228 += local114.method606(local147) + 8;
									local114.method610(Static81.aClass27Array13[local123], local228, local137, 255);
								}
								local121++;
							}
							if ((local141 == 3 || local141 == 7) && Static87.anInt2332 == 0 && (local141 == 7 || Static34.anInt828 == 0 || Static34.anInt828 == 1 && Static50.method971(local147))) {
								if (local137 > 0 && local137 < 110) {
									local114.method610(Static40.aClass27_586, 4, local137, 0);
									local228 = local114.method606(Static40.aClass27_586) + 4;
									local228 += local114.method602(32);
									if (local143 == 1) {
										Static76.aClass3_Sub3_Sub2_Sub4Array5[0].method1332(local228, local137 - 12);
										local228 += 14;
									}
									if (local143 == 2) {
										Static76.aClass3_Sub3_Sub2_Sub4Array5[1].method1332(local228, local137 - 12);
										local228 += 14;
									}
									local114.method610(Static98.method1779(new Class27[] { local147, Static78.aClass27_1024 }), local228, local137, 0);
									local228 += local114.method606(local147) + 8;
									local114.method610(Static81.aClass27Array13[local123], local228, local137, 8388608);
								}
								local121++;
							}
							if (local141 == 4 && (Static61.anInt1554 == 0 || Static61.anInt1554 == 1 && Static50.method971(local147))) {
								if (local137 > 0 && local137 < 110) {
									local114.method610(Static98.method1779(new Class27[] { local147, Static101.aClass27_1270, Static81.aClass27Array13[local123] }), 4, local137, 8388736);
								}
								local121++;
							}
							if (local141 == 5 && Static87.anInt2332 == 0 && Static34.anInt828 < 2) {
								if (local137 > 0 && local137 < 110) {
									local114.method610(Static81.aClass27Array13[local123], 4, local137, 8388608);
								}
								local121++;
							}
							if (local141 == 6 && Static87.anInt2332 == 0 && Static34.anInt828 < 2) {
								local121++;
								if (local137 > 0 && local137 < 110) {
									local114.method610(Static98.method1779(new Class27[] { Static75.aClass27_992, Static101.aClass27_1270, local147, Static78.aClass27_1024 }), 4, local137, 0);
									local114.method610(Static81.aClass27Array13[local123], local114.method606(Static98.method1779(new Class27[] { Static75.aClass27_992, Static101.aClass27_1270, local147 })) + 12, local137, 8388608);
								}
							}
							if (local141 == 8 && (Static61.anInt1554 == 0 || Static61.anInt1554 == 1 && Static50.method971(local147))) {
								if (local137 > 0 && local137 < 110) {
									local114.method610(Static98.method1779(new Class27[] { local147, Static101.aClass27_1270, Static81.aClass27Array13[local123] }), 4, local137, 8270336);
								}
								local121++;
							}
						}
					}
					Static95.method1327();
					Static105.anInt2744 = local121 * 14 + 7;
					if (Static105.anInt2744 < 78) {
						Static105.anInt2744 = 78;
					}
					Static107.method1901(0, 77, 463, Static105.anInt2744 - Static74.anInt2075 - 77, Static105.anInt2744);
					@Pc(630) Class27 local630;
					if (Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1 == null || Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.aClass27_1150 == null) {
						local630 = Static76.aClass27_1008;
					} else {
						local630 = Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.aClass27_1150;
					}
					local114.method610(Static98.method1779(new Class27[] { local630, Static78.aClass27_1024 }), 4, 90, 0);
					local114.method610(Static98.method1779(new Class27[] { Static45.aClass27_181, Static4.aClass27_1335 }), local114.method606(Static98.method1779(new Class27[] { local630, Static82.aClass27_1054 })) + 6, 90, 255);
					Static95.method1326(0, 77, 479, 0);
				} else {
					local103 = Static28.method616(0, 0, -1, 479, 96, 3, 0, Static64.anInt1661);
					if (!local103) {
						Static13.aBoolean40 = true;
					}
				}
			} else {
				Static31.aClass3_Sub3_Sub2_Sub1_1.method603(Static109.aClass27_960, 239, 40, 0);
				Static31.aClass3_Sub3_Sub2_Sub1_1.method603(Static30.aClass27_383, 239, 60, 128);
			}
		}
		if (Static12.aBoolean16 && Static22.anInt582 == 2) {
			Static48.method1672();
		}
		Static50.method985();
	}

	@OriginalMember(owner = "client!db", name = "e", descriptor = "(I)[Lclient!hc;")
	public static Class3_Sub3_Sub2_Sub2[] method322() {
		@Pc(13) Class3_Sub3_Sub2_Sub2[] local13 = new Class3_Sub3_Sub2_Sub2[Static86.anInt2324];
		for (@Pc(15) int local15 = 0; local15 < Static86.anInt2324; local15++) {
			@Pc(25) Class3_Sub3_Sub2_Sub2 local25 = local13[local15] = new Class3_Sub3_Sub2_Sub2();
			local25.anInt1018 = Static28.anInt748;
			local25.anInt1019 = Static66.anInt1710;
			local25.anInt1017 = Static54.anIntArray238[local15];
			local25.anInt1016 = Static72.anIntArray316[local15];
			local25.anInt1015 = Static36.anIntArray160[local15];
			local25.anInt1014 = Static54.anIntArray239[local15];
			@Pc(55) byte[] local55 = Static72.aByteArrayArray10[local15];
			@Pc(61) int local61 = local25.anInt1015 * local25.anInt1014;
			local25.anIntArray172 = new int[local61];
			for (@Pc(67) int local67 = 0; local67 < local61; local67++) {
				local25.anIntArray172[local67] = Static98.anIntArray378[local55[local67] & 0xFF];
			}
		}
		Static96.method1232();
		return local13;
	}
}
