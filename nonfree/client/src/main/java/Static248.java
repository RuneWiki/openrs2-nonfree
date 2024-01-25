import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "B")
	public static byte aByte42;

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "Lclient!ns;")
	public static final Class175 aClass175_2 = new Class175(1);

	@OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
	public static int anInt4237 = 0;

	@OriginalMember(owner = "client!mf", name = "l", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray35 = new String[100];

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BB)V")
	public static void method3337(@OriginalArg(0) byte arg0) {
		if (Static351.aByteArrayArrayArray17 == null) {
			Static351.aByteArrayArrayArray17 = new byte[4][Static333.anInt3375][Static102.anInt2086];
		}
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			for (@Pc(26) int local26 = 0; local26 < Static333.anInt3375; local26++) {
				for (@Pc(30) int local30 = 0; local30 < Static102.anInt2086; local30++) {
					Static351.aByteArrayArrayArray17[local14][local26][local30] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!rm;Lclient!rr;)V")
	public static void method3339(@OriginalArg(0) Class220 arg0, @OriginalArg(1) Class223 arg1) {
		if (!arg1.aBoolean383) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort71;
		@Pc(9) short local9 = arg1.aShort69;
		@Pc(12) byte local12 = arg1.aByte64;
		@Pc(15) byte local15 = arg1.aByte68;
		@Pc(21) int local21 = (local6 << Static168.anInt3026) + Static297.anInt4923;
		@Pc(27) int local27 = (local9 << Static168.anInt3026) + Static297.anInt4923;
		@Pc(31) Class223[][] local31 = Static19.aClass223ArrayArrayArray1[local12];
		@Pc(53) float local53;
		if (Static28.aClass165Array1 == Static244.aClass165Array8) {
			Static268.aClass51_8.GA(Static149.aClass165Array7[0].a(local21, local27), Static284.method714(local6, local9), Static114.method1943(local6, local9), Static310.method4080(local6, local9));
			local53 = 251.5F;
		} else {
			local53 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static268.aClass51_8.g(3000.0F, local53 * 1.5F);
		@Pc(86) Class223 local86;
		@Pc(616) Class28_Sub4 local616;
		@Pc(711) int local711;
		@Pc(714) int local714;
		@Pc(723) int local723;
		@Pc(735) int local735;
		@Pc(406) int local406;
		@Pc(330) boolean local330;
		@Pc(377) Class28_Sub4 local377;
		@Pc(408) int local408;
		@Pc(411) Class26_Sub3 local411;
		@Pc(706) int local706;
		if (arg1.aBoolean384) {
			if (Static429.aBoolean483) {
				if (local12 > 0) {
					local86 = Static19.aClass223ArrayArrayArray1[local12 - 1][local6][local9];
					if (local86 != null && local86.aBoolean383) {
						return;
					}
				}
				if (local6 <= Static408.anInt6461 && local6 > Static16.anInt6421) {
					local86 = local31[local6 - 1][local9];
					if (local86 != null && local86.aBoolean383 && (local86.aBoolean384 || (arg1.aByte69 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static408.anInt6461 && local6 < Static269.anInt4577 - 1) {
					local86 = local31[local6 + 1][local9];
					if (local86 != null && local86.aBoolean383 && (local86.aBoolean384 || (arg1.aByte69 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static72.anInt1379 && local9 > Static98.anInt1989) {
					local86 = local31[local6][local9 - 1];
					if (local86 != null && local86.aBoolean383 && (local86.aBoolean384 || (arg1.aByte69 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static72.anInt1379 && local9 < Static226.anInt3936 - 1) {
					local86 = local31[local6][local9 + 1];
					if (local86 != null && local86.aBoolean383 && (local86.aBoolean384 || (arg1.aByte69 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static429.aBoolean483 = true;
			}
			arg1.aBoolean384 = false;
			if (arg1.aClass223_1 != null) {
				local86 = arg1.aClass223_1;
				Static268.aClass51_8.g(3000.0F, (201.5F - (float) (local86.aByte68 + 1) * 50.0F) * 1.5F);
				if (!Static194.method2806(local86.aByte68, local6, local9)) {
					Static244.aClass165Array8[local86.aByte68].method3581(local6, local9);
				}
				@Pc(249) Class26_Sub3 local249 = local86.aClass26_Sub3_2;
				if (local249 != null) {
					if (Static60.aBoolean67) {
						if ((local249.anInt5724 & arg1.aShort70) == 0) {
							Static208.method2994(arg0, local12, local6, local9);
						} else {
							Static276.method3691(arg0, local249.anInt5724, local15, local6, local9);
						}
						Static268.aClass51_8.method5318(arg0.anInt7289, arg0.aClass7_Sub30Array3);
					}
					local249.method5714(Static268.aClass51_8);
				}
				for (@Pc(286) Class270 local286 = local86.aClass270_1; local286 != null; local286 = local286.aClass270_3) {
					@Pc(290) Class26_Sub2 local290 = local286.aClass26_Sub2_2;
					if (local290 != null) {
						if (Static60.aBoolean67) {
							Static208.method2994(arg0, local12, local6, local9);
							Static268.aClass51_8.method5318(arg0.anInt7289, arg0.aClass7_Sub30Array3);
						}
						local290.method5714(Static268.aClass51_8);
					}
				}
				Static268.aClass51_8.g(3000.0F, local53 * 1.5F);
			}
			local330 = !Static194.method2806(local15, local6, local9);
			if (local330) {
				Static244.aClass165Array8[local15].method3581(local6, local9);
				@Pc(341) Class26_Sub4 local341 = arg1.aClass26_Sub4_2;
				if (local341 != null && local341.aBoolean501) {
					if (local341.aBoolean500) {
						Static268.aClass51_8.g(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static60.aBoolean67) {
						Static208.method2994(arg0, local12, local6, local9);
						Static268.aClass51_8.method5318(arg0.anInt7289, arg0.aClass7_Sub30Array3);
					}
					local377 = local341.method5714(Static268.aClass51_8);
					if (local377 != null) {
						local377.aClass26_1 = local341;
						local377.anInt4315 = local12;
						local377.anInt4314 = local6;
						local377.anInt4312 = local9;
						Static256.aClass169_6.method3603(local377);
					}
					if (local341.aBoolean500) {
						Static268.aClass51_8.g(3000.0F, local53 * 1.5F);
					}
				}
			}
			local406 = 0;
			local408 = 0;
			local411 = arg1.aClass26_Sub3_2;
			@Pc(414) Class26_Sub1 local414 = arg1.aClass26_Sub1_2;
			if (local411 != null || local414 != null) {
				if (Static408.anInt6461 == local6) {
					local406++;
				} else if (Static408.anInt6461 < local6) {
					local406 += 2;
				}
				if (Static72.anInt1379 == local9) {
					local406 += 3;
				} else if (Static72.anInt1379 > local9) {
					local406 += 6;
				}
				local408 = Static97.anIntArray126[local406];
				arg1.aShort70 = Static310.aShortArray93[local406];
			}
			if (local411 != null) {
				if ((local411.anInt5724 & Static325.anIntArray485[local406]) == 0) {
					arg1.aByte67 = 0;
				} else if (local411.anInt5724 == 16) {
					arg1.aByte67 = 3;
					arg1.aByte65 = Static380.aByteArray69[local406];
					arg1.aByte66 = (byte) (3 - arg1.aByte65);
				} else if (local411.anInt5724 == 32) {
					arg1.aByte67 = 6;
					arg1.aByte65 = Static13.aByteArray6[local406];
					arg1.aByte66 = (byte) (6 - arg1.aByte65);
				} else if (local411.anInt5724 == 64) {
					arg1.aByte67 = 12;
					arg1.aByte65 = Static32.aByteArray8[local406];
					arg1.aByte66 = (byte) (12 - arg1.aByte65);
				} else {
					arg1.aByte67 = 9;
					arg1.aByte65 = Static106.aByteArray26[local406];
					arg1.aByte66 = (byte) (9 - arg1.aByte65);
				}
				if ((local411.anInt5724 & local408) != 0 && !Static384.method5652(local15, local6, local9, local411.anInt5724)) {
					if (Static60.aBoolean67) {
						Static208.method2994(arg0, local12, local6, local9);
						Static268.aClass51_8.method5318(arg0.anInt7289, arg0.aClass7_Sub30Array3);
					}
					@Pc(563) Class28_Sub4 local563 = local411.method5714(Static268.aClass51_8);
					if (local563 != null) {
						local563.aClass26_1 = local411;
						local563.anInt4315 = local12;
						local563.anInt4314 = local6;
						local563.anInt4312 = local9;
						Static256.aClass169_6.method3603(local563);
					}
				}
				@Pc(584) Class26_Sub3 local584 = arg1.aClass26_Sub3_1;
				if (local584 != null && (local584.anInt5724 & local408) != 0 && !Static384.method5652(local15, local6, local9, local584.anInt5724)) {
					if (Static60.aBoolean67) {
						Static208.method2994(arg0, local12, local6, local9);
						Static268.aClass51_8.method5318(arg0.anInt7289, arg0.aClass7_Sub30Array3);
					}
					local616 = local584.method5714(Static268.aClass51_8);
					if (local616 != null) {
						local616.aClass26_1 = local584;
						local616.anInt4315 = local12;
						local616.anInt4314 = local6;
						local616.anInt4312 = local9;
						Static256.aClass169_6.method3603(local616);
					}
				}
			}
			if (local414 != null && !Static379.method4649(local15, local6, local9, local414.method5551())) {
				@Pc(647) Class26_Sub1 local647 = arg1.aClass26_Sub1_1;
				Static268.aClass51_8.g(3000.0F, (local53 - 0.5F) * 1.5F);
				if ((local414.anInt7177 & local408) != 0) {
					if (Static60.aBoolean67) {
						Static208.method2994(arg0, local12, local6, local9);
						Static268.aClass51_8.method5318(arg0.anInt7289, arg0.aClass7_Sub30Array3);
					}
					local616 = local414.method5714(Static268.aClass51_8);
					if (local616 != null) {
						local616.aClass26_1 = local414;
						local616.anInt4315 = local12;
						local616.anInt4314 = local6;
						local616.anInt4312 = local9;
						Static256.aClass169_6.method3603(local616);
					}
				} else if (local414.anInt7177 == 256) {
					local706 = local414.anInt7180 - Static279.anInt7421;
					local711 = local414.anInt7181 - Static432.anInt7276;
					local714 = local414.anInt7173;
					if (local714 == 1 || local714 == 2) {
						local723 = -local706;
					} else {
						local723 = local706;
					}
					if (local714 == 2 || local714 == 3) {
						local735 = -local711;
					} else {
						local735 = local711;
					}
					if (Static60.aBoolean67) {
						Static208.method2994(arg0, local12, local6, local9);
						Static268.aClass51_8.method5318(arg0.anInt7289, arg0.aClass7_Sub30Array3);
					}
					@Pc(759) Class28_Sub4 local759;
					if (local735 < local723) {
						local759 = local414.method5714(Static268.aClass51_8);
						if (local759 != null) {
							local759.aClass26_1 = local414;
							local759.anInt4315 = local12;
							local759.anInt4314 = local6;
							local759.anInt4312 = local9;
							Static256.aClass169_6.method3603(local759);
						}
					} else if (local647 != null) {
						local759 = local647.method5714(Static268.aClass51_8);
						if (local759 != null) {
							local759.aClass26_1 = local647;
							local759.anInt4315 = local12;
							local759.anInt4314 = local6;
							local759.anInt4312 = local9;
							Static256.aClass169_6.method3603(local759);
						}
					}
				}
				Static268.aClass51_8.g(3000.0F, local53 * 1.5F);
			}
			if (local330) {
				@Pc(814) Class26_Sub4 local814 = arg1.aClass26_Sub4_2;
				if (local814 != null && !local814.aBoolean501) {
					if (local814.aBoolean500) {
						Static268.aClass51_8.g(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static60.aBoolean67) {
						Static208.method2994(arg0, local12, local6, local9);
						Static268.aClass51_8.method5318(arg0.anInt7289, arg0.aClass7_Sub30Array3);
					}
					local616 = local814.method5714(Static268.aClass51_8);
					if (local616 != null) {
						local616.aClass26_1 = local814;
						local616.anInt4315 = local12;
						local616.anInt4314 = local6;
						local616.anInt4312 = local9;
						Static256.aClass169_6.method3603(local616);
					}
					if (local814.aBoolean500) {
						Static268.aClass51_8.g(3000.0F, local53 * 1.5F);
					}
				}
				@Pc(880) Class26_Sub5 local880 = arg1.aClass26_Sub5_1;
				if (local880 != null && !local880.aBoolean256) {
					if (Static60.aBoolean67) {
						Static208.method2994(arg0, local12, local6, local9);
						Static268.aClass51_8.method5318(arg0.anInt7289, arg0.aClass7_Sub30Array3);
					}
					@Pc(903) Class28_Sub4 local903 = local880.method5714(Static268.aClass51_8);
					if (local903 != null) {
						local903.aClass26_1 = local880;
						local903.anInt4315 = local12;
						local903.anInt4314 = local6;
						local903.anInt4312 = local9;
						Static256.aClass169_6.method3603(local903);
					}
				}
			}
			@Pc(924) byte local924 = arg1.aByte69;
			if (local924 != 0) {
				@Pc(941) Class223 local941;
				if (local6 < Static408.anInt6461 && (local924 & 0x4) != 0) {
					local941 = local31[local6 + 1][local9];
					if (local941 != null && local941.aBoolean383) {
						Static223.aClass92_1.method3220(local941);
					}
				}
				if (local9 < Static72.anInt1379 && (local924 & 0x2) != 0) {
					local941 = local31[local6][local9 + 1];
					if (local941 != null && local941.aBoolean383) {
						Static223.aClass92_1.method3220(local941);
					}
				}
				if (local6 > Static408.anInt6461 && (local924 & 0x1) != 0) {
					local941 = local31[local6 - 1][local9];
					if (local941 != null && local941.aBoolean383) {
						Static223.aClass92_1.method3220(local941);
					}
				}
				if (local9 > Static72.anInt1379 && (local924 & 0x8) != 0) {
					local941 = local31[local6][local9 - 1];
					if (local941 != null && local941.aBoolean383) {
						Static223.aClass92_1.method3220(local941);
					}
				}
			}
		}
		@Pc(1074) int local1074;
		@Pc(1057) Class26_Sub3 local1057;
		@Pc(1078) int local1078;
		@Pc(1030) Class270 local1030;
		if (arg1.aByte67 != 0) {
			local330 = true;
			for (local1030 = arg1.aClass270_1; local1030 != null; local1030 = local1030.aClass270_3) {
				if (local1030.aClass26_Sub2_2.anInt7385 != Static226.anInt3951 && (local1030.anInt7523 & arg1.aByte67) == arg1.aByte65) {
					local330 = false;
					break;
				}
			}
			if (local330) {
				local1057 = arg1.aClass26_Sub3_2;
				if (!Static384.method5652(local15, local6, local9, local1057.anInt5724)) {
					if (Static60.aBoolean67) {
						label682: {
							if (local1057.anInt5724 >= 16) {
								local1074 = local6 - Static408.anInt6461;
								local1078 = local9 - Static72.anInt1379;
								if (local1057.anInt5724 == 16) {
									local1074 -= Static297.anInt4923;
									local1078 += Static297.anInt4923;
									if (local1078 < local1074 && local6 > 0 && local9 <= Static295.anInt4910) {
										Static208.method2994(arg0, local12, local6 - 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt5724 == 32) {
									local1074 += Static297.anInt4923;
									local1078 += Static297.anInt4923;
									if (local1078 < -local1074 && local6 < Static264.anInt4480 && local9 < Static295.anInt4910) {
										Static208.method2994(arg0, local12, local6 + 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt5724 == 64) {
									local1074 += Static297.anInt4923;
									local1078 -= Static297.anInt4923;
									if (local1078 > local1074 && local6 < Static264.anInt4480 && local9 > 0) {
										Static208.method2994(arg0, local12, local6 + 1, local9 - 1);
										break label682;
									}
								} else if (local1057.anInt5724 == 128) {
									local1074 -= Static297.anInt4923;
									local1078 -= Static297.anInt4923;
									if (local1078 > -local1074 && local6 > 0 && local9 > 0) {
										Static208.method2994(arg0, local12, local6 - 1, local9 - 1);
										break label682;
									}
								}
							}
							Static208.method2994(arg0, local12, local6, local9);
						}
						Static268.aClass51_8.method5318(arg0.anInt7289, arg0.aClass7_Sub30Array3);
					}
					@Pc(1216) Class28_Sub4 local1216 = local1057.method5714(Static268.aClass51_8);
					if (local1216 != null) {
						local1216.aClass26_1 = local1057;
						local1216.anInt4315 = local12;
						local1216.anInt4314 = local6;
						local1216.anInt4312 = local9;
						Static256.aClass169_6.method3603(local1216);
					}
				}
				arg1.aByte67 = 0;
			}
		}
		@Pc(1333) int local1333;
		if (arg1.aBoolean382) {
			try {
				arg1.aBoolean382 = false;
				@Pc(1245) int local1245 = 0;
				label625: for (local1030 = arg1.aClass270_1; local1030 != null; local1030 = local1030.aClass270_3) {
					@Pc(1252) Class26_Sub2 local1252 = local1030.aClass26_Sub2_2;
					if (local1252.anInt7385 != Static226.anInt3951) {
						for (local1074 = local1252.aShort105; local1074 <= local1252.aShort104; local1074++) {
							for (local1078 = local1252.aShort103; local1078 <= local1252.aShort102; local1078++) {
								@Pc(1270) Class223 local1270 = local31[local1074][local1078];
								if (local1270.aBoolean384) {
									arg1.aBoolean382 = true;
									continue label625;
								}
								if (local1270.aByte67 != 0) {
									local706 = 0;
									if (local1074 > local1252.aShort105) {
										local706++;
									}
									if (local1074 < local1252.aShort104) {
										local706 += 4;
									}
									if (local1078 > local1252.aShort103) {
										local706 += 8;
									}
									if (local1078 < local1252.aShort102) {
										local706 += 2;
									}
									if ((local706 & local1270.aByte67) == arg1.aByte66) {
										arg1.aBoolean382 = true;
										continue label625;
									}
								}
							}
						}
						local1078 = Static408.anInt6461 - local1252.aShort105;
						local1333 = local1252.aShort104 - Static408.anInt6461;
						if (local1333 > local1078) {
							local1078 = local1333;
						}
						local706 = Static72.anInt1379 - local1252.aShort103;
						local711 = local1252.aShort102 - Static72.anInt1379;
						if (local711 > local706) {
							local706 = local711;
						}
						arg0.aClass26_Sub2Array3[local1245] = local1252;
						arg0.anIntArray612[local1245++] = local1078 + local706;
					}
				}
				while (local1245 > 0) {
					local408 = -50;
					local1074 = -1;
					@Pc(1384) Class26_Sub2 local1384;
					for (local1078 = 0; local1078 < local1245; local1078++) {
						local1384 = arg0.aClass26_Sub2Array3[local1078];
						if (local1384.anInt7385 != Static226.anInt3951) {
							local706 = arg0.anIntArray612[local1078];
							if (local706 > local408) {
								local408 = local706;
								local1074 = local1078;
							} else if (local706 == local408) {
								local711 = local1384.anInt7388 - Static279.anInt7421;
								local714 = local1384.anInt7383 - Static432.anInt7276;
								local723 = arg0.aClass26_Sub2Array3[local1074].anInt7388 - Static279.anInt7421;
								local735 = arg0.aClass26_Sub2Array3[local1074].anInt7383 - Static432.anInt7276;
								if (local711 * local711 + local714 * local714 > local723 * local723 + local735 * local735) {
									local1074 = local1078;
								}
							}
						}
					}
					if (local1074 == -1) {
						break;
					}
					local1384 = arg0.aClass26_Sub2Array3[local1074];
					local1384.anInt7385 = Static226.anInt3951;
					if (!Static321.method4248(local15, local1384.aShort105, local1384.aShort104, local1384.aShort103, local1384.aShort102, local1384.method5695())) {
						if (Static60.aBoolean67) {
							if (local1384.aByte101 == 0) {
								Static220.method3097(arg0, local12, local1384.aShort105, local1384.aShort103, local1384.aShort104, local1384.aShort102);
							} else {
								Static208.method2994(arg0, local12, local6, local9);
								local706 = local6 - Static408.anInt6461;
								local711 = local9 - Static72.anInt1379;
								if (local1384.aByte101 == 2) {
									if (local711 > -local706) {
										Static346.method4464(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static346.method4464(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local711 > local706) {
									Static346.method4464(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static346.method4464(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static268.aClass51_8.method5318(arg0.anInt7289, arg0.aClass7_Sub30Array3);
						}
						local616 = local1384.method5714(Static268.aClass51_8);
						if (local616 != null) {
							local616.aClass26_1 = local1384;
							local616.anInt4315 = local12;
							local616.anInt4314 = local1384.aShort105;
							local616.anInt4312 = local1384.aShort103;
							Static256.aClass169_6.method3603(local616);
						}
					}
					for (local706 = local1384.aShort105; local706 <= local1384.aShort104; local706++) {
						for (local711 = local1384.aShort103; local711 <= local1384.aShort102; local711++) {
							@Pc(1609) Class223 local1609 = local31[local706][local711];
							if (local1609.aByte67 != 0) {
								Static223.aClass92_1.method3220(local1609);
							} else if ((local706 != local6 || local711 != local9) && local1609.aBoolean383) {
								Static223.aClass92_1.method3220(local1609);
							}
						}
					}
				}
				if (arg1.aBoolean382) {
					return;
				}
			} catch (@Pc(1647) Exception local1647) {
				arg1.aBoolean382 = false;
			}
		}
		if (arg1.aClass201_2 != null && arg1.aByte70 == (byte) (Static189.anInt5375 & 0xFF)) {
			@Pc(1664) Class201 local1664 = arg1.aClass201_2;
			local406 = Static244.aClass165Array8[local12].l(local6, local9);
			if (local12 < Static315.anInt5183 - 1) {
				local408 = Static244.aClass165Array8[local12].l(local6, local9) - Static244.aClass165Array8[local12 + 1].l(local6, local9);
			} else {
				local408 = 0x8 << Static168.anInt3026;
			}
			Static16.aClass33_10.method2436(local21, local406, local27, arg0.anIntArray613);
			local1074 = arg0.anIntArray613[2];
			Static16.aClass33_10.method2436(local21, local406 - local408, local27, arg0.anIntArray613);
			local1078 = arg0.anIntArray613[2];
			local1333 = local1074;
			local706 = local1078;
			if (local1074 > local1078) {
				local1333 = local1078;
				local706 = local1074;
			}
			local1333 -= Static225.anInt4946;
			local706 += Static225.anInt4946;
			local1664.anInt5203 = local1333;
			local1664.anInt5204 = local706;
			local1664.aBoolean333 = true;
			Static268.aClass51_8.method5311(local1664);
		}
		if (!arg1.aBoolean383) {
			return;
		}
		if (arg1.aByte67 != 0) {
			return;
		}
		if (local6 <= Static408.anInt6461 && local6 > Static16.anInt6421) {
			local86 = local31[local6 - 1][local9];
			if (local86 != null && local86.aBoolean383) {
				return;
			}
		}
		if (local6 >= Static408.anInt6461 && local6 < Static269.anInt4577 - 1) {
			local86 = local31[local6 + 1][local9];
			if (local86 != null && local86.aBoolean383) {
				return;
			}
		}
		if (local9 <= Static72.anInt1379 && local9 > Static98.anInt1989) {
			local86 = local31[local6][local9 - 1];
			if (local86 != null && local86.aBoolean383) {
				return;
			}
		}
		if (local9 >= Static72.anInt1379 && local9 < Static226.anInt3936 - 1) {
			local86 = local31[local6][local9 + 1];
			if (local86 != null && local86.aBoolean383) {
				return;
			}
		}
		arg1.aBoolean383 = false;
		Static69.anInt1360--;
		@Pc(1855) Class26_Sub5 local1855 = arg1.aClass26_Sub5_1;
		if (local1855 != null && local1855.aBoolean256) {
			if (Static60.aBoolean67) {
				Static208.method2994(arg0, local12, local6, local9);
				Static268.aClass51_8.method5318(arg0.anInt7289, arg0.aClass7_Sub30Array3);
			}
			@Pc(1878) Class28_Sub4 local1878 = local1855.method5714(Static268.aClass51_8);
			if (local1878 != null) {
				local1878.aClass26_1 = local1855;
				local1878.anInt4315 = local12;
				local1878.anInt4314 = local6;
				local1878.anInt4312 = local9;
				Static256.aClass169_6.method3603(local1878);
			}
		}
		if (arg1.aShort70 != 0) {
			@Pc(1902) Class26_Sub1 local1902 = arg1.aClass26_Sub1_2;
			if (local1902 != null && !Static379.method4649(local15, local6, local9, local1902.method5551())) {
				if ((local1902.anInt7177 & arg1.aShort70) != 0) {
					if (Static60.aBoolean67) {
						Static208.method2994(arg0, local12, local6, local9);
						Static268.aClass51_8.method5318(arg0.anInt7289, arg0.aClass7_Sub30Array3);
					}
					local377 = local1902.method5714(Static268.aClass51_8);
					if (local377 != null) {
						local377.aClass26_1 = local1902;
						local377.anInt4315 = local12;
						local377.anInt4314 = local6;
						local377.anInt4312 = local9;
						Static256.aClass169_6.method3603(local377);
					}
				} else if (local1902.anInt7177 == 256) {
					local408 = local1902.anInt7180 - Static279.anInt7421;
					local1074 = local1902.anInt7181 - Static432.anInt7276;
					local1078 = local1902.anInt7173;
					if (local1078 == 1 || local1078 == 2) {
						local1333 = -local408;
					} else {
						local1333 = local408;
					}
					if (local1078 == 2 || local1078 == 3) {
						local706 = -local1074;
					} else {
						local706 = local1074;
					}
					if (Static60.aBoolean67) {
						Static208.method2994(arg0, local12, local6, local9);
						Static268.aClass51_8.method5318(arg0.anInt7289, arg0.aClass7_Sub30Array3);
					}
					@Pc(2012) Class26_Sub1 local2012 = arg1.aClass26_Sub1_1;
					@Pc(2020) Class28_Sub4 local2020;
					if (local706 > local1333) {
						local2020 = local1902.method5714(Static268.aClass51_8);
						if (local2020 != null) {
							local2020.aClass26_1 = local1902;
							local2020.anInt4315 = local12;
							local2020.anInt4314 = local6;
							local2020.anInt4312 = local9;
							Static256.aClass169_6.method3603(local2020);
						}
					} else if (local2012 != null) {
						local2020 = local2012.method5714(Static268.aClass51_8);
						if (local2020 != null) {
							local2020.aClass26_1 = local2012;
							local2020.anInt4315 = local12;
							local2020.anInt4314 = local6;
							local2020.anInt4312 = local9;
							Static256.aClass169_6.method3603(local2020);
						}
					}
				}
			}
			local1057 = arg1.aClass26_Sub3_2;
			local411 = arg1.aClass26_Sub3_1;
			@Pc(2105) Class28_Sub4 local2105;
			if (local411 != null && (local411.anInt5724 & arg1.aShort70) != 0 && !Static384.method5652(local15, local6, local9, local411.anInt5724)) {
				if (Static60.aBoolean67) {
					Static276.method3691(arg0, local411.anInt5724, local12, local6, local9);
					Static268.aClass51_8.method5318(arg0.anInt7289, arg0.aClass7_Sub30Array3);
				}
				local2105 = local411.method5714(Static268.aClass51_8);
				if (local2105 != null) {
					local2105.aClass26_1 = local411;
					local2105.anInt4315 = local12;
					local2105.anInt4314 = local6;
					local2105.anInt4312 = local9;
					Static256.aClass169_6.method3603(local2105);
				}
			}
			if (local1057 != null && (local1057.anInt5724 & arg1.aShort70) != 0 && !Static384.method5652(local15, local6, local9, local1057.anInt5724)) {
				if (Static60.aBoolean67) {
					Static276.method3691(arg0, local1057.anInt5724, local12, local6, local9);
					Static268.aClass51_8.method5318(arg0.anInt7289, arg0.aClass7_Sub30Array3);
				}
				local2105 = local1057.method5714(Static268.aClass51_8);
				if (local2105 != null) {
					local2105.aClass26_1 = local1057;
					local2105.anInt4315 = local12;
					local2105.anInt4314 = local6;
					local2105.anInt4312 = local9;
					Static256.aClass169_6.method3603(local2105);
				}
			}
		}
		@Pc(2191) Class223 local2191;
		if (local12 < Static315.anInt5183 - 1) {
			local2191 = Static19.aClass223ArrayArrayArray1[local12 + 1][local6][local9];
			if (local2191 != null && local2191.aBoolean383) {
				Static223.aClass92_1.method3214(local2191);
			}
		}
		if (local6 < Static408.anInt6461) {
			local2191 = local31[local6 + 1][local9];
			if (local2191 != null && local2191.aBoolean383) {
				Static223.aClass92_1.method3220(local2191);
			}
		}
		if (local9 < Static72.anInt1379) {
			local2191 = local31[local6][local9 + 1];
			if (local2191 != null && local2191.aBoolean383) {
				Static223.aClass92_1.method3220(local2191);
			}
		}
		if (local6 > Static408.anInt6461) {
			local2191 = local31[local6 - 1][local9];
			if (local2191 != null && local2191.aBoolean383) {
				Static223.aClass92_1.method3220(local2191);
			}
		}
		if (local9 > Static72.anInt1379) {
			local2191 = local31[local6][local9 - 1];
			if (local2191 != null && local2191.aBoolean383) {
				Static223.aClass92_1.method3220(local2191);
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIBIII)V")
	public static void method3343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(13) int local13 = arg2 * arg2;
		@Pc(17) int local17 = arg1 * arg1;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg1 << 1;
		@Pc(37) int local37 = local21 + local13 * (1 - local29);
		@Pc(46) int local46 = local17 - (local29 - 1) * local25;
		@Pc(50) int local50 = local13 << 2;
		@Pc(59) int local59 = local17 << 2;
		@Pc(67) int local67 = local21 * 3;
		@Pc(75) int local75 = local25 * ((arg1 << 1) - 3);
		@Pc(81) int local81 = local59;
		Static404.method5769(Static353.anIntArrayArray48[arg0], arg3 - arg2, arg2 + arg3, arg4);
		@Pc(99) int local99 = (arg1 - 1) * local50;
		while (local9 > 0) {
			if (local37 < 0) {
				while (local37 < 0) {
					local37 += local67;
					local46 += local81;
					local67 += local59;
					local7++;
					local81 += local59;
				}
			}
			if (local46 < 0) {
				local37 += local67;
				local46 += local81;
				local81 += local59;
				local7++;
				local67 += local59;
			}
			local37 += -local99;
			local46 += -local75;
			local9--;
			local99 -= local50;
			local75 -= local50;
			@Pc(173) int local173 = arg0 - local9;
			@Pc(177) int local177 = local9 + arg0;
			@Pc(181) int local181 = local7 + arg3;
			@Pc(186) int local186 = arg3 - local7;
			Static404.method5769(Static353.anIntArrayArray48[local173], local186, local181, arg4);
			Static404.method5769(Static353.anIntArrayArray48[local177], local186, local181, arg4);
		}
	}
}
