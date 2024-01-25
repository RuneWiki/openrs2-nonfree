import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static580 {

	@OriginalMember(owner = "client!tia", name = "Mi", descriptor = "[C")
	public static final char[] aCharArray12 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!tia", name = "z", descriptor = "(B)Lclient!sg;")
	public static Class5_Sub49 method7996() {
		if (Static491.aClass20_4 == null || Static175.aClass215_2 == null) {
			return null;
		}
		Static175.aClass215_2.method4910(Static491.aClass20_4);
		@Pc(29) Class5_Sub49 local29 = (Class5_Sub49) Static175.aClass215_2.method4913();
		if (local29 == null) {
			return null;
		} else {
			@Pc(40) Class313 local40 = Static491.aClass327_2.method7413(local29.anInt8675);
			return local40 != null && local40.aBoolean547 && local40.method7057(Static491.anInterface1_2) ? local29 : Static292.method4640();
		}
	}

	@OriginalMember(owner = "client!tia", name = "m", descriptor = "(II)I")
	public static int method7998(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(23) int local23 = (local13 >>> 2 & 0x33333333) + (local13 & 0x33333333);
		@Pc(31) int local31 = (local23 >>> 4) + local23 & 0xF0F0F0F;
		@Pc(37) int local37 = local31 + (local31 >>> 8);
		@Pc(43) int local43 = local37 + (local37 >>> 16);
		return local43 & 0xFF;
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(IBIIIIII)V")
	public static void method7999(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(14) int local14 = arg1;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21 = arg6 - arg5;
		@Pc(26) int local26 = arg1 - arg5;
		@Pc(30) int local30 = arg6 * arg6;
		@Pc(34) int local34 = arg1 * arg1;
		@Pc(38) int local38 = local21 * local21;
		@Pc(42) int local42 = local26 * local26;
		@Pc(46) int local46 = local34 << 1;
		@Pc(50) int local50 = local30 << 1;
		@Pc(54) int local54 = local42 << 1;
		@Pc(58) int local58 = local38 << 1;
		@Pc(62) int local62 = arg1 << 1;
		@Pc(66) int local66 = local26 << 1;
		@Pc(76) int local76 = (1 - local62) * local30 + local46;
		@Pc(85) int local85 = local34 - local50 * (local62 - 1);
		@Pc(93) int local93 = local54 + local38 * (1 - local66);
		@Pc(101) int local101 = local42 - local58 * (local66 - 1);
		@Pc(105) int local105 = local30 << 2;
		@Pc(109) int local109 = local34 << 2;
		@Pc(113) int local113 = local38 << 2;
		@Pc(117) int local117 = local42 << 2;
		@Pc(121) int local121 = local46 * 3;
		@Pc(127) int local127 = local50 * (local62 - 3);
		@Pc(131) int local131 = local54 * 3;
		@Pc(137) int local137 = local58 * (local66 - 3);
		@Pc(139) int local139 = local109;
		@Pc(145) int local145 = local105 * (arg1 - 1);
		@Pc(147) int local147 = local117;
		@Pc(153) int local153 = local113 * (local26 - 1);
		@Pc(181) int local181;
		@Pc(189) int local189;
		@Pc(197) int local197;
		@Pc(205) int local205;
		if (arg0 >= Static573.anInt8986 && arg0 <= Static319.anInt5445) {
			@Pc(173) int[] local173 = Static120.anIntArrayArray18[arg0];
			local181 = Static236.method3740(Static463.anInt7530, Static230.anInt3962, arg4 - arg6);
			local189 = Static236.method3740(Static463.anInt7530, Static230.anInt3962, arg6 + arg4);
			local197 = Static236.method3740(Static463.anInt7530, Static230.anInt3962, arg4 - local21);
			local205 = Static236.method3740(Static463.anInt7530, Static230.anInt3962, local21 + arg4);
			Static161.method2977(local181, arg2, local197, local173, -114);
			Static161.method2977(local197, arg3, local205, local173, -127);
			Static161.method2977(local205, arg2, local189, local173, -111);
		}
		while (local14 > 0) {
			@Pc(238) boolean local238 = local26 >= local14;
			if (local238) {
				if (local93 < 0) {
					while (local93 < 0) {
						local93 += local131;
						local101 += local147;
						local147 += local117;
						local16++;
						local131 += local117;
					}
				}
				if (local101 < 0) {
					local93 += local131;
					local101 += local147;
					local16++;
					local147 += local117;
					local131 += local117;
				}
				local101 += -local137;
				local93 += -local153;
				local137 -= local113;
				local153 -= local113;
			}
			if (local76 < 0) {
				while (local76 < 0) {
					local85 += local139;
					local76 += local121;
					local139 += local109;
					local7++;
					local121 += local109;
				}
			}
			if (local85 < 0) {
				local76 += local121;
				local85 += local139;
				local121 += local109;
				local7++;
				local139 += local109;
			}
			local85 += -local127;
			local76 += -local145;
			local14--;
			local127 -= local105;
			local145 -= local105;
			local181 = arg0 - local14;
			local189 = arg0 + local14;
			if (Static573.anInt8986 <= local189 && local181 <= Static319.anInt5445) {
				local197 = Static236.method3740(Static463.anInt7530, Static230.anInt3962, arg4 + local7);
				local205 = Static236.method3740(Static463.anInt7530, Static230.anInt3962, arg4 - local7);
				if (local238) {
					@Pc(433) int local433 = Static236.method3740(Static463.anInt7530, Static230.anInt3962, arg4 + local16);
					@Pc(442) int local442 = Static236.method3740(Static463.anInt7530, Static230.anInt3962, arg4 - local16);
					@Pc(453) int[] local453;
					if (local181 >= Static573.anInt8986) {
						local453 = Static120.anIntArrayArray18[local181];
						Static161.method2977(local205, arg2, local442, local453, -117);
						Static161.method2977(local442, arg3, local433, local453, -107);
						Static161.method2977(local433, arg2, local197, local453, -107);
					}
					if (Static319.anInt5445 >= local189) {
						local453 = Static120.anIntArrayArray18[local189];
						Static161.method2977(local205, arg2, local442, local453, -106);
						Static161.method2977(local442, arg3, local433, local453, -127);
						Static161.method2977(local433, arg2, local197, local453, -108);
					}
				} else {
					if (local181 >= Static573.anInt8986) {
						Static161.method2977(local205, arg2, local197, Static120.anIntArrayArray18[local181], -107);
					}
					if (Static319.anInt5445 >= local189) {
						Static161.method2977(local205, arg2, local197, Static120.anIntArrayArray18[local189], -113);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tia", name = "db", descriptor = "(I)I")
	public static int method8000() {
		@Pc(9) int local9 = Static130.aClass40_22.method774();
		if (local9 < Static486.aClass40Array1.length - 1) {
			Static130.aClass40_22 = Static486.aClass40Array1[local9 + 1];
		}
		return 100;
	}
}
