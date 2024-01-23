import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "[Lclient!gk;")
	public static Class1_Sub2_Sub10[] aClass1_Sub2_Sub10Array1 = new Class1_Sub2_Sub10[14];

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIBIII)V")
	public static void method133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == arg2) {
			Static189.method3146(arg4, arg1, arg0, arg3);
		} else if (Static224.anInt4436 <= arg4 - arg1 && Static68.anInt1451 >= arg1 + arg4 && Static297.anInt5619 <= arg0 - arg2 && arg2 + arg0 <= Static49.anInt1129) {
			Static286.method4312(arg2, arg3, arg4, arg1, arg0);
		} else {
			Static267.method4056(arg1, arg2, arg0, arg4, arg3);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIILclient!dn;Lclient!dn;IIIIJ)V")
	private static void method134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class14 arg4, @OriginalArg(5) Class14 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) long arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class67 local6 = new Class67();
		local6.aLong97 = arg10;
		local6.anInt2513 = arg1 * 128 + 64;
		local6.anInt2508 = arg2 * 128 + 64;
		local6.anInt2514 = arg3;
		local6.aClass14_7 = arg4;
		local6.aClass14_8 = arg5;
		local6.anInt2507 = arg6;
		local6.anInt2517 = arg7;
		local6.anInt2512 = arg8;
		local6.anInt2515 = arg9;
		for (@Pc(46) int local46 = arg0; local46 >= 0; local46--) {
			if (Static74.aClass1_Sub26ArrayArrayArray1[local46][arg1][arg2] == null) {
				Static74.aClass1_Sub26ArrayArrayArray1[local46][arg1][arg2] = new Class1_Sub26(local46, arg1, arg2);
			}
		}
		Static74.aClass1_Sub26ArrayArrayArray1[arg0][arg1][arg2].aClass67_1 = local6;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILclient!la;IZIZIIII)V")
	public static void method135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class92 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg4 && !Static60.method1068() && (Static260.aByteArrayArrayArray25[0][arg9][arg8] & 0x2) == 0) {
			if ((Static260.aByteArrayArrayArray25[arg1][arg9][arg8] & 0x10) != 0) {
				return;
			}
			if (Static218.method3430(arg8, arg9, arg1) != Static226.anInt4504) {
				return;
			}
		}
		if (Static153.anInt3320 > arg1) {
			Static153.anInt3320 = arg1;
		}
		@Pc(64) Class181 local64 = Static183.method3511(arg7);
		if (Static277.aBoolean412 && local64.aBoolean443) {
			return;
		}
		@Pc(85) int local85;
		@Pc(82) int local82;
		if (arg0 == 1 || arg0 == 3) {
			local82 = local64.anInt5559;
			local85 = local64.anInt5534;
		} else {
			local82 = local64.anInt5534;
			local85 = local64.anInt5559;
		}
		@Pc(112) int local112;
		@Pc(106) int local106;
		if (local85 + arg9 <= 104) {
			local106 = (local85 + 1 >> 1) + arg9;
			local112 = (local85 >> 1) + arg9;
		} else {
			local112 = arg9;
			local106 = arg9 + 1;
		}
		@Pc(139) int local139;
		@Pc(133) int local133;
		if (arg8 + local82 <= 104) {
			local133 = (local82 + 1 >> 1) + arg8;
			local139 = (local82 >> 1) + arg8;
		} else {
			local139 = arg8;
			local133 = arg8 + 1;
		}
		@Pc(151) int[][] local151 = Static55.anIntArrayArrayArray3[arg5];
		@Pc(160) int local160 = (arg9 << 7) + (local85 << 6);
		@Pc(186) int local186 = local151[local106][local133] + local151[local112][local133] + local151[local106][local139] + local151[local112][local139] >> 2;
		@Pc(194) int local194 = (local82 << 6) + (arg8 << 7);
		@Pc(196) int local196 = 0;
		@Pc(204) int[][] local204;
		if (Static277.aBoolean412 && arg5 != 0) {
			local204 = Static55.anIntArrayArrayArray3[0];
			local196 = local186 - (local204[local112][local139] + local204[local106][local139] + local204[local112][local133] + local204[local106][local133] >> 2);
		}
		local204 = null;
		if (arg6) {
			local204 = Static108.anIntArrayArrayArray7[0];
		} else if (arg5 < 3) {
			local204 = Static55.anIntArrayArrayArray3[arg5 + 1];
		}
		@Pc(271) long local271 = (long) ((arg3 | 0x10000) << 14 | arg8 << 7 | arg9 | arg0 << 20);
		if (local64.anInt5537 == 0 || arg6) {
			local271 |= Long.MIN_VALUE;
		}
		if (local64.anInt5547 == 1) {
			local271 |= 0x400000L;
		}
		if (local64.aBoolean445) {
			local271 |= 0x80000000L;
		}
		local271 |= (long) arg7 << 32;
		if (local64.method4425()) {
			Static84.method1471(arg1, arg8, arg0, null, arg9, null, local64);
		}
		@Pc(327) int local327 = local64.anInt5579;
		@Pc(336) boolean local336 = !arg6 & local64.aBoolean440;
		@Pc(380) Class14 local380;
		@Pc(396) Class32 local396;
		if (arg3 == 22) {
			if (Static116.aBoolean450 || local64.anInt5537 != 0 || local64.anInt5568 == 1 || local64.aBoolean437) {
				if (local327 == -1 && local64.anIntArray552 == null && !local64.aBoolean435) {
					local396 = local64.method4415(local160, local204, local151, local336, local186, arg4, null, local194, 22, arg0);
					if (Static277.aBoolean412 && local336) {
						Static292.method4404(local396.aClass12_Sub2_2, local160, local196, local194);
					}
					local380 = local396.aClass14_5;
				} else {
					local380 = new Class14_Sub1(arg7, 22, arg0, arg5, arg9, arg8, local327, local64.aBoolean441, null);
				}
				Static255.method3906(arg1, arg9, arg8, local186, local380, local271, local64.aBoolean436);
				if (local64.anInt5568 == 1 && arg2 != null) {
					arg2.method2572(arg8, arg9);
				}
			}
		} else if (arg3 == 10 || arg3 == 11) {
			if (local327 == -1 && local64.anIntArray552 == null && !local64.aBoolean435) {
				local396 = local64.method4415(local160, local204, local151, local336, local186, arg4, null, local194, 10, arg3 == 11 ? arg0 + 4 : arg0);
				if (Static277.aBoolean412 && local336) {
					Static292.method4404(local396.aClass12_Sub2_2, local160, local196, local194);
				}
				local380 = local396.aClass14_5;
			} else {
				local380 = new Class14_Sub1(arg7, 10, arg3 == 11 ? arg0 + 4 : arg0, arg5, arg9, arg8, local327, local64.aBoolean441, null);
			}
			if (local380 != null) {
				@Pc(524) boolean local524 = Static283.method4253(arg1, arg9, arg8, local186, local85, local82, local380, local271);
				if (local64.aBoolean444 && local524 && arg4) {
					@Pc(534) int local534 = 15;
					if (local380 instanceof Class14_Sub6) {
						local534 = ((Class14_Sub6) local380).method4114() / 4;
						if (local534 > 30) {
							local534 = 30;
						}
					}
					for (@Pc(552) int local552 = 0; local552 <= local85; local552++) {
						for (@Pc(557) int local557 = 0; local557 <= local82; local557++) {
							if (local534 > Static5.aByteArrayArrayArray4[arg1][local552 + arg9][local557 + arg8]) {
								Static5.aByteArrayArrayArray4[arg1][arg9 + local552][local557 + arg8] = (byte) local534;
							}
						}
					}
				}
			}
			if (local64.anInt5568 != 0 && arg2 != null) {
				arg2.method2569(local85, !local64.aBoolean446, arg9, arg8, local64.aBoolean439, local82);
			}
		} else if (arg3 >= 12) {
			if (local327 == -1 && local64.anIntArray552 == null && !local64.aBoolean435) {
				local396 = local64.method4415(local160, local204, local151, local336, local186, arg4, null, local194, arg3, arg0);
				if (Static277.aBoolean412 && local336) {
					Static292.method4404(local396.aClass12_Sub2_2, local160, local196, local194);
				}
				local380 = local396.aClass14_5;
			} else {
				local380 = new Class14_Sub1(arg7, arg3, arg0, arg5, arg9, arg8, local327, local64.aBoolean441, null);
			}
			Static283.method4253(arg1, arg9, arg8, local186, 1, 1, local380, local271);
			if (arg4 && arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg1 > 0 && local64.anInt5573 != 0) {
				Static219.anIntArrayArrayArray10[arg1][arg9][arg8] |= 0x4;
			}
			if (local64.anInt5568 != 0 && arg2 != null) {
				arg2.method2569(local85, !local64.aBoolean446, arg9, arg8, local64.aBoolean439, local82);
			}
		} else if (arg3 == 0) {
			if (local327 == -1 && local64.anIntArray552 == null && !local64.aBoolean435) {
				local396 = local64.method4415(local160, local204, local151, local336, local186, arg4, null, local194, 0, arg0);
				if (Static277.aBoolean412 && local336) {
					Static292.method4404(local396.aClass12_Sub2_2, local160, local196, local194);
				}
				local380 = local396.aClass14_5;
			} else {
				local380 = new Class14_Sub1(arg7, 0, arg0, arg5, arg9, arg8, local327, local64.aBoolean441, null);
			}
			Static74.method1306(arg1, arg9, arg8, local186, local380, null, Static166.anIntArray317[arg0], 0, local271);
			if (arg4) {
				if (arg0 == 0) {
					if (local64.aBoolean444) {
						Static5.aByteArrayArrayArray4[arg1][arg9][arg8] = 50;
						Static5.aByteArrayArrayArray4[arg1][arg9][arg8 + 1] = 50;
					}
					if (local64.anInt5573 == 1) {
						Static219.anIntArrayArrayArray10[arg1][arg9][arg8] |= 0x1;
					}
				} else if (arg0 == 1) {
					if (local64.aBoolean444) {
						Static5.aByteArrayArrayArray4[arg1][arg9][arg8 + 1] = 50;
						Static5.aByteArrayArrayArray4[arg1][arg9 + 1][arg8 + 1] = 50;
					}
					if (local64.anInt5573 == 1) {
						Static219.anIntArrayArrayArray10[arg1][arg9][arg8 + 1] |= 0x2;
					}
				} else if (arg0 == 2) {
					if (local64.aBoolean444) {
						Static5.aByteArrayArrayArray4[arg1][arg9 + 1][arg8] = 50;
						Static5.aByteArrayArrayArray4[arg1][arg9 + 1][arg8 + 1] = 50;
					}
					if (local64.anInt5573 == 1) {
						Static219.anIntArrayArrayArray10[arg1][arg9 + 1][arg8] |= 0x1;
					}
				} else if (arg0 == 3) {
					if (local64.aBoolean444) {
						Static5.aByteArrayArrayArray4[arg1][arg9][arg8] = 50;
						Static5.aByteArrayArrayArray4[arg1][arg9 + 1][arg8] = 50;
					}
					if (local64.anInt5573 == 1) {
						Static219.anIntArrayArrayArray10[arg1][arg9][arg8] |= 0x2;
					}
				}
			}
			if (local64.anInt5568 != 0 && arg2 != null) {
				arg2.method2581(arg3, arg0, arg9, !local64.aBoolean446, arg8, local64.aBoolean439);
			}
			if (local64.anInt5572 != 16) {
				Static198.method37(arg1, arg9, arg8, local64.anInt5572);
			}
		} else if (arg3 == 1) {
			if (local327 == -1 && local64.anIntArray552 == null && !local64.aBoolean435) {
				local396 = local64.method4415(local160, local204, local151, local336, local186, arg4, null, local194, 1, arg0);
				if (Static277.aBoolean412 && local336) {
					Static292.method4404(local396.aClass12_Sub2_2, local160, local196, local194);
				}
				local380 = local396.aClass14_5;
			} else {
				local380 = new Class14_Sub1(arg7, 1, arg0, arg5, arg9, arg8, local327, local64.aBoolean441, null);
			}
			Static74.method1306(arg1, arg9, arg8, local186, local380, null, Static108.anIntArray221[arg0], 0, local271);
			if (local64.aBoolean444 && arg4) {
				if (arg0 == 0) {
					Static5.aByteArrayArrayArray4[arg1][arg9][arg8 + 1] = 50;
				} else if (arg0 == 1) {
					Static5.aByteArrayArrayArray4[arg1][arg9 + 1][arg8 + 1] = 50;
				} else if (arg0 == 2) {
					Static5.aByteArrayArrayArray4[arg1][arg9 + 1][arg8] = 50;
				} else if (arg0 == 3) {
					Static5.aByteArrayArrayArray4[arg1][arg9][arg8] = 50;
				}
			}
			if (local64.anInt5568 != 0 && arg2 != null) {
				arg2.method2581(arg3, arg0, arg9, !local64.aBoolean446, arg8, local64.aBoolean439);
			}
		} else {
			@Pc(1237) int local1237;
			if (arg3 == 2) {
				local1237 = arg0 + 1 & 0x3;
				@Pc(1279) Class14 local1279;
				@Pc(1265) Class14 local1265;
				if (local327 == -1 && local64.anIntArray552 == null && !local64.aBoolean435) {
					@Pc(1298) Class32 local1298 = local64.method4415(local160, local204, local151, local336, local186, arg4, null, local194, 2, arg0 + 4);
					if (Static277.aBoolean412 && local336) {
						Static292.method4404(local1298.aClass12_Sub2_2, local160, local196, local194);
					}
					local1265 = local1298.aClass14_5;
					local1298 = local64.method4415(local160, local204, local151, local336, local186, arg4, null, local194, 2, local1237);
					if (Static277.aBoolean412 && local336) {
						Static292.method4404(local1298.aClass12_Sub2_2, local160, local196, local194);
					}
					local1279 = local1298.aClass14_5;
				} else {
					local1265 = new Class14_Sub1(arg7, 2, arg0 + 4, arg5, arg9, arg8, local327, local64.aBoolean441, null);
					local1279 = new Class14_Sub1(arg7, 2, local1237, arg5, arg9, arg8, local327, local64.aBoolean441, null);
				}
				Static74.method1306(arg1, arg9, arg8, local186, local1265, local1279, Static166.anIntArray317[arg0], Static166.anIntArray317[local1237], local271);
				if (local64.anInt5573 == 1 && arg4) {
					if (arg0 == 0) {
						Static219.anIntArrayArrayArray10[arg1][arg9][arg8] |= 0x1;
						Static219.anIntArrayArrayArray10[arg1][arg9][arg8 + 1] |= 0x2;
					} else if (arg0 == 1) {
						Static219.anIntArrayArrayArray10[arg1][arg9][arg8 + 1] |= 0x2;
						Static219.anIntArrayArrayArray10[arg1][arg9 + 1][arg8] |= 0x1;
					} else if (arg0 == 2) {
						Static219.anIntArrayArrayArray10[arg1][arg9 + 1][arg8] |= 0x1;
						Static219.anIntArrayArrayArray10[arg1][arg9][arg8] |= 0x2;
					} else if (arg0 == 3) {
						Static219.anIntArrayArrayArray10[arg1][arg9][arg8] |= 0x2;
						Static219.anIntArrayArrayArray10[arg1][arg9][arg8] |= 0x1;
					}
				}
				if (local64.anInt5568 != 0 && arg2 != null) {
					arg2.method2581(arg3, arg0, arg9, !local64.aBoolean446, arg8, local64.aBoolean439);
				}
				if (local64.anInt5572 != 16) {
					Static198.method37(arg1, arg9, arg8, local64.anInt5572);
				}
			} else if (arg3 == 3) {
				if (local327 == -1 && local64.anIntArray552 == null && !local64.aBoolean435) {
					local396 = local64.method4415(local160, local204, local151, local336, local186, arg4, null, local194, 3, arg0);
					if (Static277.aBoolean412 && local336) {
						Static292.method4404(local396.aClass12_Sub2_2, local160, local196, local194);
					}
					local380 = local396.aClass14_5;
				} else {
					local380 = new Class14_Sub1(arg7, 3, arg0, arg5, arg9, arg8, local327, local64.aBoolean441, null);
				}
				Static74.method1306(arg1, arg9, arg8, local186, local380, null, Static108.anIntArray221[arg0], 0, local271);
				if (local64.aBoolean444 && arg4) {
					if (arg0 == 0) {
						Static5.aByteArrayArrayArray4[arg1][arg9][arg8 + 1] = 50;
					} else if (arg0 == 1) {
						Static5.aByteArrayArrayArray4[arg1][arg9 + 1][arg8 + 1] = 50;
					} else if (arg0 == 2) {
						Static5.aByteArrayArrayArray4[arg1][arg9 + 1][arg8] = 50;
					} else if (arg0 == 3) {
						Static5.aByteArrayArrayArray4[arg1][arg9][arg8] = 50;
					}
				}
				if (local64.anInt5568 != 0 && arg2 != null) {
					arg2.method2581(arg3, arg0, arg9, !local64.aBoolean446, arg8, local64.aBoolean439);
				}
			} else if (arg3 == 9) {
				if (local327 == -1 && local64.anIntArray552 == null && !local64.aBoolean435) {
					local396 = local64.method4415(local160, local204, local151, local336, local186, arg4, null, local194, arg3, arg0);
					if (Static277.aBoolean412 && local336) {
						Static292.method4404(local396.aClass12_Sub2_2, local160, local196, local194);
					}
					local380 = local396.aClass14_5;
				} else {
					local380 = new Class14_Sub1(arg7, arg3, arg0, arg5, arg9, arg8, local327, local64.aBoolean441, null);
				}
				Static283.method4253(arg1, arg9, arg8, local186, 1, 1, local380, local271);
				if (local64.anInt5568 != 0 && arg2 != null) {
					arg2.method2569(local85, !local64.aBoolean446, arg9, arg8, local64.aBoolean439, local82);
				}
				if (local64.anInt5572 != 16) {
					Static198.method37(arg1, arg9, arg8, local64.anInt5572);
				}
			} else if (arg3 == 4) {
				if (local327 == -1 && local64.anIntArray552 == null && !local64.aBoolean435) {
					local396 = local64.method4415(local160, local204, local151, local336, local186, arg4, null, local194, 4, arg0);
					if (Static277.aBoolean412 && local336) {
						Static292.method4404(local396.aClass12_Sub2_2, local160, local196, local194);
					}
					local380 = local396.aClass14_5;
				} else {
					local380 = new Class14_Sub1(arg7, 4, arg0, arg5, arg9, arg8, local327, local64.aBoolean441, null);
				}
				method134(arg1, arg9, arg8, local186, local380, null, Static166.anIntArray317[arg0], 0, 0, 0, local271);
			} else {
				@Pc(1919) long local1919;
				@Pc(1984) Class14 local1984;
				@Pc(1958) Class32 local1958;
				if (arg3 == 5) {
					local1237 = 16;
					local1919 = Static108.method1986(arg1, arg9, arg8);
					if (local1919 != 0L) {
						local1237 = Static183.method3511(Integer.MAX_VALUE & (int) (local1919 >>> 32)).anInt5572;
					}
					if (local327 == -1 && local64.anIntArray552 == null && !local64.aBoolean435) {
						local1958 = local64.method4415(local160, local204, local151, local336, local186, arg4, null, local194, 4, arg0);
						if (Static277.aBoolean412 && local336) {
							Static292.method4404(local1958.aClass12_Sub2_2, local160 - Static23.anIntArray56[arg0] * 8, local196, local194 - Static247.anIntArray428[arg0] * 8);
						}
						local1984 = local1958.aClass14_5;
					} else {
						local1984 = new Class14_Sub1(arg7, 4, arg0, arg5, arg9, arg8, local327, local64.aBoolean441, null);
					}
					method134(arg1, arg9, arg8, local186, local1984, null, Static166.anIntArray317[arg0], 0, Static23.anIntArray56[arg0] * local1237, Static247.anIntArray428[arg0] * local1237, local271);
				} else if (arg3 == 6) {
					local1237 = 8;
					local1919 = Static108.method1986(arg1, arg9, arg8);
					if (local1919 != 0L) {
						local1237 = Static183.method3511((int) (local1919 >>> 32) & Integer.MAX_VALUE).anInt5572 / 2;
					}
					if (local327 == -1 && local64.anIntArray552 == null && !local64.aBoolean435) {
						local1958 = local64.method4415(local160, local204, local151, local336, local186, arg4, null, local194, 4, arg0 + 4);
						if (Static277.aBoolean412 && local336) {
							Static292.method4404(local1958.aClass12_Sub2_2, local160 - Static15.anIntArray36[arg0] * 8, local196, local194 - Static256.anIntArray441[arg0] * 8);
						}
						local1984 = local1958.aClass14_5;
					} else {
						local1984 = new Class14_Sub1(arg7, 4, arg0 + 4, arg5, arg9, arg8, local327, local64.aBoolean441, null);
					}
					method134(arg1, arg9, arg8, local186, local1984, null, 256, arg0, Static15.anIntArray36[arg0] * local1237, local1237 * Static256.anIntArray441[arg0], local271);
				} else if (arg3 == 7) {
					@Pc(2154) int local2154 = arg0 + 2 & 0x3;
					if (local327 == -1 && local64.anIntArray552 == null && !local64.aBoolean435) {
						@Pc(2180) Class32 local2180 = local64.method4415(local160, local204, local151, local336, local186, arg4, null, local194, 4, local2154 + 4);
						if (Static277.aBoolean412 && local336) {
							Static292.method4404(local2180.aClass12_Sub2_2, local160, local196, local194);
						}
						local380 = local2180.aClass14_5;
					} else {
						local380 = new Class14_Sub1(arg7, 4, local2154 + 4, arg5, arg9, arg8, local327, local64.aBoolean441, null);
					}
					method134(arg1, arg9, arg8, local186, local380, null, 256, local2154, 0, 0, local271);
				} else if (arg3 == 8) {
					local1237 = 8;
					local1919 = Static108.method1986(arg1, arg9, arg8);
					@Pc(2241) int local2241 = arg0 + 2 & 0x3;
					if (local1919 != 0L) {
						local1237 = Static183.method3511((int) (local1919 >>> 32) & Integer.MAX_VALUE).anInt5572 / 2;
					}
					@Pc(2351) Class14 local2351;
					if (local327 == -1 && local64.anIntArray552 == null && !local64.aBoolean435) {
						@Pc(2275) int local2275 = Static256.anIntArray441[arg0] * 8;
						@Pc(2281) int local2281 = Static15.anIntArray36[arg0] * 8;
						@Pc(2297) Class32 local2297 = local64.method4415(local160, local204, local151, local336, local186, arg4, null, local194, 4, arg0 + 4);
						if (Static277.aBoolean412 && local336) {
							Static292.method4404(local2297.aClass12_Sub2_2, local160 - local2281, local196, local194 - local2275);
						}
						local1984 = local2297.aClass14_5;
						local2297 = local64.method4415(local160, local204, local151, local336, local186, arg4, null, local194, 4, local2241 + 4);
						if (Static277.aBoolean412 && local336) {
							Static292.method4404(local2297.aClass12_Sub2_2, local160 - local2281, local196, local194 - local2275);
						}
						local2351 = local2297.aClass14_5;
					} else {
						local1984 = new Class14_Sub1(arg7, 4, arg0 + 4, arg5, arg9, arg8, local327, local64.aBoolean441, null);
						local2351 = new Class14_Sub1(arg7, 4, local2241 + 4, arg5, arg9, arg8, local327, local64.aBoolean441, null);
					}
					method134(arg1, arg9, arg8, local186, local1984, local2351, 256, arg0, Static15.anIntArray36[arg0] * local1237, Static256.anIntArray441[arg0] * local1237, local271);
				}
			}
		}
	}
}
