import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!je", name = "k", descriptor = "[Lclient!vb;")
	public static Class3_Sub1_Sub1_Sub4[] aClass3_Sub1_Sub1_Sub4Array28;

	@OriginalMember(owner = "client!je", name = "n", descriptor = "Lclient!rd;")
	public static Class42_Sub1 aClass42_Sub1_28;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "Lclient!jb;")
	public static Class34 aClass34_19 = new Class34(100);

	@OriginalMember(owner = "client!je", name = "b", descriptor = "[I")
	public static int[] anIntArray111 = new int[1000];

	@OriginalMember(owner = "client!je", name = "c", descriptor = "I")
	public static volatile int anInt1379 = 0;

	@OriginalMember(owner = "client!je", name = "h", descriptor = "Lclient!v;")
	public static Class62 aClass62_580 = Static45.method753("backvmid3");

	@OriginalMember(owner = "client!je", name = "l", descriptor = "Lclient!v;")
	public static Class62 aClass62_581 = Static45.method753("invback");

	@OriginalMember(owner = "client!je", name = "r", descriptor = "Lclient!v;")
	public static Class62 aClass62_582 = Static45.method753("overlay_multiway");

	@OriginalMember(owner = "client!je", name = "t", descriptor = "[J")
	public static long[] aLongArray15 = new long[200];

	@OriginalMember(owner = "client!je", name = "u", descriptor = "Lclient!v;")
	private static Class62 aClass62_583 = Static45.method753("Login limit exceeded)3");

	@OriginalMember(owner = "client!je", name = "v", descriptor = "Lclient!v;")
	public static Class62 aClass62_584 = aClass62_583;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "([Lclient!v;I)Lclient!v;")
	public static Class62 method782(@OriginalArg(0) Class62[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static20.method470(arg0, arg0.length);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
	public static void method783() {
		aClass34_19 = null;
		aClass62_580 = null;
		anIntArray111 = null;
		aClass42_Sub1_28 = null;
		aLongArray15 = null;
		aClass62_583 = null;
		aClass62_584 = null;
		aClass62_581 = null;
		aClass3_Sub1_Sub1_Sub4Array28 = null;
		aClass62_582 = null;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
	public static void method784() {
		@Pc(7) int local7 = Static12.anInt461;
		@Pc(9) int local9 = Static2.anInt62;
		@Pc(16) int local16 = Static30.anInt979;
		@Pc(18) int local18 = Static45.anInt1339;
		Static97.method1733(local7, local9, local16, local18, 6116423);
		Static97.method1733(local7 + 1, local9 + 1, local16 - 2, 16, 0);
		Static97.method1732(local7 + 1, local9 + 18, local16 - 2, local18 + -19, 0);
		Static86.aClass3_Sub1_Sub1_Sub3_11.method1475(Static63.aClass62_1080, local7 + 3, local9 + 14, 6116423);
		@Pc(64) int local64 = Static6.anInt208;
		@Pc(66) int local66 = Static61.anInt1672;
		if (Static6.anInt211 == 0) {
			local64 -= 4;
			local66 -= 4;
		}
		if (Static6.anInt211 == 1) {
			local64 -= 553;
			local66 -= 205;
		}
		if (Static6.anInt211 == 2) {
			local66 -= 357;
			local64 -= 17;
		}
		for (@Pc(86) int local86 = 0; local86 < Static41.anInt1209; local86++) {
			@Pc(90) int local90 = 16777215;
			@Pc(103) int local103 = (Static41.anInt1209 - local86 - 1) * 15 + local9 + 31;
			if (local7 < local64 && local64 < local16 + local7 && local103 - 13 < local66 && local66 < local103 + 3) {
				local90 = 16776960;
			}
			Static86.aClass3_Sub1_Sub1_Sub3_11.method1477(Static18.aClass62Array6[local86], local7 + 3, local103, local90, true);
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "([IIIZI)V")
	public static void method785(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		Static74.aClass9_36.method682();
		Static83.aClass3_Sub1_Sub1_Sub1_8.method145(0, 0);
		if (arg3) {
			if (arg0[arg1] != -1) {
				if (arg1 == 0) {
					Static6.aClass3_Sub1_Sub1_Sub1_3.method145(22, 10);
				}
				if (arg1 == 1) {
					Static54.aClass3_Sub1_Sub1_Sub1_20.method145(54, 8);
				}
				if (arg1 == 2) {
					Static54.aClass3_Sub1_Sub1_Sub1_20.method145(82, 8);
				}
				if (arg1 == 3) {
					Static13.aClass3_Sub1_Sub1_Sub1_6.method145(110, 8);
				}
				if (arg1 == 4) {
					Static105.aClass3_Sub1_Sub1_Sub1_22.method145(153, 8);
				}
				if (arg1 == 5) {
					Static105.aClass3_Sub1_Sub1_Sub1_22.method145(181, 8);
				}
				if (arg1 == 6) {
					Static48.aClass3_Sub1_Sub1_Sub1_14.method145(209, 9);
				}
			}
			if (arg0[0] != -1 && arg2 != 0) {
				Static62.aClass3_Sub1_Sub1_Sub1Array2[0].method145(29, 13);
			}
			if (arg0[1] != -1 && arg2 != 1) {
				Static62.aClass3_Sub1_Sub1_Sub1Array2[1].method145(53, 11);
			}
			if (arg0[2] != -1 && arg2 != 2) {
				Static62.aClass3_Sub1_Sub1_Sub1Array2[2].method145(82, 11);
			}
			if (arg0[3] != -1 && arg2 != 3) {
				Static62.aClass3_Sub1_Sub1_Sub1Array2[3].method145(115, 12);
			}
			if (arg0[4] != -1 && arg2 != 4) {
				Static62.aClass3_Sub1_Sub1_Sub1Array2[4].method145(153, 13);
			}
			if (arg0[5] != -1 && arg2 != 5) {
				Static62.aClass3_Sub1_Sub1_Sub1Array2[5].method145(180, 11);
			}
			if (arg0[6] != -1 && arg2 != 6) {
				Static62.aClass3_Sub1_Sub1_Sub1Array2[6].method145(208, 13);
			}
		}
		Static64.aClass9_31.method682();
		Static89.aClass3_Sub1_Sub1_Sub1_19.method145(0, 0);
		if (arg3) {
			if (arg0[arg1] != -1) {
				if (arg1 == 7) {
					Static9.aClass3_Sub1_Sub1_Sub1_18.method145(42, 0);
				}
				if (arg1 == 8) {
					Static38.aClass3_Sub1_Sub1_Sub1_11.method145(74, 0);
				}
				if (arg1 == 9) {
					Static38.aClass3_Sub1_Sub1_Sub1_11.method145(102, 0);
				}
				if (arg1 == 10) {
					Static22.aClass3_Sub1_Sub1_Sub1_9.method145(130, 1);
				}
				if (arg1 == 11) {
					Static58.aClass3_Sub1_Sub1_Sub1_16.method145(173, 0);
				}
				if (arg1 == 12) {
					Static58.aClass3_Sub1_Sub1_Sub1_16.method145(201, 0);
				}
				if (arg1 == 13) {
					Static7.aClass3_Sub1_Sub1_Sub1_4.method145(229, 0);
				}
			}
			if (arg0[8] != -1 && arg2 != 8) {
				Static62.aClass3_Sub1_Sub1_Sub1Array2[7].method145(74, 2);
			}
			if (arg0[9] != -1 && arg2 != 9) {
				Static62.aClass3_Sub1_Sub1_Sub1Array2[8].method145(102, 3);
			}
			if (arg0[10] != -1 && arg2 != 10) {
				Static62.aClass3_Sub1_Sub1_Sub1Array2[9].method145(137, 4);
			}
			if (arg0[11] != -1 && arg2 != 11) {
				Static62.aClass3_Sub1_Sub1_Sub1Array2[10].method145(174, 2);
			}
			if (arg0[12] != -1 && arg2 != 12) {
				Static62.aClass3_Sub1_Sub1_Sub1Array2[11].method145(201, 2);
			}
			if (arg0[13] != -1 && arg2 != 13) {
				Static62.aClass3_Sub1_Sub1_Sub1Array2[12].method145(226, 2);
			}
		}
		try {
			@Pc(360) Graphics local360 = Static44.aCanvas1.getGraphics();
			Static74.aClass9_36.method686(local360, 516, 160);
			Static64.aClass9_31.method686(local360, 496, 466);
		} catch (@Pc(376) Exception local376) {
			Static44.aCanvas1.repaint();
		}
	}
}
