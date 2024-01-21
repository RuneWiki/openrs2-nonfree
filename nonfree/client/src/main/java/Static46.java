import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!hc", name = "n", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!hc", name = "C", descriptor = "[I")
	public static int[] anIntArray164;

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "Z")
	public static boolean aBoolean70 = false;

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
	public static final int anInt1426 = 5063219;

	@OriginalMember(owner = "client!hc", name = "r", descriptor = "Lclient!rd;")
	private static Class63 aClass63_757 = Static80.method1463("button near the top of that page)3");

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "Lclient!rd;")
	public static Class63 aClass63_756 = aClass63_757;

	@OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
	public static int anInt1428 = 0;

	@OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
	public static int anInt1432 = 0;

	@OriginalMember(owner = "client!hc", name = "A", descriptor = "I")
	public static int anInt1441 = 10;

	@OriginalMember(owner = "client!hc", name = "E", descriptor = "I")
	public static volatile int anInt1444 = 0;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
	public static void method986() {
		anIntArray164 = null;
		aClass63_756 = null;
		aFont1 = null;
		aClass63_757 = null;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
	public static void method988() {
		if (Static8.aString3.toLowerCase().indexOf("microsoft") != -1) {
			Static84.anIntArray279[190] = 72;
			Static84.anIntArray279[187] = 27;
			Static84.anIntArray279[223] = 28;
			Static84.anIntArray279[192] = 58;
			Static84.anIntArray279[219] = 42;
			Static84.anIntArray279[189] = 26;
			Static84.anIntArray279[191] = 73;
			Static84.anIntArray279[221] = 43;
			Static84.anIntArray279[222] = 59;
			Static84.anIntArray279[220] = 74;
			Static84.anIntArray279[188] = 71;
			Static84.anIntArray279[186] = 57;
			return;
		}
		Static84.anIntArray279[46] = 72;
		if (Static8.aMethod2 == null) {
			Static84.anIntArray279[192] = 58;
			Static84.anIntArray279[222] = 59;
		} else {
			Static84.anIntArray279[520] = 59;
			Static84.anIntArray279[192] = 28;
			Static84.anIntArray279[222] = 58;
		}
		Static84.anIntArray279[45] = 26;
		Static84.anIntArray279[47] = 73;
		Static84.anIntArray279[93] = 43;
		Static84.anIntArray279[59] = 57;
		Static84.anIntArray279[44] = 71;
		Static84.anIntArray279[61] = 27;
		Static84.anIntArray279[91] = 42;
		Static84.anIntArray279[92] = 74;
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)Lclient!cd;")
	public static Class6_Sub3_Sub3_Sub1 method991() {
		@Pc(12) Class6_Sub3_Sub3_Sub1 local12 = new Class6_Sub3_Sub3_Sub1(Static39.anIntArray143, Static117.anIntArray345, Static59.anIntArray189, Static61.anIntArray190, Static61.aByteArrayArray6);
		Static5.method36();
		return local12;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!rd;IILclient!rd;)V")
	public static void method996(@OriginalArg(0) Class63 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class63 arg2) {
		if (arg1 == 0 && Static79.anInt2158 != -1) {
			Static2.aClass63_14 = arg2;
			Static19.anInt642 = 0;
		}
		if (Static49.anInt1513 == -1) {
			Static15.aBoolean29 = true;
		}
		for (@Pc(22) int local22 = 99; local22 > 0; local22--) {
			Static100.anIntArray296[local22] = Static100.anIntArray296[local22 - 1];
			Static39.aClass63Array9[local22] = Static39.aClass63Array9[local22 - 1];
			Static106.aClass63Array20[local22] = Static106.aClass63Array20[local22 - 1];
		}
		Static100.anIntArray296[0] = arg1;
		Static39.aClass63Array9[0] = arg0;
		Static106.aClass63Array20[0] = arg2;
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)V")
	public static void method997() {
		if (Static19.anInt642 == 1 && Static59.anInt1765 >= 715 && Static61.anInt1804 >= 453) {
			Static65.aBoolean101 = !Static65.aBoolean101;
			if (Static65.aBoolean101) {
				Static118.method2115();
			} else {
				Static44.method963(Static49.aClass63_802, Static20.aClass63_414, Static64.aClass7_Sub1_10);
			}
			Static98.method1816();
		}
		if (anInt1432 == 5) {
			return;
		}
		Static76.method1438();
		if (anInt1432 != 10) {
			return;
		}
		@Pc(61) int local61 = Static59.anInt1765 - 202;
		@Pc(63) int local63 = Static19.anInt642;
		@Pc(67) int local67 = Static61.anInt1804 - 171;
		if (Static97.anInt2723 == 0) {
			if (local63 == 1 && local61 >= 25 && local61 <= 175 && local67 >= 100 && local67 <= 140) {
				Static66.anInt3203 = 0;
				Static97.anInt2723 = 3;
			}
			if (local63 == 1 && local61 >= 185 && local61 <= 335 && local67 >= 100 && local67 <= 140) {
				Static49.aClass63_789 = Static17.aClass63_1422;
				Static49.aClass63_795 = Static17.aClass63_1440;
				Static97.anInt2723 = 2;
				Static49.aClass63_799 = Static22.aClass63_445;
				Static66.anInt3203 = 0;
				return;
			}
		} else if (Static97.anInt2723 == 2) {
			@Pc(214) byte local214 = 60;
			@Pc(219) int local219 = local214 + 30;
			if (local63 == 1 && local67 >= 75 && local67 < 90) {
				Static66.anInt3203 = 0;
			}
			local219 += 15;
			if (local63 == 1 && local67 >= 90 && local67 < 105) {
				Static66.anInt3203 = 1;
			}
			local219 += 15;
			if (local63 == 1 && local61 >= 25 && local61 <= 175 && local67 >= 130 && local67 <= 170) {
				Static49.aClass63_805 = Static49.aClass63_805.method1802().method1814();
				Static11.method1282(Static17.aClass63_1400, Static44.aClass63_740, Static17.aClass63_1416);
				Static73.method1392(20);
				return;
			}
			if (local63 == 1 && local61 >= 185 && local61 <= 335 && local67 >= 130 && local67 <= 170) {
				Static97.anInt2723 = 0;
				Static49.aClass63_796 = Static49.aClass63_802;
				Static49.aClass63_805 = Static49.aClass63_802;
			}
			while (true) {
				@Pc(354) boolean local354;
				label162: do {
					while (Static120.method2145()) {
						local354 = false;
						for (@Pc(356) int local356 = 0; Static114.aClass63_1688.method1811() > local356; local356++) {
							if (Static123.anInt3314 == Static114.aClass63_1688.method1810(local356)) {
								local354 = true;
								break;
							}
						}
						if (Static66.anInt3203 != 0) {
							continue label162;
						}
						if (Static79.anInt2157 == 85 && Static49.aClass63_805.method1811() > 0) {
							Static49.aClass63_805 = Static49.aClass63_805.method1820(Static49.aClass63_805.method1811() - 1, 0);
						}
						if (Static79.anInt2157 == 84 || Static79.anInt2157 == 80) {
							Static66.anInt3203 = 1;
						}
						if (local354 && Static49.aClass63_805.method1811() < 12) {
							Static49.aClass63_805 = Static49.aClass63_805.method1818(Static123.anInt3314);
						}
					}
					return;
				} while (Static66.anInt3203 != 1);
				if (Static79.anInt2157 == 85 && Static49.aClass63_796.method1811() > 0) {
					Static49.aClass63_796 = Static49.aClass63_796.method1820(Static49.aClass63_796.method1811() - 1, 0);
				}
				if (Static79.anInt2157 == 84 || Static79.anInt2157 == 80) {
					Static66.anInt3203 = 0;
				}
				if (local354 && Static49.aClass63_796.method1811() < 20) {
					Static49.aClass63_796 = Static49.aClass63_796.method1818(Static123.anInt3314);
				}
			}
		} else if (Static97.anInt2723 == 3 && local63 == 1 && local61 >= 105 && local61 <= 255 && local67 >= 130 && local67 <= 170) {
			Static97.anInt2723 = 0;
			return;
		}
	}
}
