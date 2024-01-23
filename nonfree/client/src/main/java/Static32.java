import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "Lclient!mb;")
	public static Class70 aClass70_12;

	@OriginalMember(owner = "client!ck", name = "f", descriptor = "Lclient!tj;")
	public static Class113 aClass113_1;

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
	public static int anInt706 = -1;

	@OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
	public static int anInt707 = 0;

	@OriginalMember(owner = "client!ck", name = "e", descriptor = "Z")
	public static boolean aBoolean27 = false;

	@OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
	public static int anInt708 = 0;

	@OriginalMember(owner = "client!ck", name = "h", descriptor = "Lclient!ia;")
	public static Class51 aClass51_220 = Static64.method1101("Ausw-=hlen");

	@OriginalMember(owner = "client!ck", name = "m", descriptor = "[I")
	public static int[] anIntArray45 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)Lclient!fc;")
	public static Class40 method546(@OriginalArg(1) int arg0) {
		@Pc(12) Class40 local12 = (Class40) Static22.aClass53_4.method1501((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(26) byte[] local26 = Static139.aClass70_30.method3509(Static116.method968(arg0), Static188.method3147(arg0));
		local12 = new Class40();
		if (local26 != null) {
			local12.method932(new Class1_Sub16(local26));
		}
		local12.method943();
		Static22.aClass53_4.method1497(local12, (long) arg0);
		return local12;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!wj;IIIIIIIZ)V")
	public static void method547(@OriginalArg(0) Class126 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static155.anInt3423;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static70.anInt1623;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(37) int local37 = Static20.anIntArrayArrayArray2[arg1][arg6][arg7] - Static115.anInt2533;
		@Pc(49) int local49 = Static20.anIntArrayArrayArray2[arg1][arg6 + 1][arg7] - Static115.anInt2533;
		@Pc(63) int local63 = Static20.anIntArrayArrayArray2[arg1][arg6 + 1][arg7 + 1] - Static115.anInt2533;
		@Pc(75) int local75 = Static20.anIntArrayArrayArray2[arg1][arg6][arg7 + 1] - Static115.anInt2533;
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
		@Pc(275) int local275 = Static171.anInt3826 + (local97 << 9) / local117;
		@Pc(283) int local283 = Static171.anInt3828 + (local119 << 9) / local117;
		@Pc(291) int local291 = Static171.anInt3826 + (local21 << 9) / local165;
		@Pc(299) int local299 = Static171.anInt3828 + (local49 << 9) / local165;
		@Pc(307) int local307 = Static171.anInt3826 + (local193 << 9) / local27;
		@Pc(315) int local315 = Static171.anInt3828 + (local63 << 9) / local27;
		@Pc(323) int local323 = Static171.anInt3826 + (local241 << 9) / local261;
		@Pc(331) int local331 = Static171.anInt3828 + (local85 << 9) / local261;
		Static171.anInt3830 = 0;
		@Pc(473) int local473;
		if ((local307 - local323) * (local299 - local331) - (local315 - local331) * (local291 - local323) > 0) {
			if (Static74.aBoolean75 && Static84.method1468(Static166.anInt3727 + Static171.anInt3826, Static88.anInt2019 + Static171.anInt3828, local315, local331, local299, local307, local323, local291)) {
				Static36.anInt872 = arg6;
				Static66.anInt1486 = arg7;
			}
			if (!arg8) {
				Static171.aBoolean179 = false;
				if (local307 < 0 || local323 < 0 || local291 < 0 || local307 > Static171.anInt3827 || local323 > Static171.anInt3827 || local291 > Static171.anInt3827) {
					Static171.aBoolean179 = true;
				}
				if (arg0.anInt4887 == -1) {
					if (arg0.anInt4882 != 12345678) {
						Static171.method2959(local315, local331, local299, local307, local323, local291, arg0.anInt4882, arg0.anInt4885, arg0.anInt4884);
					}
				} else if (!Static103.aBoolean214) {
					local473 = Static171.anInterface3_2.method128(arg0.anInt4887);
					Static171.method2959(local315, local331, local299, local307, local323, local291, Static21.method465(local473, arg0.anInt4882), Static21.method465(local473, arg0.anInt4885), Static21.method465(local473, arg0.anInt4884));
				} else if (arg0.aBoolean215) {
					Static171.method2962(local315, local331, local299, local307, local323, local291, arg0.anInt4882, arg0.anInt4885, arg0.anInt4884, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt4887);
				} else {
					Static171.method2962(local315, local331, local299, local307, local323, local291, arg0.anInt4882, arg0.anInt4885, arg0.anInt4884, local193, local241, local21, local63, local85, local49, local27, local261, local165, arg0.anInt4887);
				}
			}
		}
		if ((local275 - local291) * (local331 - local299) - (local283 - local299) * (local323 - local291) <= 0) {
			return;
		}
		if (Static74.aBoolean75 && Static84.method1468(Static166.anInt3727 + Static171.anInt3826, Static88.anInt2019 + Static171.anInt3828, local283, local299, local331, local275, local291, local323)) {
			Static36.anInt872 = arg6;
			Static66.anInt1486 = arg7;
		}
		if (arg8) {
			return;
		}
		Static171.aBoolean179 = false;
		if (local275 < 0 || local291 < 0 || local323 < 0 || local275 > Static171.anInt3827 || local291 > Static171.anInt3827 || local323 > Static171.anInt3827) {
			Static171.aBoolean179 = true;
		}
		if (arg0.anInt4887 != -1) {
			if (Static103.aBoolean214) {
				Static171.method2962(local283, local299, local331, local275, local291, local323, arg0.anInt4883, arg0.anInt4884, arg0.anInt4885, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt4887);
				return;
			}
			local473 = Static171.anInterface3_2.method128(arg0.anInt4887);
			Static171.method2959(local283, local299, local331, local275, local291, local323, Static21.method465(local473, arg0.anInt4883), Static21.method465(local473, arg0.anInt4884), Static21.method465(local473, arg0.anInt4885));
		} else if (arg0.anInt4883 != 12345678) {
			Static171.method2959(local283, local299, local331, local275, local291, local323, arg0.anInt4883, arg0.anInt4884, arg0.anInt4885);
			return;
		}
	}
}
