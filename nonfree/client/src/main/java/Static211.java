import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!va", name = "b", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!va", name = "d", descriptor = "Lclient!nc;")
	public static Class2_Sub3_Sub7 aClass2_Sub3_Sub7_3;

	@OriginalMember(owner = "client!va", name = "g", descriptor = "Lclient!t;")
	public static Class88 aClass88_4;

	@OriginalMember(owner = "client!va", name = "q", descriptor = "I")
	public static int anInt4652;

	@OriginalMember(owner = "client!va", name = "h", descriptor = "I")
	public static int anInt4647 = 0;

	@OriginalMember(owner = "client!va", name = "r", descriptor = "Lclient!qe;")
	public static Class78 aClass78_824 = Static199.method3560("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!di;IIIIIIIZ)V")
	public static void method3687(@OriginalArg(0) Class26 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static181.anInt4199;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static59.anInt1039;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(37) int local37 = Static144.anIntArrayArrayArray7[arg1][arg6][arg7] - Static53.anInt1723;
		@Pc(49) int local49 = Static144.anIntArrayArrayArray7[arg1][arg6 + 1][arg7] - Static53.anInt1723;
		@Pc(63) int local63 = Static144.anIntArrayArrayArray7[arg1][arg6 + 1][arg7 + 1] - Static53.anInt1723;
		@Pc(75) int local75 = Static144.anIntArrayArrayArray7[arg1][arg6][arg7 + 1] - Static53.anInt1723;
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
		@Pc(275) int local275 = Static163.anInt3760 + (local97 << 9) / local117;
		@Pc(283) int local283 = Static163.anInt3759 + (local119 << 9) / local117;
		@Pc(291) int local291 = Static163.anInt3760 + (local21 << 9) / local165;
		@Pc(299) int local299 = Static163.anInt3759 + (local49 << 9) / local165;
		@Pc(307) int local307 = Static163.anInt3760 + (local193 << 9) / local27;
		@Pc(315) int local315 = Static163.anInt3759 + (local63 << 9) / local27;
		@Pc(323) int local323 = Static163.anInt3760 + (local241 << 9) / local261;
		@Pc(331) int local331 = Static163.anInt3759 + (local85 << 9) / local261;
		Static163.anInt3758 = 0;
		@Pc(473) int local473;
		if ((local307 - local323) * (local299 - local331) - (local315 - local331) * (local291 - local323) > 0) {
			if (Static194.aBoolean191 && Static195.method3538(Static113.anInt2494 + Static163.anInt3760, Static225.anInt4883 + Static163.anInt3759, local315, local331, local299, local307, local323, local291)) {
				Static219.anInt4760 = arg6;
				Static84.anInt1809 = arg7;
			}
			if (!arg8) {
				Static163.aBoolean165 = false;
				if (local307 < 0 || local323 < 0 || local291 < 0 || local307 > Static163.anInt3756 || local323 > Static163.anInt3756 || local291 > Static163.anInt3756) {
					Static163.aBoolean165 = true;
				}
				if (arg0.anInt798 == -1) {
					if (arg0.anInt803 != 12345678) {
						Static163.method2943(local315, local331, local299, local307, local323, local291, arg0.anInt803, arg0.anInt805, arg0.anInt796);
					}
				} else if (!Static175.aBoolean175) {
					local473 = Static163.anInterface4_1.method759(arg0.anInt798);
					Static163.method2943(local315, local331, local299, local307, local323, local291, Static188.method3480(local473, arg0.anInt803), Static188.method3480(local473, arg0.anInt805), Static188.method3480(local473, arg0.anInt796));
				} else if (arg0.aBoolean32) {
					Static163.method2947(local315, local331, local299, local307, local323, local291, arg0.anInt803, arg0.anInt805, arg0.anInt796, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt798);
				} else {
					Static163.method2947(local315, local331, local299, local307, local323, local291, arg0.anInt803, arg0.anInt805, arg0.anInt796, local193, local241, local21, local63, local85, local49, local27, local261, local165, arg0.anInt798);
				}
			}
		}
		if ((local275 - local291) * (local331 - local299) - (local283 - local299) * (local323 - local291) <= 0) {
			return;
		}
		if (Static194.aBoolean191 && Static195.method3538(Static113.anInt2494 + Static163.anInt3760, Static225.anInt4883 + Static163.anInt3759, local283, local299, local331, local275, local291, local323)) {
			Static219.anInt4760 = arg6;
			Static84.anInt1809 = arg7;
		}
		if (arg8) {
			return;
		}
		Static163.aBoolean165 = false;
		if (local275 < 0 || local291 < 0 || local323 < 0 || local275 > Static163.anInt3756 || local291 > Static163.anInt3756 || local323 > Static163.anInt3756) {
			Static163.aBoolean165 = true;
		}
		if (arg0.anInt798 != -1) {
			if (Static175.aBoolean175) {
				Static163.method2947(local283, local299, local331, local275, local291, local323, arg0.anInt800, arg0.anInt796, arg0.anInt805, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt798);
				return;
			}
			local473 = Static163.anInterface4_1.method759(arg0.anInt798);
			Static163.method2943(local283, local299, local331, local275, local291, local323, Static188.method3480(local473, arg0.anInt800), Static188.method3480(local473, arg0.anInt796), Static188.method3480(local473, arg0.anInt805));
		} else if (arg0.anInt800 != 12345678) {
			Static163.method2943(local283, local299, local331, local275, local291, local323, arg0.anInt800, arg0.anInt796, arg0.anInt805);
			return;
		}
	}
}
