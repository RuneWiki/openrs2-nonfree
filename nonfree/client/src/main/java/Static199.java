import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "I")
	public static int anInt4069;

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "Lclient!s;")
	public static final Class217 aClass217_90 = new Class217(98, -1);

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "S")
	public static short aShort63 = 256;

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)V")
	public static void method3238(@OriginalArg(1) int arg0) {
		@Pc(8) Class10_Sub1_Sub17 local8 = Static154.method2630(2, arg0);
		local8.method5346();
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!ke;Lclient!ak;)V")
	public static void method3241(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class11 arg1) {
		if (!arg1.aBoolean11) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort1;
		@Pc(9) short local9 = arg1.aShort3;
		@Pc(12) byte local12 = arg1.aByte7;
		@Pc(15) byte local15 = arg1.aByte1;
		@Pc(21) int local21 = (local6 << Static286.anInt5018) + Static437.anInt7214;
		@Pc(27) int local27 = (local9 << Static286.anInt5018) + Static437.anInt7214;
		@Pc(31) Class11[][] local31 = Static309.aClass11ArrayArrayArray2[local12];
		@Pc(53) float local53;
		if (Static173.aClass154Array1 == Static332.aClass154Array3) {
			Static142.aClass50_5.a(Static256.aClass154Array2[0].ca(local21, local27), Static457.method6055(local6, local9), Static142.method2406(local6, local9), Static453.method6012(local6, local9));
			local53 = 251.5F;
		} else {
			local53 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static142.aClass50_5.da(3000.0F, local53 * 1.5F);
		@Pc(86) Class11 local86;
		@Pc(616) Class40_Sub5 local616;
		@Pc(711) int local711;
		@Pc(714) int local714;
		@Pc(723) int local723;
		@Pc(735) int local735;
		@Pc(406) int local406;
		@Pc(330) boolean local330;
		@Pc(377) Class40_Sub5 local377;
		@Pc(408) int local408;
		@Pc(411) Class24_Sub5 local411;
		@Pc(706) int local706;
		if (arg1.aBoolean9) {
			if (Static299.aBoolean313) {
				if (local12 > 0) {
					local86 = Static309.aClass11ArrayArrayArray2[local12 - 1][local6][local9];
					if (local86 != null && local86.aBoolean11) {
						return;
					}
				}
				if (local6 <= Static18.anInt316 && local6 > Static12.anInt226) {
					local86 = local31[local6 - 1][local9];
					if (local86 != null && local86.aBoolean11 && (local86.aBoolean9 || (arg1.aByte4 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static18.anInt316 && local6 < Static430.anInt7228 - 1) {
					local86 = local31[local6 + 1][local9];
					if (local86 != null && local86.aBoolean11 && (local86.aBoolean9 || (arg1.aByte4 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static265.anInt4683 && local9 > Static137.anInt2871) {
					local86 = local31[local6][local9 - 1];
					if (local86 != null && local86.aBoolean11 && (local86.aBoolean9 || (arg1.aByte4 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static265.anInt4683 && local9 < Static256.anInt4594 - 1) {
					local86 = local31[local6][local9 + 1];
					if (local86 != null && local86.aBoolean11 && (local86.aBoolean9 || (arg1.aByte4 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static299.aBoolean313 = true;
			}
			arg1.aBoolean9 = false;
			if (arg1.aClass11_1 != null) {
				local86 = arg1.aClass11_1;
				Static142.aClass50_5.da(3000.0F, (201.5F - (float) (local86.aByte1 + 1) * 50.0F) * 1.5F);
				if (!Static305.method4247(local86.aByte1, local6, local9)) {
					Static332.aClass154Array3[local86.aByte1].method6078(local6, local9);
				}
				@Pc(249) Class24_Sub5 local249 = local86.aClass24_Sub5_1;
				if (local249 != null) {
					if (Static97.aBoolean73) {
						if ((local249.anInt7223 & arg1.aShort2) == 0) {
							Static159.method2691(arg0, local12, local6, local9);
						} else {
							Static195.method3108(arg0, local249.anInt7223, local15, local6, local9);
						}
						Static142.aClass50_5.method5869(arg0.anInt352, arg0.aClass10_Sub4Array2);
					}
					local249.method5686(Static142.aClass50_5);
				}
				for (@Pc(286) Class1 local286 = local86.aClass1_3; local286 != null; local286 = local286.aClass1_1) {
					@Pc(290) Class24_Sub3 local290 = local286.aClass24_Sub3_1;
					if (local290 != null) {
						if (Static97.aBoolean73) {
							Static159.method2691(arg0, local12, local6, local9);
							Static142.aClass50_5.method5869(arg0.anInt352, arg0.aClass10_Sub4Array2);
						}
						local290.method5686(Static142.aClass50_5);
					}
				}
				Static142.aClass50_5.da(3000.0F, local53 * 1.5F);
			}
			local330 = !Static305.method4247(local15, local6, local9);
			if (local330) {
				Static332.aClass154Array3[local15].method6078(local6, local9);
				@Pc(341) Class24_Sub4 local341 = arg1.aClass24_Sub4_1;
				if (local341 != null && local341.aBoolean369) {
					if (local341.aBoolean370) {
						Static142.aClass50_5.da(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static97.aBoolean73) {
						Static159.method2691(arg0, local12, local6, local9);
						Static142.aClass50_5.method5869(arg0.anInt352, arg0.aClass10_Sub4Array2);
					}
					local377 = local341.method5686(Static142.aClass50_5);
					if (local377 != null) {
						local377.aClass24_1 = local341;
						local377.anInt4726 = local12;
						local377.anInt4724 = local6;
						local377.anInt4725 = local9;
						Static191.aClass240_2.method5225(local377);
					}
					if (local341.aBoolean370) {
						Static142.aClass50_5.da(3000.0F, local53 * 1.5F);
					}
				}
			}
			local406 = 0;
			local408 = 0;
			local411 = arg1.aClass24_Sub5_1;
			@Pc(414) Class24_Sub1 local414 = arg1.aClass24_Sub1_2;
			if (local411 != null || local414 != null) {
				if (Static18.anInt316 == local6) {
					local406++;
				} else if (Static18.anInt316 < local6) {
					local406 += 2;
				}
				if (Static265.anInt4683 == local9) {
					local406 += 3;
				} else if (Static265.anInt4683 > local9) {
					local406 += 6;
				}
				local408 = Static109.anIntArray196[local406];
				arg1.aShort2 = Static167.aShortArray49[local406];
			}
			if (local411 != null) {
				if ((local411.anInt7223 & Static214.anIntArray409[local406]) == 0) {
					arg1.aByte5 = 0;
				} else if (local411.anInt7223 == 16) {
					arg1.aByte5 = 3;
					arg1.aByte6 = Static244.aByteArray55[local406];
					arg1.aByte3 = (byte) (3 - arg1.aByte6);
				} else if (local411.anInt7223 == 32) {
					arg1.aByte5 = 6;
					arg1.aByte6 = Static427.aByteArray91[local406];
					arg1.aByte3 = (byte) (6 - arg1.aByte6);
				} else if (local411.anInt7223 == 64) {
					arg1.aByte5 = 12;
					arg1.aByte6 = Static395.aByteArray88[local406];
					arg1.aByte3 = (byte) (12 - arg1.aByte6);
				} else {
					arg1.aByte5 = 9;
					arg1.aByte6 = Static177.aByteArray48[local406];
					arg1.aByte3 = (byte) (9 - arg1.aByte6);
				}
				if ((local411.anInt7223 & local408) != 0 && !Static461.method5833(local15, local6, local9, local411.anInt7223)) {
					if (Static97.aBoolean73) {
						Static159.method2691(arg0, local12, local6, local9);
						Static142.aClass50_5.method5869(arg0.anInt352, arg0.aClass10_Sub4Array2);
					}
					@Pc(563) Class40_Sub5 local563 = local411.method5686(Static142.aClass50_5);
					if (local563 != null) {
						local563.aClass24_1 = local411;
						local563.anInt4726 = local12;
						local563.anInt4724 = local6;
						local563.anInt4725 = local9;
						Static191.aClass240_2.method5225(local563);
					}
				}
				@Pc(584) Class24_Sub5 local584 = arg1.aClass24_Sub5_2;
				if (local584 != null && (local584.anInt7223 & local408) != 0 && !Static461.method5833(local15, local6, local9, local584.anInt7223)) {
					if (Static97.aBoolean73) {
						Static159.method2691(arg0, local12, local6, local9);
						Static142.aClass50_5.method5869(arg0.anInt352, arg0.aClass10_Sub4Array2);
					}
					local616 = local584.method5686(Static142.aClass50_5);
					if (local616 != null) {
						local616.aClass24_1 = local584;
						local616.anInt4726 = local12;
						local616.anInt4724 = local6;
						local616.anInt4725 = local9;
						Static191.aClass240_2.method5225(local616);
					}
				}
			}
			if (local414 != null && !Static205.method3199(local15, local6, local9, local414.method3930())) {
				@Pc(647) Class24_Sub1 local647 = arg1.aClass24_Sub1_1;
				Static142.aClass50_5.da(3000.0F, (local53 - 0.5F) * 1.5F);
				if ((local414.anInt4869 & local408) != 0) {
					if (Static97.aBoolean73) {
						Static159.method2691(arg0, local12, local6, local9);
						Static142.aClass50_5.method5869(arg0.anInt352, arg0.aClass10_Sub4Array2);
					}
					local616 = local414.method5686(Static142.aClass50_5);
					if (local616 != null) {
						local616.aClass24_1 = local414;
						local616.anInt4726 = local12;
						local616.anInt4724 = local6;
						local616.anInt4725 = local9;
						Static191.aClass240_2.method5225(local616);
					}
				} else if (local414.anInt4869 == 256) {
					local706 = local414.anInt4861 - Static401.anInt7402;
					local711 = local414.anInt4858 - Static336.anInt5672;
					local714 = local414.anInt4870;
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
					if (Static97.aBoolean73) {
						Static159.method2691(arg0, local12, local6, local9);
						Static142.aClass50_5.method5869(arg0.anInt352, arg0.aClass10_Sub4Array2);
					}
					@Pc(759) Class40_Sub5 local759;
					if (local735 < local723) {
						local759 = local414.method5686(Static142.aClass50_5);
						if (local759 != null) {
							local759.aClass24_1 = local414;
							local759.anInt4726 = local12;
							local759.anInt4724 = local6;
							local759.anInt4725 = local9;
							Static191.aClass240_2.method5225(local759);
						}
					} else if (local647 != null) {
						local759 = local647.method5686(Static142.aClass50_5);
						if (local759 != null) {
							local759.aClass24_1 = local647;
							local759.anInt4726 = local12;
							local759.anInt4724 = local6;
							local759.anInt4725 = local9;
							Static191.aClass240_2.method5225(local759);
						}
					}
				}
				Static142.aClass50_5.da(3000.0F, local53 * 1.5F);
			}
			if (local330) {
				@Pc(814) Class24_Sub4 local814 = arg1.aClass24_Sub4_1;
				if (local814 != null && !local814.aBoolean369) {
					if (local814.aBoolean370) {
						Static142.aClass50_5.da(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static97.aBoolean73) {
						Static159.method2691(arg0, local12, local6, local9);
						Static142.aClass50_5.method5869(arg0.anInt352, arg0.aClass10_Sub4Array2);
					}
					local616 = local814.method5686(Static142.aClass50_5);
					if (local616 != null) {
						local616.aClass24_1 = local814;
						local616.anInt4726 = local12;
						local616.anInt4724 = local6;
						local616.anInt4725 = local9;
						Static191.aClass240_2.method5225(local616);
					}
					if (local814.aBoolean370) {
						Static142.aClass50_5.da(3000.0F, local53 * 1.5F);
					}
				}
				@Pc(880) Class24_Sub2 local880 = arg1.aClass24_Sub2_1;
				if (local880 != null && !local880.aBoolean215) {
					if (Static97.aBoolean73) {
						Static159.method2691(arg0, local12, local6, local9);
						Static142.aClass50_5.method5869(arg0.anInt352, arg0.aClass10_Sub4Array2);
					}
					@Pc(903) Class40_Sub5 local903 = local880.method5686(Static142.aClass50_5);
					if (local903 != null) {
						local903.aClass24_1 = local880;
						local903.anInt4726 = local12;
						local903.anInt4724 = local6;
						local903.anInt4725 = local9;
						Static191.aClass240_2.method5225(local903);
					}
				}
			}
			@Pc(924) byte local924 = arg1.aByte4;
			if (local924 != 0) {
				@Pc(941) Class11 local941;
				if (local6 < Static18.anInt316 && (local924 & 0x4) != 0) {
					local941 = local31[local6 + 1][local9];
					if (local941 != null && local941.aBoolean11) {
						Static39.aClass8_1.method3746(local941);
					}
				}
				if (local9 < Static265.anInt4683 && (local924 & 0x2) != 0) {
					local941 = local31[local6][local9 + 1];
					if (local941 != null && local941.aBoolean11) {
						Static39.aClass8_1.method3746(local941);
					}
				}
				if (local6 > Static18.anInt316 && (local924 & 0x1) != 0) {
					local941 = local31[local6 - 1][local9];
					if (local941 != null && local941.aBoolean11) {
						Static39.aClass8_1.method3746(local941);
					}
				}
				if (local9 > Static265.anInt4683 && (local924 & 0x8) != 0) {
					local941 = local31[local6][local9 - 1];
					if (local941 != null && local941.aBoolean11) {
						Static39.aClass8_1.method3746(local941);
					}
				}
			}
		}
		@Pc(1074) int local1074;
		@Pc(1057) Class24_Sub5 local1057;
		@Pc(1078) int local1078;
		@Pc(1030) Class1 local1030;
		if (arg1.aByte5 != 0) {
			local330 = true;
			for (local1030 = arg1.aClass1_3; local1030 != null; local1030 = local1030.aClass1_1) {
				if (local1030.aClass24_Sub3_1.anInt7093 != Static85.anInt7651 && (local1030.anInt1 & arg1.aByte5) == arg1.aByte6) {
					local330 = false;
					break;
				}
			}
			if (local330) {
				local1057 = arg1.aClass24_Sub5_1;
				if (!Static461.method5833(local15, local6, local9, local1057.anInt7223)) {
					if (Static97.aBoolean73) {
						label682: {
							if (local1057.anInt7223 >= 16) {
								local1074 = local6 - Static18.anInt316;
								local1078 = local9 - Static265.anInt4683;
								if (local1057.anInt7223 == 16) {
									local1074 -= Static437.anInt7214;
									local1078 += Static437.anInt7214;
									if (local1078 < local1074 && local6 > 0 && local9 <= Static24.anInt401) {
										Static159.method2691(arg0, local12, local6 - 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt7223 == 32) {
									local1074 += Static437.anInt7214;
									local1078 += Static437.anInt7214;
									if (local1078 < -local1074 && local6 < Static54.anInt998 && local9 < Static24.anInt401) {
										Static159.method2691(arg0, local12, local6 + 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt7223 == 64) {
									local1074 += Static437.anInt7214;
									local1078 -= Static437.anInt7214;
									if (local1078 > local1074 && local6 < Static54.anInt998 && local9 > 0) {
										Static159.method2691(arg0, local12, local6 + 1, local9 - 1);
										break label682;
									}
								} else if (local1057.anInt7223 == 128) {
									local1074 -= Static437.anInt7214;
									local1078 -= Static437.anInt7214;
									if (local1078 > -local1074 && local6 > 0 && local9 > 0) {
										Static159.method2691(arg0, local12, local6 - 1, local9 - 1);
										break label682;
									}
								}
							}
							Static159.method2691(arg0, local12, local6, local9);
						}
						Static142.aClass50_5.method5869(arg0.anInt352, arg0.aClass10_Sub4Array2);
					}
					@Pc(1216) Class40_Sub5 local1216 = local1057.method5686(Static142.aClass50_5);
					if (local1216 != null) {
						local1216.aClass24_1 = local1057;
						local1216.anInt4726 = local12;
						local1216.anInt4724 = local6;
						local1216.anInt4725 = local9;
						Static191.aClass240_2.method5225(local1216);
					}
				}
				arg1.aByte5 = 0;
			}
		}
		@Pc(1333) int local1333;
		if (arg1.aBoolean10) {
			try {
				arg1.aBoolean10 = false;
				@Pc(1245) int local1245 = 0;
				label625: for (local1030 = arg1.aClass1_3; local1030 != null; local1030 = local1030.aClass1_1) {
					@Pc(1252) Class24_Sub3 local1252 = local1030.aClass24_Sub3_1;
					if (local1252.anInt7093 != Static85.anInt7651) {
						for (local1074 = local1252.aShort107; local1074 <= local1252.aShort106; local1074++) {
							for (local1078 = local1252.aShort105; local1078 <= local1252.aShort104; local1078++) {
								@Pc(1270) Class11 local1270 = local31[local1074][local1078];
								if (local1270.aBoolean9) {
									arg1.aBoolean10 = true;
									continue label625;
								}
								if (local1270.aByte5 != 0) {
									local706 = 0;
									if (local1074 > local1252.aShort107) {
										local706++;
									}
									if (local1074 < local1252.aShort106) {
										local706 += 4;
									}
									if (local1078 > local1252.aShort105) {
										local706 += 8;
									}
									if (local1078 < local1252.aShort104) {
										local706 += 2;
									}
									if ((local706 & local1270.aByte5) == arg1.aByte3) {
										arg1.aBoolean10 = true;
										continue label625;
									}
								}
							}
						}
						local1078 = Static18.anInt316 - local1252.aShort107;
						local1333 = local1252.aShort106 - Static18.anInt316;
						if (local1333 > local1078) {
							local1078 = local1333;
						}
						local706 = Static265.anInt4683 - local1252.aShort105;
						local711 = local1252.aShort104 - Static265.anInt4683;
						if (local711 > local706) {
							local706 = local711;
						}
						arg0.aClass24_Sub3Array2[local1245] = local1252;
						arg0.anIntArray31[local1245++] = local1078 + local706;
					}
				}
				while (local1245 > 0) {
					local408 = -50;
					local1074 = -1;
					@Pc(1384) Class24_Sub3 local1384;
					for (local1078 = 0; local1078 < local1245; local1078++) {
						local1384 = arg0.aClass24_Sub3Array2[local1078];
						if (local1384.anInt7093 != Static85.anInt7651) {
							local706 = arg0.anIntArray31[local1078];
							if (local706 > local408) {
								local408 = local706;
								local1074 = local1078;
							} else if (local706 == local408) {
								local711 = local1384.anInt7092 - Static401.anInt7402;
								local714 = local1384.anInt7094 - Static336.anInt5672;
								local723 = arg0.aClass24_Sub3Array2[local1074].anInt7092 - Static401.anInt7402;
								local735 = arg0.aClass24_Sub3Array2[local1074].anInt7094 - Static336.anInt5672;
								if (local711 * local711 + local714 * local714 > local723 * local723 + local735 * local735) {
									local1074 = local1078;
								}
							}
						}
					}
					if (local1074 == -1) {
						break;
					}
					local1384 = arg0.aClass24_Sub3Array2[local1074];
					local1384.anInt7093 = Static85.anInt7651;
					if (!Static73.method1393(local15, local1384.aShort107, local1384.aShort106, local1384.aShort105, local1384.aShort104, local1384.method5579())) {
						if (Static97.aBoolean73) {
							if (local1384.aByte97 == 0) {
								Static54.method937(arg0, local12, local1384.aShort107, local1384.aShort105, local1384.aShort106, local1384.aShort104);
							} else {
								Static159.method2691(arg0, local12, local6, local9);
								local706 = local6 - Static18.anInt316;
								local711 = local9 - Static265.anInt4683;
								if (local1384.aByte97 == 2) {
									if (local711 > -local706) {
										Static158.method2684(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static158.method2684(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local711 > local706) {
									Static158.method2684(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static158.method2684(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static142.aClass50_5.method5869(arg0.anInt352, arg0.aClass10_Sub4Array2);
						}
						local616 = local1384.method5686(Static142.aClass50_5);
						if (local616 != null) {
							local616.aClass24_1 = local1384;
							local616.anInt4726 = local12;
							local616.anInt4724 = local1384.aShort107;
							local616.anInt4725 = local1384.aShort105;
							Static191.aClass240_2.method5225(local616);
						}
					}
					for (local706 = local1384.aShort107; local706 <= local1384.aShort106; local706++) {
						for (local711 = local1384.aShort105; local711 <= local1384.aShort104; local711++) {
							@Pc(1609) Class11 local1609 = local31[local706][local711];
							if (local1609.aByte5 != 0) {
								Static39.aClass8_1.method3746(local1609);
							} else if ((local706 != local6 || local711 != local9) && local1609.aBoolean11) {
								Static39.aClass8_1.method3746(local1609);
							}
						}
					}
				}
				if (arg1.aBoolean10) {
					return;
				}
			} catch (@Pc(1647) Exception local1647) {
				arg1.aBoolean10 = false;
			}
		}
		if (arg1.aClass121_1 != null && arg1.aByte2 == (byte) (Static65.anInt1178 & 0xFF)) {
			@Pc(1664) Class121 local1664 = arg1.aClass121_1;
			local406 = Static332.aClass154Array3[local12].ua(local6, local9);
			if (local12 < Static285.anInt5004 - 1) {
				local408 = Static332.aClass154Array3[local12].ua(local6, local9) - Static332.aClass154Array3[local12 + 1].ua(local6, local9);
			} else {
				local408 = 0x8 << Static286.anInt5018;
			}
			Static364.aClass34_5.method5773(local21, local406, local27, arg0.anIntArray32);
			local1074 = arg0.anIntArray32[2];
			Static364.aClass34_5.method5773(local21, local406 - local408, local27, arg0.anIntArray32);
			local1078 = arg0.anIntArray32[2];
			local1333 = local1074;
			local706 = local1078;
			if (local1074 > local1078) {
				local1333 = local1078;
				local706 = local1074;
			}
			local1333 -= Static430.anInt7236;
			local706 += Static430.anInt7236;
			local1664.anInt3668 = local1333;
			local1664.anInt3667 = local706;
			local1664.aBoolean237 = true;
			Static142.aClass50_5.method5855(local1664);
		}
		if (!arg1.aBoolean11) {
			return;
		}
		if (arg1.aByte5 != 0) {
			return;
		}
		if (local6 <= Static18.anInt316 && local6 > Static12.anInt226) {
			local86 = local31[local6 - 1][local9];
			if (local86 != null && local86.aBoolean11) {
				return;
			}
		}
		if (local6 >= Static18.anInt316 && local6 < Static430.anInt7228 - 1) {
			local86 = local31[local6 + 1][local9];
			if (local86 != null && local86.aBoolean11) {
				return;
			}
		}
		if (local9 <= Static265.anInt4683 && local9 > Static137.anInt2871) {
			local86 = local31[local6][local9 - 1];
			if (local86 != null && local86.aBoolean11) {
				return;
			}
		}
		if (local9 >= Static265.anInt4683 && local9 < Static256.anInt4594 - 1) {
			local86 = local31[local6][local9 + 1];
			if (local86 != null && local86.aBoolean11) {
				return;
			}
		}
		arg1.aBoolean11 = false;
		Static168.anInt3351--;
		@Pc(1855) Class24_Sub2 local1855 = arg1.aClass24_Sub2_1;
		if (local1855 != null && local1855.aBoolean215) {
			if (Static97.aBoolean73) {
				Static159.method2691(arg0, local12, local6, local9);
				Static142.aClass50_5.method5869(arg0.anInt352, arg0.aClass10_Sub4Array2);
			}
			@Pc(1878) Class40_Sub5 local1878 = local1855.method5686(Static142.aClass50_5);
			if (local1878 != null) {
				local1878.aClass24_1 = local1855;
				local1878.anInt4726 = local12;
				local1878.anInt4724 = local6;
				local1878.anInt4725 = local9;
				Static191.aClass240_2.method5225(local1878);
			}
		}
		if (arg1.aShort2 != 0) {
			@Pc(1902) Class24_Sub1 local1902 = arg1.aClass24_Sub1_2;
			if (local1902 != null && !Static205.method3199(local15, local6, local9, local1902.method3930())) {
				if ((local1902.anInt4869 & arg1.aShort2) != 0) {
					if (Static97.aBoolean73) {
						Static159.method2691(arg0, local12, local6, local9);
						Static142.aClass50_5.method5869(arg0.anInt352, arg0.aClass10_Sub4Array2);
					}
					local377 = local1902.method5686(Static142.aClass50_5);
					if (local377 != null) {
						local377.aClass24_1 = local1902;
						local377.anInt4726 = local12;
						local377.anInt4724 = local6;
						local377.anInt4725 = local9;
						Static191.aClass240_2.method5225(local377);
					}
				} else if (local1902.anInt4869 == 256) {
					local408 = local1902.anInt4861 - Static401.anInt7402;
					local1074 = local1902.anInt4858 - Static336.anInt5672;
					local1078 = local1902.anInt4870;
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
					if (Static97.aBoolean73) {
						Static159.method2691(arg0, local12, local6, local9);
						Static142.aClass50_5.method5869(arg0.anInt352, arg0.aClass10_Sub4Array2);
					}
					@Pc(2012) Class24_Sub1 local2012 = arg1.aClass24_Sub1_1;
					@Pc(2020) Class40_Sub5 local2020;
					if (local706 > local1333) {
						local2020 = local1902.method5686(Static142.aClass50_5);
						if (local2020 != null) {
							local2020.aClass24_1 = local1902;
							local2020.anInt4726 = local12;
							local2020.anInt4724 = local6;
							local2020.anInt4725 = local9;
							Static191.aClass240_2.method5225(local2020);
						}
					} else if (local2012 != null) {
						local2020 = local2012.method5686(Static142.aClass50_5);
						if (local2020 != null) {
							local2020.aClass24_1 = local2012;
							local2020.anInt4726 = local12;
							local2020.anInt4724 = local6;
							local2020.anInt4725 = local9;
							Static191.aClass240_2.method5225(local2020);
						}
					}
				}
			}
			local1057 = arg1.aClass24_Sub5_1;
			local411 = arg1.aClass24_Sub5_2;
			@Pc(2105) Class40_Sub5 local2105;
			if (local411 != null && (local411.anInt7223 & arg1.aShort2) != 0 && !Static461.method5833(local15, local6, local9, local411.anInt7223)) {
				if (Static97.aBoolean73) {
					Static195.method3108(arg0, local411.anInt7223, local12, local6, local9);
					Static142.aClass50_5.method5869(arg0.anInt352, arg0.aClass10_Sub4Array2);
				}
				local2105 = local411.method5686(Static142.aClass50_5);
				if (local2105 != null) {
					local2105.aClass24_1 = local411;
					local2105.anInt4726 = local12;
					local2105.anInt4724 = local6;
					local2105.anInt4725 = local9;
					Static191.aClass240_2.method5225(local2105);
				}
			}
			if (local1057 != null && (local1057.anInt7223 & arg1.aShort2) != 0 && !Static461.method5833(local15, local6, local9, local1057.anInt7223)) {
				if (Static97.aBoolean73) {
					Static195.method3108(arg0, local1057.anInt7223, local12, local6, local9);
					Static142.aClass50_5.method5869(arg0.anInt352, arg0.aClass10_Sub4Array2);
				}
				local2105 = local1057.method5686(Static142.aClass50_5);
				if (local2105 != null) {
					local2105.aClass24_1 = local1057;
					local2105.anInt4726 = local12;
					local2105.anInt4724 = local6;
					local2105.anInt4725 = local9;
					Static191.aClass240_2.method5225(local2105);
				}
			}
		}
		@Pc(2191) Class11 local2191;
		if (local12 < Static285.anInt5004 - 1) {
			local2191 = Static309.aClass11ArrayArrayArray2[local12 + 1][local6][local9];
			if (local2191 != null && local2191.aBoolean11) {
				Static39.aClass8_1.method3757(local2191);
			}
		}
		if (local6 < Static18.anInt316) {
			local2191 = local31[local6 + 1][local9];
			if (local2191 != null && local2191.aBoolean11) {
				Static39.aClass8_1.method3746(local2191);
			}
		}
		if (local9 < Static265.anInt4683) {
			local2191 = local31[local6][local9 + 1];
			if (local2191 != null && local2191.aBoolean11) {
				Static39.aClass8_1.method3746(local2191);
			}
		}
		if (local6 > Static18.anInt316) {
			local2191 = local31[local6 - 1][local9];
			if (local2191 != null && local2191.aBoolean11) {
				Static39.aClass8_1.method3746(local2191);
			}
		}
		if (local9 > Static265.anInt4683) {
			local2191 = local31[local6][local9 - 1];
			if (local2191 != null && local2191.aBoolean11) {
				Static39.aClass8_1.method3746(local2191);
			}
		}
	}
}
