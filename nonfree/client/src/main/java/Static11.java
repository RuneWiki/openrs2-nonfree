import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ca", name = "U", descriptor = "I")
	public static int anInt291;

	@OriginalMember(owner = "client!ca", name = "bb", descriptor = "J")
	public static long aLong24;

	@OriginalMember(owner = "client!ca", name = "cb", descriptor = "Lclient!p;")
	public static Class45 aClass45_6;

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(B)V", line = 16)
	public static void method250() {
		aClass45_6 = null;
		Class2_Sub2_Sub3.aClass40_78 = null;
		Class2_Sub2_Sub3.aClass40_80 = null;
		Class2_Sub2_Sub3.aClass40_81 = null;
		Class2_Sub2_Sub3.aClass40_79 = null;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIII)I", line = 30)
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

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "(I)V", line = 76)
	public static void method252() {
		if (!Static68.aBoolean145) {
			return;
		}
		Static4.anIntArray17 = null;
		Static64.anIntArray355 = null;
		Static84.anIntArray472 = null;
		Static2.aClass45_3 = null;
		Static89.aClass2_Sub2_Sub2_Sub3_21 = null;
		Static35.anIntArray182 = null;
		Static45.aClass2_Sub2_Sub2_Sub3Array14 = null;
		Static99.aClass45_31 = null;
		Static62.aClass45_26 = null;
		Static56.aClass45_22 = null;
		Static30.aClass2_Sub2_Sub2_Sub3_8 = null;
		Static33.aClass45_16 = null;
		Static1.anIntArray1 = null;
		Static88.aClass2_Sub2_Sub2_Sub4_9 = null;
		Static14.anIntArray414 = null;
		Static20.aClass45_11 = null;
		Static90.aClass45_30 = null;
		Static56.aClass45_24 = null;
		Static66.anIntArray406 = null;
		Static95.anIntArray547 = null;
		Static72.aClass45_27 = null;
		Static10.aClass2_Sub2_Sub2_Sub4_1 = null;
		Static86.method1490();
		Static41.method787(true);
		Static68.aBoolean145 = false;
	}

	@OriginalMember(owner = "client!ca", name = "g", descriptor = "(I)V", line = 140)
	public static void method253() {
		Class52.anInt1974 = 0;
		@Pc(79) int local79;
		for (@Pc(9) int local9 = -1; local9 < Class41.anInt1800 + Class54.anInt2067; local9++) {
			@Pc(31) Class2_Sub2_Sub12_Sub1 local31;
			if (local9 == -1) {
				local31 = Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1;
			} else if (local9 >= Class54.anInt2067) {
				local31 = Class3.aClass2_Sub2_Sub12_Sub1_Sub2Array1[Class2_Sub2_Sub13.anIntArray326[local9 - Class54.anInt2067]];
			} else {
				local31 = Class2_Sub2_Sub15.aClass2_Sub2_Sub12_Sub1_Sub1Array1[Class41.anIntArray408[local9]];
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
				if (local9 >= Class54.anInt2067) {
					local60 = ((Class2_Sub2_Sub12_Sub1_Sub2) local31).aClass2_Sub2_Sub7_1;
					if (local60.anInt773 >= 0 && local60.anInt773 < Static53.aClass2_Sub2_Sub2_Sub4Array8.length) {
						Static95.method1649(local31.anInt2310 + 15, local31);
						if (Class14.anInt426 > -1) {
							Static53.aClass2_Sub2_Sub2_Sub4Array8[local60.anInt773].method1624(Class14.anInt426 - 12, Class18_Sub1.anInt477 - 30);
						}
					}
					if (Class57.anInt2139 == 1 && Class53.anInt1989 == Class2_Sub2_Sub13.anIntArray326[local9 - Class54.anInt2067] && Class24.anInt2511 % 20 < 10) {
						Static95.method1649(local31.anInt2310 + 15, local31);
						if (Class14.anInt426 > -1) {
							Static93.aClass2_Sub2_Sub2_Sub4Array10[0].method1624(Class14.anInt426 - 12, Class18_Sub1.anInt477 + -28);
						}
					}
				} else {
					@Pc(77) Class2_Sub2_Sub12_Sub1_Sub1 local77 = (Class2_Sub2_Sub12_Sub1_Sub1) local31;
					local79 = 30;
					if (local77.anInt1380 != -1 || local77.anInt1370 != -1) {
						Static95.method1649(local31.anInt2310 + 15, local31);
						if (Class14.anInt426 > -1) {
							if (local77.anInt1380 != -1) {
								Static41.aClass2_Sub2_Sub2_Sub4Array6[local77.anInt1380].method1624(Class14.anInt426 - 12, Class18_Sub1.anInt477 + -30);
								local79 += 25;
							}
							if (local77.anInt1370 != -1) {
								Static53.aClass2_Sub2_Sub2_Sub4Array8[local77.anInt1370].method1624(Class14.anInt426 - 12, Class18_Sub1.anInt477 - local79);
								local79 += 25;
							}
						}
					}
					if (local9 >= 0 && Class57.anInt2139 == 10 && Class2_Sub12.anInt2353 == Class41.anIntArray408[local9]) {
						Static95.method1649(local31.anInt2310 + 15, local31);
						if (Class14.anInt426 > -1) {
							Static93.aClass2_Sub2_Sub2_Sub4Array10[1].method1624(Class14.anInt426 - 12, -local79 + Class18_Sub1.anInt477);
						}
					}
				}
				if (local31.aClass40_660 != null && (Class54.anInt2067 <= local9 || Class2_Sub2_Sub4.anInt583 == 0 || Class2_Sub2_Sub4.anInt583 == 3 || Class2_Sub2_Sub4.anInt583 == 1 && Static36.method729(((Class2_Sub2_Sub12_Sub1_Sub1) local31).aClass40_395))) {
					Static95.method1649(local31.anInt2310, local31);
					if (Class14.anInt426 > -1 && Class52.anInt1974 < Class2_Sub2.anInt2457) {
						Class2_Sub2.anIntArray537[Class52.anInt1974] = Static13.aClass2_Sub2_Sub2_Sub2_1.method568(local31.aClass40_660) / 2;
						Class2_Sub2.anIntArray539[Class52.anInt1974] = Static13.aClass2_Sub2_Sub2_Sub2_1.anInt715;
						Class2_Sub2.anIntArray541[Class52.anInt1974] = Class14.anInt426;
						Class2_Sub2.anIntArray535[Class52.anInt1974] = Class18_Sub1.anInt477;
						Class2_Sub2.anIntArray538[Class52.anInt1974] = local31.anInt2301;
						Class2_Sub2.anIntArray542[Class52.anInt1974] = local31.anInt2271;
						Class2_Sub2.anIntArray540[Class52.anInt1974] = local31.anInt2294;
						Class2_Sub2.aClass40Array39[Class52.anInt1974] = local31.aClass40_660;
						Class52.anInt1974++;
					}
				}
				if (local31.anInt2315 > Class24.anInt2511) {
					Static95.method1649(local31.anInt2310 + 15, local31);
					if (Class14.anInt426 > -1) {
						local79 = local31.anInt2298 * 30 / local31.anInt2279;
						if (local79 > 30) {
							local79 = 30;
						}
						Static25.method1612(Class14.anInt426 - 15, Class18_Sub1.anInt477 + -3, local79, 5, 65280);
						Static25.method1612(local79 + Class14.anInt426 - 15, Class18_Sub1.anInt477 - 3, 30 - local79, 5, 16711680);
					}
				}
				for (local79 = 0; local79 < 4; local79++) {
					if (Class24.anInt2511 < local31.anIntArray494[local79]) {
						Static95.method1649(local31.anInt2310 / 2, local31);
						if (Class14.anInt426 > -1) {
							if (local79 == 1) {
								Class18_Sub1.anInt477 -= 20;
							}
							if (local79 == 2) {
								Class18_Sub1.anInt477 -= 10;
								Class14.anInt426 -= 15;
							}
							if (local79 == 3) {
								Class18_Sub1.anInt477 -= 10;
								Class14.anInt426 += 15;
							}
							Static27.aClass2_Sub2_Sub2_Sub4Array4[local31.anIntArray495[local79]].method1624(Class14.anInt426 - 12, Class18_Sub1.anInt477 + -12);
							Static70.aClass2_Sub2_Sub2_Sub2_4.method566(Static48.method859(local31.anIntArray493[local79]), Class14.anInt426, Class18_Sub1.anInt477 + 4, 0);
							Static70.aClass2_Sub2_Sub2_Sub2_4.method566(Static48.method859(local31.anIntArray493[local79]), Class14.anInt426 - 1, Class18_Sub1.anInt477 + 3, 16777215);
						}
					}
				}
			}
		}
		for (@Pc(498) int local498 = 0; local498 < Class52.anInt1974; local498++) {
			local79 = Class2_Sub2.anIntArray541[local498];
			@Pc(508) int local508 = Class2_Sub2.anIntArray535[local498];
			@Pc(512) int local512 = Class2_Sub2.anIntArray537[local498];
			@Pc(516) int local516 = Class2_Sub2.anIntArray539[local498];
			@Pc(518) boolean local518 = true;
			while (local518) {
				local518 = false;
				for (@Pc(524) int local524 = 0; local524 < local498; local524++) {
					if (Class2_Sub2.anIntArray535[local524] - Class2_Sub2.anIntArray539[local524] < local508 - -2 && local508 - local516 < Class2_Sub2.anIntArray535[local524] + 2 && local79 - local512 < Class2_Sub2.anIntArray541[local524] - -Class2_Sub2.anIntArray537[local524] && Class2_Sub2.anIntArray541[local524] - Class2_Sub2.anIntArray537[local524] < local512 + local79 && Class2_Sub2.anIntArray535[local524] - Class2_Sub2.anIntArray539[local524] < local508) {
						local508 = Class2_Sub2.anIntArray535[local524] - Class2_Sub2.anIntArray539[local524];
						local518 = true;
					}
				}
			}
			Class14.anInt426 = Class2_Sub2.anIntArray541[local498];
			Class18_Sub1.anInt477 = Class2_Sub2.anIntArray535[local498] = local508;
			@Pc(627) Class40 local627 = Class2_Sub2.aClass40Array39[local498];
			if (Class2_Sub9.anInt1186 == 0) {
				@Pc(634) int local634 = 16776960;
				if (Class2_Sub2.anIntArray538[local498] < 6) {
					local634 = Class61.anIntArray519[Class2_Sub2.anIntArray538[local498]];
				}
				if (Class2_Sub2.anIntArray538[local498] == 6) {
					local634 = Class2_Sub3.anInt2587 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Class2_Sub2.anIntArray538[local498] == 7) {
					local634 = Class2_Sub3.anInt2587 % 20 >= 10 ? 65535 : 255;
				}
				if (Class2_Sub2.anIntArray538[local498] == 8) {
					local634 = Class2_Sub3.anInt2587 % 20 < 10 ? 45056 : 8454016;
				}
				@Pc(703) int local703;
				if (Class2_Sub2.anIntArray538[local498] == 9) {
					local703 = 150 - Class2_Sub2.anIntArray540[local498];
					if (local703 < 50) {
						local634 = local703 * 1280 + 16711680;
					} else if (local703 < 100) {
						local634 = 16776960 - (local703 - 50) * 327680;
					} else if (local703 < 150) {
						local634 = (local703 - 100) * 5 + 65280;
					}
				}
				if (Class2_Sub2.anIntArray538[local498] == 10) {
					local703 = 150 - Class2_Sub2.anIntArray540[local498];
					if (local703 < 50) {
						local634 = local703 * 5 + 16711680;
					} else if (local703 < 100) {
						local634 = 16384000 + 16711935 - local703 * 327680;
					} else if (local703 < 150) {
						local634 = local703 * 327680 + 255 + 500 - local703 * 5 - 32768000;
					}
				}
				if (Class2_Sub2.anIntArray538[local498] == 11) {
					local703 = 150 - Class2_Sub2.anIntArray540[local498];
					if (local703 < 50) {
						local634 = 16777215 - local703 * 327685;
					} else if (local703 < 100) {
						local634 = local703 * 327685 - 16318970;
					} else if (local703 < 150) {
						local634 = 32768000 + 16777215 - local703 * 327680;
					}
				}
				if (Class2_Sub2.anIntArray542[local498] == 0) {
					Static13.aClass2_Sub2_Sub2_Sub2_1.method566(local627, Class14.anInt426, Class18_Sub1.anInt477 + 1, 0);
					Static13.aClass2_Sub2_Sub2_Sub2_1.method566(local627, Class14.anInt426, Class18_Sub1.anInt477, local634);
				}
				if (Class2_Sub2.anIntArray542[local498] == 1) {
					Static13.aClass2_Sub2_Sub2_Sub2_1.method564(local627, Class14.anInt426, Class18_Sub1.anInt477 + 1, 0, Class2_Sub3.anInt2587);
					Static13.aClass2_Sub2_Sub2_Sub2_1.method564(local627, Class14.anInt426, Class18_Sub1.anInt477, local634, Class2_Sub3.anInt2587);
				}
				if (Class2_Sub2.anIntArray542[local498] == 2) {
					Static13.aClass2_Sub2_Sub2_Sub2_1.method570(local627, Class14.anInt426, Class18_Sub1.anInt477 + 1, 0, Class2_Sub3.anInt2587);
					Static13.aClass2_Sub2_Sub2_Sub2_1.method570(local627, Class14.anInt426, Class18_Sub1.anInt477, local634, Class2_Sub3.anInt2587);
				}
				if (Class2_Sub2.anIntArray542[local498] == 3) {
					Static13.aClass2_Sub2_Sub2_Sub2_1.method577(local627, Class14.anInt426, Class18_Sub1.anInt477 + 1, 0, Class2_Sub3.anInt2587, 150 - Class2_Sub2.anIntArray540[local498]);
					Static13.aClass2_Sub2_Sub2_Sub2_1.method577(local627, Class14.anInt426, Class18_Sub1.anInt477, local634, Class2_Sub3.anInt2587, 150 - Class2_Sub2.anIntArray540[local498]);
				}
				@Pc(971) int local971;
				if (Class2_Sub2.anIntArray542[local498] == 4) {
					local703 = Static13.aClass2_Sub2_Sub2_Sub2_1.method568(local627);
					local971 = (local703 + 100) * (150 - Class2_Sub2.anIntArray540[local498]) / 150;
					Static25.method1613(Class14.anInt426 - 50, 0, Class14.anInt426 + 50, 334);
					Static13.aClass2_Sub2_Sub2_Sub2_1.method575(local627, Class14.anInt426 + 50 - local971, Class18_Sub1.anInt477 - -1, 0);
					Static13.aClass2_Sub2_Sub2_Sub2_1.method575(local627, Class14.anInt426 + 50 - local971, Class18_Sub1.anInt477, local634);
					Static25.method1614();
				}
				if (Class2_Sub2.anIntArray542[local498] == 5) {
					local703 = 150 - Class2_Sub2.anIntArray540[local498];
					Static25.method1613(0, Class18_Sub1.anInt477 - Static13.aClass2_Sub2_Sub2_Sub2_1.anInt715 - 1, 512, Class18_Sub1.anInt477 + 5);
					local971 = 0;
					if (local703 < 25) {
						local971 = local703 - 25;
					} else if (local703 > 125) {
						local971 = local703 - 125;
					}
					Static13.aClass2_Sub2_Sub2_Sub2_1.method566(local627, Class14.anInt426, local971 + Class18_Sub1.anInt477 + 1, 0);
					Static13.aClass2_Sub2_Sub2_Sub2_1.method566(local627, Class14.anInt426, Class18_Sub1.anInt477 + local971, local634);
					Static25.method1614();
				}
			} else {
				Static13.aClass2_Sub2_Sub2_Sub2_1.method566(local627, Class14.anInt426, Class18_Sub1.anInt477 + 1, 0);
				Static13.aClass2_Sub2_Sub2_Sub2_1.method566(local627, Class14.anInt426, Class18_Sub1.anInt477, 16776960);
			}
		}
	}
}
