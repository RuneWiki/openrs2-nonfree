import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!lq", name = "Q", descriptor = "Lclient!dn;")
	public static Class56 aClass56_60;

	@OriginalMember(owner = "client!lq", name = "N", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_162 = new Class184(53, 8);

	@OriginalMember(owner = "client!lq", name = "S", descriptor = "[I")
	public static final int[] anIntArray354 = new int[1000];

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3731(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg3 + arg2;
		@Pc(12) int local12 = arg5 - arg3;
		for (@Pc(22) int local22 = arg2; local22 < local7; local22++) {
			Static15.method463(arg4, Static376.anIntArrayArray64[local22], arg1, arg0);
		}
		@Pc(39) int local39 = arg3 + arg1;
		@Pc(44) int local44 = arg0 - arg3;
		for (@Pc(46) int local46 = arg5; local46 > local12; local46--) {
			Static15.method463(arg4, Static376.anIntArrayArray64[local46], arg1, arg0);
		}
		for (@Pc(61) int local61 = local7; local61 <= local12; local61++) {
			@Pc(66) int[] local66 = Static376.anIntArrayArray64[local61];
			Static15.method463(arg4, local66, arg1, local39);
			Static15.method463(arg6, local66, local39, local44);
			Static15.method463(arg4, local66, local44, arg0);
		}
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(Z)V")
	public static void method3733() {
		if (Static70.anInt1610 == -1 || Static447.anInt7550 == -1) {
			return;
		}
		@Pc(25) int local25 = (Static61.anInt1445 * (Static183.anInt4105 - Static128.anInt2705) >> 16) + Static128.anInt2705;
		Static61.anInt1445 += local25;
		if (Static61.anInt1445 < 65535) {
			Static116.aBoolean467 = false;
			Static453.aBoolean526 = false;
		} else {
			Static61.anInt1445 = 65535;
			if (Static116.aBoolean467) {
				Static453.aBoolean526 = false;
			} else {
				Static453.aBoolean526 = true;
			}
			Static116.aBoolean467 = true;
		}
		@Pc(53) float local53 = (float) Static61.anInt1445 / 65535.0F;
		@Pc(56) float[] local56 = new float[3];
		@Pc(60) int local60 = Static221.anInt4292 * 2;
		@Pc(85) int local85;
		@Pc(118) int local118;
		@Pc(126) int local126;
		@Pc(131) int local131;
		@Pc(140) int local140;
		@Pc(158) int local158;
		for (@Pc(62) int local62 = 0; local62 < 3; local62++) {
			@Pc(73) int local73 = Static158.anIntArrayArrayArray10[Static70.anInt1610][local60][local62] * 3;
			local85 = Static158.anIntArrayArrayArray10[Static70.anInt1610][local60 + 1][local62] * 3;
			local118 = (Static158.anIntArrayArrayArray10[Static70.anInt1610][local60 + 2][local62] + Static158.anIntArrayArrayArray10[Static70.anInt1610][local60 + 2][local62] - Static158.anIntArrayArrayArray10[Static70.anInt1610][local60 + 3][local62]) * 3;
			local126 = Static158.anIntArrayArrayArray10[Static70.anInt1610][local60][local62];
			local131 = local85 - local73;
			local140 = local118 + local73 - local85 * 2;
			local158 = Static158.anIntArrayArrayArray10[Static70.anInt1610][local60 + 2][local62] + local85 - local118 - local126;
			local56[local62] = (float) local126 + ((float) local131 + local53 * ((float) local158 * local53 + (float) local140)) * local53;
		}
		Static80.anInt1722 = (int) local56[2] - Static339.anInt6223 * 128;
		Static422.anInt7281 = (int) local56[1] * -1;
		Static398.anInt6901 = (int) local56[0] - Static108.anInt3458 * 128;
		@Pc(212) float[] local212 = new float[3];
		local85 = Static274.anInt5077 * 2;
		for (local118 = 0; local118 < 3; local118++) {
			local126 = Static158.anIntArrayArrayArray10[Static447.anInt7550][local85][local118] * 3;
			local131 = Static158.anIntArrayArrayArray10[Static447.anInt7550][local85 + 1][local118] * 3;
			local140 = (Static158.anIntArrayArrayArray10[Static447.anInt7550][local85 + 2][local118] + Static158.anIntArrayArrayArray10[Static447.anInt7550][local85 + 2][local118] - Static158.anIntArrayArrayArray10[Static447.anInt7550][local85 + 3][local118]) * 3;
			local158 = Static158.anIntArrayArrayArray10[Static447.anInt7550][local85][local118];
			@Pc(287) int local287 = local131 - local126;
			@Pc(295) int local295 = local140 + local126 - local131 * 2;
			@Pc(312) int local312 = local131 + Static158.anIntArrayArrayArray10[Static447.anInt7550][local85 + 2][local118] - local158 - local140;
			local212[local118] = (float) local158 + local53 * ((float) local287 + local53 * (local53 * (float) local312 + (float) local295));
		}
		@Pc(347) float local347 = local212[0] - local56[0];
		@Pc(357) float local357 = (local212[1] - local56[1]) * -1.0F;
		@Pc(365) float local365 = local212[2] - local56[2];
		@Pc(375) double local375 = Math.sqrt((double) (local365 * local365 + local347 * local347));
		Static141.anInt3177 = (int) (Math.atan2((double) local357, local375) * 2607.5945876176133D) & 0x3FFF;
		Static430.anInt7326 = (int) (-Math.atan2((double) local347, (double) local365) * 2607.5945876176133D) & 0x3FFF;
		Static285.anInt5234 = Static158.anIntArrayArrayArray10[Static70.anInt1610][local60][3] + ((Static158.anIntArrayArrayArray10[Static70.anInt1610][local60 + 2][3] - Static158.anIntArrayArrayArray10[Static70.anInt1610][local60][3]) * Static61.anInt1445 >> 16);
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIIZIII)V")
	public static void method3734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static293.anInt3446 = arg2;
		Static388.anInt6706 = arg3;
		Static179.anInt3652 = arg0;
		Static298.anInt5449 = arg4;
		Static375.anInt6612 = arg1;
		Static312.anInt5691 = arg5;
	}
}
