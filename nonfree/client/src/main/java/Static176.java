import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "Lclient!lc;")
	public static Class98 aClass98_24;

	@OriginalMember(owner = "client!nc", name = "R", descriptor = "I")
	private static int anInt831;

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "[Z")
	public static boolean[] aBooleanArray10 = new boolean[200];

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
	public static int anInt808 = 0;

	@OriginalMember(owner = "client!nc", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString19 = "Loading title screen - ";

	@OriginalMember(owner = "client!nc", name = "J", descriptor = "Lclient!cl;")
	public static Class27 aClass27_2 = Static172.method2699();

	@OriginalMember(owner = "client!nc", name = "O", descriptor = "I")
	public static int anInt829 = 0;

	@OriginalMember(owner = "client!nc", name = "P", descriptor = "S")
	public static short aShort12 = 256;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
	public static void method652() {
		if (Static24.aClass22_2 != null || Static45.aClass22_6 != null) {
			return;
		}
		@Pc(17) int local17 = Static44.anInt885;
		@Pc(30) int local30;
		@Pc(91) int local91;
		if (!Static142.aBoolean192) {
			if (local17 == 1 && Static60.anInt1152 > 0) {
				@Pc(217) short local217 = Static299.aShortArray93[Static60.anInt1152 - 1];
				if (local217 == 32 || local217 == 11 || local217 == 2 || local217 == 60 || local217 == 47 || local217 == 51 || local217 == 19 || local217 == 37 || local217 == 14 || local217 == 57 || local217 == 3 || local217 == 1004) {
					local30 = Static66.anIntArray136[Static60.anInt1152 - 1];
					local91 = Static136.anIntArray251[Static60.anInt1152 - 1];
					@Pc(277) Class22 local277 = Static21.method3453(local91);
					@Pc(280) Class4_Sub25 local280 = Static40.method681(local277);
					if (local280.method2831() || local280.method2832()) {
						Static34.anInt678 = 0;
						Static141.aBoolean190 = false;
						if (Static24.aClass22_2 != null) {
							Static81.method3274(Static24.aClass22_2);
						}
						Static24.aClass22_2 = Static21.method3453(local91);
						Static36.anInt715 = Static35.anInt708;
						Static31.anInt635 = Static147.anInt2993;
						Static65.anInt1223 = local30;
						Static81.method3274(Static24.aClass22_2);
						return;
					}
				}
			}
			if (local17 == 1 && (Static76.anInt1445 == 1 && Static60.anInt1152 > 2 || Static87.method1401(Static60.anInt1152 - 1))) {
				local17 = 2;
			}
			if (local17 == 2 && Static60.anInt1152 > 0 || Static209.anInt5551 == 1) {
				Static145.method2346();
			}
			if (local17 == 1 && Static60.anInt1152 > 0 || Static209.anInt5551 == 2) {
				Static120.method2045();
			}
			return;
		}
		@Pc(32) int local32;
		if (local17 != 1) {
			local30 = Static117.anInt2589;
			local32 = Static72.anInt1326;
			if (Static261.anInt4963 - 10 > local32 || local32 > Static206.anInt4044 + Static261.anInt4963 + 10 || Static205.anInt4000 - 10 > local30 || Static205.anInt4000 + Static139.anInt2867 + 10 < local30) {
				Static142.aBoolean192 = false;
				Static115.method1995(Static205.anInt4000, Static139.anInt2867, Static261.anInt4963, Static206.anInt4044);
			}
		}
		if (local17 != 1) {
			return;
		}
		local30 = Static205.anInt4000;
		@Pc(89) int local89 = Static35.anInt708;
		local91 = Static206.anInt4044;
		@Pc(93) int local93 = -1;
		@Pc(95) int local95 = Static147.anInt2993;
		local32 = Static261.anInt4963;
		for (@Pc(99) int local99 = 0; local99 < Static60.anInt1152; local99++) {
			@Pc(118) int local118;
			if (Static32.aBoolean50) {
				local118 = local30 + (Static60.anInt1152 - (local99 + 1)) * 15 + 33;
				if (local32 < local89 && local32 + local91 > local89 && local118 - 13 < local95 && local95 < local118 + 3) {
					local93 = local99;
				}
			} else {
				local118 = local30 + (Static60.anInt1152 + -1 + -local99) * 15 + 31;
				if (local89 > local32 && local89 < local32 + local91 && local95 > local118 - 13 && local95 < local118 + 3) {
					local93 = local99;
				}
			}
		}
		if (local93 != -1) {
			Static15.method265(local93);
		}
		Static142.aBoolean192 = false;
		Static115.method1995(Static205.anInt4000, Static139.anInt2867, Static261.anInt4963, Static206.anInt4044);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method653(@OriginalArg(0) String arg0) {
		@Pc(5) String local5 = Static211.method3379(Static34.method491(arg0));
		if (local5 == null) {
			local5 = "";
		}
		return local5;
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(B)V")
	public static void method654() {
		for (@Pc(10) Class4_Sub2_Sub7 local10 = (Class4_Sub2_Sub7) Static209.aClass10_61.method190(); local10 != null; local10 = (Class4_Sub2_Sub7) Static209.aClass10_61.method191()) {
			@Pc(16) Class12_Sub1 local16 = local10.aClass12_Sub1_1;
			if (local16.anInt297 != Static210.anInt4103 || local16.aBoolean22) {
				local10.method4391();
			} else if (Static104.anInt2226 >= local16.anInt293) {
				local16.method263(Static16.anInt307);
				if (local16.aBoolean22) {
					local10.method4391();
				} else {
					Static258.method3892(local16.anInt297, local16.anInt281, local16.anInt288, local16.anInt292, 60, local16, 0, -1L, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V")
	public static void method655() {
		aClass98_24 = null;
		aBooleanArray10 = null;
		aClass27_2 = null;
		aString19 = null;
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)V")
	public static void method661() {
		if (Static23.aClass4_Sub2_Sub9_1 == null) {
			return;
		}
		if (Static93.anInt1927 < 10) {
			if (!Static244.aClass98_140.method2404(Static23.aClass4_Sub2_Sub9_1.aString54)) {
				Static93.anInt1927 = Static234.aClass98_137.method2373(Static23.aClass4_Sub2_Sub9_1.aString54) / 10;
				return;
			}
			Static272.method4071();
			Static93.anInt1927 = 10;
		}
		if (Static93.anInt1927 == 10) {
			Static81.anInt4033 = Static23.aClass4_Sub2_Sub9_1.anInt1824 >> 6 << 6;
			Static269.anInt5031 = (Static23.aClass4_Sub2_Sub9_1.anInt1830 >> 6 << 6) + 64 - Static81.anInt4033;
			Static132.anInt2785 = Static23.aClass4_Sub2_Sub9_1.anInt1821 >> 6 << 6;
			Static92.anInt1912 = (Static23.aClass4_Sub2_Sub9_1.anInt1827 >> 6 << 6) + 64 - Static132.anInt2785;
			@Pc(80) int local80 = -1;
			@Pc(97) int[] local97 = Static23.aClass4_Sub2_Sub9_1.method1414(Static210.anInt4103, (Static239.aClass12_Sub3_Sub2_2.anInt4113 >> 7) + Static239.anInt4613, (Static239.aClass12_Sub3_Sub2_2.anInt4141 >> 7) + Static170.anInt3385);
			@Pc(99) int local99 = -1;
			if (local97 != null) {
				local80 = local97[1] - Static81.anInt4033;
				local99 = Static92.anInt1912 + Static132.anInt2785 - local97[2] - 1;
			}
			if (local80 >= 0 && Static269.anInt5031 > local80 && local99 >= 0 && Static92.anInt1912 > local99) {
				local80 += (int) (Math.random() * 10.0D) - 5;
				Static295.anInt5481 = local80;
				local99 += (int) (Math.random() * 10.0D) - 5;
				Static96.anInt2064 = local99;
			} else {
				@Pc(176) int[] local176;
				if (Static28.anInt530 == -1 || Static63.anInt1188 == -1) {
					local176 = Static23.aClass4_Sub2_Sub9_1.method1415(Static23.aClass4_Sub2_Sub9_1.anInt1817 >> 14 & 0x3FFF, Static23.aClass4_Sub2_Sub9_1.anInt1817 & 0x3FFF);
					Static96.anInt2064 = Static92.anInt1912 + Static132.anInt2785 - local176[2] - 1;
					Static295.anInt5481 = local176[1] - Static81.anInt4033;
				} else {
					local176 = Static23.aClass4_Sub2_Sub9_1.method1415(Static28.anInt530, Static63.anInt1188);
					if (local176 != null) {
						Static96.anInt2064 = Static92.anInt1912 + Static132.anInt2785 - local176[2] - 1;
						Static295.anInt5481 = local176[1] - Static81.anInt4033;
					}
					Static63.anInt1188 = -1;
					Static28.anInt530 = -1;
				}
			}
			if (Static23.aClass4_Sub2_Sub9_1.anInt1828 == 37) {
				Static251.aFloat47 = 3.0F;
				Static96.aFloat15 = 3.0F;
			} else if (Static23.aClass4_Sub2_Sub9_1.anInt1828 == 50) {
				Static251.aFloat47 = 4.0F;
				Static96.aFloat15 = 4.0F;
			} else if (Static23.aClass4_Sub2_Sub9_1.anInt1828 == 75) {
				Static251.aFloat47 = 6.0F;
				Static96.aFloat15 = 6.0F;
			} else if (Static23.aClass4_Sub2_Sub9_1.anInt1828 == 100) {
				Static251.aFloat47 = 8.0F;
				Static96.aFloat15 = 8.0F;
			} else if (Static23.aClass4_Sub2_Sub9_1.anInt1828 == 200) {
				Static251.aFloat47 = 16.0F;
				Static96.aFloat15 = 16.0F;
			} else {
				Static251.aFloat47 = 8.0F;
				Static96.aFloat15 = 8.0F;
			}
			Static249.method3769();
			@Pc(299) int local299 = Static269.anInt5031 >> 6;
			@Pc(305) int local305 = Static34.anInt680 >> 2 << 10;
			Static44.anIntArray115 = new int[Static88.anInt1823 + 1];
			@Pc(314) int local314 = Static92.anInt1912 >> 6;
			Static212.aByteArrayArrayArray16 = new byte[local299][local314][];
			Static283.aByteArrayArrayArray20 = new byte[local299][local314][];
			Static106.aByteArrayArrayArray5 = new byte[local299][local314][];
			Static220.anIntArrayArrayArray11 = new int[local299][local314][];
			Static121.aByteArrayArrayArray6 = new byte[local299][local314][];
			Static147.aByteArrayArrayArray8 = new byte[local299][local314][];
			Static214.anIntArrayArrayArray10 = new int[local299][local314][];
			@Pc(346) int local346 = Static24.anInt441 >> 1;
			Static290.anIntArrayArrayArray14 = new int[local299][local314][];
			Static79.method1233(local305, local346);
			Static93.anInt1927 = 20;
		} else if (Static93.anInt1927 == 20) {
			Static79.method1235(new Class4_Sub17(Static244.aClass98_140.method2377("underlay", Static23.aClass4_Sub2_Sub9_1.aString54)));
			Static93.anInt1927 = 30;
			Static155.method2474(true);
			Static62.method959();
		} else if (Static93.anInt1927 == 30) {
			Static6.method132(new Class4_Sub17(Static244.aClass98_140.method2377("overlay", Static23.aClass4_Sub2_Sub9_1.aString54)));
			Static93.anInt1927 = 40;
			Static62.method959();
		} else if (Static93.anInt1927 == 40) {
			Static110.method1902(new Class4_Sub17(Static244.aClass98_140.method2377("overlay2", Static23.aClass4_Sub2_Sub9_1.aString54)));
			Static93.anInt1927 = 50;
			Static62.method959();
		} else if (Static93.anInt1927 == 50) {
			Static266.method3997(new Class4_Sub17(Static244.aClass98_140.method2377("loc", Static23.aClass4_Sub2_Sub9_1.aString54)));
			Static93.anInt1927 = 60;
			Static155.method2474(true);
			Static62.method959();
		} else if (Static93.anInt1927 == 60) {
			if (Static244.aClass98_140.method2388(Static23.aClass4_Sub2_Sub9_1.aString54 + "_labels")) {
				if (!Static244.aClass98_140.method2404(Static23.aClass4_Sub2_Sub9_1.aString54 + "_labels")) {
					return;
				}
				Static192.aClass9_2 = Static218.method4255(Static244.aClass98_140, Static23.aClass4_Sub2_Sub9_1.aString54 + "_labels");
			} else {
				Static192.aClass9_2 = new Class9(0);
			}
			Static93.anInt1927 = 70;
			Static62.method959();
		} else if (Static93.anInt1927 == 70) {
			Static132.aClass15_4 = new Class15(11, true, Static235.aCanvas1);
			Static93.anInt1927 = 73;
			Static155.method2474(true);
			Static62.method959();
		} else if (Static93.anInt1927 == 73) {
			Static247.aClass15_9 = new Class15(12, true, Static235.aCanvas1);
			Static93.anInt1927 = 76;
			Static155.method2474(true);
			Static62.method959();
		} else if (Static93.anInt1927 == 76) {
			Static32.aClass15_1 = new Class15(14, true, Static235.aCanvas1);
			Static93.anInt1927 = 79;
			Static155.method2474(true);
			Static62.method959();
		} else if (Static93.anInt1927 == 79) {
			Static224.aClass15_7 = new Class15(17, true, Static235.aCanvas1);
			Static93.anInt1927 = 82;
			Static155.method2474(true);
			Static62.method959();
		} else if (Static93.anInt1927 == 82) {
			Static231.aClass15_8 = new Class15(19, true, Static235.aCanvas1);
			Static93.anInt1927 = 85;
			Static155.method2474(true);
			Static62.method959();
		} else if (Static93.anInt1927 == 85) {
			Static287.aClass15_3 = new Class15(22, true, Static235.aCanvas1);
			Static93.anInt1927 = 88;
			Static155.method2474(true);
			Static62.method959();
		} else if (Static93.anInt1927 == 88) {
			Static213.aClass15_6 = new Class15(26, true, Static235.aCanvas1);
			Static93.anInt1927 = 91;
			Static155.method2474(true);
			Static62.method959();
		} else {
			Static179.aClass15_5 = new Class15(30, true, Static235.aCanvas1);
			Static93.anInt1927 = 100;
			Static155.method2474(true);
			Static62.method959();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "(I)V")
	public static void method667() {
		Static222.aClass33_33.method843();
		Static46.aClass33_8.method843();
	}
}
