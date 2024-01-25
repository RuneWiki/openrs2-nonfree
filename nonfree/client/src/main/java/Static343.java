import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
	public static int anInt6572 = 0;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!gr;Lclient!jd;)V")
	public static void method5591(@OriginalArg(0) Class88 arg0, @OriginalArg(1) Class106 arg1) {
		if (!arg1.aBoolean174) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort28;
		@Pc(9) short local9 = arg1.aShort30;
		@Pc(12) byte local12 = arg1.aByte25;
		@Pc(15) byte local15 = arg1.aByte26;
		@Pc(21) int local21 = (local6 << 7) + 64;
		@Pc(27) int local27 = (local9 << 7) + 64;
		@Pc(31) Class106[][] local31 = Static212.aClass106ArrayArrayArray2[local12];
		@Pc(58) float local58;
		@Pc(40) int local40;
		if (Static79.aClass77Array5 == Static108.aClass77Array2) {
			local40 = Static303.anIntArrayArray55[local6][local9];
			Static174.aClass129_5.method4964(Static129.aClass77Array3[0].method4133(local21, local27), local40 & 0xFFFFFF, local40 >>> 21 & 0x7F8);
			local58 = 251.5F;
		} else {
			local58 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static174.aClass129_5.method4986(3000.0F, local58 * 1.5F);
		@Pc(621) Class10_Sub1 local621;
		@Pc(716) int local716;
		@Pc(719) int local719;
		@Pc(728) int local728;
		@Pc(740) int local740;
		@Pc(91) Class106 local91;
		@Pc(411) int local411;
		@Pc(335) boolean local335;
		@Pc(382) Class10_Sub1 local382;
		@Pc(413) int local413;
		@Pc(416) Class67_Sub2 local416;
		@Pc(711) int local711;
		if (arg1.aBoolean175) {
			if (Static144.aBoolean178) {
				if (local12 > 0) {
					local91 = Static212.aClass106ArrayArrayArray2[local12 - 1][local6][local9];
					if (local91 != null && local91.aBoolean174) {
						return;
					}
				}
				if (local6 <= Static6.anInt4021 && local6 > Static54.anInt1025) {
					local91 = local31[local6 - 1][local9];
					if (local91 != null && local91.aBoolean174 && (local91.aBoolean175 || (arg1.aByte28 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static6.anInt4021 && local6 < Static199.anInt4037 - 1) {
					local91 = local31[local6 + 1][local9];
					if (local91 != null && local91.aBoolean174 && (local91.aBoolean175 || (arg1.aByte28 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static104.anInt1932 && local9 > Static305.anInt5983) {
					local91 = local31[local6][local9 - 1];
					if (local91 != null && local91.aBoolean174 && (local91.aBoolean175 || (arg1.aByte28 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static104.anInt1932 && local9 < Static108.anInt2044 - 1) {
					local91 = local31[local6][local9 + 1];
					if (local91 != null && local91.aBoolean174 && (local91.aBoolean175 || (arg1.aByte28 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static144.aBoolean178 = true;
			}
			arg1.aBoolean175 = false;
			if (arg1.aClass106_1 != null) {
				local91 = arg1.aClass106_1;
				Static174.aClass129_5.method4986(3000.0F, (201.5F - (float) (local91.aByte26 + 1) * 50.0F) * 1.5F);
				if (!Static259.method4515(local91.aByte26, local6, local9)) {
					Static108.aClass77Array2[local91.aByte26].method4136(local6, local9);
				}
				@Pc(254) Class67_Sub2 local254 = local91.aClass67_Sub2_1;
				if (local254 != null) {
					if (Static216.aBoolean369) {
						if ((local254.anInt4509 & arg1.aShort29) == 0) {
							Static102.method1556(arg0, local12, local6, local9);
						} else {
							Static2.method5(arg0, local254.anInt4509, local15, local6, local9);
						}
						Static174.aClass129_5.method4963(arg0.anInt4161, arg0.aClass11_Sub5_Sub1Array3);
					}
					local254.method5401(Static174.aClass129_5);
				}
				for (@Pc(291) Class64 local291 = local91.aClass64_4; local291 != null; local291 = local291.aClass64_2) {
					@Pc(295) Class67_Sub3 local295 = local291.aClass67_Sub3_1;
					if (local295 != null) {
						if (Static216.aBoolean369) {
							Static102.method1556(arg0, local12, local6, local9);
							Static174.aClass129_5.method4963(arg0.anInt4161, arg0.aClass11_Sub5_Sub1Array3);
						}
						local295.method5401(Static174.aClass129_5);
					}
				}
				Static174.aClass129_5.method4986(3000.0F, local58 * 1.5F);
			}
			local335 = !Static259.method4515(local15, local6, local9);
			if (local335) {
				Static108.aClass77Array2[local15].method4136(local6, local9);
				@Pc(346) Class67_Sub4 local346 = arg1.aClass67_Sub4_1;
				if (local346 != null && local346.aBoolean366) {
					if (local346.aBoolean365) {
						Static174.aClass129_5.method4986(3000.0F, (local58 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static216.aBoolean369) {
						Static102.method1556(arg0, local12, local6, local9);
						Static174.aClass129_5.method4963(arg0.anInt4161, arg0.aClass11_Sub5_Sub1Array3);
					}
					local382 = local346.method5401(Static174.aClass129_5);
					if (local382 != null) {
						local382.aClass67_1 = local346;
						local382.anInt69 = local12;
						local382.anInt70 = local6;
						local382.anInt68 = local9;
						Static33.aClass210_2.method5612(local382);
					}
					if (local346.aBoolean365) {
						Static174.aClass129_5.method4986(3000.0F, local58 * 1.5F);
					}
				}
			}
			local411 = 0;
			local413 = 0;
			local416 = arg1.aClass67_Sub2_1;
			@Pc(419) Class67_Sub1 local419 = arg1.aClass67_Sub1_1;
			if (local416 != null || local419 != null) {
				if (Static6.anInt4021 == local6) {
					local411++;
				} else if (Static6.anInt4021 < local6) {
					local411 += 2;
				}
				if (Static104.anInt1932 == local9) {
					local411 += 3;
				} else if (Static104.anInt1932 > local9) {
					local411 += 6;
				}
				local413 = Static174.anIntArray224[local411];
				arg1.aShort29 = Static313.aShortArray103[local411];
			}
			if (local416 != null) {
				if ((local416.anInt4509 & Static338.anIntArray536[local411]) == 0) {
					arg1.aByte24 = 0;
				} else if (local416.anInt4509 == 16) {
					arg1.aByte24 = 3;
					arg1.aByte27 = Static306.aByteArray91[local411];
					arg1.aByte30 = (byte) (3 - arg1.aByte27);
				} else if (local416.anInt4509 == 32) {
					arg1.aByte24 = 6;
					arg1.aByte27 = Static199.aByteArray59[local411];
					arg1.aByte30 = (byte) (6 - arg1.aByte27);
				} else if (local416.anInt4509 == 64) {
					arg1.aByte24 = 12;
					arg1.aByte27 = Static207.aByteArray64[local411];
					arg1.aByte30 = (byte) (12 - arg1.aByte27);
				} else {
					arg1.aByte24 = 9;
					arg1.aByte27 = Static96.aByteArray27[local411];
					arg1.aByte30 = (byte) (9 - arg1.aByte27);
				}
				if ((local416.anInt4509 & local413) != 0 && !Static305.method5141(local15, local6, local9, local416.anInt4509)) {
					if (Static216.aBoolean369) {
						Static102.method1556(arg0, local12, local6, local9);
						Static174.aClass129_5.method4963(arg0.anInt4161, arg0.aClass11_Sub5_Sub1Array3);
					}
					@Pc(568) Class10_Sub1 local568 = local416.method5401(Static174.aClass129_5);
					if (local568 != null) {
						local568.aClass67_1 = local416;
						local568.anInt69 = local12;
						local568.anInt70 = local6;
						local568.anInt68 = local9;
						Static33.aClass210_2.method5612(local568);
					}
				}
				@Pc(589) Class67_Sub2 local589 = arg1.aClass67_Sub2_2;
				if (local589 != null && (local589.anInt4509 & local413) != 0 && !Static305.method5141(local15, local6, local9, local589.anInt4509)) {
					if (Static216.aBoolean369) {
						Static102.method1556(arg0, local12, local6, local9);
						Static174.aClass129_5.method4963(arg0.anInt4161, arg0.aClass11_Sub5_Sub1Array3);
					}
					local621 = local589.method5401(Static174.aClass129_5);
					if (local621 != null) {
						local621.aClass67_1 = local589;
						local621.anInt69 = local12;
						local621.anInt70 = local6;
						local621.anInt68 = local9;
						Static33.aClass210_2.method5612(local621);
					}
				}
			}
			if (local419 != null && !Static177.method2849(local15, local6, local9, local419.method4498())) {
				@Pc(652) Class67_Sub1 local652 = arg1.aClass67_Sub1_2;
				Static174.aClass129_5.method4986(3000.0F, (local58 - 0.5F) * 1.5F);
				if ((local419.anInt5251 & local413) != 0) {
					if (Static216.aBoolean369) {
						Static102.method1556(arg0, local12, local6, local9);
						Static174.aClass129_5.method4963(arg0.anInt4161, arg0.aClass11_Sub5_Sub1Array3);
					}
					local621 = local419.method5401(Static174.aClass129_5);
					if (local621 != null) {
						local621.aClass67_1 = local419;
						local621.anInt69 = local12;
						local621.anInt70 = local6;
						local621.anInt68 = local9;
						Static33.aClass210_2.method5612(local621);
					}
				} else if (local419.anInt5251 == 256) {
					local711 = local419.anInt5252 - Static10.anInt229;
					local716 = local419.anInt5256 - Static178.anInt3541;
					local719 = local419.anInt5246;
					if (local719 == 1 || local719 == 2) {
						local728 = -local711;
					} else {
						local728 = local711;
					}
					if (local719 == 2 || local719 == 3) {
						local740 = -local716;
					} else {
						local740 = local716;
					}
					if (Static216.aBoolean369) {
						Static102.method1556(arg0, local12, local6, local9);
						Static174.aClass129_5.method4963(arg0.anInt4161, arg0.aClass11_Sub5_Sub1Array3);
					}
					@Pc(764) Class10_Sub1 local764;
					if (local740 < local728) {
						local764 = local419.method5401(Static174.aClass129_5);
						if (local764 != null) {
							local764.aClass67_1 = local419;
							local764.anInt69 = local12;
							local764.anInt70 = local6;
							local764.anInt68 = local9;
							Static33.aClass210_2.method5612(local764);
						}
					} else if (local652 != null) {
						local764 = local652.method5401(Static174.aClass129_5);
						if (local764 != null) {
							local764.aClass67_1 = local652;
							local764.anInt69 = local12;
							local764.anInt70 = local6;
							local764.anInt68 = local9;
							Static33.aClass210_2.method5612(local764);
						}
					}
				}
				Static174.aClass129_5.method4986(3000.0F, local58 * 1.5F);
			}
			if (local335) {
				@Pc(819) Class67_Sub4 local819 = arg1.aClass67_Sub4_1;
				if (local819 != null && !local819.aBoolean366) {
					if (local819.aBoolean365) {
						Static174.aClass129_5.method4986(3000.0F, (local58 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static216.aBoolean369) {
						Static102.method1556(arg0, local12, local6, local9);
						Static174.aClass129_5.method4963(arg0.anInt4161, arg0.aClass11_Sub5_Sub1Array3);
					}
					local621 = local819.method5401(Static174.aClass129_5);
					if (local621 != null) {
						local621.aClass67_1 = local819;
						local621.anInt69 = local12;
						local621.anInt70 = local6;
						local621.anInt68 = local9;
						Static33.aClass210_2.method5612(local621);
					}
					if (local819.aBoolean365) {
						Static174.aClass129_5.method4986(3000.0F, local58 * 1.5F);
					}
				}
				@Pc(885) Class67_Sub5 local885 = arg1.aClass67_Sub5_1;
				if (local885 != null && !local885.aBoolean358) {
					if (Static216.aBoolean369) {
						Static102.method1556(arg0, local12, local6, local9);
						Static174.aClass129_5.method4963(arg0.anInt4161, arg0.aClass11_Sub5_Sub1Array3);
					}
					@Pc(908) Class10_Sub1 local908 = local885.method5401(Static174.aClass129_5);
					if (local908 != null) {
						local908.aClass67_1 = local885;
						local908.anInt69 = local12;
						local908.anInt70 = local6;
						local908.anInt68 = local9;
						Static33.aClass210_2.method5612(local908);
					}
				}
			}
			@Pc(929) byte local929 = arg1.aByte28;
			if (local929 != 0) {
				@Pc(946) Class106 local946;
				if (local6 < Static6.anInt4021 && (local929 & 0x4) != 0) {
					local946 = local31[local6 + 1][local9];
					if (local946 != null && local946.aBoolean174) {
						Static74.aClass38_1.method4163(local946);
					}
				}
				if (local9 < Static104.anInt1932 && (local929 & 0x2) != 0) {
					local946 = local31[local6][local9 + 1];
					if (local946 != null && local946.aBoolean174) {
						Static74.aClass38_1.method4163(local946);
					}
				}
				if (local6 > Static6.anInt4021 && (local929 & 0x1) != 0) {
					local946 = local31[local6 - 1][local9];
					if (local946 != null && local946.aBoolean174) {
						Static74.aClass38_1.method4163(local946);
					}
				}
				if (local9 > Static104.anInt1932 && (local929 & 0x8) != 0) {
					local946 = local31[local6][local9 - 1];
					if (local946 != null && local946.aBoolean174) {
						Static74.aClass38_1.method4163(local946);
					}
				}
			}
		}
		@Pc(1079) int local1079;
		@Pc(1062) Class67_Sub2 local1062;
		@Pc(1083) int local1083;
		@Pc(1035) Class64 local1035;
		if (arg1.aByte24 != 0) {
			local335 = true;
			for (local1035 = arg1.aClass64_4; local1035 != null; local1035 = local1035.aClass64_2) {
				if (local1035.aClass67_Sub3_1.anInt6311 != Static212.anInt4350 && (local1035.anInt1418 & arg1.aByte24) == arg1.aByte27) {
					local335 = false;
					break;
				}
			}
			if (local335) {
				local1062 = arg1.aClass67_Sub2_1;
				if (!Static305.method5141(local15, local6, local9, local1062.anInt4509)) {
					if (Static216.aBoolean369) {
						label687: {
							if (local1062.anInt4509 >= 16) {
								local1079 = local6 - Static6.anInt4021;
								local1083 = local9 - Static104.anInt1932;
								if (local1062.anInt4509 == 16) {
									local1079 -= 64;
									local1083 += 64;
									if (local1083 < local1079 && local6 > 0 && local9 <= Static300.anInt5931) {
										Static102.method1556(arg0, local12, local6 - 1, local9 + 1);
										break label687;
									}
								} else if (local1062.anInt4509 == 32) {
									local1079 += 64;
									local1083 += 64;
									if (local1083 < -local1079 && local6 < Static232.anInt4703 && local9 < Static300.anInt5931) {
										Static102.method1556(arg0, local12, local6 + 1, local9 + 1);
										break label687;
									}
								} else if (local1062.anInt4509 == 64) {
									local1079 += 64;
									local1083 -= 64;
									if (local1083 > local1079 && local6 < Static232.anInt4703 && local9 > 0) {
										Static102.method1556(arg0, local12, local6 + 1, local9 - 1);
										break label687;
									}
								} else if (local1062.anInt4509 == 128) {
									local1079 -= 64;
									local1083 -= 64;
									if (local1083 > -local1079 && local6 > 0 && local9 > 0) {
										Static102.method1556(arg0, local12, local6 - 1, local9 - 1);
										break label687;
									}
								}
							}
							Static102.method1556(arg0, local12, local6, local9);
						}
						Static174.aClass129_5.method4963(arg0.anInt4161, arg0.aClass11_Sub5_Sub1Array3);
					}
					@Pc(1197) Class10_Sub1 local1197 = local1062.method5401(Static174.aClass129_5);
					if (local1197 != null) {
						local1197.aClass67_1 = local1062;
						local1197.anInt69 = local12;
						local1197.anInt70 = local6;
						local1197.anInt68 = local9;
						Static33.aClass210_2.method5612(local1197);
					}
				}
				arg1.aByte24 = 0;
			}
		}
		@Pc(1314) int local1314;
		if (arg1.aBoolean173) {
			try {
				arg1.aBoolean173 = false;
				local40 = 0;
				label630: for (local1035 = arg1.aClass64_4; local1035 != null; local1035 = local1035.aClass64_2) {
					@Pc(1233) Class67_Sub3 local1233 = local1035.aClass67_Sub3_1;
					if (local1233.anInt6311 != Static212.anInt4350) {
						for (local1079 = local1233.aShort91; local1079 <= local1233.aShort93; local1079++) {
							for (local1083 = local1233.aShort90; local1083 <= local1233.aShort92; local1083++) {
								@Pc(1251) Class106 local1251 = local31[local1079][local1083];
								if (local1251.aBoolean175) {
									arg1.aBoolean173 = true;
									continue label630;
								}
								if (local1251.aByte24 != 0) {
									local711 = 0;
									if (local1079 > local1233.aShort91) {
										local711++;
									}
									if (local1079 < local1233.aShort93) {
										local711 += 4;
									}
									if (local1083 > local1233.aShort90) {
										local711 += 8;
									}
									if (local1083 < local1233.aShort92) {
										local711 += 2;
									}
									if ((local711 & local1251.aByte24) == arg1.aByte30) {
										arg1.aBoolean173 = true;
										continue label630;
									}
								}
							}
						}
						local1083 = Static6.anInt4021 - local1233.aShort91;
						local1314 = local1233.aShort93 - Static6.anInt4021;
						if (local1314 > local1083) {
							local1083 = local1314;
						}
						local711 = Static104.anInt1932 - local1233.aShort90;
						local716 = local1233.aShort92 - Static104.anInt1932;
						if (local716 > local711) {
							local711 = local716;
						}
						arg0.aClass67_Sub3Array2[local40] = local1233;
						arg0.anIntArray325[local40++] = local1083 + local711;
					}
				}
				while (local40 > 0) {
					local413 = -50;
					local1079 = -1;
					@Pc(1365) Class67_Sub3 local1365;
					for (local1083 = 0; local1083 < local40; local1083++) {
						local1365 = arg0.aClass67_Sub3Array2[local1083];
						if (local1365.anInt6311 != Static212.anInt4350) {
							local711 = arg0.anIntArray325[local1083];
							if (local711 > local413) {
								local413 = local711;
								local1079 = local1083;
							} else if (local711 == local413) {
								local716 = local1365.anInt6308 - Static10.anInt229;
								local719 = local1365.anInt6310 - Static178.anInt3541;
								local728 = arg0.aClass67_Sub3Array2[local1079].anInt6308 - Static10.anInt229;
								local740 = arg0.aClass67_Sub3Array2[local1079].anInt6310 - Static178.anInt3541;
								if (local716 * local716 + local719 * local719 > local728 * local728 + local740 * local740) {
									local1079 = local1083;
								}
							}
						}
					}
					if (local1079 == -1) {
						break;
					}
					local1365 = arg0.aClass67_Sub3Array2[local1079];
					local1365.anInt6311 = Static212.anInt4350;
					if (!Static117.method1779(local15, local1365.aShort91, local1365.aShort93, local1365.aShort90, local1365.aShort92, local1365.method5408())) {
						if (Static216.aBoolean369) {
							if (local1365.aByte72 == 0) {
								Static88.method1282(arg0, local12, local1365.aShort91, local1365.aShort90, local1365.aShort93, local1365.aShort92);
							} else {
								Static102.method1556(arg0, local12, local6, local9);
								local711 = local6 - Static6.anInt4021;
								local716 = local9 - Static104.anInt1932;
								if (local1365.aByte72 == 2) {
									if (local716 > -local711) {
										Static288.method4789(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static288.method4789(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local716 > local711) {
									Static288.method4789(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static288.method4789(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static174.aClass129_5.method4963(arg0.anInt4161, arg0.aClass11_Sub5_Sub1Array3);
						}
						local621 = local1365.method5401(Static174.aClass129_5);
						if (local621 != null) {
							local621.aClass67_1 = local1365;
							local621.anInt69 = local12;
							local621.anInt70 = local1365.aShort91;
							local621.anInt68 = local1365.aShort90;
							Static33.aClass210_2.method5612(local621);
						}
					}
					for (local711 = local1365.aShort91; local711 <= local1365.aShort93; local711++) {
						for (local716 = local1365.aShort90; local716 <= local1365.aShort92; local716++) {
							@Pc(1590) Class106 local1590 = local31[local711][local716];
							if (local1590.aByte24 != 0) {
								Static74.aClass38_1.method4163(local1590);
							} else if ((local711 != local6 || local716 != local9) && local1590.aBoolean174) {
								Static74.aClass38_1.method4163(local1590);
							}
						}
					}
				}
				if (arg1.aBoolean173) {
					return;
				}
			} catch (@Pc(1628) Exception local1628) {
				arg1.aBoolean173 = false;
			}
		}
		if (arg1.aClass136_2 != null) {
			if (arg1.aByte29 == (byte) (Static128.anInt2364 & 0xFF)) {
				@Pc(1645) Class136 local1645 = arg1.aClass136_2;
				local411 = Static108.aClass77Array2[local12].method4122(local6, local9);
				if (local12 < 3) {
					local413 = Static108.aClass77Array2[local12].method4122(local6, local9) - Static108.aClass77Array2[local12 + 1].method4122(local6, local9);
				} else {
					local413 = 1024;
				}
				Static110.aClass61_3.method3656(local21, local411, local27, arg0.anIntArray324);
				local1079 = arg0.anIntArray324[2];
				Static110.aClass61_3.method3656(local21, local411 - local413, local27, arg0.anIntArray324);
				local1083 = arg0.anIntArray324[2];
				local1314 = local1079;
				local711 = local1083;
				if (local1079 > local1083) {
					local1314 = local1083;
					local711 = local1079;
				}
				local1314 -= 91;
				local711 += 91;
				if (local1314 < local711 - 1597) {
					local1314 = local711 - 1597;
				}
				local1645.anInt4040 = local1314;
				local1645.anInt4038 = local711;
				local1645.aBoolean261 = true;
				Static174.aClass129_5.method5008(local1645);
			} else {
				arg1.aClass136_2 = null;
			}
		}
		if (!arg1.aBoolean174) {
			return;
		}
		if (arg1.aByte24 != 0) {
			return;
		}
		if (local6 <= Static6.anInt4021 && local6 > Static54.anInt1025) {
			local91 = local31[local6 - 1][local9];
			if (local91 != null && local91.aBoolean174) {
				return;
			}
		}
		if (local6 >= Static6.anInt4021 && local6 < Static199.anInt4037 - 1) {
			local91 = local31[local6 + 1][local9];
			if (local91 != null && local91.aBoolean174) {
				return;
			}
		}
		if (local9 <= Static104.anInt1932 && local9 > Static305.anInt5983) {
			local91 = local31[local6][local9 - 1];
			if (local91 != null && local91.aBoolean174) {
				return;
			}
		}
		if (local9 >= Static104.anInt1932 && local9 < Static108.anInt2044 - 1) {
			local91 = local31[local6][local9 + 1];
			if (local91 != null && local91.aBoolean174) {
				return;
			}
		}
		arg1.aBoolean174 = false;
		Static202.anInt4130--;
		@Pc(1839) Class67_Sub5 local1839 = arg1.aClass67_Sub5_1;
		if (local1839 != null && local1839.aBoolean358) {
			if (Static216.aBoolean369) {
				Static102.method1556(arg0, local12, local6, local9);
				Static174.aClass129_5.method4963(arg0.anInt4161, arg0.aClass11_Sub5_Sub1Array3);
			}
			@Pc(1862) Class10_Sub1 local1862 = local1839.method5401(Static174.aClass129_5);
			if (local1862 != null) {
				local1862.aClass67_1 = local1839;
				local1862.anInt69 = local12;
				local1862.anInt70 = local6;
				local1862.anInt68 = local9;
				Static33.aClass210_2.method5612(local1862);
			}
		}
		if (arg1.aShort29 != 0) {
			@Pc(1886) Class67_Sub1 local1886 = arg1.aClass67_Sub1_1;
			if (local1886 != null && !Static177.method2849(local15, local6, local9, local1886.method4498())) {
				if ((local1886.anInt5251 & arg1.aShort29) != 0) {
					if (Static216.aBoolean369) {
						Static102.method1556(arg0, local12, local6, local9);
						Static174.aClass129_5.method4963(arg0.anInt4161, arg0.aClass11_Sub5_Sub1Array3);
					}
					local382 = local1886.method5401(Static174.aClass129_5);
					if (local382 != null) {
						local382.aClass67_1 = local1886;
						local382.anInt69 = local12;
						local382.anInt70 = local6;
						local382.anInt68 = local9;
						Static33.aClass210_2.method5612(local382);
					}
				} else if (local1886.anInt5251 == 256) {
					local413 = local1886.anInt5252 - Static10.anInt229;
					local1079 = local1886.anInt5256 - Static178.anInt3541;
					local1083 = local1886.anInt5246;
					if (local1083 == 1 || local1083 == 2) {
						local1314 = -local413;
					} else {
						local1314 = local413;
					}
					if (local1083 == 2 || local1083 == 3) {
						local711 = -local1079;
					} else {
						local711 = local1079;
					}
					if (Static216.aBoolean369) {
						Static102.method1556(arg0, local12, local6, local9);
						Static174.aClass129_5.method4963(arg0.anInt4161, arg0.aClass11_Sub5_Sub1Array3);
					}
					@Pc(1996) Class67_Sub1 local1996 = arg1.aClass67_Sub1_2;
					@Pc(2004) Class10_Sub1 local2004;
					if (local711 > local1314) {
						local2004 = local1886.method5401(Static174.aClass129_5);
						if (local2004 != null) {
							local2004.aClass67_1 = local1886;
							local2004.anInt69 = local12;
							local2004.anInt70 = local6;
							local2004.anInt68 = local9;
							Static33.aClass210_2.method5612(local2004);
						}
					} else if (local1996 != null) {
						local2004 = local1996.method5401(Static174.aClass129_5);
						if (local2004 != null) {
							local2004.aClass67_1 = local1996;
							local2004.anInt69 = local12;
							local2004.anInt70 = local6;
							local2004.anInt68 = local9;
							Static33.aClass210_2.method5612(local2004);
						}
					}
				}
			}
			local1062 = arg1.aClass67_Sub2_1;
			local416 = arg1.aClass67_Sub2_2;
			@Pc(2089) Class10_Sub1 local2089;
			if (local416 != null && (local416.anInt4509 & arg1.aShort29) != 0 && !Static305.method5141(local15, local6, local9, local416.anInt4509)) {
				if (Static216.aBoolean369) {
					Static2.method5(arg0, local416.anInt4509, local12, local6, local9);
					Static174.aClass129_5.method4963(arg0.anInt4161, arg0.aClass11_Sub5_Sub1Array3);
				}
				local2089 = local416.method5401(Static174.aClass129_5);
				if (local2089 != null) {
					local2089.aClass67_1 = local416;
					local2089.anInt69 = local12;
					local2089.anInt70 = local6;
					local2089.anInt68 = local9;
					Static33.aClass210_2.method5612(local2089);
				}
			}
			if (local1062 != null && (local1062.anInt4509 & arg1.aShort29) != 0 && !Static305.method5141(local15, local6, local9, local1062.anInt4509)) {
				if (Static216.aBoolean369) {
					Static2.method5(arg0, local1062.anInt4509, local12, local6, local9);
					Static174.aClass129_5.method4963(arg0.anInt4161, arg0.aClass11_Sub5_Sub1Array3);
				}
				local2089 = local1062.method5401(Static174.aClass129_5);
				if (local2089 != null) {
					local2089.aClass67_1 = local1062;
					local2089.anInt69 = local12;
					local2089.anInt70 = local6;
					local2089.anInt68 = local9;
					Static33.aClass210_2.method5612(local2089);
				}
			}
		}
		@Pc(2175) Class106 local2175;
		if (local12 < Static279.anInt5583 - 1) {
			local2175 = Static212.aClass106ArrayArrayArray2[local12 + 1][local6][local9];
			if (local2175 != null && local2175.aBoolean174) {
				Static74.aClass38_1.method4166(local2175);
			}
		}
		if (local6 < Static6.anInt4021) {
			local2175 = local31[local6 + 1][local9];
			if (local2175 != null && local2175.aBoolean174) {
				Static74.aClass38_1.method4163(local2175);
			}
		}
		if (local9 < Static104.anInt1932) {
			local2175 = local31[local6][local9 + 1];
			if (local2175 != null && local2175.aBoolean174) {
				Static74.aClass38_1.method4163(local2175);
			}
		}
		if (local6 > Static6.anInt4021) {
			local2175 = local31[local6 - 1][local9];
			if (local2175 != null && local2175.aBoolean174) {
				Static74.aClass38_1.method4163(local2175);
			}
		}
		if (local9 > Static104.anInt1932) {
			local2175 = local31[local6][local9 - 1];
			if (local2175 != null && local2175.aBoolean174) {
				Static74.aClass38_1.method4163(local2175);
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)V")
	public static void method5592(@OriginalArg(0) int arg0) {
		if (Static329.anInt6323 == 0) {
			Static309.aClass11_Sub10_Sub4_3.method4096(arg0);
		} else {
			Static178.anInt3536 = arg0;
		}
	}
}
