import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
	public static int anInt423;

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "Lclient!ja;")
	private static Class39 aClass39_284 = Static28.method504("Please enter your password)3");

	@OriginalMember(owner = "client!ce", name = "t", descriptor = "I")
	public static int anInt433 = 0;

	@OriginalMember(owner = "client!ce", name = "A", descriptor = "Lclient!ja;")
	public static Class39 aClass39_285 = aClass39_284;

	@OriginalMember(owner = "client!ce", name = "J", descriptor = "Lclient!ja;")
	private static Class39 aClass39_286 = Static28.method504("Prepared visibility map");

	@OriginalMember(owner = "client!ce", name = "L", descriptor = "Lclient!ja;")
	public static Class39 aClass39_287 = aClass39_286;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIII)V")
	public static void method298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static127.anInt3139 = 0;
		@Pc(168) int local168;
		for (@Pc(9) int local9 = -1; local9 < Static72.anInt799 + Static122.anInt3021; local9++) {
			@Pc(16) Class4_Sub2_Sub1_Sub1 local16;
			if (local9 == -1) {
				local16 = Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1;
			} else if (Static122.anInt3021 <= local9) {
				local16 = Static114.aClass4_Sub2_Sub1_Sub1_Sub2Array1[Static33.anIntArray94[local9 - Static122.anInt3021]];
			} else {
				local16 = Static44.aClass4_Sub2_Sub1_Sub1_Sub1Array1[Static116.anIntArray312[local9]];
			}
			if (local16 != null && local16.method1915()) {
				@Pc(56) Class4_Sub2_Sub16 local56;
				if (local16 instanceof Class4_Sub2_Sub1_Sub1_Sub2) {
					local56 = ((Class4_Sub2_Sub1_Sub1_Sub2) local16).aClass4_Sub2_Sub16_1;
					if (local56.anIntArray316 != null) {
						local56 = local56.method2043();
					}
					if (local56 == null) {
						continue;
					}
				}
				if (Static122.anInt3021 <= local9) {
					local56 = ((Class4_Sub2_Sub1_Sub1_Sub2) local16).aClass4_Sub2_Sub16_1;
					if (local56.anIntArray316 != null) {
						local56 = local56.method2043();
					}
					if (local56.anInt2929 >= 0 && Static36.aClass4_Sub2_Sub3_Sub1Array4.length > local56.anInt2929) {
						Static38.method625(local16, local16.anInt2667 + 15);
						if (Static101.anInt2516 > -1) {
							Static36.aClass4_Sub2_Sub3_Sub1Array4[local56.anInt2929].method876(arg3 + Static101.anInt2516 - 12, Static59.anInt1553 + arg2 + -30);
						}
					}
					if (Static98.anInt1022 == 1 && Static33.anIntArray94[local9 - Static122.anInt3021] == Static103.anInt2556 && Static71.anInt1738 % 20 < 10) {
						Static38.method625(local16, local16.anInt2667 + 15);
						if (Static101.anInt2516 > -1) {
							Static97.aClass4_Sub2_Sub3_Sub1Array9[0].method876(arg3 + Static101.anInt2516 - 12, arg2 + -28 + Static59.anInt1553);
						}
					}
				} else {
					local168 = 30;
					@Pc(171) Class4_Sub2_Sub1_Sub1_Sub1 local171 = (Class4_Sub2_Sub1_Sub1_Sub1) local16;
					if (local171.anInt2452 != -1 || local171.anInt2440 != -1) {
						Static38.method625(local16, local16.anInt2667 + 15);
						if (Static101.anInt2516 > -1) {
							if (local171.anInt2452 != -1) {
								Static9.aClass4_Sub2_Sub3_Sub1Array3[local171.anInt2452].method876(Static101.anInt2516 + arg3 - 12, Static59.anInt1553 + -30 + arg2);
								local168 += 25;
							}
							if (local171.anInt2440 != -1) {
								Static36.aClass4_Sub2_Sub3_Sub1Array4[local171.anInt2440].method876(Static101.anInt2516 + arg3 - 12, arg2 + Static59.anInt1553 - local168);
								local168 += 25;
							}
						}
					}
					if (local9 >= 0 && Static98.anInt1022 == 10 && Static51.anInt2458 == Static116.anIntArray312[local9]) {
						Static38.method625(local16, local16.anInt2667 + 15);
						if (Static101.anInt2516 > -1) {
							Static97.aClass4_Sub2_Sub3_Sub1Array9[1].method876(arg3 + Static101.anInt2516 - 12, arg2 + Static59.anInt1553 + -local168);
						}
					}
				}
				if (local16.aClass39_1411 != null && (local9 >= Static122.anInt3021 || Static74.anInt1779 == 0 || Static74.anInt1779 == 3 || Static74.anInt1779 == 1 && Static63.method1128(((Class4_Sub2_Sub1_Sub1_Sub1) local16).aClass39_1279))) {
					Static38.method625(local16, local16.anInt2667);
					if (Static101.anInt2516 > -1 && Static41.anInt1031 > Static127.anInt3139) {
						Static41.anIntArray113[Static127.anInt3139] = Static62.aClass4_Sub2_Sub3_Sub3_3.method1265(local16.aClass39_1411) / 2;
						Static41.anIntArray111[Static127.anInt3139] = Static62.aClass4_Sub2_Sub3_Sub3_3.anInt1833;
						Static41.anIntArray112[Static127.anInt3139] = Static101.anInt2516;
						Static41.anIntArray108[Static127.anInt3139] = Static59.anInt1553;
						Static41.anIntArray114[Static127.anInt3139] = local16.anInt2680;
						Static41.anIntArray109[Static127.anInt3139] = local16.anInt2696;
						Static41.anIntArray110[Static127.anInt3139] = local16.anInt2672;
						Static41.aClass39Array6[Static127.anInt3139] = local16.aClass39_1411;
						Static127.anInt3139++;
					}
				}
				if (local16.anInt2649 > Static71.anInt1738) {
					Static38.method625(local16, local16.anInt2667 + 15);
					if (Static101.anInt2516 > -1) {
						local168 = local16.anInt2683 * 30 / local16.anInt2664;
						if (local168 > 30) {
							local168 = 30;
						}
						Static17.method1682(arg3 + Static101.anInt2516 - 15, Static59.anInt1553 + -3 + arg2, local168, 5, 65280);
						Static17.method1682(local168 + Static101.anInt2516 + arg3 - 15, arg2 + -3 - -Static59.anInt1553, 30 - local168, 5, 16711680);
					}
				}
				for (local168 = 0; local168 < 4; local168++) {
					if (Static71.anInt1738 < local16.anIntArray299[local168]) {
						Static38.method625(local16, local16.anInt2667 / 2);
						if (Static101.anInt2516 > -1) {
							if (local168 == 1) {
								Static59.anInt1553 -= 20;
							}
							if (local168 == 2) {
								Static59.anInt1553 -= 10;
								Static101.anInt2516 -= 15;
							}
							if (local168 == 3) {
								Static101.anInt2516 += 15;
								Static59.anInt1553 -= 10;
							}
							Static8.aClass4_Sub2_Sub3_Sub1Array2[local16.anIntArray298[local168]].method876(arg3 + Static101.anInt2516 - 12, Static59.anInt1553 + arg2 + -12);
							Static53.aClass4_Sub2_Sub3_Sub3_2.method1280(Static29.method510(local16.anIntArray297[local168]), arg3 + Static101.anInt2516 - 1, arg2 - -Static59.anInt1553 - -3, 16777215, 0);
						}
					}
				}
			}
		}
		for (@Pc(542) int local542 = 0; local542 < Static127.anInt3139; local542++) {
			local168 = Static41.anIntArray112[local542];
			@Pc(552) int local552 = Static41.anIntArray108[local542];
			@Pc(556) int local556 = Static41.anIntArray113[local542];
			@Pc(560) int local560 = Static41.anIntArray111[local542];
			@Pc(562) boolean local562 = true;
			while (local562) {
				local562 = false;
				for (@Pc(568) int local568 = 0; local568 < local542; local568++) {
					if (local552 + 2 > -Static41.anIntArray111[local568] + Static41.anIntArray108[local568] && local552 - local560 < Static41.anIntArray108[local568] + 2 && Static41.anIntArray112[local568] + Static41.anIntArray113[local568] > local168 + -local556 && Static41.anIntArray112[local568] - Static41.anIntArray113[local568] < local168 - -local556 && Static41.anIntArray108[local568] - Static41.anIntArray111[local568] < local552) {
						local552 = Static41.anIntArray108[local568] - Static41.anIntArray111[local568];
						local562 = true;
					}
				}
			}
			Static101.anInt2516 = Static41.anIntArray112[local542];
			Static59.anInt1553 = Static41.anIntArray108[local542] = local552;
			@Pc(667) Class39 local667 = Static41.aClass39Array6[local542];
			if (Static3.anInt20 == 0) {
				@Pc(674) int local674 = 16776960;
				if (Static41.anIntArray114[local542] < 6) {
					local674 = Static96.anIntArray268[Static41.anIntArray114[local542]];
				}
				if (Static41.anIntArray114[local542] == 6) {
					local674 = Static98.anInt1019 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static41.anIntArray114[local542] == 7) {
					local674 = Static98.anInt1019 % 20 < 10 ? 255 : 65535;
				}
				if (Static41.anIntArray114[local542] == 8) {
					local674 = Static98.anInt1019 % 20 < 10 ? 45056 : 8454016;
				}
				@Pc(748) int local748;
				if (Static41.anIntArray114[local542] == 9) {
					local748 = 150 - Static41.anIntArray110[local542];
					if (local748 < 50) {
						local674 = local748 * 1280 + 16711680;
					} else if (local748 < 100) {
						local674 = 16776960 - (local748 - 50) * 327680;
					} else if (local748 < 150) {
						local674 = local748 * 5 + 65280 - 500;
					}
				}
				if (Static41.anIntArray114[local542] == 10) {
					local748 = 150 - Static41.anIntArray110[local542];
					if (local748 < 50) {
						local674 = local748 * 5 + 16711680;
					} else if (local748 < 100) {
						local674 = 16711935 + 16384000 - local748 * 327680;
					} else if (local748 < 150) {
						local674 = local748 * 327680 + 255 - (local748 - 100) * 5 - 32768000;
					}
				}
				if (Static41.anIntArray114[local542] == 11) {
					local748 = 150 - Static41.anIntArray110[local542];
					if (local748 < 50) {
						local674 = 16777215 - local748 * 327685;
					} else if (local748 < 100) {
						local674 = local748 * 327685 - 16318970;
					} else if (local748 < 150) {
						local674 = 16777215 - (local748 - 100) * 327680;
					}
				}
				if (Static41.anIntArray109[local542] == 0) {
					Static62.aClass4_Sub2_Sub3_Sub3_3.method1280(local667, arg3 + Static101.anInt2516, Static59.anInt1553 + arg2, local674, 0);
				}
				if (Static41.anIntArray109[local542] == 1) {
					Static62.aClass4_Sub2_Sub3_Sub3_3.method1281(local667, Static101.anInt2516 + arg3, Static59.anInt1553 + arg2, local674, Static98.anInt1019);
				}
				if (Static41.anIntArray109[local542] == 2) {
					Static62.aClass4_Sub2_Sub3_Sub3_3.method1278(local667, Static101.anInt2516 + arg3, Static59.anInt1553 + arg2, local674, Static98.anInt1019);
				}
				if (Static41.anIntArray109[local542] == 3) {
					Static62.aClass4_Sub2_Sub3_Sub3_3.method1267(local667, arg3 + Static101.anInt2516, Static59.anInt1553 + arg2, local674, Static98.anInt1019, 150 - Static41.anIntArray110[local542]);
				}
				if (Static41.anIntArray109[local542] == 4) {
					local748 = (150 - Static41.anIntArray110[local542]) * (Static62.aClass4_Sub2_Sub3_Sub3_3.method1265(local667) + 100) / 150;
					Static17.method1678(Static101.anInt2516 + arg3 - 50, arg2, Static101.anInt2516 + arg3 + 50, arg0 + arg2);
					Static62.aClass4_Sub2_Sub3_Sub3_3.method1272(local667, arg3 + Static101.anInt2516 + 50 - local748, arg2 + Static59.anInt1553, local674, 0);
					Static17.method1680(arg3, arg2, arg1 + arg3, arg0 + arg2);
				}
				if (Static41.anIntArray109[local542] == 5) {
					local748 = 150 - Static41.anIntArray110[local542];
					Static17.method1678(arg3, Static59.anInt1553 + arg2 - Static62.aClass4_Sub2_Sub3_Sub3_3.anInt1833 - 1, arg3 + arg1, Static59.anInt1553 + arg2 + 5);
					@Pc(1065) int local1065 = 0;
					if (local748 < 25) {
						local1065 = local748 - 25;
					} else if (local748 > 125) {
						local1065 = local748 - 125;
					}
					Static62.aClass4_Sub2_Sub3_Sub3_3.method1280(local667, Static101.anInt2516 + arg3, local1065 + Static59.anInt1553 + arg2, local674, 0);
					Static17.method1680(arg3, arg2, arg3 + arg1, arg2 + arg0);
				}
			} else {
				Static62.aClass4_Sub2_Sub3_Sub3_3.method1280(local667, arg3 + Static101.anInt2516, arg2 + Static59.anInt1553, 16776960, 0);
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IBILclient!ua;I)V")
	public static void method299(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class4_Sub2_Sub16 arg2, @OriginalArg(4) int arg3) {
		if (Static105.anInt2033 >= 400) {
			return;
		}
		if (arg2.anIntArray316 != null) {
			arg2 = arg2.method2043();
		}
		if (arg2 == null || !arg2.aBoolean142) {
			return;
		}
		@Pc(31) Class39 local31 = arg2.aClass39_1536;
		if (arg2.anInt2938 != 0) {
			local31 = Static62.method1123(new Class39[] { local31, Static50.method821(Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2439, arg2.anInt2938), Static82.aClass39_1044, Static102.aClass39_1327, Static29.method510(arg2.anInt2938), Static9.aClass39_209 });
		}
		if (Static59.anInt1555 == 1) {
			Static110.method1950(Static62.method1123(new Class39[] { Static52.aClass39_764, Static99.aClass39_1291, local31 }), Static31.aClass39_428, arg1, arg0, arg3, 34);
		} else if (!Static78.aBoolean101) {
			@Pc(114) Class39[] local114 = arg2.aClass39Array22;
			if (Static98.aBoolean44) {
				local114 = Static30.method526(local114);
			}
			@Pc(124) int local124;
			if (local114 != null) {
				for (local124 = 4; local124 >= 0; local124--) {
					if (local114[local124] != null && !local114[local124].method954(Static23.aClass39_364)) {
						@Pc(143) byte local143 = 0;
						if (local124 == 0) {
							local143 = 36;
						}
						if (local124 == 1) {
							local143 = 48;
						}
						if (local124 == 2) {
							local143 = 22;
						}
						if (local124 == 3) {
							local143 = 41;
						}
						if (local124 == 4) {
							local143 = 9;
						}
						Static110.method1950(Static62.method1123(new Class39[] { Static110.aClass39_1450, local31 }), local114[local124], arg1, arg0, arg3, local143);
					}
				}
			}
			if (local114 != null) {
				for (local124 = 4; local124 >= 0; local124--) {
					if (local114[local124] != null && local114[local124].method954(Static23.aClass39_364)) {
						@Pc(220) int local220 = 0;
						@Pc(222) short local222 = 0;
						if (arg2.anInt2938 > Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2439) {
							local222 = 2000;
						}
						if (local124 == 0) {
							local220 = local222 + 36;
						}
						if (local124 == 1) {
							local220 = local222 + 48;
						}
						if (local124 == 2) {
							local220 = local222 + 22;
						}
						if (local124 == 3) {
							local220 = local222 + 41;
						}
						if (local124 == 4) {
							local220 = local222 + 9;
						}
						Static110.method1950(Static62.method1123(new Class39[] { Static110.aClass39_1450, local31 }), local114[local124], arg1, arg0, arg3, local220);
					}
				}
			}
			Static110.method1950(Static62.method1123(new Class39[] { Static110.aClass39_1450, local31 }), Static32.aClass39_436, arg1, arg0, arg3, 1005);
		} else if ((Static44.anInt1130 & 0x2) == 2) {
			Static110.method1950(Static62.method1123(new Class39[] { Static24.aClass39_299, Static99.aClass39_1291, local31 }), Static104.aClass39_1338, arg1, arg0, arg3, 32);
			return;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
	public static void method300() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
		System.exit(1);
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V")
	public static void method301() {
		aClass39_285 = null;
		aClass39_286 = null;
		aClass39_284 = null;
		aClass39_287 = null;
	}
}
