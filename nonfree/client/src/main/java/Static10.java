import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!be", name = "i", descriptor = "Lclient!ga;")
	public static Class29 aClass29_3;

	@OriginalMember(owner = "client!be", name = "p", descriptor = "Lclient!rd;")
	private static Class63 aClass63_262 = Static80.method1463("glow1:");

	@OriginalMember(owner = "client!be", name = "c", descriptor = "Lclient!rd;")
	public static Class63 aClass63_257 = aClass63_262;

	@OriginalMember(owner = "client!be", name = "f", descriptor = "Lclient!rd;")
	public static Class63 aClass63_258 = Static80.method1463("Icons redrawn");

	@OriginalMember(owner = "client!be", name = "g", descriptor = "Lclient!rd;")
	private static Class63 aClass63_259 = Static80.method1463("Your friendlist is full)3 Max of 100 for free users)1 and 200 for members");

	@OriginalMember(owner = "client!be", name = "m", descriptor = "Lclient!rd;")
	public static Class63 aClass63_260 = aClass63_262;

	@OriginalMember(owner = "client!be", name = "n", descriptor = "Lclient!rd;")
	public static Class63 aClass63_261 = aClass63_259;

	@OriginalMember(owner = "client!be", name = "o", descriptor = "Z")
	public static boolean aBoolean20 = false;

	@OriginalMember(owner = "client!be", name = "q", descriptor = "I")
	public static int anInt335 = 0;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IZI)I")
	public static int method263(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}
			return 127 - arg1;
		} else {
			arg1 = (arg0 & 0x7F) * arg1 / 128;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
	public static void method264() {
		aClass63_262 = null;
		aClass63_258 = null;
		aClass63_260 = null;
		aClass63_259 = null;
		aClass63_261 = null;
		aClass63_257 = null;
		aClass29_3 = null;
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V")
	public static void method266() {
		Static106.anInt2958++;
		Static42.method929(true);
		Static40.method1430(true);
		Static42.method929(false);
		Static40.method1430(false);
		Static47.method1030();
		Static116.method2110();
		@Pc(29) int local29;
		@Pc(61) int local61;
		if (!Static17.aBoolean142) {
			local29 = Static67.anInt1848;
			if (Static89.anInt2469 / 256 > local29) {
				local29 = Static89.anInt2469 / 256;
			}
			if (Static2.aBooleanArray1[4] && Static43.anIntArray22[4] + 128 > local29) {
				local29 = Static43.anIntArray22[4] + 128;
			}
			local61 = Static115.anInt3137 + Static109.anInt3032 & 0x7FF;
			Static39.method881(Static57.anInt1727, Static110.method2038(Static101.anInt2810, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2347, Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.anInt2319) - 50, Static90.anInt2543, local29, local61, local29 * 3 + 600);
		}
		if (Static17.aBoolean142) {
			local29 = Static78.method1450();
		} else {
			local29 = Static97.method1792();
		}
		@Pc(95) int local95 = Static4.anInt45;
		@Pc(97) int local97 = Static34.anInt1163;
		local61 = Static41.anInt1273;
		@Pc(106) int local106 = Static94.anInt2627;
		@Pc(108) int local108 = Static35.anInt1172;
		for (@Pc(110) int local110 = 0; local110 < 5; local110++) {
			if (Static2.aBooleanArray1[local110]) {
				@Pc(152) int local152 = (int) ((double) -Static78.anIntArray241[local110] + Math.random() * (double) (Static78.anIntArray241[local110] * 2 + 1) + Math.sin((double) Static81.anIntArray249[local110] * ((double) Static74.anIntArray235[local110] / 100.0D)) * (double) Static43.anIntArray22[local110]);
				if (local110 == 2) {
					Static4.anInt45 += local152;
				}
				if (local110 == 4) {
					Static35.anInt1172 += local152;
					if (Static35.anInt1172 < 128) {
						Static35.anInt1172 = 128;
					}
					if (Static35.anInt1172 > 383) {
						Static35.anInt1172 = 383;
					}
				}
				if (local110 == 0) {
					Static41.anInt1273 += local152;
				}
				if (local110 == 1) {
					Static34.anInt1163 += local152;
				}
				if (local110 == 3) {
					Static94.anInt2627 = local152 + Static94.anInt2627 & 0x7FF;
				}
			}
		}
		Static61.method1188();
		Static26.anInt890 = Static59.anInt1768 - 4;
		Static26.anInt895 = 0;
		Static26.anInt893 = Static102.anInt2823 - 4;
		Static26.aBoolean44 = true;
		Static44.method959();
		Static121.method1970();
		Static44.method959();
		Static76.aClass19_1.method685(Static41.anInt1273, Static34.anInt1163, Static4.anInt45, Static35.anInt1172, Static94.anInt2627, local29);
		Static44.method959();
		Static76.aClass19_1.method664();
		Static37.method871();
		Static72.method1388();
		((Class72) Static107.anInterface1_1).method2075(Static68.anInt1973);
		Static73.method1394();
		if (Static84.aBoolean123 && Static96.method1780() == 0) {
			Static84.aBoolean123 = false;
		}
		if (Static84.aBoolean123) {
			Static61.method1188();
			Static121.method1970();
			Static93.method1703(false, null, Static110.aClass63_1649);
		}
		Static44.method959();
		Static42.method925();
		Static4.anInt45 = local95;
		Static34.anInt1163 = local97;
		Static41.anInt1273 = local61;
		Static94.anInt2627 = local106;
		Static35.anInt1172 = local108;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V")
	public static void method267() {
		@Pc(9) int local9 = Static114.aClass6_Sub3_Sub3_Sub1_4.method450(Static14.aClass63_324);
		@Pc(24) int local24;
		for (@Pc(16) int local16 = 0; local16 < Static18.anInt569; local16++) {
			local24 = Static114.aClass6_Sub3_Sub3_Sub1_4.method444(Static31.aClass63Array7[local16]);
			if (local24 > local9) {
				local9 = local24;
			}
		}
		local9 += 8;
		local24 = Static18.anInt569 * 15 + 21;
		@Pc(103) int local103;
		@Pc(82) int local82;
		if (Static14.anInt480 != -1) {
			Static12.aBoolean23 = true;
			Static90.anInt2542 = Static18.anInt569 * 15 + 22;
			Static19.anInt634 = 0;
			local103 = Static59.anInt1765 - local9 / 2;
			local82 = Static61.anInt1804;
			if (local103 + local9 > 765) {
				local103 = 765 - local9;
			}
			if (local24 + local82 > 503) {
				local82 = 503 - local24;
			}
			if (local103 < 0) {
				local103 = 0;
			}
			if (local82 < 0) {
				local82 = 0;
			}
			Static40.anInt2113 = local82;
			Static71.anInt2035 = local9;
			Static115.anInt3132 = local103;
			return;
		}
		if (Static59.anInt1765 > 4 && Static61.anInt1804 > 4 && Static59.anInt1765 < 516 && Static61.anInt1804 < 338) {
			Static12.aBoolean23 = true;
			Static19.anInt634 = 0;
			Static71.anInt2035 = local9;
			Static90.anInt2542 = Static18.anInt569 * 15 + 22;
			local82 = Static61.anInt1804 - 4;
			if (local24 + local82 > 334) {
				local82 = 334 - local24;
			}
			local103 = Static59.anInt1765 - local9 / 2 - 4;
			if (local9 + local103 > 512) {
				local103 = 512 - local9;
			}
			if (local103 < 0) {
				local103 = 0;
			}
			Static115.anInt3132 = local103;
			if (local82 < 0) {
				local82 = 0;
			}
			Static40.anInt2113 = local82;
			return;
		}
		if (Static59.anInt1765 > 553 && Static61.anInt1804 > 205 && Static59.anInt1765 < 743 && Static61.anInt1804 < 466) {
			Static90.anInt2542 = Static18.anInt569 * 15 + 22;
			Static12.aBoolean23 = true;
			local103 = Static59.anInt1765 - local9 / 2 - 553;
			Static71.anInt2035 = local9;
			if (local103 < 0) {
				local103 = 0;
			} else if (local103 + local9 > 190) {
				local103 = 190 - local9;
			}
			Static19.anInt634 = 1;
			Static115.anInt3132 = local103;
			local82 = Static61.anInt1804 - 205;
			if (local82 < 0) {
				local82 = 0;
			} else if (local82 + local24 > 261) {
				local82 = 261 - local24;
			}
			Static40.anInt2113 = local82;
			return;
		}
		if (Static59.anInt1765 <= 17 || Static61.anInt1804 <= 357 || Static59.anInt1765 >= 496 || Static61.anInt1804 >= 453) {
			return;
		}
		Static90.anInt2542 = Static18.anInt569 * 15 + 22;
		Static71.anInt2035 = local9;
		Static19.anInt634 = 2;
		Static12.aBoolean23 = true;
		local103 = Static59.anInt1765 - local9 / 2 - 17;
		if (local103 < 0) {
			local103 = 0;
		} else if (local103 + local9 > 479) {
			local103 = 479 - local9;
		}
		Static115.anInt3132 = local103;
		local82 = Static61.anInt1804 - 357;
		if (local82 < 0) {
			local82 = 0;
		} else if (local24 + local82 > 96) {
			local82 = 96 - local24;
		}
		Static40.anInt2113 = local82;
		return;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!ra;B)V")
	public static void method268(@OriginalArg(0) Class6_Sub3_Sub3_Sub3 arg0) {
		for (@Pc(9) int local9 = 0; local9 < Static85.anIntArray305.length; local9++) {
			Static85.anIntArray305[local9] = 0;
		}
		@Pc(44) int local44;
		for (@Pc(34) int local34 = 0; local34 < 5000; local34++) {
			local44 = (int) (Math.random() * 128.0D * (double) 256);
			Static85.anIntArray305[local44] = (int) (Math.random() * 256.0D);
		}
		@Pc(61) int local61;
		@Pc(65) int local65;
		@Pc(74) int local74;
		for (local44 = 0; local44 < 20; local44++) {
			for (local61 = 1; local61 < 255; local61++) {
				for (local65 = 1; local65 < 127; local65++) {
					local74 = local65 + (local61 << 7);
					Static86.anIntArray278[local74] = (Static85.anIntArray305[local74 + 128] + Static85.anIntArray305[local74 - 128] + Static85.anIntArray305[local74 + 1] + Static85.anIntArray305[local74 - 1]) / 4;
				}
			}
			@Pc(114) int[] local114 = Static85.anIntArray305;
			Static85.anIntArray305 = Static86.anIntArray278;
			Static86.anIntArray278 = local114;
		}
		if (arg0 == null) {
			return;
		}
		local61 = 0;
		for (local65 = 0; local65 < arg0.anInt2687; local65++) {
			for (local74 = 0; local74 < arg0.anInt2689; local74++) {
				if (arg0.aByteArray31[local61++] != 0) {
					@Pc(153) int local153 = local74 + arg0.anInt2686 + 16;
					@Pc(160) int local160 = arg0.anInt2690 + local65 + 16;
					@Pc(166) int local166 = (local160 << 7) + local153;
					Static85.anIntArray305[local166] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)V")
	public static void method269(@OriginalArg(0) int arg0) {
		if (Static69.anInt1998 == 0) {
			Static1.aClass6_Sub6_Sub4_1.method1925(arg0);
		} else {
			Static68.anInt1982 = arg0;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIII)V")
	public static void method270(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = arg3; local7 <= arg3 + arg0; local7++) {
			for (@Pc(16) int local16 = arg2; local16 <= arg1 + arg2; local16++) {
				if (local16 >= 0 && local16 < 104 && local7 >= 0 && local7 < 104) {
					Static31.aByteArrayArrayArray28[0][local16][local7] = 127;
					if (local16 == arg2 && local16 > 0) {
						Static11.anIntArrayArrayArray6[0][local16][local7] = Static11.anIntArrayArrayArray6[0][local16 - 1][local7];
					}
					if (arg2 + arg1 == local16 && local16 < 103) {
						Static11.anIntArrayArrayArray6[0][local16][local7] = Static11.anIntArrayArrayArray6[0][local16 + 1][local7];
					}
					if (local7 == arg3 && local7 > 0) {
						Static11.anIntArrayArrayArray6[0][local16][local7] = Static11.anIntArrayArrayArray6[0][local16][local7 - 1];
					}
					if (local7 == arg0 + arg3 && local7 < 103) {
						Static11.anIntArrayArrayArray6[0][local16][local7] = Static11.anIntArrayArrayArray6[0][local16][local7 + 1];
					}
				}
			}
		}
	}
}
