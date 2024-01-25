import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
	public static int anInt5753;

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "Z")
	public static boolean aBoolean390;

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "F")
	public static float aFloat141;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_156 = new Class129(14, -2);

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "J")
	public static long aLong176 = -1L;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(FIIIIIIII[F)V")
	public static void method4562(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float[] arg8) {
		@Pc(5) int local5 = arg7 - arg4;
		@Pc(9) int local9 = arg5 - arg2;
		@Pc(17) int local17 = arg6 - arg3;
		@Pc(38) float local38 = arg8[2] * (float) local9 + (float) local5 * arg8[0] + arg8[1] * (float) local17;
		@Pc(59) float local59 = arg8[5] * (float) local9 + arg8[3] * (float) local5 + (float) local17 * arg8[4];
		@Pc(80) float local80 = arg8[6] * (float) local5 + arg8[7] * (float) local17 + arg8[8] * (float) local9;
		@Pc(95) float local95 = (float) Math.sqrt((double) (local38 * local38 + local59 * local59 + local80 * local80));
		@Pc(111) float local111 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(124) float local124 = (float) Math.asin((double) (local59 / local95)) / 3.1415927F + arg0 + 0.5F;
		@Pc(131) float local131;
		if (arg1 == 1) {
			local131 = local111;
			local111 = -local124;
			local124 = local131;
		} else if (arg1 == 2) {
			local111 = -local111;
			local124 = -local124;
		} else if (arg1 == 3) {
			local131 = local111;
			local111 = local124;
			local124 = -local131;
		}
		Static244.aFloat95 = local111;
		Static405.aFloat178 = local124;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIII[IIIIZIIILclient!uh;[II)I")
	public static int method4563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class240 arg11, @OriginalArg(13) int[] arg12, @OriginalArg(14) int arg13) {
		for (@Pc(3) int local3 = 0; local3 < 128; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
				Static73.anIntArrayArray6[local3][local7] = 0;
				Static93.anIntArrayArray9[local3][local7] = 99999999;
			}
		}
		@Pc(51) boolean local51;
		if (arg13 == 1) {
			local51 = Static352.method4973(arg0, arg1, arg9, arg7, arg10, arg3, arg5, arg6, arg2, arg11);
		} else if (arg13 == 2) {
			local51 = Static52.method822(arg0, arg1, arg6, arg10, arg3, arg7, arg2, arg9, arg5, arg11);
		} else {
			local51 = Static288.method3574(arg3, arg11, arg10, arg5, arg6, arg0, arg2, arg7, arg13, arg1, arg9);
		}
		@Pc(91) int local91 = arg5 - 64;
		@Pc(95) int local95 = arg1 - 64;
		@Pc(97) int local97 = Static134.anInt2388;
		@Pc(99) int local99 = Static116.anInt1976;
		@Pc(105) int local105;
		@Pc(107) int local107;
		@Pc(114) int local114;
		if (!local51) {
			if (!arg8) {
				return -1;
			}
			local105 = Integer.MAX_VALUE;
			local107 = Integer.MAX_VALUE;
			for (local114 = arg2 - 10; local114 <= arg2 + 10; local114++) {
				for (@Pc(121) int local121 = arg3 - 10; local121 <= arg3 + 10; local121++) {
					@Pc(128) int local128 = local114 - local91;
					@Pc(133) int local133 = local121 - local95;
					if (local128 >= 0 && local133 >= 0 && local128 < 128 && local133 < 128 && Static93.anIntArrayArray9[local128][local133] < 100) {
						@Pc(162) int local162 = 0;
						if (local114 < arg2) {
							local162 = arg2 - local114;
						} else if (arg7 + arg2 - 1 < local114) {
							local162 = local114 + 1 - arg2 - arg7;
						}
						@Pc(198) int local198 = 0;
						if (local121 < arg3) {
							local198 = arg3 - local121;
						} else if (arg3 + arg10 - 1 < local121) {
							local198 = local121 + 1 - arg10 - arg3;
						}
						@Pc(234) int local234 = local162 * local162 + local198 * local198;
						if (local234 < local105 || local234 == local105 && Static93.anIntArrayArray9[local128][local133] < local107) {
							local105 = local234;
							local99 = local121;
							local107 = Static93.anIntArrayArray9[local128][local133];
							local97 = local114;
						}
					}
				}
			}
			if (~local105 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (arg5 == local97 && local99 == arg1) {
			return 0;
		}
		@Pc(302) byte local302 = 0;
		Static37.anIntArray34[0] = local97;
		local105 = local302 + 1;
		Static168.anIntArray365[0] = local99;
		@Pc(337) int local337;
		local107 = local337 = Static73.anIntArrayArray6[local97 - local91][local99 - local95];
		while (arg5 != local97 || arg1 != local99) {
			if (local337 != local107) {
				Static37.anIntArray34[local105] = local97;
				local337 = local107;
				Static168.anIntArray365[local105++] = local99;
			}
			if ((local107 & 0x1) != 0) {
				local99++;
			} else if ((local107 & 0x4) != 0) {
				local99--;
			}
			if ((local107 & 0x2) != 0) {
				local97++;
			} else if ((local107 & 0x8) != 0) {
				local97--;
			}
			local107 = Static73.anIntArrayArray6[local97 - local91][local99 - local95];
		}
		local114 = 0;
		while (local105-- > 0) {
			arg12[local114] = Static37.anIntArray34[local105];
			arg4[local114++] = Static168.anIntArray365[local105];
			if (local114 >= arg12.length) {
				break;
			}
		}
		return local114;
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V")
	public static void method4564() {
		if (Static144.anInt2596 == 2) {
			Static102.anInt1724 = 96;
			return;
		}
		try {
			@Pc(21) Method local21 = Runtime.class.getMethod("maxMemory");
			if (local21 != null) {
				try {
					@Pc(25) Runtime local25 = Runtime.getRuntime();
					@Pc(31) Long local31 = (Long) local21.invoke(local25, (Object[]) null);
					Static102.anInt1724 = (int) (local31 / 1048576L) + 1;
				} catch (@Pc(41) Throwable local41) {
				}
			}
		} catch (@Pc(43) Exception local43) {
		}
	}
}
