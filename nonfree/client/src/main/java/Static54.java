import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!id", name = "kb", descriptor = "Lclient!jc;")
	public static Class34 aClass34_2;

	@OriginalMember(owner = "client!id", name = "W", descriptor = "Lclient!kd;")
	private static Class39 aClass39_725 = Static108.method1915("Error loading your profile)3");

	@OriginalMember(owner = "client!id", name = "S", descriptor = "Lclient!kd;")
	public static Class39 aClass39_722 = aClass39_725;

	@OriginalMember(owner = "client!id", name = "T", descriptor = "Lclient!kd;")
	private static Class39 aClass39_723 = Static108.method1915("green:");

	@OriginalMember(owner = "client!id", name = "U", descriptor = "Lclient!kd;")
	public static Class39 aClass39_724 = aClass39_723;

	@OriginalMember(owner = "client!id", name = "ab", descriptor = "Lclient!kd;")
	public static Class39 aClass39_726 = Static108.method1915(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!id", name = "bb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_727 = aClass39_723;

	@OriginalMember(owner = "client!id", name = "db", descriptor = "Lclient!kd;")
	public static Class39 aClass39_728 = Static108.method1915("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!id", name = "fb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_729 = Static108.method1915("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!id", name = "hb", descriptor = "[[I")
	public static int[][] anIntArrayArray12 = new int[5][5000];

	@OriginalMember(owner = "client!id", name = "lb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_730 = Static108.method1915("Fehler beim Laden Ihres Spielcharakters)3");

	@OriginalMember(owner = "client!id", name = "mb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_731 = Static108.method1915("(Y");

	@OriginalMember(owner = "client!id", name = "pb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_732 = Static108.method1915("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!id", name = "qb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_733 = Static108.method1915("mapdots");

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(IB)I")
	public static int method989(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x3F;
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(I)V")
	public static void method990() {
		aClass39_723 = null;
		aClass39_725 = null;
		aClass39_727 = null;
		aClass34_2 = null;
		anIntArrayArray12 = null;
		aClass39_726 = null;
		aClass39_731 = null;
		aClass39_722 = null;
		aClass39_730 = null;
		aClass39_732 = null;
		aClass39_729 = null;
		aClass39_733 = null;
		aClass39_728 = null;
		aClass39_724 = null;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IZ)Lclient!ja;")
	public static Class1_Sub1_Sub12 method991(@OriginalArg(0) int arg0) {
		@Pc(15) Class1_Sub1_Sub12 local15 = (Class1_Sub1_Sub12) Static94.aClass33_33.method1038((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static119.aClass62_32.method2008(arg0, 3);
		local15 = new Class1_Sub1_Sub12();
		if (local25 != null) {
			local15.method1025(new Class1_Sub18(local25));
		}
		Static94.aClass33_33.method1042(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "([IZIBI)V")
	public static void method992(@OriginalArg(0) int[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static81.aClass6_14.method2069();
		Static75.aClass1_Sub1_Sub4_Sub1_38.method492(0, 0);
		if (arg1) {
			if (arg0[arg3] != -1) {
				if (arg3 == 0) {
					Static21.aClass1_Sub1_Sub4_Sub1_14.method492(22, 10);
				}
				if (arg3 == 1) {
					Static99.aClass1_Sub1_Sub4_Sub1_45.method492(54, 8);
				}
				if (arg3 == 2) {
					Static99.aClass1_Sub1_Sub4_Sub1_45.method492(82, 8);
				}
				if (arg3 == 3) {
					Static79.aClass1_Sub1_Sub4_Sub1_47.method492(110, 8);
				}
				if (arg3 == 4) {
					Static36.aClass1_Sub1_Sub4_Sub1_22.method492(153, 8);
				}
				if (arg3 == 5) {
					Static36.aClass1_Sub1_Sub4_Sub1_22.method492(181, 8);
				}
				if (arg3 == 6) {
					Static72.aClass1_Sub1_Sub4_Sub1_35.method492(209, 9);
				}
			}
			if (arg0[0] != -1 && arg2 != 0) {
				Static9.aClass1_Sub1_Sub4_Sub1Array12[0].method492(29, 13);
			}
			if (arg0[1] != -1 && arg2 != 1) {
				Static9.aClass1_Sub1_Sub4_Sub1Array12[1].method492(53, 11);
			}
			if (arg0[2] != -1 && arg2 != 2) {
				Static9.aClass1_Sub1_Sub4_Sub1Array12[2].method492(82, 11);
			}
			if (arg0[3] != -1 && arg2 != 3) {
				Static9.aClass1_Sub1_Sub4_Sub1Array12[3].method492(115, 12);
			}
			if (arg0[4] != -1 && arg2 != 4) {
				Static9.aClass1_Sub1_Sub4_Sub1Array12[4].method492(153, 13);
			}
			if (arg0[5] != -1 && arg2 != 5) {
				Static9.aClass1_Sub1_Sub4_Sub1Array12[5].method492(180, 11);
			}
			if (arg0[6] != -1 && arg2 != 6) {
				Static9.aClass1_Sub1_Sub4_Sub1Array12[6].method492(208, 13);
			}
		}
		Static128.aClass6_22.method2069();
		Static128.aClass1_Sub1_Sub4_Sub1_54.method492(0, 0);
		if (arg1) {
			if (arg0[arg3] != -1) {
				if (arg3 == 7) {
					Static51.aClass1_Sub1_Sub4_Sub1_28.method492(42, 0);
				}
				if (arg3 == 8) {
					Static76.aClass1_Sub1_Sub4_Sub1_39.method492(74, 0);
				}
				if (arg3 == 9) {
					Static76.aClass1_Sub1_Sub4_Sub1_39.method492(102, 0);
				}
				if (arg3 == 10) {
					Static35.aClass1_Sub1_Sub4_Sub1_21.method492(130, 1);
				}
				if (arg3 == 11) {
					Static98.aClass1_Sub1_Sub4_Sub1_44.method492(173, 0);
				}
				if (arg3 == 12) {
					Static98.aClass1_Sub1_Sub4_Sub1_44.method492(201, 0);
				}
				if (arg3 == 13) {
					Static86.aClass1_Sub1_Sub4_Sub1_41.method492(229, 0);
				}
			}
			if (arg0[8] != -1 && arg2 != 8) {
				Static9.aClass1_Sub1_Sub4_Sub1Array12[7].method492(74, 2);
			}
			if (arg0[9] != -1 && arg2 != 9) {
				Static9.aClass1_Sub1_Sub4_Sub1Array12[8].method492(102, 3);
			}
			if (arg0[10] != -1 && arg2 != 10) {
				Static9.aClass1_Sub1_Sub4_Sub1Array12[9].method492(137, 4);
			}
			if (arg0[11] != -1 && arg2 != 11) {
				Static9.aClass1_Sub1_Sub4_Sub1Array12[10].method492(174, 2);
			}
			if (arg0[12] != -1 && arg2 != 12) {
				Static9.aClass1_Sub1_Sub4_Sub1Array12[11].method492(201, 2);
			}
			if (arg0[13] != -1 && arg2 != 13) {
				Static9.aClass1_Sub1_Sub4_Sub1Array12[12].method492(226, 2);
			}
		}
		try {
			@Pc(347) Graphics local347 = Static16.aCanvas10.getGraphics();
			Static81.aClass6_14.method2067(516, 160, local347);
			Static128.aClass6_22.method2067(496, 466, local347);
		} catch (@Pc(363) Exception local363) {
			Static16.aCanvas10.repaint();
		}
	}

	@OriginalMember(owner = "client!id", name = "d", descriptor = "(I)V")
	public static void method993() {
		while (true) {
			@Pc(10) Class31 local10 = Static1.aClass31_4;
			@Pc(17) Class1_Sub3 local17;
			synchronized (Static1.aClass31_4) {
				local17 = (Class1_Sub3) Static90.aClass31_49.method999();
			}
			if (local17 == null) {
				return;
			}
			local17.aClass62_Sub1_6.method2024(local17.aByteArray6, (int) local17.aLong98, false, local17.aClass61_1);
		}
	}
}
