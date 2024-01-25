import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static503 {

	@OriginalMember(owner = "client!vb", name = "s", descriptor = "Lclient!bg;")
	public static final Class27 aClass27_3 = new Class27();

	@OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
	public static int anInt5477 = 0;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/lang/Object;III)[B")
	public static byte[] method5017(@OriginalArg(0) Object arg0, @OriginalArg(2) int arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg0;
			return Static211.method3920(arg1, local18);
		} else if (arg0 instanceof Class231) {
			@Pc(30) Class231 local30 = (Class231) arg0;
			return local30.method6154(arg1);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!lp;Lclient!dg;)V")
	public static void method5019(@OriginalArg(0) Class111 arg0, @OriginalArg(1) Class64 arg1) {
		if (!arg1.aBoolean153) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort22;
		@Pc(9) short local9 = arg1.aShort24;
		@Pc(12) byte local12 = arg1.aByte33;
		@Pc(15) byte local15 = arg1.aByte27;
		@Pc(21) int local21 = (local6 << Static275.anInt5260) + Static270.anInt5197;
		@Pc(27) int local27 = (local9 << Static275.anInt5260) + Static270.anInt5197;
		@Pc(31) Class64[][] local31 = Static263.aClass64ArrayArrayArray3[local12];
		@Pc(53) float local53;
		if (Static207.aClass7Array7 == Static296.aClass7Array11) {
			Static281.aClass4_9.JA(Static411.aClass7Array12[0].aa(local21, local27), Static100.method2039(local6, local9), Static431.method6703(local6, local9), Static407.method6490(local6, local9));
			local53 = 251.5F;
		} else {
			local53 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static281.aClass4_9.la(3000.0F, local53 * 1.5F);
		@Pc(86) Class64 local86;
		@Pc(616) Class46_Sub6 local616;
		@Pc(711) int local711;
		@Pc(714) int local714;
		@Pc(723) int local723;
		@Pc(735) int local735;
		@Pc(406) int local406;
		@Pc(330) boolean local330;
		@Pc(377) Class46_Sub6 local377;
		@Pc(408) int local408;
		@Pc(411) Class20_Sub2 local411;
		@Pc(706) int local706;
		if (arg1.aBoolean154) {
			if (Static210.aBoolean326) {
				if (local12 > 0) {
					local86 = Static263.aClass64ArrayArrayArray3[local12 - 1][local6][local9];
					if (local86 != null && local86.aBoolean153) {
						return;
					}
				}
				if (local6 <= Static539.anInt9517 && local6 > Static395.anInt6943) {
					local86 = local31[local6 - 1][local9];
					if (local86 != null && local86.aBoolean153 && (local86.aBoolean154 || (arg1.aByte32 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static539.anInt9517 && local6 < Static332.anInt6223 - 1) {
					local86 = local31[local6 + 1][local9];
					if (local86 != null && local86.aBoolean153 && (local86.aBoolean154 || (arg1.aByte32 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static421.anInt7325 && local9 > Static301.anInt5882) {
					local86 = local31[local6][local9 - 1];
					if (local86 != null && local86.aBoolean153 && (local86.aBoolean154 || (arg1.aByte32 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static421.anInt7325 && local9 < Static287.anInt7764 - 1) {
					local86 = local31[local6][local9 + 1];
					if (local86 != null && local86.aBoolean153 && (local86.aBoolean154 || (arg1.aByte32 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static210.aBoolean326 = true;
			}
			arg1.aBoolean154 = false;
			if (arg1.aClass64_1 != null) {
				local86 = arg1.aClass64_1;
				Static281.aClass4_9.la(3000.0F, (201.5F - (float) (local86.aByte27 + 1) * 50.0F) * 1.5F);
				if (!Static529.method8238(local86.aByte27, local6, local9)) {
					Static296.aClass7Array11[local86.aByte27].method8247(local6, local9);
				}
				@Pc(249) Class20_Sub2 local249 = local86.aClass20_Sub2_1;
				if (local249 != null) {
					if (Static402.aBoolean543) {
						if ((local249.anInt9299 & arg1.aShort23) == 0) {
							Static475.method7398(arg0, local12, local6, local9);
						} else {
							Static10.method477(arg0, local249.anInt9299, local15, local6, local9);
						}
						Static281.aClass4_9.method7222(arg0.anInt2977, arg0.aClass1_Sub5Array3);
					}
					local249.method8039(Static281.aClass4_9);
				}
				for (@Pc(286) Class232 local286 = local86.aClass232_2; local286 != null; local286 = local286.aClass232_3) {
					@Pc(290) Class20_Sub1 local290 = local286.aClass20_Sub1_2;
					if (local290 != null) {
						if (Static402.aBoolean543) {
							Static475.method7398(arg0, local12, local6, local9);
							Static281.aClass4_9.method7222(arg0.anInt2977, arg0.aClass1_Sub5Array3);
						}
						local290.method8039(Static281.aClass4_9);
					}
				}
				Static281.aClass4_9.la(3000.0F, local53 * 1.5F);
			}
			local330 = !Static529.method8238(local15, local6, local9);
			if (local330) {
				Static296.aClass7Array11[local15].method8247(local6, local9);
				@Pc(341) Class20_Sub5 local341 = arg1.aClass20_Sub5_1;
				if (local341 != null && local341.aBoolean579) {
					if (local341.aBoolean578) {
						Static281.aClass4_9.la(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static402.aBoolean543) {
						Static475.method7398(arg0, local12, local6, local9);
						Static281.aClass4_9.method7222(arg0.anInt2977, arg0.aClass1_Sub5Array3);
					}
					local377 = local341.method8039(Static281.aClass4_9);
					if (local377 != null) {
						local377.aClass20_1 = local341;
						local377.anInt6351 = local12;
						local377.anInt6354 = local6;
						local377.anInt6349 = local9;
						Static191.aClass184_49.method5142(local377);
					}
					if (local341.aBoolean578) {
						Static281.aClass4_9.la(3000.0F, local53 * 1.5F);
					}
				}
			}
			local406 = 0;
			local408 = 0;
			local411 = arg1.aClass20_Sub2_1;
			@Pc(414) Class20_Sub4 local414 = arg1.aClass20_Sub4_2;
			if (local411 != null || local414 != null) {
				if (Static539.anInt9517 == local6) {
					local406++;
				} else if (Static539.anInt9517 < local6) {
					local406 += 2;
				}
				if (Static421.anInt7325 == local9) {
					local406 += 3;
				} else if (Static421.anInt7325 > local9) {
					local406 += 6;
				}
				local408 = Static458.anIntArray733[local406];
				arg1.aShort23 = Static89.aShortArray25[local406];
			}
			if (local411 != null) {
				if ((local411.anInt9299 & Static502.anIntArray770[local406]) == 0) {
					arg1.aByte28 = 0;
				} else if (local411.anInt9299 == 16) {
					arg1.aByte28 = 3;
					arg1.aByte29 = Static442.aByteArray103[local406];
					arg1.aByte30 = (byte) (3 - arg1.aByte29);
				} else if (local411.anInt9299 == 32) {
					arg1.aByte28 = 6;
					arg1.aByte29 = Static490.aByteArray115[local406];
					arg1.aByte30 = (byte) (6 - arg1.aByte29);
				} else if (local411.anInt9299 == 64) {
					arg1.aByte28 = 12;
					arg1.aByte29 = Static348.aByteArray84[local406];
					arg1.aByte30 = (byte) (12 - arg1.aByte29);
				} else {
					arg1.aByte28 = 9;
					arg1.aByte29 = Static238.aByteArray52[local406];
					arg1.aByte30 = (byte) (9 - arg1.aByte29);
				}
				if ((local411.anInt9299 & local408) != 0 && !Static213.method3945(local15, local6, local9, local411.anInt9299)) {
					if (Static402.aBoolean543) {
						Static475.method7398(arg0, local12, local6, local9);
						Static281.aClass4_9.method7222(arg0.anInt2977, arg0.aClass1_Sub5Array3);
					}
					@Pc(563) Class46_Sub6 local563 = local411.method8039(Static281.aClass4_9);
					if (local563 != null) {
						local563.aClass20_1 = local411;
						local563.anInt6351 = local12;
						local563.anInt6354 = local6;
						local563.anInt6349 = local9;
						Static191.aClass184_49.method5142(local563);
					}
				}
				@Pc(584) Class20_Sub2 local584 = arg1.aClass20_Sub2_2;
				if (local584 != null && (local584.anInt9299 & local408) != 0 && !Static213.method3945(local15, local6, local9, local584.anInt9299)) {
					if (Static402.aBoolean543) {
						Static475.method7398(arg0, local12, local6, local9);
						Static281.aClass4_9.method7222(arg0.anInt2977, arg0.aClass1_Sub5Array3);
					}
					local616 = local584.method8039(Static281.aClass4_9);
					if (local616 != null) {
						local616.aClass20_1 = local584;
						local616.anInt6351 = local12;
						local616.anInt6354 = local6;
						local616.anInt6349 = local9;
						Static191.aClass184_49.method5142(local616);
					}
				}
			}
			if (local414 != null && !Static344.method5747(local15, local6, local9, local414.method6522())) {
				@Pc(647) Class20_Sub4 local647 = arg1.aClass20_Sub4_1;
				Static281.aClass4_9.la(3000.0F, (local53 - 0.5F) * 1.5F);
				if ((local414.anInt7240 & local408) != 0) {
					if (Static402.aBoolean543) {
						Static475.method7398(arg0, local12, local6, local9);
						Static281.aClass4_9.method7222(arg0.anInt2977, arg0.aClass1_Sub5Array3);
					}
					local616 = local414.method8039(Static281.aClass4_9);
					if (local616 != null) {
						local616.aClass20_1 = local414;
						local616.anInt6351 = local12;
						local616.anInt6354 = local6;
						local616.anInt6349 = local9;
						Static191.aClass184_49.method5142(local616);
					}
				} else if (local414.anInt7240 == 256) {
					local706 = local414.anInt7239 - Static107.anInt2259;
					local711 = local414.anInt7242 - Static478.anInt8519;
					local714 = local414.anInt7244;
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
					if (Static402.aBoolean543) {
						Static475.method7398(arg0, local12, local6, local9);
						Static281.aClass4_9.method7222(arg0.anInt2977, arg0.aClass1_Sub5Array3);
					}
					@Pc(759) Class46_Sub6 local759;
					if (local735 < local723) {
						local759 = local414.method8039(Static281.aClass4_9);
						if (local759 != null) {
							local759.aClass20_1 = local414;
							local759.anInt6351 = local12;
							local759.anInt6354 = local6;
							local759.anInt6349 = local9;
							Static191.aClass184_49.method5142(local759);
						}
					} else if (local647 != null) {
						local759 = local647.method8039(Static281.aClass4_9);
						if (local759 != null) {
							local759.aClass20_1 = local647;
							local759.anInt6351 = local12;
							local759.anInt6354 = local6;
							local759.anInt6349 = local9;
							Static191.aClass184_49.method5142(local759);
						}
					}
				}
				Static281.aClass4_9.la(3000.0F, local53 * 1.5F);
			}
			if (local330) {
				@Pc(814) Class20_Sub5 local814 = arg1.aClass20_Sub5_1;
				if (local814 != null && !local814.aBoolean579) {
					if (local814.aBoolean578) {
						Static281.aClass4_9.la(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static402.aBoolean543) {
						Static475.method7398(arg0, local12, local6, local9);
						Static281.aClass4_9.method7222(arg0.anInt2977, arg0.aClass1_Sub5Array3);
					}
					local616 = local814.method8039(Static281.aClass4_9);
					if (local616 != null) {
						local616.aClass20_1 = local814;
						local616.anInt6351 = local12;
						local616.anInt6354 = local6;
						local616.anInt6349 = local9;
						Static191.aClass184_49.method5142(local616);
					}
					if (local814.aBoolean578) {
						Static281.aClass4_9.la(3000.0F, local53 * 1.5F);
					}
				}
				@Pc(880) Class20_Sub3 local880 = arg1.aClass20_Sub3_1;
				if (local880 != null && !local880.aBoolean115) {
					if (Static402.aBoolean543) {
						Static475.method7398(arg0, local12, local6, local9);
						Static281.aClass4_9.method7222(arg0.anInt2977, arg0.aClass1_Sub5Array3);
					}
					@Pc(903) Class46_Sub6 local903 = local880.method8039(Static281.aClass4_9);
					if (local903 != null) {
						local903.aClass20_1 = local880;
						local903.anInt6351 = local12;
						local903.anInt6354 = local6;
						local903.anInt6349 = local9;
						Static191.aClass184_49.method5142(local903);
					}
				}
			}
			@Pc(924) byte local924 = arg1.aByte32;
			if (local924 != 0) {
				@Pc(941) Class64 local941;
				if (local6 < Static539.anInt9517 && (local924 & 0x4) != 0) {
					local941 = local31[local6 + 1][local9];
					if (local941 != null && local941.aBoolean153) {
						Static164.aClass40_1.method8213(local941);
					}
				}
				if (local9 < Static421.anInt7325 && (local924 & 0x2) != 0) {
					local941 = local31[local6][local9 + 1];
					if (local941 != null && local941.aBoolean153) {
						Static164.aClass40_1.method8213(local941);
					}
				}
				if (local6 > Static539.anInt9517 && (local924 & 0x1) != 0) {
					local941 = local31[local6 - 1][local9];
					if (local941 != null && local941.aBoolean153) {
						Static164.aClass40_1.method8213(local941);
					}
				}
				if (local9 > Static421.anInt7325 && (local924 & 0x8) != 0) {
					local941 = local31[local6][local9 - 1];
					if (local941 != null && local941.aBoolean153) {
						Static164.aClass40_1.method8213(local941);
					}
				}
			}
		}
		@Pc(1074) int local1074;
		@Pc(1057) Class20_Sub2 local1057;
		@Pc(1078) int local1078;
		@Pc(1030) Class232 local1030;
		if (arg1.aByte28 != 0) {
			local330 = true;
			for (local1030 = arg1.aClass232_2; local1030 != null; local1030 = local1030.aClass232_3) {
				if (local1030.aClass20_Sub1_2.anInt8952 != Static332.anInt6224 && (local1030.anInt6822 & arg1.aByte28) == arg1.aByte29) {
					local330 = false;
					break;
				}
			}
			if (local330) {
				local1057 = arg1.aClass20_Sub2_1;
				if (!Static213.method3945(local15, local6, local9, local1057.anInt9299)) {
					if (Static402.aBoolean543) {
						label682: {
							if (local1057.anInt9299 >= 16) {
								local1074 = local6 - Static539.anInt9517;
								local1078 = local9 - Static421.anInt7325;
								if (local1057.anInt9299 == 16) {
									local1074 -= Static270.anInt5197;
									local1078 += Static270.anInt5197;
									if (local1078 < local1074 && local6 > 0 && local9 <= Static420.anInt7323) {
										Static475.method7398(arg0, local12, local6 - 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt9299 == 32) {
									local1074 += Static270.anInt5197;
									local1078 += Static270.anInt5197;
									if (local1078 < -local1074 && local6 < Static501.anInt9458 && local9 < Static420.anInt7323) {
										Static475.method7398(arg0, local12, local6 + 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt9299 == 64) {
									local1074 += Static270.anInt5197;
									local1078 -= Static270.anInt5197;
									if (local1078 > local1074 && local6 < Static501.anInt9458 && local9 > 0) {
										Static475.method7398(arg0, local12, local6 + 1, local9 - 1);
										break label682;
									}
								} else if (local1057.anInt9299 == 128) {
									local1074 -= Static270.anInt5197;
									local1078 -= Static270.anInt5197;
									if (local1078 > -local1074 && local6 > 0 && local9 > 0) {
										Static475.method7398(arg0, local12, local6 - 1, local9 - 1);
										break label682;
									}
								}
							}
							Static475.method7398(arg0, local12, local6, local9);
						}
						Static281.aClass4_9.method7222(arg0.anInt2977, arg0.aClass1_Sub5Array3);
					}
					@Pc(1216) Class46_Sub6 local1216 = local1057.method8039(Static281.aClass4_9);
					if (local1216 != null) {
						local1216.aClass20_1 = local1057;
						local1216.anInt6351 = local12;
						local1216.anInt6354 = local6;
						local1216.anInt6349 = local9;
						Static191.aClass184_49.method5142(local1216);
					}
				}
				arg1.aByte28 = 0;
			}
		}
		@Pc(1333) int local1333;
		if (arg1.aBoolean152) {
			try {
				arg1.aBoolean152 = false;
				@Pc(1245) int local1245 = 0;
				label625: for (local1030 = arg1.aClass232_2; local1030 != null; local1030 = local1030.aClass232_3) {
					@Pc(1252) Class20_Sub1 local1252 = local1030.aClass20_Sub1_2;
					if (local1252.anInt8952 != Static332.anInt6224) {
						for (local1074 = local1252.aShort124; local1074 <= local1252.aShort126; local1074++) {
							for (local1078 = local1252.aShort123; local1078 <= local1252.aShort125; local1078++) {
								@Pc(1270) Class64 local1270 = local31[local1074][local1078];
								if (local1270.aBoolean154) {
									arg1.aBoolean152 = true;
									continue label625;
								}
								if (local1270.aByte28 != 0) {
									local706 = 0;
									if (local1074 > local1252.aShort124) {
										local706++;
									}
									if (local1074 < local1252.aShort126) {
										local706 += 4;
									}
									if (local1078 > local1252.aShort123) {
										local706 += 8;
									}
									if (local1078 < local1252.aShort125) {
										local706 += 2;
									}
									if ((local706 & local1270.aByte28) == arg1.aByte30) {
										arg1.aBoolean152 = true;
										continue label625;
									}
								}
							}
						}
						local1078 = Static539.anInt9517 - local1252.aShort124;
						local1333 = local1252.aShort126 - Static539.anInt9517;
						if (local1333 > local1078) {
							local1078 = local1333;
						}
						local706 = Static421.anInt7325 - local1252.aShort123;
						local711 = local1252.aShort125 - Static421.anInt7325;
						if (local711 > local706) {
							local706 = local711;
						}
						arg0.aClass20_Sub1Array2[local1245] = local1252;
						arg0.anIntArray257[local1245++] = local1078 + local706;
					}
				}
				while (local1245 > 0) {
					local408 = -50;
					local1074 = -1;
					@Pc(1384) Class20_Sub1 local1384;
					for (local1078 = 0; local1078 < local1245; local1078++) {
						local1384 = arg0.aClass20_Sub1Array2[local1078];
						if (local1384.anInt8952 != Static332.anInt6224) {
							local706 = arg0.anIntArray257[local1078];
							if (local706 > local408) {
								local408 = local706;
								local1074 = local1078;
							} else if (local706 == local408) {
								local711 = local1384.anInt8954 - Static107.anInt2259;
								local714 = local1384.anInt8949 - Static478.anInt8519;
								local723 = arg0.aClass20_Sub1Array2[local1074].anInt8954 - Static107.anInt2259;
								local735 = arg0.aClass20_Sub1Array2[local1074].anInt8949 - Static478.anInt8519;
								if (local711 * local711 + local714 * local714 > local723 * local723 + local735 * local735) {
									local1074 = local1078;
								}
							}
						}
					}
					if (local1074 == -1) {
						break;
					}
					local1384 = arg0.aClass20_Sub1Array2[local1074];
					local1384.anInt8952 = Static332.anInt6224;
					if (!Static222.method4036(local15, local1384.aShort124, local1384.aShort126, local1384.aShort123, local1384.aShort125, local1384.method7798())) {
						if (Static402.aBoolean543) {
							if (local1384.aByte107 == 0) {
								Static6.method370(arg0, local12, local1384.aShort124, local1384.aShort123, local1384.aShort126, local1384.aShort125);
							} else {
								Static475.method7398(arg0, local12, local6, local9);
								local706 = local6 - Static539.anInt9517;
								local711 = local9 - Static421.anInt7325;
								if (local1384.aByte107 == 2) {
									if (local711 > -local706) {
										Static238.method4284(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static238.method4284(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local711 > local706) {
									Static238.method4284(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static238.method4284(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static281.aClass4_9.method7222(arg0.anInt2977, arg0.aClass1_Sub5Array3);
						}
						local616 = local1384.method8039(Static281.aClass4_9);
						if (local616 != null) {
							local616.aClass20_1 = local1384;
							local616.anInt6351 = local12;
							local616.anInt6354 = local1384.aShort124;
							local616.anInt6349 = local1384.aShort123;
							Static191.aClass184_49.method5142(local616);
						}
					}
					for (local706 = local1384.aShort124; local706 <= local1384.aShort126; local706++) {
						for (local711 = local1384.aShort123; local711 <= local1384.aShort125; local711++) {
							@Pc(1609) Class64 local1609 = local31[local706][local711];
							if (local1609.aByte28 != 0) {
								Static164.aClass40_1.method8213(local1609);
							} else if ((local706 != local6 || local711 != local9) && local1609.aBoolean153) {
								Static164.aClass40_1.method8213(local1609);
							}
						}
					}
				}
				if (arg1.aBoolean152) {
					return;
				}
			} catch (@Pc(1647) Exception local1647) {
				arg1.aBoolean152 = false;
			}
		}
		if (arg1.aClass158_1 != null && arg1.aByte31 == (byte) (Static18.anInt348 & 0xFF)) {
			@Pc(1664) Class158 local1664 = arg1.aClass158_1;
			local406 = Static296.aClass7Array11[local12].ba(local6, local9);
			if (local12 < Static63.anInt1587 - 1) {
				local408 = Static296.aClass7Array11[local12].ba(local6, local9) - Static296.aClass7Array11[local12 + 1].ba(local6, local9);
			} else {
				local408 = 0x8 << Static275.anInt5260;
			}
			Static170.aClass128_4.method6885(local21, local406, local27, arg0.anIntArray260);
			local1074 = arg0.anIntArray260[2];
			Static170.aClass128_4.method6885(local21, local406 - local408, local27, arg0.anIntArray260);
			local1078 = arg0.anIntArray260[2];
			local1333 = local1074;
			local706 = local1078;
			if (local1074 > local1078) {
				local1333 = local1078;
				local706 = local1074;
			}
			local1333 -= Static360.anInt6513;
			local706 += Static360.anInt6513;
			local1664.anInt4643 = local1333;
			local1664.anInt4644 = local706;
			local1664.aBoolean355 = true;
			Static281.aClass4_9.method7179(local1664);
		}
		if (!arg1.aBoolean153) {
			return;
		}
		if (arg1.aByte28 != 0) {
			return;
		}
		if (local6 <= Static539.anInt9517 && local6 > Static395.anInt6943) {
			local86 = local31[local6 - 1][local9];
			if (local86 != null && local86.aBoolean153) {
				return;
			}
		}
		if (local6 >= Static539.anInt9517 && local6 < Static332.anInt6223 - 1) {
			local86 = local31[local6 + 1][local9];
			if (local86 != null && local86.aBoolean153) {
				return;
			}
		}
		if (local9 <= Static421.anInt7325 && local9 > Static301.anInt5882) {
			local86 = local31[local6][local9 - 1];
			if (local86 != null && local86.aBoolean153) {
				return;
			}
		}
		if (local9 >= Static421.anInt7325 && local9 < Static287.anInt7764 - 1) {
			local86 = local31[local6][local9 + 1];
			if (local86 != null && local86.aBoolean153) {
				return;
			}
		}
		arg1.aBoolean153 = false;
		Static90.anInt2018--;
		@Pc(1855) Class20_Sub3 local1855 = arg1.aClass20_Sub3_1;
		if (local1855 != null && local1855.aBoolean115) {
			if (Static402.aBoolean543) {
				Static475.method7398(arg0, local12, local6, local9);
				Static281.aClass4_9.method7222(arg0.anInt2977, arg0.aClass1_Sub5Array3);
			}
			@Pc(1878) Class46_Sub6 local1878 = local1855.method8039(Static281.aClass4_9);
			if (local1878 != null) {
				local1878.aClass20_1 = local1855;
				local1878.anInt6351 = local12;
				local1878.anInt6354 = local6;
				local1878.anInt6349 = local9;
				Static191.aClass184_49.method5142(local1878);
			}
		}
		if (arg1.aShort23 != 0) {
			@Pc(1902) Class20_Sub4 local1902 = arg1.aClass20_Sub4_2;
			if (local1902 != null && !Static344.method5747(local15, local6, local9, local1902.method6522())) {
				if ((local1902.anInt7240 & arg1.aShort23) != 0) {
					if (Static402.aBoolean543) {
						Static475.method7398(arg0, local12, local6, local9);
						Static281.aClass4_9.method7222(arg0.anInt2977, arg0.aClass1_Sub5Array3);
					}
					local377 = local1902.method8039(Static281.aClass4_9);
					if (local377 != null) {
						local377.aClass20_1 = local1902;
						local377.anInt6351 = local12;
						local377.anInt6354 = local6;
						local377.anInt6349 = local9;
						Static191.aClass184_49.method5142(local377);
					}
				} else if (local1902.anInt7240 == 256) {
					local408 = local1902.anInt7239 - Static107.anInt2259;
					local1074 = local1902.anInt7242 - Static478.anInt8519;
					local1078 = local1902.anInt7244;
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
					if (Static402.aBoolean543) {
						Static475.method7398(arg0, local12, local6, local9);
						Static281.aClass4_9.method7222(arg0.anInt2977, arg0.aClass1_Sub5Array3);
					}
					@Pc(2012) Class20_Sub4 local2012 = arg1.aClass20_Sub4_1;
					@Pc(2020) Class46_Sub6 local2020;
					if (local706 > local1333) {
						local2020 = local1902.method8039(Static281.aClass4_9);
						if (local2020 != null) {
							local2020.aClass20_1 = local1902;
							local2020.anInt6351 = local12;
							local2020.anInt6354 = local6;
							local2020.anInt6349 = local9;
							Static191.aClass184_49.method5142(local2020);
						}
					} else if (local2012 != null) {
						local2020 = local2012.method8039(Static281.aClass4_9);
						if (local2020 != null) {
							local2020.aClass20_1 = local2012;
							local2020.anInt6351 = local12;
							local2020.anInt6354 = local6;
							local2020.anInt6349 = local9;
							Static191.aClass184_49.method5142(local2020);
						}
					}
				}
			}
			local1057 = arg1.aClass20_Sub2_1;
			local411 = arg1.aClass20_Sub2_2;
			@Pc(2105) Class46_Sub6 local2105;
			if (local411 != null && (local411.anInt9299 & arg1.aShort23) != 0 && !Static213.method3945(local15, local6, local9, local411.anInt9299)) {
				if (Static402.aBoolean543) {
					Static10.method477(arg0, local411.anInt9299, local12, local6, local9);
					Static281.aClass4_9.method7222(arg0.anInt2977, arg0.aClass1_Sub5Array3);
				}
				local2105 = local411.method8039(Static281.aClass4_9);
				if (local2105 != null) {
					local2105.aClass20_1 = local411;
					local2105.anInt6351 = local12;
					local2105.anInt6354 = local6;
					local2105.anInt6349 = local9;
					Static191.aClass184_49.method5142(local2105);
				}
			}
			if (local1057 != null && (local1057.anInt9299 & arg1.aShort23) != 0 && !Static213.method3945(local15, local6, local9, local1057.anInt9299)) {
				if (Static402.aBoolean543) {
					Static10.method477(arg0, local1057.anInt9299, local12, local6, local9);
					Static281.aClass4_9.method7222(arg0.anInt2977, arg0.aClass1_Sub5Array3);
				}
				local2105 = local1057.method8039(Static281.aClass4_9);
				if (local2105 != null) {
					local2105.aClass20_1 = local1057;
					local2105.anInt6351 = local12;
					local2105.anInt6354 = local6;
					local2105.anInt6349 = local9;
					Static191.aClass184_49.method5142(local2105);
				}
			}
		}
		@Pc(2191) Class64 local2191;
		if (local12 < Static63.anInt1587 - 1) {
			local2191 = Static263.aClass64ArrayArrayArray3[local12 + 1][local6][local9];
			if (local2191 != null && local2191.aBoolean153) {
				Static164.aClass40_1.method8212(local2191);
			}
		}
		if (local6 < Static539.anInt9517) {
			local2191 = local31[local6 + 1][local9];
			if (local2191 != null && local2191.aBoolean153) {
				Static164.aClass40_1.method8213(local2191);
			}
		}
		if (local9 < Static421.anInt7325) {
			local2191 = local31[local6][local9 + 1];
			if (local2191 != null && local2191.aBoolean153) {
				Static164.aClass40_1.method8213(local2191);
			}
		}
		if (local6 > Static539.anInt9517) {
			local2191 = local31[local6 - 1][local9];
			if (local2191 != null && local2191.aBoolean153) {
				Static164.aClass40_1.method8213(local2191);
			}
		}
		if (local9 > Static421.anInt7325) {
			local2191 = local31[local6][local9 - 1];
			if (local2191 != null && local2191.aBoolean153) {
				Static164.aClass40_1.method8213(local2191);
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
	public static void method5020() {
		for (@Pc(10) Class1_Sub25 local10 = (Class1_Sub25) Static105.aClass295_10.method7543(); local10 != null; local10 = (Class1_Sub25) Static105.aClass295_10.method7540()) {
			if (Static421.method6580(local10.anInt4365)) {
				Static501.method8153(local10);
			}
		}
		if (Static197.anInt4015 == 1) {
			Static47.method5107();
			return;
		}
		Static193.method3693(Static336.anInt6244, Static276.anInt8648, Static324.anInt6120, Static513.anInt9093);
		@Pc(52) int local52 = Static270.aClass96_10.method2370(Static544.aClass45_115.method1474(Static544.anInt7853));
		for (@Pc(57) Class1_Sub25 local57 = (Class1_Sub25) Static105.aClass295_10.method7543(); local57 != null; local57 = (Class1_Sub25) Static105.aClass295_10.method7540()) {
			@Pc(63) int local63 = Static250.method4430(local57);
			if (local52 < local63) {
				local52 = local63;
			}
		}
		Static324.anInt6120 = local52 + 8;
		Static336.anInt6244 = Static197.anInt4015 * 16 + (Static242.aBoolean356 ? 26 : 22);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!et;IIILclient!qa;)V")
	public static void method5026(@OriginalArg(0) Class91 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class4 arg3) {
		@Pc(10) Class28 local10 = arg0.method2287(arg3);
		if (local10 == null) {
			return;
		}
		arg3.N(arg1, arg2, arg0.anInt2399 + arg1, arg2 + arg0.anInt2378);
		if (Static235.anInt4528 == 2 || Static235.anInt4528 == 5 || Static47.aClass104_20 == null) {
			arg3.G(-16777216, local10, arg1, arg2);
			return;
		}
		@Pc(65) int local65;
		@Pc(62) int local62;
		@Pc(59) int local59;
		@Pc(72) int local72;
		if (Static170.anInt3418 == 4) {
			local65 = Static341.anInt6297;
			local62 = Static181.anInt3812;
			local59 = (int) -Static135.aFloat193 & 0x3FFF;
			local72 = 4096;
		} else {
			local59 = (int) -Static135.aFloat193 + Static445.anInt7798 & 0x3FFF;
			local62 = Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8949;
			local65 = Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8954;
			local72 = 4096 - Static220.anInt4325 * 16;
		}
		@Pc(99) int local99 = local65 / 32 + 48 - (Static237.anInt4563 + -104) * 2;
		@Pc(116) int local116 = Static373.anInt6694 * 4 + 48 - local62 / 32 - (Static373.anInt6694 - 104) * 2;
		Static47.aClass104_20.method7710((float) arg0.anInt2399 / 2.0F + (float) arg1, (float) arg0.anInt2378 / 2.0F + (float) arg2, (float) local99, (float) local116, local72, local59 << 2, local10, arg1, arg2);
		@Pc(167) int local167;
		@Pc(177) int local177;
		@Pc(188) int local188;
		@Pc(198) int local198;
		for (@Pc(150) Class1_Sub14 local150 = (Class1_Sub14) Static210.aClass295_17.method7543(); local150 != null; local150 = (Class1_Sub14) Static210.aClass295_17.method7540()) {
			@Pc(155) int local155 = local150.anInt2795;
			local167 = (Static260.aClass214_3.anIntArray619[local155] >> 14 & 0x3FFF) - Static538.anInt9485;
			local177 = (Static260.aClass214_3.anIntArray619[local155] & 0x3FFF) - Static282.anInt5380;
			local188 = local167 * 4 + 2 - local65 / 32;
			local198 = local177 * 4 + 2 - local62 / 32;
			Static345.method5749(Static260.aClass214_3.anIntArray620[local155], local188, arg0, local198, local10, arg3, arg2, arg1);
		}
		for (local167 = 0; local167 < Static287.anInt7763; local167++) {
			local177 = Static257.anIntArray412[local167] * 4 + 2 - local65 / 32;
			local188 = Static314.anIntArray471[local167] * 4 + 2 - local62 / 32;
			@Pc(254) Class51 local254 = Static398.aClass18_4.method609(Static435.anIntArray712[local167]);
			if (local254.anIntArray108 != null) {
				local254 = local254.method1625(Static417.aClass10_1);
				if (local254 == null || local254.anInt1653 == -1) {
					continue;
				}
			}
			Static345.method5749(local254.anInt1653, local177, arg0, local188, local10, arg3, arg2, arg1);
		}
		@Pc(342) int local342;
		@Pc(352) int local352;
		for (@Pc(294) Class1_Sub20 local294 = (Class1_Sub20) Static4.aClass230_2.method6137(); local294 != null; local294 = (Class1_Sub20) Static4.aClass230_2.method6140()) {
			local188 = (int) (local294.aLong251 >> 28 & 0x3L);
			if (local188 == Static14.anInt321) {
				local198 = (int) (local294.aLong251 & 0x3FFFL) - Static538.anInt9485;
				@Pc(331) int local331 = (int) (local294.aLong251 >> 14 & 0x3FFFL) - Static282.anInt5380;
				local342 = local198 * 4 + 2 - local65 / 32;
				local352 = local331 * 4 + 2 - local62 / 32;
				Static119.method2307(local10, arg0, arg1, arg2, local352, local342, Static237.aClass104Array46[0]);
			}
		}
		@Pc(438) int local438;
		for (local188 = 0; local188 < Static141.anInt2822; local188++) {
			@Pc(383) Class1_Sub41 local383 = (Class1_Sub41) Static362.aClass230_46.method6144((long) Static220.anIntArray339[local188]);
			if (local383 != null) {
				@Pc(388) Class20_Sub1_Sub1_Sub2 local388 = local383.aClass20_Sub1_Sub1_Sub2_2;
				if (local388.method7825() && local388.aByte108 == Static107.aClass20_Sub1_Sub1_Sub1_1.aByte108) {
					@Pc(400) Class283 local400 = local388.aClass283_1;
					if (local400 != null && local400.anIntArray743 != null) {
						local400 = local400.method7368(Static417.aClass10_1);
					}
					if (local400 != null && local400.aBoolean624 && local400.aBoolean621) {
						local352 = local388.anInt8954 / 32 - local65 / 32;
						local438 = local388.anInt8949 / 32 - local62 / 32;
						if (local400.anInt8430 == -1) {
							Static119.method2307(local10, arg0, arg1, arg2, local438, local352, Static237.aClass104Array46[1]);
						} else {
							Static345.method5749(local400.anInt8430, local352, arg0, local438, local10, arg3, arg2, arg1);
						}
					}
				}
			}
		}
		local198 = Static207.anInt4085;
		@Pc(474) int[] local474 = Static209.anIntArray327;
		@Pc(522) int local522;
		@Pc(526) int local526;
		@Pc(555) int local555;
		for (local342 = 0; local342 < local198; local342++) {
			@Pc(484) Class20_Sub1_Sub1_Sub1 local484 = Static511.aClass20_Sub1_Sub1_Sub1Array1[local474[local342]];
			if (local484 != null && local484.method726() && Static107.aClass20_Sub1_Sub1_Sub1_1 != local484 && Static107.aClass20_Sub1_Sub1_Sub1_1.aByte108 == local484.aByte108) {
				local438 = local484.anInt8954 / 32 - local65 / 32;
				local522 = local484.anInt8949 / 32 - local62 / 32;
				@Pc(524) boolean local524 = false;
				for (local526 = 0; local526 < Static330.anInt6194; local526++) {
					if (local484.aString13.equals(Static163.aStringArray18[local526]) && Static462.anIntArray734[local526] != 0) {
						local524 = true;
						break;
					}
				}
				@Pc(553) boolean local553 = false;
				for (local555 = 0; local555 < Static246.anInt4721; local555++) {
					if (local484.aString13.equals(Static161.aClass181Array1[local555].aString131)) {
						local553 = true;
						break;
					}
				}
				@Pc(579) boolean local579 = false;
				if (Static107.aClass20_Sub1_Sub1_Sub1_1.anInt662 != 0 && local484.anInt662 != 0 && local484.anInt662 == Static107.aClass20_Sub1_Sub1_Sub1_1.anInt662) {
					local579 = true;
				}
				if (local484.aBoolean54) {
					Static119.method2307(local10, arg0, arg1, arg2, local522, local438, Static237.aClass104Array46[6]);
				} else if (local524) {
					Static119.method2307(local10, arg0, arg1, arg2, local522, local438, Static237.aClass104Array46[3]);
				} else if (local553) {
					Static119.method2307(local10, arg0, arg1, arg2, local522, local438, Static237.aClass104Array46[5]);
				} else if (local579) {
					Static119.method2307(local10, arg0, arg1, arg2, local522, local438, Static237.aClass104Array46[4]);
				} else {
					Static119.method2307(local10, arg0, arg1, arg2, local522, local438, Static237.aClass104Array46[2]);
				}
			}
		}
		@Pc(674) Class248[] local674 = Static261.aClass248Array1;
		@Pc(754) int local754;
		for (local438 = 0; local438 < local674.length; local438++) {
			@Pc(682) Class248 local682 = local674[local438];
			if (local682 != null && local682.anInt7271 != 0 && Static445.anInt7791 % 20 < 10) {
				@Pc(719) int local719;
				if (local682.anInt7271 == 1) {
					@Pc(704) Class1_Sub41 local704 = (Class1_Sub41) Static362.aClass230_46.method6144((long) local682.anInt7267);
					if (local704 != null) {
						@Pc(709) Class20_Sub1_Sub1_Sub2 local709 = local704.aClass20_Sub1_Sub1_Sub2_2;
						local719 = local709.anInt8954 / 32 - local65 / 32;
						local555 = local709.anInt8949 / 32 - local62 / 32;
						Static270.method4817(360000L, local555, arg1, arg0, local719, arg2, local682.anInt7270, local10);
					}
				}
				if (local682.anInt7271 == 2) {
					local754 = local682.anInt7261 / 32 - local65 / 32;
					local526 = local682.anInt7264 / 32 - local62 / 32;
					@Pc(769) long local769 = (long) (local682.anInt7268 << 5);
					@Pc(773) long local773 = local769 * local769;
					Static270.method4817(local773, local526, arg1, arg0, local754, arg2, local682.anInt7270, local10);
				}
				if (local682.anInt7271 == 10 && local682.anInt7267 >= 0 && Static511.aClass20_Sub1_Sub1_Sub1Array1.length > local682.anInt7267) {
					@Pc(804) Class20_Sub1_Sub1_Sub1 local804 = Static511.aClass20_Sub1_Sub1_Sub1Array1[local682.anInt7267];
					if (local804 != null) {
						local526 = local804.anInt8954 / 32 - local65 / 32;
						local719 = local804.anInt8949 / 32 - local62 / 32;
						Static270.method4817(360000L, local719, arg1, arg0, local526, arg2, local682.anInt7270, local10);
					}
				}
			}
		}
		if (Static170.anInt3418 == 4) {
			return;
		}
		if (Static52.anInt4659 != 0) {
			local522 = Static52.anInt4659 * 4 + (Static107.aClass20_Sub1_Sub1_Sub1_1.method7808() + -1) * 2 + 2 - local65 / 32;
			local754 = Static259.anInt5037 * 4 + Static107.aClass20_Sub1_Sub1_Sub1_1.method7808() * 2 + 2 - local62 / 32 - 2;
			Static119.method2307(local10, arg0, arg1, arg2, local754, local522, Static162.aClass104Array28[Static50.aBoolean106 ? 1 : 0]);
		}
		arg3.method7162(-1, 3, arg0.anInt2399 / 2 + arg1 - 1, arg0.anInt2378 / 2 + -1 + arg2, 3);
	}

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "(I)[Lclient!hba;")
	public static Class121[] method5032() {
		return new Class121[] { Static352.aClass121_3, Static188.aClass121_2, Static2.aClass121_1 };
	}
}
