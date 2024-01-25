import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!qk", name = "r", descriptor = "Lclient!bc;")
	public static Class16 aClass16_8;

	@OriginalMember(owner = "client!qk", name = "z", descriptor = "I")
	public static int anInt5213;

	@OriginalMember(owner = "client!qk", name = "q", descriptor = "I")
	public static int anInt5206 = 0;

	@OriginalMember(owner = "client!qk", name = "u", descriptor = "I")
	public static int anInt5208 = 127;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIII)I")
	public static int method4665(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static8.aClass51Array1 == null) {
			return 0;
		} else if (arg0 < 3) {
			@Pc(19) int local19 = arg2 >> 7;
			@Pc(23) int local23 = arg4 >> 7;
			if (arg3 < 0 || arg1 < 0 || arg3 > Static22.anInt481 - 1 || arg1 > Static269.anInt5281 - 1) {
				return 0;
			} else if (local19 >= 1 && local23 >= 1 && Static22.anInt481 - 1 >= local19 && Static269.anInt5281 - 1 >= local23) {
				@Pc(88) boolean local88 = (Static255.aByteArrayArrayArray13[1][arg2 >> 7][arg4 >> 7] & 0x2) != 0;
				@Pc(113) boolean local113;
				@Pc(132) boolean local132;
				if ((arg2 & 0x7F) == 0) {
					local113 = (Static255.aByteArrayArrayArray13[1][local19 - 1][arg4 >> 7] & 0x2) != 0;
					local132 = (Static255.aByteArrayArrayArray13[1][local19][arg4 >> 7] & 0x2) != 0;
					if (local132 != local113) {
						local88 = (Static255.aByteArrayArrayArray13[1][arg3][arg1] & 0x2) != 0;
					}
				}
				if ((arg4 & 0x7F) == 0) {
					local113 = (Static255.aByteArrayArrayArray13[1][arg2 >> 7][local23 - 1] & 0x2) != 0;
					local132 = (Static255.aByteArrayArrayArray13[1][arg2 >> 7][local23] & 0x2) != 0;
					if (local132 != local113) {
						local88 = (Static255.aByteArrayArrayArray13[1][arg3][arg1] & 0x2) != 0;
					}
				}
				if (local88) {
					arg0++;
				}
				return Static8.aClass51Array1[arg0].method1844(arg2, arg4);
			} else {
				return 0;
			}
		} else {
			return Static8.aClass51Array1[arg0].method1844(arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIBIIIII)V")
	public static void method4667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg7 == arg0 && arg1 == arg3 && arg2 == arg5 && arg4 == arg8) {
			Static284.method4948(arg3, arg2, arg4, arg0, arg6);
			return;
		}
		@Pc(36) int local36 = arg0;
		@Pc(38) int local38 = arg3;
		@Pc(42) int local42 = arg0 * 3;
		@Pc(46) int local46 = arg3 * 3;
		@Pc(50) int local50 = arg7 * 3;
		@Pc(54) int local54 = arg1 * 3;
		@Pc(58) int local58 = arg5 * 3;
		@Pc(62) int local62 = arg8 * 3;
		@Pc(72) int local72 = local50 + arg2 - local58 - arg0;
		@Pc(82) int local82 = local54 + arg4 - arg3 - local62;
		@Pc(91) int local91 = local42 + local58 - local50 - local50;
		@Pc(101) int local101 = local62 + local46 - local54 - local54;
		@Pc(106) int local106 = local50 - local42;
		@Pc(111) int local111 = local54 - local46;
		for (@Pc(113) int local113 = 128; local113 <= 4096; local113 += 128) {
			@Pc(121) int local121 = local113 * local113 >> 12;
			@Pc(127) int local127 = local113 * local121 >> 12;
			@Pc(131) int local131 = local127 * local72;
			@Pc(135) int local135 = local127 * local82;
			@Pc(139) int local139 = local121 * local91;
			@Pc(143) int local143 = local101 * local121;
			@Pc(147) int local147 = local113 * local106;
			@Pc(151) int local151 = local113 * local111;
			@Pc(162) int local162 = arg0 + (local139 + local131 + local147 >> 12);
			@Pc(173) int local173 = (local135 + local143 + local151 >> 12) + arg3;
			Static284.method4948(local38, local162, local173, local36, arg6);
			local38 = local173;
			local36 = local162;
		}
	}
}
