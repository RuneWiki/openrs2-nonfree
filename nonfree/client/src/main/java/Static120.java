import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!le", name = "E", descriptor = "Lclient!v;")
	public static Class86_Sub1 aClass86_Sub1_27;

	@OriginalMember(owner = "client!le", name = "J", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!le", name = "P", descriptor = "[I")
	public static int[] anIntArray265 = new int[] { 12543016, 15504954, 15914854, 16773818 };

	@OriginalMember(owner = "client!le", name = "Y", descriptor = "Lclient!hh;")
	private static Class50 aClass50_823 = Static186.method3527("Members object");

	@OriginalMember(owner = "client!le", name = "R", descriptor = "Lclient!hh;")
	public static Class50 aClass50_821 = aClass50_823;

	@OriginalMember(owner = "client!le", name = "X", descriptor = "Lclient!hh;")
	public static Class50 aClass50_822 = Static186.method3527("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(III)Z")
	public static boolean method1907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static166.anInt3403; local1++) {
			@Pc(6) Class95 local6 = Static199.aClass95Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt3708 == 1) {
				local15 = local6.anInt3698 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt3711 + (local6.anInt3710 * local15 >> 8);
					local37 = local6.anInt3707 + (local6.anInt3699 * local15 >> 8);
					local47 = local6.anInt3714 + (local6.anInt3704 * local15 >> 8);
					local57 = local6.anInt3705 + (local6.anInt3695 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3708 == 2) {
				local15 = arg0 - local6.anInt3698;
				if (local15 > 0) {
					local27 = local6.anInt3711 + (local6.anInt3710 * local15 >> 8);
					local37 = local6.anInt3707 + (local6.anInt3699 * local15 >> 8);
					local47 = local6.anInt3714 + (local6.anInt3704 * local15 >> 8);
					local57 = local6.anInt3705 + (local6.anInt3695 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3708 == 3) {
				local15 = local6.anInt3711 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt3698 + (local6.anInt3703 * local15 >> 8);
					local37 = local6.anInt3713 + (local6.anInt3697 * local15 >> 8);
					local47 = local6.anInt3714 + (local6.anInt3704 * local15 >> 8);
					local57 = local6.anInt3705 + (local6.anInt3695 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3708 == 4) {
				local15 = arg2 - local6.anInt3711;
				if (local15 > 0) {
					local27 = local6.anInt3698 + (local6.anInt3703 * local15 >> 8);
					local37 = local6.anInt3713 + (local6.anInt3697 * local15 >> 8);
					local47 = local6.anInt3714 + (local6.anInt3704 * local15 >> 8);
					local57 = local6.anInt3705 + (local6.anInt3695 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3708 == 5) {
				local15 = arg1 - local6.anInt3714;
				if (local15 > 0) {
					local27 = local6.anInt3698 + (local6.anInt3703 * local15 >> 8);
					local37 = local6.anInt3713 + (local6.anInt3697 * local15 >> 8);
					local47 = local6.anInt3711 + (local6.anInt3710 * local15 >> 8);
					local57 = local6.anInt3707 + (local6.anInt3699 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIII)I")
	public static int method1908(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 > 243) {
			arg2 >>= 0x4;
		} else if (arg1 > 217) {
			arg2 >>= 0x3;
		} else if (arg1 > 192) {
			arg2 >>= 0x2;
		} else if (arg1 > 179) {
			arg2 >>= 0x1;
		}
		return (arg1 >> 1) + (arg2 >> 5 << 7) + (arg0 >> 2 << 10);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!te;IIIIIIIZ)V")
	public static void method1909(@OriginalArg(0) Class111 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static85.anInt1761;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static221.anInt4311;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(37) int local37 = Static119.anIntArrayArrayArray10[arg1][arg6][arg7] - Static131.anInt2716;
		@Pc(49) int local49 = Static119.anIntArrayArrayArray10[arg1][arg6 + 1][arg7] - Static131.anInt2716;
		@Pc(63) int local63 = Static119.anIntArrayArrayArray10[arg1][arg6 + 1][arg7 + 1] - Static131.anInt2716;
		@Pc(75) int local75 = Static119.anIntArrayArrayArray10[arg1][arg6][arg7 + 1] - Static131.anInt2716;
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
		@Pc(275) int local275 = Static215.anInt4264 + (local97 << 9) / local117;
		@Pc(283) int local283 = Static215.anInt4266 + (local119 << 9) / local117;
		@Pc(291) int local291 = Static215.anInt4264 + (local21 << 9) / local165;
		@Pc(299) int local299 = Static215.anInt4266 + (local49 << 9) / local165;
		@Pc(307) int local307 = Static215.anInt4264 + (local193 << 9) / local27;
		@Pc(315) int local315 = Static215.anInt4266 + (local63 << 9) / local27;
		@Pc(323) int local323 = Static215.anInt4264 + (local241 << 9) / local261;
		@Pc(331) int local331 = Static215.anInt4266 + (local85 << 9) / local261;
		Static215.anInt4265 = 0;
		@Pc(473) int local473;
		if ((local307 - local323) * (local299 - local331) - (local315 - local331) * (local291 - local323) > 0) {
			if (Static183.aBoolean171 && Static18.method267(Static58.anInt1157 + Static215.anInt4264, Static145.anInt2964 + Static215.anInt4266, local315, local331, local299, local307, local323, local291)) {
				Static218.anInt3570 = arg6;
				Static63.anInt1255 = arg7;
			}
			if (!arg8) {
				Static215.aBoolean203 = false;
				if (local307 < 0 || local323 < 0 || local291 < 0 || local307 > Static215.anInt4267 || local323 > Static215.anInt4267 || local291 > Static215.anInt4267) {
					Static215.aBoolean203 = true;
				}
				if (arg0.anInt4065 == -1) {
					if (arg0.anInt4062 != 12345678) {
						Static215.method3358(local315, local331, local299, local307, local323, local291, arg0.anInt4062, arg0.anInt4056, arg0.anInt4055);
					}
				} else if (!Static148.aBoolean130) {
					local473 = Static215.anInterface4_3.method2508(arg0.anInt4065);
					Static215.method3358(local315, local331, local299, local307, local323, local291, Static52.method2675(local473, arg0.anInt4062), Static52.method2675(local473, arg0.anInt4056), Static52.method2675(local473, arg0.anInt4055));
				} else if (arg0.aBoolean191) {
					Static215.method3364(local315, local331, local299, local307, local323, local291, arg0.anInt4062, arg0.anInt4056, arg0.anInt4055, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt4065);
				} else {
					Static215.method3364(local315, local331, local299, local307, local323, local291, arg0.anInt4062, arg0.anInt4056, arg0.anInt4055, local193, local241, local21, local63, local85, local49, local27, local261, local165, arg0.anInt4065);
				}
			}
		}
		if ((local275 - local291) * (local331 - local299) - (local283 - local299) * (local323 - local291) <= 0) {
			return;
		}
		if (Static183.aBoolean171 && Static18.method267(Static58.anInt1157 + Static215.anInt4264, Static145.anInt2964 + Static215.anInt4266, local283, local299, local331, local275, local291, local323)) {
			Static218.anInt3570 = arg6;
			Static63.anInt1255 = arg7;
		}
		if (arg8) {
			return;
		}
		Static215.aBoolean203 = false;
		if (local275 < 0 || local291 < 0 || local323 < 0 || local275 > Static215.anInt4267 || local291 > Static215.anInt4267 || local323 > Static215.anInt4267) {
			Static215.aBoolean203 = true;
		}
		if (arg0.anInt4065 != -1) {
			if (Static148.aBoolean130) {
				Static215.method3364(local283, local299, local331, local275, local291, local323, arg0.anInt4059, arg0.anInt4055, arg0.anInt4056, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt4065);
				return;
			}
			local473 = Static215.anInterface4_3.method2508(arg0.anInt4065);
			Static215.method3358(local283, local299, local331, local275, local291, local323, Static52.method2675(local473, arg0.anInt4059), Static52.method2675(local473, arg0.anInt4055), Static52.method2675(local473, arg0.anInt4056));
		} else if (arg0.anInt4059 != 12345678) {
			Static215.method3358(local283, local299, local331, local275, local291, local323, arg0.anInt4059, arg0.anInt4055, arg0.anInt4056);
			return;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IILclient!pa;)Lclient!cd;")
	public static Class1_Sub7 method1920(@OriginalArg(0) int arg0, @OriginalArg(2) Class86 arg1) {
		@Pc(8) byte[] local8 = arg1.method3320(arg0);
		return local8 == null ? null : new Class1_Sub7(local8);
	}
}
