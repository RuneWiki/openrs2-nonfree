import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "[Lclient!r;")
	public static Class5_Sub2_Sub6_Sub3[] aClass5_Sub2_Sub6_Sub3Array12;

	@OriginalMember(owner = "client!jd", name = "o", descriptor = "[[I")
	public static int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1367 = Static63.method1251(": ");

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1368 = Static63.method1251("Keine Antwort vom Server)3");

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "[I")
	public static int[] anIntArray488 = new int[25];

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
	public static int anInt3132 = 0;

	@OriginalMember(owner = "client!jd", name = "j", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1369 = Static63.method1251("Loading wordpack )2 ");

	@OriginalMember(owner = "client!jd", name = "k", descriptor = "[I")
	public static int[] anIntArray489 = new int[128];

	@OriginalMember(owner = "client!jd", name = "r", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1371 = Static63.method1251("Username: ");

	@OriginalMember(owner = "client!jd", name = "l", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1370 = aClass45_1371;

	@OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
	public static int anInt3138 = 0;

	@OriginalMember(owner = "client!jd", name = "t", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1372 = aClass45_1369;

	@OriginalMember(owner = "client!jd", name = "w", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1373 = Static63.method1251("::clientdrop");

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILclient!mb;I)V")
	public static void method2147(@OriginalArg(0) int arg0, @OriginalArg(1) Class45 arg1) {
		Static64.aClass5_Sub9_Sub1_2.method1466(47);
		Static64.aClass5_Sub9_Sub1_2.method1449(arg1.method1299());
		Static64.aClass5_Sub9_Sub1_2.method1431(arg0);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V")
	public static void method2149() {
		Static73.anInt2173 = 0;
		@Pc(78) int local78;
		for (@Pc(13) int local13 = -1; local13 < Static56.anInt1694 + Static62.anInt1819; local13++) {
			@Pc(35) Class5_Sub2_Sub4_Sub3 local35;
			if (local13 == -1) {
				local35 = Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1;
			} else if (local13 >= Static56.anInt1694) {
				local35 = Static54.aClass5_Sub2_Sub4_Sub3_Sub2Array1[Static70.anIntArray297[local13 - Static56.anInt1694]];
			} else {
				local35 = Static34.aClass5_Sub2_Sub4_Sub3_Sub1Array1[Static64.anIntArray283[local13]];
			}
			if (local35 != null && local35.method1614()) {
				@Pc(62) Class5_Sub2_Sub17 local62;
				if (local35 instanceof Class5_Sub2_Sub4_Sub3_Sub2) {
					local62 = ((Class5_Sub2_Sub4_Sub3_Sub2) local35).aClass5_Sub2_Sub17_1;
					if (local62.anIntArray479 != null) {
						local62 = local62.method2122();
					}
					if (local62 == null) {
						continue;
					}
				}
				if (Static56.anInt1694 <= local13) {
					local62 = ((Class5_Sub2_Sub4_Sub3_Sub2) local35).aClass5_Sub2_Sub17_1;
					if (local62.anIntArray479 != null) {
						local62 = local62.method2122();
					}
					if (local62.anInt3077 >= 0 && local62.anInt3077 < Static117.aClass5_Sub2_Sub6_Sub3Array10.length) {
						Static67.method1292(local35.anInt2431 + 15, local35);
						if (Static16.anInt504 > -1) {
							Static117.aClass5_Sub2_Sub6_Sub3Array10[local62.anInt3077].method1781(Static16.anInt504 - 12, Static23.anInt776 + -30);
						}
					}
					if (Static11.anInt365 == 1 && Static70.anIntArray297[local13 - Static56.anInt1694] == Static29.anInt888 && Static3.anInt94 % 20 < 10) {
						Static67.method1292(local35.anInt2431 + 15, local35);
						if (Static16.anInt504 > -1) {
							Static80.aClass5_Sub2_Sub6_Sub3Array6[0].method1781(Static16.anInt504 - 12, Static23.anInt776 - 28);
						}
					}
				} else {
					local78 = 30;
					@Pc(81) Class5_Sub2_Sub4_Sub3_Sub1 local81 = (Class5_Sub2_Sub4_Sub3_Sub1) local35;
					if (local81.anInt1574 != -1 || local81.anInt1578 != -1) {
						Static67.method1292(local35.anInt2431 + 15, local35);
						if (Static16.anInt504 > -1) {
							if (local81.anInt1574 != -1) {
								aClass5_Sub2_Sub6_Sub3Array12[local81.anInt1574].method1781(Static16.anInt504 - 12, Static23.anInt776 + -30);
								local78 += 25;
							}
							if (local81.anInt1578 != -1) {
								Static117.aClass5_Sub2_Sub6_Sub3Array10[local81.anInt1578].method1781(Static16.anInt504 - 12, -local78 + Static23.anInt776);
								local78 += 25;
							}
						}
					}
					if (local13 >= 0 && Static11.anInt365 == 10 && Static77.anInt2201 == Static64.anIntArray283[local13]) {
						Static67.method1292(local35.anInt2431 + 15, local35);
						if (Static16.anInt504 > -1) {
							Static80.aClass5_Sub2_Sub6_Sub3Array6[1].method1781(Static16.anInt504 - 12, -local78 + Static23.anInt776);
						}
					}
				}
				if (local35.aClass45_1014 != null && (local13 >= Static56.anInt1694 || Static71.anInt2080 == 0 || Static71.anInt2080 == 3 || Static71.anInt2080 == 1 && Static71.method1383(((Class5_Sub2_Sub4_Sub3_Sub1) local35).aClass45_629))) {
					Static67.method1292(local35.anInt2431, local35);
					if (Static16.anInt504 > -1 && Static73.anInt2173 < Static44.anInt1261) {
						Static44.anIntArray200[Static73.anInt2173] = Static8.aClass5_Sub2_Sub6_Sub1_1.method520(local35.aClass45_1014) / 2;
						Static44.anIntArray202[Static73.anInt2173] = Static8.aClass5_Sub2_Sub6_Sub1_1.anInt748;
						Static44.anIntArray198[Static73.anInt2173] = Static16.anInt504;
						Static44.anIntArray205[Static73.anInt2173] = Static23.anInt776;
						Static44.anIntArray203[Static73.anInt2173] = local35.anInt2396;
						Static44.anIntArray209[Static73.anInt2173] = local35.anInt2399;
						Static44.anIntArray199[Static73.anInt2173] = local35.anInt2395;
						Static44.aClass45Array12[Static73.anInt2173] = local35.aClass45_1014;
						Static73.anInt2173++;
					}
				}
				if (local35.anInt2402 > Static3.anInt94) {
					Static67.method1292(local35.anInt2431 + 15, local35);
					if (Static16.anInt504 > -1) {
						local78 = local35.anInt2408 * 30 / local35.anInt2418;
						if (local78 > 30) {
							local78 = 30;
						}
						Static118.method1858(Static16.anInt504 - 15, Static23.anInt776 + -3, local78, 5, 65280);
						Static118.method1858(local78 + Static16.anInt504 - 15, Static23.anInt776 + -3, 30 - local78, 5, 16711680);
					}
				}
				for (local78 = 0; local78 < 4; local78++) {
					if (local35.anIntArray352[local78] > Static3.anInt94) {
						Static67.method1292(local35.anInt2431 / 2, local35);
						if (Static16.anInt504 > -1) {
							if (local78 == 1) {
								Static23.anInt776 -= 20;
							}
							if (local78 == 2) {
								Static23.anInt776 -= 10;
								Static16.anInt504 -= 15;
							}
							if (local78 == 3) {
								Static23.anInt776 -= 10;
								Static16.anInt504 += 15;
							}
							Static39.aClass5_Sub2_Sub6_Sub3Array4[local35.anIntArray351[local78]].method1781(Static16.anInt504 - 12, Static23.anInt776 - 12);
							Static71.aClass5_Sub2_Sub6_Sub1_4.method514(Static76.method1476(local35.anIntArray354[local78]), Static16.anInt504, Static23.anInt776 + 4, 0);
							Static71.aClass5_Sub2_Sub6_Sub1_4.method514(Static76.method1476(local35.anIntArray354[local78]), Static16.anInt504 - 1, Static23.anInt776 + 3, 16777215);
						}
					}
				}
			}
		}
		for (@Pc(507) int local507 = 0; local507 < Static73.anInt2173; local507++) {
			local78 = Static44.anIntArray198[local507];
			@Pc(517) int local517 = Static44.anIntArray205[local507];
			@Pc(521) int local521 = Static44.anIntArray200[local507];
			@Pc(525) int local525 = Static44.anIntArray202[local507];
			@Pc(527) boolean local527 = true;
			while (local527) {
				local527 = false;
				for (@Pc(533) int local533 = 0; local533 < local507; local533++) {
					if (local517 + 2 > -Static44.anIntArray202[local533] + Static44.anIntArray205[local533] && local517 - local525 < Static44.anIntArray205[local533] - -2 && Static44.anIntArray198[local533] + Static44.anIntArray200[local533] > -local521 + local78 && local521 + local78 > -Static44.anIntArray200[local533] + Static44.anIntArray198[local533] && local517 > Static44.anIntArray205[local533] - Static44.anIntArray202[local533]) {
						local517 = Static44.anIntArray205[local533] - Static44.anIntArray202[local533];
						local527 = true;
					}
				}
			}
			Static16.anInt504 = Static44.anIntArray198[local507];
			Static23.anInt776 = Static44.anIntArray205[local507] = local517;
			@Pc(642) Class45 local642 = Static44.aClass45Array12[local507];
			if (Static106.anInt2791 == 0) {
				@Pc(646) int local646 = 16776960;
				if (Static44.anIntArray203[local507] < 6) {
					local646 = Static28.anIntArray150[Static44.anIntArray203[local507]];
				}
				if (Static44.anIntArray203[local507] == 6) {
					local646 = Static14.anInt421 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static44.anIntArray203[local507] == 7) {
					local646 = Static14.anInt421 % 20 >= 10 ? 65535 : 255;
				}
				if (Static44.anIntArray203[local507] == 8) {
					local646 = Static14.anInt421 % 20 < 10 ? 45056 : 8454016;
				}
				@Pc(723) int local723;
				if (Static44.anIntArray203[local507] == 9) {
					local723 = 150 - Static44.anIntArray199[local507];
					if (local723 < 50) {
						local646 = local723 * 1280 + 16711680;
					} else if (local723 < 100) {
						local646 = 16384000 + 16776960 - local723 * 327680;
					} else if (local723 < 150) {
						local646 = local723 * 5 + 65280 - 500;
					}
				}
				if (Static44.anIntArray203[local507] == 10) {
					local723 = 150 - Static44.anIntArray199[local507];
					if (local723 < 50) {
						local646 = local723 * 5 + 16711680;
					} else if (local723 < 100) {
						local646 = 16711935 + 16384000 - local723 * 327680;
					} else if (local723 < 150) {
						local646 = local723 * 327680 - (local723 + -100) * 5 - 32767745;
					}
				}
				if (Static44.anIntArray203[local507] == 11) {
					local723 = 150 - Static44.anIntArray199[local507];
					if (local723 < 50) {
						local646 = 16777215 - local723 * 327685;
					} else if (local723 < 100) {
						local646 = (local723 - 50) * 327685 + 65280;
					} else if (local723 < 150) {
						local646 = 16777215 - (local723 - 100) * 327680;
					}
				}
				if (Static44.anIntArray209[local507] == 0) {
					Static8.aClass5_Sub2_Sub6_Sub1_1.method514(local642, Static16.anInt504, Static23.anInt776 + 1, 0);
					Static8.aClass5_Sub2_Sub6_Sub1_1.method514(local642, Static16.anInt504, Static23.anInt776, local646);
				}
				if (Static44.anIntArray209[local507] == 1) {
					Static8.aClass5_Sub2_Sub6_Sub1_1.method505(local642, Static16.anInt504, Static23.anInt776 + 1, 0, Static14.anInt421);
					Static8.aClass5_Sub2_Sub6_Sub1_1.method505(local642, Static16.anInt504, Static23.anInt776, local646, Static14.anInt421);
				}
				if (Static44.anIntArray209[local507] == 2) {
					Static8.aClass5_Sub2_Sub6_Sub1_1.method519(local642, Static16.anInt504, Static23.anInt776 + 1, 0, Static14.anInt421);
					Static8.aClass5_Sub2_Sub6_Sub1_1.method519(local642, Static16.anInt504, Static23.anInt776, local646, Static14.anInt421);
				}
				if (Static44.anIntArray209[local507] == 3) {
					Static8.aClass5_Sub2_Sub6_Sub1_1.method522(local642, Static16.anInt504, Static23.anInt776 + 1, 0, Static14.anInt421, 150 - Static44.anIntArray199[local507]);
					Static8.aClass5_Sub2_Sub6_Sub1_1.method522(local642, Static16.anInt504, Static23.anInt776, local646, Static14.anInt421, 150 - Static44.anIntArray199[local507]);
				}
				@Pc(987) int local987;
				if (Static44.anIntArray209[local507] == 4) {
					local723 = Static8.aClass5_Sub2_Sub6_Sub1_1.method520(local642);
					local987 = (150 - Static44.anIntArray199[local507]) * (local723 + 100) / 150;
					Static118.method1869(Static16.anInt504 - 50, 0, Static16.anInt504 + 50, 334);
					Static8.aClass5_Sub2_Sub6_Sub1_1.method506(local642, Static16.anInt504 + 50 - local987, Static23.anInt776 + 1, 0);
					Static8.aClass5_Sub2_Sub6_Sub1_1.method506(local642, Static16.anInt504 + 50 - local987, Static23.anInt776, local646);
					Static118.method1862();
				}
				if (Static44.anIntArray209[local507] == 5) {
					local987 = 0;
					local723 = 150 - Static44.anIntArray199[local507];
					Static118.method1869(0, Static23.anInt776 - Static8.aClass5_Sub2_Sub6_Sub1_1.anInt748 - 1, 512, Static23.anInt776 + 5);
					if (local723 < 25) {
						local987 = local723 - 25;
					} else if (local723 > 125) {
						local987 = local723 - 125;
					}
					Static8.aClass5_Sub2_Sub6_Sub1_1.method514(local642, Static16.anInt504, Static23.anInt776 + local987 + 1, 0);
					Static8.aClass5_Sub2_Sub6_Sub1_1.method514(local642, Static16.anInt504, local987 + Static23.anInt776, local646);
					Static118.method1862();
				}
			} else {
				Static8.aClass5_Sub2_Sub6_Sub1_1.method514(local642, Static16.anInt504, Static23.anInt776 + 1, 0);
				Static8.aClass5_Sub2_Sub6_Sub1_1.method514(local642, Static16.anInt504, Static23.anInt776, 16776960);
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIIZI)Z")
	public static boolean method2151(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!Static36.method768(arg3)) {
			return false;
		}
		Static48.aClass5_Sub2_Sub8Array2 = null;
		@Pc(30) boolean local30 = Static81.method1519(Static19.aClass5_Sub2_Sub8ArrayArray1[arg3], 0, 0, arg0, arg2, arg1, -1, 0, 0);
		if (Static48.aClass5_Sub2_Sub8Array2 != null) {
			Static81.method1519(Static48.aClass5_Sub2_Sub8Array2, 0, Static62.anInt1823, arg0, arg2, arg1, -1412584499, Static87.anInt2495, 0);
		}
		return local30;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)V")
	public static void method2153() {
		aClass45_1369 = null;
		anIntArray488 = null;
		anIntArrayArray31 = null;
		aClass45_1367 = null;
		aClass5_Sub2_Sub6_Sub3Array12 = null;
		aClass45_1372 = null;
		aClass45_1373 = null;
		aClass45_1371 = null;
		aClass45_1368 = null;
		anIntArray489 = null;
		aClass45_1370 = null;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIII)V")
	public static void method2154(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static96.aClass5_Sub2_Sub6_Sub4Array4[0].method1874(arg3, arg1);
		Static96.aClass5_Sub2_Sub6_Sub4Array4[1].method1874(arg3, arg0 + arg1 - 16);
		Static118.method1858(arg3, arg1 + 16, 16, arg0 - 32, Static56.anInt1692);
		@Pc(41) int local41 = arg0 * (arg0 - 32) / arg4;
		if (local41 < 8) {
			local41 = 8;
		}
		@Pc(59) int local59 = (arg0 - local41 - 32) * arg2 / (arg4 - arg0);
		Static118.method1858(arg3, local59 + arg1 + 16, 16, local41, Static29.anInt891);
		Static118.method1860(arg3, local59 + arg1 + 16, local41, Static112.anInt2972);
		Static118.method1860(arg3 + 1, local59 + arg1 + 16, local41, Static112.anInt2972);
		Static118.method1864(arg3, arg1 + local59 + 16, 16, Static112.anInt2972);
		Static118.method1864(arg3, local59 + arg1 + 17, 16, Static112.anInt2972);
		Static118.method1860(arg3 + 15, local59 + arg1 + 16, local41, Static38.anInt1084);
		Static118.method1860(arg3 + 14, arg1 + 17 - -local59, local41 - 1, Static38.anInt1084);
		Static118.method1864(arg3, local59 + arg1 + local41 + 15, 16, Static38.anInt1084);
		Static118.method1864(arg3 + 1, arg1 - (-local59 + -local41) + 14, 15, Static38.anInt1084);
	}
}
