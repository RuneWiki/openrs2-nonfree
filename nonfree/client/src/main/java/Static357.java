import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "Lclient!nl;")
	public static Class171 aClass171_69;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "Lclient!eo;")
	public static final Class62 aClass62_12 = new Class62(6, 6);

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I[[BLclient!pg;)V")
	public static void method4126(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class56_Sub1 arg1) {
		@Pc(16) int local16 = Static243.aByteArrayArray13.length;
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			@Pc(24) byte[] local24 = arg0[local18];
			if (local24 != null) {
				@Pc(37) int local37 = (Static68.anIntArray284[local18] >> 8) * 64 - Static28.anInt606;
				@Pc(48) int local48 = (Static68.anIntArray284[local18] & 0xFF) * 64 - Static319.anInt5425;
				Static271.method4164();
				arg1.method4075(Static58.aClass188Array1, Static111.aClass63_3, local24, local48, local37);
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!up;Lclient!wr;)V")
	public static void method4127(@OriginalArg(0) Class152 arg0, @OriginalArg(1) Class251 arg1) {
		if (!arg1.aBoolean473) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort100;
		@Pc(9) short local9 = arg1.aShort101;
		@Pc(12) byte local12 = arg1.aByte74;
		@Pc(15) byte local15 = arg1.aByte71;
		@Pc(21) int local21 = (local6 << Static333.anInt5694) + Static241.anInt4320;
		@Pc(27) int local27 = (local9 << Static333.anInt5694) + Static241.anInt4320;
		@Pc(31) Class251[][] local31 = Static64.aClass251ArrayArrayArray1[local12];
		@Pc(53) float local53;
		if (Static94.aClass107Array2 == Static350.aClass107Array4) {
			Static350.aClass63_8.method2009(Static90.aClass107Array1[0].method4673(local21, local27), Static218.method4032(local6, local9), Static143.method2681(local6, local9), Static290.method4403(local6, local9));
			local53 = 251.5F;
		} else {
			local53 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static350.aClass63_8.method2030(3000.0F, local53 * 1.5F);
		@Pc(86) Class251 local86;
		@Pc(616) Class10_Sub3 local616;
		@Pc(711) int local711;
		@Pc(714) int local714;
		@Pc(723) int local723;
		@Pc(735) int local735;
		@Pc(406) int local406;
		@Pc(330) boolean local330;
		@Pc(377) Class10_Sub3 local377;
		@Pc(408) int local408;
		@Pc(411) Class1_Sub1 local411;
		@Pc(706) int local706;
		if (arg1.aBoolean475) {
			if (Static144.aBoolean214) {
				if (local12 > 0) {
					local86 = Static64.aClass251ArrayArrayArray1[local12 - 1][local6][local9];
					if (local86 != null && local86.aBoolean473) {
						return;
					}
				}
				if (local6 <= Static322.anInt5531 && local6 > Static351.anInt6590) {
					local86 = local31[local6 - 1][local9];
					if (local86 != null && local86.aBoolean473 && (local86.aBoolean475 || (arg1.aByte76 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static322.anInt5531 && local6 < Static292.anInt5075 - 1) {
					local86 = local31[local6 + 1][local9];
					if (local86 != null && local86.aBoolean473 && (local86.aBoolean475 || (arg1.aByte76 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static314.anInt5359 && local9 > client.lb) {
					local86 = local31[local6][local9 - 1];
					if (local86 != null && local86.aBoolean473 && (local86.aBoolean475 || (arg1.aByte76 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static314.anInt5359 && local9 < Static333.anInt5691 - 1) {
					local86 = local31[local6][local9 + 1];
					if (local86 != null && local86.aBoolean473 && (local86.aBoolean475 || (arg1.aByte76 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static144.aBoolean214 = true;
			}
			arg1.aBoolean475 = false;
			if (arg1.aClass251_1 != null) {
				local86 = arg1.aClass251_1;
				Static350.aClass63_8.method2030(3000.0F, (201.5F - (float) (local86.aByte71 + 1) * 50.0F) * 1.5F);
				if (!Static66.method1052(local86.aByte71, local6, local9)) {
					Static350.aClass107Array4[local86.aByte71].method4667(local6, local9);
				}
				@Pc(249) Class1_Sub1 local249 = local86.aClass1_Sub1_3;
				if (local249 != null) {
					if (Static31.aBoolean56) {
						if ((local249.anInt6592 & arg1.aShort102) == 0) {
							Static117.method2424(arg0, local12, local6, local9);
						} else {
							Static37.method677(arg0, local249.anInt6592, local15, local6, local9);
						}
						Static350.aClass63_8.method2011(arg0.anInt3737, arg0.aClass2_Sub17_Sub1Array2);
					}
					local249.method5640(Static350.aClass63_8);
				}
				for (@Pc(286) Class46 local286 = local86.aClass46_3; local286 != null; local286 = local286.aClass46_1) {
					@Pc(290) Class1_Sub5 local290 = local286.aClass1_Sub5_1;
					if (local290 != null) {
						if (Static31.aBoolean56) {
							Static117.method2424(arg0, local12, local6, local9);
							Static350.aClass63_8.method2011(arg0.anInt3737, arg0.aClass2_Sub17_Sub1Array2);
						}
						local290.method5640(Static350.aClass63_8);
					}
				}
				Static350.aClass63_8.method2030(3000.0F, local53 * 1.5F);
			}
			local330 = !Static66.method1052(local15, local6, local9);
			if (local330) {
				Static350.aClass107Array4[local15].method4667(local6, local9);
				@Pc(341) Class1_Sub3 local341 = arg1.aClass1_Sub3_2;
				if (local341 != null && local341.aBoolean344) {
					if (local341.aBoolean345) {
						Static350.aClass63_8.method2030(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static31.aBoolean56) {
						Static117.method2424(arg0, local12, local6, local9);
						Static350.aClass63_8.method2011(arg0.anInt3737, arg0.aClass2_Sub17_Sub1Array2);
					}
					local377 = local341.method5640(Static350.aClass63_8);
					if (local377 != null) {
						local377.aClass1_1 = local341;
						local377.anInt1478 = local12;
						local377.anInt1479 = local6;
						local377.anInt1482 = local9;
						Static200.aClass154_6.method3481(local377);
					}
					if (local341.aBoolean345) {
						Static350.aClass63_8.method2030(3000.0F, local53 * 1.5F);
					}
				}
			}
			local406 = 0;
			local408 = 0;
			local411 = arg1.aClass1_Sub1_3;
			@Pc(414) Class1_Sub2 local414 = arg1.aClass1_Sub2_2;
			if (local411 != null || local414 != null) {
				if (Static322.anInt5531 == local6) {
					local406++;
				} else if (Static322.anInt5531 < local6) {
					local406 += 2;
				}
				if (Static314.anInt5359 == local9) {
					local406 += 3;
				} else if (Static314.anInt5359 > local9) {
					local406 += 6;
				}
				local408 = Static69.anIntArray306[local406];
				arg1.aShort102 = Static131.aShortArray41[local406];
			}
			if (local411 != null) {
				if ((local411.anInt6592 & Static29.anIntArray129[local406]) == 0) {
					arg1.aByte72 = 0;
				} else if (local411.anInt6592 == 16) {
					arg1.aByte72 = 3;
					arg1.aByte77 = Static257.aByteArray76[local406];
					arg1.aByte73 = (byte) (3 - arg1.aByte77);
				} else if (local411.anInt6592 == 32) {
					arg1.aByte72 = 6;
					arg1.aByte77 = Static329.aByteArray105[local406];
					arg1.aByte73 = (byte) (6 - arg1.aByte77);
				} else if (local411.anInt6592 == 64) {
					arg1.aByte72 = 12;
					arg1.aByte77 = Static40.aByteArray9[local406];
					arg1.aByte73 = (byte) (12 - arg1.aByte77);
				} else {
					arg1.aByte72 = 9;
					arg1.aByte77 = Static355.aByteArray111[local406];
					arg1.aByte73 = (byte) (9 - arg1.aByte77);
				}
				if ((local411.anInt6592 & local408) != 0 && !Static315.method4658(local15, local6, local9, local411.anInt6592)) {
					if (Static31.aBoolean56) {
						Static117.method2424(arg0, local12, local6, local9);
						Static350.aClass63_8.method2011(arg0.anInt3737, arg0.aClass2_Sub17_Sub1Array2);
					}
					@Pc(563) Class10_Sub3 local563 = local411.method5640(Static350.aClass63_8);
					if (local563 != null) {
						local563.aClass1_1 = local411;
						local563.anInt1478 = local12;
						local563.anInt1479 = local6;
						local563.anInt1482 = local9;
						Static200.aClass154_6.method3481(local563);
					}
				}
				@Pc(584) Class1_Sub1 local584 = arg1.aClass1_Sub1_2;
				if (local584 != null && (local584.anInt6592 & local408) != 0 && !Static315.method4658(local15, local6, local9, local584.anInt6592)) {
					if (Static31.aBoolean56) {
						Static117.method2424(arg0, local12, local6, local9);
						Static350.aClass63_8.method2011(arg0.anInt3737, arg0.aClass2_Sub17_Sub1Array2);
					}
					local616 = local584.method5640(Static350.aClass63_8);
					if (local616 != null) {
						local616.aClass1_1 = local584;
						local616.anInt1478 = local12;
						local616.anInt1479 = local6;
						local616.anInt1482 = local9;
						Static200.aClass154_6.method3481(local616);
					}
				}
			}
			if (local414 != null && !Static208.method3508(local15, local6, local9, local414.method5442())) {
				@Pc(647) Class1_Sub2 local647 = arg1.aClass1_Sub2_3;
				Static350.aClass63_8.method2030(3000.0F, (local53 - 0.5F) * 1.5F);
				if ((local414.anInt6257 & local408) != 0) {
					if (Static31.aBoolean56) {
						Static117.method2424(arg0, local12, local6, local9);
						Static350.aClass63_8.method2011(arg0.anInt3737, arg0.aClass2_Sub17_Sub1Array2);
					}
					local616 = local414.method5640(Static350.aClass63_8);
					if (local616 != null) {
						local616.aClass1_1 = local414;
						local616.anInt1478 = local12;
						local616.anInt1479 = local6;
						local616.anInt1482 = local9;
						Static200.aClass154_6.method3481(local616);
					}
				} else if (local414.anInt6257 == 256) {
					local706 = local414.anInt6264 - Static203.anInt3750;
					local711 = local414.anInt6263 - Static64.anInt1275;
					local714 = local414.anInt6255;
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
					if (Static31.aBoolean56) {
						Static117.method2424(arg0, local12, local6, local9);
						Static350.aClass63_8.method2011(arg0.anInt3737, arg0.aClass2_Sub17_Sub1Array2);
					}
					@Pc(759) Class10_Sub3 local759;
					if (local735 < local723) {
						local759 = local414.method5640(Static350.aClass63_8);
						if (local759 != null) {
							local759.aClass1_1 = local414;
							local759.anInt1478 = local12;
							local759.anInt1479 = local6;
							local759.anInt1482 = local9;
							Static200.aClass154_6.method3481(local759);
						}
					} else if (local647 != null) {
						local759 = local647.method5640(Static350.aClass63_8);
						if (local759 != null) {
							local759.aClass1_1 = local647;
							local759.anInt1478 = local12;
							local759.anInt1479 = local6;
							local759.anInt1482 = local9;
							Static200.aClass154_6.method3481(local759);
						}
					}
				}
				Static350.aClass63_8.method2030(3000.0F, local53 * 1.5F);
			}
			if (local330) {
				@Pc(814) Class1_Sub3 local814 = arg1.aClass1_Sub3_2;
				if (local814 != null && !local814.aBoolean344) {
					if (local814.aBoolean345) {
						Static350.aClass63_8.method2030(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static31.aBoolean56) {
						Static117.method2424(arg0, local12, local6, local9);
						Static350.aClass63_8.method2011(arg0.anInt3737, arg0.aClass2_Sub17_Sub1Array2);
					}
					local616 = local814.method5640(Static350.aClass63_8);
					if (local616 != null) {
						local616.aClass1_1 = local814;
						local616.anInt1478 = local12;
						local616.anInt1479 = local6;
						local616.anInt1482 = local9;
						Static200.aClass154_6.method3481(local616);
					}
					if (local814.aBoolean345) {
						Static350.aClass63_8.method2030(3000.0F, local53 * 1.5F);
					}
				}
				@Pc(880) Class1_Sub4 local880 = arg1.aClass1_Sub4_1;
				if (local880 != null && !local880.aBoolean113) {
					if (Static31.aBoolean56) {
						Static117.method2424(arg0, local12, local6, local9);
						Static350.aClass63_8.method2011(arg0.anInt3737, arg0.aClass2_Sub17_Sub1Array2);
					}
					@Pc(903) Class10_Sub3 local903 = local880.method5640(Static350.aClass63_8);
					if (local903 != null) {
						local903.aClass1_1 = local880;
						local903.anInt1478 = local12;
						local903.anInt1479 = local6;
						local903.anInt1482 = local9;
						Static200.aClass154_6.method3481(local903);
					}
				}
			}
			@Pc(924) byte local924 = arg1.aByte76;
			if (local924 != 0) {
				@Pc(941) Class251 local941;
				if (local6 < Static322.anInt5531 && (local924 & 0x4) != 0) {
					local941 = local31[local6 + 1][local9];
					if (local941 != null && local941.aBoolean473) {
						Static305.aClass29_1.method4191(local941);
					}
				}
				if (local9 < Static314.anInt5359 && (local924 & 0x2) != 0) {
					local941 = local31[local6][local9 + 1];
					if (local941 != null && local941.aBoolean473) {
						Static305.aClass29_1.method4191(local941);
					}
				}
				if (local6 > Static322.anInt5531 && (local924 & 0x1) != 0) {
					local941 = local31[local6 - 1][local9];
					if (local941 != null && local941.aBoolean473) {
						Static305.aClass29_1.method4191(local941);
					}
				}
				if (local9 > Static314.anInt5359 && (local924 & 0x8) != 0) {
					local941 = local31[local6][local9 - 1];
					if (local941 != null && local941.aBoolean473) {
						Static305.aClass29_1.method4191(local941);
					}
				}
			}
		}
		@Pc(1074) int local1074;
		@Pc(1057) Class1_Sub1 local1057;
		@Pc(1078) int local1078;
		@Pc(1030) Class46 local1030;
		if (arg1.aByte72 != 0) {
			local330 = true;
			for (local1030 = arg1.aClass46_3; local1030 != null; local1030 = local1030.aClass46_1) {
				if (local1030.aClass1_Sub5_1.anInt6389 != Static100.anInt2069 && (local1030.anInt1089 & arg1.aByte72) == arg1.aByte77) {
					local330 = false;
					break;
				}
			}
			if (local330) {
				local1057 = arg1.aClass1_Sub1_3;
				if (!Static315.method4658(local15, local6, local9, local1057.anInt6592)) {
					if (Static31.aBoolean56) {
						label687: {
							if (local1057.anInt6592 >= 16) {
								local1074 = local6 - Static322.anInt5531;
								local1078 = local9 - Static314.anInt5359;
								if (local1057.anInt6592 == 16) {
									local1074 -= Static241.anInt4320;
									local1078 += Static241.anInt4320;
									if (local1078 < local1074 && local6 > 0 && local9 <= Static341.anInt5833) {
										Static117.method2424(arg0, local12, local6 - 1, local9 + 1);
										break label687;
									}
								} else if (local1057.anInt6592 == 32) {
									local1074 += Static241.anInt4320;
									local1078 += Static241.anInt4320;
									if (local1078 < -local1074 && local6 < Static12.anInt312 && local9 < Static341.anInt5833) {
										Static117.method2424(arg0, local12, local6 + 1, local9 + 1);
										break label687;
									}
								} else if (local1057.anInt6592 == 64) {
									local1074 += Static241.anInt4320;
									local1078 -= Static241.anInt4320;
									if (local1078 > local1074 && local6 < Static12.anInt312 && local9 > 0) {
										Static117.method2424(arg0, local12, local6 + 1, local9 - 1);
										break label687;
									}
								} else if (local1057.anInt6592 == 128) {
									local1074 -= Static241.anInt4320;
									local1078 -= Static241.anInt4320;
									if (local1078 > -local1074 && local6 > 0 && local9 > 0) {
										Static117.method2424(arg0, local12, local6 - 1, local9 - 1);
										break label687;
									}
								}
							}
							Static117.method2424(arg0, local12, local6, local9);
						}
						Static350.aClass63_8.method2011(arg0.anInt3737, arg0.aClass2_Sub17_Sub1Array2);
					}
					@Pc(1216) Class10_Sub3 local1216 = local1057.method5640(Static350.aClass63_8);
					if (local1216 != null) {
						local1216.aClass1_1 = local1057;
						local1216.anInt1478 = local12;
						local1216.anInt1479 = local6;
						local1216.anInt1482 = local9;
						Static200.aClass154_6.method3481(local1216);
					}
				}
				arg1.aByte72 = 0;
			}
		}
		@Pc(1333) int local1333;
		if (arg1.aBoolean474) {
			try {
				arg1.aBoolean474 = false;
				@Pc(1245) int local1245 = 0;
				label630: for (local1030 = arg1.aClass46_3; local1030 != null; local1030 = local1030.aClass46_1) {
					@Pc(1252) Class1_Sub5 local1252 = local1030.aClass1_Sub5_1;
					if (local1252.anInt6389 != Static100.anInt2069) {
						for (local1074 = local1252.aShort96; local1074 <= local1252.aShort94; local1074++) {
							for (local1078 = local1252.aShort97; local1078 <= local1252.aShort95; local1078++) {
								@Pc(1270) Class251 local1270 = local31[local1074][local1078];
								if (local1270.aBoolean475) {
									arg1.aBoolean474 = true;
									continue label630;
								}
								if (local1270.aByte72 != 0) {
									local706 = 0;
									if (local1074 > local1252.aShort96) {
										local706++;
									}
									if (local1074 < local1252.aShort94) {
										local706 += 4;
									}
									if (local1078 > local1252.aShort97) {
										local706 += 8;
									}
									if (local1078 < local1252.aShort95) {
										local706 += 2;
									}
									if ((local706 & local1270.aByte72) == arg1.aByte73) {
										arg1.aBoolean474 = true;
										continue label630;
									}
								}
							}
						}
						local1078 = Static322.anInt5531 - local1252.aShort96;
						local1333 = local1252.aShort94 - Static322.anInt5531;
						if (local1333 > local1078) {
							local1078 = local1333;
						}
						local706 = Static314.anInt5359 - local1252.aShort97;
						local711 = local1252.aShort95 - Static314.anInt5359;
						if (local711 > local706) {
							local706 = local711;
						}
						arg0.aClass1_Sub5Array2[local1245] = local1252;
						arg0.anIntArray749[local1245++] = local1078 + local706;
					}
				}
				while (local1245 > 0) {
					local408 = -50;
					local1074 = -1;
					@Pc(1384) Class1_Sub5 local1384;
					for (local1078 = 0; local1078 < local1245; local1078++) {
						local1384 = arg0.aClass1_Sub5Array2[local1078];
						if (local1384.anInt6389 != Static100.anInt2069) {
							local706 = arg0.anIntArray749[local1078];
							if (local706 > local408) {
								local408 = local706;
								local1074 = local1078;
							} else if (local706 == local408) {
								local711 = local1384.anInt6390 - Static203.anInt3750;
								local714 = local1384.anInt6386 - Static64.anInt1275;
								local723 = arg0.aClass1_Sub5Array2[local1074].anInt6390 - Static203.anInt3750;
								local735 = arg0.aClass1_Sub5Array2[local1074].anInt6386 - Static64.anInt1275;
								if (local711 * local711 + local714 * local714 > local723 * local723 + local735 * local735) {
									local1074 = local1078;
								}
							}
						}
					}
					if (local1074 == -1) {
						break;
					}
					local1384 = arg0.aClass1_Sub5Array2[local1074];
					local1384.anInt6389 = Static100.anInt2069;
					if (!Static117.method2426(local15, local1384.aShort96, local1384.aShort94, local1384.aShort97, local1384.aShort95, local1384.method5540())) {
						if (Static31.aBoolean56) {
							if (local1384.aByte68 == 0) {
								Static170.method3000(arg0, local12, local1384.aShort96, local1384.aShort97, local1384.aShort94, local1384.aShort95);
							} else {
								Static117.method2424(arg0, local12, local6, local9);
								local706 = local6 - Static322.anInt5531;
								local711 = local9 - Static314.anInt5359;
								if (local1384.aByte68 == 2) {
									if (local711 > -local706) {
										Static231.method3757(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static231.method3757(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local711 > local706) {
									Static231.method3757(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static231.method3757(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static350.aClass63_8.method2011(arg0.anInt3737, arg0.aClass2_Sub17_Sub1Array2);
						}
						local616 = local1384.method5640(Static350.aClass63_8);
						if (local616 != null) {
							local616.aClass1_1 = local1384;
							local616.anInt1478 = local12;
							local616.anInt1479 = local1384.aShort96;
							local616.anInt1482 = local1384.aShort97;
							Static200.aClass154_6.method3481(local616);
						}
					}
					for (local706 = local1384.aShort96; local706 <= local1384.aShort94; local706++) {
						for (local711 = local1384.aShort97; local711 <= local1384.aShort95; local711++) {
							@Pc(1609) Class251 local1609 = local31[local706][local711];
							if (local1609.aByte72 != 0) {
								Static305.aClass29_1.method4191(local1609);
							} else if ((local706 != local6 || local711 != local9) && local1609.aBoolean473) {
								Static305.aClass29_1.method4191(local1609);
							}
						}
					}
				}
				if (arg1.aBoolean474) {
					return;
				}
			} catch (@Pc(1647) Exception local1647) {
				arg1.aBoolean474 = false;
			}
		}
		if (arg1.aClass186_2 != null) {
			if (arg1.aByte75 == (byte) (Static34.anInt730 & 0xFF)) {
				@Pc(1664) Class186 local1664 = arg1.aClass186_2;
				local406 = Static350.aClass107Array4[local12].method4685(local6, local9);
				if (local12 < Static12.anInt311 - 1) {
					local408 = Static350.aClass107Array4[local12].method4685(local6, local9) - Static350.aClass107Array4[local12 + 1].method4685(local6, local9);
				} else {
					local408 = 1024;
				}
				Static347.aClass44_4.method3535(local21, local406, local27, arg0.anIntArray750);
				local1074 = arg0.anIntArray750[2];
				Static347.aClass44_4.method3535(local21, local406 - local408, local27, arg0.anIntArray750);
				local1078 = arg0.anIntArray750[2];
				local1333 = local1074;
				local706 = local1078;
				if (local1074 > local1078) {
					local1333 = local1078;
					local706 = local1074;
				}
				local1333 -= Static207.anInt4910;
				local706 += Static207.anInt4910;
				if (local1333 < local706 - 1597) {
					local1333 = local706 - 1597;
				}
				local1664.anInt4523 = local1333;
				local1664.anInt4524 = local706;
				local1664.aBoolean338 = true;
				Static350.aClass63_8.method1973(local1664);
			} else {
				arg1.aClass186_2 = null;
			}
		}
		if (!arg1.aBoolean473) {
			return;
		}
		if (arg1.aByte72 != 0) {
			return;
		}
		if (local6 <= Static322.anInt5531 && local6 > Static351.anInt6590) {
			local86 = local31[local6 - 1][local9];
			if (local86 != null && local86.aBoolean473) {
				return;
			}
		}
		if (local6 >= Static322.anInt5531 && local6 < Static292.anInt5075 - 1) {
			local86 = local31[local6 + 1][local9];
			if (local86 != null && local86.aBoolean473) {
				return;
			}
		}
		if (local9 <= Static314.anInt5359 && local9 > client.lb) {
			local86 = local31[local6][local9 - 1];
			if (local86 != null && local86.aBoolean473) {
				return;
			}
		}
		if (local9 >= Static314.anInt5359 && local9 < Static333.anInt5691 - 1) {
			local86 = local31[local6][local9 + 1];
			if (local86 != null && local86.aBoolean473) {
				return;
			}
		}
		arg1.aBoolean473 = false;
		Static24.anInt527--;
		@Pc(1866) Class1_Sub4 local1866 = arg1.aClass1_Sub4_1;
		if (local1866 != null && local1866.aBoolean113) {
			if (Static31.aBoolean56) {
				Static117.method2424(arg0, local12, local6, local9);
				Static350.aClass63_8.method2011(arg0.anInt3737, arg0.aClass2_Sub17_Sub1Array2);
			}
			@Pc(1889) Class10_Sub3 local1889 = local1866.method5640(Static350.aClass63_8);
			if (local1889 != null) {
				local1889.aClass1_1 = local1866;
				local1889.anInt1478 = local12;
				local1889.anInt1479 = local6;
				local1889.anInt1482 = local9;
				Static200.aClass154_6.method3481(local1889);
			}
		}
		if (arg1.aShort102 != 0) {
			@Pc(1913) Class1_Sub2 local1913 = arg1.aClass1_Sub2_2;
			if (local1913 != null && !Static208.method3508(local15, local6, local9, local1913.method5442())) {
				if ((local1913.anInt6257 & arg1.aShort102) != 0) {
					if (Static31.aBoolean56) {
						Static117.method2424(arg0, local12, local6, local9);
						Static350.aClass63_8.method2011(arg0.anInt3737, arg0.aClass2_Sub17_Sub1Array2);
					}
					local377 = local1913.method5640(Static350.aClass63_8);
					if (local377 != null) {
						local377.aClass1_1 = local1913;
						local377.anInt1478 = local12;
						local377.anInt1479 = local6;
						local377.anInt1482 = local9;
						Static200.aClass154_6.method3481(local377);
					}
				} else if (local1913.anInt6257 == 256) {
					local408 = local1913.anInt6264 - Static203.anInt3750;
					local1074 = local1913.anInt6263 - Static64.anInt1275;
					local1078 = local1913.anInt6255;
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
					if (Static31.aBoolean56) {
						Static117.method2424(arg0, local12, local6, local9);
						Static350.aClass63_8.method2011(arg0.anInt3737, arg0.aClass2_Sub17_Sub1Array2);
					}
					@Pc(2023) Class1_Sub2 local2023 = arg1.aClass1_Sub2_3;
					@Pc(2031) Class10_Sub3 local2031;
					if (local706 > local1333) {
						local2031 = local1913.method5640(Static350.aClass63_8);
						if (local2031 != null) {
							local2031.aClass1_1 = local1913;
							local2031.anInt1478 = local12;
							local2031.anInt1479 = local6;
							local2031.anInt1482 = local9;
							Static200.aClass154_6.method3481(local2031);
						}
					} else if (local2023 != null) {
						local2031 = local2023.method5640(Static350.aClass63_8);
						if (local2031 != null) {
							local2031.aClass1_1 = local2023;
							local2031.anInt1478 = local12;
							local2031.anInt1479 = local6;
							local2031.anInt1482 = local9;
							Static200.aClass154_6.method3481(local2031);
						}
					}
				}
			}
			local1057 = arg1.aClass1_Sub1_3;
			local411 = arg1.aClass1_Sub1_2;
			@Pc(2116) Class10_Sub3 local2116;
			if (local411 != null && (local411.anInt6592 & arg1.aShort102) != 0 && !Static315.method4658(local15, local6, local9, local411.anInt6592)) {
				if (Static31.aBoolean56) {
					Static37.method677(arg0, local411.anInt6592, local12, local6, local9);
					Static350.aClass63_8.method2011(arg0.anInt3737, arg0.aClass2_Sub17_Sub1Array2);
				}
				local2116 = local411.method5640(Static350.aClass63_8);
				if (local2116 != null) {
					local2116.aClass1_1 = local411;
					local2116.anInt1478 = local12;
					local2116.anInt1479 = local6;
					local2116.anInt1482 = local9;
					Static200.aClass154_6.method3481(local2116);
				}
			}
			if (local1057 != null && (local1057.anInt6592 & arg1.aShort102) != 0 && !Static315.method4658(local15, local6, local9, local1057.anInt6592)) {
				if (Static31.aBoolean56) {
					Static37.method677(arg0, local1057.anInt6592, local12, local6, local9);
					Static350.aClass63_8.method2011(arg0.anInt3737, arg0.aClass2_Sub17_Sub1Array2);
				}
				local2116 = local1057.method5640(Static350.aClass63_8);
				if (local2116 != null) {
					local2116.aClass1_1 = local1057;
					local2116.anInt1478 = local12;
					local2116.anInt1479 = local6;
					local2116.anInt1482 = local9;
					Static200.aClass154_6.method3481(local2116);
				}
			}
		}
		@Pc(2202) Class251 local2202;
		if (local12 < Static12.anInt311 - 1) {
			local2202 = Static64.aClass251ArrayArrayArray1[local12 + 1][local6][local9];
			if (local2202 != null && local2202.aBoolean473) {
				Static305.aClass29_1.method4189(local2202);
			}
		}
		if (local6 < Static322.anInt5531) {
			local2202 = local31[local6 + 1][local9];
			if (local2202 != null && local2202.aBoolean473) {
				Static305.aClass29_1.method4191(local2202);
			}
		}
		if (local9 < Static314.anInt5359) {
			local2202 = local31[local6][local9 + 1];
			if (local2202 != null && local2202.aBoolean473) {
				Static305.aClass29_1.method4191(local2202);
			}
		}
		if (local6 > Static322.anInt5531) {
			local2202 = local31[local6 - 1][local9];
			if (local2202 != null && local2202.aBoolean473) {
				Static305.aClass29_1.method4191(local2202);
			}
		}
		if (local9 > Static314.anInt5359) {
			local2202 = local31[local6][local9 - 1];
			if (local2202 != null && local2202.aBoolean473) {
				Static305.aClass29_1.method4191(local2202);
			}
		}
	}
}
