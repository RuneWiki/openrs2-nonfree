import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!dj", name = "kb", descriptor = "I")
	public static int anInt1199;

	@OriginalMember(owner = "client!dj", name = "O", descriptor = "I")
	public static int anInt1180 = 3;

	@OriginalMember(owner = "client!dj", name = "Y", descriptor = "I")
	public static int anInt1189 = 7759444;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILclient!pk;Lclient!pk;)V")
	public static void method865(@OriginalArg(1) Class132 arg0, @OriginalArg(2) Class132 arg1) {
		Static28.aClass132_10 = arg1;
		Static124.aClass132_44 = arg0;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIBIIIIII)V")
	public static void method866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(7) int local7 = arg4 - arg3;
		@Pc(16) int local16 = (arg0 - arg1 << 16) / local7;
		@Pc(29) int local29 = arg6 - arg7;
		@Pc(38) int local38 = (arg5 - arg2 << 16) / local29;
		Static55.method892(arg7, arg2, arg1, arg3, local38, arg4, arg6, local16);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "([[B[[B[[[B[[B[[FZ[[I[[F[[B[[FI[[I)[Lclient!td;")
	public static Class8_Sub29[] method867(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(4) float[][] arg4, @OriginalArg(6) int[][] arg5, @OriginalArg(7) float[][] arg6, @OriginalArg(8) byte[][] arg7, @OriginalArg(9) float[][] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int[][] arg10) {
		@Pc(10) Class129 local10 = new Class129(128);
		@Pc(12) int local12;
		@Pc(19) int local19;
		@Pc(32) int local32;
		@Pc(40) int local40;
		@Pc(141) int local141;
		@Pc(153) int local153;
		@Pc(151) int local151;
		@Pc(163) int local163;
		@Pc(173) int local173;
		@Pc(183) int local183;
		@Pc(207) int local207;
		@Pc(195) int local195;
		@Pc(219) int local219;
		@Pc(231) int local231;
		@Pc(280) byte local280;
		@Pc(292) int local292;
		@Pc(322) int local322;
		@Pc(132) int local132;
		@Pc(139) int local139;
		@Pc(756) int local756;
		@Pc(1026) int local1026;
		@Pc(1042) boolean[] local1042;
		@Pc(1060) boolean[] local1060;
		@Pc(1069) boolean[] local1069;
		for (local12 = 1; local12 <= 102; local12++) {
			for (local19 = 1; local19 <= 102; local19++) {
				local32 = arg7[local12][local19] & 0xFF;
				local40 = arg0[local12][local19] & 0xFF;
				if (local40 != 0) {
					@Pc(52) Class140 local52 = Static272.method4047(local40 - 1);
					if (local52.anInt4601 == -1) {
						continue;
					}
					@Pc(63) Class8_Sub29 local63 = Static98.method1565(local10, local52);
					@Pc(69) byte local69 = arg1[local12][local19];
					@Pc(73) int[] local73 = Static136.anIntArrayArray13[local69];
					local63.anInt4980 += local73.length / 2;
					local63.anInt4986++;
					if (local52.aBoolean370 && local32 != 0) {
						local63.anInt4980 += Static118.anIntArray192[local69];
					}
				}
				if ((arg7[local12][local19] & 0xFF) != 0 || local40 != 0 && arg1[local12][local19] == 0) {
					local132 = 0;
					@Pc(135) int[] local135 = new int[8];
					@Pc(137) int local137 = 0;
					local139 = 0;
					local141 = 0;
					local151 = arg0[local12][local19 + 1] & 0xFF;
					local153 = 0;
					local163 = arg0[local12 - 1][local19] & 0xFF;
					local173 = arg0[local12][local19 - 1] & 0xFF;
					local183 = arg0[local12 + 1][local19] & 0xFF;
					local195 = arg0[local12 - 1][local19 - 1] & 0xFF;
					local207 = arg0[local12 - 1][local19 + 1] & 0xFF;
					local219 = arg0[local12 + 1][local19 - 1] & 0xFF;
					local231 = arg0[local12 + 1][local19 + 1] & 0xFF;
					@Pc(249) Class140 local249;
					@Pc(270) byte local270;
					@Pc(304) int local304;
					if (local207 != 0 && local207 != local40) {
						local249 = Static272.method4047(local207 - 1);
						if (local249.aBoolean370 && local249.anInt4601 != -1) {
							local270 = arg3[local12 - 1][local19 + 1];
							local280 = arg1[local12 - 1][local19 + 1];
							local292 = Static19.anIntArray35[(local270 + 3 & 0x3) + local280 * 4];
							local304 = Static19.anIntArray35[local280 * 4 + (local270 + 2 & 0x3)];
							if (!Static33.aBooleanArrayArray1[local292][1] || !Static33.aBooleanArrayArray1[local304][0]) {
								for (local322 = 0; local322 < 8; local322++) {
									if (local322 == 0) {
										local132++;
										local135[0] = local207;
										break;
									}
									if (local135[local322] == local207) {
										break;
									}
								}
							}
						}
					}
					if (local195 != 0 && local195 != local40) {
						local249 = Static272.method4047(local195 - 1);
						if (local249.aBoolean370 && local249.anInt4601 != -1) {
							local270 = arg3[local12 - 1][local19 - 1];
							local280 = arg1[local12 - 1][local19 - 1];
							local304 = Static19.anIntArray35[(local270 & 0x3) + local280 * 4];
							local292 = Static19.anIntArray35[local280 * 4 + (local270 + 3 & 0x3)];
							if (!Static33.aBooleanArrayArray1[local304][1] || !Static33.aBooleanArrayArray1[local292][0]) {
								for (local322 = 0; local322 < 8; local322++) {
									if (local132 == local322) {
										local135[local132++] = local195;
										break;
									}
									if (local135[local322] == local195) {
										break;
									}
								}
							}
						}
					}
					if (local219 != 0 && local219 != local40) {
						local249 = Static272.method4047(local219 - 1);
						if (local249.aBoolean370 && local249.anInt4601 != -1) {
							local270 = arg3[local12 + 1][local19 - 1];
							local280 = arg1[local12 + 1][local19 - 1];
							local304 = Static19.anIntArray35[local280 * 4 + (local270 & 0x3)];
							local292 = Static19.anIntArray35[(local270 + 1 & 0x3) + local280 * 4];
							if (!Static33.aBooleanArrayArray1[local292][1] || !Static33.aBooleanArrayArray1[local304][0]) {
								for (local322 = 0; local322 < 8; local322++) {
									if (local322 == local132) {
										local135[local132++] = local219;
										break;
									}
									if (local135[local322] == local219) {
										break;
									}
								}
							}
						}
					}
					if (local231 != 0 && local231 != local40) {
						local249 = Static272.method4047(local231 - 1);
						if (local249.aBoolean370 && local249.anInt4601 != -1) {
							local270 = arg3[local12 + 1][local19 + 1];
							local280 = arg1[local12 + 1][local19 + 1];
							local304 = Static19.anIntArray35[(local270 + 2 & 0x3) + local280 * 4];
							local292 = Static19.anIntArray35[(local270 + 1 & 0x3) + local280 * 4];
							if (!Static33.aBooleanArrayArray1[local304][1] || !Static33.aBooleanArrayArray1[local292][0]) {
								for (local322 = 0; local322 < 8; local322++) {
									if (local322 == local132) {
										local135[local132++] = local231;
										break;
									}
									if (local231 == local135[local322]) {
										break;
									}
								}
							}
						}
					}
					if (local151 != 0 && local151 != local40) {
						local249 = Static272.method4047(local151 - 1);
						if (local249.aBoolean370 && local249.anInt4601 != -1) {
							local137 = Static19.anIntArray35[(arg3[local12][local19 + 1] + 2 & 0x3) + arg1[local12][local19 + 1] * 4];
							for (local756 = 0; local756 < 8; local756++) {
								if (local132 == local756) {
									local135[local132++] = local151;
									break;
								}
								if (local135[local756] == local151) {
									break;
								}
							}
						}
					}
					if (local163 != 0 && local163 != local40) {
						local249 = Static272.method4047(local163 - 1);
						if (local249.aBoolean370 && local249.anInt4601 != -1) {
							local139 = Static19.anIntArray35[arg1[local12 - 1][local19] * 4 + (arg3[local12 - 1][local19] + 3 & 0x3)];
							for (local756 = 0; local756 < 8; local756++) {
								if (local132 == local756) {
									local135[local132++] = local163;
									break;
								}
								if (local163 == local135[local756]) {
									break;
								}
							}
						}
					}
					if (local173 != 0 && local40 != local173) {
						local249 = Static272.method4047(local173 - 1);
						if (local249.aBoolean370 && local249.anInt4601 != -1) {
							local141 = Static19.anIntArray35[(arg3[local12][local19 - 1] & 0x3) + arg1[local12][local19 - 1] * 4];
							for (local756 = 0; local756 < 8; local756++) {
								if (local756 == local132) {
									local135[local132++] = local173;
									break;
								}
								if (local173 == local135[local756]) {
									break;
								}
							}
						}
					}
					if (local183 != 0 && local40 != local183) {
						local249 = Static272.method4047(local183 - 1);
						if (local249.aBoolean370 && local249.anInt4601 != -1) {
							local153 = Static19.anIntArray35[arg1[local12 + 1][local19] * 4 + (arg3[local12 + 1][local19] + 1 & 0x3)];
							for (local756 = 0; local756 < 8; local756++) {
								if (local756 == local132) {
									local135[local132++] = local183;
									break;
								}
								if (local135[local756] == local183) {
									break;
								}
							}
						}
					}
					for (local1026 = 0; local1026 < local132; local1026++) {
						local756 = local135[local1026];
						local1042 = Static33.aBooleanArrayArray1[local163 == local756 ? local139 : 0];
						@Pc(1051) boolean[] local1051 = Static33.aBooleanArrayArray1[local756 == local151 ? local137 : 0];
						local1060 = Static33.aBooleanArrayArray1[local756 == local173 ? local141 : 0];
						local1069 = Static33.aBooleanArrayArray1[local756 == local183 ? local153 : 0];
						@Pc(1075) Class140 local1075 = Static272.method4047(local756 - 1);
						@Pc(1080) Class8_Sub29 local1080 = Static98.method1565(local10, local1075);
						local1080.anInt4980 += 5;
						local1080.anInt4980 += local1051.length - 2;
						local1080.anInt4980 += local1042.length - 2;
						local1080.anInt4980 += local1060.length - 2;
						local1080.anInt4980 += local1069.length - 2;
						local1080.anInt4986++;
					}
				}
			}
		}
		@Pc(1142) Class8_Sub29 local1142;
		for (local1142 = (Class8_Sub29) local10.method3035(); local1142 != null; local1142 = (Class8_Sub29) local10.method3048()) {
			local1142.method3783();
		}
		for (local12 = 1; local12 <= 102; local12++) {
			for (local19 = 1; local19 <= 102; local19++) {
				local40 = arg7[local12][local19] & 0xFF;
				local132 = arg0[local12][local19] & 0xFF;
				if ((arg2[arg9][local12][local19] & 0x8) != 0) {
					local32 = 0;
				} else if ((arg2[1][local12][local19] & 0x2) == 2 && arg9 > 0) {
					local32 = arg9 - 1;
				} else {
					local32 = arg9;
				}
				if (local132 != 0) {
					@Pc(1231) Class140 local1231 = Static272.method4047(local132 - 1);
					if (local1231.anInt4601 == -1) {
						continue;
					}
					@Pc(1244) Class8_Sub29 local1244 = Static98.method1565(local10, local1231);
					@Pc(1250) byte local1250 = arg1[local12][local19];
					@Pc(1256) byte local1256 = arg3[local12][local19];
					local153 = Static4.method37(local1231.anInt4598, arg5[local12][local19], local1231.anInt4601);
					local151 = Static4.method37(local1231.anInt4598, arg5[local12 + 1][local19], local1231.anInt4601);
					local163 = Static4.method37(local1231.anInt4598, arg5[local12 + 1][local19 + 1], local1231.anInt4601);
					local173 = Static4.method37(local1231.anInt4598, arg5[local12][local19 + 1], local1231.anInt4601);
					Static42.method669(local40 != 0 && local1231.aBoolean370, arg8, local1250, local153, local173, local151, arg4, arg10, local12, local19, local163, local32, local1256, local1244, arg6);
				}
				if ((arg7[local12][local19] & 0xFF) != 0 || local132 != 0 && arg1[local12][local19] == 0) {
					@Pc(1362) int[] local1362 = new int[8];
					@Pc(1364) int local1364 = 0;
					local141 = 0;
					local139 = 0;
					local153 = 0;
					local151 = 0;
					local163 = arg0[local12][local19 + 1] & 0xFF;
					local183 = arg0[local12][local19 - 1] & 0xFF;
					local173 = arg0[local12 - 1][local19] & 0xFF;
					local207 = arg0[local12 + 1][local19] & 0xFF;
					local195 = arg0[local12 - 1][local19 + 1] & 0xFF;
					local219 = arg0[local12 - 1][local19 - 1] & 0xFF;
					local231 = arg0[local12 + 1][local19 - 1] & 0xFF;
					local1026 = arg0[local12 + 1][local19 + 1] & 0xFF;
					@Pc(1504) byte local1504;
					@Pc(1475) Class140 local1475;
					@Pc(1547) int local1547;
					if (local195 == 0 || local132 == local195) {
						local195 = 0;
					} else {
						local1475 = Static272.method4047(local195 - 1);
						if (local1475.aBoolean370 && local1475.anInt4601 != -1) {
							local280 = arg3[local12 - 1][local19 + 1];
							local1504 = arg1[local12 - 1][local19 + 1];
							local292 = Static19.anIntArray35[(local280 + 2 & 0x3) + local1504 * 4];
							local322 = Static19.anIntArray35[local1504 * 4 + (local280 + 3 & 0x3)];
							if (Static33.aBooleanArrayArray1[local322][1] && Static33.aBooleanArrayArray1[local292][0]) {
								local195 = 0;
							} else {
								for (local1547 = 0; local1547 < 8; local1547++) {
									if (local1547 == 0) {
										local1364++;
										local1362[0] = local195;
										break;
									}
									if (local1362[local1547] == local195) {
										break;
									}
								}
							}
						} else {
							local195 = 0;
						}
					}
					if (local219 == 0 || local132 == local219) {
						local219 = 0;
					} else {
						local1475 = Static272.method4047(local219 - 1);
						if (local1475.aBoolean370 && local1475.anInt4601 != -1) {
							local280 = arg3[local12 - 1][local19 - 1];
							local1504 = arg1[local12 - 1][local19 - 1];
							local292 = Static19.anIntArray35[local1504 * 4 + (local280 & 0x3)];
							local322 = Static19.anIntArray35[(local280 + 3 & 0x3) + local1504 * 4];
							if (Static33.aBooleanArrayArray1[local292][1] && Static33.aBooleanArrayArray1[local322][0]) {
								local219 = 0;
							} else {
								for (local1547 = 0; local1547 < 8; local1547++) {
									if (local1547 == local1364) {
										local1362[local1364++] = local219;
										break;
									}
									if (local1362[local1547] == local219) {
										break;
									}
								}
							}
						} else {
							local219 = 0;
						}
					}
					if (local231 == 0 || local231 == local132) {
						local231 = 0;
					} else {
						local1475 = Static272.method4047(local231 - 1);
						if (local1475.aBoolean370 && local1475.anInt4601 != -1) {
							local280 = arg3[local12 + 1][local19 - 1];
							local1504 = arg1[local12 + 1][local19 - 1];
							local322 = Static19.anIntArray35[(local280 + 1 & 0x3) + local1504 * 4];
							local292 = Static19.anIntArray35[(local280 & 0x3) + local1504 * 4];
							if (Static33.aBooleanArrayArray1[local322][1] && Static33.aBooleanArrayArray1[local292][0]) {
								local231 = 0;
							} else {
								for (local1547 = 0; local1547 < 8; local1547++) {
									if (local1547 == local1364) {
										local1362[local1364++] = local231;
										break;
									}
									if (local1362[local1547] == local231) {
										break;
									}
								}
							}
						} else {
							local231 = 0;
						}
					}
					if (local1026 == 0 || local132 == local1026) {
						local1026 = 0;
					} else {
						local1475 = Static272.method4047(local1026 - 1);
						if (local1475.aBoolean370 && local1475.anInt4601 != -1) {
							local280 = arg3[local12 + 1][local19 + 1];
							local1504 = arg1[local12 + 1][local19 + 1];
							local292 = Static19.anIntArray35[local1504 * 4 + (local280 + 2 & 0x3)];
							local322 = Static19.anIntArray35[local1504 * 4 + (local280 + 1 & 0x3)];
							if (Static33.aBooleanArrayArray1[local292][1] && Static33.aBooleanArrayArray1[local322][0]) {
								local1026 = 0;
							} else {
								for (local1547 = 0; local1547 < 8; local1547++) {
									if (local1547 == local1364) {
										local1362[local1364++] = local1026;
										break;
									}
									if (local1026 == local1362[local1547]) {
										break;
									}
								}
							}
						} else {
							local1026 = 0;
						}
					}
					@Pc(1976) int local1976;
					if (local163 != 0 && local132 != local163) {
						local1475 = Static272.method4047(local163 - 1);
						if (local1475.aBoolean370 && local1475.anInt4601 != -1) {
							local139 = Static19.anIntArray35[(arg3[local12][local19 + 1] + 2 & 0x3) + arg1[local12][local19 + 1] * 4];
							for (local1976 = 0; local1976 < 8; local1976++) {
								if (local1976 == local1364) {
									local1362[local1364++] = local163;
									break;
								}
								if (local163 == local1362[local1976]) {
									break;
								}
							}
						}
					}
					if (local173 != 0 && local173 != local132) {
						local1475 = Static272.method4047(local173 - 1);
						if (local1475.aBoolean370 && local1475.anInt4601 != -1) {
							local141 = Static19.anIntArray35[arg1[local12 - 1][local19] * 4 + (arg3[local12 - 1][local19] + 3 & 0x3)];
							for (local1976 = 0; local1976 < 8; local1976++) {
								if (local1976 == local1364) {
									local1362[local1364++] = local173;
									break;
								}
								if (local1362[local1976] == local173) {
									break;
								}
							}
						}
					}
					if (local183 != 0 && local132 != local183) {
						local1475 = Static272.method4047(local183 - 1);
						if (local1475.aBoolean370 && local1475.anInt4601 != -1) {
							local153 = Static19.anIntArray35[arg1[local12][local19 - 1] * 4 + (arg3[local12][local19 - 1] & 0x3)];
							for (local1976 = 0; local1976 < 8; local1976++) {
								if (local1364 == local1976) {
									local1362[local1364++] = local183;
									break;
								}
								if (local183 == local1362[local1976]) {
									break;
								}
							}
						}
					}
					if (local207 != 0 && local132 != local207) {
						local1475 = Static272.method4047(local207 - 1);
						if (local1475.aBoolean370 && local1475.anInt4601 != -1) {
							local151 = Static19.anIntArray35[(arg3[local12 + 1][local19] + 1 & 0x3) + arg1[local12 + 1][local19] * 4];
							for (local1976 = 0; local1976 < 8; local1976++) {
								if (local1976 == local1364) {
									local1362[local1364++] = local207;
									break;
								}
								if (local1362[local1976] == local207) {
									break;
								}
							}
						}
					}
					for (local756 = 0; local756 < local1364; local756++) {
						local1976 = local1362[local756];
						local1060 = Static33.aBooleanArrayArray1[local1976 == local173 ? local141 : 0];
						@Pc(2271) boolean[] local2271 = Static33.aBooleanArrayArray1[local207 == local1976 ? local151 : 0];
						local1069 = Static33.aBooleanArrayArray1[local1976 == local183 ? local153 : 0];
						local1042 = Static33.aBooleanArrayArray1[local163 == local1976 ? local139 : 0];
						@Pc(2295) Class140 local2295 = Static272.method4047(local1976 - 1);
						@Pc(2300) Class8_Sub29 local2300 = Static98.method1565(local10, local2295);
						@Pc(2316) int local2316 = Static4.method37(local2295.anInt4598, arg5[local12][local19], local2295.anInt4601) << 8 | 0xFF;
						@Pc(2334) int local2334 = Static4.method37(local2295.anInt4598, arg5[local12 + 1][local19], local2295.anInt4601) << 8 | 0xFF;
						@Pc(2354) int local2354 = Static4.method37(local2295.anInt4598, arg5[local12 + 1][local19 + 1], local2295.anInt4601) << 8 | 0xFF;
						@Pc(2372) int local2372 = Static4.method37(local2295.anInt4598, arg5[local12][local19 + 1], local2295.anInt4601) << 8 | 0xFF;
						@Pc(2381) int local2381 = local1042.length + 6 - 2;
						@Pc(2388) int local2388 = local2381 + local1060.length - 2;
						@Pc(2395) int local2395 = local2388 + local1069.length - 2;
						@Pc(2414) boolean local2414 = local1026 != local1976 && local1042[0] && local2271[1];
						@Pc(2421) int local2421 = local2395 + local2271.length - 2;
						@Pc(2424) int[] local2424 = new int[local2421];
						@Pc(2443) boolean local2443 = local195 != local1976 && local1060[0] && local1042[1];
						@Pc(2445) byte local2445 = 0;
						@Pc(2464) boolean local2464 = local1976 != local231 && local2271[0] && local1069[1];
						@Pc(2479) boolean local2479 = local219 != local1976 && local1069[0] && local1060[1];
						@Pc(2500) int local2500 = Static22.method400(local2354, local2372, 0.0F, arg6, local2300, local19, local2334, 64, 64, null, arg10, 0, true, local12, arg8, arg4, local2316);
						@Pc(2521) int local2521 = Static22.method400(local2354, local2372, 0.0F, arg6, local2300, local19, local2334, 128, 0, null, arg10, 0, local2443, local12, arg8, arg4, local2316);
						@Pc(2542) int local2542 = Static22.method400(local2354, local2372, 0.0F, arg6, local2300, local19, local2334, 128, 128, null, arg10, 0, local2414, local12, arg8, arg4, local2316);
						@Pc(2563) int local2563 = Static22.method400(local2354, local2372, 0.0F, arg6, local2300, local19, local2334, 0, 0, null, arg10, 0, local2479, local12, arg8, arg4, local2316);
						@Pc(2584) int local2584 = Static22.method400(local2354, local2372, 0.0F, arg6, local2300, local19, local2334, 0, 128, null, arg10, 0, local2464, local12, arg8, arg4, local2316);
						@Pc(2587) int local2587 = local2445 + 1;
						local2424[0] = local2500;
						@Pc(2592) int local2592 = local2587 + 1;
						local2424[1] = local2542;
						if (local1042.length > 2) {
							local2592++;
							local2424[2] = Static22.method400(local2354, local2372, 0.0F, arg6, local2300, local19, local2334, 128, 64, null, arg10, 0, local1042[2], local12, arg8, arg4, local2316);
						}
						local2424[local2592++] = local2521;
						if (local1060.length > 2) {
							local2424[local2592++] = Static22.method400(local2354, local2372, 0.0F, arg6, local2300, local19, local2334, 64, 0, null, arg10, 0, local1060[2], local12, arg8, arg4, local2316);
						}
						local2424[local2592++] = local2563;
						if (local1069.length > 2) {
							local2424[local2592++] = Static22.method400(local2354, local2372, 0.0F, arg6, local2300, local19, local2334, 0, 64, null, arg10, 0, local1069[2], local12, arg8, arg4, local2316);
						}
						local2424[local2592++] = local2584;
						if (local2271.length > 2) {
							local2424[local2592++] = Static22.method400(local2354, local2372, 0.0F, arg6, local2300, local19, local2334, 64, 128, null, arg10, 0, local2271[2], local12, arg8, arg4, local2316);
						}
						local2424[local2592++] = local2542;
						local2300.method3784(local32, local12, local19, local2424, null, true);
					}
				}
			}
		}
		for (local1142 = (Class8_Sub29) local10.method3035(); local1142 != null; local1142 = (Class8_Sub29) local10.method3048()) {
			if (local1142.anInt4985 == 0) {
				local1142.method4273();
			} else {
				local1142.method3786();
			}
		}
		local12 = local10.method3040();
		@Pc(2793) long[] local2793 = new long[local12];
		@Pc(2796) Class8_Sub29[] local2796 = new Class8_Sub29[local12];
		local10.method3045(local2796);
		for (local40 = 0; local40 < local12; local40++) {
			local2793[local40] = local2796[local40].aLong203;
		}
		Static289.method4261(local2796, local2793);
		return local2796;
	}

	@OriginalMember(owner = "client!dj", name = "g", descriptor = "(I)Lclient!wd;")
	public static Class8_Sub1_Sub7 method869() {
		@Pc(14) int local14 = Static92.anIntArray130[0] * Static135.anIntArray225[0];
		@Pc(22) byte[] local22 = Static232.aByteArrayArray15[0];
		@Pc(25) int[] local25 = new int[local14];
		for (@Pc(27) int local27 = 0; local27 < local14; local27++) {
			local25[local27] = Static147.anIntArray236[local22[local27] & 0xFF];
		}
		@Pc(68) Class8_Sub1_Sub7 local68;
		if (Static116.aBoolean188) {
			local68 = new Class8_Sub1_Sub7_Sub2(Static97.anInt1999, Static290.anInt5656, Static25.anIntArray45[0], Static225.anIntArray345[0], Static92.anIntArray130[0], Static135.anIntArray225[0], local25);
		} else {
			local68 = new Class8_Sub1_Sub7_Sub1(Static97.anInt1999, Static290.anInt5656, Static25.anIntArray45[0], Static225.anIntArray345[0], Static92.anIntArray130[0], Static135.anIntArray225[0], local25);
		}
		Static147.method2386();
		return local68;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method870(@OriginalArg(1) String arg0) {
		System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILclient!bk;IILjava/awt/Component;)Lclient!nb;")
	public static Class111 method871(@OriginalArg(0) int arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Component arg3) {
		if (Static264.anInt5577 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(34) Class111 local34 = (Class111) Class.forName("Class111_Sub1").getDeclaredConstructor().newInstance();
			local34.anInt5514 = arg0;
			local34.anIntArray473 = new int[(Static81.aBoolean130 ? 2 : 1) * 256];
			local34.method4152(arg3);
			local34.anInt5516 = (arg0 & 0xFFFFFC00) + 1024;
			if (local34.anInt5516 > 16384) {
				local34.anInt5516 = 16384;
			}
			local34.method4139(local34.anInt5516);
			if (Static75.anInt1613 > 0 && Static246.aClass154_1 == null) {
				Static246.aClass154_1 = new Class154();
				Static246.aClass154_1.aClass17_4 = arg1;
				arg1.method449(Static246.aClass154_1, Static75.anInt1613);
			}
			if (Static246.aClass154_1 != null) {
				if (Static246.aClass154_1.aClass111Array1[arg2] != null) {
					throw new IllegalArgumentException();
				}
				Static246.aClass154_1.aClass111Array1[arg2] = local34;
			}
			return local34;
		} catch (@Pc(108) Throwable local108) {
			try {
				@Pc(114) Class111_Sub2 local114 = new Class111_Sub2(arg1, arg2);
				local114.anIntArray473 = new int[(Static81.aBoolean130 ? 2 : 1) * 256];
				local114.anInt5514 = arg0;
				local114.method4152(arg3);
				local114.anInt5516 = 16384;
				local114.method4139(local114.anInt5516);
				if (Static75.anInt1613 > 0 && Static246.aClass154_1 == null) {
					Static246.aClass154_1 = new Class154();
					Static246.aClass154_1.aClass17_4 = arg1;
					arg1.method449(Static246.aClass154_1, Static75.anInt1613);
				}
				if (Static246.aClass154_1 != null) {
					if (Static246.aClass154_1.aClass111Array1[arg2] != null) {
						throw new IllegalArgumentException();
					}
					Static246.aClass154_1.aClass111Array1[arg2] = local114;
				}
				return local114;
			} catch (@Pc(177) Throwable local177) {
				return new Class111();
			}
		}
	}

	@OriginalMember(owner = "client!dj", name = "h", descriptor = "(I)V")
	public static void method872() {
		@Pc(10) int local10 = Static275.aClass8_Sub2_Sub1_6.method2390(8);
		@Pc(15) int local15;
		if (Static61.anInt1336 > local10) {
			for (local15 = local10; local15 < Static61.anInt1336; local15++) {
				Static171.anIntArray257[Static298.anInt354++] = Static85.anIntArray123[local15];
			}
		}
		if (Static61.anInt1336 < local10) {
			throw new RuntimeException("gppov1");
		}
		Static61.anInt1336 = 0;
		for (local15 = 0; local15 < local10; local15++) {
			@Pc(60) int local60 = Static85.anIntArray123[local15];
			@Pc(64) Class36_Sub3_Sub1 local64 = Static230.aClass36_Sub3_Sub1Array1[local60];
			@Pc(69) int local69 = Static275.aClass8_Sub2_Sub1_6.method2390(1);
			if (local69 == 0) {
				Static85.anIntArray123[Static61.anInt1336++] = local60;
				local64.anInt4119 = Static183.anInt3590;
			} else {
				@Pc(92) int local92 = Static275.aClass8_Sub2_Sub1_6.method2390(2);
				if (local92 == 0) {
					Static85.anIntArray123[Static61.anInt1336++] = local60;
					local64.anInt4119 = Static183.anInt3590;
					Static171.anIntArray259[Static291.anInt3609++] = local60;
				} else {
					@Pc(137) int local137;
					@Pc(147) int local147;
					if (local92 == 1) {
						Static85.anIntArray123[Static61.anInt1336++] = local60;
						local64.anInt4119 = Static183.anInt3590;
						local137 = Static275.aClass8_Sub2_Sub1_6.method2390(3);
						local64.method3107(local137, 1);
						local147 = Static275.aClass8_Sub2_Sub1_6.method2390(1);
						if (local147 == 1) {
							Static171.anIntArray259[Static291.anInt3609++] = local60;
						}
					} else if (local92 == 2) {
						Static85.anIntArray123[Static61.anInt1336++] = local60;
						local64.anInt4119 = Static183.anInt3590;
						if (Static275.aClass8_Sub2_Sub1_6.method2390(1) == 1) {
							local137 = Static275.aClass8_Sub2_Sub1_6.method2390(3);
							local64.method3107(local137, 2);
							local147 = Static275.aClass8_Sub2_Sub1_6.method2390(3);
							local64.method3107(local147, 2);
						} else {
							local137 = Static275.aClass8_Sub2_Sub1_6.method2390(3);
							local64.method3107(local137, 0);
						}
						local137 = Static275.aClass8_Sub2_Sub1_6.method2390(1);
						if (local137 == 1) {
							Static171.anIntArray259[Static291.anInt3609++] = local60;
						}
					} else if (local92 == 3) {
						Static171.anIntArray257[Static298.anInt354++] = local60;
					}
				}
			}
		}
	}
}
