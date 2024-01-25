import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static391 {

	@OriginalMember(owner = "client!to", name = "t", descriptor = "[I")
	public static final int[] anIntArray548 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!to", name = "z", descriptor = "I")
	public static int anInt6436 = -1;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IFIIIFIF)[F")
	public static float[] method5005(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg5 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg5 * 0.024543693F));
		local6[2] = local25;
		local6[3] = 0.0F;
		local6[5] = 0.0F;
		local6[0] = local17;
		local6[6] = -local25;
		local6[8] = local17;
		local6[7] = 0.0F;
		local6[4] = 1.0F;
		local6[1] = 0.0F;
		@Pc(69) float[] local69 = new float[9];
		@Pc(71) float local71 = 1.0F;
		@Pc(76) float local76 = (float) arg2 / 32767.0F;
		@Pc(78) float local78 = 0.0F;
		@Pc(83) float local83 = 1.0F - local76;
		@Pc(94) float local94 = -((float) Math.sqrt((double) (1.0F - local76 * local76)));
		@Pc(105) float local105 = (float) Math.sqrt((double) (arg3 * arg3 + arg0 * arg0));
		if (local105 == 0.0F && local76 == 0.0F) {
			local9 = local6;
		} else {
			if (local105 != 0.0F) {
				local71 = (float) -arg3 / local105;
				local78 = (float) arg0 / local105;
			}
			local69[5] = local94 * local71;
			local69[8] = local78 * local78 * local83 + local76;
			local69[6] = local71 * local78 * local83;
			local69[7] = -local71 * local94;
			local69[1] = local78 * local94;
			local69[0] = local71 * local71 * local83 + local76;
			local69[3] = local94 * -local78;
			local69[4] = local76;
			local69[2] = local71 * local78 * local83;
			local9[0] = local6[1] * local69[3] + local69[0] * local6[0] + local6[2] * local69[6];
			local9[1] = local6[1] * local69[4] + local69[1] * local6[0] + local6[2] * local69[7];
			local9[2] = local69[2] * local6[0] + local69[5] * local6[1] + local69[8] * local6[2];
			local9[3] = local6[3] * local69[0] + local69[3] * local6[4] + local6[5] * local69[6];
			local9[4] = local69[4] * local6[4] + local6[3] * local69[1] + local69[7] * local6[5];
			local9[6] = local69[6] * local6[8] + local6[7] * local69[3] + local69[0] * local6[6];
			local9[5] = local69[8] * local6[5] + local6[3] * local69[2] + local6[4] * local69[5];
			local9[7] = local69[7] * local6[8] + local69[1] * local6[6] + local6[7] * local69[4];
			local9[8] = local6[6] * local69[2] + local6[7] * local69[5] + local69[8] * local6[8];
		}
		local9[4] *= arg1;
		local9[7] *= arg4;
		local9[8] *= arg4;
		local9[5] *= arg1;
		local9[3] *= arg1;
		local9[6] *= arg4;
		local9[0] *= arg6;
		local9[1] *= arg6;
		local9[2] *= arg6;
		return local9;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Ljava/lang/String;BZ)V")
	public static void method5006(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg1 ? 32768 : 0;
		@Pc(29) int local29 = (arg1 ? Static216.aClass219_1.anInt6056 : Static216.aClass219_1.anInt6058) + local19;
		for (@Pc(36) int local36 = local19; local36 < local29; local36++) {
			@Pc(43) Class2_Sub5_Sub17 local43 = Static216.aClass219_1.method4730(local36);
			if (local43.aBoolean488 && local43.method5267().toLowerCase().indexOf(local8) != -1) {
				if (local13 >= 50) {
					Static321.aShortArray59 = null;
					Static167.anInt2873 = -1;
					return;
				}
				if (local13 >= local11.length) {
					@Pc(72) short[] local72 = new short[local11.length * 2];
					for (@Pc(74) int local74 = 0; local74 < local13; local74++) {
						local72[local74] = local11[local74];
					}
					local11 = local72;
				}
				local11[local13++] = (short) local36;
			}
		}
		Static385.anInt6343 = 0;
		Static167.anInt2873 = local13;
		Static321.aShortArray59 = local11;
		@Pc(107) String[] local107 = new String[Static167.anInt2873];
		for (@Pc(109) int local109 = 0; local109 < Static167.anInt2873; local109++) {
			local107[local109] = Static216.aClass219_1.method4730(local11[local109]).method5267();
		}
		Static367.method4817(local107, Static321.aShortArray59);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg1 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(31) int local31 = Static331.aShort63 + local7 * (Static86.aShort94 - Static331.aShort63) / 100;
		@Pc(37) int local37 = arg4 * local31 >> 8;
		@Pc(44) int local44 = 16384 - arg6 & 0x3FFF;
		@Pc(51) int local51 = 16384 - arg2 & 0x3FFF;
		@Pc(53) int local53 = 0;
		@Pc(55) int local55 = 0;
		@Pc(57) int local57 = local37;
		if (local44 != 0) {
			local55 = Class155.anIntArray342[local44] * -local37 >> 15;
			local57 = Class155.anIntArray341[local44] * local37 >> 15;
		}
		if (local51 != 0) {
			local53 = Class155.anIntArray342[local51] * local57 >> 15;
			local57 = Class155.anIntArray341[local51] * local57 >> 15;
		}
		Static174.anInt3028 = arg3 - local53;
		Static310.anInt5375 = arg2;
		Static235.anInt3805 = arg6;
		Static40.anInt771 = arg5 - local55;
		Static381.anInt6280 = 0;
		Static143.anInt2544 = arg0 - local57;
	}
}
