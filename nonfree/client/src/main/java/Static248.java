import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!kda", name = "J", descriptor = "Lclient!fp;")
	public static Class91 aClass91_17;

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(Lclient!fw;Lclient!nj;)V")
	public static void method4195(@OriginalArg(0) Class96 arg0, @OriginalArg(1) Class206 arg1) {
		if (!arg1.aBoolean416) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort95;
		@Pc(9) short local9 = arg1.aShort94;
		@Pc(12) byte local12 = arg1.aByte73;
		@Pc(15) byte local15 = arg1.aByte70;
		@Pc(21) int local21 = (local6 << Static246.anInt4759) + Static444.anInt7507;
		@Pc(27) int local27 = (local9 << Static246.anInt4759) + Static444.anInt7507;
		@Pc(31) Class206[][] local31 = Static313.aClass206ArrayArrayArray2[local12];
		@Pc(53) float local53;
		if (Static106.aClass10Array5 == Static290.aClass10Array7) {
			Static423.aClass9_12.JA(Static53.aClass10Array3[0].aa(local21, local27), Static525.method7467(local6, local9), Static382.method5786(local6, local9), Static393.method5915(local6, local9));
			local53 = 251.5F;
		} else {
			local53 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static423.aClass9_12.la(3000.0F, local53 * 1.5F);
		@Pc(86) Class206 local86;
		@Pc(616) Class2_Sub6 local616;
		@Pc(711) int local711;
		@Pc(714) int local714;
		@Pc(723) int local723;
		@Pc(735) int local735;
		@Pc(406) int local406;
		@Pc(330) boolean local330;
		@Pc(377) Class2_Sub6 local377;
		@Pc(408) int local408;
		@Pc(411) Class47_Sub4 local411;
		@Pc(706) int local706;
		if (arg1.aBoolean415) {
			if (Static71.aBoolean148) {
				if (local12 > 0) {
					local86 = Static313.aClass206ArrayArrayArray2[local12 - 1][local6][local9];
					if (local86 != null && local86.aBoolean416) {
						return;
					}
				}
				if (local6 <= Static406.anInt7107 && local6 > Static530.anInt8978) {
					local86 = local31[local6 - 1][local9];
					if (local86 != null && local86.aBoolean416 && (local86.aBoolean415 || (arg1.aByte71 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static406.anInt7107 && local6 < Static518.anInt8804 - 1) {
					local86 = local31[local6 + 1][local9];
					if (local86 != null && local86.aBoolean416 && (local86.aBoolean415 || (arg1.aByte71 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static265.anInt5150 && local9 > Static537.anInt9318) {
					local86 = local31[local6][local9 - 1];
					if (local86 != null && local86.aBoolean416 && (local86.aBoolean415 || (arg1.aByte71 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static265.anInt5150 && local9 < Static227.anInt8838 - 1) {
					local86 = local31[local6][local9 + 1];
					if (local86 != null && local86.aBoolean416 && (local86.aBoolean415 || (arg1.aByte71 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static71.aBoolean148 = true;
			}
			arg1.aBoolean415 = false;
			if (arg1.aClass206_1 != null) {
				local86 = arg1.aClass206_1;
				Static423.aClass9_12.la(3000.0F, (201.5F - (float) (local86.aByte70 + 1) * 50.0F) * 1.5F);
				if (!Static32.method1277(local86.aByte70, local6, local9)) {
					Static290.aClass10Array7[local86.aByte70].method6333(local6, local9);
				}
				@Pc(249) Class47_Sub4 local249 = local86.aClass47_Sub4_2;
				if (local249 != null) {
					if (Static144.aBoolean206) {
						if ((local249.anInt8074 & arg1.aShort96) == 0) {
							Static42.method1369(arg0, local12, local6, local9);
						} else {
							Static209.method3805(arg0, local249.anInt8074, local15, local6, local9);
						}
						Static423.aClass9_12.method7588(arg0.anInt3335, arg0.aClass1_Sub27Array4);
					}
					local249.method7165(Static423.aClass9_12);
				}
				for (@Pc(286) Class168 local286 = local86.aClass168_2; local286 != null; local286 = local286.aClass168_1) {
					@Pc(290) Class47_Sub2 local290 = local286.aClass47_Sub2_2;
					if (local290 != null) {
						if (Static144.aBoolean206) {
							Static42.method1369(arg0, local12, local6, local9);
							Static423.aClass9_12.method7588(arg0.anInt3335, arg0.aClass1_Sub27Array4);
						}
						local290.method7165(Static423.aClass9_12);
					}
				}
				Static423.aClass9_12.la(3000.0F, local53 * 1.5F);
			}
			local330 = !Static32.method1277(local15, local6, local9);
			if (local330) {
				Static290.aClass10Array7[local15].method6333(local6, local9);
				@Pc(341) Class47_Sub3 local341 = arg1.aClass47_Sub3_1;
				if (local341 != null && local341.aBoolean538) {
					if (local341.aBoolean537) {
						Static423.aClass9_12.la(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static144.aBoolean206) {
						Static42.method1369(arg0, local12, local6, local9);
						Static423.aClass9_12.method7588(arg0.anInt3335, arg0.aClass1_Sub27Array4);
					}
					local377 = local341.method7165(Static423.aClass9_12);
					if (local377 != null) {
						local377.aClass47_1 = local341;
						local377.anInt4360 = local12;
						local377.anInt4365 = local6;
						local377.anInt4361 = local9;
						Static314.aClass145_5.method3927(local377);
					}
					if (local341.aBoolean537) {
						Static423.aClass9_12.la(3000.0F, local53 * 1.5F);
					}
				}
			}
			local406 = 0;
			local408 = 0;
			local411 = arg1.aClass47_Sub4_2;
			@Pc(414) Class47_Sub5 local414 = arg1.aClass47_Sub5_1;
			if (local411 != null || local414 != null) {
				if (Static406.anInt7107 == local6) {
					local406++;
				} else if (Static406.anInt7107 < local6) {
					local406 += 2;
				}
				if (Static265.anInt5150 == local9) {
					local406 += 3;
				} else if (Static265.anInt5150 > local9) {
					local406 += 6;
				}
				local408 = Static57.anIntArray144[local406];
				arg1.aShort96 = Static376.aShortArray117[local406];
			}
			if (local411 != null) {
				if ((local411.anInt8074 & Static284.anIntArray401[local406]) == 0) {
					arg1.aByte72 = 0;
				} else if (local411.anInt8074 == 16) {
					arg1.aByte72 = 3;
					arg1.aByte68 = Static45.aByteArray15[local406];
					arg1.aByte69 = (byte) (3 - arg1.aByte68);
				} else if (local411.anInt8074 == 32) {
					arg1.aByte72 = 6;
					arg1.aByte68 = Static29.aByteArray12[local406];
					arg1.aByte69 = (byte) (6 - arg1.aByte68);
				} else if (local411.anInt8074 == 64) {
					arg1.aByte72 = 12;
					arg1.aByte68 = Static405.aByteArray88[local406];
					arg1.aByte69 = (byte) (12 - arg1.aByte68);
				} else {
					arg1.aByte72 = 9;
					arg1.aByte68 = Static119.aByteArray31[local406];
					arg1.aByte69 = (byte) (9 - arg1.aByte68);
				}
				if ((local411.anInt8074 & local408) != 0 && !Static99.method2254(local15, local6, local9, local411.anInt8074)) {
					if (Static144.aBoolean206) {
						Static42.method1369(arg0, local12, local6, local9);
						Static423.aClass9_12.method7588(arg0.anInt3335, arg0.aClass1_Sub27Array4);
					}
					@Pc(563) Class2_Sub6 local563 = local411.method7165(Static423.aClass9_12);
					if (local563 != null) {
						local563.aClass47_1 = local411;
						local563.anInt4360 = local12;
						local563.anInt4365 = local6;
						local563.anInt4361 = local9;
						Static314.aClass145_5.method3927(local563);
					}
				}
				@Pc(584) Class47_Sub4 local584 = arg1.aClass47_Sub4_1;
				if (local584 != null && (local584.anInt8074 & local408) != 0 && !Static99.method2254(local15, local6, local9, local584.anInt8074)) {
					if (Static144.aBoolean206) {
						Static42.method1369(arg0, local12, local6, local9);
						Static423.aClass9_12.method7588(arg0.anInt3335, arg0.aClass1_Sub27Array4);
					}
					local616 = local584.method7165(Static423.aClass9_12);
					if (local616 != null) {
						local616.aClass47_1 = local584;
						local616.anInt4360 = local12;
						local616.anInt4365 = local6;
						local616.anInt4361 = local9;
						Static314.aClass145_5.method3927(local616);
					}
				}
			}
			if (local414 != null && !Static69.method7891(local15, local6, local9, local414.method7171())) {
				@Pc(647) Class47_Sub5 local647 = arg1.aClass47_Sub5_2;
				Static423.aClass9_12.la(3000.0F, (local53 - 0.5F) * 1.5F);
				if ((local414.anInt8494 & local408) != 0) {
					if (Static144.aBoolean206) {
						Static42.method1369(arg0, local12, local6, local9);
						Static423.aClass9_12.method7588(arg0.anInt3335, arg0.aClass1_Sub27Array4);
					}
					local616 = local414.method7165(Static423.aClass9_12);
					if (local616 != null) {
						local616.aClass47_1 = local414;
						local616.anInt4360 = local12;
						local616.anInt4365 = local6;
						local616.anInt4361 = local9;
						Static314.aClass145_5.method3927(local616);
					}
				} else if (local414.anInt8494 == 256) {
					local706 = local414.anInt8486 - Static267.anInt5170;
					local711 = local414.anInt8496 - Static360.anInt9309;
					local714 = local414.anInt8492;
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
					if (Static144.aBoolean206) {
						Static42.method1369(arg0, local12, local6, local9);
						Static423.aClass9_12.method7588(arg0.anInt3335, arg0.aClass1_Sub27Array4);
					}
					@Pc(759) Class2_Sub6 local759;
					if (local735 < local723) {
						local759 = local414.method7165(Static423.aClass9_12);
						if (local759 != null) {
							local759.aClass47_1 = local414;
							local759.anInt4360 = local12;
							local759.anInt4365 = local6;
							local759.anInt4361 = local9;
							Static314.aClass145_5.method3927(local759);
						}
					} else if (local647 != null) {
						local759 = local647.method7165(Static423.aClass9_12);
						if (local759 != null) {
							local759.aClass47_1 = local647;
							local759.anInt4360 = local12;
							local759.anInt4365 = local6;
							local759.anInt4361 = local9;
							Static314.aClass145_5.method3927(local759);
						}
					}
				}
				Static423.aClass9_12.la(3000.0F, local53 * 1.5F);
			}
			if (local330) {
				@Pc(814) Class47_Sub3 local814 = arg1.aClass47_Sub3_1;
				if (local814 != null && !local814.aBoolean538) {
					if (local814.aBoolean537) {
						Static423.aClass9_12.la(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static144.aBoolean206) {
						Static42.method1369(arg0, local12, local6, local9);
						Static423.aClass9_12.method7588(arg0.anInt3335, arg0.aClass1_Sub27Array4);
					}
					local616 = local814.method7165(Static423.aClass9_12);
					if (local616 != null) {
						local616.aClass47_1 = local814;
						local616.anInt4360 = local12;
						local616.anInt4365 = local6;
						local616.anInt4361 = local9;
						Static314.aClass145_5.method3927(local616);
					}
					if (local814.aBoolean537) {
						Static423.aClass9_12.la(3000.0F, local53 * 1.5F);
					}
				}
				@Pc(880) Class47_Sub1 local880 = arg1.aClass47_Sub1_1;
				if (local880 != null && !local880.aBoolean142) {
					if (Static144.aBoolean206) {
						Static42.method1369(arg0, local12, local6, local9);
						Static423.aClass9_12.method7588(arg0.anInt3335, arg0.aClass1_Sub27Array4);
					}
					@Pc(903) Class2_Sub6 local903 = local880.method7165(Static423.aClass9_12);
					if (local903 != null) {
						local903.aClass47_1 = local880;
						local903.anInt4360 = local12;
						local903.anInt4365 = local6;
						local903.anInt4361 = local9;
						Static314.aClass145_5.method3927(local903);
					}
				}
			}
			@Pc(924) byte local924 = arg1.aByte71;
			if (local924 != 0) {
				@Pc(941) Class206 local941;
				if (local6 < Static406.anInt7107 && (local924 & 0x4) != 0) {
					local941 = local31[local6 + 1][local9];
					if (local941 != null && local941.aBoolean416) {
						Static128.aClass43_1.method3643(local941);
					}
				}
				if (local9 < Static265.anInt5150 && (local924 & 0x2) != 0) {
					local941 = local31[local6][local9 + 1];
					if (local941 != null && local941.aBoolean416) {
						Static128.aClass43_1.method3643(local941);
					}
				}
				if (local6 > Static406.anInt7107 && (local924 & 0x1) != 0) {
					local941 = local31[local6 - 1][local9];
					if (local941 != null && local941.aBoolean416) {
						Static128.aClass43_1.method3643(local941);
					}
				}
				if (local9 > Static265.anInt5150 && (local924 & 0x8) != 0) {
					local941 = local31[local6][local9 - 1];
					if (local941 != null && local941.aBoolean416) {
						Static128.aClass43_1.method3643(local941);
					}
				}
			}
		}
		@Pc(1074) int local1074;
		@Pc(1057) Class47_Sub4 local1057;
		@Pc(1078) int local1078;
		@Pc(1030) Class168 local1030;
		if (arg1.aByte72 != 0) {
			local330 = true;
			for (local1030 = arg1.aClass168_2; local1030 != null; local1030 = local1030.aClass168_1) {
				if (local1030.aClass47_Sub2_2.anInt8190 != Static250.anInt4850 && (local1030.anInt4983 & arg1.aByte72) == arg1.aByte68) {
					local330 = false;
					break;
				}
			}
			if (local330) {
				local1057 = arg1.aClass47_Sub4_2;
				if (!Static99.method2254(local15, local6, local9, local1057.anInt8074)) {
					if (Static144.aBoolean206) {
						label682: {
							if (local1057.anInt8074 >= 16) {
								local1074 = local6 - Static406.anInt7107;
								local1078 = local9 - Static265.anInt5150;
								if (local1057.anInt8074 == 16) {
									local1074 -= Static444.anInt7507;
									local1078 += Static444.anInt7507;
									if (local1078 < local1074 && local6 > 0 && local9 <= Static60.anInt1677) {
										Static42.method1369(arg0, local12, local6 - 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt8074 == 32) {
									local1074 += Static444.anInt7507;
									local1078 += Static444.anInt7507;
									if (local1078 < -local1074 && local6 < Static488.anInt8353 && local9 < Static60.anInt1677) {
										Static42.method1369(arg0, local12, local6 + 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt8074 == 64) {
									local1074 += Static444.anInt7507;
									local1078 -= Static444.anInt7507;
									if (local1078 > local1074 && local6 < Static488.anInt8353 && local9 > 0) {
										Static42.method1369(arg0, local12, local6 + 1, local9 - 1);
										break label682;
									}
								} else if (local1057.anInt8074 == 128) {
									local1074 -= Static444.anInt7507;
									local1078 -= Static444.anInt7507;
									if (local1078 > -local1074 && local6 > 0 && local9 > 0) {
										Static42.method1369(arg0, local12, local6 - 1, local9 - 1);
										break label682;
									}
								}
							}
							Static42.method1369(arg0, local12, local6, local9);
						}
						Static423.aClass9_12.method7588(arg0.anInt3335, arg0.aClass1_Sub27Array4);
					}
					@Pc(1216) Class2_Sub6 local1216 = local1057.method7165(Static423.aClass9_12);
					if (local1216 != null) {
						local1216.aClass47_1 = local1057;
						local1216.anInt4360 = local12;
						local1216.anInt4365 = local6;
						local1216.anInt4361 = local9;
						Static314.aClass145_5.method3927(local1216);
					}
				}
				arg1.aByte72 = 0;
			}
		}
		@Pc(1333) int local1333;
		if (arg1.aBoolean417) {
			try {
				arg1.aBoolean417 = false;
				@Pc(1245) int local1245 = 0;
				label625: for (local1030 = arg1.aClass168_2; local1030 != null; local1030 = local1030.aClass168_1) {
					@Pc(1252) Class47_Sub2 local1252 = local1030.aClass47_Sub2_2;
					if (local1252.anInt8190 != Static250.anInt4850) {
						for (local1074 = local1252.aShort115; local1074 <= local1252.aShort116; local1074++) {
							for (local1078 = local1252.aShort117; local1078 <= local1252.aShort114; local1078++) {
								@Pc(1270) Class206 local1270 = local31[local1074][local1078];
								if (local1270.aBoolean415) {
									arg1.aBoolean417 = true;
									continue label625;
								}
								if (local1270.aByte72 != 0) {
									local706 = 0;
									if (local1074 > local1252.aShort115) {
										local706++;
									}
									if (local1074 < local1252.aShort116) {
										local706 += 4;
									}
									if (local1078 > local1252.aShort117) {
										local706 += 8;
									}
									if (local1078 < local1252.aShort114) {
										local706 += 2;
									}
									if ((local706 & local1270.aByte72) == arg1.aByte69) {
										arg1.aBoolean417 = true;
										continue label625;
									}
								}
							}
						}
						local1078 = Static406.anInt7107 - local1252.aShort115;
						local1333 = local1252.aShort116 - Static406.anInt7107;
						if (local1333 > local1078) {
							local1078 = local1333;
						}
						local706 = Static265.anInt5150 - local1252.aShort117;
						local711 = local1252.aShort114 - Static265.anInt5150;
						if (local711 > local706) {
							local706 = local711;
						}
						arg0.aClass47_Sub2Array2[local1245] = local1252;
						arg0.anIntArray266[local1245++] = local1078 + local706;
					}
				}
				while (local1245 > 0) {
					local408 = -50;
					local1074 = -1;
					@Pc(1384) Class47_Sub2 local1384;
					for (local1078 = 0; local1078 < local1245; local1078++) {
						local1384 = arg0.aClass47_Sub2Array2[local1078];
						if (local1384.anInt8190 != Static250.anInt4850) {
							local706 = arg0.anIntArray266[local1078];
							if (local706 > local408) {
								local408 = local706;
								local1074 = local1078;
							} else if (local706 == local408) {
								local711 = local1384.anInt8189 - Static267.anInt5170;
								local714 = local1384.anInt8191 - Static360.anInt9309;
								local723 = arg0.aClass47_Sub2Array2[local1074].anInt8189 - Static267.anInt5170;
								local735 = arg0.aClass47_Sub2Array2[local1074].anInt8191 - Static360.anInt9309;
								if (local711 * local711 + local714 * local714 > local723 * local723 + local735 * local735) {
									local1074 = local1078;
								}
							}
						}
					}
					if (local1074 == -1) {
						break;
					}
					local1384 = arg0.aClass47_Sub2Array2[local1074];
					local1384.anInt8190 = Static250.anInt4850;
					if (!Static516.method7365(local15, local1384.aShort115, local1384.aShort116, local1384.aShort117, local1384.aShort114, local1384.method6953())) {
						if (Static144.aBoolean206) {
							if (local1384.aByte93 == 0) {
								Static72.method1942(arg0, local12, local1384.aShort115, local1384.aShort117, local1384.aShort116, local1384.aShort114);
							} else {
								Static42.method1369(arg0, local12, local6, local9);
								local706 = local6 - Static406.anInt7107;
								local711 = local9 - Static265.anInt5150;
								if (local1384.aByte93 == 2) {
									if (local711 > -local706) {
										Static504.method7231(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static504.method7231(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local711 > local706) {
									Static504.method7231(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static504.method7231(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static423.aClass9_12.method7588(arg0.anInt3335, arg0.aClass1_Sub27Array4);
						}
						local616 = local1384.method7165(Static423.aClass9_12);
						if (local616 != null) {
							local616.aClass47_1 = local1384;
							local616.anInt4360 = local12;
							local616.anInt4365 = local1384.aShort115;
							local616.anInt4361 = local1384.aShort117;
							Static314.aClass145_5.method3927(local616);
						}
					}
					for (local706 = local1384.aShort115; local706 <= local1384.aShort116; local706++) {
						for (local711 = local1384.aShort117; local711 <= local1384.aShort114; local711++) {
							@Pc(1609) Class206 local1609 = local31[local706][local711];
							if (local1609.aByte72 != 0) {
								Static128.aClass43_1.method3643(local1609);
							} else if ((local706 != local6 || local711 != local9) && local1609.aBoolean416) {
								Static128.aClass43_1.method3643(local1609);
							}
						}
					}
				}
				if (arg1.aBoolean417) {
					return;
				}
			} catch (@Pc(1647) Exception local1647) {
				arg1.aBoolean417 = false;
			}
		}
		if (arg1.aClass249_2 != null && arg1.aByte74 == (byte) (Static32.anInt1261 & 0xFF)) {
			@Pc(1664) Class249 local1664 = arg1.aClass249_2;
			local406 = Static290.aClass10Array7[local12].ba(local6, local9);
			if (local12 < Static538.anInt9338 - 1) {
				local408 = Static290.aClass10Array7[local12].ba(local6, local9) - Static290.aClass10Array7[local12 + 1].ba(local6, local9);
			} else {
				local408 = 0x8 << Static246.anInt4759;
			}
			Static299.aClass22_8.method5946(local21, local406, local27, arg0.anIntArray267);
			local1074 = arg0.anIntArray267[2];
			Static299.aClass22_8.method5946(local21, local406 - local408, local27, arg0.anIntArray267);
			local1078 = arg0.anIntArray267[2];
			local1333 = local1074;
			local706 = local1078;
			if (local1074 > local1078) {
				local1333 = local1078;
				local706 = local1074;
			}
			local1333 -= Static229.anInt4560;
			local706 += Static229.anInt4560;
			local1664.anInt7171 = local1333;
			local1664.anInt7170 = local706;
			local1664.aBoolean474 = true;
			Static423.aClass9_12.method7577(local1664);
		}
		if (!arg1.aBoolean416) {
			return;
		}
		if (arg1.aByte72 != 0) {
			return;
		}
		if (local6 <= Static406.anInt7107 && local6 > Static530.anInt8978) {
			local86 = local31[local6 - 1][local9];
			if (local86 != null && local86.aBoolean416) {
				return;
			}
		}
		if (local6 >= Static406.anInt7107 && local6 < Static518.anInt8804 - 1) {
			local86 = local31[local6 + 1][local9];
			if (local86 != null && local86.aBoolean416) {
				return;
			}
		}
		if (local9 <= Static265.anInt5150 && local9 > Static537.anInt9318) {
			local86 = local31[local6][local9 - 1];
			if (local86 != null && local86.aBoolean416) {
				return;
			}
		}
		if (local9 >= Static265.anInt5150 && local9 < Static227.anInt8838 - 1) {
			local86 = local31[local6][local9 + 1];
			if (local86 != null && local86.aBoolean416) {
				return;
			}
		}
		arg1.aBoolean416 = false;
		Static511.anInt9418--;
		@Pc(1855) Class47_Sub1 local1855 = arg1.aClass47_Sub1_1;
		if (local1855 != null && local1855.aBoolean142) {
			if (Static144.aBoolean206) {
				Static42.method1369(arg0, local12, local6, local9);
				Static423.aClass9_12.method7588(arg0.anInt3335, arg0.aClass1_Sub27Array4);
			}
			@Pc(1878) Class2_Sub6 local1878 = local1855.method7165(Static423.aClass9_12);
			if (local1878 != null) {
				local1878.aClass47_1 = local1855;
				local1878.anInt4360 = local12;
				local1878.anInt4365 = local6;
				local1878.anInt4361 = local9;
				Static314.aClass145_5.method3927(local1878);
			}
		}
		if (arg1.aShort96 != 0) {
			@Pc(1902) Class47_Sub5 local1902 = arg1.aClass47_Sub5_1;
			if (local1902 != null && !Static69.method7891(local15, local6, local9, local1902.method7171())) {
				if ((local1902.anInt8494 & arg1.aShort96) != 0) {
					if (Static144.aBoolean206) {
						Static42.method1369(arg0, local12, local6, local9);
						Static423.aClass9_12.method7588(arg0.anInt3335, arg0.aClass1_Sub27Array4);
					}
					local377 = local1902.method7165(Static423.aClass9_12);
					if (local377 != null) {
						local377.aClass47_1 = local1902;
						local377.anInt4360 = local12;
						local377.anInt4365 = local6;
						local377.anInt4361 = local9;
						Static314.aClass145_5.method3927(local377);
					}
				} else if (local1902.anInt8494 == 256) {
					local408 = local1902.anInt8486 - Static267.anInt5170;
					local1074 = local1902.anInt8496 - Static360.anInt9309;
					local1078 = local1902.anInt8492;
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
					if (Static144.aBoolean206) {
						Static42.method1369(arg0, local12, local6, local9);
						Static423.aClass9_12.method7588(arg0.anInt3335, arg0.aClass1_Sub27Array4);
					}
					@Pc(2012) Class47_Sub5 local2012 = arg1.aClass47_Sub5_2;
					@Pc(2020) Class2_Sub6 local2020;
					if (local706 > local1333) {
						local2020 = local1902.method7165(Static423.aClass9_12);
						if (local2020 != null) {
							local2020.aClass47_1 = local1902;
							local2020.anInt4360 = local12;
							local2020.anInt4365 = local6;
							local2020.anInt4361 = local9;
							Static314.aClass145_5.method3927(local2020);
						}
					} else if (local2012 != null) {
						local2020 = local2012.method7165(Static423.aClass9_12);
						if (local2020 != null) {
							local2020.aClass47_1 = local2012;
							local2020.anInt4360 = local12;
							local2020.anInt4365 = local6;
							local2020.anInt4361 = local9;
							Static314.aClass145_5.method3927(local2020);
						}
					}
				}
			}
			local1057 = arg1.aClass47_Sub4_2;
			local411 = arg1.aClass47_Sub4_1;
			@Pc(2105) Class2_Sub6 local2105;
			if (local411 != null && (local411.anInt8074 & arg1.aShort96) != 0 && !Static99.method2254(local15, local6, local9, local411.anInt8074)) {
				if (Static144.aBoolean206) {
					Static209.method3805(arg0, local411.anInt8074, local12, local6, local9);
					Static423.aClass9_12.method7588(arg0.anInt3335, arg0.aClass1_Sub27Array4);
				}
				local2105 = local411.method7165(Static423.aClass9_12);
				if (local2105 != null) {
					local2105.aClass47_1 = local411;
					local2105.anInt4360 = local12;
					local2105.anInt4365 = local6;
					local2105.anInt4361 = local9;
					Static314.aClass145_5.method3927(local2105);
				}
			}
			if (local1057 != null && (local1057.anInt8074 & arg1.aShort96) != 0 && !Static99.method2254(local15, local6, local9, local1057.anInt8074)) {
				if (Static144.aBoolean206) {
					Static209.method3805(arg0, local1057.anInt8074, local12, local6, local9);
					Static423.aClass9_12.method7588(arg0.anInt3335, arg0.aClass1_Sub27Array4);
				}
				local2105 = local1057.method7165(Static423.aClass9_12);
				if (local2105 != null) {
					local2105.aClass47_1 = local1057;
					local2105.anInt4360 = local12;
					local2105.anInt4365 = local6;
					local2105.anInt4361 = local9;
					Static314.aClass145_5.method3927(local2105);
				}
			}
		}
		@Pc(2191) Class206 local2191;
		if (local12 < Static538.anInt9338 - 1) {
			local2191 = Static313.aClass206ArrayArrayArray2[local12 + 1][local6][local9];
			if (local2191 != null && local2191.aBoolean416) {
				Static128.aClass43_1.method3638(local2191);
			}
		}
		if (local6 < Static406.anInt7107) {
			local2191 = local31[local6 + 1][local9];
			if (local2191 != null && local2191.aBoolean416) {
				Static128.aClass43_1.method3643(local2191);
			}
		}
		if (local9 < Static265.anInt5150) {
			local2191 = local31[local6][local9 + 1];
			if (local2191 != null && local2191.aBoolean416) {
				Static128.aClass43_1.method3643(local2191);
			}
		}
		if (local6 > Static406.anInt7107) {
			local2191 = local31[local6 - 1][local9];
			if (local2191 != null && local2191.aBoolean416) {
				Static128.aClass43_1.method3643(local2191);
			}
		}
		if (local9 > Static265.anInt5150) {
			local2191 = local31[local6][local9 - 1];
			if (local2191 != null && local2191.aBoolean416) {
				Static128.aClass43_1.method3643(local2191);
			}
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)Z")
	public static boolean method4196() {
		if (Static111.aBoolean184) {
			try {
				Static554.method4839(Static91.aClass182_2.anApplet1, "showVideoAd");
				return true;
			} catch (@Pc(19) Throwable local19) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(BI)I")
	public static int method4205(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(IIILclient!sm;)V")
	public static void method4217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class47_Sub3 arg3) {
		@Pc(4) Class206 local4 = Static64.method1808(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass47_Sub3_1 = arg3;
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(ILclient!ub;)V")
	public static void method4220(@OriginalArg(1) Class283 arg0) {
		Static434.aClass283_1 = arg0;
	}

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "(IIB)Z")
	public static boolean method4223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static400.method6038(arg0, arg1) | (arg1 & 0x70000) != 0 || Static90.method2166(arg0, arg1);
	}
}
