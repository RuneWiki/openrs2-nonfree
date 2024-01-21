import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "r", descriptor = "Lclient!q;")
	public static Class64 aClass64_1;

	@OriginalMember(owner = "client!ab", name = "s", descriptor = "Lclient!ic;")
	private static Class34 aClass34_20 = Static56.method816(" ");

	@OriginalMember(owner = "client!ab", name = "o", descriptor = "Lclient!ic;")
	public static Class34 aClass34_18 = aClass34_20;

	@OriginalMember(owner = "client!ab", name = "q", descriptor = "Lclient!ic;")
	public static Class34 aClass34_19 = Static56.method816("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!ab", name = "t", descriptor = "Lclient!ic;")
	public static Class34 aClass34_21 = Static56.method816("::errortest");

	@OriginalMember(owner = "client!ab", name = "u", descriptor = "Lclient!ic;")
	public static Class34 aClass34_22 = Static56.method816("Lade)3)3)3");

	@OriginalMember(owner = "client!ab", name = "v", descriptor = "[I")
	public static int[] anIntArray4 = new int[2048];

	@OriginalMember(owner = "client!ab", name = "z", descriptor = "I")
	public static final int anInt50 = 50;

	@OriginalMember(owner = "client!ab", name = "A", descriptor = "Lclient!ic;")
	public static Class34 aClass34_23 = Static56.method816("sl_button");

	@OriginalMember(owner = "client!ab", name = "B", descriptor = "I")
	public static int anInt51 = 0;

	@OriginalMember(owner = "client!ab", name = "D", descriptor = "Lclient!ic;")
	public static Class34 aClass34_24 = Static56.method816(" (X");

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIBI)Z")
	public static boolean method24(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 >> 14 & 0x7FFF;
		@Pc(18) int local18 = aClass64_1.method1389(Static42.anInt1024, arg2, arg0, arg1);
		if (local18 == -1) {
			return false;
		}
		@Pc(29) int local29 = local18 >> 6 & 0x3;
		@Pc(33) int local33 = local18 & 0x1F;
		if (local33 == 10 || local33 == 11 || local33 == 22) {
			@Pc(50) Class8_Sub1_Sub4 local50 = Static50.method752(local7);
			@Pc(61) int local61;
			@Pc(64) int local64;
			if (local29 == 0 || local29 == 2) {
				local61 = local50.anInt443;
				local64 = local50.anInt455;
			} else {
				local61 = local50.anInt455;
				local64 = local50.anInt443;
			}
			@Pc(75) int local75 = local50.anInt420;
			if (local29 != 0) {
				local75 = (local75 << local29 & 0xF) + (local75 >> 4 - local29);
			}
			Static105.method1480(0, 0, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray262[0], 2, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray260[0], local75, local61, arg2, arg0, local64, true);
		} else {
			Static105.method1480(local33 + 1, local29, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray262[0], 2, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray260[0], 0, 0, arg2, arg0, 0, true);
		}
		Static133.anInt3067 = 0;
		Static132.anInt2817 = anInt51;
		Static16.anInt393 = 2;
		Static81.anInt1954 = Static74.anInt1781;
		return true;
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
	public static void method25() {
		@Pc(19) int local19;
		if (Static99.anInt2333 > 0) {
			for (local19 = 0; local19 < 256; local19++) {
				if (Static99.anInt2333 > 768) {
					Static130.anIntArray407[local19] = Static22.method1595(1024 - Static99.anInt2333, Static111.anIntArray400[local19], Static24.anIntArray247[local19]);
				} else if (Static99.anInt2333 <= 256) {
					Static130.anIntArray407[local19] = Static22.method1595(256 - Static99.anInt2333, Static24.anIntArray247[local19], Static111.anIntArray400[local19]);
				} else {
					Static130.anIntArray407[local19] = Static111.anIntArray400[local19];
				}
			}
		} else if (Static17.anInt451 > 0) {
			for (local19 = 0; local19 < 256; local19++) {
				if (Static17.anInt451 > 768) {
					Static130.anIntArray407[local19] = Static22.method1595(1024 - Static17.anInt451, Static28.anIntArray104[local19], Static24.anIntArray247[local19]);
				} else if (Static17.anInt451 > 256) {
					Static130.anIntArray407[local19] = Static28.anIntArray104[local19];
				} else {
					Static130.anIntArray407[local19] = Static22.method1595(256 - Static17.anInt451, Static24.anIntArray247[local19], Static28.anIntArray104[local19]);
				}
			}
		} else {
			for (local19 = 0; local19 < 256; local19++) {
				Static130.anIntArray407[local19] = Static24.anIntArray247[local19];
			}
		}
		local19 = 0;
		@Pc(162) int local162 = 0;
		@Pc(167) int local167 = Static123.aClass8_Sub1_Sub3_Sub3_7.anInt2537 * 9;
		@Pc(183) int local183;
		@Pc(193) int local193;
		@Pc(200) int local200;
		@Pc(206) int local206;
		@Pc(222) int local222;
		@Pc(220) int local220;
		for (@Pc(169) int local169 = 1; local169 < 255; local169++) {
			local183 = Static130.anIntArray406[local169] * (256 - local169) / 256 + 22;
			if (local183 < 0) {
				local183 = 0;
			}
			local19 += local183;
			for (local193 = local183; local193 < 128; local193++) {
				local200 = Static103.anIntArray327[local19++];
				local206 = Static123.aClass8_Sub1_Sub3_Sub3_7.anIntArray342[local167++];
				if (local200 == 0) {
					Static81.aClass8_Sub1_Sub3_Sub3_3.anIntArray342[local162++] = local206;
				} else {
					local220 = 256 - local200;
					local222 = local200;
					local200 = Static130.anIntArray407[local200];
					Static81.aClass8_Sub1_Sub3_Sub3_3.anIntArray342[local162++] = (local222 * (local200 & 0xFF00) + (local206 & 0xFF00) * local220 & 0xFF0000) + (local220 * (local206 & 0xFF00FF) + local222 * (local200 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			for (local200 = 0; local200 < local183; local200++) {
				Static81.aClass8_Sub1_Sub3_Sub3_3.anIntArray342[local162++] = Static123.aClass8_Sub1_Sub3_Sub3_7.anIntArray342[local167++];
			}
			local167 += Static123.aClass8_Sub1_Sub3_Sub3_7.anInt2537 - 128;
		}
		local162 = 0;
		local19 = 0;
		Static81.aClass8_Sub1_Sub3_Sub3_3.method1584(0, 9);
		local167 = Static123.aClass8_Sub1_Sub3_Sub3_7.anInt2537 * 9 + 128;
		for (local183 = 1; local183 < 255; local183++) {
			local193 = Static130.anIntArray406[local183] * (256 - local183) / 256 + 22;
			if (local193 < 0) {
				local193 = 0;
			}
			for (local200 = 0; local200 < local193; local200++) {
				@Pc(341) int local341 = local162++;
				local167--;
				Static117.aClass8_Sub1_Sub3_Sub3_6.anIntArray342[local341] = Static123.aClass8_Sub1_Sub3_Sub3_7.anIntArray342[local167];
			}
			for (local206 = local193; local206 < 128; local206++) {
				local167--;
				local220 = Static123.aClass8_Sub1_Sub3_Sub3_7.anIntArray342[local167];
				local222 = Static103.anIntArray327[local19++];
				if (local222 == 0) {
					Static117.aClass8_Sub1_Sub3_Sub3_6.anIntArray342[local162++] = local220;
				} else {
					@Pc(386) int local386 = 256 - local222;
					@Pc(388) int local388 = local222;
					local222 = Static130.anIntArray407[local222];
					Static117.aClass8_Sub1_Sub3_Sub3_6.anIntArray342[local162++] = ((local222 & 0xFF00FF) * local388 + (local220 & 0xFF00FF) * local386 & 0xFF00FF00) + ((local222 & 0xFF00) * local388 + (local220 & 0xFF00) * local386 & 0xFF0000) >> 8;
				}
			}
			local19 += local193;
			local167 += Static123.aClass8_Sub1_Sub3_Sub3_7.anInt2537 + 128;
		}
		Static117.aClass8_Sub1_Sub3_Sub3_6.method1584(637, 9);
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(B)V")
	public static void method26() {
		anIntArray4 = null;
		aClass34_19 = null;
		aClass34_21 = null;
		aClass34_22 = null;
		aClass34_18 = null;
		aClass34_24 = null;
		aClass34_20 = null;
		aClass34_23 = null;
		aClass64_1 = null;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIII)I")
	public static int method27(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg5 & 0x1) == 1) {
			@Pc(12) int local12 = arg3;
			arg3 = arg4;
			arg4 = local12;
		}
		@Pc(20) int local20 = arg1 & 0x3;
		if (local20 == 0) {
			return arg0;
		} else if (local20 == 1) {
			return 1 + 7 - arg3 - arg2;
		} else if (local20 == 2) {
			return 1 + 7 - arg0 - arg4;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(B)V")
	public static void method28() {
		Static10.aClass8_Sub20_Sub1_1.method1897();
		@Pc(13) int local13 = Static10.aClass8_Sub20_Sub1_1.method1899(8);
		@Pc(18) int local18;
		if (local13 < Static94.anInt2223) {
			for (local18 = local13; local18 < Static94.anInt2223; local18++) {
				Static2.anIntArray2[Static56.anInt1443++] = Static50.anIntArray164[local18];
			}
		}
		if (Static94.anInt2223 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static94.anInt2223 = 0;
		for (local18 = 0; local18 < local13; local18++) {
			@Pc(65) int local65 = Static50.anIntArray164[local18];
			@Pc(69) Class8_Sub1_Sub1_Sub4_Sub2 local69 = Static45.aClass8_Sub1_Sub1_Sub4_Sub2Array1[local65];
			@Pc(74) int local74 = Static10.aClass8_Sub20_Sub1_1.method1899(1);
			if (local74 == 0) {
				Static50.anIntArray164[Static94.anInt2223++] = local65;
				local69.anInt2057 = Static21.anInt655;
			} else {
				@Pc(97) int local97 = Static10.aClass8_Sub20_Sub1_1.method1899(2);
				if (local97 == 0) {
					Static50.anIntArray164[Static94.anInt2223++] = local65;
					local69.anInt2057 = Static21.anInt655;
					anIntArray4[Static95.anInt2240++] = local65;
				} else {
					@Pc(144) int local144;
					@Pc(154) int local154;
					if (local97 == 1) {
						Static50.anIntArray164[Static94.anInt2223++] = local65;
						local69.anInt2057 = Static21.anInt655;
						local144 = Static10.aClass8_Sub20_Sub1_1.method1899(3);
						local69.method1222(local144, false);
						local154 = Static10.aClass8_Sub20_Sub1_1.method1899(1);
						if (local154 == 1) {
							anIntArray4[Static95.anInt2240++] = local65;
						}
					} else if (local97 == 2) {
						Static50.anIntArray164[Static94.anInt2223++] = local65;
						local69.anInt2057 = Static21.anInt655;
						local144 = Static10.aClass8_Sub20_Sub1_1.method1899(3);
						local69.method1222(local144, true);
						local154 = Static10.aClass8_Sub20_Sub1_1.method1899(3);
						local69.method1222(local154, true);
						@Pc(210) int local210 = Static10.aClass8_Sub20_Sub1_1.method1899(1);
						if (local210 == 1) {
							anIntArray4[Static95.anInt2240++] = local65;
						}
					} else if (local97 == 3) {
						Static2.anIntArray2[Static56.anInt1443++] = local65;
					}
				}
			}
		}
	}
}
