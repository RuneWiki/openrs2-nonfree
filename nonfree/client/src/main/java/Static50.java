import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "Lclient!i;")
	public static Class41 aClass41_631 = Static184.method2923("Verbindung konnte nicht hergestellt werden)3");

	@OriginalMember(owner = "client!ej", name = "u", descriptor = "Lclient!i;")
	private static Class41 aClass41_633 = Static184.method2923("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "Lclient!i;")
	public static Class41 aClass41_632 = aClass41_633;

	@OriginalMember(owner = "client!ej", name = "i", descriptor = "I")
	public static int anInt2123 = 0;

	@OriginalMember(owner = "client!ej", name = "j", descriptor = "[I")
	public static int[] anIntArray206 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!ej", name = "n", descriptor = "I")
	public static int anInt2126 = 0;

	@OriginalMember(owner = "client!ej", name = "s", descriptor = "Lclient!hj;")
	public static Applet_Sub1 anApplet_Sub1_3 = null;

	@OriginalMember(owner = "client!ej", name = "t", descriptor = "I")
	public static int anInt2131 = -1;

	@OriginalMember(owner = "client!ej", name = "B", descriptor = "I")
	public static int anInt2134 = 0;

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(II)I")
	public static int method1506(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local5 += 16;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return local5 + arg0;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!ih;IIIIIIIZ)V")
	public static void method1510(@OriginalArg(0) Class45 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static65.anInt1729;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static191.anInt4374;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(37) int local37 = Static56.anIntArrayArrayArray7[arg1][arg6][arg7] - Static214.anInt4717;
		@Pc(49) int local49 = Static56.anIntArrayArrayArray7[arg1][arg6 + 1][arg7] - Static214.anInt4717;
		@Pc(63) int local63 = Static56.anIntArrayArrayArray7[arg1][arg6 + 1][arg7 + 1] - Static214.anInt4717;
		@Pc(75) int local75 = Static56.anIntArrayArrayArray7[arg1][arg6][arg7 + 1] - Static214.anInt4717;
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
		@Pc(275) int local275 = Static155.anInt3625 + (local97 << 9) / local117;
		@Pc(283) int local283 = Static155.anInt3624 + (local119 << 9) / local117;
		@Pc(291) int local291 = Static155.anInt3625 + (local21 << 9) / local165;
		@Pc(299) int local299 = Static155.anInt3624 + (local49 << 9) / local165;
		@Pc(307) int local307 = Static155.anInt3625 + (local193 << 9) / local27;
		@Pc(315) int local315 = Static155.anInt3624 + (local63 << 9) / local27;
		@Pc(323) int local323 = Static155.anInt3625 + (local241 << 9) / local261;
		@Pc(331) int local331 = Static155.anInt3624 + (local85 << 9) / local261;
		Static155.anInt3621 = 0;
		@Pc(473) int local473;
		if ((local307 - local323) * (local299 - local331) - (local315 - local331) * (local291 - local323) > 0) {
			if (Static104.aBoolean136 && Static21.method3206(Static36.anInt953 + Static155.anInt3625, Static33.anInt889 + Static155.anInt3624, local315, local331, local299, local307, local323, local291)) {
				Static100.anInt2439 = arg6;
				Static79.anInt2049 = arg7;
			}
			if (!arg8) {
				Static155.aBoolean209 = false;
				if (local307 < 0 || local323 < 0 || local291 < 0 || local307 > Static155.anInt3622 || local323 > Static155.anInt3622 || local291 > Static155.anInt3622) {
					Static155.aBoolean209 = true;
				}
				if (arg0.anInt2110 == -1) {
					if (arg0.anInt2112 != 12345678) {
						Static155.method2524(local315, local331, local299, local307, local323, local291, arg0.anInt2112, arg0.anInt2108, arg0.anInt2115);
					}
				} else if (Static91.aBoolean119) {
					local473 = Static155.anInterface1_1.method1135(arg0.anInt2110);
					Static155.method2524(local315, local331, local299, local307, local323, local291, Static103.method1767(local473, arg0.anInt2112), Static103.method1767(local473, arg0.anInt2108), Static103.method1767(local473, arg0.anInt2115));
				} else if (arg0.aBoolean111) {
					Static155.method2522(local315, local331, local299, local307, local323, local291, arg0.anInt2112, arg0.anInt2108, arg0.anInt2115, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt2110);
				} else {
					Static155.method2522(local315, local331, local299, local307, local323, local291, arg0.anInt2112, arg0.anInt2108, arg0.anInt2115, local193, local241, local21, local63, local85, local49, local27, local261, local165, arg0.anInt2110);
				}
			}
		}
		if ((local275 - local291) * (local331 - local299) - (local283 - local299) * (local323 - local291) <= 0) {
			return;
		}
		if (Static104.aBoolean136 && Static21.method3206(Static36.anInt953 + Static155.anInt3625, Static33.anInt889 + Static155.anInt3624, local283, local299, local331, local275, local291, local323)) {
			Static100.anInt2439 = arg6;
			Static79.anInt2049 = arg7;
		}
		if (arg8) {
			return;
		}
		Static155.aBoolean209 = false;
		if (local275 < 0 || local291 < 0 || local323 < 0 || local275 > Static155.anInt3622 || local291 > Static155.anInt3622 || local323 > Static155.anInt3622) {
			Static155.aBoolean209 = true;
		}
		if (arg0.anInt2110 != -1) {
			if (!Static91.aBoolean119) {
				Static155.method2522(local283, local299, local331, local275, local291, local323, arg0.anInt2109, arg0.anInt2115, arg0.anInt2108, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt2110);
				return;
			}
			local473 = Static155.anInterface1_1.method1135(arg0.anInt2110);
			Static155.method2524(local283, local299, local331, local275, local291, local323, Static103.method1767(local473, arg0.anInt2109), Static103.method1767(local473, arg0.anInt2115), Static103.method1767(local473, arg0.anInt2108));
		} else if (arg0.anInt2109 != 12345678) {
			Static155.method2524(local283, local299, local331, local275, local291, local323, arg0.anInt2109, arg0.anInt2115, arg0.anInt2108);
			return;
		}
	}
}
