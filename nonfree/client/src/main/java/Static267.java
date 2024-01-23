import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!uf", name = "B", descriptor = "[Lclient!bb;")
	public static Interface1[] anInterface1Array1;

	@OriginalMember(owner = "client!uf", name = "p", descriptor = "Lclient!og;")
	public static Class127 aClass127_14 = null;

	@OriginalMember(owner = "client!uf", name = "r", descriptor = "Z")
	public static boolean aBoolean411 = false;

	@OriginalMember(owner = "client!uf", name = "u", descriptor = "I")
	public static int anInt5346 = 127;

	@OriginalMember(owner = "client!uf", name = "v", descriptor = "[Z")
	public static boolean[] aBooleanArray25 = new boolean[100];

	@OriginalMember(owner = "client!uf", name = "y", descriptor = "J")
	public static long aLong172 = 0L;

	@OriginalMember(owner = "client!uf", name = "C", descriptor = "[I")
	public static int[] anIntArray623 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)I")
	public static int method4105() {
		return Static113.anInt2117;
	}

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "(I)V")
	public static void method4106() {
		Static257.aClass31_39.method855();
		Static18.aClass31_4.method855();
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(JB)V")
	public static void method4107(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < Static147.anInt2712; local19++) {
			if (Static207.aLongArray9[local19] == arg0) {
				Static147.anInt2712--;
				for (@Pc(39) int local39 = local19; local39 < Static147.anInt2712; local39++) {
					Static147.aStringArray12[local39] = Static147.aStringArray12[local39 + 1];
					Static22.anIntArray597[local39] = Static22.anIntArray597[local39 + 1];
					Static275.aStringArray34[local39] = Static275.aStringArray34[local39 + 1];
					Static207.aLongArray9[local39] = Static207.aLongArray9[local39 + 1];
					Static26.anIntArray59[local39] = Static26.anIntArray59[local39 + 1];
					Static28.aBooleanArray2[local39] = Static28.aBooleanArray2[local39 + 1];
				}
				Static145.anInt2688 = Static56.anInt1175;
				Static270.aClass1_Sub18_Sub1_3.method3130(129);
				Static270.aClass1_Sub18_Sub1_3.method3091(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IB)I")
	public static int method4108(@OriginalArg(0) int arg0) {
		@Pc(7) Class140 local7 = Static246.method2732(arg0);
		@Pc(10) int local10 = local7.anInt4481;
		@Pc(13) int local13 = local7.anInt4486;
		@Pc(16) int local16 = local7.anInt4489;
		@Pc(31) int local31 = Class1_Sub27.anIntArray582[local16 - local13];
		return local31 & Static224.anIntArray535[local10] >> local13;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I[[FI[[[B[[B[[I[[B[[B[[I[[F[[F[[B)[Lclient!rc;")
	public static Class1_Sub25[] method4110(@OriginalArg(0) int arg0, @OriginalArg(1) float[][] arg1, @OriginalArg(3) byte[][][] arg2, @OriginalArg(4) byte[][] arg3, @OriginalArg(5) int[][] arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) byte[][] arg6, @OriginalArg(8) int[][] arg7, @OriginalArg(9) float[][] arg8, @OriginalArg(10) float[][] arg9, @OriginalArg(11) byte[][] arg10) {
		@Pc(10) Class22 local10 = new Class22(128);
		@Pc(12) int local12;
		@Pc(17) int local17;
		@Pc(30) int local30;
		@Pc(38) int local38;
		@Pc(133) int local133;
		@Pc(135) int local135;
		@Pc(145) int local145;
		@Pc(155) int local155;
		@Pc(165) int local165;
		@Pc(175) int local175;
		@Pc(187) int local187;
		@Pc(211) int local211;
		@Pc(223) int local223;
		@Pc(199) int local199;
		@Pc(276) byte local276;
		@Pc(301) int local301;
		@Pc(319) int local319;
		@Pc(124) int local124;
		@Pc(128) int local128;
		@Pc(756) int local756;
		@Pc(1024) int local1024;
		@Pc(1053) boolean[] local1053;
		@Pc(1062) boolean[] local1062;
		@Pc(1071) boolean[] local1071;
		for (local12 = 1; local12 <= 102; local12++) {
			for (local17 = 1; local17 <= 102; local17++) {
				local30 = arg3[local12][local17] & 0xFF;
				local38 = arg10[local12][local17] & 0xFF;
				if (local38 != 0) {
					@Pc(47) Class182 local47 = Static106.method1680(local38 - 1);
					if (local47.anInt5910 == -1) {
						continue;
					}
					@Pc(58) Class1_Sub25 local58 = Static159.method2474(local10, local47);
					@Pc(64) byte local64 = arg6[local12][local17];
					@Pc(68) int[] local68 = Static116.anIntArrayArray20[local64];
					local58.anInt4714 += local68.length / 2;
					local58.anInt4713++;
					if (local47.aBoolean453 && local30 != 0) {
						local58.anInt4714 += Static275.anIntArray654[local64];
					}
				}
				if ((arg3[local12][local17] & 0xFF) != 0 || local38 != 0 && arg6[local12][local17] == 0) {
					local124 = 0;
					@Pc(126) int local126 = 0;
					local128 = 0;
					@Pc(131) int[] local131 = new int[8];
					local133 = 0;
					local135 = 0;
					local145 = arg10[local12][local17 + 1] & 0xFF;
					local155 = arg10[local12 - 1][local17] & 0xFF;
					local165 = arg10[local12][local17 - 1] & 0xFF;
					local175 = arg10[local12 + 1][local17] & 0xFF;
					local187 = arg10[local12 - 1][local17 + 1] & 0xFF;
					local199 = arg10[local12 + 1][local17 + 1] & 0xFF;
					local211 = arg10[local12 - 1][local17 - 1] & 0xFF;
					local223 = arg10[local12 + 1][local17 - 1] & 0xFF;
					@Pc(245) Class182 local245;
					@Pc(266) byte local266;
					@Pc(289) int local289;
					if (local187 != 0 && local187 != local38) {
						local245 = Static106.method1680(local187 - 1);
						if (local245.aBoolean453 && local245.anInt5910 != -1) {
							local266 = arg5[local12 - 1][local17 + 1];
							local276 = arg6[local12 - 1][local17 + 1];
							local289 = Static106.anIntArray264[local276 * 4 + (local266 + 2 & 0x3)];
							local301 = Static106.anIntArray264[(local266 + 3 & 0x3) + local276 * 4];
							if (!Static137.aBooleanArrayArray8[local301][1] || !Static137.aBooleanArrayArray8[local289][0]) {
								for (local319 = 0; local319 < 8; local319++) {
									if (local319 == 0) {
										local124++;
										local131[0] = local187;
										break;
									}
									if (local131[local319] == local187) {
										break;
									}
								}
							}
						}
					}
					if (local211 != 0 && local211 != local38) {
						local245 = Static106.method1680(local211 - 1);
						if (local245.aBoolean453 && local245.anInt5910 != -1) {
							local276 = arg6[local12 - 1][local17 - 1];
							local266 = arg5[local12 - 1][local17 - 1];
							local289 = Static106.anIntArray264[local276 * 4 + (local266 & 0x3)];
							local301 = Static106.anIntArray264[local276 * 4 + (local266 + 3 & 0x3)];
							if (!Static137.aBooleanArrayArray8[local289][1] || !Static137.aBooleanArrayArray8[local301][0]) {
								for (local319 = 0; local319 < 8; local319++) {
									if (local124 == local319) {
										local131[local124++] = local211;
										break;
									}
									if (local211 == local131[local319]) {
										break;
									}
								}
							}
						}
					}
					if (local223 != 0 && local223 != local38) {
						local245 = Static106.method1680(local223 - 1);
						if (local245.aBoolean453 && local245.anInt5910 != -1) {
							local266 = arg5[local12 + 1][local17 - 1];
							local276 = arg6[local12 + 1][local17 - 1];
							local289 = Static106.anIntArray264[(local266 & 0x3) + local276 * 4];
							local301 = Static106.anIntArray264[(local266 + 1 & 0x3) + local276 * 4];
							if (!Static137.aBooleanArrayArray8[local301][1] || !Static137.aBooleanArrayArray8[local289][0]) {
								for (local319 = 0; local319 < 8; local319++) {
									if (local124 == local319) {
										local131[local124++] = local223;
										break;
									}
									if (local131[local319] == local223) {
										break;
									}
								}
							}
						}
					}
					if (local199 != 0 && local199 != local38) {
						local245 = Static106.method1680(local199 - 1);
						if (local245.aBoolean453 && local245.anInt5910 != -1) {
							local276 = arg6[local12 + 1][local17 + 1];
							local266 = arg5[local12 + 1][local17 + 1];
							local289 = Static106.anIntArray264[local276 * 4 + (local266 + 2 & 0x3)];
							local301 = Static106.anIntArray264[local276 * 4 + (local266 + 1 & 0x3)];
							if (!Static137.aBooleanArrayArray8[local289][1] || !Static137.aBooleanArrayArray8[local301][0]) {
								for (local319 = 0; local319 < 8; local319++) {
									if (local124 == local319) {
										local131[local124++] = local199;
										break;
									}
									if (local199 == local131[local319]) {
										break;
									}
								}
							}
						}
					}
					if (local145 != 0 && local38 != local145) {
						local245 = Static106.method1680(local145 - 1);
						if (local245.aBoolean453 && local245.anInt5910 != -1) {
							local126 = Static106.anIntArray264[(arg5[local12][local17 + 1] + 2 & 0x3) + arg6[local12][local17 + 1] * 4];
							for (local756 = 0; local756 < 8; local756++) {
								if (local756 == local124) {
									local131[local124++] = local145;
									break;
								}
								if (local131[local756] == local145) {
									break;
								}
							}
						}
					}
					if (local155 != 0 && local38 != local155) {
						local245 = Static106.method1680(local155 - 1);
						if (local245.aBoolean453 && local245.anInt5910 != -1) {
							local128 = Static106.anIntArray264[arg6[local12 - 1][local17] * 4 + (arg5[local12 - 1][local17] + 3 & 0x3)];
							for (local756 = 0; local756 < 8; local756++) {
								if (local124 == local756) {
									local131[local124++] = local155;
									break;
								}
								if (local131[local756] == local155) {
									break;
								}
							}
						}
					}
					if (local165 != 0 && local165 != local38) {
						local245 = Static106.method1680(local165 - 1);
						if (local245.aBoolean453 && local245.anInt5910 != -1) {
							local133 = Static106.anIntArray264[arg6[local12][local17 - 1] * 4 + (arg5[local12][local17 - 1] & 0x3)];
							for (local756 = 0; local756 < 8; local756++) {
								if (local124 == local756) {
									local131[local124++] = local165;
									break;
								}
								if (local165 == local131[local756]) {
									break;
								}
							}
						}
					}
					if (local175 != 0 && local38 != local175) {
						local245 = Static106.method1680(local175 - 1);
						if (local245.aBoolean453 && local245.anInt5910 != -1) {
							local135 = Static106.anIntArray264[arg6[local12 + 1][local17] * 4 + (arg5[local12 + 1][local17] + 1 & 0x3)];
							for (local756 = 0; local756 < 8; local756++) {
								if (local124 == local756) {
									local131[local124++] = local175;
									break;
								}
								if (local175 == local131[local756]) {
									break;
								}
							}
						}
					}
					for (local1024 = 0; local1024 < local124; local1024++) {
						local756 = local131[local1024];
						@Pc(1044) boolean[] local1044 = Static137.aBooleanArrayArray8[local756 == local145 ? local126 : 0];
						local1053 = Static137.aBooleanArrayArray8[local756 == local155 ? local128 : 0];
						local1062 = Static137.aBooleanArrayArray8[local756 == local165 ? local133 : 0];
						local1071 = Static137.aBooleanArrayArray8[local756 == local175 ? local135 : 0];
						@Pc(1077) Class182 local1077 = Static106.method1680(local756 - 1);
						@Pc(1082) Class1_Sub25 local1082 = Static159.method2474(local10, local1077);
						local1082.anInt4714 += 5;
						local1082.anInt4714 += local1044.length - 2;
						local1082.anInt4714 += local1053.length - 2;
						local1082.anInt4714 += local1062.length - 2;
						local1082.anInt4714 += local1071.length - 2;
						local1082.anInt4713++;
					}
				}
			}
		}
		@Pc(1144) Class1_Sub25 local1144;
		for (local1144 = (Class1_Sub25) local10.method640(); local1144 != null; local1144 = (Class1_Sub25) local10.method637()) {
			local1144.method3600();
		}
		for (local12 = 1; local12 <= 102; local12++) {
			for (local17 = 1; local17 <= 102; local17++) {
				if ((arg2[arg0][local12][local17] & 0x8) != 0) {
					local30 = 0;
				} else if ((arg2[1][local12][local17] & 0x2) == 2 && arg0 > 0) {
					local30 = arg0 - 1;
				} else {
					local30 = arg0;
				}
				local38 = arg3[local12][local17] & 0xFF;
				local124 = arg10[local12][local17] & 0xFF;
				if (local124 != 0) {
					@Pc(1237) Class182 local1237 = Static106.method1680(local124 - 1);
					if (local1237.anInt5910 == -1) {
						continue;
					}
					@Pc(1248) Class1_Sub25 local1248 = Static159.method2474(local10, local1237);
					@Pc(1254) byte local1254 = arg6[local12][local17];
					@Pc(1260) byte local1260 = arg5[local12][local17];
					local135 = Static44.method814(local1237.anInt5922, local1237.anInt5910, arg4[local12][local17]);
					local145 = Static44.method814(local1237.anInt5922, local1237.anInt5910, arg4[local12 + 1][local17]);
					local155 = Static44.method814(local1237.anInt5922, local1237.anInt5910, arg4[local12 + 1][local17 + 1]);
					local165 = Static44.method814(local1237.anInt5922, local1237.anInt5910, arg4[local12][local17 + 1]);
					Static253.method3972(arg9, arg8, local17, local38 != 0 && local1237.aBoolean453, local1248, local12, local155, local145, local1254, arg7, local1260, local135, local30, local165, arg1);
				}
				if ((arg3[local12][local17] & 0xFF) != 0 || local124 != 0 && arg6[local12][local17] == 0) {
					@Pc(1367) int local1367 = 0;
					@Pc(1370) int[] local1370 = new int[8];
					local133 = 0;
					local135 = 0;
					local128 = 0;
					local145 = 0;
					local155 = arg10[local12][local17 + 1] & 0xFF;
					local165 = arg10[local12 - 1][local17] & 0xFF;
					local187 = arg10[local12 + 1][local17] & 0xFF;
					local175 = arg10[local12][local17 - 1] & 0xFF;
					local211 = arg10[local12 - 1][local17 + 1] & 0xFF;
					local223 = arg10[local12 - 1][local17 - 1] & 0xFF;
					local1024 = arg10[local12 + 1][local17 + 1] & 0xFF;
					local199 = arg10[local12 + 1][local17 - 1] & 0xFF;
					@Pc(1500) byte local1500;
					@Pc(1481) Class182 local1481;
					@Pc(1549) int local1549;
					if (local211 == 0 || local211 == local124) {
						local211 = 0;
					} else {
						local1481 = Static106.method1680(local211 - 1);
						if (local1481.aBoolean453 && local1481.anInt5910 != -1) {
							local1500 = arg6[local12 - 1][local17 + 1];
							local276 = arg5[local12 - 1][local17 + 1];
							local301 = Static106.anIntArray264[local1500 * 4 + (local276 + 2 & 0x3)];
							local319 = Static106.anIntArray264[(local276 + 3 & 0x3) + local1500 * 4];
							if (Static137.aBooleanArrayArray8[local319][1] && Static137.aBooleanArrayArray8[local301][0]) {
								local211 = 0;
							} else {
								for (local1549 = 0; local1549 < 8; local1549++) {
									if (local1549 == 0) {
										local1367++;
										local1370[0] = local211;
										break;
									}
									if (local1370[local1549] == local211) {
										break;
									}
								}
							}
						} else {
							local211 = 0;
						}
					}
					if (local223 == 0 || local124 == local223) {
						local223 = 0;
					} else {
						local1481 = Static106.method1680(local223 - 1);
						if (local1481.aBoolean453 && local1481.anInt5910 != -1) {
							local276 = arg5[local12 - 1][local17 - 1];
							local1500 = arg6[local12 - 1][local17 - 1];
							local301 = Static106.anIntArray264[local1500 * 4 + (local276 & 0x3)];
							local319 = Static106.anIntArray264[local1500 * 4 + (local276 + 3 & 0x3)];
							if (Static137.aBooleanArrayArray8[local301][1] && Static137.aBooleanArrayArray8[local319][0]) {
								local223 = 0;
							} else {
								for (local1549 = 0; local1549 < 8; local1549++) {
									if (local1367 == local1549) {
										local1370[local1367++] = local223;
										break;
									}
									if (local223 == local1370[local1549]) {
										break;
									}
								}
							}
						} else {
							local223 = 0;
						}
					}
					if (local199 == 0 || local199 == local124) {
						local199 = 0;
					} else {
						local1481 = Static106.method1680(local199 - 1);
						if (local1481.aBoolean453 && local1481.anInt5910 != -1) {
							local276 = arg5[local12 + 1][local17 - 1];
							local1500 = arg6[local12 + 1][local17 - 1];
							local301 = Static106.anIntArray264[local1500 * 4 + (local276 & 0x3)];
							local319 = Static106.anIntArray264[local1500 * 4 + (local276 + 1 & 0x3)];
							if (Static137.aBooleanArrayArray8[local319][1] && Static137.aBooleanArrayArray8[local301][0]) {
								local199 = 0;
							} else {
								for (local1549 = 0; local1549 < 8; local1549++) {
									if (local1367 == local1549) {
										local1370[local1367++] = local199;
										break;
									}
									if (local1370[local1549] == local199) {
										break;
									}
								}
							}
						} else {
							local199 = 0;
						}
					}
					if (local1024 == 0 || local1024 == local124) {
						local1024 = 0;
					} else {
						local1481 = Static106.method1680(local1024 - 1);
						if (local1481.aBoolean453 && local1481.anInt5910 != -1) {
							local276 = arg5[local12 + 1][local17 + 1];
							local1500 = arg6[local12 + 1][local17 + 1];
							local301 = Static106.anIntArray264[(local276 + 2 & 0x3) + local1500 * 4];
							local319 = Static106.anIntArray264[(local276 + 1 & 0x3) + local1500 * 4];
							if (Static137.aBooleanArrayArray8[local301][1] && Static137.aBooleanArrayArray8[local319][0]) {
								local1024 = 0;
							} else {
								for (local1549 = 0; local1549 < 8; local1549++) {
									if (local1549 == local1367) {
										local1370[local1367++] = local1024;
										break;
									}
									if (local1370[local1549] == local1024) {
										break;
									}
								}
							}
						} else {
							local1024 = 0;
						}
					}
					@Pc(2007) int local2007;
					if (local155 != 0 && local124 != local155) {
						local1481 = Static106.method1680(local155 - 1);
						if (local1481.aBoolean453 && local1481.anInt5910 != -1) {
							local128 = Static106.anIntArray264[(arg5[local12][local17 + 1] + 2 & 0x3) + arg6[local12][local17 + 1] * 4];
							for (local2007 = 0; local2007 < 8; local2007++) {
								if (local1367 == local2007) {
									local1370[local1367++] = local155;
									break;
								}
								if (local155 == local1370[local2007]) {
									break;
								}
							}
						}
					}
					if (local165 != 0 && local124 != local165) {
						local1481 = Static106.method1680(local165 - 1);
						if (local1481.aBoolean453 && local1481.anInt5910 != -1) {
							local133 = Static106.anIntArray264[(arg5[local12 - 1][local17] + 3 & 0x3) + arg6[local12 - 1][local17] * 4];
							for (local2007 = 0; local2007 < 8; local2007++) {
								if (local1367 == local2007) {
									local1370[local1367++] = local165;
									break;
								}
								if (local165 == local1370[local2007]) {
									break;
								}
							}
						}
					}
					if (local175 != 0 && local124 != local175) {
						local1481 = Static106.method1680(local175 - 1);
						if (local1481.aBoolean453 && local1481.anInt5910 != -1) {
							local135 = Static106.anIntArray264[arg6[local12][local17 - 1] * 4 + (arg5[local12][local17 - 1] & 0x3)];
							for (local2007 = 0; local2007 < 8; local2007++) {
								if (local2007 == local1367) {
									local1370[local1367++] = local175;
									break;
								}
								if (local175 == local1370[local2007]) {
									break;
								}
							}
						}
					}
					if (local187 != 0 && local124 != local187) {
						local1481 = Static106.method1680(local187 - 1);
						if (local1481.aBoolean453 && local1481.anInt5910 != -1) {
							local145 = Static106.anIntArray264[(arg5[local12 + 1][local17] + 1 & 0x3) + arg6[local12 + 1][local17] * 4];
							for (local2007 = 0; local2007 < 8; local2007++) {
								if (local1367 == local2007) {
									local1370[local1367++] = local187;
									break;
								}
								if (local1370[local2007] == local187) {
									break;
								}
							}
						}
					}
					for (local756 = 0; local756 < local1367; local756++) {
						local2007 = local1370[local756];
						local1062 = Static137.aBooleanArrayArray8[local165 == local2007 ? local133 : 0];
						local1071 = Static137.aBooleanArrayArray8[local2007 == local175 ? local135 : 0];
						@Pc(2294) boolean[] local2294 = Static137.aBooleanArrayArray8[local2007 == local187 ? local145 : 0];
						local1053 = Static137.aBooleanArrayArray8[local155 == local2007 ? local128 : 0];
						@Pc(2313) Class182 local2313 = Static106.method1680(local2007 - 1);
						@Pc(2318) Class1_Sub25 local2318 = Static159.method2474(local10, local2313);
						@Pc(2334) int local2334 = Static44.method814(local2313.anInt5922, local2313.anInt5910, arg4[local12][local17]) << 8 | 0xFF;
						@Pc(2352) int local2352 = Static44.method814(local2313.anInt5922, local2313.anInt5910, arg4[local12 + 1][local17]) << 8 | 0xFF;
						@Pc(2372) int local2372 = Static44.method814(local2313.anInt5922, local2313.anInt5910, arg4[local12 + 1][local17 + 1]) << 8 | 0xFF;
						@Pc(2390) int local2390 = Static44.method814(local2313.anInt5922, local2313.anInt5910, arg4[local12][local17 + 1]) << 8 | 0xFF;
						@Pc(2399) int local2399 = local1053.length + 6 - 2;
						@Pc(2406) int local2406 = local2399 + local1062.length - 2;
						@Pc(2413) int local2413 = local2406 + local1071.length - 2;
						@Pc(2420) int local2420 = local2413 + local2294.length - 2;
						@Pc(2435) boolean local2435 = local2007 != local211 && local1062[0] && local1053[1];
						@Pc(2454) boolean local2454 = local1024 != local2007 && local1053[0] && local2294[1];
						@Pc(2457) int[] local2457 = new int[local2420];
						@Pc(2459) byte local2459 = 0;
						@Pc(2474) boolean local2474 = local2007 != local223 && local1071[0] && local1062[1];
						@Pc(2493) boolean local2493 = local2007 != local199 && local2294[0] && local1071[1];
						@Pc(2514) int local2514 = Static55.method931(0, arg9, true, local2390, local2352, 64, arg1, local12, 0.0F, arg8, local2334, arg7, null, local2372, local17, 64, local2318);
						@Pc(2535) int local2535 = Static55.method931(0, arg9, local2435, local2390, local2352, 128, arg1, local12, 0.0F, arg8, local2334, arg7, null, local2372, local17, 0, local2318);
						@Pc(2556) int local2556 = Static55.method931(0, arg9, local2454, local2390, local2352, 128, arg1, local12, 0.0F, arg8, local2334, arg7, null, local2372, local17, 128, local2318);
						@Pc(2577) int local2577 = Static55.method931(0, arg9, local2474, local2390, local2352, 0, arg1, local12, 0.0F, arg8, local2334, arg7, null, local2372, local17, 0, local2318);
						@Pc(2598) int local2598 = Static55.method931(0, arg9, local2493, local2390, local2352, 0, arg1, local12, 0.0F, arg8, local2334, arg7, null, local2372, local17, 128, local2318);
						@Pc(2601) int local2601 = local2459 + 1;
						local2457[0] = local2514;
						@Pc(2606) int local2606 = local2601 + 1;
						local2457[1] = local2556;
						if (local1053.length > 2) {
							local2606++;
							local2457[2] = Static55.method931(0, arg9, local1053[2], local2390, local2352, 128, arg1, local12, 0.0F, arg8, local2334, arg7, null, local2372, local17, 64, local2318);
						}
						local2457[local2606++] = local2535;
						if (local1062.length > 2) {
							local2457[local2606++] = Static55.method931(0, arg9, local1062[2], local2390, local2352, 64, arg1, local12, 0.0F, arg8, local2334, arg7, null, local2372, local17, 0, local2318);
						}
						local2457[local2606++] = local2577;
						if (local1071.length > 2) {
							local2457[local2606++] = Static55.method931(0, arg9, local1071[2], local2390, local2352, 0, arg1, local12, 0.0F, arg8, local2334, arg7, null, local2372, local17, 64, local2318);
						}
						local2457[local2606++] = local2598;
						if (local2294.length > 2) {
							local2457[local2606++] = Static55.method931(0, arg9, local2294[2], local2390, local2352, 64, arg1, local12, 0.0F, arg8, local2334, arg7, null, local2372, local17, 128, local2318);
						}
						local2457[local2606++] = local2556;
						local2318.method3601(local30, local12, local17, local2457, null, true);
					}
				}
			}
		}
		for (local1144 = (Class1_Sub25) local10.method640(); local1144 != null; local1144 = (Class1_Sub25) local10.method637()) {
			if (local1144.anInt4711 == 0) {
				local1144.method4534();
			} else {
				local1144.method3604();
			}
		}
		local12 = local10.method642();
		@Pc(2805) Class1_Sub25[] local2805 = new Class1_Sub25[local12];
		@Pc(2808) long[] local2808 = new long[local12];
		local10.method639(local2805);
		for (local38 = 0; local38 < local12; local38++) {
			local2808[local38] = local2805[local38].aLong202;
		}
		Static185.method2796(local2808, local2805);
		return local2805;
	}
}
