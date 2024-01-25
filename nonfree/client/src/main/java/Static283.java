import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!no", name = "K", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray48 = new String[100];

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(BLjava/lang/String;)J")
	public static long method4014(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) long local10 = 0L;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (long) arg0.charAt(local12) + (local10 << 5) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(BI[Lclient!gi;)V")
	public static void method4015(@OriginalArg(1) int arg0, @OriginalArg(2) Class93[] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(17) Class93 local17 = arg1[local11];
			if (local17 != null && local17.anInt2426 == arg0 && !Static53.method876(local17)) {
				if (local17.anInt2494 == 0) {
					method4015(local17.anInt2508, arg1);
					if (local17.aClass93Array1 != null) {
						method4015(local17.anInt2508, local17.aClass93Array1);
					}
					@Pc(58) Class2_Sub9 local58 = (Class2_Sub9) Static394.aClass220_45.method5099((long) local17.anInt2508);
					if (local58 != null) {
						Static13.method314(local58.anInt1143);
					}
				}
				if (local17.anInt2494 == 6 && local17.anInt2428 != -1) {
					@Pc(78) Class109 local78 = Static37.aClass80_1.method1879(local17.anInt2428);
					if (local78 != null) {
						local17.anInt2433 += Static417.anInt7158;
						while (local17.anInt2433 > local78.anIntArray238[local17.anInt2438]) {
							local17.anInt2433 -= local78.anIntArray238[local17.anInt2438];
							local17.anInt2438++;
							if (local78.anIntArray240.length <= local17.anInt2438) {
								local17.anInt2438 -= local78.anInt2785;
								if (local17.anInt2438 < 0 || local17.anInt2438 >= local78.anIntArray240.length) {
									local17.anInt2438 = 0;
								}
							}
							local17.anInt2455 = local17.anInt2438 + 1;
							if (local17.anInt2455 >= local78.anIntArray240.length) {
								local17.anInt2455 -= local78.anInt2785;
								if (local17.anInt2455 < 0 || local17.anInt2455 >= local78.anIntArray240.length) {
									local17.anInt2455 = -1;
								}
							}
							Static383.method5263(local17);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!za;IIILclient!qg;Lclient!ho;)Z")
	public static boolean method4016(@OriginalArg(0) Class75 arg0, @OriginalArg(4) Class203 arg1, @OriginalArg(5) Class2_Sub16 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg1.anIntArray496 != null) {
			local9 = (Static5.anInt6723 - Static5.anInt6731) * (arg1.anInt5948 + arg2.anInt2879 - Static5.anInt6730) / (Static5.anInt6720 - Static5.anInt6730) + Static5.anInt6731;
			local11 = Static5.anInt6722 - (Static5.anInt6722 - Static5.anInt6728) * (arg1.anInt5955 + (arg2.anInt2882 - Static5.anInt6727)) / (Static5.anInt6724 - Static5.anInt6727);
			local13 = Static5.anInt6722 - (arg2.anInt2882 + arg1.anInt5967 - Static5.anInt6727) * (Static5.anInt6722 - Static5.anInt6728) / (Static5.anInt6724 - Static5.anInt6727);
			local7 = Static5.anInt6731 + (arg1.anInt5956 + arg2.anInt2879 - Static5.anInt6730) * (Static5.anInt6723 - Static5.anInt6731) / (Static5.anInt6720 - Static5.anInt6730);
		}
		@Pc(99) Class41 local99 = null;
		@Pc(101) int local101 = 0;
		@Pc(103) int local103 = 0;
		@Pc(105) int local105 = 0;
		@Pc(107) int local107 = 0;
		if (arg1.anInt5962 != -1) {
			if (arg2.aBoolean181 && arg1.anInt5974 != -1) {
				local99 = arg1.method4736(true, arg0);
			} else {
				local99 = arg1.method4736(false, arg0);
			}
			if (local99 != null) {
				local101 = arg2.anInt2884 - (local99.RA() + 1 >> 1);
				if (local7 > local101) {
					local7 = local101;
				}
				local103 = arg2.anInt2884 + (local99.RA() + 1 >> 1);
				if (local9 < local103) {
					local9 = local103;
				}
				local105 = arg2.anInt2881 - (local99.Q() + 1 >> 1);
				if (local105 < local11) {
					local11 = local105;
				}
				local107 = arg2.anInt2881 + (local99.Q() + 1 >> 1);
				if (local107 > local13) {
					local13 = local107;
				}
			}
		}
		@Pc(211) Class223 local211 = null;
		@Pc(213) int local213 = 0;
		@Pc(223) int local223 = 0;
		@Pc(225) int local225 = 0;
		@Pc(227) int local227 = 0;
		@Pc(229) int local229 = 0;
		@Pc(231) int local231 = 0;
		@Pc(233) int local233 = 0;
		@Pc(283) int local283;
		@Pc(310) int local310;
		if (arg1.aString62 != null) {
			local211 = Static161.method2385(arg1.anInt5968);
			if (local211 != null) {
				local213 = Static419.aClass15_10.method328(arg1.aString62, null, Static51.aStringArray9, null);
				local223 = arg2.anInt2881;
				if (local99 == null) {
					local223 -= local211.method5140() * local213 / 2;
				} else {
					local223 -= (local99.Q() >> 1) + (local211.method5134() * local213);
				}
				for (local283 = 0; local283 < local213; local283++) {
					@Pc(289) String local289 = Static51.aStringArray9[local283];
					if (local283 < local213 - 1) {
						local289 = local289.substring(0, local289.length() - 4);
					}
					local310 = local211.method5136(local289);
					if (local225 < local310) {
						local225 = local310;
					}
				}
				local227 = arg2.anInt2884 - local225 / 2;
				if (local227 < local7) {
					local7 = local227;
				}
				local229 = arg2.anInt2884 + local225 / 2;
				local231 = local223;
				if (local229 > local9) {
					local9 = local229;
				}
				if (local11 > local231) {
					local11 = local231;
				}
				local233 = local223 + local211.method5134() * local213;
				if (local233 > local13) {
					local13 = local233;
				}
			}
		}
		if (local9 < Static5.anInt6731 || local7 > Static5.anInt6723 || Static5.anInt6728 > local13 || local11 > Static5.anInt6722) {
			return true;
		}
		@Pc(419) int local419;
		if (arg1.anIntArray496 != null) {
			@Pc(417) int[] local417 = new int[arg1.anIntArray496.length];
			for (local419 = 0; local419 < local417.length / 2; local419++) {
				local310 = arg1.anIntArray496[local419 * 2] + arg2.anInt2879;
				@Pc(444) int local444 = arg2.anInt2882 + arg1.anIntArray496[local419 * 2 + 1];
				local417[local419 * 2] = Static5.anInt6731 + (local310 - Static5.anInt6730) * (Static5.anInt6723 - Static5.anInt6731) / (Static5.anInt6720 - Static5.anInt6730);
				local417[local419 * 2 + 1] = Static5.anInt6722 - (local444 - Static5.anInt6727) * (Static5.anInt6722 - Static5.anInt6728) / (Static5.anInt6724 - Static5.anInt6727);
			}
			Static40.method619(arg0, local417, arg1.anInt5944);
			for (local310 = 0; local310 < local417.length / 2 - 1; local310++) {
				arg0.method6011(local417[local310 * 2], local417[local310 * 2 + 1], local417[local310 * 2 + 2], local417[local310 * 2 + 3], arg1.anInt5949);
			}
			arg0.method6011(local417[local417.length - 2], local417[local417.length - 1], local417[0], local417[1], arg1.anInt5949);
		}
		if (local99 != null) {
			if (Static340.anInt6086 > 0 && (Static377.anInt6587 != -1 && arg2.anInt2880 == Static377.anInt6587 || Static139.anInt2570 != -1 && Static139.anInt2570 == arg1.anInt5975)) {
				if (Static37.anInt611 <= 50) {
					local283 = Static37.anInt611 * 2;
				} else {
					local283 = 200 - Static37.anInt611 * 2;
				}
				local419 = local283 << 24 | 0xFFFF00;
				arg0.method5981(local99.YA() / 2 + 7, local419, arg2.anInt2881, arg2.anInt2884);
				arg0.method5981(local99.YA() / 2 + 5, local419, arg2.anInt2881, arg2.anInt2884);
				arg0.method5981(local99.YA() / 2 + 3, local419, arg2.anInt2881, arg2.anInt2884);
				arg0.method5981(local99.YA() / 2 + 1, local419, arg2.anInt2881, arg2.anInt2884);
				arg0.method5981(local99.YA() / 2, local419, arg2.anInt2881, arg2.anInt2884);
			}
			local99.method6090(arg2.anInt2884 - (local99.RA() >> 1), arg2.anInt2881 + -(local99.Q() >> 1));
		}
		if (arg1.aString62 != null && local211 != null) {
			Static313.method4466(local211, local223, local213, arg0, arg1, local225, arg2);
		}
		if (arg1.anInt5962 != -1 || arg1.aString62 != null) {
			@Pc(729) Class2_Sub32 local729 = new Class2_Sub32(arg2);
			local729.anInt5520 = local101;
			local729.anInt5516 = local231;
			local729.anInt5514 = local107;
			local729.anInt5522 = local229;
			local729.anInt5519 = local103;
			local729.anInt5523 = local105;
			local729.anInt5524 = local227;
			local729.anInt5518 = local233;
			Static463.aClass181_53.method3973(local729);
		}
		return false;
	}

	@OriginalMember(owner = "client!no", name = "f", descriptor = "(III)Z")
	public static boolean method4019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static330.method4706(arg1, arg0) & Static368.method6261(arg1, arg0);
	}
}
