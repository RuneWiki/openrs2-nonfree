import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!io", name = "c", descriptor = "I")
	public static int anInt2903;

	@OriginalMember(owner = "client!io", name = "h", descriptor = "I")
	public static int anInt2908 = 0;

	@OriginalMember(owner = "client!io", name = "j", descriptor = "[C")
	public static final char[] aCharArray1 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!io", name = "r", descriptor = "J")
	public static long aLong87 = 0L;

	@OriginalMember(owner = "client!io", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString104 = "Loaded config";

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Lclient!fr;Lclient!e;Z)I")
	public static int method2755(@OriginalArg(0) Class69 arg0, @OriginalArg(1) Class46 arg1) {
		if (arg0.anInt2179 != -1) {
			return arg0.anInt2179;
		}
		if (arg0.anInt2172 != -1) {
			@Pc(28) Class154 local28 = Static220.anInterface2_4.method116(arg1.method5160() ? arg0.anInt2172 : arg0.anInt2178);
			if (!local28.aBoolean285) {
				return local28.aShort64;
			}
		}
		return arg0.anInt2182;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIIIBI)V")
	public static void method2758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static222.method3991(arg2, Static112.anInt2485, Static32.anInt750);
		@Pc(22) int local22 = Static222.method3991(arg1, Static112.anInt2485, Static32.anInt750);
		@Pc(28) int local28 = Static222.method3991(arg5, Static275.anInt5244, Static6.anInt136);
		@Pc(34) int local34 = Static222.method3991(arg3, Static275.anInt5244, Static6.anInt136);
		@Pc(42) int local42 = Static222.method3991(arg0 + arg2, Static112.anInt2485, Static32.anInt750);
		@Pc(50) int local50 = Static222.method3991(arg1 - arg0, Static112.anInt2485, Static32.anInt750);
		for (@Pc(52) int local52 = local11; local52 < local42; local52++) {
			Static27.method690(local34, Static104.anIntArrayArray31[local52], arg4, local28);
		}
		for (@Pc(72) int local72 = local22; local72 > local50; local72--) {
			Static27.method690(local34, Static104.anIntArrayArray31[local72], arg4, local28);
		}
		@Pc(95) int local95 = Static222.method3991(arg5 + arg0, Static275.anInt5244, Static6.anInt136);
		@Pc(103) int local103 = Static222.method3991(arg3 - arg0, Static275.anInt5244, Static6.anInt136);
		for (@Pc(105) int local105 = local42; local105 <= local50; local105++) {
			@Pc(111) int[] local111 = Static104.anIntArrayArray31[local105];
			Static27.method690(local95, local111, arg4, local28);
			Static27.method690(local34, local111, arg4, local103);
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ZLclient!fn;ILclient!e;IZIIIIIII)V")
	public static void method2761(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class65 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class46 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11) {
		if (!Static96.method2208() && !Static112.method2401(arg2, Static125.anInt2720, arg10, arg4)) {
			return;
		}
		if (Static256.anInt4894 > arg10) {
			Static256.anInt4894 = arg10;
		}
		@Pc(32) Class59 local32 = Static232.method2200(arg9);
		if (Static67.anInt1615 == 1 && local32.aBoolean128) {
			return;
		}
		@Pc(54) int local54;
		@Pc(57) int local57;
		if (arg8 == 1 || arg8 == 3) {
			local54 = local32.anInt1912;
			local57 = local32.anInt1950;
		} else {
			local54 = local32.anInt1950;
			local57 = local32.anInt1912;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		if (arg2 + local54 > Static195.anInt3965) {
			local73 = arg2;
			local77 = arg2 + 1;
		} else {
			local73 = (local54 >> 1) + arg2;
			local77 = arg2 + (local54 + 1 >> 1);
		}
		@Pc(105) int local105;
		@Pc(113) int local113;
		if (local57 + arg4 <= Static298.anInt5716) {
			local105 = arg4 + (local57 >> 1);
			local113 = (local57 + 1 >> 1) + arg4;
		} else {
			local113 = arg4 + 1;
			local105 = arg4;
		}
		@Pc(125) Class114 local125 = Static158.aClass114Array2[arg11];
		@Pc(149) int local149 = local125.method3610(local73, local105) + local125.method3610(local77, local105) + local125.method3610(local73, local113) + local125.method3610(local77, local113) >> 2;
		@Pc(157) int local157 = (arg2 << 7) + (local54 << 6);
		@Pc(165) int local165 = (local57 << 6) + (arg4 << 7);
		@Pc(176) boolean local176 = arg5 && !arg0 && local32.aBoolean139;
		if (local32.method1969()) {
			Static117.method4693(arg2, null, arg10, arg8, null, local32, arg4);
		}
		@Pc(211) boolean local211 = arg6 == -1 && local32.anInt1956 == -1 && local32.anIntArray174 == null && local32.anIntArray176 == null && !local32.aBoolean141;
		if (Static238.aBoolean306 && local32.anInt1930 != 1) {
			return;
		}
		if (arg7 != 22) {
			@Pc(342) Class10_Sub3 local342;
			@Pc(309) Class10_Sub3_Sub1 local309;
			@Pc(346) int local346;
			@Pc(404) int local404;
			if (arg7 == 10 || arg7 == 11) {
				local309 = null;
				if (local211) {
					@Pc(338) Class10_Sub3_Sub1 local338 = new Class10_Sub3_Sub1(arg3, local32, arg10, arg11, local157, local149, local165, arg0, arg2, local54 + arg2 - 1, arg4, local57 + arg4 - 1, arg7, arg8, local176);
					local309 = local338;
					local342 = local338;
					local346 = local338.method833();
				} else {
					local342 = new Class10_Sub3_Sub2(arg3, local32, arg7, arg8, arg10, arg11, local157, local149, local165, arg0, arg2, local54 + arg2 - 1, arg4, local57 + arg4 - 1, arg6);
					local346 = 15;
				}
				if (Static194.method3667(local342, false)) {
					if (local309 != null && local309.method4069()) {
						local309.method4064(arg3);
					}
					if (local32.aBoolean138 && arg5) {
						if (local346 > 30) {
							local346 = 30;
						}
						for (local404 = 0; local404 <= local54; local404++) {
							for (@Pc(408) int local408 = 0; local408 <= local57; local408++) {
								local125.method3598(local404 + arg2, arg4 + local408, local346);
							}
						}
					}
				}
				if (local32.anInt1960 != 0 && arg1 != null) {
					arg1.method2128(local32.aBoolean135, arg4, local54, arg2, local57, !local32.aBoolean132);
				}
			} else if (arg7 >= 12 && arg7 <= 17 || arg7 >= 18 && arg7 <= 21) {
				if (local211) {
					local309 = new Class10_Sub3_Sub1(arg3, local32, arg10, arg11, local157, local149, local165, arg0, arg2, arg2 + local54 - 1, arg4, arg4 + local57 - 1, arg7, arg8, local176);
					local342 = local309;
					if (local309.method4069()) {
						local309.method4064(arg3);
					}
				} else {
					local342 = new Class10_Sub3_Sub2(arg3, local32, arg7, arg8, arg10, arg11, local157, local149, local165, arg0, arg2, local54 + arg2 - 1, arg4, local57 + arg4 - 1, arg6);
				}
				Static194.method3667(local342, false);
				if (arg5 && !arg0 && arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg10 > 0 && local32.anInt1930 != 0) {
					Static294.aByteArrayArrayArray12[arg10][arg2][arg4] = (byte) (Static294.aByteArrayArrayArray12[arg10][arg2][arg4] | 0x4);
				}
				if (local32.anInt1960 != 0 && arg1 != null) {
					arg1.method2128(local32.aBoolean135, arg4, local54, arg2, local57, !local32.aBoolean132);
				}
			} else {
				@Pc(651) Class10_Sub2_Sub2 local651;
				@Pc(635) Class10_Sub2 local635;
				if (arg7 == 0) {
					if (local211) {
						local651 = new Class10_Sub2_Sub2(arg3, local32, arg11, local157, local149, local165, arg0, arg7, arg8, local176);
						local635 = local651;
						if (local651.method4069()) {
							local651.method4064(arg3);
						}
					} else {
						local635 = new Class10_Sub2_Sub1(arg3, local32, 0, arg8, arg10, arg11, local157, local149, local165, arg0, arg6);
					}
					Static47.method1147(arg10, arg2, arg4, local635, null);
					if (arg5) {
						if (arg8 == 0) {
							if (local32.aBoolean138) {
								local125.method3598(arg2, arg4, 50);
								local125.method3598(arg2, arg4 + 1, 50);
							}
							if (local32.anInt1930 == 1 && !arg0) {
								Static294.aByteArrayArrayArray12[arg10][arg2][arg4] = (byte) (Static294.aByteArrayArrayArray12[arg10][arg2][arg4] | 0x1);
							}
						} else if (arg8 == 1) {
							if (local32.aBoolean138) {
								local125.method3598(arg2, arg4 + 1, 50);
								local125.method3598(arg2 + 1, arg4 + 1, 50);
							}
							if (local32.anInt1930 == 1 && !arg0) {
								Static294.aByteArrayArrayArray12[arg10][arg2][arg4 + 1] = (byte) (Static294.aByteArrayArrayArray12[arg10][arg2][arg4 + 1] | 0x2);
							}
						} else if (arg8 == 2) {
							if (local32.aBoolean138) {
								local125.method3598(arg2 + 1, arg4, 50);
								local125.method3598(arg2 + 1, arg4 - -1, 50);
							}
							if (local32.anInt1930 == 1 && !arg0) {
								Static294.aByteArrayArrayArray12[arg10][arg2 + 1][arg4] = (byte) (Static294.aByteArrayArrayArray12[arg10][arg2 + 1][arg4] | 0x1);
							}
						} else if (arg8 == 3) {
							if (local32.aBoolean138) {
								local125.method3598(arg2, arg4, 50);
								local125.method3598(arg2 + 1, arg4, 50);
							}
							if (local32.anInt1930 == 1 && !arg0) {
								Static294.aByteArrayArrayArray12[arg10][arg2][arg4] = (byte) (Static294.aByteArrayArrayArray12[arg10][arg2][arg4] | 0x2);
							}
						}
					}
					if (local32.anInt1960 != 0 && arg1 != null) {
						arg1.method2116(arg8, arg7, !local32.aBoolean132, arg2, local32.aBoolean135, arg4);
					}
					if (local32.anInt1947 != 16) {
						Static202.method3761(arg10, arg2, arg4, local32.anInt1947);
					}
				} else if (arg7 == 1) {
					if (local211) {
						local651 = new Class10_Sub2_Sub2(arg3, local32, arg11, local157, local149, local165, arg0, arg7, arg8, local176);
						if (local651.method4069()) {
							local651.method4064(arg3);
						}
						local635 = local651;
					} else {
						local635 = new Class10_Sub2_Sub1(arg3, local32, 1, arg8, arg10, arg11, local157, local149, local165, arg0, arg6);
					}
					Static47.method1147(arg10, arg2, arg4, local635, null);
					if (local32.aBoolean138 && arg5) {
						if (arg8 == 0) {
							local125.method3598(arg2, arg4 + 1, 50);
						} else if (arg8 == 1) {
							local125.method3598(arg2 + 1, arg4 + 1, 50);
						} else if (arg8 == 2) {
							local125.method3598(arg2 + 1, arg4, 50);
						} else if (arg8 == 3) {
							local125.method3598(arg2, arg4, 50);
						}
					}
					if (local32.anInt1960 != 0 && arg1 != null) {
						arg1.method2116(arg8, arg7, !local32.aBoolean132, arg2, local32.aBoolean135, arg4);
					}
				} else if (arg7 == 2) {
					local346 = arg8 + 1 & 0x3;
					@Pc(1079) Class10_Sub2 local1079;
					if (local211) {
						@Pc(1055) Class10_Sub2_Sub2 local1055 = new Class10_Sub2_Sub2(arg3, local32, arg11, local157, local149, local165, arg0, arg7, arg8 + 4, local176);
						@Pc(1069) Class10_Sub2_Sub2 local1069 = new Class10_Sub2_Sub2(arg3, local32, arg11, local157, local149, local165, arg0, arg7, local346, local176);
						if (local1055.method4069()) {
							local1055.method4064(arg3);
						}
						local1079 = local1069;
						if (local1069.method4069()) {
							local1069.method4064(arg3);
						}
						local635 = local1055;
					} else {
						local635 = new Class10_Sub2_Sub1(arg3, local32, 2, arg8 + 4, arg10, arg11, local157, local149, local165, arg0, arg6);
						local1079 = new Class10_Sub2_Sub1(arg3, local32, 2, local346, arg10, arg11, local157, local149, local165, arg0, arg6);
					}
					Static47.method1147(arg10, arg2, arg4, local635, local1079);
					if (local32.anInt1930 == 1 && arg5 && !arg0) {
						if (arg8 == 0) {
							Static294.aByteArrayArrayArray12[arg10][arg2][arg4] = (byte) (Static294.aByteArrayArrayArray12[arg10][arg2][arg4] | 0x1);
							Static294.aByteArrayArrayArray12[arg10][arg2][arg4 + 1] = (byte) (Static294.aByteArrayArrayArray12[arg10][arg2][arg4 + 1] | 0x2);
						} else if (arg8 == 1) {
							Static294.aByteArrayArrayArray12[arg10][arg2][arg4 + 1] = (byte) (Static294.aByteArrayArrayArray12[arg10][arg2][arg4 + 1] | 0x2);
							Static294.aByteArrayArrayArray12[arg10][arg2 + 1][arg4] = (byte) (Static294.aByteArrayArrayArray12[arg10][arg2 + 1][arg4] | 0x1);
						} else if (arg8 == 2) {
							Static294.aByteArrayArrayArray12[arg10][arg2 + 1][arg4] = (byte) (Static294.aByteArrayArrayArray12[arg10][arg2 + 1][arg4] | 0x1);
							Static294.aByteArrayArrayArray12[arg10][arg2][arg4] = (byte) (Static294.aByteArrayArrayArray12[arg10][arg2][arg4] | 0x2);
						} else if (arg8 == 3) {
							Static294.aByteArrayArrayArray12[arg10][arg2][arg4] = (byte) (Static294.aByteArrayArrayArray12[arg10][arg2][arg4] | 0x2);
							Static294.aByteArrayArrayArray12[arg10][arg2][arg4] = (byte) (Static294.aByteArrayArrayArray12[arg10][arg2][arg4] | 0x1);
						}
					}
					if (local32.anInt1960 != 0 && arg1 != null) {
						arg1.method2116(arg8, arg7, !local32.aBoolean132, arg2, local32.aBoolean135, arg4);
					}
					if (local32.anInt1947 != 16) {
						Static202.method3761(arg10, arg2, arg4, local32.anInt1947);
					}
				} else if (arg7 == 3) {
					if (local211) {
						local651 = new Class10_Sub2_Sub2(arg3, local32, arg11, local157, local149, local165, arg0, arg7, arg8, local176);
						local635 = local651;
						if (local651.method4069()) {
							local651.method4064(arg3);
						}
					} else {
						local635 = new Class10_Sub2_Sub1(arg3, local32, 3, arg8, arg10, arg11, local157, local149, local165, arg0, arg6);
					}
					Static47.method1147(arg10, arg2, arg4, local635, null);
					if (local32.aBoolean138 && arg5) {
						if (arg8 == 0) {
							local125.method3598(arg2, arg4 + 1, 50);
						} else if (arg8 == 1) {
							local125.method3598(arg2 + 1, arg4 + 1, 50);
						} else if (arg8 == 2) {
							local125.method3598(arg2 + 1, arg4, 50);
						} else if (arg8 == 3) {
							local125.method3598(arg2, arg4, 50);
						}
					}
					if (local32.anInt1960 != 0 && arg1 != null) {
						arg1.method2116(arg8, arg7, !local32.aBoolean132, arg2, local32.aBoolean135, arg4);
					}
				} else if (arg7 == 9) {
					if (local211) {
						local309 = new Class10_Sub3_Sub1(arg3, local32, arg10, arg11, local157, local149, local165, arg0, arg2, arg2, arg4, arg4, arg7, arg8, local176);
						local342 = local309;
						if (local309.method4069()) {
							local309.method4064(arg3);
						}
					} else {
						local342 = new Class10_Sub3_Sub2(arg3, local32, arg7, arg8, arg10, arg11, local157, local149, local165, arg0, arg2, local54 + arg2 - 1, arg4, arg4 + local57 - 1, arg6);
					}
					Static194.method3667(local342, false);
					if (local32.anInt1960 != 0 && arg1 != null) {
						arg1.method2128(local32.aBoolean135, arg4, local54, arg2, local57, !local32.aBoolean132);
					}
					if (local32.anInt1947 != 16) {
						Static202.method3761(arg10, arg2, arg4, local32.anInt1947);
					}
				} else {
					@Pc(1597) Class10_Sub4 local1597;
					if (arg7 == 4) {
						if (local211) {
							@Pc(1595) Class10_Sub4_Sub1 local1595 = new Class10_Sub4_Sub1(arg3, local32, arg11, local157, local149, local165, arg0, 0, 0, 0, arg7, arg8);
							local1597 = local1595;
							if (local1595.method4069()) {
								local1595.method4064(arg3);
							}
						} else {
							local1597 = new Class10_Sub4_Sub2(arg3, local32, arg7, arg8, arg10, arg11, local157, local149, local165, arg0, 0, 0, 0, arg6);
						}
						Static229.method4044(arg10, arg2, arg4, local1597, null);
					} else {
						@Pc(1637) int local1637;
						@Pc(1643) Interface7 local1643;
						@Pc(1678) Class10_Sub4_Sub1 local1678;
						if (arg7 == 5) {
							local1637 = 16;
							local1643 = (Interface7) Static242.method4277(arg10, arg2, arg4);
							if (local1643 != null) {
								local1637 = Static232.method2200(local1643.method4070()).anInt1947;
							}
							if (local211) {
								local1678 = new Class10_Sub4_Sub1(arg3, local32, arg11, local157, local149, local165, arg0, 0, Static115.anIntArray225[arg8] * local1637, Static243.anIntArray431[arg8] * local1637, arg7, arg8);
								if (local1678.method4069()) {
									local1678.method4064(arg3);
								}
								local1597 = local1678;
							} else {
								local1597 = new Class10_Sub4_Sub2(arg3, local32, arg7, arg8, arg10, arg11, local157, local149, local165, arg0, 0, local1637 * Static115.anIntArray225[arg8], local1637 * Static243.anIntArray431[arg8], arg6);
							}
							Static229.method4044(arg10, arg2, arg4, local1597, null);
						} else if (arg7 == 6) {
							local1637 = 8;
							local1643 = (Interface7) Static242.method4277(arg10, arg2, arg4);
							if (local1643 != null) {
								local1637 = Static232.method2200(local1643.method4070()).anInt1947 / 2;
							}
							if (local211) {
								local1678 = new Class10_Sub4_Sub1(arg3, local32, arg11, local157, local149, local165, arg0, arg8, Static115.anIntArray225[arg8] * local1637, local1637 * Static243.anIntArray431[arg8], arg7, arg8 + 4);
								if (local1678.method4069()) {
									local1678.method4064(arg3);
								}
								local1597 = local1678;
							} else {
								local1597 = new Class10_Sub4_Sub2(arg3, local32, arg7, arg8 + 4, arg10, arg11, local157, local149, local165, arg0, arg8, Static14.anIntArray24[arg8] * local1637, Static301.anIntArray524[arg8] * local1637, arg6);
							}
							Static229.method4044(arg10, arg2, arg4, local1597, null);
						} else if (arg7 == 7) {
							local1637 = arg8 + 2 & 0x3;
							if (local211) {
								@Pc(1849) Class10_Sub4_Sub1 local1849 = new Class10_Sub4_Sub1(arg3, local32, arg11, local157, local149, local165, arg0, local1637, 0, 0, arg7, local1637 + 4);
								if (local1849.method4069()) {
									local1849.method4064(arg3);
								}
								local1597 = local1849;
							} else {
								local1597 = new Class10_Sub4_Sub2(arg3, local32, arg7, local1637 + 4, arg10, arg11, local157, local149, local165, arg0, local1637, 0, 0, arg6);
							}
							Static229.method4044(arg10, arg2, arg4, local1597, null);
						} else if (arg7 == 8) {
							local346 = arg8 + 2 & 0x3;
							local404 = 8;
							@Pc(1907) Interface7 local1907 = (Interface7) Static242.method4277(arg10, arg2, arg4);
							if (local1907 != null) {
								local404 = Static232.method2200(local1907.method4070()).anInt1947 / 2;
							}
							@Pc(1950) Class10_Sub4 local1950;
							@Pc(1972) Class10_Sub4 local1972;
							if (local211) {
								local1950 = new Class10_Sub4_Sub1(arg3, local32, arg11, local157, local149, local165, arg0, arg8, local404 * Static14.anIntArray24[arg8], Static301.anIntArray524[arg8] * local404, arg7, arg8 + 4);
								local1972 = new Class10_Sub4_Sub1(arg3, local32, arg11, local157, local149, local165, arg0, arg8, 0, 0, arg7, local346 + 4);
								if (local1950.method4069()) {
									local1950.method4064(arg3);
								}
								if (local1972.method4069()) {
									local1972.method4064(arg3);
								}
							} else {
								local1950 = new Class10_Sub4_Sub2(arg3, local32, arg7, arg8 + 4, arg10, arg11, local157, local149, local165, arg0, arg8, local404 * Static14.anIntArray24[arg8], Static301.anIntArray524[arg8] * local404, arg6);
								local1972 = new Class10_Sub4_Sub2(arg3, local32, arg7, local346 + 4, arg10, arg11, local157, local149, local165, arg0, arg8, 0, 0, arg6);
							}
							Static229.method4044(arg10, arg2, arg4, local1950, local1972);
						}
					}
				}
			}
		} else if (Static323.aBoolean52 || local32.anInt1955 != 0 || local32.anInt1960 == 1 || local32.aBoolean134) {
			@Pc(257) Class10_Sub5 local257;
			if (local211) {
				@Pc(272) Class10_Sub5_Sub1 local272 = new Class10_Sub5_Sub1(arg3, local32, arg11, local157, local149, local165, arg0, arg8, local176);
				local257 = local272;
				if (local272.method4069()) {
					local272.method4064(arg3);
				}
			} else {
				local257 = new Class10_Sub5_Sub2(arg3, local32, arg8, arg10, arg11, local157, local149, local165, arg0, arg6);
			}
			Static232.method2199(arg10, arg2, arg4, local257);
			if (local32.anInt1960 == 1 && arg1 != null) {
				arg1.method2121(arg4, arg2);
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(I)V")
	public static void method2762() {
		if (Static237.anInt4633 <= 0) {
			Static78.aString72 = "";
			return;
		}
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < Static21.aStringArray23.length; local12++) {
			if (Static21.aStringArray23[local12].startsWith("--> ")) {
				local10++;
				if (local10 == Static237.anInt4633) {
					Static78.aString72 = Static21.aStringArray23[local12].substring(4);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "c", descriptor = "(I)V")
	public static void method2763() {
		for (@Pc(7) int local7 = 0; local7 < Static61.anInt1462; local7++) {
			@Pc(13) Class7 local13 = Static228.method4032(local7);
			if (local13 != null && local13.anInt141 == 0) {
				Static86.anIntArray191[local7] = 0;
				Static102.anIntArray211[local7] = 0;
			}
		}
		Static279.aClass25_28 = new Class25(128);
	}

	@OriginalMember(owner = "client!io", name = "d", descriptor = "(I)V")
	public static void method2764() {
		Static157.aClass25_10.method685();
		Static189.aClass56_13.method1916();
		Static279.aClass56_11.method1916();
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method2765(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) long local10 = 0L;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (long) arg0.charAt(local12) + (local10 << 5) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(BI)V")
	public static void method2766() {
		Static185.anInt3817 = 2;
		Static285.aClass143_100 = null;
		Static104.anInt2321 = -1;
		Static355.anInt6755 = 0;
		Static99.aBoolean159 = false;
		Static106.anInt2365 = 1;
		Static270.anInt5151 = -1;
	}
}
