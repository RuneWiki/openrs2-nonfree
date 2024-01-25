import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static479 {

	@OriginalMember(owner = "client!sga", name = "n", descriptor = "Lclient!kaa;")
	public static Class168 aClass168_9;

	@OriginalMember(owner = "client!sga", name = "i", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_153 = new Class73(2, 2);

	@OriginalMember(owner = "client!sga", name = "k", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_154 = new Class73(52, 5);

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(ILclient!fa;Lclient!rr;ZIIIJI)V")
	public static void method6615(@OriginalArg(0) int arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) Class292 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = arg4 * arg4 + arg7 * arg7;
		if ((long) local16 > arg6) {
			return;
		}
		@Pc(36) int local36 = Math.min(arg2.anInt7963 / 2, arg2.anInt7912 / 2);
		if (local36 * local36 >= local16) {
			Static368.method5525(arg4, Static347.aClass58Array15[arg5], arg7, arg0, arg3, arg1, arg2);
			return;
		}
		local36 -= 10;
		@Pc(68) int local68;
		if (Static346.anInt6215 == 4) {
			local68 = (int) Static428.aFloat160 & 0x3FFF;
		} else {
			local68 = Static185.anInt3860 + (int) Static428.aFloat160 & 0x3FFF;
		}
		@Pc(81) int local81 = Class6_Sub2_Sub7.anIntArray178[local68];
		@Pc(85) int local85 = Class6_Sub2_Sub7.anIntArray177[local68];
		if (Static346.anInt6215 != 4) {
			local81 = local81 * 256 / (Static291.anInt5446 + 256);
			local85 = local85 * 256 / (Static291.anInt5446 + 256);
		}
		@Pc(116) int local116 = local85 * arg4 + local81 * arg7 >> 14;
		@Pc(127) int local127 = arg7 * local85 - arg4 * local81 >> 14;
		@Pc(133) double local133 = Math.atan2((double) local116, (double) local127);
		@Pc(140) int local140 = (int) ((double) local36 * Math.sin(local133));
		@Pc(147) int local147 = (int) ((double) local36 * Math.cos(local133));
		Static134.aClass58Array5[arg5].method7665((float) arg2.anInt7963 / 2.0F + (float) arg3 + (float) local140, (float) arg2.anInt7912 / 2.0F + (float) arg0 - (float) local147, 4096, (int) (-local133 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(IB)I")
	public static int method6616(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(IJII)V")
	public static void method6617(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = (int) arg0 >> 14 & 0x1F;
		@Pc(22) int local22 = (int) arg0 >> 20 & 0x3;
		@Pc(29) int local29 = Integer.MAX_VALUE & (int) (arg0 >>> 32);
		if (local15 != 10 && local15 != 11 && local15 != 22) {
			Static32.method910(local15, true, 0, arg1, local22, 0, 0, arg2);
			return;
		}
		@Pc(61) Class252 local61 = Static412.aClass307_4.method6636(local29);
		@Pc(72) int local72;
		@Pc(69) int local69;
		if (local22 == 0 || local22 == 2) {
			local72 = local61.anInt6935;
			local69 = local61.anInt6898;
		} else {
			local69 = local61.anInt6935;
			local72 = local61.anInt6898;
		}
		@Pc(83) int local83 = local61.anInt6931;
		if (local22 != 0) {
			local83 = (local83 << local22 & 0xF) + (local83 >> 4 - local22);
		}
		Static32.method910(0, true, local69, arg1, 0, local83, local72, arg2);
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(IIIIIIII)V")
	public static void method6619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg1 - arg5;
		@Pc(21) int local21 = arg3 - arg5;
		@Pc(25) int local25 = arg1 * arg1;
		@Pc(29) int local29 = arg3 * arg3;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg3 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(70) int local70 = local41 + local25 * (1 - local57);
		@Pc(79) int local79 = local29 - (local57 - 1) * local45;
		@Pc(88) int local88 = local49 + local33 * (1 - local61);
		@Pc(97) int local97 = local37 - local53 * (local61 - 1);
		@Pc(101) int local101 = local25 << 2;
		@Pc(105) int local105 = local29 << 2;
		@Pc(109) int local109 = local33 << 2;
		@Pc(113) int local113 = local37 << 2;
		@Pc(117) int local117 = local41 * 3;
		@Pc(123) int local123 = local45 * (local57 - 3);
		@Pc(127) int local127 = local49 * 3;
		@Pc(133) int local133 = local53 * (local61 - 3);
		@Pc(135) int local135 = local105;
		@Pc(141) int local141 = local101 * (arg3 - 1);
		@Pc(143) int local143 = local113;
		@Pc(149) int local149 = (local21 - 1) * local109;
		@Pc(153) int[] local153 = Static454.anIntArrayArray71[arg2];
		Static208.method3687(arg0 - arg1, arg4, local153, arg0 - local16);
		Static208.method3687(arg0 - local16, arg6, local153, arg0 + local16);
		Static208.method3687(arg0 + local16, arg4, local153, arg1 + arg0);
		while (local9 > 0) {
			@Pc(194) boolean local194 = local21 >= local9;
			if (local70 < 0) {
				while (local70 < 0) {
					local79 += local135;
					local70 += local117;
					local135 += local105;
					local117 += local105;
					local7++;
				}
			}
			if (local194) {
				if (local88 < 0) {
					while (local88 < 0) {
						local88 += local127;
						local97 += local143;
						local143 += local113;
						local11++;
						local127 += local113;
					}
				}
				if (local97 < 0) {
					local88 += local127;
					local97 += local143;
					local143 += local113;
					local11++;
					local127 += local113;
				}
				local88 += -local149;
				local97 += -local133;
				local133 -= local109;
				local149 -= local109;
			}
			if (local79 < 0) {
				local79 += local135;
				local70 += local117;
				local117 += local105;
				local7++;
				local135 += local105;
			}
			local79 += -local123;
			local70 += -local141;
			local123 -= local101;
			local141 -= local101;
			local9--;
			@Pc(333) int local333 = arg2 - local9;
			@Pc(337) int local337 = arg2 + local9;
			@Pc(341) int local341 = arg0 + local7;
			@Pc(346) int local346 = arg0 - local7;
			if (local194) {
				@Pc(370) int local370 = local11 + arg0;
				@Pc(375) int local375 = arg0 - local11;
				Static208.method3687(local346, arg4, Static454.anIntArrayArray71[local333], local375);
				Static208.method3687(local375, arg6, Static454.anIntArrayArray71[local333], local370);
				Static208.method3687(local370, arg4, Static454.anIntArrayArray71[local333], local341);
				Static208.method3687(local346, arg4, Static454.anIntArrayArray71[local337], local375);
				Static208.method3687(local375, arg6, Static454.anIntArrayArray71[local337], local370);
				Static208.method3687(local370, arg4, Static454.anIntArrayArray71[local337], local341);
			} else {
				Static208.method3687(local346, arg4, Static454.anIntArrayArray71[local333], local341);
				Static208.method3687(local346, arg4, Static454.anIntArrayArray71[local337], local341);
			}
		}
	}

	@OriginalMember(owner = "client!sga", name = "d", descriptor = "(I)I")
	public static int method6620() {
		if (Static587.aBoolean734) {
			return 6;
		} else if (Static328.aClass6_Sub45_3 == null) {
			return 0;
		} else {
			@Pc(14) int local14 = Static328.aClass6_Sub45_3.anInt8730;
			if (Static105.method1887(local14)) {
				return 1;
			} else if (Static189.method3425(local14)) {
				return 2;
			} else if (Static357.method5419(local14)) {
				return 3;
			} else if (Static280.method4614(local14)) {
				return 4;
			} else {
				return 5;
			}
		}
	}
}
