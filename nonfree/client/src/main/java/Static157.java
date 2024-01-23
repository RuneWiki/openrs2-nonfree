import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!lf", name = "bb", descriptor = "I")
	public static int anInt3123;

	@OriginalMember(owner = "client!lf", name = "U", descriptor = "S")
	public static short aShort18 = 1;

	@OriginalMember(owner = "client!lf", name = "X", descriptor = "Lclient!cc;")
	public static Class26 aClass26_29 = new Class26(64);

	@OriginalMember(owner = "client!lf", name = "ab", descriptor = "[I")
	public static int[] anIntArray293 = new int[200];

	@OriginalMember(owner = "client!lf", name = "cb", descriptor = "[C")
	public static char[] aCharArray1 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!lf", name = "db", descriptor = "[I")
	public static int[] anIntArray294 = new int[50];

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIII)Lclient!jl;")
	public static Class4_Sub3_Sub13 method2548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = arg1 << 8 | arg0;
		@Pc(18) Class4_Sub3_Sub13 local18 = (Class4_Sub3_Sub13) Static207.aClass40_13.method889((long) local9 << 16);
		if (local18 != null) {
			return local18;
		}
		@Pc(30) byte[] local30 = Static165.aClass58_73.method1343(Static165.aClass58_73.method1367(local9));
		if (local30 == null) {
			local9 = arg0 | arg2 + 65536 << 8;
			local18 = (Class4_Sub3_Sub13) Static207.aClass40_13.method889((long) local9 << 16);
			if (local18 != null) {
				return local18;
			}
			local30 = Static165.aClass58_73.method1343(Static165.aClass58_73.method1367(local9));
			if (local30 == null) {
				local9 = arg0 | 0xFFFF00;
				local18 = (Class4_Sub3_Sub13) Static207.aClass40_13.method889((long) local9 << 16);
				if (local18 != null) {
					return local18;
				}
				local30 = Static165.aClass58_73.method1343(Static165.aClass58_73.method1367(local9));
				if (local30 == null) {
					return null;
				} else if (local30.length > 1) {
					local18 = Static203.method3260(local30);
					local18.anInt2656 = arg0;
					Static207.aClass40_13.method888((long) local9 << 16, local18);
					return local18;
				} else {
					return null;
				}
			} else if (local30.length <= 1) {
				return null;
			} else {
				local18 = Static203.method3260(local30);
				local18.anInt2656 = arg0;
				Static207.aClass40_13.method888((long) local9 << 16, local18);
				return local18;
			}
		} else if (local30.length <= 1) {
			return null;
		} else {
			local18 = Static203.method3260(local30);
			local18.anInt2656 = arg0;
			Static207.aClass40_13.method888((long) local9 << 16, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(IIIIII)V")
	public static void method2549(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static127.anInt2497 = arg3;
		Static190.anInt3572 = arg0;
		Static11.anInt212 = arg4;
		Static253.anInt4839 = arg1;
		Static169.anInt3302 = arg2;
		if (Static11.anInt212 >= 100) {
			@Pc(31) int local31 = Static169.anInt3302 * 128 + 64;
			@Pc(37) int local37 = Static127.anInt2497 * 128 + 64;
			@Pc(46) int local46 = Static33.method522(local37, local31, Static281.anInt5335) - Static190.anInt3572;
			@Pc(50) int local50 = local31 - Static129.anInt2519;
			@Pc(55) int local55 = local46 - Static82.anInt1931;
			@Pc(60) int local60 = local37 - Static302.anInt5682;
			@Pc(71) int local71 = (int) Math.sqrt((double) (local60 * local60 + local50 * local50));
			Static207.anInt4066 = (int) (Math.atan2((double) local55, (double) local71) * 325.949D) & 0x7FF;
			Static193.anInt3656 = (int) (Math.atan2((double) local50, (double) local60) * -325.949D) & 0x7FF;
			if (Static207.anInt4066 < 128) {
				Static207.anInt4066 = 128;
			}
			if (Static207.anInt4066 > 383) {
				Static207.anInt4066 = 383;
			}
		}
		Static41.anInt772 = 2;
	}

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "(I)V")
	public static void method2550() {
		@Pc(9) int local9 = Static151.anInt2977 * 128 + 64;
		@Pc(15) int local15 = Static212.anInt4165 * 128 + 64;
		@Pc(24) int local24 = Static33.method522(local15, local9, Static281.anInt5335) - Static160.anInt3131;
		if (Static183.anInt3490 >= 100) {
			Static302.anInt5682 = Static212.anInt4165 * 128 + 64;
			Static129.anInt2519 = Static151.anInt2977 * 128 + 64;
			Static82.anInt1931 = Static33.method522(Static302.anInt5682, Static129.anInt2519, Static281.anInt5335) - Static160.anInt3131;
		} else {
			if (Static302.anInt5682 < local15) {
				Static302.anInt5682 += Static276.anInt5237 + (local15 - Static302.anInt5682) * Static183.anInt3490 / 1000;
				if (Static302.anInt5682 > local15) {
					Static302.anInt5682 = local15;
				}
			}
			if (local9 > Static129.anInt2519) {
				Static129.anInt2519 += (local9 - Static129.anInt2519) * Static183.anInt3490 / 1000 + Static276.anInt5237;
				if (local9 < Static129.anInt2519) {
					Static129.anInt2519 = local9;
				}
			}
			if (Static129.anInt2519 > local9) {
				Static129.anInt2519 -= (Static129.anInt2519 - local9) * Static183.anInt3490 / 1000 + Static276.anInt5237;
				if (Static129.anInt2519 < local9) {
					Static129.anInt2519 = local9;
				}
			}
			if (Static82.anInt1931 < local24) {
				Static82.anInt1931 += (local24 - Static82.anInt1931) * Static183.anInt3490 / 1000 + Static276.anInt5237;
				if (Static82.anInt1931 > local24) {
					Static82.anInt1931 = local24;
				}
			}
			if (local15 < Static302.anInt5682) {
				Static302.anInt5682 -= (Static302.anInt5682 - local15) * Static183.anInt3490 / 1000 + Static276.anInt5237;
				if (Static302.anInt5682 < local15) {
					Static302.anInt5682 = local15;
				}
			}
			if (local24 < Static82.anInt1931) {
				Static82.anInt1931 -= (Static82.anInt1931 - local24) * Static183.anInt3490 / 1000 + Static276.anInt5237;
				if (Static82.anInt1931 < local24) {
					Static82.anInt1931 = local24;
				}
			}
		}
		local15 = Static127.anInt2497 * 128 + 64;
		local9 = Static169.anInt3302 * 128 + 64;
		local24 = Static33.method522(local15, local9, Static281.anInt5335) - Static190.anInt3572;
		@Pc(245) int local245 = local15 - Static302.anInt5682;
		@Pc(250) int local250 = local24 - Static82.anInt1931;
		@Pc(255) int local255 = local9 - Static129.anInt2519;
		@Pc(266) int local266 = (int) Math.sqrt((double) (local245 * local245 + local255 * local255));
		@Pc(277) int local277 = (int) (Math.atan2((double) local250, (double) local266) * 325.949D) & 0x7FF;
		if (local277 < 128) {
			local277 = 128;
		}
		if (local277 > 383) {
			local277 = 383;
		}
		@Pc(300) int local300 = (int) (-325.949D * Math.atan2((double) local255, (double) local245)) & 0x7FF;
		if (local277 > Static207.anInt4066) {
			Static207.anInt4066 += (local277 - Static207.anInt4066) * Static11.anInt212 / 1000 + Static253.anInt4839;
			if (Static207.anInt4066 > local277) {
				Static207.anInt4066 = local277;
			}
		}
		if (Static207.anInt4066 > local277) {
			Static207.anInt4066 -= Static253.anInt4839 + (Static207.anInt4066 - local277) * Static11.anInt212 / 1000;
			if (Static207.anInt4066 < local277) {
				Static207.anInt4066 = local277;
			}
		}
		@Pc(357) int local357 = local300 - Static193.anInt3656;
		if (local357 > 1024) {
			local357 -= 2048;
		}
		if (local357 < -1024) {
			local357 += 2048;
		}
		if (local357 > 0) {
			Static193.anInt3656 += Static11.anInt212 * local357 / 1000 + Static253.anInt4839;
			Static193.anInt3656 &= 0x7FF;
		}
		if (local357 < 0) {
			Static193.anInt3656 -= Static253.anInt4839 + Static11.anInt212 * -local357 / 1000;
			Static193.anInt3656 &= 0x7FF;
		}
		@Pc(414) int local414 = local300 - Static193.anInt3656;
		if (local414 > 1024) {
			local414 -= 2048;
		}
		if (local414 < -1024) {
			local414 += 2048;
		}
		if (local414 < 0 && local357 > 0 || local414 > 0 && local357 < 0) {
			Static193.anInt3656 = local300;
		}
	}
}
