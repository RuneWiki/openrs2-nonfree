import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!e", name = "q", descriptor = "Lclient!ak;")
	public static Class7 aClass7_60;

	@OriginalMember(owner = "client!e", name = "x", descriptor = "Lclient!gf;")
	public static Class62 aClass62_2;

	@OriginalMember(owner = "client!e", name = "s", descriptor = "I")
	public static int anInt1249 = 500;

	@OriginalMember(owner = "client!e", name = "C", descriptor = "I")
	public static int anInt1258 = -1;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!ib;IIIIIIIZ)V")
	public static void method1019(@OriginalArg(0) Class74 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static3.anInt142;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static12.anInt356;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(37) int local37 = Static163.anIntArrayArrayArray16[arg1][arg6][arg7] - Static254.anInt5887;
		@Pc(49) int local49 = Static163.anIntArrayArrayArray16[arg1][arg6 + 1][arg7] - Static254.anInt5887;
		@Pc(63) int local63 = Static163.anIntArrayArrayArray16[arg1][arg6 + 1][arg7 + 1] - Static254.anInt5887;
		@Pc(75) int local75 = Static163.anIntArrayArrayArray16[arg1][arg6][arg7 + 1] - Static254.anInt5887;
		@Pc(85) int local85 = local15 * arg4 + local7 * arg5 >> 16;
		@Pc(95) int local95 = local15 * arg5 - local7 * arg4 >> 16;
		@Pc(97) int local97 = local85;
		@Pc(107) int local107 = local37 * arg3 - local95 * arg2 >> 16;
		@Pc(117) int local117 = local37 * arg2 + local95 * arg3 >> 16;
		@Pc(119) int local119 = local107;
		if (local117 < 50) {
			return;
		}
		local85 = local14 * arg4 + local21 * arg5 >> 16;
		@Pc(143) int local143 = local14 * arg5 - local21 * arg4 >> 16;
		local21 = local85;
		local85 = local49 * arg3 - local143 * arg2 >> 16;
		@Pc(165) int local165 = local49 * arg2 + local143 * arg3 >> 16;
		local49 = local85;
		if (local165 < 50) {
			return;
		}
		local85 = local27 * arg4 + local20 * arg5 >> 16;
		local27 = local27 * arg5 - local20 * arg4 >> 16;
		@Pc(193) int local193 = local85;
		local85 = local63 * arg3 - local27 * arg2 >> 16;
		local27 = local63 * arg2 + local27 * arg3 >> 16;
		local63 = local85;
		if (local27 < 50) {
			return;
		}
		local85 = local26 * arg4 + local6 * arg5 >> 16;
		@Pc(239) int local239 = local26 * arg5 - local6 * arg4 >> 16;
		@Pc(241) int local241 = local85;
		local85 = local75 * arg3 - local239 * arg2 >> 16;
		@Pc(261) int local261 = local75 * arg2 + local239 * arg3 >> 16;
		if (local261 < 50) {
			return;
		}
		@Pc(275) int local275 = Static208.anInt4133 + (local97 << 9) / local117;
		@Pc(283) int local283 = Static208.anInt4134 + (local119 << 9) / local117;
		@Pc(291) int local291 = Static208.anInt4133 + (local21 << 9) / local165;
		@Pc(299) int local299 = Static208.anInt4134 + (local49 << 9) / local165;
		@Pc(307) int local307 = Static208.anInt4133 + (local193 << 9) / local27;
		@Pc(315) int local315 = Static208.anInt4134 + (local63 << 9) / local27;
		@Pc(323) int local323 = Static208.anInt4133 + (local241 << 9) / local261;
		@Pc(331) int local331 = Static208.anInt4134 + (local85 << 9) / local261;
		Static208.anInt4131 = 0;
		@Pc(475) int local475;
		if ((local307 - local323) * (local299 - local331) - (local315 - local331) * (local291 - local323) > 0) {
			if (Static167.aBoolean234 && Static47.method4520(Static107.anInt1993 + Static208.anInt4133, Static102.anInt1932 + Static208.anInt4134, local315, local331, local299, local307, local323, local291)) {
				Static186.anInt3478 = arg6;
				Static228.anInt4527 = arg7;
			}
			if (!Static240.aBoolean369 && !arg8) {
				Static208.aBoolean313 = false;
				if (local307 < 0 || local323 < 0 || local291 < 0 || local307 > Static208.anInt4132 || local323 > Static208.anInt4132 || local291 > Static208.anInt4132) {
					Static208.aBoolean313 = true;
				}
				if (arg0.anInt2053 == -1) {
					if (arg0.anInt2048 != 12345678) {
						Static208.method3254(local315, local331, local299, local307, local323, local291, arg0.anInt2048, arg0.anInt2046, arg0.anInt2045);
					}
				} else if (!Static282.aBoolean446) {
					local475 = Static208.anInterface4_1.method991(arg0.anInt2053);
					Static208.method3254(local315, local331, local299, local307, local323, local291, Static187.method2828(local475, arg0.anInt2048), Static187.method2828(local475, arg0.anInt2046), Static187.method2828(local475, arg0.anInt2045));
				} else if (arg0.aBoolean149) {
					Static208.method3249(local315, local331, local299, local307, local323, local291, arg0.anInt2048, arg0.anInt2046, arg0.anInt2045, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt2053);
				} else {
					Static208.method3249(local315, local331, local299, local307, local323, local291, arg0.anInt2048, arg0.anInt2046, arg0.anInt2045, local193, local241, local21, local63, local85, local49, local27, local261, local165, arg0.anInt2053);
				}
			}
		}
		if ((local275 - local291) * (local331 - local299) - (local283 - local299) * (local323 - local291) <= 0) {
			return;
		}
		if (Static167.aBoolean234 && Static47.method4520(Static107.anInt1993 + Static208.anInt4133, Static102.anInt1932 + Static208.anInt4134, local283, local299, local331, local275, local291, local323)) {
			Static186.anInt3478 = arg6;
			Static228.anInt4527 = arg7;
		}
		if (Static240.aBoolean369 || arg8) {
			return;
		}
		Static208.aBoolean313 = false;
		if (local275 < 0 || local291 < 0 || local323 < 0 || local275 > Static208.anInt4132 || local291 > Static208.anInt4132 || local323 > Static208.anInt4132) {
			Static208.aBoolean313 = true;
		}
		if (arg0.anInt2053 == -1) {
			if (arg0.anInt2047 != 12345678) {
				Static208.method3254(local283, local299, local331, local275, local291, local323, arg0.anInt2047, arg0.anInt2045, arg0.anInt2046);
			}
		} else if (Static282.aBoolean446) {
			Static208.method3249(local283, local299, local331, local275, local291, local323, arg0.anInt2047, arg0.anInt2045, arg0.anInt2046, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt2053);
		} else {
			local475 = Static208.anInterface4_1.method991(arg0.anInt2053);
			Static208.method3254(local283, local299, local331, local275, local291, local323, Static187.method2828(local475, arg0.anInt2047), Static187.method2828(local475, arg0.anInt2045), Static187.method2828(local475, arg0.anInt2046));
		}
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V")
	public static void method1022() {
		Static140.anIntArray315 = null;
		Static143.anIntArray326 = null;
		Static103.anIntArray260 = null;
		Static75.anIntArray175 = null;
		Static84.aByteArrayArrayArray9 = null;
		Static224.anIntArray534 = null;
		Static40.anIntArray123 = null;
		Static253.anIntArrayArrayArray19 = null;
		Static38.aByteArrayArrayArray5 = null;
		Static249.aByteArrayArrayArray24 = null;
		Static97.aByteArrayArrayArray11 = null;
		Static40.aByteArrayArrayArray6 = null;
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(B)I")
	public static int method1023() {
		return 6;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!jj;B)Lclient!jb;")
	public static Class35_Sub2 method1024(@OriginalArg(0) Class1_Sub18 arg0) {
		return new Class35_Sub2(arg0.method3064(), arg0.method3064(), arg0.method3064(), arg0.method3064(), arg0.method3109(), arg0.method3122());
	}
}
