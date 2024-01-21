import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ae", name = "hb", descriptor = "I")
	public static int anInt342;

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "Lclient!bd;")
	public static Class9 aClass9_5 = new Class9(64);

	@OriginalMember(owner = "client!ae", name = "z", descriptor = "I")
	public static int anInt316 = 0;

	@OriginalMember(owner = "client!ae", name = "G", descriptor = "I")
	public static int anInt323 = -1;

	@OriginalMember(owner = "client!ae", name = "N", descriptor = "Z")
	public static boolean aBoolean13 = true;

	@OriginalMember(owner = "client!ae", name = "bb", descriptor = "Lclient!ae;")
	private static Class5 aClass5_102 = Static56.method972("Unexpected server response");

	@OriginalMember(owner = "client!ae", name = "Z", descriptor = "Lclient!ae;")
	public static Class5 aClass5_101 = aClass5_102;

	@OriginalMember(owner = "client!ae", name = "db", descriptor = "Lclient!sb;")
	public static Class3_Sub6_Sub1 aClass3_Sub6_Sub1_1 = new Class3_Sub6_Sub1(5000);

	@OriginalMember(owner = "client!ae", name = "eb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_103 = Static56.method972("@cya@");

	@OriginalMember(owner = "client!ae", name = "fb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_104 = Static56.method972("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!ae", name = "gb", descriptor = "[I")
	public static int[] anIntArray36 = new int[4000];

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILclient!ae;ILclient!ae;BII)V")
	public static void method129(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class5 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static75.anInt1934 >= 500) {
			return;
		}
		if (arg3.method144() <= 0) {
			Static49.aClass5Array9[Static75.anInt1934] = arg1;
		} else {
			Static49.aClass5Array9[Static75.anInt1934] = Static75.method1261(new Class5[] { arg1, Static91.aClass5_1066, arg3 });
		}
		Static52.anIntArray162[Static75.anInt1934] = arg5;
		Static12.anIntArray57[Static75.anInt1934] = arg4;
		Static13.anIntArray61[Static75.anInt1934] = arg0;
		Static70.anIntArray207[Static75.anInt1934] = arg2;
		Static75.anInt1934++;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILclient!ae;)Z")
	public static boolean method134(@OriginalArg(1) Class5 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static5.anInt346; local16++) {
			if (arg0.method171(Static34.aClass5Array8[local16])) {
				return true;
			}
		}
		return arg0.method171(Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.aClass5_765);
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V")
	public static void method136() {
		if (Static14.aBooleanArray25[98]) {
			Static62.anInt1666 += (12 - Static62.anInt1666) / 2;
		} else if (Static14.aBooleanArray25[99]) {
			Static62.anInt1666 += (-Static62.anInt1666 - 12) / 2;
		} else {
			Static62.anInt1666 /= 2;
		}
		if (Static14.aBooleanArray25[96]) {
			Static54.anInt1419 += (-Static54.anInt1419 - 24) / 2;
		} else if (Static14.aBooleanArray25[97]) {
			Static54.anInt1419 += (24 - Static54.anInt1419) / 2;
		} else {
			Static54.anInt1419 /= 2;
		}
		Static51.anInt2380 = Static54.anInt1419 / 2 + Static51.anInt2380 & 0x7FF;
		Static18.anInt629 += Static62.anInt1666 / 2;
		if (Static18.anInt629 < 128) {
			Static18.anInt629 = 128;
		}
		if (Static18.anInt629 > 383) {
			Static18.anInt629 = 383;
		}
		@Pc(105) int local105 = Static21.anInt702 + Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt1567;
		@Pc(110) int local110 = Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt1543 + Static65.anInt2433;
		if (Static62.anInt1663 - local105 < -500 || Static62.anInt1663 - local105 > 500 || Static85.anInt2107 - local110 < -500 || Static85.anInt2107 - local110 > 500) {
			Static62.anInt1663 = local105;
			Static85.anInt2107 = local110;
		}
		if (Static62.anInt1663 != local105) {
			Static62.anInt1663 += (local105 - Static62.anInt1663) / 16;
		}
		if (local110 != Static85.anInt2107) {
			Static85.anInt2107 += (local110 - Static85.anInt2107) / 16;
		}
		@Pc(172) int local172 = Static62.anInt1663 >> 7;
		@Pc(176) int local176 = Static85.anInt2107 >> 7;
		@Pc(182) int local182 = Static15.method358(Static85.anInt2107, Static12.anInt480, Static62.anInt1663);
		@Pc(184) int local184 = 0;
		@Pc(206) int local206;
		if (local172 > 3 && local176 > 3 && local172 < 100 && local176 < 100) {
			for (local206 = local172 - 4; local206 <= local172 + 4; local206++) {
				for (@Pc(211) int local211 = local176 - 4; local211 <= local176 + 4; local211++) {
					@Pc(214) int local214 = Static12.anInt480;
					if (local214 < 3 && (Static93.aByteArrayArrayArray5[1][local206][local211] & 0x2) == 2) {
						local214++;
					}
					@Pc(244) int local244 = local182 - Static111.anIntArrayArrayArray7[local214][local206][local211];
					if (local184 < local244) {
						local184 = local244;
					}
				}
			}
		}
		local206 = local184 * 192;
		if (local206 > 98048) {
			local206 = 98048;
		}
		if (local206 < 32768) {
			local206 = 32768;
		}
		if (local206 > Static9.anInt420) {
			Static9.anInt420 += (local206 - Static9.anInt420) / 24;
		} else if (local206 < Static9.anInt420) {
			Static9.anInt420 += (local206 - Static9.anInt420) / 80;
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)V")
	public static void method138() {
		aClass5_101 = null;
		aClass5_104 = null;
		aClass5_102 = null;
		aClass3_Sub6_Sub1_1 = null;
		aClass9_5 = null;
		anIntArray36 = null;
		aClass5_103 = null;
	}

	@OriginalMember(owner = "client!ae", name = "j", descriptor = "(I)V")
	public static void method162() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german]");
		System.exit(1);
	}

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "(B)V")
	public static void method165() {
		for (@Pc(12) int local12 = 0; local12 < Static115.anInt2977; local12++) {
			@Pc(18) int local18 = Static36.anIntArray320[local12];
			@Pc(22) Class3_Sub1_Sub1_Sub1_Sub1 local22 = Static42.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local18];
			if (local22 != null) {
				Static27.method543(local22, local22.aClass3_Sub1_Sub13_1.anInt2203);
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "l", descriptor = "(I)V")
	public static void method169() {
		if (Static46.anInt1278 != 0) {
			return;
		}
		Static75.anInt1934 = 1;
		Static52.anIntArray162[0] = 1002;
		Static49.aClass5Array9[0] = Static57.aClass5_769;
		if (Static63.anInt2924 != -1) {
			Static81.anInt2005 = -1;
			Static34.anInt974 = -1;
			Static35.method686(0, Static100.anInt2512, Static49.anInt1325, 0, 0, Static63.anInt2924, 765, 503);
			Static85.anInt2099 = Static81.anInt2005;
			Static44.anInt1247 = Static34.anInt974;
			return;
		}
		Static22.method449();
		Static34.anInt974 = -1;
		Static81.anInt2005 = -1;
		if (Static100.anInt2512 > 4 && Static49.anInt1325 > 4 && Static100.anInt2512 < 516 && Static49.anInt1325 < 338) {
			if (Static89.anInt2288 == -1) {
				Static114.method1953();
			} else {
				Static35.method686(4, Static100.anInt2512, Static49.anInt1325, 4, 0, Static89.anInt2288, 516, 338);
			}
		}
		Static44.anInt1247 = Static34.anInt974;
		Static85.anInt2099 = Static81.anInt2005;
		Static34.anInt974 = -1;
		Static81.anInt2005 = -1;
		@Pc(96) boolean local96 = false;
		if (Static100.anInt2512 > 553 && Static49.anInt1325 > 205 && Static100.anInt2512 < 743 && Static49.anInt1325 < 466) {
			if (Static106.anInt2736 != -1) {
				Static35.method686(553, Static100.anInt2512, Static49.anInt1325, 205, 1, Static106.anInt2736, 743, 466);
			} else if (Static88.anIntArray255[Static60.anInt2979] != -1) {
				Static35.method686(553, Static100.anInt2512, Static49.anInt1325, 205, 1, Static88.anIntArray255[Static60.anInt2979], 743, 466);
			}
		}
		if (Static13.anInt486 != Static81.anInt2005) {
			Static116.aBoolean157 = true;
			Static13.anInt486 = Static81.anInt2005;
		}
		Static81.anInt2005 = -1;
		if (Static34.anInt974 != Static85.anInt2114) {
			Static85.anInt2114 = Static34.anInt974;
			Static116.aBoolean157 = true;
		}
		Static34.anInt974 = -1;
		if (Static100.anInt2512 > 17 && Static49.anInt1325 > 357 && Static100.anInt2512 < 496 && Static49.anInt1325 < 453) {
			if (Static88.anInt2255 != -1) {
				Static35.method686(17, Static100.anInt2512, Static49.anInt1325, 357, 2, Static88.anInt2255, 496, 453);
			} else if (Static100.anInt2515 != -1) {
				Static35.method686(17, Static100.anInt2512, Static49.anInt1325, 357, 3, Static100.anInt2515, 496, 453);
			} else if (Static49.anInt1325 < 434 && Static100.anInt2512 < 426) {
				Static19.method428(Static49.anInt1325 - 357, Static100.anInt2512 + -17);
			}
		}
		if ((Static88.anInt2255 != -1 || Static100.anInt2515 != -1) && Static102.anInt2639 != Static81.anInt2005) {
			Static102.anInt2639 = Static81.anInt2005;
			Static15.aBoolean22 = true;
		}
		if ((Static88.anInt2255 != -1 || Static100.anInt2515 != -1) && Static34.anInt974 != Static101.anInt2550) {
			Static15.aBoolean22 = true;
			Static101.anInt2550 = Static34.anInt974;
		}
		while (!local96) {
			local96 = true;
			for (@Pc(274) int local274 = 0; local274 < Static75.anInt1934 - 1; local274++) {
				if (Static52.anIntArray162[local274] < 1000 && Static52.anIntArray162[local274 + 1] > 1000) {
					local96 = false;
					@Pc(294) Class5 local294 = Static49.aClass5Array9[local274];
					Static49.aClass5Array9[local274] = Static49.aClass5Array9[local274 + 1];
					Static49.aClass5Array9[local274 + 1] = local294;
					@Pc(312) int local312 = Static52.anIntArray162[local274];
					Static52.anIntArray162[local274] = Static52.anIntArray162[local274 + 1];
					Static52.anIntArray162[local274 + 1] = local312;
					@Pc(330) int local330 = Static13.anIntArray61[local274];
					Static13.anIntArray61[local274] = Static13.anIntArray61[local274 + 1];
					Static13.anIntArray61[local274 + 1] = local330;
					@Pc(348) int local348 = Static70.anIntArray207[local274];
					Static70.anIntArray207[local274] = Static70.anIntArray207[local274 + 1];
					Static70.anIntArray207[local274 + 1] = local348;
					@Pc(366) int local366 = Static12.anIntArray57[local274];
					Static12.anIntArray57[local274] = Static12.anIntArray57[local274 + 1];
					Static12.anIntArray57[local274 + 1] = local366;
				}
			}
		}
	}
}
