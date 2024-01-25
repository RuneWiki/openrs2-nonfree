import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static526 {

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "J")
	public static long aLong257;

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "[I")
	public static int[] anIntArray581;

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
	public static int anInt8690;

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
	public static int anInt8686 = -1;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)I")
	public static int method7372() {
		return Static27.anInt7651;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IILclient!sha;I)V")
	public static void method7373(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class321 arg2) {
		Static662.aClass321_54 = arg2;
		Static96.anInt1740 = arg0;
		Static184.anInt3170 = arg1;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(III[IIIIIIILclient!sn;ZII[I)I")
	public static int method7374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class324 arg10, @OriginalArg(11) boolean arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int[] arg13) {
		for (@Pc(11) int local11 = 0; local11 < 128; local11++) {
			for (@Pc(15) int local15 = 0; local15 < 128; local15++) {
				Static394.anIntArrayArray35[local11][local15] = 0;
				Static358.anIntArrayArray33[local11][local15] = 99999999;
			}
		}
		@Pc(62) boolean local62;
		if (arg5 == 1) {
			local62 = Static375.method5343(arg6, arg12, arg4, arg10, arg7, arg2, arg8, arg1, arg0, arg9);
		} else if (arg5 == 2) {
			local62 = Static483.method7042(arg9, arg1, arg12, arg6, arg8, arg4, arg7, arg0, arg2, arg10);
		} else {
			local62 = Static273.method4025(arg8, arg9, arg1, arg6, arg2, arg0, arg10, arg5, arg12, arg4, arg7);
		}
		@Pc(97) int local97 = arg0 - 64;
		@Pc(101) int local101 = arg4 - 64;
		@Pc(103) int local103 = Static520.anInt9403;
		@Pc(105) int local105 = Static51.anInt1061;
		@Pc(111) int local111;
		@Pc(113) int local113;
		@Pc(120) int local120;
		if (!local62) {
			if (!arg11) {
				return -1;
			}
			local111 = Integer.MAX_VALUE;
			local113 = Integer.MAX_VALUE;
			for (local120 = arg8 - 10; local120 <= arg8 + 10; local120++) {
				for (@Pc(127) int local127 = arg1 - 10; local127 <= arg1 + 10; local127++) {
					@Pc(134) int local134 = local120 - local97;
					@Pc(139) int local139 = local127 - local101;
					if (local134 >= 0 && local139 >= 0 && local134 < 128 && local139 < 128 && Static358.anIntArrayArray33[local134][local139] < 100) {
						@Pc(167) int local167 = 0;
						if (local120 < arg8) {
							local167 = arg8 - local120;
						} else if (local120 > arg6 + arg8 - 1) {
							local167 = local120 + 1 - arg8 - arg6;
						}
						@Pc(195) int local195 = 0;
						if (local127 < arg1) {
							local195 = arg1 - local127;
						} else if (local127 > arg7 + arg1 - 1) {
							local195 = local127 + 1 - arg1 - arg7;
						}
						@Pc(232) int local232 = local195 * local195 + local167 * local167;
						if (local232 < local111 || local232 == local111 && local113 > Static358.anIntArrayArray33[local134][local139]) {
							local113 = Static358.anIntArrayArray33[local134][local139];
							local111 = local232;
							local105 = local127;
							local103 = local120;
						}
					}
				}
			}
			if (~local111 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (arg0 == local103 && local105 == arg4) {
			return 0;
		}
		@Pc(301) byte local301 = 0;
		Static233.anIntArray251[0] = local103;
		local111 = local301 + 1;
		Static436.anIntArray495[0] = local105;
		@Pc(322) int local322;
		local113 = local322 = Static394.anIntArrayArray35[local103 - local97][local105 - local101];
		while (local103 != arg0 || arg4 != local105) {
			if (local322 != local113) {
				Static233.anIntArray251[local111] = local103;
				local322 = local113;
				Static436.anIntArray495[local111++] = local105;
			}
			if ((local113 & 0x2) != 0) {
				local103++;
			} else if ((local113 & 0x8) != 0) {
				local103--;
			}
			if ((local113 & 0x1) != 0) {
				local105++;
			} else if ((local113 & 0x4) != 0) {
				local105--;
			}
			local113 = Static394.anIntArrayArray35[local103 - local97][local105 - local101];
		}
		local120 = 0;
		while (local111-- > 0) {
			arg13[local120] = Static233.anIntArray251[local111];
			arg3[local120++] = Static436.anIntArray495[local111];
			if (local120 >= arg13.length) {
				break;
			}
		}
		return local120;
	}
}
