import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!og", name = "M", descriptor = "Lclient!ba;")
	public static final Class21 aClass21_3 = new Class21(64);

	@OriginalMember(owner = "client!og", name = "N", descriptor = "Lclient!us;")
	public static final Class234 aClass234_88 = new Class234(30, -1);

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(II)V")
	public static void method4058(@OriginalArg(0) int arg0) {
		if (Static318.anIntArray214 == null || Static318.anIntArray214.length < arg0) {
			Static318.anIntArray214 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(II)Z")
	public static boolean method4059(@OriginalArg(0) int arg0) {
		if (arg0 == 60 || arg0 == 19 || arg0 == 21 || arg0 == 25 || arg0 == 1003) {
			return true;
		} else {
			return arg0 == 49 || arg0 == 1007;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!qc;Lclient!ct;)V")
	public static void method4060(@OriginalArg(0) Class191 arg0, @OriginalArg(1) Class48 arg1) {
		if (!arg1.aBoolean62) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort18;
		@Pc(9) short local9 = arg1.aShort17;
		@Pc(12) byte local12 = arg1.aByte12;
		@Pc(15) byte local15 = arg1.aByte14;
		@Pc(21) int local21 = (local6 << Static187.anInt3390) + Static132.anInt2502;
		@Pc(27) int local27 = (local9 << Static187.anInt3390) + Static132.anInt2502;
		@Pc(31) Class48[][] local31 = Static69.aClass48ArrayArrayArray1[local12];
		@Pc(53) float local53;
		if (Static25.aClass7Array1 == Static337.aClass7Array3) {
			Static121.aClass155_1.method4927(Static89.aClass7Array4[0].method5638(local21, local27), Static329.method5021(local6, local9), Static368.method5522(local6, local9), Static328.method5019(local6, local9));
			local53 = 251.5F;
		} else {
			local53 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static121.aClass155_1.method4856(3000.0F, local53 * 1.5F);
		@Pc(86) Class48 local86;
		@Pc(616) Class12_Sub7 local616;
		@Pc(711) int local711;
		@Pc(714) int local714;
		@Pc(723) int local723;
		@Pc(735) int local735;
		@Pc(406) int local406;
		@Pc(330) boolean local330;
		@Pc(377) Class12_Sub7 local377;
		@Pc(408) int local408;
		@Pc(411) Class28_Sub3 local411;
		@Pc(706) int local706;
		if (arg1.aBoolean61) {
			if (Static102.aBoolean152) {
				if (local12 > 0) {
					local86 = Static69.aClass48ArrayArrayArray1[local12 - 1][local6][local9];
					if (local86 != null && local86.aBoolean62) {
						return;
					}
				}
				if (local6 <= Static12.anInt167 && local6 > Static264.anInt4700) {
					local86 = local31[local6 - 1][local9];
					if (local86 != null && local86.aBoolean62 && (local86.aBoolean61 || (arg1.aByte13 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static12.anInt167 && local6 < Static70.anInt1378 - 1) {
					local86 = local31[local6 + 1][local9];
					if (local86 != null && local86.aBoolean62 && (local86.aBoolean61 || (arg1.aByte13 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static327.anInt5555 && local9 > Static270.anInt5903) {
					local86 = local31[local6][local9 - 1];
					if (local86 != null && local86.aBoolean62 && (local86.aBoolean61 || (arg1.aByte13 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static327.anInt5555 && local9 < Static72.anInt1458 - 1) {
					local86 = local31[local6][local9 + 1];
					if (local86 != null && local86.aBoolean62 && (local86.aBoolean61 || (arg1.aByte13 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static102.aBoolean152 = true;
			}
			arg1.aBoolean61 = false;
			if (arg1.aClass48_1 != null) {
				local86 = arg1.aClass48_1;
				Static121.aClass155_1.method4856(3000.0F, (201.5F - (float) (local86.aByte14 + 1) * 50.0F) * 1.5F);
				if (!Static364.method5430(local86.aByte14, local6, local9)) {
					Static337.aClass7Array3[local86.aByte14].method5651(local6, local9);
				}
				@Pc(249) Class28_Sub3 local249 = local86.aClass28_Sub3_1;
				if (local249 != null) {
					if (Static145.aBoolean206) {
						if ((local249.anInt3263 & arg1.aShort16) == 0) {
							Static278.method4351(arg0, local12, local6, local9);
						} else {
							Static304.method2774(arg0, local249.anInt3263, local15, local6, local9);
						}
						Static121.aClass155_1.method4945(arg0.anInt5884, arg0.aClass3_Sub12_Sub1Array3);
					}
					local249.method5407(Static121.aClass155_1);
				}
				for (@Pc(286) Class50 local286 = local86.aClass50_1; local286 != null; local286 = local286.aClass50_2) {
					@Pc(290) Class28_Sub1 local290 = local286.aClass28_Sub1_1;
					if (local290 != null) {
						if (Static145.aBoolean206) {
							Static278.method4351(arg0, local12, local6, local9);
							Static121.aClass155_1.method4945(arg0.anInt5884, arg0.aClass3_Sub12_Sub1Array3);
						}
						local290.method5407(Static121.aClass155_1);
					}
				}
				Static121.aClass155_1.method4856(3000.0F, local53 * 1.5F);
			}
			local330 = !Static364.method5430(local15, local6, local9);
			if (local330) {
				Static337.aClass7Array3[local15].method5651(local6, local9);
				@Pc(341) Class28_Sub2 local341 = arg1.aClass28_Sub2_2;
				if (local341 != null && local341.aBoolean355) {
					if (local341.aBoolean356) {
						Static121.aClass155_1.method4856(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static145.aBoolean206) {
						Static278.method4351(arg0, local12, local6, local9);
						Static121.aClass155_1.method4945(arg0.anInt5884, arg0.aClass3_Sub12_Sub1Array3);
					}
					local377 = local341.method5407(Static121.aClass155_1);
					if (local377 != null) {
						local377.aClass28_1 = local341;
						local377.anInt4980 = local12;
						local377.anInt4979 = local6;
						local377.anInt4981 = local9;
						Static2.aClass22_1.method286(local377);
					}
					if (local341.aBoolean356) {
						Static121.aClass155_1.method4856(3000.0F, local53 * 1.5F);
					}
				}
			}
			local406 = 0;
			local408 = 0;
			local411 = arg1.aClass28_Sub3_1;
			@Pc(414) Class28_Sub4 local414 = arg1.aClass28_Sub4_2;
			if (local411 != null || local414 != null) {
				if (Static12.anInt167 == local6) {
					local406++;
				} else if (Static12.anInt167 < local6) {
					local406 += 2;
				}
				if (Static327.anInt5555 == local9) {
					local406 += 3;
				} else if (Static327.anInt5555 > local9) {
					local406 += 6;
				}
				local408 = Static295.anIntArray566[local406];
				arg1.aShort16 = Static78.aShortArray38[local406];
			}
			if (local411 != null) {
				if ((local411.anInt3263 & Static183.anIntArray366[local406]) == 0) {
					arg1.aByte15 = 0;
				} else if (local411.anInt3263 == 16) {
					arg1.aByte15 = 3;
					arg1.aByte16 = Static43.aByteArray20[local406];
					arg1.aByte10 = (byte) (3 - arg1.aByte16);
				} else if (local411.anInt3263 == 32) {
					arg1.aByte15 = 6;
					arg1.aByte16 = Static165.aByteArray37[local406];
					arg1.aByte10 = (byte) (6 - arg1.aByte16);
				} else if (local411.anInt3263 == 64) {
					arg1.aByte15 = 12;
					arg1.aByte16 = Static339.aByteArray82[local406];
					arg1.aByte10 = (byte) (12 - arg1.aByte16);
				} else {
					arg1.aByte15 = 9;
					arg1.aByte16 = Static147.aByteArray36[local406];
					arg1.aByte10 = (byte) (9 - arg1.aByte16);
				}
				if ((local411.anInt3263 & local408) != 0 && !Static315.method4832(local15, local6, local9, local411.anInt3263)) {
					if (Static145.aBoolean206) {
						Static278.method4351(arg0, local12, local6, local9);
						Static121.aClass155_1.method4945(arg0.anInt5884, arg0.aClass3_Sub12_Sub1Array3);
					}
					@Pc(563) Class12_Sub7 local563 = local411.method5407(Static121.aClass155_1);
					if (local563 != null) {
						local563.aClass28_1 = local411;
						local563.anInt4980 = local12;
						local563.anInt4979 = local6;
						local563.anInt4981 = local9;
						Static2.aClass22_1.method286(local563);
					}
				}
				@Pc(584) Class28_Sub3 local584 = arg1.aClass28_Sub3_2;
				if (local584 != null && (local584.anInt3263 & local408) != 0 && !Static315.method4832(local15, local6, local9, local584.anInt3263)) {
					if (Static145.aBoolean206) {
						Static278.method4351(arg0, local12, local6, local9);
						Static121.aClass155_1.method4945(arg0.anInt5884, arg0.aClass3_Sub12_Sub1Array3);
					}
					local616 = local584.method5407(Static121.aClass155_1);
					if (local616 != null) {
						local616.aClass28_1 = local584;
						local616.anInt4980 = local12;
						local616.anInt4979 = local6;
						local616.anInt4981 = local9;
						Static2.aClass22_1.method286(local616);
					}
				}
			}
			if (local414 != null && !Static142.method2270(local15, local6, local9, local414.method5419())) {
				@Pc(647) Class28_Sub4 local647 = arg1.aClass28_Sub4_1;
				Static121.aClass155_1.method4856(3000.0F, (local53 - 0.5F) * 1.5F);
				if ((local414.anInt6097 & local408) != 0) {
					if (Static145.aBoolean206) {
						Static278.method4351(arg0, local12, local6, local9);
						Static121.aClass155_1.method4945(arg0.anInt5884, arg0.aClass3_Sub12_Sub1Array3);
					}
					local616 = local414.method5407(Static121.aClass155_1);
					if (local616 != null) {
						local616.aClass28_1 = local414;
						local616.anInt4980 = local12;
						local616.anInt4979 = local6;
						local616.anInt4981 = local9;
						Static2.aClass22_1.method286(local616);
					}
				} else if (local414.anInt6097 == 256) {
					local706 = local414.anInt6100 - Static55.anInt1125;
					local711 = local414.anInt6099 - Static303.anInt5264;
					local714 = local414.anInt6091;
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
					if (Static145.aBoolean206) {
						Static278.method4351(arg0, local12, local6, local9);
						Static121.aClass155_1.method4945(arg0.anInt5884, arg0.aClass3_Sub12_Sub1Array3);
					}
					@Pc(759) Class12_Sub7 local759;
					if (local735 < local723) {
						local759 = local414.method5407(Static121.aClass155_1);
						if (local759 != null) {
							local759.aClass28_1 = local414;
							local759.anInt4980 = local12;
							local759.anInt4979 = local6;
							local759.anInt4981 = local9;
							Static2.aClass22_1.method286(local759);
						}
					} else if (local647 != null) {
						local759 = local647.method5407(Static121.aClass155_1);
						if (local759 != null) {
							local759.aClass28_1 = local647;
							local759.anInt4980 = local12;
							local759.anInt4979 = local6;
							local759.anInt4981 = local9;
							Static2.aClass22_1.method286(local759);
						}
					}
				}
				Static121.aClass155_1.method4856(3000.0F, local53 * 1.5F);
			}
			if (local330) {
				@Pc(814) Class28_Sub2 local814 = arg1.aClass28_Sub2_2;
				if (local814 != null && !local814.aBoolean355) {
					if (local814.aBoolean356) {
						Static121.aClass155_1.method4856(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static145.aBoolean206) {
						Static278.method4351(arg0, local12, local6, local9);
						Static121.aClass155_1.method4945(arg0.anInt5884, arg0.aClass3_Sub12_Sub1Array3);
					}
					local616 = local814.method5407(Static121.aClass155_1);
					if (local616 != null) {
						local616.aClass28_1 = local814;
						local616.anInt4980 = local12;
						local616.anInt4979 = local6;
						local616.anInt4981 = local9;
						Static2.aClass22_1.method286(local616);
					}
					if (local814.aBoolean356) {
						Static121.aClass155_1.method4856(3000.0F, local53 * 1.5F);
					}
				}
				@Pc(880) Class28_Sub5 local880 = arg1.aClass28_Sub5_1;
				if (local880 != null && !local880.aBoolean372) {
					if (Static145.aBoolean206) {
						Static278.method4351(arg0, local12, local6, local9);
						Static121.aClass155_1.method4945(arg0.anInt5884, arg0.aClass3_Sub12_Sub1Array3);
					}
					@Pc(903) Class12_Sub7 local903 = local880.method5407(Static121.aClass155_1);
					if (local903 != null) {
						local903.aClass28_1 = local880;
						local903.anInt4980 = local12;
						local903.anInt4979 = local6;
						local903.anInt4981 = local9;
						Static2.aClass22_1.method286(local903);
					}
				}
			}
			@Pc(924) byte local924 = arg1.aByte13;
			if (local924 != 0) {
				@Pc(941) Class48 local941;
				if (local6 < Static12.anInt167 && (local924 & 0x4) != 0) {
					local941 = local31[local6 + 1][local9];
					if (local941 != null && local941.aBoolean62) {
						Static317.aClass137_4.method4823(local941);
					}
				}
				if (local9 < Static327.anInt5555 && (local924 & 0x2) != 0) {
					local941 = local31[local6][local9 + 1];
					if (local941 != null && local941.aBoolean62) {
						Static317.aClass137_4.method4823(local941);
					}
				}
				if (local6 > Static12.anInt167 && (local924 & 0x1) != 0) {
					local941 = local31[local6 - 1][local9];
					if (local941 != null && local941.aBoolean62) {
						Static317.aClass137_4.method4823(local941);
					}
				}
				if (local9 > Static327.anInt5555 && (local924 & 0x8) != 0) {
					local941 = local31[local6][local9 - 1];
					if (local941 != null && local941.aBoolean62) {
						Static317.aClass137_4.method4823(local941);
					}
				}
			}
		}
		@Pc(1074) int local1074;
		@Pc(1057) Class28_Sub3 local1057;
		@Pc(1078) int local1078;
		@Pc(1030) Class50 local1030;
		if (arg1.aByte15 != 0) {
			local330 = true;
			for (local1030 = arg1.aClass50_1; local1030 != null; local1030 = local1030.aClass50_2) {
				if (local1030.aClass28_Sub1_1.anInt5768 != Static389.anInt6446 && (local1030.anInt1127 & arg1.aByte15) == arg1.aByte16) {
					local330 = false;
					break;
				}
			}
			if (local330) {
				local1057 = arg1.aClass28_Sub3_1;
				if (!Static315.method4832(local15, local6, local9, local1057.anInt3263)) {
					if (Static145.aBoolean206) {
						label687: {
							if (local1057.anInt3263 >= 16) {
								local1074 = local6 - Static12.anInt167;
								local1078 = local9 - Static327.anInt5555;
								if (local1057.anInt3263 == 16) {
									local1074 -= Static132.anInt2502;
									local1078 += Static132.anInt2502;
									if (local1078 < local1074 && local6 > 0 && local9 <= Static103.anInt2050) {
										Static278.method4351(arg0, local12, local6 - 1, local9 + 1);
										break label687;
									}
								} else if (local1057.anInt3263 == 32) {
									local1074 += Static132.anInt2502;
									local1078 += Static132.anInt2502;
									if (local1078 < -local1074 && local6 < Static44.anInt791 && local9 < Static103.anInt2050) {
										Static278.method4351(arg0, local12, local6 + 1, local9 + 1);
										break label687;
									}
								} else if (local1057.anInt3263 == 64) {
									local1074 += Static132.anInt2502;
									local1078 -= Static132.anInt2502;
									if (local1078 > local1074 && local6 < Static44.anInt791 && local9 > 0) {
										Static278.method4351(arg0, local12, local6 + 1, local9 - 1);
										break label687;
									}
								} else if (local1057.anInt3263 == 128) {
									local1074 -= Static132.anInt2502;
									local1078 -= Static132.anInt2502;
									if (local1078 > -local1074 && local6 > 0 && local9 > 0) {
										Static278.method4351(arg0, local12, local6 - 1, local9 - 1);
										break label687;
									}
								}
							}
							Static278.method4351(arg0, local12, local6, local9);
						}
						Static121.aClass155_1.method4945(arg0.anInt5884, arg0.aClass3_Sub12_Sub1Array3);
					}
					@Pc(1216) Class12_Sub7 local1216 = local1057.method5407(Static121.aClass155_1);
					if (local1216 != null) {
						local1216.aClass28_1 = local1057;
						local1216.anInt4980 = local12;
						local1216.anInt4979 = local6;
						local1216.anInt4981 = local9;
						Static2.aClass22_1.method286(local1216);
					}
				}
				arg1.aByte15 = 0;
			}
		}
		@Pc(1333) int local1333;
		if (arg1.aBoolean60) {
			try {
				arg1.aBoolean60 = false;
				@Pc(1245) int local1245 = 0;
				label630: for (local1030 = arg1.aClass50_1; local1030 != null; local1030 = local1030.aClass50_2) {
					@Pc(1252) Class28_Sub1 local1252 = local1030.aClass28_Sub1_1;
					if (local1252.anInt5768 != Static389.anInt6446) {
						for (local1074 = local1252.aShort89; local1074 <= local1252.aShort88; local1074++) {
							for (local1078 = local1252.aShort87; local1078 <= local1252.aShort90; local1078++) {
								@Pc(1270) Class48 local1270 = local31[local1074][local1078];
								if (local1270.aBoolean61) {
									arg1.aBoolean60 = true;
									continue label630;
								}
								if (local1270.aByte15 != 0) {
									local706 = 0;
									if (local1074 > local1252.aShort89) {
										local706++;
									}
									if (local1074 < local1252.aShort88) {
										local706 += 4;
									}
									if (local1078 > local1252.aShort87) {
										local706 += 8;
									}
									if (local1078 < local1252.aShort90) {
										local706 += 2;
									}
									if ((local706 & local1270.aByte15) == arg1.aByte10) {
										arg1.aBoolean60 = true;
										continue label630;
									}
								}
							}
						}
						local1078 = Static12.anInt167 - local1252.aShort89;
						local1333 = local1252.aShort88 - Static12.anInt167;
						if (local1333 > local1078) {
							local1078 = local1333;
						}
						local706 = Static327.anInt5555 - local1252.aShort87;
						local711 = local1252.aShort90 - Static327.anInt5555;
						if (local711 > local706) {
							local706 = local711;
						}
						arg0.aClass28_Sub1Array3[local1245] = local1252;
						arg0.anIntArray637[local1245++] = local1078 + local706;
					}
				}
				while (local1245 > 0) {
					local408 = -50;
					local1074 = -1;
					@Pc(1384) Class28_Sub1 local1384;
					for (local1078 = 0; local1078 < local1245; local1078++) {
						local1384 = arg0.aClass28_Sub1Array3[local1078];
						if (local1384.anInt5768 != Static389.anInt6446) {
							local706 = arg0.anIntArray637[local1078];
							if (local706 > local408) {
								local408 = local706;
								local1074 = local1078;
							} else if (local706 == local408) {
								local711 = local1384.anInt5774 - Static55.anInt1125;
								local714 = local1384.anInt5766 - Static303.anInt5264;
								local723 = arg0.aClass28_Sub1Array3[local1074].anInt5774 - Static55.anInt1125;
								local735 = arg0.aClass28_Sub1Array3[local1074].anInt5766 - Static303.anInt5264;
								if (local711 * local711 + local714 * local714 > local723 * local723 + local735 * local735) {
									local1074 = local1078;
								}
							}
						}
					}
					if (local1074 == -1) {
						break;
					}
					local1384 = arg0.aClass28_Sub1Array3[local1074];
					local1384.anInt5768 = Static389.anInt6446;
					if (!Static266.method4230(local15, local1384.aShort89, local1384.aShort88, local1384.aShort87, local1384.aShort90, local1384.method5191())) {
						if (Static145.aBoolean206) {
							if (local1384.aByte74 == 0) {
								Static249.method5738(arg0, local12, local1384.aShort89, local1384.aShort87, local1384.aShort88, local1384.aShort90);
							} else {
								Static278.method4351(arg0, local12, local6, local9);
								local706 = local6 - Static12.anInt167;
								local711 = local9 - Static327.anInt5555;
								if (local1384.aByte74 == 2) {
									if (local711 > -local706) {
										Static314.method4815(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static314.method4815(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local711 > local706) {
									Static314.method4815(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static314.method4815(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static121.aClass155_1.method4945(arg0.anInt5884, arg0.aClass3_Sub12_Sub1Array3);
						}
						local616 = local1384.method5407(Static121.aClass155_1);
						if (local616 != null) {
							local616.aClass28_1 = local1384;
							local616.anInt4980 = local12;
							local616.anInt4979 = local1384.aShort89;
							local616.anInt4981 = local1384.aShort87;
							Static2.aClass22_1.method286(local616);
						}
					}
					for (local706 = local1384.aShort89; local706 <= local1384.aShort88; local706++) {
						for (local711 = local1384.aShort87; local711 <= local1384.aShort90; local711++) {
							@Pc(1609) Class48 local1609 = local31[local706][local711];
							if (local1609.aByte15 != 0) {
								Static317.aClass137_4.method4823(local1609);
							} else if ((local706 != local6 || local711 != local9) && local1609.aBoolean62) {
								Static317.aClass137_4.method4823(local1609);
							}
						}
					}
				}
				if (arg1.aBoolean60) {
					return;
				}
			} catch (@Pc(1647) Exception local1647) {
				arg1.aBoolean60 = false;
			}
		}
		if (arg1.aClass47_1 != null) {
			if (arg1.aByte11 == (byte) (Static142.anInt2700 & 0xFF)) {
				@Pc(1664) Class47 local1664 = arg1.aClass47_1;
				local406 = Static337.aClass7Array3[local12].method5648(local6, local9);
				if (local12 < Static164.anInt2901 - 1) {
					local408 = Static337.aClass7Array3[local12].method5648(local6, local9) - Static337.aClass7Array3[local12 + 1].method5648(local6, local9);
				} else {
					local408 = 1024;
				}
				Static376.aClass118_7.method2664(local21, local406, local27, arg0.anIntArray638);
				local1074 = arg0.anIntArray638[2];
				Static376.aClass118_7.method2664(local21, local406 - local408, local27, arg0.anIntArray638);
				local1078 = arg0.anIntArray638[2];
				local1333 = local1074;
				local706 = local1078;
				if (local1074 > local1078) {
					local1333 = local1078;
					local706 = local1074;
				}
				local1333 -= Static362.anInt6079;
				local706 += Static362.anInt6079;
				if (local1333 < local706 - 1597) {
					local1333 = local706 - 1597;
				}
				local1664.anInt1105 = local1333;
				local1664.anInt1106 = local706;
				local1664.aBoolean59 = true;
				Static121.aClass155_1.method4864(local1664);
			} else {
				arg1.aClass47_1 = null;
			}
		}
		if (!arg1.aBoolean62) {
			return;
		}
		if (arg1.aByte15 != 0) {
			return;
		}
		if (local6 <= Static12.anInt167 && local6 > Static264.anInt4700) {
			local86 = local31[local6 - 1][local9];
			if (local86 != null && local86.aBoolean62) {
				return;
			}
		}
		if (local6 >= Static12.anInt167 && local6 < Static70.anInt1378 - 1) {
			local86 = local31[local6 + 1][local9];
			if (local86 != null && local86.aBoolean62) {
				return;
			}
		}
		if (local9 <= Static327.anInt5555 && local9 > Static270.anInt5903) {
			local86 = local31[local6][local9 - 1];
			if (local86 != null && local86.aBoolean62) {
				return;
			}
		}
		if (local9 >= Static327.anInt5555 && local9 < Static72.anInt1458 - 1) {
			local86 = local31[local6][local9 + 1];
			if (local86 != null && local86.aBoolean62) {
				return;
			}
		}
		arg1.aBoolean62 = false;
		Static373.anInt6224--;
		@Pc(1866) Class28_Sub5 local1866 = arg1.aClass28_Sub5_1;
		if (local1866 != null && local1866.aBoolean372) {
			if (Static145.aBoolean206) {
				Static278.method4351(arg0, local12, local6, local9);
				Static121.aClass155_1.method4945(arg0.anInt5884, arg0.aClass3_Sub12_Sub1Array3);
			}
			@Pc(1889) Class12_Sub7 local1889 = local1866.method5407(Static121.aClass155_1);
			if (local1889 != null) {
				local1889.aClass28_1 = local1866;
				local1889.anInt4980 = local12;
				local1889.anInt4979 = local6;
				local1889.anInt4981 = local9;
				Static2.aClass22_1.method286(local1889);
			}
		}
		if (arg1.aShort16 != 0) {
			@Pc(1913) Class28_Sub4 local1913 = arg1.aClass28_Sub4_2;
			if (local1913 != null && !Static142.method2270(local15, local6, local9, local1913.method5419())) {
				if ((local1913.anInt6097 & arg1.aShort16) != 0) {
					if (Static145.aBoolean206) {
						Static278.method4351(arg0, local12, local6, local9);
						Static121.aClass155_1.method4945(arg0.anInt5884, arg0.aClass3_Sub12_Sub1Array3);
					}
					local377 = local1913.method5407(Static121.aClass155_1);
					if (local377 != null) {
						local377.aClass28_1 = local1913;
						local377.anInt4980 = local12;
						local377.anInt4979 = local6;
						local377.anInt4981 = local9;
						Static2.aClass22_1.method286(local377);
					}
				} else if (local1913.anInt6097 == 256) {
					local408 = local1913.anInt6100 - Static55.anInt1125;
					local1074 = local1913.anInt6099 - Static303.anInt5264;
					local1078 = local1913.anInt6091;
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
					if (Static145.aBoolean206) {
						Static278.method4351(arg0, local12, local6, local9);
						Static121.aClass155_1.method4945(arg0.anInt5884, arg0.aClass3_Sub12_Sub1Array3);
					}
					@Pc(2023) Class28_Sub4 local2023 = arg1.aClass28_Sub4_1;
					@Pc(2031) Class12_Sub7 local2031;
					if (local706 > local1333) {
						local2031 = local1913.method5407(Static121.aClass155_1);
						if (local2031 != null) {
							local2031.aClass28_1 = local1913;
							local2031.anInt4980 = local12;
							local2031.anInt4979 = local6;
							local2031.anInt4981 = local9;
							Static2.aClass22_1.method286(local2031);
						}
					} else if (local2023 != null) {
						local2031 = local2023.method5407(Static121.aClass155_1);
						if (local2031 != null) {
							local2031.aClass28_1 = local2023;
							local2031.anInt4980 = local12;
							local2031.anInt4979 = local6;
							local2031.anInt4981 = local9;
							Static2.aClass22_1.method286(local2031);
						}
					}
				}
			}
			local1057 = arg1.aClass28_Sub3_1;
			local411 = arg1.aClass28_Sub3_2;
			@Pc(2116) Class12_Sub7 local2116;
			if (local411 != null && (local411.anInt3263 & arg1.aShort16) != 0 && !Static315.method4832(local15, local6, local9, local411.anInt3263)) {
				if (Static145.aBoolean206) {
					Static304.method2774(arg0, local411.anInt3263, local12, local6, local9);
					Static121.aClass155_1.method4945(arg0.anInt5884, arg0.aClass3_Sub12_Sub1Array3);
				}
				local2116 = local411.method5407(Static121.aClass155_1);
				if (local2116 != null) {
					local2116.aClass28_1 = local411;
					local2116.anInt4980 = local12;
					local2116.anInt4979 = local6;
					local2116.anInt4981 = local9;
					Static2.aClass22_1.method286(local2116);
				}
			}
			if (local1057 != null && (local1057.anInt3263 & arg1.aShort16) != 0 && !Static315.method4832(local15, local6, local9, local1057.anInt3263)) {
				if (Static145.aBoolean206) {
					Static304.method2774(arg0, local1057.anInt3263, local12, local6, local9);
					Static121.aClass155_1.method4945(arg0.anInt5884, arg0.aClass3_Sub12_Sub1Array3);
				}
				local2116 = local1057.method5407(Static121.aClass155_1);
				if (local2116 != null) {
					local2116.aClass28_1 = local1057;
					local2116.anInt4980 = local12;
					local2116.anInt4979 = local6;
					local2116.anInt4981 = local9;
					Static2.aClass22_1.method286(local2116);
				}
			}
		}
		@Pc(2202) Class48 local2202;
		if (local12 < Static164.anInt2901 - 1) {
			local2202 = Static69.aClass48ArrayArrayArray1[local12 + 1][local6][local9];
			if (local2202 != null && local2202.aBoolean62) {
				Static317.aClass137_4.method4818(local2202);
			}
		}
		if (local6 < Static12.anInt167) {
			local2202 = local31[local6 + 1][local9];
			if (local2202 != null && local2202.aBoolean62) {
				Static317.aClass137_4.method4823(local2202);
			}
		}
		if (local9 < Static327.anInt5555) {
			local2202 = local31[local6][local9 + 1];
			if (local2202 != null && local2202.aBoolean62) {
				Static317.aClass137_4.method4823(local2202);
			}
		}
		if (local6 > Static12.anInt167) {
			local2202 = local31[local6 - 1][local9];
			if (local2202 != null && local2202.aBoolean62) {
				Static317.aClass137_4.method4823(local2202);
			}
		}
		if (local9 > Static327.anInt5555) {
			local2202 = local31[local6][local9 - 1];
			if (local2202 != null && local2202.aBoolean62) {
				Static317.aClass137_4.method4823(local2202);
			}
		}
	}
}
