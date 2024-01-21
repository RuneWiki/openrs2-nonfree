import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!hd", name = "Ab", descriptor = "[Lclient!bc;")
	public static Class2_Sub2_Sub1_Sub2[] aClass2_Sub2_Sub1_Sub2Array6;

	@OriginalMember(owner = "client!hd", name = "Kb", descriptor = "I")
	public static int anInt1064;

	@OriginalMember(owner = "client!hd", name = "Y", descriptor = "Lclient!u;")
	private static Class74 aClass74_762 = Static72.method1077("Sep");

	@OriginalMember(owner = "client!hd", name = "Z", descriptor = "Lclient!u;")
	private static Class74 aClass74_763 = Static72.method1077("Oct");

	@OriginalMember(owner = "client!hd", name = "ab", descriptor = "Lclient!u;")
	public static Class74 aClass74_764 = Static72.method1077("swe");

	@OriginalMember(owner = "client!hd", name = "db", descriptor = "Lclient!u;")
	private static Class74 aClass74_765 = Static72.method1077("May");

	@OriginalMember(owner = "client!hd", name = "eb", descriptor = "Lclient!u;")
	private static Class74 aClass74_766 = Static72.method1077("Jan");

	@OriginalMember(owner = "client!hd", name = "fb", descriptor = "Lclient!u;")
	private static Class74 aClass74_767 = Static72.method1077("Jun");

	@OriginalMember(owner = "client!hd", name = "gb", descriptor = "I")
	public static int anInt1049 = -1;

	@OriginalMember(owner = "client!hd", name = "hb", descriptor = "Lclient!u;")
	public static Class74 aClass74_768 = Static72.method1077("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!hd", name = "ib", descriptor = "Lclient!u;")
	private static Class74 aClass74_769 = Static72.method1077("Feb");

	@OriginalMember(owner = "client!hd", name = "kb", descriptor = "I")
	public static int anInt1051 = 0;

	@OriginalMember(owner = "client!hd", name = "mb", descriptor = "Lclient!u;")
	private static Class74 aClass74_770 = Static72.method1077("Jul");

	@OriginalMember(owner = "client!hd", name = "nb", descriptor = "I")
	public static int anInt1053 = 0;

	@OriginalMember(owner = "client!hd", name = "ob", descriptor = "Z")
	public static volatile boolean aBoolean43 = true;

	@OriginalMember(owner = "client!hd", name = "pb", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1 = new int[4][13][13];

	@OriginalMember(owner = "client!hd", name = "rb", descriptor = "I")
	public static int anInt1055 = 0;

	@OriginalMember(owner = "client!hd", name = "sb", descriptor = "Lclient!u;")
	private static Class74 aClass74_771 = Static72.method1077("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!hd", name = "tb", descriptor = "Lclient!u;")
	private static Class74 aClass74_772 = Static72.method1077("Apr");

	@OriginalMember(owner = "client!hd", name = "vb", descriptor = "Lclient!u;")
	public static Class74 aClass74_773 = Static72.method1077("Lade Sprites )2 ");

	@OriginalMember(owner = "client!hd", name = "wb", descriptor = "Lclient!u;")
	public static Class74 aClass74_774 = aClass74_771;

	@OriginalMember(owner = "client!hd", name = "yb", descriptor = "Lclient!u;")
	private static Class74 aClass74_775 = Static72.method1077("Nov");

	@OriginalMember(owner = "client!hd", name = "Bb", descriptor = "Lclient!u;")
	private static Class74 aClass74_776 = Static72.method1077("Aug");

	@OriginalMember(owner = "client!hd", name = "Cb", descriptor = "Lclient!u;")
	private static Class74 aClass74_777 = Static72.method1077("Dec");

	@OriginalMember(owner = "client!hd", name = "Eb", descriptor = "I")
	public static int anInt1060 = -1;

	@OriginalMember(owner = "client!hd", name = "Hb", descriptor = "Lclient!u;")
	private static Class74 aClass74_778 = Static72.method1077("Mar");

	@OriginalMember(owner = "client!hd", name = "Gb", descriptor = "[Lclient!u;")
	public static Class74[] aClass74Array7 = new Class74[] { aClass74_766, aClass74_769, aClass74_778, aClass74_772, aClass74_765, aClass74_767, aClass74_770, aClass74_776, aClass74_762, aClass74_763, aClass74_775, aClass74_777 };

	@OriginalMember(owner = "client!hd", name = "Ib", descriptor = "I")
	public static int anInt1062 = 0;

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "(I)V")
	public static void method744() {
		aClass74_774 = null;
		aClass74Array7 = null;
		aClass74_773 = null;
		aClass74_775 = null;
		aClass74_763 = null;
		anIntArrayArrayArray1 = null;
		aClass74_769 = null;
		aClass74_777 = null;
		aClass2_Sub2_Sub1_Sub2Array6 = null;
		aClass74_768 = null;
		aClass74_762 = null;
		aClass74_776 = null;
		aClass74_765 = null;
		aClass74_770 = null;
		aClass74_772 = null;
		aClass74_771 = null;
		aClass74_767 = null;
		aClass74_764 = null;
		aClass74_766 = null;
		aClass74_778 = null;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BZLclient!pd;)V")
	public static void method745(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class62 arg1) {
		if (Static6.aClass62_1 != null) {
			try {
				Static6.aClass62_1.method1347();
			} catch (@Pc(8) Exception local8) {
			}
			Static6.aClass62_1 = null;
		}
		Static6.aClass62_1 = arg1;
		Static90.method1335(arg0);
		Static55.aClass2_Sub2_Sub15_2 = null;
		Static47.aClass2_Sub10_26.anInt2187 = 0;
		Static35.aClass2_Sub10_61 = null;
		Static75.anInt1599 = 0;
		while (true) {
			@Pc(38) Class2_Sub2_Sub15 local38 = (Class2_Sub2_Sub15) Static33.aClass58_24.method1305();
			if (local38 == null) {
				while (true) {
					local38 = (Class2_Sub2_Sub15) Static25.aClass58_21.method1305();
					if (local38 == null) {
						if (Static49.aByte1 != 0) {
							try {
								@Pc(93) Class2_Sub10 local93 = new Class2_Sub10(4);
								local93.method1486(4);
								local93.method1486(Static49.aByte1);
								local93.method1485(0);
								Static6.aClass62_1.method1343(4, local93.aByteArray27);
							} catch (@Pc(114) IOException local114) {
								try {
									Static6.aClass62_1.method1347();
								} catch (@Pc(119) Exception local119) {
								}
								Static30.anInt724++;
								Static6.aClass62_1 = null;
							}
						}
						Static116.anInt2474 = 0;
						Static34.aLong41 = Static10.method244();
						return;
					}
					Static84.aClass56_2.method1288(local38);
					Static109.aClass58_60.method1301(local38.aLong96, local38);
					Static67.anInt1476++;
					Static16.anInt456--;
				}
			}
			Static35.aClass58_69.method1301(local38.aLong96, local38);
			Static68.anInt1493++;
			Static10.anInt324--;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZII)V")
	public static void method746(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1) {
			Static128.aClass2_Sub10_Sub1_3.method1533(255);
			Static128.aClass2_Sub10_Sub1_3.method1497(arg2);
			Static128.aClass2_Sub10_Sub1_3.method1485(arg1);
		}
		if (arg0 == 2) {
			Static128.aClass2_Sub10_Sub1_3.method1533(60);
			Static128.aClass2_Sub10_Sub1_3.method1497(arg2);
			Static128.aClass2_Sub10_Sub1_3.method1485(arg1);
		}
		if (arg0 == 3) {
			Static128.aClass2_Sub10_Sub1_3.method1533(151);
			Static128.aClass2_Sub10_Sub1_3.method1497(arg2);
			Static128.aClass2_Sub10_Sub1_3.method1485(arg1);
		}
		if (arg0 == 4) {
			Static128.aClass2_Sub10_Sub1_3.method1533(202);
			Static128.aClass2_Sub10_Sub1_3.method1497(arg2);
			Static128.aClass2_Sub10_Sub1_3.method1485(arg1);
		}
		if (arg0 == 5) {
			Static128.aClass2_Sub10_Sub1_3.method1533(56);
			Static128.aClass2_Sub10_Sub1_3.method1497(arg2);
			Static128.aClass2_Sub10_Sub1_3.method1485(arg1);
		}
		if (arg0 == 6) {
			Static128.aClass2_Sub10_Sub1_3.method1533(190);
			Static128.aClass2_Sub10_Sub1_3.method1497(arg2);
			Static128.aClass2_Sub10_Sub1_3.method1485(arg1);
		}
		if (arg0 == 7) {
			Static128.aClass2_Sub10_Sub1_3.method1533(136);
			Static128.aClass2_Sub10_Sub1_3.method1497(arg2);
			Static128.aClass2_Sub10_Sub1_3.method1485(arg1);
		}
		if (arg0 == 8) {
			Static128.aClass2_Sub10_Sub1_3.method1533(72);
			Static128.aClass2_Sub10_Sub1_3.method1497(arg2);
			Static128.aClass2_Sub10_Sub1_3.method1485(arg1);
		}
		if (arg0 == 9) {
			Static128.aClass2_Sub10_Sub1_3.method1533(214);
			Static128.aClass2_Sub10_Sub1_3.method1497(arg2);
			Static128.aClass2_Sub10_Sub1_3.method1485(arg1);
		}
		if (arg0 == 10) {
			Static128.aClass2_Sub10_Sub1_3.method1533(157);
			Static128.aClass2_Sub10_Sub1_3.method1497(arg2);
			Static128.aClass2_Sub10_Sub1_3.method1485(arg1);
		}
		@Pc(215) Class2_Sub2_Sub17 local215 = Static23.method478(arg1, arg2);
		if (local215 != null && local215.anObjectArray9 != null) {
			Static45.method732(local215, local215.anObjectArray9, 0, arg0, null, 0);
		}
	}

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)V")
	public static void method747() {
		Static84.aBoolean73 = true;
		Static108.aBoolean102 = true;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(II)Z")
	public static boolean method749(@OriginalArg(0) int arg0) {
		return (arg0 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(II)V")
	public static void method750(@OriginalArg(0) int arg0) {
		@Pc(12) Class2_Sub12 local12 = (Class2_Sub12) Static87.aClass58_36.method1307((long) arg0);
		if (local12 != null) {
			for (@Pc(22) int local22 = 0; local22 < local12.anIntArray155.length; local22++) {
				local12.anIntArray155[local22] = -1;
				local12.anIntArray157[local22] = 0;
			}
		}
	}
}
