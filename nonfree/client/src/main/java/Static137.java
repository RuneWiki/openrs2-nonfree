import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "[I")
	public static int[] anIntArray233;

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "I")
	public static int anInt2751 = 0;

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Z)V")
	public static void method2371() {
		Static90.method1648(0, 0);
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZIIII)V")
	public static void method2373(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 - arg0 >= Static29.anInt517 && arg0 + arg2 <= Static11.anInt170 && Static98.anInt2007 <= arg1 - arg0 && arg0 + arg1 <= Static213.anInt4452) {
			Static23.method375(arg2, arg0, arg3, arg1);
		} else {
			Static309.method4711(arg2, arg1, arg3, arg0);
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!lf;B)Lclient!q;")
	public static Class44_Sub2 method2374(@OriginalArg(0) Class1_Sub14 arg0) {
		return new Class44_Sub2(arg0.method1356(), arg0.method1356(), arg0.method1356(), arg0.method1356(), arg0.method1352(), arg0.method1378());
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)Z")
	public static boolean method2375() {
		try {
			if (Static190.anInt3615 == 2) {
				if (Static262.aClass1_Sub26_1 == null) {
					Static262.aClass1_Sub26_1 = Static325.method4046(Static13.aClass121_11, Static209.anInt3978, Static282.anInt5096);
					if (Static262.aClass1_Sub26_1 == null) {
						return false;
					}
				}
				if (Static42.aClass51_1 == null) {
					Static42.aClass51_1 = new Class51(Static155.aClass121_75, Static11.aClass121_7);
				}
				if (Static217.aClass1_Sub24_Sub4_3.method4631(Static262.aClass1_Sub26_1, Static42.aClass51_1, Static166.aClass121_80)) {
					Static217.aClass1_Sub24_Sub4_3.method4644();
					Static217.aClass1_Sub24_Sub4_3.method4663(Static213.anInt4453);
					Static217.aClass1_Sub24_Sub4_3.method4657(Static168.aBoolean223, Static262.aClass1_Sub26_1);
					Static42.aClass51_1 = null;
					Static190.anInt3615 = 0;
					Static262.aClass1_Sub26_1 = null;
					Static13.aClass121_11 = null;
					return true;
				}
			}
		} catch (@Pc(70) Exception local70) {
			local70.printStackTrace();
			Static217.aClass1_Sub24_Sub4_3.method4652();
			Static42.aClass51_1 = null;
			Static262.aClass1_Sub26_1 = null;
			Static13.aClass121_11 = null;
			Static190.anInt3615 = 0;
		}
		return false;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IZIIILclient!ne;IIZII)V")
	public static void method2376(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class118 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg7 && !Static278.method4290() && (Static104.aByteArrayArrayArray3[0][arg9][arg6] & 0x2) == 0) {
			if ((Static104.aByteArrayArrayArray3[arg3][arg9][arg6] & 0x10) != 0) {
				return;
			}
			if (Static266.method4187(arg3, arg6, arg9) != Static43.anInt905) {
				return;
			}
		}
		if (Static251.anInt4555 > arg3) {
			Static251.anInt4555 = arg3;
		}
		@Pc(52) Class71 local52 = Static255.method4052(arg5);
		if (Static156.aBoolean211 && local52.aBoolean141) {
			return;
		}
		@Pc(70) int local70;
		@Pc(73) int local73;
		if (arg8 == 1 || arg8 == 3) {
			local70 = local52.anInt2385;
			local73 = local52.anInt2377;
		} else {
			local73 = local52.anInt2385;
			local70 = local52.anInt2377;
		}
		@Pc(103) int local103;
		@Pc(96) int local96;
		if (arg9 + local70 <= 104) {
			local96 = (local70 + 1 >> 1) + arg9;
			local103 = arg9 + (local70 >> 1);
		} else {
			local96 = arg9 + 1;
			local103 = arg9;
		}
		@Pc(122) int local122;
		@Pc(120) int local120;
		if (local73 + arg6 > 104) {
			local120 = arg6 + 1;
			local122 = arg6;
		} else {
			local120 = (local73 + 1 >> 1) + arg6;
			local122 = (local73 >> 1) + arg6;
		}
		@Pc(142) int[][] local142 = Static24.anIntArrayArrayArray2[arg0];
		@Pc(170) int local170 = local142[local103][local120] + local142[local103][local122] + local142[local96][local122] + local142[local96][local120] >> 2;
		@Pc(179) int local179 = (arg6 << 7) + (local73 << 6);
		@Pc(187) int local187 = (local70 << 6) + (arg9 << 7);
		@Pc(189) int local189 = 0;
		@Pc(198) int[][] local198;
		if (Static156.aBoolean211 && arg0 != 0) {
			local198 = Static24.anIntArrayArrayArray2[0];
			local189 = local170 - (local198[local103][local120] + local198[local96][local122] + local198[local103][local122] + local198[local96][local120] >> 2);
		}
		@Pc(244) long local244 = (long) ((arg8 | 0x400) << 20 | arg6 << 7 | arg9 | arg2 << 14);
		if (local52.anInt2391 == 0 || arg1) {
			local244 |= Long.MIN_VALUE;
		}
		if (local52.anInt2354 == 1) {
			local244 |= 0x400000L;
		}
		local198 = null;
		if (arg1) {
			local198 = Static95.anIntArrayArrayArray5[0];
		} else if (arg0 < 3) {
			local198 = Static24.anIntArrayArrayArray2[arg0 + 1];
		}
		if (local52.aBoolean143) {
			local244 |= 0x80000000L;
		}
		if (local52.method2030()) {
			Static224.method3476(arg8, null, arg9, null, local52, arg6, arg3);
		}
		@Pc(314) boolean local314 = !arg1 & local52.aBoolean149;
		local244 |= (long) arg5 << 32;
		@Pc(372) Class15 local372;
		@Pc(388) Class177 local388;
		if (arg2 == 22) {
			if (Static239.aBoolean299 || local52.anInt2391 != 0 || local52.anInt2393 == 1 || local52.aBoolean151) {
				if (local52.anInt2373 == -1 && local52.anIntArray207 == null && local52.anIntArray209 == null && !local52.aBoolean148) {
					local388 = local52.method2037(arg7, 22, arg8, null, local314, local179, local142, local170, local187, local198);
					if (Static156.aBoolean211 && local314) {
						Static150.method2533(local388.aClass23_Sub1_4, local187, local189, local179);
					}
					local372 = local388.aClass15_10;
				} else {
					local372 = new Class15_Sub3(arg5, 22, arg8, arg0, arg9, arg6, -1, local52.aBoolean150, null);
				}
				Static75.method1476(arg3, arg9, arg6, local170, local372, local244, local52.aBoolean144);
				if (local52.anInt2393 == 1 && arg4 != null) {
					arg4.method3035(arg6, arg9);
				}
			}
		} else if (arg2 == 10 || arg2 == 11) {
			if (local52.anInt2373 == -1 && local52.anIntArray207 == null && local52.anIntArray209 == null && !local52.aBoolean148) {
				local388 = local52.method2037(arg7, 10, arg2 == 11 ? arg8 + 4 : arg8, null, local314, local179, local142, local170, local187, local198);
				if (Static156.aBoolean211 && local314) {
					Static150.method2533(local388.aClass23_Sub1_4, local187, local189, local179);
				}
				local372 = local388.aClass15_10;
			} else {
				local372 = new Class15_Sub3(arg5, 10, arg2 == 11 ? arg8 + 4 : arg8, arg0, arg9, arg6, -1, local52.aBoolean150, null);
			}
			if (local372 != null) {
				@Pc(519) boolean local519 = Static220.method3439(arg3, arg9, arg6, local170, local70, local73, local372, local244);
				if (local52.aBoolean153 && local519 && arg7) {
					@Pc(529) int local529 = 15;
					if (local372 instanceof Class15_Sub2) {
						local529 = ((Class15_Sub2) local372).method1021() / 4;
						if (local529 > 30) {
							local529 = 30;
						}
					}
					for (@Pc(549) int local549 = 0; local549 <= local70; local549++) {
						for (@Pc(554) int local554 = 0; local554 <= local73; local554++) {
							if (Static174.aByteArrayArrayArray11[arg3][local549 + arg9][arg6 + local554] < local529) {
								Static174.aByteArrayArrayArray11[arg3][arg9 + local549][local554 + arg6] = (byte) local529;
							}
						}
					}
				}
			}
			if (local52.anInt2393 != 0 && arg4 != null) {
				arg4.method3041(local52.aBoolean152, !local52.aBoolean140, local70, local73, arg6, arg9);
			}
		} else if (arg2 >= 12) {
			if (local52.anInt2373 == -1 && local52.anIntArray207 == null && local52.anIntArray209 == null && !local52.aBoolean148) {
				local388 = local52.method2037(arg7, arg2, arg8, null, local314, local179, local142, local170, local187, local198);
				if (Static156.aBoolean211 && local314) {
					Static150.method2533(local388.aClass23_Sub1_4, local187, local189, local179);
				}
				local372 = local388.aClass15_10;
			} else {
				local372 = new Class15_Sub3(arg5, arg2, arg8, arg0, arg9, arg6, -1, local52.aBoolean150, null);
			}
			Static220.method3439(arg3, arg9, arg6, local170, 1, 1, local372, local244);
			if (arg7 && arg2 >= 12 && arg2 <= 17 && arg2 != 13 && arg3 > 0 && local52.anInt2378 != 0) {
				Static190.anIntArrayArrayArray10[arg3][arg9][arg6] |= 0x4;
			}
			if (local52.anInt2393 != 0 && arg4 != null) {
				arg4.method3041(local52.aBoolean152, !local52.aBoolean140, local70, local73, arg6, arg9);
			}
		} else if (arg2 == 0) {
			if (local52.anInt2373 == -1 && local52.anIntArray207 == null && local52.anIntArray209 == null && !local52.aBoolean148) {
				local388 = local52.method2037(arg7, 0, arg8, null, local314, local179, local142, local170, local187, local198);
				if (Static156.aBoolean211 && local314) {
					Static150.method2533(local388.aClass23_Sub1_4, local187, local189, local179);
				}
				local372 = local388.aClass15_10;
			} else {
				local372 = new Class15_Sub3(arg5, 0, arg8, arg0, arg9, arg6, -1, local52.aBoolean150, null);
			}
			Static183.method2997(arg3, arg9, arg6, local170, local372, null, Static249.anIntArray394[arg8], 0, local244);
			if (arg7) {
				if (arg8 == 0) {
					if (local52.aBoolean153) {
						Static174.aByteArrayArrayArray11[arg3][arg9][arg6] = 50;
						Static174.aByteArrayArrayArray11[arg3][arg9][arg6 + 1] = 50;
					}
					if (local52.anInt2378 == 1) {
						Static190.anIntArrayArrayArray10[arg3][arg9][arg6] |= 0x1;
					}
				} else if (arg8 == 1) {
					if (local52.aBoolean153) {
						Static174.aByteArrayArrayArray11[arg3][arg9][arg6 + 1] = 50;
						Static174.aByteArrayArrayArray11[arg3][arg9 + 1][arg6 + 1] = 50;
					}
					if (local52.anInt2378 == 1) {
						Static190.anIntArrayArrayArray10[arg3][arg9][arg6 + 1] |= 0x2;
					}
				} else if (arg8 == 2) {
					if (local52.aBoolean153) {
						Static174.aByteArrayArrayArray11[arg3][arg9 + 1][arg6] = 50;
						Static174.aByteArrayArrayArray11[arg3][arg9 + 1][arg6 + 1] = 50;
					}
					if (local52.anInt2378 == 1) {
						Static190.anIntArrayArrayArray10[arg3][arg9 + 1][arg6] |= 0x1;
					}
				} else if (arg8 == 3) {
					if (local52.aBoolean153) {
						Static174.aByteArrayArrayArray11[arg3][arg9][arg6] = 50;
						Static174.aByteArrayArrayArray11[arg3][arg9 + 1][arg6] = 50;
					}
					if (local52.anInt2378 == 1) {
						Static190.anIntArrayArrayArray10[arg3][arg9][arg6] |= 0x2;
					}
				}
			}
			if (local52.anInt2393 != 0 && arg4 != null) {
				arg4.method3032(local52.aBoolean152, arg2, arg9, !local52.aBoolean140, arg8, arg6);
			}
			if (local52.anInt2353 != 16) {
				Static166.method2839(arg3, arg9, arg6, local52.anInt2353);
			}
		} else if (arg2 == 1) {
			if (local52.anInt2373 == -1 && local52.anIntArray207 == null && local52.anIntArray209 == null && !local52.aBoolean148) {
				local388 = local52.method2037(arg7, 1, arg8, null, local314, local179, local142, local170, local187, local198);
				if (Static156.aBoolean211 && local314) {
					Static150.method2533(local388.aClass23_Sub1_4, local187, local189, local179);
				}
				local372 = local388.aClass15_10;
			} else {
				local372 = new Class15_Sub3(arg5, 1, arg8, arg0, arg9, arg6, -1, local52.aBoolean150, null);
			}
			Static183.method2997(arg3, arg9, arg6, local170, local372, null, Static190.anIntArray301[arg8], 0, local244);
			if (local52.aBoolean153 && arg7) {
				if (arg8 == 0) {
					Static174.aByteArrayArrayArray11[arg3][arg9][arg6 + 1] = 50;
				} else if (arg8 == 1) {
					Static174.aByteArrayArrayArray11[arg3][arg9 + 1][arg6 + 1] = 50;
				} else if (arg8 == 2) {
					Static174.aByteArrayArrayArray11[arg3][arg9 + 1][arg6] = 50;
				} else if (arg8 == 3) {
					Static174.aByteArrayArrayArray11[arg3][arg9][arg6] = 50;
				}
			}
			if (local52.anInt2393 != 0 && arg4 != null) {
				arg4.method3032(local52.aBoolean152, arg2, arg9, !local52.aBoolean140, arg8, arg6);
			}
		} else {
			@Pc(1250) int local1250;
			if (arg2 == 2) {
				local1250 = arg8 + 1 & 0x3;
				@Pc(1322) Class15 local1322;
				@Pc(1294) Class15 local1294;
				if (local52.anInt2373 == -1 && local52.anIntArray207 == null && local52.anIntArray209 == null && !local52.aBoolean148) {
					@Pc(1280) Class177 local1280 = local52.method2037(arg7, 2, arg8 + 4, null, local314, local179, local142, local170, local187, local198);
					if (Static156.aBoolean211 && local314) {
						Static150.method2533(local1280.aClass23_Sub1_4, local187, local189, local179);
					}
					local1294 = local1280.aClass15_10;
					local1280 = local52.method2037(arg7, 2, local1250, null, local314, local179, local142, local170, local187, local198);
					if (Static156.aBoolean211 && local314) {
						Static150.method2533(local1280.aClass23_Sub1_4, local187, local189, local179);
					}
					local1322 = local1280.aClass15_10;
				} else {
					local1294 = new Class15_Sub3(arg5, 2, arg8 + 4, arg0, arg9, arg6, -1, local52.aBoolean150, null);
					local1322 = new Class15_Sub3(arg5, 2, local1250, arg0, arg9, arg6, -1, local52.aBoolean150, null);
				}
				Static183.method2997(arg3, arg9, arg6, local170, local1294, local1322, Static249.anIntArray394[arg8], Static249.anIntArray394[local1250], local244);
				if (local52.anInt2378 == 1 && arg7) {
					if (arg8 == 0) {
						Static190.anIntArrayArrayArray10[arg3][arg9][arg6] |= 0x1;
						Static190.anIntArrayArrayArray10[arg3][arg9][arg6 + 1] |= 0x2;
					} else if (arg8 == 1) {
						Static190.anIntArrayArrayArray10[arg3][arg9][arg6 + 1] |= 0x2;
						Static190.anIntArrayArrayArray10[arg3][arg9 + 1][arg6] |= 0x1;
					} else if (arg8 == 2) {
						Static190.anIntArrayArrayArray10[arg3][arg9 + 1][arg6] |= 0x1;
						Static190.anIntArrayArrayArray10[arg3][arg9][arg6] |= 0x2;
					} else if (arg8 == 3) {
						Static190.anIntArrayArrayArray10[arg3][arg9][arg6] |= 0x2;
						Static190.anIntArrayArrayArray10[arg3][arg9][arg6] |= 0x1;
					}
				}
				if (local52.anInt2393 != 0 && arg4 != null) {
					arg4.method3032(local52.aBoolean152, arg2, arg9, !local52.aBoolean140, arg8, arg6);
				}
				if (local52.anInt2353 != 16) {
					Static166.method2839(arg3, arg9, arg6, local52.anInt2353);
				}
			} else if (arg2 == 3) {
				if (local52.anInt2373 == -1 && local52.anIntArray207 == null && local52.anIntArray209 == null && !local52.aBoolean148) {
					local388 = local52.method2037(arg7, 3, arg8, null, local314, local179, local142, local170, local187, local198);
					if (Static156.aBoolean211 && local314) {
						Static150.method2533(local388.aClass23_Sub1_4, local187, local189, local179);
					}
					local372 = local388.aClass15_10;
				} else {
					local372 = new Class15_Sub3(arg5, 3, arg8, arg0, arg9, arg6, -1, local52.aBoolean150, null);
				}
				Static183.method2997(arg3, arg9, arg6, local170, local372, null, Static190.anIntArray301[arg8], 0, local244);
				if (local52.aBoolean153 && arg7) {
					if (arg8 == 0) {
						Static174.aByteArrayArrayArray11[arg3][arg9][arg6 + 1] = 50;
					} else if (arg8 == 1) {
						Static174.aByteArrayArrayArray11[arg3][arg9 + 1][arg6 + 1] = 50;
					} else if (arg8 == 2) {
						Static174.aByteArrayArrayArray11[arg3][arg9 + 1][arg6] = 50;
					} else if (arg8 == 3) {
						Static174.aByteArrayArrayArray11[arg3][arg9][arg6] = 50;
					}
				}
				if (local52.anInt2393 != 0 && arg4 != null) {
					arg4.method3032(local52.aBoolean152, arg2, arg9, !local52.aBoolean140, arg8, arg6);
				}
			} else if (arg2 == 9) {
				if (local52.anInt2373 == -1 && local52.anIntArray207 == null && local52.anIntArray209 == null && !local52.aBoolean148) {
					local388 = local52.method2037(arg7, arg2, arg8, null, local314, local179, local142, local170, local187, local198);
					if (Static156.aBoolean211 && local314) {
						Static150.method2533(local388.aClass23_Sub1_4, local187, local189, local179);
					}
					local372 = local388.aClass15_10;
				} else {
					local372 = new Class15_Sub3(arg5, arg2, arg8, arg0, arg9, arg6, -1, local52.aBoolean150, null);
				}
				Static220.method3439(arg3, arg9, arg6, local170, 1, 1, local372, local244);
				if (local52.anInt2393 != 0 && arg4 != null) {
					arg4.method3041(local52.aBoolean152, !local52.aBoolean140, local70, local73, arg6, arg9);
				}
				if (local52.anInt2353 != 16) {
					Static166.method2839(arg3, arg9, arg6, local52.anInt2353);
				}
			} else if (arg2 == 4) {
				if (local52.anInt2373 == -1 && local52.anIntArray207 == null && local52.anIntArray209 == null && !local52.aBoolean148) {
					local388 = local52.method2037(arg7, 4, arg8, null, local314, local179, local142, local170, local187, local198);
					if (Static156.aBoolean211 && local314) {
						Static150.method2533(local388.aClass23_Sub1_4, local187, local189, local179);
					}
					local372 = local388.aClass15_10;
				} else {
					local372 = new Class15_Sub3(arg5, 4, arg8, arg0, arg9, arg6, -1, local52.aBoolean150, null);
				}
				Static148.method2517(arg3, arg9, arg6, local170, local372, null, Static249.anIntArray394[arg8], 0, 0, 0, local244);
			} else {
				@Pc(1955) long local1955;
				@Pc(2003) Class15 local2003;
				@Pc(2019) Class177 local2019;
				if (arg2 == 5) {
					local1955 = Static30.method495(arg3, arg9, arg6);
					local1250 = 16;
					if (local1955 != 0L) {
						local1250 = Static255.method4052(Integer.MAX_VALUE & (int) (local1955 >>> 32)).anInt2353;
					}
					if (local52.anInt2373 == -1 && local52.anIntArray207 == null && local52.anIntArray209 == null && !local52.aBoolean148) {
						local2019 = local52.method2037(arg7, 4, arg8, null, local314, local179, local142, local170, local187, local198);
						if (Static156.aBoolean211 && local314) {
							Static150.method2533(local2019.aClass23_Sub1_4, local187 - Static21.anIntArray20[arg8] * 8, local189, local179 - Static47.anIntArray58[arg8] * 8);
						}
						local2003 = local2019.aClass15_10;
					} else {
						local2003 = new Class15_Sub3(arg5, 4, arg8, arg0, arg9, arg6, -1, local52.aBoolean150, null);
					}
					Static148.method2517(arg3, arg9, arg6, local170, local2003, null, Static249.anIntArray394[arg8], 0, local1250 * Static21.anIntArray20[arg8], local1250 * Static47.anIntArray58[arg8], local244);
				} else if (arg2 == 6) {
					local1955 = Static30.method495(arg3, arg9, arg6);
					local1250 = 8;
					if (local1955 != 0L) {
						local1250 = Static255.method4052((int) (local1955 >>> 32) & Integer.MAX_VALUE).anInt2353 / 2;
					}
					if (local52.anInt2373 == -1 && local52.anIntArray207 == null && local52.anIntArray209 == null && !local52.aBoolean148) {
						local2019 = local52.method2037(arg7, 4, arg8 + 4, null, local314, local179, local142, local170, local187, local198);
						if (Static156.aBoolean211 && local314) {
							Static150.method2533(local2019.aClass23_Sub1_4, local187 - Static82.anIntArray143[arg8] * 8, local189, local179 - Static82.anIntArray142[arg8] * 8);
						}
						local2003 = local2019.aClass15_10;
					} else {
						local2003 = new Class15_Sub3(arg5, 4, arg8 + 4, arg0, arg9, arg6, -1, local52.aBoolean150, null);
					}
					Static148.method2517(arg3, arg9, arg6, local170, local2003, null, 256, arg8, local1250 * Static82.anIntArray143[arg8], Static82.anIntArray142[arg8] * local1250, local244);
				} else if (arg2 == 7) {
					@Pc(2200) int local2200 = arg8 + 2 & 0x3;
					if (local52.anInt2373 == -1 && local52.anIntArray207 == null && local52.anIntArray209 == null && !local52.aBoolean148) {
						@Pc(2249) Class177 local2249 = local52.method2037(arg7, 4, local2200 + 4, null, local314, local179, local142, local170, local187, local198);
						if (Static156.aBoolean211 && local314) {
							Static150.method2533(local2249.aClass23_Sub1_4, local187, local189, local179);
						}
						local372 = local2249.aClass15_10;
					} else {
						local372 = new Class15_Sub3(arg5, 4, local2200 + 4, arg0, arg9, arg6, -1, local52.aBoolean150, null);
					}
					Static148.method2517(arg3, arg9, arg6, local170, local372, null, 256, local2200, 0, 0, local244);
				} else if (arg2 == 8) {
					local1250 = 8;
					local1955 = Static30.method495(arg3, arg9, arg6);
					if (local1955 != 0L) {
						local1250 = Static255.method4052((int) (local1955 >>> 32) & Integer.MAX_VALUE).anInt2353 / 2;
					}
					@Pc(2311) int local2311 = arg8 + 2 & 0x3;
					@Pc(2407) Class15 local2407;
					if (local52.anInt2373 == -1 && local52.anIntArray207 == null && local52.anIntArray209 == null && !local52.aBoolean148) {
						@Pc(2333) int local2333 = Static82.anIntArray143[arg8] * 8;
						@Pc(2339) int local2339 = Static82.anIntArray142[arg8] * 8;
						@Pc(2355) Class177 local2355 = local52.method2037(arg7, 4, arg8 + 4, null, local314, local179, local142, local170, local187, local198);
						if (Static156.aBoolean211 && local314) {
							Static150.method2533(local2355.aClass23_Sub1_4, local187 - local2333, local189, local179 - local2339);
						}
						local2003 = local2355.aClass15_10;
						local2355 = local52.method2037(arg7, 4, local2311 + 4, null, local314, local179, local142, local170, local187, local198);
						if (Static156.aBoolean211 && local314) {
							Static150.method2533(local2355.aClass23_Sub1_4, local187 - local2333, local189, local179 - local2339);
						}
						local2407 = local2355.aClass15_10;
					} else {
						local2003 = new Class15_Sub3(arg5, 4, arg8 + 4, arg0, arg9, arg6, -1, local52.aBoolean150, null);
						local2407 = new Class15_Sub3(arg5, 4, local2311 + 4, arg0, arg9, arg6, -1, local52.aBoolean150, null);
					}
					Static148.method2517(arg3, arg9, arg6, local170, local2003, local2407, 256, arg8, Static82.anIntArray143[arg8] * local1250, local1250 * Static82.anIntArray142[arg8], local244);
				}
			}
		}
	}
}
