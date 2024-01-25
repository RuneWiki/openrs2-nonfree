import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static426 {

	@OriginalMember(owner = "client!rh", name = "o", descriptor = "I")
	public static int anInt6103;

	@OriginalMember(owner = "client!rh", name = "q", descriptor = "I")
	public static int anInt6105 = -1;

	@OriginalMember(owner = "client!rh", name = "w", descriptor = "[Lclient!iw;")
	public static final Class117_Sub1[] aClass117_Sub1Array4 = new Class117_Sub1[32];

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(III)V")
	public static void method5113(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class12_Sub4_Sub1 local12 = Static389.method6156(13, arg1);
		local12.method820();
		local12.anInt806 = arg0;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)I")
	public static int method5115(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IFFIIIIF)[F")
	public static float[] method5116(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) float arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg0 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg0 * 0.024543693F));
		local6[0] = local17;
		local6[1] = 0.0F;
		local6[2] = local25;
		local6[3] = 0.0F;
		local6[6] = -local25;
		local6[4] = 1.0F;
		local6[7] = 0.0F;
		local6[8] = local17;
		local6[5] = 0.0F;
		@Pc(70) float[] local70 = new float[9];
		@Pc(72) float local72 = 1.0F;
		@Pc(74) float local74 = 0.0F;
		@Pc(79) float local79 = (float) arg5 / 32767.0F;
		@Pc(90) float local90 = -((float) Math.sqrt((double) (1.0F - local79 * local79)));
		@Pc(95) float local95 = 1.0F - local79;
		@Pc(106) float local106 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4));
		if (local106 == 0.0F && local79 == 0.0F) {
			local9 = local6;
		} else {
			if (local106 != 0.0F) {
				local72 = (float) -arg3 / local106;
				local74 = (float) arg4 / local106;
			}
			local70[5] = local90 * local72;
			local70[4] = local79;
			local70[3] = local90 * -local74;
			local70[2] = local72 * local74 * local95;
			local70[7] = local90 * -local72;
			local70[0] = local79 + local95 * local72 * local72;
			local70[8] = local74 * local74 * local95 + local79;
			local70[1] = local90 * local74;
			local70[6] = local95 * local72 * local74;
			local9[0] = local6[2] * local70[6] + local70[0] * local6[0] + local6[1] * local70[3];
			local9[1] = local6[2] * local70[7] + local6[1] * local70[4] + local6[0] * local70[1];
			local9[2] = local6[1] * local70[5] + local70[2] * local6[0] + local70[8] * local6[2];
			local9[3] = local70[6] * local6[5] + local70[0] * local6[3] + local6[4] * local70[3];
			local9[4] = local6[4] * local70[4] + local6[3] * local70[1] + local70[7] * local6[5];
			local9[5] = local6[4] * local70[5] + local70[2] * local6[3] + local6[5] * local70[8];
			local9[6] = local6[6] * local70[0] + local6[7] * local70[3] + local70[6] * local6[8];
			local9[7] = local6[8] * local70[7] + local70[1] * local6[6] + local6[7] * local70[4];
			local9[8] = local6[6] * local70[2] + local70[5] * local6[7] + local70[8] * local6[8];
		}
		local9[1] *= arg2;
		local9[5] *= arg6;
		local9[6] *= arg1;
		local9[3] *= arg6;
		local9[4] *= arg6;
		local9[8] *= arg1;
		local9[0] *= arg2;
		local9[7] *= arg1;
		local9[2] *= arg2;
		return local9;
	}

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "(I)V")
	public static void method5122() {
		if (Static243.aClass42_4 == null) {
			return;
		}
		Static246.aClass149_3.method3983();
		Static500.method7435();
		Static38.method804();
		Static502.method7463();
		Static113.method2344();
		Static527.method7831();
		if (Static476.aClass186_2 != null) {
			Static476.aClass186_2.method4605();
		}
		Static371.method5749();
		Static514.method1479();
		Static185.method3621();
		Static490.method7294(false);
		Static218.method4016();
		for (@Pc(52) int local52 = 0; local52 < 2048; local52++) {
			@Pc(58) Class30_Sub1_Sub1_Sub1 local58 = Static90.aClass30_Sub1_Sub1_Sub1Array1[local52];
			if (local58 != null) {
				local58.aClass12_Sub26_3 = null;
				for (@Pc(65) int local65 = 0; local65 < local58.aClass26Array3.length; local65++) {
					local58.aClass26Array3[local65] = null;
				}
			}
		}
		for (@Pc(86) int local86 = 0; local86 < Static328.anInt6238; local86++) {
			@Pc(93) Class30_Sub1_Sub1_Sub2 local93 = Static352.aClass12_Sub41Array1[local86].aClass30_Sub1_Sub1_Sub2_2;
			if (local93 != null) {
				for (@Pc(97) int local97 = 0; local97 < local93.aClass26Array3.length; local97++) {
					local93.aClass26Array3[local97] = null;
				}
			}
		}
		Static180.aClass91_5 = null;
		Static110.aClass91_4 = null;
		Static243.aClass42_4.method5807();
		Static243.aClass42_4 = null;
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(Z)V")
	public static void method5126() {
		if (Static96.anInt2243 == 8) {
			Static9.method278(4);
		} else if (Static96.anInt2243 == 4 || Static96.anInt2243 == 5) {
			Static9.method278(2);
		} else if (Static96.anInt2243 == 11) {
			Static9.method278(2);
		}
	}
}
