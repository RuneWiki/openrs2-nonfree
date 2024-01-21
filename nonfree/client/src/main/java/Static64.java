import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "Lclient!af;")
	public static Class7_Sub1 aClass7_Sub1_10;

	@OriginalMember(owner = "client!kb", name = "o", descriptor = "Lclient!l;")
	public static Class6_Sub3_Sub3_Sub2 aClass6_Sub3_Sub3_Sub2_2;

	@OriginalMember(owner = "client!kb", name = "r", descriptor = "[Lclient!ra;")
	public static Class6_Sub3_Sub3_Sub3[] aClass6_Sub3_Sub3_Sub3Array2;

	@OriginalMember(owner = "client!kb", name = "w", descriptor = "Lclient!ra;")
	public static Class6_Sub3_Sub3_Sub3 aClass6_Sub3_Sub3_Sub3_13;

	@OriginalMember(owner = "client!kb", name = "A", descriptor = "I")
	public static int anInt1831;

	@OriginalMember(owner = "client!kb", name = "D", descriptor = "[Lclient!wa;")
	public static Class6_Sub3_Sub17[] aClass6_Sub3_Sub17Array1;

	@OriginalMember(owner = "client!kb", name = "G", descriptor = "I")
	public static int anInt1833;

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "Lclient!rd;")
	public static Class63 aClass63_980 = Static80.method1463(" )2> @cya@");

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "[[I")
	public static int[][] anIntArrayArray27 = new int[104][104];

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "Lclient!rd;")
	public static Class63 aClass63_981 = Static80.method1463("Keine Antwort vom Server)3");

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "Lclient!rd;")
	public static Class63 aClass63_982 = Static80.method1463("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!kb", name = "m", descriptor = "Lclient!rd;")
	private static Class63 aClass63_983 = Static80.method1463("Enter message to send to ");

	@OriginalMember(owner = "client!kb", name = "B", descriptor = "Lclient!rd;")
	private static Class63 aClass63_988 = Static80.method1463("white:");

	@OriginalMember(owner = "client!kb", name = "n", descriptor = "Lclient!rd;")
	public static Class63 aClass63_984 = aClass63_988;

	@OriginalMember(owner = "client!kb", name = "p", descriptor = "Z")
	public static boolean aBoolean100 = false;

	@OriginalMember(owner = "client!kb", name = "s", descriptor = "Lclient!rd;")
	public static Class63 aClass63_985 = aClass63_988;

	@OriginalMember(owner = "client!kb", name = "u", descriptor = "Lclient!rd;")
	public static Class63 aClass63_986 = Static80.method1463("scrollbar");

	@OriginalMember(owner = "client!kb", name = "x", descriptor = "Lclient!rd;")
	public static Class63 aClass63_987 = aClass63_983;

	@OriginalMember(owner = "client!kb", name = "C", descriptor = "Lclient!rd;")
	public static Class63 aClass63_989 = Static80.method1463("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)Lclient!rd;")
	public static Class63 method1203() {
		@Pc(3) Class63 local3 = new Class63();
		local3.anInt2746 = 0;
		local3.aByteArray33 = new byte[100];
		return local3;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B[IIZI)V")
	public static void method1204(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		Static87.aClass29_18.method1431();
		aClass6_Sub3_Sub3_Sub3_13.method1768(0, 0);
		if (arg2) {
			if (arg0[arg3] != -1) {
				if (arg3 == 0) {
					Static40.aClass6_Sub3_Sub3_Sub3_18.method1768(22, 10);
				}
				if (arg3 == 1) {
					Static113.aClass6_Sub3_Sub3_Sub3_6.method1768(54, 8);
				}
				if (arg3 == 2) {
					Static113.aClass6_Sub3_Sub3_Sub3_6.method1768(82, 8);
				}
				if (arg3 == 3) {
					Static35.aClass6_Sub3_Sub3_Sub3_9.method1768(110, 8);
				}
				if (arg3 == 4) {
					Static101.aClass6_Sub3_Sub3_Sub3_25.method1768(153, 8);
				}
				if (arg3 == 5) {
					Static101.aClass6_Sub3_Sub3_Sub3_25.method1768(181, 8);
				}
				if (arg3 == 6) {
					Static78.aClass6_Sub3_Sub3_Sub3_19.method1768(209, 9);
				}
			}
			if (arg0[0] != -1 && arg1 != 0) {
				aClass6_Sub3_Sub3_Sub3Array2[0].method1768(29, 13);
			}
			if (arg0[1] != -1 && arg1 != 1) {
				aClass6_Sub3_Sub3_Sub3Array2[1].method1768(53, 11);
			}
			if (arg0[2] != -1 && arg1 != 2) {
				aClass6_Sub3_Sub3_Sub3Array2[2].method1768(82, 11);
			}
			if (arg0[3] != -1 && arg1 != 3) {
				aClass6_Sub3_Sub3_Sub3Array2[3].method1768(115, 12);
			}
			if (arg0[4] != -1 && arg1 != 4) {
				aClass6_Sub3_Sub3_Sub3Array2[4].method1768(153, 13);
			}
			if (arg0[5] != -1 && arg1 != 5) {
				aClass6_Sub3_Sub3_Sub3Array2[5].method1768(180, 11);
			}
			if (arg0[6] != -1 && arg1 != 6) {
				aClass6_Sub3_Sub3_Sub3Array2[6].method1768(208, 13);
			}
		}
		Static10.aClass29_3.method1431();
		Static92.aClass6_Sub3_Sub3_Sub3_22.method1768(0, 0);
		if (arg2) {
			if (arg0[arg3] != -1) {
				if (arg3 == 7) {
					Static70.aClass6_Sub3_Sub3_Sub3_15.method1768(42, 0);
				}
				if (arg3 == 8) {
					Static15.aClass6_Sub3_Sub3_Sub3_4.method1768(74, 0);
				}
				if (arg3 == 9) {
					Static15.aClass6_Sub3_Sub3_Sub3_4.method1768(102, 0);
				}
				if (arg3 == 10) {
					Static110.aClass6_Sub3_Sub3_Sub3_26.method1768(130, 1);
				}
				if (arg3 == 11) {
					Static37.aClass6_Sub3_Sub3_Sub3_10.method1768(173, 0);
				}
				if (arg3 == 12) {
					Static37.aClass6_Sub3_Sub3_Sub3_10.method1768(201, 0);
				}
				if (arg3 == 13) {
					Static72.aClass6_Sub3_Sub3_Sub3_17.method1768(229, 0);
				}
			}
			if (arg0[8] != -1 && arg1 != 8) {
				aClass6_Sub3_Sub3_Sub3Array2[7].method1768(74, 2);
			}
			if (arg0[9] != -1 && arg1 != 9) {
				aClass6_Sub3_Sub3_Sub3Array2[8].method1768(102, 3);
			}
			if (arg0[10] != -1 && arg1 != 10) {
				aClass6_Sub3_Sub3_Sub3Array2[9].method1768(137, 4);
			}
			if (arg0[11] != -1 && arg1 != 11) {
				aClass6_Sub3_Sub3_Sub3Array2[10].method1768(174, 2);
			}
			if (arg0[12] != -1 && arg1 != 12) {
				aClass6_Sub3_Sub3_Sub3Array2[11].method1768(201, 2);
			}
			if (arg0[13] != -1 && arg1 != 13) {
				aClass6_Sub3_Sub3_Sub3Array2[12].method1768(226, 2);
			}
		}
		try {
			@Pc(349) Graphics local349 = Static38.aCanvas1.getGraphics();
			Static87.aClass29_18.method1428(160, 516, local349);
			Static10.aClass29_3.method1428(466, 496, local349);
		} catch (@Pc(363) Exception local363) {
			Static38.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
	public static void method1205() {
		aClass63_980 = null;
		aClass6_Sub3_Sub3_Sub2_2 = null;
		aClass63_982 = null;
		aClass6_Sub3_Sub3_Sub3_13 = null;
		aClass63_984 = null;
		aClass63_989 = null;
		aClass63_983 = null;
		aClass63_987 = null;
		aClass63_986 = null;
		aClass6_Sub3_Sub17Array1 = null;
		aClass7_Sub1_10 = null;
		anIntArrayArray27 = null;
		aClass63_988 = null;
		aClass63_985 = null;
		aClass63_981 = null;
		aClass6_Sub3_Sub3_Sub3Array2 = null;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
	public static void method1206() {
		Static86.aClass29_17.method1431();
	}
}
