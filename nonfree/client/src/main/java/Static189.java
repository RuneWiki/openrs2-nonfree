import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!og", name = "v", descriptor = "Lclient!kb;")
	public static Class83 aClass83_130;

	@OriginalMember(owner = "client!og", name = "z", descriptor = "I")
	public static int anInt4212 = 0;

	@OriginalMember(owner = "client!og", name = "C", descriptor = "[I")
	public static int[] anIntArray379 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!ok;I)V")
	public static void method3378(@OriginalArg(0) Class116 arg0) {
		if (Static95.anInt2164 == arg0.anInt4372) {
			Static165.aBooleanArray16[arg0.anInt4357] = true;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!kb;I)Z")
	public static boolean method3380(@OriginalArg(0) Class83 arg0) {
		return arg0.method2302(Static15.anInt399);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)I")
	public static int method3381() {
		if (Static159.aClass78_2 == null) {
			return -1;
		}
		while (Static218.anInt4880 < Static159.aClass78_2.anInt2855) {
			if (Static159.aClass78_2.method2183(Static218.anInt4880)) {
				return Static218.anInt4880++;
			}
			Static218.anInt4880++;
		}
		return -1;
	}

	@OriginalMember(owner = "client!og", name = "d", descriptor = "(B)V")
	public static void method3382() {
		while (true) {
			@Pc(12) Class1_Sub24 local12 = (Class1_Sub24) Static135.aClass131_8.method3798();
			if (local12 == null) {
				return;
			}
			@Pc(35) Class25_Sub1 local35;
			@Pc(26) int local26;
			if (local12.anInt4235 < 0) {
				local26 = -local12.anInt4235 - 1;
				if (Static76.anInt5427 == local26) {
					local35 = Static239.aClass25_Sub1_Sub1_2;
				} else {
					local35 = Static271.aClass25_Sub1_Sub1Array1[local26];
				}
			} else {
				local26 = local12.anInt4235 - 1;
				local35 = Static27.aClass25_Sub1_Sub2Array1[local26];
			}
			if (local35 != null) {
				@Pc(60) Class30 local60 = Static268.method4511(local12.anInt4226);
				if (Static145.anInt3477 >= 3) {
				}
				@Pc(79) int local79;
				@Pc(76) int local76;
				if (local12.anInt4238 == 1 || local12.anInt4238 == 3) {
					local79 = local60.anInt863;
					local76 = local60.anInt848;
				} else {
					local76 = local60.anInt863;
					local79 = local60.anInt848;
				}
				@Pc(95) int local95 = local12.anInt4227 + (local79 >> 1);
				@Pc(105) int local105 = local12.anInt4227 + (local79 + 1 >> 1);
				@Pc(112) int local112 = (local76 >> 1) + local12.anInt4230;
				@Pc(121) int local121 = (local76 + 1 >> 1) + local12.anInt4230;
				@Pc(125) int[][] local125 = Static287.anIntArrayArrayArray18[Static145.anInt3477];
				@Pc(130) int local130 = Static208.anIntArray471[local12.anInt4236];
				@Pc(132) Class25 local132 = null;
				@Pc(160) int local160 = local125[local95][local112] + local125[local105][local112] + local125[local95][local121] + local125[local105][local121] >> 2;
				if (local130 == 0) {
					@Pc(226) Class133 local226 = Static234.method4063(Static145.anInt3477, local12.anInt4227, local12.anInt4230);
					if (local226 != null) {
						local132 = local226.aClass25_4;
					}
				} else if (local130 == 1) {
					@Pc(212) Class101 local212 = Static150.method1234(Static145.anInt3477, local12.anInt4227, local12.anInt4230);
					if (local212 != null) {
						local132 = local212.aClass25_3;
					}
				} else if (local130 == 2) {
					@Pc(197) Class152 local197 = Static263.method4471(Static145.anInt3477, local12.anInt4227, local12.anInt4230);
					if (local197 != null) {
						local132 = local197.aClass25_6;
					}
				} else if (local130 == 3) {
					@Pc(183) Class162 local183 = Static218.method3884(Static145.anInt3477, local12.anInt4227, local12.anInt4230);
					if (local183 != null) {
						local132 = local183.aClass25_7;
					}
				}
				if (local132 != null) {
					Static227.method3949(local12.anInt4233 + 1, local12.anInt4227, local12.anInt4230, 0, Static145.anInt3477, local12.anInt4239 + 1, -1, 0, local130);
					local35.anInt1674 = local160;
					local35.anInt1637 = local12.anInt4233 + Static32.anInt809;
					local35.anInt1651 = Static32.anInt809 + local12.anInt4239;
					local35.anInt1673 = local76 * 64 + local12.anInt4230 * 128;
					local35.anInt1661 = local79 * 64 + local12.anInt4227 * 128;
					@Pc(293) int local293 = local12.anInt4229;
					@Pc(296) int local296 = local12.anInt4234;
					local35.anObject5 = local132;
					@Pc(305) int local305;
					if (local296 < local293) {
						local305 = local293;
						local293 = local296;
						local296 = local305;
					}
					@Pc(312) int local312 = local12.anInt4228;
					local35.anInt1680 = local293 + local12.anInt4227;
					@Pc(321) int local321 = local12.anInt4232;
					if (local312 < local321) {
						local305 = local321;
						local321 = local312;
						local312 = local305;
					}
					local35.anInt1622 = local312 + local12.anInt4230;
					local35.anInt1627 = local321 + local12.anInt4230;
					local35.anInt1624 = local296 + local12.anInt4227;
				}
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIII)Lclient!hh;")
	public static Class1_Sub12 method3383(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class1_Sub12 local9 = new Class1_Sub12();
		local9.anInt2229 = arg2;
		local9.anInt2230 = arg0;
		Static147.aClass117_12.method3445(local9, (long) arg1);
		Static39.method885(arg0);
		@Pc(33) Class116 local33 = Static115.method1897(arg1);
		if (local33 != null) {
			method3378(local33);
		}
		if (Static2.aClass116_16 != null) {
			method3378(Static2.aClass116_16);
			Static2.aClass116_16 = null;
		}
		@Pc(49) int local49 = Static111.anInt2398;
		@Pc(51) int local51;
		for (local51 = 0; local51 < local49; local51++) {
			if (Static102.method1690(Static213.aShortArray71[local51])) {
				Static100.method4465(local51);
			}
		}
		if (Static111.anInt2398 == 1) {
			Static218.aBoolean267 = false;
			Static205.method3644(Static82.anInt1976, Static204.anInt4548, Static66.anInt3695, Static35.anInt922);
		} else {
			Static205.method3644(Static82.anInt1976, Static204.anInt4548, Static66.anInt3695, Static35.anInt922);
			local51 = Static156.aClass1_Sub2_Sub16_3.method3966(Static141.aString94);
			for (@Pc(96) int local96 = 0; local96 < Static111.anInt2398; local96++) {
				@Pc(109) int local109 = Static156.aClass1_Sub2_Sub16_3.method3966(Static254.method4242(local96));
				if (local51 < local109) {
					local51 = local109;
				}
			}
			Static66.anInt3695 = Static111.anInt2398 * 15 + (Static236.aBoolean285 ? 26 : 22);
			Static82.anInt1976 = local51 + 8;
		}
		if (local33 != null) {
			Static23.method400(false, local33);
		}
		Static275.method4584(arg0);
		if (Static194.anInt4389 != -1) {
			Static55.method1116(Static194.anInt4389, 1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IB[Lclient!ok;IIIIIII)V")
	public static void method3384(@OriginalArg(0) int arg0, @OriginalArg(2) Class116[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static296.aBoolean335) {
			Static288.method4714(arg5, arg8, arg2, arg7);
		} else {
			Static203.method3590(arg5, arg8, arg2, arg7);
			Static151.method2838();
		}
		for (@Pc(30) int local30 = 0; local30 < arg1.length; local30++) {
			@Pc(38) Class116 local38 = arg1[local30];
			if (local38 != null && (arg6 == local38.anInt4344 || arg6 == -1412584499 && Static204.aClass116_11 == local38)) {
				@Pc(62) int local62;
				if (arg3 == -1) {
					Static120.anIntArray298[Static31.anInt803] = local38.anInt4366 + arg4;
					Static32.anIntArray89[Static31.anInt803] = local38.anInt4371 + arg0;
					Static129.anIntArray268[Static31.anInt803] = local38.anInt4299;
					Static144.anIntArray299[Static31.anInt803] = local38.anInt4363;
					local62 = Static31.anInt803++;
				} else {
					local62 = arg3;
				}
				local38.anInt4372 = Static32.anInt809;
				local38.anInt4357 = local62;
				if (!local38.aBoolean224 || !Static37.method854(local38)) {
					if (local38.anInt4301 > 0) {
						Static251.method4279(local38);
					}
					@Pc(123) int local123 = arg0 + local38.anInt4371;
					@Pc(128) int local128 = local38.anInt4366 + arg4;
					@Pc(131) int local131 = local38.anInt4323;
					if (Static24.aBoolean27 && (Static37.method866(local38).anInt1450 != 0 || local38.anInt4376 == 0) && local131 > 127) {
						local131 = 127;
					}
					@Pc(223) int local223;
					@Pc(181) int local181;
					if (local38 == Static204.aClass116_11) {
						if (arg6 != -1412584499 && !local38.aBoolean229) {
							Static280.aClass116Array2 = arg1;
							Static63.anInt1591 = arg0;
							Static218.anInt4883 = arg4;
							continue;
						}
						if (!local38.aBoolean229) {
							local131 = 128;
						}
						if (Static87.aBoolean110 && Static228.aBoolean273) {
							local181 = Static212.anInt4711;
							local181 -= Static265.anInt5771;
							if (Static250.anInt1874 > local181) {
								local181 = Static250.anInt1874;
							}
							if (local181 + local38.anInt4363 > Static250.anInt1874 - -Static143.aClass116_8.anInt4363) {
								local181 = Static143.aClass116_8.anInt4363 + Static250.anInt1874 - local38.anInt4363;
							}
							local123 = local181;
							local223 = Static84.anInt1989;
							local223 -= Static193.anInt4364;
							if (local223 < Static231.anInt5455) {
								local223 = Static231.anInt5455;
							}
							if (local223 + local38.anInt4299 > Static143.aClass116_8.anInt4299 + Static231.anInt5455) {
								local223 = Static231.anInt5455 + Static143.aClass116_8.anInt4299 - local38.anInt4299;
							}
							local128 = local223;
						}
					}
					@Pc(295) int local295;
					@Pc(302) int local302;
					@Pc(270) int local270;
					@Pc(282) int local282;
					if (local38.anInt4376 == 2) {
						local181 = arg8;
						local223 = arg5;
						local295 = arg2;
						local302 = arg7;
					} else {
						local223 = local128 <= arg5 ? arg5 : local128;
						local270 = local38.anInt4299 + local128;
						local181 = local123 > arg8 ? local123 : arg8;
						local282 = local123 + local38.anInt4363;
						if (local38.anInt4376 == 9) {
							local270++;
							local282++;
						}
						local295 = local270 < arg2 ? local270 : arg2;
						local302 = local282 >= arg7 ? arg7 : local282;
					}
					if (!local38.aBoolean224 || local223 < local295 && local302 > local181) {
						@Pc(452) int local452;
						@Pc(489) int local489;
						@Pc(533) int local533;
						@Pc(523) int local523;
						@Pc(548) int local548;
						@Pc(564) int local564;
						@Pc(505) int local505;
						@Pc(493) int local493;
						if (local38.anInt4301 != 0) {
							if (local38.anInt4301 == 1337 || local38.anInt4301 == 1403) {
								Static117.anInt2578 = local123;
								Static59.aClass116_2 = local38;
								Static210.anInt4683 = local128;
								Static125.method2134(local38.anInt4299, local128, local38.anInt4363, local38.anInt4301 == 1403, local123);
								Static165.aBooleanArray16[local62] = true;
								if (Static296.aBoolean335) {
									Static288.method4714(arg5, arg8, arg2, arg7);
								} else {
									Static203.method3590(arg5, arg8, arg2, arg7);
								}
								continue;
							}
							if (local38.anInt4301 == 1338) {
								if (!local38.method3430()) {
									continue;
								}
								Static33.method684(local123, local38, local128, local62);
								if (Static296.aBoolean335) {
									Static288.method4714(arg5, arg8, arg2, arg7);
								} else {
									Static203.method3590(arg5, arg8, arg2, arg7);
								}
								if (Static71.anInt1777 != 0 && Static71.anInt1777 != 3 || Static218.aBoolean267 || Static190.anInt4241 < local223 || local181 > Static281.anInt6019 || Static190.anInt4241 >= local295 || local302 <= Static281.anInt6019) {
									continue;
								}
								local270 = Static190.anInt4241 - local128;
								local282 = Static281.anInt6019 - local123;
								local452 = local38.anIntArray399[local282];
								if (local452 > local270 || local452 + local38.anIntArray388[local282] < local270) {
									continue;
								}
								local282 -= local38.anInt4363 / 2;
								local270 -= local38.anInt4299 / 2;
								local489 = (int) Static125.aFloat97 + Static59.anInt1529 & 0x7FF;
								local493 = Class91.anIntArray320[local489];
								local493 = (Static16.anInt453 + 256) * local493 >> 8;
								local505 = Class91.anIntArray319[local489];
								local505 = local505 * (Static16.anInt453 + 256) >> 8;
								local523 = local282 * local493 - local505 * local270 >> 11;
								local533 = local282 * local505 + local493 * local270 >> 11;
								local548 = local533 + Static239.aClass25_Sub1_Sub1_2.anInt1635 - (Static239.aClass25_Sub1_Sub1_2.method1243() - 1) * 64 >> 7;
								local564 = Static239.aClass25_Sub1_Sub1_2.anInt1604 + 64 - local523 - Static239.aClass25_Sub1_Sub1_2.method1243() * 64 >> 7;
								if (Static16.aBoolean22 && (Static177.anInt3986 & 0x40) != 0) {
									@Pc(603) Class116 local603 = Static127.method2179(Static19.anInt461, Static148.anInt3504);
									if (local603 == null) {
										Static2.method4409();
									} else {
										Static106.method1718(Static266.anInt5785, (short) 24, local548, local564, " ->", Static280.aString193, 1L);
									}
									continue;
								}
								if (Static230.anInt5101 == 1) {
									Static106.method1718(-1, (short) 9, local548, local564, "", Static265.aString186, 1L);
								}
								Static106.method1718(-1, (short) 29, local548, local564, "", Static2.aString184, 1L);
								continue;
							}
							if (local38.anInt4301 == 1339) {
								if (local38.method3430()) {
									Static286.method4699(local128, local62, local38, local123);
									if (Static296.aBoolean335) {
										Static288.method4714(arg5, arg8, arg2, arg7);
									} else {
										Static203.method3590(arg5, arg8, arg2, arg7);
									}
								}
								continue;
							}
							if (local38.anInt4301 == 1400) {
								Static216.method3787(local38.anInt4363, local38.anInt4299, local123, local128);
								Static165.aBooleanArray16[local62] = true;
								Static138.aBooleanArray13[local62] = true;
								if (Static296.aBoolean335) {
									Static288.method4714(arg5, arg8, arg2, arg7);
								} else {
									Static203.method3590(arg5, arg8, arg2, arg7);
								}
								continue;
							}
							if (local38.anInt4301 == 1401) {
								Static196.method3516(local38.anInt4363, local128, local123, local38.anInt4299);
								Static165.aBooleanArray16[local62] = true;
								Static138.aBooleanArray13[local62] = true;
								if (Static296.aBoolean335) {
									Static288.method4714(arg5, arg8, arg2, arg7);
								} else {
									Static203.method3590(arg5, arg8, arg2, arg7);
								}
								continue;
							}
							if (local38.anInt4301 == 1402) {
								if (!Static296.aBoolean335) {
									Static272.method4545(local128, local123);
									Static165.aBooleanArray16[local62] = true;
									Static138.aBooleanArray13[local62] = true;
								}
								continue;
							}
							if (local38.anInt4301 == 1405) {
								if (!Static167.aBoolean196) {
									continue;
								}
								local270 = local38.anInt4299 + local128;
								local505 = 16776960;
								local282 = local123 + 15;
								Static58.aClass1_Sub2_Sub16_2.method3980("Fps:" + Static181.anInt4085, local270, local282, 16776960, -1);
								local282 += 15;
								@Pc(788) Runtime local788 = Runtime.getRuntime();
								local489 = (int) ((local788.totalMemory() - local788.freeMemory()) / 1024L);
								if (local489 > 65536) {
									local505 = 16711680;
								}
								Static58.aClass1_Sub2_Sub16_2.method3980("Mem:" + local489 + "k", local270, local282, local505, -1);
								local282 += 15;
								if (Static296.aBoolean335) {
									local505 = 16776960;
									local493 = (Static237.anInt5215 + Static237.anInt5213 + Static237.anInt5214) / 1024;
									if (local493 > 65536) {
										local505 = 16711680;
									}
									Static58.aClass1_Sub2_Sub16_2.method3980("Card:" + local493 + "k", local270, local282, local505, -1);
									local282 += 15;
								}
								local533 = 0;
								local523 = 0;
								local493 = 0;
								for (local548 = 0; local548 < 29; local548++) {
									local493 += Static179.aClass85_Sub1Array2[local548].method2519();
									local533 += Static179.aClass85_Sub1Array2[local548].method2514();
									local523 += Static179.aClass85_Sub1Array2[local548].method2517();
								}
								local548 = local523 * 100 / local493;
								local564 = local533 * 10000 / local493;
								@Pc(930) String local930 = "Cache:" + Static173.method3186(2, (long) local564, 0, true) + "% (" + local548 + "%)";
								Static14.aClass1_Sub2_Sub16_1.method3980(local930, local270, local282, 16776960, -1);
								Static165.aBooleanArray16[local62] = true;
								Static138.aBooleanArray13[local62] = true;
								local282 += 12;
								continue;
							}
							if (local38.anInt4301 == 1406) {
								Static135.anInt3037 = local123;
								Static65.anInt403 = local128;
								Static100.aClass116_18 = local38;
								continue;
							}
						}
						if (!Static218.aBoolean267) {
							if (local38.anInt4376 == 0 && local38.aBoolean220 && local223 <= Static190.anInt4241 && Static281.anInt6019 >= local181 && Static190.anInt4241 < local295 && local302 > Static281.anInt6019 && !Static24.aBoolean27) {
								Static213.aShortArray71[0] = 1003;
								Static165.aStringArray17[0] = Static266.aString189;
								Static111.anInt2398 = 1;
								Static153.anIntArray326[0] = Static78.anInt1880;
								Static24.aStringArray3[0] = "";
							}
							if (Static190.anInt4241 >= local223 && Static281.anInt6019 >= local181 && Static190.anInt4241 < local295 && local302 > Static281.anInt6019) {
								Static202.method3587(local38, Static281.anInt6019 - local123, Static190.anInt4241 - local128);
							}
						}
						if (local38.anInt4376 == 0) {
							if (!local38.aBoolean224 && Static37.method854(local38) && Static110.aClass116_6 != local38) {
								continue;
							}
							if (!local38.aBoolean224) {
								if (local38.anInt4307 > local38.anInt4320 - local38.anInt4363) {
									local38.anInt4307 = local38.anInt4320 - local38.anInt4363;
								}
								if (local38.anInt4307 < 0) {
									local38.anInt4307 = 0;
								}
							}
							if (Static296.aBoolean335 && local38.anInt4301 == 1407) {
								Static214.method3754(local128, local123, local38.anInt4299, local38.anInt4363);
							}
							method3384(local123 - local38.anInt4307, arg1, local295, local62, local128 - local38.anInt4303, local223, local38.anInt4290, local302, local181);
							if (local38.aClass116Array1 != null) {
								method3384(local123 - local38.anInt4307, local38.aClass116Array1, local295, local62, local128 - local38.anInt4303, local223, local38.anInt4290, local302, local181);
							}
							@Pc(1146) Class1_Sub12 local1146 = (Class1_Sub12) Static147.aClass117_12.method3438((long) local38.anInt4290);
							if (local1146 != null) {
								if (local1146.anInt2229 == 0 && !Static218.aBoolean267 && Static190.anInt4241 >= local223 && local181 <= Static281.anInt6019 && local295 > Static190.anInt4241 && local302 > Static281.anInt6019 && !Static24.aBoolean27) {
									Static213.aShortArray71[0] = 1003;
									Static111.anInt2398 = 1;
									Static153.anIntArray326[0] = Static78.anInt1880;
									Static165.aStringArray17[0] = Static266.aString189;
									Static24.aStringArray3[0] = "";
								}
								Static257.method4355(local223, local123, local295, local62, local302, local181, local1146.anInt2230, local128);
							}
							if (Static296.aBoolean335 && local38.anInt4301 == 1407) {
								Static214.method3749();
							}
							if (Static296.aBoolean335) {
								Static288.method4714(arg5, arg8, arg2, arg7);
							} else {
								Static203.method3590(arg5, arg8, arg2, arg7);
								Static151.method2838();
							}
						}
						if (Static217.aBooleanArray20[local62] || Static171.anInt3878 > 1) {
							if (local38.anInt4376 == 0 && !local38.aBoolean224 && local38.anInt4363 < local38.anInt4320) {
								Static32.method663(local38.anInt4320, local128 + local38.anInt4299, local38.anInt4363, local38.anInt4307, local123);
							}
							if (local38.anInt4376 != 1) {
								if (local38.anInt4376 == 2) {
									local270 = 0;
									for (local282 = 0; local282 < local38.anInt4347; local282++) {
										for (local452 = 0; local452 < local38.anInt4292; local452++) {
											local505 = local123 + (local38.anInt4377 + 32) * local282;
											local489 = local128 + local452 * (local38.anInt4373 + 32);
											if (local270 < 20) {
												local489 += local38.anIntArray401[local270];
												local505 += local38.anIntArray400[local270];
											}
											if (local38.anIntArray404[local270] > 0) {
												local523 = local38.anIntArray404[local270] - 1;
												if (local489 + 32 > arg5 && local489 < arg2 && arg8 < local505 + 32 && arg7 > local505 || local38 == Static117.aClass116_7 && Static219.anInt4895 == local270) {
													@Pc(1429) Class1_Sub2_Sub14 local1429;
													if (Static272.anInt5854 == 1 && Static209.anInt4643 == local270 && local38.anInt4290 == Static190.anInt4240) {
														local1429 = Static260.method4431(null, local523, 2, 0, local38.aBoolean226, local38.anIntArray397[local270]);
													} else {
														local1429 = Static260.method4431(null, local523, 1, 3153952, local38.aBoolean226, local38.anIntArray397[local270]);
													}
													if (Static151.aBoolean177) {
														Static165.aBooleanArray16[local62] = true;
													}
													if (local1429 == null) {
														method3378(local38);
													} else if (local38 == Static117.aClass116_7 && local270 == Static219.anInt4895) {
														local533 = Static212.anInt4711 - Static1.anInt74;
														local493 = Static84.anInt1989 - Static213.anInt4721;
														if (local533 < 5 && local533 > -5) {
															local533 = 0;
														}
														if (local493 < 5 && local493 > -5) {
															local493 = 0;
														}
														if (Static169.anInt3855 < 5) {
															local533 = 0;
															local493 = 0;
														}
														local1429.method2721(local493 + local489, local533 + local505, 128);
														if (arg6 != -1) {
															@Pc(1541) Class116 local1541 = arg1[arg6 & 0xFFFF];
															@Pc(1545) int local1545;
															@Pc(1547) int local1547;
															if (Static296.aBoolean335) {
																local1545 = Static288.anInt6089;
																local1547 = Static288.anInt6090;
															} else {
																local1547 = Static203.anInt4506;
																local1545 = Static203.anInt4509;
															}
															@Pc(1576) int local1576;
															if (local1545 > local505 + local533 && local1541.anInt4307 > 0) {
																local1576 = Static112.anInt2417 * (local1545 - local505 - local533) / 3;
																if (Static112.anInt2417 * 10 < local1576) {
																	local1576 = Static112.anInt2417 * 10;
																}
																if (local1576 > local1541.anInt4307) {
																	local1576 = local1541.anInt4307;
																}
																Static1.anInt74 += local1576;
																local1541.anInt4307 -= local1576;
																method3378(local1541);
															}
															if (local533 + local505 + 32 > local1547 && local1541.anInt4320 - local1541.anInt4363 > local1541.anInt4307) {
																local1576 = (local505 + local533 + 32 - local1547) * Static112.anInt2417 / 3;
																if (local1576 > Static112.anInt2417 * 10) {
																	local1576 = Static112.anInt2417 * 10;
																}
																if (local1541.anInt4320 - local1541.anInt4363 - local1541.anInt4307 < local1576) {
																	local1576 = local1541.anInt4320 - local1541.anInt4307 - local1541.anInt4363;
																}
																local1541.anInt4307 += local1576;
																Static1.anInt74 -= local1576;
																method3378(local1541);
															}
														}
													} else if (local38 == Static63.aClass116_3 && Static182.anInt4423 == local270) {
														local1429.method2721(local489, local505, 128);
													} else {
														local1429.method2727(local489, local505);
													}
												}
											} else if (local38.anIntArray398 != null && local270 < 20) {
												@Pc(1354) Class1_Sub2_Sub14 local1354 = local38.method3426(local270);
												if (local1354 != null) {
													local1354.method2727(local489, local505);
												} else if (Static77.aBoolean111) {
													method3378(local38);
												}
											}
											local270++;
										}
									}
								} else if (local38.anInt4376 == 3) {
									if (Static68.method1299(local38)) {
										local270 = local38.anInt4332;
										if (local38 == Static110.aClass116_6 && local38.anInt4304 != 0) {
											local270 = local38.anInt4304;
										}
									} else {
										local270 = local38.anInt4294;
										if (Static110.aClass116_6 == local38 && local38.anInt4296 != 0) {
											local270 = local38.anInt4296;
										}
									}
									if (local131 == 0) {
										if (local38.aBoolean215) {
											if (Static296.aBoolean335) {
												Static288.method4713(local128, local123, local38.anInt4299, local38.anInt4363, local270);
											} else {
												Static203.method3592(local128, local123, local38.anInt4299, local38.anInt4363, local270);
											}
										} else if (Static296.aBoolean335) {
											Static288.method4709(local128, local123, local38.anInt4299, local38.anInt4363, local270);
										} else {
											Static203.method3598(local128, local123, local38.anInt4299, local38.anInt4363, local270);
										}
									} else if (local38.aBoolean215) {
										if (Static296.aBoolean335) {
											Static288.method4716(local128, local123, local38.anInt4299, local38.anInt4363, local270, 256 - (local131 & 0xFF));
										} else {
											Static203.method3603(local128, local123, local38.anInt4299, local38.anInt4363, local270, 256 - (local131 & 0xFF));
										}
									} else if (Static296.aBoolean335) {
										Static288.method4723(local128, local123, local38.anInt4299, local38.anInt4363, local270, 256 - (local131 & 0xFF));
									} else {
										Static203.method3611(local128, local123, local38.anInt4299, local38.anInt4363, local270, 256 - (local131 & 0xFF));
									}
								} else {
									@Pc(1870) Class1_Sub2_Sub16 local1870;
									if (local38.anInt4376 == 4) {
										local1870 = local38.method3428(Static216.aClass7Array3);
										if (local1870 != null) {
											@Pc(1885) String local1885 = local38.aString127;
											if (Static68.method1299(local38)) {
												local282 = local38.anInt4332;
												if (Static110.aClass116_6 == local38 && local38.anInt4304 != 0) {
													local282 = local38.anInt4304;
												}
												if (local38.aString129.length() > 0) {
													local1885 = local38.aString129;
												}
											} else {
												local282 = local38.anInt4294;
												if (local38 == Static110.aClass116_6 && local38.anInt4296 != 0) {
													local282 = local38.anInt4296;
												}
											}
											if (local38.aBoolean224 && local38.anInt4356 != -1) {
												@Pc(1944) Class138 local1944 = Static238.method4099(local38.anInt4356);
												local1885 = local1944.aString159;
												if (local1885 == null) {
													local1885 = "null";
												}
												if ((local1944.anInt5053 == 1 || local38.anInt4338 != 1) && local38.anInt4338 != -1) {
													local1885 = "<col=ff9040>" + local1885 + "</col> x" + Static105.method4741(local38.anInt4338);
												}
											}
											if (local38 == Static2.aClass116_16) {
												local282 = local38.anInt4294;
												local1885 = Static44.aString44;
											}
											if (!local38.aBoolean224) {
												local1885 = Static75.method1385(local1885, local38);
											}
											local1870.method3964(local1885, local128, local123, local38.anInt4299, local38.anInt4363, local282, local38.aBoolean218 ? 0 : -1, local38.anInt4378, local38.anInt4358, local38.anInt4324);
										} else if (Static77.aBoolean111) {
											method3378(local38);
										}
									} else if (local38.anInt4376 == 5) {
										@Pc(2038) Class1_Sub2_Sub14 local2038;
										if (!local38.aBoolean224) {
											local2038 = local38.method3422(Static68.method1299(local38));
											if (local2038 != null) {
												local2038.method2727(local128, local123);
											} else if (Static77.aBoolean111) {
												method3378(local38);
											}
										} else if (local38.anInt4295 >= 0) {
											@Pc(2554) Class150 local2554 = local38.method3421();
											if (Static296.aBoolean335) {
												local2554.method4251(0, local128, local123, local38.anInt4299, local38.anInt4363, local38.anInt4300, local38.anInt4319, 0);
											} else {
												local2554.method4253(0, local128, local123, local38.anInt4299, local38.anInt4363, local38.anInt4300, local38.anInt4319);
											}
										} else {
											if (local38.anInt4356 == -1) {
												local2038 = local38.method3422(false);
											} else if (local38.aBoolean214 && Static239.aClass25_Sub1_Sub1_2.aClass147_2 != null) {
												local2038 = Static260.method4431(Static239.aClass25_Sub1_Sub1_2.aClass147_2, local38.anInt4356, local38.anInt4375, local38.anInt4341, local38.aBoolean226, local38.anInt4338);
											} else {
												local2038 = Static260.method4431(null, local38.anInt4356, local38.anInt4375, local38.anInt4341, local38.aBoolean226, local38.anInt4338);
											}
											if (local2038 != null) {
												local282 = local2038.anInt3428;
												local452 = local2038.anInt3427;
												if (local38.aBoolean223) {
													local489 = (local38.anInt4299 + local282 - 1) / local282;
													local505 = (local452 + local38.anInt4363 - 1) / local452;
													if (Static296.aBoolean335) {
														Static288.method4717(local128, local123, local128 + local38.anInt4299, local38.anInt4363 + local123);
														@Pc(2248) boolean local2248 = Static102.method1686(local2038.anInt3438);
														@Pc(2253) boolean local2253 = Static102.method1686(local2038.anInt3430);
														@Pc(2256) Class1_Sub2_Sub14_Sub2 local2256 = (Class1_Sub2_Sub14_Sub2) local2038;
														if (local2248 && local2253) {
															if (local131 == 0) {
																local2256.method2734(local128, local123, local489, local505);
															} else {
																local2256.method2738(local128, local123, 256 - (local131 & 0xFF), local489, local505);
															}
														} else if (local2248) {
															for (local548 = 0; local548 < local505; local548++) {
																if (local131 == 0) {
																	local2256.method2734(local128, local123 + local452 * local548, local489, 1);
																} else {
																	local2256.method2738(local128, local123 + local548 * local452, 256 - (local131 & 0xFF), local489, 1);
																}
															}
														} else if (local2253) {
															for (local548 = 0; local548 < local489; local548++) {
																if (local131 == 0) {
																	local2256.method2734(local282 * local548 + local128, local123, 1, local505);
																} else {
																	local2256.method2738(local548 * local282 + local128, local123, 256 - (local131 & 0xFF), 1, local505);
																}
															}
														} else {
															for (local548 = 0; local548 < local489; local548++) {
																for (local564 = 0; local564 < local505; local564++) {
																	if (local131 == 0) {
																		local2038.method2727(local128 + local548 * local282, local452 * local564 + local123);
																	} else {
																		local2038.method2721(local128 + local548 * local282, local564 * local452 + local123, 256 - (local131 & 0xFF));
																	}
																}
															}
														}
														Static288.method4714(arg5, arg8, arg2, arg7);
													} else {
														Static203.method3596(local128, local123, local128 + local38.anInt4299, local123 + local38.anInt4363);
														for (local493 = 0; local493 < local489; local493++) {
															for (local533 = 0; local533 < local505; local533++) {
																if (local38.anInt4318 != 0) {
																	local2038.method2730(local282 / 2 + local128 + local493 * local282, local38.anInt4318, local452 / 2 + local452 * local533 + local123, 4096);
																} else if (local131 == 0) {
																	local2038.method2727(local128 + local282 * local493, local123 + local452 * local533);
																} else {
																	local2038.method2721(local493 * local282 + local128, local533 * local452 + local123, 256 - (local131 & 0xFF));
																}
															}
														}
														Static203.method3590(arg5, arg8, arg2, arg7);
													}
												} else {
													local489 = local38.anInt4299 * 4096 / local282;
													if (local38.anInt4318 != 0) {
														local2038.method2730(local128 + local38.anInt4299 / 2, local38.anInt4318, local123 + local38.anInt4363 / 2, local489);
													} else if (local131 != 0) {
														local2038.method2719(local128, local123, local38.anInt4299, local38.anInt4363, 256 - (local131 & 0xFF));
													} else if (local38.anInt4299 == local282 && local38.anInt4363 == local452) {
														local2038.method2727(local128, local123);
													} else {
														local2038.method2726(local128, local123, local38.anInt4299, local38.anInt4363);
													}
												}
											} else if (Static77.aBoolean111) {
												method3378(local38);
											}
										}
									} else {
										@Pc(2756) Class138 local2756;
										if (local38.anInt4376 == 6) {
											@Pc(2596) boolean local2596 = Static68.method1299(local38);
											@Pc(2598) Class25_Sub2 local2598 = null;
											if (local2596) {
												local282 = local38.anInt4383;
											} else {
												local282 = local38.anInt4367;
											}
											local489 = 0;
											if (local38.anInt4356 != -1) {
												local2756 = Static238.method4099(local38.anInt4356);
												if (local2756 != null) {
													local2756 = local2756.method4010(local38.anInt4338);
													@Pc(2775) Class163 local2775 = local282 == -1 ? null : Static115.method1895(local282);
													if (local38.aBoolean214 && Static239.aClass25_Sub1_Sub1_2.aClass147_2 != null) {
														local2598 = local2756.method4018(local38.anInt4369, local2775, 1, Static239.aClass25_Sub1_Sub1_2.aClass147_2, local38.anInt4374, local38.anInt4380);
													} else {
														local2598 = local2756.method4018(local38.anInt4369, local2775, 1, null, local38.anInt4374, local38.anInt4380);
													}
													if (local2598 == null) {
														method3378(local38);
													} else {
														local489 = -local2598.method4773() / 2;
													}
												}
											} else if (local38.anInt4382 == 5) {
												if (local38.anInt4385 == -1) {
													local2598 = Static22.aClass147_1.method4166(-1, null, null, -1, 0, -1, 0, -1, null);
												} else {
													local505 = local38.anInt4385 & 0x7FF;
													if (Static76.anInt5427 == local505) {
														local505 = 2047;
													}
													@Pc(2655) Class25_Sub1_Sub1 local2655 = Static271.aClass25_Sub1_Sub1Array1[local505];
													@Pc(2664) Class163 local2664 = local282 == -1 ? null : Static115.method1895(local282);
													if (local2655 != null && (int) Static94.method4774(local2655.aString26) << 11 == (local38.anInt4385 & 0xFFFFF800)) {
														local2598 = local2655.aClass147_2.method4166(-1, null, local2664, -1, 0, local38.anInt4374, 0, 0, null);
													}
												}
											} else if (local282 == -1) {
												local2598 = local38.method3431(local2596, 0, -1, -1, Static239.aClass25_Sub1_Sub1_2.aClass147_2, null);
												if (local2598 == null && Static77.aBoolean111) {
													method3378(local38);
												}
											} else {
												@Pc(2708) Class163 local2708 = Static115.method1895(local282);
												local2598 = local38.method3431(local2596, local38.anInt4369, local38.anInt4380, local38.anInt4374, Static239.aClass25_Sub1_Sub1_2.aClass147_2, local2708);
												if (local2598 == null && Static77.aBoolean111) {
													method3378(local38);
												}
											}
											if (local2598 != null) {
												if (local38.anInt4335 <= 0) {
													local493 = 256;
												} else {
													local493 = (local38.anInt4363 << 8) / local38.anInt4335;
												}
												if (local38.anInt4353 <= 0) {
													local505 = 256;
												} else {
													local505 = (local38.anInt4299 << 8) / local38.anInt4353;
												}
												local533 = local128 + local38.anInt4299 / 2 + (local38.anInt4314 * local505 >> 8);
												local523 = local123 + local38.anInt4363 / 2 + (local493 * local38.anInt4289 >> 8);
												if (Static296.aBoolean335) {
													if (local38.aBoolean216) {
														Static296.method4826(local533, local523, local38.anInt4291, local38.aShort25, local505, local493);
													} else {
														Static296.method4821(local533, local523, local505, local493);
														Static296.method4830((float) local38.aShort26, (float) local38.aShort25 * 1.5F);
													}
													Static296.method4822();
													Static296.method4798(true);
													Static296.method4814(false);
													Static284.method4680(Static20.anInt5576);
													if (Static177.aBoolean203) {
														Static288.method4710();
														Static296.method4836();
														Static288.method4714(arg5, arg8, arg2, arg7);
														Static177.aBoolean203 = false;
													}
													if (local38.aBoolean219) {
														Static296.method4808();
													}
													local548 = local38.anInt4291 * Class91.anIntArray319[local38.anInt4362] >> 16;
													local564 = local38.anInt4291 * Class91.anIntArray320[local38.anInt4362] >> 16;
													if (local38.aBoolean224) {
														local2598.method3487(local38.anInt4361, local38.anInt4330, local38.anInt4362, local38.anInt4350, local38.anInt4331 + local489 + local548, local38.anInt4331 + local564, -1L);
													} else {
														local2598.method3487(local38.anInt4361, 0, local38.anInt4362, 0, local548, local564, -1L);
													}
													if (local38.aBoolean219) {
														Static296.method4813();
													}
												} else {
													Static151.method2836(local533, local523);
													local548 = Class91.anIntArray319[local38.anInt4362] * local38.anInt4291 >> 16;
													local564 = local38.anInt4291 * Class91.anIntArray320[local38.anInt4362] >> 16;
													if (!local38.aBoolean224) {
														local2598.method3487(local38.anInt4361, 0, local38.anInt4362, 0, local548, local564, -1L);
													} else if (local38.aBoolean216) {
														((Class25_Sub2_Sub2) local2598).method3503(local38.anInt4361, local38.anInt4330, local38.anInt4362, local38.anInt4350, local548 + local489 + local38.anInt4331, local564 + local38.anInt4331, local38.anInt4291);
													} else {
														local2598.method3487(local38.anInt4361, local38.anInt4330, local38.anInt4362, local38.anInt4350, local489 + local548 + local38.anInt4331, local38.anInt4331 + local564, -1L);
													}
													Static151.method2837();
												}
											}
										} else {
											if (local38.anInt4376 == 7) {
												local1870 = local38.method3428(Static216.aClass7Array3);
												if (local1870 == null) {
													if (Static77.aBoolean111) {
														method3378(local38);
													}
													continue;
												}
												local282 = 0;
												for (local452 = 0; local452 < local38.anInt4347; local452++) {
													for (local489 = 0; local489 < local38.anInt4292; local489++) {
														if (local38.anIntArray404[local282] > 0) {
															local2756 = Static238.method4099(local38.anIntArray404[local282] - 1);
															@Pc(3185) String local3185;
															if (local2756.anInt5053 != 1 && local38.anIntArray397[local282] == 1) {
																local3185 = "<col=ff9040>" + local2756.aString159 + "</col>";
															} else {
																local3185 = "<col=ff9040>" + local2756.aString159 + "</col> x" + Static105.method4741(local38.anIntArray397[local282]);
															}
															local523 = local452 * (local38.anInt4377 + 12) + local123;
															local533 = (local38.anInt4373 + 115) * local489 + local128;
															if (local38.anInt4378 == 0) {
																local1870.method3981(local3185, local533, local523, local38.anInt4294, local38.aBoolean218 ? 0 : -1);
															} else if (local38.anInt4378 == 1) {
																local1870.method3972(local3185, local533 + 57, local523, local38.anInt4294, local38.aBoolean218 ? 0 : -1);
															} else {
																local1870.method3980(local3185, local533 + 114, local523, local38.anInt4294, local38.aBoolean218 ? 0 : -1);
															}
														}
														local282++;
													}
												}
											}
											if (local38.anInt4376 == 8 && Static87.aClass116_4 == local38 && Static15.anInt401 == Static98.anInt2196) {
												local282 = 0;
												local270 = 0;
												@Pc(3308) Class1_Sub2_Sub16 local3308 = Static58.aClass1_Sub2_Sub16_2;
												@Pc(3311) String local3311 = local38.aString127;
												local3311 = Static75.method1385(local3311, local38);
												@Pc(3331) String local3331;
												while (local3311.length() > 0) {
													local493 = local3311.indexOf("<br>");
													if (local493 == -1) {
														local3331 = local3311;
														local3311 = "";
													} else {
														local3331 = local3311.substring(0, local493);
														local3311 = local3311.substring(local493 + 4);
													}
													local533 = local3308.method3966(local3331);
													if (local270 < local533) {
														local270 = local533;
													}
													local282 += local3308.anInt5004 + 1;
												}
												local282 += 7;
												local270 += 6;
												local493 = local128 + local38.anInt4299 - local270 - 5;
												local533 = local123 + local38.anInt4363 + 5;
												if (local128 + 5 > local493) {
													local493 = local128 + 5;
												}
												if (local282 + local533 > arg7) {
													local533 = arg7 - local282;
												}
												if (arg2 < local270 + local493) {
													local493 = arg2 - local270;
												}
												if (Static296.aBoolean335) {
													Static288.method4713(local493, local533, local270, local282, 16777120);
													Static288.method4709(local493, local533, local270, local282, 0);
												} else {
													Static203.method3592(local493, local533, local270, local282, 16777120);
													Static203.method3598(local493, local533, local270, local282, 0);
												}
												local523 = local533 + local3308.anInt5004 + 2;
												local3311 = local38.aString127;
												local3311 = Static75.method1385(local3311, local38);
												while (local3311.length() > 0) {
													local548 = local3311.indexOf("<br>");
													if (local548 == -1) {
														local3331 = local3311;
														local3311 = "";
													} else {
														local3331 = local3311.substring(0, local548);
														local3311 = local3311.substring(local548 + 4);
													}
													local3308.method3981(local3331, local493 + 3, local523, 0, -1);
													local523 += local3308.anInt5004 + 1;
												}
											}
											if (local38.anInt4376 == 9) {
												if (local38.aBoolean217) {
													local489 = local123;
													local282 = local38.anInt4363 + local123;
													local452 = local38.anInt4299 + local128;
												} else {
													local452 = local128 + local38.anInt4299;
													local282 = local123;
													local489 = local123 + local38.anInt4363;
												}
												if (local38.anInt4315 == 1) {
													if (Static296.aBoolean335) {
														Static288.method4718(local128, local282, local452, local489, local38.anInt4294);
													} else {
														Static203.method3597(local128, local282, local452, local489, local38.anInt4294);
													}
												} else if (Static296.aBoolean335) {
													Static288.method4720(local128, local282, local452, local489, local38.anInt4294, local38.anInt4315);
												} else {
													Static203.method3613(local128, local282, local452, local489, local38.anInt4294, local38.anInt4315);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
