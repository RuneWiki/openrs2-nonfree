import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!mh", name = "y", descriptor = "I")
	public static int anInt2541;

	@OriginalMember(owner = "client!mh", name = "z", descriptor = "Lclient!me;")
	public static Class2_Sub13 aClass2_Sub13_4;

	@OriginalMember(owner = "client!mh", name = "u", descriptor = "Lclient!ai;")
	private static Class6 aClass6_718 = Static38.method685("white:");

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "Lclient!ai;")
	public static Class6 aClass6_716 = aClass6_718;

	@OriginalMember(owner = "client!mh", name = "n", descriptor = "Lclient!ai;")
	public static Class6 aClass6_717 = aClass6_718;

	@OriginalMember(owner = "client!mh", name = "B", descriptor = "Lclient!ai;")
	public static Class6 aClass6_719 = Static38.method685("(Y");

	@OriginalMember(owner = "client!mh", name = "E", descriptor = "Lclient!ai;")
	private static Class6 aClass6_722 = Static38.method685("You can(Wt add yourself to your own ignore list)3");

	@OriginalMember(owner = "client!mh", name = "C", descriptor = "Lclient!ai;")
	public static Class6 aClass6_720 = aClass6_722;

	@OriginalMember(owner = "client!mh", name = "D", descriptor = "Lclient!ai;")
	public static Class6 aClass6_721 = Static38.method685("Ung-Ultiger Benutzername");

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!wa;IIIIIII)V")
	public static void method1719(@OriginalArg(0) Class87 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static110.aBoolean106) {
			Static108.anInt2568 = 32;
		} else {
			Static108.anInt2568 = 0;
		}
		Static110.aBoolean106 = false;
		@Pc(126) int local126;
		if (Static51.anInt1408 != 0) {
			if (arg5 <= arg2 && arg2 < arg5 + 16 && arg1 <= arg6 && arg1 + 16 > arg6) {
				arg0.anInt4124 -= 4;
				Static151.method2327(arg0);
			} else if (arg2 >= arg5 && arg2 < arg5 + 16 && arg1 + arg4 - 16 <= arg6 && arg4 + arg1 > arg6) {
				arg0.anInt4124 += 4;
				Static151.method2327(arg0);
			} else if (arg5 - Static108.anInt2568 <= arg2 && arg5 + Static108.anInt2568 + 16 > arg2 && arg1 + 16 <= arg6 && arg4 + arg1 - 16 > arg6) {
				local126 = arg4 * (arg4 - 32) / arg3;
				if (local126 < 8) {
					local126 = 8;
				}
				@Pc(142) int local142 = arg6 - arg1 - local126 / 2 - 16;
				@Pc(149) int local149 = arg4 - local126 - 32;
				arg0.anInt4124 = local142 * (arg3 - arg4) / local149;
				Static151.method2327(arg0);
				Static110.aBoolean106 = true;
			}
		}
		if (Static152.anInt3511 == 0) {
			return;
		}
		local126 = arg0.anInt4092;
		if (arg2 >= arg5 - local126 && arg6 >= arg1 && arg5 + 16 > arg2 && arg1 + arg4 >= arg6) {
			arg0.anInt4124 += Static152.anInt3511 * 45;
			Static151.method2327(arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLclient!c;II)[Lclient!bf;")
	public static Class2_Sub3_Sub2_Sub1[] method1721(@OriginalArg(1) Class10 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Static152.method2334(arg2, arg1, arg0) ? Static21.method382() : null;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V")
	public static void method1722() {
		aClass6_719 = null;
		aClass6_716 = null;
		Class56.anIntArray215 = null;
		aClass2_Sub13_4 = null;
		aClass6_717 = null;
		aClass6_721 = null;
		aClass6_718 = null;
		aClass6_720 = null;
		aClass6_722 = null;
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(II)V")
	public static void method1725(@OriginalArg(1) int arg0) {
		if (arg0 == -3) {
			Static136.method2122(Static75.aClass6_561, Static151.aClass6_1035, Static136.aClass6_926);
		} else if (arg0 == -2) {
			Static136.method2122(Static75.aClass6_558, Static75.aClass6_571, Static55.aClass6_412);
		} else if (arg0 == -1) {
			Static136.method2122(Static75.aClass6_559, Static48.aClass6_372, Static136.aClass6_929);
		} else if (arg0 == 3) {
			Static136.method2122(Static75.aClass6_547, Static75.aClass6_550, Static108.aClass6_737);
		} else if (arg0 == 4) {
			Static136.method2122(Static75.aClass6_552, Static136.aClass6_927, Static136.aClass6_923);
		} else if (arg0 == 5) {
			Static136.method2122(Static75.aClass6_566, Static102.aClass6_710, Static40.aClass6_315);
		} else if (arg0 == 6) {
			Static136.method2122(Static75.aClass6_549, Static8.aClass6_67, Static4.aClass6_30);
		} else if (arg0 == 7) {
			Static136.method2122(Static75.aClass6_548, Static152.aClass6_1041, Static176.aClass6_1215);
		} else if (arg0 == 8) {
			Static136.method2122(Static75.aClass6_570, Static37.aClass6_285, Static58.aClass6_424);
		} else if (arg0 == 9) {
			Static136.method2122(Static75.aClass6_539, Static144.aClass6_991, Static60.aClass6_394);
		} else if (arg0 == 10) {
			Static136.method2122(Static75.aClass6_573, Static37.aClass6_284, Static8.aClass6_66);
		} else if (arg0 == 11) {
			Static136.method2122(Static75.aClass6_572, Static63.aClass6_457, Static4.aClass6_39);
		} else if (arg0 == 12) {
			Static136.method2122(Static75.aClass6_575, Static110.aClass6_755, Static176.aClass6_1238);
		} else if (arg0 == 13) {
			Static136.method2122(Static75.aClass6_551, Static10.aClass6_90, Static136.aClass6_930);
		} else if (arg0 == 14) {
			Static136.method2122(Static75.aClass6_553, Static124.aClass6_838, Static151.aClass6_1030);
		} else if (arg0 == 16) {
			Static136.method2122(Static75.aClass6_540, Static170.aClass6_1186, Static133.aClass6_897);
		} else if (arg0 == 17) {
			Static136.method2122(Static75.aClass6_545, Static48.aClass6_368, Static26.aClass6_185);
		} else if (arg0 == 18) {
			Static136.method2122(Static75.aClass6_574, Static77.aClass6_594, Static144.aClass6_994);
		} else if (arg0 == 19) {
			Static136.method2122(Static176.aClass6_1230, Static111.aClass6_766, Static85.aClass6_642);
		} else if (arg0 == 20) {
			Static136.method2122(Static75.aClass6_562, Static52.aClass6_405, Static136.aClass6_921);
		} else if (arg0 == 22) {
			Static136.method2122(Static75.aClass6_569, Static43.aClass6_343, Static68.aClass6_506);
		} else if (arg0 == 23) {
			Static136.method2122(Static75.aClass6_564, Static31.aClass6_214, Static151.aClass6_1034);
		} else if (arg0 == 24) {
			Static136.method2122(Static75.aClass6_555, Static1.aClass6_3, Static73.aClass6_535);
		} else if (arg0 == 25) {
			Static136.method2122(Static75.aClass6_565, Static68.aClass6_508, Static136.aClass6_928);
		} else if (arg0 == 26) {
			Static136.method2122(Static75.aClass6_560, Static46.aClass6_349, Static101.aClass6_630);
		} else if (arg0 == 27) {
			Static136.method2122(Static75.aClass6_563, Static75.aClass6_542, Static47.aClass6_366);
		} else {
			Static136.method2122(Static75.aClass6_538, Static84.aClass6_636, Static136.aClass6_920);
		}
		Static98.method1607(10);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIBIZI)Lclient!bf;")
	public static Class2_Sub3_Sub2_Sub1 method1726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(24) long local24 = ((long) arg2 << 40) + ((long) arg4 + ((long) arg1 << 16)) + ((long) arg0 << 38);
		@Pc(32) Class2_Sub3_Sub2_Sub1 local32;
		if (!arg3) {
			local32 = (Class2_Sub3_Sub2_Sub1) Static121.aClass17_16.method505(local24);
			if (local32 != null) {
				return local32;
			}
		}
		@Pc(40) Class2_Sub3_Sub10 local40 = Static92.method1502(arg4);
		if (arg1 > 1 && local40.anIntArray148 != null) {
			@Pc(50) int local50 = -1;
			for (@Pc(52) int local52 = 0; local52 < 10; local52++) {
				if (local40.anIntArray147[local52] <= arg1 && local40.anIntArray147[local52] != 0) {
					local50 = local40.anIntArray148[local52];
				}
			}
			if (local50 != -1) {
				local40 = Static92.method1502(local50);
			}
		}
		@Pc(93) Class2_Sub3_Sub5_Sub7_Sub1 local93 = local40.method1317();
		if (local93 == null) {
			return null;
		}
		@Pc(99) Class2_Sub3_Sub2_Sub1 local99 = null;
		if (local40.anInt2040 != -1) {
			local99 = method1726(1, 10, 0, true, local40.anInt2033);
			if (local99 == null) {
				return null;
			}
		}
		@Pc(118) int[] local118 = Static53.anIntArray370;
		@Pc(120) int local120 = Static53.anInt3699;
		@Pc(122) int local122 = Static53.anInt3695;
		@Pc(125) int[] local125 = new int[4];
		Static53.method2494(local125);
		local32 = new Class2_Sub3_Sub2_Sub1(36, 32);
		Static53.method2492(local32.anIntArray14, 36, 32);
		Static53.method2483();
		Static100.method1680();
		Static100.method1687(16, 16);
		@Pc(146) int local146 = local40.anInt2010;
		Static100.aBoolean101 = false;
		if (arg3) {
			local146 = (int) ((double) local146 * 1.5D);
		} else if (arg0 == 2) {
			local146 = (int) ((double) local146 * 1.04D);
		}
		@Pc(176) int local176 = Class2_Sub3_Sub2_Sub2.anIntArray207[local40.anInt2035] * local146 >> 16;
		@Pc(185) int local185 = Class2_Sub3_Sub2_Sub2.anIntArray208[local40.anInt2035] * local146 >> 16;
		local93.method2312();
		local93.method2314(local40.anInt2023, local40.anInt2031, local40.anInt2035, local40.anInt2007, local185 + local40.anInt2004 - local93.aShort25 / 2, local176 + local40.anInt2004);
		if (arg0 >= 1) {
			local32.method284(1);
		}
		if (arg0 >= 2) {
			local32.method284(16777215);
		}
		if (arg2 != 0) {
			local32.method282(arg2);
		}
		Static53.method2492(local32.anIntArray14, 36, 32);
		if (local40.anInt2040 != -1) {
			local99.method280(0, 0);
		}
		if (!arg3 && (local40.anInt2000 == 1 || arg1 != 1) && arg1 != -1) {
			Static12.aClass2_Sub3_Sub2_Sub4_Sub1_1.method2512(Static70.method1108(arg1), 0, 9, 16776960, 1);
		}
		if (!arg3) {
			Static121.aClass17_16.method508(local24, local32);
		}
		Static53.method2492(local118, local120, local122);
		Static53.method2487(local125);
		Static100.method1680();
		Static100.aBoolean101 = true;
		return local32;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!wa;I)Lclient!wa;")
	public static Class87 method1727(@OriginalArg(0) Class87 arg0) {
		@Pc(3) Class87 local3 = Static36.method636(arg0);
		if (local3 == null) {
			local3 = arg0.aClass87_13;
		}
		return local3;
	}
}
