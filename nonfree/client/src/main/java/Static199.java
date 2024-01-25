import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "Z")
	public static boolean aBoolean250;

	@OriginalMember(owner = "client!jq", name = "l", descriptor = "I")
	public static int anInt4097;

	@OriginalMember(owner = "client!jq", name = "i", descriptor = "Lclient!jc;")
	public static final Class126 aClass126_7 = new Class126(1, -1);

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IFFIFIBI)[F")
	public static float[] method3189(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg5 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg5 * 0.024543693F));
		local6[2] = local25;
		local6[4] = 1.0F;
		local6[6] = -local25;
		local6[3] = 0.0F;
		local6[7] = 0.0F;
		local6[1] = 0.0F;
		local6[5] = 0.0F;
		local6[0] = local17;
		local6[8] = local17;
		@Pc(74) float[] local74 = new float[9];
		@Pc(76) float local76 = 1.0F;
		@Pc(81) float local81 = (float) arg0 / 32767.0F;
		@Pc(83) float local83 = 0.0F;
		@Pc(94) float local94 = -((float) Math.sqrt((double) (1.0F - local81 * local81)));
		@Pc(98) float local98 = 1.0F - local81;
		@Pc(109) float local109 = (float) Math.sqrt((double) (arg3 * arg3 + arg6 * arg6));
		if (local109 == 0.0F && local81 == 0.0F) {
			local9 = local6;
		} else {
			if (local109 != 0.0F) {
				local76 = (float) -arg6 / local109;
				local83 = (float) arg3 / local109;
			}
			local74[6] = local98 * local76 * local83;
			local74[2] = local83 * local76 * local98;
			local74[3] = local94 * -local83;
			local74[0] = local98 * local76 * local76 + local81;
			local74[5] = local76 * local94;
			local74[8] = local83 * local83 * local98 + local81;
			local74[4] = local81;
			local74[1] = local94 * local83;
			local74[7] = local94 * -local76;
			local9[0] = local6[1] * local74[3] + local74[0] * local6[0] + local74[6] * local6[2];
			local9[1] = local6[0] * local74[1] + local6[1] * local74[4] + local74[7] * local6[2];
			local9[2] = local6[0] * local74[2] + local74[5] * local6[1] + local6[2] * local74[8];
			local9[3] = local6[5] * local74[6] + local74[3] * local6[4] + local6[3] * local74[0];
			local9[4] = local74[1] * local6[3] + local6[4] * local74[4] + local74[7] * local6[5];
			local9[5] = local6[5] * local74[8] + local74[2] * local6[3] + local6[4] * local74[5];
			local9[6] = local6[6] * local74[0] + local6[7] * local74[3] + local6[8] * local74[6];
			local9[7] = local6[8] * local74[7] + local74[4] * local6[7] + local6[6] * local74[1];
			local9[8] = local6[7] * local74[5] + local74[2] * local6[6] + local6[8] * local74[8];
		}
		local9[2] *= arg1;
		local9[4] *= arg2;
		local9[7] *= arg4;
		local9[0] *= arg1;
		local9[8] *= arg4;
		local9[5] *= arg2;
		local9[1] *= arg1;
		local9[3] *= arg2;
		local9[6] *= arg4;
		return local9;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILclient!ec;)Z")
	public static boolean method3191(@OriginalArg(1) Class68 arg0) {
		if (Static28.anInt664 == arg0.anInt2169) {
			Static32.anInt907 = 250;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ZIIZ)I")
	public static int method3192(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) Class1_Sub46 local8 = Static114.method1848(arg2, arg0);
		if (local8 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local8.anIntArray751.length) {
			return local8.anIntArray751[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lclient!ec;ZII)V")
	public static void method3193(@OriginalArg(0) Class68 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static404.aClass68_11 != null || Static96.aBoolean151 || (arg0 == null || Static50.method926(arg0) == null)) {
			return;
		}
		Static404.aClass68_11 = arg0;
		Static326.aClass68_14 = Static50.method926(arg0);
		Static275.anInt5313 = 0;
		Static256.aBoolean148 = false;
		Static238.anInt4690 = arg1;
		Static200.anInt4108 = arg2;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILclient!qs;ZIII)V")
	public static void method3194(@OriginalArg(1) Class211 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		Static269.anInt5203 = arg1;
		Static385.anInt7047 = 10000;
		anInt4097 = arg2;
		Static133.anInt2954 = 1;
		Static249.anInt4852 = 0;
		Static353.aBoolean476 = false;
		Static225.aClass211_57 = arg0;
	}
}
