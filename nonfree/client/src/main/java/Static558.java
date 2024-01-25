import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static558 {

	@OriginalMember(owner = "client!sr", name = "w", descriptor = "I")
	public static int anInt8602;

	@OriginalMember(owner = "client!sr", name = "z", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray18;

	@OriginalMember(owner = "client!sr", name = "k", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_187 = new Class151(47, 4);

	@OriginalMember(owner = "client!sr", name = "n", descriptor = "[Lclient!eh;")
	public static final Class89_Sub1[] aClass89_Sub1Array2 = new Class89_Sub1[37];

	@OriginalMember(owner = "client!sr", name = "v", descriptor = "Z")
	public static boolean aBoolean669 = true;

	@OriginalMember(owner = "client!sr", name = "x", descriptor = "I")
	public static int anInt8603 = -1;

	@OriginalMember(owner = "client!sr", name = "y", descriptor = "Z")
	public static boolean aBoolean670 = false;

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IFBFIIIF)[F")
	public static float[] method7415(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
		local6[0] = local17;
		local6[5] = 0.0F;
		local6[6] = -local25;
		local6[8] = local17;
		local6[3] = 0.0F;
		local6[1] = 0.0F;
		local6[4] = 1.0F;
		local6[2] = local25;
		local6[7] = 0.0F;
		@Pc(70) float[] local70 = new float[9];
		@Pc(72) float local72 = 1.0F;
		@Pc(77) float local77 = (float) arg0 / 32767.0F;
		@Pc(79) float local79 = 0.0F;
		@Pc(89) float local89 = -((float) Math.sqrt((double) (1.0F - local77 * local77)));
		@Pc(94) float local94 = 1.0F - local77;
		@Pc(105) float local105 = (float) Math.sqrt((double) (arg5 * arg5 + arg4 * arg4));
		if (local105 == 0.0F && local77 == 0.0F) {
			local9 = local6;
		} else {
			if (local105 != 0.0F) {
				local72 = (float) -arg5 / local105;
				local79 = (float) arg4 / local105;
			}
			local70[7] = -local72 * local89;
			local70[2] = local94 * local79 * local72;
			local70[4] = local77;
			local70[6] = local94 * local79 * local72;
			local70[0] = local77 + local94 * local72 * local72;
			local70[8] = local79 * local79 * local94 + local77;
			local70[5] = local72 * local89;
			local70[3] = local89 * -local79;
			local70[1] = local89 * local79;
			local9[0] = local6[2] * local70[6] + local70[0] * local6[0] + local70[3] * local6[1];
			local9[1] = local6[2] * local70[7] + local70[1] * local6[0] + local6[1] * local70[4];
			local9[3] = local6[5] * local70[6] + local6[4] * local70[3] + local6[3] * local70[0];
			local9[2] = local6[2] * local70[8] + local6[1] * local70[5] + local70[2] * local6[0];
			local9[4] = local70[4] * local6[4] + local70[1] * local6[3] + local70[7] * local6[5];
			local9[6] = local70[3] * local6[7] + local6[6] * local70[0] + local6[8] * local70[6];
			local9[5] = local70[8] * local6[5] + local70[2] * local6[3] + local70[5] * local6[4];
			local9[7] = local70[4] * local6[7] + local6[6] * local70[1] + local6[8] * local70[7];
			local9[8] = local6[8] * local70[8] + local6[6] * local70[2] + local70[5] * local6[7];
		}
		local9[7] *= arg2;
		local9[8] *= arg2;
		local9[4] *= arg1;
		local9[5] *= arg1;
		local9[0] *= arg6;
		local9[3] *= arg1;
		local9[1] *= arg6;
		local9[6] *= arg2;
		local9[2] *= arg6;
		return local9;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(III)Lclient!dq;")
	public static Class73 method7416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static267.aClass73ArrayArrayArray2[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static267.aClass73ArrayArrayArray2[0][arg1][arg2] != null && Static267.aClass73ArrayArrayArray2[0][arg1][arg2].aClass73_1 != null;
			if (local28 && arg0 >= Static539.anInt8345 - 1) {
				return null;
			}
			Static450.method6185(arg0, arg1, arg2);
		}
		return Static267.aClass73ArrayArrayArray2[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "(II)V")
	public static void method7417(@OriginalArg(0) int arg0) {
		if (Static91.anInt1809 == 0) {
			Static570.aClass4_Sub3_Sub4_6.method6787(arg0);
		} else {
			Static414.anInt5938 = arg0;
		}
	}

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "(B)V")
	public static void method7418() {
		if (!Static677.aBoolean804) {
			Static110.aFloat39 += (24.0F - Static110.aFloat39) / 2.0F;
			Static123.aBoolean157 = true;
			Static677.aBoolean804 = true;
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(ZI)I")
	public static int method7419(@OriginalArg(0) boolean arg0) {
		@Pc(10) int local10 = Static106.anInt2134;
		if (local10 == 0) {
			return arg0 ? 0 : Static658.anInt10391;
		} else if (local10 == 1) {
			return Static658.anInt10391;
		} else if (local10 == 2) {
			return 0;
		} else {
			return 0;
		}
	}
}
