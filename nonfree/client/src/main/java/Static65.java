import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!mc", name = "n", descriptor = "[I")
	public static int[] anIntArray229;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "J")
	public static volatile long aLong56 = 0L;

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "Lclient!ad;")
	public static Class4 aClass4_829 = Static75.method1216("Schlie-8en");

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "Lclient!bb;")
	public static Class8 aClass8_21 = new Class8(50);

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
	public static int anInt1627 = 0;

	@OriginalMember(owner = "client!mc", name = "q", descriptor = "Lclient!ad;")
	private static Class4 aClass4_834 = Static75.method1216("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "Lclient!ad;")
	public static Class4 aClass4_830 = aClass4_834;

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
	public static int anInt1629 = 0;

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "Lclient!ad;")
	public static Class4 aClass4_831 = Static75.method1216("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "[I")
	public static int[] anIntArray228 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!mc", name = "o", descriptor = "Lclient!ad;")
	public static Class4 aClass4_832 = Static75.method1216("@yel@");

	@OriginalMember(owner = "client!mc", name = "p", descriptor = "Lclient!ad;")
	public static Class4 aClass4_833 = Static75.method1216("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!mc", name = "r", descriptor = "I")
	public static int anInt1630 = 0;

	@OriginalMember(owner = "client!mc", name = "s", descriptor = "Lclient!ad;")
	public static Class4 aClass4_835 = Static75.method1216("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZI)Z")
	public static boolean method1095(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(11) int local11 = Static22.anIntArray38[arg0];
		if (local11 >= 2000) {
			local11 -= 2000;
		}
		return local11 == 59;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
	public static void method1096() {
		aClass4_830 = null;
		aClass8_21 = null;
		aClass4_834 = null;
		anIntArray229 = null;
		aClass4_831 = null;
		anIntArray228 = null;
		aClass4_835 = null;
		aClass4_832 = null;
		aClass4_829 = null;
		aClass4_833 = null;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZIII[I)V")
	public static void method1097(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3) {
		Static82.aClass25_96.method1157();
		Static101.aClass3_Sub1_Sub4_Sub3_41.method1771(0, 0);
		if (arg0) {
			if (arg3[arg1] != -1) {
				if (arg1 == 0) {
					Static92.aClass3_Sub1_Sub4_Sub3_34.method1771(22, 10);
				}
				if (arg1 == 1) {
					Static18.aClass3_Sub1_Sub4_Sub3_8.method1771(54, 8);
				}
				if (arg1 == 2) {
					Static18.aClass3_Sub1_Sub4_Sub3_8.method1771(82, 8);
				}
				if (arg1 == 3) {
					Static74.aClass3_Sub1_Sub4_Sub3_24.method1771(110, 8);
				}
				if (arg1 == 4) {
					Static10.aClass3_Sub1_Sub4_Sub3_6.method1771(153, 8);
				}
				if (arg1 == 5) {
					Static10.aClass3_Sub1_Sub4_Sub3_6.method1771(181, 8);
				}
				if (arg1 == 6) {
					Static48.aClass3_Sub1_Sub4_Sub3_15.method1771(209, 9);
				}
			}
			if (arg3[0] != -1 && arg2 != 0) {
				Static27.aClass3_Sub1_Sub4_Sub3Array1[0].method1771(29, 13);
			}
			if (arg3[1] != -1 && arg2 != 1) {
				Static27.aClass3_Sub1_Sub4_Sub3Array1[1].method1771(53, 11);
			}
			if (arg3[2] != -1 && arg2 != 2) {
				Static27.aClass3_Sub1_Sub4_Sub3Array1[2].method1771(82, 11);
			}
			if (arg3[3] != -1 && arg2 != 3) {
				Static27.aClass3_Sub1_Sub4_Sub3Array1[3].method1771(115, 12);
			}
			if (arg3[4] != -1 && arg2 != 4) {
				Static27.aClass3_Sub1_Sub4_Sub3Array1[4].method1771(153, 13);
			}
			if (arg3[5] != -1 && arg2 != 5) {
				Static27.aClass3_Sub1_Sub4_Sub3Array1[5].method1771(180, 11);
			}
			if (arg3[6] != -1 && arg2 != 6) {
				Static27.aClass3_Sub1_Sub4_Sub3Array1[6].method1771(208, 13);
			}
		}
		Static17.aClass25_23.method1157();
		Static62.aClass3_Sub1_Sub4_Sub3_21.method1771(0, 0);
		if (arg0) {
			if (arg3[arg1] != -1) {
				if (arg1 == 7) {
					Static12.aClass3_Sub1_Sub4_Sub3_7.method1771(42, 0);
				}
				if (arg1 == 8) {
					Static34.aClass3_Sub1_Sub4_Sub3_13.method1771(74, 0);
				}
				if (arg1 == 9) {
					Static34.aClass3_Sub1_Sub4_Sub3_13.method1771(102, 0);
				}
				if (arg1 == 10) {
					Static75.aClass3_Sub1_Sub4_Sub3_26.method1771(130, 1);
				}
				if (arg1 == 11) {
					Static101.aClass3_Sub1_Sub4_Sub3_40.method1771(173, 0);
				}
				if (arg1 == 12) {
					Static101.aClass3_Sub1_Sub4_Sub3_40.method1771(201, 0);
				}
				if (arg1 == 13) {
					Static28.aClass3_Sub1_Sub4_Sub3_10.method1771(229, 0);
				}
			}
			if (arg3[8] != -1 && arg2 != 8) {
				Static27.aClass3_Sub1_Sub4_Sub3Array1[7].method1771(74, 2);
			}
			if (arg3[9] != -1 && arg2 != 9) {
				Static27.aClass3_Sub1_Sub4_Sub3Array1[8].method1771(102, 3);
			}
			if (arg3[10] != -1 && arg2 != 10) {
				Static27.aClass3_Sub1_Sub4_Sub3Array1[9].method1771(137, 4);
			}
			if (arg3[11] != -1 && arg2 != 11) {
				Static27.aClass3_Sub1_Sub4_Sub3Array1[10].method1771(174, 2);
			}
			if (arg3[12] != -1 && arg2 != 12) {
				Static27.aClass3_Sub1_Sub4_Sub3Array1[11].method1771(201, 2);
			}
			if (arg3[13] != -1 && arg2 != 13) {
				Static27.aClass3_Sub1_Sub4_Sub3Array1[12].method1771(226, 2);
			}
		}
		try {
			@Pc(348) Graphics local348 = Static9.aCanvas1.getGraphics();
			Static82.aClass25_96.method1161(160, local348, 516);
			Static17.aClass25_23.method1161(466, local348, 496);
		} catch (@Pc(367) Exception local367) {
			Static9.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
	public static void method1098() {
		while (true) {
			@Pc(10) Class20 local10 = Static88.aClass20_10;
			@Pc(19) Class3_Sub6 local19;
			synchronized (Static88.aClass20_10) {
				local19 = (Class3_Sub6) Static104.aClass20_11.method311();
			}
			if (local19 == null) {
				return;
			}
			local19.aClass64_Sub1_11.method1648((int) local19.aLong88, false, local19.aClass62_1, local19.aByteArray15);
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IILclient!gb;)Lclient!ad;")
	public static Class4 method1099(@OriginalArg(2) Class3_Sub4 arg0) {
		try {
			@Pc(7) Class4 local7 = new Class4();
			local7.anInt238 = arg0.method444();
			if (local7.anInt238 > 32767) {
				local7.anInt238 = 32767;
			}
			local7.aByteArray1 = new byte[local7.anInt238];
			arg0.anInt627 += Static44.aClass29_1.method633(0, local7.anInt238, local7.aByteArray1, arg0.anInt627, arg0.aByteArray4);
			return local7;
		} catch (@Pc(49) Exception local49) {
			return Static68.aClass4_854;
		}
	}
}
