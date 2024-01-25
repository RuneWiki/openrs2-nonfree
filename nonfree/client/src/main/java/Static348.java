import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!tr", name = "t", descriptor = "Lclient!j;")
	public static final Class113 aClass113_17 = new Class113(0, 15);

	@OriginalMember(owner = "client!tr", name = "v", descriptor = "[I")
	public static final int[] anIntArray712 = new int[100];

	@OriginalMember(owner = "client!tr", name = "w", descriptor = "[I")
	public static final int[] anIntArray713 = new int[5];

	@OriginalMember(owner = "client!tr", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString68 = null;

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lclient!ak;Lclient!ke;)V")
	public static void method5091(@OriginalArg(0) Class10 arg0, @OriginalArg(1) Class132 arg1) {
		if (!arg1.aBoolean295) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort59;
		@Pc(9) short local9 = arg1.aShort60;
		@Pc(12) byte local12 = arg1.aByte50;
		@Pc(15) byte local15 = arg1.aByte47;
		@Pc(21) int local21 = (local6 << Static365.anInt5876) + Static276.anInt5131;
		@Pc(27) int local27 = (local9 << Static365.anInt5876) + Static276.anInt5131;
		@Pc(31) Class132[][] local31 = Static25.aClass132ArrayArrayArray1[local12];
		@Pc(53) float local53;
		if (Static77.aClass42Array2 == Static229.aClass42Array3) {
			Static90.aClass164_3.method5383(Static239.aClass42Array4[0].method3043(local21, local27), Static270.method4146(local6, local9), Static284.method4330(local6, local9), Static297.method4473(local6, local9));
			local53 = 251.5F;
		} else {
			local53 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static90.aClass164_3.method5314(3000.0F, local53 * 1.5F);
		@Pc(86) Class132 local86;
		@Pc(616) Class41_Sub1 local616;
		@Pc(711) int local711;
		@Pc(714) int local714;
		@Pc(723) int local723;
		@Pc(735) int local735;
		@Pc(406) int local406;
		@Pc(330) boolean local330;
		@Pc(377) Class41_Sub1 local377;
		@Pc(408) int local408;
		@Pc(411) Class25_Sub5 local411;
		@Pc(706) int local706;
		if (arg1.aBoolean294) {
			if (Static328.aBoolean517) {
				if (local12 > 0) {
					local86 = Static25.aClass132ArrayArrayArray1[local12 - 1][local6][local9];
					if (local86 != null && local86.aBoolean295) {
						return;
					}
				}
				if (local6 <= Static266.anInt4625 && local6 > Static39.anInt751) {
					local86 = local31[local6 - 1][local9];
					if (local86 != null && local86.aBoolean295 && (local86.aBoolean294 || (arg1.aByte51 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static266.anInt4625 && local6 < Static60.anInt1201 - 1) {
					local86 = local31[local6 + 1][local9];
					if (local86 != null && local86.aBoolean295 && (local86.aBoolean294 || (arg1.aByte51 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static249.anInt4358 && local9 > Static35.anInt679) {
					local86 = local31[local6][local9 - 1];
					if (local86 != null && local86.aBoolean295 && (local86.aBoolean294 || (arg1.aByte51 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static249.anInt4358 && local9 < Static255.anInt4404 - 1) {
					local86 = local31[local6][local9 + 1];
					if (local86 != null && local86.aBoolean295 && (local86.aBoolean294 || (arg1.aByte51 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static328.aBoolean517 = true;
			}
			arg1.aBoolean294 = false;
			if (arg1.aClass132_1 != null) {
				local86 = arg1.aClass132_1;
				Static90.aClass164_3.method5314(3000.0F, (201.5F - (float) (local86.aByte47 + 1) * 50.0F) * 1.5F);
				if (!Static83.method1224(local86.aByte47, local6, local9)) {
					Static229.aClass42Array3[local86.aByte47].method3056(local6, local9);
				}
				@Pc(249) Class25_Sub5 local249 = local86.aClass25_Sub5_1;
				if (local249 != null) {
					if (Static172.aBoolean279) {
						if ((local249.anInt4753 & arg1.aShort58) == 0) {
							Static269.method797(arg0, local12, local6, local9);
						} else {
							Static331.method4784(arg0, local249.anInt4753, local15, local6, local9);
						}
						Static90.aClass164_3.method5355(arg0.anInt3592, arg0.aClass1_Sub27_Sub1Array2);
					}
					local249.method5229(Static90.aClass164_3);
				}
				for (@Pc(286) Class116 local286 = local86.aClass116_3; local286 != null; local286 = local286.aClass116_2) {
					@Pc(290) Class25_Sub1 local290 = local286.aClass25_Sub1_1;
					if (local290 != null) {
						if (Static172.aBoolean279) {
							Static269.method797(arg0, local12, local6, local9);
							Static90.aClass164_3.method5355(arg0.anInt3592, arg0.aClass1_Sub27_Sub1Array2);
						}
						local290.method5229(Static90.aClass164_3);
					}
				}
				Static90.aClass164_3.method5314(3000.0F, local53 * 1.5F);
			}
			local330 = !Static83.method1224(local15, local6, local9);
			if (local330) {
				Static229.aClass42Array3[local15].method3056(local6, local9);
				@Pc(341) Class25_Sub4 local341 = arg1.aClass25_Sub4_2;
				if (local341 != null && local341.aBoolean486) {
					if (local341.aBoolean487) {
						Static90.aClass164_3.method5314(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static172.aBoolean279) {
						Static269.method797(arg0, local12, local6, local9);
						Static90.aClass164_3.method5355(arg0.anInt3592, arg0.aClass1_Sub27_Sub1Array2);
					}
					local377 = local341.method5229(Static90.aClass164_3);
					if (local377 != null) {
						local377.aClass25_1 = local341;
						local377.anInt925 = local12;
						local377.anInt924 = local6;
						local377.anInt927 = local9;
						Static118.aClass208_6.method4664(local377);
					}
					if (local341.aBoolean487) {
						Static90.aClass164_3.method5314(3000.0F, local53 * 1.5F);
					}
				}
			}
			local406 = 0;
			local408 = 0;
			local411 = arg1.aClass25_Sub5_1;
			@Pc(414) Class25_Sub3 local414 = arg1.aClass25_Sub3_2;
			if (local411 != null || local414 != null) {
				if (Static266.anInt4625 == local6) {
					local406++;
				} else if (Static266.anInt4625 < local6) {
					local406 += 2;
				}
				if (Static249.anInt4358 == local9) {
					local406 += 3;
				} else if (Static249.anInt4358 > local9) {
					local406 += 6;
				}
				local408 = Static102.anIntArray373[local406];
				arg1.aShort58 = Static308.aShortArray96[local406];
			}
			if (local411 != null) {
				if ((local411.anInt4753 & Static17.anIntArray31[local406]) == 0) {
					arg1.aByte46 = 0;
				} else if (local411.anInt4753 == 16) {
					arg1.aByte46 = 3;
					arg1.aByte45 = Static42.aByteArray16[local406];
					arg1.aByte48 = (byte) (3 - arg1.aByte45);
				} else if (local411.anInt4753 == 32) {
					arg1.aByte46 = 6;
					arg1.aByte45 = Static183.aByteArray32[local406];
					arg1.aByte48 = (byte) (6 - arg1.aByte45);
				} else if (local411.anInt4753 == 64) {
					arg1.aByte46 = 12;
					arg1.aByte45 = Static212.aByteArray62[local406];
					arg1.aByte48 = (byte) (12 - arg1.aByte45);
				} else {
					arg1.aByte46 = 9;
					arg1.aByte45 = Static333.aByteArray18[local406];
					arg1.aByte48 = (byte) (9 - arg1.aByte45);
				}
				if ((local411.anInt4753 & local408) != 0 && !Static298.method1648(local15, local6, local9, local411.anInt4753)) {
					if (Static172.aBoolean279) {
						Static269.method797(arg0, local12, local6, local9);
						Static90.aClass164_3.method5355(arg0.anInt3592, arg0.aClass1_Sub27_Sub1Array2);
					}
					@Pc(563) Class41_Sub1 local563 = local411.method5229(Static90.aClass164_3);
					if (local563 != null) {
						local563.aClass25_1 = local411;
						local563.anInt925 = local12;
						local563.anInt924 = local6;
						local563.anInt927 = local9;
						Static118.aClass208_6.method4664(local563);
					}
				}
				@Pc(584) Class25_Sub5 local584 = arg1.aClass25_Sub5_2;
				if (local584 != null && (local584.anInt4753 & local408) != 0 && !Static298.method1648(local15, local6, local9, local584.anInt4753)) {
					if (Static172.aBoolean279) {
						Static269.method797(arg0, local12, local6, local9);
						Static90.aClass164_3.method5355(arg0.anInt3592, arg0.aClass1_Sub27_Sub1Array2);
					}
					local616 = local584.method5229(Static90.aClass164_3);
					if (local616 != null) {
						local616.aClass25_1 = local584;
						local616.anInt925 = local12;
						local616.anInt924 = local6;
						local616.anInt927 = local9;
						Static118.aClass208_6.method4664(local616);
					}
				}
			}
			if (local414 != null && !Static112.method1635(local15, local6, local9, local414.method4611())) {
				@Pc(647) Class25_Sub3 local647 = arg1.aClass25_Sub3_1;
				Static90.aClass164_3.method5314(3000.0F, (local53 - 0.5F) * 1.5F);
				if ((local414.anInt5262 & local408) != 0) {
					if (Static172.aBoolean279) {
						Static269.method797(arg0, local12, local6, local9);
						Static90.aClass164_3.method5355(arg0.anInt3592, arg0.aClass1_Sub27_Sub1Array2);
					}
					local616 = local414.method5229(Static90.aClass164_3);
					if (local616 != null) {
						local616.aClass25_1 = local414;
						local616.anInt925 = local12;
						local616.anInt924 = local6;
						local616.anInt927 = local9;
						Static118.aClass208_6.method4664(local616);
					}
				} else if (local414.anInt5262 == 256) {
					local706 = local414.anInt5261 - Static227.anInt4750;
					local711 = local414.anInt5257 - Static12.anInt170;
					local714 = local414.anInt5260;
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
					if (Static172.aBoolean279) {
						Static269.method797(arg0, local12, local6, local9);
						Static90.aClass164_3.method5355(arg0.anInt3592, arg0.aClass1_Sub27_Sub1Array2);
					}
					@Pc(759) Class41_Sub1 local759;
					if (local735 < local723) {
						local759 = local414.method5229(Static90.aClass164_3);
						if (local759 != null) {
							local759.aClass25_1 = local414;
							local759.anInt925 = local12;
							local759.anInt924 = local6;
							local759.anInt927 = local9;
							Static118.aClass208_6.method4664(local759);
						}
					} else if (local647 != null) {
						local759 = local647.method5229(Static90.aClass164_3);
						if (local759 != null) {
							local759.aClass25_1 = local647;
							local759.anInt925 = local12;
							local759.anInt924 = local6;
							local759.anInt927 = local9;
							Static118.aClass208_6.method4664(local759);
						}
					}
				}
				Static90.aClass164_3.method5314(3000.0F, local53 * 1.5F);
			}
			if (local330) {
				@Pc(814) Class25_Sub4 local814 = arg1.aClass25_Sub4_2;
				if (local814 != null && !local814.aBoolean486) {
					if (local814.aBoolean487) {
						Static90.aClass164_3.method5314(3000.0F, (local53 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static172.aBoolean279) {
						Static269.method797(arg0, local12, local6, local9);
						Static90.aClass164_3.method5355(arg0.anInt3592, arg0.aClass1_Sub27_Sub1Array2);
					}
					local616 = local814.method5229(Static90.aClass164_3);
					if (local616 != null) {
						local616.aClass25_1 = local814;
						local616.anInt925 = local12;
						local616.anInt924 = local6;
						local616.anInt927 = local9;
						Static118.aClass208_6.method4664(local616);
					}
					if (local814.aBoolean487) {
						Static90.aClass164_3.method5314(3000.0F, local53 * 1.5F);
					}
				}
				@Pc(880) Class25_Sub2 local880 = arg1.aClass25_Sub2_1;
				if (local880 != null && !local880.aBoolean74) {
					if (Static172.aBoolean279) {
						Static269.method797(arg0, local12, local6, local9);
						Static90.aClass164_3.method5355(arg0.anInt3592, arg0.aClass1_Sub27_Sub1Array2);
					}
					@Pc(903) Class41_Sub1 local903 = local880.method5229(Static90.aClass164_3);
					if (local903 != null) {
						local903.aClass25_1 = local880;
						local903.anInt925 = local12;
						local903.anInt924 = local6;
						local903.anInt927 = local9;
						Static118.aClass208_6.method4664(local903);
					}
				}
			}
			@Pc(924) byte local924 = arg1.aByte51;
			if (local924 != 0) {
				@Pc(941) Class132 local941;
				if (local6 < Static266.anInt4625 && (local924 & 0x4) != 0) {
					local941 = local31[local6 + 1][local9];
					if (local941 != null && local941.aBoolean295) {
						Static273.aClass54_1.method1116(local941);
					}
				}
				if (local9 < Static249.anInt4358 && (local924 & 0x2) != 0) {
					local941 = local31[local6][local9 + 1];
					if (local941 != null && local941.aBoolean295) {
						Static273.aClass54_1.method1116(local941);
					}
				}
				if (local6 > Static266.anInt4625 && (local924 & 0x1) != 0) {
					local941 = local31[local6 - 1][local9];
					if (local941 != null && local941.aBoolean295) {
						Static273.aClass54_1.method1116(local941);
					}
				}
				if (local9 > Static249.anInt4358 && (local924 & 0x8) != 0) {
					local941 = local31[local6][local9 - 1];
					if (local941 != null && local941.aBoolean295) {
						Static273.aClass54_1.method1116(local941);
					}
				}
			}
		}
		@Pc(1074) int local1074;
		@Pc(1057) Class25_Sub5 local1057;
		@Pc(1078) int local1078;
		@Pc(1030) Class116 local1030;
		if (arg1.aByte46 != 0) {
			local330 = true;
			for (local1030 = arg1.aClass116_3; local1030 != null; local1030 = local1030.aClass116_2) {
				if (local1030.aClass25_Sub1_1.anInt6082 != Static252.anInt4374 && (local1030.anInt3023 & arg1.aByte46) == arg1.aByte45) {
					local330 = false;
					break;
				}
			}
			if (local330) {
				local1057 = arg1.aClass25_Sub5_1;
				if (!Static298.method1648(local15, local6, local9, local1057.anInt4753)) {
					if (Static172.aBoolean279) {
						label687: {
							if (local1057.anInt4753 >= 16) {
								local1074 = local6 - Static266.anInt4625;
								local1078 = local9 - Static249.anInt4358;
								if (local1057.anInt4753 == 16) {
									local1074 -= Static276.anInt5131;
									local1078 += Static276.anInt5131;
									if (local1078 < local1074 && local6 > 0 && local9 <= Static230.anInt6113) {
										Static269.method797(arg0, local12, local6 - 1, local9 + 1);
										break label687;
									}
								} else if (local1057.anInt4753 == 32) {
									local1074 += Static276.anInt5131;
									local1078 += Static276.anInt5131;
									if (local1078 < -local1074 && local6 < Static19.anInt329 && local9 < Static230.anInt6113) {
										Static269.method797(arg0, local12, local6 + 1, local9 + 1);
										break label687;
									}
								} else if (local1057.anInt4753 == 64) {
									local1074 += Static276.anInt5131;
									local1078 -= Static276.anInt5131;
									if (local1078 > local1074 && local6 < Static19.anInt329 && local9 > 0) {
										Static269.method797(arg0, local12, local6 + 1, local9 - 1);
										break label687;
									}
								} else if (local1057.anInt4753 == 128) {
									local1074 -= Static276.anInt5131;
									local1078 -= Static276.anInt5131;
									if (local1078 > -local1074 && local6 > 0 && local9 > 0) {
										Static269.method797(arg0, local12, local6 - 1, local9 - 1);
										break label687;
									}
								}
							}
							Static269.method797(arg0, local12, local6, local9);
						}
						Static90.aClass164_3.method5355(arg0.anInt3592, arg0.aClass1_Sub27_Sub1Array2);
					}
					@Pc(1216) Class41_Sub1 local1216 = local1057.method5229(Static90.aClass164_3);
					if (local1216 != null) {
						local1216.aClass25_1 = local1057;
						local1216.anInt925 = local12;
						local1216.anInt924 = local6;
						local1216.anInt927 = local9;
						Static118.aClass208_6.method4664(local1216);
					}
				}
				arg1.aByte46 = 0;
			}
		}
		@Pc(1333) int local1333;
		if (arg1.aBoolean293) {
			try {
				arg1.aBoolean293 = false;
				@Pc(1245) int local1245 = 0;
				label630: for (local1030 = arg1.aClass116_3; local1030 != null; local1030 = local1030.aClass116_2) {
					@Pc(1252) Class25_Sub1 local1252 = local1030.aClass25_Sub1_1;
					if (local1252.anInt6082 != Static252.anInt4374) {
						for (local1074 = local1252.aShort88; local1074 <= local1252.aShort87; local1074++) {
							for (local1078 = local1252.aShort89; local1078 <= local1252.aShort90; local1078++) {
								@Pc(1270) Class132 local1270 = local31[local1074][local1078];
								if (local1270.aBoolean294) {
									arg1.aBoolean293 = true;
									continue label630;
								}
								if (local1270.aByte46 != 0) {
									local706 = 0;
									if (local1074 > local1252.aShort88) {
										local706++;
									}
									if (local1074 < local1252.aShort87) {
										local706 += 4;
									}
									if (local1078 > local1252.aShort89) {
										local706 += 8;
									}
									if (local1078 < local1252.aShort90) {
										local706 += 2;
									}
									if ((local706 & local1270.aByte46) == arg1.aByte48) {
										arg1.aBoolean293 = true;
										continue label630;
									}
								}
							}
						}
						local1078 = Static266.anInt4625 - local1252.aShort88;
						local1333 = local1252.aShort87 - Static266.anInt4625;
						if (local1333 > local1078) {
							local1078 = local1333;
						}
						local706 = Static249.anInt4358 - local1252.aShort89;
						local711 = local1252.aShort90 - Static249.anInt4358;
						if (local711 > local706) {
							local706 = local711;
						}
						arg0.aClass25_Sub1Array3[local1245] = local1252;
						arg0.anIntArray435[local1245++] = local1078 + local706;
					}
				}
				while (local1245 > 0) {
					local408 = -50;
					local1074 = -1;
					@Pc(1384) Class25_Sub1 local1384;
					for (local1078 = 0; local1078 < local1245; local1078++) {
						local1384 = arg0.aClass25_Sub1Array3[local1078];
						if (local1384.anInt6082 != Static252.anInt4374) {
							local706 = arg0.anIntArray435[local1078];
							if (local706 > local408) {
								local408 = local706;
								local1074 = local1078;
							} else if (local706 == local408) {
								local711 = local1384.anInt6080 - Static227.anInt4750;
								local714 = local1384.anInt6077 - Static12.anInt170;
								local723 = arg0.aClass25_Sub1Array3[local1074].anInt6080 - Static227.anInt4750;
								local735 = arg0.aClass25_Sub1Array3[local1074].anInt6077 - Static12.anInt170;
								if (local711 * local711 + local714 * local714 > local723 * local723 + local735 * local735) {
									local1074 = local1078;
								}
							}
						}
					}
					if (local1074 == -1) {
						break;
					}
					local1384 = arg0.aClass25_Sub1Array3[local1074];
					local1384.anInt6082 = Static252.anInt4374;
					if (!Static212.method2973(local15, local1384.aShort88, local1384.aShort87, local1384.aShort89, local1384.aShort90, local1384.method5239())) {
						if (Static172.aBoolean279) {
							if (local1384.aByte69 == 0) {
								Static194.method2809(arg0, local12, local1384.aShort88, local1384.aShort89, local1384.aShort87, local1384.aShort90);
							} else {
								Static269.method797(arg0, local12, local6, local9);
								local706 = local6 - Static266.anInt4625;
								local711 = local9 - Static249.anInt4358;
								if (local1384.aByte69 == 2) {
									if (local711 > -local706) {
										Static138.method2080(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static138.method2080(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local711 > local706) {
									Static138.method2080(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static138.method2080(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static90.aClass164_3.method5355(arg0.anInt3592, arg0.aClass1_Sub27_Sub1Array2);
						}
						local616 = local1384.method5229(Static90.aClass164_3);
						if (local616 != null) {
							local616.aClass25_1 = local1384;
							local616.anInt925 = local12;
							local616.anInt924 = local1384.aShort88;
							local616.anInt927 = local1384.aShort89;
							Static118.aClass208_6.method4664(local616);
						}
					}
					for (local706 = local1384.aShort88; local706 <= local1384.aShort87; local706++) {
						for (local711 = local1384.aShort89; local711 <= local1384.aShort90; local711++) {
							@Pc(1609) Class132 local1609 = local31[local706][local711];
							if (local1609.aByte46 != 0) {
								Static273.aClass54_1.method1116(local1609);
							} else if ((local706 != local6 || local711 != local9) && local1609.aBoolean295) {
								Static273.aClass54_1.method1116(local1609);
							}
						}
					}
				}
				if (arg1.aBoolean293) {
					return;
				}
			} catch (@Pc(1647) Exception local1647) {
				arg1.aBoolean293 = false;
			}
		}
		if (arg1.aClass108_2 != null) {
			if (arg1.aByte49 == (byte) (Static16.anInt278 & 0xFF)) {
				@Pc(1664) Class108 local1664 = arg1.aClass108_2;
				local406 = Static229.aClass42Array3[local12].method3060(local6, local9);
				if (local12 < Static337.anInt5599 - 1) {
					local408 = Static229.aClass42Array3[local12].method3060(local6, local9) - Static229.aClass42Array3[local12 + 1].method3060(local6, local9);
				} else {
					local408 = 1024;
				}
				Static134.aClass127_4.method5266(local21, local406, local27, arg0.anIntArray434);
				local1074 = arg0.anIntArray434[2];
				Static134.aClass127_4.method5266(local21, local406 - local408, local27, arg0.anIntArray434);
				local1078 = arg0.anIntArray434[2];
				local1333 = local1074;
				local706 = local1078;
				if (local1074 > local1078) {
					local1333 = local1078;
					local706 = local1074;
				}
				local1333 -= Static76.anInt5659;
				local706 += Static76.anInt5659;
				if (local1333 < local706 - 1597) {
					local1333 = local706 - 1597;
				}
				local1664.anInt2869 = local1333;
				local1664.anInt2867 = local706;
				local1664.aBoolean248 = true;
				Static90.aClass164_3.method5315(local1664);
			} else {
				arg1.aClass108_2 = null;
			}
		}
		if (!arg1.aBoolean295) {
			return;
		}
		if (arg1.aByte46 != 0) {
			return;
		}
		if (local6 <= Static266.anInt4625 && local6 > Static39.anInt751) {
			local86 = local31[local6 - 1][local9];
			if (local86 != null && local86.aBoolean295) {
				return;
			}
		}
		if (local6 >= Static266.anInt4625 && local6 < Static60.anInt1201 - 1) {
			local86 = local31[local6 + 1][local9];
			if (local86 != null && local86.aBoolean295) {
				return;
			}
		}
		if (local9 <= Static249.anInt4358 && local9 > Static35.anInt679) {
			local86 = local31[local6][local9 - 1];
			if (local86 != null && local86.aBoolean295) {
				return;
			}
		}
		if (local9 >= Static249.anInt4358 && local9 < Static255.anInt4404 - 1) {
			local86 = local31[local6][local9 + 1];
			if (local86 != null && local86.aBoolean295) {
				return;
			}
		}
		arg1.aBoolean295 = false;
		Static280.anInt4876--;
		@Pc(1866) Class25_Sub2 local1866 = arg1.aClass25_Sub2_1;
		if (local1866 != null && local1866.aBoolean74) {
			if (Static172.aBoolean279) {
				Static269.method797(arg0, local12, local6, local9);
				Static90.aClass164_3.method5355(arg0.anInt3592, arg0.aClass1_Sub27_Sub1Array2);
			}
			@Pc(1889) Class41_Sub1 local1889 = local1866.method5229(Static90.aClass164_3);
			if (local1889 != null) {
				local1889.aClass25_1 = local1866;
				local1889.anInt925 = local12;
				local1889.anInt924 = local6;
				local1889.anInt927 = local9;
				Static118.aClass208_6.method4664(local1889);
			}
		}
		if (arg1.aShort58 != 0) {
			@Pc(1913) Class25_Sub3 local1913 = arg1.aClass25_Sub3_2;
			if (local1913 != null && !Static112.method1635(local15, local6, local9, local1913.method4611())) {
				if ((local1913.anInt5262 & arg1.aShort58) != 0) {
					if (Static172.aBoolean279) {
						Static269.method797(arg0, local12, local6, local9);
						Static90.aClass164_3.method5355(arg0.anInt3592, arg0.aClass1_Sub27_Sub1Array2);
					}
					local377 = local1913.method5229(Static90.aClass164_3);
					if (local377 != null) {
						local377.aClass25_1 = local1913;
						local377.anInt925 = local12;
						local377.anInt924 = local6;
						local377.anInt927 = local9;
						Static118.aClass208_6.method4664(local377);
					}
				} else if (local1913.anInt5262 == 256) {
					local408 = local1913.anInt5261 - Static227.anInt4750;
					local1074 = local1913.anInt5257 - Static12.anInt170;
					local1078 = local1913.anInt5260;
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
					if (Static172.aBoolean279) {
						Static269.method797(arg0, local12, local6, local9);
						Static90.aClass164_3.method5355(arg0.anInt3592, arg0.aClass1_Sub27_Sub1Array2);
					}
					@Pc(2023) Class25_Sub3 local2023 = arg1.aClass25_Sub3_1;
					@Pc(2031) Class41_Sub1 local2031;
					if (local706 > local1333) {
						local2031 = local1913.method5229(Static90.aClass164_3);
						if (local2031 != null) {
							local2031.aClass25_1 = local1913;
							local2031.anInt925 = local12;
							local2031.anInt924 = local6;
							local2031.anInt927 = local9;
							Static118.aClass208_6.method4664(local2031);
						}
					} else if (local2023 != null) {
						local2031 = local2023.method5229(Static90.aClass164_3);
						if (local2031 != null) {
							local2031.aClass25_1 = local2023;
							local2031.anInt925 = local12;
							local2031.anInt924 = local6;
							local2031.anInt927 = local9;
							Static118.aClass208_6.method4664(local2031);
						}
					}
				}
			}
			local1057 = arg1.aClass25_Sub5_1;
			local411 = arg1.aClass25_Sub5_2;
			@Pc(2116) Class41_Sub1 local2116;
			if (local411 != null && (local411.anInt4753 & arg1.aShort58) != 0 && !Static298.method1648(local15, local6, local9, local411.anInt4753)) {
				if (Static172.aBoolean279) {
					Static331.method4784(arg0, local411.anInt4753, local12, local6, local9);
					Static90.aClass164_3.method5355(arg0.anInt3592, arg0.aClass1_Sub27_Sub1Array2);
				}
				local2116 = local411.method5229(Static90.aClass164_3);
				if (local2116 != null) {
					local2116.aClass25_1 = local411;
					local2116.anInt925 = local12;
					local2116.anInt924 = local6;
					local2116.anInt927 = local9;
					Static118.aClass208_6.method4664(local2116);
				}
			}
			if (local1057 != null && (local1057.anInt4753 & arg1.aShort58) != 0 && !Static298.method1648(local15, local6, local9, local1057.anInt4753)) {
				if (Static172.aBoolean279) {
					Static331.method4784(arg0, local1057.anInt4753, local12, local6, local9);
					Static90.aClass164_3.method5355(arg0.anInt3592, arg0.aClass1_Sub27_Sub1Array2);
				}
				local2116 = local1057.method5229(Static90.aClass164_3);
				if (local2116 != null) {
					local2116.aClass25_1 = local1057;
					local2116.anInt925 = local12;
					local2116.anInt924 = local6;
					local2116.anInt927 = local9;
					Static118.aClass208_6.method4664(local2116);
				}
			}
		}
		@Pc(2202) Class132 local2202;
		if (local12 < Static337.anInt5599 - 1) {
			local2202 = Static25.aClass132ArrayArrayArray1[local12 + 1][local6][local9];
			if (local2202 != null && local2202.aBoolean295) {
				Static273.aClass54_1.method1115(local2202);
			}
		}
		if (local6 < Static266.anInt4625) {
			local2202 = local31[local6 + 1][local9];
			if (local2202 != null && local2202.aBoolean295) {
				Static273.aClass54_1.method1116(local2202);
			}
		}
		if (local9 < Static249.anInt4358) {
			local2202 = local31[local6][local9 + 1];
			if (local2202 != null && local2202.aBoolean295) {
				Static273.aClass54_1.method1116(local2202);
			}
		}
		if (local6 > Static266.anInt4625) {
			local2202 = local31[local6 - 1][local9];
			if (local2202 != null && local2202.aBoolean295) {
				Static273.aClass54_1.method1116(local2202);
			}
		}
		if (local9 > Static249.anInt4358) {
			local2202 = local31[local6][local9 - 1];
			if (local2202 != null && local2202.aBoolean295) {
				Static273.aClass54_1.method1116(local2202);
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)V")
	public static void method5093() {
		if (Static278.anInt4646 < 102) {
			Static278.anInt4646 += 6;
		}
		if (Static180.anInt3208 != 0) {
			Static209.anInt3638 -= Static180.anInt3208 * 5;
			if (Static209.anInt3638 >= Static215.anInt3688) {
				Static209.anInt3638 = Static215.anInt3688 - 1;
			}
			Static180.anInt3208 = 0;
			if (Static209.anInt3638 < 0) {
				Static209.anInt3638 = 0;
			}
		}
		@Pc(56) int local56;
		for (@Pc(48) int local48 = 0; local48 < Static330.anInt5516; local48++) {
			local56 = Static389.aClass69Array1[local48].method1266();
			@Pc(62) char local62 = Static389.aClass69Array1[local48].method1261();
			if (local56 == 84) {
				Static248.method3683();
			} else if (Static264.aClass154_1.method3994(82) && local56 == 66) {
				if (Static148.aClipboard1 != null) {
					@Pc(79) String local79 = "";
					for (@Pc(84) int local84 = Static231.aStringArray79.length - 1; local84 >= 0; local84--) {
						if (Static231.aStringArray79[local84] != null && Static231.aStringArray79[local84].length() > 0) {
							local79 = local79 + Static231.aStringArray79[local84] + '\n';
						}
					}
					Static148.aClipboard1.setContents(new StringSelection(local79), null);
				}
			} else if (Static264.aClass154_1.method3994(82) && local56 == 67) {
				if (Static148.aClipboard1 != null) {
					@Pc(347) Transferable local347 = Static148.aClipboard1.getContents(null);
					if (local347 != null) {
						try {
							@Pc(354) String local354 = (String) local347.getTransferData(DataFlavor.stringFlavor);
							if (local354 != null) {
								@Pc(361) String[] local361 = Static88.method1335(local354, '\n');
								if (local361.length <= 1) {
									Static110.aString69 = Static110.aString69 + local354;
								} else {
									for (@Pc(380) int local380 = 0; local380 < local361.length; local380++) {
										Static110.aString69 = local361[local380];
										Static248.method3683();
									}
								}
							}
						} catch (@Pc(399) Exception local399) {
						}
					}
				}
			} else if (local56 == 85 && Static281.anInt4884 > 0) {
				Static110.aString69 = Static110.aString69.substring(0, Static281.anInt4884 - 1) + Static110.aString69.substring(Static281.anInt4884);
				Static281.anInt4884--;
			} else if (local56 == 101 && Static281.anInt4884 < Static110.aString69.length()) {
				Static110.aString69 = Static110.aString69.substring(0, Static281.anInt4884) + Static110.aString69.substring(Static281.anInt4884 + 1);
			} else if (local56 == 96 && Static281.anInt4884 > 0) {
				Static281.anInt4884--;
			} else if (local56 == 97 && Static281.anInt4884 < Static110.aString69.length()) {
				Static281.anInt4884++;
			} else if (local56 == 102) {
				Static281.anInt4884 = 0;
			} else if (local56 == 103) {
				Static281.anInt4884 = Static110.aString69.length();
			} else if (local56 == 104 && Static231.aStringArray79.length > Static344.anInt5589) {
				Static344.anInt5589++;
				Static187.method2679();
				Static281.anInt4884 = Static110.aString69.length();
			} else if (local56 == 105 && Static344.anInt5589 > 0) {
				Static344.anInt5589--;
				Static187.method2679();
				Static281.anInt4884 = Static110.aString69.length();
			} else if (Static170.method2510(local62) || local62 == ':' || local62 == ',' || local62 == ' ' || local62 == '_' || local62 == '-' || local62 == '+' || local62 == '[' || local62 == ']') {
				Static110.aString69 = Static110.aString69.substring(0, Static281.anInt4884) + Static389.aClass69Array1[local48].method1261() + Static110.aString69.substring(Static281.anInt4884);
				Static281.anInt4884++;
			}
		}
		Static330.anInt5516 = 0;
		for (local56 = 0; local56 < 100; local56++) {
			@Pc(421) int local421;
			if (Static265.aBooleanArray22[local56]) {
				local421 = Static100.anIntArray749[local56]++;
				if (Static100.anIntArray749[local56] > 102) {
					Static265.aBooleanArray22[local56] = false;
				}
			} else {
				local421 = Static100.anIntArray749[local56]--;
				if (Static100.anIntArray749[local56] < 0) {
					Static197.anIntArray410[local56] = (int) (Math.random() * (double) Static136.anInt6304);
					Static55.anIntArray146[local56] = (int) (Math.random() * 350.0D);
					Static100.anIntArray749[local56] = 0;
					Static265.aBooleanArray22[local56] = true;
				}
			}
		}
		Static262.method5507();
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IZ)V")
	public static void method5100(@OriginalArg(1) boolean arg0) {
		Static53.aBoolean97 = arg0;
		@Pc(17) int local17;
		@Pc(32) int local32;
		@Pc(40) int local40;
		@Pc(44) int local44;
		@Pc(48) int local48;
		@Pc(55) int local55;
		if (!Static53.aBoolean97) {
			@Pc(364) boolean local364 = Static139.aClass1_Sub33_Sub2_1.method5174() == 1;
			local17 = Static139.aClass1_Sub33_Sub2_1.method5144();
			@Pc(372) int local372 = Static139.aClass1_Sub33_Sub2_1.method5174();
			local32 = Static139.aClass1_Sub33_Sub2_1.method5183();
			Static96.method1399(local372);
			local40 = (Static121.anInt2167 - Static139.aClass1_Sub33_Sub2_1.lb) / 16;
			Static50.anIntArrayArray14 = new int[local40][4];
			for (local44 = 0; local44 < local40; local44++) {
				for (local48 = 0; local48 < 4; local48++) {
					Static50.anIntArrayArray14[local44][local48] = Static139.aClass1_Sub33_Sub2_1.method5150();
				}
			}
			Static306.aByteArrayArray18 = new byte[local40][];
			Static223.anIntArray480 = new int[local40];
			Static50.aByteArrayArray3 = null;
			Static114.anIntArray260 = new int[local40];
			Static313.anIntArray627 = new int[local40];
			Static393.aByteArrayArray23 = new byte[local40][];
			Static68.anIntArray183 = new int[local40];
			Static180.anIntArray378 = null;
			Static166.aByteArrayArray13 = new byte[local40][];
			Static320.anIntArray634 = new int[local40];
			Static46.aByteArrayArray2 = new byte[local40][];
			local40 = 0;
			for (local48 = (local17 - (Static92.anInt1675 >> 4)) / 8; local48 <= (local17 + (Static92.anInt1675 >> 4)) / 8; local48++) {
				for (local55 = (local32 - (Static262.anInt6340 >> 4)) / 8; local55 <= (local32 + (Static262.anInt6340 >> 4)) / 8; local55++) {
					Static223.anIntArray480[local40] = (local48 << 8) + local55;
					Static114.anIntArray260[local40] = Static25.aClass230_5.method4970("m" + local48 + "_" + local55);
					Static313.anIntArray627[local40] = Static25.aClass230_5.method4970("l" + local48 + "_" + local55);
					Static68.anIntArray183[local40] = Static25.aClass230_5.method4970("um" + local48 + "_" + local55);
					Static320.anIntArray634[local40] = Static25.aClass230_5.method4970("ul" + local48 + "_" + local55);
					local40++;
				}
			}
			Static320.method4702(local17, local32, local364, false);
			return;
		}
		@Pc(13) int local13 = Static139.aClass1_Sub33_Sub2_1.method5131();
		local17 = Static139.aClass1_Sub33_Sub2_1.method5162();
		@Pc(28) boolean local28 = Static139.aClass1_Sub33_Sub2_1.method5166() == 1;
		local32 = Static139.aClass1_Sub33_Sub2_1.method5183();
		Static96.method1399(local17);
		Static139.aClass1_Sub33_Sub2_1.method5200();
		for (local40 = 0; local40 < 4; local40++) {
			for (local44 = 0; local44 < Static92.anInt1675 >> 3; local44++) {
				for (local48 = 0; local48 < Static262.anInt6340 >> 3; local48++) {
					local55 = Static139.aClass1_Sub33_Sub2_1.method5191(1);
					if (local55 == 1) {
						Static384.anIntArrayArrayArray14[local40][local44][local48] = Static139.aClass1_Sub33_Sub2_1.method5191(26);
					} else {
						Static384.anIntArrayArrayArray14[local40][local44][local48] = -1;
					}
				}
			}
		}
		Static139.aClass1_Sub33_Sub2_1.method5193();
		local44 = (Static121.anInt2167 - Static139.aClass1_Sub33_Sub2_1.lb) / 16;
		Static50.anIntArrayArray14 = new int[local44][4];
		for (local48 = 0; local48 < local44; local48++) {
			for (local55 = 0; local55 < 4; local55++) {
				Static50.anIntArrayArray14[local48][local55] = Static139.aClass1_Sub33_Sub2_1.method5150();
			}
		}
		Static306.aByteArrayArray18 = new byte[local44][];
		Static320.anIntArray634 = new int[local44];
		Static166.aByteArrayArray13 = new byte[local44][];
		Static393.aByteArrayArray23 = new byte[local44][];
		Static50.aByteArrayArray3 = null;
		Static114.anIntArray260 = new int[local44];
		Static68.anIntArray183 = new int[local44];
		Static313.anIntArray627 = new int[local44];
		Static180.anIntArray378 = null;
		Static46.aByteArrayArray2 = new byte[local44][];
		Static223.anIntArray480 = new int[local44];
		local44 = 0;
		for (local55 = 0; local55 < 4; local55++) {
			for (@Pc(179) int local179 = 0; local179 < Static92.anInt1675 >> 3; local179++) {
				for (@Pc(183) int local183 = 0; local183 < Static262.anInt6340 >> 3; local183++) {
					@Pc(193) int local193 = Static384.anIntArrayArrayArray14[local55][local179][local183];
					if (local193 != -1) {
						@Pc(202) int local202 = local193 >> 14 & 0x3FF;
						@Pc(208) int local208 = local193 >> 3 & 0x7FF;
						@Pc(218) int local218 = local208 / 8 + (local202 / 8 << 8);
						for (@Pc(220) int local220 = 0; local220 < local44; local220++) {
							if (Static223.anIntArray480[local220] == local218) {
								local218 = -1;
								break;
							}
						}
						if (local218 != -1) {
							Static223.anIntArray480[local44] = local218;
							@Pc(256) int local256 = local218 >> 8 & 0xFF;
							@Pc(260) int local260 = local218 & 0xFF;
							Static114.anIntArray260[local44] = Static25.aClass230_5.method4970("m" + local256 + "_" + local260);
							Static313.anIntArray627[local44] = Static25.aClass230_5.method4970("l" + local256 + "_" + local260);
							Static68.anIntArray183[local44] = Static25.aClass230_5.method4970("um" + local256 + "_" + local260);
							Static320.anIntArray634[local44] = Static25.aClass230_5.method4970("ul" + local256 + "_" + local260);
							local44++;
						}
					}
				}
			}
		}
		Static320.method4702(local13, local32, local28, false);
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(ZLclient!ui;I)Lclient!md;")
	public static Class1_Sub29 method5107(@OriginalArg(1) Class230 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) byte[] local13 = arg0.method4961(arg1);
		return local13 == null ? null : new Class1_Sub29(local13);
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "([BI)[B")
	public static byte[] method5108(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class1_Sub33 local8 = new Class1_Sub33(arg0);
		@Pc(12) int local12 = local8.method5174();
		@Pc(16) int local16 = local8.method5150();
		if (local16 < 0 || Static115.anInt2058 != 0 && Static115.anInt2058 < local16) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(37) byte[] local37 = new byte[local16];
			local8.method5135(local16, local37);
			return local37;
		} else {
			@Pc(49) int local49 = local8.method5150();
			if (local49 < 0 || Static115.anInt2058 != 0 && local49 > Static115.anInt2058) {
				throw new RuntimeException();
			}
			@Pc(73) byte[] local73 = new byte[local49];
			if (local12 == 1) {
				Static9.method87(local73, local49, arg0, local16);
			} else {
				Static99.aClass180_1.method4057(local8, local73);
			}
			return local73;
		}
	}
}
