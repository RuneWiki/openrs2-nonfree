import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!client", name = "V", descriptor = "I")
	public static int anInt1495 = 0;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "[Z")
	public static final boolean[] aBooleanArray7 = new boolean[100];

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "[I")
	public static final int[] anIntArray134 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "Lclient!bu;")
	public static final Class38 aClass38_4 = new Class38(8);

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1046() {
		@Pc(1) int local1 = Static180.anInt3908;
		@Pc(3) int[] local3 = Static274.anIntArray500;
		@Pc(11) int local11 = Static201.aBoolean259 ? local1 : local1 + Static197.anInt4078;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class30_Sub1_Sub1 local23;
			if (local13 < local1) {
				local23 = Static135.aClass30_Sub1_Sub1_Sub2Array1[local3[local13]];
			} else {
				local23 = ((Class1_Sub27) Static24.aClass38_3.method765((long) Static415.anIntArray701[local13 - local1])).aClass30_Sub1_Sub1_Sub1_2;
			}
			if (local23.anInt1292 >= 0) {
				@Pc(43) int local43 = local23.method944();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt7490 & 0x7F) == 0 && (local23.anInt7488 & 0x7F) == 0) {
						continue;
					}
				} else if ((local23.anInt7490 & 0x7F) == 64 && (local23.anInt7488 & 0x7F) == 64) {
					continue;
				}
				if (local23 instanceof Class30_Sub1_Sub1_Sub2 && local23.aClass1_Sub31_3 != null && Static187.anInt3975 >= local23.aClass1_Sub31_3.anInt5420 && Static187.anInt3975 < local23.aClass1_Sub31_3.anInt5423) {
					((Class30_Sub1_Sub1_Sub2) local23).aBoolean84 = false;
				}
				local23.anInt7495 = Static227.method3475(local23.anInt7490, local23.anInt7488, local23.aByte102);
				Static193.method3130(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)V")
	public static void method1049(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class108 local13 = Static134.aClass108ArrayArray1[arg1][arg2];
		Static130.method2139(local13 == null ? Static201.aClass108_2 : local13, arg0);
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	public static void method1050(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static180.anInt3908;
		@Pc(3) int[] local3 = Static274.anIntArray500;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static197.anInt4078; local5++) {
			@Pc(15) Class30_Sub1_Sub1 local15;
			if (local5 < local1) {
				local15 = Static135.aClass30_Sub1_Sub1_Sub2Array1[local3[local5]];
			} else {
				local15 = ((Class1_Sub27) Static24.aClass38_3.method765((long) Static415.anIntArray701[local5 - local1])).aClass30_Sub1_Sub1_Sub1_2;
			}
			if (local15.aByte102 == arg0 && local15.anInt1292 >= 0) {
				@Pc(39) int local39 = local15.method944();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt7490 & 0x7F) != 0 || (local15.anInt7488 & 0x7F) != 0) {
						continue;
					}
				} else if ((local15.anInt7490 & 0x7F) != 64 || (local15.anInt7488 & 0x7F) != 64) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt7490 >> 7;
					local80 = local15.anInt7488 >> 7;
					if (local15.anInt1292 > Static65.anIntArrayArray18[local75][local80]) {
						Static65.anIntArrayArray18[local75][local80] = local15.anInt1292;
						Static163.anIntArrayArray33[local75][local80] = 1;
					} else if (local15.anInt1292 == Static65.anIntArrayArray18[local75][local80]) {
						local116 = Static163.anIntArrayArray33[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 64 + 60;
					local80 = local15.anInt7490 - local75 >> 7;
					@Pc(142) int local142 = local15.anInt7488 - local75 >> 7;
					@Pc(149) int local149 = local15.anInt7490 + local75 >> 7;
					@Pc(156) int local156 = local15.anInt7488 + local75 >> 7;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt1292 > Static65.anIntArrayArray18[local158][local161]) {
								Static65.anIntArrayArray18[local158][local161] = local15.anInt1292;
								Static163.anIntArrayArray33[local158][local161] = 1;
							} else if (local15.anInt1292 == Static65.anIntArrayArray18[local158][local161]) {
								local116 = Static163.anIntArrayArray33[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	public static void method1051(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static180.anInt3908;
		@Pc(3) int[] local3 = Static274.anIntArray500;
		@Pc(11) int local11 = Static201.aBoolean259 ? local1 : local1 + Static197.anInt4078;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class30_Sub1_Sub1 local23;
			if (local13 < local1) {
				local23 = Static135.aClass30_Sub1_Sub1_Sub2Array1[local3[local13]];
			} else {
				local23 = ((Class1_Sub27) Static24.aClass38_3.method765((long) Static415.anIntArray701[local13 - local1])).aClass30_Sub1_Sub1_Sub1_2;
			}
			if (local23.aByte102 == arg0) {
				local23.anInt1269 = 0;
				if (local23.anInt1292 < 0) {
					local23.aBoolean79 = false;
				} else {
					@Pc(54) int local54 = local23.method944();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt7490 & 0x7F) != 0 || (local23.anInt7488 & 0x7F) != 0) {
							local23.aBoolean79 = false;
							continue;
						}
					} else if ((local23.anInt7490 & 0x7F) != 64 || (local23.anInt7488 & 0x7F) != 64) {
						local23.aBoolean79 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt7490 >> 7;
						local101 = local23.anInt7488 >> 7;
						if (local23.anInt1292 != Static65.anIntArrayArray18[local96][local101]) {
							local23.aBoolean79 = true;
							continue;
						}
						if (Static163.anIntArrayArray33[local96][local101] > 1) {
							local126 = Static163.anIntArrayArray33[local96][local101]--;
							local23.aBoolean79 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 64 + 60;
						local101 = local23.anInt7490 - local96 >> 7;
						@Pc(155) int local155 = local23.anInt7488 - local96 >> 7;
						@Pc(162) int local162 = local23.anInt7490 + local96 >> 7;
						@Pc(169) int local169 = local23.anInt7488 + local96 >> 7;
						if (!Static442.method6000(local162, local169, local155, local101, local23.anInt1292)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt1292 == Static65.anIntArrayArray18[local180][local183]) {
										local126 = Static163.anIntArrayArray33[local180][local183]--;
									}
								}
							}
							local23.aBoolean79 = true;
							continue;
						}
					}
					if (local23 instanceof Class30_Sub1_Sub1_Sub2 && local23.aClass1_Sub31_3 != null && Static187.anInt3975 >= local23.aClass1_Sub31_3.anInt5420 && Static187.anInt3975 < local23.aClass1_Sub31_3.anInt5423) {
						((Class30_Sub1_Sub1_Sub2) local23).aBoolean84 = false;
					}
					local23.aBoolean79 = false;
					local23.anInt7495 = Static227.method3475(local23.anInt7490, local23.anInt7488, local23.aByte102);
					Static193.method3130(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1053() {
		for (@Pc(1) int local1 = 0; local1 < Static209.anInt4283; local1++) {
			@Pc(6) int[] local6 = Static65.anIntArrayArray18[local1];
			for (@Pc(8) int local8 = 0; local8 < Static211.anInt4295; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1057() {
		Static6.anInt83 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static197.anInt4078; local3++) {
			@Pc(14) Class30_Sub1_Sub1_Sub1 local14 = ((Class1_Sub27) Static24.aClass38_3.method765((long) Static415.anIntArray701[local3])).aClass30_Sub1_Sub1_Sub1_2;
			if (local14.aBoolean79 && local14.method942() != -1) {
				@Pc(32) int local32 = (local14.method944() - 1) * 64 + 60;
				@Pc(39) int local39 = local14.anInt7490 - local32 >> 7;
				@Pc(46) int local46 = local14.anInt7488 - local32 >> 7;
				@Pc(53) Class30_Sub1_Sub1 local53 = Static23.method492(local39, local46, local14.aByte102);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt1299;
					if (local53 instanceof Class30_Sub1_Sub1_Sub1) {
						local58 += 2048;
					}
					if (local53.anInt1269 == 0 && local53.method942() != -1) {
						Static60.anIntArray141[Static6.anInt83] = local58;
						Static77.anIntArray177[Static6.anInt83] = local58;
						Static6.anInt83++;
						local53.anInt1269++;
					}
					Static60.anIntArray141[Static6.anInt83] = local58;
					Static77.anIntArray177[Static6.anInt83] = local14.anInt1299 + 2048;
					Static6.anInt83++;
					local53.anInt1269++;
				}
			}
		}
		Static43.method789(0, Static77.anIntArray177, Static60.anIntArray141, Static6.anInt83 - 1);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ec;)Lclient!nj;")
	public static Class1_Sub29 method1059(@OriginalArg(0) Class68 arg0) {
		@Pc(13) Class1_Sub29 local13 = (Class1_Sub29) Static227.aClass38_19.method765(((long) arg0.anInt2135 << 32) + (long) arg0.anInt2188);
		return local13 == null ? arg0.aClass1_Sub29_1 : local13;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1061() {
		@Pc(1) int local1 = Static180.anInt3908;
		@Pc(3) int[] local3 = Static274.anIntArray500;
		@Pc(20) boolean local20 = Static12.aClass34_Sub1_1.anInt7166 == 1 && local1 > 200 || Static12.aClass34_Sub1_1.anInt7166 == 0 && local1 > 50;
		@Pc(75) int local75;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class30_Sub1_Sub1_Sub2 local29 = Static135.aClass30_Sub1_Sub1_Sub2Array1[local3[local22]];
			if (local29.method961()) {
				local29.method5726();
				if (local29.aShort104 >= 0 && local29.aShort103 >= 0 && local29.aShort105 < Static209.anInt4283 && local29.aShort102 < Static211.anInt4295) {
					local29.aBoolean84 = local29.aBoolean81 ? local20 : false;
					if (local29 == Static429.aClass30_Sub1_Sub1_Sub2_2) {
						local29.anInt1292 = Integer.MAX_VALUE;
					} else {
						local75 = 0;
						if (!local29.aBoolean79) {
							local75++;
						}
						if (local29.anInt1237 > Static187.anInt3975) {
							local75 += 2;
						}
						local75 += 5 - local29.method944() << 2;
						if (local29.aBoolean85) {
							local75 += 512;
						} else {
							if (Static90.anInt2087 == 0) {
								local75 += 32;
							} else {
								local75 += 128;
							}
							local75 += 256;
						}
						local29.anInt1292 = local75 + 1;
					}
				} else {
					local29.anInt1292 = -1;
				}
			} else {
				local29.anInt1292 = -1;
			}
		}
		for (@Pc(116) int local116 = 0; local116 < Static197.anInt4078; local116++) {
			@Pc(127) Class30_Sub1_Sub1_Sub1 local127 = ((Class1_Sub27) Static24.aClass38_3.method765((long) Static415.anIntArray701[local116])).aClass30_Sub1_Sub1_Sub1_2;
			if (local127.method673() && local127.aClass11_1.method135(Static366.aClass190_1)) {
				local127.method5726();
				if (local127.aShort104 >= 0 && local127.aShort103 >= 0 && local127.aShort105 < Static209.anInt4283 && local127.aShort102 < Static211.anInt4295) {
					@Pc(164) int local164 = 0;
					if (!local127.aBoolean79) {
						local164++;
					}
					if (local127.anInt1237 > Static187.anInt3975) {
						local164 += 2;
					}
					local164 += 5 - local127.method944() << 2;
					if (Static90.anInt2087 == 0) {
						if (local127.aClass11_1.aBoolean9) {
							local164 += 64;
						} else {
							local164 += 128;
						}
					} else if (Static90.anInt2087 == 1) {
						if (local127.aClass11_1.aBoolean9) {
							local164 += 32;
						} else {
							local164 += 64;
						}
					}
					if (local127.aClass11_1.aBoolean12) {
						local164 += 1024;
					} else if (!local127.aClass11_1.aBoolean8) {
						local164 += 256;
					}
					local127.anInt1292 = local164 + 1;
				} else {
					local127.anInt1292 = -1;
				}
			} else {
				local127.anInt1292 = -1;
			}
		}
		for (local75 = 0; local75 < Static393.aClass178Array1.length; local75++) {
			@Pc(230) Class178 local230 = Static393.aClass178Array1[local75];
			if (local230 != null) {
				if (local230.anInt5270 == 1) {
					@Pc(244) Class1_Sub27 local244 = (Class1_Sub27) Static24.aClass38_3.method765((long) local230.anInt5275);
					if (local244 != null) {
						@Pc(249) Class30_Sub1_Sub1_Sub1 local249 = local244.aClass30_Sub1_Sub1_Sub1_2;
						if (local249.anInt1292 >= 0) {
							local249.anInt1292 += 2048;
						}
					}
				} else if (local230.anInt5270 == 10) {
					@Pc(268) Class30_Sub1_Sub1_Sub2 local268 = Static135.aClass30_Sub1_Sub1_Sub2Array1[local230.anInt5275];
					if (local268 != null && local268 != Static429.aClass30_Sub1_Sub1_Sub2_2 && local268.anInt1292 >= 0) {
						local268.anInt1292 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	public static void method1062() {
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			Static194.aBooleanArray16[local10] = false;
		}
		Static365.anInt6680 = Static78.anInt1973;
		Static398.anInt7203 = -1;
		Static162.anInt3424 = Static147.anInt3170;
		Static458.anInt7957 = -1;
		Static363.anInt6666 = 0;
		Static454.anInt7931 = Static107.anInt2426;
		Static324.anInt7225 = Static217.anInt4351;
		Static233.anInt4621 = Static187.anInt3975;
		Static21.anInt6762 = 5;
		Static134.anInt2984 = Static378.anInt6885;
		Static64.anInt1733 = 0;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!ec;)Lclient!ec;")
	public static Class68 method1063(@OriginalArg(0) Class68 arg0) {
		@Pc(4) int local4 = method1059(arg0).method4027();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static300.method4351(arg0.anInt2129);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!ec;)Z")
	public static boolean method1064(@OriginalArg(0) Class68 arg0) {
		if (Static226.aBoolean281) {
			if (method1059(arg0).anInt5243 != 0) {
				return false;
			}
			if (arg0.anInt2153 == 0) {
				return false;
			}
		}
		return arg0.aBoolean136;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!ec;IIIIIIIII)V")
	public static void method1066(@OriginalArg(0) Class68[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class68 local6 = arg0[local1];
			if (local6 != null && local6.anInt2129 == arg1) {
				@Pc(17) int local17 = local6.anInt2170 + arg6;
				@Pc(22) int local22 = local6.anInt2175 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt2153 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt2107;
					@Pc(45) int local45 = local22 + local6.anInt2149;
					if (local6.anInt2153 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt2153 == 0 || local6.aBoolean142 || method1059(local6).anInt5243 != 0 || local6 == Static326.aClass68_14 || local6.anInt2169 == Static258.anInt5004) {
					if (!method1064(local6)) {
						if (local6 == Static404.aClass68_11) {
							Static452.aBoolean519 = true;
							Static249.anInt4847 = local17;
							Static361.anInt6653 = local22;
						}
						if (local6.aBoolean139 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean137 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(148) Class1_Sub10 local148 = (Class1_Sub10) Static106.aClass203_11.method4548(); local148 != null; local148 = (Class1_Sub10) Static106.aClass203_11.method4545()) {
									if (local148.aBoolean86) {
										local148.method6178();
										local148.aClass68_3.aBoolean146 = false;
									}
								}
								if (Static275.anInt5313 == 0) {
									Static404.aClass68_11 = null;
									Static326.aClass68_14 = null;
								}
								Static209.anInt4285 = 0;
								Static302.aBoolean364 = false;
								Static170.aBoolean207 = false;
								if (!Static96.aBoolean151) {
									Static83.method1517();
								}
							}
							@Pc(204) boolean local204;
							if (Static336.aClass87_1.method1919() >= local28 && Static336.aClass87_1.method1909() >= local30 && Static336.aClass87_1.method1919() < local32 && Static336.aClass87_1.method1909() < local34) {
								local204 = true;
							} else {
								local204 = false;
							}
							if (!Static293.aBoolean300 && local204) {
								if (local6.anInt2114 >= 0) {
									Static49.anInt1209 = local6.anInt2114;
								} else if (local6.aBoolean137) {
									Static49.anInt1209 = -1;
								}
							}
							if (!Static96.aBoolean151 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static29.method567(local6, arg8 - local17, arg9 - local22);
							}
							@Pc(248) boolean local248 = false;
							if (Static336.aClass87_1.method1916() && local204) {
								local248 = true;
							}
							@Pc(258) boolean local258 = false;
							@Pc(263) Class1_Sub25 local263 = (Class1_Sub25) Static341.aClass203_43.method4548();
							if (local263 != null && local263.method3350() == 0 && local263.method3349() >= local28 && local263.method3347() >= local30 && local263.method3349() < local32 && local263.method3347() < local34) {
								local258 = true;
							}
							@Pc(296) int local296;
							@Pc(430) int local430;
							if (local6.aByteArray24 != null) {
								for (local296 = 0; local296 < local6.aByteArray24.length; local296++) {
									if (Static414.aClass48_1.method1119(local6.aByteArray24[local296])) {
										if (local6.anIntArray227 == null || Static187.anInt3975 >= local6.anIntArray227[local296]) {
											@Pc(328) byte local328 = local6.aByteArray25[local296];
											if (local328 == 0 || ((local328 & 0x8) == 0 || !Static414.aClass48_1.method1119(86) && !Static414.aClass48_1.method1119(82) && !Static414.aClass48_1.method1119(81)) && ((local328 & 0x2) == 0 || Static414.aClass48_1.method1119(86)) && ((local328 & 0x1) == 0 || Static414.aClass48_1.method1119(82)) && ((local328 & 0x4) == 0 || Static414.aClass48_1.method1119(81))) {
												if (local296 < 10) {
													Static358.method5056(-1, "", local6.anInt2135, local296 + 1);
												} else if (local296 == 10) {
													Static192.method3103();
													@Pc(399) Class1_Sub29 local399 = method1059(local6);
													Static61.method1144(local399.method4026(), local399.anInt5254, local6);
													Static1.aString1 = Static153.method3991(local6);
													if (Static1.aString1 == null) {
														Static1.aString1 = "Null";
													}
													Static90.aString17 = local6.aString18 + "<col=ffffff>";
												}
												local430 = local6.anIntArray231[local296];
												if (local6.anIntArray227 == null) {
													local6.anIntArray227 = new int[local6.aByteArray24.length];
												}
												if (local430 == 0) {
													local6.anIntArray227[local296] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray227[local296] = Static187.anInt3975 + local430;
												}
											}
										}
									} else if (local6.anIntArray227 != null) {
										local6.anIntArray227[local296] = 0;
									}
								}
							}
							if (local258) {
								Static199.method3193(local6, local263.method3349() - local17, local263.method3347() - local22);
							}
							if (Static404.aClass68_11 != null && Static404.aClass68_11 != local6 && local204 && method1059(local6).method4033()) {
								Static315.aClass68_12 = local6;
							}
							if (local6 == Static326.aClass68_14) {
								Static57.aBoolean98 = true;
								Static122.anInt2689 = local17;
								Static271.anInt5262 = local22;
							}
							if (local6.aBoolean142 || local6.anInt2169 != 0) {
								@Pc(515) Class1_Sub10 local515;
								if (local204 && Static24.anInt605 != 0 && local6.anObjectArray28 != null) {
									local515 = new Class1_Sub10();
									local515.aBoolean86 = true;
									local515.aClass68_3 = local6;
									local515.anInt1364 = Static24.anInt605;
									local515.anObjectArray2 = local6.anObjectArray28;
									Static106.aClass203_11.method4551(local515);
								}
								if (Static404.aClass68_11 != null || Static96.aBoolean151 || local6.anInt2169 != Static47.anInt7030 && Static209.anInt4285 > 0) {
									local258 = false;
									local248 = false;
									local204 = false;
								}
								@Pc(670) int local670;
								if (local6.anInt2169 != 0) {
									if (local6.anInt2169 == Static227.anInt4498 || local6.anInt2169 == Static210.anInt4289) {
										Static201.aClass68_8 = local6;
										if (Static311.aClass189_1 != null) {
											Static311.aClass189_1.method4277(local6.anInt2149, Static30.aClass106_3);
										}
										if (local6.anInt2169 == Static227.anInt4498) {
											if (!Static96.aBoolean151 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static330.method4663(Static30.aClass106_3, arg8, arg9);
												for (@Pc(598) Class41_Sub2 local598 = (Class41_Sub2) Static251.aClass117_7.method2967(); local598 != null; local598 = (Class41_Sub2) Static251.aClass117_7.method2970()) {
													if (arg8 >= local598.anInt2754 && arg8 < local598.anInt2753 && arg9 >= local598.anInt2750 && arg9 < local598.anInt2752) {
														Static83.method1517();
														Static378.method5237(local598.aClass30_Sub1_Sub1_1);
													}
												}
											}
											Static4.method54(local22, local6, local17);
											continue;
										}
									}
									@Pc(709) int local709;
									if (local6.anInt2169 == Static258.anInt5004) {
										if (local6.method1579(Static30.aClass106_3) == null || Static336.anInt6157 != 0 && Static336.anInt6157 != 3 || Static96.aBoolean151 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local296 = arg8 - local17;
										local670 = arg9 - local22;
										local430 = local6.anIntArray225[local670];
										if (local296 < local430 || local296 > local430 + local6.anIntArray224[local670]) {
											continue;
										}
										local296 -= local6.anInt2107 / 2;
										local670 -= local6.anInt2149 / 2;
										if (Static21.anInt6762 == 4) {
											local709 = (int) Static267.aFloat83 & 0x3FFF;
										} else {
											local709 = (int) Static267.aFloat83 + Static217.anInt4366 & 0x3FFF;
										}
										@Pc(721) int local721 = Class90_Sub1.anIntArray304[local709];
										@Pc(725) int local725 = Class90_Sub1.anIntArray303[local709];
										if (Static21.anInt6762 != 4) {
											local721 = local721 * (Static135.anInt3022 + 256) >> 8;
											local725 = local725 * (Static135.anInt3022 + 256) >> 8;
										}
										@Pc(754) int local754 = local670 * local721 + local296 * local725 >> 15;
										@Pc(764) int local764 = local670 * local725 - local296 * local721 >> 15;
										@Pc(775) int local775;
										@Pc(783) int local783;
										if (Static21.anInt6762 == 4) {
											local775 = (Static224.anInt7016 >> 7) + (local754 >> 2);
											local783 = (Static459.anInt7963 >> 7) - (local764 >> 2);
										} else {
											@Pc(792) int local792 = (Static429.aClass30_Sub1_Sub1_Sub2_2.method944() - 1) * 64;
											local775 = (Static429.aClass30_Sub1_Sub1_Sub2_2.anInt7490 - local792 >> 7) + (local754 >> 2);
											local783 = (Static429.aClass30_Sub1_Sub1_Sub2_2.anInt7488 - local792 >> 7) - (local764 >> 2);
										}
										if (Static293.aBoolean300 && (Static439.anInt7742 & 0x40) != 0) {
											@Pc(825) Class68 local825 = Static115.method1866(Static132.anInt2941, Static118.anInt2743);
											if (local825 == null) {
												Static192.method3103();
											} else {
												Static453.method6150(60, true, false, Static263.anInt5067, local6.anInt2136, local783, 1L, local775, Static1.aString1, " ->");
											}
											continue;
										}
										if (Static268.aClass272_4 == Static266.aClass272_3) {
											Static453.method6150(25, true, false, -1, -1, local783, 1L, local775, Static387.aClass158_187.method3594(Static365.anInt6682), "");
										}
										Static453.method6150(23, true, false, Static198.anInt7952, -1, local783, 1L, local775, Static219.aString36, "");
										continue;
									}
									if (local6.anInt2169 == Static47.anInt7030) {
										Static98.aClass68_5 = local6;
										if (local204) {
											Static302.aBoolean364 = true;
										}
										if (local258) {
											local296 = (int) ((double) (local263.method3349() - local17 - local6.anInt2107 / 2) * 2.0D / (double) Static377.aFloat69);
											local670 = (int) -((double) (local263.method3347() - local22 - local6.anInt2149 / 2) * 2.0D / (double) Static377.aFloat69);
											local430 = Static226.anInt4474 + local296 + Static377.anInt5040;
											local709 = Static125.anInt2774 + local670 + Static377.anInt5030;
											@Pc(939) Class1_Sub1_Sub17 local939 = Static278.method4104();
											if (local939 == null) {
												continue;
											}
											@Pc(944) int[] local944 = new int[3];
											local939.method5647(local709, local430, local944);
											if (local944 != null) {
												if (Static414.aClass48_1.method1119(82) && Static41.anInt1052 > 0) {
													Static147.method2349(local944[2], local944[1], local944[0]);
													continue;
												}
												Static170.aBoolean207 = true;
												Static4.anInt59 = local944[0];
												Static181.anInt3935 = local944[1];
												Static401.anInt7263 = local944[2];
											}
											Static209.anInt4285 = 1;
											Static211.aBoolean267 = false;
											Static238.anInt4690 = Static336.aClass87_1.method1919();
											Static200.anInt4108 = Static336.aClass87_1.method1909();
											continue;
										}
										if (local248 && Static209.anInt4285 > 0) {
											if (Static209.anInt4285 == 1 && (Static238.anInt4690 != Static336.aClass87_1.method1919() || Static200.anInt4108 != Static336.aClass87_1.method1909())) {
												Static323.anInt5978 = Static226.anInt4474;
												Static60.anInt1612 = Static125.anInt2774;
												Static209.anInt4285 = 2;
											}
											if (Static209.anInt4285 == 2) {
												Static211.aBoolean267 = true;
												Static118.method2001(Static323.anInt5978 + (int) ((double) (Static238.anInt4690 - Static336.aClass87_1.method1919()) * 2.0D / (double) Static377.aFloat70));
												Static213.method3072(Static60.anInt1612 - (int) ((double) (Static200.anInt4108 - Static336.aClass87_1.method1909()) * 2.0D / (double) Static377.aFloat70));
											}
											continue;
										}
										if (Static209.anInt4285 > 0 && !Static211.aBoolean267) {
											if ((Static363.anInt6672 == 1 || Static331.method4676()) && Static126.anInt2794 > 2) {
												Static369.method5148(Static238.anInt4690, Static200.anInt4108);
											} else if (Static361.method5081()) {
												Static369.method5148(Static238.anInt4690, Static200.anInt4108);
											}
										}
										Static209.anInt4285 = 0;
										continue;
									}
									if (local6.anInt2169 == Static1.anInt42) {
										if (local248) {
											Static349.method4952(Static336.aClass87_1.method1919() - local17, local6.anInt2107, Static336.aClass87_1.method1909() - local22, local6.anInt2149);
										}
										continue;
									}
									if (local6.anInt2169 == Static45.anInt1142) {
										Static229.method3506(local17, local6, local22);
										continue;
									}
								}
								if (!local6.aBoolean135 && local258) {
									local6.aBoolean135 = true;
									if (local6.anObjectArray31 != null) {
										local515 = new Class1_Sub10();
										local515.aBoolean86 = true;
										local515.aClass68_3 = local6;
										local515.anInt1366 = local263.method3349() - local17;
										local515.anInt1364 = local263.method3347() - local22;
										local515.anObjectArray2 = local6.anObjectArray31;
										Static106.aClass203_11.method4551(local515);
									}
								}
								if (local6.aBoolean135 && local248 && local6.anObjectArray3 != null) {
									local515 = new Class1_Sub10();
									local515.aBoolean86 = true;
									local515.aClass68_3 = local6;
									local515.anInt1366 = Static336.aClass87_1.method1919() - local17;
									local515.anInt1364 = Static336.aClass87_1.method1909() - local22;
									local515.anObjectArray2 = local6.anObjectArray3;
									Static106.aClass203_11.method4551(local515);
								}
								if (local6.aBoolean135 && !local248) {
									local6.aBoolean135 = false;
									if (local6.anObjectArray13 != null) {
										local515 = new Class1_Sub10();
										local515.aBoolean86 = true;
										local515.aClass68_3 = local6;
										local515.anInt1366 = Static336.aClass87_1.method1919() - local17;
										local515.anInt1364 = Static336.aClass87_1.method1909() - local22;
										local515.anObjectArray2 = local6.anObjectArray13;
										Static4.aClass203_1.method4551(local515);
									}
								}
								if (local248 && local6.anObjectArray17 != null) {
									local515 = new Class1_Sub10();
									local515.aBoolean86 = true;
									local515.aClass68_3 = local6;
									local515.anInt1366 = Static336.aClass87_1.method1919() - local17;
									local515.anInt1364 = Static336.aClass87_1.method1909() - local22;
									local515.anObjectArray2 = local6.anObjectArray17;
									Static106.aClass203_11.method4551(local515);
								}
								if (!local6.aBoolean146 && local204) {
									local6.aBoolean146 = true;
									if (local6.anObjectArray26 != null) {
										local515 = new Class1_Sub10();
										local515.aBoolean86 = true;
										local515.aClass68_3 = local6;
										local515.anInt1366 = Static336.aClass87_1.method1919() - local17;
										local515.anInt1364 = Static336.aClass87_1.method1909() - local22;
										local515.anObjectArray2 = local6.anObjectArray26;
										Static106.aClass203_11.method4551(local515);
									}
								}
								if (local6.aBoolean146 && local204 && local6.anObjectArray4 != null) {
									local515 = new Class1_Sub10();
									local515.aBoolean86 = true;
									local515.aClass68_3 = local6;
									local515.anInt1366 = Static336.aClass87_1.method1919() - local17;
									local515.anInt1364 = Static336.aClass87_1.method1909() - local22;
									local515.anObjectArray2 = local6.anObjectArray4;
									Static106.aClass203_11.method4551(local515);
								}
								if (local6.aBoolean146 && !local204) {
									local6.aBoolean146 = false;
									if (local6.anObjectArray29 != null) {
										local515 = new Class1_Sub10();
										local515.aBoolean86 = true;
										local515.aClass68_3 = local6;
										local515.anInt1366 = Static336.aClass87_1.method1919() - local17;
										local515.anInt1364 = Static336.aClass87_1.method1909() - local22;
										local515.anObjectArray2 = local6.anObjectArray29;
										Static4.aClass203_1.method4551(local515);
									}
								}
								if (local6.anObjectArray15 != null) {
									local515 = new Class1_Sub10();
									local515.aClass68_3 = local6;
									local515.anObjectArray2 = local6.anObjectArray15;
									Static90.aClass203_8.method4551(local515);
								}
								@Pc(1483) Class1_Sub10 local1483;
								if (local6.anObjectArray11 != null && Static181.anInt3933 > local6.anInt2184) {
									if (local6.anIntArray230 == null || Static181.anInt3933 - local6.anInt2184 > 32) {
										local515 = new Class1_Sub10();
										local515.aClass68_3 = local6;
										local515.anObjectArray2 = local6.anObjectArray11;
										Static106.aClass203_11.method4551(local515);
									} else {
										label678: for (local296 = local6.anInt2184; local296 < Static181.anInt3933; local296++) {
											local670 = Static200.anIntArray392[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray230.length; local430++) {
												if (local6.anIntArray230[local430] == local670) {
													local1483 = new Class1_Sub10();
													local1483.aClass68_3 = local6;
													local1483.anObjectArray2 = local6.anObjectArray11;
													Static106.aClass203_11.method4551(local1483);
													break label678;
												}
											}
										}
									}
									local6.anInt2184 = Static181.anInt3933;
								}
								if (local6.anObjectArray20 != null && Static57.anInt1523 > local6.anInt2150) {
									if (local6.anIntArray226 == null || Static57.anInt1523 - local6.anInt2150 > 32) {
										local515 = new Class1_Sub10();
										local515.aClass68_3 = local6;
										local515.anObjectArray2 = local6.anObjectArray20;
										Static106.aClass203_11.method4551(local515);
									} else {
										label654: for (local296 = local6.anInt2150; local296 < Static57.anInt1523; local296++) {
											local670 = Static374.anIntArray528[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray226.length; local430++) {
												if (local6.anIntArray226[local430] == local670) {
													local1483 = new Class1_Sub10();
													local1483.aClass68_3 = local6;
													local1483.anObjectArray2 = local6.anObjectArray20;
													Static106.aClass203_11.method4551(local1483);
													break label654;
												}
											}
										}
									}
									local6.anInt2150 = Static57.anInt1523;
								}
								if (local6.anObjectArray24 != null && Static342.anInt6266 > local6.anInt2119) {
									if (local6.anIntArray232 == null || Static342.anInt6266 - local6.anInt2119 > 32) {
										local515 = new Class1_Sub10();
										local515.aClass68_3 = local6;
										local515.anObjectArray2 = local6.anObjectArray24;
										Static106.aClass203_11.method4551(local515);
									} else {
										label630: for (local296 = local6.anInt2119; local296 < Static342.anInt6266; local296++) {
											local670 = Static128.anIntArray298[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray232.length; local430++) {
												if (local6.anIntArray232[local430] == local670) {
													local1483 = new Class1_Sub10();
													local1483.aClass68_3 = local6;
													local1483.anObjectArray2 = local6.anObjectArray24;
													Static106.aClass203_11.method4551(local1483);
													break label630;
												}
											}
										}
									}
									local6.anInt2119 = Static342.anInt6266;
								}
								if (local6.anObjectArray30 != null && Static271.anInt5263 > local6.anInt2101) {
									if (local6.anIntArray228 == null || Static271.anInt5263 - local6.anInt2101 > 32) {
										local515 = new Class1_Sub10();
										local515.aClass68_3 = local6;
										local515.anObjectArray2 = local6.anObjectArray30;
										Static106.aClass203_11.method4551(local515);
									} else {
										label606: for (local296 = local6.anInt2101; local296 < Static271.anInt5263; local296++) {
											local670 = Static383.anIntArray660[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray228.length; local430++) {
												if (local6.anIntArray228[local430] == local670) {
													local1483 = new Class1_Sub10();
													local1483.aClass68_3 = local6;
													local1483.anObjectArray2 = local6.anObjectArray30;
													Static106.aClass203_11.method4551(local1483);
													break label606;
												}
											}
										}
									}
									local6.anInt2101 = Static271.anInt5263;
								}
								if (local6.anObjectArray10 != null && Static217.anInt4357 > local6.anInt2171) {
									if (local6.anIntArray229 == null || Static217.anInt4357 - local6.anInt2171 > 32) {
										local515 = new Class1_Sub10();
										local515.aClass68_3 = local6;
										local515.anObjectArray2 = local6.anObjectArray10;
										Static106.aClass203_11.method4551(local515);
									} else {
										label582: for (local296 = local6.anInt2171; local296 < Static217.anInt4357; local296++) {
											local670 = Static333.anIntArray575[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray229.length; local430++) {
												if (local6.anIntArray229[local430] == local670) {
													local1483 = new Class1_Sub10();
													local1483.aClass68_3 = local6;
													local1483.anObjectArray2 = local6.anObjectArray10;
													Static106.aClass203_11.method4551(local1483);
													break label582;
												}
											}
										}
									}
									local6.anInt2171 = Static217.anInt4357;
								}
								if (Static225.anInt4469 > local6.anInt2144 && local6.anObjectArray12 != null) {
									local515 = new Class1_Sub10();
									local515.aClass68_3 = local6;
									local515.anObjectArray2 = local6.anObjectArray12;
									Static106.aClass203_11.method4551(local515);
								}
								if (Static290.anInt5510 > local6.anInt2144 && local6.anObjectArray21 != null) {
									local515 = new Class1_Sub10();
									local515.aClass68_3 = local6;
									local515.anObjectArray2 = local6.anObjectArray21;
									Static106.aClass203_11.method4551(local515);
								}
								if (Static126.anInt2792 > local6.anInt2144 && local6.anObjectArray27 != null) {
									local515 = new Class1_Sub10();
									local515.aClass68_3 = local6;
									local515.anObjectArray2 = local6.anObjectArray27;
									Static106.aClass203_11.method4551(local515);
								}
								if (Static342.anInt6271 > local6.anInt2144 && local6.anObjectArray32 != null) {
									local515 = new Class1_Sub10();
									local515.aClass68_3 = local6;
									local515.anObjectArray2 = local6.anObjectArray32;
									Static106.aClass203_11.method4551(local515);
								}
								if (Static111.anInt4635 > local6.anInt2144 && local6.anObjectArray16 != null) {
									local515 = new Class1_Sub10();
									local515.aClass68_3 = local6;
									local515.anObjectArray2 = local6.anObjectArray16;
									Static106.aClass203_11.method4551(local515);
								}
								local6.anInt2144 = Static175.anInt3842;
								if (local6.anObjectArray22 != null) {
									for (local296 = 0; local296 < Static119.anInt2647; local296++) {
										@Pc(1951) Class1_Sub10 local1951 = new Class1_Sub10();
										local1951.aClass68_3 = local6;
										local1951.anInt1367 = Static400.aClass113Array1[local296].method5051();
										local1951.anInt1368 = Static400.aClass113Array1[local296].method5049();
										local1951.anObjectArray2 = local6.anObjectArray22;
										Static106.aClass203_11.method4551(local1951);
									}
								}
								if (Static343.aBoolean401 && local6.anObjectArray23 != null) {
									local515 = new Class1_Sub10();
									local515.aClass68_3 = local6;
									local515.anObjectArray2 = local6.anObjectArray23;
									Static106.aClass203_11.method4551(local515);
								}
							}
							if (local6.anInt2153 == 5 && local6.anInt2185 != -1) {
								local6.method1580(Static106.aClass53_1, Static100.aClass42_1).method4277(local6.anInt2149, Static30.aClass106_3);
							}
							Static352.method5017(local6);
							if (local6.anInt2153 == 0) {
								method1066(arg0, local6.anInt2135, local28, local30, local32, local34, local17 - local6.anInt2124, local22 - local6.anInt2125, arg8, arg9);
								if (local6.aClass68Array2 != null) {
									method1066(local6.aClass68Array2, local6.anInt2135, local28, local30, local32, local34, local17 - local6.anInt2124, local22 - local6.anInt2125, arg8, arg9);
								}
								@Pc(2073) Class1_Sub39 local2073 = (Class1_Sub39) Static177.aClass38_18.method765((long) local6.anInt2135);
								if (local2073 != null) {
									if (Static268.aClass272_4 == Static181.aClass272_2 && local2073.anInt6174 == 0 && !Static96.aBoolean151 && local204 && !Static226.aBoolean281) {
										Static83.method1517();
									}
									Static211.method3325(local17, arg9, local34, local32, local28, local22, local30, arg8, local2073.anInt6172);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static352.method5017(local6);
				}
			}
		}
	}
}
