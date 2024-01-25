import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "Lclient!kp;")
	public static Class151 aClass151_1;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray6 = new String[5];

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray12 = new int[128][128];

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!vh;Lclient!ev;)V")
	public static void method679(@OriginalArg(0) Class184 arg0, @OriginalArg(1) Class75 arg1) {
		if (!arg1.aBoolean128) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort30;
		@Pc(9) short local9 = arg1.aShort31;
		@Pc(12) byte local12 = arg1.aByte30;
		@Pc(15) byte local15 = arg1.aByte29;
		@Pc(21) int local21 = (local6 << Static145.anInt2581) + Static390.anInt7654;
		@Pc(27) int local27 = (local9 << Static145.anInt2581) + Static390.anInt7654;
		@Pc(31) Class75[][] local31 = Static432.aClass75ArrayArrayArray6[local12];
		@Pc(53) float local53;
		if (Static169.aClass41Array1 == Static278.aClass41Array3) {
			Static323.aClass135_12.GA(Static228.aClass41Array2[0].a(local21, local27), Static224.method3039(local6, local9), Static161.method2285(local6, local9), Static70.method1168(local6, local9));
			local53 = 251.5F;
		} else {
			local53 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static323.aClass135_12.g(3000.0F, local53 * 1.5F);
		@Pc(86) Class75 local86;
		@Pc(616) Class20_Sub5 local616;
		@Pc(711) int local711;
		@Pc(714) int local714;
		@Pc(723) int local723;
		@Pc(735) int local735;
		@Pc(406) int local406;
		@Pc(330) boolean local330;
		@Pc(377) Class20_Sub5 local377;
		@Pc(408) int local408;
		@Pc(411) Class8_Sub2 local411;
		@Pc(706) int local706;
		if (arg1.aBoolean129) {
			if (Static96.aBoolean121) {
				if (local12 > 0) {
					local86 = Static432.aClass75ArrayArrayArray6[local12 - 1][local6][local9];
					if (local86 != null && local86.aBoolean128) {
						return;
					}
				}
				if (local6 <= Static32.anInt531 && local6 > Static288.anInt4749) {
					local86 = local31[local6 - 1][local9];
					if (local86 != null && local86.aBoolean128 && (local86.aBoolean129 || (arg1.aByte25 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static32.anInt531 && local6 < Static333.anInt5438 - 1) {
					local86 = local31[local6 + 1][local9];
					if (local86 != null && local86.aBoolean128 && (local86.aBoolean129 || (arg1.aByte25 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static150.anInt2733 && local9 > Static431.anInt7346) {
					local86 = local31[local6][local9 - 1];
					if (local86 != null && local86.aBoolean128 && (local86.aBoolean129 || (arg1.aByte25 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static150.anInt2733 && local9 < Static217.anInt7222 - 1) {
					local86 = local31[local6][local9 + 1];
					if (local86 != null && local86.aBoolean128 && (local86.aBoolean129 || (arg1.aByte25 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static96.aBoolean121 = true;
			}
			arg1.aBoolean129 = false;
			if (arg1.aClass75_1 != null) {
				local86 = arg1.aClass75_1;
				Static323.aClass135_12.g(3000.0F, (201.5F - (float) (local86.aByte29 + 1) * 50.0F) * 1.5F);
				if (!Static337.method4459(local86.aByte29, local6, local9)) {
					Static278.aClass41Array3[local86.aByte29].method5560(local6, local9);
				}
				@Pc(249) Class8_Sub2 local249 = local86.aClass8_Sub2_1;
				if (local249 != null) {
					if (Static299.aBoolean357) {
						if ((local249.anInt5215 & arg1.aShort32) == 0) {
							Static371.method4765(arg0, local12, local6, local9);
						} else {
							Static104.method1549(arg0, local249.anInt5215, local15, local6, local9);
						}
						Static323.aClass135_12.method5359(arg0.anInt4551, arg0.aClass4_Sub7Array2);
					}
					local249.method5880(Static323.aClass135_12);
				}
				for (@Pc(286) Class251 local286 = local86.aClass251_2; local286 != null; local286 = local286.aClass251_3) {
					@Pc(290) Class8_Sub3 local290 = local286.aClass8_Sub3_2;
					if (local290 != null) {
						if (Static299.aBoolean357) {
							Static371.method4765(arg0, local12, local6, local9);
							Static323.aClass135_12.method5359(arg0.anInt4551, arg0.aClass4_Sub7Array2);
						}
						local290.method5880(Static323.aClass135_12);
					}
				}
				Static323.aClass135_12.g(3000.0F, local53 * 1.5F);
			}
			local330 = !Static337.method4459(local15, local6, local9);
			if (local330) {
				Static278.aClass41Array3[local15].method5560(local6, local9);
				@Pc(341) Class8_Sub4 local341 = arg1.aClass8_Sub4_1;
				if (local341 != null && local341.aBoolean485) {
					if (local341.aBoolean486) {
						Static323.aClass135_12.g(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static299.aBoolean357) {
						Static371.method4765(arg0, local12, local6, local9);
						Static323.aClass135_12.method5359(arg0.anInt4551, arg0.aClass4_Sub7Array2);
					}
					local377 = local341.method5880(Static323.aClass135_12);
					if (local377 != null) {
						local377.aClass8_1 = local341;
						local377.anInt3903 = local12;
						local377.anInt3908 = local6;
						local377.anInt3906 = local9;
						Static301.aClass248_6.method5585(local377);
					}
					if (local341.aBoolean486) {
						Static323.aClass135_12.g(3000.0F, local53 * 1.5F);
					}
				}
			}
			local406 = 0;
			local408 = 0;
			local411 = arg1.aClass8_Sub2_1;
			@Pc(414) Class8_Sub5 local414 = arg1.aClass8_Sub5_2;
			if (local411 != null || local414 != null) {
				if (Static32.anInt531 == local6) {
					local406++;
				} else if (Static32.anInt531 < local6) {
					local406 += 2;
				}
				if (Static150.anInt2733 == local9) {
					local406 += 3;
				} else if (Static150.anInt2733 > local9) {
					local406 += 6;
				}
				local408 = Static405.anIntArray517[local406];
				arg1.aShort32 = Static96.aShortArray16[local406];
			}
			if (local411 != null) {
				if ((local411.anInt5215 & Static103.anIntArray143[local406]) == 0) {
					arg1.aByte28 = 0;
				} else if (local411.anInt5215 == 16) {
					arg1.aByte28 = 3;
					arg1.aByte26 = Static143.aByteArray20[local406];
					arg1.aByte31 = (byte) (3 - arg1.aByte26);
				} else if (local411.anInt5215 == 32) {
					arg1.aByte28 = 6;
					arg1.aByte26 = Static175.aByteArray33[local406];
					arg1.aByte31 = (byte) (6 - arg1.aByte26);
				} else if (local411.anInt5215 == 64) {
					arg1.aByte28 = 12;
					arg1.aByte26 = Static432.aByteArray86[local406];
					arg1.aByte31 = (byte) (12 - arg1.aByte26);
				} else {
					arg1.aByte28 = 9;
					arg1.aByte26 = Static35.aByteArray2[local406];
					arg1.aByte31 = (byte) (9 - arg1.aByte26);
				}
				if ((local411.anInt5215 & local408) != 0 && !Static134.method1949(local15, local6, local9, local411.anInt5215)) {
					if (Static299.aBoolean357) {
						Static371.method4765(arg0, local12, local6, local9);
						Static323.aClass135_12.method5359(arg0.anInt4551, arg0.aClass4_Sub7Array2);
					}
					@Pc(563) Class20_Sub5 local563 = local411.method5880(Static323.aClass135_12);
					if (local563 != null) {
						local563.aClass8_1 = local411;
						local563.anInt3903 = local12;
						local563.anInt3908 = local6;
						local563.anInt3906 = local9;
						Static301.aClass248_6.method5585(local563);
					}
				}
				@Pc(584) Class8_Sub2 local584 = arg1.aClass8_Sub2_2;
				if (local584 != null && (local584.anInt5215 & local408) != 0 && !Static134.method1949(local15, local6, local9, local584.anInt5215)) {
					if (Static299.aBoolean357) {
						Static371.method4765(arg0, local12, local6, local9);
						Static323.aClass135_12.method5359(arg0.anInt4551, arg0.aClass4_Sub7Array2);
					}
					local616 = local584.method5880(Static323.aClass135_12);
					if (local616 != null) {
						local616.aClass8_1 = local584;
						local616.anInt3903 = local12;
						local616.anInt3908 = local6;
						local616.anInt3906 = local9;
						Static301.aClass248_6.method5585(local616);
					}
				}
			}
			if (local414 != null && !Static106.method1585(local15, local6, local9, local414.method4114())) {
				@Pc(647) Class8_Sub5 local647 = arg1.aClass8_Sub5_1;
				Static323.aClass135_12.g(3000.0F, (local53 - 0.5F) * 1.5F);
				if ((local414.anInt5126 & local408) != 0) {
					if (Static299.aBoolean357) {
						Static371.method4765(arg0, local12, local6, local9);
						Static323.aClass135_12.method5359(arg0.anInt4551, arg0.aClass4_Sub7Array2);
					}
					local616 = local414.method5880(Static323.aClass135_12);
					if (local616 != null) {
						local616.aClass8_1 = local414;
						local616.anInt3903 = local12;
						local616.anInt3908 = local6;
						local616.anInt3906 = local9;
						Static301.aClass248_6.method5585(local616);
					}
				} else if (local414.anInt5126 == 256) {
					local706 = local414.anInt5128 - Static35.anInt570;
					local711 = local414.anInt5133 - Static70.anInt1418;
					local714 = local414.anInt5132;
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
					if (Static299.aBoolean357) {
						Static371.method4765(arg0, local12, local6, local9);
						Static323.aClass135_12.method5359(arg0.anInt4551, arg0.aClass4_Sub7Array2);
					}
					@Pc(759) Class20_Sub5 local759;
					if (local735 < local723) {
						local759 = local414.method5880(Static323.aClass135_12);
						if (local759 != null) {
							local759.aClass8_1 = local414;
							local759.anInt3903 = local12;
							local759.anInt3908 = local6;
							local759.anInt3906 = local9;
							Static301.aClass248_6.method5585(local759);
						}
					} else if (local647 != null) {
						local759 = local647.method5880(Static323.aClass135_12);
						if (local759 != null) {
							local759.aClass8_1 = local647;
							local759.anInt3903 = local12;
							local759.anInt3908 = local6;
							local759.anInt3906 = local9;
							Static301.aClass248_6.method5585(local759);
						}
					}
				}
				Static323.aClass135_12.g(3000.0F, local53 * 1.5F);
			}
			if (local330) {
				@Pc(814) Class8_Sub4 local814 = arg1.aClass8_Sub4_1;
				if (local814 != null && !local814.aBoolean485) {
					if (local814.aBoolean486) {
						Static323.aClass135_12.g(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static299.aBoolean357) {
						Static371.method4765(arg0, local12, local6, local9);
						Static323.aClass135_12.method5359(arg0.anInt4551, arg0.aClass4_Sub7Array2);
					}
					local616 = local814.method5880(Static323.aClass135_12);
					if (local616 != null) {
						local616.aClass8_1 = local814;
						local616.anInt3903 = local12;
						local616.anInt3908 = local6;
						local616.anInt3906 = local9;
						Static301.aClass248_6.method5585(local616);
					}
					if (local814.aBoolean486) {
						Static323.aClass135_12.g(3000.0F, local53 * 1.5F);
					}
				}
				@Pc(880) Class8_Sub1 local880 = arg1.aClass8_Sub1_1;
				if (local880 != null && !local880.aBoolean360) {
					if (Static299.aBoolean357) {
						Static371.method4765(arg0, local12, local6, local9);
						Static323.aClass135_12.method5359(arg0.anInt4551, arg0.aClass4_Sub7Array2);
					}
					@Pc(903) Class20_Sub5 local903 = local880.method5880(Static323.aClass135_12);
					if (local903 != null) {
						local903.aClass8_1 = local880;
						local903.anInt3903 = local12;
						local903.anInt3908 = local6;
						local903.anInt3906 = local9;
						Static301.aClass248_6.method5585(local903);
					}
				}
			}
			@Pc(924) byte local924 = arg1.aByte25;
			if (local924 != 0) {
				@Pc(941) Class75 local941;
				if (local6 < Static32.anInt531 && (local924 & 0x4) != 0) {
					local941 = local31[local6 + 1][local9];
					if (local941 != null && local941.aBoolean128) {
						Static146.aClass28_1.method4501(local941);
					}
				}
				if (local9 < Static150.anInt2733 && (local924 & 0x2) != 0) {
					local941 = local31[local6][local9 + 1];
					if (local941 != null && local941.aBoolean128) {
						Static146.aClass28_1.method4501(local941);
					}
				}
				if (local6 > Static32.anInt531 && (local924 & 0x1) != 0) {
					local941 = local31[local6 - 1][local9];
					if (local941 != null && local941.aBoolean128) {
						Static146.aClass28_1.method4501(local941);
					}
				}
				if (local9 > Static150.anInt2733 && (local924 & 0x8) != 0) {
					local941 = local31[local6][local9 - 1];
					if (local941 != null && local941.aBoolean128) {
						Static146.aClass28_1.method4501(local941);
					}
				}
			}
		}
		@Pc(1074) int local1074;
		@Pc(1057) Class8_Sub2 local1057;
		@Pc(1078) int local1078;
		@Pc(1030) Class251 local1030;
		if (arg1.aByte28 != 0) {
			local330 = true;
			for (local1030 = arg1.aClass251_2; local1030 != null; local1030 = local1030.aClass251_3) {
				if (local1030.aClass8_Sub3_2.anInt7342 != Static125.anInt2196 && (local1030.anInt7018 & arg1.aByte28) == arg1.aByte26) {
					local330 = false;
					break;
				}
			}
			if (local330) {
				local1057 = arg1.aClass8_Sub2_1;
				if (!Static134.method1949(local15, local6, local9, local1057.anInt5215)) {
					if (Static299.aBoolean357) {
						label682: {
							if (local1057.anInt5215 >= 16) {
								local1074 = local6 - Static32.anInt531;
								local1078 = local9 - Static150.anInt2733;
								if (local1057.anInt5215 == 16) {
									local1074 -= Static390.anInt7654;
									local1078 += Static390.anInt7654;
									if (local1078 < local1074 && local6 > 0 && local9 <= Static18.anInt297) {
										Static371.method4765(arg0, local12, local6 - 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt5215 == 32) {
									local1074 += Static390.anInt7654;
									local1078 += Static390.anInt7654;
									if (local1078 < -local1074 && local6 < Static81.anInt1606 && local9 < Static18.anInt297) {
										Static371.method4765(arg0, local12, local6 + 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt5215 == 64) {
									local1074 += Static390.anInt7654;
									local1078 -= Static390.anInt7654;
									if (local1078 > local1074 && local6 < Static81.anInt1606 && local9 > 0) {
										Static371.method4765(arg0, local12, local6 + 1, local9 - 1);
										break label682;
									}
								} else if (local1057.anInt5215 == 128) {
									local1074 -= Static390.anInt7654;
									local1078 -= Static390.anInt7654;
									if (local1078 > -local1074 && local6 > 0 && local9 > 0) {
										Static371.method4765(arg0, local12, local6 - 1, local9 - 1);
										break label682;
									}
								}
							}
							Static371.method4765(arg0, local12, local6, local9);
						}
						Static323.aClass135_12.method5359(arg0.anInt4551, arg0.aClass4_Sub7Array2);
					}
					@Pc(1216) Class20_Sub5 local1216 = local1057.method5880(Static323.aClass135_12);
					if (local1216 != null) {
						local1216.aClass8_1 = local1057;
						local1216.anInt3903 = local12;
						local1216.anInt3908 = local6;
						local1216.anInt3906 = local9;
						Static301.aClass248_6.method5585(local1216);
					}
				}
				arg1.aByte28 = 0;
			}
		}
		@Pc(1333) int local1333;
		if (arg1.aBoolean127) {
			try {
				arg1.aBoolean127 = false;
				@Pc(1245) int local1245 = 0;
				label625: for (local1030 = arg1.aClass251_2; local1030 != null; local1030 = local1030.aClass251_3) {
					@Pc(1252) Class8_Sub3 local1252 = local1030.aClass8_Sub3_2;
					if (local1252.anInt7342 != Static125.anInt2196) {
						for (local1074 = local1252.aShort100; local1074 <= local1252.aShort101; local1074++) {
							for (local1078 = local1252.aShort99; local1078 <= local1252.aShort98; local1078++) {
								@Pc(1270) Class75 local1270 = local31[local1074][local1078];
								if (local1270.aBoolean129) {
									arg1.aBoolean127 = true;
									continue label625;
								}
								if (local1270.aByte28 != 0) {
									local706 = 0;
									if (local1074 > local1252.aShort100) {
										local706++;
									}
									if (local1074 < local1252.aShort101) {
										local706 += 4;
									}
									if (local1078 > local1252.aShort99) {
										local706 += 8;
									}
									if (local1078 < local1252.aShort98) {
										local706 += 2;
									}
									if ((local706 & local1270.aByte28) == arg1.aByte31) {
										arg1.aBoolean127 = true;
										continue label625;
									}
								}
							}
						}
						local1078 = Static32.anInt531 - local1252.aShort100;
						local1333 = local1252.aShort101 - Static32.anInt531;
						if (local1333 > local1078) {
							local1078 = local1333;
						}
						local706 = Static150.anInt2733 - local1252.aShort99;
						local711 = local1252.aShort98 - Static150.anInt2733;
						if (local711 > local706) {
							local706 = local711;
						}
						arg0.aClass8_Sub3Array2[local1245] = local1252;
						arg0.anIntArray371[local1245++] = local1078 + local706;
					}
				}
				while (local1245 > 0) {
					local408 = -50;
					local1074 = -1;
					@Pc(1384) Class8_Sub3 local1384;
					for (local1078 = 0; local1078 < local1245; local1078++) {
						local1384 = arg0.aClass8_Sub3Array2[local1078];
						if (local1384.anInt7342 != Static125.anInt2196) {
							local706 = arg0.anIntArray371[local1078];
							if (local706 > local408) {
								local408 = local706;
								local1074 = local1078;
							} else if (local706 == local408) {
								local711 = local1384.anInt7339 - Static35.anInt570;
								local714 = local1384.anInt7343 - Static70.anInt1418;
								local723 = arg0.aClass8_Sub3Array2[local1074].anInt7339 - Static35.anInt570;
								local735 = arg0.aClass8_Sub3Array2[local1074].anInt7343 - Static70.anInt1418;
								if (local711 * local711 + local714 * local714 > local723 * local723 + local735 * local735) {
									local1074 = local1078;
								}
							}
						}
					}
					if (local1074 == -1) {
						break;
					}
					local1384 = arg0.aClass8_Sub3Array2[local1074];
					local1384.anInt7342 = Static125.anInt2196;
					if (!Static423.method5702(local15, local1384.aShort100, local1384.aShort101, local1384.aShort99, local1384.aShort98, local1384.method5882())) {
						if (Static299.aBoolean357) {
							if (local1384.aByte98 == 0) {
								Static136.method1957(arg0, local12, local1384.aShort100, local1384.aShort99, local1384.aShort101, local1384.aShort98);
							} else {
								Static371.method4765(arg0, local12, local6, local9);
								local706 = local6 - Static32.anInt531;
								local711 = local9 - Static150.anInt2733;
								if (local1384.aByte98 == 2) {
									if (local711 > -local706) {
										Static85.method1328(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static85.method1328(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local711 > local706) {
									Static85.method1328(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static85.method1328(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static323.aClass135_12.method5359(arg0.anInt4551, arg0.aClass4_Sub7Array2);
						}
						local616 = local1384.method5880(Static323.aClass135_12);
						if (local616 != null) {
							local616.aClass8_1 = local1384;
							local616.anInt3903 = local12;
							local616.anInt3908 = local1384.aShort100;
							local616.anInt3906 = local1384.aShort99;
							Static301.aClass248_6.method5585(local616);
						}
					}
					for (local706 = local1384.aShort100; local706 <= local1384.aShort101; local706++) {
						for (local711 = local1384.aShort99; local711 <= local1384.aShort98; local711++) {
							@Pc(1609) Class75 local1609 = local31[local706][local711];
							if (local1609.aByte28 != 0) {
								Static146.aClass28_1.method4501(local1609);
							} else if ((local706 != local6 || local711 != local9) && local1609.aBoolean128) {
								Static146.aClass28_1.method4501(local1609);
							}
						}
					}
				}
				if (arg1.aBoolean127) {
					return;
				}
			} catch (@Pc(1647) Exception local1647) {
				arg1.aBoolean127 = false;
			}
		}
		if (arg1.aClass83_1 != null && arg1.aByte27 == (byte) (Static75.anInt1524 & 0xFF)) {
			@Pc(1664) Class83 local1664 = arg1.aClass83_1;
			local406 = Static278.aClass41Array3[local12].l(local6, local9);
			if (local12 < Static320.anInt5205 - 1) {
				local408 = Static278.aClass41Array3[local12].l(local6, local9) - Static278.aClass41Array3[local12 + 1].l(local6, local9);
			} else {
				local408 = 0x8 << Static145.anInt2581;
			}
			Static290.aClass35_2.method2898(local21, local406, local27, arg0.anIntArray372);
			local1074 = arg0.anIntArray372[2];
			Static290.aClass35_2.method2898(local21, local406 - local408, local27, arg0.anIntArray372);
			local1078 = arg0.anIntArray372[2];
			local1333 = local1074;
			local706 = local1078;
			if (local1074 > local1078) {
				local1333 = local1078;
				local706 = local1074;
			}
			local1333 -= Static164.anInt3018;
			local706 += Static164.anInt3018;
			local1664.anInt2111 = local1333;
			local1664.anInt2110 = local706;
			local1664.aBoolean146 = true;
			Static323.aClass135_12.method5384(local1664);
		}
		if (!arg1.aBoolean128) {
			return;
		}
		if (arg1.aByte28 != 0) {
			return;
		}
		if (local6 <= Static32.anInt531 && local6 > Static288.anInt4749) {
			local86 = local31[local6 - 1][local9];
			if (local86 != null && local86.aBoolean128) {
				return;
			}
		}
		if (local6 >= Static32.anInt531 && local6 < Static333.anInt5438 - 1) {
			local86 = local31[local6 + 1][local9];
			if (local86 != null && local86.aBoolean128) {
				return;
			}
		}
		if (local9 <= Static150.anInt2733 && local9 > Static431.anInt7346) {
			local86 = local31[local6][local9 - 1];
			if (local86 != null && local86.aBoolean128) {
				return;
			}
		}
		if (local9 >= Static150.anInt2733 && local9 < Static217.anInt7222 - 1) {
			local86 = local31[local6][local9 + 1];
			if (local86 != null && local86.aBoolean128) {
				return;
			}
		}
		arg1.aBoolean128 = false;
		Static191.anInt3500--;
		@Pc(1855) Class8_Sub1 local1855 = arg1.aClass8_Sub1_1;
		if (local1855 != null && local1855.aBoolean360) {
			if (Static299.aBoolean357) {
				Static371.method4765(arg0, local12, local6, local9);
				Static323.aClass135_12.method5359(arg0.anInt4551, arg0.aClass4_Sub7Array2);
			}
			@Pc(1878) Class20_Sub5 local1878 = local1855.method5880(Static323.aClass135_12);
			if (local1878 != null) {
				local1878.aClass8_1 = local1855;
				local1878.anInt3903 = local12;
				local1878.anInt3908 = local6;
				local1878.anInt3906 = local9;
				Static301.aClass248_6.method5585(local1878);
			}
		}
		if (arg1.aShort32 != 0) {
			@Pc(1902) Class8_Sub5 local1902 = arg1.aClass8_Sub5_2;
			if (local1902 != null && !Static106.method1585(local15, local6, local9, local1902.method4114())) {
				if ((local1902.anInt5126 & arg1.aShort32) != 0) {
					if (Static299.aBoolean357) {
						Static371.method4765(arg0, local12, local6, local9);
						Static323.aClass135_12.method5359(arg0.anInt4551, arg0.aClass4_Sub7Array2);
					}
					local377 = local1902.method5880(Static323.aClass135_12);
					if (local377 != null) {
						local377.aClass8_1 = local1902;
						local377.anInt3903 = local12;
						local377.anInt3908 = local6;
						local377.anInt3906 = local9;
						Static301.aClass248_6.method5585(local377);
					}
				} else if (local1902.anInt5126 == 256) {
					local408 = local1902.anInt5128 - Static35.anInt570;
					local1074 = local1902.anInt5133 - Static70.anInt1418;
					local1078 = local1902.anInt5132;
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
					if (Static299.aBoolean357) {
						Static371.method4765(arg0, local12, local6, local9);
						Static323.aClass135_12.method5359(arg0.anInt4551, arg0.aClass4_Sub7Array2);
					}
					@Pc(2012) Class8_Sub5 local2012 = arg1.aClass8_Sub5_1;
					@Pc(2020) Class20_Sub5 local2020;
					if (local706 > local1333) {
						local2020 = local1902.method5880(Static323.aClass135_12);
						if (local2020 != null) {
							local2020.aClass8_1 = local1902;
							local2020.anInt3903 = local12;
							local2020.anInt3908 = local6;
							local2020.anInt3906 = local9;
							Static301.aClass248_6.method5585(local2020);
						}
					} else if (local2012 != null) {
						local2020 = local2012.method5880(Static323.aClass135_12);
						if (local2020 != null) {
							local2020.aClass8_1 = local2012;
							local2020.anInt3903 = local12;
							local2020.anInt3908 = local6;
							local2020.anInt3906 = local9;
							Static301.aClass248_6.method5585(local2020);
						}
					}
				}
			}
			local1057 = arg1.aClass8_Sub2_1;
			local411 = arg1.aClass8_Sub2_2;
			@Pc(2105) Class20_Sub5 local2105;
			if (local411 != null && (local411.anInt5215 & arg1.aShort32) != 0 && !Static134.method1949(local15, local6, local9, local411.anInt5215)) {
				if (Static299.aBoolean357) {
					Static104.method1549(arg0, local411.anInt5215, local12, local6, local9);
					Static323.aClass135_12.method5359(arg0.anInt4551, arg0.aClass4_Sub7Array2);
				}
				local2105 = local411.method5880(Static323.aClass135_12);
				if (local2105 != null) {
					local2105.aClass8_1 = local411;
					local2105.anInt3903 = local12;
					local2105.anInt3908 = local6;
					local2105.anInt3906 = local9;
					Static301.aClass248_6.method5585(local2105);
				}
			}
			if (local1057 != null && (local1057.anInt5215 & arg1.aShort32) != 0 && !Static134.method1949(local15, local6, local9, local1057.anInt5215)) {
				if (Static299.aBoolean357) {
					Static104.method1549(arg0, local1057.anInt5215, local12, local6, local9);
					Static323.aClass135_12.method5359(arg0.anInt4551, arg0.aClass4_Sub7Array2);
				}
				local2105 = local1057.method5880(Static323.aClass135_12);
				if (local2105 != null) {
					local2105.aClass8_1 = local1057;
					local2105.anInt3903 = local12;
					local2105.anInt3908 = local6;
					local2105.anInt3906 = local9;
					Static301.aClass248_6.method5585(local2105);
				}
			}
		}
		@Pc(2191) Class75 local2191;
		if (local12 < Static320.anInt5205 - 1) {
			local2191 = Static432.aClass75ArrayArrayArray6[local12 + 1][local6][local9];
			if (local2191 != null && local2191.aBoolean128) {
				Static146.aClass28_1.method4507(local2191);
			}
		}
		if (local6 < Static32.anInt531) {
			local2191 = local31[local6 + 1][local9];
			if (local2191 != null && local2191.aBoolean128) {
				Static146.aClass28_1.method4501(local2191);
			}
		}
		if (local9 < Static150.anInt2733) {
			local2191 = local31[local6][local9 + 1];
			if (local2191 != null && local2191.aBoolean128) {
				Static146.aClass28_1.method4501(local2191);
			}
		}
		if (local6 > Static32.anInt531) {
			local2191 = local31[local6 - 1][local9];
			if (local2191 != null && local2191.aBoolean128) {
				Static146.aClass28_1.method4501(local2191);
			}
		}
		if (local9 > Static150.anInt2733) {
			local2191 = local31[local6][local9 - 1];
			if (local2191 != null && local2191.aBoolean128) {
				Static146.aClass28_1.method4501(local2191);
			}
		}
	}
}
