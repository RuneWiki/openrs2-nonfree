import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ca", name = "U", descriptor = "I")
	public static int anInt291;

	@OriginalMember(owner = "client!ca", name = "bb", descriptor = "J")
	public static long aLong24;

	@OriginalMember(owner = "client!ca", name = "cb", descriptor = "Lclient!p;")
	public static Class45 aClass45_6;

	@OriginalMember(owner = "client!ca", name = "Q", descriptor = "Lclient!o;")
	public static Class40 aClass40_78 = Static13.method257("sideicons");

	@OriginalMember(owner = "client!ca", name = "R", descriptor = "Z")
	public static boolean aBoolean27 = true;

	@OriginalMember(owner = "client!ca", name = "S", descriptor = "Lclient!o;")
	public static Class40 aClass40_79 = Static13.method257("Enter name of friend to add to list");

	@OriginalMember(owner = "client!ca", name = "X", descriptor = "Lclient!o;")
	public static Class40 aClass40_80 = Static13.method257("scape main");

	@OriginalMember(owner = "client!ca", name = "Y", descriptor = "Lclient!o;")
	public static Class40 aClass40_81 = Static13.method257("Examine @lre@");

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(B)V")
	public static void method250() {
		aClass45_6 = null;
		aClass40_78 = null;
		aClass40_80 = null;
		aClass40_81 = null;
		aClass40_79 = null;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIII)I")
	public static int method251(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > 179) {
			arg1 /= 2;
		}
		if (arg0 > 192) {
			arg1 /= 2;
		}
		if (arg0 > 217) {
			arg1 /= 2;
		}
		if (arg0 > 243) {
			arg1 /= 2;
		}
		return arg0 / 2 + (arg1 / 32 << 7) + (arg2 / 4 << 10);
	}

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "(I)V")
	public static void method252() {
		if (!Static74.aBoolean145) {
			return;
		}
		Static4.anIntArray17 = null;
		Static70.anIntArray355 = null;
		Static92.anIntArray472 = null;
		Static2.aClass45_3 = null;
		Static97.aClass2_Sub2_Sub2_Sub3_21 = null;
		Static37.anIntArray182 = null;
		Static49.aClass2_Sub2_Sub2_Sub3Array14 = null;
		Static107.aClass45_31 = null;
		Static67.aClass45_26 = null;
		Static61.aClass45_22 = null;
		Static32.aClass2_Sub2_Sub2_Sub3_8 = null;
		Static35.aClass45_16 = null;
		Static1.anIntArray1 = null;
		Static96.aClass2_Sub2_Sub2_Sub4_9 = null;
		Static15.anIntArray414 = null;
		Static21.aClass45_11 = null;
		Static98.aClass45_30 = null;
		Static61.aClass45_24 = null;
		Static72.anIntArray406 = null;
		Static103.anIntArray547 = null;
		Static80.aClass45_27 = null;
		Static11.aClass2_Sub2_Sub2_Sub4_1 = null;
		Static94.method1490();
		Static44.method787(true);
		Static74.aBoolean145 = false;
	}

	@OriginalMember(owner = "client!ca", name = "g", descriptor = "(I)V")
	public static void method253() {
		Static84.anInt1974 = 0;
		@Pc(79) int local79;
		for (@Pc(9) int local9 = -1; local9 < Static73.anInt1800 + Static88.anInt2067; local9++) {
			@Pc(31) Class2_Sub2_Sub12_Sub1 local31;
			if (local9 == -1) {
				local31 = Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1;
			} else if (local9 >= Static88.anInt2067) {
				local31 = Static2.aClass2_Sub2_Sub12_Sub1_Sub2Array1[Static63.anIntArray326[local9 - Static88.anInt2067]];
			} else {
				local31 = Static100.aClass2_Sub2_Sub12_Sub1_Sub1Array1[Static73.anIntArray408[local9]];
			}
			if (local31 != null && local31.method1544()) {
				@Pc(60) Class2_Sub2_Sub7 local60;
				if (local31 instanceof Class2_Sub2_Sub12_Sub1_Sub2) {
					local60 = ((Class2_Sub2_Sub12_Sub1_Sub2) local31).aClass2_Sub2_Sub7_1;
					if (local60.anIntArray154 != null) {
						local60 = local60.method611();
					}
					if (local60 == null) {
						continue;
					}
				}
				if (local9 >= Static88.anInt2067) {
					local60 = ((Class2_Sub2_Sub12_Sub1_Sub2) local31).aClass2_Sub2_Sub7_1;
					if (local60.anInt773 >= 0 && local60.anInt773 < Static58.aClass2_Sub2_Sub2_Sub4Array8.length) {
						Static103.method1649(local31.anInt2310 + 15, local31);
						if (Static17.anInt426 > -1) {
							Static58.aClass2_Sub2_Sub2_Sub4Array8[local60.anInt773].method1624(Static17.anInt426 - 12, Static20.anInt477 - 30);
						}
					}
					if (Static91.anInt2139 == 1 && Static85.anInt1989 == Static63.anIntArray326[local9 - Static88.anInt2067] && Static107.anInt2511 % 20 < 10) {
						Static103.method1649(local31.anInt2310 + 15, local31);
						if (Static17.anInt426 > -1) {
							Static101.aClass2_Sub2_Sub2_Sub4Array10[0].method1624(Static17.anInt426 - 12, Static20.anInt477 + -28);
						}
					}
				} else {
					@Pc(77) Class2_Sub2_Sub12_Sub1_Sub1 local77 = (Class2_Sub2_Sub12_Sub1_Sub1) local31;
					local79 = 30;
					if (local77.anInt1380 != -1 || local77.anInt1370 != -1) {
						Static103.method1649(local31.anInt2310 + 15, local31);
						if (Static17.anInt426 > -1) {
							if (local77.anInt1380 != -1) {
								Static44.aClass2_Sub2_Sub2_Sub4Array6[local77.anInt1380].method1624(Static17.anInt426 - 12, Static20.anInt477 + -30);
								local79 += 25;
							}
							if (local77.anInt1370 != -1) {
								Static58.aClass2_Sub2_Sub2_Sub4Array8[local77.anInt1370].method1624(Static17.anInt426 - 12, Static20.anInt477 - local79);
								local79 += 25;
							}
						}
					}
					if (local9 >= 0 && Static91.anInt2139 == 10 && Static97.anInt2353 == Static73.anIntArray408[local9]) {
						Static103.method1649(local31.anInt2310 + 15, local31);
						if (Static17.anInt426 > -1) {
							Static101.aClass2_Sub2_Sub2_Sub4Array10[1].method1624(Static17.anInt426 - 12, -local79 + Static20.anInt477);
						}
					}
				}
				if (local31.aClass40_660 != null && (Static88.anInt2067 <= local9 || Static23.anInt583 == 0 || Static23.anInt583 == 3 || Static23.anInt583 == 1 && Static38.method729(((Class2_Sub2_Sub12_Sub1_Sub1) local31).aClass40_395))) {
					Static103.method1649(local31.anInt2310, local31);
					if (Static17.anInt426 > -1 && Static84.anInt1974 < Static46.anInt2457) {
						Static46.anIntArray537[Static84.anInt1974] = Static14.aClass2_Sub2_Sub2_Sub2_1.method568(local31.aClass40_660) / 2;
						Static46.anIntArray539[Static84.anInt1974] = Static14.aClass2_Sub2_Sub2_Sub2_1.anInt715;
						Static46.anIntArray541[Static84.anInt1974] = Static17.anInt426;
						Static46.anIntArray535[Static84.anInt1974] = Static20.anInt477;
						Static46.anIntArray538[Static84.anInt1974] = local31.anInt2301;
						Static46.anIntArray542[Static84.anInt1974] = local31.anInt2271;
						Static46.anIntArray540[Static84.anInt1974] = local31.anInt2294;
						Static46.aClass40Array39[Static84.anInt1974] = local31.aClass40_660;
						Static84.anInt1974++;
					}
				}
				if (local31.anInt2315 > Static107.anInt2511) {
					Static103.method1649(local31.anInt2310 + 15, local31);
					if (Static17.anInt426 > -1) {
						local79 = local31.anInt2298 * 30 / local31.anInt2279;
						if (local79 > 30) {
							local79 = 30;
						}
						Static26.method1612(Static17.anInt426 - 15, Static20.anInt477 + -3, local79, 5, 65280);
						Static26.method1612(local79 + Static17.anInt426 - 15, Static20.anInt477 - 3, 30 - local79, 5, 16711680);
					}
				}
				for (local79 = 0; local79 < 4; local79++) {
					if (Static107.anInt2511 < local31.anIntArray494[local79]) {
						Static103.method1649(local31.anInt2310 / 2, local31);
						if (Static17.anInt426 > -1) {
							if (local79 == 1) {
								Static20.anInt477 -= 20;
							}
							if (local79 == 2) {
								Static20.anInt477 -= 10;
								Static17.anInt426 -= 15;
							}
							if (local79 == 3) {
								Static20.anInt477 -= 10;
								Static17.anInt426 += 15;
							}
							Static29.aClass2_Sub2_Sub2_Sub4Array4[local31.anIntArray495[local79]].method1624(Static17.anInt426 - 12, Static20.anInt477 + -12);
							Static76.aClass2_Sub2_Sub2_Sub2_4.method566(Static53.method859(local31.anIntArray493[local79]), Static17.anInt426, Static20.anInt477 + 4, 0);
							Static76.aClass2_Sub2_Sub2_Sub2_4.method566(Static53.method859(local31.anIntArray493[local79]), Static17.anInt426 - 1, Static20.anInt477 + 3, 16777215);
						}
					}
				}
			}
		}
		for (@Pc(498) int local498 = 0; local498 < Static84.anInt1974; local498++) {
			local79 = Static46.anIntArray541[local498];
			@Pc(508) int local508 = Static46.anIntArray535[local498];
			@Pc(512) int local512 = Static46.anIntArray537[local498];
			@Pc(516) int local516 = Static46.anIntArray539[local498];
			@Pc(518) boolean local518 = true;
			while (local518) {
				local518 = false;
				for (@Pc(524) int local524 = 0; local524 < local498; local524++) {
					if (Static46.anIntArray535[local524] - Static46.anIntArray539[local524] < local508 - -2 && local508 - local516 < Static46.anIntArray535[local524] + 2 && local79 - local512 < Static46.anIntArray541[local524] - -Static46.anIntArray537[local524] && Static46.anIntArray541[local524] - Static46.anIntArray537[local524] < local512 + local79 && Static46.anIntArray535[local524] - Static46.anIntArray539[local524] < local508) {
						local508 = Static46.anIntArray535[local524] - Static46.anIntArray539[local524];
						local518 = true;
					}
				}
			}
			Static17.anInt426 = Static46.anIntArray541[local498];
			Static20.anInt477 = Static46.anIntArray535[local498] = local508;
			@Pc(627) Class40 local627 = Static46.aClass40Array39[local498];
			if (Static53.anInt1186 == 0) {
				@Pc(634) int local634 = 16776960;
				if (Static46.anIntArray538[local498] < 6) {
					local634 = Static101.anIntArray519[Static46.anIntArray538[local498]];
				}
				if (Static46.anIntArray538[local498] == 6) {
					local634 = Static22.anInt2587 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static46.anIntArray538[local498] == 7) {
					local634 = Static22.anInt2587 % 20 >= 10 ? 65535 : 255;
				}
				if (Static46.anIntArray538[local498] == 8) {
					local634 = Static22.anInt2587 % 20 < 10 ? 45056 : 8454016;
				}
				@Pc(703) int local703;
				if (Static46.anIntArray538[local498] == 9) {
					local703 = 150 - Static46.anIntArray540[local498];
					if (local703 < 50) {
						local634 = local703 * 1280 + 16711680;
					} else if (local703 < 100) {
						local634 = 16776960 - (local703 - 50) * 327680;
					} else if (local703 < 150) {
						local634 = (local703 - 100) * 5 + 65280;
					}
				}
				if (Static46.anIntArray538[local498] == 10) {
					local703 = 150 - Static46.anIntArray540[local498];
					if (local703 < 50) {
						local634 = local703 * 5 + 16711680;
					} else if (local703 < 100) {
						local634 = 16384000 + 16711935 - local703 * 327680;
					} else if (local703 < 150) {
						local634 = local703 * 327680 + 255 + 500 - local703 * 5 - 32768000;
					}
				}
				if (Static46.anIntArray538[local498] == 11) {
					local703 = 150 - Static46.anIntArray540[local498];
					if (local703 < 50) {
						local634 = 16777215 - local703 * 327685;
					} else if (local703 < 100) {
						local634 = local703 * 327685 - 16318970;
					} else if (local703 < 150) {
						local634 = 32768000 + 16777215 - local703 * 327680;
					}
				}
				if (Static46.anIntArray542[local498] == 0) {
					Static14.aClass2_Sub2_Sub2_Sub2_1.method566(local627, Static17.anInt426, Static20.anInt477 + 1, 0);
					Static14.aClass2_Sub2_Sub2_Sub2_1.method566(local627, Static17.anInt426, Static20.anInt477, local634);
				}
				if (Static46.anIntArray542[local498] == 1) {
					Static14.aClass2_Sub2_Sub2_Sub2_1.method564(local627, Static17.anInt426, Static20.anInt477 + 1, 0, Static22.anInt2587);
					Static14.aClass2_Sub2_Sub2_Sub2_1.method564(local627, Static17.anInt426, Static20.anInt477, local634, Static22.anInt2587);
				}
				if (Static46.anIntArray542[local498] == 2) {
					Static14.aClass2_Sub2_Sub2_Sub2_1.method570(local627, Static17.anInt426, Static20.anInt477 + 1, 0, Static22.anInt2587);
					Static14.aClass2_Sub2_Sub2_Sub2_1.method570(local627, Static17.anInt426, Static20.anInt477, local634, Static22.anInt2587);
				}
				if (Static46.anIntArray542[local498] == 3) {
					Static14.aClass2_Sub2_Sub2_Sub2_1.method577(local627, Static17.anInt426, Static20.anInt477 + 1, 0, Static22.anInt2587, 150 - Static46.anIntArray540[local498]);
					Static14.aClass2_Sub2_Sub2_Sub2_1.method577(local627, Static17.anInt426, Static20.anInt477, local634, Static22.anInt2587, 150 - Static46.anIntArray540[local498]);
				}
				@Pc(971) int local971;
				if (Static46.anIntArray542[local498] == 4) {
					local703 = Static14.aClass2_Sub2_Sub2_Sub2_1.method568(local627);
					local971 = (local703 + 100) * (150 - Static46.anIntArray540[local498]) / 150;
					Static26.method1613(Static17.anInt426 - 50, 0, Static17.anInt426 + 50, 334);
					Static14.aClass2_Sub2_Sub2_Sub2_1.method575(local627, Static17.anInt426 + 50 - local971, Static20.anInt477 - -1, 0);
					Static14.aClass2_Sub2_Sub2_Sub2_1.method575(local627, Static17.anInt426 + 50 - local971, Static20.anInt477, local634);
					Static26.method1614();
				}
				if (Static46.anIntArray542[local498] == 5) {
					local703 = 150 - Static46.anIntArray540[local498];
					Static26.method1613(0, Static20.anInt477 - Static14.aClass2_Sub2_Sub2_Sub2_1.anInt715 - 1, 512, Static20.anInt477 + 5);
					local971 = 0;
					if (local703 < 25) {
						local971 = local703 - 25;
					} else if (local703 > 125) {
						local971 = local703 - 125;
					}
					Static14.aClass2_Sub2_Sub2_Sub2_1.method566(local627, Static17.anInt426, local971 + Static20.anInt477 + 1, 0);
					Static14.aClass2_Sub2_Sub2_Sub2_1.method566(local627, Static17.anInt426, Static20.anInt477 + local971, local634);
					Static26.method1614();
				}
			} else {
				Static14.aClass2_Sub2_Sub2_Sub2_1.method566(local627, Static17.anInt426, Static20.anInt477 + 1, 0);
				Static14.aClass2_Sub2_Sub2_Sub2_1.method566(local627, Static17.anInt426, Static20.anInt477, 16776960);
			}
		}
	}
}
