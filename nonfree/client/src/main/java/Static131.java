import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!mg", name = "t", descriptor = "Lclient!kc;")
	public static Class62 aClass62_2;

	@OriginalMember(owner = "client!mg", name = "w", descriptor = "I")
	public static int anInt2716;

	@OriginalMember(owner = "client!mg", name = "B", descriptor = "Lclient!ee;")
	public static Class27 aClass27_4;

	@OriginalMember(owner = "client!mg", name = "n", descriptor = "[S")
	public static short[] aShortArray40 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
	public static int anInt2713 = 0;

	@OriginalMember(owner = "client!mg", name = "q", descriptor = "[[B")
	public static byte[][] aByteArrayArray8 = new byte[250][];

	@OriginalMember(owner = "client!mg", name = "u", descriptor = "Z")
	public static boolean aBoolean115 = false;

	@OriginalMember(owner = "client!mg", name = "z", descriptor = "I")
	public static int anInt2719 = 1;

	@OriginalMember(owner = "client!mg", name = "E", descriptor = "[Lclient!hh;")
	public static Class50[] aClass50Array50 = new Class50[200];

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIIII)V")
	public static void method2205(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		Static204.anInt4101 = 0;
		@Pc(154) int local154;
		@Pc(564) int local564;
		@Pc(73) int local73;
		@Pc(286) int local286;
		for (@Pc(13) int local13 = -1; local13 < Static103.anInt2065 + Static13.anInt250; local13++) {
			@Pc(20) Class20_Sub3 local20;
			if (local13 == -1) {
				local20 = Static230.aClass20_Sub3_Sub1_3;
			} else if (Static13.anInt250 > local13) {
				local20 = Static232.aClass20_Sub3_Sub1Array1[Static52.anIntArray356[local13]];
			} else {
				local20 = Static78.aClass20_Sub3_Sub2Array1[Static21.anIntArray44[local13 - Static13.anInt250]];
			}
			if (local20 != null && local20.method2467()) {
				@Pc(57) Class105 local57;
				if (local20 instanceof Class20_Sub3_Sub2) {
					local57 = ((Class20_Sub3_Sub2) local20).aClass105_1;
					if (local57.anIntArray443 != null) {
						local57 = local57.method3127();
					}
					if (local57 == null) {
						continue;
					}
				}
				if (local13 >= Static13.anInt250) {
					local57 = ((Class20_Sub3_Sub2) local20).aClass105_1;
					if (local57.anIntArray443 != null) {
						local57 = local57.method3127();
					}
					if (local57.anInt3893 >= 0 && Static76.aClass1_Sub1_Sub8Array2.length > local57.anInt3893) {
						Static210.method3289(arg2 >> 1, local20, local20.method2466() + 15, arg0 >> 1);
						if (Static165.anInt2637 > -1) {
							Static76.aClass1_Sub1_Sub8Array2[local57.anInt3893].method2417(Static165.anInt2637 + arg3 - 12, Static226.anInt4354 + arg1 + -30);
						}
					}
					@Pc(284) Class64[] local284 = Static229.aClass64Array1;
					for (local286 = 0; local286 < local284.length; local286++) {
						@Pc(292) Class64 local292 = local284[local286];
						if (local292 != null && local292.anInt2222 == 1 && Static21.anIntArray44[local13 - Static13.anInt250] == local292.anInt2223 && Static107.anInt2132 % 20 < 10) {
							Static210.method3289(arg2 >> 1, local20, local20.method2466() + 15, arg0 >> 1);
							if (Static165.anInt2637 > -1) {
								Static14.aClass1_Sub1_Sub8Array1[local292.anInt2213].method2417(arg3 + Static165.anInt2637 - 12, Static226.anInt4354 + arg1 - 28);
							}
						}
					}
				} else {
					local73 = 30;
					@Pc(76) Class20_Sub3_Sub1 local76 = (Class20_Sub3_Sub1) local20;
					if (local76.anInt1517 != -1 || local76.anInt1502 != -1) {
						Static210.method3289(arg2 >> 1, local20, local20.method2466() + 15, arg0 >> 1);
						if (Static165.anInt2637 > -1) {
							if (local76.anInt1517 != -1) {
								Static146.aClass1_Sub1_Sub8Array6[local76.anInt1517].method2417(arg3 + Static165.anInt2637 - 12, Static226.anInt4354 + (arg1 - 30));
								local73 += 25;
							}
							if (local76.anInt1502 != -1) {
								Static76.aClass1_Sub1_Sub8Array2[local76.anInt1502].method2417(arg3 + Static165.anInt2637 - 12, -local73 + Static226.anInt4354 + arg1);
								local73 += 25;
							}
						}
					}
					if (local13 >= 0) {
						local154 = 0;
						@Pc(156) Class64[] local156 = Static229.aClass64Array1;
						while (local154 < local156.length) {
							@Pc(162) Class64 local162 = local156[local154];
							if (local162 != null && local162.anInt2222 == 10 && Static52.anIntArray356[local13] == local162.anInt2223) {
								Static210.method3289(arg2 >> 1, local20, local20.method2466() + 15, arg0 >> 1);
								if (Static165.anInt2637 > -1) {
									Static14.aClass1_Sub1_Sub8Array1[local162.anInt2213].method2417(Static165.anInt2637 + arg3 - 12, Static226.anInt4354 + arg1 - local73);
								}
							}
							local154++;
						}
					}
				}
				if (local20.aClass50_1013 != null && (Static13.anInt250 <= local13 || Static147.anInt3081 == 0 || Static147.anInt3081 == 3 || Static147.anInt3081 == 1 && Static231.method3485(((Class20_Sub3_Sub1) local20).aClass50_493))) {
					Static210.method3289(arg2 >> 1, local20, local20.method2466(), arg0 >> 1);
					if (Static165.anInt2637 > -1 && Static196.anInt3984 > Static204.anInt4101) {
						Static196.anIntArray455[Static204.anInt4101] = Static187.aClass1_Sub1_Sub10_3.method1810(local20.aClass50_1013) / 2;
						Static196.anIntArray448[Static204.anInt4101] = Static187.aClass1_Sub1_Sub10_3.anInt2264;
						Static196.anIntArray453[Static204.anInt4101] = Static165.anInt2637;
						Static196.anIntArray454[Static204.anInt4101] = Static226.anInt4354;
						Static196.anIntArray449[Static204.anInt4101] = local20.anInt3032;
						Static196.anIntArray451[Static204.anInt4101] = local20.anInt3015;
						Static196.anIntArray456[Static204.anInt4101] = local20.anInt3066;
						Static196.aClass50Array76[Static204.anInt4101] = local20.aClass50_1013;
						Static204.anInt4101++;
					}
				}
				if (local20.anInt3013 > Static107.anInt2132) {
					@Pc(464) Class1_Sub1_Sub8 local464 = Static145.aClass1_Sub1_Sub8Array5[1];
					@Pc(468) Class1_Sub1_Sub8 local468 = Static145.aClass1_Sub1_Sub8Array5[0];
					if (local20 instanceof Class20_Sub3_Sub2) {
						@Pc(474) Class20_Sub3_Sub2 local474 = (Class20_Sub3_Sub2) local20;
						@Pc(483) Class1_Sub1_Sub8[] local483 = (Class1_Sub1_Sub8[]) Static164.aClass84_28.method2579((long) local474.aClass105_1.anInt3912);
						if (local483 == null) {
							local483 = Static135.method2285(local474.aClass105_1.anInt3912, Static141.aClass86_Sub1_33);
							if (local483 != null) {
								Static164.aClass84_28.method2582(local483, (long) local474.aClass105_1.anInt3912);
							}
						}
						if (local483 != null && local483.length == 2) {
							local468 = local483[0];
							local464 = local483[1];
						}
					}
					Static210.method3289(arg2 >> 1, local20, local20.method2466() + local468.anInt2985 + 10, arg0 >> 1);
					if (Static165.anInt2637 > -1) {
						local154 = arg1 + Static226.anInt4354 - 3;
						local286 = Static165.anInt2637 + arg3 - (local468.anInt2984 >> 1);
						local468.method2417(local286, local154);
						local564 = local468.anInt2985;
						@Pc(572) int local572 = local468.anInt2984 * local20.anInt3056 / 255;
						Static29.method412(local286, local154, local572 + local286, local564 + local154);
						local464.method2417(local286, local154);
						Static29.method406(arg3, arg1, arg3 + arg0, arg1 + arg2);
					}
				}
				for (local73 = 0; local73 < 4; local73++) {
					if (Static107.anInt2132 < local20.anIntArray312[local73]) {
						Static210.method3289(arg2 >> 1, local20, local20.method2466() / 2, arg0 >> 1);
						if (Static165.anInt2637 > -1) {
							if (local73 == 1) {
								Static226.anInt4354 -= 20;
							}
							if (local73 == 2) {
								Static165.anInt2637 -= 15;
								Static226.anInt4354 -= 10;
							}
							if (local73 == 3) {
								Static165.anInt2637 += 15;
								Static226.anInt4354 -= 10;
							}
							Static220.aClass1_Sub1_Sub8Array11[local20.anIntArray314[local73]].method2417(Static165.anInt2637 + arg3 - 12, arg1 + -12 + Static226.anInt4354);
							Static5.aClass1_Sub1_Sub10_1.method1826(Static160.method2684(local20.anIntArray315[local73]), arg3 + Static165.anInt2637 - 1, Static226.anInt4354 + arg1 - -3, 16777215, 0);
						}
					}
				}
			}
		}
		for (@Pc(704) int local704 = 0; local704 < Static204.anInt4101; local704++) {
			local286 = Static196.anIntArray455[local704];
			local73 = Static196.anIntArray453[local704];
			@Pc(718) int local718 = Static196.anIntArray454[local704];
			local154 = Static196.anIntArray448[local704];
			@Pc(724) boolean local724 = true;
			while (local724) {
				local724 = false;
				for (local564 = 0; local564 < local704; local564++) {
					if (local718 + 2 > -Static196.anIntArray448[local564] + Static196.anIntArray454[local564] && Static196.anIntArray454[local564] + 2 > local718 - local154 && local73 - local286 < Static196.anIntArray455[local564] + Static196.anIntArray453[local564] && Static196.anIntArray453[local564] - Static196.anIntArray455[local564] < local73 + local286 && Static196.anIntArray454[local564] - Static196.anIntArray448[local564] < local718) {
						local724 = true;
						local718 = Static196.anIntArray454[local564] - Static196.anIntArray448[local564];
					}
				}
			}
			Static165.anInt2637 = Static196.anIntArray453[local704];
			Static226.anInt4354 = Static196.anIntArray454[local704] = local718;
			@Pc(817) Class50 local817 = Static196.aClass50Array76[local704];
			if (Static77.anInt1555 == 0) {
				@Pc(824) int local824 = 16776960;
				if (Static196.anIntArray449[local704] < 6) {
					local824 = Static191.anIntArray444[Static196.anIntArray449[local704]];
				}
				if (Static196.anIntArray449[local704] == 6) {
					local824 = Static1.anInt41 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static196.anIntArray449[local704] == 7) {
					local824 = Static1.anInt41 % 20 < 10 ? 255 : 65535;
				}
				if (Static196.anIntArray449[local704] == 8) {
					local824 = Static1.anInt41 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(898) int local898;
				if (Static196.anIntArray449[local704] == 9) {
					local898 = 150 - Static196.anIntArray456[local704];
					if (local898 < 50) {
						local824 = local898 * 1280 + 16711680;
					} else if (local898 < 100) {
						local824 = 16776960 - (local898 - 50) * 327680;
					} else if (local898 < 150) {
						local824 = (local898 - 100) * 5 + 65280;
					}
				}
				if (Static196.anIntArray449[local704] == 10) {
					local898 = 150 - Static196.anIntArray456[local704];
					if (local898 < 50) {
						local824 = local898 * 5 + 16711680;
					} else if (local898 < 100) {
						local824 = 16711935 + 16384000 - local898 * 327680;
					} else if (local898 < 150) {
						local824 = (local898 - 100) * 327680 + 255 - (local898 + -100) * 5;
					}
				}
				if (Static196.anIntArray449[local704] == 11) {
					local898 = 150 - Static196.anIntArray456[local704];
					if (local898 < 50) {
						local824 = 16777215 - local898 * 327685;
					} else if (local898 < 100) {
						local824 = local898 * 327685 + 65280 - 16384250;
					} else if (local898 < 150) {
						local824 = 16777215 - (local898 - 100) * 327680;
					}
				}
				if (Static196.anIntArray451[local704] == 0) {
					Static187.aClass1_Sub1_Sub10_3.method1826(local817, arg3 + Static165.anInt2637, Static226.anInt4354 + arg1, local824, 0);
				}
				if (Static196.anIntArray451[local704] == 1) {
					Static187.aClass1_Sub1_Sub10_3.method1828(local817, arg3 + Static165.anInt2637, Static226.anInt4354 + arg1, local824, Static1.anInt41);
				}
				if (Static196.anIntArray451[local704] == 2) {
					Static187.aClass1_Sub1_Sub10_3.method1823(local817, Static165.anInt2637 + arg3, arg1 + Static226.anInt4354, local824, Static1.anInt41);
				}
				if (Static196.anIntArray451[local704] == 3) {
					Static187.aClass1_Sub1_Sub10_3.method1817(local817, arg3 + Static165.anInt2637, arg1 + Static226.anInt4354, local824, Static1.anInt41, 150 - Static196.anIntArray456[local704]);
				}
				if (Static196.anIntArray451[local704] == 4) {
					local898 = (150 - Static196.anIntArray456[local704]) * (Static187.aClass1_Sub1_Sub10_3.method1810(local817) + 100) / 150;
					Static29.method412(arg3 + Static165.anInt2637 - 50, arg1, Static165.anInt2637 + arg3 + 50, arg1 + arg2);
					Static187.aClass1_Sub1_Sub10_3.method1834(local817, Static165.anInt2637 + arg3 + 50 - local898, arg1 - -Static226.anInt4354, local824, 0);
					Static29.method406(arg3, arg1, arg3 + arg0, arg1 + arg2);
				}
				if (Static196.anIntArray451[local704] == 5) {
					local898 = 150 - Static196.anIntArray456[local704];
					Static29.method412(arg3, arg1 + Static226.anInt4354 - Static187.aClass1_Sub1_Sub10_3.anInt2264 - 1, arg3 + arg0, Static226.anInt4354 + arg1 + 5);
					@Pc(1221) int local1221 = 0;
					if (local898 < 25) {
						local1221 = local898 - 25;
					} else if (local898 > 125) {
						local1221 = local898 - 125;
					}
					Static187.aClass1_Sub1_Sub10_3.method1826(local817, Static165.anInt2637 + arg3, local1221 + arg1 - -Static226.anInt4354, local824, 0);
					Static29.method406(arg3, arg1, arg0 + arg3, arg1 + arg2);
				}
			} else {
				Static187.aClass1_Sub1_Sub10_3.method1826(local817, Static165.anInt2637 + arg3, arg1 + Static226.anInt4354, 16776960, 0);
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(BLclient!pa;II)Lclient!hk;")
	public static Class1_Sub1_Sub8_Sub1 method2206(@OriginalArg(1) Class86 arg0, @OriginalArg(3) int arg1) {
		return Static139.method2305(arg0, arg1) ? Static220.method3397() : null;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZII)I")
	public static int method2208(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local7 *= arg0;
			}
			arg1 >>= 0x1;
			arg0 *= arg0;
		}
		if (arg1 == 1) {
			return local7 * arg0;
		} else {
			return local7;
		}
	}

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "(B)V")
	public static void method2209() {
		Static166.aClass84_29.method2585();
		Static49.aClass84_19.method2585();
		Static64.aClass84_20.method2585();
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIBIIIII)V")
	public static void method2210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == arg0) {
			Static53.method805(arg0, arg6, arg4, arg2, arg3, arg5);
		} else if (arg4 - arg0 >= anInt2713 && arg0 + arg4 <= Static135.anInt2790 && arg6 - arg1 >= Static49.anInt1030 && arg6 + arg1 <= Static177.anInt3701) {
			Static76.method1101(arg1, arg3, arg5, arg2, arg6, arg0, arg4);
		} else {
			Static95.method1494(arg6, arg3, arg5, arg0, arg1, arg4, arg2);
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIII)V")
	public static void method2211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static169.anInt3448 == 1) {
			Static209.aClass1_Sub1_Sub8Array9[Static198.anInt3992 / 100].method2417(Static144.anInt2938 - 8, Static52.anInt3318 + -8);
		}
		if (Static169.anInt3448 == 2) {
			Static209.aClass1_Sub1_Sub8Array9[Static198.anInt3992 / 100 + 4].method2417(Static144.anInt2938 - 8, Static52.anInt3318 + -8);
		}
		Static148.method2486();
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIBZZZII)Lclient!vf;")
	public static Class1_Sub1_Sub8 method2212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) boolean arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		@Pc(9) Class70 local9 = Static16.method227(arg5);
		if (arg4 > 1 && local9.anIntArray269 != null) {
			@Pc(19) int local19 = -1;
			for (@Pc(21) int local21 = 0; local21 < 10; local21++) {
				if (arg4 >= local9.anIntArray271[local21] && local9.anIntArray271[local21] != 0) {
					local19 = local9.anIntArray269[local21];
				}
			}
			if (local19 != -1) {
				local9 = Static16.method227(local19);
			}
		}
		@Pc(62) Class20_Sub5_Sub1 local62 = local9.method1956();
		if (local62 == null) {
			return null;
		}
		@Pc(68) Class1_Sub1_Sub8_Sub1 local68 = null;
		if (local9.anInt2401 != -1) {
			local68 = (Class1_Sub1_Sub8_Sub1) method2212(0, 1, true, false, 10, local9.anInt2429);
			if (local68 == null) {
				return null;
			}
		} else if (local9.anInt2449 != -1) {
			local68 = (Class1_Sub1_Sub8_Sub1) method2212(arg0, arg1, false, false, arg4, local9.anInt2440);
			if (local68 == null) {
				return null;
			}
		}
		@Pc(120) int local120 = Static29.anInt549;
		@Pc(123) int[] local123 = new int[4];
		@Pc(125) int local125 = Static29.anInt547;
		@Pc(127) int[] local127 = Static29.anIntArray59;
		Static29.method416(local123);
		@Pc(135) Class1_Sub1_Sub8_Sub1 local135 = new Class1_Sub1_Sub8_Sub1(36, 32);
		Static29.method408(local135.anIntArray310, 36, 32);
		Static215.method3355();
		Static215.method3369(16, 16);
		Static215.aBoolean202 = false;
		@Pc(149) int local149 = local9.anInt2451;
		if (arg2) {
			local149 = (int) ((double) local149 * 1.5D);
		} else if (arg1 == 2) {
			local149 = (int) ((double) local149 * 1.04D);
		}
		@Pc(179) int local179 = local149 * Class120.anIntArray492[local9.anInt2446] >> 16;
		@Pc(188) int local188 = Class120.anIntArray491[local9.anInt2446] * local149 >> 16;
		local62.method1694(local9.anInt2410, local9.anInt2452, local9.anInt2446, local9.anInt2436, local188 + local9.anInt2427 - local62.method3494() / 2, local9.anInt2427 + local179);
		if (arg1 >= 1) {
			local135.method2440(1);
			if (arg1 >= 2) {
				local135.method2440(16777215);
			}
			Static29.method408(local135.anIntArray310, 36, 32);
		}
		if (arg0 != 0) {
			local135.method2446(arg0);
		}
		if (local9.anInt2401 != -1) {
			local68.method2417(0, 0);
		} else if (local9.anInt2449 != -1) {
			Static29.method408(local68.anIntArray310, 36, 32);
			local135.method2417(0, 0);
			local135 = local68;
		}
		if (arg3 && (local9.anInt2430 == 1 || arg4 != 1) && arg4 != -1) {
			Static173.aClass1_Sub1_Sub10_Sub1_2.method1834(Static95.method1490(arg4), 0, 9, 16776960, 1);
		}
		Static29.method408(local127, local120, local125);
		Static29.method402(local123);
		Static215.method3355();
		Static215.aBoolean202 = true;
		return local135;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIII)I")
	public static int method2213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg1 >> 7;
		@Pc(16) int local16 = arg0 >> 7;
		if (local3 < 0 || local16 < 0 || local3 > 103 || local16 > 103) {
			return 0;
		}
		@Pc(34) int local34 = arg1 & 0x7F;
		@Pc(36) int local36 = arg2;
		if (arg2 < 3 && (Static159.aByteArrayArrayArray13[1][local3][local16] & 0x2) == 2) {
			local36 = arg2 + 1;
		}
		@Pc(57) int local57 = arg0 & 0x7F;
		@Pc(84) int local84 = Static119.anIntArrayArrayArray10[local36][local3][local16] * (128 - local34) + Static119.anIntArrayArrayArray10[local36][local3 + 1][local16] * local34 >> 7;
		@Pc(115) int local115 = (128 - local34) * Static119.anIntArrayArrayArray10[local36][local3][local16 - -1] + Static119.anIntArrayArrayArray10[local36][local3 + 1][local16 + 1] * local34 >> 7;
		return (128 - local57) * local84 + local115 * local57 >> 7;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILjava/util/Random;I)I")
	public static int method2214(@OriginalArg(0) int arg0, @OriginalArg(1) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static22.method311(arg0)) {
			return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
		} else {
			@Pc(39) int local39 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(42) int local42;
			do {
				local42 = arg1.nextInt();
			} while (local39 <= local42);
			return Static52.method2672(local42, arg0);
		}
	}
}
