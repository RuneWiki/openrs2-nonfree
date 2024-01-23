import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
	public static int anInt4494;

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "F")
	private static float aFloat146;

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
	public static int anInt4496;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
	public static int anInt4492 = 13156520;

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
	private static int anInt4493 = -1;

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
	public static int anInt4495 = 16777215;

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
	private static int anInt4497 = -1;

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "F")
	private static float aFloat147 = -1.0F;

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "[F")
	private static float[] aFloatArray26 = new float[4];

	@OriginalMember(owner = "client!pe", name = "j", descriptor = "[F")
	public static float[] aFloatArray27 = new float[4];

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
	private static int anInt4498 = -1;

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "F")
	private static float aFloat148 = -1.0F;

	@OriginalMember(owner = "client!pe", name = "m", descriptor = "[F")
	public static float[] aFloatArray28 = new float[4];

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "()F")
	public static float method3575() {
		return aFloat146;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(FFF)V")
	public static void method3576(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		if (aFloatArray27[0] == arg0 && aFloatArray27[1] == arg1 && aFloatArray27[2] == arg2) {
			return;
		}
		aFloatArray27[0] = arg0;
		aFloatArray27[1] = arg1;
		aFloatArray27[2] = arg2;
		aFloatArray26[0] = -arg0;
		aFloatArray26[1] = -arg1;
		aFloatArray26[2] = -arg2;
		anInt4494 = (int) (arg0 * 256.0F / arg1);
		anInt4496 = (int) (arg2 * 256.0F / arg1);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "([F)V")
	public static void method3577(@OriginalArg(0) float[] arg0) {
		if (arg0 == null) {
			arg0 = aFloatArray28;
		}
		@Pc(5) GL local5 = Static296.aGL1;
		local5.glFogfv(2918, arg0, 0);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIZ)V")
	public static void method3579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (!arg2 && anInt4497 == arg0 && anInt4493 == arg1) {
			return;
		}
		anInt4497 = arg0;
		anInt4493 = arg1;
		@Pc(14) GL local14 = Static296.aGL1;
		aFloatArray28[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
		aFloatArray28[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
		aFloatArray28[2] = (float) (arg0 & 0xFF) / 255.0F;
		local14.glFogi(2917, 9729);
		local14.glFogf(2914, 0.95F);
		local14.glHint(3156, 4353);
		@Pc(67) int local67 = 3072 - arg1;
		if (local67 < 50) {
			local67 = 50;
		}
		local14.glFogf(2915, (float) local67);
		local14.glFogf(2916, (float) 3328);
		local14.glFogfv(2918, aFloatArray28, 0);
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "()V")
	public static void method3580() {
		@Pc(1) GL local1 = Static296.aGL1;
		local1.glColorMaterial(1028, 5634);
		local1.glEnable(2903);
		@Pc(27) float[] local27 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		local1.glLightfv(16384, 4608, local27, 0);
		local1.glEnable(16384);
		@Pc(55) float[] local55 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		local1.glLightfv(16385, 4608, local55, 0);
		local1.glEnable(16385);
		anInt4498 = -1;
		anInt4497 = -1;
		method3582();
	}

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "()V")
	public static void method3581() {
		@Pc(1) GL local1 = Static296.aGL1;
		local1.glLightfv(16384, 4611, aFloatArray27, 0);
		local1.glLightfv(16385, 4611, aFloatArray26, 0);
	}

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "()V")
	private static void method3582() {
		method3583(anInt4495, 1.1523438F, 0.69921875F, 1.2F);
		method3576(-50.0F, -60.0F, -50.0F);
		method3579(anInt4492, 0, false);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IFFF)V")
	public static void method3583(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		if (anInt4498 == arg0 && aFloat146 == arg1 && aFloat148 == arg2 && aFloat147 == arg3) {
			return;
		}
		anInt4498 = arg0;
		aFloat146 = arg1;
		aFloat148 = arg2;
		aFloat147 = arg3;
		@Pc(25) GL local25 = Static296.aGL1;
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

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "()I")
	public static int method3584() {
		return anInt4498;
	}

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "()F")
	public static float method3585() {
		return aFloat148;
	}
}
