import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!je", name = "d", descriptor = "F")
	private static float aFloat26;

	@OriginalMember(owner = "client!je", name = "h", descriptor = "I")
	public static int anInt2498;

	@OriginalMember(owner = "client!je", name = "l", descriptor = "I")
	public static int anInt2500;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "I")
	public static int anInt2494 = 13156520;

	@OriginalMember(owner = "client!je", name = "b", descriptor = "I")
	public static int anInt2495 = 16777215;

	@OriginalMember(owner = "client!je", name = "c", descriptor = "I")
	private static int anInt2496 = -1;

	@OriginalMember(owner = "client!je", name = "e", descriptor = "F")
	private static float aFloat27 = -1.0F;

	@OriginalMember(owner = "client!je", name = "f", descriptor = "I")
	private static int anInt2497 = -1;

	@OriginalMember(owner = "client!je", name = "g", descriptor = "[F")
	public static float[] aFloatArray14 = new float[4];

	@OriginalMember(owner = "client!je", name = "i", descriptor = "I")
	private static int anInt2499 = -1;

	@OriginalMember(owner = "client!je", name = "j", descriptor = "[F")
	public static float[] aFloatArray15 = new float[4];

	@OriginalMember(owner = "client!je", name = "k", descriptor = "[F")
	private static float[] aFloatArray16 = new float[4];

	@OriginalMember(owner = "client!je", name = "m", descriptor = "F")
	private static float aFloat28 = -1.0F;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "()V")
	private static void method2149() {
		method2159(anInt2495, 1.1523438F, 0.69921875F, 1.2F);
		method2157(-50.0F, -60.0F, -50.0F);
		method2153(anInt2494, 0, false);
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "()F")
	public static float method2150() {
		return aFloat27;
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "()I")
	public static int method2151() {
		return anInt2496;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIZ)V")
	public static void method2153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (!arg2 && anInt2499 == arg0 && anInt2497 == arg1) {
			return;
		}
		anInt2499 = arg0;
		anInt2497 = arg1;
		@Pc(14) GL local14 = Static60.aGL1;
		aFloatArray14[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
		aFloatArray14[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
		aFloatArray14[2] = (float) (arg0 & 0xFF) / 255.0F;
		local14.glFogi(2917, 9729);
		local14.glFogf(2914, 0.95F);
		local14.glHint(3156, 4353);
		@Pc(67) int local67 = 3072 - arg1;
		if (local67 < 50) {
			local67 = 50;
		}
		local14.glFogf(2915, (float) local67);
		local14.glFogf(2916, (float) 3328);
		local14.glFogfv(2918, aFloatArray14, 0);
	}

	@OriginalMember(owner = "client!je", name = "e", descriptor = "()V")
	public static void method2154() {
		@Pc(1) GL local1 = Static60.aGL1;
		local1.glLightfv(16384, 4611, aFloatArray15, 0);
		local1.glLightfv(16385, 4611, aFloatArray16, 0);
	}

	@OriginalMember(owner = "client!je", name = "f", descriptor = "()V")
	public static void method2155() {
		@Pc(1) GL local1 = Static60.aGL1;
		local1.glColorMaterial(1028, 5634);
		local1.glEnable(2903);
		@Pc(27) float[] local27 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		local1.glLightfv(16384, 4608, local27, 0);
		local1.glEnable(16384);
		@Pc(55) float[] local55 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		local1.glLightfv(16385, 4608, local55, 0);
		local1.glEnable(16385);
		anInt2496 = -1;
		anInt2499 = -1;
		method2149();
	}

	@OriginalMember(owner = "client!je", name = "g", descriptor = "()F")
	public static float method2156() {
		return aFloat26;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(FFF)V")
	public static void method2157(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		if (aFloatArray15[0] == arg0 && aFloatArray15[1] == arg1 && aFloatArray15[2] == arg2) {
			return;
		}
		aFloatArray15[0] = arg0;
		aFloatArray15[1] = arg1;
		aFloatArray15[2] = arg2;
		aFloatArray16[0] = -arg0;
		aFloatArray16[1] = -arg1;
		aFloatArray16[2] = -arg2;
		anInt2500 = (int) (arg0 * 256.0F / arg1);
		anInt2498 = (int) (arg2 * 256.0F / arg1);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "([F)V")
	public static void method2158(@OriginalArg(0) float[] arg0) {
		if (arg0 == null) {
			arg0 = aFloatArray14;
		}
		@Pc(5) GL local5 = Static60.aGL1;
		local5.glFogfv(2918, arg0, 0);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IFFF)V")
	public static void method2159(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		if (anInt2496 == arg0 && aFloat26 == arg1 && aFloat27 == arg2 && aFloat28 == arg3) {
			return;
		}
		anInt2496 = arg0;
		aFloat26 = arg1;
		aFloat27 = arg2;
		aFloat28 = arg3;
		@Pc(25) GL local25 = Static60.aGL1;
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
