import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "Lclient!me;")
	public static Class146 aClass146_1;

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "[I")
	public static int[] anIntArray60;

	@OriginalMember(owner = "client!cb", name = "s", descriptor = "[[B")
	public static byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "Lclient!id;")
	public static final Class105 aClass105_1 = new Class105(128);

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
	public static int anInt718 = -1;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!pe;IIIIIIIZII[II[I)I")
	public static int method572(@OriginalArg(1) Class178 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int[] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int[] arg13) {
		for (@Pc(3) int local3 = 0; local3 < 128; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
				Static233.anIntArrayArray31[local3][local7] = 0;
				Static39.anIntArrayArray5[local3][local7] = 99999999;
			}
		}
		@Pc(62) boolean local62;
		if (arg9 == 1) {
			local62 = Static13.method127(arg3, arg10, arg7, arg2, arg0, arg12, arg4, arg5, arg6, arg1);
		} else if (arg9 == 2) {
			local62 = Static88.method1496(arg4, arg10, arg5, arg6, arg2, arg7, arg0, arg12, arg3, arg1);
		} else {
			local62 = Static75.method1314(arg5, arg12, arg6, arg9, arg1, arg7, arg3, arg0, arg10, arg4, arg2);
		}
		@Pc(96) int local96 = arg7 - 64;
		@Pc(100) int local100 = arg5 - 64;
		@Pc(102) int local102 = Static15.anInt269;
		@Pc(104) int local104 = Static123.anInt5934;
		@Pc(110) int local110;
		@Pc(112) int local112;
		@Pc(119) int local119;
		if (!local62) {
			if (!arg8) {
				return -1;
			}
			local110 = Integer.MAX_VALUE;
			local112 = Integer.MAX_VALUE;
			for (local119 = arg6 - 10; local119 <= arg6 + 10; local119++) {
				for (@Pc(126) int local126 = arg12 - 10; local126 <= arg12 + 10; local126++) {
					@Pc(133) int local133 = local119 - local96;
					@Pc(138) int local138 = local126 - local100;
					if (local133 >= 0 && local138 >= 0 && local133 < 128 && local138 < 128 && Static39.anIntArrayArray5[local133][local138] < 100) {
						@Pc(162) int local162 = 0;
						if (arg6 > local119) {
							local162 = arg6 - local119;
						} else if (arg2 + arg6 - 1 < local119) {
							local162 = local119 + 1 - arg6 - arg2;
						}
						@Pc(194) int local194 = 0;
						if (arg12 > local126) {
							local194 = arg12 - local126;
						} else if (local126 > arg12 + arg1 - 1) {
							local194 = local126 + 1 - arg1 - arg12;
						}
						@Pc(233) int local233 = local162 * local162 + local194 * local194;
						if (local233 < local110 || local233 == local110 && Static39.anIntArrayArray5[local133][local138] < local112) {
							local102 = local119;
							local104 = local126;
							local112 = Static39.anIntArrayArray5[local133][local138];
							local110 = local233;
						}
					}
				}
			}
			if (local110 == Integer.MAX_VALUE) {
				return -1;
			}
		}
		if (arg7 == local102 && arg5 == local104) {
			return 0;
		}
		@Pc(303) byte local303 = 0;
		Static326.anIntArray523[0] = local102;
		local110 = local303 + 1;
		Static313.anIntArray503[0] = local104;
		@Pc(325) int local325;
		local112 = local325 = Static233.anIntArrayArray31[local102 - local96][local104 - local100];
		while (local102 != arg7 || local104 != arg5) {
			if (local325 != local112) {
				local325 = local112;
				Static326.anIntArray523[local110] = local102;
				Static313.anIntArray503[local110++] = local104;
			}
			if ((local112 & 0x2) != 0) {
				local102++;
			} else if ((local112 & 0x8) != 0) {
				local102--;
			}
			if ((local112 & 0x1) != 0) {
				local104++;
			} else if ((local112 & 0x4) != 0) {
				local104--;
			}
			local112 = Static233.anIntArrayArray31[local102 - local96][local104 - local100];
		}
		local119 = 0;
		while (local110-- > 0) {
			arg11[local119] = Static326.anIntArray523[local110];
			arg13[local119++] = Static313.anIntArray503[local110];
			if (local119 >= arg11.length) {
				break;
			}
		}
		return local119;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)Z")
	public static boolean method575() {
		return Static36.anInt2910 == 0 ? Static48.aBoolean73 : true;
	}
}
