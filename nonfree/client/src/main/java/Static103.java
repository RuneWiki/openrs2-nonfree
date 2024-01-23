import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!hb", name = "jb", descriptor = "F")
	public static float aFloat32;

	@OriginalMember(owner = "client!hb", name = "kb", descriptor = "[I")
	public static int[] anIntArray192 = new int[1000];

	@OriginalMember(owner = "client!hb", name = "lb", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray19 = new String[500];

	@OriginalMember(owner = "client!hb", name = "ob", descriptor = "J")
	public static long aLong74 = 0L;

	@OriginalMember(owner = "client!hb", name = "pb", descriptor = "[Lclient!d;")
	public static Class10_Sub3[] aClass10_Sub3Array1 = new Class10_Sub3[4];

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(B)V")
	public static void method1664() {
		@Pc(4) int local4 = Static284.method4678();
		if (local4 == 0) {
			Static126.aByteArrayArrayArray15 = null;
			Static124.method2077(0);
		} else if (local4 == 1) {
			Static99.method1578((byte) 0);
			Static124.method2077(512);
			if (Static41.aByteArrayArrayArray2 != null) {
				Static45.method683();
			}
		} else {
			Static99.method1578((byte) (Static289.anInt5783 - 4 & 0xFF));
			Static124.method2077(2);
		}
		Static130.anInt2465 = Static99.anInt1826;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BIIII)V")
	public static void method1666(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= Static175.anInt3267 && Static204.anInt4020 >= arg2) {
			@Pc(21) int local21 = Static167.method2786(arg3, Static111.anInt2039, Static245.anInt6027);
			@Pc(27) int local27 = Static167.method2786(arg1, Static111.anInt2039, Static245.anInt6027);
			Static156.method2600(arg2, local21, local27, arg0);
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIII)V")
	public static void method1667(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static235.method3988(arg3, Static129.anIntArrayArray40[arg1], arg2 + arg0, -arg0 + arg2);
		@Pc(20) int local20 = 0;
		@Pc(28) int local28 = arg0;
		@Pc(31) int local31 = -arg0;
		@Pc(33) int local33 = -1;
		while (local28 > local20) {
			local33 += 2;
			local20++;
			local31 += local33;
			if (local31 >= 0) {
				local28--;
				@Pc(56) int[] local56 = Static129.anIntArrayArray40[arg1 + local28];
				local31 -= local28 << 1;
				@Pc(66) int local66 = local20 + arg2;
				@Pc(70) int local70 = arg2 - local20;
				@Pc(77) int[] local77 = Static129.anIntArrayArray40[arg1 - local28];
				Static235.method3988(arg3, local56, local66, local70);
				Static235.method3988(arg3, local77, local66, local70);
			}
			@Pc(93) int local93 = local28 + arg2;
			@Pc(98) int local98 = arg2 - local28;
			@Pc(104) int[] local104 = Static129.anIntArrayArray40[local20 + arg1];
			@Pc(111) int[] local111 = Static129.anIntArrayArray40[arg1 - local20];
			Static235.method3988(arg3, local104, local93, local98);
			Static235.method3988(arg3, local111, local93, local98);
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!md;IIIIIIIZ)V")
	public static void method1668(@OriginalArg(0) Class110 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static282.anInt5668;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static104.anInt1924;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(37) int local37 = Static256.anIntArrayArrayArray14[arg1][arg6][arg7] - Static112.anInt5733;
		@Pc(49) int local49 = Static256.anIntArrayArrayArray14[arg1][arg6 + 1][arg7] - Static112.anInt5733;
		@Pc(63) int local63 = Static256.anIntArrayArrayArray14[arg1][arg6 + 1][arg7 + 1] - Static112.anInt5733;
		@Pc(75) int local75 = Static256.anIntArrayArrayArray14[arg1][arg6][arg7 + 1] - Static112.anInt5733;
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
		@Pc(275) int local275 = Static16.anInt325 + (local97 << 9) / local117;
		@Pc(283) int local283 = Static16.anInt324 + (local119 << 9) / local117;
		@Pc(291) int local291 = Static16.anInt325 + (local21 << 9) / local165;
		@Pc(299) int local299 = Static16.anInt324 + (local49 << 9) / local165;
		@Pc(307) int local307 = Static16.anInt325 + (local193 << 9) / local27;
		@Pc(315) int local315 = Static16.anInt324 + (local63 << 9) / local27;
		@Pc(323) int local323 = Static16.anInt325 + (local241 << 9) / local261;
		@Pc(331) int local331 = Static16.anInt324 + (local85 << 9) / local261;
		Static16.anInt321 = 0;
		@Pc(475) int local475;
		if ((local307 - local323) * (local299 - local331) - (local315 - local331) * (local291 - local323) > 0) {
			if (Static5.aBoolean8 && Static302.method4882(Static2.anInt34 + Static16.anInt325, Static278.anInt5067 + Static16.anInt324, local315, local331, local299, local307, local323, local291)) {
				Static115.anInt2150 = arg6;
				Static76.anInt1448 = arg7;
			}
			if (!Static283.aBoolean393 && !arg8) {
				Static16.aBoolean26 = false;
				if (local307 < 0 || local323 < 0 || local291 < 0 || local307 > Static16.anInt322 || local323 > Static16.anInt322 || local291 > Static16.anInt322) {
					Static16.aBoolean26 = true;
				}
				if (arg0.anInt3165 == -1) {
					if (arg0.anInt3169 != 12345678) {
						Static16.method283(local315, local331, local299, local307, local323, local291, arg0.anInt3169, arg0.anInt3168, arg0.anInt3160);
					}
				} else if (!Static241.aBoolean341) {
					local475 = Static16.anInterface4_1.method2906(arg0.anInt3165);
					Static16.method283(local315, local331, local299, local307, local323, local291, Static59.method967(local475, arg0.anInt3169), Static59.method967(local475, arg0.anInt3168), Static59.method967(local475, arg0.anInt3160));
				} else if (arg0.aBoolean228) {
					Static16.method287(local315, local331, local299, local307, local323, local291, arg0.anInt3169, arg0.anInt3168, arg0.anInt3160, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt3165);
				} else {
					Static16.method287(local315, local331, local299, local307, local323, local291, arg0.anInt3169, arg0.anInt3168, arg0.anInt3160, local193, local241, local21, local63, local85, local49, local27, local261, local165, arg0.anInt3165);
				}
			}
		}
		if ((local275 - local291) * (local331 - local299) - (local283 - local299) * (local323 - local291) <= 0) {
			return;
		}
		if (Static5.aBoolean8 && Static302.method4882(Static2.anInt34 + Static16.anInt325, Static278.anInt5067 + Static16.anInt324, local283, local299, local331, local275, local291, local323)) {
			Static115.anInt2150 = arg6;
			Static76.anInt1448 = arg7;
		}
		if (Static283.aBoolean393 || arg8) {
			return;
		}
		Static16.aBoolean26 = false;
		if (local275 < 0 || local291 < 0 || local323 < 0 || local275 > Static16.anInt322 || local291 > Static16.anInt322 || local323 > Static16.anInt322) {
			Static16.aBoolean26 = true;
		}
		if (arg0.anInt3165 == -1) {
			if (arg0.anInt3162 != 12345678) {
				Static16.method283(local283, local299, local331, local275, local291, local323, arg0.anInt3162, arg0.anInt3160, arg0.anInt3168);
			}
		} else if (Static241.aBoolean341) {
			Static16.method287(local283, local299, local331, local275, local291, local323, arg0.anInt3162, arg0.anInt3160, arg0.anInt3168, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt3165);
		} else {
			local475 = Static16.anInterface4_1.method2906(arg0.anInt3165);
			Static16.method283(local283, local299, local331, local275, local291, local323, Static59.method967(local475, arg0.anInt3162), Static59.method967(local475, arg0.anInt3160), Static59.method967(local475, arg0.anInt3168));
		}
	}
}
