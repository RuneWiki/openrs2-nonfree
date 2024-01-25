import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!kn", name = "e", descriptor = "I")
	public static int anInt3990;

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray32 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!kn", name = "f", descriptor = "I")
	public static int anInt3991 = 0;

	@OriginalMember(owner = "client!kn", name = "g", descriptor = "[[F")
	public static final float[][] aFloatArrayArray5 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lclient!sq;Lclient!rb;)V")
	public static void method3116(@OriginalArg(0) Class183 arg0, @OriginalArg(1) Class216 arg1) {
		if (!arg1.aBoolean507) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort83;
		@Pc(9) short local9 = arg1.aShort81;
		@Pc(12) byte local12 = arg1.aByte81;
		@Pc(15) byte local15 = arg1.aByte79;
		@Pc(21) int local21 = (local6 << Static41.anInt612) + Static324.anInt5325;
		@Pc(27) int local27 = (local9 << Static41.anInt612) + Static324.anInt5325;
		@Pc(31) Class216[][] local31 = Static259.aClass216ArrayArrayArray3[local12];
		@Pc(53) float local53;
		if (Static397.aClass139Array2 == Static452.aClass139Array3) {
			Static335.aClass117_6.a(Static157.aClass139Array1[0].ca(local21, local27), Static258.method3623(local6, local9), Static85.method5073(local6, local9), Static364.method4778(local6, local9));
			local53 = 251.5F;
		} else {
			local53 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static335.aClass117_6.da(3000.0F, local53 * 1.5F);
		@Pc(86) Class216 local86;
		@Pc(616) Class111_Sub3 local616;
		@Pc(711) int local711;
		@Pc(714) int local714;
		@Pc(723) int local723;
		@Pc(735) int local735;
		@Pc(406) int local406;
		@Pc(330) boolean local330;
		@Pc(377) Class111_Sub3 local377;
		@Pc(408) int local408;
		@Pc(411) Class11_Sub3 local411;
		@Pc(706) int local706;
		if (arg1.aBoolean508) {
			if (Static284.aBoolean432) {
				if (local12 > 0) {
					local86 = Static259.aClass216ArrayArrayArray3[local12 - 1][local6][local9];
					if (local86 != null && local86.aBoolean507) {
						return;
					}
				}
				if (local6 <= Static166.anInt2722 && local6 > Static61.anInt7290) {
					local86 = local31[local6 - 1][local9];
					if (local86 != null && local86.aBoolean507 && (local86.aBoolean508 || (arg1.aByte83 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static166.anInt2722 && local6 < Static9.anInt163 - 1) {
					local86 = local31[local6 + 1][local9];
					if (local86 != null && local86.aBoolean507 && (local86.aBoolean508 || (arg1.aByte83 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static44.anInt638 && local9 > Static260.anInt4567) {
					local86 = local31[local6][local9 - 1];
					if (local86 != null && local86.aBoolean507 && (local86.aBoolean508 || (arg1.aByte83 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static44.anInt638 && local9 < Static267.anInt4664 - 1) {
					local86 = local31[local6][local9 + 1];
					if (local86 != null && local86.aBoolean507 && (local86.aBoolean508 || (arg1.aByte83 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static284.aBoolean432 = true;
			}
			arg1.aBoolean508 = false;
			if (arg1.aClass216_1 != null) {
				local86 = arg1.aClass216_1;
				Static335.aClass117_6.da(3000.0F, (201.5F - (float) (local86.aByte79 + 1) * 50.0F) * 1.5F);
				if (!Static292.method3894(local86.aByte79, local6, local9)) {
					Static452.aClass139Array3[local86.aByte79].method5364(local6, local9);
				}
				@Pc(249) Class11_Sub3 local249 = local86.aClass11_Sub3_3;
				if (local249 != null) {
					if (Static358.aBoolean574) {
						if ((local249.anInt4000 & arg1.aShort82) == 0) {
							Static127.method1578(arg0, local12, local6, local9);
						} else {
							Static85.method5075(arg0, local249.anInt4000, local15, local6, local9);
						}
						Static335.aClass117_6.method5693(arg0.anInt4999, arg0.aClass1_Sub29Array3);
					}
					local249.method5181(Static335.aClass117_6);
				}
				for (@Pc(286) Class259 local286 = local86.aClass259_1; local286 != null; local286 = local286.aClass259_4) {
					@Pc(290) Class11_Sub1 local290 = local286.aClass11_Sub1_2;
					if (local290 != null) {
						if (Static358.aBoolean574) {
							Static127.method1578(arg0, local12, local6, local9);
							Static335.aClass117_6.method5693(arg0.anInt4999, arg0.aClass1_Sub29Array3);
						}
						local290.method5181(Static335.aClass117_6);
					}
				}
				Static335.aClass117_6.da(3000.0F, local53 * 1.5F);
			}
			local330 = !Static292.method3894(local15, local6, local9);
			if (local330) {
				Static452.aClass139Array3[local15].method5364(local6, local9);
				@Pc(341) Class11_Sub2 local341 = arg1.aClass11_Sub2_2;
				if (local341 != null && local341.aBoolean445) {
					if (local341.aBoolean444) {
						Static335.aClass117_6.da(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static358.aBoolean574) {
						Static127.method1578(arg0, local12, local6, local9);
						Static335.aClass117_6.method5693(arg0.anInt4999, arg0.aClass1_Sub29Array3);
					}
					local377 = local341.method5181(Static335.aClass117_6);
					if (local377 != null) {
						local377.aClass11_1 = local341;
						local377.anInt3923 = local12;
						local377.anInt3920 = local6;
						local377.anInt3921 = local9;
						Static181.aClass63_2.method1024(local377);
					}
					if (local341.aBoolean444) {
						Static335.aClass117_6.da(3000.0F, local53 * 1.5F);
					}
				}
			}
			local406 = 0;
			local408 = 0;
			local411 = arg1.aClass11_Sub3_3;
			@Pc(414) Class11_Sub4 local414 = arg1.aClass11_Sub4_2;
			if (local411 != null || local414 != null) {
				if (Static166.anInt2722 == local6) {
					local406++;
				} else if (Static166.anInt2722 < local6) {
					local406 += 2;
				}
				if (Static44.anInt638 == local9) {
					local406 += 3;
				} else if (Static44.anInt638 > local9) {
					local406 += 6;
				}
				local408 = Static217.anIntArray122[local406];
				arg1.aShort82 = Static118.aShortArray24[local406];
			}
			if (local411 != null) {
				if ((local411.anInt4000 & Static75.anIntArray116[local406]) == 0) {
					arg1.aByte80 = 0;
				} else if (local411.anInt4000 == 16) {
					arg1.aByte80 = 3;
					arg1.aByte84 = Static101.aByteArray15[local406];
					arg1.aByte82 = (byte) (3 - arg1.aByte84);
				} else if (local411.anInt4000 == 32) {
					arg1.aByte80 = 6;
					arg1.aByte84 = Static461.aByteArray96[local406];
					arg1.aByte82 = (byte) (6 - arg1.aByte84);
				} else if (local411.anInt4000 == 64) {
					arg1.aByte80 = 12;
					arg1.aByte84 = Static142.aByteArray23[local406];
					arg1.aByte82 = (byte) (12 - arg1.aByte84);
				} else {
					arg1.aByte80 = 9;
					arg1.aByte84 = Static241.aByteArray61[local406];
					arg1.aByte82 = (byte) (9 - arg1.aByte84);
				}
				if ((local411.anInt4000 & local408) != 0 && !Static155.method2065(local15, local6, local9, local411.anInt4000)) {
					if (Static358.aBoolean574) {
						Static127.method1578(arg0, local12, local6, local9);
						Static335.aClass117_6.method5693(arg0.anInt4999, arg0.aClass1_Sub29Array3);
					}
					@Pc(563) Class111_Sub3 local563 = local411.method5181(Static335.aClass117_6);
					if (local563 != null) {
						local563.aClass11_1 = local411;
						local563.anInt3923 = local12;
						local563.anInt3920 = local6;
						local563.anInt3921 = local9;
						Static181.aClass63_2.method1024(local563);
					}
				}
				@Pc(584) Class11_Sub3 local584 = arg1.aClass11_Sub3_2;
				if (local584 != null && (local584.anInt4000 & local408) != 0 && !Static155.method2065(local15, local6, local9, local584.anInt4000)) {
					if (Static358.aBoolean574) {
						Static127.method1578(arg0, local12, local6, local9);
						Static335.aClass117_6.method5693(arg0.anInt4999, arg0.aClass1_Sub29Array3);
					}
					local616 = local584.method5181(Static335.aClass117_6);
					if (local616 != null) {
						local616.aClass11_1 = local584;
						local616.anInt3923 = local12;
						local616.anInt3920 = local6;
						local616.anInt3921 = local9;
						Static181.aClass63_2.method1024(local616);
					}
				}
			}
			if (local414 != null && !Static415.method5301(local15, local6, local9, local414.method4889())) {
				@Pc(647) Class11_Sub4 local647 = arg1.aClass11_Sub4_1;
				Static335.aClass117_6.da(3000.0F, (local53 - 0.5F) * 1.5F);
				if ((local414.anInt6084 & local408) != 0) {
					if (Static358.aBoolean574) {
						Static127.method1578(arg0, local12, local6, local9);
						Static335.aClass117_6.method5693(arg0.anInt4999, arg0.aClass1_Sub29Array3);
					}
					local616 = local414.method5181(Static335.aClass117_6);
					if (local616 != null) {
						local616.aClass11_1 = local414;
						local616.anInt3923 = local12;
						local616.anInt3920 = local6;
						local616.anInt3921 = local9;
						Static181.aClass63_2.method1024(local616);
					}
				} else if (local414.anInt6084 == 256) {
					local706 = local414.anInt6083 - Static188.anInt3434;
					local711 = local414.anInt6086 - Static197.anInt3614;
					local714 = local414.anInt6092;
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
					if (Static358.aBoolean574) {
						Static127.method1578(arg0, local12, local6, local9);
						Static335.aClass117_6.method5693(arg0.anInt4999, arg0.aClass1_Sub29Array3);
					}
					@Pc(759) Class111_Sub3 local759;
					if (local735 < local723) {
						local759 = local414.method5181(Static335.aClass117_6);
						if (local759 != null) {
							local759.aClass11_1 = local414;
							local759.anInt3923 = local12;
							local759.anInt3920 = local6;
							local759.anInt3921 = local9;
							Static181.aClass63_2.method1024(local759);
						}
					} else if (local647 != null) {
						local759 = local647.method5181(Static335.aClass117_6);
						if (local759 != null) {
							local759.aClass11_1 = local647;
							local759.anInt3923 = local12;
							local759.anInt3920 = local6;
							local759.anInt3921 = local9;
							Static181.aClass63_2.method1024(local759);
						}
					}
				}
				Static335.aClass117_6.da(3000.0F, local53 * 1.5F);
			}
			if (local330) {
				@Pc(814) Class11_Sub2 local814 = arg1.aClass11_Sub2_2;
				if (local814 != null && !local814.aBoolean445) {
					if (local814.aBoolean444) {
						Static335.aClass117_6.da(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static358.aBoolean574) {
						Static127.method1578(arg0, local12, local6, local9);
						Static335.aClass117_6.method5693(arg0.anInt4999, arg0.aClass1_Sub29Array3);
					}
					local616 = local814.method5181(Static335.aClass117_6);
					if (local616 != null) {
						local616.aClass11_1 = local814;
						local616.anInt3923 = local12;
						local616.anInt3920 = local6;
						local616.anInt3921 = local9;
						Static181.aClass63_2.method1024(local616);
					}
					if (local814.aBoolean444) {
						Static335.aClass117_6.da(3000.0F, local53 * 1.5F);
					}
				}
				@Pc(880) Class11_Sub5 local880 = arg1.aClass11_Sub5_1;
				if (local880 != null && !local880.aBoolean518) {
					if (Static358.aBoolean574) {
						Static127.method1578(arg0, local12, local6, local9);
						Static335.aClass117_6.method5693(arg0.anInt4999, arg0.aClass1_Sub29Array3);
					}
					@Pc(903) Class111_Sub3 local903 = local880.method5181(Static335.aClass117_6);
					if (local903 != null) {
						local903.aClass11_1 = local880;
						local903.anInt3923 = local12;
						local903.anInt3920 = local6;
						local903.anInt3921 = local9;
						Static181.aClass63_2.method1024(local903);
					}
				}
			}
			@Pc(924) byte local924 = arg1.aByte83;
			if (local924 != 0) {
				@Pc(941) Class216 local941;
				if (local6 < Static166.anInt2722 && (local924 & 0x4) != 0) {
					local941 = local31[local6 + 1][local9];
					if (local941 != null && local941.aBoolean507) {
						Static352.aClass12_1.method4091(local941);
					}
				}
				if (local9 < Static44.anInt638 && (local924 & 0x2) != 0) {
					local941 = local31[local6][local9 + 1];
					if (local941 != null && local941.aBoolean507) {
						Static352.aClass12_1.method4091(local941);
					}
				}
				if (local6 > Static166.anInt2722 && (local924 & 0x1) != 0) {
					local941 = local31[local6 - 1][local9];
					if (local941 != null && local941.aBoolean507) {
						Static352.aClass12_1.method4091(local941);
					}
				}
				if (local9 > Static44.anInt638 && (local924 & 0x8) != 0) {
					local941 = local31[local6][local9 - 1];
					if (local941 != null && local941.aBoolean507) {
						Static352.aClass12_1.method4091(local941);
					}
				}
			}
		}
		@Pc(1074) int local1074;
		@Pc(1057) Class11_Sub3 local1057;
		@Pc(1078) int local1078;
		@Pc(1030) Class259 local1030;
		if (arg1.aByte80 != 0) {
			local330 = true;
			for (local1030 = arg1.aClass259_1; local1030 != null; local1030 = local1030.aClass259_4) {
				if (local1030.aClass11_Sub1_2.anInt6436 != Static248.anInt4433 && (local1030.anInt6824 & arg1.aByte80) == arg1.aByte84) {
					local330 = false;
					break;
				}
			}
			if (local330) {
				local1057 = arg1.aClass11_Sub3_3;
				if (!Static155.method2065(local15, local6, local9, local1057.anInt4000)) {
					if (Static358.aBoolean574) {
						label682: {
							if (local1057.anInt4000 >= 16) {
								local1074 = local6 - Static166.anInt2722;
								local1078 = local9 - Static44.anInt638;
								if (local1057.anInt4000 == 16) {
									local1074 -= Static324.anInt5325;
									local1078 += Static324.anInt5325;
									if (local1078 < local1074 && local6 > 0 && local9 <= Static325.anInt5351) {
										Static127.method1578(arg0, local12, local6 - 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt4000 == 32) {
									local1074 += Static324.anInt5325;
									local1078 += Static324.anInt5325;
									if (local1078 < -local1074 && local6 < Static174.anInt2873 && local9 < Static325.anInt5351) {
										Static127.method1578(arg0, local12, local6 + 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt4000 == 64) {
									local1074 += Static324.anInt5325;
									local1078 -= Static324.anInt5325;
									if (local1078 > local1074 && local6 < Static174.anInt2873 && local9 > 0) {
										Static127.method1578(arg0, local12, local6 + 1, local9 - 1);
										break label682;
									}
								} else if (local1057.anInt4000 == 128) {
									local1074 -= Static324.anInt5325;
									local1078 -= Static324.anInt5325;
									if (local1078 > -local1074 && local6 > 0 && local9 > 0) {
										Static127.method1578(arg0, local12, local6 - 1, local9 - 1);
										break label682;
									}
								}
							}
							Static127.method1578(arg0, local12, local6, local9);
						}
						Static335.aClass117_6.method5693(arg0.anInt4999, arg0.aClass1_Sub29Array3);
					}
					@Pc(1216) Class111_Sub3 local1216 = local1057.method5181(Static335.aClass117_6);
					if (local1216 != null) {
						local1216.aClass11_1 = local1057;
						local1216.anInt3923 = local12;
						local1216.anInt3920 = local6;
						local1216.anInt3921 = local9;
						Static181.aClass63_2.method1024(local1216);
					}
				}
				arg1.aByte80 = 0;
			}
		}
		@Pc(1333) int local1333;
		if (arg1.aBoolean509) {
			try {
				arg1.aBoolean509 = false;
				@Pc(1245) int local1245 = 0;
				label625: for (local1030 = arg1.aClass259_1; local1030 != null; local1030 = local1030.aClass259_4) {
					@Pc(1252) Class11_Sub1 local1252 = local1030.aClass11_Sub1_2;
					if (local1252.anInt6436 != Static248.anInt4433) {
						for (local1074 = local1252.aShort103; local1074 <= local1252.aShort100; local1074++) {
							for (local1078 = local1252.aShort101; local1078 <= local1252.aShort102; local1078++) {
								@Pc(1270) Class216 local1270 = local31[local1074][local1078];
								if (local1270.aBoolean508) {
									arg1.aBoolean509 = true;
									continue label625;
								}
								if (local1270.aByte80 != 0) {
									local706 = 0;
									if (local1074 > local1252.aShort103) {
										local706++;
									}
									if (local1074 < local1252.aShort100) {
										local706 += 4;
									}
									if (local1078 > local1252.aShort101) {
										local706 += 8;
									}
									if (local1078 < local1252.aShort102) {
										local706 += 2;
									}
									if ((local706 & local1270.aByte80) == arg1.aByte82) {
										arg1.aBoolean509 = true;
										continue label625;
									}
								}
							}
						}
						local1078 = Static166.anInt2722 - local1252.aShort103;
						local1333 = local1252.aShort100 - Static166.anInt2722;
						if (local1333 > local1078) {
							local1078 = local1333;
						}
						local706 = Static44.anInt638 - local1252.aShort101;
						local711 = local1252.aShort102 - Static44.anInt638;
						if (local711 > local706) {
							local706 = local711;
						}
						arg0.aClass11_Sub1Array3[local1245] = local1252;
						arg0.anIntArray377[local1245++] = local1078 + local706;
					}
				}
				while (local1245 > 0) {
					local408 = -50;
					local1074 = -1;
					@Pc(1384) Class11_Sub1 local1384;
					for (local1078 = 0; local1078 < local1245; local1078++) {
						local1384 = arg0.aClass11_Sub1Array3[local1078];
						if (local1384.anInt6436 != Static248.anInt4433) {
							local706 = arg0.anIntArray377[local1078];
							if (local706 > local408) {
								local408 = local706;
								local1074 = local1078;
							} else if (local706 == local408) {
								local711 = local1384.anInt6428 - Static188.anInt3434;
								local714 = local1384.anInt6430 - Static197.anInt3614;
								local723 = arg0.aClass11_Sub1Array3[local1074].anInt6428 - Static188.anInt3434;
								local735 = arg0.aClass11_Sub1Array3[local1074].anInt6430 - Static197.anInt3614;
								if (local711 * local711 + local714 * local714 > local723 * local723 + local735 * local735) {
									local1074 = local1078;
								}
							}
						}
					}
					if (local1074 == -1) {
						break;
					}
					local1384 = arg0.aClass11_Sub1Array3[local1074];
					local1384.anInt6436 = Static248.anInt4433;
					if (!Static128.method1583(local15, local1384.aShort103, local1384.aShort100, local1384.aShort101, local1384.aShort102, local1384.method5184())) {
						if (Static358.aBoolean574) {
							if (local1384.aByte89 == 0) {
								Static129.method1585(arg0, local12, local1384.aShort103, local1384.aShort101, local1384.aShort100, local1384.aShort102);
							} else {
								Static127.method1578(arg0, local12, local6, local9);
								local706 = local6 - Static166.anInt2722;
								local711 = local9 - Static44.anInt638;
								if (local1384.aByte89 == 2) {
									if (local711 > -local706) {
										Static233.method3334(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static233.method3334(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local711 > local706) {
									Static233.method3334(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static233.method3334(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static335.aClass117_6.method5693(arg0.anInt4999, arg0.aClass1_Sub29Array3);
						}
						local616 = local1384.method5181(Static335.aClass117_6);
						if (local616 != null) {
							local616.aClass11_1 = local1384;
							local616.anInt3923 = local12;
							local616.anInt3920 = local1384.aShort103;
							local616.anInt3921 = local1384.aShort101;
							Static181.aClass63_2.method1024(local616);
						}
					}
					for (local706 = local1384.aShort103; local706 <= local1384.aShort100; local706++) {
						for (local711 = local1384.aShort101; local711 <= local1384.aShort102; local711++) {
							@Pc(1609) Class216 local1609 = local31[local706][local711];
							if (local1609.aByte80 != 0) {
								Static352.aClass12_1.method4091(local1609);
							} else if ((local706 != local6 || local711 != local9) && local1609.aBoolean507) {
								Static352.aClass12_1.method4091(local1609);
							}
						}
					}
				}
				if (arg1.aBoolean509) {
					return;
				}
			} catch (@Pc(1647) Exception local1647) {
				arg1.aBoolean509 = false;
			}
		}
		if (arg1.aClass232_2 != null && arg1.aByte78 == (byte) (Static271.anInt4847 & 0xFF)) {
			@Pc(1664) Class232 local1664 = arg1.aClass232_2;
			local406 = Static452.aClass139Array3[local12].ua(local6, local9);
			if (local12 < Static112.anInt1710 - 1) {
				local408 = Static452.aClass139Array3[local12].ua(local6, local9) - Static452.aClass139Array3[local12 + 1].ua(local6, local9);
			} else {
				local408 = 0x8 << Static41.anInt612;
			}
			Static378.aClass34_7.method4360(local21, local406, local27, arg0.anIntArray376);
			local1074 = arg0.anIntArray376[2];
			Static378.aClass34_7.method4360(local21, local406 - local408, local27, arg0.anIntArray376);
			local1078 = arg0.anIntArray376[2];
			local1333 = local1074;
			local706 = local1078;
			if (local1074 > local1078) {
				local1333 = local1078;
				local706 = local1074;
			}
			local1333 -= Static212.anInt3919;
			local706 += Static212.anInt3919;
			local1664.anInt6068 = local1333;
			local1664.anInt6067 = local706;
			local1664.aBoolean536 = true;
			Static335.aClass117_6.method5699(local1664);
		}
		if (!arg1.aBoolean507) {
			return;
		}
		if (arg1.aByte80 != 0) {
			return;
		}
		if (local6 <= Static166.anInt2722 && local6 > Static61.anInt7290) {
			local86 = local31[local6 - 1][local9];
			if (local86 != null && local86.aBoolean507) {
				return;
			}
		}
		if (local6 >= Static166.anInt2722 && local6 < Static9.anInt163 - 1) {
			local86 = local31[local6 + 1][local9];
			if (local86 != null && local86.aBoolean507) {
				return;
			}
		}
		if (local9 <= Static44.anInt638 && local9 > Static260.anInt4567) {
			local86 = local31[local6][local9 - 1];
			if (local86 != null && local86.aBoolean507) {
				return;
			}
		}
		if (local9 >= Static44.anInt638 && local9 < Static267.anInt4664 - 1) {
			local86 = local31[local6][local9 + 1];
			if (local86 != null && local86.aBoolean507) {
				return;
			}
		}
		arg1.aBoolean507 = false;
		Static97.anInt1300--;
		@Pc(1855) Class11_Sub5 local1855 = arg1.aClass11_Sub5_1;
		if (local1855 != null && local1855.aBoolean518) {
			if (Static358.aBoolean574) {
				Static127.method1578(arg0, local12, local6, local9);
				Static335.aClass117_6.method5693(arg0.anInt4999, arg0.aClass1_Sub29Array3);
			}
			@Pc(1878) Class111_Sub3 local1878 = local1855.method5181(Static335.aClass117_6);
			if (local1878 != null) {
				local1878.aClass11_1 = local1855;
				local1878.anInt3923 = local12;
				local1878.anInt3920 = local6;
				local1878.anInt3921 = local9;
				Static181.aClass63_2.method1024(local1878);
			}
		}
		if (arg1.aShort82 != 0) {
			@Pc(1902) Class11_Sub4 local1902 = arg1.aClass11_Sub4_2;
			if (local1902 != null && !Static415.method5301(local15, local6, local9, local1902.method4889())) {
				if ((local1902.anInt6084 & arg1.aShort82) != 0) {
					if (Static358.aBoolean574) {
						Static127.method1578(arg0, local12, local6, local9);
						Static335.aClass117_6.method5693(arg0.anInt4999, arg0.aClass1_Sub29Array3);
					}
					local377 = local1902.method5181(Static335.aClass117_6);
					if (local377 != null) {
						local377.aClass11_1 = local1902;
						local377.anInt3923 = local12;
						local377.anInt3920 = local6;
						local377.anInt3921 = local9;
						Static181.aClass63_2.method1024(local377);
					}
				} else if (local1902.anInt6084 == 256) {
					local408 = local1902.anInt6083 - Static188.anInt3434;
					local1074 = local1902.anInt6086 - Static197.anInt3614;
					local1078 = local1902.anInt6092;
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
					if (Static358.aBoolean574) {
						Static127.method1578(arg0, local12, local6, local9);
						Static335.aClass117_6.method5693(arg0.anInt4999, arg0.aClass1_Sub29Array3);
					}
					@Pc(2012) Class11_Sub4 local2012 = arg1.aClass11_Sub4_1;
					@Pc(2020) Class111_Sub3 local2020;
					if (local706 > local1333) {
						local2020 = local1902.method5181(Static335.aClass117_6);
						if (local2020 != null) {
							local2020.aClass11_1 = local1902;
							local2020.anInt3923 = local12;
							local2020.anInt3920 = local6;
							local2020.anInt3921 = local9;
							Static181.aClass63_2.method1024(local2020);
						}
					} else if (local2012 != null) {
						local2020 = local2012.method5181(Static335.aClass117_6);
						if (local2020 != null) {
							local2020.aClass11_1 = local2012;
							local2020.anInt3923 = local12;
							local2020.anInt3920 = local6;
							local2020.anInt3921 = local9;
							Static181.aClass63_2.method1024(local2020);
						}
					}
				}
			}
			local1057 = arg1.aClass11_Sub3_3;
			local411 = arg1.aClass11_Sub3_2;
			@Pc(2105) Class111_Sub3 local2105;
			if (local411 != null && (local411.anInt4000 & arg1.aShort82) != 0 && !Static155.method2065(local15, local6, local9, local411.anInt4000)) {
				if (Static358.aBoolean574) {
					Static85.method5075(arg0, local411.anInt4000, local12, local6, local9);
					Static335.aClass117_6.method5693(arg0.anInt4999, arg0.aClass1_Sub29Array3);
				}
				local2105 = local411.method5181(Static335.aClass117_6);
				if (local2105 != null) {
					local2105.aClass11_1 = local411;
					local2105.anInt3923 = local12;
					local2105.anInt3920 = local6;
					local2105.anInt3921 = local9;
					Static181.aClass63_2.method1024(local2105);
				}
			}
			if (local1057 != null && (local1057.anInt4000 & arg1.aShort82) != 0 && !Static155.method2065(local15, local6, local9, local1057.anInt4000)) {
				if (Static358.aBoolean574) {
					Static85.method5075(arg0, local1057.anInt4000, local12, local6, local9);
					Static335.aClass117_6.method5693(arg0.anInt4999, arg0.aClass1_Sub29Array3);
				}
				local2105 = local1057.method5181(Static335.aClass117_6);
				if (local2105 != null) {
					local2105.aClass11_1 = local1057;
					local2105.anInt3923 = local12;
					local2105.anInt3920 = local6;
					local2105.anInt3921 = local9;
					Static181.aClass63_2.method1024(local2105);
				}
			}
		}
		@Pc(2191) Class216 local2191;
		if (local12 < Static112.anInt1710 - 1) {
			local2191 = Static259.aClass216ArrayArrayArray3[local12 + 1][local6][local9];
			if (local2191 != null && local2191.aBoolean507) {
				Static352.aClass12_1.method4093(local2191);
			}
		}
		if (local6 < Static166.anInt2722) {
			local2191 = local31[local6 + 1][local9];
			if (local2191 != null && local2191.aBoolean507) {
				Static352.aClass12_1.method4091(local2191);
			}
		}
		if (local9 < Static44.anInt638) {
			local2191 = local31[local6][local9 + 1];
			if (local2191 != null && local2191.aBoolean507) {
				Static352.aClass12_1.method4091(local2191);
			}
		}
		if (local6 > Static166.anInt2722) {
			local2191 = local31[local6 - 1][local9];
			if (local2191 != null && local2191.aBoolean507) {
				Static352.aClass12_1.method4091(local2191);
			}
		}
		if (local9 > Static44.anInt638) {
			local2191 = local31[local6][local9 - 1];
			if (local2191 != null && local2191.aBoolean507) {
				Static352.aClass12_1.method4091(local2191);
			}
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Z[BI)V")
	public static void method3119(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1) {
		if (Static93.aClass1_Sub19_2 == null) {
			Static93.aClass1_Sub19_2 = new Class1_Sub19(20000);
		}
		Static93.aClass1_Sub19_2.method2921(arg1, arg1.length);
		if (!arg0) {
			return;
		}
		Static57.method811(Static93.aClass1_Sub19_2.aByteArray38);
		Static13.aClass239_Sub1Array1 = new Class239_Sub1[Static44.anInt634];
		@Pc(33) int local33 = 0;
		for (@Pc(35) int local35 = Static376.anInt6063; local35 <= Static137.anInt2141; local35++) {
			@Pc(41) Class239_Sub1 local41 = Static227.method3224(local35);
			if (local41 != null) {
				Static13.aClass239_Sub1Array1[local33++] = local41;
			}
		}
		Static361.aBoolean523 = false;
		Static258.aLong158 = Static183.method2674();
		Static93.aClass1_Sub19_2 = null;
	}
}
