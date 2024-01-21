import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "bb", descriptor = "I")
	public static int anInt64;

	@OriginalMember(owner = "client!a", name = "Q", descriptor = "Lclient!dd;")
	public static Class13 aClass13_16 = Static161.method2971(" ");

	@OriginalMember(owner = "client!a", name = "Z", descriptor = "Lclient!ja;")
	public static Class1_Sub8_Sub1 aClass1_Sub8_Sub1_1 = new Class1_Sub8_Sub1(5000);

	@OriginalMember(owner = "client!a", name = "ab", descriptor = "I")
	public static int anInt63 = 1;

	@OriginalMember(owner = "client!a", name = "cb", descriptor = "I")
	public static int anInt65 = 0;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!vc;B)V")
	public static void method43(@OriginalArg(0) Class1_Sub23 arg0) {
		Static41.method1066(200000, arg0);
	}

	@OriginalMember(owner = "client!a", name = "e", descriptor = "(B)V")
	public static void method44() {
		aClass13_16 = null;
		aClass1_Sub8_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!fe;IIIIIII)V")
	public static void method45(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static4.anInt122;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static24.anInt869;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(37) int local37 = Static114.anIntArrayArrayArray4[arg1][arg6][arg7] - Static2.anInt95;
		@Pc(49) int local49 = Static114.anIntArrayArrayArray4[arg1][arg6 + 1][arg7] - Static2.anInt95;
		@Pc(63) int local63 = Static114.anIntArrayArrayArray4[arg1][arg6 + 1][arg7 + 1] - Static2.anInt95;
		@Pc(75) int local75 = Static114.anIntArrayArrayArray4[arg1][arg6][arg7 + 1] - Static2.anInt95;
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
		@Pc(275) int local275 = Static9.anInt332 + (local97 << 9) / local117;
		@Pc(283) int local283 = Static9.anInt333 + (local119 << 9) / local117;
		@Pc(291) int local291 = Static9.anInt332 + (local21 << 9) / local165;
		@Pc(299) int local299 = Static9.anInt333 + (local49 << 9) / local165;
		@Pc(307) int local307 = Static9.anInt332 + (local193 << 9) / local27;
		@Pc(315) int local315 = Static9.anInt333 + (local63 << 9) / local27;
		@Pc(323) int local323 = Static9.anInt332 + (local241 << 9) / local261;
		@Pc(331) int local331 = Static9.anInt333 + (local85 << 9) / local261;
		Static9.anInt330 = 0;
		@Pc(467) int local467;
		if ((local307 - local323) * (local299 - local331) - (local315 - local331) * (local291 - local323) > 0) {
			if (Static71.aBoolean156 && Static65.method1443(Static67.anInt1964, Static99.anInt2784, local315, local331, local299, local307, local323, local291)) {
				Static168.anInt3947 = arg6;
				Static61.anInt1892 = arg7;
			}
			Static9.aBoolean31 = false;
			if (local307 < 0 || local323 < 0 || local291 < 0 || local307 > Static9.anInt334 || local323 > Static9.anInt334 || local291 > Static9.anInt334) {
				Static9.aBoolean31 = true;
			}
			if (arg0.anInt1637 == -1) {
				if (arg0.anInt1642 != 12345678) {
					Static9.method361(local315, local331, local299, local307, local323, local291, arg0.anInt1642, arg0.anInt1640, arg0.anInt1635);
				}
			} else if (Static137.aBoolean262) {
				local467 = Static9.anInterface3_1.method2048(arg0.anInt1637);
				Static9.method361(local315, local331, local299, local307, local323, local291, Static163.method2796(local467, arg0.anInt1642), Static163.method2796(local467, arg0.anInt1640), Static163.method2796(local467, arg0.anInt1635));
			} else if (arg0.aBoolean127) {
				Static9.method353(local315, local331, local299, local307, local323, local291, arg0.anInt1642, arg0.anInt1640, arg0.anInt1635, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt1637);
			} else {
				Static9.method353(local315, local331, local299, local307, local323, local291, arg0.anInt1642, arg0.anInt1640, arg0.anInt1635, local193, local241, local21, local63, local85, local49, local27, local261, local165, arg0.anInt1637);
			}
		}
		if ((local275 - local291) * (local331 - local299) - (local283 - local299) * (local323 - local291) <= 0) {
			return;
		}
		if (Static71.aBoolean156 && Static65.method1443(Static67.anInt1964, Static99.anInt2784, local283, local299, local331, local275, local291, local323)) {
			Static168.anInt3947 = arg6;
			Static61.anInt1892 = arg7;
		}
		Static9.aBoolean31 = false;
		if (local275 < 0 || local291 < 0 || local323 < 0 || local275 > Static9.anInt334 || local291 > Static9.anInt334 || local323 > Static9.anInt334) {
			Static9.aBoolean31 = true;
		}
		if (arg0.anInt1637 != -1) {
			if (!Static137.aBoolean262) {
				Static9.method353(local283, local299, local331, local275, local291, local323, arg0.anInt1641, arg0.anInt1635, arg0.anInt1640, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt1637);
				return;
			}
			local467 = Static9.anInterface3_1.method2048(arg0.anInt1637);
			Static9.method361(local283, local299, local331, local275, local291, local323, Static163.method2796(local467, arg0.anInt1641), Static163.method2796(local467, arg0.anInt1635), Static163.method2796(local467, arg0.anInt1640));
		} else if (arg0.anInt1641 != 12345678) {
			Static9.method361(local283, local299, local331, local275, local291, local323, arg0.anInt1641, arg0.anInt1635, arg0.anInt1640);
			return;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;")
	public static Class method46(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(IIII)V")
	public static void method47(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class1_Sub10 local7 = Static170.aClass1_Sub10ArrayArrayArray35[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class69 local13 = local7.aClass69_1;
		if (local13 != null) {
			local13.anInt3375 = local13.anInt3375 * arg3 / 16;
			local13.anInt3383 = local13.anInt3383 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IILclient!gi;)V")
	public static void method48(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub2_Sub2_Sub2 arg1) {
		Static167.method2857(arg0, arg1.anInt2596, arg1.anInt2606);
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(III)Z")
	public static boolean method49(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static51.anIntArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == -Static89.anInt2511) {
			return false;
		} else if (local7 == Static89.anInt2511) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static108.method2114(local22 + 1, Static114.anIntArrayArrayArray4[arg0][arg1][arg2], local26 + 1) && Static108.method2114(local22 + 128 - 1, Static114.anIntArrayArrayArray4[arg0][arg1 + 1][arg2], local26 + 1) && Static108.method2114(local22 + 128 - 1, Static114.anIntArrayArrayArray4[arg0][arg1 + 1][arg2 + 1], local26 + 128 - 1) && Static108.method2114(local22 + 1, Static114.anIntArrayArrayArray4[arg0][arg1][arg2 + 1], local26 + 128 - 1)) {
				Static51.anIntArrayArrayArray2[arg0][arg1][arg2] = Static89.anInt2511;
				return true;
			} else {
				Static51.anIntArrayArrayArray2[arg0][arg1][arg2] = -Static89.anInt2511;
				return false;
			}
		}
	}
}
