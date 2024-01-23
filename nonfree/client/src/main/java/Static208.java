import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1529 = Static64.method1101("Wed");

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1530 = Static64.method1101("Sat");

	@OriginalMember(owner = "client!ug", name = "h", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1531 = Static64.method1101("Mon");

	@OriginalMember(owner = "client!ug", name = "B", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1535 = Static64.method1101("Sun");

	@OriginalMember(owner = "client!ug", name = "k", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1532 = Static64.method1101("Tue");

	@OriginalMember(owner = "client!ug", name = "u", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1533 = Static64.method1101("Thu");

	@OriginalMember(owner = "client!ug", name = "z", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1534 = Static64.method1101("Fri");

	@OriginalMember(owner = "client!ug", name = "j", descriptor = "[Lclient!ia;")
	public static Class51[] aClass51Array29 = new Class51[] { aClass51_1535, aClass51_1531, aClass51_1532, aClass51_1529, aClass51_1533, aClass51_1534, aClass51_1530 };

	@OriginalMember(owner = "client!ug", name = "s", descriptor = "Lclient!ie;")
	public static Class53 aClass53_28 = new Class53(50);

	@OriginalMember(owner = "client!ug", name = "C", descriptor = "[Z")
	public static boolean[] aBooleanArray25 = new boolean[112];

	@OriginalMember(owner = "client!ug", name = "D", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1536 = null;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)I")
	public static int method3442() {
		return 16;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZLclient!ia;)Lclient!ob;")
	public static Class1_Sub22 method3443(@OriginalArg(1) Class51 arg0) {
		if (arg0.method1399() == 0) {
			return null;
		}
		for (@Pc(19) Class1_Sub22 local19 = (Class1_Sub22) Static212.aClass105_23.method3120(); local19 != null; local19 = (Class1_Sub22) Static212.aClass105_23.method3109()) {
			if (local19.aClass51_1107.method1432(arg0)) {
				return local19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIIZ)V")
	public static void method3444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg5;
		@Pc(10) int local10 = arg4 - arg1;
		@Pc(15) int local15 = arg2 - arg1;
		for (@Pc(17) int local17 = arg5; local17 < local5; local17++) {
			Static71.method1261(Static113.anIntArrayArray10[local17], arg0, arg3, arg4);
		}
		for (@Pc(37) int local37 = arg2; local37 > local15; local37--) {
			Static71.method1261(Static113.anIntArrayArray10[local37], arg0, arg3, arg4);
		}
		@Pc(55) int local55 = arg1 + arg0;
		for (@Pc(62) int local62 = local5; local62 <= local15; local62++) {
			@Pc(68) int[] local68 = Static113.anIntArrayArray10[local62];
			Static71.method1261(local68, arg0, arg3, local55);
			Static71.method1261(local68, local10, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IJ)V")
	public static void method3445(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(3) InterruptedException local3) {
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILclient!ad;I)V")
	public static void method3446(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anInt3610 > Static109.anInt2430) {
			Static63.method1098(arg0);
		} else if (arg0.anInt3578 < Static109.anInt2430) {
			Static65.method1116(arg0);
		} else {
			Static142.method2481(arg0);
		}
		if (arg0.anInt3624 < 128 || arg0.anInt3598 < 128 || arg0.anInt3624 >= 13184 || arg0.anInt3598 >= 13184) {
			arg0.anInt3585 = -1;
			arg0.anInt3622 = -1;
			arg0.anInt3624 = arg0.anIntArray238[0] * 128 + arg0.anInt3584 * 64;
			arg0.anInt3578 = 0;
			arg0.anInt3610 = 0;
			arg0.anInt3598 = arg0.anIntArray233[0] * 128 + arg0.anInt3584 * 64;
			arg0.method2790();
		}
		if (Static73.aClass5_Sub1_Sub1_1 == arg0 && (arg0.anInt3624 < 1536 || arg0.anInt3598 < 1536 || arg0.anInt3624 >= 11776 || arg0.anInt3598 >= 11776)) {
			arg0.anInt3624 = arg0.anInt3584 * 64 + arg0.anIntArray238[0] * 128;
			arg0.anInt3598 = arg0.anIntArray233[0] * 128 + arg0.anInt3584 * 64;
			arg0.anInt3578 = 0;
			arg0.anInt3622 = -1;
			arg0.anInt3585 = -1;
			arg0.anInt3610 = 0;
			arg0.method2790();
		}
		Static142.method2483(arg0);
		Static74.method1297(arg0);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V")
	public static void method3447() {
		if (Static92.aClass42_1 != null) {
			Static92.aClass42_1.method2740();
		}
		if (Static200.aClass42_2 != null) {
			Static200.aClass42_2.method2740();
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIILclient!me;I)V")
	public static void method3448(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class71 arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = arg5 * arg5 + arg3 * arg3;
		if (local11 > 360000) {
			return;
		}
		@Pc(30) int local30 = Math.min(arg4.anInt2802 / 2, arg4.anInt2835 / 2);
		if (local11 <= local30 * local30) {
			Static153.method2620(arg0, arg5, arg1, arg4, arg3, Static97.aClass1_Sub2_Sub1Array9[arg2]);
			return;
		}
		local30 -= 10;
		@Pc(42) int local42 = Static45.anInt1100 + Static16.anInt379 & 0x7FF;
		@Pc(46) int local46 = Class94.anIntArray278[local42];
		@Pc(54) int local54 = local46 * 256 / (Static151.anInt3331 + 256);
		@Pc(58) int local58 = Class94.anIntArray277[local42];
		@Pc(66) int local66 = local58 * 256 / (Static151.anInt3331 + 256);
		@Pc(76) int local76 = local66 * arg5 + local54 * arg3 >> 16;
		@Pc(86) int local86 = local66 * arg3 - arg5 * local54 >> 16;
		@Pc(92) double local92 = Math.atan2((double) local76, (double) local86);
		@Pc(99) int local99 = (int) ((double) local30 * Math.sin(local92));
		@Pc(106) int local106 = (int) (Math.cos(local92) * (double) local30);
		((Class1_Sub2_Sub1_Sub1) Static198.aClass1_Sub2_Sub1Array15[arg2]).method2091(arg0 + arg4.anInt2802 / 2 + local99 - 10, arg1 + -10 - (-(arg4.anInt2835 / 2) - -local106), local92);
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(IJ)Lclient!ia;")
	public static Class51 method3449(@OriginalArg(1) long arg0) {
		return Static72.method1266(arg0);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIBIII)V")
	public static void method3450(@OriginalArg(0) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		Static54.anInt1263 = 0;
		@Pc(293) int local293;
		@Pc(209) int local209;
		@Pc(136) int local136;
		for (@Pc(9) int local9 = -1; local9 < Static118.anInt2542 + Static58.anInt1372; local9++) {
			@Pc(16) Class5_Sub1 local16;
			if (local9 == -1) {
				local16 = Static73.aClass5_Sub1_Sub1_1;
			} else if (Static118.anInt2542 > local9) {
				local16 = Static191.aClass5_Sub1_Sub1Array1[Static79.anIntArray111[local9]];
			} else {
				local16 = Static168.aClass5_Sub1_Sub2Array1[Static202.anIntArray326[local9 - Static118.anInt2542]];
			}
			if (local16 != null && local16.method2793()) {
				@Pc(57) Class27 local57;
				if (local16 instanceof Class5_Sub1_Sub2) {
					local57 = ((Class5_Sub1_Sub2) local16).aClass27_1;
					if (local57.anIntArray51 != null) {
						local57 = local57.method594();
					}
					if (local57 == null) {
						continue;
					}
				}
				if (Static118.anInt2542 <= local9) {
					local57 = ((Class5_Sub1_Sub2) local16).aClass27_1;
					if (local57.anIntArray51 != null) {
						local57 = local57.method594();
					}
					if (local57.anInt797 >= 0 && local57.anInt797 < Static172.aClass1_Sub2_Sub1Array13.length) {
						Static136.method2045(arg1 >> 1, local16, local16.method2788() + 15, arg2 >> 1);
						if (Static106.anInt2355 > -1) {
							Static172.aClass1_Sub2_Sub1Array13[local57.anInt797].method2064(Static106.anInt2355 + arg3 - 12, Static203.anInt4210 + arg0 + -30);
						}
					}
					@Pc(134) Class104[] local134 = Static36.aClass104Array1;
					for (local136 = 0; local136 < local134.length; local136++) {
						@Pc(142) Class104 local142 = local134[local136];
						if (local142 != null && local142.anInt4003 == 1 && local142.anInt4001 == Static202.anIntArray326[local9 - Static118.anInt2542] && Static109.anInt2430 % 20 < 10) {
							Static136.method2045(arg1 >> 1, local16, local16.method2788() + 15, arg2 >> 1);
							if (Static106.anInt2355 > -1) {
								Static5.aClass1_Sub2_Sub1Array12[local142.anInt3999].method2064(arg3 + Static106.anInt2355 - 12, Static203.anInt4210 + -28 + arg0);
							}
						}
					}
				} else {
					local209 = 30;
					@Pc(212) Class5_Sub1_Sub1 local212 = (Class5_Sub1_Sub1) local16;
					if (local212.anInt1944 != -1 || local212.anInt1958 != -1) {
						Static136.method2045(arg1 >> 1, local16, local16.method2788() + 15, arg2 >> 1);
						if (Static106.anInt2355 > -1) {
							if (local212.anInt1944 != -1) {
								Static110.aClass1_Sub2_Sub1Array6[local212.anInt1944].method2064(Static106.anInt2355 + arg3 - 12, Static203.anInt4210 + arg0 - 30);
								local209 += 25;
							}
							if (local212.anInt1958 != -1) {
								Static172.aClass1_Sub2_Sub1Array13[local212.anInt1958].method2064(arg3 + Static106.anInt2355 - 12, Static203.anInt4210 + arg0 + -local209);
								local209 += 25;
							}
						}
					}
					if (local9 >= 0) {
						@Pc(291) Class104[] local291 = Static36.aClass104Array1;
						for (local293 = 0; local293 < local291.length; local293++) {
							@Pc(299) Class104 local299 = local291[local293];
							if (local299 != null && local299.anInt4003 == 10 && local299.anInt4001 == Static79.anIntArray111[local9]) {
								Static136.method2045(arg1 >> 1, local16, local16.method2788() + 15, arg2 >> 1);
								if (Static106.anInt2355 > -1) {
									Static5.aClass1_Sub2_Sub1Array12[local299.anInt3999].method2064(Static106.anInt2355 + arg3 - 12, -local209 + Static203.anInt4210 + arg0);
								}
							}
						}
					}
				}
				if (local16.aClass51_1249 != null && (local9 >= Static118.anInt2542 || Static164.anInt3638 == 0 || Static164.anInt3638 == 3 || Static164.anInt3638 == 1 && Static60.method1059(((Class5_Sub1_Sub1) local16).aClass51_619))) {
					Static136.method2045(arg1 >> 1, local16, local16.method2788(), arg2 >> 1);
					if (Static106.anInt2355 > -1 && Static54.anInt1263 < Static222.anInt4663) {
						Static222.anIntArray368[Static54.anInt1263] = Static80.aClass1_Sub2_Sub11_2.method2040(local16.aClass51_1249) / 2;
						Static222.anIntArray366[Static54.anInt1263] = Static80.aClass1_Sub2_Sub11_2.anInt2600;
						Static222.anIntArray367[Static54.anInt1263] = Static106.anInt2355;
						Static222.anIntArray369[Static54.anInt1263] = Static203.anInt4210;
						Static222.anIntArray364[Static54.anInt1263] = local16.anInt3617;
						Static222.anIntArray363[Static54.anInt1263] = local16.anInt3597;
						Static222.anIntArray365[Static54.anInt1263] = local16.anInt3594;
						Static222.aClass51Array30[Static54.anInt1263] = local16.aClass51_1249;
						Static54.anInt1263++;
					}
				}
				if (Static109.anInt2430 < local16.anInt3613) {
					Static136.method2045(arg1 >> 1, local16, local16.method2788() + 15, arg2 >> 1);
					if (Static106.anInt2355 > -1) {
						Static96.method1623(Static106.anInt2355 + arg3 - 15, arg0 + Static203.anInt4210 + -3, local16.anInt3593, 5, 65280);
						Static96.method1623(Static106.anInt2355 + arg3 + local16.anInt3593 - 15, arg0 + -3 - -Static203.anInt4210, 30 - local16.anInt3593, 5, 16711680);
					}
				}
				for (local209 = 0; local209 < 4; local209++) {
					if (local16.anIntArray235[local209] > Static109.anInt2430) {
						Static136.method2045(arg1 >> 1, local16, local16.method2788() / 2, arg2 >> 1);
						if (Static106.anInt2355 > -1) {
							if (local209 == 1) {
								Static203.anInt4210 -= 20;
							}
							if (local209 == 2) {
								Static106.anInt2355 -= 15;
								Static203.anInt4210 -= 10;
							}
							if (local209 == 3) {
								Static203.anInt4210 -= 10;
								Static106.anInt2355 += 15;
							}
							Static177.aClass1_Sub2_Sub1Array14[local16.anIntArray234[local209]].method2064(arg3 + Static106.anInt2355 - 12, arg0 + -12 + Static203.anInt4210);
							Static165.aClass1_Sub2_Sub11_3.method2042(Static27.method511(local16.anIntArray236[local209]), arg3 + Static106.anInt2355 - 1, arg0 - -Static203.anInt4210 + 3, 16777215, 0);
						}
					}
				}
			}
		}
		for (@Pc(647) int local647 = 0; local647 < Static54.anInt1263; local647++) {
			@Pc(653) int local653 = Static222.anIntArray369[local647];
			local209 = Static222.anIntArray367[local647];
			local136 = Static222.anIntArray368[local647];
			local293 = Static222.anIntArray366[local647];
			@Pc(667) boolean local667 = true;
			while (local667) {
				local667 = false;
				for (@Pc(673) int local673 = 0; local673 < local647; local673++) {
					if (local653 + 2 > Static222.anIntArray369[local673] + -Static222.anIntArray366[local673] && Static222.anIntArray369[local673] + 2 > -local293 + local653 && local209 - local136 < Static222.anIntArray367[local673] + Static222.anIntArray368[local673] && local209 + local136 > -Static222.anIntArray368[local673] + Static222.anIntArray367[local673] && Static222.anIntArray369[local673] - Static222.anIntArray366[local673] < local653) {
						local653 = Static222.anIntArray369[local673] - Static222.anIntArray366[local673];
						local667 = true;
					}
				}
			}
			Static106.anInt2355 = Static222.anIntArray367[local647];
			Static203.anInt4210 = Static222.anIntArray369[local647] = local653;
			@Pc(770) Class51 local770 = Static222.aClass51Array30[local647];
			if (Static180.anInt3928 == 0) {
				@Pc(777) int local777 = 16776960;
				if (Static222.anIntArray364[local647] < 6) {
					local777 = Static4.anIntArray2[Static222.anIntArray364[local647]];
				}
				if (Static222.anIntArray364[local647] == 6) {
					local777 = Static10.anInt217 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static222.anIntArray364[local647] == 7) {
					local777 = Static10.anInt217 % 20 < 10 ? 255 : 65535;
				}
				if (Static222.anIntArray364[local647] == 8) {
					local777 = Static10.anInt217 % 20 < 10 ? 45056 : 8454016;
				}
				@Pc(854) int local854;
				if (Static222.anIntArray364[local647] == 9) {
					local854 = 150 - Static222.anIntArray365[local647];
					if (local854 < 50) {
						local777 = local854 * 1280 + 16711680;
					} else if (local854 < 100) {
						local777 = 16776960 - (local854 - 50) * 327680;
					} else if (local854 < 150) {
						local777 = (local854 - 100) * 5 + 65280;
					}
				}
				if (Static222.anIntArray364[local647] == 10) {
					local854 = 150 - Static222.anIntArray365[local647];
					if (local854 < 50) {
						local777 = local854 * 5 + 16711680;
					} else if (local854 < 100) {
						local777 = 33095935 - local854 * 327680;
					} else if (local854 < 150) {
						local777 = local854 * 327680 - (local854 + -100) * 5 - 32767745;
					}
				}
				if (Static222.anIntArray364[local647] == 11) {
					local854 = 150 - Static222.anIntArray365[local647];
					if (local854 < 50) {
						local777 = 16777215 - local854 * 327685;
					} else if (local854 < 100) {
						local777 = (local854 - 50) * 327685 + 65280;
					} else if (local854 < 150) {
						local777 = 32768000 + 16777215 - local854 * 327680;
					}
				}
				if (Static222.anIntArray363[local647] == 0) {
					Static80.aClass1_Sub2_Sub11_2.method2042(local770, Static106.anInt2355 + arg3, arg0 + Static203.anInt4210, local777, 0);
				}
				if (Static222.anIntArray363[local647] == 1) {
					Static80.aClass1_Sub2_Sub11_2.method2043(local770, arg3 + Static106.anInt2355, arg0 + Static203.anInt4210, local777, Static10.anInt217);
				}
				if (Static222.anIntArray363[local647] == 2) {
					Static80.aClass1_Sub2_Sub11_2.method2032(local770, arg3 + Static106.anInt2355, Static203.anInt4210 + arg0, local777, Static10.anInt217);
				}
				if (Static222.anIntArray363[local647] == 3) {
					Static80.aClass1_Sub2_Sub11_2.method2030(local770, arg3 + Static106.anInt2355, Static203.anInt4210 + arg0, local777, Static10.anInt217, 150 - Static222.anIntArray365[local647]);
				}
				if (Static222.anIntArray363[local647] == 4) {
					local854 = (150 - Static222.anIntArray365[local647]) * (Static80.aClass1_Sub2_Sub11_2.method2040(local770) + 100) / 150;
					Static96.method1614(Static106.anInt2355 + arg3 - 50, arg0, arg3 + Static106.anInt2355 + 50, arg0 - -arg2);
					Static80.aClass1_Sub2_Sub11_2.method2038(local770, Static106.anInt2355 + arg3 + 50 - local854, arg0 - -Static203.anInt4210, local777, 0);
					Static96.method1612(arg3, arg0, arg3 + arg1, arg0 + arg2);
				}
				if (Static222.anIntArray363[local647] == 5) {
					@Pc(1143) int local1143 = 0;
					local854 = 150 - Static222.anIntArray365[local647];
					Static96.method1614(arg3, Static203.anInt4210 + arg0 - Static80.aClass1_Sub2_Sub11_2.anInt2600 - 1, arg1 + arg3, Static203.anInt4210 + arg0 + 5);
					if (local854 < 25) {
						local1143 = local854 - 25;
					} else if (local854 > 125) {
						local1143 = local854 - 125;
					}
					Static80.aClass1_Sub2_Sub11_2.method2042(local770, Static106.anInt2355 + arg3, local1143 + (arg0 - -Static203.anInt4210), local777, 0);
					Static96.method1612(arg3, arg0, arg1 + arg3, arg0 - -arg2);
				}
			} else {
				Static80.aClass1_Sub2_Sub11_2.method2042(local770, Static106.anInt2355 + arg3, arg0 - -Static203.anInt4210, 16776960, 0);
			}
		}
	}
}
