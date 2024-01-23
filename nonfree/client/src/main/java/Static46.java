import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "S")
	public static short aShort54 = 32767;

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
	public static int anInt4143 = 0;

	@OriginalMember(owner = "client!ee", name = "i", descriptor = "Lclient!i;")
	public static Class41 aClass41_1094 = Static184.method2923("_");

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
	public static void method2852() {
		if (Static120.aClass80_11 != null || Static160.aClass80_13 != null) {
			return;
		}
		@Pc(18) int local18 = Static34.anInt909;
		@Pc(81) int local81;
		@Pc(87) int local87;
		if (Static94.aBoolean123) {
			@Pc(173) int local173;
			if (local18 != 1) {
				local173 = Static26.anInt663;
				local81 = Static212.anInt4711;
				if (Static75.anInt3784 - 10 > local173 || Static75.anInt3784 + Static210.anInt4696 + 10 < local173 || local81 < Static208.anInt4650 - 10 || Static43.anInt1299 + Static208.anInt4650 + 10 < local81) {
					Static94.aBoolean123 = false;
					Static111.method1901(Static43.anInt1299, Static210.anInt4696, Static208.anInt4650, Static75.anInt3784);
				}
			}
			if (local18 != 1) {
				return;
			}
			local173 = Static75.anInt3784;
			local81 = Static208.anInt4650;
			local87 = Static210.anInt4696;
			@Pc(222) int local222 = Static200.anInt4491;
			@Pc(224) int local224 = Static154.anInt3614;
			@Pc(226) int local226 = -1;
			for (@Pc(228) int local228 = 0; local228 < Static179.anInt4150; local228++) {
				@Pc(244) int local244 = local81 + (-local228 + Static179.anInt4150 + -1) * 15 + 31;
				if (local222 > local173 && local222 < local173 + local87 && local224 > local244 - 13 && local224 < local244 + 3) {
					local226 = local228;
				}
			}
			if (local226 != -1) {
				Static157.method2554(local226);
			}
			Static94.aBoolean123 = false;
			Static111.method1901(Static43.anInt1299, Static210.anInt4696, Static208.anInt4650, Static75.anInt3784);
			return;
		}
		if (local18 == 1 && Static179.anInt4150 > 0) {
			@Pc(31) short local31 = Static48.aShortArray34[Static179.anInt4150 - 1];
			if (local31 == 6 || local31 == 8 || local31 == 49 || local31 == 44 || local31 == 13 || local31 == 28 || local31 == 9 || local31 == 2 || local31 == 21 || local31 == 18 || local31 == 12 || local31 == 1001) {
				local81 = Static148.anIntArray346[Static179.anInt4150 - 1];
				local87 = Static192.anIntArray451[Static179.anInt4150 - 1];
				@Pc(91) Class80 local91 = Static212.method3256(local87);
				if (Static61.method1141(Static70.method1287(local91)) || Static144.method2241(Static70.method1287(local91))) {
					Static220.anInt4800 = 0;
					Static39.aBoolean56 = false;
					if (Static120.aClass80_11 != null) {
						Static176.method2833(Static120.aClass80_11);
					}
					Static120.aClass80_11 = Static212.method3256(local87);
					Static17.anInt473 = local81;
					Static194.anInt4770 = Static200.anInt4491;
					Static44.anInt1329 = Static154.anInt3614;
					Static176.method2833(Static120.aClass80_11);
					return;
				}
			}
		}
		if (local18 == 1 && (Static179.anInt4148 == 1 && Static179.anInt4150 > 2 || Static208.method3215(Static179.anInt4150 - 1))) {
			local18 = 2;
		}
		if (local18 == 1 && Static179.anInt4150 > 0) {
			Static157.method2554(Static179.anInt4150 - 1);
		}
		if (local18 == 2 && Static179.anInt4150 > 0) {
			Static121.method3317();
			return;
		}
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(III)V")
	public static void method2854(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static104.aBoolean136 = true;
		Static118.anInt2857 = arg0;
		Static36.anInt953 = arg1;
		Static33.anInt889 = arg2;
		Static100.anInt2439 = -1;
		Static79.anInt2049 = -1;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BZI)Lclient!i;")
	public static Class41 method2855(@OriginalArg(2) int arg0) {
		return Static194.method3307(true, arg0);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLclient!hj;)V")
	public static void method2856(@OriginalArg(1) Applet_Sub1 arg0) {
		if (Static185.aBoolean264) {
			Static58.method1127(arg0);
			return;
		}
		if (Static34.anInt909 == 1 && Static200.anInt4491 >= 715 && Static154.anInt3614 >= 453) {
			Static116.aBoolean150 = !Static116.aBoolean150;
			if (Static116.aBoolean150) {
				Static1.method2636();
			} else {
				Static48.method960(Static86.aClass15_Sub1_57, Static75.anInt3787, 255);
			}
		}
		if (Static203.anInt4533 == 5) {
			return;
		}
		Static75.anInt3785++;
		if (Static203.anInt4533 != 10) {
			return;
		}
		if (Static128.anInt2993 != 2) {
			if (Static34.anInt909 == 1 && Static200.anInt4491 >= 5 && Static200.anInt4491 <= 105 && Static154.anInt3614 >= 463 && Static154.anInt3614 <= 498) {
				Static100.method1726();
				return;
			}
			if (Static114.aClass3_1 != null) {
				Static100.method1726();
			}
		}
		@Pc(114) int local114 = Static34.anInt909;
		@Pc(116) int local116 = Static200.anInt4491;
		@Pc(118) int local118 = Static154.anInt3614;
		if (Static58.anInt1632 == 0) {
			if (local114 == 1 && local116 >= 227 && local116 <= 377 && local118 >= 271 && local118 <= 311) {
				Static127.anInt2964 = 0;
				Static58.anInt1632 = 3;
			}
			@Pc(162) boolean local162 = false;
			if (Static101.anInt2449 != 0) {
				while (Static39.method823()) {
					if (Static122.anInt2920 == 84) {
						local162 = true;
						break;
					}
				}
			}
			if (local162 || local114 == 1 && local116 >= 387 && local116 <= 537 && local118 >= 271 && local118 <= 311) {
				Static58.anInt1632 = 2;
				Static185.aClass41_1122 = Static62.aClass41_492;
				Static185.aClass41_1123 = Static62.aClass41_512;
				Static127.anInt2964 = 0;
				Static185.aClass41_1121 = Static15.aClass41_92;
			}
		} else if (Static58.anInt1632 == 2) {
			@Pc(284) short local284 = 231;
			@Pc(287) int local287 = local284 + 30;
			if (local114 == 1 && local118 >= 246 && local118 < 261) {
				Static127.anInt2964 = 0;
			}
			local287 += 15;
			if (local114 == 1 && local118 >= 261 && local118 < 276) {
				Static127.anInt2964 = 1;
			}
			local287 += 15;
			if (local114 == 1 && local116 >= 227 && local116 <= 377 && local118 >= 301 && local118 <= 341) {
				Static185.aClass41_1117 = Static185.aClass41_1117.method1400().method1403();
				if (Static185.aClass41_1117.method1393() == 0) {
					Static32.method629(Static62.aClass41_499, Static62.aClass41_509, Static3.aClass41_24);
				} else if (Static185.aClass41_1118.method1393() == 0) {
					Static32.method629(Static62.aClass41_502, Static62.aClass41_504, Static35.aClass41_257);
				} else {
					Static32.method629(Static62.aClass41_520, Static62.aClass41_491, Static54.aClass41_449);
					Static116.method1955(20);
				}
			} else {
				if (local114 == 1 && local116 >= 387 && local116 <= 537 && local118 >= 301 && local118 <= 341) {
					Static185.aClass41_1117 = Static185.aClass41_1119;
					Static58.anInt1632 = 0;
					Static185.aClass41_1118 = Static185.aClass41_1119;
				}
				while (true) {
					@Pc(451) boolean local451;
					label226: do {
						while (Static39.method823()) {
							local451 = false;
							for (@Pc(453) int local453 = 0; local453 < Static65.aClass41_539.method1393(); local453++) {
								if (Static194.anInt4772 == Static65.aClass41_539.method1388(local453)) {
									local451 = true;
									break;
								}
							}
							if (Static127.anInt2964 != 0) {
								continue label226;
							}
							if (Static122.anInt2920 == 85 && Static185.aClass41_1117.method1393() > 0) {
								Static185.aClass41_1117 = Static185.aClass41_1117.method1412(0, Static185.aClass41_1117.method1393() - 1);
							}
							if (Static122.anInt2920 == 84 || Static122.anInt2920 == 80) {
								Static127.anInt2964 = 1;
							}
							if (local451 && Static185.aClass41_1117.method1393() < 12) {
								Static185.aClass41_1117 = Static185.aClass41_1117.method1407(Static194.anInt4772);
							}
						}
						return;
					} while (Static127.anInt2964 != 1);
					if (Static122.anInt2920 == 85 && Static185.aClass41_1118.method1393() > 0) {
						Static185.aClass41_1118 = Static185.aClass41_1118.method1412(0, Static185.aClass41_1118.method1393() - 1);
					}
					if (Static122.anInt2920 == 84 || Static122.anInt2920 == 80) {
						Static127.anInt2964 = 0;
					}
					if (Static101.anInt2449 != 0 && Static122.anInt2920 == 84) {
						Static185.aClass41_1117 = Static185.aClass41_1117.method1400().method1403();
						if (Static185.aClass41_1117.method1393() == 0) {
							Static32.method629(Static62.aClass41_499, Static62.aClass41_509, Static3.aClass41_24);
							return;
						}
						if (Static185.aClass41_1118.method1393() == 0) {
							Static32.method629(Static62.aClass41_502, Static62.aClass41_504, Static35.aClass41_257);
							return;
						}
						Static32.method629(Static62.aClass41_520, Static62.aClass41_491, Static54.aClass41_449);
						Static116.method1955(20);
						return;
					}
					if (local451 && Static185.aClass41_1118.method1393() < 20) {
						Static185.aClass41_1118 = Static185.aClass41_1118.method1407(Static194.anInt4772);
					}
				}
			}
		} else if (Static58.anInt1632 == 3 && local114 == 1 && local116 >= 307 && local116 <= 457 && local118 >= 301 && local118 <= 341) {
			Static58.anInt1632 = 0;
		}
	}
}
