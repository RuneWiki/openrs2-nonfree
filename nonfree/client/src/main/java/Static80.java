import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!nb", name = "R", descriptor = "[I")
	public static int[] anIntArray320;

	@OriginalMember(owner = "client!nb", name = "bb", descriptor = "[I")
	public static int[] anIntArray322;

	@OriginalMember(owner = "client!nb", name = "cb", descriptor = "[I")
	public static int[] anIntArray323;

	@OriginalMember(owner = "client!nb", name = "hb", descriptor = "[Lclient!ue;")
	public static Class1_Sub2_Sub2_Sub4[] aClass1_Sub2_Sub2_Sub4Array5;

	@OriginalMember(owner = "client!nb", name = "M", descriptor = "I")
	public static int anInt1774 = 0;

	@OriginalMember(owner = "client!nb", name = "S", descriptor = "I")
	public static int anInt1778 = 0;

	@OriginalMember(owner = "client!nb", name = "W", descriptor = "I")
	public static int anInt1782 = 0;

	@OriginalMember(owner = "client!nb", name = "ab", descriptor = "[I")
	public static int[] anIntArray321 = new int[5];

	@OriginalMember(owner = "client!nb", name = "db", descriptor = "Lclient!p;")
	public static Class63 aClass63_15 = new Class63(64);

	@OriginalMember(owner = "client!nb", name = "eb", descriptor = "I")
	public static int anInt1785 = 0;

	@OriginalMember(owner = "client!nb", name = "fb", descriptor = "I")
	public static int anInt1786 = 0;

	@OriginalMember(owner = "client!nb", name = "ib", descriptor = "Lclient!fc;")
	private static Class25 aClass25_852 = Static78.method1313("You have only just left another world)3");

	@OriginalMember(owner = "client!nb", name = "gb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_851 = aClass25_852;

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)V")
	public static void method1364() {
		aClass25_851 = null;
		aClass1_Sub2_Sub2_Sub4Array5 = null;
		aClass25_852 = null;
		anIntArray321 = null;
		anIntArray323 = null;
		anIntArray320 = null;
		aClass63_15 = null;
		anIntArray322 = null;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIILclient!fc;Lclient!fc;)V")
	public static void method1365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class25 arg4, @OriginalArg(6) Class25 arg5) {
		if (Static108.anInt2503 >= 500) {
			return;
		}
		if (arg4.method762() > 0) {
			Static84.aClass25Array14[Static108.anInt2503] = Static116.method1859(new Class25[] { arg5, Static34.aClass25_403, arg4 });
		} else {
			Static84.aClass25Array14[Static108.anInt2503] = arg5;
		}
		Static94.anIntArray381[Static108.anInt2503] = arg1;
		Static102.anIntArray413[Static108.anInt2503] = arg2;
		Static86.anIntArray347[Static108.anInt2503] = arg0;
		Static46.anIntArray239[Static108.anInt2503] = arg3;
		Static108.anInt2503++;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(II[Lclient!od;IZ[BIIII)V")
	public static void method1366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class62[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			for (@Pc(18) int local18 = 0; local18 < 8; local18++) {
				if (arg3 + local14 > 0 && local14 + arg3 < 103 && local18 + arg1 > 0 && arg1 + local18 < 103) {
					arg2[arg8].anIntArrayArray22[local14 + arg3][local18 + arg1] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(87) Class1_Sub5 local87 = new Class1_Sub5(arg4);
		for (@Pc(89) int local89 = 0; local89 < 4; local89++) {
			for (@Pc(93) int local93 = 0; local93 < 64; local93++) {
				for (@Pc(97) int local97 = 0; local97 < 64; local97++) {
					if (arg5 == local89 && local93 >= arg7 && arg7 + 8 > local93 && arg0 <= local97 && arg0 + 8 > local97) {
						Static38.method873(arg8, 0, local87, 0, arg6, arg3 + Static42.method936(local97 & 0x7, local93 & 0x7, arg6), Static85.method1417(arg6, local97 & 0x7, local93 & 0x7) + arg1);
					} else {
						Static38.method873(0, 0, local87, 0, 0, -1, -1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "([BI)[B")
	public static byte[] method1367(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class1_Sub5 local4 = new Class1_Sub5(arg0);
		@Pc(17) int local17 = local4.method672();
		@Pc(21) int local21 = local4.method663();
		if (local21 < 0 || Static30.anInt826 != 0 && local21 > Static30.anInt826) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(43) byte[] local43 = new byte[local21];
			local4.method655(local43, local21);
			return local43;
		} else {
			@Pc(55) int local55 = local4.method663();
			if (local55 < 0 || Static30.anInt826 != 0 && Static30.anInt826 < local55) {
				throw new RuntimeException();
			}
			@Pc(73) byte[] local73 = new byte[local55];
			if (local17 == 1) {
				Static19.method442(local73, local55, arg0, local21);
			} else {
				Static8.aClass61_1.method1418(local4, local73);
			}
			return local73;
		}
	}

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "(B)V")
	public static void method1368() {
		if (Static60.aBoolean54) {
			Static106.method1722();
			Static60.aBoolean54 = false;
			Static77.method1302();
			Static120.aBoolean126 = true;
			Static90.aBoolean98 = true;
			Static18.aBoolean18 = true;
			Static110.aBoolean113 = true;
		}
		Static105.method1690();
		if (Static82.aBoolean77 && Static42.anInt1133 == 1) {
			Static90.aBoolean98 = true;
		}
		@Pc(38) boolean local38;
		if (Static33.anInt922 != -1) {
			local38 = Static24.method571(Static33.anInt922);
			if (local38) {
				Static90.aBoolean98 = true;
			}
		}
		if (Static25.anInt723 == 2) {
			Static90.aBoolean98 = true;
		}
		if (Static52.anInt1267 == 2) {
			Static90.aBoolean98 = true;
		}
		if (Static90.aBoolean98) {
			Static90.aBoolean98 = false;
			Static54.method1023();
		}
		@Pc(110) int local110;
		if (Static33.anInt916 == -1) {
			Static85.aClass1_Sub2_Sub14_4.anInt1957 = Static58.anInt1342 - Static7.anInt166 - 77;
			if (Static10.anInt264 > 17 && Static10.anInt264 < 560 && Static111.anInt2597 > 332) {
				Static38.method880(Static111.anInt2597 - 357, 463, Static85.aClass1_Sub2_Sub14_4, Static10.anInt264 - 17, 0, Static58.anInt1342, 77, -1);
			}
			local110 = Static58.anInt1342 - Static85.aClass1_Sub2_Sub14_4.anInt1957 - 77;
			if (local110 < 0) {
				local110 = 0;
			}
			if (local110 > Static58.anInt1342 - 77) {
				local110 = Static58.anInt1342 - 77;
			}
			if (Static7.anInt166 != local110) {
				Static110.aBoolean113 = true;
				Static7.anInt166 = local110;
			}
		}
		if (Static33.anInt916 == -1 && Static104.anInt2372 == 3) {
			Static85.aClass1_Sub2_Sub14_4.anInt1957 = Static33.anInt920;
			local110 = Static69.anInt1481 * 14 + 7;
			if (Static10.anInt264 > 17 && Static10.anInt264 < 560 && Static111.anInt2597 > 332) {
				Static38.method880(Static111.anInt2597 - 357, 463, Static85.aClass1_Sub2_Sub14_4, Static10.anInt264 - 17, 0, local110, 77, -1);
			}
			@Pc(182) int local182 = Static85.aClass1_Sub2_Sub14_4.anInt1957;
			if (local182 < 0) {
				local182 = 0;
			}
			if (local110 - 77 < local182) {
				local182 = local110 - 77;
			}
			if (Static33.anInt920 != local182) {
				Static110.aBoolean113 = true;
				Static33.anInt920 = local182;
			}
		}
		if (Static33.anInt916 != -1) {
			local38 = Static24.method571(Static33.anInt916);
			if (local38) {
				Static110.aBoolean113 = true;
			}
		}
		if (Static25.anInt723 == 3) {
			Static110.aBoolean113 = true;
		}
		if (Static52.anInt1267 == 3) {
			Static110.aBoolean113 = true;
		}
		if (Static53.aClass25_1240 != null) {
			Static110.aBoolean113 = true;
		}
		if (Static82.aBoolean77 && Static42.anInt1133 == 2) {
			Static110.aBoolean113 = true;
		}
		if (Static110.aBoolean113) {
			Static110.aBoolean113 = false;
			Static92.method1554();
		}
		Static52.method1013();
		if (Static48.anInt1228 != -1) {
			Static120.aBoolean126 = true;
		}
		if (Static120.aBoolean126) {
			if (Static48.anInt1228 != -1 && Static90.anInt2027 == Static48.anInt1228) {
				Static48.anInt1228 = -1;
				Static68.aClass1_Sub5_Sub1_2.method688(75);
				Static68.aClass1_Sub5_Sub1_2.method676(Static90.anInt2027);
			}
			Static55.aBoolean52 = true;
			Static120.aBoolean126 = false;
			Static22.method678(Static60.anInt1366 % 20 < 10 ? -1 : Static48.anInt1228, Static33.anInt922 == -1, Static90.anInt2027, Static22.anIntArray162);
		}
		if (Static18.aBoolean18) {
			Static55.aBoolean52 = true;
			Static18.aBoolean18 = false;
			Static14.method351(Static11.anInt279, Static42.aClass1_Sub2_Sub2_Sub3_1, anInt1785, Static82.anInt1811);
		}
		Static21.method492(Static21.anInt596, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anInt2832, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anInt2827, Static18.anInt522);
		Static18.anInt522 = 0;
	}
}
