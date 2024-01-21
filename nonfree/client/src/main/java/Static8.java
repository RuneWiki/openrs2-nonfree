import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!be", name = "g", descriptor = "[[B")
	public static byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!be", name = "j", descriptor = "I")
	public static int anInt243;

	@OriginalMember(owner = "client!be", name = "k", descriptor = "Lclient!mb;")
	public static Class41 aClass41_1;

	@OriginalMember(owner = "client!be", name = "w", descriptor = "Lclient!p;")
	public static Class33_Sub1 aClass33_Sub1_5;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "I")
	public static int anInt239 = 0;

	@OriginalMember(owner = "client!be", name = "b", descriptor = "I")
	public static int anInt240 = 0;

	@OriginalMember(owner = "client!be", name = "f", descriptor = "[Lclient!qa;")
	public static Class1_Sub1_Sub8_Sub1_Sub1[] aClass1_Sub1_Sub8_Sub1_Sub1Array1 = new Class1_Sub1_Sub8_Sub1_Sub1[32768];

	@OriginalMember(owner = "client!be", name = "r", descriptor = "Lclient!mc;")
	private static Class42 aClass42_137 = Static23.method501("Public chat");

	@OriginalMember(owner = "client!be", name = "i", descriptor = "Lclient!mc;")
	public static Class42 aClass42_133 = aClass42_137;

	@OriginalMember(owner = "client!be", name = "l", descriptor = "Lclient!mc;")
	public static Class42 aClass42_134 = Static23.method501("backtop1");

	@OriginalMember(owner = "client!be", name = "o", descriptor = "Lclient!mc;")
	public static Class42 aClass42_135 = Static23.method501(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!be", name = "y", descriptor = "Lclient!mc;")
	private static Class42 aClass42_139 = Static23.method501("white:");

	@OriginalMember(owner = "client!be", name = "p", descriptor = "Lclient!mc;")
	public static Class42 aClass42_136 = aClass42_139;

	@OriginalMember(owner = "client!be", name = "q", descriptor = "[Lclient!mc;")
	public static Class42[] aClass42Array3 = new Class42[200];

	@OriginalMember(owner = "client!be", name = "t", descriptor = "I")
	public static int anInt247 = 0;

	@OriginalMember(owner = "client!be", name = "x", descriptor = "Lclient!mc;")
	public static Class42 aClass42_138 = Static23.method501("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
	public static void method175() {
		aClass42_136 = null;
		aClass42_138 = null;
		aByteArrayArray1 = null;
		aClass1_Sub1_Sub8_Sub1_Sub1Array1 = null;
		aClass42_139 = null;
		aClass41_1 = null;
		aClass42_135 = null;
		aClass42_133 = null;
		aClass42_137 = null;
		aClass42_134 = null;
		aClass42Array3 = null;
		aClass33_Sub1_5 = null;
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V")
	public static void method177() {
		@Pc(7) int local7 = -1;
		if (Static35.anInt874 == 0 && Static12.anInt362 == 0) {
			Static69.method1232(Static73.anInt1884, Static11.aClass42_195, Static17.aClass42_320, 0, 2, Static38.anInt948);
		}
		for (@Pc(28) int local28 = 0; local28 < Static76.anInt1950; local28++) {
			@Pc(34) int local34 = Static76.anIntArray298[local28];
			@Pc(38) int local38 = local34 & 0x7F;
			@Pc(44) int local44 = local34 >> 7 & 0x7F;
			@Pc(50) int local50 = local34 >> 29 & 0x3;
			@Pc(56) int local56 = local34 >> 14 & 0x7FFF;
			if (local34 != local7) {
				local7 = local34;
				@Pc(184) int local184;
				if (local50 == 2 && Static88.aClass20_1.method460(Static82.anInt2165, local38, local44, local34) >= 0) {
					@Pc(83) Class1_Sub1_Sub9 local83 = Static42.method1755(local56);
					if (local83.anIntArray190 != null) {
						local83 = local83.method879();
					}
					if (local83 == null) {
						continue;
					}
					if (Static35.anInt874 == 1) {
						Static69.method1232(local38, Static57.method1822(new Class42[] { Static53.aClass42_1432, Static97.aClass42_1330, local83.aClass42_693 }), Static67.aClass42_862, local34, 5, local44);
					} else if (Static12.anInt362 != 1) {
						@Pc(174) Class42[] local174 = local83.aClass42Array8;
						if (Static105.aBoolean148) {
							local174 = Static70.method1258(local174);
						}
						if (local174 != null) {
							for (local184 = 4; local184 >= 0; local184--) {
								if (local174[local184] != null) {
									@Pc(196) short local196 = 0;
									if (local184 == 0) {
										local196 = 41;
									}
									if (local184 == 1) {
										local196 = 44;
									}
									if (local184 == 2) {
										local196 = 7;
									}
									if (local184 == 3) {
										local196 = 13;
									}
									if (local184 == 4) {
										local196 = 1003;
									}
									Static69.method1232(local38, Static57.method1822(new Class42[] { Static33.aClass42_461, local83.aClass42_693 }), local174[local184], local34, local196, local44);
								}
							}
						}
						Static69.method1232(local38, Static57.method1822(new Class42[] { Static33.aClass42_461, local83.aClass42_693 }), Static73.aClass42_970, local83.anInt1248 << 14, 1002, local44);
					} else if ((Static82.anInt2193 & 0x4) == 4) {
						Static69.method1232(local38, Static57.method1822(new Class42[] { Static70.aClass42_916, Static97.aClass42_1330, local83.aClass42_693 }), Static83.aClass42_1187, local34, 36, local44);
					}
				}
				@Pc(309) int local309;
				@Pc(317) Class1_Sub1_Sub8_Sub1_Sub1 local317;
				@Pc(370) Class1_Sub1_Sub8_Sub1_Sub2 local370;
				if (local50 == 1) {
					@Pc(286) Class1_Sub1_Sub8_Sub1_Sub1 local286 = aClass1_Sub1_Sub8_Sub1_Sub1Array1[local56];
					if (local286.aClass1_Sub1_Sub6_1.anInt760 == 1 && (local286.anInt2576 & 0x7F) == 64 && (local286.anInt2583 & 0x7F) == 64) {
						for (local309 = 0; local309 < Static91.anInt2403; local309++) {
							local317 = aClass1_Sub1_Sub8_Sub1_Sub1Array1[Static98.anIntArray375[local309]];
							if (local317 != null && local317 != local286 && local317.aClass1_Sub1_Sub6_1.anInt760 == 1 && local317.anInt2576 == local286.anInt2576 && local286.anInt2583 == local317.anInt2583) {
								Static91.method1659(local38, local317.aClass1_Sub1_Sub6_1, Static98.anIntArray375[local309], local44);
							}
						}
						for (local184 = 0; local184 < Static27.anInt770; local184++) {
							local370 = Static33.aClass1_Sub1_Sub8_Sub1_Sub2Array1[Static68.anIntArray240[local184]];
							if (local370 != null && local286.anInt2576 == local370.anInt2576 && local370.anInt2583 == local286.anInt2583) {
								Static93.method1684(local38, local370, local44, Static68.anIntArray240[local184]);
							}
						}
					}
					Static91.method1659(local38, local286.aClass1_Sub1_Sub6_1, local56, local44);
				}
				if (local50 == 0) {
					@Pc(418) Class1_Sub1_Sub8_Sub1_Sub2 local418 = Static33.aClass1_Sub1_Sub8_Sub1_Sub2Array1[local56];
					if ((local418.anInt2576 & 0x7F) == 64 && (local418.anInt2583 & 0x7F) == 64) {
						for (local309 = 0; local309 < Static91.anInt2403; local309++) {
							local317 = aClass1_Sub1_Sub8_Sub1_Sub1Array1[Static98.anIntArray375[local309]];
							if (local317 != null && local317.aClass1_Sub1_Sub6_1.anInt760 == 1 && local317.anInt2576 == local418.anInt2576 && local418.anInt2583 == local317.anInt2583) {
								Static91.method1659(local38, local317.aClass1_Sub1_Sub6_1, Static98.anIntArray375[local309], local44);
							}
						}
						for (local184 = 0; local184 < Static27.anInt770; local184++) {
							local370 = Static33.aClass1_Sub1_Sub8_Sub1_Sub2Array1[Static68.anIntArray240[local184]];
							if (local370 != null && local370 != local418 && local370.anInt2576 == local418.anInt2576 && local370.anInt2583 == local418.anInt2583) {
								Static93.method1684(local38, local370, local44, Static68.anIntArray240[local184]);
							}
						}
					}
					Static93.method1684(local38, local418, local44, local56);
				}
				if (local50 == 3) {
					@Pc(550) Class22 local550 = Static93.aClass22ArrayArrayArray1[Static82.anInt2165][local38][local44];
					if (local550 != null) {
						for (@Pc(557) Class1_Sub1_Sub8_Sub2 local557 = (Class1_Sub1_Sub8_Sub2) local550.method514(); local557 != null; local557 = (Class1_Sub1_Sub8_Sub2) local550.method518()) {
							@Pc(564) Class1_Sub1_Sub2 local564 = Static36.method617(local557.anInt1827);
							if (Static35.anInt874 == 1) {
								Static69.method1232(local38, Static57.method1822(new Class42[] { Static53.aClass42_1432, Static69.aClass42_898, local564.aClass42_120 }), Static67.aClass42_862, local557.anInt1827, 43, local44);
							} else if (Static12.anInt362 != 1) {
								@Pc(646) Class42[] local646 = local564.aClass42Array2;
								if (Static105.aBoolean148) {
									local646 = Static70.method1258(local646);
								}
								for (@Pc(654) int local654 = 4; local654 >= 0; local654--) {
									if (local646 != null && local646[local654] != null) {
										@Pc(664) byte local664 = 0;
										if (local654 == 0) {
											local664 = 10;
										}
										if (local654 == 1) {
											local664 = 1;
										}
										if (local654 == 2) {
											local664 = 27;
										}
										if (local654 == 3) {
											local664 = 48;
										}
										if (local654 == 4) {
											local664 = 30;
										}
										Static69.method1232(local38, Static57.method1822(new Class42[] { Static28.aClass42_438, local564.aClass42_120 }), local646[local654], local557.anInt1827, local664, local44);
									} else if (local654 == 2) {
										Static69.method1232(local38, Static57.method1822(new Class42[] { Static28.aClass42_438, local564.aClass42_120 }), Static101.aClass42_1391, local557.anInt1827, 27, local44);
									}
								}
								Static69.method1232(local38, Static57.method1822(new Class42[] { Static28.aClass42_438, local564.aClass42_120 }), Static73.aClass42_970, local557.anInt1827, 1004, local44);
							} else if ((Static82.anInt2193 & 0x1) == 1) {
								Static69.method1232(local38, Static57.method1822(new Class42[] { Static70.aClass42_916, Static69.aClass42_898, local564.aClass42_120 }), Static83.aClass42_1187, local557.anInt1827, 17, local44);
							}
						}
					}
				}
			}
		}
	}
}
