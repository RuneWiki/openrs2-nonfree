import jaggl.OpenGL;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!mq", name = "B", descriptor = "Lclient!sr;")
	public static final Class227 aClass227_28 = new Class227();

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(BII)I")
	public static int method3662(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(49) int local49 = Static265.method3750(arg0 - 1, arg1 + -1) + Static265.method3750(arg0 + 1, arg1 + -1) + Static265.method3750(arg0 - 1, arg1 - -1) + Static265.method3750(arg0 + 1, arg1 + 1);
		@Pc(80) int local80 = Static265.method3750(arg0 - 1, arg1) + Static265.method3750(arg0 + 1, arg1) + Static265.method3750(arg0, arg1 - 1) + Static265.method3750(arg0, arg1 - -1);
		@Pc(85) int local85 = Static265.method3750(arg0, arg1);
		return local85 / 4 + local80 / 8 + local49 / 16;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Ljava/awt/Component;BZ)Lclient!gv;")
	public static Class96 method3665(@OriginalArg(0) Component arg0) {
		return new Class96_Sub1(arg0, true);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lclient!ii;Lclient!no;)V")
	public static void method3670(@OriginalArg(0) Class111 arg0, @OriginalArg(1) Class169 arg1) {
		if (!arg1.aBoolean551) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort80;
		@Pc(9) short local9 = arg1.aShort81;
		@Pc(12) byte local12 = arg1.aByte83;
		@Pc(15) byte local15 = arg1.aByte81;
		@Pc(21) int local21 = (local6 << Static215.anInt4460) + Static341.anInt5832;
		@Pc(27) int local27 = (local9 << Static215.anInt4460) + Static341.anInt5832;
		@Pc(31) Class169[][] local31 = Static359.aClass169ArrayArrayArray5[local12];
		@Pc(53) float local53;
		if (Static343.aClass157Array3 == Static94.aClass157Array1) {
			Static52.aClass34_1.a(Static330.aClass157Array2[0].ca(local21, local27), Static420.method5575(local6, local9), Static115.method1818(local6, local9), Static238.method3445(local6, local9));
			local53 = 251.5F;
		} else {
			local53 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static52.aClass34_1.da(3000.0F, local53 * 1.5F);
		@Pc(86) Class169 local86;
		@Pc(616) Class4_Sub7 local616;
		@Pc(711) int local711;
		@Pc(714) int local714;
		@Pc(723) int local723;
		@Pc(735) int local735;
		@Pc(406) int local406;
		@Pc(330) boolean local330;
		@Pc(377) Class4_Sub7 local377;
		@Pc(408) int local408;
		@Pc(411) Class25_Sub4 local411;
		@Pc(706) int local706;
		if (arg1.aBoolean549) {
			if (Static410.aBoolean670) {
				if (local12 > 0) {
					local86 = Static359.aClass169ArrayArrayArray5[local12 - 1][local6][local9];
					if (local86 != null && local86.aBoolean551) {
						return;
					}
				}
				if (local6 <= Static321.anInt5494 && local6 > Static235.anInt4212) {
					local86 = local31[local6 - 1][local9];
					if (local86 != null && local86.aBoolean551 && (local86.aBoolean549 || (arg1.aByte80 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static321.anInt5494 && local6 < Static181.anInt3166 - 1) {
					local86 = local31[local6 + 1][local9];
					if (local86 != null && local86.aBoolean551 && (local86.aBoolean549 || (arg1.aByte80 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static64.anInt1211 && local9 > Static54.anInt974) {
					local86 = local31[local6][local9 - 1];
					if (local86 != null && local86.aBoolean551 && (local86.aBoolean549 || (arg1.aByte80 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static64.anInt1211 && local9 < Static202.anInt3561 - 1) {
					local86 = local31[local6][local9 + 1];
					if (local86 != null && local86.aBoolean551 && (local86.aBoolean549 || (arg1.aByte80 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static410.aBoolean670 = true;
			}
			arg1.aBoolean549 = false;
			if (arg1.aClass169_1 != null) {
				local86 = arg1.aClass169_1;
				Static52.aClass34_1.da(3000.0F, (201.5F - (float) (local86.aByte81 + 1) * 50.0F) * 1.5F);
				if (!Static160.method2326(local86.aByte81, local6, local9)) {
					Static94.aClass157Array1[local86.aByte81].method4945(local6, local9);
				}
				@Pc(249) Class25_Sub4 local249 = local86.aClass25_Sub4_2;
				if (local249 != null) {
					if (Static69.aBoolean148) {
						if ((local249.anInt5873 & arg1.aShort79) == 0) {
							Static1.method12(arg0, local12, local6, local9);
						} else {
							Static193.method2788(arg0, local249.anInt5873, local15, local6, local9);
						}
						Static52.aClass34_1.method5730(arg0.anInt6702, arg0.aClass1_Sub7Array2);
					}
					local249.method4600(Static52.aClass34_1);
				}
				for (@Pc(286) Class27 local286 = local86.aClass27_3; local286 != null; local286 = local286.aClass27_1) {
					@Pc(290) Class25_Sub5 local290 = local286.aClass25_Sub5_1;
					if (local290 != null) {
						if (Static69.aBoolean148) {
							Static1.method12(arg0, local12, local6, local9);
							Static52.aClass34_1.method5730(arg0.anInt6702, arg0.aClass1_Sub7Array2);
						}
						local290.method4600(Static52.aClass34_1);
					}
				}
				Static52.aClass34_1.da(3000.0F, local53 * 1.5F);
			}
			local330 = !Static160.method2326(local15, local6, local9);
			if (local330) {
				Static94.aClass157Array1[local15].method4945(local6, local9);
				@Pc(341) Class25_Sub2 local341 = arg1.aClass25_Sub2_2;
				if (local341 != null && local341.aBoolean545) {
					if (local341.aBoolean544) {
						Static52.aClass34_1.da(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static69.aBoolean148) {
						Static1.method12(arg0, local12, local6, local9);
						Static52.aClass34_1.method5730(arg0.anInt6702, arg0.aClass1_Sub7Array2);
					}
					local377 = local341.method4600(Static52.aClass34_1);
					if (local377 != null) {
						local377.aClass25_1 = local341;
						local377.anInt6690 = local12;
						local377.anInt6684 = local6;
						local377.anInt6692 = local9;
						Static252.aClass262_10.method5815(local377);
					}
					if (local341.aBoolean544) {
						Static52.aClass34_1.da(3000.0F, local53 * 1.5F);
					}
				}
			}
			local406 = 0;
			local408 = 0;
			local411 = arg1.aClass25_Sub4_2;
			@Pc(414) Class25_Sub1 local414 = arg1.aClass25_Sub1_2;
			if (local411 != null || local414 != null) {
				if (Static321.anInt5494 == local6) {
					local406++;
				} else if (Static321.anInt5494 < local6) {
					local406 += 2;
				}
				if (Static64.anInt1211 == local9) {
					local406 += 3;
				} else if (Static64.anInt1211 > local9) {
					local406 += 6;
				}
				local408 = Static94.anIntArray119[local406];
				arg1.aShort79 = Static380.aShortArray101[local406];
			}
			if (local411 != null) {
				if ((local411.anInt5873 & Static450.anIntArray509[local406]) == 0) {
					arg1.aByte82 = 0;
				} else if (local411.anInt5873 == 16) {
					arg1.aByte82 = 3;
					arg1.aByte85 = Static249.aByteArray54[local406];
					arg1.aByte79 = (byte) (3 - arg1.aByte85);
				} else if (local411.anInt5873 == 32) {
					arg1.aByte82 = 6;
					arg1.aByte85 = Static172.aByteArray34[local406];
					arg1.aByte79 = (byte) (6 - arg1.aByte85);
				} else if (local411.anInt5873 == 64) {
					arg1.aByte82 = 12;
					arg1.aByte85 = Static269.aByteArray56[local406];
					arg1.aByte79 = (byte) (12 - arg1.aByte85);
				} else {
					arg1.aByte82 = 9;
					arg1.aByte85 = Static145.aByteArray19[local406];
					arg1.aByte79 = (byte) (9 - arg1.aByte85);
				}
				if ((local411.anInt5873 & local408) != 0 && !Static457.method5947(local15, local6, local9, local411.anInt5873)) {
					if (Static69.aBoolean148) {
						Static1.method12(arg0, local12, local6, local9);
						Static52.aClass34_1.method5730(arg0.anInt6702, arg0.aClass1_Sub7Array2);
					}
					@Pc(563) Class4_Sub7 local563 = local411.method4600(Static52.aClass34_1);
					if (local563 != null) {
						local563.aClass25_1 = local411;
						local563.anInt6690 = local12;
						local563.anInt6684 = local6;
						local563.anInt6692 = local9;
						Static252.aClass262_10.method5815(local563);
					}
				}
				@Pc(584) Class25_Sub4 local584 = arg1.aClass25_Sub4_1;
				if (local584 != null && (local584.anInt5873 & local408) != 0 && !Static457.method5947(local15, local6, local9, local584.anInt5873)) {
					if (Static69.aBoolean148) {
						Static1.method12(arg0, local12, local6, local9);
						Static52.aClass34_1.method5730(arg0.anInt6702, arg0.aClass1_Sub7Array2);
					}
					local616 = local584.method4600(Static52.aClass34_1);
					if (local616 != null) {
						local616.aClass25_1 = local584;
						local616.anInt6690 = local12;
						local616.anInt6684 = local6;
						local616.anInt6692 = local9;
						Static252.aClass262_10.method5815(local616);
					}
				}
			}
			if (local414 != null && !Static381.method5019(local15, local6, local9, local414.method4207())) {
				@Pc(647) Class25_Sub1 local647 = arg1.aClass25_Sub1_3;
				Static52.aClass34_1.da(3000.0F, (local53 - 0.5F) * 1.5F);
				if ((local414.anInt5357 & local408) != 0) {
					if (Static69.aBoolean148) {
						Static1.method12(arg0, local12, local6, local9);
						Static52.aClass34_1.method5730(arg0.anInt6702, arg0.aClass1_Sub7Array2);
					}
					local616 = local414.method4600(Static52.aClass34_1);
					if (local616 != null) {
						local616.aClass25_1 = local414;
						local616.anInt6690 = local12;
						local616.anInt6684 = local6;
						local616.anInt6692 = local9;
						Static252.aClass262_10.method5815(local616);
					}
				} else if (local414.anInt5357 == 256) {
					local706 = local414.anInt5351 - Static111.anInt2102;
					local711 = local414.anInt5355 - Static330.anInt5627;
					local714 = local414.anInt5354;
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
					if (Static69.aBoolean148) {
						Static1.method12(arg0, local12, local6, local9);
						Static52.aClass34_1.method5730(arg0.anInt6702, arg0.aClass1_Sub7Array2);
					}
					@Pc(759) Class4_Sub7 local759;
					if (local735 < local723) {
						local759 = local414.method4600(Static52.aClass34_1);
						if (local759 != null) {
							local759.aClass25_1 = local414;
							local759.anInt6690 = local12;
							local759.anInt6684 = local6;
							local759.anInt6692 = local9;
							Static252.aClass262_10.method5815(local759);
						}
					} else if (local647 != null) {
						local759 = local647.method4600(Static52.aClass34_1);
						if (local759 != null) {
							local759.aClass25_1 = local647;
							local759.anInt6690 = local12;
							local759.anInt6684 = local6;
							local759.anInt6692 = local9;
							Static252.aClass262_10.method5815(local759);
						}
					}
				}
				Static52.aClass34_1.da(3000.0F, local53 * 1.5F);
			}
			if (local330) {
				@Pc(814) Class25_Sub2 local814 = arg1.aClass25_Sub2_2;
				if (local814 != null && !local814.aBoolean545) {
					if (local814.aBoolean544) {
						Static52.aClass34_1.da(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static69.aBoolean148) {
						Static1.method12(arg0, local12, local6, local9);
						Static52.aClass34_1.method5730(arg0.anInt6702, arg0.aClass1_Sub7Array2);
					}
					local616 = local814.method4600(Static52.aClass34_1);
					if (local616 != null) {
						local616.aClass25_1 = local814;
						local616.anInt6690 = local12;
						local616.anInt6684 = local6;
						local616.anInt6692 = local9;
						Static252.aClass262_10.method5815(local616);
					}
					if (local814.aBoolean544) {
						Static52.aClass34_1.da(3000.0F, local53 * 1.5F);
					}
				}
				@Pc(880) Class25_Sub3 local880 = arg1.aClass25_Sub3_1;
				if (local880 != null && !local880.aBoolean175) {
					if (Static69.aBoolean148) {
						Static1.method12(arg0, local12, local6, local9);
						Static52.aClass34_1.method5730(arg0.anInt6702, arg0.aClass1_Sub7Array2);
					}
					@Pc(903) Class4_Sub7 local903 = local880.method4600(Static52.aClass34_1);
					if (local903 != null) {
						local903.aClass25_1 = local880;
						local903.anInt6690 = local12;
						local903.anInt6684 = local6;
						local903.anInt6692 = local9;
						Static252.aClass262_10.method5815(local903);
					}
				}
			}
			@Pc(924) byte local924 = arg1.aByte80;
			if (local924 != 0) {
				@Pc(941) Class169 local941;
				if (local6 < Static321.anInt5494 && (local924 & 0x4) != 0) {
					local941 = local31[local6 + 1][local9];
					if (local941 != null && local941.aBoolean551) {
						Static344.aClass58_1.method3489(local941);
					}
				}
				if (local9 < Static64.anInt1211 && (local924 & 0x2) != 0) {
					local941 = local31[local6][local9 + 1];
					if (local941 != null && local941.aBoolean551) {
						Static344.aClass58_1.method3489(local941);
					}
				}
				if (local6 > Static321.anInt5494 && (local924 & 0x1) != 0) {
					local941 = local31[local6 - 1][local9];
					if (local941 != null && local941.aBoolean551) {
						Static344.aClass58_1.method3489(local941);
					}
				}
				if (local9 > Static64.anInt1211 && (local924 & 0x8) != 0) {
					local941 = local31[local6][local9 - 1];
					if (local941 != null && local941.aBoolean551) {
						Static344.aClass58_1.method3489(local941);
					}
				}
			}
		}
		@Pc(1074) int local1074;
		@Pc(1057) Class25_Sub4 local1057;
		@Pc(1078) int local1078;
		@Pc(1030) Class27 local1030;
		if (arg1.aByte82 != 0) {
			local330 = true;
			for (local1030 = arg1.aClass27_3; local1030 != null; local1030 = local1030.aClass27_1) {
				if (local1030.aClass25_Sub5_1.anInt5513 != Static172.anInt2813 && (local1030.anInt686 & arg1.aByte82) == arg1.aByte85) {
					local330 = false;
					break;
				}
			}
			if (local330) {
				local1057 = arg1.aClass25_Sub4_2;
				if (!Static457.method5947(local15, local6, local9, local1057.anInt5873)) {
					if (Static69.aBoolean148) {
						label682: {
							if (local1057.anInt5873 >= 16) {
								local1074 = local6 - Static321.anInt5494;
								local1078 = local9 - Static64.anInt1211;
								if (local1057.anInt5873 == 16) {
									local1074 -= Static341.anInt5832;
									local1078 += Static341.anInt5832;
									if (local1078 < local1074 && local6 > 0 && local9 <= Static408.anInt6716) {
										Static1.method12(arg0, local12, local6 - 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt5873 == 32) {
									local1074 += Static341.anInt5832;
									local1078 += Static341.anInt5832;
									if (local1078 < -local1074 && local6 < Static37.anInt666 && local9 < Static408.anInt6716) {
										Static1.method12(arg0, local12, local6 + 1, local9 + 1);
										break label682;
									}
								} else if (local1057.anInt5873 == 64) {
									local1074 += Static341.anInt5832;
									local1078 -= Static341.anInt5832;
									if (local1078 > local1074 && local6 < Static37.anInt666 && local9 > 0) {
										Static1.method12(arg0, local12, local6 + 1, local9 - 1);
										break label682;
									}
								} else if (local1057.anInt5873 == 128) {
									local1074 -= Static341.anInt5832;
									local1078 -= Static341.anInt5832;
									if (local1078 > -local1074 && local6 > 0 && local9 > 0) {
										Static1.method12(arg0, local12, local6 - 1, local9 - 1);
										break label682;
									}
								}
							}
							Static1.method12(arg0, local12, local6, local9);
						}
						Static52.aClass34_1.method5730(arg0.anInt6702, arg0.aClass1_Sub7Array2);
					}
					@Pc(1216) Class4_Sub7 local1216 = local1057.method4600(Static52.aClass34_1);
					if (local1216 != null) {
						local1216.aClass25_1 = local1057;
						local1216.anInt6690 = local12;
						local1216.anInt6684 = local6;
						local1216.anInt6692 = local9;
						Static252.aClass262_10.method5815(local1216);
					}
				}
				arg1.aByte82 = 0;
			}
		}
		@Pc(1333) int local1333;
		if (arg1.aBoolean550) {
			try {
				arg1.aBoolean550 = false;
				@Pc(1245) int local1245 = 0;
				label625: for (local1030 = arg1.aClass27_3; local1030 != null; local1030 = local1030.aClass27_1) {
					@Pc(1252) Class25_Sub5 local1252 = local1030.aClass25_Sub5_1;
					if (local1252.anInt5513 != Static172.anInt2813) {
						for (local1074 = local1252.aShort97; local1074 <= local1252.aShort96; local1074++) {
							for (local1078 = local1252.aShort94; local1078 <= local1252.aShort95; local1078++) {
								@Pc(1270) Class169 local1270 = local31[local1074][local1078];
								if (local1270.aBoolean549) {
									arg1.aBoolean550 = true;
									continue label625;
								}
								if (local1270.aByte82 != 0) {
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
									if ((local706 & local1270.aByte82) == arg1.aByte79) {
										arg1.aBoolean550 = true;
										continue label625;
									}
								}
							}
						}
						local1078 = Static321.anInt5494 - local1252.aShort97;
						local1333 = local1252.aShort96 - Static321.anInt5494;
						if (local1333 > local1078) {
							local1078 = local1333;
						}
						local706 = Static64.anInt1211 - local1252.aShort94;
						local711 = local1252.aShort95 - Static64.anInt1211;
						if (local711 > local706) {
							local706 = local711;
						}
						arg0.aClass25_Sub5Array3[local1245] = local1252;
						arg0.anIntArray453[local1245++] = local1078 + local706;
					}
				}
				while (local1245 > 0) {
					local408 = -50;
					local1074 = -1;
					@Pc(1384) Class25_Sub5 local1384;
					for (local1078 = 0; local1078 < local1245; local1078++) {
						local1384 = arg0.aClass25_Sub5Array3[local1078];
						if (local1384.anInt5513 != Static172.anInt2813) {
							local706 = arg0.anIntArray453[local1078];
							if (local706 > local408) {
								local408 = local706;
								local1074 = local1078;
							} else if (local706 == local408) {
								local711 = local1384.anInt5518 - Static111.anInt2102;
								local714 = local1384.anInt5514 - Static330.anInt5627;
								local723 = arg0.aClass25_Sub5Array3[local1074].anInt5518 - Static111.anInt2102;
								local735 = arg0.aClass25_Sub5Array3[local1074].anInt5514 - Static330.anInt5627;
								if (local711 * local711 + local714 * local714 > local723 * local723 + local735 * local735) {
									local1074 = local1078;
								}
							}
						}
					}
					if (local1074 == -1) {
						break;
					}
					local1384 = arg0.aClass25_Sub5Array3[local1074];
					local1384.anInt5513 = Static172.anInt2813;
					if (!Static296.method4066(local15, local1384.aShort97, local1384.aShort96, local1384.aShort94, local1384.aShort95, local1384.method4341())) {
						if (Static69.aBoolean148) {
							if (local1384.aByte95 == 0) {
								Static465.method3490(arg0, local12, local1384.aShort97, local1384.aShort94, local1384.aShort96, local1384.aShort95);
							} else {
								Static1.method12(arg0, local12, local6, local9);
								local706 = local6 - Static321.anInt5494;
								local711 = local9 - Static64.anInt1211;
								if (local1384.aByte95 == 2) {
									if (local711 > -local706) {
										Static456.method5945(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static456.method5945(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local711 > local706) {
									Static456.method5945(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static456.method5945(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static52.aClass34_1.method5730(arg0.anInt6702, arg0.aClass1_Sub7Array2);
						}
						local616 = local1384.method4600(Static52.aClass34_1);
						if (local616 != null) {
							local616.aClass25_1 = local1384;
							local616.anInt6690 = local12;
							local616.anInt6684 = local1384.aShort97;
							local616.anInt6692 = local1384.aShort94;
							Static252.aClass262_10.method5815(local616);
						}
					}
					for (local706 = local1384.aShort97; local706 <= local1384.aShort96; local706++) {
						for (local711 = local1384.aShort94; local711 <= local1384.aShort95; local711++) {
							@Pc(1609) Class169 local1609 = local31[local706][local711];
							if (local1609.aByte82 != 0) {
								Static344.aClass58_1.method3489(local1609);
							} else if ((local706 != local6 || local711 != local9) && local1609.aBoolean551) {
								Static344.aClass58_1.method3489(local1609);
							}
						}
					}
				}
				if (arg1.aBoolean550) {
					return;
				}
			} catch (@Pc(1647) Exception local1647) {
				arg1.aBoolean550 = false;
			}
		}
		if (arg1.aClass71_2 != null && arg1.aByte84 == (byte) (Static284.anInt4999 & 0xFF)) {
			@Pc(1664) Class71 local1664 = arg1.aClass71_2;
			local406 = Static94.aClass157Array1[local12].ua(local6, local9);
			if (local12 < Static105.anInt1943 - 1) {
				local408 = Static94.aClass157Array1[local12].ua(local6, local9) - Static94.aClass157Array1[local12 + 1].ua(local6, local9);
			} else {
				local408 = 0x8 << Static215.anInt4460;
			}
			Static270.aClass32_7.method4308(local21, local406, local27, arg0.anIntArray454);
			local1074 = arg0.anIntArray454[2];
			Static270.aClass32_7.method4308(local21, local406 - local408, local27, arg0.anIntArray454);
			local1078 = arg0.anIntArray454[2];
			local1333 = local1074;
			local706 = local1078;
			if (local1074 > local1078) {
				local1333 = local1078;
				local706 = local1074;
			}
			local1333 -= Static309.anInt5377;
			local706 += Static309.anInt5377;
			local1664.anInt1850 = local1333;
			local1664.anInt1849 = local706;
			local1664.aBoolean218 = true;
			Static52.aClass34_1.method5741(local1664);
		}
		if (!arg1.aBoolean551) {
			return;
		}
		if (arg1.aByte82 != 0) {
			return;
		}
		if (local6 <= Static321.anInt5494 && local6 > Static235.anInt4212) {
			local86 = local31[local6 - 1][local9];
			if (local86 != null && local86.aBoolean551) {
				return;
			}
		}
		if (local6 >= Static321.anInt5494 && local6 < Static181.anInt3166 - 1) {
			local86 = local31[local6 + 1][local9];
			if (local86 != null && local86.aBoolean551) {
				return;
			}
		}
		if (local9 <= Static64.anInt1211 && local9 > Static54.anInt974) {
			local86 = local31[local6][local9 - 1];
			if (local86 != null && local86.aBoolean551) {
				return;
			}
		}
		if (local9 >= Static64.anInt1211 && local9 < Static202.anInt3561 - 1) {
			local86 = local31[local6][local9 + 1];
			if (local86 != null && local86.aBoolean551) {
				return;
			}
		}
		arg1.aBoolean551 = false;
		Static19.anInt400--;
		@Pc(1855) Class25_Sub3 local1855 = arg1.aClass25_Sub3_1;
		if (local1855 != null && local1855.aBoolean175) {
			if (Static69.aBoolean148) {
				Static1.method12(arg0, local12, local6, local9);
				Static52.aClass34_1.method5730(arg0.anInt6702, arg0.aClass1_Sub7Array2);
			}
			@Pc(1878) Class4_Sub7 local1878 = local1855.method4600(Static52.aClass34_1);
			if (local1878 != null) {
				local1878.aClass25_1 = local1855;
				local1878.anInt6690 = local12;
				local1878.anInt6684 = local6;
				local1878.anInt6692 = local9;
				Static252.aClass262_10.method5815(local1878);
			}
		}
		if (arg1.aShort79 != 0) {
			@Pc(1902) Class25_Sub1 local1902 = arg1.aClass25_Sub1_2;
			if (local1902 != null && !Static381.method5019(local15, local6, local9, local1902.method4207())) {
				if ((local1902.anInt5357 & arg1.aShort79) != 0) {
					if (Static69.aBoolean148) {
						Static1.method12(arg0, local12, local6, local9);
						Static52.aClass34_1.method5730(arg0.anInt6702, arg0.aClass1_Sub7Array2);
					}
					local377 = local1902.method4600(Static52.aClass34_1);
					if (local377 != null) {
						local377.aClass25_1 = local1902;
						local377.anInt6690 = local12;
						local377.anInt6684 = local6;
						local377.anInt6692 = local9;
						Static252.aClass262_10.method5815(local377);
					}
				} else if (local1902.anInt5357 == 256) {
					local408 = local1902.anInt5351 - Static111.anInt2102;
					local1074 = local1902.anInt5355 - Static330.anInt5627;
					local1078 = local1902.anInt5354;
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
					if (Static69.aBoolean148) {
						Static1.method12(arg0, local12, local6, local9);
						Static52.aClass34_1.method5730(arg0.anInt6702, arg0.aClass1_Sub7Array2);
					}
					@Pc(2012) Class25_Sub1 local2012 = arg1.aClass25_Sub1_3;
					@Pc(2020) Class4_Sub7 local2020;
					if (local706 > local1333) {
						local2020 = local1902.method4600(Static52.aClass34_1);
						if (local2020 != null) {
							local2020.aClass25_1 = local1902;
							local2020.anInt6690 = local12;
							local2020.anInt6684 = local6;
							local2020.anInt6692 = local9;
							Static252.aClass262_10.method5815(local2020);
						}
					} else if (local2012 != null) {
						local2020 = local2012.method4600(Static52.aClass34_1);
						if (local2020 != null) {
							local2020.aClass25_1 = local2012;
							local2020.anInt6690 = local12;
							local2020.anInt6684 = local6;
							local2020.anInt6692 = local9;
							Static252.aClass262_10.method5815(local2020);
						}
					}
				}
			}
			local1057 = arg1.aClass25_Sub4_2;
			local411 = arg1.aClass25_Sub4_1;
			@Pc(2105) Class4_Sub7 local2105;
			if (local411 != null && (local411.anInt5873 & arg1.aShort79) != 0 && !Static457.method5947(local15, local6, local9, local411.anInt5873)) {
				if (Static69.aBoolean148) {
					Static193.method2788(arg0, local411.anInt5873, local12, local6, local9);
					Static52.aClass34_1.method5730(arg0.anInt6702, arg0.aClass1_Sub7Array2);
				}
				local2105 = local411.method4600(Static52.aClass34_1);
				if (local2105 != null) {
					local2105.aClass25_1 = local411;
					local2105.anInt6690 = local12;
					local2105.anInt6684 = local6;
					local2105.anInt6692 = local9;
					Static252.aClass262_10.method5815(local2105);
				}
			}
			if (local1057 != null && (local1057.anInt5873 & arg1.aShort79) != 0 && !Static457.method5947(local15, local6, local9, local1057.anInt5873)) {
				if (Static69.aBoolean148) {
					Static193.method2788(arg0, local1057.anInt5873, local12, local6, local9);
					Static52.aClass34_1.method5730(arg0.anInt6702, arg0.aClass1_Sub7Array2);
				}
				local2105 = local1057.method4600(Static52.aClass34_1);
				if (local2105 != null) {
					local2105.aClass25_1 = local1057;
					local2105.anInt6690 = local12;
					local2105.anInt6684 = local6;
					local2105.anInt6692 = local9;
					Static252.aClass262_10.method5815(local2105);
				}
			}
		}
		@Pc(2191) Class169 local2191;
		if (local12 < Static105.anInt1943 - 1) {
			local2191 = Static359.aClass169ArrayArrayArray5[local12 + 1][local6][local9];
			if (local2191 != null && local2191.aBoolean551) {
				Static344.aClass58_1.method3494(local2191);
			}
		}
		if (local6 < Static321.anInt5494) {
			local2191 = local31[local6 + 1][local9];
			if (local2191 != null && local2191.aBoolean551) {
				Static344.aClass58_1.method3489(local2191);
			}
		}
		if (local9 < Static64.anInt1211) {
			local2191 = local31[local6][local9 + 1];
			if (local2191 != null && local2191.aBoolean551) {
				Static344.aClass58_1.method3489(local2191);
			}
		}
		if (local6 > Static321.anInt5494) {
			local2191 = local31[local6 - 1][local9];
			if (local2191 != null && local2191.aBoolean551) {
				Static344.aClass58_1.method3489(local2191);
			}
		}
		if (local9 > Static64.anInt1211) {
			local2191 = local31[local6][local9 - 1];
			if (local2191 != null && local2191.aBoolean551) {
				Static344.aClass58_1.method3489(local2191);
			}
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(II[FIIII)V")
	public static void method3673(@OriginalArg(1) int arg0, @OriginalArg(2) float[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 > 0 && !Static90.method1429(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static90.method1429(arg0)) {
			@Pc(40) int local40 = Static397.method5187(6408);
			@Pc(42) int local42 = 0;
			@Pc(49) int local49 = arg0 > arg2 ? arg2 : arg0;
			@Pc(53) int local53 = arg2 >> 1;
			@Pc(57) int local57 = arg0 >> 1;
			@Pc(59) float[] local59 = arg1;
			@Pc(66) float[] local66 = new float[local53 * local57 * local40];
			while (true) {
				OpenGL.glTexImage2Df(3553, local42, 34842, arg2, arg0, 0, 6408, 5126, local59, 0);
				if (local49 <= 1) {
					return;
				}
				@Pc(85) int local85 = arg2 * local40;
				@Pc(87) float[] local87 = local66;
				for (@Pc(89) int local89 = 0; local89 < local40; local89++) {
					@Pc(93) int local93 = local89;
					@Pc(95) int local95 = local89;
					@Pc(100) int local100 = local89 + local85;
					for (@Pc(102) int local102 = 0; local102 < local57; local102++) {
						for (@Pc(106) int local106 = 0; local106 < local53; local106++) {
							@Pc(112) float local112 = local59[local95];
							local95 += local40;
							@Pc(122) float local122 = local112 + local59[local95];
							local95 += local40;
							@Pc(132) float local132 = local122 + local59[local100];
							local100 += local40;
							@Pc(142) float local142 = local132 + local59[local100];
							local66[local93] = local142 * 0.25F;
							local100 += local40;
							local93 += local40;
						}
						local95 += local85;
						local100 += local85;
					}
				}
				local66 = local59;
				arg2 = local53;
				arg0 = local57;
				local59 = local87;
				local42++;
				local49 >>= 0x1;
				local53 >>= 0x1;
				local57 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
