import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!k", name = "m", descriptor = "I")
	public static int anInt2076;

	@OriginalMember(owner = "client!k", name = "r", descriptor = "Lclient!v;")
	public static Class86_Sub1 aClass86_Sub1_22;

	@OriginalMember(owner = "client!k", name = "u", descriptor = "I")
	public static int anInt2081;

	@OriginalMember(owner = "client!k", name = "c", descriptor = "I")
	public static int anInt2068 = 0;

	@OriginalMember(owner = "client!k", name = "d", descriptor = "Lclient!hh;")
	public static Class50 aClass50_674 = Static186.method3527("showVideoAd");

	@OriginalMember(owner = "client!k", name = "n", descriptor = "Lclient!hh;")
	public static Class50 aClass50_675 = Static186.method3527("<col=00ff00>");

	@OriginalMember(owner = "client!k", name = "o", descriptor = "Lclient!hh;")
	public static Class50 aClass50_676 = Static186.method3527(")4a=");

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)V")
	public static void method1596() {
		Static73.aClass84_27.method2576();
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(III)Lclient!ek;")
	public static Class1_Sub1_Sub6 method1597(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(12) Class1_Sub1_Sub6 local12 = (Class1_Sub1_Sub6) Static56.aClass75_5.method2239(); local12 != null; local12 = (Class1_Sub1_Sub6) Static56.aClass75_5.method2238()) {
			if (local12.aBoolean57 && local12.method835(arg1, arg0)) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ZIIBILclient!v;I)V")
	public static void method1598(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class86_Sub1 arg4, @OriginalArg(6) int arg5) {
		@Pc(10) long local10 = (long) (arg1 + (arg3 << 16));
		@Pc(16) Class1_Sub1_Sub14 local16 = (Class1_Sub1_Sub14) Static112.aClass90_9.method2819(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class1_Sub1_Sub14) Static23.aClass90_5.method2819(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class1_Sub1_Sub14) Static40.aClass90_7.method2819(local10);
		if (local16 == null) {
			if (!arg0) {
				local16 = (Class1_Sub1_Sub14) Static144.aClass90_15.method2819(local10);
				if (local16 != null) {
					return;
				}
			}
			local16 = new Class1_Sub1_Sub14();
			local16.aClass86_Sub1_30 = arg4;
			local16.aByte7 = arg2;
			local16.anInt3107 = arg5;
			if (arg0) {
				Static112.aClass90_9.method2817(local16, local10);
				Static65.anInt4133++;
			} else {
				Static212.aClass121_5.method3383(local16);
				Static40.aClass90_7.method2817(local16, local10);
				Static212.anInt4194++;
			}
		} else if (arg0) {
			local16.method3531();
			Static112.aClass90_9.method2817(local16, local10);
			Static212.anInt4194--;
			Static65.anInt4133++;
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIZIII)V")
	public static void method1600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15;
		@Pc(44) int local44;
		if (Static123.anInt1750 == 0 && !Static234.aBoolean218) {
			@Pc(11) int local11 = Static16.anInt304;
			@Pc(13) int local13 = Static73.anInt3193;
			local15 = Static62.anInt1230;
			@Pc(28) int local28 = (local13 - local11) * (arg3 - arg0) / arg2 + local11;
			@Pc(30) int local30 = Static138.anInt2807;
			local44 = local15 + (arg1 - arg4) * (local30 - local15) / arg5;
			Static150.method2516(Static7.aClass50_69, local28, 0L, Static53.aClass50_379, (short) 45, local44);
		}
		@Pc(66) long local66 = -1L;
		for (local15 = 0; local15 < Static76.anInt1533; local15++) {
			@Pc(74) long local74 = Static75.aLongArray4[local15];
			@Pc(81) int local81 = (int) local74 >> 29 & 0x3;
			@Pc(88) int local88 = (int) local74 >> 7 & 0x7F;
			local44 = (int) local74 & 0x7F;
			@Pc(100) int local100 = Integer.MAX_VALUE & (int) (local74 >>> 32);
			if (local66 != local74) {
				local66 = local74;
				@Pc(184) int local184;
				if (local81 == 2 && Static56.method821(Static212.anInt4195, local44, local88, local74)) {
					@Pc(123) Class18 local123 = Static148.method2487(local100);
					if (local123.anIntArray66 != null) {
						local123 = local123.method599();
					}
					if (local123 == null) {
						continue;
					}
					if (Static123.anInt1750 == 1) {
						Static150.method2516(Static17.method257(new Class50[] { Static234.aClass50_1437, Static41.aClass50_308, local123.aClass50_296 }), local44, local74, Static125.aClass50_864, (short) 15, local88);
					} else if (!Static234.aBoolean218) {
						@Pc(174) Class50[] local174 = local123.aClass50Array22;
						if (Static183.aBoolean172) {
							local174 = Static73.method2566(local174);
						}
						if (local174 != null) {
							for (local184 = 4; local184 >= 0; local184--) {
								if (local174[local184] != null) {
									@Pc(196) short local196 = 0;
									if (local184 == 0) {
										local196 = 35;
									}
									if (local184 == 1) {
										local196 = 32;
									}
									if (local184 == 2) {
										local196 = 1;
									}
									if (local184 == 3) {
										local196 = 22;
									}
									if (local184 == 4) {
										local196 = 1002;
									}
									Static150.method2516(Static17.method257(new Class50[] { Static44.aClass50_335, local123.aClass50_296 }), local44, local74, local174[local184], local196, local88);
								}
							}
						}
						Static150.method2516(Static17.method257(new Class50[] { Static44.aClass50_335, local123.aClass50_296 }), local44, (long) local123.anInt790, Static211.aClass50_1330, (short) 1003, local88);
					} else if ((Static58.anInt1154 & 0x4) == 4) {
						Static150.method2516(Static17.method257(new Class50[] { Static191.aClass50_1261, Static41.aClass50_308, local123.aClass50_296 }), local44, local74, Static148.aClass50_1016, (short) 50, local88);
					}
				}
				@Pc(348) int local348;
				@Pc(356) Class20_Sub3_Sub2 local356;
				@Pc(407) Class20_Sub3_Sub1 local407;
				if (local81 == 1) {
					@Pc(323) Class20_Sub3_Sub2 local323 = Static78.aClass20_Sub3_Sub2Array1[local100];
					if (local323.aClass105_1.anInt3889 == 1 && (local323.anInt3022 & 0x7F) == 64 && (local323.anInt3008 & 0x7F) == 64) {
						for (local348 = 0; local348 < Static103.anInt2065; local348++) {
							local356 = Static78.aClass20_Sub3_Sub2Array1[Static21.anIntArray44[local348]];
							if (local356 != null && local356 != local323 && local356.aClass105_1.anInt3889 == 1 && local323.anInt3022 == local356.anInt3022 && local323.anInt3008 == local356.anInt3008) {
								Static99.method3534(Static21.anIntArray44[local348], local356.aClass105_1, local88, local44);
							}
						}
						for (local184 = 0; local184 < Static13.anInt250; local184++) {
							local407 = Static232.aClass20_Sub3_Sub1Array1[Static52.anIntArray356[local184]];
							if (local407 != null && local407.anInt3022 == local323.anInt3022 && local407.anInt3008 == local323.anInt3008) {
								Static93.method1463(local407, local44, local88, Static52.anIntArray356[local184]);
							}
						}
					}
					Static99.method3534(local100, local323.aClass105_1, local88, local44);
				}
				if (local81 == 0) {
					@Pc(455) Class20_Sub3_Sub1 local455 = Static232.aClass20_Sub3_Sub1Array1[local100];
					if ((local455.anInt3022 & 0x7F) == 64 && (local455.anInt3008 & 0x7F) == 64) {
						for (local348 = 0; local348 < Static103.anInt2065; local348++) {
							local356 = Static78.aClass20_Sub3_Sub2Array1[Static21.anIntArray44[local348]];
							if (local356 != null && local356.aClass105_1.anInt3889 == 1 && local356.anInt3022 == local455.anInt3022 && local455.anInt3008 == local356.anInt3008) {
								Static99.method3534(Static21.anIntArray44[local348], local356.aClass105_1, local88, local44);
							}
						}
						for (local184 = 0; local184 < Static13.anInt250; local184++) {
							local407 = Static232.aClass20_Sub3_Sub1Array1[Static52.anIntArray356[local184]];
							if (local407 != null && local407 != local455 && local455.anInt3022 == local407.anInt3022 && local407.anInt3008 == local455.anInt3008) {
								Static93.method1463(local407, local44, local88, Static52.anIntArray356[local184]);
							}
						}
					}
					Static93.method1463(local455, local44, local88, local100);
				}
				if (local81 == 3) {
					@Pc(571) Class75 local571 = Static182.aClass75ArrayArrayArray1[Static212.anInt4195][local44][local88];
					if (local571 != null) {
						for (@Pc(578) Class1_Sub1_Sub3 local578 = (Class1_Sub1_Sub3) local571.method2244(); local578 != null; local578 = (Class1_Sub1_Sub3) local571.method2235()) {
							local184 = local578.aClass20_Sub2_1.anInt1196;
							@Pc(588) Class70 local588 = Static16.method227(local184);
							if (Static123.anInt1750 == 1) {
								Static150.method2516(Static17.method257(new Class50[] { Static234.aClass50_1437, Static159.aClass50_1342, local588.aClass50_833 }), local44, (long) local184, Static125.aClass50_864, (short) 18, local88);
							} else if (!Static234.aBoolean218) {
								@Pc(636) Class50[] local636 = local588.aClass50Array44;
								if (Static183.aBoolean172) {
									local636 = Static73.method2566(local636);
								}
								for (@Pc(644) int local644 = 4; local644 >= 0; local644--) {
									if (local636 != null && local636[local644] != null) {
										@Pc(686) byte local686 = 0;
										if (local644 == 0) {
											local686 = 41;
										}
										if (local644 == 1) {
											local686 = 2;
										}
										if (local644 == 2) {
											local686 = 40;
										}
										if (local644 == 3) {
											local686 = 6;
										}
										if (local644 == 4) {
											local686 = 34;
										}
										Static150.method2516(Static17.method257(new Class50[] { Static80.aClass50_529, local588.aClass50_833 }), local44, (long) local184, local636[local644], local686, local88);
									} else if (local644 == 2) {
										Static150.method2516(Static17.method257(new Class50[] { Static80.aClass50_529, local588.aClass50_833 }), local44, (long) local184, Static211.aClass50_1329, (short) 40, local88);
									}
								}
								Static150.method2516(Static17.method257(new Class50[] { Static80.aClass50_529, local588.aClass50_833 }), local44, (long) local184, Static211.aClass50_1330, (short) 1005, local88);
							} else if ((Static58.anInt1154 & 0x1) == 1) {
								Static150.method2516(Static17.method257(new Class50[] { Static191.aClass50_1261, Static159.aClass50_1342, local588.aClass50_833 }), local44, (long) local184, Static148.aClass50_1016, (short) 8, local88);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ZIIZ)I")
	public static int method1601(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(12) Class1_Sub14 local12 = (Class1_Sub14) Static57.aClass90_8.method2819((long) arg1);
		if (local12 == null) {
			return 0;
		}
		@Pc(18) int local18 = 0;
		for (@Pc(25) int local25 = 0; local25 < local12.anIntArray142.length; local25++) {
			if (local12.anIntArray142[local25] >= 0 && Static109.anInt2173 > local12.anIntArray142[local25]) {
				@Pc(45) Class70 local45 = Static16.method227(local12.anIntArray142[local25]);
				if (local45.aClass90_12 != null) {
					@Pc(56) Class1_Sub5 local56 = (Class1_Sub5) local45.aClass90_12.method2819((long) arg0);
					if (local56 != null) {
						if (arg2) {
							local18 += local12.anIntArray140[local25] * local56.anInt409;
						} else {
							local18 += local56.anInt409;
						}
					}
				}
			}
		}
		return local18;
	}
}
