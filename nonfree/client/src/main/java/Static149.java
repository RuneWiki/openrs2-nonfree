import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!se", name = "s", descriptor = "[B")
	public static byte[] aByteArray38 = new byte[520];

	@OriginalMember(owner = "client!se", name = "A", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1825 = Static122.method531("Weiter");

	@OriginalMember(owner = "client!se", name = "C", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1826 = Static122.method531("Loaded title screen");

	@OriginalMember(owner = "client!se", name = "D", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1827 = aClass73_1826;

	@OriginalMember(owner = "client!se", name = "F", descriptor = "[I")
	public static int[] anIntArray364 = new int[1000];

	@OriginalMember(owner = "client!se", name = "K", descriptor = "I")
	public static int anInt3382 = 0;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IZ)V")
	public static void method2456(@OriginalArg(1) boolean arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static86.anInt1943; local3++) {
			@Pc(11) Class3_Sub1_Sub4_Sub7_Sub2 local11 = Static112.aClass3_Sub1_Sub4_Sub7_Sub2Array1[Static52.anIntArray132[local3]];
			@Pc(20) int local20 = (Static52.anIntArray132[local3] << 14) + 536870912;
			if (local11 != null && local11.method2274() && local11.aClass3_Sub1_Sub10_1.aBoolean101 == arg0 && local11.aClass3_Sub1_Sub10_1.method1198()) {
				@Pc(47) int local47 = local11.anInt3159 >> 7;
				@Pc(52) int local52 = local11.anInt3169 >> 7;
				if (local52 >= 0 && local52 < 104 && local47 >= 0 && local47 < 104) {
					if (local11.anInt3140 == 1 && (local11.anInt3169 & 0x7F) == 64 && (local11.anInt3159 & 0x7F) == 64) {
						if (Static100.anInt2225 == Static142.anIntArrayArray35[local52][local47]) {
							continue;
						}
						Static142.anIntArrayArray35[local52][local47] = Static100.anInt2225;
					}
					if (!local11.aClass3_Sub1_Sub10_1.aBoolean99) {
						local20 += Integer.MIN_VALUE;
					}
					Static119.aClass35_1.method1144(Static147.anInt3309, local11.anInt3169, local11.anInt3159, Static107.method1922(local11.anInt3169 + (local11.anInt3140 - 1) * 64, local11.anInt3159 - (-(local11.anInt3140 * 64) + 64), Static147.anInt3309), (local11.anInt3140 - 1) * 64 + 60, local11, local11.anInt3138, local20, local11.aBoolean212);
				}
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "([Lclient!sd;I)[Lclient!sd;")
	public static Class73[] method2458(@OriginalArg(0) Class73[] arg0) {
		@Pc(13) Class73[] local13 = new Class73[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local13[local15] = Static19.method372(new Class73[] { Static154.method2485(local15), Static105.aClass73_1362 });
			if (arg0 != null && arg0[local15] != null) {
				local13[local15] = Static19.method372(new Class73[] { local13[local15], arg0[local15] });
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!se", name = "d", descriptor = "(I)V")
	public static void method2459() {
		anIntArray364 = null;
		aByteArray38 = null;
		aClass73_1827 = null;
		aClass73_1825 = null;
		aClass73_1826 = null;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ILclient!p;)V")
	public static void method2460(@OriginalArg(1) Applet_Sub1 arg0) {
		if (Static105.aBoolean159) {
			Static51.method941(arg0);
			return;
		}
		if (Static2.anInt7 == 1 && Static61.anInt1463 >= 715 && Static51.anInt1243 >= 453) {
			Static108.aBoolean170 = !Static108.aBoolean170;
			if (Static108.aBoolean170) {
				Static24.method502();
			} else {
				Static83.method1435(Static12.aClass73_167, Static11.aClass13_Sub1_4, Static175.aClass73_2034);
			}
		}
		if (Static25.anInt717 == 5) {
			return;
		}
		Static41.anInt992++;
		if (Static25.anInt717 != 10) {
			return;
		}
		if (Static173.anInt3798 != 2 && Static104.anInt2351 == 0) {
			if (Static2.anInt7 == 1 && Static61.anInt1463 >= 5 && Static61.anInt1463 <= 105 && Static51.anInt1243 >= 463 && Static51.anInt1243 <= 498) {
				Static17.method2682();
				return;
			}
			if (Static76.aClass27_1 != null) {
				Static17.method2682();
			}
		}
		@Pc(120) int local120 = Static61.anInt1463;
		@Pc(122) int local122 = Static2.anInt7;
		@Pc(124) int local124 = Static51.anInt1243;
		if (Static153.anInt3415 == 0) {
			@Pc(130) boolean local130 = false;
			if (local122 == 1 && local120 >= 227 && local120 <= 377 && local124 >= 271 && local124 <= 311) {
				Static137.anInt3106 = 0;
				Static153.anInt3415 = 3;
			}
			if (Static90.anInt2026 != 0) {
				while (Static10.method179()) {
					if (Static68.anInt1572 == 84) {
						local130 = true;
						break;
					}
				}
			}
			if (local130 || local122 == 1 && local120 >= 387 && local120 <= 537 && local124 >= 271 && local124 <= 311) {
				Static137.anInt3106 = 0;
				Static12.aClass73_168 = Static90.aClass73_1124;
				Static12.aClass73_170 = Static90.aClass73_1126;
				Static12.aClass73_166 = Static22.aClass73_356;
				Static153.anInt3415 = 2;
			}
		} else if (Static153.anInt3415 == 2) {
			@Pc(243) short local243 = 231;
			@Pc(244) int local244 = local243 + 30;
			if (local122 == 1 && local124 >= 246 && local124 < 261) {
				Static137.anInt3106 = 0;
			}
			local244 += 15;
			if (local122 == 1 && local124 >= 261 && local124 < 276) {
				Static137.anInt3106 = 1;
			}
			local244 += 15;
			if (local122 == 1 && local120 >= 227 && local120 <= 377 && local124 >= 301 && local124 <= 341) {
				Static12.aClass73_171 = Static12.aClass73_171.method2452().method2451();
				if (Static12.aClass73_171.method2435() == 0) {
					Static154.method2486(Static155.aClass73_1865, Static90.aClass73_1137, Static90.aClass73_1110);
				} else if (Static12.aClass73_172.method2435() == 0) {
					Static154.method2486(Static163.aClass73_1746, Static90.aClass73_1121, Static90.aClass73_1149);
				} else {
					Static154.method2486(Static13.aClass73_194, Static90.aClass73_1113, Static90.aClass73_1112);
					Static78.method1320(20);
				}
			} else {
				if (local122 == 1 && local120 >= 387 && local120 <= 537 && local124 >= 301 && local124 <= 341) {
					Static12.aClass73_171 = Static12.aClass73_167;
					Static153.anInt3415 = 0;
					Static12.aClass73_172 = Static12.aClass73_167;
				}
				while (true) {
					@Pc(399) boolean local399;
					label238: do {
						while (Static10.method179()) {
							local399 = false;
							for (@Pc(401) int local401 = 0; local401 < Static26.aClass73_412.method2435(); local401++) {
								if (Static31.anInt814 == Static26.aClass73_412.method2444(local401)) {
									local399 = true;
									break;
								}
							}
							if (Static137.anInt3106 != 0) {
								continue label238;
							}
							if (Static68.anInt1572 == 85 && Static12.aClass73_171.method2435() > 0) {
								Static12.aClass73_171 = Static12.aClass73_171.method2413(Static12.aClass73_171.method2435() - 1, 0);
							}
							if (Static68.anInt1572 == 84 || Static68.anInt1572 == 80) {
								Static137.anInt3106 = 1;
							}
							if (local399 && Static12.aClass73_171.method2435() < 12) {
								Static12.aClass73_171 = Static12.aClass73_171.method2432(Static31.anInt814);
							}
						}
						return;
					} while (Static137.anInt3106 != 1);
					if (Static68.anInt1572 == 85 && Static12.aClass73_172.method2435() > 0) {
						Static12.aClass73_172 = Static12.aClass73_172.method2413(Static12.aClass73_172.method2435() - 1, 0);
					}
					if (Static68.anInt1572 == 84 || Static68.anInt1572 == 80) {
						Static137.anInt3106 = 0;
					}
					if (Static90.anInt2026 != 0 && Static68.anInt1572 == 84) {
						Static12.aClass73_171 = Static12.aClass73_171.method2452().method2451();
						if (Static12.aClass73_171.method2435() == 0) {
							Static154.method2486(Static155.aClass73_1865, Static90.aClass73_1137, Static90.aClass73_1110);
							return;
						}
						if (Static12.aClass73_172.method2435() == 0) {
							Static154.method2486(Static163.aClass73_1746, Static90.aClass73_1121, Static90.aClass73_1149);
							return;
						}
						Static154.method2486(Static13.aClass73_194, Static90.aClass73_1113, Static90.aClass73_1112);
						Static78.method1320(20);
						return;
					}
					if (local399 && Static12.aClass73_172.method2435() < 20) {
						Static12.aClass73_172 = Static12.aClass73_172.method2432(Static31.anInt814);
					}
				}
			}
		} else if (Static153.anInt3415 == 3 && local122 == 1 && local120 >= 307 && local120 <= 457 && local124 >= 301 && local124 <= 341) {
			Static153.anInt3415 = 0;
		}
	}
}
