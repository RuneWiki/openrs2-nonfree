import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "[Lclient!fh;")
	public static Class54[] aClass54Array1 = new Class54[6];

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "([[F[[FI[[I[[F[[B[[B[[B[[I[[B[[[BB)[Lclient!mi;")
	public static Class3_Sub21[] method4756(@OriginalArg(0) float[][] arg0, @OriginalArg(1) float[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) float[][] arg4, @OriginalArg(5) byte[][] arg5, @OriginalArg(6) byte[][] arg6, @OriginalArg(7) byte[][] arg7, @OriginalArg(8) int[][] arg8, @OriginalArg(9) byte[][] arg9, @OriginalArg(10) byte[][][] arg10) {
		@Pc(6) Class30 local6 = new Class30(128);
		@Pc(8) int local8;
		@Pc(23) int local23;
		@Pc(36) int local36;
		@Pc(44) int local44;
		@Pc(53) Class183 local53;
		@Pc(65) Class3_Sub21 local65;
		@Pc(71) byte local71;
		@Pc(135) int local135;
		@Pc(137) int local137;
		@Pc(147) int local147;
		@Pc(159) int local159;
		@Pc(169) int local169;
		@Pc(191) int local191;
		@Pc(181) int local181;
		@Pc(215) int local215;
		@Pc(203) int local203;
		@Pc(227) int local227;
		@Pc(243) Class183 local243;
		@Pc(261) byte local261;
		@Pc(271) byte local271;
		@Pc(296) int local296;
		@Pc(283) int local283;
		@Pc(310) int local310;
		@Pc(1085) Class183 local1085;
		@Pc(1090) Class3_Sub21 local1090;
		@Pc(133) int local133;
		@Pc(129) int[] local129;
		@Pc(149) int local149;
		@Pc(131) int local131;
		@Pc(757) int local757;
		@Pc(1024) int local1024;
		@Pc(1057) boolean[] local1057;
		@Pc(1044) boolean[] local1044;
		@Pc(1079) boolean[] local1079;
		@Pc(1070) boolean[] local1070;
		for (local8 = 1; local8 <= 102; local8++) {
			for (local23 = 1; local23 <= 102; local23++) {
				local36 = arg5[local8][local23] & 0xFF;
				local44 = arg7[local8][local23] & 0xFF;
				if (local44 != 0) {
					local53 = Static278.method4188(local44 - 1);
					if (local53.anInt5777 == -1) {
						continue;
					}
					local65 = Static75.method1160(local53, local6);
					local71 = arg6[local8][local23];
					@Pc(75) int[] local75 = Static29.anIntArrayArray5[local71];
					local65.anInt3241 += local75.length / 2;
					local65.anInt3243++;
					if (local53.aBoolean413 && local36 != 0) {
						local65.anInt3241 += Static90.anIntArray160[local71];
					}
				}
				if ((arg5[local8][local23] & 0xFF) != 0 || local44 != 0 && arg6[local8][local23] == 0) {
					local129 = new int[8];
					local131 = 0;
					local133 = 0;
					local135 = 0;
					local137 = 0;
					local147 = arg7[local8][local23 + 1] & 0xFF;
					local149 = 0;
					local159 = arg7[local8 - 1][local23] & 0xFF;
					local169 = arg7[local8][local23 - 1] & 0xFF;
					local181 = arg7[local8 - 1][local23 + 1] & 0xFF;
					local191 = arg7[local8 + 1][local23] & 0xFF;
					local203 = arg7[local8 + 1][local23 - 1] & 0xFF;
					local215 = arg7[local8 - 1][local23 - 1] & 0xFF;
					local227 = arg7[local8 + 1][local23 + 1] & 0xFF;
					if (local181 != 0 && local44 != local181) {
						local243 = Static278.method4188(local181 - 1);
						if (local243.aBoolean413 && local243.anInt5777 != -1) {
							local261 = arg9[local8 - 1][local23 + 1];
							local271 = arg6[local8 - 1][local23 + 1];
							local283 = Static93.anIntArray163[local271 * 4 + (local261 + 3 & 0x3)];
							local296 = Static93.anIntArray163[local271 * 4 + (local261 + 2 & 0x3)];
							if (!Static11.aBooleanArrayArray9[local283][1] || !Static11.aBooleanArrayArray9[local296][0]) {
								for (local310 = 0; local310 < 8; local310++) {
									if (local310 == 0) {
										local133++;
										local129[0] = local181;
										break;
									}
									if (local181 == local129[local310]) {
										break;
									}
								}
							}
						}
					}
					if (local215 != 0 && local215 != local44) {
						local243 = Static278.method4188(local215 - 1);
						if (local243.aBoolean413 && local243.anInt5777 != -1) {
							local261 = arg9[local8 - 1][local23 - 1];
							local271 = arg6[local8 - 1][local23 - 1];
							local283 = Static93.anIntArray163[local271 * 4 + (local261 + 3 & 0x3)];
							local296 = Static93.anIntArray163[local271 * 4 + (local261 & 0x3)];
							if (!Static11.aBooleanArrayArray9[local296][1] || !Static11.aBooleanArrayArray9[local283][0]) {
								for (local310 = 0; local310 < 8; local310++) {
									if (local310 == local133) {
										local129[local133++] = local215;
										break;
									}
									if (local129[local310] == local215) {
										break;
									}
								}
							}
						}
					}
					if (local203 != 0 && local203 != local44) {
						local243 = Static278.method4188(local203 - 1);
						if (local243.aBoolean413 && local243.anInt5777 != -1) {
							local261 = arg9[local8 + 1][local23 - 1];
							local271 = arg6[local8 + 1][local23 - 1];
							local296 = Static93.anIntArray163[(local261 & 0x3) + local271 * 4];
							local283 = Static93.anIntArray163[(local261 + 1 & 0x3) + local271 * 4];
							if (!Static11.aBooleanArrayArray9[local283][1] || !Static11.aBooleanArrayArray9[local296][0]) {
								for (local310 = 0; local310 < 8; local310++) {
									if (local310 == local133) {
										local129[local133++] = local203;
										break;
									}
									if (local129[local310] == local203) {
										break;
									}
								}
							}
						}
					}
					if (local227 != 0 && local44 != local227) {
						local243 = Static278.method4188(local227 - 1);
						if (local243.aBoolean413 && local243.anInt5777 != -1) {
							local271 = arg6[local8 + 1][local23 + 1];
							local261 = arg9[local8 + 1][local23 + 1];
							local283 = Static93.anIntArray163[local271 * 4 + (local261 + 1 & 0x3)];
							local296 = Static93.anIntArray163[local271 * 4 + (local261 + 2 & 0x3)];
							if (!Static11.aBooleanArrayArray9[local296][1] || !Static11.aBooleanArrayArray9[local283][0]) {
								for (local310 = 0; local310 < 8; local310++) {
									if (local310 == local133) {
										local129[local133++] = local227;
										break;
									}
									if (local227 == local129[local310]) {
										break;
									}
								}
							}
						}
					}
					if (local147 != 0 && local147 != local44) {
						local243 = Static278.method4188(local147 - 1);
						if (local243.aBoolean413 && local243.anInt5777 != -1) {
							local149 = Static93.anIntArray163[arg6[local8][local23 + 1] * 4 + (arg9[local8][local23 + 1] + 2 & 0x3)];
							for (local757 = 0; local757 < 8; local757++) {
								if (local133 == local757) {
									local129[local133++] = local147;
									break;
								}
								if (local129[local757] == local147) {
									break;
								}
							}
						}
					}
					if (local159 != 0 && local44 != local159) {
						local243 = Static278.method4188(local159 - 1);
						if (local243.aBoolean413 && local243.anInt5777 != -1) {
							local131 = Static93.anIntArray163[(arg9[local8 - 1][local23] + 3 & 0x3) + arg6[local8 - 1][local23] * 4];
							for (local757 = 0; local757 < 8; local757++) {
								if (local133 == local757) {
									local129[local133++] = local159;
									break;
								}
								if (local129[local757] == local159) {
									break;
								}
							}
						}
					}
					if (local169 != 0 && local44 != local169) {
						local243 = Static278.method4188(local169 - 1);
						if (local243.aBoolean413 && local243.anInt5777 != -1) {
							local135 = Static93.anIntArray163[arg6[local8][local23 - 1] * 4 + (arg9[local8][local23 - 1] & 0x3)];
							for (local757 = 0; local757 < 8; local757++) {
								if (local133 == local757) {
									local129[local133++] = local169;
									break;
								}
								if (local129[local757] == local169) {
									break;
								}
							}
						}
					}
					if (local191 != 0 && local191 != local44) {
						local243 = Static278.method4188(local191 - 1);
						if (local243.aBoolean413 && local243.anInt5777 != -1) {
							local137 = Static93.anIntArray163[arg6[local8 + 1][local23] * 4 + (arg9[local8 + 1][local23] + 1 & 0x3)];
							for (local757 = 0; local757 < 8; local757++) {
								if (local757 == local133) {
									local129[local133++] = local191;
									break;
								}
								if (local191 == local129[local757]) {
									break;
								}
							}
						}
					}
					for (local1024 = 0; local1024 < local133; local1024++) {
						local757 = local129[local1024];
						local1044 = Static11.aBooleanArrayArray9[local159 == local757 ? local131 : 0];
						local1057 = Static11.aBooleanArrayArray9[local757 == local147 ? local149 : 0];
						local1070 = Static11.aBooleanArrayArray9[local191 == local757 ? local137 : 0];
						local1079 = Static11.aBooleanArrayArray9[local757 == local169 ? local135 : 0];
						local1085 = Static278.method4188(local757 - 1);
						local1090 = Static75.method1160(local1085, local6);
						local1090.anInt3241 += 5;
						local1090.anInt3241 += local1057.length - 2;
						local1090.anInt3241 += local1044.length - 2;
						local1090.anInt3241 += local1079.length - 2;
						local1090.anInt3241 += local1070.length - 2;
						local1090.anInt3243++;
					}
				}
			}
		}
		@Pc(1152) Class3_Sub21 local1152;
		for (local1152 = (Class3_Sub21) local6.method664(); local1152 != null; local1152 = (Class3_Sub21) local6.method671()) {
			local1152.method2857();
		}
		for (local8 = 1; local8 <= 102; local8++) {
			for (@Pc(1176) int local1176 = 1; local1176 <= 102; local1176++) {
				if ((arg10[arg2][local8][local1176] & 0x8) != 0) {
					local23 = 0;
				} else if ((arg10[1][local8][local1176] & 0x2) == 2 && arg2 > 0) {
					local23 = arg2 - 1;
				} else {
					local23 = arg2;
				}
				local36 = arg5[local8][local1176] & 0xFF;
				local44 = arg7[local8][local1176] & 0xFF;
				if (local44 != 0) {
					local53 = Static278.method4188(local44 - 1);
					if (local53.anInt5777 == -1) {
						continue;
					}
					local65 = Static75.method1160(local53, local6);
					@Pc(1263) byte local1263 = arg9[local8][local1176];
					local71 = arg6[local8][local1176];
					local135 = Static94.method1388(arg8[local8][local1176], local53.anInt5780, local53.anInt5777);
					local137 = Static94.method1388(arg8[local8 + 1][local1176], local53.anInt5780, local53.anInt5777);
					local147 = Static94.method1388(arg8[local8 + 1][local1176 + 1], local53.anInt5780, local53.anInt5777);
					local159 = Static94.method1388(arg8[local8][local1176 + 1], local53.anInt5780, local53.anInt5777);
					Static9.method151(arg1, local137, arg4, arg3, arg0, local135, local159, local36 != 0 && local53.aBoolean413, local1176, local71, local65, local23, local8, local1263, local147);
				}
				if ((arg5[local8][local1176] & 0xFF) != 0 || local44 != 0 && arg6[local8][local1176] == 0) {
					local133 = 0;
					local131 = 0;
					local129 = new int[8];
					local135 = 0;
					local147 = arg7[local8][local1176 + 1] & 0xFF;
					local159 = arg7[local8 - 1][local1176] & 0xFF;
					local137 = 0;
					local169 = arg7[local8][local1176 - 1] & 0xFF;
					local191 = arg7[local8 + 1][local1176] & 0xFF;
					local181 = arg7[local8 - 1][local1176 + 1] & 0xFF;
					local203 = arg7[local8 + 1][local1176 - 1] & 0xFF;
					local149 = 0;
					local227 = arg7[local8 + 1][local1176 + 1] & 0xFF;
					local215 = arg7[local8 - 1][local1176 - 1] & 0xFF;
					if (local181 == 0 || local44 == local181) {
						local181 = 0;
					} else {
						local243 = Static278.method4188(local181 - 1);
						if (local243.aBoolean413 && local243.anInt5777 != -1) {
							local261 = arg9[local8 - 1][local1176 + 1];
							local271 = arg6[local8 - 1][local1176 + 1];
							local296 = Static93.anIntArray163[(local261 + 2 & 0x3) + local271 * 4];
							local283 = Static93.anIntArray163[local271 * 4 + (local261 + 3 & 0x3)];
							if (Static11.aBooleanArrayArray9[local283][1] && Static11.aBooleanArrayArray9[local296][0]) {
								local181 = 0;
							} else {
								for (local310 = 0; local310 < 8; local310++) {
									if (local310 == 0) {
										local133++;
										local129[0] = local181;
										break;
									}
									if (local129[local310] == local181) {
										break;
									}
								}
							}
						} else {
							local181 = 0;
						}
					}
					if (local215 == 0 || local44 == local215) {
						local215 = 0;
					} else {
						local243 = Static278.method4188(local215 - 1);
						if (local243.aBoolean413 && local243.anInt5777 != -1) {
							local261 = arg9[local8 - 1][local1176 - 1];
							local271 = arg6[local8 - 1][local1176 - 1];
							local296 = Static93.anIntArray163[(local261 & 0x3) + local271 * 4];
							local283 = Static93.anIntArray163[local271 * 4 + (local261 + 3 & 0x3)];
							if (Static11.aBooleanArrayArray9[local296][1] && Static11.aBooleanArrayArray9[local283][0]) {
								local215 = 0;
							} else {
								for (local310 = 0; local310 < 8; local310++) {
									if (local133 == local310) {
										local129[local133++] = local215;
										break;
									}
									if (local215 == local129[local310]) {
										break;
									}
								}
							}
						} else {
							local215 = 0;
						}
					}
					if (local203 == 0 || local44 == local203) {
						local203 = 0;
					} else {
						local243 = Static278.method4188(local203 - 1);
						if (local243.aBoolean413 && local243.anInt5777 != -1) {
							local261 = arg9[local8 + 1][local1176 - 1];
							local271 = arg6[local8 + 1][local1176 - 1];
							local296 = Static93.anIntArray163[(local261 & 0x3) + local271 * 4];
							local283 = Static93.anIntArray163[local271 * 4 + (local261 + 1 & 0x3)];
							if (Static11.aBooleanArrayArray9[local283][1] && Static11.aBooleanArrayArray9[local296][0]) {
								local203 = 0;
							} else {
								for (local310 = 0; local310 < 8; local310++) {
									if (local310 == local133) {
										local129[local133++] = local203;
										break;
									}
									if (local203 == local129[local310]) {
										break;
									}
								}
							}
						} else {
							local203 = 0;
						}
					}
					if (local227 == 0 || local227 == local44) {
						local227 = 0;
					} else {
						local243 = Static278.method4188(local227 - 1);
						if (local243.aBoolean413 && local243.anInt5777 != -1) {
							local261 = arg9[local8 + 1][local1176 + 1];
							local271 = arg6[local8 + 1][local1176 + 1];
							local296 = Static93.anIntArray163[(local261 + 2 & 0x3) + local271 * 4];
							local283 = Static93.anIntArray163[(local261 + 1 & 0x3) + local271 * 4];
							if (Static11.aBooleanArrayArray9[local296][1] && Static11.aBooleanArrayArray9[local283][0]) {
								local227 = 0;
							} else {
								for (local310 = 0; local310 < 8; local310++) {
									if (local133 == local310) {
										local129[local133++] = local227;
										break;
									}
									if (local129[local310] == local227) {
										break;
									}
								}
							}
						} else {
							local227 = 0;
						}
					}
					if (local147 != 0 && local147 != local44) {
						local243 = Static278.method4188(local147 - 1);
						if (local243.aBoolean413 && local243.anInt5777 != -1) {
							local149 = Static93.anIntArray163[arg6[local8][local1176 + 1] * 4 + (arg9[local8][local1176 + 1] + 2 & 0x3)];
							for (local757 = 0; local757 < 8; local757++) {
								if (local757 == local133) {
									local129[local133++] = local147;
									break;
								}
								if (local129[local757] == local147) {
									break;
								}
							}
						}
					}
					if (local159 != 0 && local44 != local159) {
						local243 = Static278.method4188(local159 - 1);
						if (local243.aBoolean413 && local243.anInt5777 != -1) {
							local131 = Static93.anIntArray163[arg6[local8 - 1][local1176] * 4 + (arg9[local8 - 1][local1176] + 3 & 0x3)];
							for (local757 = 0; local757 < 8; local757++) {
								if (local133 == local757) {
									local129[local133++] = local159;
									break;
								}
								if (local129[local757] == local159) {
									break;
								}
							}
						}
					}
					if (local169 != 0 && local44 != local169) {
						local243 = Static278.method4188(local169 - 1);
						if (local243.aBoolean413 && local243.anInt5777 != -1) {
							local135 = Static93.anIntArray163[(arg9[local8][local1176 - 1] & 0x3) + arg6[local8][local1176 - 1] * 4];
							for (local757 = 0; local757 < 8; local757++) {
								if (local133 == local757) {
									local129[local133++] = local169;
									break;
								}
								if (local169 == local129[local757]) {
									break;
								}
							}
						}
					}
					if (local191 != 0 && local191 != local44) {
						local243 = Static278.method4188(local191 - 1);
						if (local243.aBoolean413 && local243.anInt5777 != -1) {
							local137 = Static93.anIntArray163[arg6[local8 + 1][local1176] * 4 + (arg9[local8 + 1][local1176] + 1 & 0x3)];
							for (local757 = 0; local757 < 8; local757++) {
								if (local133 == local757) {
									local129[local133++] = local191;
									break;
								}
								if (local129[local757] == local191) {
									break;
								}
							}
						}
					}
					for (local1024 = 0; local1024 < local133; local1024++) {
						local757 = local129[local1024];
						local1057 = Static11.aBooleanArrayArray9[local757 == local147 ? local149 : 0];
						local1044 = Static11.aBooleanArrayArray9[local159 == local757 ? local131 : 0];
						local1070 = Static11.aBooleanArrayArray9[local757 == local191 ? local137 : 0];
						local1079 = Static11.aBooleanArrayArray9[local757 == local169 ? local135 : 0];
						local1085 = Static278.method4188(local757 - 1);
						local1090 = Static75.method1160(local1085, local6);
						@Pc(2342) int local2342 = Static94.method1388(arg8[local8][local1176], local1085.anInt5780, local1085.anInt5777) << 8 | 0xFF;
						@Pc(2360) int local2360 = Static94.method1388(arg8[local8 + 1][local1176], local1085.anInt5780, local1085.anInt5777) << 8 | 0xFF;
						@Pc(2382) int local2382 = Static94.method1388(arg8[local8 + 1][local1176 + 1], local1085.anInt5780, local1085.anInt5777) << 8 | 0xFF;
						@Pc(2400) int local2400 = Static94.method1388(arg8[local8][local1176 + 1], local1085.anInt5780, local1085.anInt5777) << 8 | 0xFF;
						@Pc(2415) boolean local2415 = local757 != local227 && local1057[0] && local1070[1];
						@Pc(2434) boolean local2434 = local215 != local757 && local1079[0] && local1044[1];
						@Pc(2449) boolean local2449 = local757 != local203 && local1070[0] && local1079[1];
						@Pc(2456) int local2456 = local1057.length + 6 - 2;
						@Pc(2463) int local2463 = local2456 + local1044.length - 2;
						@Pc(2482) boolean local2482 = local181 != local757 && local1044[0] && local1057[1];
						@Pc(2489) int local2489 = local2463 + local1079.length - 2;
						@Pc(2496) int local2496 = local2489 + local1070.length - 2;
						@Pc(2517) int local2517 = Static41.method566(0, null, local2400, arg3, arg4, arg0, true, local8, 64, local2360, local1176, 64, arg1, local2382, local1090, 0.0F, local2342);
						@Pc(2538) int local2538 = Static41.method566(0, null, local2400, arg3, arg4, arg0, local2482, local8, 128, local2360, local1176, 0, arg1, local2382, local1090, 0.0F, local2342);
						@Pc(2541) int[] local2541 = new int[local2496];
						@Pc(2562) int local2562 = Static41.method566(0, null, local2400, arg3, arg4, arg0, local2415, local8, 128, local2360, local1176, 128, arg1, local2382, local1090, 0.0F, local2342);
						@Pc(2583) int local2583 = Static41.method566(0, null, local2400, arg3, arg4, arg0, local2434, local8, 0, local2360, local1176, 0, arg1, local2382, local1090, 0.0F, local2342);
						@Pc(2604) int local2604 = Static41.method566(0, null, local2400, arg3, arg4, arg0, local2449, local8, 0, local2360, local1176, 128, arg1, local2382, local1090, 0.0F, local2342);
						@Pc(2606) byte local2606 = 0;
						@Pc(2609) int local2609 = local2606 + 1;
						local2541[0] = local2517;
						@Pc(2614) int local2614 = local2609 + 1;
						local2541[1] = local2562;
						if (local1057.length > 2) {
							local2614++;
							local2541[2] = Static41.method566(0, null, local2400, arg3, arg4, arg0, local1057[2], local8, 128, local2360, local1176, 64, arg1, local2382, local1090, 0.0F, local2342);
						}
						local2541[local2614++] = local2538;
						if (local1044.length > 2) {
							local2541[local2614++] = Static41.method566(0, null, local2400, arg3, arg4, arg0, local1044[2], local8, 64, local2360, local1176, 0, arg1, local2382, local1090, 0.0F, local2342);
						}
						local2541[local2614++] = local2583;
						if (local1079.length > 2) {
							local2541[local2614++] = Static41.method566(0, null, local2400, arg3, arg4, arg0, local1079[2], local8, 0, local2360, local1176, 64, arg1, local2382, local1090, 0.0F, local2342);
						}
						local2541[local2614++] = local2604;
						if (local1070.length > 2) {
							local2541[local2614++] = Static41.method566(0, null, local2400, arg3, arg4, arg0, local1070[2], local8, 64, local2360, local1176, 128, arg1, local2382, local1090, 0.0F, local2342);
						}
						local2541[local2614++] = local2562;
						local1090.method2860(local23, local8, local1176, local2541, null, true);
					}
				}
			}
		}
		for (local1152 = (Class3_Sub21) local6.method664(); local1152 != null; local1152 = (Class3_Sub21) local6.method671()) {
			if (local1152.anInt3239 == 0) {
				local1152.method5013();
			} else {
				local1152.method2858();
			}
		}
		local8 = local6.method673();
		@Pc(2812) Class3_Sub21[] local2812 = new Class3_Sub21[local8];
		@Pc(2815) long[] local2815 = new long[local8];
		local6.method672(local2812);
		for (local36 = 0; local36 < local8; local36++) {
			local2815[local36] = local2812[local36].aLong243;
		}
		Static62.method985(local2812, local2815);
		return local2812;
	}
}
