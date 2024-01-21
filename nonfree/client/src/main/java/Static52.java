import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!jb", name = "B", descriptor = "[I")
	public static int[] anIntArray448;

	@OriginalMember(owner = "client!jb", name = "W", descriptor = "[I")
	public static int[] anIntArray449;

	@OriginalMember(owner = "client!jb", name = "D", descriptor = "Lclient!dd;")
	public static Class19 aClass19_110 = new Class19(64);

	@OriginalMember(owner = "client!jb", name = "N", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1819 = Static69.method1153("flash1:");

	@OriginalMember(owner = "client!jb", name = "I", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1817 = aClass64_1819;

	@OriginalMember(owner = "client!jb", name = "J", descriptor = "Lclient!be;")
	public static Class10 aClass10_33 = new Class10();

	@OriginalMember(owner = "client!jb", name = "K", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1818 = Static69.method1153(" ");

	@OriginalMember(owner = "client!jb", name = "L", descriptor = "Z")
	public static boolean aBoolean169 = false;

	@OriginalMember(owner = "client!jb", name = "M", descriptor = "I")
	public static int anInt2832 = 0;

	@OriginalMember(owner = "client!jb", name = "R", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1823 = Static69.method1153("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!jb", name = "O", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1820 = aClass64_1823;

	@OriginalMember(owner = "client!jb", name = "P", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1821 = aClass64_1818;

	@OriginalMember(owner = "client!jb", name = "Q", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1822 = Static69.method1153("@or2@");

	@OriginalMember(owner = "client!jb", name = "S", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1824 = Static69.method1153("chatback");

	@OriginalMember(owner = "client!jb", name = "T", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1825 = Static69.method1153("Choose Option");

	@OriginalMember(owner = "client!jb", name = "U", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1826 = Static69.method1153("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!jb", name = "V", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1827 = aClass64_1825;

	@OriginalMember(owner = "client!jb", name = "Y", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1829 = Static69.method1153("cyan:");

	@OriginalMember(owner = "client!jb", name = "X", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1828 = aClass64_1829;

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "(I)V")
	public static void method2078() {
		aClass64_1822 = null;
		anIntArray448 = null;
		aClass64_1823 = null;
		aClass64_1824 = null;
		aClass64_1817 = null;
		aClass64_1819 = null;
		aClass64_1821 = null;
		aClass64_1825 = null;
		aClass64_1827 = null;
		aClass19_110 = null;
		anIntArray449 = null;
		aClass64_1826 = null;
		aClass64_1829 = null;
		aClass64_1818 = null;
		aClass10_33 = null;
		aClass64_1820 = null;
		aClass64_1828 = null;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!pb;II)Lclient!oa;")
	public static Class1_Sub1_Sub5_Sub3 method2080(@OriginalArg(1) Class41 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Static100.method1613(arg1, arg2, arg0) ? Static80.method1366() : null;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIZ)Lclient!he;")
	public static Class1_Sub1_Sub5_Sub2 method2081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(20) long local20 = ((long) arg3 << 40) + ((long) arg2 << 38) + (long) arg0 + ((long) arg1 << 16);
		@Pc(32) Class1_Sub1_Sub5_Sub2 local32;
		if (!arg4) {
			local32 = (Class1_Sub1_Sub5_Sub2) Static94.aClass19_78.method410(local20);
			if (local32 != null) {
				return local32;
			}
		}
		@Pc(40) Class1_Sub1_Sub6 local40 = Static106.method1739(arg0);
		if (arg1 > 1 && local40.anIntArray145 != null) {
			@Pc(48) int local48 = -1;
			for (@Pc(50) int local50 = 0; local50 < 10; local50++) {
				if (arg1 >= local40.anIntArray144[local50] && local40.anIntArray144[local50] != 0) {
					local48 = local40.anIntArray145[local50];
				}
			}
			if (local48 != -1) {
				local40 = Static106.method1739(local48);
			}
		}
		@Pc(94) Class1_Sub1_Sub2_Sub7 local94 = local40.method724(1);
		if (local94 == null) {
			return null;
		}
		@Pc(100) Class1_Sub1_Sub5_Sub2 local100 = null;
		if (local40.anInt967 != -1) {
			local100 = method2081(local40.anInt975, 10, 1, 0, true);
			if (local100 == null) {
				return null;
			}
		}
		@Pc(120) int[] local120 = Static47.anIntArray424;
		@Pc(122) int local122 = Static47.anInt2712;
		@Pc(124) int local124 = Static47.anInt2713;
		@Pc(126) int local126 = Static47.anInt2709;
		@Pc(128) int local128 = Static47.anInt2708;
		@Pc(130) int local130 = Static47.anInt2711;
		@Pc(132) int local132 = Static47.anInt2710;
		@Pc(134) int[] local134 = Static112.method1966();
		@Pc(141) int local141 = Static112.anInt2721;
		@Pc(143) int local143 = Static112.anInt2717;
		local32 = new Class1_Sub1_Sub5_Sub2(36, 32);
		Static47.method1960(local32.anIntArray150, 36, 32);
		Static75.anIntArray252 = Static112.method1980(Static75.anIntArray252);
		Static47.method1957(0, 0, 36, 32, 0);
		Static112.aBoolean162 = false;
		Static112.method1969(16, 16);
		@Pc(171) int local171 = local40.anInt984;
		if (arg4) {
			local171 = (int) ((double) local171 * 1.5D);
		} else if (arg2 == 2) {
			local171 = (int) ((double) local171 * 1.04D);
		}
		@Pc(201) int local201 = Class1_Sub1_Sub5_Sub4.anIntArray427[local40.anInt995] * local171 >> 16;
		@Pc(210) int local210 = Class1_Sub1_Sub5_Sub4.anIntArray429[local40.anInt995] * local171 >> 16;
		local94.method1919();
		local94.method1932(local40.anInt971, local40.anInt979, local40.anInt995, local40.anInt994, local40.anInt972 + local201 + local94.anInt2678 / 2, local210 + local40.anInt972);
		if (arg2 >= 1) {
			local32.method775(1);
		}
		if (arg2 >= 2) {
			local32.method775(16777215);
		}
		if (arg3 != 0) {
			local32.method768(arg3);
		}
		Static47.method1960(local32.anIntArray150, 36, 32);
		if (local40.anInt967 != -1) {
			local100.method778(0, 0);
		}
		if (!arg4 && (local40.anInt957 == 1 || arg1 != 1) && arg1 != -1) {
			Static89.aClass1_Sub1_Sub5_Sub1_4.method661(Static1.method36(arg1), 1, 10, 1);
			Static89.aClass1_Sub1_Sub5_Sub1_4.method661(Static1.method36(arg1), 0, 9, 16776960);
		}
		if (!arg4) {
			Static94.aClass19_78.method409(local32, local20);
		}
		Static47.method1960(local120, local124, local122);
		Static47.method1951(local126, local132, local128, local130);
		Static112.method1980(local134);
		Static112.anInt2721 = local141;
		Static112.anInt2717 = local143;
		Static112.method1970();
		Static112.aBoolean162 = true;
		return local32;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)V")
	public static void method2082() {
		for (@Pc(7) int local7 = 0; local7 < Static39.anInt914; local7++) {
			@Pc(22) int local22 = Static96.anIntArray436[local7];
			@Pc(26) Class1_Sub1_Sub2_Sub1_Sub1 local26 = Static101.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local22];
			@Pc(30) int local30 = Static64.aClass1_Sub6_Sub1_2.method1837();
			if ((local30 & 0x10) != 0) {
				local26.anInt2364 = Static64.aClass1_Sub6_Sub1_2.method1832();
				local26.anInt2373 = Static64.aClass1_Sub6_Sub1_2.method1842();
			}
			if ((local30 & 0x4) != 0) {
				local26.anInt2372 = Static64.aClass1_Sub6_Sub1_2.method1842();
				if (local26.anInt2372 == 65535) {
					local26.anInt2372 = -1;
				}
			}
			@Pc(79) int local79;
			@Pc(88) int local88;
			if ((local30 & 0x40) != 0) {
				local79 = Static64.aClass1_Sub6_Sub1_2.method1850();
				if (local79 == 65535) {
					local79 = -1;
				}
				local88 = Static64.aClass1_Sub6_Sub1_2.method1826();
				if (local79 == local26.anInt2407 && local79 != -1) {
					@Pc(139) int local139 = Static10.method254(local79).anInt709;
					if (local139 == 1) {
						local26.anInt2359 = 0;
						local26.anInt2368 = local88;
						local26.anInt2357 = 0;
						local26.anInt2411 = 0;
					}
					if (local139 == 2) {
						local26.anInt2359 = 0;
					}
				} else if (local79 == -1 || local26.anInt2407 == -1 || Static10.method254(local79).anInt715 >= Static10.method254(local26.anInt2407).anInt715) {
					local26.anInt2357 = 0;
					local26.anInt2407 = local79;
					local26.anInt2368 = local88;
					local26.anInt2400 = local26.anInt2410;
					local26.anInt2359 = 0;
					local26.anInt2411 = 0;
				}
			}
			if ((local30 & 0x8) != 0) {
				local79 = Static64.aClass1_Sub6_Sub1_2.method1841();
				local88 = Static64.aClass1_Sub6_Sub1_2.method1826();
				local26.method1686(Static15.anInt471, local88, local79);
				local26.anInt2399 = Static15.anInt471 + 300;
				local26.anInt2392 = Static64.aClass1_Sub6_Sub1_2.method1837();
				local26.anInt2376 = Static64.aClass1_Sub6_Sub1_2.method1841();
			}
			if ((local30 & 0x80) != 0) {
				local26.anInt2382 = Static64.aClass1_Sub6_Sub1_2.method1855();
				local79 = Static64.aClass1_Sub6_Sub1_2.method1845();
				local26.anInt2402 = 0;
				if (local26.anInt2382 == 65535) {
					local26.anInt2382 = -1;
				}
				local26.anInt2379 = 0;
				local26.anInt2369 = Static15.anInt471 + (local79 & 0xFFFF);
				local26.anInt2391 = local79 >> 16;
				if (local26.anInt2369 > Static15.anInt471) {
					local26.anInt2402 = -1;
				}
			}
			if ((local30 & 0x20) != 0) {
				local26.aClass64_1528 = Static64.aClass1_Sub6_Sub1_2.method1831();
				local26.anInt2405 = 100;
			}
			if ((local30 & 0x1) != 0) {
				local26.aClass1_Sub1_Sub15_1 = Static42.method697(Static64.aClass1_Sub6_Sub1_2.method1842());
				local26.anInt2360 = local26.aClass1_Sub1_Sub15_1.anInt2308;
				local26.anInt2398 = local26.aClass1_Sub1_Sub15_1.anInt2305;
				local26.anInt2401 = local26.aClass1_Sub1_Sub15_1.anInt2303;
				local26.anInt2395 = local26.aClass1_Sub1_Sub15_1.anInt2313;
				local26.anInt2413 = local26.aClass1_Sub1_Sub15_1.anInt2319;
				local26.anInt2361 = local26.aClass1_Sub1_Sub15_1.anInt2301;
				local26.anInt2378 = local26.aClass1_Sub1_Sub15_1.anInt2314;
				local26.anInt2390 = local26.aClass1_Sub1_Sub15_1.anInt2293;
				local26.anInt2383 = local26.aClass1_Sub1_Sub15_1.anInt2310;
			}
			if ((local30 & 0x2) != 0) {
				local79 = Static64.aClass1_Sub6_Sub1_2.method1826();
				local88 = Static64.aClass1_Sub6_Sub1_2.method1857();
				local26.method1686(Static15.anInt471, local88, local79);
				local26.anInt2399 = Static15.anInt471 + 300;
				local26.anInt2392 = Static64.aClass1_Sub6_Sub1_2.method1857();
				local26.anInt2376 = Static64.aClass1_Sub6_Sub1_2.method1837();
			}
		}
	}
}
