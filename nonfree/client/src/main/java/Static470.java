import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static470 {

	@OriginalMember(owner = "client!tr", name = "l", descriptor = "I")
	public static int anInt6523;

	@OriginalMember(owner = "client!tr", name = "f", descriptor = "I")
	public static int anInt6518 = 0;

	@OriginalMember(owner = "client!tr", name = "k", descriptor = "Lclient!aq;")
	public static final Class16 aClass16_16 = new Class16(3);

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIIB)V")
	public static void method5653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static89.aClass1_Sub28_Sub1_1.anInt4894 != 0 && arg3 != 0 && Static205.anInt4329 < 50 && arg0 != -1) {
			Static41.aClass67Array1[Static205.anInt4329++] = new Class67((byte) 1, arg0, arg3, arg2, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(III)Z")
	public static boolean method5654(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(ZZIII)V")
	public static void method5655(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static71.method1913(Static538.aClass50_Sub1Array2.length - 1, arg1, 0, arg0, arg3, arg2);
		Static310.anInt5941 = 0;
		Static176.aClass1_Sub36_1 = null;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)V")
	public static void method5656() {
		Static393.aBoolean458 = true;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "([BIZLjava/lang/String;)I")
	public static int method5657(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		@Pc(16) int local16 = arg2.length();
		for (@Pc(18) int local18 = 0; local18 < local16; local18 += 4) {
			@Pc(25) int local25 = Static164.method3254(arg2.charAt(local18));
			@Pc(44) int local44 = local16 > local18 + 1 ? Static164.method3254(arg2.charAt(local18 + 1)) : -1;
			@Pc(63) int local63 = local16 <= local18 + 2 ? -1 : Static164.method3254(arg2.charAt(local18 + 2));
			@Pc(82) int local82 = local16 <= local18 + 3 ? -1 : Static164.method3254(arg2.charAt(local18 + 3));
			arg0[arg1++] = (byte) (local44 >>> 4 | local25 << 2);
			if (local63 == -1) {
				break;
			}
			arg0[arg1++] = (byte) ((local44 & 0xF) << 4 | local63 >>> 2);
			if (local82 == -1) {
				break;
			}
			arg0[arg1++] = (byte) ((local63 & 0x3) << 6 | local82);
		}
		return arg1;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIII[IIIZLclient!vba;III[II)I")
	public static int method5658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) Class299 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int[] arg12, @OriginalArg(14) int arg13) {
		for (@Pc(1) int local1 = 0; local1 < 128; local1++) {
			for (@Pc(4) int local4 = 0; local4 < 128; local4++) {
				Static355.anIntArrayArray24[local1][local4] = 0;
				Static143.anIntArrayArray30[local1][local4] = 99999999;
			}
		}
		@Pc(52) boolean local52;
		if (arg13 == 1) {
			local52 = Static341.method5528(arg0, arg8, arg6, arg4, arg3, arg9, arg2, arg10, arg1, arg11);
		} else if (arg13 == 2) {
			local52 = Static471.method6872(arg11, arg0, arg10, arg8, arg9, arg2, arg3, arg1, arg6, arg4);
		} else {
			local52 = Static439.method5140(arg13, arg4, arg0, arg8, arg9, arg11, arg2, arg1, arg6, arg10, arg3);
		}
		@Pc(85) int local85 = arg11 - 64;
		@Pc(89) int local89 = arg4 - 64;
		@Pc(91) int local91 = Static144.anInt3323;
		@Pc(93) int local93 = Static504.anInt8566;
		@Pc(101) int local101;
		@Pc(103) int local103;
		@Pc(110) int local110;
		@Pc(116) int local116;
		if (!local52) {
			if (!arg7) {
				return -1;
			}
			local101 = Integer.MAX_VALUE;
			local103 = Integer.MAX_VALUE;
			for (local110 = arg3 - 10; local110 <= arg3 + 10; local110++) {
				for (local116 = arg1 - 10; local116 <= arg1 + 10; local116++) {
					@Pc(122) int local122 = local110 - local85;
					@Pc(127) int local127 = local116 - local89;
					if (local122 >= 0 && local127 >= 0 && local122 < 128 && local127 < 128 && Static143.anIntArrayArray30[local122][local127] < 100) {
						@Pc(150) int local150 = 0;
						if (arg3 > local110) {
							local150 = arg3 - local110;
						} else if (arg6 + arg3 - 1 < local110) {
							local150 = local110 + 1 - arg6 - arg3;
						}
						@Pc(180) int local180 = 0;
						if (arg1 > local116) {
							local180 = arg1 - local116;
						} else if (arg1 + arg10 - 1 < local116) {
							local180 = local116 + 1 - arg10 - arg1;
						}
						@Pc(212) int local212 = local150 * local150 + local180 * local180;
						if (local101 > local212 || local101 == local212 && Static143.anIntArrayArray30[local122][local127] < local103) {
							local91 = local110;
							local93 = local116;
							local103 = Static143.anIntArrayArray30[local122][local127];
							local101 = local212;
						}
					}
				}
			}
			if (local101 == Integer.MAX_VALUE) {
				return -1;
			}
		}
		if (local91 == arg11 && arg4 == local93) {
			return 0;
		}
		@Pc(277) byte local277 = 0;
		Static460.anIntArray620[0] = local91;
		local101 = local277 + 1;
		Static529.anIntArray773[0] = local93;
		local103 = local110 = Static355.anIntArrayArray24[local91 - local85][local93 - local89];
		while (local91 != arg11 || arg4 != local93) {
			if (local103 != local110) {
				local110 = local103;
				Static460.anIntArray620[local101] = local91;
				Static529.anIntArray773[local101++] = local93;
			}
			if ((local103 & 0x1) != 0) {
				local93++;
			} else if ((local103 & 0x4) != 0) {
				local93--;
			}
			if ((local103 & 0x2) != 0) {
				local91++;
			} else if ((local103 & 0x8) != 0) {
				local91--;
			}
			local103 = Static355.anIntArrayArray24[local91 - local85][local93 - local89];
		}
		local116 = 0;
		while (local101-- > 0) {
			arg5[local116] = Static460.anIntArray620[local101];
			arg12[local116++] = Static529.anIntArray773[local101];
			if (arg5.length <= local116) {
				break;
			}
		}
		return local116;
	}
}
