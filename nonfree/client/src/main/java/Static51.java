import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

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

	@OriginalMember(owner = "client!ke", name = "h", descriptor = "(I)V", line = 12)
	public static void method1538() {
		if (Static8.aString4.toLowerCase().indexOf("microsoft") != -1) {
			Class63.anIntArray549[186] = 57;
			Class63.anIntArray549[187] = 27;
			Class63.anIntArray549[188] = 71;
			Class63.anIntArray549[189] = 26;
			Class63.anIntArray549[190] = 72;
			Class63.anIntArray549[191] = 73;
			Class63.anIntArray549[192] = 58;
			Class63.anIntArray549[219] = 42;
			Class63.anIntArray549[220] = 74;
			Class63.anIntArray549[221] = 43;
			Class63.anIntArray549[222] = 59;
			Class63.anIntArray549[223] = 28;
			return;
		}
		Class63.anIntArray549[44] = 71;
		Class63.anIntArray549[45] = 26;
		Class63.anIntArray549[46] = 72;
		Class63.anIntArray549[47] = 73;
		Class63.anIntArray549[59] = 57;
		Class63.anIntArray549[61] = 27;
		Class63.anIntArray549[91] = 42;
		Class63.anIntArray549[92] = 74;
		Class63.anIntArray549[93] = 43;
		if (Static8.aMethod1 == null) {
			Class63.anIntArray549[192] = 58;
			Class63.anIntArray549[222] = 59;
		} else {
			Class63.anIntArray549[192] = 28;
			Class63.anIntArray549[222] = 58;
			Class63.anIntArray549[520] = 59;
		}
	}

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "(I)Lclient!pd;", line = 76)
	public static Class18 method1539() {
		try {
			return (Class18) Class.forName("Class18_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class18_Sub1();
		}
	}

	@OriginalMember(owner = "client!ke", name = "j", descriptor = "(I)V", line = 167)
	public static void method1541() {
		if (Class49.aClass62_1 != null) {
			@Pc(3) Class62 local3 = Class49.aClass62_1;
			synchronized (Class49.aClass62_1) {
				Class49.aClass62_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)Lclient!o;", line = 190)
	public static Class40 method1542(@OriginalArg(0) int arg0) {
		@Pc(15) Class40 local15 = Static48.method859(arg0);
		for (@Pc(21) int local21 = local15.method1169() - 3; local21 > 0; local21 -= 3) {
			local15 = Static72.method1334(new Class40[] { local15.method1180(local21, 0), Class2_Sub12.aClass40_672, local15.method1185(local21) });
		}
		if (local15.method1169() > 8) {
			local15 = Static72.method1334(new Class40[] { Class2_Sub2_Sub15.aClass40_689, local15.method1180(local15.method1169() - 8, 0), Class2_Sub2_Sub12_Sub2.aClass40_405, local15, Class56.aClass40_609 });
		} else if (local15.method1169() > 4) {
			local15 = Static72.method1334(new Class40[] { Class60.aClass40_678, local15.method1180(local15.method1169() - 4, 0), Class22.aClass40_221, local15, Class56.aClass40_609 });
		}
		return Static72.method1334(new Class40[] { Class24.aClass40_716, local15 });
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(Z)V", line = 401)
	public static void method1546() {
		Class2_Sub2_Sub12_Sub1.aClass40_658 = null;
		Class2_Sub2_Sub12_Sub1.aClass40_656 = null;
		aClass5_29 = null;
		Class2_Sub2_Sub12_Sub1.aClass40_657 = null;
		Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5 = null;
		aClass2_Sub2_Sub2_Sub3Array15 = null;
		Class2_Sub2_Sub12_Sub1.aClass40_659 = null;
	}

	@OriginalMember(owner = "client!ke", name = "m", descriptor = "(I)V", line = 516)
	public static void method1548() {
		Static38.method755();
		if (Class2_Sub2_Sub11.anInt1075 != 10) {
			return;
		}
		@Pc(20) int local20 = Class56.anInt2133 - 171;
		@Pc(22) int local22 = Class2_Sub2_Sub12_Sub5.anInt2030;
		@Pc(26) int local26 = Class24.anInt2500 - 202;
		if (Class57.anInt2143 == 0) {
			if (local22 == 1 && local26 >= 25 && local26 <= 175 && local20 >= 100 && local20 <= 140) {
				Class57.anInt2143 = 3;
				Class5.anInt91 = 0;
			}
			if (local22 == 1 && local26 >= 185 && local26 <= 335 && local20 >= 100 && local20 <= 140) {
				Class57.anInt2143 = 2;
				Class2_Sub2_Sub12_Sub5.aClass40_589 = Class2_Sub2_Sub9.aClass40_305;
				Class5.anInt91 = 0;
				Class2_Sub2_Sub12_Sub5.aClass40_592 = Class2_Sub2_Sub12_Sub5.aClass40_593;
			}
		} else if (Class57.anInt2143 == 2) {
			@Pc(70) byte local70 = 60;
			@Pc(73) int local73 = local70 + 30;
			if (local22 == 1 && local20 >= 75 && local20 < 90) {
				Class5.anInt91 = 0;
			}
			local73 += 15;
			if (local22 == 1 && local20 >= 90 && local20 < 105) {
				Class5.anInt91 = 1;
			}
			local73 += 15;
			if (local22 == 1 && local26 >= 25 && local26 <= 175 && local20 >= 130 && local20 <= 170) {
				Class2_Sub2_Sub12_Sub5.aClass40_591 = Class2_Sub2_Sub12_Sub5.aClass40_591.method1175().method1167();
				Static45.method1537(Class2_Sub2_Sub12_Sub5.aClass40_593, Class14.aClass40_120);
				Static7.method187(20);
			} else {
				if (local22 == 1 && local26 >= 185 && local26 <= 335 && local20 >= 130 && local20 <= 170) {
					Class57.anInt2143 = 0;
					Class2_Sub2_Sub12_Sub5.aClass40_591 = Class2_Sub2_Sub12_Sub5.aClass40_593;
					Class2_Sub2_Sub12_Sub5.aClass40_587 = Class2_Sub2_Sub12_Sub5.aClass40_593;
				}
				while (true) {
					@Pc(211) boolean local211;
					label145: do {
						while (Static89.method1561()) {
							local211 = false;
							for (@Pc(213) int local213 = 0; Class38.aClass40_486.method1169() > local213; local213++) {
								if (Static4.anInt135 == Class38.aClass40_486.method1174(local213)) {
									local211 = true;
									break;
								}
							}
							if (Class5.anInt91 != 0) {
								continue label145;
							}
							if (Static35.anInt935 == 85 && Class2_Sub2_Sub12_Sub5.aClass40_591.method1169() > 0) {
								Class2_Sub2_Sub12_Sub5.aClass40_591 = Class2_Sub2_Sub12_Sub5.aClass40_591.method1180(Class2_Sub2_Sub12_Sub5.aClass40_591.method1169() - 1, 0);
							}
							if (Static35.anInt935 == 84 || Static35.anInt935 == 80) {
								Class5.anInt91 = 1;
							}
							if (local211 && Class2_Sub2_Sub12_Sub5.aClass40_591.method1169() < 12) {
								Class2_Sub2_Sub12_Sub5.aClass40_591 = Class2_Sub2_Sub12_Sub5.aClass40_591.method1192(Static4.anInt135);
							}
						}
						return;
					} while (Class5.anInt91 != 1);
					if (Static35.anInt935 == 85 && Class2_Sub2_Sub12_Sub5.aClass40_587.method1169() > 0) {
						Class2_Sub2_Sub12_Sub5.aClass40_587 = Class2_Sub2_Sub12_Sub5.aClass40_587.method1180(Class2_Sub2_Sub12_Sub5.aClass40_587.method1169() - 1, 0);
					}
					if (Static35.anInt935 == 84 || Static35.anInt935 == 80) {
						Class5.anInt91 = 0;
					}
					if (local211 && Class2_Sub2_Sub12_Sub5.aClass40_587.method1169() < 20) {
						Class2_Sub2_Sub12_Sub5.aClass40_587 = Class2_Sub2_Sub12_Sub5.aClass40_587.method1192(Static4.anInt135);
					}
				}
			}
		} else if (Class57.anInt2143 == 3 && local22 == 1 && local26 >= 105 && local26 <= 255 && local20 >= 130 && local20 <= 170) {
			Class57.anInt2143 = 0;
		}
	}
}
