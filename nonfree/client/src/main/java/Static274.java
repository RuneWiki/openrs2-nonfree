import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!um", name = "c", descriptor = "[[B")
	public static byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!um", name = "e", descriptor = "I")
	public static int anInt5109;

	@OriginalMember(owner = "client!um", name = "f", descriptor = "[I")
	public static int[] anIntArray453;

	@OriginalMember(owner = "client!um", name = "g", descriptor = "[[S")
	public static short[][] aShortArrayArray5;

	@OriginalMember(owner = "client!um", name = "h", descriptor = "[S")
	public static short[] aShortArray85 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IZII)I")
	public static int method4073(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == arg0) {
			return arg1;
		} else {
			@Pc(18) int local18 = 128 - arg2;
			@Pc(36) int local36 = arg2 * (arg0 >>> 7 & 0x1FE01FE) + (arg1 >>> 7 & 0x1FE01FE) * local18 & 0xFF00FF00;
			@Pc(50) int local50 = (arg1 & 0xFF00FF) * local18 + arg2 * (arg0 & 0xFF00FF) & 0xFF00FF00;
			return (local50 >> 7) + local36;
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(II)V")
	public static void method4074() {
		Static139.aClass33_23.method838(5);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V")
	public static void method4075() {
		anIntArray453 = null;
		aShortArray85 = null;
		aByteArrayArray20 = null;
		aShortArrayArray5 = null;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!we;IIIIIIIZ)V")
	public static void method4076(@OriginalArg(0) Class181 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static175.anInt3456;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static165.anInt3299;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(37) int local37 = Static250.anIntArrayArrayArray13[arg1][arg6][arg7] - Static27.anInt1303;
		@Pc(49) int local49 = Static250.anIntArrayArrayArray13[arg1][arg6 + 1][arg7] - Static27.anInt1303;
		@Pc(63) int local63 = Static250.anIntArrayArrayArray13[arg1][arg6 + 1][arg7 + 1] - Static27.anInt1303;
		@Pc(75) int local75 = Static250.anIntArrayArrayArray13[arg1][arg6][arg7 + 1] - Static27.anInt1303;
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
		@Pc(275) int local275 = Static204.anInt3986 + (local97 << 9) / local117;
		@Pc(283) int local283 = Static204.anInt3985 + (local119 << 9) / local117;
		@Pc(291) int local291 = Static204.anInt3986 + (local21 << 9) / local165;
		@Pc(299) int local299 = Static204.anInt3985 + (local49 << 9) / local165;
		@Pc(307) int local307 = Static204.anInt3986 + (local193 << 9) / local27;
		@Pc(315) int local315 = Static204.anInt3985 + (local63 << 9) / local27;
		@Pc(323) int local323 = Static204.anInt3986 + (local241 << 9) / local261;
		@Pc(331) int local331 = Static204.anInt3985 + (local85 << 9) / local261;
		Static204.anInt3983 = 0;
		@Pc(475) int local475;
		if ((local307 - local323) * (local299 - local331) - (local315 - local331) * (local291 - local323) > 0) {
			if (Static125.aBoolean177 && Static185.method2905(Static243.anInt4645 + Static204.anInt3986, Static217.anInt4313 + Static204.anInt3985, local315, local331, local299, local307, local323, local291)) {
				Static173.anInt3434 = arg6;
				Static247.anInt4704 = arg7;
			}
			if (!Static178.aBoolean216 && !arg8) {
				Static204.aBoolean258 = false;
				if (local307 < 0 || local323 < 0 || local291 < 0 || local307 > Static204.anInt3984 || local323 > Static204.anInt3984 || local291 > Static204.anInt3984) {
					Static204.aBoolean258 = true;
				}
				if (arg0.anInt5426 == -1) {
					if (arg0.anInt5430 != 12345678) {
						Static204.method3221(local315, local331, local299, local307, local323, local291, arg0.anInt5430, arg0.anInt5427, arg0.anInt5424);
					}
				} else if (!Static105.aBoolean162) {
					local475 = Static204.anInterface2_1.method1979(arg0.anInt5426);
					Static204.method3221(local315, local331, local299, local307, local323, local291, Static185.method2903(local475, arg0.anInt5430), Static185.method2903(local475, arg0.anInt5427), Static185.method2903(local475, arg0.anInt5424));
				} else if (arg0.aBoolean353) {
					Static204.method3233(local315, local331, local299, local307, local323, local291, arg0.anInt5430, arg0.anInt5427, arg0.anInt5424, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt5426);
				} else {
					Static204.method3233(local315, local331, local299, local307, local323, local291, arg0.anInt5430, arg0.anInt5427, arg0.anInt5424, local193, local241, local21, local63, local85, local49, local27, local261, local165, arg0.anInt5426);
				}
			}
		}
		if ((local275 - local291) * (local331 - local299) - (local283 - local299) * (local323 - local291) <= 0) {
			return;
		}
		if (Static125.aBoolean177 && Static185.method2905(Static243.anInt4645 + Static204.anInt3986, Static217.anInt4313 + Static204.anInt3985, local283, local299, local331, local275, local291, local323)) {
			Static173.anInt3434 = arg6;
			Static247.anInt4704 = arg7;
		}
		if (Static178.aBoolean216 || arg8) {
			return;
		}
		Static204.aBoolean258 = false;
		if (local275 < 0 || local291 < 0 || local323 < 0 || local275 > Static204.anInt3984 || local291 > Static204.anInt3984 || local323 > Static204.anInt3984) {
			Static204.aBoolean258 = true;
		}
		if (arg0.anInt5426 == -1) {
			if (arg0.anInt5429 != 12345678) {
				Static204.method3221(local283, local299, local331, local275, local291, local323, arg0.anInt5429, arg0.anInt5424, arg0.anInt5427);
			}
		} else if (Static105.aBoolean162) {
			Static204.method3233(local283, local299, local331, local275, local291, local323, arg0.anInt5429, arg0.anInt5424, arg0.anInt5427, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt5426);
		} else {
			local475 = Static204.anInterface2_1.method1979(arg0.anInt5426);
			Static204.method3221(local283, local299, local331, local275, local291, local323, Static185.method2903(local475, arg0.anInt5429), Static185.method2903(local475, arg0.anInt5424), Static185.method2903(local475, arg0.anInt5427));
		}
	}
}
