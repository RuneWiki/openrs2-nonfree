import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!nc", name = "B", descriptor = "[I")
	public static int[] anIntArray467;

	@OriginalMember(owner = "client!nc", name = "D", descriptor = "I")
	public static int anInt6228;

	@OriginalMember(owner = "client!nc", name = "w", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_154 = new Class150(98, 3);

	@OriginalMember(owner = "client!nc", name = "z", descriptor = "[Z")
	public static final boolean[] aBooleanArray22 = new boolean[100];

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!jba;Lclient!br;)V")
	public static void method5178(@OriginalArg(0) Class154 arg0, @OriginalArg(1) Class37 arg1) {
		if (!arg1.aBoolean58) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort32;
		@Pc(9) short local9 = arg1.aShort30;
		@Pc(12) byte local12 = arg1.aByte22;
		@Pc(15) byte local15 = arg1.aByte26;
		@Pc(21) int local21 = (local6 << Static270.anInt5288) + Static261.anInt5167;
		@Pc(27) int local27 = (local9 << Static270.anInt5288) + Static261.anInt5167;
		@Pc(31) Class37[][] local31 = Static152.aClass37ArrayArrayArray1[local12];
		@Pc(53) float local53;
		if (Static511.aClass131Array6 == Static248.aClass131Array4) {
			Static60.aClass62_37.JA(Static493.aClass131Array5[0].aa(local21, local27), Static112.method2226(local6, local9), Static180.method3076(local6, local9), Static19.method6151(local6, local9));
			local53 = 251.5F;
		} else {
			local53 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static60.aClass62_37.la(3000.0F, local53 * 1.5F);
		@Pc(86) Class37 local86;
		@Pc(616) Class30_Sub1 local616;
		@Pc(711) int local711;
		@Pc(714) int local714;
		@Pc(723) int local723;
		@Pc(735) int local735;
		@Pc(406) int local406;
		@Pc(330) boolean local330;
		@Pc(377) Class30_Sub1 local377;
		@Pc(408) int local408;
		@Pc(411) Class15_Sub3 local411;
		@Pc(706) int local706;
		if (arg1.aBoolean57) {
			if (Static539.aBoolean659) {
				if (local12 > 0) {
					local86 = Static152.aClass37ArrayArrayArray1[local12 - 1][local6][local9];
					if (local86 != null && local86.aBoolean58) {
						return;
					}
				}
				if (local6 <= Static489.anInt8410 && local6 > Static45.anInt1000) {
					local86 = local31[local6 - 1][local9];
					if (local86 != null && local86.aBoolean58 && (local86.aBoolean57 || (arg1.aByte27 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static489.anInt8410 && local6 < Static546.anInt9152 - 1) {
					local86 = local31[local6 + 1][local9];
					if (local86 != null && local86.aBoolean58 && (local86.aBoolean57 || (arg1.aByte27 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static461.anInt7924 && local9 > Static226.anInt5120) {
					local86 = local31[local6][local9 - 1];
					if (local86 != null && local86.aBoolean58 && (local86.aBoolean57 || (arg1.aByte27 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static461.anInt7924 && local9 < Static243.anInt4911 - 1) {
					local86 = local31[local6][local9 + 1];
					if (local86 != null && local86.aBoolean58 && (local86.aBoolean57 || (arg1.aByte27 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static539.aBoolean659 = true;
			}
			arg1.aBoolean57 = false;
			if (arg1.aClass37_1 != null) {
				local86 = arg1.aClass37_1;
				Static60.aClass62_37.la(3000.0F, (201.5F - (float) (local86.aByte26 + 1) * 50.0F) * 1.5F);
				if (!Static523.method7168(local86.aByte26, local6, local9)) {
					Static248.aClass131Array4[local86.aByte26].method7183(local6, local9);
				}
				@Pc(249) Class15_Sub3 local249 = local86.aClass15_Sub3_3;
				if (local249 != null) {
					if (Static537.aBoolean655) {
						if ((local249.anInt6141 & arg1.aShort31) == 0) {
							Static223.method3542(arg0, local12, local6, local9);
						} else {
							Static58.method1164(arg0, local249.anInt6141, local15, local6, local9);
						}
						Static60.aClass62_37.method7059(arg0.anInt5117, arg0.aClass5_Sub10Array5);
					}
					local249.method6858(Static60.aClass62_37);
				}
				for (@Pc(286) Class108 local286 = local86.aClass108_1; local286 != null; local286 = local286.aClass108_3) {
					@Pc(290) Class15_Sub2 local290 = local286.aClass15_Sub2_1;
					if (local290 != null) {
						if (Static537.aBoolean655) {
							Static223.method3542(arg0, local12, local6, local9);
							Static60.aClass62_37.method7059(arg0.anInt5117, arg0.aClass5_Sub10Array5);
						}
						local290.method6858(Static60.aClass62_37);
					}
				}
				Static60.aClass62_37.la(3000.0F, local53 * 1.5F);
			}
			local330 = !Static523.method7168(local15, local6, local9);
			if (local330) {
				Static248.aClass131Array4[local15].method7183(local6, local9);
				@Pc(341) Class15_Sub5 local341 = arg1.aClass15_Sub5_1;
				if (local341 != null && local341.aBoolean609) {
					if (local341.aBoolean608) {
						Static60.aClass62_37.la(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static537.aBoolean655) {
						Static223.method3542(arg0, local12, local6, local9);
						Static60.aClass62_37.method7059(arg0.anInt5117, arg0.aClass5_Sub10Array5);
					}
					local377 = local341.method6858(Static60.aClass62_37);
					if (local377 != null) {
						local377.aClass15_1 = local341;
						local377.anInt915 = local12;
						local377.anInt913 = local6;
						local377.anInt916 = local9;
						Static541.aClass77_13.method2165(local377);
					}
					if (local341.aBoolean608) {
						Static60.aClass62_37.la(3000.0F, local53 * 1.5F);
					}
				}
			}
			local406 = 0;
			local408 = 0;
			local411 = arg1.aClass15_Sub3_3;
			@Pc(414) Class15_Sub1 local414 = arg1.aClass15_Sub1_3;
			if (local411 != null || local414 != null) {
				if (Static489.anInt8410 == local6) {
					local406++;
				} else if (Static489.anInt8410 < local6) {
					local406 += 2;
				}
				if (Static461.anInt7924 == local9) {
					local406 += 3;
				} else if (Static461.anInt7924 > local9) {
					local406 += 6;
				}
				local408 = Static528.anIntArray669[local406];
				arg1.aShort31 = Static109.aShortArray28[local406];
			}
			if (local411 != null) {
				if ((local411.anInt6141 & Static270.anIntArray360[local406]) == 0) {
					arg1.aByte28 = 0;
				} else if (local411.anInt6141 == 16) {
					arg1.aByte28 = 3;
					arg1.aByte25 = Static265.aByteArray69[local406];
					arg1.aByte24 = (byte) (3 - arg1.aByte25);
				} else if (local411.anInt6141 == 32) {
					arg1.aByte28 = 6;
					arg1.aByte25 = Static448.aByteArray111[local406];
					arg1.aByte24 = (byte) (6 - arg1.aByte25);
				} else if (local411.anInt6141 == 64) {
					arg1.aByte28 = 12;
					arg1.aByte25 = Static189.aByteArray57[local406];
					arg1.aByte24 = (byte) (12 - arg1.aByte25);
				} else {
					arg1.aByte28 = 9;
					arg1.aByte25 = Static189.aByteArray58[local406];
					arg1.aByte24 = (byte) (9 - arg1.aByte25);
				}
				if ((local411.anInt6141 & local408) != 0 && !Static142.method2684(local15, local6, local9, local411.anInt6141)) {
					if (Static537.aBoolean655) {
						Static223.method3542(arg0, local12, local6, local9);
						Static60.aClass62_37.method7059(arg0.anInt5117, arg0.aClass5_Sub10Array5);
					}
					@Pc(563) Class30_Sub1 local563 = local411.method6858(Static60.aClass62_37);
					if (local563 != null) {
						local563.aClass15_1 = local411;
						local563.anInt915 = local12;
						local563.anInt913 = local6;
						local563.anInt916 = local9;
						Static541.aClass77_13.method2165(local563);
					}
				}
				@Pc(584) Class15_Sub3 local584 = arg1.aClass15_Sub3_2;
				if (local584 != null && (local584.anInt6141 & local408) != 0 && !Static142.method2684(local15, local6, local9, local584.anInt6141)) {
					if (Static537.aBoolean655) {
						Static223.method3542(arg0, local12, local6, local9);
						Static60.aClass62_37.method7059(arg0.anInt5117, arg0.aClass5_Sub10Array5);
					}
					local616 = local584.method6858(Static60.aClass62_37);
					if (local616 != null) {
						local616.aClass15_1 = local584;
						local616.anInt915 = local12;
						local616.anInt913 = local6;
						local616.anInt916 = local9;
						Static541.aClass77_13.method2165(local616);
					}
				}
			}
			if (local414 != null && !Static115.method2246(local15, local6, local9, local414.method6155())) {
				@Pc(647) Class15_Sub1 local647 = arg1.aClass15_Sub1_2;
				Static60.aClass62_37.la(3000.0F, (local53 - 0.5F) * 1.5F);
				if ((local414.anInt7584 & local408) != 0) {
					if (Static537.aBoolean655) {
						Static223.method3542(arg0, local12, local6, local9);
						Static60.aClass62_37.method7059(arg0.anInt5117, arg0.aClass5_Sub10Array5);
					}
					local616 = local414.method6858(Static60.aClass62_37);
					if (local616 != null) {
						local616.aClass15_1 = local414;
						local616.anInt915 = local12;
						local616.anInt913 = local6;
						local616.anInt916 = local9;
						Static541.aClass77_13.method2165(local616);
					}
				} else if (local414.anInt7584 == 256) {
					local706 = local414.anInt7582 - Static287.anInt5832;
					local711 = local414.anInt7573 - Static500.anInt8550;
					local714 = local414.anInt7585;
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
					if (Static537.aBoolean655) {
						Static223.method3542(arg0, local12, local6, local9);
						Static60.aClass62_37.method7059(arg0.anInt5117, arg0.aClass5_Sub10Array5);
					}
					@Pc(759) Class30_Sub1 local759;
					if (local735 < local723) {
						local759 = local414.method6858(Static60.aClass62_37);
						if (local759 != null) {
							local759.aClass15_1 = local414;
							local759.anInt915 = local12;
							local759.anInt913 = local6;
							local759.anInt916 = local9;
							Static541.aClass77_13.method2165(local759);
						}
					} else if (local647 != null) {
						local759 = local647.method6858(Static60.aClass62_37);
						if (local759 != null) {
							local759.aClass15_1 = local647;
							local759.anInt915 = local12;
							local759.anInt913 = local6;
							local759.anInt916 = local9;
							Static541.aClass77_13.method2165(local759);
						}
					}
				}
				Static60.aClass62_37.la(3000.0F, local53 * 1.5F);
			}
			if (local330) {
				@Pc(814) Class15_Sub5 local814 = arg1.aClass15_Sub5_1;
				if (local814 != null && !local814.aBoolean609) {
					if (local814.aBoolean608) {
						Static60.aClass62_37.la(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static537.aBoolean655) {
						Static223.method3542(arg0, local12, local6, local9);
						Static60.aClass62_37.method7059(arg0.anInt5117, arg0.aClass5_Sub10Array5);
					}
					local616 = local814.method6858(Static60.aClass62_37);
					if (local616 != null) {
						local616.aClass15_1 = local814;
						local616.anInt915 = local12;
						local616.anInt913 = local6;
						local616.anInt916 = local9;
						Static541.aClass77_13.method2165(local616);
					}
					if (local814.aBoolean608) {
						Static60.aClass62_37.la(3000.0F, local53 * 1.5F);
					}
				}
				@Pc(880) Class15_Sub4 local880 = arg1.aClass15_Sub4_1;
				if (local880 != null && !local880.aBoolean210) {
					if (Static537.aBoolean655) {
						Static223.method3542(arg0, local12, local6, local9);
						Static60.aClass62_37.method7059(arg0.anInt5117, arg0.aClass5_Sub10Array5);
					}
					@Pc(903) Class30_Sub1 local903 = local880.method6858(Static60.aClass62_37);
					if (local903 != null) {
						local903.aClass15_1 = local880;
						local903.anInt915 = local12;
						local903.anInt913 = local6;
						local903.anInt916 = local9;
						Static541.aClass77_13.method2165(local903);
					}
				}
			}
			@Pc(924) byte local924 = arg1.aByte27;
			if (local924 != 0) {
				@Pc(941) Class37 local941;
				if (local6 < Static489.anInt8410 && (local924 & 0x4) != 0) {
					local941 = local31[local6 + 1][local9];
					if (local941 != null && local941.aBoolean58) {
						Static535.aClass2_1.method3047(local941);
					}
				}
				if (local9 < Static461.anInt7924 && (local924 & 0x2) != 0) {
					local941 = local31[local6][local9 + 1];
					if (local941 != null && local941.aBoolean58) {
						Static535.aClass2_1.method3047(local941);
					}
				}
				if (local6 > Static489.anInt8410 && (local924 & 0x1) != 0) {
					local941 = local31[local6 - 1][local9];
					if (local941 != null && local941.aBoolean58) {
						Static535.aClass2_1.method3047(local941);
					}
				}
				if (local9 > Static461.anInt7924 && (local924 & 0x8) != 0) {
					local941 = local31[local6][local9 - 1];
					if (local941 != null && local941.aBoolean58) {
						Static535.aClass2_1.method3047(local941);
					}
				}
			}
		}
		@Pc(1074) int local1074;
		@Pc(1057) Class15_Sub3 local1057;
		@Pc(1078) int local1078;
		@Pc(1030) Class108 local1030;
		if (arg1.aByte28 != 0) {
			local330 = true;
			for (local1030 = arg1.aClass108_1; local1030 != null; local1030 = local1030.aClass108_3) {
				if (local1030.aClass15_Sub2_1.anInt8495 != Static108.anInt2350 && (local1030.anInt3129 & arg1.aByte28) == arg1.aByte25) {
					local330 = false;
					break;
				}
			}
			if (local330) {
				local1057 = arg1.aClass15_Sub3_3;
				if (!Static142.method2684(local15, local6, local9, local1057.anInt6141)) {
					if (Static537.aBoolean655) {
						label682: {
							if (local1057.anInt6141 >= 16) {
								local1074 = local6 - Static489.anInt8410;
								local1078 = local9 - Static461.anInt7924;
								if (local1057.anInt6141 == 16) {
									local1074 -= Static261.anInt5167;
									local1078 += Static261.anInt5167;
									if (local1078 < local1074 && local6 > 0 && local9 <= Static430.anInt7565) {
										Static223.method3542(arg0, local12, local6 - 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt6141 == 32) {
									local1074 += Static261.anInt5167;
									local1078 += Static261.anInt5167;
									if (local1078 < -local1074 && local6 < Static374.anInt6925 && local9 < Static430.anInt7565) {
										Static223.method3542(arg0, local12, local6 + 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt6141 == 64) {
									local1074 += Static261.anInt5167;
									local1078 -= Static261.anInt5167;
									if (local1078 > local1074 && local6 < Static374.anInt6925 && local9 > 0) {
										Static223.method3542(arg0, local12, local6 + 1, local9 - 1);
										break label682;
									}
								} else if (local1057.anInt6141 == 128) {
									local1074 -= Static261.anInt5167;
									local1078 -= Static261.anInt5167;
									if (local1078 > -local1074 && local6 > 0 && local9 > 0) {
										Static223.method3542(arg0, local12, local6 - 1, local9 - 1);
										break label682;
									}
								}
							}
							Static223.method3542(arg0, local12, local6, local9);
						}
						Static60.aClass62_37.method7059(arg0.anInt5117, arg0.aClass5_Sub10Array5);
					}
					@Pc(1216) Class30_Sub1 local1216 = local1057.method6858(Static60.aClass62_37);
					if (local1216 != null) {
						local1216.aClass15_1 = local1057;
						local1216.anInt915 = local12;
						local1216.anInt913 = local6;
						local1216.anInt916 = local9;
						Static541.aClass77_13.method2165(local1216);
					}
				}
				arg1.aByte28 = 0;
			}
		}
		@Pc(1333) int local1333;
		if (arg1.aBoolean59) {
			try {
				arg1.aBoolean59 = false;
				@Pc(1245) int local1245 = 0;
				label625: for (local1030 = arg1.aClass108_1; local1030 != null; local1030 = local1030.aClass108_3) {
					@Pc(1252) Class15_Sub2 local1252 = local1030.aClass15_Sub2_1;
					if (local1252.anInt8495 != Static108.anInt2350) {
						for (local1074 = local1252.aShort110; local1074 <= local1252.aShort111; local1074++) {
							for (local1078 = local1252.aShort109; local1078 <= local1252.aShort108; local1078++) {
								@Pc(1270) Class37 local1270 = local31[local1074][local1078];
								if (local1270.aBoolean57) {
									arg1.aBoolean59 = true;
									continue label625;
								}
								if (local1270.aByte28 != 0) {
									local706 = 0;
									if (local1074 > local1252.aShort110) {
										local706++;
									}
									if (local1074 < local1252.aShort111) {
										local706 += 4;
									}
									if (local1078 > local1252.aShort109) {
										local706 += 8;
									}
									if (local1078 < local1252.aShort108) {
										local706 += 2;
									}
									if ((local706 & local1270.aByte28) == arg1.aByte24) {
										arg1.aBoolean59 = true;
										continue label625;
									}
								}
							}
						}
						local1078 = Static489.anInt8410 - local1252.aShort110;
						local1333 = local1252.aShort111 - Static489.anInt8410;
						if (local1333 > local1078) {
							local1078 = local1333;
						}
						local706 = Static461.anInt7924 - local1252.aShort109;
						local711 = local1252.aShort108 - Static461.anInt7924;
						if (local711 > local706) {
							local706 = local711;
						}
						arg0.aClass15_Sub2Array2[local1245] = local1252;
						arg0.anIntArray323[local1245++] = local1078 + local706;
					}
				}
				while (local1245 > 0) {
					local408 = -50;
					local1074 = -1;
					@Pc(1384) Class15_Sub2 local1384;
					for (local1078 = 0; local1078 < local1245; local1078++) {
						local1384 = arg0.aClass15_Sub2Array2[local1078];
						if (local1384.anInt8495 != Static108.anInt2350) {
							local706 = arg0.anIntArray323[local1078];
							if (local706 > local408) {
								local408 = local706;
								local1074 = local1078;
							} else if (local706 == local408) {
								local711 = local1384.anInt8492 - Static287.anInt5832;
								local714 = local1384.anInt8493 - Static500.anInt8550;
								local723 = arg0.aClass15_Sub2Array2[local1074].anInt8492 - Static287.anInt5832;
								local735 = arg0.aClass15_Sub2Array2[local1074].anInt8493 - Static500.anInt8550;
								if (local711 * local711 + local714 * local714 > local723 * local723 + local735 * local735) {
									local1074 = local1078;
								}
							}
						}
					}
					if (local1074 == -1) {
						break;
					}
					local1384 = arg0.aClass15_Sub2Array2[local1074];
					local1384.anInt8495 = Static108.anInt2350;
					if (!Static176.method3054(local15, local1384.aShort110, local1384.aShort111, local1384.aShort109, local1384.aShort108, local1384.method6864())) {
						if (Static537.aBoolean655) {
							if (local1384.aByte90 == 0) {
								Static354.method5487(arg0, local12, local1384.aShort110, local1384.aShort109, local1384.aShort111, local1384.aShort108);
							} else {
								Static223.method3542(arg0, local12, local6, local9);
								local706 = local6 - Static489.anInt8410;
								local711 = local9 - Static461.anInt7924;
								if (local1384.aByte90 == 2) {
									if (local711 > -local706) {
										Static217.method3500(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static217.method3500(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local711 > local706) {
									Static217.method3500(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static217.method3500(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static60.aClass62_37.method7059(arg0.anInt5117, arg0.aClass5_Sub10Array5);
						}
						local616 = local1384.method6858(Static60.aClass62_37);
						if (local616 != null) {
							local616.aClass15_1 = local1384;
							local616.anInt915 = local12;
							local616.anInt913 = local1384.aShort110;
							local616.anInt916 = local1384.aShort109;
							Static541.aClass77_13.method2165(local616);
						}
					}
					for (local706 = local1384.aShort110; local706 <= local1384.aShort111; local706++) {
						for (local711 = local1384.aShort109; local711 <= local1384.aShort108; local711++) {
							@Pc(1609) Class37 local1609 = local31[local706][local711];
							if (local1609.aByte28 != 0) {
								Static535.aClass2_1.method3047(local1609);
							} else if ((local706 != local6 || local711 != local9) && local1609.aBoolean58) {
								Static535.aClass2_1.method3047(local1609);
							}
						}
					}
				}
				if (arg1.aBoolean59) {
					return;
				}
			} catch (@Pc(1647) Exception local1647) {
				arg1.aBoolean59 = false;
			}
		}
		if (arg1.aClass267_1 != null && arg1.aByte23 == (byte) (Static146.anInt3069 & 0xFF)) {
			@Pc(1664) Class267 local1664 = arg1.aClass267_1;
			local406 = Static248.aClass131Array4[local12].ba(local6, local9);
			if (local12 < Static460.anInt7893 - 1) {
				local408 = Static248.aClass131Array4[local12].ba(local6, local9) - Static248.aClass131Array4[local12 + 1].ba(local6, local9);
			} else {
				local408 = 0x8 << Static270.anInt5288;
			}
			Static339.aClass78_4.method5708(local21, local406, local27, arg0.anIntArray322);
			local1074 = arg0.anIntArray322[2];
			Static339.aClass78_4.method5708(local21, local406 - local408, local27, arg0.anIntArray322);
			local1078 = arg0.anIntArray322[2];
			local1333 = local1074;
			local706 = local1078;
			if (local1074 > local1078) {
				local1333 = local1078;
				local706 = local1074;
			}
			local1333 -= Static495.anInt8488;
			local706 += Static495.anInt8488;
			local1664.anInt7821 = local1333;
			local1664.anInt7822 = local706;
			local1664.aBoolean555 = true;
			Static60.aClass62_37.method7002(local1664);
		}
		if (!arg1.aBoolean58) {
			return;
		}
		if (arg1.aByte28 != 0) {
			return;
		}
		if (local6 <= Static489.anInt8410 && local6 > Static45.anInt1000) {
			local86 = local31[local6 - 1][local9];
			if (local86 != null && local86.aBoolean58) {
				return;
			}
		}
		if (local6 >= Static489.anInt8410 && local6 < Static546.anInt9152 - 1) {
			local86 = local31[local6 + 1][local9];
			if (local86 != null && local86.aBoolean58) {
				return;
			}
		}
		if (local9 <= Static461.anInt7924 && local9 > Static226.anInt5120) {
			local86 = local31[local6][local9 - 1];
			if (local86 != null && local86.aBoolean58) {
				return;
			}
		}
		if (local9 >= Static461.anInt7924 && local9 < Static243.anInt4911 - 1) {
			local86 = local31[local6][local9 + 1];
			if (local86 != null && local86.aBoolean58) {
				return;
			}
		}
		arg1.aBoolean58 = false;
		Static432.anInt7595--;
		@Pc(1855) Class15_Sub4 local1855 = arg1.aClass15_Sub4_1;
		if (local1855 != null && local1855.aBoolean210) {
			if (Static537.aBoolean655) {
				Static223.method3542(arg0, local12, local6, local9);
				Static60.aClass62_37.method7059(arg0.anInt5117, arg0.aClass5_Sub10Array5);
			}
			@Pc(1878) Class30_Sub1 local1878 = local1855.method6858(Static60.aClass62_37);
			if (local1878 != null) {
				local1878.aClass15_1 = local1855;
				local1878.anInt915 = local12;
				local1878.anInt913 = local6;
				local1878.anInt916 = local9;
				Static541.aClass77_13.method2165(local1878);
			}
		}
		if (arg1.aShort31 != 0) {
			@Pc(1902) Class15_Sub1 local1902 = arg1.aClass15_Sub1_3;
			if (local1902 != null && !Static115.method2246(local15, local6, local9, local1902.method6155())) {
				if ((local1902.anInt7584 & arg1.aShort31) != 0) {
					if (Static537.aBoolean655) {
						Static223.method3542(arg0, local12, local6, local9);
						Static60.aClass62_37.method7059(arg0.anInt5117, arg0.aClass5_Sub10Array5);
					}
					local377 = local1902.method6858(Static60.aClass62_37);
					if (local377 != null) {
						local377.aClass15_1 = local1902;
						local377.anInt915 = local12;
						local377.anInt913 = local6;
						local377.anInt916 = local9;
						Static541.aClass77_13.method2165(local377);
					}
				} else if (local1902.anInt7584 == 256) {
					local408 = local1902.anInt7582 - Static287.anInt5832;
					local1074 = local1902.anInt7573 - Static500.anInt8550;
					local1078 = local1902.anInt7585;
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
					if (Static537.aBoolean655) {
						Static223.method3542(arg0, local12, local6, local9);
						Static60.aClass62_37.method7059(arg0.anInt5117, arg0.aClass5_Sub10Array5);
					}
					@Pc(2012) Class15_Sub1 local2012 = arg1.aClass15_Sub1_2;
					@Pc(2020) Class30_Sub1 local2020;
					if (local706 > local1333) {
						local2020 = local1902.method6858(Static60.aClass62_37);
						if (local2020 != null) {
							local2020.aClass15_1 = local1902;
							local2020.anInt915 = local12;
							local2020.anInt913 = local6;
							local2020.anInt916 = local9;
							Static541.aClass77_13.method2165(local2020);
						}
					} else if (local2012 != null) {
						local2020 = local2012.method6858(Static60.aClass62_37);
						if (local2020 != null) {
							local2020.aClass15_1 = local2012;
							local2020.anInt915 = local12;
							local2020.anInt913 = local6;
							local2020.anInt916 = local9;
							Static541.aClass77_13.method2165(local2020);
						}
					}
				}
			}
			local1057 = arg1.aClass15_Sub3_3;
			local411 = arg1.aClass15_Sub3_2;
			@Pc(2105) Class30_Sub1 local2105;
			if (local411 != null && (local411.anInt6141 & arg1.aShort31) != 0 && !Static142.method2684(local15, local6, local9, local411.anInt6141)) {
				if (Static537.aBoolean655) {
					Static58.method1164(arg0, local411.anInt6141, local12, local6, local9);
					Static60.aClass62_37.method7059(arg0.anInt5117, arg0.aClass5_Sub10Array5);
				}
				local2105 = local411.method6858(Static60.aClass62_37);
				if (local2105 != null) {
					local2105.aClass15_1 = local411;
					local2105.anInt915 = local12;
					local2105.anInt913 = local6;
					local2105.anInt916 = local9;
					Static541.aClass77_13.method2165(local2105);
				}
			}
			if (local1057 != null && (local1057.anInt6141 & arg1.aShort31) != 0 && !Static142.method2684(local15, local6, local9, local1057.anInt6141)) {
				if (Static537.aBoolean655) {
					Static58.method1164(arg0, local1057.anInt6141, local12, local6, local9);
					Static60.aClass62_37.method7059(arg0.anInt5117, arg0.aClass5_Sub10Array5);
				}
				local2105 = local1057.method6858(Static60.aClass62_37);
				if (local2105 != null) {
					local2105.aClass15_1 = local1057;
					local2105.anInt915 = local12;
					local2105.anInt913 = local6;
					local2105.anInt916 = local9;
					Static541.aClass77_13.method2165(local2105);
				}
			}
		}
		@Pc(2191) Class37 local2191;
		if (local12 < Static460.anInt7893 - 1) {
			local2191 = Static152.aClass37ArrayArrayArray1[local12 + 1][local6][local9];
			if (local2191 != null && local2191.aBoolean58) {
				Static535.aClass2_1.method3040(local2191);
			}
		}
		if (local6 < Static489.anInt8410) {
			local2191 = local31[local6 + 1][local9];
			if (local2191 != null && local2191.aBoolean58) {
				Static535.aClass2_1.method3047(local2191);
			}
		}
		if (local9 < Static461.anInt7924) {
			local2191 = local31[local6][local9 + 1];
			if (local2191 != null && local2191.aBoolean58) {
				Static535.aClass2_1.method3047(local2191);
			}
		}
		if (local6 > Static489.anInt8410) {
			local2191 = local31[local6 - 1][local9];
			if (local2191 != null && local2191.aBoolean58) {
				Static535.aClass2_1.method3047(local2191);
			}
		}
		if (local9 > Static461.anInt7924) {
			local2191 = local31[local6][local9 - 1];
			if (local2191 != null && local2191.aBoolean58) {
				Static535.aClass2_1.method3047(local2191);
			}
		}
	}
}
