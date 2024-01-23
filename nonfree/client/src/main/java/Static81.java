import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!fk", name = "C", descriptor = "Z")
	public static boolean aBoolean99;

	@OriginalMember(owner = "client!fk", name = "L", descriptor = "I")
	public static int anInt1698;

	@OriginalMember(owner = "client!fk", name = "G", descriptor = "Lclient!od;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(BI)V")
	public static void method1387(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = Static85.anInt1730;
		if (arg0 == 0) {
			local7 = 1;
		}
		@Pc(16) int local16;
		@Pc(26) Class13_Sub5_Sub1 local26;
		@Pc(120) int local120;
		@Pc(126) int local126;
		@Pc(147) int local147;
		@Pc(165) int local165;
		@Pc(174) int local174;
		@Pc(187) int local187;
		for (local16 = 0; local16 < local7; local16++) {
			if (arg0 == 0) {
				local26 = Static72.aClass13_Sub5_Sub1_1;
			} else {
				local26 = Static100.aClass13_Sub5_Sub1Array1[Static291.anIntArray457[local16]];
			}
			if (local26 != null && local26.method4213()) {
				@Pc(44) int local44 = local26.method4219();
				if (arg0 == 0 || arg0 == local44) {
					@Pc(110) int local110;
					if (local44 == 1) {
						if ((local26.anInt5334 & 0x7F) == 64 && (local26.anInt5294 & 0x7F) == 64) {
							local110 = local26.anInt5334 >> 7;
							local120 = local26.anInt5294 >> 7;
							if (local110 >= 0 && local110 < 104 && local120 >= 0 && local120 < 104) {
								local187 = Static274.anIntArrayArray37[local110][local120]++;
							}
						}
					} else if (((local44 & 0x1) != 0 || (local26.anInt5334 & 0x7F) == 0 && (local26.anInt5294 & 0x7F) == 0) && ((local44 & 0x1) != 1 || (local26.anInt5334 & 0x7F) == 64 && (local26.anInt5294 & 0x7F) == 64)) {
						local110 = local26.anInt5334 - local44 * 64 >> 7;
						local120 = local26.anInt5294 - local44 * 64 >> 7;
						local126 = local26.method4219() + local110;
						if (local126 > 104) {
							local126 = 104;
						}
						if (local110 < 0) {
							local110 = 0;
						}
						local147 = local120 + local26.method4219();
						if (local120 < 0) {
							local120 = 0;
						}
						if (local147 > 104) {
							local147 = 104;
						}
						for (local165 = local110; local165 < local126; local165++) {
							for (local174 = local120; local174 < local147; local174++) {
								local187 = Static274.anIntArrayArray37[local165][local174]++;
							}
						}
					}
				}
			}
		}
		label223: for (local16 = 0; local16 < local7; local16++) {
			@Pc(269) long local269;
			if (arg0 == 0) {
				local269 = 8791798054912L;
				local26 = Static72.aClass13_Sub5_Sub1_1;
			} else {
				local269 = (long) Static291.anIntArray457[local16] << 32;
				local26 = Static100.aClass13_Sub5_Sub1Array1[Static291.anIntArray457[local16]];
			}
			if (local26 != null && local26.method4213()) {
				local120 = local26.method4219();
				if (arg0 == 0 || arg0 == local120) {
					local26.aBoolean352 = true;
					local26.aBoolean279 = false;
					if ((Static85.aBoolean102 && Static85.anInt1730 > 200 || Static85.anInt1730 > 50) && arg0 != 0 && local26.anInt5307 == local26.method4212().anInt1156) {
						local26.aBoolean279 = true;
					}
					if (local120 == 1) {
						if ((local26.anInt5334 & 0x7F) == 64 && (local26.anInt5294 & 0x7F) == 64) {
							local126 = local26.anInt5334 >> 7;
							local147 = local26.anInt5294 >> 7;
							if (local126 < 0 || local126 >= 104 || local147 < 0 || local147 >= 104) {
								continue;
							}
							if (Static274.anIntArrayArray37[local126][local147] > 1) {
								local187 = Static274.anIntArrayArray37[local126][local147]--;
								continue;
							}
						}
					} else if ((local120 & 0x1) == 0 && (local26.anInt5334 & 0x7F) == 0 && (local26.anInt5294 & 0x7F) == 0 || (local120 & 0x1) == 1 && (local26.anInt5334 & 0x7F) == 64 && (local26.anInt5294 & 0x7F) == 0) {
						local126 = local26.anInt5334 - local120 * 64 >> 7;
						local147 = local26.anInt5294 - local120 * 64 >> 7;
						local174 = local120 + local147;
						if (local147 < 0) {
							local147 = 0;
						}
						if (local174 > 104) {
							local174 = 104;
						}
						@Pc(485) boolean local485 = true;
						local165 = local120 + local126;
						if (local165 > 104) {
							local165 = 104;
						}
						if (local126 < 0) {
							local126 = 0;
						}
						@Pc(504) int local504;
						@Pc(513) int local513;
						for (local504 = local126; local504 < local165; local504++) {
							for (local513 = local147; local513 < local174; local513++) {
								if (Static274.anIntArrayArray37[local504][local513] <= 1) {
									local485 = false;
									break;
								}
							}
						}
						if (local485) {
							local504 = local126;
							while (true) {
								if (local165 <= local504) {
									continue label223;
								}
								for (local513 = local147; local513 < local174; local513++) {
									local187 = Static274.anIntArrayArray37[local504][local513]--;
								}
								local504++;
							}
						}
					}
					if (local26.anObject7 == null || Static50.anInt1118 < local26.anInt5264 || Static50.anInt1118 >= local26.anInt5270) {
						local26.aBoolean352 = false;
						local26.anInt5315 = Static58.method2504(local26.anInt5294, local26.anInt5334, Static222.anInt4467);
						Static234.method3640(Static222.anInt4467, local26.anInt5334, local26.anInt5294, local26.anInt5315, (local120 - 1) * 64 + 60, local26, local26.anInt5261, local269, local26.aBoolean353);
					} else {
						local26.aBoolean352 = false;
						local26.aBoolean279 = false;
						local26.anInt5315 = Static58.method2504(local26.anInt5294, local26.anInt5334, Static222.anInt4467);
						Static179.method2933(Static222.anInt4467, local26.anInt5334, local26.anInt5294, local26.anInt5315, local26, local26.anInt5261, local269, local26.anInt5317, local26.anInt5276, local26.anInt5323, local26.anInt5311);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILclient!cg;)I")
	public static int method1389(@OriginalArg(1) Class22 arg0) {
		@Pc(6) int local6 = 0;
		if (arg0.method656(Static282.anInt5537)) {
			local6++;
		}
		if (arg0.method656(Static123.anInt2507)) {
			local6++;
		}
		if (arg0.method656(Static244.anInt4817)) {
			local6++;
		}
		if (arg0.method656(Static126.anInt2525)) {
			local6++;
		}
		if (arg0.method656(Static4.anInt74)) {
			local6++;
		}
		if (arg0.method656(Static141.anInt2798)) {
			local6++;
		}
		if (arg0.method656(Static190.anInt3868)) {
			local6++;
		}
		if (arg0.method656(Static235.anInt4658)) {
			local6++;
		}
		if (arg0.method656(Static115.anInt2333)) {
			local6++;
		}
		if (arg0.method656(Static240.anInt2604)) {
			local6++;
		}
		if (arg0.method656(Static102.anInt2017)) {
			local6++;
		}
		if (arg0.method656(Static77.anInt1593)) {
			local6++;
		}
		if (arg0.method656(Static185.anInt3674)) {
			local6++;
		}
		if (arg0.method656(Static12.anInt286)) {
			local6++;
		}
		if (arg0.method656(Static205.anInt4052)) {
			local6++;
		}
		return local6;
	}

	@OriginalMember(owner = "client!fk", name = "d", descriptor = "(I)V")
	public static void method1392() {
		Static176.aClass172_46.method4350();
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(BLclient!pi;)Lclient!oa;")
	public static Class4_Sub1 method1393(@OriginalArg(1) Class4_Sub24 arg0) {
		arg0.method3110();
		@Pc(19) int local19 = arg0.method3110();
		@Pc(23) Class4_Sub1 local23 = Static198.method3234(local19);
		local23.anInt5664 = arg0.method3110();
		@Pc(34) int local34 = arg0.method3110();
		for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
			@Pc(47) int local47 = arg0.method3110();
			local23.method4545(local47, arg0);
		}
		local23.method4537();
		return local23;
	}

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "(I)V")
	public static void method1394() {
		@Pc(8) int local8 = Static307.aByteArrayArray17.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static307.aByteArrayArray17[local10] != null) {
				@Pc(27) int local27 = -1;
				for (@Pc(29) int local29 = 0; local29 < Static115.anInt2348; local29++) {
					if (Static162.anIntArray272[local10] == Static143.anIntArray232[local29]) {
						local27 = local29;
						break;
					}
				}
				if (local27 == -1) {
					Static143.anIntArray232[Static115.anInt2348] = Static162.anIntArray272[local10];
					local27 = Static115.anInt2348++;
				}
				@Pc(64) int local64 = 0;
				@Pc(71) Class4_Sub24 local71 = new Class4_Sub24(Static307.aByteArrayArray17[local10]);
				while (local71.anInt3822 < Static307.aByteArrayArray17[local10].length && local64 < 511) {
					@Pc(94) int local94 = local27 | local64++ << 6;
					@Pc(98) int local98 = local71.method3085();
					@Pc(102) int local102 = local98 >> 14;
					@Pc(106) int local106 = local98 & 0x3F;
					@Pc(112) int local112 = local98 >> 7 & 0x3F;
					@Pc(124) int local124 = local112 + (Static162.anIntArray272[local10] >> 8) * 64 - Static269.anInt5357;
					@Pc(138) int local138 = (Static162.anIntArray272[local10] & 0xFF) * 64 + local106 - Static105.anInt2105;
					@Pc(144) Class185 local144 = Static22.method458(local71.method3085());
					if (Static260.aClass13_Sub5_Sub2Array114[local94] == null && (local144.aByte23 & 0x1) > 0 && Static60.anInt1347 == local102 && local124 >= 0 && local144.anInt5803 + local124 < 104 && local138 >= 0 && local144.anInt5803 + local138 < 104) {
						Static260.aClass13_Sub5_Sub2Array114[local94] = new Class13_Sub5_Sub2();
						@Pc(200) Class13_Sub5_Sub2 local200 = Static260.aClass13_Sub5_Sub2Array114[local94];
						Static123.anIntArray214[Static99.anInt1950++] = local94;
						local200.anInt5329 = Static50.anInt1118;
						local200.method4230(local144);
						local200.method4217(local200.aClass185_1.anInt5803);
						local200.anInt5266 = local200.anInt5261 = Static219.anIntArray348[local200.aClass185_1.aByte26];
						local200.anInt5275 = local200.aClass185_1.anInt5790;
						local200.anInt5290 = local200.aClass185_1.anInt5788;
						if (local200.anInt5290 == 0) {
							local200.anInt5261 = 0;
						}
						local200.method4221(true, local138, local200.method4219(), local124);
					}
				}
			}
		}
	}
}
