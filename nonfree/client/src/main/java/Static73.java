import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!di", name = "o", descriptor = "F")
	public static float aFloat20;

	@OriginalMember(owner = "client!di", name = "A", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_57 = new Class92(42, 3);

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method1338(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		Static414.method5552(Static284.aClass92_167);
		Static302.aClass3_Sub2_Sub2_2.method6001(Static442.method5901(arg1) + 1);
		Static302.aClass3_Sub2_Sub2_2.method6033(arg1);
		Static302.aClass3_Sub2_Sub2_2.method6034(arg0);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIIII)V")
	public static void method1339(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		for (@Pc(12) Class13_Sub2 local12 = (Class13_Sub2) Static56.aClass40_1.method1188(); local12 != null; local12 = (Class13_Sub2) Static56.aClass40_1.method1195()) {
			if (local12.anInt1307 <= Static290.anInt5325) {
				local12.method5934();
			} else {
				Static425.method5660(local12.anInt1309, (local12.anInt1306 << 7) + 64, (local12.anInt1305 << 7) - -64, arg3 >> 1, arg0 >> 1, local12.anInt1304 * 2);
				Static399.aClass65_7.method5804(local12.aString11, Static189.anIntArray294[0] + arg2, arg1 + Static189.anIntArray294[1], local12.anInt1310 | 0xFF000000, 0);
			}
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!sc;Lclient!tg;)V")
	public static void method1340(@OriginalArg(0) Class193 arg0, @OriginalArg(1) Class217 arg1) {
		if (!arg1.aBoolean465) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort197;
		@Pc(9) short local9 = arg1.aShort196;
		@Pc(12) byte local12 = arg1.aByte89;
		@Pc(15) byte local15 = arg1.aByte93;
		@Pc(21) int local21 = (local6 << Static287.anInt5248) + Static340.anInt6290;
		@Pc(27) int local27 = (local9 << Static287.anInt5248) + Static340.anInt6290;
		@Pc(31) Class217[][] local31 = Static151.aClass217ArrayArrayArray3[local12];
		@Pc(53) float local53;
		if (Static401.aClass64Array3 == Static120.aClass64Array1) {
			Static355.aClass75_10.ba(Static205.aClass64Array2[0].va(local21, local27), Static71.method1314(local6, local9), Static350.method4981(local6, local9), Static153.method2718(local6, local9));
			local53 = 251.5F;
		} else {
			local53 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static355.aClass75_10.o(3000.0F, local53 * 1.5F);
		@Pc(86) Class217 local86;
		@Pc(616) Class13_Sub7 local616;
		@Pc(711) int local711;
		@Pc(714) int local714;
		@Pc(723) int local723;
		@Pc(735) int local735;
		@Pc(406) int local406;
		@Pc(330) boolean local330;
		@Pc(377) Class13_Sub7 local377;
		@Pc(408) int local408;
		@Pc(411) Class1_Sub5 local411;
		@Pc(706) int local706;
		if (arg1.aBoolean466) {
			if (Static320.aBoolean413) {
				if (local12 > 0) {
					local86 = Static151.aClass217ArrayArrayArray3[local12 - 1][local6][local9];
					if (local86 != null && local86.aBoolean465) {
						return;
					}
				}
				if (local6 <= Static444.anInt7531 && local6 > Static16.anInt537) {
					local86 = local31[local6 - 1][local9];
					if (local86 != null && local86.aBoolean465 && (local86.aBoolean466 || (arg1.aByte90 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static444.anInt7531 && local6 < Static454.anInt7692 - 1) {
					local86 = local31[local6 + 1][local9];
					if (local86 != null && local86.aBoolean465 && (local86.aBoolean466 || (arg1.aByte90 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static340.anInt6288 && local9 > Static341.anInt6226) {
					local86 = local31[local6][local9 - 1];
					if (local86 != null && local86.aBoolean465 && (local86.aBoolean466 || (arg1.aByte90 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static340.anInt6288 && local9 < Static169.anInt3554 - 1) {
					local86 = local31[local6][local9 + 1];
					if (local86 != null && local86.aBoolean465 && (local86.aBoolean466 || (arg1.aByte90 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static320.aBoolean413 = true;
			}
			arg1.aBoolean466 = false;
			if (arg1.aClass217_1 != null) {
				local86 = arg1.aClass217_1;
				Static355.aClass75_10.o(3000.0F, (201.5F - (float) (local86.aByte93 + 1) * 50.0F) * 1.5F);
				if (!Static220.method3499(local86.aByte93, local6, local9)) {
					Static120.aClass64Array1[local86.aByte93].method5445(local6, local9);
				}
				@Pc(249) Class1_Sub5 local249 = local86.aClass1_Sub5_2;
				if (local249 != null) {
					if (Static283.aBoolean384) {
						if ((local249.anInt6407 & arg1.aShort195) == 0) {
							Static96.method1704(arg0, local12, local6, local9);
						} else {
							Static117.method2133(arg0, local249.anInt6407, local15, local6, local9);
						}
						Static355.aClass75_10.method2628(arg0.anInt5916, arg0.aClass3_Sub23Array3);
					}
					local249.method5837(Static355.aClass75_10);
				}
				for (@Pc(286) Class182 local286 = local86.aClass182_3; local286 != null; local286 = local286.aClass182_2) {
					@Pc(290) Class1_Sub3 local290 = local286.aClass1_Sub3_2;
					if (local290 != null) {
						if (Static283.aBoolean384) {
							Static96.method1704(arg0, local12, local6, local9);
							Static355.aClass75_10.method2628(arg0.anInt5916, arg0.aClass3_Sub23Array3);
						}
						local290.method5837(Static355.aClass75_10);
					}
				}
				Static355.aClass75_10.o(3000.0F, local53 * 1.5F);
			}
			local330 = !Static220.method3499(local15, local6, local9);
			if (local330) {
				Static120.aClass64Array1[local15].method5445(local6, local9);
				@Pc(341) Class1_Sub2 local341 = arg1.aClass1_Sub2_1;
				if (local341 != null && local341.aBoolean515) {
					if (local341.aBoolean514) {
						Static355.aClass75_10.o(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static283.aBoolean384) {
						Static96.method1704(arg0, local12, local6, local9);
						Static355.aClass75_10.method2628(arg0.anInt5916, arg0.aClass3_Sub23Array3);
					}
					local377 = local341.method5837(Static355.aClass75_10);
					if (local377 != null) {
						local377.aClass1_1 = local341;
						local377.anInt7372 = local12;
						local377.anInt7373 = local6;
						local377.anInt7375 = local9;
						Static201.aClass40_4.method1190(local377);
					}
					if (local341.aBoolean514) {
						Static355.aClass75_10.o(3000.0F, local53 * 1.5F);
					}
				}
			}
			local406 = 0;
			local408 = 0;
			local411 = arg1.aClass1_Sub5_2;
			@Pc(414) Class1_Sub1 local414 = arg1.aClass1_Sub1_2;
			if (local411 != null || local414 != null) {
				if (Static444.anInt7531 == local6) {
					local406++;
				} else if (Static444.anInt7531 < local6) {
					local406 += 2;
				}
				if (Static340.anInt6288 == local9) {
					local406 += 3;
				} else if (Static340.anInt6288 > local9) {
					local406 += 6;
				}
				local408 = Static384.anIntArray480[local406];
				arg1.aShort195 = Static348.aShortArray106[local406];
			}
			if (local411 != null) {
				if ((local411.anInt6407 & Static15.anIntArray39[local406]) == 0) {
					arg1.aByte94 = 0;
				} else if (local411.anInt6407 == 16) {
					arg1.aByte94 = 3;
					arg1.aByte91 = Static266.aByteArray58[local406];
					arg1.aByte88 = (byte) (3 - arg1.aByte91);
				} else if (local411.anInt6407 == 32) {
					arg1.aByte94 = 6;
					arg1.aByte91 = Static81.aByteArray21[local406];
					arg1.aByte88 = (byte) (6 - arg1.aByte91);
				} else if (local411.anInt6407 == 64) {
					arg1.aByte94 = 12;
					arg1.aByte91 = Static422.aByteArray83[local406];
					arg1.aByte88 = (byte) (12 - arg1.aByte91);
				} else {
					arg1.aByte94 = 9;
					arg1.aByte91 = Static129.aByteArray35[local406];
					arg1.aByte88 = (byte) (9 - arg1.aByte91);
				}
				if ((local411.anInt6407 & local408) != 0 && !Static58.method1176(local15, local6, local9, local411.anInt6407)) {
					if (Static283.aBoolean384) {
						Static96.method1704(arg0, local12, local6, local9);
						Static355.aClass75_10.method2628(arg0.anInt5916, arg0.aClass3_Sub23Array3);
					}
					@Pc(563) Class13_Sub7 local563 = local411.method5837(Static355.aClass75_10);
					if (local563 != null) {
						local563.aClass1_1 = local411;
						local563.anInt7372 = local12;
						local563.anInt7373 = local6;
						local563.anInt7375 = local9;
						Static201.aClass40_4.method1190(local563);
					}
				}
				@Pc(584) Class1_Sub5 local584 = arg1.aClass1_Sub5_3;
				if (local584 != null && (local584.anInt6407 & local408) != 0 && !Static58.method1176(local15, local6, local9, local584.anInt6407)) {
					if (Static283.aBoolean384) {
						Static96.method1704(arg0, local12, local6, local9);
						Static355.aClass75_10.method2628(arg0.anInt5916, arg0.aClass3_Sub23Array3);
					}
					local616 = local584.method5837(Static355.aClass75_10);
					if (local616 != null) {
						local616.aClass1_1 = local584;
						local616.anInt7372 = local12;
						local616.anInt7373 = local6;
						local616.anInt7375 = local9;
						Static201.aClass40_4.method1190(local616);
					}
				}
			}
			if (local414 != null && !Static87.method3008(local15, local6, local9, local414.method4302())) {
				@Pc(647) Class1_Sub1 local647 = arg1.aClass1_Sub1_3;
				Static355.aClass75_10.o(3000.0F, (local53 - 0.5F) * 1.5F);
				if ((local414.anInt5371 & local408) != 0) {
					if (Static283.aBoolean384) {
						Static96.method1704(arg0, local12, local6, local9);
						Static355.aClass75_10.method2628(arg0.anInt5916, arg0.aClass3_Sub23Array3);
					}
					local616 = local414.method5837(Static355.aClass75_10);
					if (local616 != null) {
						local616.aClass1_1 = local414;
						local616.anInt7372 = local12;
						local616.anInt7373 = local6;
						local616.anInt7375 = local9;
						Static201.aClass40_4.method1190(local616);
					}
				} else if (local414.anInt5371 == 256) {
					local706 = local414.anInt5368 - Static28.anInt787;
					local711 = local414.anInt5370 - Static91.anInt1938;
					local714 = local414.anInt5374;
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
					if (Static283.aBoolean384) {
						Static96.method1704(arg0, local12, local6, local9);
						Static355.aClass75_10.method2628(arg0.anInt5916, arg0.aClass3_Sub23Array3);
					}
					@Pc(759) Class13_Sub7 local759;
					if (local735 < local723) {
						local759 = local414.method5837(Static355.aClass75_10);
						if (local759 != null) {
							local759.aClass1_1 = local414;
							local759.anInt7372 = local12;
							local759.anInt7373 = local6;
							local759.anInt7375 = local9;
							Static201.aClass40_4.method1190(local759);
						}
					} else if (local647 != null) {
						local759 = local647.method5837(Static355.aClass75_10);
						if (local759 != null) {
							local759.aClass1_1 = local647;
							local759.anInt7372 = local12;
							local759.anInt7373 = local6;
							local759.anInt7375 = local9;
							Static201.aClass40_4.method1190(local759);
						}
					}
				}
				Static355.aClass75_10.o(3000.0F, local53 * 1.5F);
			}
			if (local330) {
				@Pc(814) Class1_Sub2 local814 = arg1.aClass1_Sub2_1;
				if (local814 != null && !local814.aBoolean515) {
					if (local814.aBoolean514) {
						Static355.aClass75_10.o(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static283.aBoolean384) {
						Static96.method1704(arg0, local12, local6, local9);
						Static355.aClass75_10.method2628(arg0.anInt5916, arg0.aClass3_Sub23Array3);
					}
					local616 = local814.method5837(Static355.aClass75_10);
					if (local616 != null) {
						local616.aClass1_1 = local814;
						local616.anInt7372 = local12;
						local616.anInt7373 = local6;
						local616.anInt7375 = local9;
						Static201.aClass40_4.method1190(local616);
					}
					if (local814.aBoolean514) {
						Static355.aClass75_10.o(3000.0F, local53 * 1.5F);
					}
				}
				@Pc(880) Class1_Sub4 local880 = arg1.aClass1_Sub4_1;
				if (local880 != null && !local880.aBoolean305) {
					if (Static283.aBoolean384) {
						Static96.method1704(arg0, local12, local6, local9);
						Static355.aClass75_10.method2628(arg0.anInt5916, arg0.aClass3_Sub23Array3);
					}
					@Pc(903) Class13_Sub7 local903 = local880.method5837(Static355.aClass75_10);
					if (local903 != null) {
						local903.aClass1_1 = local880;
						local903.anInt7372 = local12;
						local903.anInt7373 = local6;
						local903.anInt7375 = local9;
						Static201.aClass40_4.method1190(local903);
					}
				}
			}
			@Pc(924) byte local924 = arg1.aByte90;
			if (local924 != 0) {
				@Pc(941) Class217 local941;
				if (local6 < Static444.anInt7531 && (local924 & 0x4) != 0) {
					local941 = local31[local6 + 1][local9];
					if (local941 != null && local941.aBoolean465) {
						Static137.aClass6_1.method4737(local941);
					}
				}
				if (local9 < Static340.anInt6288 && (local924 & 0x2) != 0) {
					local941 = local31[local6][local9 + 1];
					if (local941 != null && local941.aBoolean465) {
						Static137.aClass6_1.method4737(local941);
					}
				}
				if (local6 > Static444.anInt7531 && (local924 & 0x1) != 0) {
					local941 = local31[local6 - 1][local9];
					if (local941 != null && local941.aBoolean465) {
						Static137.aClass6_1.method4737(local941);
					}
				}
				if (local9 > Static340.anInt6288 && (local924 & 0x8) != 0) {
					local941 = local31[local6][local9 - 1];
					if (local941 != null && local941.aBoolean465) {
						Static137.aClass6_1.method4737(local941);
					}
				}
			}
		}
		@Pc(1074) int local1074;
		@Pc(1057) Class1_Sub5 local1057;
		@Pc(1078) int local1078;
		@Pc(1030) Class182 local1030;
		if (arg1.aByte94 != 0) {
			local330 = true;
			for (local1030 = arg1.aClass182_3; local1030 != null; local1030 = local1030.aClass182_2) {
				if (local1030.aClass1_Sub3_2.anInt6048 != Static207.anInt4137 && (local1030.anInt5511 & arg1.aByte94) == arg1.aByte91) {
					local330 = false;
					break;
				}
			}
			if (local330) {
				local1057 = arg1.aClass1_Sub5_2;
				if (!Static58.method1176(local15, local6, local9, local1057.anInt6407)) {
					if (Static283.aBoolean384) {
						label682: {
							if (local1057.anInt6407 >= 16) {
								local1074 = local6 - Static444.anInt7531;
								local1078 = local9 - Static340.anInt6288;
								if (local1057.anInt6407 == 16) {
									local1074 -= Static340.anInt6290;
									local1078 += Static340.anInt6290;
									if (local1078 < local1074 && local6 > 0 && local9 <= Static57.anInt1411) {
										Static96.method1704(arg0, local12, local6 - 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt6407 == 32) {
									local1074 += Static340.anInt6290;
									local1078 += Static340.anInt6290;
									if (local1078 < -local1074 && local6 < Static177.anInt3621 && local9 < Static57.anInt1411) {
										Static96.method1704(arg0, local12, local6 + 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt6407 == 64) {
									local1074 += Static340.anInt6290;
									local1078 -= Static340.anInt6290;
									if (local1078 > local1074 && local6 < Static177.anInt3621 && local9 > 0) {
										Static96.method1704(arg0, local12, local6 + 1, local9 - 1);
										break label682;
									}
								} else if (local1057.anInt6407 == 128) {
									local1074 -= Static340.anInt6290;
									local1078 -= Static340.anInt6290;
									if (local1078 > -local1074 && local6 > 0 && local9 > 0) {
										Static96.method1704(arg0, local12, local6 - 1, local9 - 1);
										break label682;
									}
								}
							}
							Static96.method1704(arg0, local12, local6, local9);
						}
						Static355.aClass75_10.method2628(arg0.anInt5916, arg0.aClass3_Sub23Array3);
					}
					@Pc(1216) Class13_Sub7 local1216 = local1057.method5837(Static355.aClass75_10);
					if (local1216 != null) {
						local1216.aClass1_1 = local1057;
						local1216.anInt7372 = local12;
						local1216.anInt7373 = local6;
						local1216.anInt7375 = local9;
						Static201.aClass40_4.method1190(local1216);
					}
				}
				arg1.aByte94 = 0;
			}
		}
		@Pc(1333) int local1333;
		if (arg1.aBoolean464) {
			try {
				arg1.aBoolean464 = false;
				@Pc(1245) int local1245 = 0;
				label625: for (local1030 = arg1.aClass182_3; local1030 != null; local1030 = local1030.aClass182_2) {
					@Pc(1252) Class1_Sub3 local1252 = local1030.aClass1_Sub3_2;
					if (local1252.anInt6048 != Static207.anInt4137) {
						for (local1074 = local1252.aShort181; local1074 <= local1252.aShort180; local1074++) {
							for (local1078 = local1252.aShort179; local1078 <= local1252.aShort178; local1078++) {
								@Pc(1270) Class217 local1270 = local31[local1074][local1078];
								if (local1270.aBoolean466) {
									arg1.aBoolean464 = true;
									continue label625;
								}
								if (local1270.aByte94 != 0) {
									local706 = 0;
									if (local1074 > local1252.aShort181) {
										local706++;
									}
									if (local1074 < local1252.aShort180) {
										local706 += 4;
									}
									if (local1078 > local1252.aShort179) {
										local706 += 8;
									}
									if (local1078 < local1252.aShort178) {
										local706 += 2;
									}
									if ((local706 & local1270.aByte94) == arg1.aByte88) {
										arg1.aBoolean464 = true;
										continue label625;
									}
								}
							}
						}
						local1078 = Static444.anInt7531 - local1252.aShort181;
						local1333 = local1252.aShort180 - Static444.anInt7531;
						if (local1333 > local1078) {
							local1078 = local1333;
						}
						local706 = Static340.anInt6288 - local1252.aShort179;
						local711 = local1252.aShort178 - Static340.anInt6288;
						if (local711 > local706) {
							local706 = local711;
						}
						arg0.aClass1_Sub3Array3[local1245] = local1252;
						arg0.anIntArray443[local1245++] = local1078 + local706;
					}
				}
				while (local1245 > 0) {
					local408 = -50;
					local1074 = -1;
					@Pc(1384) Class1_Sub3 local1384;
					for (local1078 = 0; local1078 < local1245; local1078++) {
						local1384 = arg0.aClass1_Sub3Array3[local1078];
						if (local1384.anInt6048 != Static207.anInt4137) {
							local706 = arg0.anIntArray443[local1078];
							if (local706 > local408) {
								local408 = local706;
								local1074 = local1078;
							} else if (local706 == local408) {
								local711 = local1384.anInt6053 - Static28.anInt787;
								local714 = local1384.anInt6055 - Static91.anInt1938;
								local723 = arg0.aClass1_Sub3Array3[local1074].anInt6053 - Static28.anInt787;
								local735 = arg0.aClass1_Sub3Array3[local1074].anInt6055 - Static91.anInt1938;
								if (local711 * local711 + local714 * local714 > local723 * local723 + local735 * local735) {
									local1074 = local1078;
								}
							}
						}
					}
					if (local1074 == -1) {
						break;
					}
					local1384 = arg0.aClass1_Sub3Array3[local1074];
					local1384.anInt6048 = Static207.anInt4137;
					if (!Static265.method3999(local15, local1384.aShort181, local1384.aShort180, local1384.aShort179, local1384.aShort178, local1384.method4828())) {
						if (Static283.aBoolean384) {
							if (local1384.aByte78 == 0) {
								Static338.method1149(arg0, local12, local1384.aShort181, local1384.aShort179, local1384.aShort180, local1384.aShort178);
							} else {
								Static96.method1704(arg0, local12, local6, local9);
								local706 = local6 - Static444.anInt7531;
								local711 = local9 - Static340.anInt6288;
								if (local1384.aByte78 == 2) {
									if (local711 > -local706) {
										Static344.method4925(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static344.method4925(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local711 > local706) {
									Static344.method4925(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static344.method4925(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static355.aClass75_10.method2628(arg0.anInt5916, arg0.aClass3_Sub23Array3);
						}
						local616 = local1384.method5837(Static355.aClass75_10);
						if (local616 != null) {
							local616.aClass1_1 = local1384;
							local616.anInt7372 = local12;
							local616.anInt7373 = local1384.aShort181;
							local616.anInt7375 = local1384.aShort179;
							Static201.aClass40_4.method1190(local616);
						}
					}
					for (local706 = local1384.aShort181; local706 <= local1384.aShort180; local706++) {
						for (local711 = local1384.aShort179; local711 <= local1384.aShort178; local711++) {
							@Pc(1609) Class217 local1609 = local31[local706][local711];
							if (local1609.aByte94 != 0) {
								Static137.aClass6_1.method4737(local1609);
							} else if ((local706 != local6 || local711 != local9) && local1609.aBoolean465) {
								Static137.aClass6_1.method4737(local1609);
							}
						}
					}
				}
				if (arg1.aBoolean464) {
					return;
				}
			} catch (@Pc(1647) Exception local1647) {
				arg1.aBoolean464 = false;
			}
		}
		if (arg1.aClass116_1 != null && arg1.aByte92 == (byte) (Static325.anInt5923 & 0xFF)) {
			@Pc(1664) Class116 local1664 = arg1.aClass116_1;
			local406 = Static120.aClass64Array1[local12].I(local6, local9);
			if (local12 < Static281.anInt5169 - 1) {
				local408 = Static120.aClass64Array1[local12].I(local6, local9) - Static120.aClass64Array1[local12 + 1].I(local6, local9);
			} else {
				local408 = 0x8 << Static287.anInt5248;
			}
			Static275.aClass106_3.method5107(local21, local406, local27, arg0.anIntArray444);
			local1074 = arg0.anIntArray444[2];
			Static275.aClass106_3.method5107(local21, local406 - local408, local27, arg0.anIntArray444);
			local1078 = arg0.anIntArray444[2];
			local1333 = local1074;
			local706 = local1078;
			if (local1074 > local1078) {
				local1333 = local1078;
				local706 = local1074;
			}
			local1333 -= Static262.anInt4964;
			local706 += Static262.anInt4964;
			local1664.anInt3719 = local1333;
			local1664.anInt3718 = local706;
			local1664.aBoolean289 = true;
			Static355.aClass75_10.method2581(local1664);
		}
		if (!arg1.aBoolean465) {
			return;
		}
		if (arg1.aByte94 != 0) {
			return;
		}
		if (local6 <= Static444.anInt7531 && local6 > Static16.anInt537) {
			local86 = local31[local6 - 1][local9];
			if (local86 != null && local86.aBoolean465) {
				return;
			}
		}
		if (local6 >= Static444.anInt7531 && local6 < Static454.anInt7692 - 1) {
			local86 = local31[local6 + 1][local9];
			if (local86 != null && local86.aBoolean465) {
				return;
			}
		}
		if (local9 <= Static340.anInt6288 && local9 > Static341.anInt6226) {
			local86 = local31[local6][local9 - 1];
			if (local86 != null && local86.aBoolean465) {
				return;
			}
		}
		if (local9 >= Static340.anInt6288 && local9 < Static169.anInt3554 - 1) {
			local86 = local31[local6][local9 + 1];
			if (local86 != null && local86.aBoolean465) {
				return;
			}
		}
		arg1.aBoolean465 = false;
		Static291.anInt5336--;
		@Pc(1855) Class1_Sub4 local1855 = arg1.aClass1_Sub4_1;
		if (local1855 != null && local1855.aBoolean305) {
			if (Static283.aBoolean384) {
				Static96.method1704(arg0, local12, local6, local9);
				Static355.aClass75_10.method2628(arg0.anInt5916, arg0.aClass3_Sub23Array3);
			}
			@Pc(1878) Class13_Sub7 local1878 = local1855.method5837(Static355.aClass75_10);
			if (local1878 != null) {
				local1878.aClass1_1 = local1855;
				local1878.anInt7372 = local12;
				local1878.anInt7373 = local6;
				local1878.anInt7375 = local9;
				Static201.aClass40_4.method1190(local1878);
			}
		}
		if (arg1.aShort195 != 0) {
			@Pc(1902) Class1_Sub1 local1902 = arg1.aClass1_Sub1_2;
			if (local1902 != null && !Static87.method3008(local15, local6, local9, local1902.method4302())) {
				if ((local1902.anInt5371 & arg1.aShort195) != 0) {
					if (Static283.aBoolean384) {
						Static96.method1704(arg0, local12, local6, local9);
						Static355.aClass75_10.method2628(arg0.anInt5916, arg0.aClass3_Sub23Array3);
					}
					local377 = local1902.method5837(Static355.aClass75_10);
					if (local377 != null) {
						local377.aClass1_1 = local1902;
						local377.anInt7372 = local12;
						local377.anInt7373 = local6;
						local377.anInt7375 = local9;
						Static201.aClass40_4.method1190(local377);
					}
				} else if (local1902.anInt5371 == 256) {
					local408 = local1902.anInt5368 - Static28.anInt787;
					local1074 = local1902.anInt5370 - Static91.anInt1938;
					local1078 = local1902.anInt5374;
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
					if (Static283.aBoolean384) {
						Static96.method1704(arg0, local12, local6, local9);
						Static355.aClass75_10.method2628(arg0.anInt5916, arg0.aClass3_Sub23Array3);
					}
					@Pc(2012) Class1_Sub1 local2012 = arg1.aClass1_Sub1_3;
					@Pc(2020) Class13_Sub7 local2020;
					if (local706 > local1333) {
						local2020 = local1902.method5837(Static355.aClass75_10);
						if (local2020 != null) {
							local2020.aClass1_1 = local1902;
							local2020.anInt7372 = local12;
							local2020.anInt7373 = local6;
							local2020.anInt7375 = local9;
							Static201.aClass40_4.method1190(local2020);
						}
					} else if (local2012 != null) {
						local2020 = local2012.method5837(Static355.aClass75_10);
						if (local2020 != null) {
							local2020.aClass1_1 = local2012;
							local2020.anInt7372 = local12;
							local2020.anInt7373 = local6;
							local2020.anInt7375 = local9;
							Static201.aClass40_4.method1190(local2020);
						}
					}
				}
			}
			local1057 = arg1.aClass1_Sub5_2;
			local411 = arg1.aClass1_Sub5_3;
			@Pc(2105) Class13_Sub7 local2105;
			if (local411 != null && (local411.anInt6407 & arg1.aShort195) != 0 && !Static58.method1176(local15, local6, local9, local411.anInt6407)) {
				if (Static283.aBoolean384) {
					Static117.method2133(arg0, local411.anInt6407, local12, local6, local9);
					Static355.aClass75_10.method2628(arg0.anInt5916, arg0.aClass3_Sub23Array3);
				}
				local2105 = local411.method5837(Static355.aClass75_10);
				if (local2105 != null) {
					local2105.aClass1_1 = local411;
					local2105.anInt7372 = local12;
					local2105.anInt7373 = local6;
					local2105.anInt7375 = local9;
					Static201.aClass40_4.method1190(local2105);
				}
			}
			if (local1057 != null && (local1057.anInt6407 & arg1.aShort195) != 0 && !Static58.method1176(local15, local6, local9, local1057.anInt6407)) {
				if (Static283.aBoolean384) {
					Static117.method2133(arg0, local1057.anInt6407, local12, local6, local9);
					Static355.aClass75_10.method2628(arg0.anInt5916, arg0.aClass3_Sub23Array3);
				}
				local2105 = local1057.method5837(Static355.aClass75_10);
				if (local2105 != null) {
					local2105.aClass1_1 = local1057;
					local2105.anInt7372 = local12;
					local2105.anInt7373 = local6;
					local2105.anInt7375 = local9;
					Static201.aClass40_4.method1190(local2105);
				}
			}
		}
		@Pc(2191) Class217 local2191;
		if (local12 < Static281.anInt5169 - 1) {
			local2191 = Static151.aClass217ArrayArrayArray3[local12 + 1][local6][local9];
			if (local2191 != null && local2191.aBoolean465) {
				Static137.aClass6_1.method4728(local2191);
			}
		}
		if (local6 < Static444.anInt7531) {
			local2191 = local31[local6 + 1][local9];
			if (local2191 != null && local2191.aBoolean465) {
				Static137.aClass6_1.method4737(local2191);
			}
		}
		if (local9 < Static340.anInt6288) {
			local2191 = local31[local6][local9 + 1];
			if (local2191 != null && local2191.aBoolean465) {
				Static137.aClass6_1.method4737(local2191);
			}
		}
		if (local6 > Static444.anInt7531) {
			local2191 = local31[local6 - 1][local9];
			if (local2191 != null && local2191.aBoolean465) {
				Static137.aClass6_1.method4737(local2191);
			}
		}
		if (local9 > Static340.anInt6288) {
			local2191 = local31[local6][local9 - 1];
			if (local2191 != null && local2191.aBoolean465) {
				Static137.aClass6_1.method4737(local2191);
			}
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ZI[Lclient!eo;III)V")
	public static void method1341(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class68[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(1) int local1 = 0; local1 < arg1.length; local1++) {
			@Pc(6) Class68 local6 = arg1[local1];
			if (local6 != null && local6.anInt2225 == arg4) {
				Static193.method5124(local6, arg3, arg2, arg0);
				Static46.method1007(arg3, arg2, local6);
				if (local6.anInt2210 - local6.anInt2178 < local6.anInt2147) {
					local6.anInt2147 = local6.anInt2210 - local6.anInt2178;
				}
				if (local6.anInt2147 < 0) {
					local6.anInt2147 = 0;
				}
				if (local6.anInt2197 - local6.lb < local6.anInt2151) {
					local6.anInt2151 = local6.anInt2197 - local6.lb;
				}
				if (local6.anInt2151 < 0) {
					local6.anInt2151 = 0;
				}
				if (local6.anInt2182 == 0) {
					Static446.method5923(arg0, local6);
				}
			}
		}
	}
}
