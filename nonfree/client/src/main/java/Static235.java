import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!qm", name = "e", descriptor = "F")
	private static float aFloat48;

	@OriginalMember(owner = "client!qm", name = "f", descriptor = "I")
	public static int anInt4712;

	@OriginalMember(owner = "client!qm", name = "k", descriptor = "I")
	public static int anInt4716;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "F")
	private static float aFloat47 = -1.0F;

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
	private static int anInt4711 = -1;

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "[F")
	public static float[] aFloatArray15 = new float[4];

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "[F")
	private static float[] aFloatArray16 = new float[4];

	@OriginalMember(owner = "client!qm", name = "g", descriptor = "F")
	private static float aFloat49 = -1.0F;

	@OriginalMember(owner = "client!qm", name = "h", descriptor = "I")
	private static int anInt4713 = -1;

	@OriginalMember(owner = "client!qm", name = "i", descriptor = "I")
	public static int anInt4714 = 16777215;

	@OriginalMember(owner = "client!qm", name = "j", descriptor = "I")
	private static int anInt4715 = -1;

	@OriginalMember(owner = "client!qm", name = "l", descriptor = "[F")
	public static float[] aFloatArray17 = new float[4];

	@OriginalMember(owner = "client!qm", name = "m", descriptor = "I")
	public static int anInt4717 = 13156520;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "()V")
	public static void method3801() {
		@Pc(1) GL local1 = Static116.aGL1;
		local1.glColorMaterial(1028, 5634);
		local1.glEnable(2903);
		@Pc(27) float[] local27 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		local1.glLightfv(16384, 4608, local27, 0);
		local1.glEnable(16384);
		@Pc(55) float[] local55 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		local1.glLightfv(16385, 4608, local55, 0);
		local1.glEnable(16385);
		anInt4715 = -1;
		anInt4711 = -1;
		method3811();
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(FFF)V")
	public static void method3802(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		if (aFloatArray15[0] == arg0 && aFloatArray15[1] == arg1 && aFloatArray15[2] == arg2) {
			return;
		}
		aFloatArray15[0] = arg0;
		aFloatArray15[1] = arg1;
		aFloatArray15[2] = arg2;
		aFloatArray16[0] = -arg0;
		aFloatArray16[1] = -arg1;
		aFloatArray16[2] = -arg2;
		anInt4712 = (int) (arg0 * 256.0F / arg1);
		anInt4716 = (int) (arg2 * 256.0F / arg1);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIZ)V")
	public static void method3803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (!arg2 && anInt4711 == arg0 && anInt4713 == arg1) {
			return;
		}
		anInt4711 = arg0;
		anInt4713 = arg1;
		@Pc(14) GL local14 = Static116.aGL1;
		aFloatArray17[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
		aFloatArray17[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
		aFloatArray17[2] = (float) (arg0 & 0xFF) / 255.0F;
		local14.glFogi(2917, 9729);
		local14.glFogf(2914, 0.95F);
		local14.glHint(3156, 4353);
		@Pc(67) int local67 = 3072 - arg1;
		if (local67 < 50) {
			local67 = 50;
		}
		local14.glFogf(2915, (float) local67);
		local14.glFogf(2916, (float) 3328);
		local14.glFogfv(2918, aFloatArray17, 0);
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "()F")
	public static float method3804() {
		return aFloat48;
	}

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "()I")
	public static int method3805() {
		return anInt4715;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "([F)V")
	public static void method3806(@OriginalArg(0) float[] arg0) {
		if (arg0 == null) {
			arg0 = aFloatArray17;
		}
		@Pc(5) GL local5 = Static116.aGL1;
		local5.glFogfv(2918, arg0, 0);
	}

	@OriginalMember(owner = "client!qm", name = "e", descriptor = "()F")
	public static float method3808() {
		return aFloat49;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IFFF)V")
	public static void method3809(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		if (anInt4715 == arg0 && aFloat48 == arg1 && aFloat49 == arg2 && aFloat47 == arg3) {
			return;
		}
		anInt4715 = arg0;
		aFloat48 = arg1;
		aFloat49 = arg2;
		aFloat47 = arg3;
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

	@OriginalMember(owner = "client!qm", name = "f", descriptor = "()V")
	public static void method3810() {
		@Pc(1) GL local1 = Static116.aGL1;
		local1.glLightfv(16384, 4611, aFloatArray15, 0);
		local1.glLightfv(16385, 4611, aFloatArray16, 0);
	}

	@OriginalMember(owner = "client!qm", name = "g", descriptor = "()V")
	private static void method3811() {
		method3809(anInt4714, 1.1523438F, 0.69921875F, 1.2F);
		method3802(-50.0F, -60.0F, -50.0F);
		method3803(anInt4717, 0, false);
	}
}
