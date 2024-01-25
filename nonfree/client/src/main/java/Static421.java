import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static421 {

	@OriginalMember(owner = "client!of", name = "H", descriptor = "Z")
	public static boolean aBoolean520;

	@OriginalMember(owner = "client!of", name = "J", descriptor = "J")
	public static long aLong210;

	@OriginalMember(owner = "client!of", name = "B", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_138 = new Class44(128, 1);

	@OriginalMember(owner = "client!of", name = "I", descriptor = "Lclient!wv;")
	public static final Class395 aClass395_12 = new Class395(7, 8);

	@OriginalMember(owner = "client!of", name = "K", descriptor = "[I")
	public static int[] anIntArray558 = new int[4];

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ZI)I")
	public static int method6233(@OriginalArg(0) boolean arg0) {
		@Pc(9) int local9 = Static453.anInt7941;
		if (local9 == 0) {
			return arg0 ? 0 : Static256.anInt4522;
		} else if (local9 == 1) {
			return Static256.anInt4522;
		} else if (local9 == 2) {
			return 0;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
	public static void method6234() {
		@Pc(14) int local14 = Static654.anInt10919 * 512 + 256;
		@Pc(20) int local20 = Static531.anInt9214 * 512 + 256;
		@Pc(29) int local29 = Static152.method2434(local14, Static586.anInt10060, local20) - Static394.anInt7291;
		if (Static585.anInt10024 < 100) {
			if (Static233.anInt4273 < local14) {
				Static233.anInt4273 += Static663.anInt11064 + Static585.anInt10024 * (local14 - Static233.anInt4273) / 1000;
				if (local14 < Static233.anInt4273) {
					Static233.anInt4273 = local14;
				}
			}
			if (Static233.anInt4273 > local14) {
				Static233.anInt4273 -= (Static233.anInt4273 - local14) * Static585.anInt10024 / 1000 + Static663.anInt11064;
				if (local14 > Static233.anInt4273) {
					Static233.anInt4273 = local14;
				}
			}
			if (Static396.anInt7302 < local29) {
				Static396.anInt7302 += Static663.anInt11064 + (local29 - Static396.anInt7302) * Static585.anInt10024 / 1000;
				if (local29 < Static396.anInt7302) {
					Static396.anInt7302 = local29;
				}
			}
			if (local29 < Static396.anInt7302) {
				Static396.anInt7302 -= (Static396.anInt7302 - local29) * Static585.anInt10024 / 1000 + Static663.anInt11064;
				if (local29 > Static396.anInt7302) {
					Static396.anInt7302 = local29;
				}
			}
			if (local20 > Static74.anInt1618) {
				Static74.anInt1618 += (local20 - Static74.anInt1618) * Static585.anInt10024 / 1000 + Static663.anInt11064;
				if (local20 < Static74.anInt1618) {
					Static74.anInt1618 = local20;
				}
			}
			if (local20 < Static74.anInt1618) {
				Static74.anInt1618 -= (Static74.anInt1618 - local20) * Static585.anInt10024 / 1000 + Static663.anInt11064;
				if (Static74.anInt1618 < local20) {
					Static74.anInt1618 = local20;
				}
			}
		} else {
			Static74.anInt1618 = Static531.anInt9214 * 512 + 256;
			Static233.anInt4273 = Static654.anInt10919 * 512 + 256;
			Static396.anInt7302 = Static152.method2434(Static233.anInt4273, Static586.anInt10060, Static74.anInt1618) - Static394.anInt7291;
		}
		local14 = Static243.anInt4386 * 512 + 256;
		local20 = Static8.anInt58 * 512 + 256;
		local29 = Static152.method2434(local14, Static586.anInt10060, local20) - Static286.anInt4894;
		@Pc(233) int local233 = local14 - Static233.anInt4273;
		@Pc(238) int local238 = local29 - Static396.anInt7302;
		@Pc(243) int local243 = local20 - Static74.anInt1618;
		@Pc(254) int local254 = (int) Math.sqrt((double) (local233 * local233 + local243 * local243));
		@Pc(265) int local265 = (int) (Math.atan2((double) local238, (double) local254) * 2607.5945876176133D) & 0x3FFF;
		@Pc(276) int local276 = (int) (-2607.5945876176133D * Math.atan2((double) local233, (double) local243)) & 0x3FFF;
		if (local265 < 1024) {
			local265 = 1024;
		}
		if (local265 > 3072) {
			local265 = 3072;
		}
		if (Static668.anInt11106 < local265) {
			Static668.anInt11106 += Static40.anInt1719 * (local265 - Static668.anInt11106 >> 3) / 1000 + Static305.anInt5329 << 3;
			if (Static668.anInt11106 > local265) {
				Static668.anInt11106 = local265;
			}
		}
		if (Static668.anInt11106 > local265) {
			Static668.anInt11106 -= Static40.anInt1719 * (Static668.anInt11106 - local265 >> 3) / 1000 + Static305.anInt5329 << 3;
			if (local265 > Static668.anInt11106) {
				Static668.anInt11106 = local265;
			}
		}
		@Pc(354) int local354 = local276 - Static219.anInt4123;
		if (local354 > 8192) {
			local354 -= 16384;
		}
		if (local354 < -8192) {
			local354 += 16384;
		}
		local354 >>= 0x3;
		if (local354 > 0) {
			Static219.anInt4123 += Static305.anInt5329 + Static40.anInt1719 * local354 / 1000 << 3;
			Static219.anInt4123 &= 0x3FFF;
		}
		if (local354 < 0) {
			Static219.anInt4123 -= Static305.anInt5329 + Static40.anInt1719 * -local354 / 1000 << 3;
			Static219.anInt4123 &= 0x3FFF;
		}
		@Pc(416) int local416 = local276 - Static219.anInt4123;
		if (local416 > 8192) {
			local416 -= 16384;
		}
		if (local416 < -8192) {
			local416 += 16384;
		}
		Static4.anInt27 = 0;
		if (local416 < 0 && local354 > 0 || local416 > 0 && local354 < 0) {
			Static219.anInt4123 = local276;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Z[[[BIBIIZ)V")
	public static void method6235(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(5) int local5 = arg0 ? 1 : 0;
		Static288.anInt8152 = 0;
		Static415.anInt7536 = 0;
		Static337.anInt6353++;
		@Pc(21) Class12_Sub2 local21;
		if ((arg5 & 0x2) == 0) {
			for (local21 = Static447.aClass12_Sub2Array8[local5]; local21 != null; local21 = local21.aClass12_Sub2_22) {
				if (!Static120.method7601(local21, arg0, arg1, arg2, arg3)) {
					Static4.method26(local21);
					if (local21.anInt11000 != -1) {
						Static530.aClass12_Sub2Array6[Static288.anInt8152++] = local21;
					}
				}
			}
		}
		@Pc(137) int local137;
		if ((arg5 & 0x1) == 0) {
			for (local21 = Static154.aClass12_Sub2Array1[local5]; local21 != null; local21 = local21.aClass12_Sub2_22) {
				if (!Static120.method7601(local21, arg0, arg1, arg2, arg3)) {
					Static4.method26(local21);
					if (local21.anInt11000 != -1) {
						Static601.aClass12_Sub2Array7[Static415.anInt7536++] = local21;
					}
				}
			}
			for (@Pc(87) Class12_Sub2 local87 = Static177.aClass12_Sub2Array2[local5]; local87 != null; local87 = local87.aClass12_Sub2_22) {
				if (!Static120.method7601(local87, arg0, arg1, arg2, arg3)) {
					if (local87.method9150()) {
						Static4.method26(local87);
						if (local87.anInt11000 != -1) {
							Static601.aClass12_Sub2Array7[Static415.anInt7536++] = local87;
						}
					} else {
						Static4.method26(local87);
						if (local87.anInt11000 != -1) {
							Static530.aClass12_Sub2Array6[Static288.anInt8152++] = local87;
						}
					}
				}
			}
			if (!arg0) {
				for (local137 = 0; local137 < Static585.anInt10026; local137++) {
					if (!Static120.method7601(Static217.aClass12_Sub2_Sub2Array1[local137], arg0, arg1, arg2, arg3)) {
						Static4.method26(Static217.aClass12_Sub2_Sub2Array1[local137]);
						if (Static217.aClass12_Sub2_Sub2Array1[local137].anInt11000 != -1) {
							if (Static217.aClass12_Sub2_Sub2Array1[local137].method9150()) {
								Static601.aClass12_Sub2Array7[Static415.anInt7536++] = Static217.aClass12_Sub2_Sub2Array1[local137];
							} else {
								Static530.aClass12_Sub2Array6[Static288.anInt8152++] = Static217.aClass12_Sub2_Sub2Array1[local137];
							}
						}
					}
				}
			}
		}
		@Pc(198) int local198;
		if (Static288.anInt8152 > 0) {
			Static60.method1232(Static530.aClass12_Sub2Array6, 0, Static288.anInt8152 - 1);
			for (local198 = 0; local198 < Static288.anInt8152; local198++) {
				Static439.method6466(Static530.aClass12_Sub2Array6[local198], arg6);
			}
		}
		if (Static679.aBoolean764) {
			Static533.aClass137_41.method7887(0, (Class14_Sub37[]) null);
		}
		if ((arg5 & 0x2) == 0) {
			for (local198 = Static591.anInt10109; local198 < Static613.anInt10338; local198++) {
				@Pc(271) boolean[][] local271;
				@Pc(281) int local281;
				@Pc(288) int local288;
				@Pc(290) int local290;
				@Pc(230) int local230;
				if (local198 < arg2 || arg1 == null) {
					local230 = Static255.aBooleanArrayArray2.length;
					if (Static384.anInt7056 + Static255.aBooleanArrayArray2.length > Static28.anInt704) {
						local230 -= Static384.anInt7056 + Static255.aBooleanArrayArray2.length - Static28.anInt704;
					}
					local137 = Static255.aBooleanArrayArray2[0].length;
					if (Static6.anInt41 + Static255.aBooleanArrayArray2[0].length > Static55.anInt1384) {
						local137 -= Static6.anInt41 + Static255.aBooleanArrayArray2[0].length - Static55.anInt1384;
					}
					local271 = Static519.aBooleanArrayArray5;
					if (Static252.aBoolean307) {
						if (Static267.aBoolean322) {
							local271 = Static256.aBooleanArrayArrayArray2[local198];
						}
						for (local281 = Static644.anInt10794; local281 < local230; local281++) {
							local288 = local281 + Static384.anInt7056 - Static644.anInt10794;
							for (local290 = Static55.anInt1381; local290 < local137; local290++) {
								if (Static255.aBooleanArrayArray2[local281][local290] && !Static623.method8750(local290 + Static6.anInt41 - Static55.anInt1381, local288, local198)) {
									local271[local281][local290] = true;
								} else {
									local271[local281][local290] = false;
								}
							}
						}
					}
					if (Static267.aBoolean322) {
						if (arg4 >= 0) {
							Static576.aClass51Array3[local198].method7864(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
						} else {
							Static576.aClass51Array3[local198].method7860(0, 0, 0, (boolean[][]) null, false, arg5);
						}
						for (local281 = 0; local281 < Static434.anInt7761; local281++) {
							Static400.aClass134Array1[local281].method3038(new Class12_Sub6(local198 + 1));
						}
					} else if (arg4 >= 0) {
						Static576.aClass51Array3[local198].method7864(Static358.anInt6609, Static297.anInt5235, Static64.anInt1476, Static519.aBooleanArrayArray5, true, arg4, arg5);
					} else {
						Static576.aClass51Array3[local198].method7860(Static358.anInt6609, Static297.anInt5235, Static64.anInt1476, Static519.aBooleanArrayArray5, true, arg5);
					}
				} else {
					local230 = Static255.aBooleanArrayArray2.length;
					if (Static384.anInt7056 + Static255.aBooleanArrayArray2.length > Static28.anInt704) {
						local230 -= Static384.anInt7056 + Static255.aBooleanArrayArray2.length - Static28.anInt704;
					}
					local137 = Static255.aBooleanArrayArray2[0].length;
					if (Static6.anInt41 + Static255.aBooleanArrayArray2[0].length > Static55.anInt1384) {
						local137 -= Static6.anInt41 + Static255.aBooleanArrayArray2[0].length - Static55.anInt1384;
					}
					local271 = Static519.aBooleanArrayArray5;
					if (Static252.aBoolean307) {
						if (Static267.aBoolean322) {
							local271 = Static256.aBooleanArrayArrayArray2[local198];
						}
						for (local281 = Static644.anInt10794; local281 < local230; local281++) {
							local288 = local281 + Static384.anInt7056 - Static644.anInt10794;
							for (local290 = Static55.anInt1381; local290 < local137; local290++) {
								local271[local281][local290] = false;
								if (Static255.aBooleanArrayArray2[local281][local290]) {
									@Pc(309) int local309 = local290 + Static6.anInt41 - Static55.anInt1381;
									for (@Pc(311) int local311 = local198; local311 >= 0; local311--) {
										if (Static486.aClass58ArrayArrayArray2[local311][local288][local309] != null && Static486.aClass58ArrayArrayArray2[local311][local288][local309].aByte39 == local198) {
											if ((local311 < arg2 || arg1[local311][local288][local309] != arg3) && !Static623.method8750(local309, local288, local198)) {
												local271[local281][local290] = true;
												break;
											}
											local271[local281][local290] = false;
											break;
										}
									}
								}
							}
						}
					}
					if (Static267.aBoolean322) {
						if (arg4 >= 0) {
							Static576.aClass51Array3[local198].method7864(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
						} else {
							Static576.aClass51Array3[local198].method7860(0, 0, 0, (boolean[][]) null, false, arg5);
						}
						for (local281 = 0; local281 < Static434.anInt7761; local281++) {
							Static400.aClass134Array1[local281].method3038(new Class12_Sub6(local198 + 1));
						}
					} else if (arg4 >= 0) {
						Static576.aClass51Array3[local198].method7864(Static358.anInt6609, Static297.anInt5235, Static64.anInt1476, Static519.aBooleanArrayArray5, false, arg4, arg5);
					} else {
						Static576.aClass51Array3[local198].method7860(Static358.anInt6609, Static297.anInt5235, Static64.anInt1476, Static519.aBooleanArrayArray5, false, arg5);
					}
				}
			}
		}
		if (Static415.anInt7536 > 0) {
			Static613.method8614(Static601.aClass12_Sub2Array7, 0, Static415.anInt7536 - 1);
			for (local198 = 0; local198 < Static415.anInt7536; local198++) {
				Static439.method6466(Static601.aClass12_Sub2Array7[local198], arg6);
			}
		}
	}
}
