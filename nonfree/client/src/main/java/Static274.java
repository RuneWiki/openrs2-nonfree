import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!np", name = "G", descriptor = "Lclient!cq;")
	public static Class43 aClass43_8;

	@OriginalMember(owner = "client!np", name = "E", descriptor = "[I")
	public static final int[] anIntArray341 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!np", name = "H", descriptor = "[I")
	public static final int[] anIntArray342 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(III)Z")
	public static boolean method3901(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!qf;Lclient!iq;)V")
	public static void method3902(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class118 arg1) {
		if (!arg1.aBoolean301) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort59;
		@Pc(9) short local9 = arg1.aShort58;
		@Pc(12) byte local12 = arg1.aByte66;
		@Pc(15) byte local15 = arg1.aByte63;
		@Pc(21) int local21 = (local6 << Static336.anInt5747) + Static421.anInt6887;
		@Pc(27) int local27 = (local9 << Static336.anInt5747) + Static421.anInt6887;
		@Pc(31) Class118[][] local31 = Static263.aClass118ArrayArrayArray2[local12];
		@Pc(53) float local53;
		if (Static85.aClass159Array2 == Static444.aClass159Array3) {
			Static255.aClass172_9.ba(Static26.aClass159Array1[0].va(local21, local27), Static376.method4927(local6, local9), Static239.method1376(local6, local9), Static121.method1960(local6, local9));
			local53 = 251.5F;
		} else {
			local53 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static255.aClass172_9.o(3000.0F, local53 * 1.5F);
		@Pc(86) Class118 local86;
		@Pc(616) Class6_Sub1 local616;
		@Pc(711) int local711;
		@Pc(714) int local714;
		@Pc(723) int local723;
		@Pc(735) int local735;
		@Pc(406) int local406;
		@Pc(330) boolean local330;
		@Pc(377) Class6_Sub1 local377;
		@Pc(408) int local408;
		@Pc(411) Class7_Sub4 local411;
		@Pc(706) int local706;
		if (arg1.aBoolean300) {
			if (Static437.aBoolean634) {
				if (local12 > 0) {
					local86 = Static263.aClass118ArrayArrayArray2[local12 - 1][local6][local9];
					if (local86 != null && local86.aBoolean301) {
						return;
					}
				}
				if (local6 <= Static310.anInt5498 && local6 > Static295.anInt5287) {
					local86 = local31[local6 - 1][local9];
					if (local86 != null && local86.aBoolean301 && (local86.aBoolean300 || (arg1.aByte62 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static310.anInt5498 && local6 < Static415.anInt6801 - 1) {
					local86 = local31[local6 + 1][local9];
					if (local86 != null && local86.aBoolean301 && (local86.aBoolean300 || (arg1.aByte62 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static111.anInt2450 && local9 > Static158.anInt3163) {
					local86 = local31[local6][local9 - 1];
					if (local86 != null && local86.aBoolean301 && (local86.aBoolean300 || (arg1.aByte62 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static111.anInt2450 && local9 < Static259.anInt4915 - 1) {
					local86 = local31[local6][local9 + 1];
					if (local86 != null && local86.aBoolean301 && (local86.aBoolean300 || (arg1.aByte62 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static437.aBoolean634 = true;
			}
			arg1.aBoolean300 = false;
			if (arg1.aClass118_1 != null) {
				local86 = arg1.aClass118_1;
				Static255.aClass172_9.o(3000.0F, (201.5F - (float) (local86.aByte63 + 1) * 50.0F) * 1.5F);
				if (!Static420.method5370(local86.aByte63, local6, local9)) {
					Static444.aClass159Array3[local86.aByte63].method4828(local6, local9);
				}
				@Pc(249) Class7_Sub4 local249 = local86.aClass7_Sub4_2;
				if (local249 != null) {
					if (Static204.aBoolean345) {
						if ((local249.anInt6144 & arg1.aShort60) == 0) {
							Static454.method5983(arg0, local12, local6, local9);
						} else {
							Static239.method1378(arg0, local249.anInt6144, local15, local6, local9);
						}
						Static255.aClass172_9.method5485(arg0.anInt1154, arg0.aClass3_Sub8Array2);
					}
					local249.method5274(Static255.aClass172_9);
				}
				for (@Pc(286) Class179 local286 = local86.aClass179_2; local286 != null; local286 = local286.aClass179_3) {
					@Pc(290) Class7_Sub2 local290 = local286.aClass7_Sub2_2;
					if (local290 != null) {
						if (Static204.aBoolean345) {
							Static454.method5983(arg0, local12, local6, local9);
							Static255.aClass172_9.method5485(arg0.anInt1154, arg0.aClass3_Sub8Array2);
						}
						local290.method5274(Static255.aClass172_9);
					}
				}
				Static255.aClass172_9.o(3000.0F, local53 * 1.5F);
			}
			local330 = !Static420.method5370(local15, local6, local9);
			if (local330) {
				Static444.aClass159Array3[local15].method4828(local6, local9);
				@Pc(341) Class7_Sub1 local341 = arg1.aClass7_Sub1_1;
				if (local341 != null && local341.aBoolean520) {
					if (local341.aBoolean519) {
						Static255.aClass172_9.o(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static204.aBoolean345) {
						Static454.method5983(arg0, local12, local6, local9);
						Static255.aClass172_9.method5485(arg0.anInt1154, arg0.aClass3_Sub8Array2);
					}
					local377 = local341.method5274(Static255.aClass172_9);
					if (local377 != null) {
						local377.aClass7_1 = local341;
						local377.anInt87 = local12;
						local377.anInt90 = local6;
						local377.anInt92 = local9;
						Static344.aClass138_5.method3307(local377);
					}
					if (local341.aBoolean519) {
						Static255.aClass172_9.o(3000.0F, local53 * 1.5F);
					}
				}
			}
			local406 = 0;
			local408 = 0;
			local411 = arg1.aClass7_Sub4_2;
			@Pc(414) Class7_Sub3 local414 = arg1.aClass7_Sub3_3;
			if (local411 != null || local414 != null) {
				if (Static310.anInt5498 == local6) {
					local406++;
				} else if (Static310.anInt5498 < local6) {
					local406 += 2;
				}
				if (Static111.anInt2450 == local9) {
					local406 += 3;
				} else if (Static111.anInt2450 > local9) {
					local406 += 6;
				}
				local408 = Static160.anIntArray206[local406];
				arg1.aShort60 = Static233.aShortArray70[local406];
			}
			if (local411 != null) {
				if ((local411.anInt6144 & Static56.anIntArray89[local406]) == 0) {
					arg1.aByte64 = 0;
				} else if (local411.anInt6144 == 16) {
					arg1.aByte64 = 3;
					arg1.aByte68 = Static12.aByteArray6[local406];
					arg1.aByte65 = (byte) (3 - arg1.aByte68);
				} else if (local411.anInt6144 == 32) {
					arg1.aByte64 = 6;
					arg1.aByte68 = Static25.aByteArray12[local406];
					arg1.aByte65 = (byte) (6 - arg1.aByte68);
				} else if (local411.anInt6144 == 64) {
					arg1.aByte64 = 12;
					arg1.aByte68 = Static135.aByteArray34[local406];
					arg1.aByte65 = (byte) (12 - arg1.aByte68);
				} else {
					arg1.aByte64 = 9;
					arg1.aByte68 = Static158.aByteArray45[local406];
					arg1.aByte65 = (byte) (9 - arg1.aByte68);
				}
				if ((local411.anInt6144 & local408) != 0 && !Static221.method3343(local15, local6, local9, local411.anInt6144)) {
					if (Static204.aBoolean345) {
						Static454.method5983(arg0, local12, local6, local9);
						Static255.aClass172_9.method5485(arg0.anInt1154, arg0.aClass3_Sub8Array2);
					}
					@Pc(563) Class6_Sub1 local563 = local411.method5274(Static255.aClass172_9);
					if (local563 != null) {
						local563.aClass7_1 = local411;
						local563.anInt87 = local12;
						local563.anInt90 = local6;
						local563.anInt92 = local9;
						Static344.aClass138_5.method3307(local563);
					}
				}
				@Pc(584) Class7_Sub4 local584 = arg1.aClass7_Sub4_1;
				if (local584 != null && (local584.anInt6144 & local408) != 0 && !Static221.method3343(local15, local6, local9, local584.anInt6144)) {
					if (Static204.aBoolean345) {
						Static454.method5983(arg0, local12, local6, local9);
						Static255.aClass172_9.method5485(arg0.anInt1154, arg0.aClass3_Sub8Array2);
					}
					local616 = local584.method5274(Static255.aClass172_9);
					if (local616 != null) {
						local616.aClass7_1 = local584;
						local616.anInt87 = local12;
						local616.anInt90 = local6;
						local616.anInt92 = local9;
						Static344.aClass138_5.method3307(local616);
					}
				}
			}
			if (local414 != null && !Static301.method1890(local15, local6, local9, local414.method2922())) {
				@Pc(647) Class7_Sub3 local647 = arg1.aClass7_Sub3_2;
				Static255.aClass172_9.o(3000.0F, (local53 - 0.5F) * 1.5F);
				if ((local414.anInt3658 & local408) != 0) {
					if (Static204.aBoolean345) {
						Static454.method5983(arg0, local12, local6, local9);
						Static255.aClass172_9.method5485(arg0.anInt1154, arg0.aClass3_Sub8Array2);
					}
					local616 = local414.method5274(Static255.aClass172_9);
					if (local616 != null) {
						local616.aClass7_1 = local414;
						local616.anInt87 = local12;
						local616.anInt90 = local6;
						local616.anInt92 = local9;
						Static344.aClass138_5.method3307(local616);
					}
				} else if (local414.anInt3658 == 256) {
					local706 = local414.anInt3661 - Static3.anInt65;
					local711 = local414.anInt3665 - Static254.anInt4875;
					local714 = local414.anInt3662;
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
					if (Static204.aBoolean345) {
						Static454.method5983(arg0, local12, local6, local9);
						Static255.aClass172_9.method5485(arg0.anInt1154, arg0.aClass3_Sub8Array2);
					}
					@Pc(759) Class6_Sub1 local759;
					if (local735 < local723) {
						local759 = local414.method5274(Static255.aClass172_9);
						if (local759 != null) {
							local759.aClass7_1 = local414;
							local759.anInt87 = local12;
							local759.anInt90 = local6;
							local759.anInt92 = local9;
							Static344.aClass138_5.method3307(local759);
						}
					} else if (local647 != null) {
						local759 = local647.method5274(Static255.aClass172_9);
						if (local759 != null) {
							local759.aClass7_1 = local647;
							local759.anInt87 = local12;
							local759.anInt90 = local6;
							local759.anInt92 = local9;
							Static344.aClass138_5.method3307(local759);
						}
					}
				}
				Static255.aClass172_9.o(3000.0F, local53 * 1.5F);
			}
			if (local330) {
				@Pc(814) Class7_Sub1 local814 = arg1.aClass7_Sub1_1;
				if (local814 != null && !local814.aBoolean520) {
					if (local814.aBoolean519) {
						Static255.aClass172_9.o(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static204.aBoolean345) {
						Static454.method5983(arg0, local12, local6, local9);
						Static255.aClass172_9.method5485(arg0.anInt1154, arg0.aClass3_Sub8Array2);
					}
					local616 = local814.method5274(Static255.aClass172_9);
					if (local616 != null) {
						local616.aClass7_1 = local814;
						local616.anInt87 = local12;
						local616.anInt90 = local6;
						local616.anInt92 = local9;
						Static344.aClass138_5.method3307(local616);
					}
					if (local814.aBoolean519) {
						Static255.aClass172_9.o(3000.0F, local53 * 1.5F);
					}
				}
				@Pc(880) Class7_Sub5 local880 = arg1.aClass7_Sub5_1;
				if (local880 != null && !local880.aBoolean582) {
					if (Static204.aBoolean345) {
						Static454.method5983(arg0, local12, local6, local9);
						Static255.aClass172_9.method5485(arg0.anInt1154, arg0.aClass3_Sub8Array2);
					}
					@Pc(903) Class6_Sub1 local903 = local880.method5274(Static255.aClass172_9);
					if (local903 != null) {
						local903.aClass7_1 = local880;
						local903.anInt87 = local12;
						local903.anInt90 = local6;
						local903.anInt92 = local9;
						Static344.aClass138_5.method3307(local903);
					}
				}
			}
			@Pc(924) byte local924 = arg1.aByte62;
			if (local924 != 0) {
				@Pc(941) Class118 local941;
				if (local6 < Static310.anInt5498 && (local924 & 0x4) != 0) {
					local941 = local31[local6 + 1][local9];
					if (local941 != null && local941.aBoolean301) {
						Static275.aClass22_1.method1888(local941);
					}
				}
				if (local9 < Static111.anInt2450 && (local924 & 0x2) != 0) {
					local941 = local31[local6][local9 + 1];
					if (local941 != null && local941.aBoolean301) {
						Static275.aClass22_1.method1888(local941);
					}
				}
				if (local6 > Static310.anInt5498 && (local924 & 0x1) != 0) {
					local941 = local31[local6 - 1][local9];
					if (local941 != null && local941.aBoolean301) {
						Static275.aClass22_1.method1888(local941);
					}
				}
				if (local9 > Static111.anInt2450 && (local924 & 0x8) != 0) {
					local941 = local31[local6][local9 - 1];
					if (local941 != null && local941.aBoolean301) {
						Static275.aClass22_1.method1888(local941);
					}
				}
			}
		}
		@Pc(1074) int local1074;
		@Pc(1057) Class7_Sub4 local1057;
		@Pc(1078) int local1078;
		@Pc(1030) Class179 local1030;
		if (arg1.aByte64 != 0) {
			local330 = true;
			for (local1030 = arg1.aClass179_2; local1030 != null; local1030 = local1030.aClass179_3) {
				if (local1030.aClass7_Sub2_2.anInt4317 != Static361.anInt6112 && (local1030.anInt5239 & arg1.aByte64) == arg1.aByte68) {
					local330 = false;
					break;
				}
			}
			if (local330) {
				local1057 = arg1.aClass7_Sub4_2;
				if (!Static221.method3343(local15, local6, local9, local1057.anInt6144)) {
					if (Static204.aBoolean345) {
						label682: {
							if (local1057.anInt6144 >= 16) {
								local1074 = local6 - Static310.anInt5498;
								local1078 = local9 - Static111.anInt2450;
								if (local1057.anInt6144 == 16) {
									local1074 -= Static421.anInt6887;
									local1078 += Static421.anInt6887;
									if (local1078 < local1074 && local6 > 0 && local9 <= Static37.anInt1025) {
										Static454.method5983(arg0, local12, local6 - 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt6144 == 32) {
									local1074 += Static421.anInt6887;
									local1078 += Static421.anInt6887;
									if (local1078 < -local1074 && local6 < Static405.anInt6684 && local9 < Static37.anInt1025) {
										Static454.method5983(arg0, local12, local6 + 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt6144 == 64) {
									local1074 += Static421.anInt6887;
									local1078 -= Static421.anInt6887;
									if (local1078 > local1074 && local6 < Static405.anInt6684 && local9 > 0) {
										Static454.method5983(arg0, local12, local6 + 1, local9 - 1);
										break label682;
									}
								} else if (local1057.anInt6144 == 128) {
									local1074 -= Static421.anInt6887;
									local1078 -= Static421.anInt6887;
									if (local1078 > -local1074 && local6 > 0 && local9 > 0) {
										Static454.method5983(arg0, local12, local6 - 1, local9 - 1);
										break label682;
									}
								}
							}
							Static454.method5983(arg0, local12, local6, local9);
						}
						Static255.aClass172_9.method5485(arg0.anInt1154, arg0.aClass3_Sub8Array2);
					}
					@Pc(1216) Class6_Sub1 local1216 = local1057.method5274(Static255.aClass172_9);
					if (local1216 != null) {
						local1216.aClass7_1 = local1057;
						local1216.anInt87 = local12;
						local1216.anInt90 = local6;
						local1216.anInt92 = local9;
						Static344.aClass138_5.method3307(local1216);
					}
				}
				arg1.aByte64 = 0;
			}
		}
		@Pc(1333) int local1333;
		if (arg1.aBoolean302) {
			try {
				arg1.aBoolean302 = false;
				@Pc(1245) int local1245 = 0;
				label625: for (local1030 = arg1.aClass179_2; local1030 != null; local1030 = local1030.aClass179_3) {
					@Pc(1252) Class7_Sub2 local1252 = local1030.aClass7_Sub2_2;
					if (local1252.anInt4317 != Static361.anInt6112) {
						for (local1074 = local1252.aShort71; local1074 <= local1252.aShort72; local1074++) {
							for (local1078 = local1252.aShort73; local1078 <= local1252.aShort70; local1078++) {
								@Pc(1270) Class118 local1270 = local31[local1074][local1078];
								if (local1270.aBoolean300) {
									arg1.aBoolean302 = true;
									continue label625;
								}
								if (local1270.aByte64 != 0) {
									local706 = 0;
									if (local1074 > local1252.aShort71) {
										local706++;
									}
									if (local1074 < local1252.aShort72) {
										local706 += 4;
									}
									if (local1078 > local1252.aShort73) {
										local706 += 8;
									}
									if (local1078 < local1252.aShort70) {
										local706 += 2;
									}
									if ((local706 & local1270.aByte64) == arg1.aByte65) {
										arg1.aBoolean302 = true;
										continue label625;
									}
								}
							}
						}
						local1078 = Static310.anInt5498 - local1252.aShort71;
						local1333 = local1252.aShort72 - Static310.anInt5498;
						if (local1333 > local1078) {
							local1078 = local1333;
						}
						local706 = Static111.anInt2450 - local1252.aShort73;
						local711 = local1252.aShort70 - Static111.anInt2450;
						if (local711 > local706) {
							local706 = local711;
						}
						arg0.aClass7_Sub2Array2[local1245] = local1252;
						arg0.anIntArray85[local1245++] = local1078 + local706;
					}
				}
				while (local1245 > 0) {
					local408 = -50;
					local1074 = -1;
					@Pc(1384) Class7_Sub2 local1384;
					for (local1078 = 0; local1078 < local1245; local1078++) {
						local1384 = arg0.aClass7_Sub2Array2[local1078];
						if (local1384.anInt4317 != Static361.anInt6112) {
							local706 = arg0.anIntArray85[local1078];
							if (local706 > local408) {
								local408 = local706;
								local1074 = local1078;
							} else if (local706 == local408) {
								local711 = local1384.anInt4318 - Static3.anInt65;
								local714 = local1384.anInt4321 - Static254.anInt4875;
								local723 = arg0.aClass7_Sub2Array2[local1074].anInt4318 - Static3.anInt65;
								local735 = arg0.aClass7_Sub2Array2[local1074].anInt4321 - Static254.anInt4875;
								if (local711 * local711 + local714 * local714 > local723 * local723 + local735 * local735) {
									local1074 = local1078;
								}
							}
						}
					}
					if (local1074 == -1) {
						break;
					}
					local1384 = arg0.aClass7_Sub2Array2[local1074];
					local1384.anInt4317 = Static361.anInt6112;
					if (!Static358.method4749(local15, local1384.aShort71, local1384.aShort72, local1384.aShort73, local1384.aShort70, local1384.method3494())) {
						if (Static204.aBoolean345) {
							if (local1384.aByte76 == 0) {
								Static160.method2646(arg0, local12, local1384.aShort71, local1384.aShort73, local1384.aShort72, local1384.aShort70);
							} else {
								Static454.method5983(arg0, local12, local6, local9);
								local706 = local6 - Static310.anInt5498;
								local711 = local9 - Static111.anInt2450;
								if (local1384.aByte76 == 2) {
									if (local711 > -local706) {
										Static17.method370(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static17.method370(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local711 > local706) {
									Static17.method370(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static17.method370(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static255.aClass172_9.method5485(arg0.anInt1154, arg0.aClass3_Sub8Array2);
						}
						local616 = local1384.method5274(Static255.aClass172_9);
						if (local616 != null) {
							local616.aClass7_1 = local1384;
							local616.anInt87 = local12;
							local616.anInt90 = local1384.aShort71;
							local616.anInt92 = local1384.aShort73;
							Static344.aClass138_5.method3307(local616);
						}
					}
					for (local706 = local1384.aShort71; local706 <= local1384.aShort72; local706++) {
						for (local711 = local1384.aShort73; local711 <= local1384.aShort70; local711++) {
							@Pc(1609) Class118 local1609 = local31[local706][local711];
							if (local1609.aByte64 != 0) {
								Static275.aClass22_1.method1888(local1609);
							} else if ((local706 != local6 || local711 != local9) && local1609.aBoolean301) {
								Static275.aClass22_1.method1888(local1609);
							}
						}
					}
				}
				if (arg1.aBoolean302) {
					return;
				}
			} catch (@Pc(1647) Exception local1647) {
				arg1.aBoolean302 = false;
			}
		}
		if (arg1.aClass227_1 != null && arg1.aByte67 == (byte) (Static437.anInt7370 & 0xFF)) {
			@Pc(1664) Class227 local1664 = arg1.aClass227_1;
			local406 = Static444.aClass159Array3[local12].I(local6, local9);
			if (local12 < Static362.anInt6122 - 1) {
				local408 = Static444.aClass159Array3[local12].I(local6, local9) - Static444.aClass159Array3[local12 + 1].I(local6, local9);
			} else {
				local408 = 0x8 << Static336.anInt5747;
			}
			Static12.aClass107_1.method4903(local21, local406, local27, arg0.anIntArray86);
			local1074 = arg0.anIntArray86[2];
			Static12.aClass107_1.method4903(local21, local406 - local408, local27, arg0.anIntArray86);
			local1078 = arg0.anIntArray86[2];
			local1333 = local1074;
			local706 = local1078;
			if (local1074 > local1078) {
				local1333 = local1078;
				local706 = local1074;
			}
			local1333 -= Static391.anInt6724;
			local706 += Static391.anInt6724;
			local1664.anInt6185 = local1333;
			local1664.anInt6186 = local706;
			local1664.aBoolean537 = true;
			Static255.aClass172_9.method5471(local1664);
		}
		if (!arg1.aBoolean301) {
			return;
		}
		if (arg1.aByte64 != 0) {
			return;
		}
		if (local6 <= Static310.anInt5498 && local6 > Static295.anInt5287) {
			local86 = local31[local6 - 1][local9];
			if (local86 != null && local86.aBoolean301) {
				return;
			}
		}
		if (local6 >= Static310.anInt5498 && local6 < Static415.anInt6801 - 1) {
			local86 = local31[local6 + 1][local9];
			if (local86 != null && local86.aBoolean301) {
				return;
			}
		}
		if (local9 <= Static111.anInt2450 && local9 > Static158.anInt3163) {
			local86 = local31[local6][local9 - 1];
			if (local86 != null && local86.aBoolean301) {
				return;
			}
		}
		if (local9 >= Static111.anInt2450 && local9 < Static259.anInt4915 - 1) {
			local86 = local31[local6][local9 + 1];
			if (local86 != null && local86.aBoolean301) {
				return;
			}
		}
		arg1.aBoolean301 = false;
		Static97.anInt2207--;
		@Pc(1855) Class7_Sub5 local1855 = arg1.aClass7_Sub5_1;
		if (local1855 != null && local1855.aBoolean582) {
			if (Static204.aBoolean345) {
				Static454.method5983(arg0, local12, local6, local9);
				Static255.aClass172_9.method5485(arg0.anInt1154, arg0.aClass3_Sub8Array2);
			}
			@Pc(1878) Class6_Sub1 local1878 = local1855.method5274(Static255.aClass172_9);
			if (local1878 != null) {
				local1878.aClass7_1 = local1855;
				local1878.anInt87 = local12;
				local1878.anInt90 = local6;
				local1878.anInt92 = local9;
				Static344.aClass138_5.method3307(local1878);
			}
		}
		if (arg1.aShort60 != 0) {
			@Pc(1902) Class7_Sub3 local1902 = arg1.aClass7_Sub3_3;
			if (local1902 != null && !Static301.method1890(local15, local6, local9, local1902.method2922())) {
				if ((local1902.anInt3658 & arg1.aShort60) != 0) {
					if (Static204.aBoolean345) {
						Static454.method5983(arg0, local12, local6, local9);
						Static255.aClass172_9.method5485(arg0.anInt1154, arg0.aClass3_Sub8Array2);
					}
					local377 = local1902.method5274(Static255.aClass172_9);
					if (local377 != null) {
						local377.aClass7_1 = local1902;
						local377.anInt87 = local12;
						local377.anInt90 = local6;
						local377.anInt92 = local9;
						Static344.aClass138_5.method3307(local377);
					}
				} else if (local1902.anInt3658 == 256) {
					local408 = local1902.anInt3661 - Static3.anInt65;
					local1074 = local1902.anInt3665 - Static254.anInt4875;
					local1078 = local1902.anInt3662;
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
					if (Static204.aBoolean345) {
						Static454.method5983(arg0, local12, local6, local9);
						Static255.aClass172_9.method5485(arg0.anInt1154, arg0.aClass3_Sub8Array2);
					}
					@Pc(2012) Class7_Sub3 local2012 = arg1.aClass7_Sub3_2;
					@Pc(2020) Class6_Sub1 local2020;
					if (local706 > local1333) {
						local2020 = local1902.method5274(Static255.aClass172_9);
						if (local2020 != null) {
							local2020.aClass7_1 = local1902;
							local2020.anInt87 = local12;
							local2020.anInt90 = local6;
							local2020.anInt92 = local9;
							Static344.aClass138_5.method3307(local2020);
						}
					} else if (local2012 != null) {
						local2020 = local2012.method5274(Static255.aClass172_9);
						if (local2020 != null) {
							local2020.aClass7_1 = local2012;
							local2020.anInt87 = local12;
							local2020.anInt90 = local6;
							local2020.anInt92 = local9;
							Static344.aClass138_5.method3307(local2020);
						}
					}
				}
			}
			local1057 = arg1.aClass7_Sub4_2;
			local411 = arg1.aClass7_Sub4_1;
			@Pc(2105) Class6_Sub1 local2105;
			if (local411 != null && (local411.anInt6144 & arg1.aShort60) != 0 && !Static221.method3343(local15, local6, local9, local411.anInt6144)) {
				if (Static204.aBoolean345) {
					Static239.method1378(arg0, local411.anInt6144, local12, local6, local9);
					Static255.aClass172_9.method5485(arg0.anInt1154, arg0.aClass3_Sub8Array2);
				}
				local2105 = local411.method5274(Static255.aClass172_9);
				if (local2105 != null) {
					local2105.aClass7_1 = local411;
					local2105.anInt87 = local12;
					local2105.anInt90 = local6;
					local2105.anInt92 = local9;
					Static344.aClass138_5.method3307(local2105);
				}
			}
			if (local1057 != null && (local1057.anInt6144 & arg1.aShort60) != 0 && !Static221.method3343(local15, local6, local9, local1057.anInt6144)) {
				if (Static204.aBoolean345) {
					Static239.method1378(arg0, local1057.anInt6144, local12, local6, local9);
					Static255.aClass172_9.method5485(arg0.anInt1154, arg0.aClass3_Sub8Array2);
				}
				local2105 = local1057.method5274(Static255.aClass172_9);
				if (local2105 != null) {
					local2105.aClass7_1 = local1057;
					local2105.anInt87 = local12;
					local2105.anInt90 = local6;
					local2105.anInt92 = local9;
					Static344.aClass138_5.method3307(local2105);
				}
			}
		}
		@Pc(2191) Class118 local2191;
		if (local12 < Static362.anInt6122 - 1) {
			local2191 = Static263.aClass118ArrayArrayArray2[local12 + 1][local6][local9];
			if (local2191 != null && local2191.aBoolean301) {
				Static275.aClass22_1.method1897(local2191);
			}
		}
		if (local6 < Static310.anInt5498) {
			local2191 = local31[local6 + 1][local9];
			if (local2191 != null && local2191.aBoolean301) {
				Static275.aClass22_1.method1888(local2191);
			}
		}
		if (local9 < Static111.anInt2450) {
			local2191 = local31[local6][local9 + 1];
			if (local2191 != null && local2191.aBoolean301) {
				Static275.aClass22_1.method1888(local2191);
			}
		}
		if (local6 > Static310.anInt5498) {
			local2191 = local31[local6 - 1][local9];
			if (local2191 != null && local2191.aBoolean301) {
				Static275.aClass22_1.method1888(local2191);
			}
		}
		if (local9 > Static111.anInt2450) {
			local2191 = local31[local6][local9 - 1];
			if (local2191 != null && local2191.aBoolean301) {
				Static275.aClass22_1.method1888(local2191);
			}
		}
	}
}
