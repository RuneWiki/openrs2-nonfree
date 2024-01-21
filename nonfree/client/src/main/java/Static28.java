import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!fe", name = "db", descriptor = "I")
	public static int anInt889 = 0;

	@OriginalMember(owner = "client!fe", name = "fb", descriptor = "Lclient!v;")
	public static Class62 aClass62_382 = Static45.method753("Lade Ignorieren)2Liste)3)3)3");

	@OriginalMember(owner = "client!fe", name = "ib", descriptor = "Lclient!v;")
	public static Class62 aClass62_383 = Static45.method753("Name eingeben:");

	@OriginalMember(owner = "client!fe", name = "pb", descriptor = "Lclient!v;")
	public static Class62 aClass62_384 = Static45.method753("backright2");

	@OriginalMember(owner = "client!fe", name = "vb", descriptor = "I")
	public static int anInt898 = 0;

	@OriginalMember(owner = "client!fe", name = "zb", descriptor = "I")
	public static int anInt900 = 0;

	@OriginalMember(owner = "client!fe", name = "Bb", descriptor = "Lclient!v;")
	public static Class62 aClass62_387 = Static45.method753("Verbindung mit Freunde)2Server)3)3)3");

	@OriginalMember(owner = "client!fe", name = "dc", descriptor = "Lclient!v;")
	private static Class62 aClass62_388 = Static45.method753("Please reload this page)3");

	@OriginalMember(owner = "client!fe", name = "ic", descriptor = "Lclient!v;")
	public static Class62 aClass62_389 = Static45.method753("Anmelde)2Zeitlimit \u001c1berschritten)3");

	@OriginalMember(owner = "client!fe", name = "oc", descriptor = "I")
	public static int anInt930 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!fe", name = "uc", descriptor = "Lclient!v;")
	public static Class62 aClass62_391 = aClass62_388;

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "(I)V")
	public static void method569() {
		aClass62_387 = null;
		aClass62_382 = null;
		aClass62_388 = null;
		aClass62_391 = null;
		aClass62_384 = null;
		aClass62_389 = null;
		aClass62_383 = null;
	}

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "(I)V")
	public static void method570() {
		if (Static55.aClass41_2 != null) {
			Static55.aClass41_2.method1025();
		}
		Static55.aClass41_2 = null;
		Static95.method1621();
		Static76.aClass1_1.method37();
		for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
			Static32.aClass11Array1[local18].method297();
		}
		System.gc();
		Static92.method1555();
		Static90.anInt2425 = -1;
		Static55.anInt1546 = 0;
		Static32.method625();
		Static65.method1089(10);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IB)Lclient!ra;")
	public static Class3_Sub1_Sub14 method571(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub1_Sub14 local10 = (Class3_Sub1_Sub14) Static26.aClass34_11.method764((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static36.aClass42_28.method1504(3, arg0);
		local10 = new Class3_Sub1_Sub14();
		if (local20 != null) {
			local10.method1411(new Class3_Sub8(local20));
		}
		Static26.aClass34_11.method765((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "(I)V")
	public static void method572() {
		if (Static69.aBoolean112) {
			Static69.aBoolean112 = false;
			Static93.method1589();
			Static95.aBoolean157 = true;
			Static52.aBoolean64 = true;
			Static86.aBoolean137 = true;
			Static32.aBoolean51 = true;
		}
		Static26.method521();
		if (Static40.aBoolean66 && Static6.anInt211 == 1) {
			Static52.aBoolean64 = true;
		}
		@Pc(38) boolean local38;
		if (Static92.anInt2448 != -1) {
			local38 = Static64.method1078(Static92.anInt2448);
			if (local38) {
				Static52.aBoolean64 = true;
			}
		}
		if (Static38.anInt1139 == 2) {
			Static52.aBoolean64 = true;
		}
		if (Static77.anInt2065 == 2) {
			Static52.aBoolean64 = true;
		}
		if (Static52.aBoolean64) {
			Static52.aBoolean64 = false;
			Static26.method519();
		}
		@Pc(107) int local107;
		if (Static5.anInt200 == -1) {
			Static36.aClass3_Sub1_Sub6_1.anInt882 = Static23.anInt753 - Static26.anInt807 - 77;
			if (Static6.anInt208 > 448 && Static6.anInt208 < 560 && Static61.anInt1672 > 332) {
				Static76.method1246(Static36.aClass3_Sub1_Sub6_1, Static6.anInt208 - 17, 463, -1, Static61.anInt1672 - 357, 0, Static23.anInt753, 77);
			}
			local107 = Static23.anInt753 - Static36.aClass3_Sub1_Sub6_1.anInt882 - 77;
			if (local107 < 0) {
				local107 = 0;
			}
			if (local107 > Static23.anInt753 - 77) {
				local107 = Static23.anInt753 - 77;
			}
			if (local107 != Static26.anInt807) {
				Static26.anInt807 = local107;
				Static86.aBoolean137 = true;
			}
		}
		if (Static5.anInt200 == -1 && Static71.anInt1943 == 3) {
			Static36.aClass3_Sub1_Sub6_1.anInt882 = Static22.anInt746;
			local107 = Static4.anInt182 * 14 + 7;
			if (Static6.anInt208 > 448 && Static6.anInt208 < 560 && Static61.anInt1672 > 332) {
				Static76.method1246(Static36.aClass3_Sub1_Sub6_1, Static6.anInt208 - 17, 463, -1, Static61.anInt1672 - 357, 0, local107, 77);
			}
			@Pc(178) int local178 = Static36.aClass3_Sub1_Sub6_1.anInt882;
			if (local178 < 0) {
				local178 = 0;
			}
			if (local107 - 77 < local178) {
				local178 = local107 - 77;
			}
			if (Static22.anInt746 != local178) {
				Static86.aBoolean137 = true;
				Static22.anInt746 = local178;
			}
		}
		if (Static5.anInt200 != -1) {
			local38 = Static64.method1078(Static5.anInt200);
			if (local38) {
				Static86.aBoolean137 = true;
			}
		}
		if (Static38.anInt1139 == 3) {
			Static86.aBoolean137 = true;
		}
		if (Static77.anInt2065 == 3) {
			Static86.aBoolean137 = true;
		}
		if (Static63.aClass62_1076 != null) {
			Static86.aBoolean137 = true;
		}
		if (Static40.aBoolean66 && Static6.anInt211 == 2) {
			Static86.aBoolean137 = true;
		}
		if (Static86.aBoolean137) {
			Static86.aBoolean137 = false;
			Static71.method1180();
		}
		Static16.method432();
		if (Static19.anInt2827 != -1) {
			Static95.aBoolean157 = true;
		}
		if (Static95.aBoolean157) {
			if (Static19.anInt2827 != -1 && Static34.anInt1097 == Static19.anInt2827) {
				Static19.anInt2827 = -1;
				Static63.aClass3_Sub8_Sub1_6.method1824(166);
				Static63.aClass3_Sub8_Sub1_6.method1806(Static34.anInt1097);
			}
			Static59.aBoolean88 = true;
			Static95.aBoolean157 = false;
			Static49.method785(Static72.anIntArray205, Static34.anInt1097, Static12.anInt451 % 20 >= 10 ? Static19.anInt2827 : -1, Static92.anInt2448 == -1);
		}
		if (Static32.aBoolean51) {
			Static59.aBoolean88 = true;
			Static32.aBoolean51 = false;
			Static35.method662(Static72.anInt1948, Static50.aClass3_Sub1_Sub1_Sub3_12, Static15.anInt574, anInt898);
		}
		Static26.method520(Static54.anInt2739, Static27.anInt818, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anInt1882, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anInt1887);
		Static54.anInt2739 = 0;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILclient!h;IIII)V")
	public static void method574(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class3_Sub6 local7 = new Class3_Sub6();
		local7.anInt1206 = arg1.anInt1077;
		local7.anIntArray83 = arg1.anIntArray73;
		local7.anInt1212 = arg0 * 128;
		local7.anInt1210 = arg1.anInt1044;
		local7.anInt1194 = arg1.anInt1054 * 128;
		@Pc(33) int local33 = arg1.anInt1061;
		local7.anInt1201 = arg1.anInt1071;
		@Pc(40) int local40 = arg1.anInt1068;
		if (arg4 == 1 || arg4 == 3) {
			local33 = arg1.anInt1068;
			local40 = arg1.anInt1061;
		}
		local7.anInt1205 = (arg3 + local40) * 128;
		local7.anInt1208 = (local33 + arg0) * 128;
		local7.anInt1200 = arg3 * 128;
		if (arg1.anIntArray72 != null) {
			local7.aClass3_Sub1_Sub9_1 = arg1;
			local7.method708();
		}
		Static77.aClass24_58.method535(local7);
		if (local7.anIntArray83 != null) {
			local7.anInt1192 = local7.anInt1210 + (int) ((double) (local7.anInt1206 - local7.anInt1210) * Math.random());
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIII)I")
	public static int method575(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg5 & 0x3;
		if ((arg3 & 0x1) == 1) {
			@Pc(15) int local15 = arg0;
			arg0 = arg1;
			arg1 = local15;
		}
		if (local3 == 0) {
			return arg4;
		} else if (local3 == 1) {
			return 1 + 7 - arg0 - arg2;
		} else if (local3 == 2) {
			return 8 - arg4 - arg1;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(B)V")
	public static void method576() {
		Static64.method1078(Static91.anInt2434);
		if (Static94.anInt2496 != -1) {
			Static64.method1078(Static94.anInt2496);
		}
		Static54.anInt2739 = 0;
		Static38.aClass9_22.method682();
		Static80.anIntArray238 = Static66.method1120(Static80.anIntArray238);
		Static97.method1734();
		Static38.method676(0, 0, 0, Static91.anInt2434, 765, -1, 0, 503);
		if (Static94.anInt2496 != -1) {
			Static38.method676(0, 0, 0, Static94.anInt2496, 765, -1, 0, 503);
		}
		if (Static40.aBoolean66) {
			Static49.method784();
		} else {
			Static33.method657();
			Static22.method493();
		}
		try {
			@Pc(65) Graphics local65 = Static44.aCanvas1.getGraphics();
			Static38.aClass9_22.method686(local65, 0, 0);
		} catch (@Pc(73) Exception local73) {
			Static44.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIII)V")
	public static void method578(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (!Static92.aBoolean151) {
			arg0 = 0;
		}
		if (arg1 == Static41.anInt1203 && Static76.anInt2059 == arg3 && Static51.anInt2321 == arg0) {
			return;
		}
		Static51.anInt2321 = arg0;
		Static41.anInt1203 = arg1;
		Static76.anInt2059 = arg3;
		Static65.method1089(25);
		Static74.method1203(null, Static93.aClass62_1129, false);
		@Pc(43) int local43 = Static41.anInt1196;
		@Pc(45) int local45 = Static2.anInt56;
		Static41.anInt1196 = (arg3 - 6) * 8;
		@Pc(56) int local56 = Static41.anInt1196 - local43;
		Static2.anInt56 = arg1 * 8 - 48;
		@Pc(67) int local67 = Static2.anInt56 - local45;
		for (@Pc(73) int local73 = 0; local73 < 16384; local73++) {
			@Pc(79) Class3_Sub1_Sub3_Sub1_Sub2 local79 = Static80.aClass3_Sub1_Sub3_Sub1_Sub2Array1[local73];
			if (local79 != null) {
				for (@Pc(83) int local83 = 0; local83 < 10; local83++) {
					local79.anIntArray194[local83] -= local67;
					local79.anIntArray195[local83] -= local56;
				}
				local79.anInt1887 -= local56 * 128;
				local79.anInt1882 -= local67 * 128;
			}
		}
		for (@Pc(127) int local127 = 0; local127 < 2048; local127++) {
			@Pc(133) Class3_Sub1_Sub3_Sub1_Sub1 local133 = Static104.aClass3_Sub1_Sub3_Sub1_Sub1Array1[local127];
			if (local133 != null) {
				for (@Pc(137) int local137 = 0; local137 < 10; local137++) {
					local133.anIntArray194[local137] -= local67;
					local133.anIntArray195[local137] -= local56;
				}
				local133.anInt1887 -= local56 * 128;
				local133.anInt1882 -= local67 * 128;
			}
		}
		Static27.anInt818 = arg0;
		Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.method1150(arg2, arg4, false);
		@Pc(191) byte local191 = 0;
		@Pc(193) byte local193 = 1;
		@Pc(195) byte local195 = 0;
		@Pc(197) byte local197 = 104;
		@Pc(199) byte local199 = 104;
		@Pc(201) byte local201 = 1;
		if (local56 < 0) {
			local195 = 103;
			local201 = -1;
			local197 = -1;
		}
		if (local67 < 0) {
			local199 = -1;
			local191 = 103;
			local193 = -1;
		}
		for (@Pc(222) int local222 = local191; local222 != local199; local222 += local193) {
			for (@Pc(226) int local226 = local195; local226 != local197; local226 += local201) {
				@Pc(232) int local232 = local56 + local226;
				@Pc(236) int local236 = local222 + local67;
				for (@Pc(238) int local238 = 0; local238 < 4; local238++) {
					if (local236 >= 0 && local232 >= 0 && local236 < 104 && local232 < 104) {
						Static40.aClass24ArrayArrayArray1[local238][local222][local226] = Static40.aClass24ArrayArrayArray1[local238][local236][local232];
					} else {
						Static40.aClass24ArrayArrayArray1[local238][local222][local226] = null;
					}
				}
			}
		}
		for (@Pc(308) Class3_Sub2 local308 = (Class3_Sub2) Static108.aClass24_82.method534(); local308 != null; local308 = (Class3_Sub2) Static108.aClass24_82.method525()) {
			local308.anInt189 -= local56;
			local308.anInt174 -= local67;
			if (local308.anInt174 < 0 || local308.anInt189 < 0 || local308.anInt174 >= 104 || local308.anInt189 >= 104) {
				local308.method1852();
			}
		}
		if (Static89.anInt2413 != 0) {
			Static89.anInt2413 -= local67;
			Static55.anInt1539 -= local56;
		}
		Static63.aBoolean147 = false;
		Static41.anInt1202 = -1;
		Static20.aClass24_22.method531();
		Static19.aClass24_83.method531();
	}
}
