import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
	public static int anInt389;

	@OriginalMember(owner = "client!bh", name = "r", descriptor = "Lclient!jb;")
	public static Class28 aClass28_8;

	@OriginalMember(owner = "client!bh", name = "t", descriptor = "Lclient!be;")
	public static Class13 aClass13_1;

	@OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
	public static int anInt394 = 0;

	@OriginalMember(owner = "client!bh", name = "q", descriptor = "Lclient!ak;")
	public static Class8 aClass8_1 = new Class8(64);

	@OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
	public static int anInt399 = 0;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIII)V")
	public static void method373(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = arg4; local7 <= arg1 + arg4; local7++) {
			for (local11 = arg3; local11 <= arg2 + arg3; local11++) {
				if (local11 >= 0 && local11 < 104 && local7 >= 0 && local7 < 104) {
					Static88.aByteArrayArrayArray8[arg0][local11][local7] = 127;
				}
			}
		}
		@Pc(66) int local66;
		for (local11 = arg4; local11 < arg1 + arg4; local11++) {
			for (local66 = arg3; local66 < arg3 + arg2; local66++) {
				if (local66 >= 0 && local66 < 104 && local11 >= 0 && local11 < 104) {
					Static166.anIntArrayArrayArray11[arg0][local66][local11] = arg0 > 0 ? Static166.anIntArrayArrayArray11[arg0 - 1][local66][local11] : 0;
				}
			}
		}
		if (arg3 > 0 && arg3 < 104) {
			for (local66 = arg4 + 1; local66 < arg4 + arg1; local66++) {
				if (local66 >= 0 && local66 < 104) {
					Static166.anIntArrayArrayArray11[arg0][arg3][local66] = Static166.anIntArrayArrayArray11[arg0][arg3 - 1][local66];
				}
			}
		}
		if (arg4 > 0 && arg4 < 104) {
			for (local66 = arg3 + 1; local66 < arg3 + arg2; local66++) {
				if (local66 >= 0 && local66 < 104) {
					Static166.anIntArrayArrayArray11[arg0][local66][arg4] = Static166.anIntArrayArrayArray11[arg0][local66][arg4 - 1];
				}
			}
		}
		if (arg3 < 0 || arg4 < 0 || arg3 >= 104 || arg4 >= 104) {
			return;
		}
		if (arg0 != 0) {
			if (arg3 > 0 && Static166.anIntArrayArrayArray11[arg0][arg3 - 1][arg4] != Static166.anIntArrayArrayArray11[arg0 - 1][arg3 - 1][arg4]) {
				Static166.anIntArrayArrayArray11[arg0][arg3][arg4] = Static166.anIntArrayArrayArray11[arg0][arg3 - 1][arg4];
				return;
			}
			if (arg4 > 0 && Static166.anIntArrayArrayArray11[arg0][arg3][arg4 - 1] != Static166.anIntArrayArrayArray11[arg0 - 1][arg3][arg4 - 1]) {
				Static166.anIntArrayArrayArray11[arg0][arg3][arg4] = Static166.anIntArrayArrayArray11[arg0][arg3][arg4 - 1];
				return;
			}
			if (arg3 > 0 && arg4 > 0 && Static166.anIntArrayArrayArray11[arg0][arg3 - 1][arg4 - 1] != Static166.anIntArrayArrayArray11[arg0 - 1][arg3 - 1][arg4 - 1]) {
				Static166.anIntArrayArrayArray11[arg0][arg3][arg4] = Static166.anIntArrayArrayArray11[arg0][arg3 - 1][arg4 - 1];
				return;
			}
			return;
		}
		if (arg3 > 0 && Static166.anIntArrayArrayArray11[arg0][arg3 - 1][arg4] != 0) {
			Static166.anIntArrayArrayArray11[arg0][arg3][arg4] = Static166.anIntArrayArrayArray11[arg0][arg3 - 1][arg4];
			return;
		}
		if (arg4 > 0 && Static166.anIntArrayArrayArray11[arg0][arg3][arg4 - 1] != 0) {
			Static166.anIntArrayArrayArray11[arg0][arg3][arg4] = Static166.anIntArrayArrayArray11[arg0][arg3][arg4 - 1];
			return;
		}
		if (arg3 > 0 && arg4 > 0 && Static166.anIntArrayArrayArray11[arg0][arg3 - 1][arg4 - 1] != 0) {
			Static166.anIntArrayArrayArray11[arg0][arg3][arg4] = Static166.anIntArrayArrayArray11[arg0][arg3 - 1][arg4 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILclient!mj;)I")
	public static int method374(@OriginalArg(1) Class5_Sub5_Sub2 arg0) {
		@Pc(6) Class30 local6 = arg0.aClass30_1;
		if (local6.anIntArray102 != null) {
			local6 = local6.method870();
			if (local6 == null) {
				return -1;
			}
		}
		@Pc(27) int local27 = local6.anInt975;
		if (arg0.anInt3005 == arg0.anInt3022) {
			local27 = local6.anInt962;
		} else if (arg0.anInt3005 == arg0.anInt3002) {
			local27 = local6.anInt987;
		}
		return local27;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!sc;ZB)V")
	public static void method376(@OriginalArg(0) Class107 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(5) Class107 local5 = arg0.method3085();
		@Pc(12) short[] local12 = new short[16];
		@Pc(14) int local14 = 0;
		for (@Pc(20) int local20 = 0; local20 < Static58.anInt1424; local20++) {
			@Pc(26) Class75 local26 = Static128.method2147(local20);
			if ((!arg1 || local26.aBoolean231) && local26.anInt2744 == -1 && local26.anInt2708 == -1 && local26.anInt2751 == 0 && local26.aClass107_737.method3085().method3089(local5) != -1) {
				if (local14 >= 250) {
					Static98.anInt2144 = -1;
					Static126.aShortArray38 = null;
					return;
				}
				if (local14 >= local12.length) {
					@Pc(80) short[] local80 = new short[local12.length * 2];
					for (@Pc(82) int local82 = 0; local82 < local14; local82++) {
						local80[local82] = local12[local82];
					}
					local12 = local80;
				}
				local12[local14++] = (short) local20;
			}
		}
		Static213.anInt4601 = 0;
		Static98.anInt2144 = local14;
		Static126.aShortArray38 = local12;
		@Pc(119) Class107[] local119 = new Class107[Static98.anInt2144];
		for (@Pc(121) int local121 = 0; local121 < Static98.anInt2144; local121++) {
			local119[local121] = Static128.method2147(local12[local121]).aClass107_737;
		}
		Static176.method2783(local119, Static126.aShortArray38);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIII)V")
	public static void method377(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static99.anInt915 <= arg3 && arg3 <= Static38.anInt784) {
			@Pc(23) int local23 = Static123.method2091(Static47.anInt1057, Static223.anInt4869, arg1);
			@Pc(29) int local29 = Static123.method2091(Static47.anInt1057, Static223.anInt4869, arg0);
			Static149.method2444(local23, local29, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZI[Lclient!jc;)V")
	public static void method379(@OriginalArg(2) Class60[] arg0) {
		@Pc(9) int local9;
		@Pc(13) int local13;
		for (local9 = 0; local9 < 4; local9++) {
			for (local13 = 0; local13 < 104; local13++) {
				for (@Pc(17) int local17 = 0; local17 < 104; local17++) {
					if ((Static221.aByteArrayArrayArray14[local9][local13][local17] & 0x1) == 1) {
						@Pc(32) int local32 = local9;
						if ((Static221.aByteArrayArrayArray14[1][local13][local17] & 0x2) == 2) {
							local32 = local9 - 1;
						}
						if (local32 >= 0) {
							arg0[local32].method1679(local13, local17);
						}
					}
				}
			}
		}
		Static22.anInt439 += (int) (Math.random() * 5.0D) - 2;
		if (Static22.anInt439 < -8) {
			Static22.anInt439 = -8;
		}
		Static118.anInt2617 += (int) (Math.random() * 5.0D) - 2;
		if (Static22.anInt439 > 8) {
			Static22.anInt439 = 8;
		}
		if (Static118.anInt2617 < -16) {
			Static118.anInt2617 = -16;
		}
		if (Static118.anInt2617 > 16) {
			Static118.anInt2617 = 16;
		}
		@Pc(126) int[][] local126 = new int[104][104];
		local9 = Static22.anInt439 >> 2 << 10;
		local13 = Static118.anInt2617 >> 1;
		@Pc(140) int[][] local140 = new int[104][104];
		@Pc(152) int local152;
		@Pc(158) int local158;
		@Pc(160) int local160;
		@Pc(164) int local164;
		@Pc(304) int local304;
		@Pc(189) int local189;
		@Pc(210) int local210;
		@Pc(223) int local223;
		@Pc(288) int local288;
		@Pc(233) int local233;
		@Pc(229) int local229;
		@Pc(282) int local282;
		@Pc(524) int local524;
		for (@Pc(142) int local142 = 0; local142 < 4; local142++) {
			@Pc(148) byte[][] local148 = Static88.aByteArrayArrayArray8[local142];
			local152 = (int) Math.sqrt(5100.0D);
			local158 = local152 * 768 >> 8;
			for (local160 = 1; local160 < 103; local160++) {
				for (local164 = 1; local164 < 103; local164++) {
					local189 = Static166.anIntArrayArrayArray11[local142][local164 + 1][local160] - Static166.anIntArrayArrayArray11[local142][local164 - 1][local160];
					local210 = Static166.anIntArrayArrayArray11[local142][local164][local160 + 1] - Static166.anIntArrayArrayArray11[local142][local164][local160 - 1];
					local223 = (int) Math.sqrt((double) (local189 * local189 + local210 * local210 + 65536));
					local229 = (local210 << 8) / local223;
					local233 = -65536 / local223;
					local282 = (local148[local164][local160 - 1] >> 2) + (local148[local164 + 1][local160] >> 3) + (local148[local164 + -1][local160] >> 2) + (local148[local164][local160 - -1] >> 3) + (local148[local164][local160] >> 1);
					local288 = (local189 << 8) / local223;
					local304 = (local229 * -50 + local233 * -10 + local288 * -50) / local158 + 74;
					local140[local164][local160] = local304 - local282;
				}
			}
			for (local164 = 0; local164 < 104; local164++) {
				Static38.anIntArray83[local164] = 0;
				Static16.anIntArray37[local164] = 0;
				Static141.anIntArray265[local164] = 0;
				Static114.anIntArray233[local164] = 0;
				Static203.anIntArray10[local164] = 0;
			}
			@Pc(561) int local561;
			for (local304 = -5; local304 < 104; local304++) {
				for (local189 = 0; local189 < 104; local189++) {
					local210 = local304 + 5;
					@Pc(425) int local425;
					if (local210 < 104) {
						local223 = Static213.aByteArrayArrayArray13[local142][local210][local189] & 0xFF;
						if (local223 > 0) {
							@Pc(389) Class10 local389 = Static148.method2426(local223 - 1);
							Static38.anIntArray83[local189] += local389.anInt331;
							Static16.anIntArray37[local189] += local389.anInt323;
							Static141.anIntArray265[local189] += local389.anInt329;
							Static114.anIntArray233[local189] += local389.anInt328;
							local425 = Static203.anIntArray10[local189]++;
						}
					}
					local223 = local304 - 5;
					if (local223 >= 0) {
						local288 = Static213.aByteArrayArrayArray13[local142][local223][local189] & 0xFF;
						if (local288 > 0) {
							@Pc(458) Class10 local458 = Static148.method2426(local288 - 1);
							Static38.anIntArray83[local189] -= local458.anInt331;
							Static16.anIntArray37[local189] -= local458.anInt323;
							Static141.anIntArray265[local189] -= local458.anInt329;
							Static114.anIntArray233[local189] -= local458.anInt328;
							local425 = Static203.anIntArray10[local189]--;
						}
					}
				}
				if (local304 >= 0) {
					local210 = 0;
					local288 = 0;
					local233 = 0;
					local223 = 0;
					local229 = 0;
					for (local282 = -5; local282 < 104; local282++) {
						local524 = local282 + 5;
						if (local524 < 104) {
							local288 += Static141.anIntArray265[local524];
							local223 += Static16.anIntArray37[local524];
							local210 += Static38.anIntArray83[local524];
							local233 += Static114.anIntArray233[local524];
							local229 += Static203.anIntArray10[local524];
						}
						local561 = local282 - 5;
						if (local561 >= 0) {
							local223 -= Static16.anIntArray37[local561];
							local229 -= Static203.anIntArray10[local561];
							local288 -= Static141.anIntArray265[local561];
							local210 -= Static38.anIntArray83[local561];
							local233 -= Static114.anIntArray233[local561];
						}
						if (local282 >= 0 && local229 > 0) {
							local126[local304][local282] = Static201.method3225(local288 / local229, local210 * 256 / local233, local223 / local229);
						}
					}
				}
			}
			for (local189 = 1; local189 < 103; local189++) {
				for (local210 = 1; local210 < 103; local210++) {
					if (Static155.method412() || (Static221.aByteArrayArrayArray14[0][local189][local210] & 0x2) != 0 || (Static221.aByteArrayArrayArray14[local142][local189][local210] & 0x10) == 0 && Static75.method1339(local210, local189, local142) == Static166.anInt4347) {
						if (Static203.anInt207 > local142) {
							Static203.anInt207 = local142;
						}
						local223 = Static213.aByteArrayArrayArray13[local142][local189][local210] & 0xFF;
						local288 = Static129.aByteArrayArrayArray9[local142][local189][local210] & 0xFF;
						if (local223 > 0 || local288 > 0) {
							local233 = Static166.anIntArrayArrayArray11[local142][local189][local210];
							local229 = Static166.anIntArrayArrayArray11[local142][local189 + 1][local210];
							local282 = Static166.anIntArrayArrayArray11[local142][local189 + 1][local210 + 1];
							local524 = Static166.anIntArrayArrayArray11[local142][local189][local210 + 1];
							if (local142 > 0) {
								@Pc(746) boolean local746 = true;
								if (local223 == 0 && Static23.aByteArrayArrayArray2[local142][local189][local210] != 0) {
									local746 = false;
								}
								if (local288 > 0 && !Static94.method1589(local288 - 1).aBoolean90) {
									local746 = false;
								}
								if (local746 && local229 == local233 && local282 == local233 && local524 == local233) {
									Static13.anIntArrayArrayArray1[local142][local189][local210] |= 0x4;
								}
							}
							@Pc(864) int local864;
							@Pc(827) int local827;
							@Pc(857) int local857;
							if (local223 > 0) {
								local561 = local126[local189][local210];
								local827 = (local561 & 0x7F) + local13;
								if (local827 < 0) {
									local827 = 0;
								} else if (local827 > 127) {
									local827 = 127;
								}
								local857 = (local561 & 0x380) + (local561 + local9 & 0xFC00) + local827;
								local864 = Static74.anIntArray158[Static82.method1388(96, local857)];
							} else {
								local864 = 0;
								local561 = -1;
							}
							local827 = local140[local189][local210];
							local857 = local140[local189 + 1][local210];
							@Pc(892) int local892 = local140[local189][local210 + 1];
							@Pc(902) int local902 = local140[local189 + 1][local210 + 1];
							if (local288 == 0) {
								Static166.method3211(local142, local189, local210, 0, 0, -1, local233, local229, local282, local524, Static82.method1388(local827, local561), Static82.method1388(local857, local561), Static82.method1388(local902, local561), Static82.method1388(local892, local561), 0, 0, 0, 0, local864, 0);
							} else {
								@Pc(914) int local914 = Static23.aByteArrayArrayArray2[local142][local189][local210] + 1;
								@Pc(922) byte local922 = Static140.aByteArrayArrayArray4[local142][local189][local210];
								@Pc(928) Class29 local928 = Static94.method1589(local288 - 1);
								@Pc(931) int local931 = local928.anInt956;
								if (local931 >= 0 && !Static74.anInterface4_1.method1634(local931)) {
									local931 = -1;
								}
								@Pc(957) int local957;
								@Pc(955) int local955;
								@Pc(973) int local973;
								@Pc(1001) int local1001;
								if (local931 >= 0) {
									local955 = Static74.anIntArray158[Static171.method2730(96, Static74.anInterface4_1.method1632(local931))];
									local957 = -1;
								} else if (local928.anInt952 == -1) {
									local957 = -2;
									local955 = 0;
								} else {
									local957 = local928.anInt952;
									local973 = local13 + (local957 & 0x7F);
									if (local973 < 0) {
										local973 = 0;
									} else if (local973 > 127) {
										local973 = 127;
									}
									local1001 = local973 + (local957 & 0x380) + (local9 + local957 & 0xFC00);
									local955 = Static74.anIntArray158[Static171.method2730(96, local1001)];
								}
								if (local928.anInt955 >= 0) {
									local973 = local928.anInt955;
									local1001 = (local973 & 0x7F) + local13;
									if (local1001 < 0) {
										local1001 = 0;
									} else if (local1001 > 127) {
										local1001 = 127;
									}
									@Pc(1052) int local1052 = (local973 + local9 & 0xFC00) + ((local973 & 0x380) + local1001);
									local955 = Static74.anIntArray158[Static171.method2730(96, local1052)];
								}
								Static166.method3211(local142, local189, local210, local914, local922, local931, local233, local229, local282, local524, Static82.method1388(local827, local561), Static82.method1388(local857, local561), Static82.method1388(local902, local561), Static82.method1388(local892, local561), Static171.method2730(local827, local957), Static171.method2730(local857, local957), Static171.method2730(local902, local957), Static171.method2730(local892, local957), local864, local955);
							}
						}
					}
				}
			}
			Static213.aByteArrayArrayArray13[local142] = null;
			Static129.aByteArrayArrayArray9[local142] = null;
			Static23.aByteArrayArrayArray2[local142] = null;
			Static140.aByteArrayArrayArray4[local142] = null;
			Static88.aByteArrayArrayArray8[local142] = null;
		}
		Static196.method3171();
		for (@Pc(1187) int local1187 = 0; local1187 < 104; local1187++) {
			for (local152 = 0; local152 < 104; local152++) {
				if ((Static221.aByteArrayArrayArray14[1][local1187][local152] & 0x2) == 2) {
					Static30.method588(local1187, local152);
				}
			}
		}
		for (local152 = 0; local152 < 4; local152++) {
			for (local158 = 0; local158 <= 104; local158++) {
				for (local160 = 0; local160 <= 104; local160++) {
					if ((Static13.anIntArrayArrayArray1[local152][local160][local158] & 0x1) != 0) {
						local304 = local158;
						local164 = local158;
						local210 = local152;
						while (local164 > 0 && (Static13.anIntArrayArrayArray1[local152][local160][local164 - 1] & 0x1) != 0) {
							local164--;
						}
						while (local304 < 104 && (Static13.anIntArrayArrayArray1[local152][local160][local304 + 1] & 0x1) != 0) {
							local304++;
						}
						label334: for (local189 = local152; local189 > 0; local189--) {
							for (local223 = local164; local223 <= local304; local223++) {
								if ((Static13.anIntArrayArrayArray1[local189 - 1][local160][local223] & 0x1) == 0) {
									break label334;
								}
							}
						}
						label323: while (local210 < 3) {
							for (local223 = local164; local223 <= local304; local223++) {
								if ((Static13.anIntArrayArrayArray1[local210 + 1][local160][local223] & 0x1) == 0) {
									break label323;
								}
							}
							local210++;
						}
						local223 = (local304 + 1 - local164) * (local210 + 1 - local189);
						if (local223 >= 8) {
							local233 = Static166.anIntArrayArrayArray11[local210][local160][local164] - 240;
							local229 = Static166.anIntArrayArrayArray11[local189][local160][local164];
							Static223.method3651(1, local160 * 128, local160 * 128, local164 * 128, local304 * 128 + 128, local233, local229);
							for (local282 = local189; local282 <= local210; local282++) {
								for (local524 = local164; local524 <= local304; local524++) {
									Static13.anIntArrayArrayArray1[local282][local160][local524] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((Static13.anIntArrayArrayArray1[local152][local160][local158] & 0x2) != 0) {
						for (local164 = local160; local164 > 0 && (Static13.anIntArrayArrayArray1[local152][local164 - 1][local158] & 0x2) != 0; local164--) {
						}
						for (local304 = local160; local304 < 104 && (Static13.anIntArrayArrayArray1[local152][local304 + 1][local158] & 0x2) != 0; local304++) {
						}
						local210 = local152;
						label388: for (local189 = local152; local189 > 0; local189--) {
							for (local223 = local164; local223 <= local304; local223++) {
								if ((Static13.anIntArrayArrayArray1[local189 - 1][local223][local158] & 0x2) == 0) {
									break label388;
								}
							}
						}
						label377: while (local210 < 3) {
							for (local223 = local164; local223 <= local304; local223++) {
								if ((Static13.anIntArrayArrayArray1[local210 + 1][local223][local158] & 0x2) == 0) {
									break label377;
								}
							}
							local210++;
						}
						local223 = (local210 + 1 - local189) * (local304 + (1 - local164));
						if (local223 >= 8) {
							local233 = Static166.anIntArrayArrayArray11[local210][local164][local158] - 240;
							local229 = Static166.anIntArrayArrayArray11[local189][local164][local158];
							Static223.method3651(2, local164 * 128, local304 * 128 + 128, local158 * 128, local158 * 128, local233, local229);
							for (local282 = local189; local282 <= local210; local282++) {
								for (local524 = local164; local524 <= local304; local524++) {
									Static13.anIntArrayArrayArray1[local282][local524][local158] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((Static13.anIntArrayArrayArray1[local152][local160][local158] & 0x4) != 0) {
						local164 = local160;
						local304 = local160;
						for (local189 = local158; local189 > 0 && (Static13.anIntArrayArrayArray1[local152][local160][local189 - 1] & 0x4) != 0; local189--) {
						}
						for (local210 = local158; local210 < 104 && (Static13.anIntArrayArrayArray1[local152][local160][local210 + 1] & 0x4) != 0; local210++) {
						}
						label443: while (local164 > 0) {
							for (local223 = local189; local223 <= local210; local223++) {
								if ((Static13.anIntArrayArrayArray1[local152][local164 - 1][local223] & 0x4) == 0) {
									break label443;
								}
							}
							local164--;
						}
						label432: while (local304 < 104) {
							for (local223 = local189; local223 <= local210; local223++) {
								if ((Static13.anIntArrayArrayArray1[local152][local304 + 1][local223] & 0x4) == 0) {
									break label432;
								}
							}
							local304++;
						}
						if ((local304 + 1 - local164) * (local210 - local189 + 1) >= 4) {
							local223 = Static166.anIntArrayArrayArray11[local152][local164][local189];
							Static223.method3651(4, local164 * 128, local304 * 128 + 128, local189 * 128, local210 * 128 + 128, local223, local223);
							for (local288 = local164; local288 <= local304; local288++) {
								for (local233 = local189; local233 <= local210; local233++) {
									Static13.anIntArrayArrayArray1[local152][local288][local233] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(III)I")
	public static int method381(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = 0;
		while (arg1 > 0) {
			arg1--;
			local15 = local15 << 1 | arg0 & 0x1;
			arg0 >>>= 0x1;
		}
		return local15;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IJ)Lclient!sc;")
	public static Class107 method382(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(34) int local34 = 0;
			for (@Pc(36) long local36 = arg0; local36 != 0L; local36 /= 37L) {
				local34++;
			}
			@Pc(52) byte[] local52 = new byte[local34];
			while (arg0 != 0L) {
				@Pc(56) long local56 = arg0;
				arg0 /= 37L;
				local34--;
				local52[local34] = Static159.aByteArray47[(int) (local56 - arg0 * 37L)];
			}
			@Pc(81) Class107 local81 = new Class107();
			local81.aByteArray55 = local52;
			local81.anInt4186 = local52.length;
			return local81;
		}
	}
}
