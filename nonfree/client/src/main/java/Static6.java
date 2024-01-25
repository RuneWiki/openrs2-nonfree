import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ae", name = "z", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!ae", name = "O", descriptor = "I")
	public static int anInt62;

	@OriginalMember(owner = "client!ae", name = "F", descriptor = "I")
	public static int anInt57 = -1;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IILclient!t;IIILclient!ya;IIIIIZLclient!lp;I)Lclient!t;")
	public static Class110 method48(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class110 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class19 arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) boolean arg11, @OriginalArg(13) Class138 arg12, @OriginalArg(14) int arg13) {
		if (arg2 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg12 != null) {
			local11 = arg12.method3457(arg10, -1, false) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(48) long local48 = ((long) arg5 << 48) + (long) ((arg13 << 24) + (arg8 + (arg7 << 16))) + ((long) arg3 << 32);
		@Pc(50) Class68 local50 = Static221.aClass68_24;
		@Pc(58) Class110 local58;
		synchronized (Static221.aClass68_24) {
			local58 = (Class110) Static221.aClass68_24.method1787(local48);
		}
		@Pc(163) int local163;
		@Pc(169) int local169;
		@Pc(175) int local175;
		@Pc(179) int local179;
		if (local58 == null || arg6.method4269(local58.P(), local11) != 0) {
			if (local58 != null) {
				local11 = arg6.method4282(local11, local58.P());
			}
			@Pc(98) byte local98;
			if (arg8 == 1) {
				local98 = 9;
			} else if (arg8 == 2) {
				local98 = 12;
			} else if (arg8 == 3) {
				local98 = 15;
			} else if (arg8 == 4) {
				local98 = 18;
			} else {
				local98 = 21;
			}
			@Pc(137) int[] local137 = new int[] { 64, 96, 128 };
			@Pc(156) Class122 local156 = new Class122(local98 * 3 + 1, -local98 + local98 * 2 * 3, 0);
			local163 = local156.method3040(0, 0, 0);
			@Pc(167) int[][] local167 = new int[3][local98];
			@Pc(181) int local181;
			@Pc(205) int local205;
			for (local169 = 0; local169 < 3; local169++) {
				local175 = local137[local169];
				local179 = local137[local169];
				for (local181 = 0; local181 < local98; local181++) {
					@Pc(189) int local189 = (local181 << 14) / local98;
					@Pc(197) int local197 = local175 * Class50_Sub1.anIntArray225[local189] >> 15;
					local205 = Class50_Sub1.anIntArray224[local189] * local179 >> 15;
					local167[local169][local181] = local156.method3040(local205, 0, local197);
				}
			}
			for (local175 = 0; local175 < 3; local175++) {
				local179 = (local175 * 256 + 128) / 3;
				local181 = 256 - local179;
				@Pc(256) byte local256 = (byte) (arg13 * local179 + local181 * arg7 >> 8);
				@Pc(301) short local301 = (short) ((local179 * (arg5 & 0x7F) + local181 * (arg3 & 0x7F) & 0x7F00) + (local179 * (arg5 & 0xFC00) + (arg3 & 0xFC00) * local181 & 0xFC0000) + ((arg3 & 0x380) * local181 + local179 * (arg5 & 0x380) & 0x38000) >> 8);
				for (local205 = 0; local205 < local98; local205++) {
					if (local175 == 0) {
						local156.method3047(local167[0][local205], (short) -1, (byte) -1, local163, local167[0][(local205 + 1) % local98], local301, (byte) 1, local256);
					} else {
						local156.method3047(local167[local175][(local205 + 1) % local98], (short) -1, (byte) -1, local167[local175 - 1][local205], local167[local175 - 1][(local205 + 1) % local98], local301, (byte) 1, local256);
						local156.method3047(local167[local175][local205], (short) -1, (byte) -1, local167[local175 - 1][local205], local167[local175][(local205 + 1) % local98], local301, (byte) 1, local256);
					}
				}
			}
			local58 = arg6.method4254(local156, local11, Static207.anInt5454, 64, 768);
			@Pc(424) Class68 local424 = Static221.aClass68_24;
			synchronized (Static221.aClass68_24) {
				Static221.aClass68_24.method1779(local48, local58);
			}
		}
		@Pc(443) int local443 = (arg8 << 6) - 1;
		@Pc(446) int local446 = -local443;
		@Pc(449) int local449 = -local443;
		@Pc(451) int local451 = local443;
		local163 = local443;
		if (arg11) {
			if (arg9 > 1024 && arg9 < 7168) {
				local446 -= 128;
			}
			if (arg9 > 13312 || arg9 < 3072) {
				local449 -= 128;
			}
			if (arg9 > 9216 && arg9 < 15360) {
				local451 = local443 + 128;
			}
			if (arg9 > 5120 && arg9 < 11264) {
				local163 = local443 + 128;
			}
		}
		@Pc(496) int local496 = arg2.HA();
		local169 = arg2.NA();
		local175 = arg2.PA();
		if (local449 > local175) {
			local175 = local449;
		}
		if (local169 > local451) {
			local169 = local451;
		}
		if (local446 > local496) {
			local496 = local446;
		}
		local179 = arg2.m();
		if (local179 > local163) {
			local179 = local163;
		}
		@Pc(539) Class4_Sub1_Sub17 local539 = null;
		if (arg12 != null) {
			@Pc(546) int local546 = arg12.anIntArray295[arg10];
			local539 = Static182.aClass55_1.method1391(local546 >> 16);
			arg10 = local546 & 0xFFFF;
		}
		if (local539 == null) {
			local58 = local58.method4887((byte) 3, local11, true);
			local58.H(local169 - local496 >> 1, 128, local179 - local175 >> 1);
			local58.JA(local169 + local496 >> 1, 0, local179 + local175 >> 1);
		} else {
			local58 = local58.method4887((byte) 3, local11, true);
			local58.H(local169 - local496 >> 1, 128, local179 - local175 >> 1);
			local58.JA(local496 + local169 >> 1, 0, local179 + local175 >> 1);
			local58.method4892(arg10, local539);
		}
		if (arg1 != 0) {
			local58.Z(arg1);
		}
		if (arg0 != 0) {
			local58.R(arg0);
		}
		if (arg4 != 0) {
			local58.JA(0, arg4, 0);
		}
		return local58;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BLclient!sd;IIIIII[IIZ[IIII)I")
	public static int method49(@OriginalArg(1) Class213 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 128; local11++) {
				Static159.anIntArrayArray30[local7][local11] = 0;
				Static14.anIntArrayArray1[local7][local11] = 99999999;
			}
		}
		@Pc(55) boolean local55;
		if (arg5 == 1) {
			local55 = Static412.method5296(arg3, arg6, arg13, arg2, arg0, arg4, arg8, arg12, arg11, arg1);
		} else if (arg5 == 2) {
			local55 = Static33.method634(arg13, arg0, arg6, arg3, arg12, arg1, arg4, arg11, arg2, arg8);
		} else {
			local55 = Static234.method3499(arg2, arg12, arg6, arg1, arg0, arg4, arg11, arg3, arg5, arg8, arg13);
		}
		@Pc(89) int local89 = arg1 - 64;
		@Pc(93) int local93 = arg11 - 64;
		@Pc(95) int local95 = Static389.anInt6521;
		@Pc(97) int local97 = Static102.anInt2045;
		@Pc(105) int local105;
		@Pc(107) int local107;
		@Pc(114) int local114;
		if (!local55) {
			if (!arg9) {
				return -1;
			}
			local105 = Integer.MAX_VALUE;
			local107 = Integer.MAX_VALUE;
			for (local114 = arg2 - 10; local114 <= arg2 + 10; local114++) {
				for (@Pc(120) int local120 = arg4 - 10; local120 <= arg4 + 10; local120++) {
					@Pc(127) int local127 = local114 - local89;
					@Pc(132) int local132 = local120 - local93;
					if (local127 >= 0 && local132 >= 0 && local127 < 128 && local132 < 128 && Static14.anIntArrayArray1[local127][local132] < 100) {
						@Pc(161) int local161 = 0;
						if (local114 < arg2) {
							local161 = arg2 - local114;
						} else if (local114 > arg3 + arg2 - 1) {
							local161 = local114 + 1 - arg2 - arg3;
						}
						@Pc(193) int local193 = 0;
						if (arg4 > local120) {
							local193 = arg4 - local120;
						} else if (local120 > arg4 + arg12 - 1) {
							local193 = local120 + 1 - arg4 - arg12;
						}
						@Pc(232) int local232 = local161 * local161 + local193 * local193;
						if (local105 > local232 || local232 == local105 && local107 > Static14.anIntArrayArray1[local127][local132]) {
							local107 = Static14.anIntArrayArray1[local127][local132];
							local95 = local114;
							local105 = local232;
							local97 = local120;
						}
					}
				}
			}
			if (~local105 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (arg1 == local95 && local97 == arg11) {
			return 0;
		}
		@Pc(299) byte local299 = 0;
		Static129.anIntArray182[0] = local95;
		local105 = local299 + 1;
		Static416.anIntArray526[0] = local97;
		@Pc(326) int local326;
		local107 = local326 = Static159.anIntArrayArray30[local95 - local89][local97 - local93];
		while (arg1 != local95 || arg11 != local97) {
			if (local107 != local326) {
				local326 = local107;
				Static129.anIntArray182[local105] = local95;
				Static416.anIntArray526[local105++] = local97;
			}
			if ((local107 & 0x1) != 0) {
				local97++;
			} else if ((local107 & 0x4) != 0) {
				local97--;
			}
			if ((local107 & 0x2) != 0) {
				local95++;
			} else if ((local107 & 0x8) != 0) {
				local95--;
			}
			local107 = Static159.anIntArrayArray30[local95 - local89][local97 - local93];
		}
		local114 = 0;
		while (local105-- > 0) {
			arg10[local114] = Static129.anIntArray182[local105];
			arg7[local114++] = Static416.anIntArray526[local105];
			if (local114 >= arg10.length) {
				break;
			}
		}
		return local114;
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(II)V")
	public static void method51(@OriginalArg(0) int arg0) {
		Static259.anInt4879 = arg0;
		Static232.aClass68_25.method1777();
	}
}
