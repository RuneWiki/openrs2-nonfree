import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!n", name = "t", descriptor = "[Lclient!jd;")
	public static Class2_Sub1_Sub2_Sub4[] aClass2_Sub1_Sub2_Sub4Array11;

	@OriginalMember(owner = "client!n", name = "b", descriptor = "Lclient!a;")
	public static Class1 aClass1_1970 = Static94.method1596("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!n", name = "i", descriptor = "Lclient!a;")
	public static Class1 aClass1_1971 = Static94.method1596("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!n", name = "k", descriptor = "Lclient!i;")
	public static Class25 aClass25_5 = new Class25(32);

	@OriginalMember(owner = "client!n", name = "m", descriptor = "Z")
	public static boolean aBoolean104 = false;

	@OriginalMember(owner = "client!n", name = "n", descriptor = "Lclient!a;")
	public static Class1 aClass1_1972 = Static94.method1596("Ihre Nachricht an: ");

	@OriginalMember(owner = "client!n", name = "q", descriptor = "Lclient!a;")
	private static Class1 aClass1_1974 = Static94.method1596("Please close the interface you have open before using (Wreport abuse(W");

	@OriginalMember(owner = "client!n", name = "o", descriptor = "Lclient!a;")
	public static Class1 aClass1_1973 = aClass1_1974;

	@OriginalMember(owner = "client!n", name = "p", descriptor = "I")
	public static int anInt1940 = 0;

	@OriginalMember(owner = "client!n", name = "r", descriptor = "I")
	public static int anInt1941 = 0;

	@OriginalMember(owner = "client!n", name = "s", descriptor = "Lclient!a;")
	public static Class1 aClass1_1975 = Static94.method1596("@gr1@");

	@OriginalMember(owner = "client!n", name = "u", descriptor = "Lclient!a;")
	public static Class1 aClass1_1976 = Static94.method1596("weiss:");

	@OriginalMember(owner = "client!n", name = "v", descriptor = "Lclient!a;")
	public static Class1 aClass1_1977 = Static94.method1596("Wir vermuten ihr Spielkonto wurde gestohlen");

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(BIII)I")
	public static int method1338(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 >> 7;
		@Pc(11) int local11 = arg1 >> 7;
		if (local11 < 0 || local7 < 0 || local11 > 103 || local7 > 103) {
			return 0;
		}
		@Pc(35) int local35 = arg1 & 0x7F;
		@Pc(37) int local37 = arg0;
		if (arg0 < 3 && (Static29.aByteArrayArrayArray2[1][local11][local7] & 0x2) == 2) {
			local37 = arg0 + 1;
		}
		@Pc(80) int local80 = (128 - local35) * Static50.anIntArrayArrayArray7[local37][local11][local7] + local35 * Static50.anIntArrayArrayArray7[local37][local11 + 1][local7] >> 7;
		@Pc(84) int local84 = arg2 & 0x7F;
		@Pc(120) int local120 = local35 * Static50.anIntArrayArrayArray7[local37][local11 + 1][local7 + 1] + Static50.anIntArrayArrayArray7[local37][local11][local7 + 1] * (128 - local35) >> 7;
		return (128 - local84) * local80 + local120 * local84 >> 7;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(II)Lclient!ec;")
	public static Class2_Sub1_Sub4 method1339(@OriginalArg(0) int arg0) {
		@Pc(15) Class2_Sub1_Sub4 local15 = (Class2_Sub1_Sub4) Static72.aClass11_17.method431((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static32.aClass8_11.method1684(arg0, 13);
		local15 = new Class2_Sub1_Sub4();
		local15.anInt1024 = arg0;
		if (local25 != null) {
			local15.method717(new Class2_Sub3(local25));
		}
		Static72.aClass11_17.method430((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V")
	public static void method1340() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german]");
		System.exit(1);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
	public static void method1341() {
		aClass1_1972 = null;
		aClass25_5 = null;
		aClass1_1974 = null;
		aClass1_1970 = null;
		aClass2_Sub1_Sub2_Sub4Array11 = null;
		aClass1_1976 = null;
		aClass1_1977 = null;
		aClass1_1973 = null;
		aClass1_1971 = null;
		aClass1_1975 = null;
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V")
	public static void method1342() {
		Static6.aBoolean11 = false;
		Static93.anInt2359 = -1;
		Static37.anInt1346 = 0;
		Static83.anInt2224 = 0;
		Static59.aClass2_Sub3_Sub1_2.anInt1168 = 0;
		Static1.anInt32 = -1;
		Static13.anInt654 = -1;
		Static63.anInt1885 = 0;
		Static82.anInt2147 = -1;
		Static30.anInt1133 = 0;
		Static54.anInt1771 = 0;
		Static95.anInt2397 = 0;
		Static13.aClass2_Sub3_Sub1_1.anInt1168 = 0;
		for (@Pc(35) int local35 = 0; local35 < Static67.aClass2_Sub1_Sub1_Sub1_Sub1Array3.length; local35++) {
			if (Static67.aClass2_Sub1_Sub1_Sub1_Sub1Array3[local35] != null) {
				Static67.aClass2_Sub1_Sub1_Sub1_Sub1Array3[local35].anInt2756 = -1;
			}
		}
		for (@Pc(53) int local53 = 0; local53 < Static101.aClass2_Sub1_Sub1_Sub1_Sub2Array1.length; local53++) {
			if (Static101.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local53] != null) {
				Static101.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local53].anInt2756 = -1;
			}
		}
		Static29.method759(30);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)V")
	public static void method1343() {
		Static53.method1214();
		@Pc(18) int local18;
		@Pc(20) int local20;
		if (Static54.anInt1771 == 2) {
			@Pc(12) int[] local12 = Static92.anIntArray169;
			@Pc(15) byte[] local15 = Static62.aClass2_Sub1_Sub2_Sub2_17.aByteArray5;
			local18 = local15.length;
			for (local20 = 0; local20 < local18; local20++) {
				if (local15[local20] == 0) {
					local12[local20] = 0;
				}
			}
			Static42.aClass2_Sub1_Sub2_Sub4_3.method1143(0, 0, 33, 33, 25, 25, Static94.anInt2376, 256, Static53.anIntArray180, Static53.anIntArray181);
			Static37.method936();
			return;
		}
		@Pc(60) int local60 = Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anInt2724 / 32 + 48;
		local18 = 464 - Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anInt2717 / 32;
		@Pc(74) int local74 = Static94.anInt2376 + Static72.anInt1975 & 0x7FF;
		Static86.aClass2_Sub1_Sub2_Sub4_6.method1143(25, 5, 146, 151, local60, local18, local74, Static85.anInt2254 + 256, Static84.anIntArray285, Static62.anIntArray202);
		for (local20 = 0; local20 < Static48.anInt1607; local20++) {
			local60 = Static67.anIntArray345[local20] * 4 + 2 - Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anInt2724 / 32;
			local18 = Static76.anIntArray266[local20] * 4 + 2 - Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anInt2717 / 32;
			Static28.method737(local18, local60, Static103.aClass2_Sub1_Sub2_Sub4Array12[local20]);
		}
		@Pc(136) int local136;
		for (@Pc(132) int local132 = 0; local132 < 104; local132++) {
			for (local136 = 0; local136 < 104; local136++) {
				@Pc(146) Class46 local146 = Static15.aClass46ArrayArrayArray1[Static2.anInt287][local132][local136];
				if (local146 != null) {
					local18 = local136 * 4 + 2 - Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anInt2717 / 32;
					local60 = local132 * 4 + 2 - Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anInt2724 / 32;
					Static28.method737(local18, local60, Static54.aClass2_Sub1_Sub2_Sub4Array9[0]);
				}
			}
		}
		for (local136 = 0; local136 < Static44.anInt1516; local136++) {
			@Pc(199) Class2_Sub1_Sub1_Sub1_Sub2 local199 = Static101.aClass2_Sub1_Sub1_Sub1_Sub2Array1[Static20.anIntArray89[local136]];
			if (local199 != null && local199.method1783()) {
				@Pc(208) Class2_Sub1_Sub7 local208 = local199.aClass2_Sub1_Sub7_1;
				if (local208.anIntArray140 != null) {
					local208 = local208.method939();
				}
				if (local208 != null && local208.aBoolean68 && local208.aBoolean66) {
					local60 = local199.anInt2724 / 32 - Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anInt2724 / 32;
					local18 = local199.anInt2717 / 32 - Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anInt2717 / 32;
					Static28.method737(local18, local60, Static54.aClass2_Sub1_Sub2_Sub4Array9[1]);
				}
			}
		}
		@Pc(266) Class2_Sub1_Sub1_Sub1_Sub1 local266;
		for (@Pc(258) int local258 = 0; local258 < Static99.anInt2521; local258++) {
			local266 = Static67.aClass2_Sub1_Sub1_Sub1_Sub1Array3[Static93.anIntArray292[local258]];
			if (local266 != null && local266.method1783()) {
				local60 = local266.anInt2724 / 32 - Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anInt2724 / 32;
				local18 = local266.anInt2717 / 32 - Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anInt2717 / 32;
				@Pc(296) boolean local296 = false;
				@Pc(301) long local301 = local266.aClass1_264.method9();
				for (@Pc(303) int local303 = 0; local303 < Static51.anInt1703; local303++) {
					if (local301 == Static98.aLongArray6[local303] && Static61.anIntArray197[local303] != 0) {
						local296 = true;
						break;
					}
				}
				@Pc(328) boolean local328 = false;
				if (Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anInt286 != 0 && local266.anInt286 != 0 && Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anInt286 == local266.anInt286) {
					local328 = true;
				}
				if (local296) {
					Static28.method737(local18, local60, Static54.aClass2_Sub1_Sub2_Sub4Array9[3]);
				} else if (local328) {
					Static28.method737(local18, local60, Static54.aClass2_Sub1_Sub2_Sub4Array9[4]);
				} else {
					Static28.method737(local18, local60, Static54.aClass2_Sub1_Sub2_Sub4Array9[2]);
				}
			}
		}
		if (Static2.anInt299 != 0 && Static69.anInt2806 % 20 < 10) {
			if (Static2.anInt299 == 1 && Static111.anInt2779 >= 0 && Static101.aClass2_Sub1_Sub1_Sub1_Sub2Array1.length > Static111.anInt2779) {
				@Pc(413) Class2_Sub1_Sub1_Sub1_Sub2 local413 = Static101.aClass2_Sub1_Sub1_Sub1_Sub2Array1[Static111.anInt2779];
				if (local413 != null) {
					local60 = local413.anInt2724 / 32 - Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anInt2724 / 32;
					local18 = local413.anInt2717 / 32 - Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anInt2717 / 32;
					Static29.method760(local60, Static20.aClass2_Sub1_Sub2_Sub4Array3[1], local18);
				}
			}
			if (Static2.anInt299 == 2) {
				local18 = (-Static47.anInt1563 + Static6.anInt406) * 4 + 2 - Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anInt2717 / 32;
				local60 = (Static113.anInt2243 - Static25.anInt1022) * 4 + 2 - Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anInt2724 / 32;
				Static29.method760(local60, Static20.aClass2_Sub1_Sub2_Sub4Array3[1], local18);
			}
			if (Static2.anInt299 == 10 && Static113.anInt2237 >= 0 && Static67.aClass2_Sub1_Sub1_Sub1_Sub1Array3.length > Static113.anInt2237) {
				local266 = Static67.aClass2_Sub1_Sub1_Sub1_Sub1Array3[Static113.anInt2237];
				if (local266 != null) {
					local18 = local266.anInt2717 / 32 - Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anInt2717 / 32;
					local60 = local266.anInt2724 / 32 - Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anInt2724 / 32;
					Static29.method760(local60, Static20.aClass2_Sub1_Sub2_Sub4Array3[1], local18);
				}
			}
		}
		if (Static30.anInt1133 != 0) {
			local60 = Static30.anInt1133 * 4 + 2 - Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anInt2724 / 32;
			local18 = Static90.anInt2337 * 4 + 2 - Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anInt2717 / 32;
			Static28.method737(local18, local60, Static20.aClass2_Sub1_Sub2_Sub4Array3[0]);
		}
		Static92.method1120(97, 78, 3, 3, 16777215);
		Static42.aClass2_Sub1_Sub2_Sub4_3.method1143(0, 0, 33, 33, 25, 25, Static94.anInt2376, 256, Static53.anIntArray180, Static53.anIntArray181);
		Static37.method936();
	}

	@OriginalMember(owner = "client!n", name = "c", descriptor = "(I)V")
	public static void method1344() {
		for (@Pc(15) Class2_Sub4 local15 = (Class2_Sub4) Static14.aClass46_3.method1435(); local15 != null; local15 = (Class2_Sub4) Static14.aClass46_3.method1442()) {
			if (local15.aClass2_Sub2_Sub2_1 != null) {
				Static82.aClass2_Sub2_Sub1_1.method239(local15.aClass2_Sub2_Sub2_1);
				local15.aClass2_Sub2_Sub2_1 = null;
			}
			if (local15.aClass2_Sub2_Sub2_2 != null) {
				Static82.aClass2_Sub2_Sub1_1.method239(local15.aClass2_Sub2_Sub2_2);
				local15.aClass2_Sub2_Sub2_2 = null;
			}
		}
		Static14.aClass46_3.method1439();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IZIIILclient!ia;)V")
	public static void method1345(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class2_Sub1_Sub10 arg4) {
		@Pc(7) Class2_Sub4 local7 = new Class2_Sub4();
		local7.anInt612 = arg4.anInt1480 * 128;
		local7.anInt613 = arg4.anInt1505;
		local7.anIntArray60 = arg4.anIntArray152;
		local7.anInt619 = arg4.anInt1478;
		@Pc(36) int local36 = arg4.anInt1481;
		@Pc(39) int local39 = arg4.anInt1491;
		local7.anInt606 = arg1;
		local7.anInt607 = arg3 * 128;
		if (arg2 == 1 || arg2 == 3) {
			local36 = arg4.anInt1491;
			local39 = arg4.anInt1481;
		}
		local7.anInt614 = arg0 * 128;
		local7.anInt617 = (local39 + arg0) * 128;
		local7.anInt620 = (arg3 + local36) * 128;
		local7.anInt609 = arg4.anInt1489;
		if (arg4.anIntArray154 != null) {
			local7.aClass2_Sub1_Sub10_1 = arg4;
			local7.method415();
		}
		Static14.aClass46_3.method1437(local7);
		if (local7.anIntArray60 != null) {
			local7.anInt621 = (int) ((double) (local7.anInt613 - local7.anInt619) * Math.random()) + local7.anInt619;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIB)Z")
	public static boolean method1346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0 && Static43.anInt1459 == arg1) {
			return true;
		} else if (arg0 == 1 && arg1 == Static46.anInt1555) {
			return true;
		} else {
			return (arg0 == 2 || arg0 == 3) && arg1 == Static112.anInt2796;
		}
	}
}
