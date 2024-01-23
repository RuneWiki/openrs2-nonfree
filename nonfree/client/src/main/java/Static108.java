import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!ho", name = "q", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!ho", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString80 = "purple:";

	@OriginalMember(owner = "client!ho", name = "h", descriptor = "I")
	public static int anInt2152 = 0;

	@OriginalMember(owner = "client!ho", name = "i", descriptor = "I")
	public static int anInt2153 = -1;

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(BZIILclient!ao;ZIIIII)V")
	public static void method1834(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class12 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg0 && !Static162.method2605() && (Static27.aByteArrayArrayArray2[0][arg9][arg8] & 0x2) == 0) {
			if ((Static27.aByteArrayArrayArray2[arg1][arg9][arg8] & 0x10) != 0) {
				return;
			}
			if (Static253.method3902(arg8, arg1, arg9) != Static60.anInt1347) {
				return;
			}
		}
		if (arg1 < Static55.anInt1243) {
			Static55.anInt1243 = arg1;
		}
		@Pc(59) Class73 local59 = Static296.method4591(arg5);
		if (Static251.aBoolean330 && local59.aBoolean139) {
			return;
		}
		@Pc(80) int local80;
		@Pc(77) int local77;
		if (arg2 == 1 || arg2 == 3) {
			local80 = local59.anInt2253;
			local77 = local59.anInt2259;
		} else {
			local77 = local59.anInt2253;
			local80 = local59.anInt2259;
		}
		@Pc(101) int local101;
		@Pc(109) int local109;
		if (arg9 + local80 <= 104) {
			local101 = arg9 + (local80 >> 1);
			local109 = (local80 + 1 >> 1) + arg9;
		} else {
			local101 = arg9;
			local109 = arg9 + 1;
		}
		@Pc(138) int local138;
		@Pc(132) int local132;
		if (arg8 + local77 <= 104) {
			local132 = (local77 + 1 >> 1) + arg8;
			local138 = (local77 >> 1) + arg8;
		} else {
			local132 = arg8 + 1;
			local138 = arg8;
		}
		@Pc(150) int[][] local150 = Static154.anIntArrayArrayArray5[arg6];
		@Pc(176) int local176 = local150[local109][local132] + local150[local101][local138] + local150[local109][local138] + local150[local101][local132] >> 2;
		@Pc(184) int local184 = (local80 << 6) + (arg9 << 7);
		@Pc(192) int local192 = (arg8 << 7) + (local77 << 6);
		@Pc(194) int local194 = 0;
		@Pc(205) int[][] local205;
		if (Static251.aBoolean330 && arg6 != 0) {
			local205 = Static154.anIntArrayArrayArray5[0];
			local194 = local176 - (local205[local109][local132] + local205[local109][local138] + local205[local101][local138] + local205[local101][local132] >> 2);
		}
		@Pc(252) long local252 = (long) (arg2 << 20 | arg9 | arg8 << 7 | arg7 << 14 | 0x40000000);
		local205 = null;
		if (local59.anInt2267 == 0 || arg4) {
			local252 |= Long.MIN_VALUE;
		}
		if (arg4) {
			local205 = Static230.anIntArrayArrayArray12[0];
		} else if (arg6 < 3) {
			local205 = Static154.anIntArrayArrayArray5[arg6 + 1];
		}
		if (local59.anInt2248 == 1) {
			local252 |= 0x400000L;
		}
		if (local59.aBoolean130) {
			local252 |= 0x80000000L;
		}
		if (local59.method1909()) {
			Static276.method4340(arg9, arg8, arg2, null, arg1, null, local59);
		}
		local252 |= (long) arg5 << 32;
		@Pc(332) boolean local332 = local59.aBoolean140 & !arg4;
		@Pc(380) Class13 local380;
		@Pc(396) Class129 local396;
		if (arg7 == 22) {
			if (Static70.aBoolean83 || local59.anInt2267 != 0 || local59.anInt2270 == 1 || local59.aBoolean127) {
				if (local59.anInt2229 == -1 && local59.anIntArray197 == null && local59.anIntArray196 == null && !local59.aBoolean137) {
					local396 = local59.method1889(22, null, local332, local205, local150, arg2, local192, arg0, local176, local184);
					if (Static251.aBoolean330 && local332) {
						Static249.method3807(local396.aClass58_Sub2_3, local184, local194, local192);
					}
					local380 = local396.aClass13_8;
				} else {
					local380 = new Class13_Sub2(arg5, 22, arg2, arg6, arg9, arg8, -1, local59.aBoolean131, null);
				}
				Static194.method3181(arg1, arg9, arg8, local176, local380, local252, local59.aBoolean138);
				if (local59.anInt2270 == 1 && arg3 != null) {
					arg3.method267(arg8, arg9);
				}
			}
		} else if (arg7 == 10 || arg7 == 11) {
			if (local59.anInt2229 == -1 && local59.anIntArray197 == null && local59.anIntArray196 == null && !local59.aBoolean137) {
				local396 = local59.method1889(10, null, local332, local205, local150, arg7 == 11 ? arg2 + 4 : arg2, local192, arg0, local176, local184);
				if (Static251.aBoolean330 && local332) {
					Static249.method3807(local396.aClass58_Sub2_3, local184, local194, local192);
				}
				local380 = local396.aClass13_8;
			} else {
				local380 = new Class13_Sub2(arg5, 10, arg7 == 11 ? arg2 + 4 : arg2, arg6, arg9, arg8, -1, local59.aBoolean131, null);
			}
			if (local380 != null) {
				@Pc(532) boolean local532 = Static75.method1264(arg1, arg9, arg8, local176, local80, local77, local380, local252);
				if (local59.aBoolean133 && local532 && arg0) {
					@Pc(542) int local542 = 15;
					if (local380 instanceof Class13_Sub1) {
						local542 = ((Class13_Sub1) local380).method2732() / 4;
						if (local542 > 30) {
							local542 = 30;
						}
					}
					for (@Pc(560) int local560 = 0; local560 <= local80; local560++) {
						for (@Pc(569) int local569 = 0; local569 <= local77; local569++) {
							if (Static22.aByteArrayArrayArray1[arg1][local560 + arg9][arg8 + local569] < local542) {
								Static22.aByteArrayArrayArray1[arg1][arg9 + local560][arg8 + local569] = (byte) local542;
							}
						}
					}
				}
			}
			if (local59.anInt2270 != 0 && arg3 != null) {
				arg3.method274(local77, local80, arg8, arg9, !local59.aBoolean132, local59.aBoolean128);
			}
		} else if (arg7 >= 12) {
			if (local59.anInt2229 == -1 && local59.anIntArray197 == null && local59.anIntArray196 == null && !local59.aBoolean137) {
				local396 = local59.method1889(arg7, null, local332, local205, local150, arg2, local192, arg0, local176, local184);
				if (Static251.aBoolean330 && local332) {
					Static249.method3807(local396.aClass58_Sub2_3, local184, local194, local192);
				}
				local380 = local396.aClass13_8;
			} else {
				local380 = new Class13_Sub2(arg5, arg7, arg2, arg6, arg9, arg8, -1, local59.aBoolean131, null);
			}
			Static75.method1264(arg1, arg9, arg8, local176, 1, 1, local380, local252);
			if (arg0 && arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg1 > 0 && local59.anInt2232 != 0) {
				Static8.anIntArrayArrayArray1[arg1][arg9][arg8] |= 0x4;
			}
			if (local59.anInt2270 != 0 && arg3 != null) {
				arg3.method274(local77, local80, arg8, arg9, !local59.aBoolean132, local59.aBoolean128);
			}
		} else if (arg7 == 0) {
			if (local59.anInt2229 == -1 && local59.anIntArray197 == null && local59.anIntArray196 == null && !local59.aBoolean137) {
				local396 = local59.method1889(0, null, local332, local205, local150, arg2, local192, arg0, local176, local184);
				if (Static251.aBoolean330 && local332) {
					Static249.method3807(local396.aClass58_Sub2_3, local184, local194, local192);
				}
				local380 = local396.aClass13_8;
			} else {
				local380 = new Class13_Sub2(arg5, 0, arg2, arg6, arg9, arg8, -1, local59.aBoolean131, null);
			}
			Static288.method4504(arg1, arg9, arg8, local176, local380, null, Static153.anIntArray246[arg2], 0, local252);
			if (arg0) {
				if (arg2 == 0) {
					if (local59.aBoolean133) {
						Static22.aByteArrayArrayArray1[arg1][arg9][arg8] = 50;
						Static22.aByteArrayArrayArray1[arg1][arg9][arg8 + 1] = 50;
					}
					if (local59.anInt2232 == 1) {
						Static8.anIntArrayArrayArray1[arg1][arg9][arg8] |= 0x1;
					}
				} else if (arg2 == 1) {
					if (local59.aBoolean133) {
						Static22.aByteArrayArrayArray1[arg1][arg9][arg8 + 1] = 50;
						Static22.aByteArrayArrayArray1[arg1][arg9 + 1][arg8 + 1] = 50;
					}
					if (local59.anInt2232 == 1) {
						Static8.anIntArrayArrayArray1[arg1][arg9][arg8 + 1] |= 0x2;
					}
				} else if (arg2 == 2) {
					if (local59.aBoolean133) {
						Static22.aByteArrayArrayArray1[arg1][arg9 + 1][arg8] = 50;
						Static22.aByteArrayArrayArray1[arg1][arg9 + 1][arg8 + 1] = 50;
					}
					if (local59.anInt2232 == 1) {
						Static8.anIntArrayArrayArray1[arg1][arg9 + 1][arg8] |= 0x1;
					}
				} else if (arg2 == 3) {
					if (local59.aBoolean133) {
						Static22.aByteArrayArrayArray1[arg1][arg9][arg8] = 50;
						Static22.aByteArrayArrayArray1[arg1][arg9 + 1][arg8] = 50;
					}
					if (local59.anInt2232 == 1) {
						Static8.anIntArrayArrayArray1[arg1][arg9][arg8] |= 0x2;
					}
				}
			}
			if (local59.anInt2270 != 0 && arg3 != null) {
				arg3.method279(arg9, arg7, local59.aBoolean128, arg8, !local59.aBoolean132, arg2);
			}
			if (local59.anInt2262 != 16) {
				Static109.method1853(arg1, arg9, arg8, local59.anInt2262);
			}
		} else if (arg7 == 1) {
			if (local59.anInt2229 == -1 && local59.anIntArray197 == null && local59.anIntArray196 == null && !local59.aBoolean137) {
				local396 = local59.method1889(1, null, local332, local205, local150, arg2, local192, arg0, local176, local184);
				if (Static251.aBoolean330 && local332) {
					Static249.method3807(local396.aClass58_Sub2_3, local184, local194, local192);
				}
				local380 = local396.aClass13_8;
			} else {
				local380 = new Class13_Sub2(arg5, 1, arg2, arg6, arg9, arg8, -1, local59.aBoolean131, null);
			}
			Static288.method4504(arg1, arg9, arg8, local176, local380, null, Static132.anIntArray224[arg2], 0, local252);
			if (local59.aBoolean133 && arg0) {
				if (arg2 == 0) {
					Static22.aByteArrayArrayArray1[arg1][arg9][arg8 + 1] = 50;
				} else if (arg2 == 1) {
					Static22.aByteArrayArrayArray1[arg1][arg9 + 1][arg8 + 1] = 50;
				} else if (arg2 == 2) {
					Static22.aByteArrayArrayArray1[arg1][arg9 + 1][arg8] = 50;
				} else if (arg2 == 3) {
					Static22.aByteArrayArrayArray1[arg1][arg9][arg8] = 50;
				}
			}
			if (local59.anInt2270 != 0 && arg3 != null) {
				arg3.method279(arg9, arg7, local59.aBoolean128, arg8, !local59.aBoolean132, arg2);
			}
		} else {
			@Pc(1278) int local1278;
			if (arg7 == 2) {
				local1278 = arg2 + 1 & 0x3;
				@Pc(1311) Class13 local1311;
				@Pc(1325) Class13 local1325;
				if (local59.anInt2229 == -1 && local59.anIntArray197 == null && local59.anIntArray196 == null && !local59.aBoolean137) {
					@Pc(1343) Class129 local1343 = local59.method1889(2, null, local332, local205, local150, arg2 + 4, local192, arg0, local176, local184);
					if (Static251.aBoolean330 && local332) {
						Static249.method3807(local1343.aClass58_Sub2_3, local184, local194, local192);
					}
					local1311 = local1343.aClass13_8;
					local1343 = local59.method1889(2, null, local332, local205, local150, local1278, local192, arg0, local176, local184);
					if (Static251.aBoolean330 && local332) {
						Static249.method3807(local1343.aClass58_Sub2_3, local184, local194, local192);
					}
					local1325 = local1343.aClass13_8;
				} else {
					local1311 = new Class13_Sub2(arg5, 2, arg2 + 4, arg6, arg9, arg8, -1, local59.aBoolean131, null);
					local1325 = new Class13_Sub2(arg5, 2, local1278, arg6, arg9, arg8, -1, local59.aBoolean131, null);
				}
				Static288.method4504(arg1, arg9, arg8, local176, local1311, local1325, Static153.anIntArray246[arg2], Static153.anIntArray246[local1278], local252);
				if (local59.anInt2232 == 1 && arg0) {
					if (arg2 == 0) {
						Static8.anIntArrayArrayArray1[arg1][arg9][arg8] |= 0x1;
						Static8.anIntArrayArrayArray1[arg1][arg9][arg8 + 1] |= 0x2;
					} else if (arg2 == 1) {
						Static8.anIntArrayArrayArray1[arg1][arg9][arg8 + 1] |= 0x2;
						Static8.anIntArrayArrayArray1[arg1][arg9 + 1][arg8] |= 0x1;
					} else if (arg2 == 2) {
						Static8.anIntArrayArrayArray1[arg1][arg9 + 1][arg8] |= 0x1;
						Static8.anIntArrayArrayArray1[arg1][arg9][arg8] |= 0x2;
					} else if (arg2 == 3) {
						Static8.anIntArrayArrayArray1[arg1][arg9][arg8] |= 0x2;
						Static8.anIntArrayArrayArray1[arg1][arg9][arg8] |= 0x1;
					}
				}
				if (local59.anInt2270 != 0 && arg3 != null) {
					arg3.method279(arg9, arg7, local59.aBoolean128, arg8, !local59.aBoolean132, arg2);
				}
				if (local59.anInt2262 != 16) {
					Static109.method1853(arg1, arg9, arg8, local59.anInt2262);
				}
			} else if (arg7 == 3) {
				if (local59.anInt2229 == -1 && local59.anIntArray197 == null && local59.anIntArray196 == null && !local59.aBoolean137) {
					local396 = local59.method1889(3, null, local332, local205, local150, arg2, local192, arg0, local176, local184);
					if (Static251.aBoolean330 && local332) {
						Static249.method3807(local396.aClass58_Sub2_3, local184, local194, local192);
					}
					local380 = local396.aClass13_8;
				} else {
					local380 = new Class13_Sub2(arg5, 3, arg2, arg6, arg9, arg8, -1, local59.aBoolean131, null);
				}
				Static288.method4504(arg1, arg9, arg8, local176, local380, null, Static132.anIntArray224[arg2], 0, local252);
				if (local59.aBoolean133 && arg0) {
					if (arg2 == 0) {
						Static22.aByteArrayArrayArray1[arg1][arg9][arg8 + 1] = 50;
					} else if (arg2 == 1) {
						Static22.aByteArrayArrayArray1[arg1][arg9 + 1][arg8 + 1] = 50;
					} else if (arg2 == 2) {
						Static22.aByteArrayArrayArray1[arg1][arg9 + 1][arg8] = 50;
					} else if (arg2 == 3) {
						Static22.aByteArrayArrayArray1[arg1][arg9][arg8] = 50;
					}
				}
				if (local59.anInt2270 != 0 && arg3 != null) {
					arg3.method279(arg9, arg7, local59.aBoolean128, arg8, !local59.aBoolean132, arg2);
				}
			} else if (arg7 == 9) {
				if (local59.anInt2229 == -1 && local59.anIntArray197 == null && local59.anIntArray196 == null && !local59.aBoolean137) {
					local396 = local59.method1889(arg7, null, local332, local205, local150, arg2, local192, arg0, local176, local184);
					if (Static251.aBoolean330 && local332) {
						Static249.method3807(local396.aClass58_Sub2_3, local184, local194, local192);
					}
					local380 = local396.aClass13_8;
				} else {
					local380 = new Class13_Sub2(arg5, arg7, arg2, arg6, arg9, arg8, -1, local59.aBoolean131, null);
				}
				Static75.method1264(arg1, arg9, arg8, local176, 1, 1, local380, local252);
				if (local59.anInt2270 != 0 && arg3 != null) {
					arg3.method274(local77, local80, arg8, arg9, !local59.aBoolean132, local59.aBoolean128);
				}
				if (local59.anInt2262 != 16) {
					Static109.method1853(arg1, arg9, arg8, local59.anInt2262);
				}
			} else if (arg7 == 4) {
				if (local59.anInt2229 == -1 && local59.anIntArray197 == null && local59.anIntArray196 == null && !local59.aBoolean137) {
					local396 = local59.method1889(4, null, local332, local205, local150, arg2, local192, arg0, local176, local184);
					if (Static251.aBoolean330 && local332) {
						Static249.method3807(local396.aClass58_Sub2_3, local184, local194, local192);
					}
					local380 = local396.aClass13_8;
				} else {
					local380 = new Class13_Sub2(arg5, 4, arg2, arg6, arg9, arg8, -1, local59.aBoolean131, null);
				}
				Static126.method2047(arg1, arg9, arg8, local176, local380, null, Static153.anIntArray246[arg2], 0, 0, 0, local252);
			} else {
				@Pc(1970) long local1970;
				@Pc(2042) Class13 local2042;
				@Pc(2014) Class129 local2014;
				if (arg7 == 5) {
					local1278 = 16;
					local1970 = method1836(arg1, arg9, arg8);
					if (local1970 != 0L) {
						local1278 = Static296.method4591((int) (local1970 >>> 32) & Integer.MAX_VALUE).anInt2262;
					}
					if (local59.anInt2229 == -1 && local59.anIntArray197 == null && local59.anIntArray196 == null && !local59.aBoolean137) {
						local2014 = local59.method1889(4, null, local332, local205, local150, arg2, local192, arg0, local176, local184);
						if (Static251.aBoolean330 && local332) {
							Static249.method3807(local2014.aClass58_Sub2_3, local184 - Static193.anIntArray308[arg2] * 8, local194, local192 - Static99.anIntArray166[arg2] * 8);
						}
						local2042 = local2014.aClass13_8;
					} else {
						local2042 = new Class13_Sub2(arg5, 4, arg2, arg6, arg9, arg8, -1, local59.aBoolean131, null);
					}
					Static126.method2047(arg1, arg9, arg8, local176, local2042, null, Static153.anIntArray246[arg2], 0, local1278 * Static193.anIntArray308[arg2], Static99.anIntArray166[arg2] * local1278, local252);
				} else if (arg7 == 6) {
					local1278 = 8;
					local1970 = method1836(arg1, arg9, arg8);
					if (local1970 != 0L) {
						local1278 = Static296.method4591(Integer.MAX_VALUE & (int) (local1970 >>> 32)).anInt2262 / 2;
					}
					if (local59.anInt2229 == -1 && local59.anIntArray197 == null && local59.anIntArray196 == null && !local59.aBoolean137) {
						local2014 = local59.method1889(4, null, local332, local205, local150, arg2 + 4, local192, arg0, local176, local184);
						if (Static251.aBoolean330 && local332) {
							Static249.method3807(local2014.aClass58_Sub2_3, local184 - Static286.anIntArray453[arg2] * 8, local194, local192 - Static60.anIntArray130[arg2] * 8);
						}
						local2042 = local2014.aClass13_8;
					} else {
						local2042 = new Class13_Sub2(arg5, 4, arg2 + 4, arg6, arg9, arg8, -1, local59.aBoolean131, null);
					}
					Static126.method2047(arg1, arg9, arg8, local176, local2042, null, 256, arg2, Static286.anIntArray453[arg2] * local1278, local1278 * Static60.anIntArray130[arg2], local252);
				} else if (arg7 == 7) {
					@Pc(2218) int local2218 = arg2 + 2 & 0x3;
					if (local59.anInt2229 == -1 && local59.anIntArray197 == null && local59.anIntArray196 == null && !local59.aBoolean137) {
						@Pc(2267) Class129 local2267 = local59.method1889(4, null, local332, local205, local150, local2218 + 4, local192, arg0, local176, local184);
						if (Static251.aBoolean330 && local332) {
							Static249.method3807(local2267.aClass58_Sub2_3, local184, local194, local192);
						}
						local380 = local2267.aClass13_8;
					} else {
						local380 = new Class13_Sub2(arg5, 4, local2218 + 4, arg6, arg9, arg8, -1, local59.aBoolean131, null);
					}
					Static126.method2047(arg1, arg9, arg8, local176, local380, null, 256, local2218, 0, 0, local252);
				} else if (arg7 == 8) {
					local1278 = 8;
					local1970 = method1836(arg1, arg9, arg8);
					if (local1970 != 0L) {
						local1278 = Static296.method4591((int) (local1970 >>> 32) & Integer.MAX_VALUE).anInt2262 / 2;
					}
					@Pc(2327) int local2327 = arg2 + 2 & 0x3;
					@Pc(2372) Class13 local2372;
					if (local59.anInt2229 == -1 && local59.anIntArray197 == null && local59.anIntArray196 == null && !local59.aBoolean137) {
						@Pc(2380) int local2380 = Static286.anIntArray453[arg2] * 8;
						@Pc(2386) int local2386 = Static60.anIntArray130[arg2] * 8;
						@Pc(2402) Class129 local2402 = local59.method1889(4, null, local332, local205, local150, arg2 + 4, local192, arg0, local176, local184);
						if (Static251.aBoolean330 && local332) {
							Static249.method3807(local2402.aClass58_Sub2_3, local184 - local2380, local194, local192 - local2386);
						}
						local2042 = local2402.aClass13_8;
						local2402 = local59.method1889(4, null, local332, local205, local150, local2327 + 4, local192, arg0, local176, local184);
						if (Static251.aBoolean330 && local332) {
							Static249.method3807(local2402.aClass58_Sub2_3, local184 - local2380, local194, local192 - local2386);
						}
						local2372 = local2402.aClass13_8;
					} else {
						local2042 = new Class13_Sub2(arg5, 4, arg2 + 4, arg6, arg9, arg8, -1, local59.aBoolean131, null);
						local2372 = new Class13_Sub2(arg5, 4, local2327 + 4, arg6, arg9, arg8, -1, local59.aBoolean131, null);
					}
					Static126.method2047(arg1, arg9, arg8, local176, local2042, local2372, 256, arg2, Static286.anIntArray453[arg2] * local1278, local1278 * Static60.anIntArray130[arg2], local252);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(III)J")
	public static long method1836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub21 local7 = Static261.aClass4_Sub21ArrayArrayArray4[arg0][arg1][arg2];
		return local7 == null || local7.aClass181_1 == null ? 0L : local7.aClass181_1.aLong206;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lclient!pi;I)V")
	public static void method1841(@OriginalArg(0) Class4_Sub24 arg0) {
		@Pc(9) int local9 = arg0.method3060();
		Static19.aClass150Array1 = new Class150[local9];
		@Pc(14) int local14;
		for (local14 = 0; local14 < local9; local14++) {
			Static19.aClass150Array1[local14] = new Class150();
			Static19.aClass150Array1[local14].anInt4785 = arg0.method3060();
			Static19.aClass150Array1[local14].aString159 = arg0.method3059();
		}
		Static179.anInt3614 = arg0.method3060();
		Static168.anInt3365 = arg0.method3060();
		Static169.anInt3386 = arg0.method3060();
		Static69.aClass64_Sub1Array1 = new Class64_Sub1[Static168.anInt3365 + 1 - Static179.anInt3614];
		for (local14 = 0; local14 < Static169.anInt3386; local14++) {
			@Pc(79) int local79 = arg0.method3060();
			@Pc(87) Class64_Sub1 local87 = Static69.aClass64_Sub1Array1[local79] = new Class64_Sub1();
			local87.anInt4589 = arg0.method3110();
			local87.anInt4583 = arg0.method3084();
			local87.anInt4596 = local79 + Static179.anInt3614;
			local87.aString153 = arg0.method3059();
			local87.aString154 = arg0.method3059();
		}
		Static106.anInt2113 = arg0.method3084();
		Static223.aBoolean280 = true;
	}
}
