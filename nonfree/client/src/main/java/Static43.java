import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!ef", name = "x", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_368 = Static120.method1824("Malformed login packet)3");

	@OriginalMember(owner = "client!ef", name = "s", descriptor = "Lclient!rd;")
	public static Class80 aClass80_366 = aClass80_368;

	@OriginalMember(owner = "client!ef", name = "u", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_367 = Static120.method1824("null");

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIII)Z")
	public static boolean method653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static188.method3073(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static79.method1201(local10 + 1, Static111.anIntArrayArrayArray7[arg0][arg1][arg2] + arg3, local14 + 1) && Static79.method1201(local10 + 128 - 1, Static111.anIntArrayArrayArray7[arg0][arg1 + 1][arg2] + arg3, local14 + 1) && Static79.method1201(local10 + 128 - 1, Static111.anIntArrayArrayArray7[arg0][arg1 + 1][arg2 + 1] + arg3, local14 + 128 - 1) && Static79.method1201(local10 + 1, Static111.anIntArrayArrayArray7[arg0][arg1][arg2 + 1] + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!rd;BLclient!rd;Lclient!bc;)[Lclient!sa;")
	public static Class3_Sub1_Sub4_Sub4[] method654(@OriginalArg(0) Class80 arg0, @OriginalArg(2) Class80 arg1, @OriginalArg(3) Class1 arg2) {
		@Pc(13) int local13 = arg2.method53(arg1);
		@Pc(19) int local19 = arg2.method33(arg0, local13);
		return Static129.method1946(local13, arg2, local19);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIIZIIII)V")
	public static void method655(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class3_Sub22 local7 = null;
		for (@Pc(12) Class3_Sub22 local12 = (Class3_Sub22) Static97.aClass70_9.method1953(); local12 != null; local12 = (Class3_Sub22) Static97.aClass70_9.method1948()) {
			if (local12.anInt3769 == arg3 && arg8 == local12.anInt3780 && arg6 == local12.anInt3764 && local12.anInt3772 == arg5) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class3_Sub22();
			local7.anInt3772 = arg5;
			local7.anInt3769 = arg3;
			local7.anInt3780 = arg8;
			local7.anInt3764 = arg6;
			Static145.method2316(local7);
			Static97.aClass70_9.method1958(local7);
		}
		local7.anInt3775 = arg0;
		local7.anInt3779 = arg4;
		local7.anInt3778 = arg2;
		local7.anInt3776 = arg1;
		local7.anInt3777 = arg7;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILclient!rd;Lclient!rd;Lclient!rd;)V")
	public static void method657(@OriginalArg(1) Class80 arg0, @OriginalArg(2) Class80 arg1, @OriginalArg(3) Class80 arg2) {
		Static78.aClass80_670 = arg1;
		Static78.aClass80_669 = arg2;
		Static78.aClass80_668 = arg0;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!rc;B)V")
	public static void method658(@OriginalArg(0) Applet_Sub1 arg0) {
		if (Static21.aBoolean29) {
			Static59.method889(arg0);
			return;
		}
		if (Static107.anInt2370 == 1 && Static37.anInt855 >= 715 && Static20.anInt497 >= 453) {
			Static131.aBoolean170 = !Static131.aBoolean170;
			if (Static131.aBoolean170) {
				Static190.method3094();
			} else {
				Static92.method2211(Static102.aClass1_Sub1_17, 255, Static96.anInt2027);
			}
		}
		if (Static21.anInt516 == 5) {
			return;
		}
		Static108.anInt2956++;
		if (Static21.anInt516 != 10) {
			return;
		}
		if (Static85.anInt1782 != 2 && Static44.anInt1005 == 0) {
			if (Static107.anInt2370 == 1 && Static37.anInt855 >= 5 && Static37.anInt855 <= 105 && Static20.anInt497 >= 463 && Static20.anInt497 <= 498) {
				Static67.method999();
				return;
			}
			if (Static73.aClass33_1 != null) {
				Static67.method999();
			}
		}
		@Pc(117) int local117 = Static37.anInt855;
		@Pc(125) int local125 = Static20.anInt497;
		@Pc(127) int local127 = Static107.anInt2370;
		if (Static163.anInt3649 == 0) {
			@Pc(520) boolean local520 = false;
			if (local127 == 1 && local117 >= 227 && local117 <= 377 && local125 >= 271 && local125 <= 311) {
				Static39.anInt876 = 0;
				Static163.anInt3649 = 3;
			}
			if (Static94.anInt2013 != 0) {
				while (Static66.method979()) {
					if (Static109.anInt2443 == 84) {
						local520 = true;
						break;
					}
				}
			}
			if (local520 || local127 == 1 && local117 >= 387 && local117 <= 537 && local125 >= 271 && local125 <= 311) {
				Static78.aClass80_669 = Static181.aClass80_1573;
				Static39.anInt876 = 0;
				Static163.anInt3649 = 2;
				Static78.aClass80_668 = Static57.aClass80_491;
				Static78.aClass80_670 = Static181.aClass80_1584;
			}
		} else if (Static163.anInt3649 == 2) {
			@Pc(178) short local178 = 231;
			@Pc(181) int local181 = local178 + 30;
			if (local127 == 1 && local125 >= 246 && local125 < 261) {
				Static39.anInt876 = 0;
			}
			local181 += 15;
			if (local127 == 1 && local125 >= 261 && local125 < 276) {
				Static39.anInt876 = 1;
			}
			local181 += 15;
			if (local127 == 1 && local117 >= 227 && local117 <= 377 && local125 >= 301 && local125 <= 341) {
				Static78.aClass80_666 = Static78.aClass80_666.method2468().method2451();
				if (Static78.aClass80_666.method2462() == 0) {
					method657(Static25.aClass80_197, Static181.aClass80_1550, Static181.aClass80_1563);
				} else if (Static78.aClass80_671.method2462() == 0) {
					method657(Static48.aClass80_408, Static181.aClass80_1559, Static181.aClass80_1551);
				} else {
					method657(Static130.aClass80_1106, Static181.aClass80_1577, Static181.aClass80_1576);
					Static132.method2019(20);
				}
			} else {
				if (local127 == 1 && local117 >= 387 && local117 <= 537 && local125 >= 301 && local125 <= 341) {
					Static78.aClass80_666 = Static78.aClass80_667;
					Static163.anInt3649 = 0;
					Static78.aClass80_671 = Static78.aClass80_667;
				}
				while (true) {
					while (Static66.method979()) {
						@Pc(339) boolean local339 = false;
						for (@Pc(341) int local341 = 0; Static137.aClass80_1142.method2462() > local341; local341++) {
							if (Static122.anInt2662 == Static137.aClass80_1142.method2456(local341)) {
								local339 = true;
								break;
							}
						}
						if (Static39.anInt876 == 0) {
							if (Static109.anInt2443 == 85 && Static78.aClass80_666.method2462() > 0) {
								Static78.aClass80_666 = Static78.aClass80_666.method2464(0, Static78.aClass80_666.method2462() - 1);
							}
							if (Static109.anInt2443 == 84 || Static109.anInt2443 == 80) {
								Static39.anInt876 = 1;
							}
							if (local339 && Static78.aClass80_666.method2462() < 12) {
								Static78.aClass80_666 = Static78.aClass80_666.method2434(Static122.anInt2662);
							}
						} else if (Static39.anInt876 == 1) {
							if (Static109.anInt2443 == 85 && Static78.aClass80_671.method2462() > 0) {
								Static78.aClass80_671 = Static78.aClass80_671.method2464(0, Static78.aClass80_671.method2462() - 1);
							}
							if (Static109.anInt2443 == 84 || Static109.anInt2443 == 80) {
								Static39.anInt876 = 0;
							}
							if (Static94.anInt2013 != 0 && Static109.anInt2443 == 84) {
								Static78.aClass80_666 = Static78.aClass80_666.method2468().method2451();
								if (Static78.aClass80_666.method2462() == 0) {
									method657(Static25.aClass80_197, Static181.aClass80_1550, Static181.aClass80_1563);
									return;
								}
								if (Static78.aClass80_671.method2462() == 0) {
									method657(Static48.aClass80_408, Static181.aClass80_1559, Static181.aClass80_1551);
									return;
								}
								method657(Static130.aClass80_1106, Static181.aClass80_1577, Static181.aClass80_1576);
								Static132.method2019(20);
								return;
							}
							if (local339 && Static78.aClass80_671.method2462() < 20) {
								Static78.aClass80_671 = Static78.aClass80_671.method2434(Static122.anInt2662);
							}
						}
					}
					return;
				}
			}
		} else if (Static163.anInt3649 == 3 && local127 == 1 && local117 >= 307 && local117 <= 457 && local125 >= 301 && local125 <= 341) {
			Static163.anInt3649 = 0;
		}
	}
}
