import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "[I")
	public static int[] anIntArray164;

	@OriginalMember(owner = "client!hb", name = "q", descriptor = "Lclient!jd;")
	public static Class36 aClass36_29;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "Lclient!ke;")
	public static Class39 aClass39_469 = Static2.method66("(WSpielkonto wiederherstellen(W Option auf der Hauptseite)3");

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "Lclient!ke;")
	private static Class39 aClass39_472 = Static2.method66(" from your friend list first");

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "Lclient!ke;")
	public static Class39 aClass39_470 = aClass39_472;

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "Lclient!ke;")
	public static Class39 aClass39_471 = Static2.method66("Mem:");

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "Lclient!ke;")
	public static Class39 aClass39_473 = Static2.method66("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "Lclient!ke;")
	public static Class39 aClass39_474 = Static2.method66("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!hb", name = "l", descriptor = "Lclient!ke;")
	public static Class39 aClass39_475 = Static2.method66("null");

	@OriginalMember(owner = "client!hb", name = "m", descriptor = "Lclient!ke;")
	public static Class39 aClass39_476 = Static2.method66("gleiten:");

	@OriginalMember(owner = "client!hb", name = "n", descriptor = "Lclient!ke;")
	public static Class39 aClass39_477 = Static2.method66("Duell akzeptieren");

	@OriginalMember(owner = "client!hb", name = "o", descriptor = "Lclient!ke;")
	private static Class39 aClass39_478 = Static2.method66("glow1:");

	@OriginalMember(owner = "client!hb", name = "p", descriptor = "Lclient!ke;")
	public static Class39 aClass39_479 = aClass39_478;

	@OriginalMember(owner = "client!hb", name = "s", descriptor = "Lclient!ke;")
	public static Class39 aClass39_480 = Static2.method66("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
	public static void method803() {
		aClass39_475 = null;
		aClass39_469 = null;
		aClass36_29 = null;
		aClass39_476 = null;
		aClass39_478 = null;
		aClass39_479 = null;
		aClass39_473 = null;
		aClass39_477 = null;
		aClass39_480 = null;
		aClass39_472 = null;
		aClass39_471 = null;
		anIntArray164 = null;
		aClass39_470 = null;
		aClass39_474 = null;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)Lclient!ra;")
	public static Class9 method804() {
		try {
			return (Class9) Class.forName("Class9_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return new Class9_Sub2();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IBIZ[I)V")
	public static void method805(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int[] arg3) {
		Static75.aClass51_10.method1970();
		Static67.aClass2_Sub1_Sub4_Sub3_14.method1946(0, 0);
		if (arg2) {
			if (arg3[arg1] != -1) {
				if (arg1 == 0) {
					Static17.aClass2_Sub1_Sub4_Sub3_3.method1946(22, 10);
				}
				if (arg1 == 1) {
					Static72.aClass2_Sub1_Sub4_Sub3_15.method1946(54, 8);
				}
				if (arg1 == 2) {
					Static72.aClass2_Sub1_Sub4_Sub3_15.method1946(82, 8);
				}
				if (arg1 == 3) {
					Static67.aClass2_Sub1_Sub4_Sub3_13.method1946(110, 8);
				}
				if (arg1 == 4) {
					Static73.aClass2_Sub1_Sub4_Sub3_16.method1946(153, 8);
				}
				if (arg1 == 5) {
					Static73.aClass2_Sub1_Sub4_Sub3_16.method1946(181, 8);
				}
				if (arg1 == 6) {
					Static96.aClass2_Sub1_Sub4_Sub3_20.method1946(209, 9);
				}
			}
			if (arg3[0] != -1 && arg0 != 0) {
				Static95.aClass2_Sub1_Sub4_Sub3Array5[0].method1946(29, 13);
			}
			if (arg3[1] != -1 && arg0 != 1) {
				Static95.aClass2_Sub1_Sub4_Sub3Array5[1].method1946(53, 11);
			}
			if (arg3[2] != -1 && arg0 != 2) {
				Static95.aClass2_Sub1_Sub4_Sub3Array5[2].method1946(82, 11);
			}
			if (arg3[3] != -1 && arg0 != 3) {
				Static95.aClass2_Sub1_Sub4_Sub3Array5[3].method1946(115, 12);
			}
			if (arg3[4] != -1 && arg0 != 4) {
				Static95.aClass2_Sub1_Sub4_Sub3Array5[4].method1946(153, 13);
			}
			if (arg3[5] != -1 && arg0 != 5) {
				Static95.aClass2_Sub1_Sub4_Sub3Array5[5].method1946(180, 11);
			}
			if (arg3[6] != -1 && arg0 != 6) {
				Static95.aClass2_Sub1_Sub4_Sub3Array5[6].method1946(208, 13);
			}
		}
		Static29.aClass51_16.method1970();
		Static56.aClass2_Sub1_Sub4_Sub3_11.method1946(0, 0);
		if (arg2) {
			if (arg3[arg1] != -1) {
				if (arg1 == 7) {
					Static94.aClass2_Sub1_Sub4_Sub3_19.method1946(42, 0);
				}
				if (arg1 == 8) {
					Static81.aClass2_Sub1_Sub4_Sub3_17.method1946(74, 0);
				}
				if (arg1 == 9) {
					Static81.aClass2_Sub1_Sub4_Sub3_17.method1946(102, 0);
				}
				if (arg1 == 10) {
					Static45.aClass2_Sub1_Sub4_Sub3_8.method1946(130, 1);
				}
				if (arg1 == 11) {
					Static23.aClass2_Sub1_Sub4_Sub3_4.method1946(173, 0);
				}
				if (arg1 == 12) {
					Static23.aClass2_Sub1_Sub4_Sub3_4.method1946(201, 0);
				}
				if (arg1 == 13) {
					Static31.aClass2_Sub1_Sub4_Sub3_12.method1946(229, 0);
				}
			}
			if (arg3[8] != -1 && arg0 != 8) {
				Static95.aClass2_Sub1_Sub4_Sub3Array5[7].method1946(74, 2);
			}
			if (arg3[9] != -1 && arg0 != 9) {
				Static95.aClass2_Sub1_Sub4_Sub3Array5[8].method1946(102, 3);
			}
			if (arg3[10] != -1 && arg0 != 10) {
				Static95.aClass2_Sub1_Sub4_Sub3Array5[9].method1946(137, 4);
			}
			if (arg3[11] != -1 && arg0 != 11) {
				Static95.aClass2_Sub1_Sub4_Sub3Array5[10].method1946(174, 2);
			}
			if (arg3[12] != -1 && arg0 != 12) {
				Static95.aClass2_Sub1_Sub4_Sub3Array5[11].method1946(201, 2);
			}
			if (arg3[13] != -1 && arg0 != 13) {
				Static95.aClass2_Sub1_Sub4_Sub3Array5[12].method1946(226, 2);
			}
		}
		try {
			@Pc(344) Graphics local344 = Static7.aCanvas1.getGraphics();
			Static75.aClass51_10.method1967(516, 160, local344);
			Static29.aClass51_16.method1967(496, 466, local344);
		} catch (@Pc(362) Exception local362) {
			Static7.aCanvas1.repaint();
		}
	}
}
