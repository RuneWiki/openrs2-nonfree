import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static589 {

	@OriginalMember(owner = "client!uw", name = "d", descriptor = "[I")
	public static int[] anIntArray607;

	@OriginalMember(owner = "client!uw", name = "o", descriptor = "Lclient!nh;")
	public static Class197 aClass197_2;

	@OriginalMember(owner = "client!uw", name = "c", descriptor = "I")
	public static int anInt9635 = 0;

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(IB)Lclient!we;")
	public static Class371 method8183(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static91.aClass371Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!uw", name = "b", descriptor = "(I)[Lclient!mga;")
	public static Class220[] method8185() {
		return new Class220[] { Static508.aClass220_11, Static1.aClass220_12, Static601.aClass220_14, Static579.aClass220_13, Static242.aClass220_6, Static606.aClass220_15 };
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(BLclient!nfa;III[IIIIII[IIZI)I")
	public static int method8186(@OriginalArg(1) Class237 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) boolean arg12, @OriginalArg(14) int arg13) {
		for (@Pc(3) int local3 = 0; local3 < 128; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
				Static634.anIntArrayArray60[local3][local7] = 0;
				Static184.anIntArrayArray19[local3][local7] = 99999999;
			}
		}
		@Pc(51) boolean local51;
		if (arg2 == 1) {
			local51 = Static262.method4384(arg9, arg0, arg6, arg11, arg7, arg8, arg3, arg13, arg1, arg5);
		} else if (arg2 == 2) {
			local51 = Static480.method7097(arg5, arg8, arg0, arg11, arg13, arg1, arg9, arg3, arg7, arg6);
		} else {
			local51 = Static444.method6661(arg8, arg9, arg11, arg5, arg7, arg1, arg2, arg6, arg0, arg3, arg13);
		}
		@Pc(109) int local109 = arg6 - 64;
		@Pc(113) int local113 = arg11 - 64;
		@Pc(115) int local115 = Static255.anInt4980;
		@Pc(117) int local117 = Static58.anInt1078;
		@Pc(123) int local123;
		@Pc(125) int local125;
		@Pc(132) int local132;
		if (!local51) {
			if (!arg12) {
				return -1;
			}
			local123 = Integer.MAX_VALUE;
			local125 = Integer.MAX_VALUE;
			for (local132 = arg9 - 10; local132 <= arg9 + 10; local132++) {
				for (@Pc(139) int local139 = arg5 - 10; local139 <= arg5 + 10; local139++) {
					@Pc(146) int local146 = local132 - local109;
					@Pc(151) int local151 = local139 - local113;
					if (local146 >= 0 && local151 >= 0 && local146 < 128 && local151 < 128 && Static184.anIntArrayArray19[local146][local151] < 100) {
						@Pc(175) int local175 = 0;
						if (arg9 > local132) {
							local175 = arg9 - local132;
						} else if (arg13 + arg9 - 1 < local132) {
							local175 = local132 + 1 - arg13 - arg9;
						}
						@Pc(204) int local204 = 0;
						if (local139 < arg5) {
							local204 = arg5 - local139;
						} else if (local139 > arg7 + arg5 - 1) {
							local204 = local139 + 1 - arg7 - arg5;
						}
						@Pc(238) int local238 = local175 * local175 + local204 * local204;
						if (local123 > local238 || local238 == local123 && Static184.anIntArrayArray19[local146][local151] < local125) {
							local125 = Static184.anIntArrayArray19[local146][local151];
							local117 = local139;
							local115 = local132;
							local123 = local238;
						}
					}
				}
			}
			if (local123 == Integer.MAX_VALUE) {
				return -1;
			}
		}
		if (arg6 == local115 && arg11 == local117) {
			return 0;
		}
		@Pc(320) byte local320 = 0;
		Static333.anIntArray343[0] = local115;
		local123 = local320 + 1;
		Static58.anIntArray68[0] = local117;
		@Pc(342) int local342;
		local125 = local342 = Static634.anIntArrayArray60[local115 - local109][local117 - local113];
		while (local115 != arg6 || local117 != arg11) {
			if (local342 != local125) {
				Static333.anIntArray343[local123] = local115;
				local342 = local125;
				Static58.anIntArray68[local123++] = local117;
			}
			if ((local125 & 0x2) != 0) {
				local115++;
			} else if ((local125 & 0x8) != 0) {
				local115--;
			}
			if ((local125 & 0x1) != 0) {
				local117++;
			} else if ((local125 & 0x4) != 0) {
				local117--;
			}
			local125 = Static634.anIntArrayArray60[local115 - local109][local117 - local113];
		}
		local132 = 0;
		while (local123-- > 0) {
			arg10[local132] = Static333.anIntArray343[local123];
			arg4[local132++] = Static58.anIntArray68[local123];
			if (local132 >= arg10.length) {
				break;
			}
		}
		return local132;
	}
}
