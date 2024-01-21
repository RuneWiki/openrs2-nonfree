import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!be", name = "cb", descriptor = "Lclient!a;")
	public static Class1 aClass1_581 = Static94.method1596("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!be", name = "gb", descriptor = "Lclient!a;")
	public static Class1 aClass1_582 = Static94.method1596("Lade Spiel)2Fenster )2 ");

	@OriginalMember(owner = "client!be", name = "hb", descriptor = "I")
	public static int anInt608 = 0;

	@OriginalMember(owner = "client!be", name = "tb", descriptor = "Lclient!a;")
	public static Class1 aClass1_583 = Static94.method1596("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(IIB)V")
	public static void method409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class2_Sub1_Sub6 local7 = Static62.method1298(arg1);
		@Pc(10) int local10 = local7.anInt1134;
		@Pc(13) int local13 = local7.anInt1127;
		@Pc(16) int local16 = local7.anInt1136;
		@Pc(31) int local31 = Class4_Sub1.anIntArray40[local16 - local10];
		if (arg0 < 0 || local31 < arg0) {
			arg0 = 0;
		}
		local31 <<= local10;
		Static94.anIntArray295[local13] = Static94.anIntArray295[local13] & ~local31 | local31 & arg0 << local10;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!a;I)Z")
	public static boolean method410(@OriginalArg(0) Class1 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static51.anInt1703; local11++) {
			if (arg0.method14(Static100.aClass1Array25[local11])) {
				return true;
			}
		}
		return arg0.method14(Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.aClass1_264);
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V")
	public static void method411() {
		aClass1_582 = null;
		aClass1_583 = null;
		aClass1_581 = null;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "([BIB)I")
	public static int method412(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return Static112.method1811(0, arg1, arg0);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!bd;ILclient!a;Lclient!a;)[Lclient!jd;")
	public static Class2_Sub1_Sub2_Sub4[] method413(@OriginalArg(0) Class8 arg0, @OriginalArg(2) Class1 arg1, @OriginalArg(3) Class1 arg2) {
		@Pc(12) int local12 = arg0.method1695(arg1);
		@Pc(20) int local20 = arg0.method1691(local12, arg2);
		return Static87.method1556(local12, arg0, local20);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II[IZI)V")
	public static void method414(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		Static32.aClass4_23.method1527();
		Static7.aClass2_Sub1_Sub2_Sub2_9.method637(0, 0);
		if (arg2) {
			if (arg1[arg0] != -1) {
				if (arg0 == 0) {
					Static91.aClass2_Sub1_Sub2_Sub2_22.method637(22, 10);
				}
				if (arg0 == 1) {
					Static55.aClass2_Sub1_Sub2_Sub2_6.method637(54, 8);
				}
				if (arg0 == 2) {
					Static55.aClass2_Sub1_Sub2_Sub2_6.method637(82, 8);
				}
				if (arg0 == 3) {
					Static63.aClass2_Sub1_Sub2_Sub2_18.method637(110, 8);
				}
				if (arg0 == 4) {
					Static88.aClass2_Sub1_Sub2_Sub2_21.method637(153, 8);
				}
				if (arg0 == 5) {
					Static88.aClass2_Sub1_Sub2_Sub2_21.method637(181, 8);
				}
				if (arg0 == 6) {
					Static50.aClass2_Sub1_Sub2_Sub2_14.method637(209, 9);
				}
			}
			if (arg1[0] != -1 && arg3 != 0) {
				Static95.aClass2_Sub1_Sub2_Sub2Array9[0].method637(29, 13);
			}
			if (arg1[1] != -1 && arg3 != 1) {
				Static95.aClass2_Sub1_Sub2_Sub2Array9[1].method637(53, 11);
			}
			if (arg1[2] != -1 && arg3 != 2) {
				Static95.aClass2_Sub1_Sub2_Sub2Array9[2].method637(82, 11);
			}
			if (arg1[3] != -1 && arg3 != 3) {
				Static95.aClass2_Sub1_Sub2_Sub2Array9[3].method637(115, 12);
			}
			if (arg1[4] != -1 && arg3 != 4) {
				Static95.aClass2_Sub1_Sub2_Sub2Array9[4].method637(153, 13);
			}
			if (arg1[5] != -1 && arg3 != 5) {
				Static95.aClass2_Sub1_Sub2_Sub2Array9[5].method637(180, 11);
			}
			if (arg1[6] != -1 && arg3 != 6) {
				Static95.aClass2_Sub1_Sub2_Sub2Array9[6].method637(208, 13);
			}
		}
		Static53.aClass4_39.method1527();
		Static91.aClass2_Sub1_Sub2_Sub2_23.method637(0, 0);
		if (arg2) {
			if (arg1[arg0] != -1) {
				if (arg0 == 7) {
					Static107.aClass2_Sub1_Sub2_Sub2_28.method637(42, 0);
				}
				if (arg0 == 8) {
					Static43.aClass2_Sub1_Sub2_Sub2_11.method637(74, 0);
				}
				if (arg0 == 9) {
					Static43.aClass2_Sub1_Sub2_Sub2_11.method637(102, 0);
				}
				if (arg0 == 10) {
					Static52.aClass2_Sub1_Sub2_Sub2_16.method637(130, 1);
				}
				if (arg0 == 11) {
					Static22.aClass2_Sub1_Sub2_Sub2_8.method637(173, 0);
				}
				if (arg0 == 12) {
					Static22.aClass2_Sub1_Sub2_Sub2_8.method637(201, 0);
				}
				if (arg0 == 13) {
					Static34.aClass2_Sub1_Sub2_Sub2_10.method637(229, 0);
				}
			}
			if (arg1[8] != -1 && arg3 != 8) {
				Static95.aClass2_Sub1_Sub2_Sub2Array9[7].method637(74, 2);
			}
			if (arg1[9] != -1 && arg3 != 9) {
				Static95.aClass2_Sub1_Sub2_Sub2Array9[8].method637(102, 3);
			}
			if (arg1[10] != -1 && arg3 != 10) {
				Static95.aClass2_Sub1_Sub2_Sub2Array9[9].method637(137, 4);
			}
			if (arg1[11] != -1 && arg3 != 11) {
				Static95.aClass2_Sub1_Sub2_Sub2Array9[10].method637(174, 2);
			}
			if (arg1[12] != -1 && arg3 != 12) {
				Static95.aClass2_Sub1_Sub2_Sub2Array9[11].method637(201, 2);
			}
			if (arg1[13] != -1 && arg3 != 13) {
				Static95.aClass2_Sub1_Sub2_Sub2Array9[12].method637(226, 2);
			}
		}
		try {
			@Pc(349) Graphics local349 = Static103.aCanvas1.getGraphics();
			Static32.aClass4_23.method1525(516, local349, 160);
			Static53.aClass4_39.method1525(496, local349, 466);
		} catch (@Pc(363) Exception local363) {
			Static103.aCanvas1.repaint();
		}
	}
}
