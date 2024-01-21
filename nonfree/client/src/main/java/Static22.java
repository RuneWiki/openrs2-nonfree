import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!de", name = "E", descriptor = "Lclient!jd;")
	public static Class36 aClass36_16;

	@OriginalMember(owner = "client!de", name = "b", descriptor = "I")
	public static int anInt591 = 0;

	@OriginalMember(owner = "client!de", name = "s", descriptor = "Lclient!ke;")
	public static Class39 aClass39_295 = Static2.method66("");

	@OriginalMember(owner = "client!de", name = "d", descriptor = "Lclient!ke;")
	public static Class39 aClass39_288 = aClass39_295;

	@OriginalMember(owner = "client!de", name = "i", descriptor = "Lclient!ke;")
	private static Class39 aClass39_289 = Static2.method66("Please use a different world)3");

	@OriginalMember(owner = "client!de", name = "j", descriptor = "Lclient!ke;")
	public static Class39 aClass39_290 = aClass39_295;

	@OriginalMember(owner = "client!de", name = "k", descriptor = "I")
	public static int anInt597 = 2;

	@OriginalMember(owner = "client!de", name = "o", descriptor = "Lclient!ke;")
	public static Class39 aClass39_291 = aClass39_295;

	@OriginalMember(owner = "client!de", name = "p", descriptor = "Lclient!ke;")
	public static Class39 aClass39_292 = Static2.method66("@whi@ )4 ");

	@OriginalMember(owner = "client!de", name = "q", descriptor = "Lclient!ke;")
	public static Class39 aClass39_293 = Static2.method66("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!de", name = "r", descriptor = "Lclient!ke;")
	public static Class39 aClass39_294 = aClass39_295;

	@OriginalMember(owner = "client!de", name = "t", descriptor = "Lclient!ke;")
	public static Class39 aClass39_296 = aClass39_295;

	@OriginalMember(owner = "client!de", name = "w", descriptor = "Z")
	public static boolean aBoolean35 = false;

	@OriginalMember(owner = "client!de", name = "x", descriptor = "[I")
	public static int[] anIntArray68 = new int[2000];

	@OriginalMember(owner = "client!de", name = "D", descriptor = "I")
	public static int anInt607 = 0;

	@OriginalMember(owner = "client!de", name = "H", descriptor = "Lclient!ke;")
	public static Class39 aClass39_297 = Static2.method66("backbase2");

	@OriginalMember(owner = "client!de", name = "I", descriptor = "Lclient!ke;")
	public static Class39 aClass39_298 = aClass39_295;

	@OriginalMember(owner = "client!de", name = "L", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray3 = new int[4][105][105];

	@OriginalMember(owner = "client!de", name = "M", descriptor = "[I")
	public static int[] anIntArray69 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!de", name = "N", descriptor = "Lclient!ke;")
	public static Class39 aClass39_299 = aClass39_289;

	@OriginalMember(owner = "client!de", name = "O", descriptor = "Z")
	public static boolean aBoolean36 = false;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V")
	public static void method433() {
		anIntArray68 = null;
		aClass39_294 = null;
		aClass39_299 = null;
		anIntArray69 = null;
		aClass39_289 = null;
		anIntArrayArrayArray3 = null;
		aClass39_295 = null;
		aClass36_16 = null;
		aClass39_297 = null;
		aClass39_296 = null;
		aClass39_293 = null;
		aClass39_290 = null;
		aClass39_298 = null;
		aClass39_291 = null;
		aClass39_288 = null;
		aClass39_292 = null;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
	public static void method434() {
		if (!Static66.aBoolean94) {
			return;
		}
		Static107.anIntArray324 = null;
		Static72.aClass2_Sub1_Sub4_Sub2_5 = null;
		Static17.aClass2_Sub1_Sub4_Sub3_2 = null;
		Static39.aClass51_24 = null;
		Static5.anIntArray14 = null;
		Static26.aClass2_Sub1_Sub4_Sub2_2 = null;
		Static89.aClass51_47 = null;
		Static83.anIntArray298 = null;
		Static84.aClass51_61 = null;
		Static96.aClass51_55 = null;
		Static48.aClass51_28 = null;
		Static35.anIntArray369 = null;
		Static30.anIntArray92 = null;
		Static39.aClass2_Sub1_Sub4_Sub3_7 = null;
		Static108.anIntArray370 = null;
		Static71.anIntArray254 = null;
		Static35.aClass51_62 = null;
		Static27.aClass2_Sub1_Sub4_Sub3Array1 = null;
		Static65.aClass51_40 = null;
		Static97.aClass51_56 = null;
		Static23.aClass51_13 = null;
		Static63.anIntArray238 = null;
		Static73.method1498();
		Static72.method1488(true);
		Static66.aBoolean94 = false;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIZI[B)V")
	public static void method435(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		if (Static78.aClass11_1 == null) {
			return;
		}
		if (Static30.anInt844 >= 0) {
			arg2 -= 20;
			if (arg2 < 1) {
				arg2 = 1;
			}
			Static10.anInt248 = arg2;
			if (Static30.anInt844 == 0) {
				Static90.anInt2384 = 0;
			} else {
				@Pc(42) int local42 = Static94.method1793(Static30.anInt844);
				@Pc(46) int local46 = local42 - Static50.anInt1408;
				Static90.anInt2384 = (local46 + Static90.anInt2384 + 3600 - 1) / Static90.anInt2384;
			}
			Static21.anInt2668 = arg0;
			Static51.aByteArray22 = arg3;
			Static101.aBoolean126 = arg1;
		} else if (Static10.anInt248 == 0) {
			Static57.method1149(arg0, arg1, arg3);
		} else {
			Static51.aByteArray22 = arg3;
			Static21.anInt2668 = arg0;
			Static101.aBoolean126 = arg1;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!ke;Lclient!ke;ILclient!jd;)[Lclient!uc;")
	public static Class2_Sub1_Sub4_Sub3[] method436(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(3) Class36 arg2) {
		@Pc(13) int local13 = arg2.method1774(arg0);
		@Pc(19) int local19 = arg2.method1754(arg1, local13);
		return Static86.method1640(arg2, local13, local19);
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V")
	public static void method437() {
		Static15.method2039(Static7.anInt161);
		if (Static88.anInt1137 != -1) {
			Static15.method2039(Static88.anInt1137);
		}
		Static17.anInt489 = 0;
		Static17.aClass51_11.method1970();
		Static90.anIntArray304 = Static106.method2031(Static90.anIntArray304);
		Static91.method2012();
		Static6.method2060(765, 0, 0, Static7.anInt161, -1, 0, 0, 503);
		if (Static88.anInt1137 != -1) {
			Static6.method2060(765, 0, 0, Static88.anInt1137, -1, 0, 0, 503);
		}
		if (aBoolean36) {
			Static23.method444();
		} else {
			Static73.method1501();
			Static60.method1137();
		}
		try {
			@Pc(68) Graphics local68 = Static7.aCanvas1.getGraphics();
			Static17.aClass51_11.method1967(0, 0, local68);
		} catch (@Pc(76) Exception local76) {
			Static7.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(I)V")
	public static void method438() {
		if (Static69.anInt2009 != 0) {
			return;
		}
		@Pc(13) int local13 = Static39.anInt1172;
		if (Static87.anInt2324 == 1 && Static2.anInt91 >= 516 && Static93.anInt2442 >= 160 && Static2.anInt91 <= 765 && Static93.anInt2442 <= 205) {
			local13 = 0;
		}
		@Pc(43) int local43;
		@Pc(41) int local41;
		@Pc(126) int local126;
		if (!aBoolean36) {
			if (local13 == 1 && Static101.anInt2753 > 0) {
				local43 = Static21.anIntArray326[Static101.anInt2753 - 1];
				if (local43 == 36 || local43 == 38 || local43 == 6 || local43 == 46 || local43 == 8 || local43 == 29 || local43 == 49 || local43 == 21 || local43 == 25 || local43 == 27 || local43 == 53 || local43 == 1001) {
					local41 = Static95.anIntArray313[Static101.anInt2753 - 1];
					local126 = Static60.anIntArray215[Static101.anInt2753 - 1];
					@Pc(301) Class2_Sub1_Sub6 local301 = Static90.method1705(local126);
					if (local301.aBoolean47 || local301.aBoolean43) {
						Static63.aBoolean92 = false;
						Static69.anInt2009 = 2;
						Static78.anInt2157 = local41;
						Static76.anInt2103 = 0;
						Static81.anInt2197 = local126;
						if (Static78.anInt2159 == local126 >> 16) {
							Static69.anInt2009 = 1;
						}
						Static55.anInt1558 = Static2.anInt91;
						if (Static99.anInt2696 == local126 >> 16) {
							Static69.anInt2009 = 3;
						}
						Static41.anInt1198 = Static93.anInt2442;
						return;
					}
				}
			}
			if (local13 == 1 && (Static90.anInt2387 == 1 || Static27.method558(Static101.anInt2753 - 1)) && Static101.anInt2753 > 2) {
				local13 = 2;
			}
			if (local13 == 1 && Static101.anInt2753 > 0) {
				Static107.method1865(Static101.anInt2753 - 1);
			}
			if (local13 != 2 || Static101.anInt2753 <= 0) {
				return;
			}
			Static94.method1788();
			return;
		}
		if (local13 != 1) {
			local41 = Static45.anInt1237;
			local43 = Static80.anInt2188;
			if (Static7.anInt162 == 0) {
				local43 -= 4;
				local41 -= 4;
			}
			if (Static7.anInt162 == 1) {
				local41 -= 205;
				local43 -= 553;
			}
			if (Static7.anInt162 == 2) {
				local41 -= 357;
				local43 -= 17;
			}
			if (local43 < Static46.anInt1260 - 10 || local43 > Static46.anInt1260 + Static19.anInt568 + 10 || local41 < Static82.anInt2219 - 10 || local41 > Static82.anInt2219 + Static92.anInt2405 + 10) {
				if (Static7.anInt162 == 1) {
					Static97.aBoolean120 = true;
				}
				aBoolean36 = false;
				if (Static7.anInt162 == 2) {
					Static31.aBoolean91 = true;
				}
			}
		}
		if (local13 != 1) {
			return;
		}
		local43 = Static46.anInt1260;
		local41 = Static82.anInt2219;
		local126 = Static19.anInt568;
		@Pc(128) int local128 = Static2.anInt91;
		@Pc(130) int local130 = Static93.anInt2442;
		@Pc(132) int local132 = -1;
		if (Static7.anInt162 == 0) {
			local128 -= 4;
			local130 -= 4;
		}
		if (Static7.anInt162 == 1) {
			local128 -= 553;
			local130 -= 205;
		}
		if (Static7.anInt162 == 2) {
			local128 -= 17;
			local130 -= 357;
		}
		for (@Pc(150) int local150 = 0; local150 < Static101.anInt2753; local150++) {
			@Pc(166) int local166 = local41 + (-local150 + -1 + Static101.anInt2753) * 15 + 31;
			if (local128 > local43 && local128 < local43 + local126 && local166 - 13 < local130 && local130 < local166 + 3) {
				local132 = local150;
			}
		}
		if (local132 != -1) {
			Static107.method1865(local132);
		}
		if (Static7.anInt162 == 2) {
			Static31.aBoolean91 = true;
		}
		aBoolean36 = false;
		if (Static7.anInt162 == 1) {
			Static97.aBoolean120 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ZI)V")
	public static void method439(@OriginalArg(1) int arg0) {
		Static100.method1950(arg0);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIIIBIIZII)Z")
	public static boolean method440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(4) int local4;
		for (@Pc(1) int local1 = 0; local1 < 104; local1++) {
			for (local4 = 0; local4 < 104; local4++) {
				Static93.anIntArrayArray23[local1][local4] = 0;
				Static67.anIntArrayArray19[local1][local4] = 99999999;
			}
		}
		local4 = arg6;
		Static93.anIntArrayArray23[arg6][arg10] = 99;
		Static67.anIntArrayArray19[arg6][arg10] = 0;
		@Pc(49) byte local49 = 0;
		@Pc(51) int local51 = arg10;
		Static107.anIntArray325[0] = arg6;
		@Pc(58) int local58 = local49 + 1;
		Static7.anIntArray23[0] = arg10;
		@Pc(62) int local62 = 0;
		@Pc(64) boolean local64 = false;
		@Pc(67) int local67 = Static107.anIntArray325.length;
		@Pc(72) int[][] local72 = Static5.aClass47Array1[Static18.anInt560].anIntArrayArray20;
		@Pc(181) int local181;
		while (local62 != local58) {
			local4 = Static107.anIntArray325[local62];
			local51 = Static7.anIntArray23[local62];
			local62 = (local62 + 1) % local67;
			if (local4 == arg7 && arg3 == local51) {
				local64 = true;
				break;
			}
			if (arg9 != 0) {
				if ((arg9 < 5 || arg9 == 10) && Static5.aClass47Array1[Static18.anInt560].method1472(arg7, arg3, local51, arg9 - 1, arg2, local4)) {
					local64 = true;
					break;
				}
				if (arg9 < 10 && Static5.aClass47Array1[Static18.anInt560].method1462(arg9 - 1, local51, arg3, arg7, arg2, local4)) {
					local64 = true;
					break;
				}
			}
			if (arg1 != 0 && arg5 != 0 && Static5.aClass47Array1[Static18.anInt560].method1468(local51, arg5, local4, arg1, arg0, arg3, arg7)) {
				local64 = true;
				break;
			}
			local181 = Static67.anIntArrayArray19[local4][local51] + 1;
			if (local4 > 0 && Static93.anIntArrayArray23[local4 - 1][local51] == 0 && (local72[local4 - 1][local51] & 0x1280108) == 0) {
				Static107.anIntArray325[local58] = local4 - 1;
				Static7.anIntArray23[local58] = local51;
				local58 = (local58 + 1) % local67;
				Static93.anIntArrayArray23[local4 - 1][local51] = 2;
				Static67.anIntArrayArray19[local4 - 1][local51] = local181;
			}
			if (local4 < 103 && Static93.anIntArrayArray23[local4 + 1][local51] == 0 && (local72[local4 + 1][local51] & 0x1280180) == 0) {
				Static107.anIntArray325[local58] = local4 + 1;
				Static7.anIntArray23[local58] = local51;
				local58 = (local58 + 1) % local67;
				Static93.anIntArrayArray23[local4 + 1][local51] = 8;
				Static67.anIntArrayArray19[local4 + 1][local51] = local181;
			}
			if (local51 > 0 && Static93.anIntArrayArray23[local4][local51 - 1] == 0 && (local72[local4][local51 - 1] & 0x1280102) == 0) {
				Static107.anIntArray325[local58] = local4;
				Static7.anIntArray23[local58] = local51 - 1;
				local58 = (local58 + 1) % local67;
				Static93.anIntArrayArray23[local4][local51 - 1] = 1;
				Static67.anIntArrayArray19[local4][local51 - 1] = local181;
			}
			if (local51 < 103 && Static93.anIntArrayArray23[local4][local51 + 1] == 0 && (local72[local4][local51 + 1] & 0x1280120) == 0) {
				Static107.anIntArray325[local58] = local4;
				Static7.anIntArray23[local58] = local51 + 1;
				Static93.anIntArrayArray23[local4][local51 + 1] = 4;
				Static67.anIntArrayArray19[local4][local51 + 1] = local181;
				local58 = (local58 + 1) % local67;
			}
			if (local4 > 0 && local51 > 0 && Static93.anIntArrayArray23[local4 - 1][local51 - 1] == 0 && (local72[local4 - 1][local51 - 1] & 0x128010E) == 0 && (local72[local4 - 1][local51] & 0x1280108) == 0 && (local72[local4][local51 - 1] & 0x1280102) == 0) {
				Static107.anIntArray325[local58] = local4 - 1;
				Static7.anIntArray23[local58] = local51 - 1;
				Static93.anIntArrayArray23[local4 - 1][local51 - 1] = 3;
				local58 = (local58 + 1) % local67;
				Static67.anIntArrayArray19[local4 - 1][local51 - 1] = local181;
			}
			if (local4 < 103 && local51 > 0 && Static93.anIntArrayArray23[local4 + 1][local51 - 1] == 0 && (local72[local4 + 1][local51 - 1] & 0x1280183) == 0 && (local72[local4 + 1][local51] & 0x1280180) == 0 && (local72[local4][local51 - 1] & 0x1280102) == 0) {
				Static107.anIntArray325[local58] = local4 + 1;
				Static7.anIntArray23[local58] = local51 - 1;
				Static93.anIntArrayArray23[local4 + 1][local51 - 1] = 9;
				Static67.anIntArrayArray19[local4 + 1][local51 - 1] = local181;
				local58 = (local58 + 1) % local67;
			}
			if (local4 > 0 && local51 < 103 && Static93.anIntArrayArray23[local4 - 1][local51 + 1] == 0 && (local72[local4 - 1][local51 + 1] & 0x1280138) == 0 && (local72[local4 - 1][local51] & 0x1280108) == 0 && (local72[local4][local51 + 1] & 0x1280120) == 0) {
				Static107.anIntArray325[local58] = local4 - 1;
				Static7.anIntArray23[local58] = local51 + 1;
				Static93.anIntArrayArray23[local4 - 1][local51 + 1] = 6;
				local58 = (local58 + 1) % local67;
				Static67.anIntArrayArray19[local4 - 1][local51 + 1] = local181;
			}
			if (local4 < 103 && local51 < 103 && Static93.anIntArrayArray23[local4 + 1][local51 + 1] == 0 && (local72[local4 + 1][local51 + 1] & 0x12801E0) == 0 && (local72[local4 + 1][local51] & 0x1280180) == 0 && (local72[local4][local51 + 1] & 0x1280120) == 0) {
				Static107.anIntArray325[local58] = local4 + 1;
				Static7.anIntArray23[local58] = local51 + 1;
				local58 = (local58 + 1) % local67;
				Static93.anIntArrayArray23[local4 + 1][local51 + 1] = 12;
				Static67.anIntArrayArray19[local4 + 1][local51 + 1] = local181;
			}
		}
		anInt607 = 0;
		@Pc(792) int local792;
		@Pc(801) int local801;
		@Pc(807) int local807;
		if (!local64) {
			if (!arg8) {
				return false;
			}
			local792 = 100;
			local181 = 1000;
			for (local801 = arg7 - 10; local801 <= arg7 + 10; local801++) {
				for (local807 = arg3 - 10; local807 <= arg3 + 10; local807++) {
					if (local801 >= 0 && local807 >= 0 && local801 < 104 && local807 < 104 && Static67.anIntArrayArray19[local801][local807] < 100) {
						@Pc(836) int local836 = 0;
						if (arg7 > local801) {
							local836 = arg7 - local801;
						} else if (arg7 + arg1 - 1 < local801) {
							local836 = local801 + 1 - arg1 - arg7;
						}
						@Pc(868) int local868 = 0;
						if (arg3 > local807) {
							local868 = arg3 - local807;
						} else if (local807 > arg5 + arg3 - 1) {
							local868 = local807 + 1 - arg5 - arg3;
						}
						@Pc(903) int local903 = local836 * local836 + local868 * local868;
						if (local903 < local181 || local181 == local903 && local792 > Static67.anIntArrayArray19[local801][local807]) {
							local51 = local807;
							local181 = local903;
							local4 = local801;
							local792 = Static67.anIntArrayArray19[local801][local807];
						}
					}
				}
			}
			if (local181 == 1000) {
				return false;
			}
			if (arg6 == local4 && arg10 == local51) {
				return false;
			}
			anInt607 = 1;
		}
		@Pc(971) byte local971 = 0;
		Static107.anIntArray325[0] = local4;
		local62 = local971 + 1;
		Static7.anIntArray23[0] = local51;
		local181 = local792 = Static93.anIntArrayArray23[local4][local51];
		while (arg6 != local4 || arg10 != local51) {
			if (local181 != local792) {
				local792 = local181;
				Static107.anIntArray325[local62] = local4;
				Static7.anIntArray23[local62++] = local51;
			}
			if ((local181 & 0x1) != 0) {
				local51++;
			} else if ((local181 & 0x4) != 0) {
				local51--;
			}
			if ((local181 & 0x2) != 0) {
				local4++;
			} else if ((local181 & 0x8) != 0) {
				local4--;
			}
			local181 = Static93.anIntArrayArray23[local4][local51];
		}
		if (local62 > 0) {
			local67 = local62--;
			local801 = Static7.anIntArray23[local62];
			@Pc(1056) int local1056 = Static107.anIntArray325[local62];
			if (local67 > 25) {
				local67 = 25;
			}
			if (arg4 == 0) {
				Static50.aClass2_Sub5_Sub1_2.method1302(51);
				Static50.aClass2_Sub5_Sub1_2.method1252(local67 + local67 + 3);
			}
			if (arg4 == 1) {
				Static50.aClass2_Sub5_Sub1_2.method1302(156);
				Static50.aClass2_Sub5_Sub1_2.method1252(local67 + local67 + 17);
			}
			if (arg4 == 2) {
				Static50.aClass2_Sub5_Sub1_2.method1302(131);
				Static50.aClass2_Sub5_Sub1_2.method1252(local67 + local67 + 3);
			}
			Static12.anInt325 = Static107.anIntArray325[0];
			Static55.anInt1552 = Static7.anIntArray23[0];
			for (local807 = 1; local807 < local67; local807++) {
				local62--;
				Static50.aClass2_Sub5_Sub1_2.method1290(Static107.anIntArray325[local62] - local1056);
				Static50.aClass2_Sub5_Sub1_2.method1287(Static7.anIntArray23[local62] - local801);
			}
			Static50.aClass2_Sub5_Sub1_2.method1290(Static60.aBooleanArray10[82] ? 1 : 0);
			Static50.aClass2_Sub5_Sub1_2.method1295(local801 + Static75.anInt454);
			Static50.aClass2_Sub5_Sub1_2.method1257(local1056 + Static19.anInt575);
			return true;
		} else if (arg4 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IB)V")
	public static void method441(@OriginalArg(0) int arg0) {
		for (Static102.anInt2777 += arg0; Static102.anInt2777 >= Static57.anInt1657; Static102.anInt2777 -= Static57.anInt1657) {
			Static39.anInt1169 -= Static39.anInt1169 >> 2;
		}
		Static39.anInt1169 -= arg0 * 1000;
		if (Static39.anInt1169 < 0) {
			Static39.anInt1169 = 0;
		}
	}
}
