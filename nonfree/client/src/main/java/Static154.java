import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!at;Lclient!kf;)V")
	public static void method2451(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class137 arg1) {
		if (!arg1.aBoolean293) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort64;
		@Pc(9) short local9 = arg1.aShort65;
		@Pc(12) byte local12 = arg1.aByte48;
		@Pc(15) byte local15 = arg1.aByte44;
		@Pc(21) int local21 = (local6 << Static58.anInt1051) + Static86.anInt1530;
		@Pc(27) int local27 = (local9 << Static58.anInt1051) + Static86.anInt1530;
		@Pc(31) Class137[][] local31 = Static131.aClass137ArrayArrayArray2[local12];
		@Pc(53) float local53;
		if (Static315.aClass70Array3 == Static256.aClass70Array2) {
			Static74.aClass121_3.ba(Static60.aClass70Array1[0].va(local21, local27), Static233.method3388(local6, local9), Static59.method899(local6, local9), Static440.method5907(local6, local9));
			local53 = 251.5F;
		} else {
			local53 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static74.aClass121_3.o(3000.0F, local53 * 1.5F);
		@Pc(86) Class137 local86;
		@Pc(616) Class36_Sub1 local616;
		@Pc(711) int local711;
		@Pc(714) int local714;
		@Pc(723) int local723;
		@Pc(735) int local735;
		@Pc(406) int local406;
		@Pc(330) boolean local330;
		@Pc(377) Class36_Sub1 local377;
		@Pc(408) int local408;
		@Pc(411) Class47_Sub2 local411;
		@Pc(706) int local706;
		if (arg1.aBoolean294) {
			if (Static44.aBoolean63) {
				if (local12 > 0) {
					local86 = Static131.aClass137ArrayArrayArray2[local12 - 1][local6][local9];
					if (local86 != null && local86.aBoolean293) {
						return;
					}
				}
				if (local6 <= Static59.anInt1066 && local6 > Static210.anInt3764) {
					local86 = local31[local6 - 1][local9];
					if (local86 != null && local86.aBoolean293 && (local86.aBoolean294 || (arg1.aByte47 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static59.anInt1066 && local6 < Static72.anInt1361 - 1) {
					local86 = local31[local6 + 1][local9];
					if (local86 != null && local86.aBoolean293 && (local86.aBoolean294 || (arg1.aByte47 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static161.anInt2868 && local9 > Static194.anInt7614) {
					local86 = local31[local6][local9 - 1];
					if (local86 != null && local86.aBoolean293 && (local86.aBoolean294 || (arg1.aByte47 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static161.anInt2868 && local9 < Static345.anInt6297 - 1) {
					local86 = local31[local6][local9 + 1];
					if (local86 != null && local86.aBoolean293 && (local86.aBoolean294 || (arg1.aByte47 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static44.aBoolean63 = true;
			}
			arg1.aBoolean294 = false;
			if (arg1.aClass137_1 != null) {
				local86 = arg1.aClass137_1;
				Static74.aClass121_3.o(3000.0F, (201.5F - (float) (local86.aByte44 + 1) * 50.0F) * 1.5F);
				if (!Static406.method5515(local86.aByte44, local6, local9)) {
					Static256.aClass70Array2[local86.aByte44].method4263(local6, local9);
				}
				@Pc(249) Class47_Sub2 local249 = local86.aClass47_Sub2_1;
				if (local249 != null) {
					if (Static144.aBoolean211) {
						if ((local249.anInt7426 & arg1.aShort66) == 0) {
							Static322.method3369(arg0, local12, local6, local9);
						} else {
							Static11.method188(arg0, local249.anInt7426, local15, local6, local9);
						}
						Static74.aClass121_3.method4591(arg0.anInt300, arg0.aClass1_Sub12Array2);
					}
					local249.method5734(Static74.aClass121_3);
				}
				for (@Pc(286) Class167 local286 = local86.aClass167_1; local286 != null; local286 = local286.aClass167_2) {
					@Pc(290) Class47_Sub1 local290 = local286.aClass47_Sub1_2;
					if (local290 != null) {
						if (Static144.aBoolean211) {
							Static322.method3369(arg0, local12, local6, local9);
							Static74.aClass121_3.method4591(arg0.anInt300, arg0.aClass1_Sub12Array2);
						}
						local290.method5734(Static74.aClass121_3);
					}
				}
				Static74.aClass121_3.o(3000.0F, local53 * 1.5F);
			}
			local330 = !Static406.method5515(local15, local6, local9);
			if (local330) {
				Static256.aClass70Array2[local15].method4263(local6, local9);
				@Pc(341) Class47_Sub5 local341 = arg1.aClass47_Sub5_1;
				if (local341 != null && local341.aBoolean321) {
					if (local341.aBoolean320) {
						Static74.aClass121_3.o(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static144.aBoolean211) {
						Static322.method3369(arg0, local12, local6, local9);
						Static74.aClass121_3.method4591(arg0.anInt300, arg0.aClass1_Sub12Array2);
					}
					local377 = local341.method5734(Static74.aClass121_3);
					if (local377 != null) {
						local377.aClass47_1 = local341;
						local377.anInt658 = local12;
						local377.anInt656 = local6;
						local377.anInt657 = local9;
						Static249.aClass242_3.method5501(local377);
					}
					if (local341.aBoolean320) {
						Static74.aClass121_3.o(3000.0F, local53 * 1.5F);
					}
				}
			}
			local406 = 0;
			local408 = 0;
			local411 = arg1.aClass47_Sub2_1;
			@Pc(414) Class47_Sub4 local414 = arg1.aClass47_Sub4_1;
			if (local411 != null || local414 != null) {
				if (Static59.anInt1066 == local6) {
					local406++;
				} else if (Static59.anInt1066 < local6) {
					local406 += 2;
				}
				if (Static161.anInt2868 == local9) {
					local406 += 3;
				} else if (Static161.anInt2868 > local9) {
					local406 += 6;
				}
				local408 = Static14.anIntArray18[local406];
				arg1.aShort66 = Static397.aShortArray113[local406];
			}
			if (local411 != null) {
				if ((local411.anInt7426 & Static143.anIntArray204[local406]) == 0) {
					arg1.aByte50 = 0;
				} else if (local411.anInt7426 == 16) {
					arg1.aByte50 = 3;
					arg1.aByte45 = Static35.aByteArray5[local406];
					arg1.aByte49 = (byte) (3 - arg1.aByte45);
				} else if (local411.anInt7426 == 32) {
					arg1.aByte50 = 6;
					arg1.aByte45 = Static123.aByteArray23[local406];
					arg1.aByte49 = (byte) (6 - arg1.aByte45);
				} else if (local411.anInt7426 == 64) {
					arg1.aByte50 = 12;
					arg1.aByte45 = Static123.aByteArray22[local406];
					arg1.aByte49 = (byte) (12 - arg1.aByte45);
				} else {
					arg1.aByte50 = 9;
					arg1.aByte45 = Static75.aByteArray9[local406];
					arg1.aByte49 = (byte) (9 - arg1.aByte45);
				}
				if ((local411.anInt7426 & local408) != 0 && !Static343.method4933(local15, local6, local9, local411.anInt7426)) {
					if (Static144.aBoolean211) {
						Static322.method3369(arg0, local12, local6, local9);
						Static74.aClass121_3.method4591(arg0.anInt300, arg0.aClass1_Sub12Array2);
					}
					@Pc(563) Class36_Sub1 local563 = local411.method5734(Static74.aClass121_3);
					if (local563 != null) {
						local563.aClass47_1 = local411;
						local563.anInt658 = local12;
						local563.anInt656 = local6;
						local563.anInt657 = local9;
						Static249.aClass242_3.method5501(local563);
					}
				}
				@Pc(584) Class47_Sub2 local584 = arg1.aClass47_Sub2_2;
				if (local584 != null && (local584.anInt7426 & local408) != 0 && !Static343.method4933(local15, local6, local9, local584.anInt7426)) {
					if (Static144.aBoolean211) {
						Static322.method3369(arg0, local12, local6, local9);
						Static74.aClass121_3.method4591(arg0.anInt300, arg0.aClass1_Sub12Array2);
					}
					local616 = local584.method5734(Static74.aClass121_3);
					if (local616 != null) {
						local616.aClass47_1 = local584;
						local616.anInt658 = local12;
						local616.anInt656 = local6;
						local616.anInt657 = local9;
						Static249.aClass242_3.method5501(local616);
					}
				}
			}
			if (local414 != null && !Static85.method1209(local15, local6, local9, local414.method4049())) {
				@Pc(647) Class47_Sub4 local647 = arg1.aClass47_Sub4_2;
				Static74.aClass121_3.o(3000.0F, (local53 - 0.5F) * 1.5F);
				if ((local414.anInt4961 & local408) != 0) {
					if (Static144.aBoolean211) {
						Static322.method3369(arg0, local12, local6, local9);
						Static74.aClass121_3.method4591(arg0.anInt300, arg0.aClass1_Sub12Array2);
					}
					local616 = local414.method5734(Static74.aClass121_3);
					if (local616 != null) {
						local616.aClass47_1 = local414;
						local616.anInt658 = local12;
						local616.anInt656 = local6;
						local616.anInt657 = local9;
						Static249.aClass242_3.method5501(local616);
					}
				} else if (local414.anInt4961 == 256) {
					local706 = local414.anInt4958 - Static81.anInt1480;
					local711 = local414.anInt4954 - Static150.anInt2703;
					local714 = local414.anInt4951;
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
					if (Static144.aBoolean211) {
						Static322.method3369(arg0, local12, local6, local9);
						Static74.aClass121_3.method4591(arg0.anInt300, arg0.aClass1_Sub12Array2);
					}
					@Pc(759) Class36_Sub1 local759;
					if (local735 < local723) {
						local759 = local414.method5734(Static74.aClass121_3);
						if (local759 != null) {
							local759.aClass47_1 = local414;
							local759.anInt658 = local12;
							local759.anInt656 = local6;
							local759.anInt657 = local9;
							Static249.aClass242_3.method5501(local759);
						}
					} else if (local647 != null) {
						local759 = local647.method5734(Static74.aClass121_3);
						if (local759 != null) {
							local759.aClass47_1 = local647;
							local759.anInt658 = local12;
							local759.anInt656 = local6;
							local759.anInt657 = local9;
							Static249.aClass242_3.method5501(local759);
						}
					}
				}
				Static74.aClass121_3.o(3000.0F, local53 * 1.5F);
			}
			if (local330) {
				@Pc(814) Class47_Sub5 local814 = arg1.aClass47_Sub5_1;
				if (local814 != null && !local814.aBoolean321) {
					if (local814.aBoolean320) {
						Static74.aClass121_3.o(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static144.aBoolean211) {
						Static322.method3369(arg0, local12, local6, local9);
						Static74.aClass121_3.method4591(arg0.anInt300, arg0.aClass1_Sub12Array2);
					}
					local616 = local814.method5734(Static74.aClass121_3);
					if (local616 != null) {
						local616.aClass47_1 = local814;
						local616.anInt658 = local12;
						local616.anInt656 = local6;
						local616.anInt657 = local9;
						Static249.aClass242_3.method5501(local616);
					}
					if (local814.aBoolean320) {
						Static74.aClass121_3.o(3000.0F, local53 * 1.5F);
					}
				}
				@Pc(880) Class47_Sub3 local880 = arg1.aClass47_Sub3_1;
				if (local880 != null && !local880.aBoolean503) {
					if (Static144.aBoolean211) {
						Static322.method3369(arg0, local12, local6, local9);
						Static74.aClass121_3.method4591(arg0.anInt300, arg0.aClass1_Sub12Array2);
					}
					@Pc(903) Class36_Sub1 local903 = local880.method5734(Static74.aClass121_3);
					if (local903 != null) {
						local903.aClass47_1 = local880;
						local903.anInt658 = local12;
						local903.anInt656 = local6;
						local903.anInt657 = local9;
						Static249.aClass242_3.method5501(local903);
					}
				}
			}
			@Pc(924) byte local924 = arg1.aByte47;
			if (local924 != 0) {
				@Pc(941) Class137 local941;
				if (local6 < Static59.anInt1066 && (local924 & 0x4) != 0) {
					local941 = local31[local6 + 1][local9];
					if (local941 != null && local941.aBoolean293) {
						Static68.aClass143_1.method5050(local941);
					}
				}
				if (local9 < Static161.anInt2868 && (local924 & 0x2) != 0) {
					local941 = local31[local6][local9 + 1];
					if (local941 != null && local941.aBoolean293) {
						Static68.aClass143_1.method5050(local941);
					}
				}
				if (local6 > Static59.anInt1066 && (local924 & 0x1) != 0) {
					local941 = local31[local6 - 1][local9];
					if (local941 != null && local941.aBoolean293) {
						Static68.aClass143_1.method5050(local941);
					}
				}
				if (local9 > Static161.anInt2868 && (local924 & 0x8) != 0) {
					local941 = local31[local6][local9 - 1];
					if (local941 != null && local941.aBoolean293) {
						Static68.aClass143_1.method5050(local941);
					}
				}
			}
		}
		@Pc(1074) int local1074;
		@Pc(1057) Class47_Sub2 local1057;
		@Pc(1078) int local1078;
		@Pc(1030) Class167 local1030;
		if (arg1.aByte50 != 0) {
			local330 = true;
			for (local1030 = arg1.aClass167_1; local1030 != null; local1030 = local1030.aClass167_2) {
				if (local1030.aClass47_Sub1_2.anInt7067 != Static79.anInt1457 && (local1030.anInt4346 & arg1.aByte50) == arg1.aByte45) {
					local330 = false;
					break;
				}
			}
			if (local330) {
				local1057 = arg1.aClass47_Sub2_1;
				if (!Static343.method4933(local15, local6, local9, local1057.anInt7426)) {
					if (Static144.aBoolean211) {
						label682: {
							if (local1057.anInt7426 >= 16) {
								local1074 = local6 - Static59.anInt1066;
								local1078 = local9 - Static161.anInt2868;
								if (local1057.anInt7426 == 16) {
									local1074 -= Static86.anInt1530;
									local1078 += Static86.anInt1530;
									if (local1078 < local1074 && local6 > 0 && local9 <= Static219.anInt3872) {
										Static322.method3369(arg0, local12, local6 - 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt7426 == 32) {
									local1074 += Static86.anInt1530;
									local1078 += Static86.anInt1530;
									if (local1078 < -local1074 && local6 < Static251.anInt4344 && local9 < Static219.anInt3872) {
										Static322.method3369(arg0, local12, local6 + 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt7426 == 64) {
									local1074 += Static86.anInt1530;
									local1078 -= Static86.anInt1530;
									if (local1078 > local1074 && local6 < Static251.anInt4344 && local9 > 0) {
										Static322.method3369(arg0, local12, local6 + 1, local9 - 1);
										break label682;
									}
								} else if (local1057.anInt7426 == 128) {
									local1074 -= Static86.anInt1530;
									local1078 -= Static86.anInt1530;
									if (local1078 > -local1074 && local6 > 0 && local9 > 0) {
										Static322.method3369(arg0, local12, local6 - 1, local9 - 1);
										break label682;
									}
								}
							}
							Static322.method3369(arg0, local12, local6, local9);
						}
						Static74.aClass121_3.method4591(arg0.anInt300, arg0.aClass1_Sub12Array2);
					}
					@Pc(1216) Class36_Sub1 local1216 = local1057.method5734(Static74.aClass121_3);
					if (local1216 != null) {
						local1216.aClass47_1 = local1057;
						local1216.anInt658 = local12;
						local1216.anInt656 = local6;
						local1216.anInt657 = local9;
						Static249.aClass242_3.method5501(local1216);
					}
				}
				arg1.aByte50 = 0;
			}
		}
		@Pc(1333) int local1333;
		if (arg1.aBoolean292) {
			try {
				arg1.aBoolean292 = false;
				@Pc(1245) int local1245 = 0;
				label625: for (local1030 = arg1.aClass167_1; local1030 != null; local1030 = local1030.aClass167_2) {
					@Pc(1252) Class47_Sub1 local1252 = local1030.aClass47_Sub1_2;
					if (local1252.anInt7067 != Static79.anInt1457) {
						for (local1074 = local1252.aShort104; local1074 <= local1252.aShort107; local1074++) {
							for (local1078 = local1252.aShort105; local1078 <= local1252.aShort106; local1078++) {
								@Pc(1270) Class137 local1270 = local31[local1074][local1078];
								if (local1270.aBoolean294) {
									arg1.aBoolean292 = true;
									continue label625;
								}
								if (local1270.aByte50 != 0) {
									local706 = 0;
									if (local1074 > local1252.aShort104) {
										local706++;
									}
									if (local1074 < local1252.aShort107) {
										local706 += 4;
									}
									if (local1078 > local1252.aShort105) {
										local706 += 8;
									}
									if (local1078 < local1252.aShort106) {
										local706 += 2;
									}
									if ((local706 & local1270.aByte50) == arg1.aByte49) {
										arg1.aBoolean292 = true;
										continue label625;
									}
								}
							}
						}
						local1078 = Static59.anInt1066 - local1252.aShort104;
						local1333 = local1252.aShort107 - Static59.anInt1066;
						if (local1333 > local1078) {
							local1078 = local1333;
						}
						local706 = Static161.anInt2868 - local1252.aShort105;
						local711 = local1252.aShort106 - Static161.anInt2868;
						if (local711 > local706) {
							local706 = local711;
						}
						arg0.aClass47_Sub1Array2[local1245] = local1252;
						arg0.anIntArray23[local1245++] = local1078 + local706;
					}
				}
				while (local1245 > 0) {
					local408 = -50;
					local1074 = -1;
					@Pc(1384) Class47_Sub1 local1384;
					for (local1078 = 0; local1078 < local1245; local1078++) {
						local1384 = arg0.aClass47_Sub1Array2[local1078];
						if (local1384.anInt7067 != Static79.anInt1457) {
							local706 = arg0.anIntArray23[local1078];
							if (local706 > local408) {
								local408 = local706;
								local1074 = local1078;
							} else if (local706 == local408) {
								local711 = local1384.anInt7060 - Static81.anInt1480;
								local714 = local1384.anInt7066 - Static150.anInt2703;
								local723 = arg0.aClass47_Sub1Array2[local1074].anInt7060 - Static81.anInt1480;
								local735 = arg0.aClass47_Sub1Array2[local1074].anInt7066 - Static150.anInt2703;
								if (local711 * local711 + local714 * local714 > local723 * local723 + local735 * local735) {
									local1074 = local1078;
								}
							}
						}
					}
					if (local1074 == -1) {
						break;
					}
					local1384 = arg0.aClass47_Sub1Array2[local1074];
					local1384.anInt7067 = Static79.anInt1457;
					if (!Static22.method254(local15, local1384.aShort104, local1384.aShort107, local1384.aShort105, local1384.aShort106, local1384.method5447())) {
						if (Static144.aBoolean211) {
							if (local1384.aByte96 == 0) {
								Static374.method5290(arg0, local12, local1384.aShort104, local1384.aShort105, local1384.aShort107, local1384.aShort106);
							} else {
								Static322.method3369(arg0, local12, local6, local9);
								local706 = local6 - Static59.anInt1066;
								local711 = local9 - Static161.anInt2868;
								if (local1384.aByte96 == 2) {
									if (local711 > -local706) {
										Static371.method5267(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static371.method5267(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local711 > local706) {
									Static371.method5267(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static371.method5267(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static74.aClass121_3.method4591(arg0.anInt300, arg0.aClass1_Sub12Array2);
						}
						local616 = local1384.method5734(Static74.aClass121_3);
						if (local616 != null) {
							local616.aClass47_1 = local1384;
							local616.anInt658 = local12;
							local616.anInt656 = local1384.aShort104;
							local616.anInt657 = local1384.aShort105;
							Static249.aClass242_3.method5501(local616);
						}
					}
					for (local706 = local1384.aShort104; local706 <= local1384.aShort107; local706++) {
						for (local711 = local1384.aShort105; local711 <= local1384.aShort106; local711++) {
							@Pc(1609) Class137 local1609 = local31[local706][local711];
							if (local1609.aByte50 != 0) {
								Static68.aClass143_1.method5050(local1609);
							} else if ((local706 != local6 || local711 != local9) && local1609.aBoolean293) {
								Static68.aClass143_1.method5050(local1609);
							}
						}
					}
				}
				if (arg1.aBoolean292) {
					return;
				}
			} catch (@Pc(1647) Exception local1647) {
				arg1.aBoolean292 = false;
			}
		}
		if (arg1.aClass101_1 != null && arg1.aByte46 == (byte) (Static113.anInt2183 & 0xFF)) {
			@Pc(1664) Class101 local1664 = arg1.aClass101_1;
			local406 = Static256.aClass70Array2[local12].I(local6, local9);
			if (local12 < Static29.anInt482 - 1) {
				local408 = Static256.aClass70Array2[local12].I(local6, local9) - Static256.aClass70Array2[local12 + 1].I(local6, local9);
			} else {
				local408 = 0x8 << Static58.anInt1051;
			}
			Static323.aClass43_3.method5110(local21, local406, local27, arg0.anIntArray22);
			local1074 = arg0.anIntArray22[2];
			Static323.aClass43_3.method5110(local21, local406 - local408, local27, arg0.anIntArray22);
			local1078 = arg0.anIntArray22[2];
			local1333 = local1074;
			local706 = local1078;
			if (local1074 > local1078) {
				local1333 = local1078;
				local706 = local1074;
			}
			local1333 -= Static382.anInt5709;
			local706 += Static382.anInt5709;
			local1664.anInt2413 = local1333;
			local1664.anInt2414 = local706;
			local1664.aBoolean192 = true;
			Static74.aClass121_3.method4614(local1664);
		}
		if (!arg1.aBoolean293) {
			return;
		}
		if (arg1.aByte50 != 0) {
			return;
		}
		if (local6 <= Static59.anInt1066 && local6 > Static210.anInt3764) {
			local86 = local31[local6 - 1][local9];
			if (local86 != null && local86.aBoolean293) {
				return;
			}
		}
		if (local6 >= Static59.anInt1066 && local6 < Static72.anInt1361 - 1) {
			local86 = local31[local6 + 1][local9];
			if (local86 != null && local86.aBoolean293) {
				return;
			}
		}
		if (local9 <= Static161.anInt2868 && local9 > Static194.anInt7614) {
			local86 = local31[local6][local9 - 1];
			if (local86 != null && local86.aBoolean293) {
				return;
			}
		}
		if (local9 >= Static161.anInt2868 && local9 < Static345.anInt6297 - 1) {
			local86 = local31[local6][local9 + 1];
			if (local86 != null && local86.aBoolean293) {
				return;
			}
		}
		arg1.aBoolean293 = false;
		Static311.anInt6533--;
		@Pc(1855) Class47_Sub3 local1855 = arg1.aClass47_Sub3_1;
		if (local1855 != null && local1855.aBoolean503) {
			if (Static144.aBoolean211) {
				Static322.method3369(arg0, local12, local6, local9);
				Static74.aClass121_3.method4591(arg0.anInt300, arg0.aClass1_Sub12Array2);
			}
			@Pc(1878) Class36_Sub1 local1878 = local1855.method5734(Static74.aClass121_3);
			if (local1878 != null) {
				local1878.aClass47_1 = local1855;
				local1878.anInt658 = local12;
				local1878.anInt656 = local6;
				local1878.anInt657 = local9;
				Static249.aClass242_3.method5501(local1878);
			}
		}
		if (arg1.aShort66 != 0) {
			@Pc(1902) Class47_Sub4 local1902 = arg1.aClass47_Sub4_1;
			if (local1902 != null && !Static85.method1209(local15, local6, local9, local1902.method4049())) {
				if ((local1902.anInt4961 & arg1.aShort66) != 0) {
					if (Static144.aBoolean211) {
						Static322.method3369(arg0, local12, local6, local9);
						Static74.aClass121_3.method4591(arg0.anInt300, arg0.aClass1_Sub12Array2);
					}
					local377 = local1902.method5734(Static74.aClass121_3);
					if (local377 != null) {
						local377.aClass47_1 = local1902;
						local377.anInt658 = local12;
						local377.anInt656 = local6;
						local377.anInt657 = local9;
						Static249.aClass242_3.method5501(local377);
					}
				} else if (local1902.anInt4961 == 256) {
					local408 = local1902.anInt4958 - Static81.anInt1480;
					local1074 = local1902.anInt4954 - Static150.anInt2703;
					local1078 = local1902.anInt4951;
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
					if (Static144.aBoolean211) {
						Static322.method3369(arg0, local12, local6, local9);
						Static74.aClass121_3.method4591(arg0.anInt300, arg0.aClass1_Sub12Array2);
					}
					@Pc(2012) Class47_Sub4 local2012 = arg1.aClass47_Sub4_2;
					@Pc(2020) Class36_Sub1 local2020;
					if (local706 > local1333) {
						local2020 = local1902.method5734(Static74.aClass121_3);
						if (local2020 != null) {
							local2020.aClass47_1 = local1902;
							local2020.anInt658 = local12;
							local2020.anInt656 = local6;
							local2020.anInt657 = local9;
							Static249.aClass242_3.method5501(local2020);
						}
					} else if (local2012 != null) {
						local2020 = local2012.method5734(Static74.aClass121_3);
						if (local2020 != null) {
							local2020.aClass47_1 = local2012;
							local2020.anInt658 = local12;
							local2020.anInt656 = local6;
							local2020.anInt657 = local9;
							Static249.aClass242_3.method5501(local2020);
						}
					}
				}
			}
			local1057 = arg1.aClass47_Sub2_1;
			local411 = arg1.aClass47_Sub2_2;
			@Pc(2105) Class36_Sub1 local2105;
			if (local411 != null && (local411.anInt7426 & arg1.aShort66) != 0 && !Static343.method4933(local15, local6, local9, local411.anInt7426)) {
				if (Static144.aBoolean211) {
					Static11.method188(arg0, local411.anInt7426, local12, local6, local9);
					Static74.aClass121_3.method4591(arg0.anInt300, arg0.aClass1_Sub12Array2);
				}
				local2105 = local411.method5734(Static74.aClass121_3);
				if (local2105 != null) {
					local2105.aClass47_1 = local411;
					local2105.anInt658 = local12;
					local2105.anInt656 = local6;
					local2105.anInt657 = local9;
					Static249.aClass242_3.method5501(local2105);
				}
			}
			if (local1057 != null && (local1057.anInt7426 & arg1.aShort66) != 0 && !Static343.method4933(local15, local6, local9, local1057.anInt7426)) {
				if (Static144.aBoolean211) {
					Static11.method188(arg0, local1057.anInt7426, local12, local6, local9);
					Static74.aClass121_3.method4591(arg0.anInt300, arg0.aClass1_Sub12Array2);
				}
				local2105 = local1057.method5734(Static74.aClass121_3);
				if (local2105 != null) {
					local2105.aClass47_1 = local1057;
					local2105.anInt658 = local12;
					local2105.anInt656 = local6;
					local2105.anInt657 = local9;
					Static249.aClass242_3.method5501(local2105);
				}
			}
		}
		@Pc(2191) Class137 local2191;
		if (local12 < Static29.anInt482 - 1) {
			local2191 = Static131.aClass137ArrayArrayArray2[local12 + 1][local6][local9];
			if (local2191 != null && local2191.aBoolean293) {
				Static68.aClass143_1.method5049(local2191);
			}
		}
		if (local6 < Static59.anInt1066) {
			local2191 = local31[local6 + 1][local9];
			if (local2191 != null && local2191.aBoolean293) {
				Static68.aClass143_1.method5050(local2191);
			}
		}
		if (local9 < Static161.anInt2868) {
			local2191 = local31[local6][local9 + 1];
			if (local2191 != null && local2191.aBoolean293) {
				Static68.aClass143_1.method5050(local2191);
			}
		}
		if (local6 > Static59.anInt1066) {
			local2191 = local31[local6 - 1][local9];
			if (local2191 != null && local2191.aBoolean293) {
				Static68.aClass143_1.method5050(local2191);
			}
		}
		if (local9 > Static161.anInt2868) {
			local2191 = local31[local6][local9 - 1];
			if (local2191 != null && local2191.aBoolean293) {
				Static68.aClass143_1.method5050(local2191);
			}
		}
	}

	@OriginalMember(owner = "client!hr", name = "d", descriptor = "(B)V")
	public static void method2452() {
		@Pc(7) int local7 = Static97.anInt1902;
		@Pc(9) int[] local9 = Static105.anIntArray107;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class47_Sub1_Sub5_Sub2 local19 = Static362.aClass47_Sub1_Sub5_Sub2Array1[local9[local11]];
			if (local19 != null && local19.anInt5369 > 0) {
				local19.anInt5369--;
				if (local19.anInt5369 == 0) {
					local19.aString64 = null;
				}
			}
		}
		for (@Pc(53) int local53 = 0; local53 < Static47.anInt760; local53++) {
			@Pc(59) int local59 = Static151.anIntArray211[local53];
			@Pc(63) Class47_Sub1_Sub5_Sub1 local63 = Static307.aClass47_Sub1_Sub5_Sub1Array1[local59];
			if (local63 != null && local63.anInt5369 > 0) {
				local63.anInt5369--;
				if (local63.anInt5369 == 0) {
					local63.aString64 = null;
				}
			}
		}
	}
}
