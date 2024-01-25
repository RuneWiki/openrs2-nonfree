import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static544 {

	@OriginalMember(owner = "client!ul", name = "x", descriptor = "Lclient!f;")
	public static Class73 aClass73_39;

	@OriginalMember(owner = "client!ul", name = "p", descriptor = "I")
	public static int anInt9502 = 0;

	@OriginalMember(owner = "client!ul", name = "w", descriptor = "[[I")
	public static final int[][] anIntArrayArray96 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!ul", name = "y", descriptor = "[Z")
	public static final boolean[] aBooleanArray32 = new boolean[100];

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/lang/Object;III)[B")
	public static byte[] method7462(@OriginalArg(0) Object arg0, @OriginalArg(3) int arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg0;
			return Static413.method5789(local13, arg1);
		} else if (arg0 instanceof Class28) {
			@Pc(25) Class28 local25 = (Class28) arg0;
			return local25.method2609(arg1);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIII[IILclient!nc;[IIIZIBII)I")
	public static int method7464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class220 arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 128; local11++) {
				Static418.anIntArrayArray75[local7][local11] = 0;
				Static360.anIntArrayArray105[local7][local11] = 99999999;
			}
		}
		@Pc(59) boolean local59;
		if (arg12 == 1) {
			local59 = Static219.method3674(arg2, arg9, arg1, arg3, arg0, arg6, arg5, arg8, arg13, arg11);
		} else if (arg12 == 2) {
			local59 = Static76.method3896(arg1, arg5, arg13, arg6, arg9, arg11, arg8, arg3, arg0, arg2);
		} else {
			local59 = Static131.method2515(arg2, arg12, arg3, arg5, arg6, arg0, arg13, arg9, arg11, arg1, arg8);
		}
		@Pc(97) int local97 = arg8 - 64;
		@Pc(101) int local101 = arg11 - 64;
		@Pc(103) int local103 = Static395.anInt6981;
		@Pc(105) int local105 = Static454.anInt7943;
		@Pc(113) int local113;
		@Pc(115) int local115;
		@Pc(122) int local122;
		if (!local59) {
			if (!arg10) {
				return -1;
			}
			local113 = Integer.MAX_VALUE;
			local115 = Integer.MAX_VALUE;
			for (local122 = arg2 - 10; local122 <= arg2 + 10; local122++) {
				for (@Pc(129) int local129 = arg9 - 10; local129 <= arg9 + 10; local129++) {
					@Pc(136) int local136 = local122 - local97;
					@Pc(140) int local140 = local129 - local101;
					if (local136 >= 0 && local140 >= 0 && local136 < 128 && local140 < 128 && Static360.anIntArrayArray105[local136][local140] < 100) {
						@Pc(162) int local162 = 0;
						if (local122 < arg2) {
							local162 = arg2 - local122;
						} else if (arg5 + arg2 - 1 < local122) {
							local162 = local122 + 1 - arg5 - arg2;
						}
						@Pc(197) int local197 = 0;
						if (arg9 > local129) {
							local197 = arg9 - local129;
						} else if (arg13 + arg9 - 1 < local129) {
							local197 = local129 + 1 - arg13 - arg9;
						}
						@Pc(240) int local240 = local197 * local197 + local162 * local162;
						if (local240 < local113 || local113 == local240 && local115 > Static360.anIntArrayArray105[local136][local140]) {
							local103 = local122;
							local113 = local240;
							local105 = local129;
							local115 = Static360.anIntArrayArray105[local136][local140];
						}
					}
				}
			}
			if (~local113 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (arg8 == local103 && arg11 == local105) {
			return 0;
		}
		@Pc(302) byte local302 = 0;
		Static346.anIntArray349[0] = local103;
		local113 = local302 + 1;
		Static307.anIntArray276[0] = local105;
		@Pc(323) int local323;
		local115 = local323 = Static418.anIntArrayArray75[local103 - local97][local105 - local101];
		while (arg8 != local103 || local105 != arg11) {
			if (local115 != local323) {
				local323 = local115;
				Static346.anIntArray349[local113] = local103;
				Static307.anIntArray276[local113++] = local105;
			}
			if ((local115 & 0x1) != 0) {
				local105++;
			} else if ((local115 & 0x4) != 0) {
				local105--;
			}
			if ((local115 & 0x2) != 0) {
				local103++;
			} else if ((local115 & 0x8) != 0) {
				local103--;
			}
			local115 = Static418.anIntArrayArray75[local103 - local97][local105 - local101];
		}
		local122 = 0;
		while (local113-- > 0) {
			arg7[local122] = Static346.anIntArray349[local113];
			arg4[local122++] = Static307.anIntArray276[local113];
			if (arg7.length <= local122) {
				break;
			}
		}
		return local122;
	}

	@OriginalMember(owner = "client!ul", name = "i", descriptor = "(I)V")
	public static void method7465() {
		Static145.aFont1 = null;
		Static355.anImage3 = null;
	}
}
