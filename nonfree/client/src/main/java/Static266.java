import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!rm", name = "w", descriptor = "F")
	public static float aFloat71;

	@OriginalMember(owner = "client!rm", name = "x", descriptor = "F")
	public static float aFloat72;

	@OriginalMember(owner = "client!rm", name = "A", descriptor = "I")
	public static int anInt5482;

	@OriginalMember(owner = "client!rm", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString213;

	@OriginalMember(owner = "client!rm", name = "D", descriptor = "Z")
	public static boolean aBoolean458 = true;

	@OriginalMember(owner = "client!rm", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString214 = "Loaded defaults";

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V")
	public static void method4801(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		Static226.aString218 = arg1;
		Static336.anInt6503 = arg0;
		Static153.aString114 = arg2;
		if (Static226.aString218.equals("") || Static153.aString114.equals("")) {
			Static6.anInt4143 = 3;
		} else if (Static35.anInt877 == -1) {
			Static257.anInt5264 = 0;
			Static123.anInt5165 = 0;
			Static6.anInt4143 = -3;
			Static310.anInt6185 = 1;
			@Pc(39) Class1_Sub21 local39 = new Class1_Sub21(128);
			local39.method5718(10);
			local39.method5702((int) (Math.random() * 9.9999999E7D));
			local39.method5744(Static195.method5823(Static226.aString218));
			local39.method5702((int) (Math.random() * 9.9999999E7D));
			local39.method5752(Static153.aString114);
			local39.method5702((int) (Math.random() * 9.9999999E7D));
			local39.method5703(Static82.aBigInteger1, Static296.aBigInteger2);
			Static305.aClass1_Sub21_Sub2_3.anInt6611 = 0;
			Static305.aClass1_Sub21_Sub2_3.method5718(24);
			Static305.aClass1_Sub21_Sub2_3.method5718(local39.anInt6611 + 2);
			Static305.aClass1_Sub21_Sub2_3.method5698(561);
			Static305.aClass1_Sub21_Sub2_3.method5729(local39.anInt6611, local39.aByteArray82);
		} else {
			Static48.method954();
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!mp;Lclient!gk;)V")
	public static void method4802(@OriginalArg(0) Class141 arg0, @OriginalArg(1) Class83 arg1) {
		if (!arg1.aBoolean158) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort38;
		@Pc(9) short local9 = arg1.aShort39;
		@Pc(12) byte local12 = arg1.aByte31;
		@Pc(15) byte local15 = arg1.aByte27;
		@Pc(21) int local21 = (local6 << 7) + 64;
		@Pc(27) int local27 = (local9 << 7) + 64;
		@Pc(31) Class83[][] local31 = Static347.aClass83ArrayArrayArray3[local12];
		@Pc(58) float local58;
		@Pc(40) int local40;
		if (Static81.aClass12Array1 == Static263.aClass12Array2) {
			local40 = Static345.anIntArrayArray60[local6][local9];
			Static176.aClass105_10.method4263(Static278.aClass12Array3[0].method2698(local21, local27), local40 & 0xFFFFFF, local40 >>> 21 & 0x7F8);
			local58 = 201.5F;
		} else {
			local58 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static176.aClass105_10.method4207(3000.0F, local58 * 1.5F);
		@Pc(621) Class7_Sub3 local621;
		@Pc(716) int local716;
		@Pc(719) int local719;
		@Pc(728) int local728;
		@Pc(740) int local740;
		@Pc(91) Class83 local91;
		@Pc(411) int local411;
		@Pc(335) boolean local335;
		@Pc(382) Class7_Sub3 local382;
		@Pc(413) int local413;
		@Pc(416) Class10_Sub2 local416;
		@Pc(711) int local711;
		if (arg1.aBoolean157) {
			if (Static256.aBoolean434) {
				if (local12 > 0) {
					local91 = Static347.aClass83ArrayArrayArray3[local12 - 1][local6][local9];
					if (local91 != null && local91.aBoolean158) {
						return;
					}
				}
				if (local6 <= Static97.anInt1886 && local6 > Static226.anInt5592) {
					local91 = local31[local6 - 1][local9];
					if (local91 != null && local91.aBoolean158 && (local91.aBoolean157 || (arg1.aByte32 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static97.anInt1886 && local6 < Static254.anInt5237 - 1) {
					local91 = local31[local6 + 1][local9];
					if (local91 != null && local91.aBoolean158 && (local91.aBoolean157 || (arg1.aByte32 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static349.anInt6708 && local9 > Static285.anInt5730) {
					local91 = local31[local6][local9 - 1];
					if (local91 != null && local91.aBoolean158 && (local91.aBoolean157 || (arg1.aByte32 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static349.anInt6708 && local9 < Static296.anInt5981 - 1) {
					local91 = local31[local6][local9 + 1];
					if (local91 != null && local91.aBoolean158 && (local91.aBoolean157 || (arg1.aByte32 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static256.aBoolean434 = true;
			}
			arg1.aBoolean157 = false;
			if (arg1.aClass83_1 != null) {
				local91 = arg1.aClass83_1;
				Static176.aClass105_10.method4207(3000.0F, (201.5F - (float) (local91.aByte27 + 1) * 50.0F) * 1.5F);
				if (!Static235.method5310(local91.aByte27, local6, local9)) {
					Static263.aClass12Array2[local91.aByte27].method2709(local6, local9);
				}
				@Pc(254) Class10_Sub2 local254 = local91.aClass10_Sub2_1;
				if (local254 != null) {
					if (Static165.aBoolean263) {
						if ((local254.anInt2659 & arg1.aShort37) == 0) {
							Static345.method5771(arg0, local12, local6, local9);
						} else {
							Static56.method1107(arg0, local254.anInt2659, local15, local6, local9);
						}
						Static176.aClass105_10.method4242(arg0.anInt6107, arg0.aClass1_Sub19_Sub1Array5);
					}
					local254.method5821(Static176.aClass105_10);
				}
				for (@Pc(291) Class59 local291 = local91.aClass59_2; local291 != null; local291 = local291.aClass59_1) {
					@Pc(295) Class10_Sub1 local295 = local291.aClass10_Sub1_1;
					if (local295 != null) {
						if (Static165.aBoolean263) {
							Static345.method5771(arg0, local12, local6, local9);
							Static176.aClass105_10.method4242(arg0.anInt6107, arg0.aClass1_Sub19_Sub1Array5);
						}
						local295.method5821(Static176.aClass105_10);
					}
				}
				Static176.aClass105_10.method4207(3000.0F, local58 * 1.5F);
			}
			local335 = !Static235.method5310(local15, local6, local9);
			if (local335) {
				Static263.aClass12Array2[local15].method2709(local6, local9);
				@Pc(346) Class10_Sub3 local346 = arg1.aClass10_Sub3_1;
				if (local346 != null && local346.aBoolean382) {
					if (local346.aBoolean383) {
						Static176.aClass105_10.method4207(3000.0F, (local58 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static165.aBoolean263) {
						Static345.method5771(arg0, local12, local6, local9);
						Static176.aClass105_10.method4242(arg0.anInt6107, arg0.aClass1_Sub19_Sub1Array5);
					}
					local382 = local346.method5821(Static176.aClass105_10);
					if (local382 != null) {
						local382.aClass10_1 = local346;
						local382.anInt1439 = local12;
						local382.anInt1441 = local6;
						local382.anInt1442 = local9;
						Static88.aClass122_1.method2624(local382);
					}
					if (local346.aBoolean383) {
						Static176.aClass105_10.method4207(3000.0F, local58 * 1.5F);
					}
				}
			}
			local411 = 0;
			local413 = 0;
			local416 = arg1.aClass10_Sub2_1;
			@Pc(419) Class10_Sub4 local419 = arg1.aClass10_Sub4_2;
			if (local416 != null || local419 != null) {
				if (Static97.anInt1886 == local6) {
					local411++;
				} else if (Static97.anInt1886 < local6) {
					local411 += 2;
				}
				if (Static349.anInt6708 == local9) {
					local411 += 3;
				} else if (Static349.anInt6708 > local9) {
					local411 += 6;
				}
				local413 = Static53.anIntArray93[local411];
				arg1.aShort37 = Static282.aShortArray55[local411];
			}
			if (local416 != null) {
				if ((local416.anInt2659 & Static345.anIntArray668[local411]) == 0) {
					arg1.aByte28 = 0;
				} else if (local416.anInt2659 == 16) {
					arg1.aByte28 = 3;
					arg1.aByte30 = Static141.aByteArray36[local411];
					arg1.aByte29 = (byte) (3 - arg1.aByte30);
				} else if (local416.anInt2659 == 32) {
					arg1.aByte28 = 6;
					arg1.aByte30 = Static151.aByteArray39[local411];
					arg1.aByte29 = (byte) (6 - arg1.aByte30);
				} else if (local416.anInt2659 == 64) {
					arg1.aByte28 = 12;
					arg1.aByte30 = Static72.aByteArray9[local411];
					arg1.aByte29 = (byte) (12 - arg1.aByte30);
				} else {
					arg1.aByte28 = 9;
					arg1.aByte30 = Static346.aByteArray84[local411];
					arg1.aByte29 = (byte) (9 - arg1.aByte30);
				}
				if ((local416.anInt2659 & local413) != 0 && !Static203.method3685(local15, local6, local9, local416.anInt2659)) {
					if (Static165.aBoolean263) {
						Static345.method5771(arg0, local12, local6, local9);
						Static176.aClass105_10.method4242(arg0.anInt6107, arg0.aClass1_Sub19_Sub1Array5);
					}
					@Pc(568) Class7_Sub3 local568 = local416.method5821(Static176.aClass105_10);
					if (local568 != null) {
						local568.aClass10_1 = local416;
						local568.anInt1439 = local12;
						local568.anInt1441 = local6;
						local568.anInt1442 = local9;
						Static88.aClass122_1.method2624(local568);
					}
				}
				@Pc(589) Class10_Sub2 local589 = arg1.aClass10_Sub2_2;
				if (local589 != null && (local589.anInt2659 & local413) != 0 && !Static203.method3685(local15, local6, local9, local589.anInt2659)) {
					if (Static165.aBoolean263) {
						Static345.method5771(arg0, local12, local6, local9);
						Static176.aClass105_10.method4242(arg0.anInt6107, arg0.aClass1_Sub19_Sub1Array5);
					}
					local621 = local589.method5821(Static176.aClass105_10);
					if (local621 != null) {
						local621.aClass10_1 = local589;
						local621.anInt1439 = local12;
						local621.anInt1441 = local6;
						local621.anInt1442 = local9;
						Static88.aClass122_1.method2624(local621);
					}
				}
			}
			if (local419 != null && !Static301.method5231(local15, local6, local9, local419.method5444())) {
				@Pc(652) Class10_Sub4 local652 = arg1.aClass10_Sub4_1;
				Static176.aClass105_10.method4207(3000.0F, (local58 - 0.5F) * 1.5F);
				if ((local419.anInt6323 & local413) != 0) {
					if (Static165.aBoolean263) {
						Static345.method5771(arg0, local12, local6, local9);
						Static176.aClass105_10.method4242(arg0.anInt6107, arg0.aClass1_Sub19_Sub1Array5);
					}
					local621 = local419.method5821(Static176.aClass105_10);
					if (local621 != null) {
						local621.aClass10_1 = local419;
						local621.anInt1439 = local12;
						local621.anInt1441 = local6;
						local621.anInt1442 = local9;
						Static88.aClass122_1.method2624(local621);
					}
				} else if (local419.anInt6323 == 256) {
					local711 = local419.anInt6326 - Static286.anInt5739;
					local716 = local419.anInt6332 - Static55.anInt1333;
					local719 = local419.anInt6330;
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
					if (Static165.aBoolean263) {
						Static345.method5771(arg0, local12, local6, local9);
						Static176.aClass105_10.method4242(arg0.anInt6107, arg0.aClass1_Sub19_Sub1Array5);
					}
					@Pc(764) Class7_Sub3 local764;
					if (local740 < local728) {
						local764 = local419.method5821(Static176.aClass105_10);
						if (local764 != null) {
							local764.aClass10_1 = local419;
							local764.anInt1439 = local12;
							local764.anInt1441 = local6;
							local764.anInt1442 = local9;
							Static88.aClass122_1.method2624(local764);
						}
					} else if (local652 != null) {
						local764 = local652.method5821(Static176.aClass105_10);
						if (local764 != null) {
							local764.aClass10_1 = local652;
							local764.anInt1439 = local12;
							local764.anInt1441 = local6;
							local764.anInt1442 = local9;
							Static88.aClass122_1.method2624(local764);
						}
					}
				}
				Static176.aClass105_10.method4207(3000.0F, local58 * 1.5F);
			}
			if (local335) {
				@Pc(819) Class10_Sub3 local819 = arg1.aClass10_Sub3_1;
				if (local819 != null && !local819.aBoolean382) {
					if (local819.aBoolean383) {
						Static176.aClass105_10.method4207(3000.0F, (local58 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static165.aBoolean263) {
						Static345.method5771(arg0, local12, local6, local9);
						Static176.aClass105_10.method4242(arg0.anInt6107, arg0.aClass1_Sub19_Sub1Array5);
					}
					local621 = local819.method5821(Static176.aClass105_10);
					if (local621 != null) {
						local621.aClass10_1 = local819;
						local621.anInt1439 = local12;
						local621.anInt1441 = local6;
						local621.anInt1442 = local9;
						Static88.aClass122_1.method2624(local621);
					}
					if (local819.aBoolean383) {
						Static176.aClass105_10.method4207(3000.0F, local58 * 1.5F);
					}
				}
				@Pc(885) Class10_Sub5 local885 = arg1.aClass10_Sub5_1;
				if (local885 != null && !local885.aBoolean226) {
					if (Static165.aBoolean263) {
						Static345.method5771(arg0, local12, local6, local9);
						Static176.aClass105_10.method4242(arg0.anInt6107, arg0.aClass1_Sub19_Sub1Array5);
					}
					@Pc(908) Class7_Sub3 local908 = local885.method5821(Static176.aClass105_10);
					if (local908 != null) {
						local908.aClass10_1 = local885;
						local908.anInt1439 = local12;
						local908.anInt1441 = local6;
						local908.anInt1442 = local9;
						Static88.aClass122_1.method2624(local908);
					}
				}
			}
			@Pc(929) byte local929 = arg1.aByte32;
			if (local929 != 0) {
				@Pc(946) Class83 local946;
				if (local6 < Static97.anInt1886 && (local929 & 0x4) != 0) {
					local946 = local31[local6 + 1][local9];
					if (local946 != null && local946.aBoolean158) {
						Static71.aClass135_1.method5045(local946);
					}
				}
				if (local9 < Static349.anInt6708 && (local929 & 0x2) != 0) {
					local946 = local31[local6][local9 + 1];
					if (local946 != null && local946.aBoolean158) {
						Static71.aClass135_1.method5045(local946);
					}
				}
				if (local6 > Static97.anInt1886 && (local929 & 0x1) != 0) {
					local946 = local31[local6 - 1][local9];
					if (local946 != null && local946.aBoolean158) {
						Static71.aClass135_1.method5045(local946);
					}
				}
				if (local9 > Static349.anInt6708 && (local929 & 0x8) != 0) {
					local946 = local31[local6][local9 - 1];
					if (local946 != null && local946.aBoolean158) {
						Static71.aClass135_1.method5045(local946);
					}
				}
			}
		}
		@Pc(1079) int local1079;
		@Pc(1062) Class10_Sub2 local1062;
		@Pc(1083) int local1083;
		@Pc(1035) Class59 local1035;
		if (arg1.aByte28 != 0) {
			local335 = true;
			for (local1035 = arg1.aClass59_2; local1035 != null; local1035 = local1035.aClass59_1) {
				if (local1035.aClass10_Sub1_1.anInt6721 != Static77.anInt1573 && (local1035.anInt1496 & arg1.aByte28) == arg1.aByte30) {
					local335 = false;
					break;
				}
			}
			if (local335) {
				local1062 = arg1.aClass10_Sub2_1;
				if (!Static203.method3685(local15, local6, local9, local1062.anInt2659)) {
					if (Static165.aBoolean263) {
						label687: {
							if (local1062.anInt2659 >= 16) {
								local1079 = local6 - Static97.anInt1886;
								local1083 = local9 - Static349.anInt6708;
								if (local1062.anInt2659 == 16) {
									local1079 -= 64;
									local1083 += 64;
									if (local1083 < local1079 && local6 > 0 && local9 <= Static3.anInt38) {
										Static345.method5771(arg0, local12, local6 - 1, local9 + 1);
										break label687;
									}
								} else if (local1062.anInt2659 == 32) {
									local1079 += 64;
									local1083 += 64;
									if (local1083 < -local1079 && local6 < Static97.anInt1852 && local9 < Static3.anInt38) {
										Static345.method5771(arg0, local12, local6 + 1, local9 + 1);
										break label687;
									}
								} else if (local1062.anInt2659 == 64) {
									local1079 += 64;
									local1083 -= 64;
									if (local1083 > local1079 && local6 < Static97.anInt1852 && local9 > 0) {
										Static345.method5771(arg0, local12, local6 + 1, local9 - 1);
										break label687;
									}
								} else if (local1062.anInt2659 == 128) {
									local1079 -= 64;
									local1083 -= 64;
									if (local1083 > -local1079 && local6 > 0 && local9 > 0) {
										Static345.method5771(arg0, local12, local6 - 1, local9 - 1);
										break label687;
									}
								}
							}
							Static345.method5771(arg0, local12, local6, local9);
						}
						Static176.aClass105_10.method4242(arg0.anInt6107, arg0.aClass1_Sub19_Sub1Array5);
					}
					@Pc(1197) Class7_Sub3 local1197 = local1062.method5821(Static176.aClass105_10);
					if (local1197 != null) {
						local1197.aClass10_1 = local1062;
						local1197.anInt1439 = local12;
						local1197.anInt1441 = local6;
						local1197.anInt1442 = local9;
						Static88.aClass122_1.method2624(local1197);
					}
				}
				arg1.aByte28 = 0;
			}
		}
		@Pc(1314) int local1314;
		if (arg1.aBoolean159) {
			try {
				arg1.aBoolean159 = false;
				local40 = 0;
				label630: for (local1035 = arg1.aClass59_2; local1035 != null; local1035 = local1035.aClass59_1) {
					@Pc(1233) Class10_Sub1 local1233 = local1035.aClass10_Sub1_1;
					if (local1233.anInt6721 != Static77.anInt1573) {
						for (local1079 = local1233.aShort94; local1079 <= local1233.aShort93; local1079++) {
							for (local1083 = local1233.aShort91; local1083 <= local1233.aShort92; local1083++) {
								@Pc(1251) Class83 local1251 = local31[local1079][local1083];
								if (local1251.aBoolean157) {
									arg1.aBoolean159 = true;
									continue label630;
								}
								if (local1251.aByte28 != 0) {
									local711 = 0;
									if (local1079 > local1233.aShort94) {
										local711++;
									}
									if (local1079 < local1233.aShort93) {
										local711 += 4;
									}
									if (local1083 > local1233.aShort91) {
										local711 += 8;
									}
									if (local1083 < local1233.aShort92) {
										local711 += 2;
									}
									if ((local711 & local1251.aByte28) == arg1.aByte29) {
										arg1.aBoolean159 = true;
										continue label630;
									}
								}
							}
						}
						local1083 = Static97.anInt1886 - local1233.aShort94;
						local1314 = local1233.aShort93 - Static97.anInt1886;
						if (local1314 > local1083) {
							local1083 = local1314;
						}
						local711 = Static349.anInt6708 - local1233.aShort91;
						local716 = local1233.aShort92 - Static349.anInt6708;
						if (local716 > local711) {
							local711 = local716;
						}
						arg0.aClass10_Sub1Array3[local40] = local1233;
						arg0.anIntArray586[local40++] = local1083 + local711;
					}
				}
				while (local40 > 0) {
					local413 = -50;
					local1079 = -1;
					@Pc(1365) Class10_Sub1 local1365;
					for (local1083 = 0; local1083 < local40; local1083++) {
						local1365 = arg0.aClass10_Sub1Array3[local1083];
						if (local1365.anInt6721 != Static77.anInt1573) {
							local711 = arg0.anIntArray586[local1083];
							if (local711 > local413) {
								local413 = local711;
								local1079 = local1083;
							} else if (local711 == local413) {
								local716 = local1365.anInt6728 - Static286.anInt5739;
								local719 = local1365.anInt6726 - Static55.anInt1333;
								local728 = arg0.aClass10_Sub1Array3[local1079].anInt6728 - Static286.anInt5739;
								local740 = arg0.aClass10_Sub1Array3[local1079].anInt6726 - Static55.anInt1333;
								if (local716 * local716 + local719 * local719 > local728 * local728 + local740 * local740) {
									local1079 = local1083;
								}
							}
						}
					}
					if (local1079 == -1) {
						break;
					}
					local1365 = arg0.aClass10_Sub1Array3[local1079];
					local1365.anInt6721 = Static77.anInt1573;
					if (!Static148.method2612(local15, local1365.aShort94, local1365.aShort93, local1365.aShort91, local1365.aShort92, local1365.method5829())) {
						if (Static165.aBoolean263) {
							if (local1365.aByte74 == 0) {
								Static324.method5506(arg0, local12, local1365.aShort94, local1365.aShort91, local1365.aShort93, local1365.aShort92);
							} else {
								Static345.method5771(arg0, local12, local6, local9);
								local711 = local6 - Static97.anInt1886;
								local716 = local9 - Static349.anInt6708;
								if (local1365.aByte74 == 2) {
									if (local716 > -local711) {
										Static94.method1480(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static94.method1480(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local716 > local711) {
									Static94.method1480(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static94.method1480(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static176.aClass105_10.method4242(arg0.anInt6107, arg0.aClass1_Sub19_Sub1Array5);
						}
						local621 = local1365.method5821(Static176.aClass105_10);
						if (local621 != null) {
							local621.aClass10_1 = local1365;
							local621.anInt1439 = local12;
							local621.anInt1441 = local1365.aShort94;
							local621.anInt1442 = local1365.aShort91;
							Static88.aClass122_1.method2624(local621);
						}
					}
					for (local711 = local1365.aShort94; local711 <= local1365.aShort93; local711++) {
						for (local716 = local1365.aShort91; local716 <= local1365.aShort92; local716++) {
							@Pc(1590) Class83 local1590 = local31[local711][local716];
							if (local1590.aByte28 != 0) {
								Static71.aClass135_1.method5045(local1590);
							} else if ((local711 != local6 || local716 != local9) && local1590.aBoolean158) {
								Static71.aClass135_1.method5045(local1590);
							}
						}
					}
				}
				if (arg1.aBoolean159) {
					return;
				}
			} catch (@Pc(1628) Exception local1628) {
				arg1.aBoolean159 = false;
			}
		}
		if (arg1.aClass153_1 != null) {
			if (arg1.aByte26 == (byte) (Static131.anInt2601 & 0xFF)) {
				@Pc(1645) Class153 local1645 = arg1.aClass153_1;
				local411 = Static263.aClass12Array2[local12].method2704(local6, local9);
				if (local12 < 3) {
					local413 = Static263.aClass12Array2[local12].method2704(local6, local9) - Static263.aClass12Array2[local12 + 1].method2704(local6, local9);
				} else {
					local413 = 1024;
				}
				Static102.aClass31_2.method3175(local21, local411, local27, arg0.anIntArray587);
				local1079 = arg0.anIntArray587[2];
				Static102.aClass31_2.method3175(local21, local411 - local413, local27, arg0.anIntArray587);
				local1083 = arg0.anIntArray587[2];
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
				local1645.anInt4681 = local1314;
				local1645.anInt4686 = local711;
				local1645.aBoolean370 = true;
				Static176.aClass105_10.method4240(local1645);
			} else {
				arg1.aClass153_1 = null;
			}
		}
		if (!arg1.aBoolean158) {
			return;
		}
		if (arg1.aByte28 != 0) {
			return;
		}
		if (local6 <= Static97.anInt1886 && local6 > Static226.anInt5592) {
			local91 = local31[local6 - 1][local9];
			if (local91 != null && local91.aBoolean158) {
				return;
			}
		}
		if (local6 >= Static97.anInt1886 && local6 < Static254.anInt5237 - 1) {
			local91 = local31[local6 + 1][local9];
			if (local91 != null && local91.aBoolean158) {
				return;
			}
		}
		if (local9 <= Static349.anInt6708 && local9 > Static285.anInt5730) {
			local91 = local31[local6][local9 - 1];
			if (local91 != null && local91.aBoolean158) {
				return;
			}
		}
		if (local9 >= Static349.anInt6708 && local9 < Static296.anInt5981 - 1) {
			local91 = local31[local6][local9 + 1];
			if (local91 != null && local91.aBoolean158) {
				return;
			}
		}
		arg1.aBoolean158 = false;
		Static49.anInt5286--;
		@Pc(1839) Class10_Sub5 local1839 = arg1.aClass10_Sub5_1;
		if (local1839 != null && local1839.aBoolean226) {
			if (Static165.aBoolean263) {
				Static345.method5771(arg0, local12, local6, local9);
				Static176.aClass105_10.method4242(arg0.anInt6107, arg0.aClass1_Sub19_Sub1Array5);
			}
			@Pc(1862) Class7_Sub3 local1862 = local1839.method5821(Static176.aClass105_10);
			if (local1862 != null) {
				local1862.aClass10_1 = local1839;
				local1862.anInt1439 = local12;
				local1862.anInt1441 = local6;
				local1862.anInt1442 = local9;
				Static88.aClass122_1.method2624(local1862);
			}
		}
		if (arg1.aShort37 != 0) {
			@Pc(1886) Class10_Sub4 local1886 = arg1.aClass10_Sub4_2;
			if (local1886 != null && !Static301.method5231(local15, local6, local9, local1886.method5444())) {
				if ((local1886.anInt6323 & arg1.aShort37) != 0) {
					if (Static165.aBoolean263) {
						Static345.method5771(arg0, local12, local6, local9);
						Static176.aClass105_10.method4242(arg0.anInt6107, arg0.aClass1_Sub19_Sub1Array5);
					}
					local382 = local1886.method5821(Static176.aClass105_10);
					if (local382 != null) {
						local382.aClass10_1 = local1886;
						local382.anInt1439 = local12;
						local382.anInt1441 = local6;
						local382.anInt1442 = local9;
						Static88.aClass122_1.method2624(local382);
					}
				} else if (local1886.anInt6323 == 256) {
					local413 = local1886.anInt6326 - Static286.anInt5739;
					local1079 = local1886.anInt6332 - Static55.anInt1333;
					local1083 = local1886.anInt6330;
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
					if (Static165.aBoolean263) {
						Static345.method5771(arg0, local12, local6, local9);
						Static176.aClass105_10.method4242(arg0.anInt6107, arg0.aClass1_Sub19_Sub1Array5);
					}
					@Pc(1996) Class10_Sub4 local1996 = arg1.aClass10_Sub4_1;
					@Pc(2004) Class7_Sub3 local2004;
					if (local711 > local1314) {
						local2004 = local1886.method5821(Static176.aClass105_10);
						if (local2004 != null) {
							local2004.aClass10_1 = local1886;
							local2004.anInt1439 = local12;
							local2004.anInt1441 = local6;
							local2004.anInt1442 = local9;
							Static88.aClass122_1.method2624(local2004);
						}
					} else if (local1996 != null) {
						local2004 = local1996.method5821(Static176.aClass105_10);
						if (local2004 != null) {
							local2004.aClass10_1 = local1996;
							local2004.anInt1439 = local12;
							local2004.anInt1441 = local6;
							local2004.anInt1442 = local9;
							Static88.aClass122_1.method2624(local2004);
						}
					}
				}
			}
			local1062 = arg1.aClass10_Sub2_1;
			local416 = arg1.aClass10_Sub2_2;
			@Pc(2089) Class7_Sub3 local2089;
			if (local416 != null && (local416.anInt2659 & arg1.aShort37) != 0 && !Static203.method3685(local15, local6, local9, local416.anInt2659)) {
				if (Static165.aBoolean263) {
					Static56.method1107(arg0, local416.anInt2659, local12, local6, local9);
					Static176.aClass105_10.method4242(arg0.anInt6107, arg0.aClass1_Sub19_Sub1Array5);
				}
				local2089 = local416.method5821(Static176.aClass105_10);
				if (local2089 != null) {
					local2089.aClass10_1 = local416;
					local2089.anInt1439 = local12;
					local2089.anInt1441 = local6;
					local2089.anInt1442 = local9;
					Static88.aClass122_1.method2624(local2089);
				}
			}
			if (local1062 != null && (local1062.anInt2659 & arg1.aShort37) != 0 && !Static203.method3685(local15, local6, local9, local1062.anInt2659)) {
				if (Static165.aBoolean263) {
					Static56.method1107(arg0, local1062.anInt2659, local12, local6, local9);
					Static176.aClass105_10.method4242(arg0.anInt6107, arg0.aClass1_Sub19_Sub1Array5);
				}
				local2089 = local1062.method5821(Static176.aClass105_10);
				if (local2089 != null) {
					local2089.aClass10_1 = local1062;
					local2089.anInt1439 = local12;
					local2089.anInt1441 = local6;
					local2089.anInt1442 = local9;
					Static88.aClass122_1.method2624(local2089);
				}
			}
		}
		@Pc(2175) Class83 local2175;
		if (local12 < Static132.anInt6773 - 1) {
			local2175 = Static347.aClass83ArrayArrayArray3[local12 + 1][local6][local9];
			if (local2175 != null && local2175.aBoolean158) {
				Static71.aClass135_1.method5039(local2175);
			}
		}
		if (local6 < Static97.anInt1886) {
			local2175 = local31[local6 + 1][local9];
			if (local2175 != null && local2175.aBoolean158) {
				Static71.aClass135_1.method5045(local2175);
			}
		}
		if (local9 < Static349.anInt6708) {
			local2175 = local31[local6][local9 + 1];
			if (local2175 != null && local2175.aBoolean158) {
				Static71.aClass135_1.method5045(local2175);
			}
		}
		if (local6 > Static97.anInt1886) {
			local2175 = local31[local6 - 1][local9];
			if (local2175 != null && local2175.aBoolean158) {
				Static71.aClass135_1.method5045(local2175);
			}
		}
		if (local9 > Static349.anInt6708) {
			local2175 = local31[local6][local9 - 1];
			if (local2175 != null && local2175.aBoolean158) {
				Static71.aClass135_1.method5045(local2175);
			}
		}
	}

	@OriginalMember(owner = "client!rm", name = "d", descriptor = "(B)V")
	public static void method4803() {
		Static48.anInt1214 = Static20.aClass34_1.anInt1003 + Static20.aClass34_1.anInt1017 + 2;
		Static167.aStringArray28 = new String[500];
		Static307.anInt6148 = Static81.aClass34_4.anInt1003 + Static81.aClass34_4.anInt1017 + 2;
		for (@Pc(30) int local30 = 0; local30 < Static167.aStringArray28.length; local30++) {
			Static167.aStringArray28[local30] = "";
		}
	}
}
