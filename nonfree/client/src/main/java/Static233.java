import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "F")
	private static float aFloat52;

	@OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
	public static int anInt4706;

	@OriginalMember(owner = "client!rm", name = "g", descriptor = "I")
	public static int anInt4707;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "[F")
	public static float[] aFloatArray20 = new float[4];

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
	private static int anInt4704 = -1;

	@OriginalMember(owner = "client!rm", name = "d", descriptor = "I")
	private static int anInt4705 = -1;

	@OriginalMember(owner = "client!rm", name = "e", descriptor = "[F")
	private static float[] aFloatArray21 = new float[4];

	@OriginalMember(owner = "client!rm", name = "h", descriptor = "I")
	private static int anInt4708 = -1;

	@OriginalMember(owner = "client!rm", name = "i", descriptor = "F")
	private static float aFloat53 = -1.0F;

	@OriginalMember(owner = "client!rm", name = "j", descriptor = "[F")
	public static float[] aFloatArray22 = new float[4];

	@OriginalMember(owner = "client!rm", name = "k", descriptor = "I")
	public static int anInt4709 = 13156520;

	@OriginalMember(owner = "client!rm", name = "l", descriptor = "I")
	public static int anInt4710 = 16777215;

	@OriginalMember(owner = "client!rm", name = "m", descriptor = "F")
	private static float aFloat54 = -1.0F;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIZ)V")
	public static void method3546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (!arg2 && anInt4704 == arg0 && anInt4708 == arg1) {
			return;
		}
		anInt4704 = arg0;
		anInt4708 = arg1;
		@Pc(14) GL local14 = Static116.aGL1;
		aFloatArray22[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
		aFloatArray22[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
		aFloatArray22[2] = (float) (arg0 & 0xFF) / 255.0F;
		local14.glFogi(2917, 9729);
		local14.glFogf(2914, 0.95F);
		local14.glHint(3156, 4353);
		@Pc(67) int local67 = 3072 - arg1;
		if (local67 < 50) {
			local67 = 50;
		}
		local14.glFogf(2915, (float) local67);
		local14.glFogf(2916, (float) 3328);
		local14.glFogfv(2918, aFloatArray22, 0);
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "()V")
	public static void method3548() {
		@Pc(1) GL local1 = Static116.aGL1;
		local1.glColorMaterial(1028, 5634);
		local1.glEnable(2903);
		@Pc(27) float[] local27 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		local1.glLightfv(16384, 4608, local27, 0);
		local1.glEnable(16384);
		@Pc(55) float[] local55 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		local1.glLightfv(16385, 4608, local55, 0);
		local1.glEnable(16385);
		anInt4705 = -1;
		anInt4704 = -1;
		method3556();
	}

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "()F")
	public static float method3549() {
		return aFloat52;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(FFF)V")
	public static void method3550(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		if (aFloatArray20[0] == arg0 && aFloatArray20[1] == arg1 && aFloatArray20[2] == arg2) {
			return;
		}
		aFloatArray20[0] = arg0;
		aFloatArray20[1] = arg1;
		aFloatArray20[2] = arg2;
		aFloatArray21[0] = -arg0;
		aFloatArray21[1] = -arg1;
		aFloatArray21[2] = -arg2;
		anInt4706 = (int) (arg0 * 256.0F / arg1);
		anInt4707 = (int) (arg2 * 256.0F / arg1);
	}

	@OriginalMember(owner = "client!rm", name = "d", descriptor = "()V")
	public static void method3551() {
		@Pc(1) GL local1 = Static116.aGL1;
		local1.glLightfv(16384, 4611, aFloatArray20, 0);
		local1.glLightfv(16385, 4611, aFloatArray21, 0);
	}

	@OriginalMember(owner = "client!rm", name = "e", descriptor = "()F")
	public static float method3552() {
		return aFloat53;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IFFF)V")
	public static void method3553(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		if (anInt4705 == arg0 && aFloat52 == arg1 && aFloat53 == arg2 && aFloat54 == arg3) {
			return;
		}
		anInt4705 = arg0;
		aFloat52 = arg1;
		aFloat53 = arg2;
		aFloat54 = arg3;
		@Pc(25) GL local25 = Static116.aGL1;
		@Pc(34) float local34 = (float) (arg0 >> 16 & 0xFF) / 255.0F;
		@Pc(43) float local43 = (float) (arg0 >> 8 & 0xFF) / 255.0F;
		@Pc(50) float local50 = (float) (arg0 & 0xFF) / 255.0F;
		@Pc(75) float[] local75 = new float[] { arg1 * local34, arg1 * local43, arg1 * local50, 1.0F };
		local25.glLightModelfv(2899, local75, 0);
		@Pc(105) float[] local105 = new float[] { arg2 * local34, arg2 * local43, arg2 * local50, 1.0F };
		local25.glLightfv(16384, 4609, local105, 0);
		@Pc(139) float[] local139 = new float[] { -arg3 * local34, -arg3 * local43, -arg3 * local50, 1.0F };
		local25.glLightfv(16385, 4609, local139, 0);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "([F)V")
	public static void method3554(@OriginalArg(0) float[] arg0) {
		if (arg0 == null) {
			arg0 = aFloatArray22;
		}
		@Pc(5) GL local5 = Static116.aGL1;
		local5.glFogfv(2918, arg0, 0);
	}

	@OriginalMember(owner = "client!rm", name = "f", descriptor = "()I")
	public static int method3555() {
		return anInt4705;
	}

	@OriginalMember(owner = "client!rm", name = "g", descriptor = "()V")
	private static void method3556() {
		method3553(anInt4710, 1.1523438F, 0.69921875F, 1.2F);
		method3550(-50.0F, -60.0F, -50.0F);
		method3546(anInt4709, 0, false);
	}
}
