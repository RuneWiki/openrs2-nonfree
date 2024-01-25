import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_122 = new Class263(47, 6);

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "F")
	public static float aFloat83 = 0.0F;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)Z")
	public static boolean method3956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static407.method2043(arg0, arg1) | (arg0 & 0x70000) != 0 || Static157.method2625(arg0, arg1);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIBI[ILclient!ir;IIIIIZ[II)I")
	public static int method3957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) Class120 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) boolean arg11, @OriginalArg(13) int[] arg12, @OriginalArg(14) int arg13) {
		for (@Pc(1) int local1 = 0; local1 < 128; local1++) {
			for (@Pc(4) int local4 = 0; local4 < 128; local4++) {
				Static75.anIntArrayArray19[local1][local4] = 0;
				Static343.anIntArrayArray50[local1][local4] = 99999999;
			}
		}
		@Pc(56) boolean local56;
		if (arg9 == 1) {
			local56 = Static31.method1537(arg5, arg10, arg3, arg8, arg0, arg1, arg6, arg2, arg13, arg7);
		} else if (arg9 == 2) {
			local56 = Static406.method3596(arg2, arg13, arg3, arg7, arg6, arg1, arg5, arg0, arg10, arg8);
		} else {
			local56 = Static248.method3708(arg13, arg3, arg6, arg9, arg8, arg10, arg2, arg7, arg0, arg5, arg1);
		}
		@Pc(88) int local88 = arg6 - 64;
		@Pc(92) int local92 = arg7 - 64;
		@Pc(94) int local94 = Static94.anInt2261;
		@Pc(96) int local96 = Static56.anInt1510;
		@Pc(104) int local104;
		@Pc(106) int local106;
		@Pc(113) int local113;
		if (!local56) {
			if (!arg11) {
				return -1;
			}
			local104 = Integer.MAX_VALUE;
			local106 = Integer.MAX_VALUE;
			for (local113 = arg3 - 10; local113 <= arg3 + 10; local113++) {
				for (@Pc(119) int local119 = arg1 - 10; local119 <= arg1 + 10; local119++) {
					@Pc(124) int local124 = local113 - local88;
					@Pc(128) int local128 = local119 - local92;
					if (local124 >= 0 && local128 >= 0 && local124 < 128 && local128 < 128 && Static343.anIntArrayArray50[local124][local128] < 100) {
						@Pc(155) int local155 = 0;
						if (arg3 > local113) {
							local155 = arg3 - local113;
						} else if (arg10 + arg3 - 1 < local113) {
							local155 = local113 + 1 - arg3 - arg10;
						}
						@Pc(187) int local187 = 0;
						if (arg1 > local119) {
							local187 = arg1 - local119;
						} else if (local119 > arg1 + arg13 - 1) {
							local187 = local119 + 1 - arg1 - arg13;
						}
						@Pc(228) int local228 = local187 * local187 + local155 * local155;
						if (local104 > local228 || local228 == local104 && Static343.anIntArrayArray50[local124][local128] < local106) {
							local106 = Static343.anIntArrayArray50[local124][local128];
							local104 = local228;
							local96 = local119;
							local94 = local113;
						}
					}
				}
			}
			if (local104 == Integer.MAX_VALUE) {
				return -1;
			}
		}
		if (local94 == arg6 && arg7 == local96) {
			return 0;
		}
		@Pc(297) byte local297 = 0;
		Static367.anIntArray618[0] = local94;
		local104 = local297 + 1;
		Static386.anIntArray669[0] = local96;
		@Pc(318) int local318;
		local106 = local318 = Static75.anIntArrayArray19[local94 - local88][local96 - local92];
		while (local94 != arg6 || local96 != arg7) {
			if (local318 != local106) {
				local318 = local106;
				Static367.anIntArray618[local104] = local94;
				Static386.anIntArray669[local104++] = local96;
			}
			if ((local106 & 0x1) != 0) {
				local96++;
			} else if ((local106 & 0x4) != 0) {
				local96--;
			}
			if ((local106 & 0x2) != 0) {
				local94++;
			} else if ((local106 & 0x8) != 0) {
				local94--;
			}
			local106 = Static75.anIntArrayArray19[local94 - local88][local96 - local92];
		}
		local113 = 0;
		while (local104-- > 0) {
			arg4[local113] = Static367.anIntArray618[local104];
			arg12[local113++] = Static386.anIntArray669[local104];
			if (arg4.length <= local113) {
				break;
			}
		}
		return local113;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(CI)Z")
	public static boolean method3958(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
