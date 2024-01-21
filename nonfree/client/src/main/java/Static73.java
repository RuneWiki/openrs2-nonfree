import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!p", name = "ac", descriptor = "I")
	public static int anInt1891;

	@OriginalMember(owner = "client!p", name = "vb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_965 = Static23.method501("@or2@");

	@OriginalMember(owner = "client!p", name = "yb", descriptor = "Lclient!mc;")
	private static Class42 aClass42_966 = Static23.method501("Bad session id)3");

	@OriginalMember(owner = "client!p", name = "Fb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_967 = aClass42_966;

	@OriginalMember(owner = "client!p", name = "Ib", descriptor = "I")
	public static int anInt1884 = 0;

	@OriginalMember(owner = "client!p", name = "Qb", descriptor = "Lclient!vd;")
	public static Class62 aClass62_1 = new Class62();

	@OriginalMember(owner = "client!p", name = "Rb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_968 = Static23.method501("Lade Sprites )2 ");

	@OriginalMember(owner = "client!p", name = "Sb", descriptor = "Lclient!fa;")
	public static Class22 aClass22_10 = new Class22();

	@OriginalMember(owner = "client!p", name = "Tb", descriptor = "[I")
	public static int[] anIntArray264 = new int[25];

	@OriginalMember(owner = "client!p", name = "Ub", descriptor = "Lclient!mc;")
	public static Class42 aClass42_969 = Static23.method501("blinken2:");

	@OriginalMember(owner = "client!p", name = "Xb", descriptor = "Lclient!mc;")
	private static Class42 aClass42_972 = Static23.method501("Examine");

	@OriginalMember(owner = "client!p", name = "Vb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_970 = aClass42_972;

	@OriginalMember(owner = "client!p", name = "Wb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_971 = Static23.method501("@whi@ )4 ");

	@OriginalMember(owner = "client!p", name = "Yb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_973 = Static23.method501("Wordpack geladen)3");

	@OriginalMember(owner = "client!p", name = "Zb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_974 = Static23.method501("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!p", name = "bc", descriptor = "Lclient!mc;")
	public static Class42 aClass42_975 = Static23.method501("mapback");

	@OriginalMember(owner = "client!p", name = "dc", descriptor = "Lclient!mc;")
	private static Class42 aClass42_977 = Static23.method501("Add ignore");

	@OriginalMember(owner = "client!p", name = "cc", descriptor = "Lclient!mc;")
	public static Class42 aClass42_976 = aClass42_977;

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(Z)V")
	public static void method1323() {
		if (Static21.anInt665 == 0) {
			return;
		}
		@Pc(15) int local15 = 0;
		if (Static25.anInt732 != 0) {
			local15 = 1;
		}
		for (@Pc(21) int local21 = 0; local21 < 100; local21++) {
			if (Static15.aClass42Array4[local21] != null) {
				@Pc(31) Class42 local31 = Static97.aClass42Array13[local21];
				@Pc(35) int local35 = Static52.anIntArray209[local21];
				if (local31 != null && local31.method1061(Static49.aClass42_696)) {
					local31 = local31.method1051(5);
				}
				if (local31 != null && local31.method1061(Static17.aClass42_318)) {
					local31 = local31.method1051(5);
				}
				if ((local35 == 3 || local35 == 7) && (local35 == 7 || Static30.anInt834 == 0 || Static30.anInt834 == 1 && Static71.method1287(local31))) {
					@Pc(86) int local86 = 329 - local15 * 13;
					local15++;
					if (anInt1884 > 4 && local86 - 10 < Static38.anInt948 + -4 && local86 + 3 >= Static38.anInt948 + -4) {
						@Pc(139) int local139 = Static95.aClass1_Sub1_Sub1_Sub3_3.method805(Static57.method1822(new Class42[] { Static60.aClass42_785, Static87.aClass42_1220, local31, Static15.aClass42Array4[local21] })) + 25;
						if (local139 > 450) {
							local139 = 450;
						}
						if (anInt1884 < local139 + 4) {
							if (Static25.anInt736 >= 1) {
								Static69.method1232(0, Static57.method1822(new Class42[] { Static19.aClass42_350, local31 }), Static42.aClass42_1384, 0, 2031, 0);
							}
							Static69.method1232(0, Static57.method1822(new Class42[] { Static19.aClass42_350, local31 }), aClass42_976, 0, 2012, 0);
							Static69.method1232(0, Static57.method1822(new Class42[] { Static19.aClass42_350, local31 }), Static95.aClass42_1324, 0, 2003, 0);
						}
					}
					if (local15 >= 5) {
						return;
					}
				}
				if ((local35 == 5 || local35 == 6) && Static30.anInt834 < 2) {
					local15++;
					if (local15 >= 5) {
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(B)V")
	public static void method1326() {
		if (Static84.anInt2244 == 2) {
			Static1.method3((Static103.anInt2678 - Static51.anInt1373 << 7) + Static18.anInt605, Static49.anInt1245 + (Static3.anInt120 + -Static45.anInt1843 << 7), Static61.anInt1458 * 2);
			if (Static46.anInt1209 > -1 && Static27.anInt768 % 20 < 10) {
				Static53.aClass1_Sub1_Sub1_Sub1Array46[0].method82(Static46.anInt1209 - 12, Static84.anInt2238 + -28);
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "e", descriptor = "(B)V")
	public static void method1330() {
		aClass42_968 = null;
		aClass62_1 = null;
		aClass42_971 = null;
		aClass42_976 = null;
		aClass42_969 = null;
		aClass42_972 = null;
		aClass42_977 = null;
		aClass42_975 = null;
		aClass22_10 = null;
		aClass42_967 = null;
		aClass42_973 = null;
		aClass42_970 = null;
		aClass42_965 = null;
		aClass42_974 = null;
		anIntArray264 = null;
		aClass42_966 = null;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ILclient!ja;)V")
	public static void method1331(@OriginalArg(1) Class33 arg0) {
		Static39.aClass33_4 = arg0;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIB)V")
	public static void method1334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < 100; local17++) {
			if (Static15.aClass42Array4[local17] != null) {
				@Pc(27) int local27 = Static52.anIntArray209[local17];
				@Pc(37) int local37 = Static4.anInt125 + 70 + 4 - local15 * 14;
				if (local37 < -20) {
					break;
				}
				if (local27 == 0) {
					local15++;
				}
				@Pc(47) Class42 local47 = Static97.aClass42Array13[local17];
				if (local47 != null && local47.method1061(Static49.aClass42_696)) {
					local47 = local47.method1051(5);
				}
				if (local47 != null && local47.method1061(Static17.aClass42_318)) {
					local47 = local47.method1051(5);
				}
				if ((local27 == 1 || local27 == 2) && (local27 == 1 || Static59.anInt1999 == 0 || Static59.anInt1999 == 1 && Static71.method1287(local47))) {
					local15++;
					if (local37 - 14 < arg1 && arg1 <= local37 && !local47.method1041(Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.aClass42_1396)) {
						if (Static25.anInt736 >= 1) {
							Static69.method1232(0, Static57.method1822(new Class42[] { Static19.aClass42_350, local47 }), Static42.aClass42_1384, 0, 31, 0);
						}
						Static69.method1232(0, Static57.method1822(new Class42[] { Static19.aClass42_350, local47 }), aClass42_976, 0, 12, 0);
						Static69.method1232(0, Static57.method1822(new Class42[] { Static19.aClass42_350, local47 }), Static95.aClass42_1324, 0, 3, 0);
					}
				}
				if ((local27 == 3 || local27 == 7) && Static21.anInt665 == 0 && (local27 == 7 || Static30.anInt834 == 0 || Static30.anInt834 == 1 && Static71.method1287(local47))) {
					local15++;
					if (local37 - 14 < arg1 && arg1 <= local37) {
						if (Static25.anInt736 >= 1) {
							Static69.method1232(0, Static57.method1822(new Class42[] { Static19.aClass42_350, local47 }), Static42.aClass42_1384, 0, 31, 0);
						}
						Static69.method1232(0, Static57.method1822(new Class42[] { Static19.aClass42_350, local47 }), aClass42_976, 0, 12, 0);
						Static69.method1232(0, Static57.method1822(new Class42[] { Static19.aClass42_350, local47 }), Static95.aClass42_1324, 0, 3, 0);
					}
				}
				if (local27 == 4 && (Static63.anInt1526 == 0 || Static63.anInt1526 == 1 && Static71.method1287(local47))) {
					local15++;
					if (arg1 > local37 - 14 && local37 >= arg1) {
						Static69.method1232(0, Static57.method1822(new Class42[] { Static19.aClass42_350, local47 }), Static45.aClass42_956, 0, 14, 0);
					}
				}
				if ((local27 == 5 || local27 == 6) && Static21.anInt665 == 0 && Static30.anInt834 < 2) {
					local15++;
				}
				if (local27 == 8 && (Static63.anInt1526 == 0 || Static63.anInt1526 == 1 && Static71.method1287(local47))) {
					if (arg1 > local37 - 14 && local37 >= arg1) {
						Static69.method1232(0, Static57.method1822(new Class42[] { Static19.aClass42_350, local47 }), Static28.aClass42_429, 0, 34, 0);
					}
					local15++;
				}
			}
		}
	}
}
