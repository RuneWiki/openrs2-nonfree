import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!nc", name = "yb", descriptor = "Lclient!ac;")
	public static Class3 aClass3_17;

	@OriginalMember(owner = "client!nc", name = "xb", descriptor = "Lclient!kc;")
	private static Class36 aClass36_858 = Static14.method2017(" has logged in)3");

	@OriginalMember(owner = "client!nc", name = "pb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_855 = aClass36_858;

	@OriginalMember(owner = "client!nc", name = "rb", descriptor = "Lclient!kc;")
	private static Class36 aClass36_856 = Static14.method2017("red:");

	@OriginalMember(owner = "client!nc", name = "tb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_857 = aClass36_856;

	@OriginalMember(owner = "client!nc", name = "wb", descriptor = "I")
	public static int anInt1750 = 0;

	@OriginalMember(owner = "client!nc", name = "zb", descriptor = "I")
	public static int anInt1751 = 0;

	@OriginalMember(owner = "client!nc", name = "Ab", descriptor = "Lclient!kc;")
	public static Class36 aClass36_859 = Static14.method2017("Registrierter Benutzer");

	@OriginalMember(owner = "client!nc", name = "Bb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_860 = Static14.method2017("RuneScape wurde aktualisiert(Q");

	@OriginalMember(owner = "client!nc", name = "Db", descriptor = "Lclient!kc;")
	public static Class36 aClass36_861 = Static14.method2017("(U(Y");

	@OriginalMember(owner = "client!nc", name = "Eb", descriptor = "Z")
	public static boolean aBoolean76 = false;

	@OriginalMember(owner = "client!nc", name = "Gb", descriptor = "I")
	public static int anInt1754 = 0;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) Class2_Sub8 local11 = null;
		for (@Pc(16) Class2_Sub8 local16 = (Class2_Sub8) Static39.aClass8_2.method175(); local16 != null; local16 = (Class2_Sub8) Static39.aClass8_2.method173()) {
			if (local16.anInt1124 == arg1 && local16.anInt1109 == arg5 && arg3 == local16.anInt1114 && local16.anInt1117 == arg0) {
				local11 = local16;
				break;
			}
		}
		if (local11 == null) {
			local11 = new Class2_Sub8();
			local11.anInt1109 = arg5;
			local11.anInt1124 = arg1;
			local11.anInt1117 = arg0;
			local11.anInt1114 = arg3;
			Static62.method1118(local11);
			Static39.aClass8_2.method187(local11);
		}
		local11.anInt1113 = arg7;
		local11.anInt1110 = arg6;
		local11.anInt1119 = arg8;
		local11.anInt1118 = arg2;
		local11.anInt1108 = arg4;
	}

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "(I)V")
	public static void method1198() {
		aClass36_858 = null;
		aClass36_856 = null;
		aClass36_857 = null;
		aClass3_17 = null;
		aClass36_861 = null;
		aClass36_855 = null;
		aClass36_860 = null;
		aClass36_859 = null;
	}

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "(I)V")
	public static void method1199() {
		if (Static60.anInt1597 != 0) {
			return;
		}
		Static90.aClass36Array40[0] = Static77.aClass36_941;
		Static43.anInt1141 = 1;
		Static55.anIntArray329[0] = 1006;
		if (Static46.anInt1229 != -1) {
			Static91.anInt2365 = -1;
			Static57.anInt1494 = -1;
			Static73.method1290(Static46.anInt1229, 765, 0, 503, 0, 0, Static115.anInt1789, Static64.anInt1640);
			Static95.anInt2530 = Static91.anInt2365;
			Static16.anInt351 = Static57.anInt1494;
			return;
		}
		@Pc(45) boolean local45 = false;
		Static58.method1079();
		Static91.anInt2365 = -1;
		Static57.anInt1494 = -1;
		if (Static115.anInt1789 > 4 && Static64.anInt1640 > 4 && Static115.anInt1789 < 516 && Static64.anInt1640 < 338) {
			if (Static78.anInt2037 == -1) {
				Static29.method629();
			} else {
				Static73.method1290(Static78.anInt2037, 516, 0, 338, 4, 4, Static115.anInt1789, Static64.anInt1640);
			}
		}
		Static16.anInt351 = Static57.anInt1494;
		Static57.anInt1494 = -1;
		Static95.anInt2530 = Static91.anInt2365;
		Static91.anInt2365 = -1;
		if (Static115.anInt1789 > 553 && Static64.anInt1640 > 205 && Static115.anInt1789 < 743 && Static64.anInt1640 < 466) {
			if (Static94.anInt2471 != -1) {
				Static73.method1290(Static94.anInt2471, 743, 1, 466, 205, 553, Static115.anInt1789, Static64.anInt1640);
			} else if (Static101.anIntArray323[Static109.anInt2825] != -1) {
				Static73.method1290(Static101.anIntArray323[Static109.anInt2825], 743, 1, 466, 205, 553, Static115.anInt1789, Static64.anInt1640);
			}
		}
		if (Static4.anInt128 != Static57.anInt1494) {
			Static4.anInt128 = Static57.anInt1494;
			Static100.aBoolean118 = true;
		}
		if (Static58.anInt1526 != Static91.anInt2365) {
			Static100.aBoolean118 = true;
			Static58.anInt1526 = Static91.anInt2365;
		}
		Static91.anInt2365 = -1;
		Static57.anInt1494 = -1;
		if (Static115.anInt1789 > 17 && Static64.anInt1640 > 357 && Static115.anInt1789 < 496 && Static64.anInt1640 < 453) {
			if (Static49.anInt1312 != -1) {
				Static73.method1290(Static49.anInt1312, 496, 2, 453, 357, 17, Static115.anInt1789, Static64.anInt1640);
			} else if (Static39.anInt980 != -1) {
				Static73.method1290(Static39.anInt980, 496, 3, 453, 357, 17, Static115.anInt1789, Static64.anInt1640);
			} else if (Static64.anInt1640 < 434 && Static115.anInt1789 < 426) {
				Static90.method1645(Static115.anInt1789 - 17, Static64.anInt1640 + -357);
			}
		}
		if ((Static49.anInt1312 != -1 || Static39.anInt980 != -1) && Static34.anInt914 != Static57.anInt1494) {
			Static34.anInt914 = Static57.anInt1494;
			Static115.aBoolean77 = true;
		}
		if ((Static49.anInt1312 != -1 || Static39.anInt980 != -1) && Static117.anInt1947 != Static91.anInt2365) {
			Static117.anInt1947 = Static91.anInt2365;
			Static115.aBoolean77 = true;
		}
		while (!local45) {
			local45 = true;
			for (@Pc(271) int local271 = 0; local271 < Static43.anInt1141 - 1; local271++) {
				if (Static55.anIntArray329[local271] < 1000 && Static55.anIntArray329[local271 + 1] > 1000) {
					@Pc(293) Class36 local293 = Static90.aClass36Array40[local271];
					Static90.aClass36Array40[local271] = Static90.aClass36Array40[local271 + 1];
					local45 = false;
					Static90.aClass36Array40[local271 + 1] = local293;
					@Pc(313) int local313 = Static55.anIntArray329[local271];
					Static55.anIntArray329[local271] = Static55.anIntArray329[local271 + 1];
					Static55.anIntArray329[local271 + 1] = local313;
					@Pc(331) int local331 = Static57.anIntArray187[local271];
					Static57.anIntArray187[local271] = Static57.anIntArray187[local271 + 1];
					Static57.anIntArray187[local271 + 1] = local331;
					@Pc(349) int local349 = Static51.anIntArray317[local271];
					Static51.anIntArray317[local271] = Static51.anIntArray317[local271 + 1];
					Static51.anIntArray317[local271 + 1] = local349;
					@Pc(367) int local367 = Static22.anIntArray38[local271];
					Static22.anIntArray38[local271] = Static22.anIntArray38[local271 + 1];
					Static22.anIntArray38[local271 + 1] = local367;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BLclient!ac;)V")
	public static void method1200(@OriginalArg(1) Class3 arg0) {
		Static42.aClass3_9 = arg0;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)Z")
	public static boolean method1201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		@Pc(26) Class2_Sub1_Sub13 local26 = Static2.method2072(arg1);
		return local26.method1632(arg0);
	}
}
