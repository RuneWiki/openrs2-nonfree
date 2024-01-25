import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "[[S")
	public static short[][] aShortArrayArray5;

	@OriginalMember(owner = "client!ld", name = "h", descriptor = "F")
	public static float aFloat67;

	@OriginalMember(owner = "client!ld", name = "i", descriptor = "Lclient!ts;")
	public static Class247 aClass247_1;

	@OriginalMember(owner = "client!ld", name = "k", descriptor = "Lclient!ci;")
	public static Class38 aClass38_46;

	@OriginalMember(owner = "client!ld", name = "m", descriptor = "[Lclient!aa;")
	public static Class2[] aClass2Array31;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILjava/lang/Object;Lclient!ul;)V")
	public static void method3814(@OriginalArg(1) Object arg0, @OriginalArg(2) Class255 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg1.anEventQueue1.peekEvent() != null; local11++) {
			Static77.method1653(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!nt;Lclient!mm;)V")
	public static void method3819(@OriginalArg(0) Class177 arg0, @OriginalArg(1) Class162 arg1) {
		if (!arg1.aBoolean330) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort52;
		@Pc(9) short local9 = arg1.aShort53;
		@Pc(12) byte local12 = arg1.aByte61;
		@Pc(15) byte local15 = arg1.aByte59;
		@Pc(21) int local21 = (local6 << Static391.anInt6797) + Static423.anInt7318;
		@Pc(27) int local27 = (local9 << Static391.anInt6797) + Static423.anInt7318;
		@Pc(31) Class162[][] local31 = Static294.aClass162ArrayArrayArray2[local12];
		@Pc(53) float local53;
		if (Static77.aClass14Array1 == Static389.aClass14Array3) {
			Static367.aClass30_20.KA(Static267.aClass14Array2[0].R(local21, local27), Static108.method2148(local6, local9), Static133.method2458(local6, local9), Static329.method4880(local6, local9));
			local53 = 251.5F;
		} else {
			local53 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static367.aClass30_20.PA(3000.0F, local53 * 1.5F);
		@Pc(86) Class162 local86;
		@Pc(616) Class71_Sub3 local616;
		@Pc(711) int local711;
		@Pc(714) int local714;
		@Pc(723) int local723;
		@Pc(735) int local735;
		@Pc(406) int local406;
		@Pc(330) boolean local330;
		@Pc(377) Class71_Sub3 local377;
		@Pc(408) int local408;
		@Pc(411) Class11_Sub2 local411;
		@Pc(706) int local706;
		if (arg1.aBoolean331) {
			if (Static343.aBoolean434) {
				if (local12 > 0) {
					local86 = Static294.aClass162ArrayArrayArray2[local12 - 1][local6][local9];
					if (local86 != null && local86.aBoolean330) {
						return;
					}
				}
				if (local6 <= Static243.anInt4735 && local6 > Static440.anInt7506) {
					local86 = local31[local6 - 1][local9];
					if (local86 != null && local86.aBoolean330 && (local86.aBoolean331 || (arg1.aByte62 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static243.anInt4735 && local6 < Static54.anInt1311 - 1) {
					local86 = local31[local6 + 1][local9];
					if (local86 != null && local86.aBoolean330 && (local86.aBoolean331 || (arg1.aByte62 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static140.anInt2891 && local9 > Static412.anInt7172) {
					local86 = local31[local6][local9 - 1];
					if (local86 != null && local86.aBoolean330 && (local86.aBoolean331 || (arg1.aByte62 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static140.anInt2891 && local9 < Static206.anInt4217 - 1) {
					local86 = local31[local6][local9 + 1];
					if (local86 != null && local86.aBoolean330 && (local86.aBoolean331 || (arg1.aByte62 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static343.aBoolean434 = true;
			}
			arg1.aBoolean331 = false;
			if (arg1.aClass162_1 != null) {
				local86 = arg1.aClass162_1;
				Static367.aClass30_20.PA(3000.0F, (201.5F - (float) (local86.aByte59 + 1) * 50.0F) * 1.5F);
				if (!Static112.method2196(local86.aByte59, local6, local9)) {
					Static389.aClass14Array3[local86.aByte59].method2549(local6, local9);
				}
				@Pc(249) Class11_Sub2 local249 = local86.aClass11_Sub2_2;
				if (local249 != null) {
					if (Static111.aBoolean166) {
						if ((local249.anInt7828 & arg1.aShort54) == 0) {
							Static418.method2680(arg0, local12, local6, local9);
						} else {
							Static372.method5273(arg0, local249.anInt7828, local15, local6, local9);
						}
						Static367.aClass30_20.method2081(arg0.anInt5190, arg0.aClass4_Sub17Array3);
					}
					local249.method6304(Static367.aClass30_20);
				}
				for (@Pc(286) Class199 local286 = local86.aClass199_1; local286 != null; local286 = local286.aClass199_2) {
					@Pc(290) Class11_Sub5 local290 = local286.aClass11_Sub5_1;
					if (local290 != null) {
						if (Static111.aBoolean166) {
							Static418.method2680(arg0, local12, local6, local9);
							Static367.aClass30_20.method2081(arg0.anInt5190, arg0.aClass4_Sub17Array3);
						}
						local290.method6304(Static367.aClass30_20);
					}
				}
				Static367.aClass30_20.PA(3000.0F, local53 * 1.5F);
			}
			local330 = !Static112.method2196(local15, local6, local9);
			if (local330) {
				Static389.aClass14Array3[local15].method2549(local6, local9);
				@Pc(341) Class11_Sub1 local341 = arg1.aClass11_Sub1_2;
				if (local341 != null && local341.aBoolean585) {
					if (local341.aBoolean584) {
						Static367.aClass30_20.PA(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static111.aBoolean166) {
						Static418.method2680(arg0, local12, local6, local9);
						Static367.aClass30_20.method2081(arg0.anInt5190, arg0.aClass4_Sub17Array3);
					}
					local377 = local341.method6304(Static367.aClass30_20);
					if (local377 != null) {
						local377.aClass11_1 = local341;
						local377.anInt5028 = local12;
						local377.anInt5032 = local6;
						local377.anInt5029 = local9;
						Static224.aClass273_1.method6247(local377);
					}
					if (local341.aBoolean584) {
						Static367.aClass30_20.PA(3000.0F, local53 * 1.5F);
					}
				}
			}
			local406 = 0;
			local408 = 0;
			local411 = arg1.aClass11_Sub2_2;
			@Pc(414) Class11_Sub3 local414 = arg1.aClass11_Sub3_1;
			if (local411 != null || local414 != null) {
				if (Static243.anInt4735 == local6) {
					local406++;
				} else if (Static243.anInt4735 < local6) {
					local406 += 2;
				}
				if (Static140.anInt2891 == local9) {
					local406 += 3;
				} else if (Static140.anInt2891 > local9) {
					local406 += 6;
				}
				local408 = Static181.anIntArray286[local406];
				arg1.aShort54 = Static234.aShortArray73[local406];
			}
			if (local411 != null) {
				if ((local411.anInt7828 & Static76.anIntArray128[local406]) == 0) {
					arg1.aByte56 = 0;
				} else if (local411.anInt7828 == 16) {
					arg1.aByte56 = 3;
					arg1.aByte60 = Static181.aByteArray52[local406];
					arg1.aByte58 = (byte) (3 - arg1.aByte60);
				} else if (local411.anInt7828 == 32) {
					arg1.aByte56 = 6;
					arg1.aByte60 = Static138.aByteArray31[local406];
					arg1.aByte58 = (byte) (6 - arg1.aByte60);
				} else if (local411.anInt7828 == 64) {
					arg1.aByte56 = 12;
					arg1.aByte60 = Static299.aByteArray78[local406];
					arg1.aByte58 = (byte) (12 - arg1.aByte60);
				} else {
					arg1.aByte56 = 9;
					arg1.aByte60 = Static157.aByteArray35[local406];
					arg1.aByte58 = (byte) (9 - arg1.aByte60);
				}
				if ((local411.anInt7828 & local408) != 0 && !Static434.method5971(local15, local6, local9, local411.anInt7828)) {
					if (Static111.aBoolean166) {
						Static418.method2680(arg0, local12, local6, local9);
						Static367.aClass30_20.method2081(arg0.anInt5190, arg0.aClass4_Sub17Array3);
					}
					@Pc(563) Class71_Sub3 local563 = local411.method6304(Static367.aClass30_20);
					if (local563 != null) {
						local563.aClass11_1 = local411;
						local563.anInt5028 = local12;
						local563.anInt5032 = local6;
						local563.anInt5029 = local9;
						Static224.aClass273_1.method6247(local563);
					}
				}
				@Pc(584) Class11_Sub2 local584 = arg1.aClass11_Sub2_1;
				if (local584 != null && (local584.anInt7828 & local408) != 0 && !Static434.method5971(local15, local6, local9, local584.anInt7828)) {
					if (Static111.aBoolean166) {
						Static418.method2680(arg0, local12, local6, local9);
						Static367.aClass30_20.method2081(arg0.anInt5190, arg0.aClass4_Sub17Array3);
					}
					local616 = local584.method6304(Static367.aClass30_20);
					if (local616 != null) {
						local616.aClass11_1 = local584;
						local616.anInt5028 = local12;
						local616.anInt5032 = local6;
						local616.anInt5029 = local9;
						Static224.aClass273_1.method6247(local616);
					}
				}
			}
			if (local414 != null && !Static133.method2460(local15, local6, local9, local414.method5439())) {
				@Pc(647) Class11_Sub3 local647 = arg1.aClass11_Sub3_2;
				Static367.aClass30_20.PA(3000.0F, (local53 - 0.5F) * 1.5F);
				if ((local414.anInt6740 & local408) != 0) {
					if (Static111.aBoolean166) {
						Static418.method2680(arg0, local12, local6, local9);
						Static367.aClass30_20.method2081(arg0.anInt5190, arg0.aClass4_Sub17Array3);
					}
					local616 = local414.method6304(Static367.aClass30_20);
					if (local616 != null) {
						local616.aClass11_1 = local414;
						local616.anInt5028 = local12;
						local616.anInt5032 = local6;
						local616.anInt5029 = local9;
						Static224.aClass273_1.method6247(local616);
					}
				} else if (local414.anInt6740 == 256) {
					local706 = local414.anInt6734 - Static203.anInt4178;
					local711 = local414.anInt6733 - Static332.anInt5918;
					local714 = local414.anInt6728;
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
					if (Static111.aBoolean166) {
						Static418.method2680(arg0, local12, local6, local9);
						Static367.aClass30_20.method2081(arg0.anInt5190, arg0.aClass4_Sub17Array3);
					}
					@Pc(759) Class71_Sub3 local759;
					if (local735 < local723) {
						local759 = local414.method6304(Static367.aClass30_20);
						if (local759 != null) {
							local759.aClass11_1 = local414;
							local759.anInt5028 = local12;
							local759.anInt5032 = local6;
							local759.anInt5029 = local9;
							Static224.aClass273_1.method6247(local759);
						}
					} else if (local647 != null) {
						local759 = local647.method6304(Static367.aClass30_20);
						if (local759 != null) {
							local759.aClass11_1 = local647;
							local759.anInt5028 = local12;
							local759.anInt5032 = local6;
							local759.anInt5029 = local9;
							Static224.aClass273_1.method6247(local759);
						}
					}
				}
				Static367.aClass30_20.PA(3000.0F, local53 * 1.5F);
			}
			if (local330) {
				@Pc(814) Class11_Sub1 local814 = arg1.aClass11_Sub1_2;
				if (local814 != null && !local814.aBoolean585) {
					if (local814.aBoolean584) {
						Static367.aClass30_20.PA(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static111.aBoolean166) {
						Static418.method2680(arg0, local12, local6, local9);
						Static367.aClass30_20.method2081(arg0.anInt5190, arg0.aClass4_Sub17Array3);
					}
					local616 = local814.method6304(Static367.aClass30_20);
					if (local616 != null) {
						local616.aClass11_1 = local814;
						local616.anInt5028 = local12;
						local616.anInt5032 = local6;
						local616.anInt5029 = local9;
						Static224.aClass273_1.method6247(local616);
					}
					if (local814.aBoolean584) {
						Static367.aClass30_20.PA(3000.0F, local53 * 1.5F);
					}
				}
				@Pc(880) Class11_Sub4 local880 = arg1.aClass11_Sub4_1;
				if (local880 != null && !local880.aBoolean121) {
					if (Static111.aBoolean166) {
						Static418.method2680(arg0, local12, local6, local9);
						Static367.aClass30_20.method2081(arg0.anInt5190, arg0.aClass4_Sub17Array3);
					}
					@Pc(903) Class71_Sub3 local903 = local880.method6304(Static367.aClass30_20);
					if (local903 != null) {
						local903.aClass11_1 = local880;
						local903.anInt5028 = local12;
						local903.anInt5032 = local6;
						local903.anInt5029 = local9;
						Static224.aClass273_1.method6247(local903);
					}
				}
			}
			@Pc(924) byte local924 = arg1.aByte62;
			if (local924 != 0) {
				@Pc(941) Class162 local941;
				if (local6 < Static243.anInt4735 && (local924 & 0x4) != 0) {
					local941 = local31[local6 + 1][local9];
					if (local941 != null && local941.aBoolean330) {
						Static180.aClass32_1.method5958(local941);
					}
				}
				if (local9 < Static140.anInt2891 && (local924 & 0x2) != 0) {
					local941 = local31[local6][local9 + 1];
					if (local941 != null && local941.aBoolean330) {
						Static180.aClass32_1.method5958(local941);
					}
				}
				if (local6 > Static243.anInt4735 && (local924 & 0x1) != 0) {
					local941 = local31[local6 - 1][local9];
					if (local941 != null && local941.aBoolean330) {
						Static180.aClass32_1.method5958(local941);
					}
				}
				if (local9 > Static140.anInt2891 && (local924 & 0x8) != 0) {
					local941 = local31[local6][local9 - 1];
					if (local941 != null && local941.aBoolean330) {
						Static180.aClass32_1.method5958(local941);
					}
				}
			}
		}
		@Pc(1074) int local1074;
		@Pc(1057) Class11_Sub2 local1057;
		@Pc(1078) int local1078;
		@Pc(1030) Class199 local1030;
		if (arg1.aByte56 != 0) {
			local330 = true;
			for (local1030 = arg1.aClass199_1; local1030 != null; local1030 = local1030.aClass199_2) {
				if (local1030.aClass11_Sub5_1.anInt7513 != Static290.anInt5373 && (local1030.anInt5745 & arg1.aByte56) == arg1.aByte60) {
					local330 = false;
					break;
				}
			}
			if (local330) {
				local1057 = arg1.aClass11_Sub2_2;
				if (!Static434.method5971(local15, local6, local9, local1057.anInt7828)) {
					if (Static111.aBoolean166) {
						label682: {
							if (local1057.anInt7828 >= 16) {
								local1074 = local6 - Static243.anInt4735;
								local1078 = local9 - Static140.anInt2891;
								if (local1057.anInt7828 == 16) {
									local1074 -= Static423.anInt7318;
									local1078 += Static423.anInt7318;
									if (local1078 < local1074 && local6 > 0 && local9 <= Static268.anInt5106) {
										Static418.method2680(arg0, local12, local6 - 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt7828 == 32) {
									local1074 += Static423.anInt7318;
									local1078 += Static423.anInt7318;
									if (local1078 < -local1074 && local6 < Static230.anInt4581 && local9 < Static268.anInt5106) {
										Static418.method2680(arg0, local12, local6 + 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt7828 == 64) {
									local1074 += Static423.anInt7318;
									local1078 -= Static423.anInt7318;
									if (local1078 > local1074 && local6 < Static230.anInt4581 && local9 > 0) {
										Static418.method2680(arg0, local12, local6 + 1, local9 - 1);
										break label682;
									}
								} else if (local1057.anInt7828 == 128) {
									local1074 -= Static423.anInt7318;
									local1078 -= Static423.anInt7318;
									if (local1078 > -local1074 && local6 > 0 && local9 > 0) {
										Static418.method2680(arg0, local12, local6 - 1, local9 - 1);
										break label682;
									}
								}
							}
							Static418.method2680(arg0, local12, local6, local9);
						}
						Static367.aClass30_20.method2081(arg0.anInt5190, arg0.aClass4_Sub17Array3);
					}
					@Pc(1216) Class71_Sub3 local1216 = local1057.method6304(Static367.aClass30_20);
					if (local1216 != null) {
						local1216.aClass11_1 = local1057;
						local1216.anInt5028 = local12;
						local1216.anInt5032 = local6;
						local1216.anInt5029 = local9;
						Static224.aClass273_1.method6247(local1216);
					}
				}
				arg1.aByte56 = 0;
			}
		}
		@Pc(1333) int local1333;
		if (arg1.aBoolean329) {
			try {
				arg1.aBoolean329 = false;
				@Pc(1245) int local1245 = 0;
				label625: for (local1030 = arg1.aClass199_1; local1030 != null; local1030 = local1030.aClass199_2) {
					@Pc(1252) Class11_Sub5 local1252 = local1030.aClass11_Sub5_1;
					if (local1252.anInt7513 != Static290.anInt5373) {
						for (local1074 = local1252.aShort95; local1074 <= local1252.aShort94; local1074++) {
							for (local1078 = local1252.aShort93; local1078 <= local1252.aShort92; local1078++) {
								@Pc(1270) Class162 local1270 = local31[local1074][local1078];
								if (local1270.aBoolean331) {
									arg1.aBoolean329 = true;
									continue label625;
								}
								if (local1270.aByte56 != 0) {
									local706 = 0;
									if (local1074 > local1252.aShort95) {
										local706++;
									}
									if (local1074 < local1252.aShort94) {
										local706 += 4;
									}
									if (local1078 > local1252.aShort93) {
										local706 += 8;
									}
									if (local1078 < local1252.aShort92) {
										local706 += 2;
									}
									if ((local706 & local1270.aByte56) == arg1.aByte58) {
										arg1.aBoolean329 = true;
										continue label625;
									}
								}
							}
						}
						local1078 = Static243.anInt4735 - local1252.aShort95;
						local1333 = local1252.aShort94 - Static243.anInt4735;
						if (local1333 > local1078) {
							local1078 = local1333;
						}
						local706 = Static140.anInt2891 - local1252.aShort93;
						local711 = local1252.aShort92 - Static140.anInt2891;
						if (local711 > local706) {
							local706 = local711;
						}
						arg0.aClass11_Sub5Array3[local1245] = local1252;
						arg0.anIntArray399[local1245++] = local1078 + local706;
					}
				}
				while (local1245 > 0) {
					local408 = -50;
					local1074 = -1;
					@Pc(1384) Class11_Sub5 local1384;
					for (local1078 = 0; local1078 < local1245; local1078++) {
						local1384 = arg0.aClass11_Sub5Array3[local1078];
						if (local1384.anInt7513 != Static290.anInt5373) {
							local706 = arg0.anIntArray399[local1078];
							if (local706 > local408) {
								local408 = local706;
								local1074 = local1078;
							} else if (local706 == local408) {
								local711 = local1384.anInt7514 - Static203.anInt4178;
								local714 = local1384.anInt7515 - Static332.anInt5918;
								local723 = arg0.aClass11_Sub5Array3[local1074].anInt7514 - Static203.anInt4178;
								local735 = arg0.aClass11_Sub5Array3[local1074].anInt7515 - Static332.anInt5918;
								if (local711 * local711 + local714 * local714 > local723 * local723 + local735 * local735) {
									local1074 = local1078;
								}
							}
						}
					}
					if (local1074 == -1) {
						break;
					}
					local1384 = arg0.aClass11_Sub5Array3[local1074];
					local1384.anInt7513 = Static290.anInt5373;
					if (!Static171.method3015(local15, local1384.aShort95, local1384.aShort94, local1384.aShort93, local1384.aShort92, local1384.method6044())) {
						if (Static111.aBoolean166) {
							if (local1384.aByte101 == 0) {
								Static57.method1247(arg0, local12, local1384.aShort95, local1384.aShort93, local1384.aShort94, local1384.aShort92);
							} else {
								Static418.method2680(arg0, local12, local6, local9);
								local706 = local6 - Static243.anInt4735;
								local711 = local9 - Static140.anInt2891;
								if (local1384.aByte101 == 2) {
									if (local711 > -local706) {
										Static37.method758(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static37.method758(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local711 > local706) {
									Static37.method758(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static37.method758(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static367.aClass30_20.method2081(arg0.anInt5190, arg0.aClass4_Sub17Array3);
						}
						local616 = local1384.method6304(Static367.aClass30_20);
						if (local616 != null) {
							local616.aClass11_1 = local1384;
							local616.anInt5028 = local12;
							local616.anInt5032 = local1384.aShort95;
							local616.anInt5029 = local1384.aShort93;
							Static224.aClass273_1.method6247(local616);
						}
					}
					for (local706 = local1384.aShort95; local706 <= local1384.aShort94; local706++) {
						for (local711 = local1384.aShort93; local711 <= local1384.aShort92; local711++) {
							@Pc(1609) Class162 local1609 = local31[local706][local711];
							if (local1609.aByte56 != 0) {
								Static180.aClass32_1.method5958(local1609);
							} else if ((local706 != local6 || local711 != local9) && local1609.aBoolean330) {
								Static180.aClass32_1.method5958(local1609);
							}
						}
					}
				}
				if (arg1.aBoolean329) {
					return;
				}
			} catch (@Pc(1647) Exception local1647) {
				arg1.aBoolean329 = false;
			}
		}
		if (arg1.aClass270_1 != null && arg1.aByte57 == (byte) (Static185.anInt3762 & 0xFF)) {
			@Pc(1664) Class270 local1664 = arg1.aClass270_1;
			local406 = Static389.aClass14Array3[local12].oa(local6, local9);
			if (local12 < Static227.anInt4511 - 1) {
				local408 = Static389.aClass14Array3[local12].oa(local6, local9) - Static389.aClass14Array3[local12 + 1].oa(local6, local9);
			} else {
				local408 = 0x8 << Static391.anInt6797;
			}
			Static253.aClass72_4.method3308(local21, local406, local27, arg0.anIntArray398);
			local1074 = arg0.anIntArray398[2];
			Static253.aClass72_4.method3308(local21, local406 - local408, local27, arg0.anIntArray398);
			local1078 = arg0.anIntArray398[2];
			local1333 = local1074;
			local706 = local1078;
			if (local1074 > local1078) {
				local1333 = local1078;
				local706 = local1074;
			}
			local1333 -= Static196.anInt7580;
			local706 += Static196.anInt7580;
			local1664.anInt7770 = local1333;
			local1664.anInt7771 = local706;
			local1664.aBoolean567 = true;
			Static367.aClass30_20.method2085(local1664);
		}
		if (!arg1.aBoolean330) {
			return;
		}
		if (arg1.aByte56 != 0) {
			return;
		}
		if (local6 <= Static243.anInt4735 && local6 > Static440.anInt7506) {
			local86 = local31[local6 - 1][local9];
			if (local86 != null && local86.aBoolean330) {
				return;
			}
		}
		if (local6 >= Static243.anInt4735 && local6 < Static54.anInt1311 - 1) {
			local86 = local31[local6 + 1][local9];
			if (local86 != null && local86.aBoolean330) {
				return;
			}
		}
		if (local9 <= Static140.anInt2891 && local9 > Static412.anInt7172) {
			local86 = local31[local6][local9 - 1];
			if (local86 != null && local86.aBoolean330) {
				return;
			}
		}
		if (local9 >= Static140.anInt2891 && local9 < Static206.anInt4217 - 1) {
			local86 = local31[local6][local9 + 1];
			if (local86 != null && local86.aBoolean330) {
				return;
			}
		}
		arg1.aBoolean330 = false;
		Static183.anInt3715--;
		@Pc(1855) Class11_Sub4 local1855 = arg1.aClass11_Sub4_1;
		if (local1855 != null && local1855.aBoolean121) {
			if (Static111.aBoolean166) {
				Static418.method2680(arg0, local12, local6, local9);
				Static367.aClass30_20.method2081(arg0.anInt5190, arg0.aClass4_Sub17Array3);
			}
			@Pc(1878) Class71_Sub3 local1878 = local1855.method6304(Static367.aClass30_20);
			if (local1878 != null) {
				local1878.aClass11_1 = local1855;
				local1878.anInt5028 = local12;
				local1878.anInt5032 = local6;
				local1878.anInt5029 = local9;
				Static224.aClass273_1.method6247(local1878);
			}
		}
		if (arg1.aShort54 != 0) {
			@Pc(1902) Class11_Sub3 local1902 = arg1.aClass11_Sub3_1;
			if (local1902 != null && !Static133.method2460(local15, local6, local9, local1902.method5439())) {
				if ((local1902.anInt6740 & arg1.aShort54) != 0) {
					if (Static111.aBoolean166) {
						Static418.method2680(arg0, local12, local6, local9);
						Static367.aClass30_20.method2081(arg0.anInt5190, arg0.aClass4_Sub17Array3);
					}
					local377 = local1902.method6304(Static367.aClass30_20);
					if (local377 != null) {
						local377.aClass11_1 = local1902;
						local377.anInt5028 = local12;
						local377.anInt5032 = local6;
						local377.anInt5029 = local9;
						Static224.aClass273_1.method6247(local377);
					}
				} else if (local1902.anInt6740 == 256) {
					local408 = local1902.anInt6734 - Static203.anInt4178;
					local1074 = local1902.anInt6733 - Static332.anInt5918;
					local1078 = local1902.anInt6728;
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
					if (Static111.aBoolean166) {
						Static418.method2680(arg0, local12, local6, local9);
						Static367.aClass30_20.method2081(arg0.anInt5190, arg0.aClass4_Sub17Array3);
					}
					@Pc(2012) Class11_Sub3 local2012 = arg1.aClass11_Sub3_2;
					@Pc(2020) Class71_Sub3 local2020;
					if (local706 > local1333) {
						local2020 = local1902.method6304(Static367.aClass30_20);
						if (local2020 != null) {
							local2020.aClass11_1 = local1902;
							local2020.anInt5028 = local12;
							local2020.anInt5032 = local6;
							local2020.anInt5029 = local9;
							Static224.aClass273_1.method6247(local2020);
						}
					} else if (local2012 != null) {
						local2020 = local2012.method6304(Static367.aClass30_20);
						if (local2020 != null) {
							local2020.aClass11_1 = local2012;
							local2020.anInt5028 = local12;
							local2020.anInt5032 = local6;
							local2020.anInt5029 = local9;
							Static224.aClass273_1.method6247(local2020);
						}
					}
				}
			}
			local1057 = arg1.aClass11_Sub2_2;
			local411 = arg1.aClass11_Sub2_1;
			@Pc(2105) Class71_Sub3 local2105;
			if (local411 != null && (local411.anInt7828 & arg1.aShort54) != 0 && !Static434.method5971(local15, local6, local9, local411.anInt7828)) {
				if (Static111.aBoolean166) {
					Static372.method5273(arg0, local411.anInt7828, local12, local6, local9);
					Static367.aClass30_20.method2081(arg0.anInt5190, arg0.aClass4_Sub17Array3);
				}
				local2105 = local411.method6304(Static367.aClass30_20);
				if (local2105 != null) {
					local2105.aClass11_1 = local411;
					local2105.anInt5028 = local12;
					local2105.anInt5032 = local6;
					local2105.anInt5029 = local9;
					Static224.aClass273_1.method6247(local2105);
				}
			}
			if (local1057 != null && (local1057.anInt7828 & arg1.aShort54) != 0 && !Static434.method5971(local15, local6, local9, local1057.anInt7828)) {
				if (Static111.aBoolean166) {
					Static372.method5273(arg0, local1057.anInt7828, local12, local6, local9);
					Static367.aClass30_20.method2081(arg0.anInt5190, arg0.aClass4_Sub17Array3);
				}
				local2105 = local1057.method6304(Static367.aClass30_20);
				if (local2105 != null) {
					local2105.aClass11_1 = local1057;
					local2105.anInt5028 = local12;
					local2105.anInt5032 = local6;
					local2105.anInt5029 = local9;
					Static224.aClass273_1.method6247(local2105);
				}
			}
		}
		@Pc(2191) Class162 local2191;
		if (local12 < Static227.anInt4511 - 1) {
			local2191 = Static294.aClass162ArrayArrayArray2[local12 + 1][local6][local9];
			if (local2191 != null && local2191.aBoolean330) {
				Static180.aClass32_1.method5966(local2191);
			}
		}
		if (local6 < Static243.anInt4735) {
			local2191 = local31[local6 + 1][local9];
			if (local2191 != null && local2191.aBoolean330) {
				Static180.aClass32_1.method5958(local2191);
			}
		}
		if (local9 < Static140.anInt2891) {
			local2191 = local31[local6][local9 + 1];
			if (local2191 != null && local2191.aBoolean330) {
				Static180.aClass32_1.method5958(local2191);
			}
		}
		if (local6 > Static243.anInt4735) {
			local2191 = local31[local6 - 1][local9];
			if (local2191 != null && local2191.aBoolean330) {
				Static180.aClass32_1.method5958(local2191);
			}
		}
		if (local9 > Static140.anInt2891) {
			local2191 = local31[local6][local9 - 1];
			if (local2191 != null && local2191.aBoolean330) {
				Static180.aClass32_1.method5958(local2191);
			}
		}
	}
}
