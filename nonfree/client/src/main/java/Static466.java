import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static466 {

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(B[I[I[ILclient!sg;)V")
	public static void method6322(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class11_Sub5_Sub2_Sub2 arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(21) int local21 = arg1[local7];
			@Pc(25) int local25 = arg2[local7];
			@Pc(29) int local29 = arg0[local7];
			@Pc(31) int local31 = 0;
			while (local25 != 0 && arg3.aClass15Array3.length > local31) {
				if ((local25 & 0x1) != 0) {
					if (local21 == -1) {
						arg3.aClass15Array3[local31] = null;
					} else {
						@Pc(52) Class130 local52 = Static143.aClass85_1.method2406(local21);
						@Pc(55) int local55 = local52.anInt3937;
						@Pc(60) Class15 local60 = arg3.aClass15Array3[local31];
						if (local60 != null) {
							if (local21 == local60.anInt301) {
								if (local55 == 0) {
									local60 = arg3.aClass15Array3[local31] = null;
								} else if (local55 == 1) {
									local60.anInt299 = 0;
									local60.anInt297 = 0;
									local60.anInt300 = local29;
									local60.anInt302 = 0;
									local60.anInt298 = 1;
									Static125.method2339(arg3.anInt7514, 0, arg3.anInt7515, false, local52, arg3.aByte100);
								} else if (local55 == 2) {
									local60.anInt299 = 0;
								}
							} else if (local52.anInt3938 >= Static143.aClass85_1.method2406(local60.anInt301).anInt3938) {
								local60 = arg3.aClass15Array3[local31] = null;
							}
						}
						if (local60 == null) {
							local60 = arg3.aClass15Array3[local31] = new Class15();
							local60.anInt297 = 0;
							local60.anInt299 = 0;
							local60.anInt302 = 0;
							local60.anInt298 = 1;
							local60.anInt301 = local21;
							local60.anInt300 = local29;
							Static125.method2339(arg3.anInt7514, 0, arg3.anInt7515, false, local52, arg3.aByte100);
						}
					}
				}
				local31++;
				local25 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!rg;IILclient!qa;Lclient!au;I)Z")
	public static boolean method6323(@OriginalArg(0) Class217 arg0, @OriginalArg(3) Class30 arg1, @OriginalArg(4) Class4_Sub4 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg0.anIntArray499 != null) {
			local9 = Static425.anInt3663 + (arg0.anInt6183 + arg2.anInt359 - Static425.anInt3661) * (Static425.anInt3660 - Static425.anInt3663) / (Static425.anInt3656 - Static425.anInt3661);
			local11 = Static425.anInt3666 - (arg0.anInt6197 + arg2.anInt364 - Static425.anInt3662) * (Static425.anInt3666 - Static425.anInt3665) / (Static425.anInt3664 - Static425.anInt3662);
			local7 = Static425.anInt3663 + (Static425.anInt3660 - Static425.anInt3663) * (arg0.anInt6168 + (arg2.anInt359 - Static425.anInt3661)) / (Static425.anInt3656 - Static425.anInt3661);
			local13 = Static425.anInt3666 - (Static425.anInt3666 - Static425.anInt3665) * (arg0.anInt6173 - (Static425.anInt3662 - arg2.anInt364)) / (Static425.anInt3664 - Static425.anInt3662);
		}
		@Pc(100) Class2 local100 = null;
		@Pc(102) int local102 = 0;
		@Pc(104) int local104 = 0;
		@Pc(106) int local106 = 0;
		@Pc(108) int local108 = 0;
		if (arg0.anInt6181 != -1) {
			if (arg2.aBoolean19 && arg0.anInt6185 != -1) {
				local100 = arg0.method5091(arg1, true);
			} else {
				local100 = arg0.method5091(arg1, false);
			}
			if (local100 != null) {
				local102 = arg2.anInt362 - (local100.d() + 1 >> 1);
				if (local7 > local102) {
					local7 = local102;
				}
				local104 = arg2.anInt362 + (local100.d() + 1 >> 1);
				if (local9 < local104) {
					local9 = local104;
				}
				local106 = arg2.anInt365 - (local100.ga() + 1 >> 1);
				if (local106 < local11) {
					local11 = local106;
				}
				local108 = arg2.anInt365 + (local100.ga() + 1 >> 1);
				if (local13 < local108) {
					local13 = local108;
				}
			}
		}
		@Pc(205) Class122 local205 = null;
		@Pc(207) int local207 = 0;
		@Pc(209) int local209 = 0;
		@Pc(211) int local211 = 0;
		@Pc(213) int local213 = 0;
		@Pc(215) int local215 = 0;
		@Pc(217) int local217 = 0;
		@Pc(219) int local219 = 0;
		@Pc(268) int local268;
		@Pc(295) int local295;
		if (arg0.aString53 != null) {
			local205 = Static459.method5990(arg0.anInt6195);
			if (local205 != null) {
				local207 = Static94.aClass84_3.method2376(null, arg0.aString53, Static124.aStringArray13, null);
				local209 = arg2.anInt365;
				if (local100 == null) {
					local209 -= local207 * local205.method3398() / 2;
				} else {
					local209 -= (local100.ga() >> 1) + local207 * local205.method3400();
				}
				for (local268 = 0; local268 < local207; local268++) {
					@Pc(274) String local274 = Static124.aStringArray13[local268];
					if (local207 - 1 > local268) {
						local274 = local274.substring(0, local274.length() - 4);
					}
					local295 = local205.method3403(local274);
					if (local211 < local295) {
						local211 = local295;
					}
				}
				local213 = arg2.anInt362 - local211 / 2;
				if (local213 < local7) {
					local7 = local213;
				}
				local215 = local211 / 2 + arg2.anInt362;
				local217 = local209;
				if (local9 < local215) {
					local9 = local215;
				}
				if (local217 < local11) {
					local11 = local217;
				}
				local219 = local209 + local205.method3400() * local207;
				if (local219 > local13) {
					local13 = local219;
				}
			}
		}
		if (local9 < Static425.anInt3663 || Static425.anInt3660 < local7 || local13 < Static425.anInt3665 || Static425.anInt3666 < local11) {
			return true;
		}
		@Pc(401) int local401;
		if (arg0.anIntArray499 != null) {
			@Pc(399) int[] local399 = new int[arg0.anIntArray499.length];
			for (local401 = 0; local401 < local399.length / 2; local401++) {
				local295 = arg2.anInt359 + arg0.anIntArray499[local401 * 2];
				@Pc(426) int local426 = arg0.anIntArray499[local401 * 2 + 1] + arg2.anInt364;
				local399[local401 * 2] = (local295 - Static425.anInt3661) * (Static425.anInt3660 + -Static425.anInt3663) / (Static425.anInt3656 - Static425.anInt3661) + Static425.anInt3663;
				local399[local401 * 2 + 1] = Static425.anInt3666 - (local426 - Static425.anInt3662) * (Static425.anInt3666 - Static425.anInt3665) / (Static425.anInt3664 - Static425.anInt3662);
			}
			Static152.method2810(arg1, local399, arg0.anInt6189);
			for (local295 = 0; local295 < local399.length / 2 - 1; local295++) {
				arg1.method2080(local399[local295 * 2 + 1], local399[(local295 + 1) * 2], local399[local295 * 2], local399[(local295 + 1) * 2 + 1], arg0.anInt6163);
			}
			arg1.method2080(local399[local399.length - 1], local399[0], local399[local399.length - 2], local399[1], arg0.anInt6163);
		}
		if (local100 != null) {
			if (Static355.anInt6248 > 0 && (Static9.anInt194 != -1 && Static9.anInt194 == arg2.anInt366 || Static209.anInt4256 != -1 && arg0.anInt6182 == Static209.anInt4256)) {
				if (Static399.anInt7064 > 50) {
					local268 = (100 - Static399.anInt7064) * 2;
				} else {
					local268 = Static399.anInt7064 * 2;
				}
				local401 = local268 << 24 | 0xFFFF00;
				arg1.method2105(arg2.anInt362, local100.TA() / 2 + 7, local401, arg2.anInt365);
				arg1.method2105(arg2.anInt362, local100.TA() / 2 + 5, local401, arg2.anInt365);
				arg1.method2105(arg2.anInt362, local100.TA() / 2 + 3, local401, arg2.anInt365);
				arg1.method2105(arg2.anInt362, local100.TA() / 2 + 1, local401, arg2.anInt365);
				arg1.method2105(arg2.anInt362, local100.TA() / 2, local401, arg2.anInt365);
			}
			local100.method5921(arg2.anInt362 - (local100.d() >> 1), arg2.anInt365 + -(local100.ga() >> 1));
		}
		if (arg0.aString53 != null && local205 != null) {
			Static55.method1206(local207, arg0, local211, arg1, local209, arg2, local205);
		}
		if (arg0.anInt6181 != -1 || arg0.aString53 != null) {
			@Pc(727) Class4_Sub43 local727 = new Class4_Sub43(arg2);
			local727.anInt7312 = local213;
			local727.anInt7317 = local215;
			local727.anInt7319 = local106;
			local727.anInt7314 = local219;
			local727.anInt7315 = local217;
			local727.anInt7320 = local102;
			local727.anInt7322 = local108;
			local727.anInt7313 = local104;
			Static345.aClass91_41.method2587(local727);
		}
		return false;
	}
}
