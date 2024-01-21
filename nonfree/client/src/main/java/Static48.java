import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!i", name = "r", descriptor = "[I")
	public static int[] anIntArray140;

	@OriginalMember(owner = "client!i", name = "s", descriptor = "Z")
	public static boolean aBoolean123;

	@OriginalMember(owner = "client!i", name = "c", descriptor = "I")
	public static int anInt1298 = 0;

	@OriginalMember(owner = "client!i", name = "d", descriptor = "[Lclient!ec;")
	public static Class22[] aClass22Array9 = new Class22[500];

	@OriginalMember(owner = "client!i", name = "h", descriptor = "Z")
	public static boolean aBoolean122 = false;

	@OriginalMember(owner = "client!i", name = "i", descriptor = "Lclient!ec;")
	public static Class22 aClass22_321 = Static60.method1113(" )2>");

	@OriginalMember(owner = "client!i", name = "k", descriptor = "[Lclient!sa;")
	public static Class68[] aClass68Array1 = new Class68[50];

	@OriginalMember(owner = "client!i", name = "m", descriptor = "Lclient!ec;")
	public static Class22 aClass22_322 = Static60.method1113("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!i", name = "n", descriptor = "[Lclient!ec;")
	public static Class22[] aClass22Array10 = new Class22[1000];

	@OriginalMember(owner = "client!i", name = "o", descriptor = "Lclient!ec;")
	public static Class22 aClass22_323 = Static60.method1113("<col=40ff00>");

	@OriginalMember(owner = "client!i", name = "q", descriptor = "Lclient!ec;")
	public static Class22 aClass22_324 = Static60.method1113("(U1");

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II)Z")
	public static boolean method899(@OriginalArg(1) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
	public static void method900() {
		anIntArray140 = null;
		aClass22_321 = null;
		aClass22_322 = null;
		aClass22Array10 = null;
		aClass22_324 = null;
		aClass22_323 = null;
		aClass68Array1 = null;
		aClass22Array9 = null;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(III)I")
	public static int method901(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1;
		} else {
			arg1 = (arg0 & 0x7F) * arg1 / 128;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BIIII)V")
	public static void method902(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static99.anInt2588 = 0;
		@Pc(170) int local170;
		for (@Pc(14) int local14 = -1; local14 < Static51.anInt1461 + Static84.anInt2255; local14++) {
			@Pc(22) Class4_Sub1_Sub3_Sub2 local22;
			if (local14 == -1) {
				local22 = Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1;
			} else if (local14 < Static51.anInt1461) {
				local22 = Static44.aClass4_Sub1_Sub3_Sub2_Sub1Array1[Static115.anIntArray310[local14]];
			} else {
				local22 = Static12.aClass4_Sub1_Sub3_Sub2_Sub2Array1[Static13.anIntArray33[local14 - Static51.anInt1461]];
			}
			if (local22 != null && local22.method1614()) {
				@Pc(60) Class4_Sub1_Sub10 local60;
				if (local22 instanceof Class4_Sub1_Sub3_Sub2_Sub2) {
					local60 = ((Class4_Sub1_Sub3_Sub2_Sub2) local22).aClass4_Sub1_Sub10_1;
					if (local60.anIntArray221 != null) {
						local60 = local60.method1434();
					}
					if (local60 == null) {
						continue;
					}
				}
				if (Static51.anInt1461 <= local14) {
					local60 = ((Class4_Sub1_Sub3_Sub2_Sub2) local22).aClass4_Sub1_Sub10_1;
					if (local60.anIntArray221 != null) {
						local60 = local60.method1434();
					}
					if (local60.anInt2169 >= 0 && local60.anInt2169 < Static8.aClass4_Sub1_Sub2_Sub2Array13.length) {
						Static75.method1268(local22, local22.anInt2453 + 15);
						if (Static74.anInt1966 > -1) {
							Static8.aClass4_Sub1_Sub2_Sub2Array13[local60.anInt2169].method790(arg2 + Static74.anInt1966 - 12, Static108.anInt2723 + arg1 - 30);
						}
					}
					if (Static104.anInt2634 == 1 && Static66.anInt1863 == Static13.anIntArray33[local14 - Static51.anInt1461] && Static117.anInt2877 % 20 < 10) {
						Static75.method1268(local22, local22.anInt2453 + 15);
						if (Static74.anInt1966 > -1) {
							Static109.aClass4_Sub1_Sub2_Sub2Array4[0].method790(arg2 + Static74.anInt1966 - 12, arg1 + Static108.anInt2723 + -28);
						}
					}
				} else {
					local170 = 30;
					@Pc(173) Class4_Sub1_Sub3_Sub2_Sub1 local173 = (Class4_Sub1_Sub3_Sub2_Sub1) local22;
					if (local173.anInt1744 != -1 || local173.anInt1751 != -1) {
						Static75.method1268(local22, local22.anInt2453 + 15);
						if (Static74.anInt1966 > -1) {
							if (local173.anInt1744 != -1) {
								Static26.aClass4_Sub1_Sub2_Sub2Array8[local173.anInt1744].method790(arg2 + Static74.anInt1966 - 12, Static108.anInt2723 + -30 + arg1);
								local170 += 25;
							}
							if (local173.anInt1751 != -1) {
								Static8.aClass4_Sub1_Sub2_Sub2Array13[local173.anInt1751].method790(arg2 + Static74.anInt1966 - 12, -local170 + Static108.anInt2723 + arg1);
								local170 += 25;
							}
						}
					}
					if (local14 >= 0 && Static104.anInt2634 == 10 && Static115.anIntArray310[local14] == Static65.anInt1848) {
						Static75.method1268(local22, local22.anInt2453 + 15);
						if (Static74.anInt1966 > -1) {
							Static109.aClass4_Sub1_Sub2_Sub2Array4[1].method790(arg2 + Static74.anInt1966 - 12, -local170 + arg1 + Static108.anInt2723);
						}
					}
				}
				if (local22.aClass22_715 != null && (local14 >= Static51.anInt1461 || Static2.anInt10 == 0 || Static2.anInt10 == 3 || Static2.anInt10 == 1 && Static97.method1657(((Class4_Sub1_Sub3_Sub2_Sub1) local22).aClass22_444))) {
					Static75.method1268(local22, local22.anInt2453);
					if (Static74.anInt1966 > -1 && Static52.anInt1484 > Static99.anInt2588) {
						Static52.anIntArray153[Static99.anInt2588] = Static33.aClass4_Sub1_Sub2_Sub4_Sub1_2.method1392(local22.aClass22_715) / 2;
						Static52.anIntArray149[Static99.anInt2588] = Static33.aClass4_Sub1_Sub2_Sub4_Sub1_2.anInt2120;
						Static52.anIntArray152[Static99.anInt2588] = Static74.anInt1966;
						Static52.anIntArray154[Static99.anInt2588] = Static108.anInt2723;
						Static52.anIntArray151[Static99.anInt2588] = local22.anInt2506;
						Static52.anIntArray150[Static99.anInt2588] = local22.anInt2502;
						Static52.anIntArray147[Static99.anInt2588] = local22.anInt2468;
						Static52.aClass22Array13[Static99.anInt2588] = local22.aClass22_715;
						Static99.anInt2588++;
					}
				}
				if (Static117.anInt2877 < local22.anInt2456) {
					Static75.method1268(local22, local22.anInt2453 + 15);
					if (Static74.anInt1966 > -1) {
						local170 = local22.anInt2508 * 30 / local22.anInt2493;
						if (local170 > 30) {
							local170 = 30;
						}
						Static118.method1373(arg2 + Static74.anInt1966 - 15, arg1 - -Static108.anInt2723 + -3, local170, 5, 65280);
						Static118.method1373(local170 + Static74.anInt1966 + arg2 - 15, arg1 - -Static108.anInt2723 + -3, 30 - local170, 5, 16711680);
					}
				}
				for (local170 = 0; local170 < 4; local170++) {
					if (Static117.anInt2877 < local22.anIntArray276[local170]) {
						Static75.method1268(local22, local22.anInt2453 / 2);
						if (Static74.anInt1966 > -1) {
							if (local170 == 1) {
								Static108.anInt2723 -= 20;
							}
							if (local170 == 2) {
								Static74.anInt1966 -= 15;
								Static108.anInt2723 -= 10;
							}
							if (local170 == 3) {
								Static74.anInt1966 += 15;
								Static108.anInt2723 -= 10;
							}
							Static26.aClass4_Sub1_Sub2_Sub2Array9[local22.anIntArray278[local170]].method790(Static74.anInt1966 + arg2 - 12, Static108.anInt2723 + (arg1 - 12));
							Static18.aClass4_Sub1_Sub2_Sub4_Sub1_1.method1417(Static134.method2042(local22.anIntArray279[local170]), arg2 + Static74.anInt1966 - 1, arg1 - -Static108.anInt2723 + 3, 16777215, 0);
						}
					}
				}
			}
		}
		for (@Pc(542) int local542 = 0; local542 < Static99.anInt2588; local542++) {
			local170 = Static52.anIntArray152[local542];
			@Pc(552) int local552 = Static52.anIntArray154[local542];
			@Pc(556) int local556 = Static52.anIntArray153[local542];
			@Pc(560) int local560 = Static52.anIntArray149[local542];
			@Pc(562) boolean local562 = true;
			while (local562) {
				local562 = false;
				for (@Pc(568) int local568 = 0; local568 < local542; local568++) {
					if (Static52.anIntArray154[local568] - Static52.anIntArray149[local568] < local552 + 2 && Static52.anIntArray154[local568] + 2 > local552 + -local560 && local170 - local556 < Static52.anIntArray153[local568] + Static52.anIntArray152[local568] && local170 + local556 > -Static52.anIntArray153[local568] + Static52.anIntArray152[local568] && Static52.anIntArray154[local568] - Static52.anIntArray149[local568] < local552) {
						local552 = Static52.anIntArray154[local568] - Static52.anIntArray149[local568];
						local562 = true;
					}
				}
			}
			Static74.anInt1966 = Static52.anIntArray152[local542];
			Static108.anInt2723 = Static52.anIntArray154[local542] = local552;
			@Pc(672) Class22 local672 = Static52.aClass22Array13[local542];
			if (Static38.anInt949 == 0) {
				@Pc(692) int local692 = 16776960;
				if (Static52.anIntArray151[local542] < 6) {
					local692 = Static51.anIntArray144[Static52.anIntArray151[local542]];
				}
				if (Static52.anIntArray151[local542] == 6) {
					local692 = Static134.anInt3157 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static52.anIntArray151[local542] == 7) {
					local692 = Static134.anInt3157 % 20 >= 10 ? 65535 : 255;
				}
				if (Static52.anIntArray151[local542] == 8) {
					local692 = Static134.anInt3157 % 20 < 10 ? 45056 : 8454016;
				}
				@Pc(765) int local765;
				if (Static52.anIntArray151[local542] == 9) {
					local765 = 150 - Static52.anIntArray147[local542];
					if (local765 < 50) {
						local692 = local765 * 1280 + 16711680;
					} else if (local765 < 100) {
						local692 = 16384000 + 16776960 - local765 * 327680;
					} else if (local765 < 150) {
						local692 = (local765 - 100) * 5 + 65280;
					}
				}
				if (Static52.anIntArray151[local542] == 10) {
					local765 = 150 - Static52.anIntArray147[local542];
					if (local765 < 50) {
						local692 = local765 * 5 + 16711680;
					} else if (local765 < 100) {
						local692 = 16711935 - (local765 - 50) * 327680;
					} else if (local765 < 150) {
						local692 = local765 * 327680 + 255 + 500 - local765 * 5 - 32768000;
					}
				}
				if (Static52.anIntArray151[local542] == 11) {
					local765 = 150 - Static52.anIntArray147[local542];
					if (local765 < 50) {
						local692 = 16777215 - local765 * 327685;
					} else if (local765 < 100) {
						local692 = (local765 - 50) * 327685 + 65280;
					} else if (local765 < 150) {
						local692 = 16777215 - (local765 - 100) * 327680;
					}
				}
				if (Static52.anIntArray150[local542] == 0) {
					Static33.aClass4_Sub1_Sub2_Sub4_Sub1_2.method1417(local672, Static74.anInt1966 + arg2, Static108.anInt2723 + arg1, local692, 0);
				}
				if (Static52.anIntArray150[local542] == 1) {
					Static33.aClass4_Sub1_Sub2_Sub4_Sub1_2.method1406(local672, arg2 + Static74.anInt1966, Static108.anInt2723 + arg1, local692, Static134.anInt3157);
				}
				if (Static52.anIntArray150[local542] == 2) {
					Static33.aClass4_Sub1_Sub2_Sub4_Sub1_2.method1411(local672, Static74.anInt1966 + arg2, Static108.anInt2723 + arg1, local692, Static134.anInt3157);
				}
				if (Static52.anIntArray150[local542] == 3) {
					Static33.aClass4_Sub1_Sub2_Sub4_Sub1_2.method1414(local672, arg2 + Static74.anInt1966, arg1 + Static108.anInt2723, local692, Static134.anInt3157, 150 - Static52.anIntArray147[local542]);
				}
				if (Static52.anIntArray150[local542] == 4) {
					local765 = (150 - Static52.anIntArray147[local542]) * (Static33.aClass4_Sub1_Sub2_Sub4_Sub1_2.method1392(local672) + 100) / 150;
					Static118.method1385(Static74.anInt1966 + arg2 - 50, arg1, Static74.anInt1966 + arg2 + 50, arg1 + arg0);
					Static33.aClass4_Sub1_Sub2_Sub4_Sub1_2.method1415(local672, arg2 + Static74.anInt1966 + 50 - local765, arg1 - -Static108.anInt2723, local692, 0);
					Static118.method1386(arg2, arg1, arg2 + arg3, arg0 + arg1);
				}
				if (Static52.anIntArray150[local542] == 5) {
					local765 = 150 - Static52.anIntArray147[local542];
					Static118.method1385(arg2, arg1 + Static108.anInt2723 - Static33.aClass4_Sub1_Sub2_Sub4_Sub1_2.anInt2120 - 1, arg2 - -arg3, Static108.anInt2723 + arg1 + 5);
					@Pc(1093) int local1093 = 0;
					if (local765 < 25) {
						local1093 = local765 - 25;
					} else if (local765 > 125) {
						local1093 = local765 - 125;
					}
					Static33.aClass4_Sub1_Sub2_Sub4_Sub1_2.method1417(local672, arg2 + Static74.anInt1966, arg1 + Static108.anInt2723 + local1093, local692, 0);
					Static118.method1386(arg2, arg1, arg2 + arg3, arg0 + arg1);
				}
			} else {
				Static33.aClass4_Sub1_Sub2_Sub4_Sub1_2.method1417(local672, Static74.anInt1966 + arg2, Static108.anInt2723 + arg1, 16776960, 0);
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(II)Lclient!ie;")
	public static Class4_Sub1_Sub7 method903(@OriginalArg(1) int arg0) {
		@Pc(12) Class4_Sub1_Sub7 local12 = (Class4_Sub1_Sub7) Static3.aClass33_2.method998((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static38.aClass20_21.method597(16, arg0);
		local12 = new Class4_Sub1_Sub7();
		if (local22 != null) {
			local12.method964(new Class4_Sub11(local22));
		}
		Static3.aClass33_2.method997((long) arg0, local12);
		return local12;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Ljava/lang/Object;Lclient!dc;I)V")
	public static void method904(@OriginalArg(0) Object arg0, @OriginalArg(1) Class17 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < 50 && arg1.anEventQueue1.peekEvent() != null; local15++) {
			Static46.method889(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ILclient!ec;IIILclient!ec;I)V")
	public static void method905(@OriginalArg(0) int arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class22 arg4, @OriginalArg(6) int arg5) {
		if (Static22.aBoolean250 || Static99.anInt2589 >= 500) {
			return;
		}
		Static90.aClass22Array18[Static99.anInt2589] = arg1;
		aClass22Array9[Static99.anInt2589] = arg4;
		Static38.anIntArray111[Static99.anInt2589] = arg3;
		Static113.anIntArray306[Static99.anInt2589] = arg0;
		Static101.anIntArray290[Static99.anInt2589] = arg5;
		Static133.anIntArray344[Static99.anInt2589] = arg2;
		Static99.anInt2589++;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ec;Lclient!ec;ILclient!ea;)[Lclient!hb;")
	public static Class4_Sub1_Sub2_Sub3[] method906(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(3) Class20 arg2) {
		@Pc(8) int local8 = arg2.method592(arg1);
		@Pc(14) int local14 = arg2.method606(arg0, local8);
		return Static4.method35(local8, local14, arg2);
	}
}
