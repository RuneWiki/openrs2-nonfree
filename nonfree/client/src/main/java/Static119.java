import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!fr", name = "x", descriptor = "Lclient!kj;")
	public static Class138 aClass138_7;

	@OriginalMember(owner = "client!fr", name = "B", descriptor = "I")
	public static int anInt7598;

	@OriginalMember(owner = "client!fr", name = "z", descriptor = "I")
	public static int anInt7597 = 0;

	@OriginalMember(owner = "client!fr", name = "D", descriptor = "I")
	public static int anInt7599 = 0;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(ZLclient!ss;)Lclient!ss;")
	public static Class219 method5886(@OriginalArg(1) Class219 arg0) {
		if (arg0.anInt6379 != -1) {
			return Static103.method1572(arg0.anInt6379);
		}
		@Pc(24) int local24 = arg0.anInt6422 >>> 16;
		@Pc(29) Class177 local29 = new Class177(Static445.aClass27_42);
		for (@Pc(34) Class1_Sub36 local34 = (Class1_Sub36) local29.method4039(); local34 != null; local34 = (Class1_Sub36) local29.method4040()) {
			if (local34.anInt5680 == local24) {
				return Static103.method1572((int) local34.aLong227);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIIIIZ[IILclient!id;IIIII[I)I")
	public static int method5888(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(8) Class112 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int[] arg13) {
		for (@Pc(3) int local3 = 0; local3 < 128; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
				Static45.anIntArrayArray23[local3][local7] = 0;
				Static378.anIntArrayArray183[local3][local7] = 99999999;
			}
		}
		@Pc(51) boolean local51;
		if (arg2 == 1) {
			local51 = Static409.method5542(arg10, arg12, arg9, arg11, arg1, arg4, arg0, arg7, arg3, arg8);
		} else if (arg2 == 2) {
			local51 = Static157.method2370(arg8, arg3, arg1, arg7, arg10, arg9, arg11, arg4, arg0, arg12);
		} else {
			local51 = Static302.method4316(arg7, arg12, arg8, arg0, arg9, arg10, arg4, arg1, arg2, arg11, arg3);
		}
		@Pc(91) int local91 = arg8 - 64;
		@Pc(95) int local95 = arg0 - 64;
		@Pc(97) int local97 = Static247.anInt3930;
		@Pc(99) int local99 = Static66.anInt1364;
		@Pc(107) int local107;
		@Pc(109) int local109;
		@Pc(115) int local115;
		if (!local51) {
			if (!arg5) {
				return -1;
			}
			local107 = Integer.MAX_VALUE;
			local109 = Integer.MAX_VALUE;
			for (local115 = arg10 - 10; local115 <= arg10 + 10; local115++) {
				for (@Pc(121) int local121 = arg1 - 10; local121 <= arg1 + 10; local121++) {
					@Pc(128) int local128 = local115 - local91;
					@Pc(133) int local133 = local121 - local95;
					if (local128 >= 0 && local133 >= 0 && local128 < 128 && local133 < 128 && Static378.anIntArrayArray183[local128][local133] < 100) {
						@Pc(157) int local157 = 0;
						if (local115 < arg10) {
							local157 = arg10 - local115;
						} else if (local115 > arg9 + arg10 - 1) {
							local157 = local115 + 1 - arg10 - arg9;
						}
						@Pc(193) int local193 = 0;
						if (arg1 > local121) {
							local193 = arg1 - local121;
						} else if (local121 > arg1 + arg11 - 1) {
							local193 = local121 + 1 - arg11 - arg1;
						}
						@Pc(232) int local232 = local157 * local157 + local193 * local193;
						if (local232 < local107 || local107 == local232 && Static378.anIntArrayArray183[local128][local133] < local109) {
							local107 = local232;
							local99 = local121;
							local109 = Static378.anIntArrayArray183[local128][local133];
							local97 = local115;
						}
					}
				}
			}
			if (~local107 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (arg8 == local97 && local99 == arg0) {
			return 0;
		}
		@Pc(304) byte local304 = 0;
		Static221.anIntArray325[0] = local97;
		local107 = local304 + 1;
		Static179.anIntArray273[0] = local99;
		@Pc(325) int local325;
		local109 = local325 = Static45.anIntArrayArray23[local97 - local91][local99 - local95];
		while (arg8 != local97 || local99 != arg0) {
			if (local325 != local109) {
				local325 = local109;
				Static221.anIntArray325[local107] = local97;
				Static179.anIntArray273[local107++] = local99;
			}
			if ((local109 & 0x2) != 0) {
				local97++;
			} else if ((local109 & 0x8) != 0) {
				local97--;
			}
			if ((local109 & 0x1) != 0) {
				local99++;
			} else if ((local109 & 0x4) != 0) {
				local99--;
			}
			local109 = Static45.anIntArrayArray23[local97 - local91][local99 - local95];
		}
		local115 = 0;
		while (local107-- > 0) {
			arg13[local115] = Static221.anIntArray325[local107];
			arg6[local115++] = Static179.anIntArray273[local107];
			if (arg13.length <= local115) {
				break;
			}
		}
		return local115;
	}
}
