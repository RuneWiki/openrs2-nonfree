import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!wh", name = "t", descriptor = "[I")
	public static int[] anIntArray520;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString295 = "level: ";

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
	public static int anInt6079 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!wh", name = "g", descriptor = "Lclient!ii;")
	public static Class79 aClass79_23 = new Class79(512);

	@OriginalMember(owner = "client!wh", name = "h", descriptor = "Z")
	public static boolean aBoolean484 = false;

	@OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
	public static int anInt6086 = 0;

	@OriginalMember(owner = "client!wh", name = "m", descriptor = "I")
	public static int anInt6087 = 0;

	@OriginalMember(owner = "client!wh", name = "q", descriptor = "I")
	public static int anInt6090 = 2;

	@OriginalMember(owner = "client!wh", name = "r", descriptor = "I")
	public static int anInt6091 = 0;

	@OriginalMember(owner = "client!wh", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString296 = "Loading config - ";

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(SB)Z")
	public static boolean method4856(@OriginalArg(0) short arg0) {
		if (arg0 == 40 || arg0 == 4 || arg0 == 2 || arg0 == 30 || arg0 == 23 || arg0 == 47 || arg0 == 21 || arg0 == 16) {
			return true;
		} else if (arg0 == 29 || arg0 == 34 || arg0 == 1003 || arg0 == 1007) {
			return true;
		} else if (arg0 == 57 || arg0 == 18 || arg0 == 33 || arg0 == 49 || arg0 == 7) {
			return true;
		} else {
			return arg0 == 10 || arg0 == 31 || arg0 == 45 || arg0 == 48 || arg0 == 50 || arg0 == 51;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!aj;IIIIIIIZ)V")
	public static void method4857(@OriginalArg(0) Class8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static77.anInt1648;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static173.anInt3690;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(37) int local37 = Static141.anIntArrayArrayArray4[arg1][arg6][arg7] - Static189.anInt3965;
		@Pc(49) int local49 = Static141.anIntArrayArrayArray4[arg1][arg6 + 1][arg7] - Static189.anInt3965;
		@Pc(63) int local63 = Static141.anIntArrayArrayArray4[arg1][arg6 + 1][arg7 + 1] - Static189.anInt3965;
		@Pc(75) int local75 = Static141.anIntArrayArrayArray4[arg1][arg6][arg7 + 1] - Static189.anInt3965;
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
		@Pc(275) int local275 = Static93.anInt2049 + (local97 << 9) / local117;
		@Pc(283) int local283 = Static93.anInt2048 + (local119 << 9) / local117;
		@Pc(291) int local291 = Static93.anInt2049 + (local21 << 9) / local165;
		@Pc(299) int local299 = Static93.anInt2048 + (local49 << 9) / local165;
		@Pc(307) int local307 = Static93.anInt2049 + (local193 << 9) / local27;
		@Pc(315) int local315 = Static93.anInt2048 + (local63 << 9) / local27;
		@Pc(323) int local323 = Static93.anInt2049 + (local241 << 9) / local261;
		@Pc(331) int local331 = Static93.anInt2048 + (local85 << 9) / local261;
		Static93.anInt2047 = 0;
		@Pc(475) int local475;
		if ((local307 - local323) * (local299 - local331) - (local315 - local331) * (local291 - local323) > 0) {
			if (Static116.aBoolean191 && Static243.method3058(Static144.anInt3120 + Static93.anInt2049, Static279.anInt5823 + Static93.anInt2048, local315, local331, local299, local307, local323, local291)) {
				Static217.anInt4542 = arg6;
				Static201.anInt4207 = arg7;
			}
			if (!Static60.aBoolean106 && !arg8) {
				Static93.aBoolean159 = false;
				if (local307 < 0 || local323 < 0 || local291 < 0 || local307 > Static93.anInt2046 || local323 > Static93.anInt2046 || local291 > Static93.anInt2046) {
					Static93.aBoolean159 = true;
				}
				if (arg0.anInt279 == -1) {
					if (arg0.anInt285 != 12345678) {
						Static93.method1727(local315, local331, local299, local307, local323, local291, arg0.anInt285, arg0.anInt278, arg0.anInt277);
					}
				} else if (!Static96.aBoolean166) {
					local475 = Static93.anInterface5_1.method3521(arg0.anInt279);
					Static93.method1727(local315, local331, local299, local307, local323, local291, Static273.method4567(local475, arg0.anInt285), Static273.method4567(local475, arg0.anInt278), Static273.method4567(local475, arg0.anInt277));
				} else if (arg0.aBoolean25) {
					Static93.method1736(local315, local331, local299, local307, local323, local291, arg0.anInt285, arg0.anInt278, arg0.anInt277, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt279);
				} else {
					Static93.method1736(local315, local331, local299, local307, local323, local291, arg0.anInt285, arg0.anInt278, arg0.anInt277, local193, local241, local21, local63, local85, local49, local27, local261, local165, arg0.anInt279);
				}
			}
		}
		if ((local275 - local291) * (local331 - local299) - (local283 - local299) * (local323 - local291) <= 0) {
			return;
		}
		if (Static116.aBoolean191 && Static243.method3058(Static144.anInt3120 + Static93.anInt2049, Static279.anInt5823 + Static93.anInt2048, local283, local299, local331, local275, local291, local323)) {
			Static217.anInt4542 = arg6;
			Static201.anInt4207 = arg7;
		}
		if (Static60.aBoolean106 || arg8) {
			return;
		}
		Static93.aBoolean159 = false;
		if (local275 < 0 || local291 < 0 || local323 < 0 || local275 > Static93.anInt2046 || local291 > Static93.anInt2046 || local323 > Static93.anInt2046) {
			Static93.aBoolean159 = true;
		}
		if (arg0.anInt279 == -1) {
			if (arg0.anInt276 != 12345678) {
				Static93.method1727(local283, local299, local331, local275, local291, local323, arg0.anInt276, arg0.anInt277, arg0.anInt278);
			}
		} else if (Static96.aBoolean166) {
			Static93.method1736(local283, local299, local331, local275, local291, local323, arg0.anInt276, arg0.anInt277, arg0.anInt278, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt279);
		} else {
			local475 = Static93.anInterface5_1.method3521(arg0.anInt279);
			Static93.method1727(local283, local299, local331, local275, local291, local323, Static273.method4567(local475, arg0.anInt276), Static273.method4567(local475, arg0.anInt277), Static273.method4567(local475, arg0.anInt278));
		}
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)I")
	public static int method4858() {
		if (Static8.aFrame1 != null) {
			return 3;
		} else if (Static60.aBoolean106 && aBoolean484) {
			return 2;
		} else if (Static60.aBoolean106 && !aBoolean484) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIBIIIII)V")
	public static void method4860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < 1 || arg4 < 1 || arg0 > 102 || arg4 > 102) {
			return;
		}
		@Pc(53) int local53;
		if (!Static67.method4885() && (Static134.aByteArrayArrayArray9[0][arg0][arg4] & 0x2) == 0) {
			local53 = arg2;
			if ((Static134.aByteArrayArrayArray9[arg2][arg0][arg4] & 0x8) != 0) {
				local53 = 0;
			}
			if (local53 != Static8.anInt271) {
				return;
			}
		}
		local53 = arg2;
		if (arg2 < 3 && (Static134.aByteArrayArrayArray9[1][arg0][arg4] & 0x2) == 2) {
			local53 = arg2 + 1;
		}
		Static237.method3913(arg0, arg4, arg2, Static98.aClass52Array1[arg2], arg6, local53);
		if (arg1 >= 0) {
			@Pc(112) boolean local112 = Static106.aBoolean183;
			Static106.aBoolean183 = true;
			Static121.method2216(arg0, false, Static98.aClass52Array1[arg2], false, arg5, arg3, local53, arg2, arg1, arg4);
			Static106.aBoolean183 = local112;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIB)Lclient!nf;")
	public static Class2_Sub3_Sub18 method4861(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(16) Class2_Sub3_Sub18 local16 = (Class2_Sub3_Sub18) Static186.aClass79_16.method1992(); local16 != null; local16 = (Class2_Sub3_Sub18) Static186.aClass79_16.method1991()) {
			if (local16.aBoolean306 && local16.method2980(arg1, arg0)) {
				return local16;
			}
		}
		return null;
	}
}
