import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1471 = Static200.method3116("bevor Sie den Vorgang wiederholen)3");

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1472 = Static200.method3116("mem=");

	@OriginalMember(owner = "client!ug", name = "p", descriptor = "Z")
	public static boolean aBoolean238 = false;

	@OriginalMember(owner = "client!ug", name = "s", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1473 = Static200.method3116("Zu viele Anmelde)2Versuche von Ihrer Adresse");

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
	public static void method3126() {
		if (Static17.aClass6_2 != null || Static60.aClass6_9 != null) {
			return;
		}
		@Pc(24) int local24 = Static192.anInt4115;
		@Pc(33) int local33;
		@Pc(80) int local80;
		if (Static162.aBoolean261) {
			@Pc(31) int local31;
			if (local24 != 1) {
				local31 = Static122.anInt2732;
				local33 = Static176.anInt768;
				if (local31 < Static89.anInt2075 - 10 || Static108.anInt2506 + Static89.anInt2075 + 10 < local31 || Static102.anInt2345 - 10 > local33 || Static29.anInt709 + Static102.anInt2345 + 10 < local33) {
					Static162.aBoolean261 = false;
					Static191.method2989(Static29.anInt709, Static102.anInt2345, Static108.anInt2506, Static89.anInt2075);
				}
			}
			if (local24 == 1) {
				local31 = Static89.anInt2075;
				local80 = Static108.anInt2506;
				local33 = Static102.anInt2345;
				@Pc(84) int local84 = Static166.anInt3603;
				@Pc(86) int local86 = Static39.anInt882;
				@Pc(88) int local88 = -1;
				for (@Pc(90) int local90 = 0; local90 < Static91.anInt2134; local90++) {
					@Pc(105) int local105 = (Static91.anInt2134 - local90 - 1) * 15 + local33 + 31;
					if (local31 < local84 && local80 + local31 > local84 && local86 > local105 - 13 && local86 < local105 + 3) {
						local88 = local90;
					}
				}
				if (local88 != -1) {
					Static65.method1172(local88);
				}
				Static162.aBoolean261 = false;
				Static191.method2989(Static29.anInt709, Static102.anInt2345, Static108.anInt2506, Static89.anInt2075);
				return;
			}
			return;
		}
		if (local24 == 1 && Static91.anInt2134 > 0) {
			@Pc(164) short local164 = Static171.aShortArray50[Static91.anInt2134 - 1];
			if (local164 == 5 || local164 == 35 || local164 == 24 || local164 == 38 || local164 == 25 || local164 == 1 || local164 == 58 || local164 == 22 || local164 == 2 || local164 == 51 || local164 == 18 || local164 == 1003) {
				local80 = Static38.anIntArray129[Static91.anInt2134 - 1];
				local33 = Static203.anIntArray563[Static91.anInt2134 - 1];
				@Pc(224) Class6 local224 = Static107.method1857(local80);
				if (Static52.method1013(Static166.method2717(local224)) || Static190.method2982(Static166.method2717(local224))) {
					Static170.aBoolean204 = false;
					Static67.anInt1655 = 0;
					if (Static17.aClass6_2 != null) {
						Static57.method1068(Static17.aClass6_2);
					}
					Static17.aClass6_2 = Static107.method1857(local80);
					Static116.anInt2635 = Static39.anInt882;
					Static38.anInt870 = Static166.anInt3603;
					Static27.anInt637 = local33;
					Static57.method1068(Static17.aClass6_2);
					return;
				}
			}
		}
		if (local24 == 1 && (Static173.anInt3720 == 1 && Static91.anInt2134 > 2 || Static151.method2590(Static91.anInt2134 - 1))) {
			local24 = 2;
		}
		if (local24 == 1 && Static91.anInt2134 > 0) {
			Static65.method1172(Static91.anInt2134 - 1);
		}
		if (local24 != 2 || Static91.anInt2134 <= 0) {
			return;
		}
		Static163.method2706();
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public static void method3127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class8 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class8(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static100.aClass1_Sub22ArrayArrayArray3[local14][arg1][arg2] == null) {
					Static100.aClass1_Sub22ArrayArrayArray3[local14][arg1][arg2] = new Class1_Sub22(local14, arg1, arg2);
				}
			}
			Static100.aClass1_Sub22ArrayArrayArray3[arg0][arg1][arg2].aClass8_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class8(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static100.aClass1_Sub22ArrayArrayArray3[local14][arg1][arg2] == null) {
					Static100.aClass1_Sub22ArrayArrayArray3[local14][arg1][arg2] = new Class1_Sub22(local14, arg1, arg2);
				}
			}
			Static100.aClass1_Sub22ArrayArrayArray3[arg0][arg1][arg2].aClass8_1 = local12;
		} else {
			@Pc(134) Class105 local134 = new Class105(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static100.aClass1_Sub22ArrayArrayArray3[local14][arg1][arg2] == null) {
					Static100.aClass1_Sub22ArrayArrayArray3[local14][arg1][arg2] = new Class1_Sub22(local14, arg1, arg2);
				}
			}
			Static100.aClass1_Sub22ArrayArrayArray3[arg0][arg1][arg2].aClass105_1 = local134;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZLclient!ai;ZIII)V")
	public static void method3128(@OriginalArg(2) Class7 arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int arg2) {
		Static136.anInt2985 = arg1;
		Static190.aClass7_35 = arg0;
		Static156.anInt3478 = arg2;
		Static62.aBoolean79 = false;
		Static59.anInt1505 = 0;
		Static37.anInt869 = 2;
		Static186.anInt3973 = 1;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILclient!sb;)V")
	public static void method3130(@OriginalArg(1) Applet_Sub1 arg0) {
		if (Static192.anInt4115 != 1) {
			return;
		}
		if (Static166.anInt3603 >= 280 && Static166.anInt3603 <= 294 && Static39.anInt882 >= 4 && Static39.anInt882 <= 18) {
			Static209.method3284(0, 0);
			return;
		}
		if (Static166.anInt3603 >= 295 && Static166.anInt3603 <= 360 && Static39.anInt882 >= 4 && Static39.anInt882 <= 18) {
			Static209.method3284(1, 0);
			return;
		}
		if (Static166.anInt3603 >= 390 && Static166.anInt3603 <= 404 && Static39.anInt882 >= 4 && Static39.anInt882 <= 18) {
			Static209.method3284(0, 1);
			return;
		}
		if (Static166.anInt3603 >= 405 && Static166.anInt3603 <= 470 && Static39.anInt882 >= 4 && Static39.anInt882 <= 18) {
			Static209.method3284(1, 1);
			return;
		}
		if (Static166.anInt3603 >= 500 && Static166.anInt3603 <= 514 && Static39.anInt882 >= 4 && Static39.anInt882 <= 18) {
			Static209.method3284(0, 2);
			return;
		}
		if (Static166.anInt3603 >= 515 && Static166.anInt3603 <= 580 && Static39.anInt882 >= 4 && Static39.anInt882 <= 18) {
			Static209.method3284(1, 2);
			return;
		}
		if (Static166.anInt3603 >= 610 && Static166.anInt3603 <= 624 && Static39.anInt882 >= 4 && Static39.anInt882 <= 18) {
			Static209.method3284(0, 3);
			return;
		}
		if (Static166.anInt3603 >= 625 && Static166.anInt3603 <= 690 && Static39.anInt882 >= 4 && Static39.anInt882 <= 18) {
			Static209.method3284(1, 3);
			return;
		}
		if (Static166.anInt3603 >= 700 && Static39.anInt882 >= 4 && Static166.anInt3603 <= 758 && Static39.anInt882 <= 20) {
			Static43.aBoolean59 = false;
			Static163.method2707();
			return;
		}
		if (Static91.anInt2135 == -1) {
			return;
		}
		@Pc(258) Class63 local258 = Static179.aClass63Array3[Static91.anInt2135];
		if (aBoolean238 == local258.aBoolean143) {
			@Pc(286) byte[] local286 = Static34.method611(new Class60[] { local258.aClass60_872, Static13.aClass60_119 }).method1831();
			Static178.aString6 = new String(local286, 0, local286.length);
			Static43.aBoolean59 = false;
			if (Static27.anInt645 != 0) {
				Static162.anInt4654 = 443;
				Static40.anInt898 = 43594;
				Static34.anInt831 = 43594;
				Static27.anInt645 = 0;
			}
			Static9.anInt4432 = local258.anInt2629;
			Static163.method2707();
			return;
		}
		@Pc(375) Class60 local375 = Static34.method611(new Class60[] { Static60.aClass60_474, local258.aClass60_872, Static77.aClass60_600, Static40.method681(Static209.anInt4478), Static18.aClass60_156, Static40.method681(Static148.aBoolean266 ? 1 : 0), Static208.aClass60_1514, Static40.method681(Static128.anInt2810), Static16.aClass60_144, Static40.method681(Static102.anInt2347) });
		try {
			arg0.getAppletContext().showDocument(local375.method1839(), "_self");
			return;
		} catch (@Pc(386) Exception local386) {
			return;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)Lclient!di;")
	public static Class24 method3134() {
		try {
			return (Class24) Class.forName("Class24_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIBIII)V")
	public static void method3135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static199.method3112(arg6)) {
			Static199.aClass6Array2 = null;
			Static148.method3507(arg2, arg5, arg1, Static82.aClass6ArrayArray1[arg6], -1, arg3, arg4, arg0, arg7);
			if (Static199.aClass6Array2 != null) {
				Static148.method3507(arg2, Static68.anInt1699, arg1, Static199.aClass6Array2, -1412584499, arg3, Static150.anInt3351, arg0, arg7);
				Static199.aClass6Array2 = null;
			}
		} else if (arg7 == -1) {
			for (@Pc(24) int local24 = 0; local24 < 100; local24++) {
				Static153.aBooleanArray19[local24] = true;
			}
		} else {
			Static153.aBooleanArray19[arg7] = true;
		}
	}
}
