import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!tc", name = "Y", descriptor = "[I")
	public static int[] anIntArray296;

	@OriginalMember(owner = "client!tc", name = "ab", descriptor = "Lclient!bf;")
	public static Class11 aClass11_64;

	@OriginalMember(owner = "client!tc", name = "hb", descriptor = "[I")
	public static int[] anIntArray297;

	@OriginalMember(owner = "client!tc", name = "kb", descriptor = "J")
	public static long aLong75;

	@OriginalMember(owner = "client!tc", name = "lb", descriptor = "[Lclient!q;")
	public static Class3_Sub1_Sub2_Sub3[] aClass3_Sub1_Sub2_Sub3Array12;

	@OriginalMember(owner = "client!tc", name = "nb", descriptor = "Lclient!va;")
	public static Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_14;

	@OriginalMember(owner = "client!tc", name = "ob", descriptor = "[[B")
	public static byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!tc", name = "rb", descriptor = "[Lclient!q;")
	public static Class3_Sub1_Sub2_Sub3[] aClass3_Sub1_Sub2_Sub3Array13;

	@OriginalMember(owner = "client!tc", name = "R", descriptor = "Lclient!bd;")
	public static Class9 aClass9_24 = new Class9(30);

	@OriginalMember(owner = "client!tc", name = "bb", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!tc", name = "gb", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1153 = Static56.method972(" is already on your friend list");

	@OriginalMember(owner = "client!tc", name = "db", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1152 = aClass5_1153;

	@OriginalMember(owner = "client!tc", name = "fb", descriptor = "I")
	public static int anInt2550 = -1;

	@OriginalMember(owner = "client!tc", name = "mb", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1154 = Static56.method972("From");

	@OriginalMember(owner = "client!tc", name = "pb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1155 = Static56.method972("oberen Rand der Webseite ausw-=hlen)3");

	@OriginalMember(owner = "client!tc", name = "qb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1156 = aClass5_1154;

	@OriginalMember(owner = "client!tc", name = "sb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1157 = Static56.method972("blaugr-Un:");

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
	public static int method1683(@OriginalArg(0) KeyEvent arg0) {
		@Pc(11) int local11 = arg0.getKeyChar();
		if (local11 <= 0 || local11 >= 256) {
			local11 = -1;
		}
		return local11;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method1685(@OriginalArg(1) Component arg0) {
		arg0.removeKeyListener(Static2.aClass39_1);
		arg0.removeFocusListener(Static2.aClass39_1);
	}

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "(I)V")
	public static void method1686() {
		Static40.anIntArray133 = null;
		Static15.anIntArray63 = null;
		Static116.aByteArrayArrayArray9 = null;
		Static24.anIntArrayArray7 = null;
		Static100.aByteArrayArrayArray6 = null;
		Static56.anIntArray172 = null;
		anIntArray297 = null;
		Static49.aByteArrayArrayArray3 = null;
		Static19.aByteArrayArrayArray2 = null;
		Static78.anIntArrayArrayArray4 = null;
		Static12.anIntArray60 = null;
		Static111.aByteArrayArrayArray8 = null;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "([IZBII)V")
	public static void method1687(@OriginalArg(0) int[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static87.aClass2_16.method1318();
		Static92.aClass3_Sub1_Sub2_Sub4_11.method1857(0, 0);
		if (arg1) {
			if (arg0[arg3] != -1) {
				if (arg3 == 0) {
					Static113.aClass3_Sub1_Sub2_Sub4_18.method1857(22, 10);
				}
				if (arg3 == 1) {
					Static90.aClass3_Sub1_Sub2_Sub4_10.method1857(54, 8);
				}
				if (arg3 == 2) {
					Static90.aClass3_Sub1_Sub2_Sub4_10.method1857(82, 8);
				}
				if (arg3 == 3) {
					Static2.aClass3_Sub1_Sub2_Sub4_1.method1857(110, 8);
				}
				if (arg3 == 4) {
					Static109.aClass3_Sub1_Sub2_Sub4_17.method1857(153, 8);
				}
				if (arg3 == 5) {
					Static109.aClass3_Sub1_Sub2_Sub4_17.method1857(181, 8);
				}
				if (arg3 == 6) {
					Static52.aClass3_Sub1_Sub2_Sub4_6.method1857(209, 9);
				}
			}
			if (arg0[0] != -1 && arg2 != 0) {
				Static93.aClass3_Sub1_Sub2_Sub4Array5[0].method1857(29, 13);
			}
			if (arg0[1] != -1 && arg2 != 1) {
				Static93.aClass3_Sub1_Sub2_Sub4Array5[1].method1857(53, 11);
			}
			if (arg0[2] != -1 && arg2 != 2) {
				Static93.aClass3_Sub1_Sub2_Sub4Array5[2].method1857(82, 11);
			}
			if (arg0[3] != -1 && arg2 != 3) {
				Static93.aClass3_Sub1_Sub2_Sub4Array5[3].method1857(115, 12);
			}
			if (arg0[4] != -1 && arg2 != 4) {
				Static93.aClass3_Sub1_Sub2_Sub4Array5[4].method1857(153, 13);
			}
			if (arg0[5] != -1 && arg2 != 5) {
				Static93.aClass3_Sub1_Sub2_Sub4Array5[5].method1857(180, 11);
			}
			if (arg0[6] != -1 && arg2 != 6) {
				Static93.aClass3_Sub1_Sub2_Sub4Array5[6].method1857(208, 13);
			}
		}
		Static22.aClass2_4.method1318();
		Static113.aClass3_Sub1_Sub2_Sub4_19.method1857(0, 0);
		if (arg1) {
			if (arg0[arg3] != -1) {
				if (arg3 == 7) {
					Static5.aClass3_Sub1_Sub2_Sub4_2.method1857(42, 0);
				}
				if (arg3 == 8) {
					aClass3_Sub1_Sub2_Sub4_14.method1857(74, 0);
				}
				if (arg3 == 9) {
					aClass3_Sub1_Sub2_Sub4_14.method1857(102, 0);
				}
				if (arg3 == 10) {
					Static51.aClass3_Sub1_Sub2_Sub4_13.method1857(130, 1);
				}
				if (arg3 == 11) {
					Static103.aClass3_Sub1_Sub2_Sub4_15.method1857(173, 0);
				}
				if (arg3 == 12) {
					Static103.aClass3_Sub1_Sub2_Sub4_15.method1857(201, 0);
				}
				if (arg3 == 13) {
					Static46.aClass3_Sub1_Sub2_Sub4_4.method1857(229, 0);
				}
			}
			if (arg0[8] != -1 && arg2 != 8) {
				Static93.aClass3_Sub1_Sub2_Sub4Array5[7].method1857(74, 2);
			}
			if (arg0[9] != -1 && arg2 != 9) {
				Static93.aClass3_Sub1_Sub2_Sub4Array5[8].method1857(102, 3);
			}
			if (arg0[10] != -1 && arg2 != 10) {
				Static93.aClass3_Sub1_Sub2_Sub4Array5[9].method1857(137, 4);
			}
			if (arg0[11] != -1 && arg2 != 11) {
				Static93.aClass3_Sub1_Sub2_Sub4Array5[10].method1857(174, 2);
			}
			if (arg0[12] != -1 && arg2 != 12) {
				Static93.aClass3_Sub1_Sub2_Sub4Array5[11].method1857(201, 2);
			}
			if (arg0[13] != -1 && arg2 != 13) {
				Static93.aClass3_Sub1_Sub2_Sub4Array5[12].method1857(226, 2);
			}
		}
		try {
			@Pc(349) Graphics local349 = Static62.aCanvas1.getGraphics();
			Static87.aClass2_16.method1322(local349, 516, 160);
			Static22.aClass2_4.method1322(local349, 496, 466);
		} catch (@Pc(363) Exception local363) {
			Static62.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "(I)V")
	public static void method1688() {
		aClass9_24 = null;
		aClass3_Sub1_Sub2_Sub4_14 = null;
		aClass5_1156 = null;
		aClass3_Sub1_Sub2_Sub3Array13 = null;
		aCRC32_2 = null;
		aClass5_1155 = null;
		aClass5_1152 = null;
		aClass11_64 = null;
		aClass5_1153 = null;
		anIntArray296 = null;
		anIntArray297 = null;
		aByteArrayArray9 = null;
		aClass5_1157 = null;
		aClass3_Sub1_Sub2_Sub3Array12 = null;
		aClass5_1154 = null;
	}
}
