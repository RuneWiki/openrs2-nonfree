import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
	public static int anInt1482;

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "[Lclient!oe;")
	public static Class2_Sub16[] aClass2_Sub16Array1 = new Class2_Sub16[2048];

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIZIIIIIZLclient!rm;I)V")
	public static void method1138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) Class154 arg8, @OriginalArg(10) int arg9) {
		if (arg2 && !Static69.method2440() && (Static13.aByteArrayArrayArray2[0][arg1][arg4] & 0x2) == 0) {
			if ((Static13.aByteArrayArrayArray2[arg0][arg1][arg4] & 0x10) != 0) {
				return;
			}
			if (Static54.method979(arg0, arg4, arg1) != Static194.anInt4082) {
				return;
			}
		}
		if (Static305.anInt5900 > arg0) {
			Static305.anInt5900 = arg0;
		}
		@Pc(68) Class146 local68 = Static10.method158(arg6);
		if (Static116.aBoolean184 && local68.aBoolean309) {
			return;
		}
		@Pc(83) int local83;
		@Pc(86) int local86;
		if (arg3 == 1 || arg3 == 3) {
			local83 = local68.anInt4721;
			local86 = local68.anInt4749;
		} else {
			local83 = local68.anInt4749;
			local86 = local68.anInt4721;
		}
		@Pc(112) int local112;
		@Pc(110) int local110;
		if (arg1 + local83 > 104) {
			local110 = arg1 + 1;
			local112 = arg1;
		} else {
			local112 = arg1 + (local83 >> 1);
			local110 = arg1 + (local83 + 1 >> 1);
		}
		@Pc(144) int local144;
		@Pc(142) int local142;
		if (arg4 + local86 > 104) {
			local142 = arg4 + 1;
			local144 = arg4;
		} else {
			local142 = (local86 + 1 >> 1) + arg4;
			local144 = (local86 >> 1) + arg4;
		}
		@Pc(164) int[][] local164 = Static9.anIntArrayArrayArray7[arg9];
		@Pc(172) int local172 = (local83 << 6) + (arg1 << 7);
		@Pc(180) int local180 = (local86 << 6) + (arg4 << 7);
		@Pc(182) int local182 = 0;
		@Pc(209) int local209 = local164[local110][local142] + local164[local112][local142] + local164[local112][local144] + local164[local110][local144] >> 2;
		@Pc(218) int[][] local218;
		if (Static116.aBoolean184 && arg9 != 0) {
			local218 = Static9.anIntArrayArrayArray7[0];
			local182 = local209 - (local218[local110][local142] + local218[local112][local144] + local218[local110][local144] + local218[local112][local142] >> 2);
		}
		local218 = null;
		if (arg7) {
			local218 = Static300.anIntArrayArrayArray15[0];
		} else if (arg9 < 3) {
			local218 = Static9.anIntArrayArrayArray7[arg9 + 1];
		}
		@Pc(288) long local288 = (long) (arg1 | arg4 << 7 | arg5 << 14 | arg3 << 20 | 0x40000000);
		if (local68.anInt4747 == 0 || arg7) {
			local288 |= Long.MIN_VALUE;
		}
		if (local68.anInt4741 == 1) {
			local288 |= 0x400000L;
		}
		if (local68.aBoolean316) {
			local288 |= 0x80000000L;
		}
		if (local68.method3827()) {
			Static256.method4029(local68, arg0, arg4, 0, arg1, null, null, arg3);
		}
		local288 |= (long) arg6 << 32;
		@Pc(349) boolean local349 = !arg7 & local68.aBoolean322;
		@Pc(399) Class15 local399;
		@Pc(415) Class50 local415;
		if (arg5 == 22) {
			if (Static185.aBoolean365 || local68.anInt4747 != 0 || local68.anInt4746 == 1 || local68.aBoolean313) {
				if (local68.anInt4731 == -1 && local68.anIntArray465 == null && local68.anIntArray467 == null && !local68.aBoolean321) {
					local415 = local68.method3825(local180, arg3, local209, local172, arg2, null, 22, local218, local349, local164);
					if (Static116.aBoolean184 && local349) {
						Static266.method4179(local415.aClass93_Sub1_1, local172, local182, local180);
					}
					local399 = local415.aClass15_1;
				} else {
					local399 = new Class15_Sub4(arg6, 22, arg3, arg9, arg1, arg4, -1, local68.aBoolean319, null);
				}
				Static38.method718(arg0, arg1, arg4, local209, local399, local288, local68.aBoolean314);
				if (local68.anInt4746 == 1 && arg8 != null) {
					arg8.method3905(arg1, arg4);
				}
			}
		} else if (arg5 == 10 || arg5 == 11) {
			if (local68.anInt4731 == -1 && local68.anIntArray465 == null && local68.anIntArray467 == null && !local68.aBoolean321) {
				local415 = local68.method3825(local180, arg5 == 11 ? arg3 + 4 : arg3, local209, local172, arg2, null, 10, local218, local349, local164);
				if (Static116.aBoolean184 && local349) {
					Static266.method4179(local415.aClass93_Sub1_1, local172, local182, local180);
				}
				local399 = local415.aClass15_1;
			} else {
				local399 = new Class15_Sub4(arg6, 10, arg5 == 11 ? arg3 + 4 : arg3, arg9, arg1, arg4, -1, local68.aBoolean319, null);
			}
			if (local399 != null) {
				@Pc(550) boolean local550 = Static246.method3904(arg0, arg1, arg4, local209, local83, local86, local399, local288);
				if (local68.aBoolean311 && local550 && arg2) {
					@Pc(560) int local560 = 15;
					if (local399 instanceof Class15_Sub5) {
						local560 = ((Class15_Sub5) local399).method2336() / 4;
						if (local560 > 30) {
							local560 = 30;
						}
					}
					for (@Pc(577) int local577 = 0; local577 <= local83; local577++) {
						for (@Pc(586) int local586 = 0; local586 <= local86; local586++) {
							if (Static209.aByteArrayArrayArray18[arg0][arg1 + local577][arg4 + local586] < local560) {
								Static209.aByteArrayArrayArray18[arg0][arg1 + local577][arg4 + local586] = (byte) local560;
							}
						}
					}
				}
			}
			if (local68.anInt4746 != 0 && arg8 != null) {
				arg8.method3928(local68.aBoolean317, arg1, local86, local83, !local68.aBoolean320, arg4);
			}
		} else if (arg5 >= 12) {
			if (local68.anInt4731 == -1 && local68.anIntArray465 == null && local68.anIntArray467 == null && !local68.aBoolean321) {
				local415 = local68.method3825(local180, arg3, local209, local172, arg2, null, arg5, local218, local349, local164);
				if (Static116.aBoolean184 && local349) {
					Static266.method4179(local415.aClass93_Sub1_1, local172, local182, local180);
				}
				local399 = local415.aClass15_1;
			} else {
				local399 = new Class15_Sub4(arg6, arg5, arg3, arg9, arg1, arg4, -1, local68.aBoolean319, null);
			}
			Static246.method3904(arg0, arg1, arg4, local209, 1, 1, local399, local288);
			if (arg2 && arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0 && local68.anInt4738 != 0) {
				Static228.anIntArrayArrayArray14[arg0][arg1][arg4] |= 0x4;
			}
			if (local68.anInt4746 != 0 && arg8 != null) {
				arg8.method3928(local68.aBoolean317, arg1, local86, local83, !local68.aBoolean320, arg4);
			}
		} else if (arg5 == 0) {
			if (local68.anInt4731 == -1 && local68.anIntArray465 == null && local68.anIntArray467 == null && !local68.aBoolean321) {
				local415 = local68.method3825(local180, arg3, local209, local172, arg2, null, 0, local218, local349, local164);
				if (Static116.aBoolean184 && local349) {
					Static266.method4179(local415.aClass93_Sub1_1, local172, local182, local180);
				}
				local399 = local415.aClass15_1;
			} else {
				local399 = new Class15_Sub4(arg6, 0, arg3, arg9, arg1, arg4, -1, local68.aBoolean319, null);
			}
			Static249.method3914(arg0, arg1, arg4, local209, local399, null, Static57.anIntArray124[arg3], 0, local288);
			if (arg2) {
				if (arg3 == 0) {
					if (local68.aBoolean311) {
						Static209.aByteArrayArrayArray18[arg0][arg1][arg4] = 50;
						Static209.aByteArrayArrayArray18[arg0][arg1][arg4 + 1] = 50;
					}
					if (local68.anInt4738 == 1) {
						Static228.anIntArrayArrayArray14[arg0][arg1][arg4] |= 0x1;
					}
				} else if (arg3 == 1) {
					if (local68.aBoolean311) {
						Static209.aByteArrayArrayArray18[arg0][arg1][arg4 + 1] = 50;
						Static209.aByteArrayArrayArray18[arg0][arg1 + 1][arg4 + 1] = 50;
					}
					if (local68.anInt4738 == 1) {
						Static228.anIntArrayArrayArray14[arg0][arg1][arg4 + 1] |= 0x2;
					}
				} else if (arg3 == 2) {
					if (local68.aBoolean311) {
						Static209.aByteArrayArrayArray18[arg0][arg1 + 1][arg4] = 50;
						Static209.aByteArrayArrayArray18[arg0][arg1 + 1][arg4 + 1] = 50;
					}
					if (local68.anInt4738 == 1) {
						Static228.anIntArrayArrayArray14[arg0][arg1 + 1][arg4] |= 0x1;
					}
				} else if (arg3 == 3) {
					if (local68.aBoolean311) {
						Static209.aByteArrayArrayArray18[arg0][arg1][arg4] = 50;
						Static209.aByteArrayArrayArray18[arg0][arg1 + 1][arg4] = 50;
					}
					if (local68.anInt4738 == 1) {
						Static228.anIntArrayArrayArray14[arg0][arg1][arg4] |= 0x2;
					}
				}
			}
			if (local68.anInt4746 != 0 && arg8 != null) {
				arg8.method3927(arg5, local68.aBoolean317, arg1, !local68.aBoolean320, arg3, arg4);
			}
			if (local68.anInt4753 != 16) {
				Static63.method1182(arg0, arg1, arg4, local68.anInt4753);
			}
		} else if (arg5 == 1) {
			if (local68.anInt4731 == -1 && local68.anIntArray465 == null && local68.anIntArray467 == null && !local68.aBoolean321) {
				local415 = local68.method3825(local180, arg3, local209, local172, arg2, null, 1, local218, local349, local164);
				if (Static116.aBoolean184 && local349) {
					Static266.method4179(local415.aClass93_Sub1_1, local172, local182, local180);
				}
				local399 = local415.aClass15_1;
			} else {
				local399 = new Class15_Sub4(arg6, 1, arg3, arg9, arg1, arg4, -1, local68.aBoolean319, null);
			}
			Static249.method3914(arg0, arg1, arg4, local209, local399, null, Static2.anIntArray12[arg3], 0, local288);
			if (local68.aBoolean311 && arg2) {
				if (arg3 == 0) {
					Static209.aByteArrayArrayArray18[arg0][arg1][arg4 + 1] = 50;
				} else if (arg3 == 1) {
					Static209.aByteArrayArrayArray18[arg0][arg1 + 1][arg4 + 1] = 50;
				} else if (arg3 == 2) {
					Static209.aByteArrayArrayArray18[arg0][arg1 + 1][arg4] = 50;
				} else if (arg3 == 3) {
					Static209.aByteArrayArrayArray18[arg0][arg1][arg4] = 50;
				}
			}
			if (local68.anInt4746 != 0 && arg8 != null) {
				arg8.method3927(arg5, local68.aBoolean317, arg1, !local68.aBoolean320, arg3, arg4);
			}
		} else {
			@Pc(1282) int local1282;
			if (arg5 == 2) {
				local1282 = arg3 + 1 & 0x3;
				@Pc(1330) Class15 local1330;
				@Pc(1316) Class15 local1316;
				if (local68.anInt4731 == -1 && local68.anIntArray465 == null && local68.anIntArray467 == null && !local68.aBoolean321) {
					@Pc(1348) Class50 local1348 = local68.method3825(local180, arg3 + 4, local209, local172, arg2, null, 2, local218, local349, local164);
					if (Static116.aBoolean184 && local349) {
						Static266.method4179(local1348.aClass93_Sub1_1, local172, local182, local180);
					}
					local1316 = local1348.aClass15_1;
					local1348 = local68.method3825(local180, local1282, local209, local172, arg2, null, 2, local218, local349, local164);
					if (Static116.aBoolean184 && local349) {
						Static266.method4179(local1348.aClass93_Sub1_1, local172, local182, local180);
					}
					local1330 = local1348.aClass15_1;
				} else {
					local1316 = new Class15_Sub4(arg6, 2, arg3 + 4, arg9, arg1, arg4, -1, local68.aBoolean319, null);
					local1330 = new Class15_Sub4(arg6, 2, local1282, arg9, arg1, arg4, -1, local68.aBoolean319, null);
				}
				Static249.method3914(arg0, arg1, arg4, local209, local1316, local1330, Static57.anIntArray124[arg3], Static57.anIntArray124[local1282], local288);
				if (local68.anInt4738 == 1 && arg2) {
					if (arg3 == 0) {
						Static228.anIntArrayArrayArray14[arg0][arg1][arg4] |= 0x1;
						Static228.anIntArrayArrayArray14[arg0][arg1][arg4 + 1] |= 0x2;
					} else if (arg3 == 1) {
						Static228.anIntArrayArrayArray14[arg0][arg1][arg4 + 1] |= 0x2;
						Static228.anIntArrayArrayArray14[arg0][arg1 + 1][arg4] |= 0x1;
					} else if (arg3 == 2) {
						Static228.anIntArrayArrayArray14[arg0][arg1 + 1][arg4] |= 0x1;
						Static228.anIntArrayArrayArray14[arg0][arg1][arg4] |= 0x2;
					} else if (arg3 == 3) {
						Static228.anIntArrayArrayArray14[arg0][arg1][arg4] |= 0x2;
						Static228.anIntArrayArrayArray14[arg0][arg1][arg4] |= 0x1;
					}
				}
				if (local68.anInt4746 != 0 && arg8 != null) {
					arg8.method3927(arg5, local68.aBoolean317, arg1, !local68.aBoolean320, arg3, arg4);
				}
				if (local68.anInt4753 != 16) {
					Static63.method1182(arg0, arg1, arg4, local68.anInt4753);
				}
			} else if (arg5 == 3) {
				if (local68.anInt4731 == -1 && local68.anIntArray465 == null && local68.anIntArray467 == null && !local68.aBoolean321) {
					local415 = local68.method3825(local180, arg3, local209, local172, arg2, null, 3, local218, local349, local164);
					if (Static116.aBoolean184 && local349) {
						Static266.method4179(local415.aClass93_Sub1_1, local172, local182, local180);
					}
					local399 = local415.aClass15_1;
				} else {
					local399 = new Class15_Sub4(arg6, 3, arg3, arg9, arg1, arg4, -1, local68.aBoolean319, null);
				}
				Static249.method3914(arg0, arg1, arg4, local209, local399, null, Static2.anIntArray12[arg3], 0, local288);
				if (local68.aBoolean311 && arg2) {
					if (arg3 == 0) {
						Static209.aByteArrayArrayArray18[arg0][arg1][arg4 + 1] = 50;
					} else if (arg3 == 1) {
						Static209.aByteArrayArrayArray18[arg0][arg1 + 1][arg4 + 1] = 50;
					} else if (arg3 == 2) {
						Static209.aByteArrayArrayArray18[arg0][arg1 + 1][arg4] = 50;
					} else if (arg3 == 3) {
						Static209.aByteArrayArrayArray18[arg0][arg1][arg4] = 50;
					}
				}
				if (local68.anInt4746 != 0 && arg8 != null) {
					arg8.method3927(arg5, local68.aBoolean317, arg1, !local68.aBoolean320, arg3, arg4);
				}
			} else if (arg5 == 9) {
				if (local68.anInt4731 == -1 && local68.anIntArray465 == null && local68.anIntArray467 == null && !local68.aBoolean321) {
					local415 = local68.method3825(local180, arg3, local209, local172, arg2, null, arg5, local218, local349, local164);
					if (Static116.aBoolean184 && local349) {
						Static266.method4179(local415.aClass93_Sub1_1, local172, local182, local180);
					}
					local399 = local415.aClass15_1;
				} else {
					local399 = new Class15_Sub4(arg6, arg5, arg3, arg9, arg1, arg4, -1, local68.aBoolean319, null);
				}
				Static246.method3904(arg0, arg1, arg4, local209, 1, 1, local399, local288);
				if (local68.anInt4746 != 0 && arg8 != null) {
					arg8.method3928(local68.aBoolean317, arg1, local86, local83, !local68.aBoolean320, arg4);
				}
				if (local68.anInt4753 != 16) {
					Static63.method1182(arg0, arg1, arg4, local68.anInt4753);
				}
			} else if (arg5 == 4) {
				if (local68.anInt4731 == -1 && local68.anIntArray465 == null && local68.anIntArray467 == null && !local68.aBoolean321) {
					local415 = local68.method3825(local180, arg3, local209, local172, arg2, null, 4, local218, local349, local164);
					if (Static116.aBoolean184 && local349) {
						Static266.method4179(local415.aClass93_Sub1_1, local172, local182, local180);
					}
					local399 = local415.aClass15_1;
				} else {
					local399 = new Class15_Sub4(arg6, 4, arg3, arg9, arg1, arg4, -1, local68.aBoolean319, null);
				}
				Static33.method648(arg0, arg1, arg4, local209, local399, null, Static57.anIntArray124[arg3], 0, 0, 0, local288);
			} else {
				@Pc(1975) long local1975;
				@Pc(2052) Class15 local2052;
				@Pc(2024) Class50 local2024;
				if (arg5 == 5) {
					local1282 = 16;
					local1975 = Static160.method4114(arg0, arg1, arg4);
					if (local1975 != 0L) {
						local1282 = Static10.method158(Integer.MAX_VALUE & (int) (local1975 >>> 32)).anInt4753;
					}
					if (local68.anInt4731 == -1 && local68.anIntArray465 == null && local68.anIntArray467 == null && !local68.aBoolean321) {
						local2024 = local68.method3825(local180, arg3, local209, local172, arg2, null, 4, local218, local349, local164);
						if (Static116.aBoolean184 && local349) {
							Static266.method4179(local2024.aClass93_Sub1_1, local172 - Static118.anIntArray233[arg3] * 8, local182, local180 - Static17.anIntArray50[arg3] * 8);
						}
						local2052 = local2024.aClass15_1;
					} else {
						local2052 = new Class15_Sub4(arg6, 4, arg3, arg9, arg1, arg4, -1, local68.aBoolean319, null);
					}
					Static33.method648(arg0, arg1, arg4, local209, local2052, null, Static57.anIntArray124[arg3], 0, local1282 * Static118.anIntArray233[arg3], Static17.anIntArray50[arg3] * local1282, local288);
				} else if (arg5 == 6) {
					local1282 = 8;
					local1975 = Static160.method4114(arg0, arg1, arg4);
					if (local1975 != 0L) {
						local1282 = Static10.method158(Integer.MAX_VALUE & (int) (local1975 >>> 32)).anInt4753 / 2;
					}
					if (local68.anInt4731 == -1 && local68.anIntArray465 == null && local68.anIntArray467 == null && !local68.aBoolean321) {
						local2024 = local68.method3825(local180, arg3 + 4, local209, local172, arg2, null, 4, local218, local349, local164);
						if (Static116.aBoolean184 && local349) {
							Static266.method4179(local2024.aClass93_Sub1_1, local172 - Static52.anIntArray103[arg3] * 8, local182, local180 - Static271.anIntArray520[arg3] * 8);
						}
						local2052 = local2024.aClass15_1;
					} else {
						local2052 = new Class15_Sub4(arg6, 4, arg3 + 4, arg9, arg1, arg4, -1, local68.aBoolean319, null);
					}
					Static33.method648(arg0, arg1, arg4, local209, local2052, null, 256, arg3, Static52.anIntArray103[arg3] * local1282, Static271.anIntArray520[arg3] * local1282, local288);
				} else if (arg5 == 7) {
					@Pc(2229) int local2229 = arg3 + 2 & 0x3;
					if (local68.anInt4731 == -1 && local68.anIntArray465 == null && local68.anIntArray467 == null && !local68.aBoolean321) {
						@Pc(2278) Class50 local2278 = local68.method3825(local180, local2229 + 4, local209, local172, arg2, null, 4, local218, local349, local164);
						if (Static116.aBoolean184 && local349) {
							Static266.method4179(local2278.aClass93_Sub1_1, local172, local182, local180);
						}
						local399 = local2278.aClass15_1;
					} else {
						local399 = new Class15_Sub4(arg6, 4, local2229 + 4, arg9, arg1, arg4, -1, local68.aBoolean319, null);
					}
					Static33.method648(arg0, arg1, arg4, local209, local399, null, 256, local2229, 0, 0, local288);
				} else if (arg5 == 8) {
					local1282 = 8;
					local1975 = Static160.method4114(arg0, arg1, arg4);
					if (local1975 != 0L) {
						local1282 = Static10.method158((int) (local1975 >>> 32) & Integer.MAX_VALUE).anInt4753 / 2;
					}
					@Pc(2342) int local2342 = arg3 + 2 & 0x3;
					@Pc(2436) Class15 local2436;
					if (local68.anInt4731 == -1 && local68.anIntArray465 == null && local68.anIntArray467 == null && !local68.aBoolean321) {
						@Pc(2361) int local2361 = Static271.anIntArray520[arg3] * 8;
						@Pc(2367) int local2367 = Static52.anIntArray103[arg3] * 8;
						@Pc(2383) Class50 local2383 = local68.method3825(local180, arg3 + 4, local209, local172, arg2, null, 4, local218, local349, local164);
						if (Static116.aBoolean184 && local349) {
							Static266.method4179(local2383.aClass93_Sub1_1, local172 - local2367, local182, local180 - local2361);
						}
						local2052 = local2383.aClass15_1;
						local2383 = local68.method3825(local180, local2342 + 4, local209, local172, arg2, null, 4, local218, local349, local164);
						if (Static116.aBoolean184 && local349) {
							Static266.method4179(local2383.aClass93_Sub1_1, local172 - local2367, local182, local180 - local2361);
						}
						local2436 = local2383.aClass15_1;
					} else {
						local2052 = new Class15_Sub4(arg6, 4, arg3 + 4, arg9, arg1, arg4, -1, local68.aBoolean319, null);
						local2436 = new Class15_Sub4(arg6, 4, local2342 + 4, arg9, arg1, arg4, -1, local68.aBoolean319, null);
					}
					Static33.method648(arg0, arg1, arg4, local209, local2052, local2436, 256, arg3, local1282 * Static52.anIntArray103[arg3], Static271.anIntArray520[arg3] * local1282, local288);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZLclient!g;IIZ)V")
	public static void method1140(@OriginalArg(1) Class56 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) int local8 = arg0.anInt2031;
		if (arg0.aByte7 == 0) {
			arg0.anInt2031 = arg0.anInt2073;
		} else if (arg0.aByte7 == 1) {
			arg0.anInt2031 = arg2 - arg0.anInt2073;
		} else if (arg0.aByte7 == 2) {
			arg0.anInt2031 = arg0.anInt2073 * arg2 >> 14;
		} else if (arg0.aByte7 == 3) {
			if (arg0.anInt2092 == 2) {
				arg0.anInt2031 = arg0.anInt2073 * 32 + arg0.anInt2062 * (arg0.anInt2073 - 1);
			} else if (arg0.anInt2092 == 7) {
				arg0.anInt2031 = (arg0.anInt2073 - 1) * arg0.anInt2062 + arg0.anInt2073 * 12;
			}
		}
		@Pc(97) int local97 = arg0.anInt2057;
		if (arg0.aByte6 == 0) {
			arg0.anInt2057 = arg0.anInt2034;
		} else if (arg0.aByte6 == 1) {
			arg0.anInt2057 = arg1 - arg0.anInt2034;
		} else if (arg0.aByte6 == 2) {
			arg0.anInt2057 = arg1 * arg0.anInt2034 >> 14;
		} else if (arg0.aByte6 == 3) {
			if (arg0.anInt2092 == 2) {
				arg0.anInt2057 = arg0.anInt2034 * 32 + (arg0.anInt2034 - 1) * arg0.anInt2045;
			} else if (arg0.anInt2092 == 7) {
				arg0.anInt2057 = arg0.anInt2034 * 115 + (arg0.anInt2034 - 1) * arg0.anInt2045;
			}
		}
		if (arg0.aByte6 == 4) {
			arg0.anInt2057 = arg0.anInt2031 * arg0.anInt2114 / arg0.anInt2054;
		}
		if (arg0.aByte7 == 4) {
			arg0.anInt2031 = arg0.anInt2054 * arg0.anInt2057 / arg0.anInt2114;
		}
		if (Static199.aBoolean295 && (Static42.method804(arg0).anInt419 != 0 || arg0.anInt2092 == 0)) {
			if (arg0.anInt2031 < 5 && arg0.anInt2057 < 5) {
				arg0.anInt2057 = 5;
				arg0.anInt2031 = 5;
			} else {
				if (arg0.anInt2057 <= 0) {
					arg0.anInt2057 = 5;
				}
				if (arg0.anInt2031 <= 0) {
					arg0.anInt2031 = 5;
				}
			}
		}
		if (arg0.anInt2074 == 1337) {
			Static29.aClass56_4 = arg0;
		}
		if (arg3 && arg0.anObjectArray20 != null && (arg0.anInt2057 != local97 || arg0.anInt2031 != local8)) {
			@Pc(309) Class2_Sub12 local309 = new Class2_Sub12();
			local309.aClass56_6 = arg0;
			local309.anObjectArray1 = arg0.anObjectArray20;
			Static145.aClass44_18.method1358(local309);
		}
	}
}
