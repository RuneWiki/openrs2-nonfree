import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!cf", name = "V", descriptor = "Lclient!cb;")
	public static Class1_Sub10_Sub1 aClass1_Sub10_Sub1_1;

	@OriginalMember(owner = "client!cf", name = "X", descriptor = "I")
	public static int anInt646;

	@OriginalMember(owner = "client!cf", name = "ab", descriptor = "[I")
	public static int[] anIntArray37;

	@OriginalMember(owner = "client!cf", name = "R", descriptor = "Lclient!nd;")
	public static Class59 aClass59_4 = new Class59(64);

	@OriginalMember(owner = "client!cf", name = "U", descriptor = "I")
	public static int anInt645 = 0;

	@OriginalMember(owner = "client!cf", name = "W", descriptor = "Lclient!tg;")
	public static Class81 aClass81_214 = Static120.method2057("Wordpack geladen)3");

	@OriginalMember(owner = "client!cf", name = "Y", descriptor = "I")
	public static int anInt647 = 0;

	@OriginalMember(owner = "client!cf", name = "bb", descriptor = "Lclient!tg;")
	private static Class81 aClass81_216 = Static120.method2057("glow1:");

	@OriginalMember(owner = "client!cf", name = "Z", descriptor = "Lclient!tg;")
	public static Class81 aClass81_215 = aClass81_216;

	@OriginalMember(owner = "client!cf", name = "cb", descriptor = "Lclient!tg;")
	public static Class81 aClass81_217 = aClass81_216;

	@OriginalMember(owner = "client!cf", name = "db", descriptor = "Lclient!tg;")
	public static Class81 aClass81_218 = Static120.method2057("(Z");

	@OriginalMember(owner = "client!cf", name = "eb", descriptor = "Lclient!tg;")
	public static Class81 aClass81_219 = Static120.method2057("<col=ff9040>");

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "(III)V")
	public static void method549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static167.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass22_1 = null;
		}
	}

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "(I)V")
	public static void method550() {
		aClass81_216 = null;
		aClass81_219 = null;
		aClass81_215 = null;
		anIntArray37 = null;
		aClass59_4 = null;
		aClass81_217 = null;
		aClass81_218 = null;
		aClass1_Sub10_Sub1_1 = null;
		aClass81_214 = null;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!r;I)V")
	public static void method551(@OriginalArg(0) Applet_Sub1 arg0) {
		if (Static45.aBoolean43) {
			Static16.method234(arg0);
			return;
		}
		if (Static118.anInt2618 == 1 && Static140.anInt3065 >= 715 && Static119.anInt2628 >= 453) {
			Static62.aBoolean61 = !Static62.aBoolean61;
			if (Static62.aBoolean61) {
				Static167.method2979();
			} else {
				Static173.method3042(Static21.anInt525, Static158.aClass82_Sub1_17, 255);
			}
		}
		if (Static112.anInt2525 == 5) {
			return;
		}
		Static160.anInt3650++;
		if (Static112.anInt2525 != 10) {
			return;
		}
		if (Static154.anInt3506 != 2 && Static125.anInt2756 == 0) {
			if (Static118.anInt2618 == 1 && Static140.anInt3065 >= 5 && Static140.anInt3065 <= 105 && Static119.anInt2628 >= 463 && Static119.anInt2628 <= 498) {
				Static178.method3078();
				return;
			}
			if (Static40.aClass37_1 != null) {
				Static178.method3078();
			}
		}
		@Pc(105) int local105 = Static118.anInt2618;
		@Pc(107) int local107 = Static140.anInt3065;
		@Pc(109) int local109 = Static119.anInt2628;
		if (Static2.anInt46 == 0) {
			@Pc(116) boolean local116 = false;
			if (local105 == 1 && local107 >= 227 && local107 <= 377 && local109 >= 271 && local109 <= 311) {
				Static150.anInt3390 = 0;
				Static2.anInt46 = 3;
			}
			if (Static59.anInt1402 != 0) {
				while (Static58.method1033()) {
					if (Static3.anInt104 == 84) {
						local116 = true;
						break;
					}
				}
			}
			if (local116 || local105 == 1 && local107 >= 387 && local107 <= 537 && local109 >= 271 && local109 <= 311) {
				Static2.anInt46 = 2;
				Static165.aClass81_1342 = Static147.aClass81_1158;
				Static165.aClass81_1337 = Static183.aClass81_1441;
				Static165.aClass81_1339 = Static147.aClass81_1188;
				Static150.anInt3390 = 0;
			}
		} else if (Static2.anInt46 == 2) {
			@Pc(274) short local274 = 231;
			@Pc(275) int local275 = local274 + 30;
			if (local105 == 1 && local109 >= 246 && local109 < 261) {
				Static150.anInt3390 = 0;
			}
			local275 += 15;
			if (local105 == 1 && local109 >= 261 && local109 < 276) {
				Static150.anInt3390 = 1;
			}
			local275 += 15;
			if (local105 == 1 && local107 >= 227 && local107 <= 377 && local109 >= 301 && local109 <= 341) {
				Static165.aClass81_1344 = Static165.aClass81_1344.method2799().method2808();
				if (Static165.aClass81_1344.method2820() == 0) {
					Static163.method2851(Static141.aClass81_243, Static147.aClass81_1178, Static147.aClass81_1168);
				} else if (Static165.aClass81_1340.method2820() == 0) {
					Static163.method2851(Static112.aClass81_920, Static147.aClass81_1174, Static147.aClass81_1175);
				} else {
					Static163.method2851(Static144.aClass81_1126, Static147.aClass81_1179, Static147.aClass81_1166);
					Static142.method2392(20);
				}
			} else {
				if (local105 == 1 && local107 >= 387 && local107 <= 537 && local109 >= 301 && local109 <= 341) {
					Static165.aClass81_1340 = Static165.aClass81_1343;
					Static2.anInt46 = 0;
					Static165.aClass81_1344 = Static165.aClass81_1343;
				}
				while (true) {
					while (Static58.method1033()) {
						@Pc(434) boolean local434 = false;
						for (@Pc(436) int local436 = 0; Static57.aClass81_474.method2820() > local436; local436++) {
							if (Static16.anInt311 == Static57.aClass81_474.method2826(local436)) {
								local434 = true;
								break;
							}
						}
						if (Static150.anInt3390 == 0) {
							if (Static3.anInt104 == 85 && Static165.aClass81_1344.method2820() > 0) {
								Static165.aClass81_1344 = Static165.aClass81_1344.method2823(0, Static165.aClass81_1344.method2820() - 1);
							}
							if (Static3.anInt104 == 84 || Static3.anInt104 == 80) {
								Static150.anInt3390 = 1;
							}
							if (local434 && Static165.aClass81_1344.method2820() < 12) {
								Static165.aClass81_1344 = Static165.aClass81_1344.method2824(Static16.anInt311);
							}
						} else if (Static150.anInt3390 == 1) {
							if (Static3.anInt104 == 85 && Static165.aClass81_1340.method2820() > 0) {
								Static165.aClass81_1340 = Static165.aClass81_1340.method2823(0, Static165.aClass81_1340.method2820() - 1);
							}
							if (Static3.anInt104 == 84 || Static3.anInt104 == 80) {
								Static150.anInt3390 = 0;
							}
							if (Static59.anInt1402 != 0 && Static3.anInt104 == 84) {
								Static165.aClass81_1344 = Static165.aClass81_1344.method2799().method2808();
								if (Static165.aClass81_1344.method2820() == 0) {
									Static163.method2851(Static141.aClass81_243, Static147.aClass81_1178, Static147.aClass81_1168);
									return;
								}
								if (Static165.aClass81_1340.method2820() == 0) {
									Static163.method2851(Static112.aClass81_920, Static147.aClass81_1174, Static147.aClass81_1175);
									return;
								}
								Static163.method2851(Static144.aClass81_1126, Static147.aClass81_1179, Static147.aClass81_1166);
								Static142.method2392(20);
								return;
							}
							if (local434 && Static165.aClass81_1340.method2820() < 20) {
								Static165.aClass81_1340 = Static165.aClass81_1340.method2824(Static16.anInt311);
							}
						}
					}
					return;
				}
			}
		} else if (Static2.anInt46 == 3 && local105 == 1 && local107 >= 307 && local107 <= 457 && local109 >= 301 && local109 <= 341) {
			Static2.anInt46 = 0;
		}
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(IB)Lclient!sb;")
	public static Class1_Sub2_Sub15 method552(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub2_Sub15 local12 = (Class1_Sub2_Sub15) aClass59_4.method1970((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(27) byte[] local27 = Static171.aClass82_68.method2942(arg0, 3);
		local12 = new Class1_Sub2_Sub15();
		if (local27 != null) {
			local12.method2542(new Class1_Sub8(local27));
		}
		aClass59_4.method1973(local12, (long) arg0);
		return local12;
	}

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "(II)V")
	public static void method553(@OriginalArg(1) int arg0) {
		if (arg0 == -1 && !Static141.aBoolean23) {
			Static167.method2979();
		} else if (arg0 != -1 && (arg0 != Static7.anInt158 || !Static53.method962()) && Static121.anInt2708 != 0 && !Static141.aBoolean23) {
			Static184.method3132(Static158.aClass82_Sub1_17, Static121.anInt2708, arg0);
		}
		Static7.anInt158 = arg0;
	}
}
