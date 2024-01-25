import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!d", name = "f", descriptor = "[I")
	public static final int[] anIntArray60 = new int[14];

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
	public static void method1018() {
		@Pc(10) Class5_Sub4 local10 = (Class5_Sub4) Static362.aClass177_33.method3618();
		@Pc(18) boolean local18 = Static387.aClass76_14 != null || Static151.anInt7436 > 0;
		if (local18) {
			Static85.anInt1538 = 1;
		}
		if (Static2.aBoolean506 && Static188.aClass80_1.method1723(81) && Static18.anInt395 > 2) {
			if (local18) {
				Static256.aClass5_Sub41_2 = (Class5_Sub41) Static122.aClass177_13.aClass5_167.aClass5_268.aClass5_268;
			} else {
				Static122.method1733(local10.method3833(), local10.method3837(), (Class5_Sub41) Static122.aClass177_13.aClass5_167.aClass5_268.aClass5_268);
			}
		} else if (local18) {
			Static256.aClass5_Sub41_2 = (Class5_Sub41) Static122.aClass177_13.aClass5_167.aClass5_268;
		} else {
			Static122.method1733(local10.method3833(), local10.method3837(), (Class5_Sub41) Static122.aClass177_13.aClass5_167.aClass5_268);
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(FFBFI)F")
	public static float method1020(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3) {
		@Pc(12) float[] local12 = Static195.aFloatArrayArray6[arg3];
		return arg1 * local12[0] + arg2 * local12[1] + local12[2] * arg0;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!bc;Lclient!vt;)V")
	public static void method1021(@OriginalArg(0) Class18 arg0, @OriginalArg(1) Class258 arg1) {
		if (!arg1.aBoolean491) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort102;
		@Pc(9) short local9 = arg1.aShort101;
		@Pc(12) byte local12 = arg1.aByte102;
		@Pc(15) byte local15 = arg1.aByte98;
		@Pc(21) int local21 = (local6 << Static419.anInt6980) + Static301.anInt4709;
		@Pc(27) int local27 = (local9 << Static419.anInt6980) + Static301.anInt4709;
		@Pc(31) Class258[][] local31 = Static319.aClass258ArrayArrayArray3[local12];
		@Pc(53) float local53;
		if (Static408.aClass125Array2 == Static410.aClass125Array3) {
			Static293.aClass200_5.a(Static110.aClass125Array1[0].ca(local21, local27), Static193.method2593(local6, local9), Static154.method5151(local6, local9), Static30.method474(local6, local9));
			local53 = 251.5F;
		} else {
			local53 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static293.aClass200_5.da(3000.0F, local53 * 1.5F);
		@Pc(86) Class258 local86;
		@Pc(616) Class88_Sub2 local616;
		@Pc(711) int local711;
		@Pc(714) int local714;
		@Pc(723) int local723;
		@Pc(735) int local735;
		@Pc(406) int local406;
		@Pc(330) boolean local330;
		@Pc(377) Class88_Sub2 local377;
		@Pc(408) int local408;
		@Pc(411) Class2_Sub4 local411;
		@Pc(706) int local706;
		if (arg1.aBoolean489) {
			if (Static119.aBoolean233) {
				if (local12 > 0) {
					local86 = Static319.aClass258ArrayArrayArray3[local12 - 1][local6][local9];
					if (local86 != null && local86.aBoolean491) {
						return;
					}
				}
				if (local6 <= Static448.anInt7370 && local6 > Static415.anInt6927) {
					local86 = local31[local6 - 1][local9];
					if (local86 != null && local86.aBoolean491 && (local86.aBoolean489 || (arg1.aByte97 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static448.anInt7370 && local6 < Static150.anInt2696 - 1) {
					local86 = local31[local6 + 1][local9];
					if (local86 != null && local86.aBoolean491 && (local86.aBoolean489 || (arg1.aByte97 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static17.anInt369 && local9 > Static401.anInt2163) {
					local86 = local31[local6][local9 - 1];
					if (local86 != null && local86.aBoolean491 && (local86.aBoolean489 || (arg1.aByte97 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static17.anInt369 && local9 < Static182.anInt3095 - 1) {
					local86 = local31[local6][local9 + 1];
					if (local86 != null && local86.aBoolean491 && (local86.aBoolean489 || (arg1.aByte97 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static119.aBoolean233 = true;
			}
			arg1.aBoolean489 = false;
			if (arg1.aClass258_1 != null) {
				local86 = arg1.aClass258_1;
				Static293.aClass200_5.da(3000.0F, (201.5F - (float) (local86.aByte98 + 1) * 50.0F) * 1.5F);
				if (!Static243.method3145(local86.aByte98, local6, local9)) {
					Static410.aClass125Array3[local86.aByte98].method4993(local6, local9);
				}
				@Pc(249) Class2_Sub4 local249 = local86.aClass2_Sub4_2;
				if (local249 != null) {
					if (Static272.aBoolean285) {
						if ((local249.anInt6417 & arg1.aShort100) == 0) {
							Static262.method3349(arg0, local12, local6, local9);
						} else {
							Static272.method3425(arg0, local249.anInt6417, local15, local6, local9);
						}
						Static293.aClass200_5.method5846(arg0.anInt6451, arg0.aClass5_Sub19Array2);
					}
					local249.method6025(Static293.aClass200_5);
				}
				for (@Pc(286) Class122 local286 = local86.aClass122_3; local286 != null; local286 = local286.aClass122_1) {
					@Pc(290) Class2_Sub1 local290 = local286.aClass2_Sub1_1;
					if (local290 != null) {
						if (Static272.aBoolean285) {
							Static262.method3349(arg0, local12, local6, local9);
							Static293.aClass200_5.method5846(arg0.anInt6451, arg0.aClass5_Sub19Array2);
						}
						local290.method6025(Static293.aClass200_5);
					}
				}
				Static293.aClass200_5.da(3000.0F, local53 * 1.5F);
			}
			local330 = !Static243.method3145(local15, local6, local9);
			if (local330) {
				Static410.aClass125Array3[local15].method4993(local6, local9);
				@Pc(341) Class2_Sub3 local341 = arg1.aClass2_Sub3_2;
				if (local341 != null && local341.aBoolean480) {
					if (local341.aBoolean481) {
						Static293.aClass200_5.da(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static272.aBoolean285) {
						Static262.method3349(arg0, local12, local6, local9);
						Static293.aClass200_5.method5846(arg0.anInt6451, arg0.aClass5_Sub19Array2);
					}
					local377 = local341.method6025(Static293.aClass200_5);
					if (local377 != null) {
						local377.aClass2_1 = local341;
						local377.anInt2816 = local12;
						local377.anInt2813 = local6;
						local377.anInt2814 = local9;
						Static322.aClass107_10.method2332(local377);
					}
					if (local341.aBoolean481) {
						Static293.aClass200_5.da(3000.0F, local53 * 1.5F);
					}
				}
			}
			local406 = 0;
			local408 = 0;
			local411 = arg1.aClass2_Sub4_2;
			@Pc(414) Class2_Sub2 local414 = arg1.aClass2_Sub2_2;
			if (local411 != null || local414 != null) {
				if (Static448.anInt7370 == local6) {
					local406++;
				} else if (Static448.anInt7370 < local6) {
					local406 += 2;
				}
				if (Static17.anInt369 == local9) {
					local406 += 3;
				} else if (Static17.anInt369 > local9) {
					local406 += 6;
				}
				local408 = Static99.anIntArray80[local406];
				arg1.aShort100 = Static214.aShortArray62[local406];
			}
			if (local411 != null) {
				if ((local411.anInt6417 & Static329.anIntArray375[local406]) == 0) {
					arg1.aByte99 = 0;
				} else if (local411.anInt6417 == 16) {
					arg1.aByte99 = 3;
					arg1.aByte103 = Static7.aByteArray1[local406];
					arg1.aByte101 = (byte) (3 - arg1.aByte103);
				} else if (local411.anInt6417 == 32) {
					arg1.aByte99 = 6;
					arg1.aByte103 = Static412.aByteArray89[local406];
					arg1.aByte101 = (byte) (6 - arg1.aByte103);
				} else if (local411.anInt6417 == 64) {
					arg1.aByte99 = 12;
					arg1.aByte103 = Static150.aByteArray35[local406];
					arg1.aByte101 = (byte) (12 - arg1.aByte103);
				} else {
					arg1.aByte99 = 9;
					arg1.aByte103 = Static383.aByteArray80[local406];
					arg1.aByte101 = (byte) (9 - arg1.aByte103);
				}
				if ((local411.anInt6417 & local408) != 0 && !Static6.method87(local15, local6, local9, local411.anInt6417)) {
					if (Static272.aBoolean285) {
						Static262.method3349(arg0, local12, local6, local9);
						Static293.aClass200_5.method5846(arg0.anInt6451, arg0.aClass5_Sub19Array2);
					}
					@Pc(563) Class88_Sub2 local563 = local411.method6025(Static293.aClass200_5);
					if (local563 != null) {
						local563.aClass2_1 = local411;
						local563.anInt2816 = local12;
						local563.anInt2813 = local6;
						local563.anInt2814 = local9;
						Static322.aClass107_10.method2332(local563);
					}
				}
				@Pc(584) Class2_Sub4 local584 = arg1.aClass2_Sub4_3;
				if (local584 != null && (local584.anInt6417 & local408) != 0 && !Static6.method87(local15, local6, local9, local584.anInt6417)) {
					if (Static272.aBoolean285) {
						Static262.method3349(arg0, local12, local6, local9);
						Static293.aClass200_5.method5846(arg0.anInt6451, arg0.aClass5_Sub19Array2);
					}
					local616 = local584.method6025(Static293.aClass200_5);
					if (local616 != null) {
						local616.aClass2_1 = local584;
						local616.anInt2816 = local12;
						local616.anInt2813 = local6;
						local616.anInt2814 = local9;
						Static322.aClass107_10.method2332(local616);
					}
				}
			}
			if (local414 != null && !Static76.method1137(local15, local6, local9, local414.method3486())) {
				@Pc(647) Class2_Sub2 local647 = arg1.aClass2_Sub2_3;
				Static293.aClass200_5.da(3000.0F, (local53 - 0.5F) * 1.5F);
				if ((local414.anInt4382 & local408) != 0) {
					if (Static272.aBoolean285) {
						Static262.method3349(arg0, local12, local6, local9);
						Static293.aClass200_5.method5846(arg0.anInt6451, arg0.aClass5_Sub19Array2);
					}
					local616 = local414.method6025(Static293.aClass200_5);
					if (local616 != null) {
						local616.aClass2_1 = local414;
						local616.anInt2816 = local12;
						local616.anInt2813 = local6;
						local616.anInt2814 = local9;
						Static322.aClass107_10.method2332(local616);
					}
				} else if (local414.anInt4382 == 256) {
					local706 = local414.anInt4386 - Static267.anInt4663;
					local711 = local414.anInt4377 - Static109.anInt1835;
					local714 = local414.anInt4392;
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
					if (Static272.aBoolean285) {
						Static262.method3349(arg0, local12, local6, local9);
						Static293.aClass200_5.method5846(arg0.anInt6451, arg0.aClass5_Sub19Array2);
					}
					@Pc(759) Class88_Sub2 local759;
					if (local735 < local723) {
						local759 = local414.method6025(Static293.aClass200_5);
						if (local759 != null) {
							local759.aClass2_1 = local414;
							local759.anInt2816 = local12;
							local759.anInt2813 = local6;
							local759.anInt2814 = local9;
							Static322.aClass107_10.method2332(local759);
						}
					} else if (local647 != null) {
						local759 = local647.method6025(Static293.aClass200_5);
						if (local759 != null) {
							local759.aClass2_1 = local647;
							local759.anInt2816 = local12;
							local759.anInt2813 = local6;
							local759.anInt2814 = local9;
							Static322.aClass107_10.method2332(local759);
						}
					}
				}
				Static293.aClass200_5.da(3000.0F, local53 * 1.5F);
			}
			if (local330) {
				@Pc(814) Class2_Sub3 local814 = arg1.aClass2_Sub3_2;
				if (local814 != null && !local814.aBoolean480) {
					if (local814.aBoolean481) {
						Static293.aClass200_5.da(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static272.aBoolean285) {
						Static262.method3349(arg0, local12, local6, local9);
						Static293.aClass200_5.method5846(arg0.anInt6451, arg0.aClass5_Sub19Array2);
					}
					local616 = local814.method6025(Static293.aClass200_5);
					if (local616 != null) {
						local616.aClass2_1 = local814;
						local616.anInt2816 = local12;
						local616.anInt2813 = local6;
						local616.anInt2814 = local9;
						Static322.aClass107_10.method2332(local616);
					}
					if (local814.aBoolean481) {
						Static293.aClass200_5.da(3000.0F, local53 * 1.5F);
					}
				}
				@Pc(880) Class2_Sub5 local880 = arg1.aClass2_Sub5_1;
				if (local880 != null && !local880.aBoolean109) {
					if (Static272.aBoolean285) {
						Static262.method3349(arg0, local12, local6, local9);
						Static293.aClass200_5.method5846(arg0.anInt6451, arg0.aClass5_Sub19Array2);
					}
					@Pc(903) Class88_Sub2 local903 = local880.method6025(Static293.aClass200_5);
					if (local903 != null) {
						local903.aClass2_1 = local880;
						local903.anInt2816 = local12;
						local903.anInt2813 = local6;
						local903.anInt2814 = local9;
						Static322.aClass107_10.method2332(local903);
					}
				}
			}
			@Pc(924) byte local924 = arg1.aByte97;
			if (local924 != 0) {
				@Pc(941) Class258 local941;
				if (local6 < Static448.anInt7370 && (local924 & 0x4) != 0) {
					local941 = local31[local6 + 1][local9];
					if (local941 != null && local941.aBoolean491) {
						Static449.aClass77_1.method2858(local941);
					}
				}
				if (local9 < Static17.anInt369 && (local924 & 0x2) != 0) {
					local941 = local31[local6][local9 + 1];
					if (local941 != null && local941.aBoolean491) {
						Static449.aClass77_1.method2858(local941);
					}
				}
				if (local6 > Static448.anInt7370 && (local924 & 0x1) != 0) {
					local941 = local31[local6 - 1][local9];
					if (local941 != null && local941.aBoolean491) {
						Static449.aClass77_1.method2858(local941);
					}
				}
				if (local9 > Static17.anInt369 && (local924 & 0x8) != 0) {
					local941 = local31[local6][local9 - 1];
					if (local941 != null && local941.aBoolean491) {
						Static449.aClass77_1.method2858(local941);
					}
				}
			}
		}
		@Pc(1074) int local1074;
		@Pc(1057) Class2_Sub4 local1057;
		@Pc(1078) int local1078;
		@Pc(1030) Class122 local1030;
		if (arg1.aByte99 != 0) {
			local330 = true;
			for (local1030 = arg1.aClass122_3; local1030 != null; local1030 = local1030.aClass122_1) {
				if (local1030.aClass2_Sub1_1.anInt7506 != Static138.anInt2465 && (local1030.anInt3227 & arg1.aByte99) == arg1.aByte103) {
					local330 = false;
					break;
				}
			}
			if (local330) {
				local1057 = arg1.aClass2_Sub4_2;
				if (!Static6.method87(local15, local6, local9, local1057.anInt6417)) {
					if (Static272.aBoolean285) {
						label682: {
							if (local1057.anInt6417 >= 16) {
								local1074 = local6 - Static448.anInt7370;
								local1078 = local9 - Static17.anInt369;
								if (local1057.anInt6417 == 16) {
									local1074 -= Static301.anInt4709;
									local1078 += Static301.anInt4709;
									if (local1078 < local1074 && local6 > 0 && local9 <= Static459.anInt4775) {
										Static262.method3349(arg0, local12, local6 - 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt6417 == 32) {
									local1074 += Static301.anInt4709;
									local1078 += Static301.anInt4709;
									if (local1078 < -local1074 && local6 < Static439.anInt7318 && local9 < Static459.anInt4775) {
										Static262.method3349(arg0, local12, local6 + 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt6417 == 64) {
									local1074 += Static301.anInt4709;
									local1078 -= Static301.anInt4709;
									if (local1078 > local1074 && local6 < Static439.anInt7318 && local9 > 0) {
										Static262.method3349(arg0, local12, local6 + 1, local9 - 1);
										break label682;
									}
								} else if (local1057.anInt6417 == 128) {
									local1074 -= Static301.anInt4709;
									local1078 -= Static301.anInt4709;
									if (local1078 > -local1074 && local6 > 0 && local9 > 0) {
										Static262.method3349(arg0, local12, local6 - 1, local9 - 1);
										break label682;
									}
								}
							}
							Static262.method3349(arg0, local12, local6, local9);
						}
						Static293.aClass200_5.method5846(arg0.anInt6451, arg0.aClass5_Sub19Array2);
					}
					@Pc(1216) Class88_Sub2 local1216 = local1057.method6025(Static293.aClass200_5);
					if (local1216 != null) {
						local1216.aClass2_1 = local1057;
						local1216.anInt2816 = local12;
						local1216.anInt2813 = local6;
						local1216.anInt2814 = local9;
						Static322.aClass107_10.method2332(local1216);
					}
				}
				arg1.aByte99 = 0;
			}
		}
		@Pc(1333) int local1333;
		if (arg1.aBoolean490) {
			try {
				arg1.aBoolean490 = false;
				@Pc(1245) int local1245 = 0;
				label625: for (local1030 = arg1.aClass122_3; local1030 != null; local1030 = local1030.aClass122_1) {
					@Pc(1252) Class2_Sub1 local1252 = local1030.aClass2_Sub1_1;
					if (local1252.anInt7506 != Static138.anInt2465) {
						for (local1074 = local1252.aShort107; local1074 <= local1252.aShort104; local1074++) {
							for (local1078 = local1252.aShort106; local1078 <= local1252.aShort105; local1078++) {
								@Pc(1270) Class258 local1270 = local31[local1074][local1078];
								if (local1270.aBoolean489) {
									arg1.aBoolean490 = true;
									continue label625;
								}
								if (local1270.aByte99 != 0) {
									local706 = 0;
									if (local1074 > local1252.aShort107) {
										local706++;
									}
									if (local1074 < local1252.aShort104) {
										local706 += 4;
									}
									if (local1078 > local1252.aShort106) {
										local706 += 8;
									}
									if (local1078 < local1252.aShort105) {
										local706 += 2;
									}
									if ((local706 & local1270.aByte99) == arg1.aByte101) {
										arg1.aBoolean490 = true;
										continue label625;
									}
								}
							}
						}
						local1078 = Static448.anInt7370 - local1252.aShort107;
						local1333 = local1252.aShort104 - Static448.anInt7370;
						if (local1333 > local1078) {
							local1078 = local1333;
						}
						local706 = Static17.anInt369 - local1252.aShort106;
						local711 = local1252.aShort105 - Static17.anInt369;
						if (local711 > local706) {
							local706 = local711;
						}
						arg0.aClass2_Sub1Array2[local1245] = local1252;
						arg0.anIntArray455[local1245++] = local1078 + local706;
					}
				}
				while (local1245 > 0) {
					local408 = -50;
					local1074 = -1;
					@Pc(1384) Class2_Sub1 local1384;
					for (local1078 = 0; local1078 < local1245; local1078++) {
						local1384 = arg0.aClass2_Sub1Array2[local1078];
						if (local1384.anInt7506 != Static138.anInt2465) {
							local706 = arg0.anIntArray455[local1078];
							if (local706 > local408) {
								local408 = local706;
								local1074 = local1078;
							} else if (local706 == local408) {
								local711 = local1384.anInt7500 - Static267.anInt4663;
								local714 = local1384.anInt7502 - Static109.anInt1835;
								local723 = arg0.aClass2_Sub1Array2[local1074].anInt7500 - Static267.anInt4663;
								local735 = arg0.aClass2_Sub1Array2[local1074].anInt7502 - Static109.anInt1835;
								if (local711 * local711 + local714 * local714 > local723 * local723 + local735 * local735) {
									local1074 = local1078;
								}
							}
						}
					}
					if (local1074 == -1) {
						break;
					}
					local1384 = arg0.aClass2_Sub1Array2[local1074];
					local1384.anInt7506 = Static138.anInt2465;
					if (!Static353.method4570(local15, local1384.aShort107, local1384.aShort104, local1384.aShort106, local1384.aShort105, local1384.method6031())) {
						if (Static272.aBoolean285) {
							if (local1384.aByte104 == 0) {
								Static224.method2953(arg0, local12, local1384.aShort107, local1384.aShort106, local1384.aShort104, local1384.aShort105);
							} else {
								Static262.method3349(arg0, local12, local6, local9);
								local706 = local6 - Static448.anInt7370;
								local711 = local9 - Static17.anInt369;
								if (local1384.aByte104 == 2) {
									if (local711 > -local706) {
										Static192.method2573(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static192.method2573(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local711 > local706) {
									Static192.method2573(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static192.method2573(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static293.aClass200_5.method5846(arg0.anInt6451, arg0.aClass5_Sub19Array2);
						}
						local616 = local1384.method6025(Static293.aClass200_5);
						if (local616 != null) {
							local616.aClass2_1 = local1384;
							local616.anInt2816 = local12;
							local616.anInt2813 = local1384.aShort107;
							local616.anInt2814 = local1384.aShort106;
							Static322.aClass107_10.method2332(local616);
						}
					}
					for (local706 = local1384.aShort107; local706 <= local1384.aShort104; local706++) {
						for (local711 = local1384.aShort106; local711 <= local1384.aShort105; local711++) {
							@Pc(1609) Class258 local1609 = local31[local706][local711];
							if (local1609.aByte99 != 0) {
								Static449.aClass77_1.method2858(local1609);
							} else if ((local706 != local6 || local711 != local9) && local1609.aBoolean491) {
								Static449.aClass77_1.method2858(local1609);
							}
						}
					}
				}
				if (arg1.aBoolean490) {
					return;
				}
			} catch (@Pc(1647) Exception local1647) {
				arg1.aBoolean490 = false;
			}
		}
		if (arg1.aClass255_2 != null && arg1.aByte100 == (byte) (Static81.anInt1473 & 0xFF)) {
			@Pc(1664) Class255 local1664 = arg1.aClass255_2;
			local406 = Static410.aClass125Array3[local12].ua(local6, local9);
			if (local12 < Static96.anInt1667 - 1) {
				local408 = Static410.aClass125Array3[local12].ua(local6, local9) - Static410.aClass125Array3[local12 + 1].ua(local6, local9);
			} else {
				local408 = 0x8 << Static419.anInt6980;
			}
			Static36.aClass29_1.method4105(local21, local406, local27, arg0.anIntArray454);
			local1074 = arg0.anIntArray454[2];
			Static36.aClass29_1.method4105(local21, local406 - local408, local27, arg0.anIntArray454);
			local1078 = arg0.anIntArray454[2];
			local1333 = local1074;
			local706 = local1078;
			if (local1074 > local1078) {
				local1333 = local1078;
				local706 = local1074;
			}
			local1333 -= Static371.anInt6075;
			local706 += Static371.anInt6075;
			local1664.anInt7225 = local1333;
			local1664.anInt7224 = local706;
			local1664.aBoolean484 = true;
			Static293.aClass200_5.method5872(local1664);
		}
		if (!arg1.aBoolean491) {
			return;
		}
		if (arg1.aByte99 != 0) {
			return;
		}
		if (local6 <= Static448.anInt7370 && local6 > Static415.anInt6927) {
			local86 = local31[local6 - 1][local9];
			if (local86 != null && local86.aBoolean491) {
				return;
			}
		}
		if (local6 >= Static448.anInt7370 && local6 < Static150.anInt2696 - 1) {
			local86 = local31[local6 + 1][local9];
			if (local86 != null && local86.aBoolean491) {
				return;
			}
		}
		if (local9 <= Static17.anInt369 && local9 > Static401.anInt2163) {
			local86 = local31[local6][local9 - 1];
			if (local86 != null && local86.aBoolean491) {
				return;
			}
		}
		if (local9 >= Static17.anInt369 && local9 < Static182.anInt3095 - 1) {
			local86 = local31[local6][local9 + 1];
			if (local86 != null && local86.aBoolean491) {
				return;
			}
		}
		arg1.aBoolean491 = false;
		Static272.anInt4295--;
		@Pc(1855) Class2_Sub5 local1855 = arg1.aClass2_Sub5_1;
		if (local1855 != null && local1855.aBoolean109) {
			if (Static272.aBoolean285) {
				Static262.method3349(arg0, local12, local6, local9);
				Static293.aClass200_5.method5846(arg0.anInt6451, arg0.aClass5_Sub19Array2);
			}
			@Pc(1878) Class88_Sub2 local1878 = local1855.method6025(Static293.aClass200_5);
			if (local1878 != null) {
				local1878.aClass2_1 = local1855;
				local1878.anInt2816 = local12;
				local1878.anInt2813 = local6;
				local1878.anInt2814 = local9;
				Static322.aClass107_10.method2332(local1878);
			}
		}
		if (arg1.aShort100 != 0) {
			@Pc(1902) Class2_Sub2 local1902 = arg1.aClass2_Sub2_2;
			if (local1902 != null && !Static76.method1137(local15, local6, local9, local1902.method3486())) {
				if ((local1902.anInt4382 & arg1.aShort100) != 0) {
					if (Static272.aBoolean285) {
						Static262.method3349(arg0, local12, local6, local9);
						Static293.aClass200_5.method5846(arg0.anInt6451, arg0.aClass5_Sub19Array2);
					}
					local377 = local1902.method6025(Static293.aClass200_5);
					if (local377 != null) {
						local377.aClass2_1 = local1902;
						local377.anInt2816 = local12;
						local377.anInt2813 = local6;
						local377.anInt2814 = local9;
						Static322.aClass107_10.method2332(local377);
					}
				} else if (local1902.anInt4382 == 256) {
					local408 = local1902.anInt4386 - Static267.anInt4663;
					local1074 = local1902.anInt4377 - Static109.anInt1835;
					local1078 = local1902.anInt4392;
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
					if (Static272.aBoolean285) {
						Static262.method3349(arg0, local12, local6, local9);
						Static293.aClass200_5.method5846(arg0.anInt6451, arg0.aClass5_Sub19Array2);
					}
					@Pc(2012) Class2_Sub2 local2012 = arg1.aClass2_Sub2_3;
					@Pc(2020) Class88_Sub2 local2020;
					if (local706 > local1333) {
						local2020 = local1902.method6025(Static293.aClass200_5);
						if (local2020 != null) {
							local2020.aClass2_1 = local1902;
							local2020.anInt2816 = local12;
							local2020.anInt2813 = local6;
							local2020.anInt2814 = local9;
							Static322.aClass107_10.method2332(local2020);
						}
					} else if (local2012 != null) {
						local2020 = local2012.method6025(Static293.aClass200_5);
						if (local2020 != null) {
							local2020.aClass2_1 = local2012;
							local2020.anInt2816 = local12;
							local2020.anInt2813 = local6;
							local2020.anInt2814 = local9;
							Static322.aClass107_10.method2332(local2020);
						}
					}
				}
			}
			local1057 = arg1.aClass2_Sub4_2;
			local411 = arg1.aClass2_Sub4_3;
			@Pc(2105) Class88_Sub2 local2105;
			if (local411 != null && (local411.anInt6417 & arg1.aShort100) != 0 && !Static6.method87(local15, local6, local9, local411.anInt6417)) {
				if (Static272.aBoolean285) {
					Static272.method3425(arg0, local411.anInt6417, local12, local6, local9);
					Static293.aClass200_5.method5846(arg0.anInt6451, arg0.aClass5_Sub19Array2);
				}
				local2105 = local411.method6025(Static293.aClass200_5);
				if (local2105 != null) {
					local2105.aClass2_1 = local411;
					local2105.anInt2816 = local12;
					local2105.anInt2813 = local6;
					local2105.anInt2814 = local9;
					Static322.aClass107_10.method2332(local2105);
				}
			}
			if (local1057 != null && (local1057.anInt6417 & arg1.aShort100) != 0 && !Static6.method87(local15, local6, local9, local1057.anInt6417)) {
				if (Static272.aBoolean285) {
					Static272.method3425(arg0, local1057.anInt6417, local12, local6, local9);
					Static293.aClass200_5.method5846(arg0.anInt6451, arg0.aClass5_Sub19Array2);
				}
				local2105 = local1057.method6025(Static293.aClass200_5);
				if (local2105 != null) {
					local2105.aClass2_1 = local1057;
					local2105.anInt2816 = local12;
					local2105.anInt2813 = local6;
					local2105.anInt2814 = local9;
					Static322.aClass107_10.method2332(local2105);
				}
			}
		}
		@Pc(2191) Class258 local2191;
		if (local12 < Static96.anInt1667 - 1) {
			local2191 = Static319.aClass258ArrayArrayArray3[local12 + 1][local6][local9];
			if (local2191 != null && local2191.aBoolean491) {
				Static449.aClass77_1.method2850(local2191);
			}
		}
		if (local6 < Static448.anInt7370) {
			local2191 = local31[local6 + 1][local9];
			if (local2191 != null && local2191.aBoolean491) {
				Static449.aClass77_1.method2858(local2191);
			}
		}
		if (local9 < Static17.anInt369) {
			local2191 = local31[local6][local9 + 1];
			if (local2191 != null && local2191.aBoolean491) {
				Static449.aClass77_1.method2858(local2191);
			}
		}
		if (local6 > Static448.anInt7370) {
			local2191 = local31[local6 - 1][local9];
			if (local2191 != null && local2191.aBoolean491) {
				Static449.aClass77_1.method2858(local2191);
			}
		}
		if (local9 > Static17.anInt369) {
			local2191 = local31[local6][local9 - 1];
			if (local2191 != null && local2191.aBoolean491) {
				Static449.aClass77_1.method2858(local2191);
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Z")
	public static boolean method1032(@OriginalArg(0) int arg0) {
		return arg0 == 6 || arg0 == 7 || arg0 == 8;
	}
}
