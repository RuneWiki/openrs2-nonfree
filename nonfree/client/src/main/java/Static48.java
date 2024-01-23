import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!eh", name = "x", descriptor = "Lclient!ij;")
	public static Class2_Sub2_Sub7 aClass2_Sub2_Sub7_1;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "Lclient!q;")
	public static Class80 aClass80_5 = null;

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "Lclient!i;")
	private static Class41 aClass41_398 = Static184.method2923("Apr");

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "Z")
	public static volatile boolean aBoolean70 = true;

	@OriginalMember(owner = "client!eh", name = "k", descriptor = "Lclient!i;")
	private static Class41 aClass41_399 = Static184.method2923("Jun");

	@OriginalMember(owner = "client!eh", name = "l", descriptor = "Lclient!i;")
	private static Class41 aClass41_400 = Static184.method2923("Aug");

	@OriginalMember(owner = "client!eh", name = "m", descriptor = "Lclient!i;")
	public static Class41 aClass41_401 = Static184.method2923(")1");

	@OriginalMember(owner = "client!eh", name = "n", descriptor = "Lclient!i;")
	private static Class41 aClass41_402 = Static184.method2923("Sep");

	@OriginalMember(owner = "client!eh", name = "o", descriptor = "Lclient!i;")
	private static Class41 aClass41_403 = Static184.method2923("Mar");

	@OriginalMember(owner = "client!eh", name = "t", descriptor = "Lclient!i;")
	private static Class41 aClass41_407 = Static184.method2923("This computers address has been blocked");

	@OriginalMember(owner = "client!eh", name = "q", descriptor = "Lclient!i;")
	public static Class41 aClass41_404 = aClass41_407;

	@OriginalMember(owner = "client!eh", name = "r", descriptor = "Lclient!i;")
	private static Class41 aClass41_405 = Static184.method2923("Please wait 5 minutes before trying again)3");

	@OriginalMember(owner = "client!eh", name = "s", descriptor = "Lclient!i;")
	private static Class41 aClass41_406 = Static184.method2923("Dec");

	@OriginalMember(owner = "client!eh", name = "u", descriptor = "Lclient!i;")
	private static Class41 aClass41_408 = Static184.method2923("May");

	@OriginalMember(owner = "client!eh", name = "v", descriptor = "Lclient!i;")
	private static Class41 aClass41_409 = Static184.method2923("Jan");

	@OriginalMember(owner = "client!eh", name = "w", descriptor = "Lclient!i;")
	private static Class41 aClass41_410 = Static184.method2923("Oct");

	@OriginalMember(owner = "client!eh", name = "y", descriptor = "Lclient!i;")
	private static Class41 aClass41_411 = Static184.method2923("Nov");

	@OriginalMember(owner = "client!eh", name = "C", descriptor = "Lclient!i;")
	private static Class41 aClass41_413 = Static184.method2923("Feb");

	@OriginalMember(owner = "client!eh", name = "D", descriptor = "Lclient!i;")
	private static Class41 aClass41_414 = Static184.method2923("Jul");

	@OriginalMember(owner = "client!eh", name = "z", descriptor = "[Lclient!i;")
	public static Class41[] aClass41Array18 = new Class41[] { aClass41_409, aClass41_413, aClass41_403, aClass41_398, aClass41_408, aClass41_399, aClass41_414, aClass41_400, aClass41_402, aClass41_410, aClass41_411, aClass41_406 };

	@OriginalMember(owner = "client!eh", name = "A", descriptor = "Lclient!i;")
	public static Class41 aClass41_412 = Static184.method2923("Fps:");

	@OriginalMember(owner = "client!eh", name = "B", descriptor = "[S")
	public static short[] aShortArray34 = new short[500];

	@OriginalMember(owner = "client!eh", name = "E", descriptor = "Z")
	public static boolean aBoolean71 = false;

	@OriginalMember(owner = "client!eh", name = "F", descriptor = "Lclient!i;")
	public static Class41 aClass41_415 = aClass41_405;

	@OriginalMember(owner = "client!eh", name = "G", descriptor = "[I")
	public static int[] anIntArray131 = new int[1000];

	@OriginalMember(owner = "client!eh", name = "I", descriptor = "[I")
	public static int[] anIntArray132 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILclient!nb;BZII)V")
	public static void method960(@OriginalArg(1) Class15 arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2) {
		Static10.anInt373 = arg2;
		Static143.aClass15_31 = arg0;
		Static202.anInt1732 = arg1;
		Static154.anInt3617 = 10000;
		Static108.anInt2618 = 1;
		Static215.anInt4739 = 0;
		Static16.aBoolean20 = false;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILclient!q;)Z")
	public static boolean method961(@OriginalArg(1) Class80 arg0) {
		if (arg0.anInt3670 == 205) {
			Static92.anInt2287 = 250;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIIILclient!nc;IJ)Z")
	public static boolean method962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class12 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return Static98.method1686(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8);
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIIII)V")
	public static void method963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		Static92.anInt2292 = 0;
		@Pc(155) int local155;
		@Pc(74) int local74;
		@Pc(277) int local277;
		for (@Pc(13) int local13 = -1; local13 < Static50.anInt2134 + Static50.anInt2126; local13++) {
			@Pc(21) Class12_Sub3 local21;
			if (local13 == -1) {
				local21 = Static213.aClass12_Sub3_Sub1_1;
			} else if (local13 >= Static50.anInt2126) {
				local21 = Static199.aClass12_Sub3_Sub2Array1[Static23.anIntArray47[local13 - Static50.anInt2126]];
			} else {
				local21 = Static216.aClass12_Sub3_Sub1Array1[Static156.anIntArray386[local13]];
			}
			if (local21 != null && local21.method2727()) {
				@Pc(58) Class2_Sub2_Sub12 local58;
				if (local21 instanceof Class12_Sub3_Sub2) {
					local58 = ((Class12_Sub3_Sub2) local21).aClass2_Sub2_Sub12_1;
					if (local58.anIntArray294 != null) {
						local58 = local58.method1902();
					}
					if (local58 == null) {
						continue;
					}
				}
				if (local13 >= Static50.anInt2126) {
					local58 = ((Class12_Sub3_Sub2) local21).aClass2_Sub2_Sub12_1;
					if (local58.anIntArray294 != null) {
						local58 = local58.method1902();
					}
					if (local58.anInt2662 >= 0 && Static115.aClass2_Sub2_Sub16Array18.length > local58.anInt2662) {
						Static135.method2159(arg3 >> 1, arg2 >> 1, local21.method2723() + 15, local21);
						if (Static23.anInt595 > -1) {
							Static115.aClass2_Sub2_Sub16Array18[local58.anInt2662].method2407(Static23.anInt595 + arg0 - 12, Static30.anInt726 + -30 + arg1);
						}
					}
					@Pc(275) Class55[] local275 = Static57.aClass55Array1;
					for (local277 = 0; local277 < local275.length; local277++) {
						@Pc(283) Class55 local283 = local275[local277];
						if (local283 != null && local283.anInt2526 == 1 && local283.anInt2529 == Static23.anIntArray47[local13 - Static50.anInt2126] && Static103.anInt2511 % 20 < 10) {
							Static135.method2159(arg3 >> 1, arg2 >> 1, local21.method2723() + 15, local21);
							if (Static23.anInt595 > -1) {
								Static158.aClass2_Sub2_Sub16Array16[local283.anInt2524].method2407(Static23.anInt595 + arg0 - 12, Static30.anInt726 + arg1 - 28);
							}
						}
					}
				} else {
					local74 = 30;
					@Pc(77) Class12_Sub3_Sub1 local77 = (Class12_Sub3_Sub1) local21;
					if (local77.anInt1211 != -1 || local77.anInt1206 != -1) {
						Static135.method2159(arg3 >> 1, arg2 >> 1, local21.method2723() + 15, local21);
						if (Static23.anInt595 > -1) {
							if (local77.anInt1211 != -1) {
								Static211.aClass2_Sub2_Sub16Array20[local77.anInt1211].method2407(Static23.anInt595 + arg0 - 12, Static30.anInt726 + -30 + arg1);
								local74 += 25;
							}
							if (local77.anInt1206 != -1) {
								Static115.aClass2_Sub2_Sub16Array18[local77.anInt1206].method2407(arg0 + Static23.anInt595 - 12, arg1 - -Static30.anInt726 + -local74);
								local74 += 25;
							}
						}
					}
					if (local13 >= 0) {
						@Pc(153) Class55[] local153 = Static57.aClass55Array1;
						for (local155 = 0; local155 < local153.length; local155++) {
							@Pc(161) Class55 local161 = local153[local155];
							if (local161 != null && local161.anInt2526 == 10 && Static156.anIntArray386[local13] == local161.anInt2529) {
								Static135.method2159(arg3 >> 1, arg2 >> 1, local21.method2723() + 15, local21);
								if (Static23.anInt595 > -1) {
									Static158.aClass2_Sub2_Sub16Array16[local161.anInt2524].method2407(arg0 + Static23.anInt595 - 12, arg1 - (-Static30.anInt726 + local74));
								}
							}
						}
					}
				}
				if (local21.aClass41_1039 != null && (Static50.anInt2126 <= local13 || Static60.anInt4778 == 0 || Static60.anInt4778 == 3 || Static60.anInt4778 == 1 && Static120.method2032(((Class12_Sub3_Sub1) local21).aClass41_362))) {
					Static135.method2159(arg3 >> 1, arg2 >> 1, local21.method2723(), local21);
					if (Static23.anInt595 > -1 && Static183.anInt1322 > Static92.anInt2292) {
						Static183.anIntArray122[Static92.anInt2292] = Static49.aClass2_Sub2_Sub4_3.method788(local21.aClass41_1039) / 2;
						Static183.anIntArray121[Static92.anInt2292] = Static49.aClass2_Sub2_Sub4_3.anInt1008;
						Static183.anIntArray125[Static92.anInt2292] = Static23.anInt595;
						Static183.anIntArray126[Static92.anInt2292] = Static30.anInt726;
						Static183.anIntArray124[Static92.anInt2292] = local21.anInt3914;
						Static183.anIntArray123[Static92.anInt2292] = local21.anInt3963;
						Static183.anIntArray120[Static92.anInt2292] = local21.anInt3941;
						Static183.aClass41Array17[Static92.anInt2292] = local21.aClass41_1039;
						Static92.anInt2292++;
					}
				}
				if (local21.anInt3946 > Static103.anInt2511) {
					Static135.method2159(arg3 >> 1, arg2 >> 1, local21.method2723() + 15, local21);
					if (Static23.anInt595 > -1) {
						Static64.method1164(arg0 + Static23.anInt595 - 15, Static30.anInt726 + -3 + arg1, local21.anInt3938, 5, 65280);
						Static64.method1164(local21.anInt3938 + arg0 + Static23.anInt595 - 15, arg1 + -3 + Static30.anInt726, 30 - local21.anInt3938, 5, 16711680);
					}
				}
				for (local74 = 0; local74 < 4; local74++) {
					if (Static103.anInt2511 < local21.anIntArray410[local74]) {
						Static135.method2159(arg3 >> 1, arg2 >> 1, local21.method2723() / 2, local21);
						if (Static23.anInt595 > -1) {
							if (local74 == 1) {
								Static30.anInt726 -= 20;
							}
							if (local74 == 2) {
								Static30.anInt726 -= 10;
								Static23.anInt595 -= 15;
							}
							if (local74 == 3) {
								Static30.anInt726 -= 10;
								Static23.anInt595 += 15;
							}
							Static130.aClass2_Sub2_Sub16Array17[local21.anIntArray411[local74]].method2407(arg0 + Static23.anInt595 - 12, arg1 + -12 + Static30.anInt726);
							Static45.aClass2_Sub2_Sub4_2.method771(Static152.method2471(local21.anIntArray413[local74]), arg0 + Static23.anInt595 - 1, Static30.anInt726 + 3 + arg1, 16777215, 0);
						}
					}
				}
			}
		}
		for (@Pc(628) int local628 = 0; local628 < Static92.anInt2292; local628++) {
			local74 = Static183.anIntArray125[local628];
			@Pc(638) int local638 = Static183.anIntArray126[local628];
			local277 = Static183.anIntArray122[local628];
			@Pc(644) boolean local644 = true;
			local155 = Static183.anIntArray121[local628];
			while (local644) {
				local644 = false;
				for (@Pc(654) int local654 = 0; local654 < local628; local654++) {
					if (Static183.anIntArray126[local654] - Static183.anIntArray121[local654] < local638 + 2 && local638 - local155 < Static183.anIntArray126[local654] + 2 && local74 - local277 < Static183.anIntArray125[local654] - -Static183.anIntArray122[local654] && Static183.anIntArray125[local654] - Static183.anIntArray122[local654] < local277 + local74 && local638 > Static183.anIntArray126[local654] - Static183.anIntArray121[local654]) {
						local638 = Static183.anIntArray126[local654] - Static183.anIntArray121[local654];
						local644 = true;
					}
				}
			}
			Static23.anInt595 = Static183.anIntArray125[local628];
			Static30.anInt726 = Static183.anIntArray126[local628] = local638;
			@Pc(747) Class41 local747 = Static183.aClass41Array17[local628];
			if (Static122.anInt2916 == 0) {
				@Pc(754) int local754 = 16776960;
				if (Static183.anIntArray124[local628] < 6) {
					local754 = Static176.anIntArray429[Static183.anIntArray124[local628]];
				}
				if (Static183.anIntArray124[local628] == 6) {
					local754 = Static186.anInt4273 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static183.anIntArray124[local628] == 7) {
					local754 = Static186.anInt4273 % 20 >= 10 ? 65535 : 255;
				}
				if (Static183.anIntArray124[local628] == 8) {
					local754 = Static186.anInt4273 % 20 < 10 ? 45056 : 8454016;
				}
				@Pc(823) int local823;
				if (Static183.anIntArray124[local628] == 9) {
					local823 = 150 - Static183.anIntArray120[local628];
					if (local823 < 50) {
						local754 = local823 * 1280 + 16711680;
					} else if (local823 < 100) {
						local754 = 16384000 + 16776960 - local823 * 327680;
					} else if (local823 < 150) {
						local754 = (local823 - 100) * 5 + 65280;
					}
				}
				if (Static183.anIntArray124[local628] == 10) {
					local823 = 150 - Static183.anIntArray120[local628];
					if (local823 < 50) {
						local754 = local823 * 5 + 16711680;
					} else if (local823 < 100) {
						local754 = 16711935 - (local823 - 50) * 327680;
					} else if (local823 < 150) {
						local754 = local823 * 327680 + 500 + 255 - local823 * 5 - 32768000;
					}
				}
				if (Static183.anIntArray124[local628] == 11) {
					local823 = 150 - Static183.anIntArray120[local628];
					if (local823 < 50) {
						local754 = 16777215 - local823 * 327685;
					} else if (local823 < 100) {
						local754 = (local823 - 50) * 327685 + 65280;
					} else if (local823 < 150) {
						local754 = 16777215 - (local823 - 100) * 327680;
					}
				}
				if (Static183.anIntArray123[local628] == 0) {
					Static49.aClass2_Sub2_Sub4_3.method771(local747, arg0 + Static23.anInt595, Static30.anInt726 + arg1, local754, 0);
				}
				if (Static183.anIntArray123[local628] == 1) {
					Static49.aClass2_Sub2_Sub4_3.method774(local747, Static23.anInt595 + arg0, Static30.anInt726 + arg1, local754, Static186.anInt4273);
				}
				if (Static183.anIntArray123[local628] == 2) {
					Static49.aClass2_Sub2_Sub4_3.method775(local747, arg0 + Static23.anInt595, arg1 - -Static30.anInt726, local754, Static186.anInt4273);
				}
				if (Static183.anIntArray123[local628] == 3) {
					Static49.aClass2_Sub2_Sub4_3.method794(local747, Static23.anInt595 + arg0, arg1 + Static30.anInt726, local754, Static186.anInt4273, 150 - Static183.anIntArray120[local628]);
				}
				if (Static183.anIntArray123[local628] == 4) {
					local823 = (150 - Static183.anIntArray120[local628]) * (Static49.aClass2_Sub2_Sub4_3.method788(local747) + 100) / 150;
					Static64.method1179(arg0 + Static23.anInt595 - 50, arg1, arg0 + Static23.anInt595 + 50, arg1 + arg2);
					Static49.aClass2_Sub2_Sub4_3.method784(local747, arg0 + Static23.anInt595 + 50 - local823, arg1 - -Static30.anInt726, local754, 0);
					Static64.method1166(arg0, arg1, arg0 + arg3, arg2 + arg1);
				}
				if (Static183.anIntArray123[local628] == 5) {
					@Pc(1118) int local1118 = 0;
					local823 = 150 - Static183.anIntArray120[local628];
					if (local823 < 25) {
						local1118 = local823 - 25;
					} else if (local823 > 125) {
						local1118 = local823 - 125;
					}
					Static64.method1179(arg0, Static30.anInt726 + arg1 - Static49.aClass2_Sub2_Sub4_3.anInt1008 - 1, arg3 + arg0, Static30.anInt726 + arg1 + 5);
					Static49.aClass2_Sub2_Sub4_3.method771(local747, arg0 + Static23.anInt595, arg1 + (Static30.anInt726 - -local1118), local754, 0);
					Static64.method1166(arg0, arg1, arg0 + arg3, arg1 + arg2);
				}
			} else {
				Static49.aClass2_Sub2_Sub4_3.method771(local747, arg0 + Static23.anInt595, arg1 + Static30.anInt726, 16776960, 0);
			}
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIBIIIIII)V")
	public static void method965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static187.method2974(arg1)) {
			Static160.aClass80Array2 = null;
			Static148.method2315(Static68.aClass80ArrayArray1[arg1], arg5, arg2, arg3, arg0, arg6, arg4, -1, arg7);
			if (Static160.aClass80Array2 != null) {
				Static148.method2315(Static160.aClass80Array2, arg5, arg2, arg3, arg0, Static82.anInt2105, Static5.anInt279, -1412584499, arg7);
				Static160.aClass80Array2 = null;
			}
		} else if (arg3 == -1) {
			for (@Pc(15) int local15 = 0; local15 < 100; local15++) {
				Static199.aBooleanArray23[local15] = true;
			}
		} else {
			Static199.aBooleanArray23[arg3] = true;
		}
	}
}
