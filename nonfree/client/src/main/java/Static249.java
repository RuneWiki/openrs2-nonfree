import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
	public static int anInt4822;

	@OriginalMember(owner = "client!mh", name = "o", descriptor = "I")
	public static int anInt4828;

	@OriginalMember(owner = "client!mh", name = "T", descriptor = "I")
	public static int anInt4852;

	@OriginalMember(owner = "client!mh", name = "sb", descriptor = "F")
	public static float aFloat65;

	@OriginalMember(owner = "client!mh", name = "N", descriptor = "I")
	public static int anInt4847 = -1;

	@OriginalMember(owner = "client!mh", name = "R", descriptor = "[I")
	public static final int[] anIntArray464 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)V")
	public static void method3728() {
		Static25.aClass137_1 = null;
		Static348.anInt6432 = -1;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!pt;Lclient!ut;)V")
	public static void method3736(@OriginalArg(0) Class54 arg0, @OriginalArg(1) Class252 arg1) {
		if (!arg1.aBoolean478) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort101;
		@Pc(9) short local9 = arg1.aShort99;
		@Pc(12) byte local12 = arg1.aByte95;
		@Pc(15) byte local15 = arg1.aByte100;
		@Pc(21) int local21 = (local6 << Static198.anInt7947) + Static333.anInt6111;
		@Pc(27) int local27 = (local9 << Static198.anInt7947) + Static333.anInt6111;
		@Pc(31) Class252[][] local31 = Static67.aClass252ArrayArrayArray2[local12];
		@Pc(53) float local53;
		if (Static221.aClass96Array4 == Static396.aClass96Array5) {
			Static227.aClass106_8.a(Static262.aClass96Array3[0].ca(local21, local27), Static172.method2873(local6, local9), Static366.method5109(local6, local9), Static64.method1239(local6, local9));
			local53 = 251.5F;
		} else {
			local53 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static227.aClass106_8.da(3000.0F, local53 * 1.5F);
		@Pc(86) Class252 local86;
		@Pc(616) Class41_Sub7 local616;
		@Pc(711) int local711;
		@Pc(714) int local714;
		@Pc(723) int local723;
		@Pc(735) int local735;
		@Pc(406) int local406;
		@Pc(330) boolean local330;
		@Pc(377) Class41_Sub7 local377;
		@Pc(408) int local408;
		@Pc(411) Class30_Sub3 local411;
		@Pc(706) int local706;
		if (arg1.aBoolean480) {
			if (Static376.aBoolean433) {
				if (local12 > 0) {
					local86 = Static67.aClass252ArrayArrayArray2[local12 - 1][local6][local9];
					if (local86 != null && local86.aBoolean478) {
						return;
					}
				}
				if (local6 <= Static166.anInt3464 && local6 > Static329.anInt6070) {
					local86 = local31[local6 - 1][local9];
					if (local86 != null && local86.aBoolean478 && (local86.aBoolean480 || (arg1.aByte98 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static166.anInt3464 && local6 < Static182.anInt3942 - 1) {
					local86 = local31[local6 + 1][local9];
					if (local86 != null && local86.aBoolean478 && (local86.aBoolean480 || (arg1.aByte98 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static31.anInt2066 && local9 > Static272.anInt5271) {
					local86 = local31[local6][local9 - 1];
					if (local86 != null && local86.aBoolean478 && (local86.aBoolean480 || (arg1.aByte98 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static31.anInt2066 && local9 < Static418.anInt7456 - 1) {
					local86 = local31[local6][local9 + 1];
					if (local86 != null && local86.aBoolean478 && (local86.aBoolean480 || (arg1.aByte98 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static376.aBoolean433 = true;
			}
			arg1.aBoolean480 = false;
			if (arg1.aClass252_1 != null) {
				local86 = arg1.aClass252_1;
				Static227.aClass106_8.da(3000.0F, (201.5F - (float) (local86.aByte100 + 1) * 50.0F) * 1.5F);
				if (!Static215.method3366(local86.aByte100, local6, local9)) {
					Static396.aClass96Array5[local86.aByte100].method4432(local6, local9);
				}
				@Pc(249) Class30_Sub3 local249 = local86.aClass30_Sub3_3;
				if (local249 != null) {
					if (Static421.aBoolean482) {
						if ((local249.anInt5441 & arg1.aShort100) == 0) {
							Static280.method4119(arg0, local12, local6, local9);
						} else {
							Static409.method5567(arg0, local249.anInt5441, local15, local6, local9);
						}
						Static227.aClass106_8.method5956(arg0.anInt1886, arg0.aClass1_Sub4Array2);
					}
					local249.method5722(Static227.aClass106_8);
				}
				for (@Pc(286) Class208 local286 = local86.aClass208_3; local286 != null; local286 = local286.aClass208_2) {
					@Pc(290) Class30_Sub1 local290 = local286.aClass30_Sub1_1;
					if (local290 != null) {
						if (Static421.aBoolean482) {
							Static280.method4119(arg0, local12, local6, local9);
							Static227.aClass106_8.method5956(arg0.anInt1886, arg0.aClass1_Sub4Array2);
						}
						local290.method5722(Static227.aClass106_8);
					}
				}
				Static227.aClass106_8.da(3000.0F, local53 * 1.5F);
			}
			local330 = !Static215.method3366(local15, local6, local9);
			if (local330) {
				Static396.aClass96Array5[local15].method4432(local6, local9);
				@Pc(341) Class30_Sub4 local341 = arg1.aClass30_Sub4_2;
				if (local341 != null && local341.aBoolean323) {
					if (local341.aBoolean325) {
						Static227.aClass106_8.da(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static421.aBoolean482) {
						Static280.method4119(arg0, local12, local6, local9);
						Static227.aClass106_8.method5956(arg0.anInt1886, arg0.aClass1_Sub4Array2);
					}
					local377 = local341.method5722(Static227.aClass106_8);
					if (local377 != null) {
						local377.aClass30_1 = local341;
						local377.anInt6865 = local12;
						local377.anInt6869 = local6;
						local377.anInt6867 = local9;
						Static43.aClass117_2.method2961(local377);
					}
					if (local341.aBoolean325) {
						Static227.aClass106_8.da(3000.0F, local53 * 1.5F);
					}
				}
			}
			local406 = 0;
			local408 = 0;
			local411 = arg1.aClass30_Sub3_3;
			@Pc(414) Class30_Sub2 local414 = arg1.aClass30_Sub2_2;
			if (local411 != null || local414 != null) {
				if (Static166.anInt3464 == local6) {
					local406++;
				} else if (Static166.anInt3464 < local6) {
					local406 += 2;
				}
				if (Static31.anInt2066 == local9) {
					local406 += 3;
				} else if (Static31.anInt2066 > local9) {
					local406 += 6;
				}
				local408 = Static149.anIntArray328[local406];
				arg1.aShort100 = Static304.aShortArray99[local406];
			}
			if (local411 != null) {
				if ((local411.anInt5441 & Static48.anIntArray121[local406]) == 0) {
					arg1.aByte99 = 0;
				} else if (local411.anInt5441 == 16) {
					arg1.aByte99 = 3;
					arg1.aByte101 = Static262.aByteArray38[local406];
					arg1.aByte97 = (byte) (3 - arg1.aByte101);
				} else if (local411.anInt5441 == 32) {
					arg1.aByte99 = 6;
					arg1.aByte101 = Static435.aByteArray91[local406];
					arg1.aByte97 = (byte) (6 - arg1.aByte101);
				} else if (local411.anInt5441 == 64) {
					arg1.aByte99 = 12;
					arg1.aByte101 = Static87.aByteArray23[local406];
					arg1.aByte97 = (byte) (12 - arg1.aByte101);
				} else {
					arg1.aByte99 = 9;
					arg1.aByte101 = Static112.aByteArray35[local406];
					arg1.aByte97 = (byte) (9 - arg1.aByte101);
				}
				if ((local411.anInt5441 & local408) != 0 && !Static7.method85(local15, local6, local9, local411.anInt5441)) {
					if (Static421.aBoolean482) {
						Static280.method4119(arg0, local12, local6, local9);
						Static227.aClass106_8.method5956(arg0.anInt1886, arg0.aClass1_Sub4Array2);
					}
					@Pc(563) Class41_Sub7 local563 = local411.method5722(Static227.aClass106_8);
					if (local563 != null) {
						local563.aClass30_1 = local411;
						local563.anInt6865 = local12;
						local563.anInt6869 = local6;
						local563.anInt6867 = local9;
						Static43.aClass117_2.method2961(local563);
					}
				}
				@Pc(584) Class30_Sub3 local584 = arg1.aClass30_Sub3_2;
				if (local584 != null && (local584.anInt5441 & local408) != 0 && !Static7.method85(local15, local6, local9, local584.anInt5441)) {
					if (Static421.aBoolean482) {
						Static280.method4119(arg0, local12, local6, local9);
						Static227.aClass106_8.method5956(arg0.anInt1886, arg0.aClass1_Sub4Array2);
					}
					local616 = local584.method5722(Static227.aClass106_8);
					if (local616 != null) {
						local616.aClass30_1 = local584;
						local616.anInt6865 = local12;
						local616.anInt6869 = local6;
						local616.anInt6867 = local9;
						Static43.aClass117_2.method2961(local616);
					}
				}
			}
			if (local414 != null && !Static82.method1509(local15, local6, local9, local414.method5620())) {
				@Pc(647) Class30_Sub2 local647 = arg1.aClass30_Sub2_3;
				Static227.aClass106_8.da(3000.0F, (local53 - 0.5F) * 1.5F);
				if ((local414.anInt7377 & local408) != 0) {
					if (Static421.aBoolean482) {
						Static280.method4119(arg0, local12, local6, local9);
						Static227.aClass106_8.method5956(arg0.anInt1886, arg0.aClass1_Sub4Array2);
					}
					local616 = local414.method5722(Static227.aClass106_8);
					if (local616 != null) {
						local616.aClass30_1 = local414;
						local616.anInt6865 = local12;
						local616.anInt6869 = local6;
						local616.anInt6867 = local9;
						Static43.aClass117_2.method2961(local616);
					}
				} else if (local414.anInt7377 == 256) {
					local706 = local414.anInt7376 - Static17.anInt393;
					local711 = local414.anInt7385 - Static237.anInt4683;
					local714 = local414.anInt7382;
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
					if (Static421.aBoolean482) {
						Static280.method4119(arg0, local12, local6, local9);
						Static227.aClass106_8.method5956(arg0.anInt1886, arg0.aClass1_Sub4Array2);
					}
					@Pc(759) Class41_Sub7 local759;
					if (local735 < local723) {
						local759 = local414.method5722(Static227.aClass106_8);
						if (local759 != null) {
							local759.aClass30_1 = local414;
							local759.anInt6865 = local12;
							local759.anInt6869 = local6;
							local759.anInt6867 = local9;
							Static43.aClass117_2.method2961(local759);
						}
					} else if (local647 != null) {
						local759 = local647.method5722(Static227.aClass106_8);
						if (local759 != null) {
							local759.aClass30_1 = local647;
							local759.anInt6865 = local12;
							local759.anInt6869 = local6;
							local759.anInt6867 = local9;
							Static43.aClass117_2.method2961(local759);
						}
					}
				}
				Static227.aClass106_8.da(3000.0F, local53 * 1.5F);
			}
			if (local330) {
				@Pc(814) Class30_Sub4 local814 = arg1.aClass30_Sub4_2;
				if (local814 != null && !local814.aBoolean323) {
					if (local814.aBoolean325) {
						Static227.aClass106_8.da(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static421.aBoolean482) {
						Static280.method4119(arg0, local12, local6, local9);
						Static227.aClass106_8.method5956(arg0.anInt1886, arg0.aClass1_Sub4Array2);
					}
					local616 = local814.method5722(Static227.aClass106_8);
					if (local616 != null) {
						local616.aClass30_1 = local814;
						local616.anInt6865 = local12;
						local616.anInt6869 = local6;
						local616.anInt6867 = local9;
						Static43.aClass117_2.method2961(local616);
					}
					if (local814.aBoolean325) {
						Static227.aClass106_8.da(3000.0F, local53 * 1.5F);
					}
				}
				@Pc(880) Class30_Sub5 local880 = arg1.aClass30_Sub5_1;
				if (local880 != null && !local880.aBoolean407) {
					if (Static421.aBoolean482) {
						Static280.method4119(arg0, local12, local6, local9);
						Static227.aClass106_8.method5956(arg0.anInt1886, arg0.aClass1_Sub4Array2);
					}
					@Pc(903) Class41_Sub7 local903 = local880.method5722(Static227.aClass106_8);
					if (local903 != null) {
						local903.aClass30_1 = local880;
						local903.anInt6865 = local12;
						local903.anInt6869 = local6;
						local903.anInt6867 = local9;
						Static43.aClass117_2.method2961(local903);
					}
				}
			}
			@Pc(924) byte local924 = arg1.aByte98;
			if (local924 != 0) {
				@Pc(941) Class252 local941;
				if (local6 < Static166.anInt3464 && (local924 & 0x4) != 0) {
					local941 = local31[local6 + 1][local9];
					if (local941 != null && local941.aBoolean478) {
						Static47.aClass9_3.method6064(local941);
					}
				}
				if (local9 < Static31.anInt2066 && (local924 & 0x2) != 0) {
					local941 = local31[local6][local9 + 1];
					if (local941 != null && local941.aBoolean478) {
						Static47.aClass9_3.method6064(local941);
					}
				}
				if (local6 > Static166.anInt3464 && (local924 & 0x1) != 0) {
					local941 = local31[local6 - 1][local9];
					if (local941 != null && local941.aBoolean478) {
						Static47.aClass9_3.method6064(local941);
					}
				}
				if (local9 > Static31.anInt2066 && (local924 & 0x8) != 0) {
					local941 = local31[local6][local9 - 1];
					if (local941 != null && local941.aBoolean478) {
						Static47.aClass9_3.method6064(local941);
					}
				}
			}
		}
		@Pc(1074) int local1074;
		@Pc(1057) Class30_Sub3 local1057;
		@Pc(1078) int local1078;
		@Pc(1030) Class208 local1030;
		if (arg1.aByte99 != 0) {
			local330 = true;
			for (local1030 = arg1.aClass208_3; local1030 != null; local1030 = local1030.aClass208_2) {
				if (local1030.aClass30_Sub1_1.anInt7489 != Static291.anInt7494 && (local1030.anInt6086 & arg1.aByte99) == arg1.aByte101) {
					local330 = false;
					break;
				}
			}
			if (local330) {
				local1057 = arg1.aClass30_Sub3_3;
				if (!Static7.method85(local15, local6, local9, local1057.anInt5441)) {
					if (Static421.aBoolean482) {
						label682: {
							if (local1057.anInt5441 >= 16) {
								local1074 = local6 - Static166.anInt3464;
								local1078 = local9 - Static31.anInt2066;
								if (local1057.anInt5441 == 16) {
									local1074 -= Static333.anInt6111;
									local1078 += Static333.anInt6111;
									if (local1078 < local1074 && local6 > 0 && local9 <= Static198.anInt7949) {
										Static280.method4119(arg0, local12, local6 - 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt5441 == 32) {
									local1074 += Static333.anInt6111;
									local1078 += Static333.anInt6111;
									if (local1078 < -local1074 && local6 < Static216.anInt4346 && local9 < Static198.anInt7949) {
										Static280.method4119(arg0, local12, local6 + 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt5441 == 64) {
									local1074 += Static333.anInt6111;
									local1078 -= Static333.anInt6111;
									if (local1078 > local1074 && local6 < Static216.anInt4346 && local9 > 0) {
										Static280.method4119(arg0, local12, local6 + 1, local9 - 1);
										break label682;
									}
								} else if (local1057.anInt5441 == 128) {
									local1074 -= Static333.anInt6111;
									local1078 -= Static333.anInt6111;
									if (local1078 > -local1074 && local6 > 0 && local9 > 0) {
										Static280.method4119(arg0, local12, local6 - 1, local9 - 1);
										break label682;
									}
								}
							}
							Static280.method4119(arg0, local12, local6, local9);
						}
						Static227.aClass106_8.method5956(arg0.anInt1886, arg0.aClass1_Sub4Array2);
					}
					@Pc(1216) Class41_Sub7 local1216 = local1057.method5722(Static227.aClass106_8);
					if (local1216 != null) {
						local1216.aClass30_1 = local1057;
						local1216.anInt6865 = local12;
						local1216.anInt6869 = local6;
						local1216.anInt6867 = local9;
						Static43.aClass117_2.method2961(local1216);
					}
				}
				arg1.aByte99 = 0;
			}
		}
		@Pc(1333) int local1333;
		if (arg1.aBoolean479) {
			try {
				arg1.aBoolean479 = false;
				@Pc(1245) int local1245 = 0;
				label625: for (local1030 = arg1.aClass208_3; local1030 != null; local1030 = local1030.aClass208_2) {
					@Pc(1252) Class30_Sub1 local1252 = local1030.aClass30_Sub1_1;
					if (local1252.anInt7489 != Static291.anInt7494) {
						for (local1074 = local1252.aShort104; local1074 <= local1252.aShort105; local1074++) {
							for (local1078 = local1252.aShort103; local1078 <= local1252.aShort102; local1078++) {
								@Pc(1270) Class252 local1270 = local31[local1074][local1078];
								if (local1270.aBoolean480) {
									arg1.aBoolean479 = true;
									continue label625;
								}
								if (local1270.aByte99 != 0) {
									local706 = 0;
									if (local1074 > local1252.aShort104) {
										local706++;
									}
									if (local1074 < local1252.aShort105) {
										local706 += 4;
									}
									if (local1078 > local1252.aShort103) {
										local706 += 8;
									}
									if (local1078 < local1252.aShort102) {
										local706 += 2;
									}
									if ((local706 & local1270.aByte99) == arg1.aByte97) {
										arg1.aBoolean479 = true;
										continue label625;
									}
								}
							}
						}
						local1078 = Static166.anInt3464 - local1252.aShort104;
						local1333 = local1252.aShort105 - Static166.anInt3464;
						if (local1333 > local1078) {
							local1078 = local1333;
						}
						local706 = Static31.anInt2066 - local1252.aShort103;
						local711 = local1252.aShort102 - Static31.anInt2066;
						if (local711 > local706) {
							local706 = local711;
						}
						arg0.aClass30_Sub1Array2[local1245] = local1252;
						arg0.anIntArray169[local1245++] = local1078 + local706;
					}
				}
				while (local1245 > 0) {
					local408 = -50;
					local1074 = -1;
					@Pc(1384) Class30_Sub1 local1384;
					for (local1078 = 0; local1078 < local1245; local1078++) {
						local1384 = arg0.aClass30_Sub1Array2[local1078];
						if (local1384.anInt7489 != Static291.anInt7494) {
							local706 = arg0.anIntArray169[local1078];
							if (local706 > local408) {
								local408 = local706;
								local1074 = local1078;
							} else if (local706 == local408) {
								local711 = local1384.anInt7490 - Static17.anInt393;
								local714 = local1384.anInt7488 - Static237.anInt4683;
								local723 = arg0.aClass30_Sub1Array2[local1074].anInt7490 - Static17.anInt393;
								local735 = arg0.aClass30_Sub1Array2[local1074].anInt7488 - Static237.anInt4683;
								if (local711 * local711 + local714 * local714 > local723 * local723 + local735 * local735) {
									local1074 = local1078;
								}
							}
						}
					}
					if (local1074 == -1) {
						break;
					}
					local1384 = arg0.aClass30_Sub1Array2[local1074];
					local1384.anInt7489 = Static291.anInt7494;
					if (!Static245.method3651(local15, local1384.aShort104, local1384.aShort105, local1384.aShort103, local1384.aShort102, local1384.method5724())) {
						if (Static421.aBoolean482) {
							if (local1384.aByte103 == 0) {
								Static67.method1305(arg0, local12, local1384.aShort104, local1384.aShort103, local1384.aShort105, local1384.aShort102);
							} else {
								Static280.method4119(arg0, local12, local6, local9);
								local706 = local6 - Static166.anInt3464;
								local711 = local9 - Static31.anInt2066;
								if (local1384.aByte103 == 2) {
									if (local711 > -local706) {
										Static83.method1515(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static83.method1515(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local711 > local706) {
									Static83.method1515(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static83.method1515(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static227.aClass106_8.method5956(arg0.anInt1886, arg0.aClass1_Sub4Array2);
						}
						local616 = local1384.method5722(Static227.aClass106_8);
						if (local616 != null) {
							local616.aClass30_1 = local1384;
							local616.anInt6865 = local12;
							local616.anInt6869 = local1384.aShort104;
							local616.anInt6867 = local1384.aShort103;
							Static43.aClass117_2.method2961(local616);
						}
					}
					for (local706 = local1384.aShort104; local706 <= local1384.aShort105; local706++) {
						for (local711 = local1384.aShort103; local711 <= local1384.aShort102; local711++) {
							@Pc(1609) Class252 local1609 = local31[local706][local711];
							if (local1609.aByte99 != 0) {
								Static47.aClass9_3.method6064(local1609);
							} else if ((local706 != local6 || local711 != local9) && local1609.aBoolean478) {
								Static47.aClass9_3.method6064(local1609);
							}
						}
					}
				}
				if (arg1.aBoolean479) {
					return;
				}
			} catch (@Pc(1647) Exception local1647) {
				arg1.aBoolean479 = false;
			}
		}
		if (arg1.aClass51_2 != null && arg1.aByte96 == (byte) (Static293.anInt4678 & 0xFF)) {
			@Pc(1664) Class51 local1664 = arg1.aClass51_2;
			local406 = Static396.aClass96Array5[local12].ua(local6, local9);
			if (local12 < Static220.anInt4418 - 1) {
				local408 = Static396.aClass96Array5[local12].ua(local6, local9) - Static396.aClass96Array5[local12 + 1].ua(local6, local9);
			} else {
				local408 = 0x8 << Static198.anInt7947;
			}
			Static272.aClass40_3.method4578(local21, local406, local27, arg0.anIntArray170);
			local1074 = arg0.anIntArray170[2];
			Static272.aClass40_3.method4578(local21, local406 - local408, local27, arg0.anIntArray170);
			local1078 = arg0.anIntArray170[2];
			local1333 = local1074;
			local706 = local1078;
			if (local1074 > local1078) {
				local1333 = local1078;
				local706 = local1074;
			}
			local1333 -= Static460.anInt5780;
			local706 += Static460.anInt5780;
			local1664.anInt1803 = local1333;
			local1664.anInt1802 = local706;
			local1664.aBoolean116 = true;
			Static227.aClass106_8.method5908(local1664);
		}
		if (!arg1.aBoolean478) {
			return;
		}
		if (arg1.aByte99 != 0) {
			return;
		}
		if (local6 <= Static166.anInt3464 && local6 > Static329.anInt6070) {
			local86 = local31[local6 - 1][local9];
			if (local86 != null && local86.aBoolean478) {
				return;
			}
		}
		if (local6 >= Static166.anInt3464 && local6 < Static182.anInt3942 - 1) {
			local86 = local31[local6 + 1][local9];
			if (local86 != null && local86.aBoolean478) {
				return;
			}
		}
		if (local9 <= Static31.anInt2066 && local9 > Static272.anInt5271) {
			local86 = local31[local6][local9 - 1];
			if (local86 != null && local86.aBoolean478) {
				return;
			}
		}
		if (local9 >= Static31.anInt2066 && local9 < Static418.anInt7456 - 1) {
			local86 = local31[local6][local9 + 1];
			if (local86 != null && local86.aBoolean478) {
				return;
			}
		}
		arg1.aBoolean478 = false;
		Static62.anInt1642--;
		@Pc(1855) Class30_Sub5 local1855 = arg1.aClass30_Sub5_1;
		if (local1855 != null && local1855.aBoolean407) {
			if (Static421.aBoolean482) {
				Static280.method4119(arg0, local12, local6, local9);
				Static227.aClass106_8.method5956(arg0.anInt1886, arg0.aClass1_Sub4Array2);
			}
			@Pc(1878) Class41_Sub7 local1878 = local1855.method5722(Static227.aClass106_8);
			if (local1878 != null) {
				local1878.aClass30_1 = local1855;
				local1878.anInt6865 = local12;
				local1878.anInt6869 = local6;
				local1878.anInt6867 = local9;
				Static43.aClass117_2.method2961(local1878);
			}
		}
		if (arg1.aShort100 != 0) {
			@Pc(1902) Class30_Sub2 local1902 = arg1.aClass30_Sub2_2;
			if (local1902 != null && !Static82.method1509(local15, local6, local9, local1902.method5620())) {
				if ((local1902.anInt7377 & arg1.aShort100) != 0) {
					if (Static421.aBoolean482) {
						Static280.method4119(arg0, local12, local6, local9);
						Static227.aClass106_8.method5956(arg0.anInt1886, arg0.aClass1_Sub4Array2);
					}
					local377 = local1902.method5722(Static227.aClass106_8);
					if (local377 != null) {
						local377.aClass30_1 = local1902;
						local377.anInt6865 = local12;
						local377.anInt6869 = local6;
						local377.anInt6867 = local9;
						Static43.aClass117_2.method2961(local377);
					}
				} else if (local1902.anInt7377 == 256) {
					local408 = local1902.anInt7376 - Static17.anInt393;
					local1074 = local1902.anInt7385 - Static237.anInt4683;
					local1078 = local1902.anInt7382;
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
					if (Static421.aBoolean482) {
						Static280.method4119(arg0, local12, local6, local9);
						Static227.aClass106_8.method5956(arg0.anInt1886, arg0.aClass1_Sub4Array2);
					}
					@Pc(2012) Class30_Sub2 local2012 = arg1.aClass30_Sub2_3;
					@Pc(2020) Class41_Sub7 local2020;
					if (local706 > local1333) {
						local2020 = local1902.method5722(Static227.aClass106_8);
						if (local2020 != null) {
							local2020.aClass30_1 = local1902;
							local2020.anInt6865 = local12;
							local2020.anInt6869 = local6;
							local2020.anInt6867 = local9;
							Static43.aClass117_2.method2961(local2020);
						}
					} else if (local2012 != null) {
						local2020 = local2012.method5722(Static227.aClass106_8);
						if (local2020 != null) {
							local2020.aClass30_1 = local2012;
							local2020.anInt6865 = local12;
							local2020.anInt6869 = local6;
							local2020.anInt6867 = local9;
							Static43.aClass117_2.method2961(local2020);
						}
					}
				}
			}
			local1057 = arg1.aClass30_Sub3_3;
			local411 = arg1.aClass30_Sub3_2;
			@Pc(2105) Class41_Sub7 local2105;
			if (local411 != null && (local411.anInt5441 & arg1.aShort100) != 0 && !Static7.method85(local15, local6, local9, local411.anInt5441)) {
				if (Static421.aBoolean482) {
					Static409.method5567(arg0, local411.anInt5441, local12, local6, local9);
					Static227.aClass106_8.method5956(arg0.anInt1886, arg0.aClass1_Sub4Array2);
				}
				local2105 = local411.method5722(Static227.aClass106_8);
				if (local2105 != null) {
					local2105.aClass30_1 = local411;
					local2105.anInt6865 = local12;
					local2105.anInt6869 = local6;
					local2105.anInt6867 = local9;
					Static43.aClass117_2.method2961(local2105);
				}
			}
			if (local1057 != null && (local1057.anInt5441 & arg1.aShort100) != 0 && !Static7.method85(local15, local6, local9, local1057.anInt5441)) {
				if (Static421.aBoolean482) {
					Static409.method5567(arg0, local1057.anInt5441, local12, local6, local9);
					Static227.aClass106_8.method5956(arg0.anInt1886, arg0.aClass1_Sub4Array2);
				}
				local2105 = local1057.method5722(Static227.aClass106_8);
				if (local2105 != null) {
					local2105.aClass30_1 = local1057;
					local2105.anInt6865 = local12;
					local2105.anInt6869 = local6;
					local2105.anInt6867 = local9;
					Static43.aClass117_2.method2961(local2105);
				}
			}
		}
		@Pc(2191) Class252 local2191;
		if (local12 < Static220.anInt4418 - 1) {
			local2191 = Static67.aClass252ArrayArrayArray2[local12 + 1][local6][local9];
			if (local2191 != null && local2191.aBoolean478) {
				Static47.aClass9_3.method6066(local2191);
			}
		}
		if (local6 < Static166.anInt3464) {
			local2191 = local31[local6 + 1][local9];
			if (local2191 != null && local2191.aBoolean478) {
				Static47.aClass9_3.method6064(local2191);
			}
		}
		if (local9 < Static31.anInt2066) {
			local2191 = local31[local6][local9 + 1];
			if (local2191 != null && local2191.aBoolean478) {
				Static47.aClass9_3.method6064(local2191);
			}
		}
		if (local6 > Static166.anInt3464) {
			local2191 = local31[local6 - 1][local9];
			if (local2191 != null && local2191.aBoolean478) {
				Static47.aClass9_3.method6064(local2191);
			}
		}
		if (local9 > Static31.anInt2066) {
			local2191 = local31[local6][local9 - 1];
			if (local2191 != null && local2191.aBoolean478) {
				Static47.aClass9_3.method6064(local2191);
			}
		}
	}
}
