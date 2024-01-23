import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray3;

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "[I")
	public static int[] anIntArray171;

	@OriginalMember(owner = "client!ji", name = "h", descriptor = "Z")
	public static boolean aBoolean198;

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString130 = "Loaded sprites";

	@OriginalMember(owner = "client!ji", name = "j", descriptor = "Lclient!li;")
	public static Interface3 anInterface3_1 = null;

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIBII)V")
	public static void method2215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(9) int local9 = 0; local9 < Static231.anInt4776; local9++) {
			if (Static295.anIntArray526[local9] + Static12.anIntArray14[local9] > arg1 && arg3 + arg1 > Static12.anIntArray14[local9] && arg2 < Static264.anIntArray483[local9] + Static113.anIntArray166[local9] && Static113.anIntArray166[local9] < arg2 + arg0) {
				Static165.aBooleanArray16[local9] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IZLclient!f;ZIIIIIII)V")
	public static void method2216(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class52 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg1 && !Static67.method4885() && (Static134.aByteArrayArrayArray9[0][arg0][arg9] & 0x2) == 0) {
			if ((Static134.aByteArrayArrayArray9[arg7][arg0][arg9] & 0x10) != 0) {
				return;
			}
			if (Static54.method1070(arg7, arg9, arg0) != Static8.anInt271) {
				return;
			}
		}
		if (arg7 < Static295.anInt6152) {
			Static295.anInt6152 = arg7;
		}
		@Pc(60) Class143 local60 = Static218.method3692(arg8);
		if (Static60.aBoolean106 && local60.aBoolean378) {
			return;
		}
		@Pc(79) int local79;
		@Pc(76) int local76;
		if (arg5 == 1 || arg5 == 3) {
			local79 = local60.anInt4494;
			local76 = local60.anInt4496;
		} else {
			local76 = local60.anInt4494;
			local79 = local60.anInt4496;
		}
		@Pc(96) int local96;
		@Pc(100) int local100;
		if (arg0 + local79 > 104) {
			local96 = arg0;
			local100 = arg0 + 1;
		} else {
			local100 = arg0 + (local79 + 1 >> 1);
			local96 = arg0 + (local79 >> 1);
		}
		@Pc(120) int[][] local120 = Static141.anIntArrayArrayArray4[arg6];
		@Pc(134) int local134;
		@Pc(142) int local142;
		if (arg9 + local76 <= 104) {
			local134 = (local76 >> 1) + arg9;
			local142 = (local76 + 1 >> 1) + arg9;
		} else {
			local142 = arg9 + 1;
			local134 = arg9;
		}
		@Pc(177) int local177 = local120[local100][local142] + local120[local96][local134] + local120[local100][local134] + local120[local96][local142] >> 2;
		@Pc(185) int local185 = (local79 << 6) + (arg0 << 7);
		@Pc(187) int local187 = 0;
		@Pc(195) int local195 = (local76 << 6) + (arg9 << 7);
		@Pc(206) int[][] local206;
		if (Static60.aBoolean106 && arg6 != 0) {
			local206 = Static141.anIntArrayArrayArray4[0];
			local187 = local177 - (local206[local100][local142] + local206[local100][local134] + local206[local96][local134] + local206[local96][local142] >> 2);
		}
		@Pc(252) long local252 = (long) ((arg9 | 0x800000) << 7 | arg0 | arg4 << 14 | arg5 << 20);
		if (local60.anInt4490 == 0 || arg3) {
			local252 |= Long.MIN_VALUE;
		}
		local206 = null;
		if (local60.anInt4499 == 1) {
			local252 |= 0x400000L;
		}
		if (arg3) {
			local206 = Static274.anIntArrayArrayArray14[0];
		} else if (arg6 < 3) {
			local206 = Static141.anIntArrayArrayArray4[arg6 + 1];
		}
		if (local60.aBoolean377) {
			local252 |= 0x80000000L;
		}
		if (local60.method3649()) {
			Static185.method3168(null, arg0, null, arg5, arg7, local60, arg9);
		}
		local252 |= (long) arg8 << 32;
		@Pc(329) boolean local329 = !arg3 & local60.aBoolean368;
		@Pc(393) Class36 local393;
		@Pc(380) Class62 local380;
		if (arg4 == 22) {
			if (Static106.aBoolean183 || local60.anInt4490 != 0 || local60.anInt4526 == 1 || local60.aBoolean381) {
				if (local60.anInt4531 == -1 && local60.anIntArray370 == null && local60.anIntArray372 == null && !local60.aBoolean370) {
					local380 = local60.method3651(null, local206, 22, local195, arg1, local177, local329, arg5, local120, local185);
					if (Static60.aBoolean106 && local329) {
						Static194.method3253(local380.aClass71_Sub1_1, local185, local187, local195);
					}
					local393 = local380.aClass36_4;
				} else {
					local393 = new Class36_Sub4(arg8, 22, arg5, arg6, arg0, arg9, -1, local60.aBoolean376, null);
				}
				Static205.method3455(arg7, arg0, arg9, local177, local393, local252, local60.aBoolean372);
				if (local60.anInt4526 == 1 && arg2 != null) {
					arg2.method1252(arg9, arg0);
				}
			}
		} else if (arg4 == 10 || arg4 == 11) {
			if (local60.anInt4531 == -1 && local60.anIntArray370 == null && local60.anIntArray372 == null && !local60.aBoolean370) {
				local380 = local60.method3651(null, local206, 10, local195, arg1, local177, local329, arg4 == 11 ? arg5 + 4 : arg5, local120, local185);
				if (Static60.aBoolean106 && local329) {
					Static194.method3253(local380.aClass71_Sub1_1, local185, local187, local195);
				}
				local393 = local380.aClass36_4;
			} else {
				local393 = new Class36_Sub4(arg8, 10, arg4 == 11 ? arg5 + 4 : arg5, arg6, arg0, arg9, -1, local60.aBoolean376, null);
			}
			if (local393 != null) {
				@Pc(529) boolean local529 = Static108.method2010(arg7, arg0, arg9, local177, local79, local76, local393, local252);
				if (local60.aBoolean367 && local529 && arg1) {
					@Pc(539) int local539 = 15;
					if (local393 instanceof Class36_Sub2) {
						local539 = ((Class36_Sub2) local393).method3830() / 4;
						if (local539 > 30) {
							local539 = 30;
						}
					}
					for (@Pc(556) int local556 = 0; local556 <= local79; local556++) {
						for (@Pc(561) int local561 = 0; local561 <= local76; local561++) {
							if (Static170.aByteArrayArrayArray11[arg7][arg0 + local556][local561 + arg9] < local539) {
								Static170.aByteArrayArrayArray11[arg7][local556 + arg0][local561 + arg9] = (byte) local539;
							}
						}
					}
				}
			}
			if (local60.anInt4526 != 0 && arg2 != null) {
				arg2.method1253(!local60.aBoolean375, local79, arg0, arg9, local76, local60.aBoolean369);
			}
		} else if (arg4 >= 12) {
			if (local60.anInt4531 == -1 && local60.anIntArray370 == null && local60.anIntArray372 == null && !local60.aBoolean370) {
				local380 = local60.method3651(null, local206, arg4, local195, arg1, local177, local329, arg5, local120, local185);
				if (Static60.aBoolean106 && local329) {
					Static194.method3253(local380.aClass71_Sub1_1, local185, local187, local195);
				}
				local393 = local380.aClass36_4;
			} else {
				local393 = new Class36_Sub4(arg8, arg4, arg5, arg6, arg0, arg9, -1, local60.aBoolean376, null);
			}
			Static108.method2010(arg7, arg0, arg9, local177, 1, 1, local393, local252);
			if (arg1 && arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg7 > 0 && local60.anInt4502 != 0) {
				Static188.anIntArrayArrayArray9[arg7][arg0][arg9] |= 0x4;
			}
			if (local60.anInt4526 != 0 && arg2 != null) {
				arg2.method1253(!local60.aBoolean375, local79, arg0, arg9, local76, local60.aBoolean369);
			}
		} else if (arg4 == 0) {
			if (local60.anInt4531 == -1 && local60.anIntArray370 == null && local60.anIntArray372 == null && !local60.aBoolean370) {
				local380 = local60.method3651(null, local206, 0, local195, arg1, local177, local329, arg5, local120, local185);
				if (Static60.aBoolean106 && local329) {
					Static194.method3253(local380.aClass71_Sub1_1, local185, local187, local195);
				}
				local393 = local380.aClass36_4;
			} else {
				local393 = new Class36_Sub4(arg8, 0, arg5, arg6, arg0, arg9, -1, local60.aBoolean376, null);
			}
			Static58.method1120(arg7, arg0, arg9, local177, local393, null, Static215.anIntArray364[arg5], 0, local252);
			if (arg1) {
				if (arg5 == 0) {
					if (local60.aBoolean367) {
						Static170.aByteArrayArrayArray11[arg7][arg0][arg9] = 50;
						Static170.aByteArrayArrayArray11[arg7][arg0][arg9 + 1] = 50;
					}
					if (local60.anInt4502 == 1) {
						Static188.anIntArrayArrayArray9[arg7][arg0][arg9] |= 0x1;
					}
				} else if (arg5 == 1) {
					if (local60.aBoolean367) {
						Static170.aByteArrayArrayArray11[arg7][arg0][arg9 + 1] = 50;
						Static170.aByteArrayArrayArray11[arg7][arg0 + 1][arg9 + 1] = 50;
					}
					if (local60.anInt4502 == 1) {
						Static188.anIntArrayArrayArray9[arg7][arg0][arg9 + 1] |= 0x2;
					}
				} else if (arg5 == 2) {
					if (local60.aBoolean367) {
						Static170.aByteArrayArrayArray11[arg7][arg0 + 1][arg9] = 50;
						Static170.aByteArrayArrayArray11[arg7][arg0 + 1][arg9 + 1] = 50;
					}
					if (local60.anInt4502 == 1) {
						Static188.anIntArrayArrayArray9[arg7][arg0 + 1][arg9] |= 0x1;
					}
				} else if (arg5 == 3) {
					if (local60.aBoolean367) {
						Static170.aByteArrayArrayArray11[arg7][arg0][arg9] = 50;
						Static170.aByteArrayArrayArray11[arg7][arg0 + 1][arg9] = 50;
					}
					if (local60.anInt4502 == 1) {
						Static188.anIntArrayArrayArray9[arg7][arg0][arg9] |= 0x2;
					}
				}
			}
			if (local60.anInt4526 != 0 && arg2 != null) {
				arg2.method1251(arg9, local60.aBoolean369, arg4, arg0, arg5, !local60.aBoolean375);
			}
			if (local60.anInt4500 != 16) {
				Static162.method2814(arg7, arg0, arg9, local60.anInt4500);
			}
		} else if (arg4 == 1) {
			if (local60.anInt4531 == -1 && local60.anIntArray370 == null && local60.anIntArray372 == null && !local60.aBoolean370) {
				local380 = local60.method3651(null, local206, 1, local195, arg1, local177, local329, arg5, local120, local185);
				if (Static60.aBoolean106 && local329) {
					Static194.method3253(local380.aClass71_Sub1_1, local185, local187, local195);
				}
				local393 = local380.aClass36_4;
			} else {
				local393 = new Class36_Sub4(arg8, 1, arg5, arg6, arg0, arg9, -1, local60.aBoolean376, null);
			}
			Static58.method1120(arg7, arg0, arg9, local177, local393, null, Static14.anIntArray21[arg5], 0, local252);
			if (local60.aBoolean367 && arg1) {
				if (arg5 == 0) {
					Static170.aByteArrayArrayArray11[arg7][arg0][arg9 + 1] = 50;
				} else if (arg5 == 1) {
					Static170.aByteArrayArrayArray11[arg7][arg0 + 1][arg9 + 1] = 50;
				} else if (arg5 == 2) {
					Static170.aByteArrayArrayArray11[arg7][arg0 + 1][arg9] = 50;
				} else if (arg5 == 3) {
					Static170.aByteArrayArrayArray11[arg7][arg0][arg9] = 50;
				}
			}
			if (local60.anInt4526 != 0 && arg2 != null) {
				arg2.method1251(arg9, local60.aBoolean369, arg4, arg0, arg5, !local60.aBoolean375);
			}
		} else {
			@Pc(1256) int local1256;
			if (arg4 == 2) {
				local1256 = arg5 + 1 & 0x3;
				@Pc(1329) Class36 local1329;
				@Pc(1302) Class36 local1302;
				if (local60.anInt4531 == -1 && local60.anIntArray370 == null && local60.anIntArray372 == null && !local60.aBoolean370) {
					@Pc(1289) Class62 local1289 = local60.method3651(null, local206, 2, local195, arg1, local177, local329, arg5 + 4, local120, local185);
					if (Static60.aBoolean106 && local329) {
						Static194.method3253(local1289.aClass71_Sub1_1, local185, local187, local195);
					}
					local1302 = local1289.aClass36_4;
					local1289 = local60.method3651(null, local206, 2, local195, arg1, local177, local329, local1256, local120, local185);
					if (Static60.aBoolean106 && local329) {
						Static194.method3253(local1289.aClass71_Sub1_1, local185, local187, local195);
					}
					local1329 = local1289.aClass36_4;
				} else {
					local1302 = new Class36_Sub4(arg8, 2, arg5 + 4, arg6, arg0, arg9, -1, local60.aBoolean376, null);
					local1329 = new Class36_Sub4(arg8, 2, local1256, arg6, arg0, arg9, -1, local60.aBoolean376, null);
				}
				Static58.method1120(arg7, arg0, arg9, local177, local1302, local1329, Static215.anIntArray364[arg5], Static215.anIntArray364[local1256], local252);
				if (local60.anInt4502 == 1 && arg1) {
					if (arg5 == 0) {
						Static188.anIntArrayArrayArray9[arg7][arg0][arg9] |= 0x1;
						Static188.anIntArrayArrayArray9[arg7][arg0][arg9 + 1] |= 0x2;
					} else if (arg5 == 1) {
						Static188.anIntArrayArrayArray9[arg7][arg0][arg9 + 1] |= 0x2;
						Static188.anIntArrayArrayArray9[arg7][arg0 + 1][arg9] |= 0x1;
					} else if (arg5 == 2) {
						Static188.anIntArrayArrayArray9[arg7][arg0 + 1][arg9] |= 0x1;
						Static188.anIntArrayArrayArray9[arg7][arg0][arg9] |= 0x2;
					} else if (arg5 == 3) {
						Static188.anIntArrayArrayArray9[arg7][arg0][arg9] |= 0x2;
						Static188.anIntArrayArrayArray9[arg7][arg0][arg9] |= 0x1;
					}
				}
				if (local60.anInt4526 != 0 && arg2 != null) {
					arg2.method1251(arg9, local60.aBoolean369, arg4, arg0, arg5, !local60.aBoolean375);
				}
				if (local60.anInt4500 != 16) {
					Static162.method2814(arg7, arg0, arg9, local60.anInt4500);
				}
			} else if (arg4 == 3) {
				if (local60.anInt4531 == -1 && local60.anIntArray370 == null && local60.anIntArray372 == null && !local60.aBoolean370) {
					local380 = local60.method3651(null, local206, 3, local195, arg1, local177, local329, arg5, local120, local185);
					if (Static60.aBoolean106 && local329) {
						Static194.method3253(local380.aClass71_Sub1_1, local185, local187, local195);
					}
					local393 = local380.aClass36_4;
				} else {
					local393 = new Class36_Sub4(arg8, 3, arg5, arg6, arg0, arg9, -1, local60.aBoolean376, null);
				}
				Static58.method1120(arg7, arg0, arg9, local177, local393, null, Static14.anIntArray21[arg5], 0, local252);
				if (local60.aBoolean367 && arg1) {
					if (arg5 == 0) {
						Static170.aByteArrayArrayArray11[arg7][arg0][arg9 + 1] = 50;
					} else if (arg5 == 1) {
						Static170.aByteArrayArrayArray11[arg7][arg0 + 1][arg9 + 1] = 50;
					} else if (arg5 == 2) {
						Static170.aByteArrayArrayArray11[arg7][arg0 + 1][arg9] = 50;
					} else if (arg5 == 3) {
						Static170.aByteArrayArrayArray11[arg7][arg0][arg9] = 50;
					}
				}
				if (local60.anInt4526 != 0 && arg2 != null) {
					arg2.method1251(arg9, local60.aBoolean369, arg4, arg0, arg5, !local60.aBoolean375);
				}
			} else if (arg4 == 9) {
				if (local60.anInt4531 == -1 && local60.anIntArray370 == null && local60.anIntArray372 == null && !local60.aBoolean370) {
					local380 = local60.method3651(null, local206, arg4, local195, arg1, local177, local329, arg5, local120, local185);
					if (Static60.aBoolean106 && local329) {
						Static194.method3253(local380.aClass71_Sub1_1, local185, local187, local195);
					}
					local393 = local380.aClass36_4;
				} else {
					local393 = new Class36_Sub4(arg8, arg4, arg5, arg6, arg0, arg9, -1, local60.aBoolean376, null);
				}
				Static108.method2010(arg7, arg0, arg9, local177, 1, 1, local393, local252);
				if (local60.anInt4526 != 0 && arg2 != null) {
					arg2.method1253(!local60.aBoolean375, local79, arg0, arg9, local76, local60.aBoolean369);
				}
				if (local60.anInt4500 != 16) {
					Static162.method2814(arg7, arg0, arg9, local60.anInt4500);
				}
			} else if (arg4 == 4) {
				if (local60.anInt4531 == -1 && local60.anIntArray370 == null && local60.anIntArray372 == null && !local60.aBoolean370) {
					local380 = local60.method3651(null, local206, 4, local195, arg1, local177, local329, arg5, local120, local185);
					if (Static60.aBoolean106 && local329) {
						Static194.method3253(local380.aClass71_Sub1_1, local185, local187, local195);
					}
					local393 = local380.aClass36_4;
				} else {
					local393 = new Class36_Sub4(arg8, 4, arg5, arg6, arg0, arg9, -1, local60.aBoolean376, null);
				}
				Static188.method3187(arg7, arg0, arg9, local177, local393, null, Static215.anIntArray364[arg5], 0, 0, 0, local252);
			} else {
				@Pc(1944) long local1944;
				@Pc(2014) Class36 local2014;
				@Pc(1987) Class62 local1987;
				if (arg4 == 5) {
					local1256 = 16;
					local1944 = Static243.method3054(arg7, arg0, arg9);
					if (local1944 != 0L) {
						local1256 = Static218.method3692((int) (local1944 >>> 32) & Integer.MAX_VALUE).anInt4500;
					}
					if (local60.anInt4531 == -1 && local60.anIntArray370 == null && local60.anIntArray372 == null && !local60.aBoolean370) {
						local1987 = local60.method3651(null, local206, 4, local195, arg1, local177, local329, arg5, local120, local185);
						if (Static60.aBoolean106 && local329) {
							Static194.method3253(local1987.aClass71_Sub1_1, local185 - Static215.anIntArray365[arg5] * 8, local187, local195 - Static114.anIntArray103[arg5] * 8);
						}
						local2014 = local1987.aClass36_4;
					} else {
						local2014 = new Class36_Sub4(arg8, 4, arg5, arg6, arg0, arg9, -1, local60.aBoolean376, null);
					}
					Static188.method3187(arg7, arg0, arg9, local177, local2014, null, Static215.anIntArray364[arg5], 0, Static215.anIntArray365[arg5] * local1256, Static114.anIntArray103[arg5] * local1256, local252);
				} else if (arg4 == 6) {
					local1256 = 8;
					local1944 = Static243.method3054(arg7, arg0, arg9);
					if (local1944 != 0L) {
						local1256 = Static218.method3692(Integer.MAX_VALUE & (int) (local1944 >>> 32)).anInt4500 / 2;
					}
					if (local60.anInt4531 == -1 && local60.anIntArray370 == null && local60.anIntArray372 == null && !local60.aBoolean370) {
						local1987 = local60.method3651(null, local206, 4, local195, arg1, local177, local329, arg5 + 4, local120, local185);
						if (Static60.aBoolean106 && local329) {
							Static194.method3253(local1987.aClass71_Sub1_1, local185 - Static8.anIntArray11[arg5] * 8, local187, local195 - Static295.anIntArray525[arg5] * 8);
						}
						local2014 = local1987.aClass36_4;
					} else {
						local2014 = new Class36_Sub4(arg8, 4, arg5 + 4, arg6, arg0, arg9, -1, local60.aBoolean376, null);
					}
					Static188.method3187(arg7, arg0, arg9, local177, local2014, null, 256, arg5, Static8.anIntArray11[arg5] * local1256, Static295.anIntArray525[arg5] * local1256, local252);
				} else if (arg4 == 7) {
					@Pc(2193) int local2193 = arg5 + 2 & 0x3;
					if (local60.anInt4531 == -1 && local60.anIntArray370 == null && local60.anIntArray372 == null && !local60.aBoolean370) {
						@Pc(2225) Class62 local2225 = local60.method3651(null, local206, 4, local195, arg1, local177, local329, local2193 + 4, local120, local185);
						if (Static60.aBoolean106 && local329) {
							Static194.method3253(local2225.aClass71_Sub1_1, local185, local187, local195);
						}
						local393 = local2225.aClass36_4;
					} else {
						local393 = new Class36_Sub4(arg8, 4, local2193 + 4, arg6, arg0, arg9, -1, local60.aBoolean376, null);
					}
					Static188.method3187(arg7, arg0, arg9, local177, local393, null, 256, local2193, 0, 0, local252);
				} else if (arg4 == 8) {
					local1944 = Static243.method3054(arg7, arg0, arg9);
					local1256 = 8;
					if (local1944 != 0L) {
						local1256 = Static218.method3692((int) (local1944 >>> 32) & Integer.MAX_VALUE).anInt4500 / 2;
					}
					@Pc(2305) int local2305 = arg5 + 2 & 0x3;
					@Pc(2353) Class36 local2353;
					if (local60.anInt4531 == -1 && local60.anIntArray370 == null && local60.anIntArray372 == null && !local60.aBoolean370) {
						@Pc(2361) int local2361 = Static295.anIntArray525[arg5] * 8;
						@Pc(2367) int local2367 = Static8.anIntArray11[arg5] * 8;
						@Pc(2383) Class62 local2383 = local60.method3651(null, local206, 4, local195, arg1, local177, local329, arg5 + 4, local120, local185);
						if (Static60.aBoolean106 && local329) {
							Static194.method3253(local2383.aClass71_Sub1_1, local185 - local2367, local187, local195 - local2361);
						}
						local2014 = local2383.aClass36_4;
						local2383 = local60.method3651(null, local206, 4, local195, arg1, local177, local329, local2305 + 4, local120, local185);
						if (Static60.aBoolean106 && local329) {
							Static194.method3253(local2383.aClass71_Sub1_1, local185 - local2367, local187, local195 - local2361);
						}
						local2353 = local2383.aClass36_4;
					} else {
						local2014 = new Class36_Sub4(arg8, 4, arg5 + 4, arg6, arg0, arg9, -1, local60.aBoolean376, null);
						local2353 = new Class36_Sub4(arg8, 4, local2305 + 4, arg6, arg0, arg9, -1, local60.aBoolean376, null);
					}
					Static188.method3187(arg7, arg0, arg9, local177, local2014, local2353, 256, arg5, Static8.anIntArray11[arg5] * local1256, local1256 * Static295.anIntArray525[arg5], local252);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
	public static void method2217() {
		Static266.aClass46_36.method1079();
		Static266.aClass46_37.method1079();
		Static106.aClass46_15.method1079();
		Static73.aClass46_9.method1079();
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZLjava/lang/String;Z)V")
	public static void method2218(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) short[] local8 = new short[16];
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < Static13.anInt332; local15++) {
			@Pc(26) Class155 local26 = Static152.method2616(local15);
			if ((!arg1 || local26.aBoolean410) && local26.anInt4812 == -1 && local26.anInt4862 == -1 && local26.anInt4856 == 0 && local26.aString239.toLowerCase().indexOf(local11) != -1) {
				if (local13 >= 250) {
					Static5.anInt153 = -1;
					Static51.aShortArray25 = null;
					return;
				}
				if (local8.length <= local13) {
					@Pc(77) short[] local77 = new short[local8.length * 2];
					for (@Pc(79) int local79 = 0; local79 < local13; local79++) {
						local77[local79] = local8[local79];
					}
					local8 = local77;
				}
				local8[local13++] = (short) local15;
			}
		}
		Static5.anInt153 = local13;
		Static58.anInt1315 = 0;
		Static51.aShortArray25 = local8;
		@Pc(115) String[] local115 = new String[Static5.anInt153];
		for (@Pc(117) int local117 = 0; local117 < Static5.anInt153; local117++) {
			local115[local117] = Static152.method2616(local8[local117]).aString239;
		}
		Static82.method4612(Static51.aShortArray25, local115);
	}
}
