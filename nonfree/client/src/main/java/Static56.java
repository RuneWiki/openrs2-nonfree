import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!ke", name = "nb", descriptor = "I")
	public static int anInt2272;

	@OriginalMember(owner = "client!ke", name = "Fb", descriptor = "Lclient!ud;")
	public static Class5 aClass5_29;

	@OriginalMember(owner = "client!ke", name = "Bc", descriptor = "I")
	public static int anInt2325;

	@OriginalMember(owner = "client!ke", name = "Dc", descriptor = "I")
	public static int anInt2327;

	@OriginalMember(owner = "client!ke", name = "Ec", descriptor = "[Lclient!qb;")
	public static Class2_Sub2_Sub2_Sub3[] aClass2_Sub2_Sub2_Sub3Array15;

	@OriginalMember(owner = "client!ke", name = "sb", descriptor = "Lclient!o;")
	public static Class40 aClass40_656 = Static13.method257("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!ke", name = "Hb", descriptor = "Lclient!o;")
	public static Class40 aClass40_657 = Static13.method257(" with @whi@");

	@OriginalMember(owner = "client!ke", name = "Kb", descriptor = "Lclient!o;")
	public static Class40 aClass40_658 = Static13.method257("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!ke", name = "Mb", descriptor = "Lclient!o;")
	public static Class40 aClass40_659 = Static13.method257(" with @cya@");

	@OriginalMember(owner = "client!ke", name = "Nb", descriptor = "J")
	public static long aLong136 = 0L;

	@OriginalMember(owner = "client!ke", name = "Pb", descriptor = "Lclient!wc;")
	public static Class2_Sub3_Sub1 aClass2_Sub3_Sub1_5 = new Class2_Sub3_Sub1(5000);

	@OriginalMember(owner = "client!ke", name = "Xb", descriptor = "I")
	public static int anInt2299 = 1;

	@OriginalMember(owner = "client!ke", name = "Cc", descriptor = "I")
	public static int anInt2326 = 0;

	@OriginalMember(owner = "client!ke", name = "h", descriptor = "(I)V")
	public static void method1538() {
		if (Static8.aString4.toLowerCase().indexOf("microsoft") != -1) {
			Static104.anIntArray549[186] = 57;
			Static104.anIntArray549[187] = 27;
			Static104.anIntArray549[188] = 71;
			Static104.anIntArray549[189] = 26;
			Static104.anIntArray549[190] = 72;
			Static104.anIntArray549[191] = 73;
			Static104.anIntArray549[192] = 58;
			Static104.anIntArray549[219] = 42;
			Static104.anIntArray549[220] = 74;
			Static104.anIntArray549[221] = 43;
			Static104.anIntArray549[222] = 59;
			Static104.anIntArray549[223] = 28;
			return;
		}
		Static104.anIntArray549[44] = 71;
		Static104.anIntArray549[45] = 26;
		Static104.anIntArray549[46] = 72;
		Static104.anIntArray549[47] = 73;
		Static104.anIntArray549[59] = 57;
		Static104.anIntArray549[61] = 27;
		Static104.anIntArray549[91] = 42;
		Static104.anIntArray549[92] = 74;
		Static104.anIntArray549[93] = 43;
		if (Static8.aMethod1 == null) {
			Static104.anIntArray549[192] = 58;
			Static104.anIntArray549[222] = 59;
		} else {
			Static104.anIntArray549[192] = 28;
			Static104.anIntArray549[222] = 58;
			Static104.anIntArray549[520] = 59;
		}
	}

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "(I)Lclient!pd;")
	public static Class18 method1539() {
		try {
			return (Class18) Class.forName("Class18_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class18_Sub1();
		}
	}

	@OriginalMember(owner = "client!ke", name = "j", descriptor = "(I)V")
	public static void method1541() {
		if (Static81.aClass62_1 != null) {
			@Pc(3) Class62 local3 = Static81.aClass62_1;
			synchronized (Static81.aClass62_1) {
				Static81.aClass62_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)Lclient!o;")
	public static Class40 method1542(@OriginalArg(0) int arg0) {
		@Pc(15) Class40 local15 = Static53.method859(arg0);
		for (@Pc(21) int local21 = local15.method1169() - 3; local21 > 0; local21 -= 3) {
			local15 = Static80.method1334(new Class40[] { local15.method1180(local21, 0), Static97.aClass40_672, local15.method1185(local21) });
		}
		if (local15.method1169() > 8) {
			local15 = Static80.method1334(new Class40[] { Static100.aClass40_689, local15.method1180(local15.method1169() - 8, 0), Static55.aClass40_405, local15, Static90.aClass40_609 });
		} else if (local15.method1169() > 4) {
			local15 = Static80.method1334(new Class40[] { Static98.aClass40_678, local15.method1180(local15.method1169() - 4, 0), Static30.aClass40_221, local15, Static90.aClass40_609 });
		}
		return Static80.method1334(new Class40[] { Static107.aClass40_716, local15 });
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(Z)V")
	public static void method1546() {
		aClass40_658 = null;
		aClass40_656 = null;
		aClass5_29 = null;
		aClass40_657 = null;
		aClass2_Sub3_Sub1_5 = null;
		aClass2_Sub2_Sub2_Sub3Array15 = null;
		aClass40_659 = null;
	}

	@OriginalMember(owner = "client!ke", name = "m", descriptor = "(I)V")
	public static void method1548() {
		Static41.method755();
		if (Static44.anInt1075 != 10) {
			return;
		}
		@Pc(20) int local20 = Static90.anInt2133 - 171;
		@Pc(22) int local22 = Static86.anInt2030;
		@Pc(26) int local26 = Static107.anInt2500 - 202;
		if (Static91.anInt2143 == 0) {
			if (local22 == 1 && local26 >= 25 && local26 <= 175 && local20 >= 100 && local20 <= 140) {
				Static91.anInt2143 = 3;
				Static99.anInt91 = 0;
			}
			if (local22 == 1 && local26 >= 185 && local26 <= 335 && local20 >= 100 && local20 <= 140) {
				Static91.anInt2143 = 2;
				Static86.aClass40_589 = Static41.aClass40_305;
				Static99.anInt91 = 0;
				Static86.aClass40_592 = Static86.aClass40_593;
			}
		} else if (Static91.anInt2143 == 2) {
			@Pc(70) byte local70 = 60;
			@Pc(73) int local73 = local70 + 30;
			if (local22 == 1 && local20 >= 75 && local20 < 90) {
				Static99.anInt91 = 0;
			}
			local73 += 15;
			if (local22 == 1 && local20 >= 90 && local20 < 105) {
				Static99.anInt91 = 1;
			}
			local73 += 15;
			if (local22 == 1 && local26 >= 25 && local26 <= 175 && local20 >= 130 && local20 <= 170) {
				Static86.aClass40_591 = Static86.aClass40_591.method1175().method1167();
				Static49.method1537(Static86.aClass40_593, Static17.aClass40_120);
				Static7.method187(20);
			} else {
				if (local22 == 1 && local26 >= 185 && local26 <= 335 && local20 >= 130 && local20 <= 170) {
					Static91.anInt2143 = 0;
					Static86.aClass40_591 = Static86.aClass40_593;
					Static86.aClass40_587 = Static86.aClass40_593;
				}
				while (true) {
					@Pc(211) boolean local211;
					label145: do {
						while (Static97.method1561()) {
							local211 = false;
							for (@Pc(213) int local213 = 0; Static67.aClass40_486.method1169() > local213; local213++) {
								if (Static4.anInt135 == Static67.aClass40_486.method1174(local213)) {
									local211 = true;
									break;
								}
							}
							if (Static99.anInt91 != 0) {
								continue label145;
							}
							if (Static37.anInt935 == 85 && Static86.aClass40_591.method1169() > 0) {
								Static86.aClass40_591 = Static86.aClass40_591.method1180(Static86.aClass40_591.method1169() - 1, 0);
							}
							if (Static37.anInt935 == 84 || Static37.anInt935 == 80) {
								Static99.anInt91 = 1;
							}
							if (local211 && Static86.aClass40_591.method1169() < 12) {
								Static86.aClass40_591 = Static86.aClass40_591.method1192(Static4.anInt135);
							}
						}
						return;
					} while (Static99.anInt91 != 1);
					if (Static37.anInt935 == 85 && Static86.aClass40_587.method1169() > 0) {
						Static86.aClass40_587 = Static86.aClass40_587.method1180(Static86.aClass40_587.method1169() - 1, 0);
					}
					if (Static37.anInt935 == 84 || Static37.anInt935 == 80) {
						Static99.anInt91 = 0;
					}
					if (local211 && Static86.aClass40_587.method1169() < 20) {
						Static86.aClass40_587 = Static86.aClass40_587.method1192(Static4.anInt135);
					}
				}
			}
		} else if (Static91.anInt2143 == 3 && local22 == 1 && local26 >= 105 && local26 <= 255 && local20 >= 130 && local20 <= 170) {
			Static91.anInt2143 = 0;
		}
	}
}
