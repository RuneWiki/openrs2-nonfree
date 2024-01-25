import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static644 {

	@OriginalMember(owner = "client!ws", name = "c", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_190 = new Class268(51, 3);

	@OriginalMember(owner = "client!ws", name = "k", descriptor = "Lclient!fa;")
	public static final Class89 aClass89_33 = new Class89(2, 4, 4, 0);

	@OriginalMember(owner = "client!ws", name = "l", descriptor = "I")
	public static int anInt10700 = 0;

	@OriginalMember(owner = "client!ws", name = "m", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray8 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IILclient!tea;IIIIIIII)Z")
	public static boolean method8979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class319 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg6;
		@Pc(9) int local9 = arg8;
		@Pc(18) int local18 = arg6 - 64;
		Static524.anIntArrayArray46[64][64] = 99;
		@Pc(29) int local29 = arg8 - 64;
		Static533.anIntArrayArray49[64][64] = 0;
		@Pc(37) byte local37 = 0;
		@Pc(39) int local39 = 0;
		Static151.anIntArray179[0] = arg6;
		@Pc(51) int local51 = local37 + 1;
		Static430.anIntArray478[0] = arg8;
		@Pc(56) int[][] local56 = arg2.anIntArrayArray52;
		while (local39 != local51) {
			local7 = Static151.anIntArray179[local39];
			local9 = Static430.anIntArray478[local39];
			local39 = local39 + 1 & 0xFFF;
			@Pc(77) int local77 = local7 - local18;
			@Pc(82) int local82 = local9 - local29;
			@Pc(88) int local88 = local7 - arg2.anInt9338;
			@Pc(93) int local93 = local9 - arg2.anInt9322;
			if (arg3 == -4) {
				if (arg7 == local7 && local9 == arg9) {
					Static75.anInt1537 = local9;
					Static189.anInt3799 = local7;
					return true;
				}
			} else if (arg3 == -3) {
				if (Static53.method901(arg7, 2, arg0, arg4, local7, arg9, 2, local9)) {
					Static189.anInt3799 = local7;
					Static75.anInt1537 = local9;
					return true;
				}
			} else if (arg3 == -2) {
				if (arg2.method7931(2, local7, arg7, local9, arg9, arg4, 2, arg5, arg0)) {
					Static189.anInt3799 = local7;
					Static75.anInt1537 = local9;
					return true;
				}
			} else if (arg3 == -1) {
				if (arg2.method7935(arg7, arg0, arg5, arg4, arg9, 2, local7, local9)) {
					Static75.anInt1537 = local9;
					Static189.anInt3799 = local7;
					return true;
				}
			} else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
				if (arg2.method7938(local9, arg9, arg3, arg7, 2, arg1, local7)) {
					Static189.anInt3799 = local7;
					Static75.anInt1537 = local9;
					return true;
				}
			} else if (arg2.method7945(2, arg9, local7, arg3, arg7, local9, arg1)) {
				Static75.anInt1537 = local9;
				Static189.anInt3799 = local7;
				return true;
			}
			@Pc(244) int local244 = Static533.anIntArrayArray49[local77][local82] + 1;
			if (local77 > 0 && Static524.anIntArrayArray46[local77 - 1][local82] == 0 && (local56[local88 - 1][local93] & 0x43A40000) == 0 && (local56[local88 - 1][local93 + 1] & 0x4E240000) == 0) {
				Static151.anIntArray179[local51] = local7 - 1;
				Static430.anIntArray478[local51] = local9;
				Static524.anIntArrayArray46[local77 - 1][local82] = 2;
				local51 = local51 + 1 & 0xFFF;
				Static533.anIntArrayArray49[local77 - 1][local82] = local244;
			}
			if (local77 < 126 && Static524.anIntArrayArray46[local77 + 1][local82] == 0 && (local56[local88 + 2][local93] & 0x60E40000) == 0 && (local56[local88 + 2][local93 + 1] & 0x78240000) == 0) {
				Static151.anIntArray179[local51] = local7 + 1;
				Static430.anIntArray478[local51] = local9;
				local51 = local51 + 1 & 0xFFF;
				Static524.anIntArrayArray46[local77 + 1][local82] = 8;
				Static533.anIntArrayArray49[local77 + 1][local82] = local244;
			}
			if (local82 > 0 && Static524.anIntArrayArray46[local77][local82 - 1] == 0 && (local56[local88][local93 - 1] & 0x43A40000) == 0 && (local56[local88 + 1][local93 - 1] & 0x60E40000) == 0) {
				Static151.anIntArray179[local51] = local7;
				Static430.anIntArray478[local51] = local9 - 1;
				Static524.anIntArrayArray46[local77][local82 - 1] = 1;
				local51 = local51 + 1 & 0xFFF;
				Static533.anIntArrayArray49[local77][local82 - 1] = local244;
			}
			if (local82 < 126 && Static524.anIntArrayArray46[local77][local82 + 1] == 0 && (local56[local88][local93 + 2] & 0x4E240000) == 0 && (local56[local88 + 1][local93 + 2] & 0x78240000) == 0) {
				Static151.anIntArray179[local51] = local7;
				Static430.anIntArray478[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static524.anIntArrayArray46[local77][local82 + 1] = 4;
				Static533.anIntArrayArray49[local77][local82 + 1] = local244;
			}
			if (local77 > 0 && local82 > 0 && Static524.anIntArrayArray46[local77 - 1][local82 - 1] == 0 && (local56[local88 - 1][local93] & 0x4FA40000) == 0 && (local56[local88 - 1][local93 - 1] & 0x43A40000) == 0 && (local56[local88][local93 - 1] & 0x63E40000) == 0) {
				Static151.anIntArray179[local51] = local7 - 1;
				Static430.anIntArray478[local51] = local9 - 1;
				Static524.anIntArrayArray46[local77 - 1][local82 - 1] = 3;
				local51 = local51 + 1 & 0xFFF;
				Static533.anIntArrayArray49[local77 - 1][local82 - 1] = local244;
			}
			if (local77 < 126 && local82 > 0 && Static524.anIntArrayArray46[local77 + 1][local82 - 1] == 0 && (local56[local88 + 1][local93 - 1] & 0x63E40000) == 0 && (local56[local88 + 2][local93 - 1] & 0x60E40000) == 0 && (local56[local88 + 2][local93] & 0x78E40000) == 0) {
				Static151.anIntArray179[local51] = local7 + 1;
				Static430.anIntArray478[local51] = local9 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static524.anIntArrayArray46[local77 + 1][local82 - 1] = 9;
				Static533.anIntArrayArray49[local77 + 1][local82 - 1] = local244;
			}
			if (local77 > 0 && local82 < 126 && Static524.anIntArrayArray46[local77 - 1][local82 + 1] == 0 && (local56[local88 - 1][local93 + 1] & 0x4FA40000) == 0 && (local56[local88 - 1][local93 + 2] & 0x4E240000) == 0 && (local56[local88][local93 + 2] & 0x7E240000) == 0) {
				Static151.anIntArray179[local51] = local7 - 1;
				Static430.anIntArray478[local51] = local9 + 1;
				Static524.anIntArrayArray46[local77 - 1][local82 + 1] = 6;
				local51 = local51 + 1 & 0xFFF;
				Static533.anIntArrayArray49[local77 - 1][local82 + 1] = local244;
			}
			if (local77 < 126 && local82 < 126 && Static524.anIntArrayArray46[local77 + 1][local82 + 1] == 0 && (local56[local88 + 1][local93 + 2] & 0x7E240000) == 0 && (local56[local88 + 2][local93 + 2] & 0x78240000) == 0 && (local56[local88 + 2][local93 + 1] & 0x78E40000) == 0) {
				Static151.anIntArray179[local51] = local7 + 1;
				Static430.anIntArray478[local51] = local9 + 1;
				Static524.anIntArrayArray46[local77 + 1][local82 + 1] = 12;
				local51 = local51 + 1 & 0xFFF;
				Static533.anIntArrayArray49[local77 + 1][local82 + 1] = local244;
			}
		}
		Static75.anInt1537 = local9;
		Static189.anInt3799 = local7;
		return false;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IBI)V")
	public static void method8980(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class6_Sub9 local12 = Static560.method8089(Static391.aClass126_1, Static277.aClass208_46);
		local12.aClass6_Sub40_Sub2_1.method8557(arg1);
		local12.aClass6_Sub40_Sub2_1.method8609(arg0);
		Static263.method4681(local12);
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lclient!kb;I)V")
	public static void method8982(@OriginalArg(0) Class169 arg0) {
		Static517.aClass169_1 = arg0;
	}
}
