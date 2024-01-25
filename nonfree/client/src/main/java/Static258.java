import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!jr", name = "f", descriptor = "Lclient!sd;")
	public static Class302 aClass302_1;

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(II)I")
	public static int method4311(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static573.method7588(arg0);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "([IIIZIIIILclient!fh;IBIII[I)I")
	public static int method4312(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class95 arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int[] arg13) {
		for (@Pc(3) int local3 = 0; local3 < 128; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
				Static227.anIntArrayArray33[local3][local7] = 0;
				Static594.anIntArrayArray72[local3][local7] = 99999999;
			}
		}
		@Pc(62) boolean local62;
		if (arg10 == 1) {
			local62 = Static471.method6497(arg4, arg12, arg11, arg5, arg1, arg7, arg6, arg2, arg9, arg8);
		} else if (arg10 == 2) {
			local62 = Static332.method5130(arg5, arg6, arg9, arg12, arg2, arg11, arg8, arg7, arg1, arg4);
		} else {
			local62 = Static404.method5874(arg12, arg11, arg2, arg8, arg1, arg7, arg10, arg4, arg6, arg9, arg5);
		}
		@Pc(96) int local96 = arg11 - 64;
		@Pc(100) int local100 = arg9 - 64;
		@Pc(102) int local102 = Static526.anInt8326;
		@Pc(104) int local104 = Static531.anInt8359;
		@Pc(112) int local112;
		@Pc(114) int local114;
		@Pc(121) int local121;
		if (!local62) {
			if (!arg3) {
				return -1;
			}
			local112 = Integer.MAX_VALUE;
			local114 = Integer.MAX_VALUE;
			for (local121 = arg12 - 10; local121 <= arg12 + 10; local121++) {
				for (@Pc(128) int local128 = arg6 - 10; local128 <= arg6 + 10; local128++) {
					@Pc(134) int local134 = local121 - local96;
					@Pc(138) int local138 = local128 - local100;
					if (local134 >= 0 && local138 >= 0 && local134 < 128 && local138 < 128 && Static594.anIntArrayArray72[local134][local138] < 100) {
						@Pc(167) int local167 = 0;
						if (local121 < arg12) {
							local167 = arg12 - local121;
						} else if (arg5 + arg12 - 1 < local121) {
							local167 = local121 + 1 - arg5 - arg12;
						}
						@Pc(198) int local198 = 0;
						if (arg6 > local128) {
							local198 = arg6 - local128;
						} else if (local128 > arg6 + arg1 - 1) {
							local198 = local128 + 1 - arg6 - arg1;
						}
						@Pc(236) int local236 = local198 * local198 + local167 * local167;
						if (local112 > local236 || local112 == local236 && local114 > Static594.anIntArrayArray72[local134][local138]) {
							local102 = local121;
							local104 = local128;
							local112 = local236;
							local114 = Static594.anIntArrayArray72[local134][local138];
						}
					}
				}
			}
			if (~local112 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (local102 == arg11 && arg9 == local104) {
			return 0;
		}
		@Pc(307) byte local307 = 0;
		Static425.anIntArray560[0] = local102;
		local112 = local307 + 1;
		Static554.anIntArray652[0] = local104;
		@Pc(328) int local328;
		local114 = local328 = Static227.anIntArrayArray33[local102 - local96][local104 - local100];
		while (local102 != arg11 || local104 != arg9) {
			if (local328 != local114) {
				Static425.anIntArray560[local112] = local102;
				local328 = local114;
				Static554.anIntArray652[local112++] = local104;
			}
			if ((local114 & 0x2) != 0) {
				local102++;
			} else if ((local114 & 0x8) != 0) {
				local102--;
			}
			if ((local114 & 0x1) != 0) {
				local104++;
			} else if ((local114 & 0x4) != 0) {
				local104--;
			}
			local114 = Static227.anIntArrayArray33[local102 - local96][local104 - local100];
		}
		local121 = 0;
		while (local112-- > 0) {
			arg13[local121] = Static425.anIntArray560[local112];
			arg0[local121++] = Static554.anIntArray652[local112];
			if (local121 >= arg13.length) {
				break;
			}
		}
		return local121;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(III)Z")
	public static boolean method4314(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x580) != 0;
	}
}
