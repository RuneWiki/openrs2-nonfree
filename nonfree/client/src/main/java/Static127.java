import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!jk", name = "S", descriptor = "I")
	public static int anInt2559;

	@OriginalMember(owner = "client!jk", name = "T", descriptor = "F")
	public static float aFloat27;

	@OriginalMember(owner = "client!jk", name = "U", descriptor = "I")
	public static int anInt2560;

	@OriginalMember(owner = "client!jk", name = "I", descriptor = "Lclient!sa;")
	public static Class8_Sub26 aClass8_Sub26_1 = new Class8_Sub26(0, 0);

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(BIII)I")
	public static int method2065(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == arg0) {
			return arg1;
		} else {
			@Pc(21) int local21 = 128 - arg2;
			@Pc(35) int local35 = arg2 * (arg0 & 0xFF00FF) + local21 * (arg1 & 0xFF00FF) & 0xFF00FF00;
			@Pc(53) int local53 = local21 * (arg1 >>> 7 & 0x1FE01FE) + (arg0 >>> 7 & 0x1FE01FE) * arg2 & 0xFF00FF00;
			return (local35 >> 7) + local53;
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIIZILclient!mf;ZIII)V")
	public static void method2066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class112 arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg6 && !Static158.method2553() && (Static170.aByteArrayArrayArray9[0][arg8][arg9] & 0x2) == 0) {
			if ((Static170.aByteArrayArrayArray9[arg4][arg8][arg9] & 0x10) != 0) {
				return;
			}
			if (Static137.method1331(arg4, arg9, arg8) != Static253.anInt4999) {
				return;
			}
		}
		if (arg4 < Static241.anInt4830) {
			Static241.anInt4830 = arg4;
		}
		@Pc(54) Class70 local54 = Static235.method3578(arg0);
		if (Static116.aBoolean188 && local54.aBoolean155) {
			return;
		}
		@Pc(74) int local74;
		@Pc(77) int local77;
		if (arg1 == 1 || arg1 == 3) {
			local74 = local54.anInt2063;
			local77 = local54.anInt2065;
		} else {
			local77 = local54.anInt2063;
			local74 = local54.anInt2065;
		}
		@Pc(97) int local97;
		@Pc(105) int local105;
		if (local74 + arg8 <= 104) {
			local97 = arg8 + (local74 >> 1);
			local105 = (local74 + 1 >> 1) + arg8;
		} else {
			local97 = arg8;
			local105 = arg8 + 1;
		}
		@Pc(132) int local132;
		@Pc(126) int local126;
		if (local77 + arg9 <= 104) {
			local126 = arg9 + (local77 + 1 >> 1);
			local132 = (local77 >> 1) + arg9;
		} else {
			local132 = arg9;
			local126 = arg9 + 1;
		}
		@Pc(144) int[][] local144 = Static195.anIntArrayArrayArray7[arg2];
		@Pc(170) int local170 = local144[local105][local126] + local144[local105][local132] + local144[local97][local132] + local144[local97][local126] >> 2;
		@Pc(178) int local178 = (arg8 << 7) + (local74 << 6);
		@Pc(189) int local189 = 0;
		@Pc(197) int local197 = (local77 << 6) + (arg9 << 7);
		@Pc(205) int[][] local205;
		if (Static116.aBoolean188 && arg2 != 0) {
			local205 = Static195.anIntArrayArrayArray7[0];
			local189 = local170 - (local205[local97][local126] + local205[local105][local132] + local205[local97][local132] + local205[local105][local126] >> 2);
		}
		local205 = null;
		if (arg3) {
			local205 = Static87.anIntArrayArrayArray5[0];
		} else if (arg2 < 3) {
			local205 = Static195.anIntArrayArrayArray7[arg2 + 1];
		}
		@Pc(274) long local274 = (long) (arg1 << 20 | arg7 << 14 | arg9 << 7 | arg8 | 0x40000000);
		if (local54.anInt2045 == 0 || arg3) {
			local274 |= Long.MIN_VALUE;
		}
		if (local54.anInt2071 == 1) {
			local274 |= 0x400000L;
		}
		if (local54.aBoolean156) {
			local274 |= 0x80000000L;
		}
		if (local54.method1588()) {
			Static213.method3340(arg9, arg1, null, null, local54, arg8, arg4);
		}
		local274 |= (long) arg0 << 32;
		@Pc(335) boolean local335 = !arg3 & local54.aBoolean154;
		@Pc(386) Class36 local386;
		@Pc(402) Class77 local402;
		if (arg7 == 22) {
			if (Static113.aBoolean182 || local54.anInt2045 != 0 || local54.anInt2064 == 1 || local54.aBoolean150) {
				if (local54.anInt2091 == -1 && local54.anIntArray148 == null && local54.anIntArray145 == null && !local54.aBoolean161) {
					local402 = local54.method1584(arg6, null, local170, 22, arg1, local205, local197, local335, local178, local144);
					if (Static116.aBoolean188 && local335) {
						Static6.method57(local402.aClass43_Sub2_3, local178, local189, local197);
					}
					local386 = local402.aClass36_1;
				} else {
					local386 = new Class36_Sub4(arg0, 22, arg1, arg2, arg8, arg9, -1, local54.aBoolean149, null);
				}
				Static286.method4128(arg4, arg8, arg9, local170, local386, local274, local54.aBoolean162);
				if (local54.anInt2064 == 1 && arg5 != null) {
					arg5.method2546(arg9, arg8);
				}
			}
		} else if (arg7 == 10 || arg7 == 11) {
			if (local54.anInt2091 == -1 && local54.anIntArray148 == null && local54.anIntArray145 == null && !local54.aBoolean161) {
				local402 = local54.method1584(arg6, null, local170, 10, arg7 == 11 ? arg1 + 4 : arg1, local205, local197, local335, local178, local144);
				if (Static116.aBoolean188 && local335) {
					Static6.method57(local402.aClass43_Sub2_3, local178, local189, local197);
				}
				local386 = local402.aClass36_1;
			} else {
				local386 = new Class36_Sub4(arg0, 10, arg7 == 11 ? arg1 + 4 : arg1, arg2, arg8, arg9, -1, local54.aBoolean149, null);
			}
			if (local386 != null) {
				@Pc(537) boolean local537 = Static130.method2091(arg4, arg8, arg9, local170, local74, local77, local386, local274);
				if (local54.aBoolean153 && local537 && arg6) {
					@Pc(547) int local547 = 15;
					if (local386 instanceof Class36_Sub2) {
						local547 = ((Class36_Sub2) local386).method3946() / 4;
						if (local547 > 30) {
							local547 = 30;
						}
					}
					for (@Pc(564) int local564 = 0; local564 <= local74; local564++) {
						for (@Pc(573) int local573 = 0; local573 <= local77; local573++) {
							if (local547 > Static40.aByteArrayArrayArray1[arg4][arg8 + local564][arg9 + local573]) {
								Static40.aByteArrayArrayArray1[arg4][arg8 + local564][local573 + arg9] = (byte) local547;
							}
						}
					}
				}
			}
			if (local54.anInt2064 != 0 && arg5 != null) {
				arg5.method2538(local77, arg8, local54.aBoolean158, arg9, local74, !local54.aBoolean157);
			}
		} else if (arg7 >= 12) {
			if (local54.anInt2091 == -1 && local54.anIntArray148 == null && local54.anIntArray145 == null && !local54.aBoolean161) {
				local402 = local54.method1584(arg6, null, local170, arg7, arg1, local205, local197, local335, local178, local144);
				if (Static116.aBoolean188 && local335) {
					Static6.method57(local402.aClass43_Sub2_3, local178, local189, local197);
				}
				local386 = local402.aClass36_1;
			} else {
				local386 = new Class36_Sub4(arg0, arg7, arg1, arg2, arg8, arg9, -1, local54.aBoolean149, null);
			}
			Static130.method2091(arg4, arg8, arg9, local170, 1, 1, local386, local274);
			if (arg6 && arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg4 > 0 && local54.anInt2074 != 0) {
				Static74.anIntArrayArrayArray3[arg4][arg8][arg9] |= 0x4;
			}
			if (local54.anInt2064 != 0 && arg5 != null) {
				arg5.method2538(local77, arg8, local54.aBoolean158, arg9, local74, !local54.aBoolean157);
			}
		} else if (arg7 == 0) {
			if (local54.anInt2091 == -1 && local54.anIntArray148 == null && local54.anIntArray145 == null && !local54.aBoolean161) {
				local402 = local54.method1584(arg6, null, local170, 0, arg1, local205, local197, local335, local178, local144);
				if (Static116.aBoolean188 && local335) {
					Static6.method57(local402.aClass43_Sub2_3, local178, local189, local197);
				}
				local386 = local402.aClass36_1;
			} else {
				local386 = new Class36_Sub4(arg0, 0, arg1, arg2, arg8, arg9, -1, local54.aBoolean149, null);
			}
			Static53.method845(arg4, arg8, arg9, local170, local386, null, Static49.anIntArray77[arg1], 0, local274);
			if (arg6) {
				if (arg1 == 0) {
					if (local54.aBoolean153) {
						Static40.aByteArrayArrayArray1[arg4][arg8][arg9] = 50;
						Static40.aByteArrayArrayArray1[arg4][arg8][arg9 + 1] = 50;
					}
					if (local54.anInt2074 == 1) {
						Static74.anIntArrayArrayArray3[arg4][arg8][arg9] |= 0x1;
					}
				} else if (arg1 == 1) {
					if (local54.aBoolean153) {
						Static40.aByteArrayArrayArray1[arg4][arg8][arg9 + 1] = 50;
						Static40.aByteArrayArrayArray1[arg4][arg8 + 1][arg9 + 1] = 50;
					}
					if (local54.anInt2074 == 1) {
						Static74.anIntArrayArrayArray3[arg4][arg8][arg9 + 1] |= 0x2;
					}
				} else if (arg1 == 2) {
					if (local54.aBoolean153) {
						Static40.aByteArrayArrayArray1[arg4][arg8 + 1][arg9] = 50;
						Static40.aByteArrayArrayArray1[arg4][arg8 + 1][arg9 + 1] = 50;
					}
					if (local54.anInt2074 == 1) {
						Static74.anIntArrayArrayArray3[arg4][arg8 + 1][arg9] |= 0x1;
					}
				} else if (arg1 == 3) {
					if (local54.aBoolean153) {
						Static40.aByteArrayArrayArray1[arg4][arg8][arg9] = 50;
						Static40.aByteArrayArrayArray1[arg4][arg8 + 1][arg9] = 50;
					}
					if (local54.anInt2074 == 1) {
						Static74.anIntArrayArrayArray3[arg4][arg8][arg9] |= 0x2;
					}
				}
			}
			if (local54.anInt2064 != 0 && arg5 != null) {
				arg5.method2548(arg7, arg9, arg1, local54.aBoolean158, !local54.aBoolean157, arg8);
			}
			if (local54.anInt2089 != 16) {
				Static200.method3091(arg4, arg8, arg9, local54.anInt2089);
			}
		} else if (arg7 == 1) {
			if (local54.anInt2091 == -1 && local54.anIntArray148 == null && local54.anIntArray145 == null && !local54.aBoolean161) {
				local402 = local54.method1584(arg6, null, local170, 1, arg1, local205, local197, local335, local178, local144);
				if (Static116.aBoolean188 && local335) {
					Static6.method57(local402.aClass43_Sub2_3, local178, local189, local197);
				}
				local386 = local402.aClass36_1;
			} else {
				local386 = new Class36_Sub4(arg0, 1, arg1, arg2, arg8, arg9, -1, local54.aBoolean149, null);
			}
			Static53.method845(arg4, arg8, arg9, local170, local386, null, Static206.anIntArray328[arg1], 0, local274);
			if (local54.aBoolean153 && arg6) {
				if (arg1 == 0) {
					Static40.aByteArrayArrayArray1[arg4][arg8][arg9 + 1] = 50;
				} else if (arg1 == 1) {
					Static40.aByteArrayArrayArray1[arg4][arg8 + 1][arg9 + 1] = 50;
				} else if (arg1 == 2) {
					Static40.aByteArrayArrayArray1[arg4][arg8 + 1][arg9] = 50;
				} else if (arg1 == 3) {
					Static40.aByteArrayArrayArray1[arg4][arg8][arg9] = 50;
				}
			}
			if (local54.anInt2064 != 0 && arg5 != null) {
				arg5.method2548(arg7, arg9, arg1, local54.aBoolean158, !local54.aBoolean157, arg8);
			}
		} else {
			@Pc(1285) int local1285;
			if (arg7 == 2) {
				local1285 = arg1 + 1 & 0x3;
				@Pc(1315) Class36 local1315;
				@Pc(1329) Class36 local1329;
				if (local54.anInt2091 == -1 && local54.anIntArray148 == null && local54.anIntArray145 == null && !local54.aBoolean161) {
					@Pc(1347) Class77 local1347 = local54.method1584(arg6, null, local170, 2, arg1 + 4, local205, local197, local335, local178, local144);
					if (Static116.aBoolean188 && local335) {
						Static6.method57(local1347.aClass43_Sub2_3, local178, local189, local197);
					}
					local1315 = local1347.aClass36_1;
					local1347 = local54.method1584(arg6, null, local170, 2, local1285, local205, local197, local335, local178, local144);
					if (Static116.aBoolean188 && local335) {
						Static6.method57(local1347.aClass43_Sub2_3, local178, local189, local197);
					}
					local1329 = local1347.aClass36_1;
				} else {
					local1315 = new Class36_Sub4(arg0, 2, arg1 + 4, arg2, arg8, arg9, -1, local54.aBoolean149, null);
					local1329 = new Class36_Sub4(arg0, 2, local1285, arg2, arg8, arg9, -1, local54.aBoolean149, null);
				}
				Static53.method845(arg4, arg8, arg9, local170, local1315, local1329, Static49.anIntArray77[arg1], Static49.anIntArray77[local1285], local274);
				if (local54.anInt2074 == 1 && arg6) {
					if (arg1 == 0) {
						Static74.anIntArrayArrayArray3[arg4][arg8][arg9] |= 0x1;
						Static74.anIntArrayArrayArray3[arg4][arg8][arg9 + 1] |= 0x2;
					} else if (arg1 == 1) {
						Static74.anIntArrayArrayArray3[arg4][arg8][arg9 + 1] |= 0x2;
						Static74.anIntArrayArrayArray3[arg4][arg8 + 1][arg9] |= 0x1;
					} else if (arg1 == 2) {
						Static74.anIntArrayArrayArray3[arg4][arg8 + 1][arg9] |= 0x1;
						Static74.anIntArrayArrayArray3[arg4][arg8][arg9] |= 0x2;
					} else if (arg1 == 3) {
						Static74.anIntArrayArrayArray3[arg4][arg8][arg9] |= 0x2;
						Static74.anIntArrayArrayArray3[arg4][arg8][arg9] |= 0x1;
					}
				}
				if (local54.anInt2064 != 0 && arg5 != null) {
					arg5.method2548(arg7, arg9, arg1, local54.aBoolean158, !local54.aBoolean157, arg8);
				}
				if (local54.anInt2089 != 16) {
					Static200.method3091(arg4, arg8, arg9, local54.anInt2089);
				}
			} else if (arg7 == 3) {
				if (local54.anInt2091 == -1 && local54.anIntArray148 == null && local54.anIntArray145 == null && !local54.aBoolean161) {
					local402 = local54.method1584(arg6, null, local170, 3, arg1, local205, local197, local335, local178, local144);
					if (Static116.aBoolean188 && local335) {
						Static6.method57(local402.aClass43_Sub2_3, local178, local189, local197);
					}
					local386 = local402.aClass36_1;
				} else {
					local386 = new Class36_Sub4(arg0, 3, arg1, arg2, arg8, arg9, -1, local54.aBoolean149, null);
				}
				Static53.method845(arg4, arg8, arg9, local170, local386, null, Static206.anIntArray328[arg1], 0, local274);
				if (local54.aBoolean153 && arg6) {
					if (arg1 == 0) {
						Static40.aByteArrayArrayArray1[arg4][arg8][arg9 + 1] = 50;
					} else if (arg1 == 1) {
						Static40.aByteArrayArrayArray1[arg4][arg8 + 1][arg9 + 1] = 50;
					} else if (arg1 == 2) {
						Static40.aByteArrayArrayArray1[arg4][arg8 + 1][arg9] = 50;
					} else if (arg1 == 3) {
						Static40.aByteArrayArrayArray1[arg4][arg8][arg9] = 50;
					}
				}
				if (local54.anInt2064 != 0 && arg5 != null) {
					arg5.method2548(arg7, arg9, arg1, local54.aBoolean158, !local54.aBoolean157, arg8);
				}
			} else if (arg7 == 9) {
				if (local54.anInt2091 == -1 && local54.anIntArray148 == null && local54.anIntArray145 == null && !local54.aBoolean161) {
					local402 = local54.method1584(arg6, null, local170, arg7, arg1, local205, local197, local335, local178, local144);
					if (Static116.aBoolean188 && local335) {
						Static6.method57(local402.aClass43_Sub2_3, local178, local189, local197);
					}
					local386 = local402.aClass36_1;
				} else {
					local386 = new Class36_Sub4(arg0, arg7, arg1, arg2, arg8, arg9, -1, local54.aBoolean149, null);
				}
				Static130.method2091(arg4, arg8, arg9, local170, 1, 1, local386, local274);
				if (local54.anInt2064 != 0 && arg5 != null) {
					arg5.method2538(local77, arg8, local54.aBoolean158, arg9, local74, !local54.aBoolean157);
				}
				if (local54.anInt2089 != 16) {
					Static200.method3091(arg4, arg8, arg9, local54.anInt2089);
				}
			} else if (arg7 == 4) {
				if (local54.anInt2091 == -1 && local54.anIntArray148 == null && local54.anIntArray145 == null && !local54.aBoolean161) {
					local402 = local54.method1584(arg6, null, local170, 4, arg1, local205, local197, local335, local178, local144);
					if (Static116.aBoolean188 && local335) {
						Static6.method57(local402.aClass43_Sub2_3, local178, local189, local197);
					}
					local386 = local402.aClass36_1;
				} else {
					local386 = new Class36_Sub4(arg0, 4, arg1, arg2, arg8, arg9, -1, local54.aBoolean149, null);
				}
				Static93.method1492(arg4, arg8, arg9, local170, local386, null, Static49.anIntArray77[arg1], 0, 0, 0, local274);
			} else {
				@Pc(1977) long local1977;
				@Pc(2049) Class36 local2049;
				@Pc(2023) Class77 local2023;
				if (arg7 == 5) {
					local1285 = 16;
					local1977 = Static153.method2452(arg4, arg8, arg9);
					if (local1977 != 0L) {
						local1285 = Static235.method3578((int) (local1977 >>> 32) & Integer.MAX_VALUE).anInt2089;
					}
					if (local54.anInt2091 == -1 && local54.anIntArray148 == null && local54.anIntArray145 == null && !local54.aBoolean161) {
						local2023 = local54.method1584(arg6, null, local170, 4, arg1, local205, local197, local335, local178, local144);
						if (Static116.aBoolean188 && local335) {
							Static6.method57(local2023.aClass43_Sub2_3, local178 - Static64.anIntArray97[arg1] * 8, local189, local197 - Static288.anIntArray94[arg1] * 8);
						}
						local2049 = local2023.aClass36_1;
					} else {
						local2049 = new Class36_Sub4(arg0, 4, arg1, arg2, arg8, arg9, -1, local54.aBoolean149, null);
					}
					Static93.method1492(arg4, arg8, arg9, local170, local2049, null, Static49.anIntArray77[arg1], 0, local1285 * Static64.anIntArray97[arg1], local1285 * Static288.anIntArray94[arg1], local274);
				} else if (arg7 == 6) {
					local1285 = 8;
					local1977 = Static153.method2452(arg4, arg8, arg9);
					if (local1977 != 0L) {
						local1285 = Static235.method3578((int) (local1977 >>> 32) & Integer.MAX_VALUE).anInt2089 / 2;
					}
					if (local54.anInt2091 == -1 && local54.anIntArray148 == null && local54.anIntArray145 == null && !local54.aBoolean161) {
						local2023 = local54.method1584(arg6, null, local170, 4, arg1 + 4, local205, local197, local335, local178, local144);
						if (Static116.aBoolean188 && local335) {
							Static6.method57(local2023.aClass43_Sub2_3, local178 - Static76.anIntArray111[arg1] * 8, local189, local197 - Static63.anIntArray96[arg1] * 8);
						}
						local2049 = local2023.aClass36_1;
					} else {
						local2049 = new Class36_Sub4(arg0, 4, arg1 + 4, arg2, arg8, arg9, -1, local54.aBoolean149, null);
					}
					Static93.method1492(arg4, arg8, arg9, local170, local2049, null, 256, arg1, local1285 * Static76.anIntArray111[arg1], Static63.anIntArray96[arg1] * local1285, local274);
				} else if (arg7 == 7) {
					@Pc(2223) int local2223 = arg1 + 2 & 0x3;
					if (local54.anInt2091 == -1 && local54.anIntArray148 == null && local54.anIntArray145 == null && !local54.aBoolean161) {
						@Pc(2273) Class77 local2273 = local54.method1584(arg6, null, local170, 4, local2223 + 4, local205, local197, local335, local178, local144);
						if (Static116.aBoolean188 && local335) {
							Static6.method57(local2273.aClass43_Sub2_3, local178, local189, local197);
						}
						local386 = local2273.aClass36_1;
					} else {
						local386 = new Class36_Sub4(arg0, 4, local2223 + 4, arg2, arg8, arg9, -1, local54.aBoolean149, null);
					}
					Static93.method1492(arg4, arg8, arg9, local170, local386, null, 256, local2223, 0, 0, local274);
				} else if (arg7 == 8) {
					local1285 = 8;
					local1977 = Static153.method2452(arg4, arg8, arg9);
					@Pc(2316) int local2316 = arg1 + 2 & 0x3;
					if (local1977 != 0L) {
						local1285 = Static235.method3578(Integer.MAX_VALUE & (int) (local1977 >>> 32)).anInt2089 / 2;
					}
					@Pc(2426) Class36 local2426;
					if (local54.anInt2091 == -1 && local54.anIntArray148 == null && local54.anIntArray145 == null && !local54.aBoolean161) {
						@Pc(2351) int local2351 = Static63.anIntArray96[arg1] * 8;
						@Pc(2357) int local2357 = Static76.anIntArray111[arg1] * 8;
						@Pc(2373) Class77 local2373 = local54.method1584(arg6, null, local170, 4, arg1 + 4, local205, local197, local335, local178, local144);
						if (Static116.aBoolean188 && local335) {
							Static6.method57(local2373.aClass43_Sub2_3, local178 - local2357, local189, local197 - local2351);
						}
						local2049 = local2373.aClass36_1;
						local2373 = local54.method1584(arg6, null, local170, 4, local2316 + 4, local205, local197, local335, local178, local144);
						if (Static116.aBoolean188 && local335) {
							Static6.method57(local2373.aClass43_Sub2_3, local178 - local2357, local189, local197 - local2351);
						}
						local2426 = local2373.aClass36_1;
					} else {
						local2049 = new Class36_Sub4(arg0, 4, arg1 + 4, arg2, arg8, arg9, -1, local54.aBoolean149, null);
						local2426 = new Class36_Sub4(arg0, 4, local2316 + 4, arg2, arg8, arg9, -1, local54.aBoolean149, null);
					}
					Static93.method1492(arg4, arg8, arg9, local170, local2049, local2426, 256, arg1, local1285 * Static76.anIntArray111[arg1], local1285 * Static63.anIntArray96[arg1], local274);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(ZI)I")
	public static int method2067(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static10.method90(arg0);
	}
}
