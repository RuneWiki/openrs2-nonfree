import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!ia", name = "F", descriptor = "F")
	public static float aFloat36;

	@OriginalMember(owner = "client!ia", name = "G", descriptor = "I")
	public static int anInt3018;

	@OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
	public static int anInt3000 = 0;

	@OriginalMember(owner = "client!ia", name = "E", descriptor = "Lclient!cb;")
	public static final Class4_Sub11_Sub1 aClass4_Sub11_Sub1_3 = new Class4_Sub11_Sub1(5000);

	@OriginalMember(owner = "client!ia", name = "H", descriptor = "I")
	public static int anInt3019 = -1;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIII)V")
	public static void method2622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) int local10;
		if (arg3 < arg1) {
			for (local10 = arg3; local10 < arg1; local10++) {
				Static223.anIntArrayArray124[local10][arg0] = arg2;
			}
		} else {
			for (local10 = arg1; local10 < arg3; local10++) {
				Static223.anIntArrayArray124[local10][arg0] = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZI)V")
	public static void method2625(@OriginalArg(0) boolean arg0) {
		if (Static286.aBoolean484 != arg0) {
			Static286.aBoolean484 = arg0;
			Static58.method1233();
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(II[[[Lclient!ls;IIZ)Z")
	public static boolean method2627(@OriginalArg(1) int arg0, @OriginalArg(2) Class128[][][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(14) byte local14 = arg4 ? 1 : (byte) (Static357.anInt6820 & 0xFF);
		if (local14 == Static63.aByteArrayArrayArray3[Static12.anInt267][arg0][arg2]) {
			return false;
		} else if ((Static2.aByteArrayArrayArray1[Static12.anInt267][arg0][arg2] & 0x4) == 0) {
			return false;
		} else {
			@Pc(46) byte local46 = 0;
			Static48.anIntArray59[0] = arg0;
			@Pc(52) int local52 = 0;
			@Pc(55) int local55 = local46 + 1;
			Static83.anIntArray203[0] = arg2;
			Static63.aByteArrayArrayArray3[Static12.anInt267][arg0][arg2] = local14;
			while (local55 != local52) {
				@Pc(73) int local73 = Static48.anIntArray59[local52] & 0xFFFF;
				@Pc(81) int local81 = Static48.anIntArray59[local52] >> 16 & 0xFF;
				@Pc(89) int local89 = Static48.anIntArray59[local52] >> 24 & 0xFF;
				@Pc(95) int local95 = Static83.anIntArray203[local52] & 0xFFFF;
				@Pc(103) int local103 = Static83.anIntArray203[local52] >> 16 & 0xFF;
				local52 = local52 + 1 & 0xFFF;
				@Pc(111) boolean local111 = false;
				if ((Static2.aByteArrayArrayArray1[Static12.anInt267][local73][local95] & 0x4) == 0) {
					local111 = true;
				}
				@Pc(125) boolean local125 = false;
				@Pc(164) int local164;
				@Pc(207) int local207;
				label231: for (@Pc(129) int local129 = Static12.anInt267 + 1; local129 <= 3; local129++) {
					if ((Static2.aByteArrayArrayArray1[local129][local73][local95] & 0x8) == 0) {
						@Pc(313) Class8_Sub1 local313;
						@Pc(323) int local323;
						@Pc(302) Class128 local302;
						@Pc(308) Class117 local308;
						if (local111 && arg1[local129][local73][local95] != null) {
							if (arg1[local129][local73][local95].aClass8_Sub4_1 != null) {
								local164 = Static180.method3479(local81);
								if (local164 == arg1[local129][local73][local95].aClass8_Sub4_1.anInt6661 || arg1[local129][local73][local95].aClass8_Sub4_2 != null && arg1[local129][local73][local95].aClass8_Sub4_2.anInt6661 == local164) {
									continue;
								}
								if (local89 != 0) {
									local207 = Static180.method3479(local89);
									if (local207 == arg1[local129][local73][local95].aClass8_Sub4_1.anInt6661 || arg1[local129][local73][local95].aClass8_Sub4_2 != null && local207 == arg1[local129][local73][local95].aClass8_Sub4_2.anInt6661) {
										continue;
									}
								}
								if (local103 != 0) {
									local207 = Static180.method3479(local103);
									if (local207 == arg1[local129][local73][local95].aClass8_Sub4_1.anInt6661 || arg1[local129][local73][local95].aClass8_Sub4_2 != null && arg1[local129][local73][local95].aClass8_Sub4_2.anInt6661 == local207) {
										continue;
									}
								}
							}
							local302 = arg1[local129][local73][local95];
							if (local302.aClass117_2 != null) {
								for (local308 = local302.aClass117_2; local308 != null; local308 = local308.aClass117_1) {
									local313 = local308.aClass8_Sub1_1;
									if (local313 instanceof Interface7) {
										@Pc(319) Interface7 local319 = (Interface7) local313;
										local323 = local319.method5589();
										if (local323 == 21) {
											local323 = 19;
										}
										@Pc(332) int local332 = local319.method5590();
										@Pc(338) int local338 = local323 | local332 << 6;
										if (local338 == local81 || local89 != 0 && local89 == local338 || local103 != 0 && local338 == local103) {
											continue label231;
										}
									}
								}
							}
						}
						local302 = arg1[local129][local73][local95];
						if (local302 != null && local302.aClass117_2 != null) {
							for (local308 = local302.aClass117_2; local308 != null; local308 = local308.aClass117_1) {
								local313 = local308.aClass8_Sub1_1;
								if (local313.aShort96 != local313.aShort98 || local313.aShort97 != local313.aShort99) {
									for (@Pc(411) int local411 = local313.aShort98; local411 <= local313.aShort96; local411++) {
										for (local323 = local313.aShort97; local323 <= local313.aShort99; local323++) {
											Static63.aByteArrayArrayArray3[local129][local411][local323] = local14;
										}
									}
								}
							}
						}
						Static63.aByteArrayArrayArray3[local129][local73][local95] = local14;
						local125 = true;
					}
				}
				if (local125) {
					local164 = Static261.aClass60Array2[Static12.anInt267 + 1].method2264(local73, local95);
					if (local164 > Static226.anIntArray388[arg3]) {
						Static226.anIntArray388[arg3] = local164;
					}
					local207 = local73 << 7;
					if (local207 < Static151.anIntArray271[arg3]) {
						Static151.anIntArray271[arg3] = local207;
					} else if (Static103.anIntArray229[arg3] < local207) {
						Static103.anIntArray229[arg3] = local207;
					}
					@Pc(515) int local515 = local95 << 7;
					if (local515 < Static274.anIntArray443[arg3]) {
						Static274.anIntArray443[arg3] = local515;
					} else if (Static7.anIntArray6[arg3] < local515) {
						Static7.anIntArray6[arg3] = local515;
					}
				}
				if (!local111) {
					if (local73 >= 1 && local14 != Static63.aByteArrayArrayArray3[Static12.anInt267][local73 - 1][local95]) {
						Static48.anIntArray59[local55] = local73 - 1 | 0x120000 | 0xD3000000;
						Static83.anIntArray203[local55] = local95 | 0x130000;
						Static63.aByteArrayArrayArray3[Static12.anInt267][local73 - 1][local95] = local14;
						local55 = local55 + 1 & 0xFFF;
					}
					@Pc(590) int local590 = ~Static105.anInt2647;
					local95++;
					if (local590 < ~local95) {
						if (local73 - 1 >= 0 && Static63.aByteArrayArrayArray3[Static12.anInt267][local73 - 1][local95] != local14 && (Static2.aByteArrayArrayArray1[Static12.anInt267][local73][local95] & 0x4) == 0 && (Static2.aByteArrayArrayArray1[Static12.anInt267][local73 - 1][local95 - 1] & 0x4) == 0) {
							Static48.anIntArray59[local55] = local73 - 1 | 0x120000 | 0x52000000;
							Static83.anIntArray203[local55] = local95 | 0x130000;
							Static63.aByteArrayArrayArray3[Static12.anInt267][local73 - 1][local95] = local14;
							local55 = local55 + 1 & 0xFFF;
						}
						if (local14 != Static63.aByteArrayArrayArray3[Static12.anInt267][local73][local95]) {
							Static48.anIntArray59[local55] = 0x13000000 | 0x520000 | local73;
							Static83.anIntArray203[local55] = local95 | 0x530000;
							Static63.aByteArrayArrayArray3[Static12.anInt267][local73][local95] = local14;
							local55 = local55 + 1 & 0xFFF;
						}
						if (Static350.anInt6637 > local73 + 1 && local14 != Static63.aByteArrayArrayArray3[Static12.anInt267][local73 + 1][local95] && (Static2.aByteArrayArrayArray1[Static12.anInt267][local73][local95] & 0x4) == 0 && (Static2.aByteArrayArrayArray1[Static12.anInt267][local73 + 1][local95 - 1] & 0x4) == 0) {
							Static48.anIntArray59[local55] = local73 + 1 | 0x92000000 | 0x520000;
							Static83.anIntArray203[local55] = local95 | 0x530000;
							local55 = local55 + 1 & 0xFFF;
							Static63.aByteArrayArrayArray3[Static12.anInt267][local73 + 1][local95] = local14;
						}
					}
					local95--;
					if (local73 + 1 < Static350.anInt6637 && local14 != Static63.aByteArrayArrayArray3[Static12.anInt267][local73 + 1][local95]) {
						Static48.anIntArray59[local55] = local73 + 1 | 0x920000 | 0x53000000;
						Static83.anIntArray203[local55] = local95 | 0x930000;
						Static63.aByteArrayArrayArray3[Static12.anInt267][local73 + 1][local95] = local14;
						local55 = local55 + 1 & 0xFFF;
					}
					local95--;
					if (local95 >= 0) {
						if (local73 - 1 >= 0 && local14 != Static63.aByteArrayArrayArray3[Static12.anInt267][local73 - 1][local95] && (Static2.aByteArrayArrayArray1[Static12.anInt267][local73][local95] & 0x4) == 0 && (Static2.aByteArrayArrayArray1[Static12.anInt267][local73 - 1][local95 + 1] & 0x4) == 0) {
							Static48.anIntArray59[local55] = local73 - 1 | 0x12000000 | 0xD20000;
							Static83.anIntArray203[local55] = local95 | 0xD30000;
							local55 = local55 + 1 & 0xFFF;
							Static63.aByteArrayArrayArray3[Static12.anInt267][local73 - 1][local95] = local14;
						}
						if (Static63.aByteArrayArrayArray3[Static12.anInt267][local73][local95] != local14) {
							Static48.anIntArray59[local55] = local73 | 0xD20000 | 0x93000000;
							Static83.anIntArray203[local55] = local95 | 0xD30000;
							Static63.aByteArrayArrayArray3[Static12.anInt267][local73][local95] = local14;
							local55 = local55 + 1 & 0xFFF;
						}
						if (Static350.anInt6637 > local73 + 1 && local14 != Static63.aByteArrayArrayArray3[Static12.anInt267][local73 + 1][local95] && (Static2.aByteArrayArrayArray1[Static12.anInt267][local73][local95] & 0x4) == 0 && (Static2.aByteArrayArrayArray1[Static12.anInt267][local73 + 1][local95 + 1] & 0x4) == 0) {
							Static48.anIntArray59[local55] = local73 + 1 | 0x920000 | 0xD2000000;
							Static83.anIntArray203[local55] = local95 | 0x930000;
							Static63.aByteArrayArrayArray3[Static12.anInt267][local73 + 1][local95] = local14;
							local55 = local55 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static226.anIntArray388[arg3] != -1000000) {
				Static226.anIntArray388[arg3] += 10;
				Static151.anIntArray271[arg3] -= 50;
				Static103.anIntArray229[arg3] += 50;
				Static7.anIntArray6[arg3] += 50;
				Static274.anIntArray443[arg3] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!pl;Lclient!ls;)V")
	public static void method2628(@OriginalArg(0) Class158 arg0, @OriginalArg(1) Class128 arg1) {
		if (!arg1.aBoolean308) {
			return;
		}
		@Pc(6) short local6 = arg1.aShort61;
		@Pc(9) short local9 = arg1.aShort60;
		@Pc(12) byte local12 = arg1.aByte47;
		@Pc(15) byte local15 = arg1.aByte49;
		@Pc(21) int local21 = (local6 << 7) + 64;
		@Pc(27) int local27 = (local9 << 7) + 64;
		@Pc(31) Class128[][] local31 = Static273.aClass128ArrayArrayArray4[local12];
		@Pc(58) float local58;
		@Pc(40) int local40;
		if (Static77.aClass60Array1 == Static261.aClass60Array2) {
			local40 = Static22.anIntArrayArray12[local6][local9];
			Static170.aClass47_5.method2741(Static304.aClass60Array3[0].method2270(local21, local27), local40 & 0xFFFFFF, local40 >>> 21 & 0x7F8);
			local58 = 251.5F;
		} else {
			local58 = 201.5F - (float) (local15 + 1) * 50.0F;
		}
		Static170.aClass47_5.method2701(3000.0F, local58 * 1.5F);
		@Pc(621) Class2_Sub2 local621;
		@Pc(716) int local716;
		@Pc(719) int local719;
		@Pc(728) int local728;
		@Pc(740) int local740;
		@Pc(91) Class128 local91;
		@Pc(411) int local411;
		@Pc(335) boolean local335;
		@Pc(382) Class2_Sub2 local382;
		@Pc(413) int local413;
		@Pc(416) Class8_Sub4 local416;
		@Pc(711) int local711;
		if (arg1.aBoolean309) {
			if (Static122.aBoolean207) {
				if (local12 > 0) {
					local91 = Static273.aClass128ArrayArrayArray4[local12 - 1][local6][local9];
					if (local91 != null && local91.aBoolean308) {
						return;
					}
				}
				if (local6 <= Static61.anInt1578 && local6 > Static22.anInt442) {
					local91 = local31[local6 - 1][local9];
					if (local91 != null && local91.aBoolean308 && (local91.aBoolean309 || (arg1.aByte46 & 0x1) == 0)) {
						return;
					}
				}
				if (local6 >= Static61.anInt1578 && local6 < Static17.anInt349 - 1) {
					local91 = local31[local6 + 1][local9];
					if (local91 != null && local91.aBoolean308 && (local91.aBoolean309 || (arg1.aByte46 & 0x4) == 0)) {
						return;
					}
				}
				if (local9 <= Static246.anInt5043 && local9 > Static342.anInt6527) {
					local91 = local31[local6][local9 - 1];
					if (local91 != null && local91.aBoolean308 && (local91.aBoolean309 || (arg1.aByte46 & 0x8) == 0)) {
						return;
					}
				}
				if (local9 >= Static246.anInt5043 && local9 < Static91.anInt5895 - 1) {
					local91 = local31[local6][local9 + 1];
					if (local91 != null && local91.aBoolean308 && (local91.aBoolean309 || (arg1.aByte46 & 0x2) == 0)) {
						return;
					}
				}
			} else {
				Static122.aBoolean207 = true;
			}
			arg1.aBoolean309 = false;
			if (arg1.aClass128_1 != null) {
				local91 = arg1.aClass128_1;
				Static170.aClass47_5.method2701(3000.0F, (201.5F - (float) (local91.aByte49 + 1) * 50.0F) * 1.5F);
				if (!Static143.method2962(local91.aByte49, local6, local9)) {
					Static261.aClass60Array2[local91.aByte49].method2272(local6, local9);
				}
				@Pc(254) Class8_Sub4 local254 = local91.aClass8_Sub4_1;
				if (local254 != null) {
					if (Static308.aBoolean444) {
						if ((local254.anInt6661 & arg1.aShort62) == 0) {
							Static351.method5596(arg0, local12, local6, local9);
						} else {
							Static62.method1281(arg0, local254.anInt6661, local15, local6, local9);
						}
						Static170.aClass47_5.method2716(arg0.anInt5989, arg0.aClass4_Sub33_Sub1Array3);
					}
					local254.method5624(Static170.aClass47_5);
				}
				for (@Pc(291) Class117 local291 = local91.aClass117_2; local291 != null; local291 = local291.aClass117_1) {
					@Pc(295) Class8_Sub1 local295 = local291.aClass8_Sub1_1;
					if (local295 != null) {
						if (Static308.aBoolean444) {
							Static351.method5596(arg0, local12, local6, local9);
							Static170.aClass47_5.method2716(arg0.anInt5989, arg0.aClass4_Sub33_Sub1Array3);
						}
						local295.method5624(Static170.aClass47_5);
					}
				}
				Static170.aClass47_5.method2701(3000.0F, local58 * 1.5F);
			}
			local335 = !Static143.method2962(local15, local6, local9);
			if (local335) {
				Static261.aClass60Array2[local15].method2272(local6, local9);
				@Pc(346) Class8_Sub5 local346 = arg1.aClass8_Sub5_1;
				if (local346 != null && local346.aBoolean461) {
					if (local346.aBoolean462) {
						Static170.aClass47_5.method2701(3000.0F, (local58 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static308.aBoolean444) {
						Static351.method5596(arg0, local12, local6, local9);
						Static170.aClass47_5.method2716(arg0.anInt5989, arg0.aClass4_Sub33_Sub1Array3);
					}
					local382 = local346.method5624(Static170.aClass47_5);
					if (local382 != null) {
						local382.aClass8_1 = local346;
						local382.anInt462 = local12;
						local382.anInt453 = local6;
						local382.anInt454 = local9;
						Static151.aClass32_5.method844(local382);
					}
					if (local346.aBoolean462) {
						Static170.aClass47_5.method2701(3000.0F, local58 * 1.5F);
					}
				}
			}
			local411 = 0;
			local413 = 0;
			local416 = arg1.aClass8_Sub4_1;
			@Pc(419) Class8_Sub2 local419 = arg1.aClass8_Sub2_1;
			if (local416 != null || local419 != null) {
				if (Static61.anInt1578 == local6) {
					local411++;
				} else if (Static61.anInt1578 < local6) {
					local411 += 2;
				}
				if (Static246.anInt5043 == local9) {
					local411 += 3;
				} else if (Static246.anInt5043 > local9) {
					local411 += 6;
				}
				local413 = Static25.anIntArray18[local411];
				arg1.aShort62 = Static277.aShortArray89[local411];
			}
			if (local416 != null) {
				if ((local416.anInt6661 & Static110.anIntArray238[local411]) == 0) {
					arg1.aByte48 = 0;
				} else if (local416.anInt6661 == 16) {
					arg1.aByte48 = 3;
					arg1.aByte51 = Static179.aByteArray56[local411];
					arg1.aByte50 = (byte) (3 - arg1.aByte51);
				} else if (local416.anInt6661 == 32) {
					arg1.aByte48 = 6;
					arg1.aByte51 = Static332.aByteArray89[local411];
					arg1.aByte50 = (byte) (6 - arg1.aByte51);
				} else if (local416.anInt6661 == 64) {
					arg1.aByte48 = 12;
					arg1.aByte51 = Static103.aByteArray43[local411];
					arg1.aByte50 = (byte) (12 - arg1.aByte51);
				} else {
					arg1.aByte48 = 9;
					arg1.aByte51 = Static283.aByteArray79[local411];
					arg1.aByte50 = (byte) (9 - arg1.aByte51);
				}
				if ((local416.anInt6661 & local413) != 0 && !Static300.method4940(local15, local6, local9, local416.anInt6661)) {
					if (Static308.aBoolean444) {
						Static351.method5596(arg0, local12, local6, local9);
						Static170.aClass47_5.method2716(arg0.anInt5989, arg0.aClass4_Sub33_Sub1Array3);
					}
					@Pc(568) Class2_Sub2 local568 = local416.method5624(Static170.aClass47_5);
					if (local568 != null) {
						local568.aClass8_1 = local416;
						local568.anInt462 = local12;
						local568.anInt453 = local6;
						local568.anInt454 = local9;
						Static151.aClass32_5.method844(local568);
					}
				}
				@Pc(589) Class8_Sub4 local589 = arg1.aClass8_Sub4_2;
				if (local589 != null && (local589.anInt6661 & local413) != 0 && !Static300.method4940(local15, local6, local9, local589.anInt6661)) {
					if (Static308.aBoolean444) {
						Static351.method5596(arg0, local12, local6, local9);
						Static170.aClass47_5.method2716(arg0.anInt5989, arg0.aClass4_Sub33_Sub1Array3);
					}
					local621 = local589.method5624(Static170.aClass47_5);
					if (local621 != null) {
						local621.aClass8_1 = local589;
						local621.anInt462 = local12;
						local621.anInt453 = local6;
						local621.anInt454 = local9;
						Static151.aClass32_5.method844(local621);
					}
				}
			}
			if (local419 != null && !Static181.method3491(local15, local6, local9, local419.method5020())) {
				@Pc(652) Class8_Sub2 local652 = arg1.aClass8_Sub2_2;
				Static170.aClass47_5.method2701(3000.0F, (local58 - 0.5F) * 1.5F);
				if ((local419.anInt5896 & local413) != 0) {
					if (Static308.aBoolean444) {
						Static351.method5596(arg0, local12, local6, local9);
						Static170.aClass47_5.method2716(arg0.anInt5989, arg0.aClass4_Sub33_Sub1Array3);
					}
					local621 = local419.method5624(Static170.aClass47_5);
					if (local621 != null) {
						local621.aClass8_1 = local419;
						local621.anInt462 = local12;
						local621.anInt453 = local6;
						local621.anInt454 = local9;
						Static151.aClass32_5.method844(local621);
					}
				} else if (local419.anInt5896 == 256) {
					local711 = local419.anInt5898 - Static39.anInt1025;
					local716 = local419.anInt5892 - Static357.anInt6822;
					local719 = local419.anInt5891;
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
					if (Static308.aBoolean444) {
						Static351.method5596(arg0, local12, local6, local9);
						Static170.aClass47_5.method2716(arg0.anInt5989, arg0.aClass4_Sub33_Sub1Array3);
					}
					@Pc(764) Class2_Sub2 local764;
					if (local740 < local728) {
						local764 = local419.method5624(Static170.aClass47_5);
						if (local764 != null) {
							local764.aClass8_1 = local419;
							local764.anInt462 = local12;
							local764.anInt453 = local6;
							local764.anInt454 = local9;
							Static151.aClass32_5.method844(local764);
						}
					} else if (local652 != null) {
						local764 = local652.method5624(Static170.aClass47_5);
						if (local764 != null) {
							local764.aClass8_1 = local652;
							local764.anInt462 = local12;
							local764.anInt453 = local6;
							local764.anInt454 = local9;
							Static151.aClass32_5.method844(local764);
						}
					}
				}
				Static170.aClass47_5.method2701(3000.0F, local58 * 1.5F);
			}
			if (local335) {
				@Pc(819) Class8_Sub5 local819 = arg1.aClass8_Sub5_1;
				if (local819 != null && !local819.aBoolean461) {
					if (local819.aBoolean462) {
						Static170.aClass47_5.method2701(3000.0F, (local58 + 50.0F - 1.5F) * 1.5F);
					}
					if (Static308.aBoolean444) {
						Static351.method5596(arg0, local12, local6, local9);
						Static170.aClass47_5.method2716(arg0.anInt5989, arg0.aClass4_Sub33_Sub1Array3);
					}
					local621 = local819.method5624(Static170.aClass47_5);
					if (local621 != null) {
						local621.aClass8_1 = local819;
						local621.anInt462 = local12;
						local621.anInt453 = local6;
						local621.anInt454 = local9;
						Static151.aClass32_5.method844(local621);
					}
					if (local819.aBoolean462) {
						Static170.aClass47_5.method2701(3000.0F, local58 * 1.5F);
					}
				}
				@Pc(885) Class8_Sub3 local885 = arg1.aClass8_Sub3_1;
				if (local885 != null && !local885.aBoolean248) {
					if (Static308.aBoolean444) {
						Static351.method5596(arg0, local12, local6, local9);
						Static170.aClass47_5.method2716(arg0.anInt5989, arg0.aClass4_Sub33_Sub1Array3);
					}
					@Pc(908) Class2_Sub2 local908 = local885.method5624(Static170.aClass47_5);
					if (local908 != null) {
						local908.aClass8_1 = local885;
						local908.anInt462 = local12;
						local908.anInt453 = local6;
						local908.anInt454 = local9;
						Static151.aClass32_5.method844(local908);
					}
				}
			}
			@Pc(929) byte local929 = arg1.aByte46;
			if (local929 != 0) {
				@Pc(946) Class128 local946;
				if (local6 < Static61.anInt1578 && (local929 & 0x4) != 0) {
					local946 = local31[local6 + 1][local9];
					if (local946 != null && local946.aBoolean308) {
						Static57.aClass45_1.method3941(local946);
					}
				}
				if (local9 < Static246.anInt5043 && (local929 & 0x2) != 0) {
					local946 = local31[local6][local9 + 1];
					if (local946 != null && local946.aBoolean308) {
						Static57.aClass45_1.method3941(local946);
					}
				}
				if (local6 > Static61.anInt1578 && (local929 & 0x1) != 0) {
					local946 = local31[local6 - 1][local9];
					if (local946 != null && local946.aBoolean308) {
						Static57.aClass45_1.method3941(local946);
					}
				}
				if (local9 > Static246.anInt5043 && (local929 & 0x8) != 0) {
					local946 = local31[local6][local9 - 1];
					if (local946 != null && local946.aBoolean308) {
						Static57.aClass45_1.method3941(local946);
					}
				}
			}
		}
		@Pc(1079) int local1079;
		@Pc(1062) Class8_Sub4 local1062;
		@Pc(1083) int local1083;
		@Pc(1035) Class117 local1035;
		if (arg1.aByte48 != 0) {
			local335 = true;
			for (local1035 = arg1.aClass117_2; local1035 != null; local1035 = local1035.aClass117_1) {
				if (local1035.aClass8_Sub1_1.anInt6698 != Static218.anInt4453 && (local1035.anInt3669 & arg1.aByte48) == arg1.aByte51) {
					local335 = false;
					break;
				}
			}
			if (local335) {
				local1062 = arg1.aClass8_Sub4_1;
				if (!Static300.method4940(local15, local6, local9, local1062.anInt6661)) {
					if (Static308.aBoolean444) {
						label687: {
							if (local1062.anInt6661 >= 16) {
								local1079 = local6 - Static61.anInt1578;
								local1083 = local9 - Static246.anInt5043;
								if (local1062.anInt6661 == 16) {
									local1079 -= 64;
									local1083 += 64;
									if (local1083 < local1079 && local6 > 0 && local9 <= Static15.anInt1162) {
										Static351.method5596(arg0, local12, local6 - 1, local9 + 1);
										break label687;
									}
								} else if (local1062.anInt6661 == 32) {
									local1079 += 64;
									local1083 += 64;
									if (local1083 < -local1079 && local6 < Static198.anInt4128 && local9 < Static15.anInt1162) {
										Static351.method5596(arg0, local12, local6 + 1, local9 + 1);
										break label687;
									}
								} else if (local1062.anInt6661 == 64) {
									local1079 += 64;
									local1083 -= 64;
									if (local1083 > local1079 && local6 < Static198.anInt4128 && local9 > 0) {
										Static351.method5596(arg0, local12, local6 + 1, local9 - 1);
										break label687;
									}
								} else if (local1062.anInt6661 == 128) {
									local1079 -= 64;
									local1083 -= 64;
									if (local1083 > -local1079 && local6 > 0 && local9 > 0) {
										Static351.method5596(arg0, local12, local6 - 1, local9 - 1);
										break label687;
									}
								}
							}
							Static351.method5596(arg0, local12, local6, local9);
						}
						Static170.aClass47_5.method2716(arg0.anInt5989, arg0.aClass4_Sub33_Sub1Array3);
					}
					@Pc(1197) Class2_Sub2 local1197 = local1062.method5624(Static170.aClass47_5);
					if (local1197 != null) {
						local1197.aClass8_1 = local1062;
						local1197.anInt462 = local12;
						local1197.anInt453 = local6;
						local1197.anInt454 = local9;
						Static151.aClass32_5.method844(local1197);
					}
				}
				arg1.aByte48 = 0;
			}
		}
		@Pc(1314) int local1314;
		if (arg1.aBoolean310) {
			try {
				arg1.aBoolean310 = false;
				local40 = 0;
				label630: for (local1035 = arg1.aClass117_2; local1035 != null; local1035 = local1035.aClass117_1) {
					@Pc(1233) Class8_Sub1 local1233 = local1035.aClass8_Sub1_1;
					if (local1233.anInt6698 != Static218.anInt4453) {
						for (local1079 = local1233.aShort98; local1079 <= local1233.aShort96; local1079++) {
							for (local1083 = local1233.aShort97; local1083 <= local1233.aShort99; local1083++) {
								@Pc(1251) Class128 local1251 = local31[local1079][local1083];
								if (local1251.aBoolean309) {
									arg1.aBoolean310 = true;
									continue label630;
								}
								if (local1251.aByte48 != 0) {
									local711 = 0;
									if (local1079 > local1233.aShort98) {
										local711++;
									}
									if (local1079 < local1233.aShort96) {
										local711 += 4;
									}
									if (local1083 > local1233.aShort97) {
										local711 += 8;
									}
									if (local1083 < local1233.aShort99) {
										local711 += 2;
									}
									if ((local711 & local1251.aByte48) == arg1.aByte50) {
										arg1.aBoolean310 = true;
										continue label630;
									}
								}
							}
						}
						local1083 = Static61.anInt1578 - local1233.aShort98;
						local1314 = local1233.aShort96 - Static61.anInt1578;
						if (local1314 > local1083) {
							local1083 = local1314;
						}
						local711 = Static246.anInt5043 - local1233.aShort97;
						local716 = local1233.aShort99 - Static246.anInt5043;
						if (local716 > local711) {
							local711 = local716;
						}
						arg0.aClass8_Sub1Array3[local40] = local1233;
						arg0.anIntArray472[local40++] = local1083 + local711;
					}
				}
				while (local40 > 0) {
					local413 = -50;
					local1079 = -1;
					@Pc(1365) Class8_Sub1 local1365;
					for (local1083 = 0; local1083 < local40; local1083++) {
						local1365 = arg0.aClass8_Sub1Array3[local1083];
						if (local1365.anInt6698 != Static218.anInt4453) {
							local711 = arg0.anIntArray472[local1083];
							if (local711 > local413) {
								local413 = local711;
								local1079 = local1083;
							} else if (local711 == local413) {
								local716 = local1365.anInt6701 - Static39.anInt1025;
								local719 = local1365.anInt6702 - Static357.anInt6822;
								local728 = arg0.aClass8_Sub1Array3[local1079].anInt6701 - Static39.anInt1025;
								local740 = arg0.aClass8_Sub1Array3[local1079].anInt6702 - Static357.anInt6822;
								if (local716 * local716 + local719 * local719 > local728 * local728 + local740 * local740) {
									local1079 = local1083;
								}
							}
						}
					}
					if (local1079 == -1) {
						break;
					}
					local1365 = arg0.aClass8_Sub1Array3[local1079];
					local1365.anInt6698 = Static218.anInt4453;
					if (!Static329.method3596(local15, local1365.aShort98, local1365.aShort96, local1365.aShort97, local1365.aShort99, local1365.method5629())) {
						if (Static308.aBoolean444) {
							if (local1365.aByte78 == 0) {
								Static224.method4037(arg0, local12, local1365.aShort98, local1365.aShort97, local1365.aShort96, local1365.aShort99);
							} else {
								Static351.method5596(arg0, local12, local6, local9);
								local711 = local6 - Static61.anInt1578;
								local716 = local9 - Static246.anInt5043;
								if (local1365.aByte78 == 2) {
									if (local716 > -local711) {
										Static140.method2946(arg0, local12, local6, local9 - 1, local6 - 1, local9);
									} else {
										Static140.method2946(arg0, local12, local6, local9 + 1, local6 + 1, local9);
									}
								} else if (local716 > local711) {
									Static140.method2946(arg0, local12, local6, local9 - 1, local6 + 1, local9);
								} else {
									Static140.method2946(arg0, local12, local6, local9 + 1, local6 - 1, local9);
								}
							}
							Static170.aClass47_5.method2716(arg0.anInt5989, arg0.aClass4_Sub33_Sub1Array3);
						}
						local621 = local1365.method5624(Static170.aClass47_5);
						if (local621 != null) {
							local621.aClass8_1 = local1365;
							local621.anInt462 = local12;
							local621.anInt453 = local1365.aShort98;
							local621.anInt454 = local1365.aShort97;
							Static151.aClass32_5.method844(local621);
						}
					}
					for (local711 = local1365.aShort98; local711 <= local1365.aShort96; local711++) {
						for (local716 = local1365.aShort97; local716 <= local1365.aShort99; local716++) {
							@Pc(1590) Class128 local1590 = local31[local711][local716];
							if (local1590.aByte48 != 0) {
								Static57.aClass45_1.method3941(local1590);
							} else if ((local711 != local6 || local716 != local9) && local1590.aBoolean308) {
								Static57.aClass45_1.method3941(local1590);
							}
						}
					}
				}
				if (arg1.aBoolean310) {
					return;
				}
			} catch (@Pc(1628) Exception local1628) {
				arg1.aBoolean310 = false;
			}
		}
		if (arg1.aClass176_1 != null) {
			if (arg1.aByte52 == (byte) (Static30.anInt751 & 0xFF)) {
				@Pc(1645) Class176 local1645 = arg1.aClass176_1;
				local411 = Static261.aClass60Array2[local12].method2264(local6, local9);
				if (local12 < 3) {
					local413 = Static261.aClass60Array2[local12].method2264(local6, local9) - Static261.aClass60Array2[local12 + 1].method2264(local6, local9);
				} else {
					local413 = 1024;
				}
				Static264.aClass57_7.method4203(local21, local411, local27, arg0.anIntArray473);
				local1079 = arg0.anIntArray473[2];
				Static264.aClass57_7.method4203(local21, local411 - local413, local27, arg0.anIntArray473);
				local1083 = arg0.anIntArray473[2];
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
				local1645.anInt5514 = local1314;
				local1645.anInt5513 = local711;
				local1645.aBoolean404 = true;
				Static170.aClass47_5.method2713(local1645);
			} else {
				arg1.aClass176_1 = null;
			}
		}
		if (!arg1.aBoolean308) {
			return;
		}
		if (arg1.aByte48 != 0) {
			return;
		}
		if (local6 <= Static61.anInt1578 && local6 > Static22.anInt442) {
			local91 = local31[local6 - 1][local9];
			if (local91 != null && local91.aBoolean308) {
				return;
			}
		}
		if (local6 >= Static61.anInt1578 && local6 < Static17.anInt349 - 1) {
			local91 = local31[local6 + 1][local9];
			if (local91 != null && local91.aBoolean308) {
				return;
			}
		}
		if (local9 <= Static246.anInt5043 && local9 > Static342.anInt6527) {
			local91 = local31[local6][local9 - 1];
			if (local91 != null && local91.aBoolean308) {
				return;
			}
		}
		if (local9 >= Static246.anInt5043 && local9 < Static91.anInt5895 - 1) {
			local91 = local31[local6][local9 + 1];
			if (local91 != null && local91.aBoolean308) {
				return;
			}
		}
		arg1.aBoolean308 = false;
		Static189.anInt3960--;
		@Pc(1839) Class8_Sub3 local1839 = arg1.aClass8_Sub3_1;
		if (local1839 != null && local1839.aBoolean248) {
			if (Static308.aBoolean444) {
				Static351.method5596(arg0, local12, local6, local9);
				Static170.aClass47_5.method2716(arg0.anInt5989, arg0.aClass4_Sub33_Sub1Array3);
			}
			@Pc(1862) Class2_Sub2 local1862 = local1839.method5624(Static170.aClass47_5);
			if (local1862 != null) {
				local1862.aClass8_1 = local1839;
				local1862.anInt462 = local12;
				local1862.anInt453 = local6;
				local1862.anInt454 = local9;
				Static151.aClass32_5.method844(local1862);
			}
		}
		if (arg1.aShort62 != 0) {
			@Pc(1886) Class8_Sub2 local1886 = arg1.aClass8_Sub2_1;
			if (local1886 != null && !Static181.method3491(local15, local6, local9, local1886.method5020())) {
				if ((local1886.anInt5896 & arg1.aShort62) != 0) {
					if (Static308.aBoolean444) {
						Static351.method5596(arg0, local12, local6, local9);
						Static170.aClass47_5.method2716(arg0.anInt5989, arg0.aClass4_Sub33_Sub1Array3);
					}
					local382 = local1886.method5624(Static170.aClass47_5);
					if (local382 != null) {
						local382.aClass8_1 = local1886;
						local382.anInt462 = local12;
						local382.anInt453 = local6;
						local382.anInt454 = local9;
						Static151.aClass32_5.method844(local382);
					}
				} else if (local1886.anInt5896 == 256) {
					local413 = local1886.anInt5898 - Static39.anInt1025;
					local1079 = local1886.anInt5892 - Static357.anInt6822;
					local1083 = local1886.anInt5891;
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
					if (Static308.aBoolean444) {
						Static351.method5596(arg0, local12, local6, local9);
						Static170.aClass47_5.method2716(arg0.anInt5989, arg0.aClass4_Sub33_Sub1Array3);
					}
					@Pc(1996) Class8_Sub2 local1996 = arg1.aClass8_Sub2_2;
					@Pc(2004) Class2_Sub2 local2004;
					if (local711 > local1314) {
						local2004 = local1886.method5624(Static170.aClass47_5);
						if (local2004 != null) {
							local2004.aClass8_1 = local1886;
							local2004.anInt462 = local12;
							local2004.anInt453 = local6;
							local2004.anInt454 = local9;
							Static151.aClass32_5.method844(local2004);
						}
					} else if (local1996 != null) {
						local2004 = local1996.method5624(Static170.aClass47_5);
						if (local2004 != null) {
							local2004.aClass8_1 = local1996;
							local2004.anInt462 = local12;
							local2004.anInt453 = local6;
							local2004.anInt454 = local9;
							Static151.aClass32_5.method844(local2004);
						}
					}
				}
			}
			local1062 = arg1.aClass8_Sub4_1;
			local416 = arg1.aClass8_Sub4_2;
			@Pc(2089) Class2_Sub2 local2089;
			if (local416 != null && (local416.anInt6661 & arg1.aShort62) != 0 && !Static300.method4940(local15, local6, local9, local416.anInt6661)) {
				if (Static308.aBoolean444) {
					Static62.method1281(arg0, local416.anInt6661, local12, local6, local9);
					Static170.aClass47_5.method2716(arg0.anInt5989, arg0.aClass4_Sub33_Sub1Array3);
				}
				local2089 = local416.method5624(Static170.aClass47_5);
				if (local2089 != null) {
					local2089.aClass8_1 = local416;
					local2089.anInt462 = local12;
					local2089.anInt453 = local6;
					local2089.anInt454 = local9;
					Static151.aClass32_5.method844(local2089);
				}
			}
			if (local1062 != null && (local1062.anInt6661 & arg1.aShort62) != 0 && !Static300.method4940(local15, local6, local9, local1062.anInt6661)) {
				if (Static308.aBoolean444) {
					Static62.method1281(arg0, local1062.anInt6661, local12, local6, local9);
					Static170.aClass47_5.method2716(arg0.anInt5989, arg0.aClass4_Sub33_Sub1Array3);
				}
				local2089 = local1062.method5624(Static170.aClass47_5);
				if (local2089 != null) {
					local2089.aClass8_1 = local1062;
					local2089.anInt462 = local12;
					local2089.anInt453 = local6;
					local2089.anInt454 = local9;
					Static151.aClass32_5.method844(local2089);
				}
			}
		}
		@Pc(2175) Class128 local2175;
		if (local12 < Static327.anInt6252 - 1) {
			local2175 = Static273.aClass128ArrayArrayArray4[local12 + 1][local6][local9];
			if (local2175 != null && local2175.aBoolean308) {
				Static57.aClass45_1.method3952(local2175);
			}
		}
		if (local6 < Static61.anInt1578) {
			local2175 = local31[local6 + 1][local9];
			if (local2175 != null && local2175.aBoolean308) {
				Static57.aClass45_1.method3941(local2175);
			}
		}
		if (local9 < Static246.anInt5043) {
			local2175 = local31[local6][local9 + 1];
			if (local2175 != null && local2175.aBoolean308) {
				Static57.aClass45_1.method3941(local2175);
			}
		}
		if (local6 > Static61.anInt1578) {
			local2175 = local31[local6 - 1][local9];
			if (local2175 != null && local2175.aBoolean308) {
				Static57.aClass45_1.method3941(local2175);
			}
		}
		if (local9 > Static246.anInt5043) {
			local2175 = local31[local6][local9 - 1];
			if (local2175 != null && local2175.aBoolean308) {
				Static57.aClass45_1.method3941(local2175);
			}
		}
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(II)V")
	public static void method2629(@OriginalArg(0) int arg0) {
		@Pc(13) Class4_Sub4_Sub18 local13 = Static302.method4961(arg0, 12);
		local13.method4902();
	}
}
