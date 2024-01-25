import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!kc", name = "B", descriptor = "Lclient!bda;")
	public static Class27 aClass27_3;

	@OriginalMember(owner = "client!kc", name = "C", descriptor = "I")
	public static int anInt4970;

	@OriginalMember(owner = "client!kc", name = "F", descriptor = "Lclient!fa;")
	public static Interface5 anInterface5_5;

	@OriginalMember(owner = "client!kc", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString51 = null;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I[B)[B")
	public static byte[] method4167(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class1_Sub20 local8 = new Class1_Sub20(arg0);
		@Pc(14) int local14 = local8.method4393();
		@Pc(18) int local18 = local8.method4371();
		if (local18 < 0 || Static263.anInt4929 != 0 && local18 > Static263.anInt4929) {
			throw new RuntimeException();
		} else if (local14 == 0) {
			@Pc(87) byte[] local87 = new byte[local18];
			local8.method4425(local87, local18);
			return local87;
		} else {
			@Pc(43) int local43 = local8.method4371();
			if (local43 < 0 || Static263.anInt4929 != 0 && Static263.anInt4929 < local43) {
				throw new RuntimeException();
			}
			@Pc(57) byte[] local57 = new byte[local43];
			if (local14 == 1) {
				Static175.method2679(local57, local43, arg0, local18);
			} else {
				@Pc(62) Class122 local62 = Static335.aClass122_1;
				synchronized (Static335.aClass122_1) {
					Static335.aClass122_1.method2607(local8, local57);
				}
			}
			return local57;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILclient!ev;BIIII[IIIZII[I)I")
	public static int method4168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class94 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int[] arg13) {
		for (@Pc(3) int local3 = 0; local3 < 128; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
				Static252.anIntArrayArray62[local3][local7] = 0;
				Static89.anIntArrayArray10[local3][local7] = 99999999;
			}
		}
		@Pc(52) boolean local52;
		if (arg12 == 1) {
			local52 = Static435.method6304(arg11, arg1, arg6, arg2, arg8, arg3, arg5, arg0, arg9, arg4);
		} else if (arg12 == 2) {
			local52 = Static317.method4812(arg8, arg2, arg4, arg5, arg9, arg11, arg6, arg1, arg3, arg0);
		} else {
			local52 = Static517.method7094(arg6, arg0, arg3, arg8, arg5, arg4, arg1, arg9, arg2, arg11, arg12);
		}
		@Pc(87) int local87 = arg0 - 64;
		@Pc(91) int local91 = arg8 - 64;
		@Pc(93) int local93 = Static492.anInt8284;
		@Pc(95) int local95 = Static126.anInt6655;
		@Pc(106) int local106;
		@Pc(108) int local108;
		@Pc(114) int local114;
		if (!local52) {
			if (!arg10) {
				return -1;
			}
			local106 = Integer.MAX_VALUE;
			local108 = Integer.MAX_VALUE;
			for (local114 = arg4 - 10; local114 <= arg4 + 10; local114++) {
				for (@Pc(121) int local121 = arg9 - 10; local121 <= arg9 + 10; local121++) {
					@Pc(128) int local128 = local114 - local87;
					@Pc(133) int local133 = local121 - local91;
					if (local128 >= 0 && local133 >= 0 && local128 < 128 && local133 < 128 && Static89.anIntArrayArray10[local128][local133] < 100) {
						@Pc(160) int local160 = 0;
						if (arg4 > local114) {
							local160 = arg4 - local114;
						} else if (local114 > arg5 + arg4 - 1) {
							local160 = local114 + 1 - arg5 - arg4;
						}
						@Pc(192) int local192 = 0;
						if (local121 < arg9) {
							local192 = arg9 - local121;
						} else if (arg3 + arg9 - 1 < local121) {
							local192 = local121 + 1 - arg9 - arg3;
						}
						@Pc(226) int local226 = local160 * local160 + local192 * local192;
						if (local226 < local106 || local226 == local106 && local108 > Static89.anIntArrayArray10[local128][local133]) {
							local95 = local121;
							local106 = local226;
							local93 = local114;
							local108 = Static89.anIntArrayArray10[local128][local133];
						}
					}
				}
			}
			if (~local106 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (arg0 == local93 && local95 == arg8) {
			return 0;
		}
		@Pc(302) byte local302 = 0;
		Static341.anIntArray410[0] = local93;
		local106 = local302 + 1;
		Static343.anIntArray412[0] = local95;
		@Pc(323) int local323;
		local108 = local323 = Static252.anIntArrayArray62[local93 - local87][local95 - local91];
		while (local93 != arg0 || arg8 != local95) {
			if (local108 != local323) {
				Static341.anIntArray410[local106] = local93;
				local323 = local108;
				Static343.anIntArray412[local106++] = local95;
			}
			if ((local108 & 0x1) != 0) {
				local95++;
			} else if ((local108 & 0x4) != 0) {
				local95--;
			}
			if ((local108 & 0x2) != 0) {
				local93++;
			} else if ((local108 & 0x8) != 0) {
				local93--;
			}
			local108 = Static252.anIntArrayArray62[local93 - local87][local95 - local91];
		}
		local114 = 0;
		while (local106-- > 0) {
			arg13[local114] = Static341.anIntArray410[local106];
			arg7[local114++] = Static343.anIntArray412[local106];
			if (local114 >= arg13.length) {
				break;
			}
		}
		return local114;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IBI)Z")
	public static boolean method4170(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIILclient!tl;IIIIIILclient!fn;)V")
	public static void method4171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class314 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class103 arg10) {
		Static548.anInt9027 = arg0;
		Static89.anInt1987 = arg6;
		Static239.anInt4566 = arg7;
		Static218.anInt4226 = arg2;
		Static146.anInt2806 = arg8;
		Static29.anInt847 = arg1;
		Static548.anInt9028 = arg4;
		Static9.anInt153 = arg5;
		Static339.aClass103_14 = arg10;
		Static291.anInt5360 = arg9;
		Static374.aClass314_10 = arg3;
		Static554.aClass318_4 = null;
		Static115.aClass318_3 = null;
		Static92.aClass318_2 = null;
		Static278.method4290();
		Static212.aBoolean338 = true;
	}
}
