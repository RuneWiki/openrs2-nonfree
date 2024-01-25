import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!hr", name = "f", descriptor = "Lclient!fc;")
	public static Class71 aClass71_80;

	@OriginalMember(owner = "client!hr", name = "h", descriptor = "I")
	public static int anInt5810;

	@OriginalMember(owner = "client!hr", name = "e", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_151 = new Class77(28, 6);

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!vd;Lclient!ui;)V")
	public static void method5081(@OriginalArg(0) Class188 arg0, @OriginalArg(1) Class227 arg1) {
		if (!arg1.aBoolean465) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort90;
		@Pc(9) short local9 = arg1.aShort92;
		@Pc(12) byte local12 = arg1.aByte69;
		@Pc(15) byte local15 = arg1.aByte68;
		@Pc(21) int local21 = (local6 << Static315.anInt5584) + Static365.anInt2303;
		@Pc(27) int local27 = (local9 << Static315.anInt5584) + Static365.anInt2303;
		@Pc(31) Class227[][] local31 = Static297.aClass227ArrayArrayArray7[local12];
		@Pc(53) float local53;
		if (Static345.aClass33Array3 == Static17.aClass33Array1) {
			Static315.aClass82_7.method4557(Static39.aClass33Array2[0].method4055(local21, local27), Static187.method3022(local6, local9), Static104.method1847(local6, local9), Static57.method4060(local6, local9));
			local53 = 251.5F;
		} else {
			local53 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static315.aClass82_7.method4516(3000.0F, local53 * 1.5F);
		@Pc(86) Class227 local86;
		@Pc(616) Class22_Sub8 local616;
		@Pc(711) int local711;
		@Pc(714) int local714;
		@Pc(723) int local723;
		@Pc(735) int local735;
		@Pc(406) int local406;
		@Pc(330) boolean local330;
		@Pc(377) Class22_Sub8 local377;
		@Pc(408) int local408;
		@Pc(411) Class12_Sub2 local411;
		@Pc(706) int local706;
		if (arg1.aBoolean463) {
			if (Static283.aBoolean359) {
				if (local12 > 0) {
					local86 = Static297.aClass227ArrayArrayArray7[local12 - 1][local6][local9];
					if (local86 != null && local86.aBoolean465) {
						return;
					}
				}
				if (local6 <= Static33.anInt702 && local6 > Static218.anInt4049) {
					local86 = local31[local6 - 1][local9];
					if (local86 != null && local86.aBoolean465 && (local86.aBoolean463 || (arg1.aByte64 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static33.anInt702 && local6 < Static263.anInt4660 - 1) {
					local86 = local31[local6 + 1][local9];
					if (local86 != null && local86.aBoolean465 && (local86.aBoolean463 || (arg1.aByte64 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static345.anInt6083 && local9 > Static276.anInt4907) {
					local86 = local31[local6][local9 - 1];
					if (local86 != null && local86.aBoolean465 && (local86.aBoolean463 || (arg1.aByte64 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static345.anInt6083 && local9 < Static376.anInt6609 - 1) {
					local86 = local31[local6][local9 + 1];
					if (local86 != null && local86.aBoolean465 && (local86.aBoolean463 || (arg1.aByte64 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static283.aBoolean359 = true;
			}
			arg1.aBoolean463 = false;
			if (arg1.aClass227_1 != null) {
				local86 = arg1.aClass227_1;
				Static315.aClass82_7.method4516(3000.0F, (201.5F - (float) (local86.aByte68 + 1) * 50.0F) * 1.5F);
				if (!Static30.method725(local86.aByte68, local6, local9)) {
					Static17.aClass33Array1[local86.aByte68].method4067(local6, local9);
				}
				@Pc(249) Class12_Sub2 local249 = local86.aClass12_Sub2_2;
				if (local249 != null) {
					if (Static161.aBoolean216) {
						if ((local249.anInt1073 & arg1.aShort91) == 0) {
							Static386.method1337(arg0, local12, local6, local9);
						} else {
							Static59.method1128(arg0, local249.anInt1073, local15, local6, local9);
						}
						Static315.aClass82_7.method4489(arg0.anInt5141, arg0.aClass2_Sub14_Sub1Array4);
					}
					local249.method5451(Static315.aClass82_7);
				}
				for (@Pc(286) Class164 local286 = local86.aClass164_25; local286 != null; local286 = local286.aClass164_19) {
					@Pc(290) Class12_Sub1 local290 = local286.aClass12_Sub1_2;
					if (local290 != null) {
						if (Static161.aBoolean216) {
							Static386.method1337(arg0, local12, local6, local9);
							Static315.aClass82_7.method4489(arg0.anInt5141, arg0.aClass2_Sub14_Sub1Array4);
						}
						local290.method5451(Static315.aClass82_7);
					}
				}
				Static315.aClass82_7.method4516(3000.0F, local53 * 1.5F);
			}
			local330 = !Static30.method725(local15, local6, local9);
			if (local330) {
				Static17.aClass33Array1[local15].method4067(local6, local9);
				@Pc(341) Class12_Sub5 local341 = arg1.aClass12_Sub5_2;
				if (local341 != null && local341.aBoolean441) {
					if (local341.aBoolean442) {
						Static315.aClass82_7.method4516(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static161.aBoolean216) {
						Static386.method1337(arg0, local12, local6, local9);
						Static315.aClass82_7.method4489(arg0.anInt5141, arg0.aClass2_Sub14_Sub1Array4);
					}
					local377 = local341.method5451(Static315.aClass82_7);
					if (local377 != null) {
						local377.aClass12_1 = local341;
						local377.anInt6046 = local12;
						local377.anInt6043 = local6;
						local377.anInt6047 = local9;
						Static371.aClass56_7.method1253(local377);
					}
					if (local341.aBoolean442) {
						Static315.aClass82_7.method4516(3000.0F, local53 * 1.5F);
					}
				}
			}
			local406 = 0;
			local408 = 0;
			local411 = arg1.aClass12_Sub2_2;
			@Pc(414) Class12_Sub4 local414 = arg1.aClass12_Sub4_3;
			if (local411 != null || local414 != null) {
				if (Static33.anInt702 == local6) {
					local406++;
				} else if (Static33.anInt702 < local6) {
					local406 += 2;
				}
				if (Static345.anInt6083 == local9) {
					local406 += 3;
				} else if (Static345.anInt6083 > local9) {
					local406 += 6;
				}
				local408 = Static181.anIntArray359[local406];
				arg1.aShort91 = Static360.aShortArray111[local406];
			}
			if (local411 != null) {
				if ((local411.anInt1073 & Static240.anIntArray534[local406]) == 0) {
					arg1.aByte66 = 0;
				} else if (local411.anInt1073 == 16) {
					arg1.aByte66 = 3;
					arg1.aByte67 = Static48.aByteArray18[local406];
					arg1.aByte65 = (byte) (3 - arg1.aByte67);
				} else if (local411.anInt1073 == 32) {
					arg1.aByte66 = 6;
					arg1.aByte67 = Static66.aByteArray85[local406];
					arg1.aByte65 = (byte) (6 - arg1.aByte67);
				} else if (local411.anInt1073 == 64) {
					arg1.aByte66 = 12;
					arg1.aByte67 = Static143.aByteArray44[local406];
					arg1.aByte65 = (byte) (12 - arg1.aByte67);
				} else {
					arg1.aByte66 = 9;
					arg1.aByte67 = Static164.aByteArray49[local406];
					arg1.aByte65 = (byte) (9 - arg1.aByte67);
				}
				if ((local411.anInt1073 & local408) != 0 && !Static287.method4406(local15, local6, local9, local411.anInt1073)) {
					if (Static161.aBoolean216) {
						Static386.method1337(arg0, local12, local6, local9);
						Static315.aClass82_7.method4489(arg0.anInt5141, arg0.aClass2_Sub14_Sub1Array4);
					}
					@Pc(563) Class22_Sub8 local563 = local411.method5451(Static315.aClass82_7);
					if (local563 != null) {
						local563.aClass12_1 = local411;
						local563.anInt6046 = local12;
						local563.anInt6043 = local6;
						local563.anInt6047 = local9;
						Static371.aClass56_7.method1253(local563);
					}
				}
				@Pc(584) Class12_Sub2 local584 = arg1.aClass12_Sub2_3;
				if (local584 != null && (local584.anInt1073 & local408) != 0 && !Static287.method4406(local15, local6, local9, local584.anInt1073)) {
					if (Static161.aBoolean216) {
						Static386.method1337(arg0, local12, local6, local9);
						Static315.aClass82_7.method4489(arg0.anInt5141, arg0.aClass2_Sub14_Sub1Array4);
					}
					local616 = local584.method5451(Static315.aClass82_7);
					if (local616 != null) {
						local616.aClass12_1 = local584;
						local616.anInt6046 = local12;
						local616.anInt6043 = local6;
						local616.anInt6047 = local9;
						Static371.aClass56_7.method1253(local616);
					}
				}
			}
			if (local414 != null && !Static274.method1029(local15, local6, local9, local414.method5019())) {
				@Pc(647) Class12_Sub4 local647 = arg1.aClass12_Sub4_2;
				Static315.aClass82_7.method4516(3000.0F, (local53 - 0.5F) * 1.5F);
				if ((local414.anInt5723 & local408) != 0) {
					if (Static161.aBoolean216) {
						Static386.method1337(arg0, local12, local6, local9);
						Static315.aClass82_7.method4489(arg0.anInt5141, arg0.aClass2_Sub14_Sub1Array4);
					}
					local616 = local414.method5451(Static315.aClass82_7);
					if (local616 != null) {
						local616.aClass12_1 = local414;
						local616.anInt6046 = local12;
						local616.anInt6043 = local6;
						local616.anInt6047 = local9;
						Static371.aClass56_7.method1253(local616);
					}
				} else if (local414.anInt5723 == 256) {
					local706 = local414.anInt5727 - Static174.anInt6735;
					local711 = local414.anInt5721 - Static34.anInt736;
					local714 = local414.anInt5728;
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
					if (Static161.aBoolean216) {
						Static386.method1337(arg0, local12, local6, local9);
						Static315.aClass82_7.method4489(arg0.anInt5141, arg0.aClass2_Sub14_Sub1Array4);
					}
					@Pc(759) Class22_Sub8 local759;
					if (local735 < local723) {
						local759 = local414.method5451(Static315.aClass82_7);
						if (local759 != null) {
							local759.aClass12_1 = local414;
							local759.anInt6046 = local12;
							local759.anInt6043 = local6;
							local759.anInt6047 = local9;
							Static371.aClass56_7.method1253(local759);
						}
					} else if (local647 != null) {
						local759 = local647.method5451(Static315.aClass82_7);
						if (local759 != null) {
							local759.aClass12_1 = local647;
							local759.anInt6046 = local12;
							local759.anInt6043 = local6;
							local759.anInt6047 = local9;
							Static371.aClass56_7.method1253(local759);
						}
					}
				}
				Static315.aClass82_7.method4516(3000.0F, local53 * 1.5F);
			}
			if (local330) {
				@Pc(814) Class12_Sub5 local814 = arg1.aClass12_Sub5_2;
				if (local814 != null && !local814.aBoolean441) {
					if (local814.aBoolean442) {
						Static315.aClass82_7.method4516(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static161.aBoolean216) {
						Static386.method1337(arg0, local12, local6, local9);
						Static315.aClass82_7.method4489(arg0.anInt5141, arg0.aClass2_Sub14_Sub1Array4);
					}
					local616 = local814.method5451(Static315.aClass82_7);
					if (local616 != null) {
						local616.aClass12_1 = local814;
						local616.anInt6046 = local12;
						local616.anInt6043 = local6;
						local616.anInt6047 = local9;
						Static371.aClass56_7.method1253(local616);
					}
					if (local814.aBoolean442) {
						Static315.aClass82_7.method4516(3000.0F, local53 * 1.5F);
					}
				}
				@Pc(880) Class12_Sub3 local880 = arg1.aClass12_Sub3_1;
				if (local880 != null && !local880.aBoolean122) {
					if (Static161.aBoolean216) {
						Static386.method1337(arg0, local12, local6, local9);
						Static315.aClass82_7.method4489(arg0.anInt5141, arg0.aClass2_Sub14_Sub1Array4);
					}
					@Pc(903) Class22_Sub8 local903 = local880.method5451(Static315.aClass82_7);
					if (local903 != null) {
						local903.aClass12_1 = local880;
						local903.anInt6046 = local12;
						local903.anInt6043 = local6;
						local903.anInt6047 = local9;
						Static371.aClass56_7.method1253(local903);
					}
				}
			}
			@Pc(924) byte local924 = arg1.aByte64;
			if (local924 != 0) {
				@Pc(941) Class227 local941;
				if (local6 < Static33.anInt702 && (local924 & 0x4) != 0) {
					local941 = local31[local6 + 1][local9];
					if (local941 != null && local941.aBoolean465) {
						Static42.aClass51_1.method2513(local941);
					}
				}
				if (local9 < Static345.anInt6083 && (local924 & 0x2) != 0) {
					local941 = local31[local6][local9 + 1];
					if (local941 != null && local941.aBoolean465) {
						Static42.aClass51_1.method2513(local941);
					}
				}
				if (local6 > Static33.anInt702 && (local924 & 0x1) != 0) {
					local941 = local31[local6 - 1][local9];
					if (local941 != null && local941.aBoolean465) {
						Static42.aClass51_1.method2513(local941);
					}
				}
				if (local9 > Static345.anInt6083 && (local924 & 0x8) != 0) {
					local941 = local31[local6][local9 - 1];
					if (local941 != null && local941.aBoolean465) {
						Static42.aClass51_1.method2513(local941);
					}
				}
			}
		}
		@Pc(1074) int local1074;
		@Pc(1057) Class12_Sub2 local1057;
		@Pc(1078) int local1078;
		@Pc(1030) Class164 local1030;
		if (arg1.aByte66 != 0) {
			local330 = true;
			for (local1030 = arg1.aClass164_25; local1030 != null; local1030 = local1030.aClass164_19) {
				if (local1030.aClass12_Sub1_2.anInt6320 != Static284.anInt5039 && (local1030.anInt4393 & arg1.aByte66) == arg1.aByte67) {
					local330 = false;
					break;
				}
			}
			if (local330) {
				local1057 = arg1.aClass12_Sub2_2;
				if (!Static287.method4406(local15, local6, local9, local1057.anInt1073)) {
					if (Static161.aBoolean216) {
						label687: {
							if (local1057.anInt1073 >= 16) {
								local1074 = local6 - Static33.anInt702;
								local1078 = local9 - Static345.anInt6083;
								if (local1057.anInt1073 == 16) {
									local1074 -= Static365.anInt2303;
									local1078 += Static365.anInt2303;
									if (local1078 < local1074 && local6 > 0 && local9 <= Static244.anInt1024) {
										Static386.method1337(arg0, local12, local6 - 1, local9 + 1);
										break label687;
									}
								} else if (local1057.anInt1073 == 32) {
									local1074 += Static365.anInt2303;
									local1078 += Static365.anInt2303;
									if (local1078 < -local1074 && local6 < Static166.anInt2967 && local9 < Static244.anInt1024) {
										Static386.method1337(arg0, local12, local6 + 1, local9 + 1);
										break label687;
									}
								} else if (local1057.anInt1073 == 64) {
									local1074 += Static365.anInt2303;
									local1078 -= Static365.anInt2303;
									if (local1078 > local1074 && local6 < Static166.anInt2967 && local9 > 0) {
										Static386.method1337(arg0, local12, local6 + 1, local9 - 1);
										break label687;
									}
								} else if (local1057.anInt1073 == 128) {
									local1074 -= Static365.anInt2303;
									local1078 -= Static365.anInt2303;
									if (local1078 > -local1074 && local6 > 0 && local9 > 0) {
										Static386.method1337(arg0, local12, local6 - 1, local9 - 1);
										break label687;
									}
								}
							}
							Static386.method1337(arg0, local12, local6, local9);
						}
						Static315.aClass82_7.method4489(arg0.anInt5141, arg0.aClass2_Sub14_Sub1Array4);
					}
					@Pc(1216) Class22_Sub8 local1216 = local1057.method5451(Static315.aClass82_7);
					if (local1216 != null) {
						local1216.aClass12_1 = local1057;
						local1216.anInt6046 = local12;
						local1216.anInt6043 = local6;
						local1216.anInt6047 = local9;
						Static371.aClass56_7.method1253(local1216);
					}
				}
				arg1.aByte66 = 0;
			}
		}
		@Pc(1333) int local1333;
		if (arg1.aBoolean464) {
			try {
				arg1.aBoolean464 = false;
				@Pc(1245) int local1245 = 0;
				label630: for (local1030 = arg1.aClass164_25; local1030 != null; local1030 = local1030.aClass164_19) {
					@Pc(1252) Class12_Sub1 local1252 = local1030.aClass12_Sub1_2;
					if (local1252.anInt6320 != Static284.anInt5039) {
						for (local1074 = local1252.aShort97; local1074 <= local1252.aShort96; local1074++) {
							for (local1078 = local1252.aShort94; local1078 <= local1252.aShort95; local1078++) {
								@Pc(1270) Class227 local1270 = local31[local1074][local1078];
								if (local1270.aBoolean463) {
									arg1.aBoolean464 = true;
									continue label630;
								}
								if (local1270.aByte66 != 0) {
									local706 = 0;
									if (local1074 > local1252.aShort97) {
										local706++;
									}
									if (local1074 < local1252.aShort96) {
										local706 += 4;
									}
									if (local1078 > local1252.aShort94) {
										local706 += 8;
									}
									if (local1078 < local1252.aShort95) {
										local706 += 2;
									}
									if ((local706 & local1270.aByte66) == arg1.aByte65) {
										arg1.aBoolean464 = true;
										continue label630;
									}
								}
							}
						}
						local1078 = Static33.anInt702 - local1252.aShort97;
						local1333 = local1252.aShort96 - Static33.anInt702;
						if (local1333 > local1078) {
							local1078 = local1333;
						}
						local706 = Static345.anInt6083 - local1252.aShort94;
						local711 = local1252.aShort95 - Static345.anInt6083;
						if (local711 > local706) {
							local706 = local711;
						}
						arg0.aClass12_Sub1Array5[local1245] = local1252;
						arg0.anIntArray636[local1245++] = local1078 + local706;
					}
				}
				while (local1245 > 0) {
					local408 = -50;
					local1074 = -1;
					@Pc(1384) Class12_Sub1 local1384;
					for (local1078 = 0; local1078 < local1245; local1078++) {
						local1384 = arg0.aClass12_Sub1Array5[local1078];
						if (local1384.anInt6320 != Static284.anInt5039) {
							local706 = arg0.anIntArray636[local1078];
							if (local706 > local408) {
								local408 = local706;
								local1074 = local1078;
							} else if (local706 == local408) {
								local711 = local1384.anInt6328 - Static174.anInt6735;
								local714 = local1384.anInt6317 - Static34.anInt736;
								local723 = arg0.aClass12_Sub1Array5[local1074].anInt6328 - Static174.anInt6735;
								local735 = arg0.aClass12_Sub1Array5[local1074].anInt6317 - Static34.anInt736;
								if (local711 * local711 + local714 * local714 > local723 * local723 + local735 * local735) {
									local1074 = local1078;
								}
							}
						}
					}
					if (local1074 == -1) {
						break;
					}
					local1384 = arg0.aClass12_Sub1Array5[local1074];
					local1384.anInt6320 = Static284.anInt5039;
					if (!Static150.method2532(local15, local1384.aShort97, local1384.aShort96, local1384.aShort94, local1384.aShort95, local1384.method5459())) {
						if (Static161.aBoolean216) {
							if (local1384.aByte73 == 0) {
								Static354.method5366(arg0, local12, local1384.aShort97, local1384.aShort94, local1384.aShort96, local1384.aShort95);
							} else {
								Static386.method1337(arg0, local12, local6, local9);
								local706 = local6 - Static33.anInt702;
								local711 = local9 - Static345.anInt6083;
								if (local1384.aByte73 == 2) {
									if (local711 > -local706) {
										Static100.method1791(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static100.method1791(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local711 > local706) {
									Static100.method1791(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static100.method1791(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static315.aClass82_7.method4489(arg0.anInt5141, arg0.aClass2_Sub14_Sub1Array4);
						}
						local616 = local1384.method5451(Static315.aClass82_7);
						if (local616 != null) {
							local616.aClass12_1 = local1384;
							local616.anInt6046 = local12;
							local616.anInt6043 = local1384.aShort97;
							local616.anInt6047 = local1384.aShort94;
							Static371.aClass56_7.method1253(local616);
						}
					}
					for (local706 = local1384.aShort97; local706 <= local1384.aShort96; local706++) {
						for (local711 = local1384.aShort94; local711 <= local1384.aShort95; local711++) {
							@Pc(1609) Class227 local1609 = local31[local706][local711];
							if (local1609.aByte66 != 0) {
								Static42.aClass51_1.method2513(local1609);
							} else if ((local706 != local6 || local711 != local9) && local1609.aBoolean465) {
								Static42.aClass51_1.method2513(local1609);
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
		if (arg1.aClass157_2 != null) {
			if (arg1.aByte70 == (byte) (Static16.anInt398 & 0xFF)) {
				@Pc(1664) Class157 local1664 = arg1.aClass157_2;
				local406 = Static17.aClass33Array1[local12].method4057(local6, local9);
				if (local12 < Static32.anInt6037 - 1) {
					local408 = Static17.aClass33Array1[local12].method4057(local6, local9) - Static17.aClass33Array1[local12 + 1].method4057(local6, local9);
				} else {
					local408 = 1024;
				}
				Static382.aClass54_5.method4787(local21, local406, local27, arg0.anIntArray637);
				local1074 = arg0.anIntArray637[2];
				Static382.aClass54_5.method4787(local21, local406 - local408, local27, arg0.anIntArray637);
				local1078 = arg0.anIntArray637[2];
				local1333 = local1074;
				local706 = local1078;
				if (local1074 > local1078) {
					local1333 = local1078;
					local706 = local1074;
				}
				local1333 -= Static304.anInt2196;
				local706 += Static304.anInt2196;
				if (local1333 < local706 - 1597) {
					local1333 = local706 - 1597;
				}
				local1664.anInt4265 = local1333;
				local1664.anInt4264 = local706;
				local1664.aBoolean329 = true;
				Static315.aClass82_7.method4510(local1664);
			} else {
				arg1.aClass157_2 = null;
			}
		}
		if (!arg1.aBoolean465) {
			return;
		}
		if (arg1.aByte66 != 0) {
			return;
		}
		if (local6 <= Static33.anInt702 && local6 > Static218.anInt4049) {
			local86 = local31[local6 - 1][local9];
			if (local86 != null && local86.aBoolean465) {
				return;
			}
		}
		if (local6 >= Static33.anInt702 && local6 < Static263.anInt4660 - 1) {
			local86 = local31[local6 + 1][local9];
			if (local86 != null && local86.aBoolean465) {
				return;
			}
		}
		if (local9 <= Static345.anInt6083 && local9 > Static276.anInt4907) {
			local86 = local31[local6][local9 - 1];
			if (local86 != null && local86.aBoolean465) {
				return;
			}
		}
		if (local9 >= Static345.anInt6083 && local9 < Static376.anInt6609 - 1) {
			local86 = local31[local6][local9 + 1];
			if (local86 != null && local86.aBoolean465) {
				return;
			}
		}
		arg1.aBoolean465 = false;
		Static295.anInt5285--;
		@Pc(1866) Class12_Sub3 local1866 = arg1.aClass12_Sub3_1;
		if (local1866 != null && local1866.aBoolean122) {
			if (Static161.aBoolean216) {
				Static386.method1337(arg0, local12, local6, local9);
				Static315.aClass82_7.method4489(arg0.anInt5141, arg0.aClass2_Sub14_Sub1Array4);
			}
			@Pc(1889) Class22_Sub8 local1889 = local1866.method5451(Static315.aClass82_7);
			if (local1889 != null) {
				local1889.aClass12_1 = local1866;
				local1889.anInt6046 = local12;
				local1889.anInt6043 = local6;
				local1889.anInt6047 = local9;
				Static371.aClass56_7.method1253(local1889);
			}
		}
		if (arg1.aShort91 != 0) {
			@Pc(1913) Class12_Sub4 local1913 = arg1.aClass12_Sub4_3;
			if (local1913 != null && !Static274.method1029(local15, local6, local9, local1913.method5019())) {
				if ((local1913.anInt5723 & arg1.aShort91) != 0) {
					if (Static161.aBoolean216) {
						Static386.method1337(arg0, local12, local6, local9);
						Static315.aClass82_7.method4489(arg0.anInt5141, arg0.aClass2_Sub14_Sub1Array4);
					}
					local377 = local1913.method5451(Static315.aClass82_7);
					if (local377 != null) {
						local377.aClass12_1 = local1913;
						local377.anInt6046 = local12;
						local377.anInt6043 = local6;
						local377.anInt6047 = local9;
						Static371.aClass56_7.method1253(local377);
					}
				} else if (local1913.anInt5723 == 256) {
					local408 = local1913.anInt5727 - Static174.anInt6735;
					local1074 = local1913.anInt5721 - Static34.anInt736;
					local1078 = local1913.anInt5728;
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
					if (Static161.aBoolean216) {
						Static386.method1337(arg0, local12, local6, local9);
						Static315.aClass82_7.method4489(arg0.anInt5141, arg0.aClass2_Sub14_Sub1Array4);
					}
					@Pc(2023) Class12_Sub4 local2023 = arg1.aClass12_Sub4_2;
					@Pc(2031) Class22_Sub8 local2031;
					if (local706 > local1333) {
						local2031 = local1913.method5451(Static315.aClass82_7);
						if (local2031 != null) {
							local2031.aClass12_1 = local1913;
							local2031.anInt6046 = local12;
							local2031.anInt6043 = local6;
							local2031.anInt6047 = local9;
							Static371.aClass56_7.method1253(local2031);
						}
					} else if (local2023 != null) {
						local2031 = local2023.method5451(Static315.aClass82_7);
						if (local2031 != null) {
							local2031.aClass12_1 = local2023;
							local2031.anInt6046 = local12;
							local2031.anInt6043 = local6;
							local2031.anInt6047 = local9;
							Static371.aClass56_7.method1253(local2031);
						}
					}
				}
			}
			local1057 = arg1.aClass12_Sub2_2;
			local411 = arg1.aClass12_Sub2_3;
			@Pc(2116) Class22_Sub8 local2116;
			if (local411 != null && (local411.anInt1073 & arg1.aShort91) != 0 && !Static287.method4406(local15, local6, local9, local411.anInt1073)) {
				if (Static161.aBoolean216) {
					Static59.method1128(arg0, local411.anInt1073, local12, local6, local9);
					Static315.aClass82_7.method4489(arg0.anInt5141, arg0.aClass2_Sub14_Sub1Array4);
				}
				local2116 = local411.method5451(Static315.aClass82_7);
				if (local2116 != null) {
					local2116.aClass12_1 = local411;
					local2116.anInt6046 = local12;
					local2116.anInt6043 = local6;
					local2116.anInt6047 = local9;
					Static371.aClass56_7.method1253(local2116);
				}
			}
			if (local1057 != null && (local1057.anInt1073 & arg1.aShort91) != 0 && !Static287.method4406(local15, local6, local9, local1057.anInt1073)) {
				if (Static161.aBoolean216) {
					Static59.method1128(arg0, local1057.anInt1073, local12, local6, local9);
					Static315.aClass82_7.method4489(arg0.anInt5141, arg0.aClass2_Sub14_Sub1Array4);
				}
				local2116 = local1057.method5451(Static315.aClass82_7);
				if (local2116 != null) {
					local2116.aClass12_1 = local1057;
					local2116.anInt6046 = local12;
					local2116.anInt6043 = local6;
					local2116.anInt6047 = local9;
					Static371.aClass56_7.method1253(local2116);
				}
			}
		}
		@Pc(2202) Class227 local2202;
		if (local12 < Static32.anInt6037 - 1) {
			local2202 = Static297.aClass227ArrayArrayArray7[local12 + 1][local6][local9];
			if (local2202 != null && local2202.aBoolean465) {
				Static42.aClass51_1.method2508(local2202);
			}
		}
		if (local6 < Static33.anInt702) {
			local2202 = local31[local6 + 1][local9];
			if (local2202 != null && local2202.aBoolean465) {
				Static42.aClass51_1.method2513(local2202);
			}
		}
		if (local9 < Static345.anInt6083) {
			local2202 = local31[local6][local9 + 1];
			if (local2202 != null && local2202.aBoolean465) {
				Static42.aClass51_1.method2513(local2202);
			}
		}
		if (local6 > Static33.anInt702) {
			local2202 = local31[local6 - 1][local9];
			if (local2202 != null && local2202.aBoolean465) {
				Static42.aClass51_1.method2513(local2202);
			}
		}
		if (local9 > Static345.anInt6083) {
			local2202 = local31[local6][local9 - 1];
			if (local2202 != null && local2202.aBoolean465) {
				Static42.aClass51_1.method2513(local2202);
			}
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IZ)V")
	public static void method5082(@OriginalArg(1) boolean arg0) {
		if (arg0 && Static302.aClass2_Sub1_Sub17_2 != null) {
			anInt5810 = Static302.aClass2_Sub1_Sub17_2.anInt6753;
		} else {
			anInt5810 = -1;
		}
		Static74.anInt4012 = 0;
		Static100.aClass210_16 = null;
		Static302.aClass2_Sub1_Sub17_2 = null;
		Static360.aClass155_37 = null;
		Static302.method482();
		Static302.aClass210_4.method5043();
		Static384.aClass5_17 = null;
		Static76.anInt1481 = -1;
		Static13.aClass176_1 = null;
		Static170.aClass176_7 = null;
		Static302.aClass159_2 = null;
		Static386.aClass176_3 = null;
		Static172.aClass176_8 = null;
		Static135.aClass176_5 = null;
		Static155.aClass176_6 = null;
		Static369.aClass176_9 = null;
		Static118.aClass176_4 = null;
		Static203.anInt3731 = -1;
		Static302.aClass211_2.method5047();
		Static302.aClass181_2.method4321(64, 64);
		Static302.aClass211_2.method5054(128, 64);
		Static302.aClass123_3.method2704(64);
		Static130.aClass162_1.method3879(64);
	}
}
