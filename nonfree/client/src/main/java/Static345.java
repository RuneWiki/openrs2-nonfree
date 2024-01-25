import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
	public static void method5703() {
		if (Static627.anInt10536 == -1 || Static268.anInt5777 == -1) {
			return;
		}
		@Pc(24) int local24 = Static434.anInt10354 + (Static107.anInt2892 * (Static516.anInt9011 - Static434.anInt10354) >> 16);
		Static107.anInt2892 += local24;
		if (Static107.anInt2892 >= 65535) {
			if (Static551.aBoolean746) {
				Static350.aBoolean546 = false;
			} else {
				Static350.aBoolean546 = true;
			}
			Static107.anInt2892 = 65535;
			Static551.aBoolean746 = true;
		} else {
			Static350.aBoolean546 = false;
			Static551.aBoolean746 = false;
		}
		@Pc(56) float local56 = (float) Static107.anInt2892 / 65535.0F;
		@Pc(59) float[] local59 = new float[3];
		@Pc(63) int local63 = Static103.anInt2861 * 2;
		@Pc(89) int local89;
		@Pc(122) int local122;
		@Pc(130) int local130;
		@Pc(135) int local135;
		@Pc(143) int local143;
		@Pc(160) int local160;
		for (@Pc(65) int local65 = 0; local65 < 3; local65++) {
			@Pc(77) int local77 = Static28.anIntArrayArrayArray1[Static627.anInt10536][local63][local65] * 3;
			local89 = Static28.anIntArrayArrayArray1[Static627.anInt10536][local63 + 1][local65] * 3;
			local122 = (Static28.anIntArrayArrayArray1[Static627.anInt10536][local63 + 2][local65] + Static28.anIntArrayArrayArray1[Static627.anInt10536][local63 + 2][local65] - Static28.anIntArrayArrayArray1[Static627.anInt10536][local63 + 3][local65]) * 3;
			local130 = Static28.anIntArrayArrayArray1[Static627.anInt10536][local63][local65];
			local135 = local89 - local77;
			local143 = local122 + local77 - local89 * 2;
			local160 = local89 + Static28.anIntArrayArrayArray1[Static627.anInt10536][local63 + 2][local65] - local130 - local122;
			local59[local65] = ((float) local135 + local56 * ((float) local143 + local56 * (float) local160)) * local56 + (float) local130;
		}
		Static149.anInt3489 = (int) local59[1] * -1;
		Static259.anInt6990 = (int) local59[2] - Static227.anInt5049 * 512;
		Static184.anInt4048 = (int) local59[0] - Static477.anInt8412 * 512;
		@Pc(213) float[] local213 = new float[3];
		local89 = Static201.anInt7318 * 2;
		for (local122 = 0; local122 < 3; local122++) {
			local130 = Static28.anIntArrayArrayArray1[Static268.anInt5777][local89][local122] * 3;
			local135 = Static28.anIntArrayArrayArray1[Static268.anInt5777][local89 + 1][local122] * 3;
			local143 = (Static28.anIntArrayArrayArray1[Static268.anInt5777][local89 + 2][local122] + Static28.anIntArrayArrayArray1[Static268.anInt5777][local89 + 2][local122] - Static28.anIntArrayArrayArray1[Static268.anInt5777][local89 + 3][local122]) * 3;
			local160 = Static28.anIntArrayArrayArray1[Static268.anInt5777][local89][local122];
			@Pc(288) int local288 = local135 - local130;
			@Pc(297) int local297 = local143 + local130 - local135 * 2;
			@Pc(315) int local315 = local135 + Static28.anIntArrayArrayArray1[Static268.anInt5777][local89 + 2][local122] - local143 - local160;
			local213[local122] = (float) local160 + ((float) local288 + (local56 * (float) local315 + (float) local297) * local56) * local56;
		}
		@Pc(347) float local347 = local213[0] - local59[0];
		@Pc(358) float local358 = (local213[1] - local59[1]) * -1.0F;
		@Pc(366) float local366 = local213[2] - local59[2];
		@Pc(376) double local376 = Math.sqrt((double) (local366 * local366 + local347 * local347));
		Static404.anInt4286 = (int) (Math.atan2((double) local358, local376) * 2607.5945876176133D) & 0x3FFF;
		Static349.anInt6848 = (int) (-Math.atan2((double) local347, (double) local366) * 2607.5945876176133D) & 0x3FFF;
		Static535.anInt9282 = Static28.anIntArrayArrayArray1[Static627.anInt10536][local63][3] + ((Static28.anIntArrayArrayArray1[Static627.anInt10536][local63 + 2][3] - Static28.anIntArrayArrayArray1[Static627.anInt10536][local63][3]) * Static107.anInt2892 >> 16);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "([BBI)[B")
	public static byte[] method5705(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) byte[] local6 = new byte[arg1];
		Static653.method6537(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ZI)V")
	public static void method5708(@OriginalArg(1) int arg0) {
		@Pc(13) Class6_Sub5_Sub19 local13 = Static348.method5721(arg0, 4);
		local13.method5174();
	}
}
