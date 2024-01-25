import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static399 {

	@OriginalMember(owner = "client!ug", name = "cb", descriptor = "I")
	public static int anInt7157;

	@OriginalMember(owner = "client!ug", name = "P", descriptor = "[I")
	public static final int[] anIntArray493 = new int[4];

	@OriginalMember(owner = "client!ug", name = "bb", descriptor = "I")
	public static int anInt7156 = 0;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!he;I)V")
	public static void method5883(@OriginalArg(0) Class100 arg0) {
		Static112.aClass100_17 = arg0;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZI[Lclient!ts;IB)V")
	public static void method5884(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class239[] arg3, @OriginalArg(4) int arg4) {
		for (@Pc(15) int local15 = 0; local15 < arg3.length; local15++) {
			@Pc(21) Class239 local21 = arg3[local15];
			if (local21 != null && arg4 == local21.anInt6895) {
				Static195.method5946(arg1, arg2, local21, arg0);
				Static59.method1316(arg0, local21, arg2);
				if (local21.anInt6931 > local21.anInt6890 - local21.anInt6898) {
					local21.anInt6931 = local21.anInt6890 - local21.anInt6898;
				}
				if (local21.anInt6931 < 0) {
					local21.anInt6931 = 0;
				}
				if (local21.anInt6941 - local21.anInt6899 < local21.anInt6887) {
					local21.anInt6887 = local21.anInt6941 - local21.anInt6899;
				}
				if (local21.anInt6887 < 0) {
					local21.anInt6887 = 0;
				}
				if (local21.anInt6900 == 0) {
					Static141.method1120(arg1, local21);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(II)Z")
	public static boolean method5888(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!is;Lclient!hg;)V")
	public static void method5889(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class101 arg1) {
		if (!arg1.aBoolean194) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort35;
		@Pc(9) short local9 = arg1.aShort37;
		@Pc(12) byte local12 = arg1.aByte40;
		@Pc(15) byte local15 = arg1.aByte43;
		@Pc(21) int local21 = (local6 << Static62.anInt1705) + Static437.anInt7761;
		@Pc(27) int local27 = (local9 << Static62.anInt1705) + Static437.anInt7761;
		@Pc(31) Class101[][] local31 = Static409.aClass101ArrayArrayArray3[local12];
		@Pc(53) float local53;
		if (Static288.aClass86Array3 == Static55.aClass86Array1) {
			Static165.aClass66_8.method5060(Static87.aClass86Array2[0].method6590(local21, local27), Static136.method2410(local6, local9), Static410.method6046(local6, local9), Static265.method4074(local6, local9));
			local53 = 251.5F;
		} else {
			local53 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static165.aClass66_8.method5055(3000.0F, local53 * 1.5F);
		@Pc(86) Class101 local86;
		@Pc(616) Class57_Sub2 local616;
		@Pc(711) int local711;
		@Pc(714) int local714;
		@Pc(723) int local723;
		@Pc(735) int local735;
		@Pc(406) int local406;
		@Pc(330) boolean local330;
		@Pc(377) Class57_Sub2 local377;
		@Pc(408) int local408;
		@Pc(411) Class3_Sub3 local411;
		@Pc(706) int local706;
		if (arg1.aBoolean193) {
			if (Static409.aBoolean466) {
				if (local12 > 0) {
					local86 = Static409.aClass101ArrayArrayArray3[local12 - 1][local6][local9];
					if (local86 != null && local86.aBoolean194) {
						return;
					}
				}
				if (local6 <= Static6.anInt253 && local6 > Static211.anInt3900) {
					local86 = local31[local6 - 1][local9];
					if (local86 != null && local86.aBoolean194 && (local86.aBoolean193 || (arg1.aByte41 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static6.anInt253 && local6 < Static163.anInt3256 - 1) {
					local86 = local31[local6 + 1][local9];
					if (local86 != null && local86.aBoolean194 && (local86.aBoolean193 || (arg1.aByte41 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static370.anInt6673 && local9 > Static238.anInt4363) {
					local86 = local31[local6][local9 - 1];
					if (local86 != null && local86.aBoolean194 && (local86.aBoolean193 || (arg1.aByte41 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static370.anInt6673 && local9 < Static103.anInt2239 - 1) {
					local86 = local31[local6][local9 + 1];
					if (local86 != null && local86.aBoolean194 && (local86.aBoolean193 || (arg1.aByte41 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static409.aBoolean466 = true;
			}
			arg1.aBoolean193 = false;
			if (arg1.aClass101_1 != null) {
				local86 = arg1.aClass101_1;
				Static165.aClass66_8.method5055(3000.0F, (201.5F - (float) (local86.aByte43 + 1) * 50.0F) * 1.5F);
				if (!Static411.method6068(local86.aByte43, local6, local9)) {
					Static55.aClass86Array1[local86.aByte43].method6584(local6, local9);
				}
				@Pc(249) Class3_Sub3 local249 = local86.aClass3_Sub3_2;
				if (local249 != null) {
					if (Static285.aBoolean434) {
						if ((local249.anInt5869 & arg1.aShort36) == 0) {
							Static210.method3215(arg0, local12, local6, local9);
						} else {
							Static164.method2714(arg0, local249.anInt5869, local15, local6, local9);
						}
						Static165.aClass66_8.method5000(arg0.anInt7773, arg0.aClass6_Sub11Array3);
					}
					local249.method5936(Static165.aClass66_8);
				}
				for (@Pc(286) Class145 local286 = local86.aClass145_1; local286 != null; local286 = local286.aClass145_2) {
					@Pc(290) Class3_Sub2 local290 = local286.aClass3_Sub2_2;
					if (local290 != null) {
						if (Static285.aBoolean434) {
							Static210.method3215(arg0, local12, local6, local9);
							Static165.aClass66_8.method5000(arg0.anInt7773, arg0.aClass6_Sub11Array3);
						}
						local290.method5936(Static165.aClass66_8);
					}
				}
				Static165.aClass66_8.method5055(3000.0F, local53 * 1.5F);
			}
			local330 = !Static411.method6068(local15, local6, local9);
			if (local330) {
				Static55.aClass86Array1[local15].method6584(local6, local9);
				@Pc(341) Class3_Sub5 local341 = arg1.aClass3_Sub5_1;
				if (local341 != null && local341.aBoolean319) {
					if (local341.aBoolean320) {
						Static165.aClass66_8.method5055(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static285.aBoolean434) {
						Static210.method3215(arg0, local12, local6, local9);
						Static165.aClass66_8.method5000(arg0.anInt7773, arg0.aClass6_Sub11Array3);
					}
					local377 = local341.method5936(Static165.aClass66_8);
					if (local377 != null) {
						local377.aClass3_1 = local341;
						local377.anInt2817 = local12;
						local377.anInt2815 = local6;
						local377.anInt2816 = local9;
						Static385.aClass111_8.method2696(local377);
					}
					if (local341.aBoolean320) {
						Static165.aClass66_8.method5055(3000.0F, local53 * 1.5F);
					}
				}
			}
			local406 = 0;
			local408 = 0;
			local411 = arg1.aClass3_Sub3_2;
			@Pc(414) Class3_Sub1 local414 = arg1.aClass3_Sub1_2;
			if (local411 != null || local414 != null) {
				if (Static6.anInt253 == local6) {
					local406++;
				} else if (Static6.anInt253 < local6) {
					local406 += 2;
				}
				if (Static370.anInt6673 == local9) {
					local406 += 3;
				} else if (Static370.anInt6673 > local9) {
					local406 += 6;
				}
				local408 = Static107.anIntArray135[local406];
				arg1.aShort36 = Static326.aShortArray86[local406];
			}
			if (local411 != null) {
				if ((local411.anInt5869 & Static2.anIntArray414[local406]) == 0) {
					arg1.aByte44 = 0;
				} else if (local411.anInt5869 == 16) {
					arg1.aByte44 = 3;
					arg1.aByte38 = Static31.aByteArray17[local406];
					arg1.aByte42 = (byte) (3 - arg1.aByte38);
				} else if (local411.anInt5869 == 32) {
					arg1.aByte44 = 6;
					arg1.aByte38 = Static197.aByteArray44[local406];
					arg1.aByte42 = (byte) (6 - arg1.aByte38);
				} else if (local411.anInt5869 == 64) {
					arg1.aByte44 = 12;
					arg1.aByte38 = Static410.aByteArray90[local406];
					arg1.aByte42 = (byte) (12 - arg1.aByte38);
				} else {
					arg1.aByte44 = 9;
					arg1.aByte38 = Static90.aByteArray27[local406];
					arg1.aByte42 = (byte) (9 - arg1.aByte38);
				}
				if ((local411.anInt5869 & local408) != 0 && !Static52.method1201(local15, local6, local9, local411.anInt5869)) {
					if (Static285.aBoolean434) {
						Static210.method3215(arg0, local12, local6, local9);
						Static165.aClass66_8.method5000(arg0.anInt7773, arg0.aClass6_Sub11Array3);
					}
					@Pc(563) Class57_Sub2 local563 = local411.method5936(Static165.aClass66_8);
					if (local563 != null) {
						local563.aClass3_1 = local411;
						local563.anInt2817 = local12;
						local563.anInt2815 = local6;
						local563.anInt2816 = local9;
						Static385.aClass111_8.method2696(local563);
					}
				}
				@Pc(584) Class3_Sub3 local584 = arg1.aClass3_Sub3_1;
				if (local584 != null && (local584.anInt5869 & local408) != 0 && !Static52.method1201(local15, local6, local9, local584.anInt5869)) {
					if (Static285.aBoolean434) {
						Static210.method3215(arg0, local12, local6, local9);
						Static165.aClass66_8.method5000(arg0.anInt7773, arg0.aClass6_Sub11Array3);
					}
					local616 = local584.method5936(Static165.aClass66_8);
					if (local616 != null) {
						local616.aClass3_1 = local584;
						local616.anInt2817 = local12;
						local616.anInt2815 = local6;
						local616.anInt2816 = local9;
						Static385.aClass111_8.method2696(local616);
					}
				}
			}
			if (local414 != null && !Static297.method4399(local15, local6, local9, local414.method5319())) {
				@Pc(647) Class3_Sub1 local647 = arg1.aClass3_Sub1_3;
				Static165.aClass66_8.method5055(3000.0F, (local53 - 0.5F) * 1.5F);
				if ((local414.anInt6385 & local408) != 0) {
					if (Static285.aBoolean434) {
						Static210.method3215(arg0, local12, local6, local9);
						Static165.aClass66_8.method5000(arg0.anInt7773, arg0.aClass6_Sub11Array3);
					}
					local616 = local414.method5936(Static165.aClass66_8);
					if (local616 != null) {
						local616.aClass3_1 = local414;
						local616.anInt2817 = local12;
						local616.anInt2815 = local6;
						local616.anInt2816 = local9;
						Static385.aClass111_8.method2696(local616);
					}
				} else if (local414.anInt6385 == 256) {
					local706 = local414.anInt6392 - Static332.anInt5784;
					local711 = local414.anInt6384 - Static440.anInt7781;
					local714 = local414.anInt6388;
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
					if (Static285.aBoolean434) {
						Static210.method3215(arg0, local12, local6, local9);
						Static165.aClass66_8.method5000(arg0.anInt7773, arg0.aClass6_Sub11Array3);
					}
					@Pc(759) Class57_Sub2 local759;
					if (local735 < local723) {
						local759 = local414.method5936(Static165.aClass66_8);
						if (local759 != null) {
							local759.aClass3_1 = local414;
							local759.anInt2817 = local12;
							local759.anInt2815 = local6;
							local759.anInt2816 = local9;
							Static385.aClass111_8.method2696(local759);
						}
					} else if (local647 != null) {
						local759 = local647.method5936(Static165.aClass66_8);
						if (local759 != null) {
							local759.aClass3_1 = local647;
							local759.anInt2817 = local12;
							local759.anInt2815 = local6;
							local759.anInt2816 = local9;
							Static385.aClass111_8.method2696(local759);
						}
					}
				}
				Static165.aClass66_8.method5055(3000.0F, local53 * 1.5F);
			}
			if (local330) {
				@Pc(814) Class3_Sub5 local814 = arg1.aClass3_Sub5_1;
				if (local814 != null && !local814.aBoolean319) {
					if (local814.aBoolean320) {
						Static165.aClass66_8.method5055(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static285.aBoolean434) {
						Static210.method3215(arg0, local12, local6, local9);
						Static165.aClass66_8.method5000(arg0.anInt7773, arg0.aClass6_Sub11Array3);
					}
					local616 = local814.method5936(Static165.aClass66_8);
					if (local616 != null) {
						local616.aClass3_1 = local814;
						local616.anInt2817 = local12;
						local616.anInt2815 = local6;
						local616.anInt2816 = local9;
						Static385.aClass111_8.method2696(local616);
					}
					if (local814.aBoolean320) {
						Static165.aClass66_8.method5055(3000.0F, local53 * 1.5F);
					}
				}
				@Pc(880) Class3_Sub4 local880 = arg1.aClass3_Sub4_1;
				if (local880 != null && !local880.aBoolean148) {
					if (Static285.aBoolean434) {
						Static210.method3215(arg0, local12, local6, local9);
						Static165.aClass66_8.method5000(arg0.anInt7773, arg0.aClass6_Sub11Array3);
					}
					@Pc(903) Class57_Sub2 local903 = local880.method5936(Static165.aClass66_8);
					if (local903 != null) {
						local903.aClass3_1 = local880;
						local903.anInt2817 = local12;
						local903.anInt2815 = local6;
						local903.anInt2816 = local9;
						Static385.aClass111_8.method2696(local903);
					}
				}
			}
			@Pc(924) byte local924 = arg1.aByte41;
			if (local924 != 0) {
				@Pc(941) Class101 local941;
				if (local6 < Static6.anInt253 && (local924 & 0x4) != 0) {
					local941 = local31[local6 + 1][local9];
					if (local941 != null && local941.aBoolean194) {
						Static401.aClass120_1.method6078(local941);
					}
				}
				if (local9 < Static370.anInt6673 && (local924 & 0x2) != 0) {
					local941 = local31[local6][local9 + 1];
					if (local941 != null && local941.aBoolean194) {
						Static401.aClass120_1.method6078(local941);
					}
				}
				if (local6 > Static6.anInt253 && (local924 & 0x1) != 0) {
					local941 = local31[local6 - 1][local9];
					if (local941 != null && local941.aBoolean194) {
						Static401.aClass120_1.method6078(local941);
					}
				}
				if (local9 > Static370.anInt6673 && (local924 & 0x8) != 0) {
					local941 = local31[local6][local9 - 1];
					if (local941 != null && local941.aBoolean194) {
						Static401.aClass120_1.method6078(local941);
					}
				}
			}
		}
		@Pc(1074) int local1074;
		@Pc(1057) Class3_Sub3 local1057;
		@Pc(1078) int local1078;
		@Pc(1030) Class145 local1030;
		if (arg1.aByte44 != 0) {
			local330 = true;
			for (local1030 = arg1.aClass145_1; local1030 != null; local1030 = local1030.aClass145_2) {
				if (local1030.aClass3_Sub2_2.anInt7209 != Static354.anInt6329 && (local1030.anInt3942 & arg1.aByte44) == arg1.aByte38) {
					local330 = false;
					break;
				}
			}
			if (local330) {
				local1057 = arg1.aClass3_Sub3_2;
				if (!Static52.method1201(local15, local6, local9, local1057.anInt5869)) {
					if (Static285.aBoolean434) {
						label682: {
							if (local1057.anInt5869 >= 16) {
								local1074 = local6 - Static6.anInt253;
								local1078 = local9 - Static370.anInt6673;
								if (local1057.anInt5869 == 16) {
									local1074 -= Static437.anInt7761;
									local1078 += Static437.anInt7761;
									if (local1078 < local1074 && local6 > 0 && local9 <= Static61.anInt1698) {
										Static210.method3215(arg0, local12, local6 - 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt5869 == 32) {
									local1074 += Static437.anInt7761;
									local1078 += Static437.anInt7761;
									if (local1078 < -local1074 && local6 < Static229.anInt4189 && local9 < Static61.anInt1698) {
										Static210.method3215(arg0, local12, local6 + 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt5869 == 64) {
									local1074 += Static437.anInt7761;
									local1078 -= Static437.anInt7761;
									if (local1078 > local1074 && local6 < Static229.anInt4189 && local9 > 0) {
										Static210.method3215(arg0, local12, local6 + 1, local9 - 1);
										break label682;
									}
								} else if (local1057.anInt5869 == 128) {
									local1074 -= Static437.anInt7761;
									local1078 -= Static437.anInt7761;
									if (local1078 > -local1074 && local6 > 0 && local9 > 0) {
										Static210.method3215(arg0, local12, local6 - 1, local9 - 1);
										break label682;
									}
								}
							}
							Static210.method3215(arg0, local12, local6, local9);
						}
						Static165.aClass66_8.method5000(arg0.anInt7773, arg0.aClass6_Sub11Array3);
					}
					@Pc(1216) Class57_Sub2 local1216 = local1057.method5936(Static165.aClass66_8);
					if (local1216 != null) {
						local1216.aClass3_1 = local1057;
						local1216.anInt2817 = local12;
						local1216.anInt2815 = local6;
						local1216.anInt2816 = local9;
						Static385.aClass111_8.method2696(local1216);
					}
				}
				arg1.aByte44 = 0;
			}
		}
		@Pc(1333) int local1333;
		if (arg1.aBoolean192) {
			try {
				arg1.aBoolean192 = false;
				@Pc(1245) int local1245 = 0;
				label625: for (local1030 = arg1.aClass145_1; local1030 != null; local1030 = local1030.aClass145_2) {
					@Pc(1252) Class3_Sub2 local1252 = local1030.aClass3_Sub2_2;
					if (local1252.anInt7209 != Static354.anInt6329) {
						for (local1074 = local1252.aShort101; local1074 <= local1252.aShort100; local1074++) {
							for (local1078 = local1252.aShort102; local1078 <= local1252.aShort99; local1078++) {
								@Pc(1270) Class101 local1270 = local31[local1074][local1078];
								if (local1270.aBoolean193) {
									arg1.aBoolean192 = true;
									continue label625;
								}
								if (local1270.aByte44 != 0) {
									local706 = 0;
									if (local1074 > local1252.aShort101) {
										local706++;
									}
									if (local1074 < local1252.aShort100) {
										local706 += 4;
									}
									if (local1078 > local1252.aShort102) {
										local706 += 8;
									}
									if (local1078 < local1252.aShort99) {
										local706 += 2;
									}
									if ((local706 & local1270.aByte44) == arg1.aByte42) {
										arg1.aBoolean192 = true;
										continue label625;
									}
								}
							}
						}
						local1078 = Static6.anInt253 - local1252.aShort101;
						local1333 = local1252.aShort100 - Static6.anInt253;
						if (local1333 > local1078) {
							local1078 = local1333;
						}
						local706 = Static370.anInt6673 - local1252.aShort102;
						local711 = local1252.aShort99 - Static370.anInt6673;
						if (local711 > local706) {
							local706 = local711;
						}
						arg0.aClass3_Sub2Array3[local1245] = local1252;
						arg0.anIntArray541[local1245++] = local1078 + local706;
					}
				}
				while (local1245 > 0) {
					local408 = -50;
					local1074 = -1;
					@Pc(1384) Class3_Sub2 local1384;
					for (local1078 = 0; local1078 < local1245; local1078++) {
						local1384 = arg0.aClass3_Sub2Array3[local1078];
						if (local1384.anInt7209 != Static354.anInt6329) {
							local706 = arg0.anIntArray541[local1078];
							if (local706 > local408) {
								local408 = local706;
								local1074 = local1078;
							} else if (local706 == local408) {
								local711 = local1384.anInt7202 - Static332.anInt5784;
								local714 = local1384.anInt7207 - Static440.anInt7781;
								local723 = arg0.aClass3_Sub2Array3[local1074].anInt7202 - Static332.anInt5784;
								local735 = arg0.aClass3_Sub2Array3[local1074].anInt7207 - Static440.anInt7781;
								if (local711 * local711 + local714 * local714 > local723 * local723 + local735 * local735) {
									local1074 = local1078;
								}
							}
						}
					}
					if (local1074 == -1) {
						break;
					}
					local1384 = arg0.aClass3_Sub2Array3[local1074];
					local1384.anInt7209 = Static354.anInt6329;
					if (!Static66.method1375(local15, local1384.aShort101, local1384.aShort100, local1384.aShort102, local1384.aShort99, local1384.method5947())) {
						if (Static285.aBoolean434) {
							if (local1384.aByte104 == 0) {
								Static290.method4370(arg0, local12, local1384.aShort101, local1384.aShort102, local1384.aShort100, local1384.aShort99);
							} else {
								Static210.method3215(arg0, local12, local6, local9);
								local706 = local6 - Static6.anInt253;
								local711 = local9 - Static370.anInt6673;
								if (local1384.aByte104 == 2) {
									if (local711 > -local706) {
										Static55.method1241(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static55.method1241(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local711 > local706) {
									Static55.method1241(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static55.method1241(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static165.aClass66_8.method5000(arg0.anInt7773, arg0.aClass6_Sub11Array3);
						}
						local616 = local1384.method5936(Static165.aClass66_8);
						if (local616 != null) {
							local616.aClass3_1 = local1384;
							local616.anInt2817 = local12;
							local616.anInt2815 = local1384.aShort101;
							local616.anInt2816 = local1384.aShort102;
							Static385.aClass111_8.method2696(local616);
						}
					}
					for (local706 = local1384.aShort101; local706 <= local1384.aShort100; local706++) {
						for (local711 = local1384.aShort102; local711 <= local1384.aShort99; local711++) {
							@Pc(1609) Class101 local1609 = local31[local706][local711];
							if (local1609.aByte44 != 0) {
								Static401.aClass120_1.method6078(local1609);
							} else if ((local706 != local6 || local711 != local9) && local1609.aBoolean194) {
								Static401.aClass120_1.method6078(local1609);
							}
						}
					}
				}
				if (arg1.aBoolean192) {
					return;
				}
			} catch (@Pc(1647) Exception local1647) {
				arg1.aBoolean192 = false;
			}
		}
		if (arg1.aClass32_1 != null && arg1.aByte39 == (byte) (Static226.anInt5628 & 0xFF)) {
			@Pc(1664) Class32 local1664 = arg1.aClass32_1;
			local406 = Static55.aClass86Array1[local12].method6594(local6, local9);
			if (local12 < Static295.anInt5507 - 1) {
				local408 = Static55.aClass86Array1[local12].method6594(local6, local9) - Static55.aClass86Array1[local12 + 1].method6594(local6, local9);
			} else {
				local408 = 0x8 << Static62.anInt1705;
			}
			Static185.aClass5_2.method3841(local21, local406, local27, arg0.anIntArray540);
			local1074 = arg0.anIntArray540[2];
			Static185.aClass5_2.method3841(local21, local406 - local408, local27, arg0.anIntArray540);
			local1078 = arg0.anIntArray540[2];
			local1333 = local1074;
			local706 = local1078;
			if (local1074 > local1078) {
				local1333 = local1078;
				local706 = local1074;
			}
			local1333 -= Static70.anInt1833;
			local706 += Static70.anInt1833;
			local1664.anInt1156 = local1333;
			local1664.anInt1155 = local706;
			local1664.aBoolean94 = true;
			Static165.aClass66_8.method5034(local1664);
		}
		if (!arg1.aBoolean194) {
			return;
		}
		if (arg1.aByte44 != 0) {
			return;
		}
		if (local6 <= Static6.anInt253 && local6 > Static211.anInt3900) {
			local86 = local31[local6 - 1][local9];
			if (local86 != null && local86.aBoolean194) {
				return;
			}
		}
		if (local6 >= Static6.anInt253 && local6 < Static163.anInt3256 - 1) {
			local86 = local31[local6 + 1][local9];
			if (local86 != null && local86.aBoolean194) {
				return;
			}
		}
		if (local9 <= Static370.anInt6673 && local9 > Static238.anInt4363) {
			local86 = local31[local6][local9 - 1];
			if (local86 != null && local86.aBoolean194) {
				return;
			}
		}
		if (local9 >= Static370.anInt6673 && local9 < Static103.anInt2239 - 1) {
			local86 = local31[local6][local9 + 1];
			if (local86 != null && local86.aBoolean194) {
				return;
			}
		}
		arg1.aBoolean194 = false;
		Static110.anInt6980--;
		@Pc(1855) Class3_Sub4 local1855 = arg1.aClass3_Sub4_1;
		if (local1855 != null && local1855.aBoolean148) {
			if (Static285.aBoolean434) {
				Static210.method3215(arg0, local12, local6, local9);
				Static165.aClass66_8.method5000(arg0.anInt7773, arg0.aClass6_Sub11Array3);
			}
			@Pc(1878) Class57_Sub2 local1878 = local1855.method5936(Static165.aClass66_8);
			if (local1878 != null) {
				local1878.aClass3_1 = local1855;
				local1878.anInt2817 = local12;
				local1878.anInt2815 = local6;
				local1878.anInt2816 = local9;
				Static385.aClass111_8.method2696(local1878);
			}
		}
		if (arg1.aShort36 != 0) {
			@Pc(1902) Class3_Sub1 local1902 = arg1.aClass3_Sub1_2;
			if (local1902 != null && !Static297.method4399(local15, local6, local9, local1902.method5319())) {
				if ((local1902.anInt6385 & arg1.aShort36) != 0) {
					if (Static285.aBoolean434) {
						Static210.method3215(arg0, local12, local6, local9);
						Static165.aClass66_8.method5000(arg0.anInt7773, arg0.aClass6_Sub11Array3);
					}
					local377 = local1902.method5936(Static165.aClass66_8);
					if (local377 != null) {
						local377.aClass3_1 = local1902;
						local377.anInt2817 = local12;
						local377.anInt2815 = local6;
						local377.anInt2816 = local9;
						Static385.aClass111_8.method2696(local377);
					}
				} else if (local1902.anInt6385 == 256) {
					local408 = local1902.anInt6392 - Static332.anInt5784;
					local1074 = local1902.anInt6384 - Static440.anInt7781;
					local1078 = local1902.anInt6388;
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
					if (Static285.aBoolean434) {
						Static210.method3215(arg0, local12, local6, local9);
						Static165.aClass66_8.method5000(arg0.anInt7773, arg0.aClass6_Sub11Array3);
					}
					@Pc(2012) Class3_Sub1 local2012 = arg1.aClass3_Sub1_3;
					@Pc(2020) Class57_Sub2 local2020;
					if (local706 > local1333) {
						local2020 = local1902.method5936(Static165.aClass66_8);
						if (local2020 != null) {
							local2020.aClass3_1 = local1902;
							local2020.anInt2817 = local12;
							local2020.anInt2815 = local6;
							local2020.anInt2816 = local9;
							Static385.aClass111_8.method2696(local2020);
						}
					} else if (local2012 != null) {
						local2020 = local2012.method5936(Static165.aClass66_8);
						if (local2020 != null) {
							local2020.aClass3_1 = local2012;
							local2020.anInt2817 = local12;
							local2020.anInt2815 = local6;
							local2020.anInt2816 = local9;
							Static385.aClass111_8.method2696(local2020);
						}
					}
				}
			}
			local1057 = arg1.aClass3_Sub3_2;
			local411 = arg1.aClass3_Sub3_1;
			@Pc(2105) Class57_Sub2 local2105;
			if (local411 != null && (local411.anInt5869 & arg1.aShort36) != 0 && !Static52.method1201(local15, local6, local9, local411.anInt5869)) {
				if (Static285.aBoolean434) {
					Static164.method2714(arg0, local411.anInt5869, local12, local6, local9);
					Static165.aClass66_8.method5000(arg0.anInt7773, arg0.aClass6_Sub11Array3);
				}
				local2105 = local411.method5936(Static165.aClass66_8);
				if (local2105 != null) {
					local2105.aClass3_1 = local411;
					local2105.anInt2817 = local12;
					local2105.anInt2815 = local6;
					local2105.anInt2816 = local9;
					Static385.aClass111_8.method2696(local2105);
				}
			}
			if (local1057 != null && (local1057.anInt5869 & arg1.aShort36) != 0 && !Static52.method1201(local15, local6, local9, local1057.anInt5869)) {
				if (Static285.aBoolean434) {
					Static164.method2714(arg0, local1057.anInt5869, local12, local6, local9);
					Static165.aClass66_8.method5000(arg0.anInt7773, arg0.aClass6_Sub11Array3);
				}
				local2105 = local1057.method5936(Static165.aClass66_8);
				if (local2105 != null) {
					local2105.aClass3_1 = local1057;
					local2105.anInt2817 = local12;
					local2105.anInt2815 = local6;
					local2105.anInt2816 = local9;
					Static385.aClass111_8.method2696(local2105);
				}
			}
		}
		@Pc(2191) Class101 local2191;
		if (local12 < Static295.anInt5507 - 1) {
			local2191 = Static409.aClass101ArrayArrayArray3[local12 + 1][local6][local9];
			if (local2191 != null && local2191.aBoolean194) {
				Static401.aClass120_1.method6072(local2191);
			}
		}
		if (local6 < Static6.anInt253) {
			local2191 = local31[local6 + 1][local9];
			if (local2191 != null && local2191.aBoolean194) {
				Static401.aClass120_1.method6078(local2191);
			}
		}
		if (local9 < Static370.anInt6673) {
			local2191 = local31[local6][local9 + 1];
			if (local2191 != null && local2191.aBoolean194) {
				Static401.aClass120_1.method6078(local2191);
			}
		}
		if (local6 > Static6.anInt253) {
			local2191 = local31[local6 - 1][local9];
			if (local2191 != null && local2191.aBoolean194) {
				Static401.aClass120_1.method6078(local2191);
			}
		}
		if (local9 > Static370.anInt6673) {
			local2191 = local31[local6][local9 - 1];
			if (local2191 != null && local2191.aBoolean194) {
				Static401.aClass120_1.method6078(local2191);
			}
		}
	}
}
