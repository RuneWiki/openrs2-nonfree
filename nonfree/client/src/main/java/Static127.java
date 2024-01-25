import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!efa", name = "s", descriptor = "I")
	public static int anInt1400;

	@OriginalMember(owner = "client!efa", name = "t", descriptor = "I")
	public static int anInt1401;

	@OriginalMember(owner = "client!efa", name = "k", descriptor = "[I")
	public static final int[] anIntArray79 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!efa", name = "o", descriptor = "Lclient!iga;")
	public static final Class159 aClass159_4 = new Class159(1, 19);

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(Lclient!ha;IILclient!sda;Lclient!hv;I)Z")
	public static boolean method1292(@OriginalArg(0) Class132 arg0, @OriginalArg(3) Class318 arg1, @OriginalArg(4) Class6_Sub24 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(14) int local14 = Integer.MIN_VALUE;
		@Pc(16) int local16 = Integer.MAX_VALUE;
		@Pc(18) int local18 = Integer.MIN_VALUE;
		if (arg1.anIntArray587 != null) {
			local7 = (Static528.anInt5368 - Static528.anInt5365) * (arg2.anInt3903 + arg1.anInt8698 - Static528.anInt5367) / (Static528.anInt5359 - Static528.anInt5367) + Static528.anInt5365;
			local14 = (arg1.anInt8707 + arg2.anInt3903 - Static528.anInt5367) * (Static528.anInt5368 - Static528.anInt5365) / (Static528.anInt5359 - Static528.anInt5367) + Static528.anInt5365;
			local16 = Static528.anInt5363 - (arg2.anInt3910 + arg1.anInt8724 - Static528.anInt5370) * (Static528.anInt5363 - Static528.anInt5360) / (Static528.anInt5362 - Static528.anInt5370);
			local18 = Static528.anInt5363 - (arg1.anInt8695 + arg2.anInt3910 - Static528.anInt5370) * (-Static528.anInt5360 + Static528.anInt5363) / (Static528.anInt5362 - Static528.anInt5370);
		}
		@Pc(105) Class9 local105 = null;
		@Pc(107) int local107 = 0;
		@Pc(109) int local109 = 0;
		@Pc(111) int local111 = 0;
		@Pc(113) int local113 = 0;
		if (arg1.anInt8722 != -1) {
			if (arg2.aBoolean235 && arg1.anInt8719 != -1) {
				local105 = arg1.method7385(arg0, true);
			} else {
				local105 = arg1.method7385(arg0, false);
			}
			if (local105 != null) {
				local107 = arg2.anInt3904 - (local105.method8937() + 1 >> 1);
				local109 = arg2.anInt3904 + (local105.method8937() + 1 >> 1);
				if (local107 < local7) {
					local7 = local107;
				}
				local111 = arg2.anInt3907 - (local105.method8930() + 1 >> 1);
				if (local14 < local109) {
					local14 = local109;
				}
				local113 = arg2.anInt3907 + (local105.method8930() + 1 >> 1);
				if (local111 < local16) {
					local16 = local111;
				}
				if (local113 > local18) {
					local18 = local113;
				}
			}
		}
		@Pc(210) Class81 local210 = null;
		@Pc(212) int local212 = 0;
		@Pc(214) int local214 = 0;
		@Pc(216) int local216 = 0;
		@Pc(218) int local218 = 0;
		@Pc(220) int local220 = 0;
		@Pc(222) int local222 = 0;
		@Pc(224) int local224 = 0;
		@Pc(226) int local226 = 0;
		@Pc(305) int local305;
		if (arg1.aString120 != null) {
			local210 = Static221.method3202(arg1.anInt8720);
			if (local210 != null) {
				local212 = Static393.aClass151_10.method3325((Class9[]) null, Static674.aStringArray62, arg1.aString120, (int[]) null);
				local214 = arg2.anInt3904 + arg1.anInt8696 * (Static528.anInt5368 - Static528.anInt5365) / (Static528.anInt5359 - Static528.anInt5367);
				local216 = arg2.anInt3907 - arg1.anInt8705 * (Static528.anInt5363 - Static528.anInt5360) / (Static528.anInt5362 - Static528.anInt5370);
				if (local105 == null) {
					local216 -= local212 * local210.method1911() / 2;
				} else {
					local216 -= (local105.method8930() >> 1) + local212 * local210.method1908();
				}
				for (local305 = 0; local305 < local212; local305++) {
					@Pc(311) String local311 = Static674.aStringArray62[local305];
					if (local212 - 1 > local305) {
						local311 = local311.substring(0, local311.length() - 4);
					}
					@Pc(328) int local328 = local210.method1910(local311);
					if (local328 > local218) {
						local218 = local328;
					}
				}
				local220 = local214 - local218 / 2;
				local222 = local214 + local218 / 2;
				if (local7 > local220) {
					local7 = local220;
				}
				if (local14 < local222) {
					local14 = local222;
				}
				local224 = local216;
				local226 = local210.method1908() * local212 + local216;
				if (local224 < local16) {
					local16 = local224;
				}
				if (local226 > local18) {
					local18 = local226;
				}
			}
		}
		if (local14 < Static528.anInt5365 || Static528.anInt5368 < local7 || local18 < Static528.anInt5360 || local16 > Static528.anInt5363) {
			return true;
		}
		Static528.method4545(arg0, arg2, arg1);
		if (local105 != null) {
			if (Static30.anInt677 > 0 && (Static645.anInt10427 != -1 && arg2.anInt3909 == Static645.anInt10427 || Static64.anInt1190 != -1 && arg1.anInt8700 == Static64.anInt1190)) {
				if (Static600.anInt9797 <= 50) {
					local305 = Static600.anInt9797 * 2;
				} else {
					local305 = (100 - Static600.anInt9797) * 2;
				}
				@Pc(470) int local470 = local305 << 24 | 0xFFFF00;
				arg0.method7478(local470, arg2.anInt3904, arg2.anInt3907, local105.method8938() / 2 + 7);
				arg0.method7478(local470, arg2.anInt3904, arg2.anInt3907, local105.method8938() / 2 + 5);
				arg0.method7478(local470, arg2.anInt3904, arg2.anInt3907, local105.method8938() / 2 + 3);
				arg0.method7478(local470, arg2.anInt3904, arg2.anInt3907, local105.method8938() / 2 + 1);
				arg0.method7478(local470, arg2.anInt3904, arg2.anInt3907, local105.method8938() / 2);
			}
			local105.method8920(arg2.anInt3904 - (local105.method8937() >> 1), arg2.anInt3907 - (local105.method8930() >> 1));
		}
		if (arg1.aString120 != null && local210 != null) {
			Static35.method859(local210, arg2, local216, local214, local218, arg1, arg0, local212);
		}
		if (arg1.anInt8722 != -1 || arg1.aString120 != null) {
			@Pc(585) Class6_Sub13 local585 = new Class6_Sub13(arg2);
			local585.anInt1869 = local111;
			local585.anInt1864 = local226;
			local585.anInt1861 = local113;
			local585.anInt1862 = local222;
			local585.anInt1865 = local220;
			local585.anInt1873 = local109;
			local585.anInt1868 = local224;
			local585.anInt1867 = local107;
			Static473.aClass362_54.method8536(local585);
		}
		return false;
	}
}
