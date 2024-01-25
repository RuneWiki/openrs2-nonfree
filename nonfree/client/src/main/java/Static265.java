import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_147 = new Class88("M", "M", "M", "M");

	@OriginalMember(owner = "client!ku", name = "c", descriptor = "Lclient!ml;")
	public static final Class202 aClass202_27 = new Class202(6, 4);

	@OriginalMember(owner = "client!ku", name = "d", descriptor = "I")
	public static int anInt5303 = -1;

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method4439(@OriginalArg(1) int arg0) {
		@Pc(18) byte[] local18;
		if (arg0 == 100 && Static398.anInt7494 > 0) {
			local18 = Static524.aByteArrayArray13[--Static398.anInt7494];
			Static524.aByteArrayArray13[Static398.anInt7494] = null;
			return local18;
		} else if (arg0 == 5000 && Static531.anInt9500 > 0) {
			local18 = Static215.aByteArrayArray8[--Static531.anInt9500];
			Static215.aByteArrayArray8[Static531.anInt9500] = null;
			return local18;
		} else if (arg0 == 30000 && Static79.anInt1879 > 0) {
			local18 = Static52.aByteArrayArray3[--Static79.anInt1879];
			Static52.aByteArrayArray3[Static79.anInt1879] = null;
			return local18;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lclient!vs;Lclient!bo;)V")
	public static void method4440(@OriginalArg(0) Class253 arg0, @OriginalArg(1) Class37 arg1) {
		if (!arg1.aBoolean47) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort30;
		@Pc(9) short local9 = arg1.aShort31;
		@Pc(12) byte local12 = arg1.aByte22;
		@Pc(15) byte local15 = arg1.aByte23;
		@Pc(21) int local21 = (local6 << Static193.anInt4311) + Static225.anInt4810;
		@Pc(27) int local27 = (local9 << Static193.anInt4311) + Static225.anInt4810;
		@Pc(31) Class37[][] local31 = Static120.aClass37ArrayArrayArray1[local12];
		@Pc(53) float local53;
		if (Static67.aClass215Array2 == Static51.aClass215Array6) {
			Static286.aClass42_5.JA(Static155.aClass215Array5[0].aa(local21, local27), Static340.method5414(local6, local9), Static51.method7361(local6, local9), Static143.method2853(local6, local9));
			local53 = 251.5F;
		} else {
			local53 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static286.aClass42_5.la(3000.0F, local53 * 1.5F);
		@Pc(86) Class37 local86;
		@Pc(616) Class7_Sub8 local616;
		@Pc(711) int local711;
		@Pc(714) int local714;
		@Pc(723) int local723;
		@Pc(735) int local735;
		@Pc(406) int local406;
		@Pc(330) boolean local330;
		@Pc(377) Class7_Sub8 local377;
		@Pc(408) int local408;
		@Pc(411) Class30_Sub2 local411;
		@Pc(706) int local706;
		if (arg1.aBoolean48) {
			if (Static182.aBoolean338) {
				if (local12 > 0) {
					local86 = Static120.aClass37ArrayArrayArray1[local12 - 1][local6][local9];
					if (local86 != null && local86.aBoolean47) {
						return;
					}
				}
				if (local6 <= Static176.anInt3987 && local6 > Static355.anInt6649) {
					local86 = local31[local6 - 1][local9];
					if (local86 != null && local86.aBoolean47 && (local86.aBoolean48 || (arg1.aByte27 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static176.anInt3987 && local6 < Static59.anInt1440 - 1) {
					local86 = local31[local6 + 1][local9];
					if (local86 != null && local86.aBoolean47 && (local86.aBoolean48 || (arg1.aByte27 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static412.anInt7717 && local9 > Static415.anInt3796) {
					local86 = local31[local6][local9 - 1];
					if (local86 != null && local86.aBoolean47 && (local86.aBoolean48 || (arg1.aByte27 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static412.anInt7717 && local9 < Static369.anInt6844 - 1) {
					local86 = local31[local6][local9 + 1];
					if (local86 != null && local86.aBoolean47 && (local86.aBoolean48 || (arg1.aByte27 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static182.aBoolean338 = true;
			}
			arg1.aBoolean48 = false;
			if (arg1.aClass37_1 != null) {
				local86 = arg1.aClass37_1;
				Static286.aClass42_5.la(3000.0F, (201.5F - (float) (local86.aByte23 + 1) * 50.0F) * 1.5F);
				if (!Static214.method3975(local86.aByte23, local6, local9)) {
					Static51.aClass215Array6[local86.aByte23].method7837(local6, local9);
				}
				@Pc(249) Class30_Sub2 local249 = local86.aClass30_Sub2_2;
				if (local249 != null) {
					if (Static205.aBoolean359) {
						if ((local249.anInt9038 & arg1.aShort32) == 0) {
							Static102.method2108(arg0, local12, local6, local9);
						} else {
							Static56.method1419(arg0, local249.anInt9038, local15, local6, local9);
						}
						Static286.aClass42_5.method5824(arg0.anInt7556, arg0.aClass12_Sub7Array6);
					}
					local249.method7908(Static286.aClass42_5);
				}
				for (@Pc(286) Class243 local286 = local86.aClass243_3; local286 != null; local286 = local286.aClass243_11) {
					@Pc(290) Class30_Sub1 local290 = local286.aClass30_Sub1_2;
					if (local290 != null) {
						if (Static205.aBoolean359) {
							Static102.method2108(arg0, local12, local6, local9);
							Static286.aClass42_5.method5824(arg0.anInt7556, arg0.aClass12_Sub7Array6);
						}
						local290.method7908(Static286.aClass42_5);
					}
				}
				Static286.aClass42_5.la(3000.0F, local53 * 1.5F);
			}
			local330 = !Static214.method3975(local15, local6, local9);
			if (local330) {
				Static51.aClass215Array6[local15].method7837(local6, local9);
				@Pc(341) Class30_Sub3 local341 = arg1.aClass30_Sub3_1;
				if (local341 != null && local341.aBoolean631) {
					if (local341.aBoolean630) {
						Static286.aClass42_5.la(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static205.aBoolean359) {
						Static102.method2108(arg0, local12, local6, local9);
						Static286.aClass42_5.method5824(arg0.anInt7556, arg0.aClass12_Sub7Array6);
					}
					local377 = local341.method7908(Static286.aClass42_5);
					if (local377 != null) {
						local377.aClass30_1 = local341;
						local377.anInt9366 = local12;
						local377.anInt9370 = local6;
						local377.anInt9368 = local9;
						Static246.aClass149_3.method3984(local377);
					}
					if (local341.aBoolean630) {
						Static286.aClass42_5.la(3000.0F, local53 * 1.5F);
					}
				}
			}
			local406 = 0;
			local408 = 0;
			local411 = arg1.aClass30_Sub2_2;
			@Pc(414) Class30_Sub4 local414 = arg1.aClass30_Sub4_2;
			if (local411 != null || local414 != null) {
				if (Static176.anInt3987 == local6) {
					local406++;
				} else if (Static176.anInt3987 < local6) {
					local406 += 2;
				}
				if (Static412.anInt7717 == local9) {
					local406 += 3;
				} else if (Static412.anInt7717 > local9) {
					local406 += 6;
				}
				local408 = Static47.anIntArray123[local406];
				arg1.aShort32 = Static476.aShortArray37[local406];
			}
			if (local411 != null) {
				if ((local411.anInt9038 & Static16.anIntArray21[local406]) == 0) {
					arg1.aByte26 = 0;
				} else if (local411.anInt9038 == 16) {
					arg1.aByte26 = 3;
					arg1.aByte25 = Static419.aByteArray97[local406];
					arg1.aByte28 = (byte) (3 - arg1.aByte25);
				} else if (local411.anInt9038 == 32) {
					arg1.aByte26 = 6;
					arg1.aByte25 = Static328.aByteArray83[local406];
					arg1.aByte28 = (byte) (6 - arg1.aByte25);
				} else if (local411.anInt9038 == 64) {
					arg1.aByte26 = 12;
					arg1.aByte25 = Static40.aByteArray18[local406];
					arg1.aByte28 = (byte) (12 - arg1.aByte25);
				} else {
					arg1.aByte26 = 9;
					arg1.aByte25 = Static387.aByteArray91[local406];
					arg1.aByte28 = (byte) (9 - arg1.aByte25);
				}
				if ((local411.anInt9038 & local408) != 0 && !Static407.method6375(local15, local6, local9, local411.anInt9038)) {
					if (Static205.aBoolean359) {
						Static102.method2108(arg0, local12, local6, local9);
						Static286.aClass42_5.method5824(arg0.anInt7556, arg0.aClass12_Sub7Array6);
					}
					@Pc(563) Class7_Sub8 local563 = local411.method7908(Static286.aClass42_5);
					if (local563 != null) {
						local563.aClass30_1 = local411;
						local563.anInt9366 = local12;
						local563.anInt9370 = local6;
						local563.anInt9368 = local9;
						Static246.aClass149_3.method3984(local563);
					}
				}
				@Pc(584) Class30_Sub2 local584 = arg1.aClass30_Sub2_1;
				if (local584 != null && (local584.anInt9038 & local408) != 0 && !Static407.method6375(local15, local6, local9, local584.anInt9038)) {
					if (Static205.aBoolean359) {
						Static102.method2108(arg0, local12, local6, local9);
						Static286.aClass42_5.method5824(arg0.anInt7556, arg0.aClass12_Sub7Array6);
					}
					local616 = local584.method7908(Static286.aClass42_5);
					if (local616 != null) {
						local616.aClass30_1 = local584;
						local616.anInt9366 = local12;
						local616.anInt9370 = local6;
						local616.anInt9368 = local9;
						Static246.aClass149_3.method3984(local616);
					}
				}
			}
			if (local414 != null && !Static378.method6007(local15, local6, local9, local414.method7910())) {
				@Pc(647) Class30_Sub4 local647 = arg1.aClass30_Sub4_1;
				Static286.aClass42_5.la(3000.0F, (local53 - 0.5F) * 1.5F);
				if ((local414.anInt9547 & local408) != 0) {
					if (Static205.aBoolean359) {
						Static102.method2108(arg0, local12, local6, local9);
						Static286.aClass42_5.method5824(arg0.anInt7556, arg0.aClass12_Sub7Array6);
					}
					local616 = local414.method7908(Static286.aClass42_5);
					if (local616 != null) {
						local616.aClass30_1 = local414;
						local616.anInt9366 = local12;
						local616.anInt9370 = local6;
						local616.anInt9368 = local9;
						Static246.aClass149_3.method3984(local616);
					}
				} else if (local414.anInt9547 == 256) {
					local706 = local414.anInt9546 - Static432.anInt7994;
					local711 = local414.anInt9550 - Static87.anInt2071;
					local714 = local414.anInt9549;
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
					if (Static205.aBoolean359) {
						Static102.method2108(arg0, local12, local6, local9);
						Static286.aClass42_5.method5824(arg0.anInt7556, arg0.aClass12_Sub7Array6);
					}
					@Pc(759) Class7_Sub8 local759;
					if (local735 < local723) {
						local759 = local414.method7908(Static286.aClass42_5);
						if (local759 != null) {
							local759.aClass30_1 = local414;
							local759.anInt9366 = local12;
							local759.anInt9370 = local6;
							local759.anInt9368 = local9;
							Static246.aClass149_3.method3984(local759);
						}
					} else if (local647 != null) {
						local759 = local647.method7908(Static286.aClass42_5);
						if (local759 != null) {
							local759.aClass30_1 = local647;
							local759.anInt9366 = local12;
							local759.anInt9370 = local6;
							local759.anInt9368 = local9;
							Static246.aClass149_3.method3984(local759);
						}
					}
				}
				Static286.aClass42_5.la(3000.0F, local53 * 1.5F);
			}
			if (local330) {
				@Pc(814) Class30_Sub3 local814 = arg1.aClass30_Sub3_1;
				if (local814 != null && !local814.aBoolean631) {
					if (local814.aBoolean630) {
						Static286.aClass42_5.la(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static205.aBoolean359) {
						Static102.method2108(arg0, local12, local6, local9);
						Static286.aClass42_5.method5824(arg0.anInt7556, arg0.aClass12_Sub7Array6);
					}
					local616 = local814.method7908(Static286.aClass42_5);
					if (local616 != null) {
						local616.aClass30_1 = local814;
						local616.anInt9366 = local12;
						local616.anInt9370 = local6;
						local616.anInt9368 = local9;
						Static246.aClass149_3.method3984(local616);
					}
					if (local814.aBoolean630) {
						Static286.aClass42_5.la(3000.0F, local53 * 1.5F);
					}
				}
				@Pc(880) Class30_Sub5 local880 = arg1.aClass30_Sub5_1;
				if (local880 != null && !local880.aBoolean428) {
					if (Static205.aBoolean359) {
						Static102.method2108(arg0, local12, local6, local9);
						Static286.aClass42_5.method5824(arg0.anInt7556, arg0.aClass12_Sub7Array6);
					}
					@Pc(903) Class7_Sub8 local903 = local880.method7908(Static286.aClass42_5);
					if (local903 != null) {
						local903.aClass30_1 = local880;
						local903.anInt9366 = local12;
						local903.anInt9370 = local6;
						local903.anInt9368 = local9;
						Static246.aClass149_3.method3984(local903);
					}
				}
			}
			@Pc(924) byte local924 = arg1.aByte27;
			if (local924 != 0) {
				@Pc(941) Class37 local941;
				if (local6 < Static176.anInt3987 && (local924 & 0x4) != 0) {
					local941 = local31[local6 + 1][local9];
					if (local941 != null && local941.aBoolean47) {
						Static308.aClass126_1.method7347(local941);
					}
				}
				if (local9 < Static412.anInt7717 && (local924 & 0x2) != 0) {
					local941 = local31[local6][local9 + 1];
					if (local941 != null && local941.aBoolean47) {
						Static308.aClass126_1.method7347(local941);
					}
				}
				if (local6 > Static176.anInt3987 && (local924 & 0x1) != 0) {
					local941 = local31[local6 - 1][local9];
					if (local941 != null && local941.aBoolean47) {
						Static308.aClass126_1.method7347(local941);
					}
				}
				if (local9 > Static412.anInt7717 && (local924 & 0x8) != 0) {
					local941 = local31[local6][local9 - 1];
					if (local941 != null && local941.aBoolean47) {
						Static308.aClass126_1.method7347(local941);
					}
				}
			}
		}
		@Pc(1074) int local1074;
		@Pc(1057) Class30_Sub2 local1057;
		@Pc(1078) int local1078;
		@Pc(1030) Class243 local1030;
		if (arg1.aByte26 != 0) {
			local330 = true;
			for (local1030 = arg1.aClass243_3; local1030 != null; local1030 = local1030.aClass243_11) {
				if (local1030.aClass30_Sub1_2.anInt9419 != Static69.anInt9137 && (local1030.anInt7259 & arg1.aByte26) == arg1.aByte25) {
					local330 = false;
					break;
				}
			}
			if (local330) {
				local1057 = arg1.aClass30_Sub2_2;
				if (!Static407.method6375(local15, local6, local9, local1057.anInt9038)) {
					if (Static205.aBoolean359) {
						label682: {
							if (local1057.anInt9038 >= 16) {
								local1074 = local6 - Static176.anInt3987;
								local1078 = local9 - Static412.anInt7717;
								if (local1057.anInt9038 == 16) {
									local1074 -= Static225.anInt4810;
									local1078 += Static225.anInt4810;
									if (local1078 < local1074 && local6 > 0 && local9 <= Static509.anInt9164) {
										Static102.method2108(arg0, local12, local6 - 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt9038 == 32) {
									local1074 += Static225.anInt4810;
									local1078 += Static225.anInt4810;
									if (local1078 < -local1074 && local6 < Static537.anInt9566 && local9 < Static509.anInt9164) {
										Static102.method2108(arg0, local12, local6 + 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt9038 == 64) {
									local1074 += Static225.anInt4810;
									local1078 -= Static225.anInt4810;
									if (local1078 > local1074 && local6 < Static537.anInt9566 && local9 > 0) {
										Static102.method2108(arg0, local12, local6 + 1, local9 - 1);
										break label682;
									}
								} else if (local1057.anInt9038 == 128) {
									local1074 -= Static225.anInt4810;
									local1078 -= Static225.anInt4810;
									if (local1078 > -local1074 && local6 > 0 && local9 > 0) {
										Static102.method2108(arg0, local12, local6 - 1, local9 - 1);
										break label682;
									}
								}
							}
							Static102.method2108(arg0, local12, local6, local9);
						}
						Static286.aClass42_5.method5824(arg0.anInt7556, arg0.aClass12_Sub7Array6);
					}
					@Pc(1216) Class7_Sub8 local1216 = local1057.method7908(Static286.aClass42_5);
					if (local1216 != null) {
						local1216.aClass30_1 = local1057;
						local1216.anInt9366 = local12;
						local1216.anInt9370 = local6;
						local1216.anInt9368 = local9;
						Static246.aClass149_3.method3984(local1216);
					}
				}
				arg1.aByte26 = 0;
			}
		}
		@Pc(1333) int local1333;
		if (arg1.aBoolean49) {
			try {
				arg1.aBoolean49 = false;
				@Pc(1245) int local1245 = 0;
				label625: for (local1030 = arg1.aClass243_3; local1030 != null; local1030 = local1030.aClass243_11) {
					@Pc(1252) Class30_Sub1 local1252 = local1030.aClass30_Sub1_2;
					if (local1252.anInt9419 != Static69.anInt9137) {
						for (local1074 = local1252.aShort115; local1074 <= local1252.aShort113; local1074++) {
							for (local1078 = local1252.aShort112; local1078 <= local1252.aShort114; local1078++) {
								@Pc(1270) Class37 local1270 = local31[local1074][local1078];
								if (local1270.aBoolean48) {
									arg1.aBoolean49 = true;
									continue label625;
								}
								if (local1270.aByte26 != 0) {
									local706 = 0;
									if (local1074 > local1252.aShort115) {
										local706++;
									}
									if (local1074 < local1252.aShort113) {
										local706 += 4;
									}
									if (local1078 > local1252.aShort112) {
										local706 += 8;
									}
									if (local1078 < local1252.aShort114) {
										local706 += 2;
									}
									if ((local706 & local1270.aByte26) == arg1.aByte28) {
										arg1.aBoolean49 = true;
										continue label625;
									}
								}
							}
						}
						local1078 = Static176.anInt3987 - local1252.aShort115;
						local1333 = local1252.aShort113 - Static176.anInt3987;
						if (local1333 > local1078) {
							local1078 = local1333;
						}
						local706 = Static412.anInt7717 - local1252.aShort112;
						local711 = local1252.aShort114 - Static412.anInt7717;
						if (local711 > local706) {
							local706 = local711;
						}
						arg0.aClass30_Sub1Array3[local1245] = local1252;
						arg0.anIntArray507[local1245++] = local1078 + local706;
					}
				}
				while (local1245 > 0) {
					local408 = -50;
					local1074 = -1;
					@Pc(1384) Class30_Sub1 local1384;
					for (local1078 = 0; local1078 < local1245; local1078++) {
						local1384 = arg0.aClass30_Sub1Array3[local1078];
						if (local1384.anInt9419 != Static69.anInt9137) {
							local706 = arg0.anIntArray507[local1078];
							if (local706 > local408) {
								local408 = local706;
								local1074 = local1078;
							} else if (local706 == local408) {
								local711 = local1384.anInt9418 - Static432.anInt7994;
								local714 = local1384.anInt9416 - Static87.anInt2071;
								local723 = arg0.aClass30_Sub1Array3[local1074].anInt9418 - Static432.anInt7994;
								local735 = arg0.aClass30_Sub1Array3[local1074].anInt9416 - Static87.anInt2071;
								if (local711 * local711 + local714 * local714 > local723 * local723 + local735 * local735) {
									local1074 = local1078;
								}
							}
						}
					}
					if (local1074 == -1) {
						break;
					}
					local1384 = arg0.aClass30_Sub1Array3[local1074];
					local1384.anInt9419 = Static69.anInt9137;
					if (!Static454.method6860(local15, local1384.aShort115, local1384.aShort113, local1384.aShort112, local1384.aShort114, local1384.method7815())) {
						if (Static205.aBoolean359) {
							if (local1384.aByte100 == 0) {
								Static493.method7336(arg0, local12, local1384.aShort115, local1384.aShort112, local1384.aShort113, local1384.aShort114);
							} else {
								Static102.method2108(arg0, local12, local6, local9);
								local706 = local6 - Static176.anInt3987;
								local711 = local9 - Static412.anInt7717;
								if (local1384.aByte100 == 2) {
									if (local711 > -local706) {
										Static392.method6188(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static392.method6188(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local711 > local706) {
									Static392.method6188(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static392.method6188(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static286.aClass42_5.method5824(arg0.anInt7556, arg0.aClass12_Sub7Array6);
						}
						local616 = local1384.method7908(Static286.aClass42_5);
						if (local616 != null) {
							local616.aClass30_1 = local1384;
							local616.anInt9366 = local12;
							local616.anInt9370 = local1384.aShort115;
							local616.anInt9368 = local1384.aShort112;
							Static246.aClass149_3.method3984(local616);
						}
					}
					for (local706 = local1384.aShort115; local706 <= local1384.aShort113; local706++) {
						for (local711 = local1384.aShort112; local711 <= local1384.aShort114; local711++) {
							@Pc(1609) Class37 local1609 = local31[local706][local711];
							if (local1609.aByte26 != 0) {
								Static308.aClass126_1.method7347(local1609);
							} else if ((local706 != local6 || local711 != local9) && local1609.aBoolean47) {
								Static308.aClass126_1.method7347(local1609);
							}
						}
					}
				}
				if (arg1.aBoolean49) {
					return;
				}
			} catch (@Pc(1647) Exception local1647) {
				arg1.aBoolean49 = false;
			}
		}
		if (arg1.aClass136_1 != null && arg1.aByte24 == (byte) (Static321.anInt6065 & 0xFF)) {
			@Pc(1664) Class136 local1664 = arg1.aClass136_1;
			local406 = Static51.aClass215Array6[local12].ba(local6, local9);
			if (local12 < Static36.anInt8450 - 1) {
				local408 = Static51.aClass215Array6[local12].ba(local6, local9) - Static51.aClass215Array6[local12 + 1].ba(local6, local9);
			} else {
				local408 = 0x8 << Static193.anInt4311;
			}
			Static71.aClass91_3.method7049(local21, local406, local27, arg0.anIntArray506);
			local1074 = arg0.anIntArray506[2];
			Static71.aClass91_3.method7049(local21, local406 - local408, local27, arg0.anIntArray506);
			local1078 = arg0.anIntArray506[2];
			local1333 = local1074;
			local706 = local1078;
			if (local1074 > local1078) {
				local1333 = local1078;
				local706 = local1074;
			}
			local1333 -= Static429.anInt7946;
			local706 += Static429.anInt7946;
			local1664.anInt4294 = local1333;
			local1664.anInt4293 = local706;
			local1664.aBoolean340 = true;
			Static286.aClass42_5.method5856(local1664);
		}
		if (!arg1.aBoolean47) {
			return;
		}
		if (arg1.aByte26 != 0) {
			return;
		}
		if (local6 <= Static176.anInt3987 && local6 > Static355.anInt6649) {
			local86 = local31[local6 - 1][local9];
			if (local86 != null && local86.aBoolean47) {
				return;
			}
		}
		if (local6 >= Static176.anInt3987 && local6 < Static59.anInt1440 - 1) {
			local86 = local31[local6 + 1][local9];
			if (local86 != null && local86.aBoolean47) {
				return;
			}
		}
		if (local9 <= Static412.anInt7717 && local9 > Static415.anInt3796) {
			local86 = local31[local6][local9 - 1];
			if (local86 != null && local86.aBoolean47) {
				return;
			}
		}
		if (local9 >= Static412.anInt7717 && local9 < Static369.anInt6844 - 1) {
			local86 = local31[local6][local9 + 1];
			if (local86 != null && local86.aBoolean47) {
				return;
			}
		}
		arg1.aBoolean47 = false;
		Static96.anInt2250--;
		@Pc(1855) Class30_Sub5 local1855 = arg1.aClass30_Sub5_1;
		if (local1855 != null && local1855.aBoolean428) {
			if (Static205.aBoolean359) {
				Static102.method2108(arg0, local12, local6, local9);
				Static286.aClass42_5.method5824(arg0.anInt7556, arg0.aClass12_Sub7Array6);
			}
			@Pc(1878) Class7_Sub8 local1878 = local1855.method7908(Static286.aClass42_5);
			if (local1878 != null) {
				local1878.aClass30_1 = local1855;
				local1878.anInt9366 = local12;
				local1878.anInt9370 = local6;
				local1878.anInt9368 = local9;
				Static246.aClass149_3.method3984(local1878);
			}
		}
		if (arg1.aShort32 != 0) {
			@Pc(1902) Class30_Sub4 local1902 = arg1.aClass30_Sub4_2;
			if (local1902 != null && !Static378.method6007(local15, local6, local9, local1902.method7910())) {
				if ((local1902.anInt9547 & arg1.aShort32) != 0) {
					if (Static205.aBoolean359) {
						Static102.method2108(arg0, local12, local6, local9);
						Static286.aClass42_5.method5824(arg0.anInt7556, arg0.aClass12_Sub7Array6);
					}
					local377 = local1902.method7908(Static286.aClass42_5);
					if (local377 != null) {
						local377.aClass30_1 = local1902;
						local377.anInt9366 = local12;
						local377.anInt9370 = local6;
						local377.anInt9368 = local9;
						Static246.aClass149_3.method3984(local377);
					}
				} else if (local1902.anInt9547 == 256) {
					local408 = local1902.anInt9546 - Static432.anInt7994;
					local1074 = local1902.anInt9550 - Static87.anInt2071;
					local1078 = local1902.anInt9549;
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
					if (Static205.aBoolean359) {
						Static102.method2108(arg0, local12, local6, local9);
						Static286.aClass42_5.method5824(arg0.anInt7556, arg0.aClass12_Sub7Array6);
					}
					@Pc(2012) Class30_Sub4 local2012 = arg1.aClass30_Sub4_1;
					@Pc(2020) Class7_Sub8 local2020;
					if (local706 > local1333) {
						local2020 = local1902.method7908(Static286.aClass42_5);
						if (local2020 != null) {
							local2020.aClass30_1 = local1902;
							local2020.anInt9366 = local12;
							local2020.anInt9370 = local6;
							local2020.anInt9368 = local9;
							Static246.aClass149_3.method3984(local2020);
						}
					} else if (local2012 != null) {
						local2020 = local2012.method7908(Static286.aClass42_5);
						if (local2020 != null) {
							local2020.aClass30_1 = local2012;
							local2020.anInt9366 = local12;
							local2020.anInt9370 = local6;
							local2020.anInt9368 = local9;
							Static246.aClass149_3.method3984(local2020);
						}
					}
				}
			}
			local1057 = arg1.aClass30_Sub2_2;
			local411 = arg1.aClass30_Sub2_1;
			@Pc(2105) Class7_Sub8 local2105;
			if (local411 != null && (local411.anInt9038 & arg1.aShort32) != 0 && !Static407.method6375(local15, local6, local9, local411.anInt9038)) {
				if (Static205.aBoolean359) {
					Static56.method1419(arg0, local411.anInt9038, local12, local6, local9);
					Static286.aClass42_5.method5824(arg0.anInt7556, arg0.aClass12_Sub7Array6);
				}
				local2105 = local411.method7908(Static286.aClass42_5);
				if (local2105 != null) {
					local2105.aClass30_1 = local411;
					local2105.anInt9366 = local12;
					local2105.anInt9370 = local6;
					local2105.anInt9368 = local9;
					Static246.aClass149_3.method3984(local2105);
				}
			}
			if (local1057 != null && (local1057.anInt9038 & arg1.aShort32) != 0 && !Static407.method6375(local15, local6, local9, local1057.anInt9038)) {
				if (Static205.aBoolean359) {
					Static56.method1419(arg0, local1057.anInt9038, local12, local6, local9);
					Static286.aClass42_5.method5824(arg0.anInt7556, arg0.aClass12_Sub7Array6);
				}
				local2105 = local1057.method7908(Static286.aClass42_5);
				if (local2105 != null) {
					local2105.aClass30_1 = local1057;
					local2105.anInt9366 = local12;
					local2105.anInt9370 = local6;
					local2105.anInt9368 = local9;
					Static246.aClass149_3.method3984(local2105);
				}
			}
		}
		@Pc(2191) Class37 local2191;
		if (local12 < Static36.anInt8450 - 1) {
			local2191 = Static120.aClass37ArrayArrayArray1[local12 + 1][local6][local9];
			if (local2191 != null && local2191.aBoolean47) {
				Static308.aClass126_1.method7343(local2191);
			}
		}
		if (local6 < Static176.anInt3987) {
			local2191 = local31[local6 + 1][local9];
			if (local2191 != null && local2191.aBoolean47) {
				Static308.aClass126_1.method7347(local2191);
			}
		}
		if (local9 < Static412.anInt7717) {
			local2191 = local31[local6][local9 + 1];
			if (local2191 != null && local2191.aBoolean47) {
				Static308.aClass126_1.method7347(local2191);
			}
		}
		if (local6 > Static176.anInt3987) {
			local2191 = local31[local6 - 1][local9];
			if (local2191 != null && local2191.aBoolean47) {
				Static308.aClass126_1.method7347(local2191);
			}
		}
		if (local9 > Static412.anInt7717) {
			local2191 = local31[local6][local9 - 1];
			if (local2191 != null && local2191.aBoolean47) {
				Static308.aClass126_1.method7347(local2191);
			}
		}
	}
}
