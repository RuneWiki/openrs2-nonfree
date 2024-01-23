import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "I")
	public static int anInt3363;

	@OriginalMember(owner = "client!mn", name = "k", descriptor = "I")
	public static int anInt3366;

	@OriginalMember(owner = "client!mn", name = "l", descriptor = "F")
	private static float aFloat82;

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "F")
	private static float aFloat80 = -1.0F;

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "I")
	private static int anInt3361 = -1;

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "I")
	private static int anInt3362 = -1;

	@OriginalMember(owner = "client!mn", name = "e", descriptor = "[F")
	public static float[] aFloatArray39 = new float[4];

	@OriginalMember(owner = "client!mn", name = "f", descriptor = "F")
	private static float aFloat81 = -1.0F;

	@OriginalMember(owner = "client!mn", name = "g", descriptor = "I")
	public static int anInt3364 = 16777215;

	@OriginalMember(owner = "client!mn", name = "h", descriptor = "[F")
	public static float[] aFloatArray40 = new float[4];

	@OriginalMember(owner = "client!mn", name = "i", descriptor = "I")
	public static int anInt3365 = 13156520;

	@OriginalMember(owner = "client!mn", name = "j", descriptor = "[F")
	private static float[] aFloatArray41 = new float[4];

	@OriginalMember(owner = "client!mn", name = "m", descriptor = "I")
	private static int anInt3367 = -1;

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "([F)V")
	public static void method2785(@OriginalArg(0) float[] arg0) {
		if (arg0 == null) {
			arg0 = aFloatArray39;
		}
		@Pc(5) GL local5 = Static94.aGL1;
		local5.glFogfv(2918, arg0, 0);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "()F")
	public static float method2786() {
		return aFloat82;
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "()V")
	private static void method2787() {
		method2795(anInt3364, 1.1523438F, 0.69921875F, 1.2F);
		method2788(-50.0F, -60.0F, -50.0F);
		method2794(anInt3365, 0, false);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(FFF)V")
	public static void method2788(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		if (aFloatArray40[0] == arg0 && aFloatArray40[1] == arg1 && aFloatArray40[2] == arg2) {
			return;
		}
		aFloatArray40[0] = arg0;
		aFloatArray40[1] = arg1;
		aFloatArray40[2] = arg2;
		aFloatArray41[0] = -arg0;
		aFloatArray41[1] = -arg1;
		aFloatArray41[2] = -arg2;
		anInt3366 = (int) (arg0 * 256.0F / arg1);
		anInt3363 = (int) (arg2 * 256.0F / arg1);
	}

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "()F")
	public static float method2789() {
		return aFloat81;
	}

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "()V")
	public static void method2790() {
		@Pc(1) GL local1 = Static94.aGL1;
		local1.glLightfv(16384, 4611, aFloatArray40, 0);
		local1.glLightfv(16385, 4611, aFloatArray41, 0);
	}

	@OriginalMember(owner = "client!mn", name = "e", descriptor = "()I")
	public static int method2791() {
		return anInt3361;
	}

	@OriginalMember(owner = "client!mn", name = "f", descriptor = "()V")
	public static void method2792() {
		@Pc(1) GL local1 = Static94.aGL1;
		local1.glColorMaterial(1028, 5634);
		local1.glEnable(2903);
		@Pc(27) float[] local27 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		local1.glLightfv(16384, 4608, local27, 0);
		local1.glEnable(16384);
		@Pc(55) float[] local55 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		local1.glLightfv(16385, 4608, local55, 0);
		local1.glEnable(16385);
		anInt3361 = -1;
		anInt3367 = -1;
		method2787();
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIZ)V")
	public static void method2794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (!arg2 && anInt3367 == arg0 && anInt3362 == arg1) {
			return;
		}
		anInt3367 = arg0;
		anInt3362 = arg1;
		@Pc(14) GL local14 = Static94.aGL1;
		aFloatArray39[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
		aFloatArray39[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
		aFloatArray39[2] = (float) (arg0 & 0xFF) / 255.0F;
		local14.glFogi(2917, 9729);
		local14.glFogf(2914, 0.95F);
		local14.glHint(3156, 4353);
		@Pc(67) int local67 = 3072 - arg1;
		if (local67 < 50) {
			local67 = 50;
		}
		local14.glFogf(2915, (float) local67);
		local14.glFogf(2916, (float) 3328);
		local14.glFogfv(2918, aFloatArray39, 0);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IFFF)V")
	public static void method2795(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		if (anInt3361 == arg0 && aFloat82 == arg1 && aFloat81 == arg2 && aFloat80 == arg3) {
			return;
		}
		anInt3361 = arg0;
		aFloat82 = arg1;
		aFloat81 = arg2;
		aFloat80 = arg3;
		@Pc(25) GL local25 = Static94.aGL1;
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
