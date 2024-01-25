import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "Lclient!iga;")
	public static final Class159 aClass159_7 = new Class159(5, 5);

	@OriginalMember(owner = "client!hka", name = "j", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_55 = new Class289(14, 3);

	@OriginalMember(owner = "client!hka", name = "l", descriptor = "I")
	public static final int anInt3751 = 0;

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(IB)Lclient!ee;")
	public static Class81 method3202(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static528.aFloat39 == 3.0D) {
				return Static161.aClass81_4;
			}
			if ((double) Static528.aFloat39 == 4.0D) {
				return Static62.aClass81_1;
			}
			if ((double) Static528.aFloat39 == 6.0D) {
				return Static560.aClass81_3;
			}
			if ((double) Static528.aFloat39 >= 8.0D) {
				return Static185.aClass81_5;
			}
		} else if (arg0 == 1) {
			if ((double) Static528.aFloat39 == 3.0D) {
				return Static560.aClass81_3;
			}
			if ((double) Static528.aFloat39 == 4.0D) {
				return Static185.aClass81_5;
			}
			if ((double) Static528.aFloat39 == 6.0D) {
				return Static363.aClass81_8;
			}
			if ((double) Static528.aFloat39 >= 8.0D) {
				return Static232.aClass81_6;
			}
		} else if (arg0 == 2) {
			if ((double) Static528.aFloat39 == 3.0D) {
				return Static363.aClass81_8;
			}
			if ((double) Static528.aFloat39 == 4.0D) {
				return Static232.aClass81_6;
			}
			if ((double) Static528.aFloat39 == 6.0D) {
				return Static527.aClass81_9;
			}
			if ((double) Static528.aFloat39 >= 8.0D) {
				return Static326.aClass81_7;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(B)J")
	public static long method3203() {
		return Static678.aClass3_4.method6619();
	}

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(Lclient!aa;Lclient!sha;ILclient!ha;IIIIZ)V")
	public static void method3208(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class321 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class132 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(10) Class318 local10 = Static252.aClass280_1.method6911(arg5);
		if (local10 == null || !local10.aBoolean618 || !local10.method7386(Static659.aClass363_3)) {
			return;
		}
		@Pc(30) int local30;
		if (local10.anIntArray587 != null) {
			@Pc(28) int[] local28 = new int[local10.anIntArray587.length];
			@Pc(40) int local40;
			@Pc(53) int local53;
			@Pc(57) int local57;
			for (local30 = 0; local30 < local28.length / 2; local30++) {
				if (Static407.anInt6820 == 4) {
					local40 = (int) Static228.aFloat26 & 0x3FFF;
				} else {
					local40 = (int) Static228.aFloat26 + Static553.anInt9285 & 0x3FFF;
				}
				local53 = Class6_Sub1_Sub3.anIntArray56[local40];
				local57 = Class6_Sub1_Sub3.anIntArray58[local40];
				if (Static407.anInt6820 != 4) {
					local53 = local53 * 256 / (Static605.anInt9842 + 256);
					local57 = local57 * 256 / (Static605.anInt9842 + 256);
				}
				local28[local30 * 2] = (local57 * (local10.anIntArray587[local30 * 2] * 4 + arg2) + (arg4 + local10.anIntArray587[local30 * 2 + 1] * 4) * local53 >> 14) + arg1.anInt9103 / 2 + arg6;
				local28[local30 * 2 + 1] = arg7 + arg1.anInt9077 / 2 - (-((local10.anIntArray587[local30 * 2] * 4 + arg2) * local53) + local57 * (local10.anIntArray587[local30 * 2 - -1] * 4 + arg4) >> 14);
			}
			Static637.method8727(arg3, local28, local10.anInt8730, arg1.anIntArray615, arg1.anIntArray608);
			if (local10.anInt8711 <= 0) {
				for (local40 = 0; local40 < local28.length / 2 - 1; local40++) {
					arg3.method7492(local28[local40 * 2], local28[local40 * 2 + 1], local28[(local40 + 1) * 2], local28[local40 * 2 + 2 + 1], local10.anIntArray586[local10.aByteArray94[local40] & 0xFF], arg0, arg6, arg7);
				}
				arg3.method7492(local28[local28.length - 2], local28[local28.length - 1], local28[0], local28[1], local10.anIntArray586[local10.aByteArray94[local10.aByteArray94.length - 1] & 0xFF], arg0, arg6, arg7);
			} else {
				@Pc(304) int local304;
				@Pc(312) int local312;
				@Pc(323) int local323;
				@Pc(335) int local335;
				for (local40 = 0; local40 < local28.length / 2 - 1; local40++) {
					local53 = local28[local40 * 2];
					local57 = local28[local40 * 2 + 1];
					local304 = local28[local40 * 2 + 2];
					local312 = local28[local40 * 2 + 3];
					if (local304 < local53) {
						local323 = local53;
						local53 = local304;
						local335 = local57;
						local304 = local323;
						local57 = local312;
						local312 = local335;
					} else if (local304 == local53 && local57 > local312) {
						local323 = local57;
						local57 = local312;
						local312 = local323;
					}
					arg3.method7441(local53, local57, local304, local312, local10.anIntArray586[local10.aByteArray94[local40] & 0xFF], arg0, arg6, arg7, local10.anInt8711, local10.anInt8701, local10.anInt8716);
				}
				local53 = local28[local28.length - 2];
				local57 = local28[local28.length - 1];
				local304 = local28[0];
				local312 = local28[1];
				if (local53 > local304) {
					local323 = local53;
					local335 = local57;
					local53 = local304;
					local304 = local323;
					local57 = local312;
					local312 = local335;
				} else if (local304 == local53 && local312 < local57) {
					local323 = local57;
					local57 = local312;
					local312 = local323;
				}
				arg3.method7441(local53, local57, local304, local312, local10.anIntArray586[local10.aByteArray94[local10.aByteArray94.length - 1] & 0xFF], arg0, arg6, arg7, local10.anInt8711, local10.anInt8701, local10.anInt8716);
			}
		}
		@Pc(465) Class9 local465 = null;
		if (local10.anInt8722 != -1) {
			local465 = local10.method7385(arg3, false);
			if (local465 != null) {
				Static474.method6310(arg0, arg4, local465, arg1, arg6, arg2, arg7);
			}
		}
		if (local10.aString120 == null) {
			return;
		}
		local30 = 0;
		if (local465 != null) {
			local30 = local465.method8918();
		}
		@Pc(499) Class19 local499 = Static494.aClass19_12;
		@Pc(501) Class151 local501 = Static393.aClass151_10;
		if (local10.anInt8720 == 1) {
			local501 = Static462.aClass151_12;
			local499 = Static423.aClass19_9;
		}
		if (local10.anInt8720 == 2) {
			local501 = Static173.aClass151_4;
			local499 = Static51.aClass19_4;
		}
		Static240.method3599(arg7, arg6, arg1, local499, local501, arg2, local10.anInt8704, arg4, local10.aString120, arg0, local30);
	}

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(I)V")
	public static void method3209() {
		if (!Static291.aBoolean314) {
			return;
		}
		@Pc(11) Class321 local11 = Static640.method8748(Static663.anInt9822, Static672.anInt10372);
		if (local11 != null && local11.anObjectArray2 != null) {
			@Pc(20) Class6_Sub49 local20 = new Class6_Sub49();
			local20.aClass321_44 = local11;
			local20.anObjectArray35 = local11.anObjectArray2;
			Static295.method4226(local20);
		}
		Static489.anInt8324 = -1;
		Static291.aBoolean314 = false;
		Static357.anInt6124 = -1;
		if (local11 != null) {
			Static293.method4206(local11);
		}
	}
}
