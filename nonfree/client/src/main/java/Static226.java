import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
	public static int anInt4368;

	@OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
	public static int anInt4372;

	@OriginalMember(owner = "client!qh", name = "j", descriptor = "F")
	private static float aFloat59;

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "[F")
	public static float[] aFloatArray16 = new float[4];

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "F")
	private static float aFloat57 = -1.0F;

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
	private static int anInt4369 = -1;

	@OriginalMember(owner = "client!qh", name = "e", descriptor = "F")
	private static float aFloat58 = -1.0F;

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
	private static int anInt4370 = -1;

	@OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
	public static int anInt4371 = 13156520;

	@OriginalMember(owner = "client!qh", name = "i", descriptor = "[F")
	private static float[] aFloatArray17 = new float[4];

	@OriginalMember(owner = "client!qh", name = "k", descriptor = "[F")
	public static float[] aFloatArray18 = new float[4];

	@OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
	private static int anInt4373 = -1;

	@OriginalMember(owner = "client!qh", name = "m", descriptor = "I")
	public static int anInt4374 = 16777215;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "()V")
	public static void method3650() {
		@Pc(1) GL local1 = Static283.aGL1;
		local1.glColorMaterial(1028, 5634);
		local1.glEnable(2903);
		@Pc(27) float[] local27 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		local1.glLightfv(16384, 4608, local27, 0);
		local1.glEnable(16384);
		@Pc(55) float[] local55 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		local1.glLightfv(16385, 4608, local55, 0);
		local1.glEnable(16385);
		anInt4373 = -1;
		anInt4369 = -1;
		method3656();
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "()F")
	public static float method3651() {
		return aFloat58;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "([F)V")
	public static void method3653(@OriginalArg(0) float[] arg0) {
		if (arg0 == null) {
			arg0 = aFloatArray16;
		}
		@Pc(5) GL local5 = Static283.aGL1;
		local5.glFogfv(2918, arg0, 0);
	}

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "()V")
	public static void method3654() {
		@Pc(1) GL local1 = Static283.aGL1;
		local1.glLightfv(16384, 4611, aFloatArray18, 0);
		local1.glLightfv(16385, 4611, aFloatArray17, 0);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(FFF)V")
	public static void method3655(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		if (aFloatArray18[0] == arg0 && aFloatArray18[1] == arg1 && aFloatArray18[2] == arg2) {
			return;
		}
		aFloatArray18[0] = arg0;
		aFloatArray18[1] = arg1;
		aFloatArray18[2] = arg2;
		aFloatArray17[0] = -arg0;
		aFloatArray17[1] = -arg1;
		aFloatArray17[2] = -arg2;
		anInt4368 = (int) (arg0 * 256.0F / arg1);
		anInt4372 = (int) (arg2 * 256.0F / arg1);
	}

	@OriginalMember(owner = "client!qh", name = "e", descriptor = "()V")
	private static void method3656() {
		method3660(anInt4374, 1.1523438F, 0.69921875F, 1.2F);
		method3655(-50.0F, -60.0F, -50.0F);
		method3658(anInt4371, 0, false);
	}

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "()I")
	public static int method3657() {
		return anInt4373;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIZ)V")
	public static void method3658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (!arg2 && anInt4369 == arg0 && anInt4370 == arg1) {
			return;
		}
		anInt4369 = arg0;
		anInt4370 = arg1;
		@Pc(14) GL local14 = Static283.aGL1;
		aFloatArray16[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
		aFloatArray16[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
		aFloatArray16[2] = (float) (arg0 & 0xFF) / 255.0F;
		local14.glFogi(2917, 9729);
		local14.glFogf(2914, 0.95F);
		local14.glHint(3156, 4353);
		@Pc(67) int local67 = 3072 - arg1;
		if (local67 < 50) {
			local67 = 50;
		}
		local14.glFogf(2915, (float) local67);
		local14.glFogf(2916, (float) 3328);
		local14.glFogfv(2918, aFloatArray16, 0);
	}

	@OriginalMember(owner = "client!qh", name = "g", descriptor = "()F")
	public static float method3659() {
		return aFloat59;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IFFF)V")
	public static void method3660(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		if (anInt4373 == arg0 && aFloat59 == arg1 && aFloat58 == arg2 && aFloat57 == arg3) {
			return;
		}
		anInt4373 = arg0;
		aFloat59 = arg1;
		aFloat58 = arg2;
		aFloat57 = arg3;
		@Pc(25) GL local25 = Static283.aGL1;
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
}
