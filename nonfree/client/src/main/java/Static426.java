import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static426 {

	@OriginalMember(owner = "client!ph", name = "J", descriptor = "Lclient!eha;")
	public static Class91 aClass91_8;

	@OriginalMember(owner = "client!ph", name = "I", descriptor = "Z")
	public static boolean aBoolean524 = false;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIZIIILclient!up;[II[IIII)I")
	public static int method6544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class352 arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		for (@Pc(3) int local3 = 0; local3 < 128; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
				Static499.anIntArrayArray72[local3][local7] = 0;
				Static348.anIntArrayArray44[local3][local7] = 99999999;
			}
		}
		@Pc(53) boolean local53;
		if (arg5 == 1) {
			local53 = Static104.method1657(arg7, arg1, arg0, arg10, arg13, arg3, arg2, arg6, arg8, arg12);
		} else if (arg5 == 2) {
			local53 = Static80.method1363(arg2, arg8, arg0, arg13, arg3, arg7, arg1, arg6, arg12, arg10);
		} else {
			local53 = Static278.method4438(arg1, arg8, arg7, arg6, arg13, arg3, arg12, arg10, arg2, arg0, arg5);
		}
		@Pc(91) int local91 = arg0 - 64;
		@Pc(95) int local95 = arg3 - 64;
		@Pc(97) int local97 = Static199.anInt3913;
		@Pc(99) int local99 = Static541.anInt9200;
		@Pc(105) int local105;
		@Pc(107) int local107;
		@Pc(113) int local113;
		if (!local53) {
			if (!arg4) {
				return -1;
			}
			local105 = Integer.MAX_VALUE;
			local107 = Integer.MAX_VALUE;
			for (local113 = arg7 - 10; local113 <= arg7 + 10; local113++) {
				for (@Pc(120) int local120 = arg1 - 10; local120 <= arg1 + 10; local120++) {
					@Pc(126) int local126 = local113 - local91;
					@Pc(130) int local130 = local120 - local95;
					if (local126 >= 0 && local130 >= 0 && local126 < 128 && local130 < 128 && Static348.anIntArrayArray44[local126][local130] < 100) {
						@Pc(156) int local156 = 0;
						if (arg7 > local113) {
							local156 = arg7 - local113;
						} else if (local113 > arg2 + arg7 - 1) {
							local156 = local113 + 1 - arg7 - arg2;
						}
						@Pc(188) int local188 = 0;
						if (local120 < arg1) {
							local188 = arg1 - local120;
						} else if (local120 > arg13 + arg1 - 1) {
							local188 = local120 + 1 - arg1 - arg13;
						}
						@Pc(227) int local227 = local156 * local156 + local188 * local188;
						if (local105 > local227 || local227 == local105 && local107 > Static348.anIntArrayArray44[local126][local130]) {
							local107 = Static348.anIntArrayArray44[local126][local130];
							local97 = local113;
							local105 = local227;
							local99 = local120;
						}
					}
				}
			}
			if (~local105 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (arg0 == local97 && local99 == arg3) {
			return 0;
		}
		@Pc(287) byte local287 = 0;
		Static120.anIntArray137[0] = local97;
		local105 = local287 + 1;
		Static330.anIntArray303[0] = local99;
		@Pc(308) int local308;
		local107 = local308 = Static499.anIntArrayArray72[local97 - local91][local99 - local95];
		while (arg0 != local97 || arg3 != local99) {
			if (local107 != local308) {
				local308 = local107;
				Static120.anIntArray137[local105] = local97;
				Static330.anIntArray303[local105++] = local99;
			}
			if ((local107 & 0x2) != 0) {
				local97++;
			} else if ((local107 & 0x8) != 0) {
				local97--;
			}
			if ((local107 & 0x1) != 0) {
				local99++;
			} else if ((local107 & 0x4) != 0) {
				local99--;
			}
			local107 = Static499.anIntArrayArray72[local97 - local91][local99 - local95];
		}
		local113 = 0;
		while (local105-- > 0) {
			arg9[local113] = Static120.anIntArray137[local105];
			arg11[local113++] = Static330.anIntArray303[local105];
			if (arg9.length <= local113) {
				break;
			}
		}
		return local113;
	}
}
