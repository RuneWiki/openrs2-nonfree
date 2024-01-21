import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!td", name = "p", descriptor = "I")
	public static int anInt2460;

	@OriginalMember(owner = "client!td", name = "h", descriptor = "Lclient!u;")
	private static Class74 aClass74_1553 = Static72.method1077("To play on this world move to a free area first");

	@OriginalMember(owner = "client!td", name = "f", descriptor = "Lclient!u;")
	public static Class74 aClass74_1552 = aClass74_1553;

	@OriginalMember(owner = "client!td", name = "j", descriptor = "Lclient!u;")
	public static Class74 aClass74_1554 = Static72.method1077("Hidden)2");

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILclient!g;Lclient!u;Lclient!u;)Lclient!cc;")
	public static Class2_Sub2_Sub1_Sub3 method1690(@OriginalArg(1) Class26 arg0, @OriginalArg(2) Class74 arg1, @OriginalArg(3) Class74 arg2) {
		@Pc(9) int local9 = arg0.method1351(arg2);
		@Pc(15) int local15 = arg0.method1374(local9, arg1);
		return Static23.method483(arg0, local15, local9);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
	public static void method1691() {
		aClass74_1554 = null;
		aClass74_1552 = null;
		aClass74_1553 = null;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILclient!g;)V")
	public static void method1692(@OriginalArg(1) Class26 arg0) {
		Static86.aClass26_21 = arg0;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B[IIIZ)V")
	public static void method1693(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		Static128.aClass9_59.method1589();
		Static41.aClass2_Sub2_Sub1_Sub1_19.method97(0, 0);
		if (arg3) {
			if (arg0[arg1] != -1) {
				if (arg1 == 0) {
					Static91.aClass2_Sub2_Sub1_Sub1_39.method97(22, 10);
				}
				if (arg1 == 1) {
					Static111.aClass2_Sub2_Sub1_Sub1_45.method97(54, 8);
				}
				if (arg1 == 2) {
					Static111.aClass2_Sub2_Sub1_Sub1_45.method97(82, 8);
				}
				if (arg1 == 3) {
					Static63.aClass2_Sub2_Sub1_Sub1_30.method97(110, 8);
				}
				if (arg1 == 4) {
					Static97.aClass2_Sub2_Sub1_Sub1_51.method97(153, 8);
				}
				if (arg1 == 5) {
					Static97.aClass2_Sub2_Sub1_Sub1_51.method97(181, 8);
				}
				if (arg1 == 6) {
					Static111.aClass2_Sub2_Sub1_Sub1_46.method97(209, 9);
				}
			}
			if (arg0[0] != -1 && arg2 != 0) {
				Static48.aClass2_Sub2_Sub1_Sub1Array6[0].method97(29, 13);
			}
			if (arg0[1] != -1 && arg2 != 1) {
				Static48.aClass2_Sub2_Sub1_Sub1Array6[1].method97(53, 11);
			}
			if (arg0[2] != -1 && arg2 != 2) {
				Static48.aClass2_Sub2_Sub1_Sub1Array6[2].method97(82, 11);
			}
			if (arg0[3] != -1 && arg2 != 3) {
				Static48.aClass2_Sub2_Sub1_Sub1Array6[3].method97(115, 12);
			}
			if (arg0[4] != -1 && arg2 != 4) {
				Static48.aClass2_Sub2_Sub1_Sub1Array6[4].method97(153, 13);
			}
			if (arg0[5] != -1 && arg2 != 5) {
				Static48.aClass2_Sub2_Sub1_Sub1Array6[5].method97(180, 11);
			}
			if (arg0[6] != -1 && arg2 != 6) {
				Static48.aClass2_Sub2_Sub1_Sub1Array6[6].method97(208, 13);
			}
		}
		Static53.aClass9_27.method1589();
		Static8.aClass2_Sub2_Sub1_Sub1_6.method97(0, 0);
		if (arg3) {
			if (arg0[arg1] != -1) {
				if (arg1 == 7) {
					Static62.aClass2_Sub2_Sub1_Sub1_29.method97(42, 0);
				}
				if (arg1 == 8) {
					Static14.aClass2_Sub2_Sub1_Sub1_13.method97(74, 0);
				}
				if (arg1 == 9) {
					Static14.aClass2_Sub2_Sub1_Sub1_13.method97(102, 0);
				}
				if (arg1 == 10) {
					Static52.aClass2_Sub2_Sub1_Sub1_26.method97(130, 1);
				}
				if (arg1 == 11) {
					Static14.aClass2_Sub2_Sub1_Sub1_12.method97(173, 0);
				}
				if (arg1 == 12) {
					Static14.aClass2_Sub2_Sub1_Sub1_12.method97(201, 0);
				}
				if (arg1 == 13) {
					Static10.aClass2_Sub2_Sub1_Sub1_8.method97(229, 0);
				}
			}
			if (arg0[8] != -1 && arg2 != 8) {
				Static48.aClass2_Sub2_Sub1_Sub1Array6[7].method97(74, 2);
			}
			if (arg0[9] != -1 && arg2 != 9) {
				Static48.aClass2_Sub2_Sub1_Sub1Array6[8].method97(102, 3);
			}
			if (arg0[10] != -1 && arg2 != 10) {
				Static48.aClass2_Sub2_Sub1_Sub1Array6[9].method97(137, 4);
			}
			if (arg0[11] != -1 && arg2 != 11) {
				Static48.aClass2_Sub2_Sub1_Sub1Array6[10].method97(174, 2);
			}
			if (arg0[12] != -1 && arg2 != 12) {
				Static48.aClass2_Sub2_Sub1_Sub1Array6[11].method97(201, 2);
			}
			if (arg0[13] != -1 && arg2 != 13) {
				Static48.aClass2_Sub2_Sub1_Sub1Array6[12].method97(226, 2);
			}
		}
		try {
			@Pc(347) Graphics local347 = Static51.aCanvas2.getGraphics();
			Static128.aClass9_59.method1585(160, local347, 516);
			Static53.aClass9_27.method1585(466, local347, 496);
		} catch (@Pc(361) Exception local361) {
			Static51.aCanvas2.repaint();
		}
	}
}
