import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "Lclient!ea;")
	public static Class43 aClass43_8;

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "Lclient!kb;")
	public static Class83 aClass83_191;

	@OriginalMember(owner = "client!ul", name = "g", descriptor = "[S")
	public static short[] aShortArray89;

	@OriginalMember(owner = "client!ul", name = "r", descriptor = "Lclient!kb;")
	public static Class83 aClass83_192;

	@OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
	public static int anInt5852 = 0;

	@OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
	public static int anInt5854 = 0;

	@OriginalMember(owner = "client!ul", name = "l", descriptor = "Z")
	public static boolean aBoolean310 = false;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIILclient!de;IIZZIII)V")
	public static void method4541(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class36 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg5 && !Static40.method1450() && (Static126.aByteArrayArrayArray24[0][arg4][arg9] & 0x2) == 0) {
			if ((Static126.aByteArrayArrayArray24[arg0][arg4][arg9] & 0x10) != 0) {
				return;
			}
			if (Static45.method982(arg4, arg0, arg9) != Static228.anInt5022) {
				return;
			}
		}
		if (Static90.anInt2102 > arg0) {
			Static90.anInt2102 = arg0;
		}
		@Pc(62) Class30 local62 = Static268.method4511(arg8);
		if (Static296.aBoolean335 && local62.aBoolean53) {
			return;
		}
		@Pc(85) int local85;
		@Pc(82) int local82;
		if (arg3 == 1 || arg3 == 3) {
			local82 = local62.anInt848;
			local85 = local62.anInt863;
		} else {
			local82 = local62.anInt863;
			local85 = local62.anInt848;
		}
		@Pc(105) int local105;
		@Pc(113) int local113;
		if (arg4 + local85 <= 104) {
			local105 = (local85 >> 1) + arg4;
			local113 = arg4 + (local85 + 1 >> 1);
		} else {
			local105 = arg4;
			local113 = arg4 + 1;
		}
		@Pc(125) int[][] local125 = Static287.anIntArrayArrayArray18[arg1];
		@Pc(139) int local139;
		@Pc(147) int local147;
		if (arg9 + local82 <= 104) {
			local139 = arg9 + (local82 >> 1);
			local147 = (local82 + 1 >> 1) + arg9;
		} else {
			local139 = arg9;
			local147 = arg9 + 1;
		}
		@Pc(182) int local182 = local125[local105][local139] + local125[local113][local139] + local125[local105][local147] + local125[local113][local147] >> 2;
		@Pc(190) int local190 = (local82 << 6) + (arg9 << 7);
		@Pc(192) int local192 = 0;
		@Pc(202) int[][] local202;
		if (Static296.aBoolean335 && arg1 != 0) {
			local202 = Static287.anIntArrayArrayArray18[0];
			local192 = local182 - (local202[local113][local147] + local202[local105][local147] + local202[local105][local139] + local202[local113][local139] >> 2);
		}
		@Pc(240) int local240 = (local85 << 6) + (arg4 << 7);
		local202 = null;
		@Pc(260) long local260 = (long) (arg3 << 20 | arg4 | arg9 << 7 | arg7 << 14 | 0x40000000);
		if (arg6) {
			local202 = Static113.anIntArrayArrayArray10[0];
		} else if (arg1 < 3) {
			local202 = Static287.anIntArrayArrayArray18[arg1 + 1];
		}
		if (local62.anInt877 == 0 || arg6) {
			local260 |= Long.MIN_VALUE;
		}
		if (local62.anInt878 == 1) {
			local260 |= 0x400000L;
		}
		if (local62.aBoolean49) {
			local260 |= 0x80000000L;
		}
		if (local62.method690()) {
			Static283.method4671(arg4, null, arg0, local62, arg9, arg3, null);
		}
		@Pc(333) boolean local333 = local62.aBoolean54 & !arg6;
		local260 |= (long) arg8 << 32;
		@Pc(385) Class25 local385;
		@Pc(401) Class98 local401;
		if (arg7 == 22) {
			if (Static135.aBoolean157 || local62.anInt877 != 0 || local62.anInt852 == 1 || local62.aBoolean58) {
				if (local62.anInt876 == -1 && local62.anIntArray94 == null && local62.anIntArray93 == null && !local62.aBoolean60) {
					local401 = local62.method682(null, local125, local202, arg3, local190, arg5, local240, local182, local333, 22);
					if (Static296.aBoolean335 && local333) {
						Static124.method2109(local401.aClass7_Sub1_3, local240, local192, local190);
					}
					local385 = local401.aClass25_1;
				} else {
					local385 = new Class25_Sub4(arg8, 22, arg3, arg1, arg4, arg9, -1, local62.aBoolean52, null);
				}
				Static73.method1363(arg0, arg4, arg9, local182, local385, local260, local62.aBoolean61);
				if (local62.anInt852 == 1 && arg2 != null) {
					arg2.method950(arg9, arg4);
				}
			}
		} else if (arg7 == 10 || arg7 == 11) {
			if (local62.anInt876 == -1 && local62.anIntArray94 == null && local62.anIntArray93 == null && !local62.aBoolean60) {
				local401 = local62.method682(null, local125, local202, arg7 == 11 ? arg3 + 4 : arg3, local190, arg5, local240, local182, local333, 10);
				if (Static296.aBoolean335 && local333) {
					Static124.method2109(local401.aClass7_Sub1_3, local240, local192, local190);
				}
				local385 = local401.aClass25_1;
			} else {
				local385 = new Class25_Sub4(arg8, 10, arg7 == 11 ? arg3 + 4 : arg3, arg1, arg4, arg9, -1, local62.aBoolean52, null);
			}
			if (local385 != null) {
				@Pc(537) boolean local537 = Static218.method3880(arg0, arg4, arg9, local182, local85, local82, local385, local260);
				if (local62.aBoolean51 && local537 && arg5) {
					@Pc(546) int local546 = 15;
					if (local385 instanceof Class25_Sub2) {
						local546 = ((Class25_Sub2) local385).method3476() / 4;
						if (local546 > 30) {
							local546 = 30;
						}
					}
					for (@Pc(565) int local565 = 0; local565 <= local85; local565++) {
						for (@Pc(570) int local570 = 0; local570 <= local82; local570++) {
							if (local546 > Static271.aByteArrayArrayArray52[arg0][arg4 + local565][arg9 + local570]) {
								Static271.aByteArrayArrayArray52[arg0][local565 + arg4][arg9 + local570] = (byte) local546;
							}
						}
					}
				}
			}
			if (local62.anInt852 != 0 && arg2 != null) {
				arg2.method959(local82, arg4, local62.aBoolean56, arg9, !local62.aBoolean48, local85);
			}
		} else if (arg7 >= 12) {
			if (local62.anInt876 == -1 && local62.anIntArray94 == null && local62.anIntArray93 == null && !local62.aBoolean60) {
				local401 = local62.method682(null, local125, local202, arg3, local190, arg5, local240, local182, local333, arg7);
				if (Static296.aBoolean335 && local333) {
					Static124.method2109(local401.aClass7_Sub1_3, local240, local192, local190);
				}
				local385 = local401.aClass25_1;
			} else {
				local385 = new Class25_Sub4(arg8, arg7, arg3, arg1, arg4, arg9, -1, local62.aBoolean52, null);
			}
			Static218.method3880(arg0, arg4, arg9, local182, 1, 1, local385, local260);
			if (arg5 && arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg0 > 0 && local62.anInt843 != 0) {
				Static64.anIntArrayArrayArray5[arg0][arg4][arg9] |= 0x4;
			}
			if (local62.anInt852 != 0 && arg2 != null) {
				arg2.method959(local82, arg4, local62.aBoolean56, arg9, !local62.aBoolean48, local85);
			}
		} else if (arg7 == 0) {
			if (local62.anInt876 == -1 && local62.anIntArray94 == null && local62.anIntArray93 == null && !local62.aBoolean60) {
				local401 = local62.method682(null, local125, local202, arg3, local190, arg5, local240, local182, local333, 0);
				if (Static296.aBoolean335 && local333) {
					Static124.method2109(local401.aClass7_Sub1_3, local240, local192, local190);
				}
				local385 = local401.aClass25_1;
			} else {
				local385 = new Class25_Sub4(arg8, 0, arg3, arg1, arg4, arg9, -1, local62.aBoolean52, null);
			}
			Static121.method2064(arg0, arg4, arg9, local182, local385, null, Static165.anIntArray341[arg3], 0, local260);
			if (arg5) {
				if (arg3 == 0) {
					if (local62.aBoolean51) {
						Static271.aByteArrayArrayArray52[arg0][arg4][arg9] = 50;
						Static271.aByteArrayArrayArray52[arg0][arg4][arg9 + 1] = 50;
					}
					if (local62.anInt843 == 1) {
						Static64.anIntArrayArrayArray5[arg0][arg4][arg9] |= 0x1;
					}
				} else if (arg3 == 1) {
					if (local62.aBoolean51) {
						Static271.aByteArrayArrayArray52[arg0][arg4][arg9 + 1] = 50;
						Static271.aByteArrayArrayArray52[arg0][arg4 + 1][arg9 + 1] = 50;
					}
					if (local62.anInt843 == 1) {
						Static64.anIntArrayArrayArray5[arg0][arg4][arg9 + 1] |= 0x2;
					}
				} else if (arg3 == 2) {
					if (local62.aBoolean51) {
						Static271.aByteArrayArrayArray52[arg0][arg4 + 1][arg9] = 50;
						Static271.aByteArrayArrayArray52[arg0][arg4 + 1][arg9 + 1] = 50;
					}
					if (local62.anInt843 == 1) {
						Static64.anIntArrayArrayArray5[arg0][arg4 + 1][arg9] |= 0x1;
					}
				} else if (arg3 == 3) {
					if (local62.aBoolean51) {
						Static271.aByteArrayArrayArray52[arg0][arg4][arg9] = 50;
						Static271.aByteArrayArrayArray52[arg0][arg4 + 1][arg9] = 50;
					}
					if (local62.anInt843 == 1) {
						Static64.anIntArrayArrayArray5[arg0][arg4][arg9] |= 0x2;
					}
				}
			}
			if (local62.anInt852 != 0 && arg2 != null) {
				arg2.method948(local62.aBoolean56, arg3, arg9, arg7, !local62.aBoolean48, arg4);
			}
			if (local62.anInt825 != 16) {
				Static256.method4334(arg0, arg4, arg9, local62.anInt825);
			}
		} else if (arg7 == 1) {
			if (local62.anInt876 == -1 && local62.anIntArray94 == null && local62.anIntArray93 == null && !local62.aBoolean60) {
				local401 = local62.method682(null, local125, local202, arg3, local190, arg5, local240, local182, local333, 1);
				if (Static296.aBoolean335 && local333) {
					Static124.method2109(local401.aClass7_Sub1_3, local240, local192, local190);
				}
				local385 = local401.aClass25_1;
			} else {
				local385 = new Class25_Sub4(arg8, 1, arg3, arg1, arg4, arg9, -1, local62.aBoolean52, null);
			}
			Static121.method2064(arg0, arg4, arg9, local182, local385, null, Static43.anIntArray117[arg3], 0, local260);
			if (local62.aBoolean51 && arg5) {
				if (arg3 == 0) {
					Static271.aByteArrayArrayArray52[arg0][arg4][arg9 + 1] = 50;
				} else if (arg3 == 1) {
					Static271.aByteArrayArrayArray52[arg0][arg4 + 1][arg9 + 1] = 50;
				} else if (arg3 == 2) {
					Static271.aByteArrayArrayArray52[arg0][arg4 + 1][arg9] = 50;
				} else if (arg3 == 3) {
					Static271.aByteArrayArrayArray52[arg0][arg4][arg9] = 50;
				}
			}
			if (local62.anInt852 != 0 && arg2 != null) {
				arg2.method948(local62.aBoolean56, arg3, arg9, arg7, !local62.aBoolean48, arg4);
			}
		} else {
			@Pc(1274) int local1274;
			if (arg7 == 2) {
				local1274 = arg3 + 1 & 0x3;
				@Pc(1317) Class25 local1317;
				@Pc(1344) Class25 local1344;
				if (local62.anInt876 == -1 && local62.anIntArray94 == null && local62.anIntArray93 == null && !local62.aBoolean60) {
					@Pc(1304) Class98 local1304 = local62.method682(null, local125, local202, arg3 + 4, local190, arg5, local240, local182, local333, 2);
					if (Static296.aBoolean335 && local333) {
						Static124.method2109(local1304.aClass7_Sub1_3, local240, local192, local190);
					}
					local1317 = local1304.aClass25_1;
					local1304 = local62.method682(null, local125, local202, local1274, local190, arg5, local240, local182, local333, 2);
					if (Static296.aBoolean335 && local333) {
						Static124.method2109(local1304.aClass7_Sub1_3, local240, local192, local190);
					}
					local1344 = local1304.aClass25_1;
				} else {
					local1317 = new Class25_Sub4(arg8, 2, arg3 + 4, arg1, arg4, arg9, -1, local62.aBoolean52, null);
					local1344 = new Class25_Sub4(arg8, 2, local1274, arg1, arg4, arg9, -1, local62.aBoolean52, null);
				}
				Static121.method2064(arg0, arg4, arg9, local182, local1317, local1344, Static165.anIntArray341[arg3], Static165.anIntArray341[local1274], local260);
				if (local62.anInt843 == 1 && arg5) {
					if (arg3 == 0) {
						Static64.anIntArrayArrayArray5[arg0][arg4][arg9] |= 0x1;
						Static64.anIntArrayArrayArray5[arg0][arg4][arg9 + 1] |= 0x2;
					} else if (arg3 == 1) {
						Static64.anIntArrayArrayArray5[arg0][arg4][arg9 + 1] |= 0x2;
						Static64.anIntArrayArrayArray5[arg0][arg4 + 1][arg9] |= 0x1;
					} else if (arg3 == 2) {
						Static64.anIntArrayArrayArray5[arg0][arg4 + 1][arg9] |= 0x1;
						Static64.anIntArrayArrayArray5[arg0][arg4][arg9] |= 0x2;
					} else if (arg3 == 3) {
						Static64.anIntArrayArrayArray5[arg0][arg4][arg9] |= 0x2;
						Static64.anIntArrayArrayArray5[arg0][arg4][arg9] |= 0x1;
					}
				}
				if (local62.anInt852 != 0 && arg2 != null) {
					arg2.method948(local62.aBoolean56, arg3, arg9, arg7, !local62.aBoolean48, arg4);
				}
				if (local62.anInt825 != 16) {
					Static256.method4334(arg0, arg4, arg9, local62.anInt825);
				}
			} else if (arg7 == 3) {
				if (local62.anInt876 == -1 && local62.anIntArray94 == null && local62.anIntArray93 == null && !local62.aBoolean60) {
					local401 = local62.method682(null, local125, local202, arg3, local190, arg5, local240, local182, local333, 3);
					if (Static296.aBoolean335 && local333) {
						Static124.method2109(local401.aClass7_Sub1_3, local240, local192, local190);
					}
					local385 = local401.aClass25_1;
				} else {
					local385 = new Class25_Sub4(arg8, 3, arg3, arg1, arg4, arg9, -1, local62.aBoolean52, null);
				}
				Static121.method2064(arg0, arg4, arg9, local182, local385, null, Static43.anIntArray117[arg3], 0, local260);
				if (local62.aBoolean51 && arg5) {
					if (arg3 == 0) {
						Static271.aByteArrayArrayArray52[arg0][arg4][arg9 + 1] = 50;
					} else if (arg3 == 1) {
						Static271.aByteArrayArrayArray52[arg0][arg4 + 1][arg9 + 1] = 50;
					} else if (arg3 == 2) {
						Static271.aByteArrayArrayArray52[arg0][arg4 + 1][arg9] = 50;
					} else if (arg3 == 3) {
						Static271.aByteArrayArrayArray52[arg0][arg4][arg9] = 50;
					}
				}
				if (local62.anInt852 != 0 && arg2 != null) {
					arg2.method948(local62.aBoolean56, arg3, arg9, arg7, !local62.aBoolean48, arg4);
				}
			} else if (arg7 == 9) {
				if (local62.anInt876 == -1 && local62.anIntArray94 == null && local62.anIntArray93 == null && !local62.aBoolean60) {
					local401 = local62.method682(null, local125, local202, arg3, local190, arg5, local240, local182, local333, arg7);
					if (Static296.aBoolean335 && local333) {
						Static124.method2109(local401.aClass7_Sub1_3, local240, local192, local190);
					}
					local385 = local401.aClass25_1;
				} else {
					local385 = new Class25_Sub4(arg8, arg7, arg3, arg1, arg4, arg9, -1, local62.aBoolean52, null);
				}
				Static218.method3880(arg0, arg4, arg9, local182, 1, 1, local385, local260);
				if (local62.anInt852 != 0 && arg2 != null) {
					arg2.method959(local82, arg4, local62.aBoolean56, arg9, !local62.aBoolean48, local85);
				}
				if (local62.anInt825 != 16) {
					Static256.method4334(arg0, arg4, arg9, local62.anInt825);
				}
			} else if (arg7 == 4) {
				if (local62.anInt876 == -1 && local62.anIntArray94 == null && local62.anIntArray93 == null && !local62.aBoolean60) {
					local401 = local62.method682(null, local125, local202, arg3, local190, arg5, local240, local182, local333, 4);
					if (Static296.aBoolean335 && local333) {
						Static124.method2109(local401.aClass7_Sub1_3, local240, local192, local190);
					}
					local385 = local401.aClass25_1;
				} else {
					local385 = new Class25_Sub4(arg8, 4, arg3, arg1, arg4, arg9, -1, local62.aBoolean52, null);
				}
				Static18.method377(arg0, arg4, arg9, local182, local385, null, Static165.anIntArray341[arg3], 0, 0, 0, local260);
			} else {
				@Pc(1966) long local1966;
				@Pc(2013) Class25 local2013;
				@Pc(2029) Class98 local2029;
				if (arg7 == 5) {
					local1274 = 16;
					local1966 = Static172.method3180(arg0, arg4, arg9);
					if (local1966 != 0L) {
						local1274 = Static268.method4511((int) (local1966 >>> 32) & Integer.MAX_VALUE).anInt825;
					}
					if (local62.anInt876 == -1 && local62.anIntArray94 == null && local62.anIntArray93 == null && !local62.aBoolean60) {
						local2029 = local62.method682(null, local125, local202, arg3, local190, arg5, local240, local182, local333, 4);
						if (Static296.aBoolean335 && local333) {
							Static124.method2109(local2029.aClass7_Sub1_3, local240 - Static105.anIntArray606[arg3] * 8, local192, local190 - Static134.anIntArray273[arg3] * 8);
						}
						local2013 = local2029.aClass25_1;
					} else {
						local2013 = new Class25_Sub4(arg8, 4, arg3, arg1, arg4, arg9, -1, local62.aBoolean52, null);
					}
					Static18.method377(arg0, arg4, arg9, local182, local2013, null, Static165.anIntArray341[arg3], 0, Static105.anIntArray606[arg3] * local1274, Static134.anIntArray273[arg3] * local1274, local260);
				} else if (arg7 == 6) {
					local1966 = Static172.method3180(arg0, arg4, arg9);
					local1274 = 8;
					if (local1966 != 0L) {
						local1274 = Static268.method4511((int) (local1966 >>> 32) & Integer.MAX_VALUE).anInt825 / 2;
					}
					if (local62.anInt876 == -1 && local62.anIntArray94 == null && local62.anIntArray93 == null && !local62.aBoolean60) {
						local2029 = local62.method682(null, local125, local202, arg3 + 4, local190, arg5, local240, local182, local333, 4);
						if (Static296.aBoolean335 && local333) {
							Static124.method2109(local2029.aClass7_Sub1_3, local240 - Static25.anIntArray54[arg3] * 8, local192, local190 - Static224.anIntArray514[arg3] * 8);
						}
						local2013 = local2029.aClass25_1;
					} else {
						local2013 = new Class25_Sub4(arg8, 4, arg3 + 4, arg1, arg4, arg9, -1, local62.aBoolean52, null);
					}
					Static18.method377(arg0, arg4, arg9, local182, local2013, null, 256, arg3, local1274 * Static25.anIntArray54[arg3], local1274 * Static224.anIntArray514[arg3], local260);
				} else if (arg7 == 7) {
					@Pc(2221) int local2221 = arg3 + 2 & 0x3;
					if (local62.anInt876 == -1 && local62.anIntArray94 == null && local62.anIntArray93 == null && !local62.aBoolean60) {
						@Pc(2252) Class98 local2252 = local62.method682(null, local125, local202, local2221 + 4, local190, arg5, local240, local182, local333, 4);
						if (Static296.aBoolean335 && local333) {
							Static124.method2109(local2252.aClass7_Sub1_3, local240, local192, local190);
						}
						local385 = local2252.aClass25_1;
					} else {
						local385 = new Class25_Sub4(arg8, 4, local2221 + 4, arg1, arg4, arg9, -1, local62.aBoolean52, null);
					}
					Static18.method377(arg0, arg4, arg9, local182, local385, null, 256, local2221, 0, 0, local260);
				} else if (arg7 == 8) {
					local1274 = 8;
					local1966 = Static172.method3180(arg0, arg4, arg9);
					if (local1966 != 0L) {
						local1274 = Static268.method4511((int) (local1966 >>> 32) & Integer.MAX_VALUE).anInt825 / 2;
					}
					@Pc(2334) int local2334 = arg3 + 2 & 0x3;
					@Pc(2432) Class25 local2432;
					if (local62.anInt876 == -1 && local62.anIntArray94 == null && local62.anIntArray93 == null && !local62.aBoolean60) {
						@Pc(2355) int local2355 = Static25.anIntArray54[arg3] * 8;
						@Pc(2361) int local2361 = Static224.anIntArray514[arg3] * 8;
						@Pc(2377) Class98 local2377 = local62.method682(null, local125, local202, arg3 + 4, local190, arg5, local240, local182, local333, 4);
						if (Static296.aBoolean335 && local333) {
							Static124.method2109(local2377.aClass7_Sub1_3, local240 - local2355, local192, local190 - local2361);
						}
						local2013 = local2377.aClass25_1;
						local2377 = local62.method682(null, local125, local202, local2334 + 4, local190, arg5, local240, local182, local333, 4);
						if (Static296.aBoolean335 && local333) {
							Static124.method2109(local2377.aClass7_Sub1_3, local240 - local2355, local192, local190 - local2361);
						}
						local2432 = local2377.aClass25_1;
					} else {
						local2013 = new Class25_Sub4(arg8, 4, arg3 + 4, arg1, arg4, arg9, -1, local62.aBoolean52, null);
						local2432 = new Class25_Sub4(arg8, 4, local2334 + 4, arg1, arg4, arg9, -1, local62.aBoolean52, null);
					}
					Static18.method377(arg0, arg4, arg9, local182, local2013, local2432, 256, arg3, Static25.anIntArray54[arg3] * local1274, local1274 * Static224.anIntArray514[arg3], local260);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IB)V")
	private static void method4542(@OriginalArg(0) int arg0) {
		if (arg0 > 256) {
			arg0 = 256;
		}
		if (arg0 > 10) {
			arg0 = 10;
		}
		Static59.anInt1534 += arg0 * 128;
		@Pc(41) int local41;
		if (Static59.anIntArray156.length < Static59.anInt1534) {
			local41 = (int) (Math.random() * 12.0D);
			Static59.anInt1534 -= Static59.anIntArray156.length;
			Static226.method3932(Static37.aClass7_Sub1Array1[local41]);
		}
		local41 = 0;
		@Pc(57) int local57 = arg0 * 128;
		@Pc(64) int local64 = (256 - arg0) * 128;
		@Pc(66) int local66;
		@Pc(92) int local92;
		for (local66 = 0; local66 < local64; local66++) {
			local92 = Static138.anIntArray286[local41 + local57] - Static59.anIntArray156[local41 + Static59.anInt1534 & Static59.anIntArray156.length + -1] * arg0 / 6;
			if (local92 < 0) {
				local92 = 0;
			}
			Static138.anIntArray286[local41++] = local92;
		}
		@Pc(122) int local122;
		@Pc(132) int local132;
		for (local66 = 256 - arg0; local66 < 256; local66++) {
			local92 = local66 * 128;
			for (local122 = 0; local122 < 128; local122++) {
				local132 = (int) (Math.random() * 100.0D);
				if (local132 < 50 && local122 > 10 && local122 < 118) {
					Static138.anIntArray286[local92 + local122] = 255;
				} else {
					Static138.anIntArray286[local122 + local92] = 0;
				}
			}
		}
		for (local66 = 0; local66 < 256 - arg0; local66++) {
			Static25.anIntArray55[local66] = Static25.anIntArray55[arg0 + local66];
		}
		for (local66 = 256 - arg0; local66 < 256; local66++) {
			Static25.anIntArray55[local66] = (int) (Math.sin((double) Static138.anInt3116 / 14.0D) * 16.0D + Math.sin((double) Static138.anInt3116 / 15.0D) * 14.0D + Math.sin((double) Static138.anInt3116 / 16.0D) * 12.0D);
			Static138.anInt3116++;
		}
		local66 = (arg0 + (Static32.anInt809 & 0x1)) / 2;
		Static153.anInt3544 += arg0;
		if (local66 <= 0) {
			return;
		}
		for (local92 = 0; local92 < Static153.anInt3544; local92++) {
			local122 = (int) (Math.random() * 124.0D) + 2;
			local132 = (int) (Math.random() * 128.0D) + 128;
			Static138.anIntArray286[(local132 << 7) + local122] = 192;
		}
		Static153.anInt3544 = 0;
		@Pc(295) int local295;
		for (local92 = 0; local92 < 256; local92++) {
			local122 = 0;
			local132 = local92 * 128;
			for (local295 = -local66; local295 < 128; local295++) {
				if (local66 + local295 < 128) {
					local122 += Static138.anIntArray286[local66 + local295 + local132];
				}
				if (local295 - local66 - 1 >= 0) {
					local122 -= Static138.anIntArray286[local295 + local132 - local66 - 1];
				}
				if (local295 >= 0) {
					Static298.anIntArray622[local132 + local295] = local122 / (local66 * 2 + 1);
				}
			}
		}
		for (local92 = 0; local92 < 128; local92++) {
			local122 = 0;
			for (local132 = -local66; local132 < 256; local132++) {
				local295 = local132 * 128;
				if (local66 + local132 < 256) {
					local122 += Static298.anIntArray622[local295 + local92 + local66 * 128];
				}
				if (local132 - local66 - 1 >= 0) {
					local122 -= Static298.anIntArray622[local92 + local295 - local66 * 128 - 128];
				}
				if (local132 >= 0) {
					Static138.anIntArray286[local92 + local295] = local122 / (local66 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZI)I")
	public static int method4543(@OriginalArg(1) int arg0) {
		if (Static22.aClass41_1 != null) {
			Static22.aClass41_1.method1062();
			Static22.aClass41_1 = null;
		}
		Static83.anInt1982++;
		if (Static83.anInt1982 > 4) {
			Static70.anInt1763 = 0;
			Static83.anInt1982 = 0;
			return arg0;
		}
		if (Static23.anInt486 == Static176.anInt3984) {
			Static23.anInt486 = Static25.anInt510;
		} else {
			Static23.anInt486 = Static176.anInt3984;
		}
		Static70.anInt1763 = 0;
		return -1;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BII)V")
	public static void method4545(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static253.anInt5520 > 0) {
			method4542(Static253.anInt5520);
			Static253.anInt5520 = 0;
		}
		@Pc(16) int local16 = 0;
		@Pc(18) int local18 = 0;
		@Pc(22) int local22 = Static203.anInt4507 * arg1;
		for (@Pc(32) int local32 = 1; local32 < 255; local32++) {
			@Pc(51) int local51 = (256 - local32) * Static25.anIntArray55[local32] / 256;
			if (local51 < 0) {
				local51 = 0;
			}
			local16 += local51;
			@Pc(62) int local62;
			for (local62 = local51; local62 < 128; local62++) {
				@Pc(70) int local70 = Static138.anIntArray286[local16++];
				@Pc(77) int local77 = Static203.anIntArray460[local22++ + arg0];
				if (local70 == 0) {
					Static290.aClass1_Sub2_Sub14_Sub1_5.anIntArray294[local18++] = local77;
				} else {
					@Pc(83) int local83 = local70 + 18;
					@Pc(89) int local89 = 256 - local70 - 18;
					if (local89 > 255) {
						local89 = 255;
					}
					local70 = Static259.anIntArray565[local70];
					if (local83 > 255) {
						local83 = 255;
					}
					Static290.aClass1_Sub2_Sub14_Sub1_5.anIntArray294[local18++] = (local89 * (local77 & 0xFF00) + (local70 & 0xFF00) * local83 & 0xFF0000) + (local83 * (local70 & 0xFF00FF) + (local77 & 0xFF00FF) * local89 & 0xFF00FF00) >> 8;
				}
			}
			for (local62 = 0; local62 < local51; local62++) {
				Static290.aClass1_Sub2_Sub14_Sub1_5.anIntArray294[local18++] = Static203.anIntArray460[local22++ + arg0];
			}
			local22 += Static203.anInt4507 - 128;
		}
		if (Static296.aBoolean335) {
			Static288.method4719(Static290.aClass1_Sub2_Sub14_Sub1_5.anIntArray294, arg0, arg1, Static290.aClass1_Sub2_Sub14_Sub1_5.anInt3438, Static290.aClass1_Sub2_Sub14_Sub1_5.anInt3430);
		} else {
			Static290.aClass1_Sub2_Sub14_Sub1_5.method2732(arg0, arg1);
		}
	}
}
