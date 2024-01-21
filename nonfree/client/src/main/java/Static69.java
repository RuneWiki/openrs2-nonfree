import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!m", name = "G", descriptor = "Lclient!tb;")
	public static Class44 aClass44_42;

	@OriginalMember(owner = "client!m", name = "L", descriptor = "I")
	public static int anInt1917;

	@OriginalMember(owner = "client!m", name = "M", descriptor = "Lclient!oc;")
	public static Class3_Sub1_Sub1_Sub4 aClass3_Sub1_Sub1_Sub4_43;

	@OriginalMember(owner = "client!m", name = "O", descriptor = "Lclient!oc;")
	public static Class3_Sub1_Sub1_Sub4 aClass3_Sub1_Sub1_Sub4_44;

	@OriginalMember(owner = "client!m", name = "P", descriptor = "[I")
	public static int[] anIntArray160;

	@OriginalMember(owner = "client!m", name = "S", descriptor = "[I")
	public static int[] anIntArray161;

	@OriginalMember(owner = "client!m", name = "Y", descriptor = "[I")
	public static int[] anIntArray163;

	@OriginalMember(owner = "client!m", name = "H", descriptor = "I")
	public static int anInt1913 = -1;

	@OriginalMember(owner = "client!m", name = "N", descriptor = "I")
	public static int anInt1918 = -1;

	@OriginalMember(owner = "client!m", name = "U", descriptor = "[I")
	public static int[] anIntArray162 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!m", name = "V", descriptor = "I")
	public static int anInt1922 = 0;

	@OriginalMember(owner = "client!m", name = "W", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1015 = Static33.method650("(Udns");

	@OriginalMember(owner = "client!m", name = "X", descriptor = "I")
	public static int anInt1923 = 0;

	@OriginalMember(owner = "client!m", name = "ab", descriptor = "I")
	public static int anInt1924 = 0;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIBI)V")
	public static void method1275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static28.anInt840 == 0 || arg0 == 0 || Static106.anInt2625 >= 50) {
			return;
		}
		Static53.anIntArray106[Static106.anInt2625] = arg1;
		Static40.anIntArray69[Static106.anInt2625] = arg0;
		Static12.anIntArray26[Static106.anInt2625] = arg2;
		Static23.aClass73Array1[Static106.anInt2625] = null;
		Static113.anIntArray288[Static106.anInt2625] = 0;
		Static106.anInt2625++;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ILclient!wb;)V")
	public static void method1276(@OriginalArg(1) Class3_Sub1_Sub2_Sub4 arg0) {
		if (arg0.anInt3195 == Static98.anInt2566 || arg0.anInt3149 == -1 || arg0.anInt3144 != 0 || arg0.anInt3143 + 1 > Static41.method770(arg0.anInt3149).anIntArray54[arg0.anInt3175]) {
			@Pc(39) int local39 = arg0.anInt3195 - arg0.anInt3142;
			@Pc(49) int local49 = arg0.anInt3157 * 128 + arg0.anInt3190 * 64;
			@Pc(55) int local55 = Static98.anInt2566 - arg0.anInt3142;
			@Pc(65) int local65 = arg0.anInt3190 * 64 + arg0.anInt3182 * 128;
			@Pc(75) int local75 = arg0.anInt3190 * 64 + arg0.anInt3180 * 128;
			arg0.anInt3187 = (local55 * local65 + local49 * (local39 - local55)) / local39;
			@Pc(98) int local98 = arg0.anInt3190 * 64 + arg0.anInt3159 * 128;
			arg0.anInt3196 = ((local39 - local55) * local98 + local75 * local55) / local39;
		}
		arg0.anInt3172 = 0;
		if (arg0.anInt3179 == 0) {
			arg0.anInt3183 = 1024;
		}
		if (arg0.anInt3179 == 1) {
			arg0.anInt3183 = 1536;
		}
		if (arg0.anInt3179 == 2) {
			arg0.anInt3183 = 0;
		}
		if (arg0.anInt3179 == 3) {
			arg0.anInt3183 = 512;
		}
		arg0.anInt3156 = arg0.anInt3183;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IILclient!td;)Lclient!oa;")
	public static Class56 method1277(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub1_Sub16 arg1) {
		if (!Static52.method995(Static34.method652(arg1), arg0)) {
			return null;
		} else if (arg1.aClass56Array14 == null || arg1.aClass56Array14.length <= arg0 || arg1.aClass56Array14[arg0] == null || arg1.aClass56Array14[arg0].method1425().method1426() == 0) {
			return Static67.aBoolean105 ? Static84.method1524(new Class56[] { Static115.aClass56_1588, Static111.method1851(arg0) }) : null;
		} else {
			return arg1.aClass56Array14[arg0];
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "([IIIIZ)V")
	public static void method1278(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		Static5.aClass30_3.method813();
		Static64.aClass3_Sub1_Sub1_Sub4_39.method1504(0, 0);
		if (arg3) {
			if (arg0[arg1] != -1) {
				if (arg1 == 0) {
					Static93.aClass3_Sub1_Sub1_Sub4_57.method1504(22, 10);
				}
				if (arg1 == 1) {
					Static102.aClass3_Sub1_Sub1_Sub4_75.method1504(54, 8);
				}
				if (arg1 == 2) {
					Static102.aClass3_Sub1_Sub1_Sub4_75.method1504(82, 8);
				}
				if (arg1 == 3) {
					Static84.aClass3_Sub1_Sub1_Sub4_52.method1504(110, 8);
				}
				if (arg1 == 4) {
					aClass3_Sub1_Sub1_Sub4_44.method1504(153, 8);
				}
				if (arg1 == 5) {
					aClass3_Sub1_Sub1_Sub4_44.method1504(181, 8);
				}
				if (arg1 == 6) {
					Static86.aClass3_Sub1_Sub1_Sub4_54.method1504(209, 9);
				}
			}
			if (arg0[0] != -1 && arg2 != 0) {
				Static80.aClass3_Sub1_Sub1_Sub4Array44[0].method1504(29, 13);
			}
			if (arg0[1] != -1 && arg2 != 1) {
				Static80.aClass3_Sub1_Sub1_Sub4Array44[1].method1504(53, 11);
			}
			if (arg0[2] != -1 && arg2 != 2) {
				Static80.aClass3_Sub1_Sub1_Sub4Array44[2].method1504(82, 11);
			}
			if (arg0[3] != -1 && arg2 != 3) {
				Static80.aClass3_Sub1_Sub1_Sub4Array44[3].method1504(115, 12);
			}
			if (arg0[4] != -1 && arg2 != 4) {
				Static80.aClass3_Sub1_Sub1_Sub4Array44[4].method1504(153, 13);
			}
			if (arg0[5] != -1 && arg2 != 5) {
				Static80.aClass3_Sub1_Sub1_Sub4Array44[5].method1504(180, 11);
			}
			if (arg0[6] != -1 && arg2 != 6) {
				Static80.aClass3_Sub1_Sub1_Sub4Array44[6].method1504(208, 13);
			}
		}
		Static111.aClass30_17.method813();
		Static23.aClass3_Sub1_Sub1_Sub4_16.method1504(0, 0);
		if (arg3) {
			if (arg0[arg1] != -1) {
				if (arg1 == 7) {
					Static68.aClass3_Sub1_Sub1_Sub4_41.method1504(42, 0);
				}
				if (arg1 == 8) {
					aClass3_Sub1_Sub1_Sub4_43.method1504(74, 0);
				}
				if (arg1 == 9) {
					aClass3_Sub1_Sub1_Sub4_43.method1504(102, 0);
				}
				if (arg1 == 10) {
					Static41.aClass3_Sub1_Sub1_Sub4_27.method1504(130, 1);
				}
				if (arg1 == 11) {
					Static106.aClass3_Sub1_Sub1_Sub4_63.method1504(173, 0);
				}
				if (arg1 == 12) {
					Static106.aClass3_Sub1_Sub1_Sub4_63.method1504(201, 0);
				}
				if (arg1 == 13) {
					Static113.aClass3_Sub1_Sub1_Sub4_68.method1504(229, 0);
				}
			}
			if (arg0[8] != -1 && arg2 != 8) {
				Static80.aClass3_Sub1_Sub1_Sub4Array44[7].method1504(74, 2);
			}
			if (arg0[9] != -1 && arg2 != 9) {
				Static80.aClass3_Sub1_Sub1_Sub4Array44[8].method1504(102, 3);
			}
			if (arg0[10] != -1 && arg2 != 10) {
				Static80.aClass3_Sub1_Sub1_Sub4Array44[9].method1504(137, 4);
			}
			if (arg0[11] != -1 && arg2 != 11) {
				Static80.aClass3_Sub1_Sub1_Sub4Array44[10].method1504(174, 2);
			}
			if (arg0[12] != -1 && arg2 != 12) {
				Static80.aClass3_Sub1_Sub1_Sub4Array44[11].method1504(201, 2);
			}
			if (arg0[13] != -1 && arg2 != 13) {
				Static80.aClass3_Sub1_Sub1_Sub4Array44[12].method1504(226, 2);
			}
		}
		try {
			@Pc(350) Graphics local350 = Static59.aCanvas1.getGraphics();
			Static5.aClass30_3.method811(160, 516, local350);
			Static111.aClass30_17.method811(466, 496, local350);
		} catch (@Pc(368) Exception local368) {
			Static59.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!m", name = "d", descriptor = "(B)V")
	public static void method1279() {
		aClass44_42 = null;
		anIntArray161 = null;
		anIntArray160 = null;
		anIntArray162 = null;
		aClass3_Sub1_Sub1_Sub4_43 = null;
		aClass56_1015 = null;
		anIntArray163 = null;
		aClass3_Sub1_Sub1_Sub4_44 = null;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ILclient!td;)Z")
	public static boolean method1280(@OriginalArg(1) Class3_Sub1_Sub16 arg0) {
		@Pc(6) int local6 = arg0.anInt2811;
		if (Static24.anInt707 == 2) {
			if (local6 == 201) {
				Static12.aBoolean17 = true;
				Static122.aClass56_1634 = Static86.aClass56_1239;
				Static126.anInt3105 = 0;
				Static122.aClass56_1632 = Static122.aClass56_1633;
				Static76.anInt2064 = 1;
				Static105.aBoolean121 = true;
			}
			if (local6 == 202) {
				Static122.aClass56_1632 = Static122.aClass56_1633;
				Static76.anInt2064 = 2;
				Static126.anInt3105 = 0;
				Static105.aBoolean121 = true;
				Static122.aClass56_1634 = Static79.aClass56_1131;
				Static12.aBoolean17 = true;
			}
		}
		if (local6 == 205) {
			Static61.anInt1799 = 250;
			return true;
		}
		if (local6 == 501) {
			Static12.aBoolean17 = true;
			Static122.aClass56_1634 = Static110.aClass56_1516;
			Static122.aClass56_1632 = Static122.aClass56_1633;
			Static76.anInt2064 = 4;
			Static126.anInt3105 = 0;
			Static105.aBoolean121 = true;
		}
		if (local6 == 502) {
			Static12.aBoolean17 = true;
			Static122.aClass56_1632 = Static122.aClass56_1633;
			Static126.anInt3105 = 0;
			Static122.aClass56_1634 = Static23.aClass56_340;
			Static76.anInt2064 = 5;
			Static105.aBoolean121 = true;
		}
		@Pc(94) int local94;
		@Pc(98) int local98;
		if (local6 >= 300 && local6 <= 313) {
			local94 = (local6 - 300) / 2;
			local98 = local6 & 0x1;
			Static76.aClass42_2.method1078(local94, local98 == 1);
		}
		if (local6 >= 314 && local6 <= 323) {
			local98 = local6 & 0x1;
			local94 = (local6 - 314) / 2;
			Static76.aClass42_2.method1087(local94, local98 == 1);
		}
		if (local6 == 324) {
			Static76.aClass42_2.method1076(false);
		}
		if (local6 == 325) {
			Static76.aClass42_2.method1076(true);
		}
		if (local6 == 326) {
			Static111.aClass3_Sub2_Sub1_4.method325(63);
			Static76.aClass42_2.method1089(Static111.aClass3_Sub2_Sub1_4);
			return true;
		}
		if (local6 == 620) {
			Static70.aBoolean87 = !Static70.aBoolean87;
		}
		if (local6 >= 601 && local6 <= 613) {
			Static1.method1();
			if (Static122.aClass56_1631.method1426() > 0) {
				Static111.aClass3_Sub2_Sub1_4.method325(39);
				Static111.aClass3_Sub2_Sub1_4.method300(Static122.aClass56_1631.method1445());
				Static111.aClass3_Sub2_Sub1_4.method303(local6 - 601);
				Static111.aClass3_Sub2_Sub1_4.method303(Static70.aBoolean87 ? 1 : 0);
			}
		}
		return false;
	}
}
