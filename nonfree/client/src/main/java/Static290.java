import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
	public static int anInt5640;

	@OriginalMember(owner = "client!vi", name = "l", descriptor = "F")
	private static float aFloat165;

	@OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
	public static int anInt5646;

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "[F")
	public static float[] aFloatArray25 = new float[4];

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "F")
	private static float aFloat163 = -1.0F;

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
	public static int anInt5641 = 13156520;

	@OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
	private static int anInt5642 = -1;

	@OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
	private static int anInt5643 = -1;

	@OriginalMember(owner = "client!vi", name = "g", descriptor = "I")
	private static int anInt5644 = -1;

	@OriginalMember(owner = "client!vi", name = "h", descriptor = "[F")
	private static float[] aFloatArray26 = new float[4];

	@OriginalMember(owner = "client!vi", name = "i", descriptor = "[F")
	public static float[] aFloatArray27 = new float[4];

	@OriginalMember(owner = "client!vi", name = "j", descriptor = "I")
	public static int anInt5645 = 16777215;

	@OriginalMember(owner = "client!vi", name = "k", descriptor = "F")
	private static float aFloat164 = -1.0F;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "()V")
	private static void method4517() {
		method4524(anInt5645, 1.1523438F, 0.69921875F, 1.2F);
		method4526(-50.0F, -60.0F, -50.0F);
		method4527(anInt5641, 0, false);
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "()V")
	public static void method4518() {
		@Pc(1) GL local1 = Static251.aGL1;
		local1.glLightfv(16384, 4611, aFloatArray25, 0);
		local1.glLightfv(16385, 4611, aFloatArray26, 0);
	}

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "()F")
	public static float method4520() {
		return aFloat165;
	}

	@OriginalMember(owner = "client!vi", name = "e", descriptor = "()I")
	public static int method4521() {
		return anInt5642;
	}

	@OriginalMember(owner = "client!vi", name = "f", descriptor = "()F")
	public static float method4522() {
		return aFloat163;
	}

	@OriginalMember(owner = "client!vi", name = "g", descriptor = "()V")
	public static void method4523() {
		@Pc(1) GL local1 = Static251.aGL1;
		local1.glColorMaterial(1028, 5634);
		local1.glEnable(2903);
		@Pc(27) float[] local27 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		local1.glLightfv(16384, 4608, local27, 0);
		local1.glEnable(16384);
		@Pc(55) float[] local55 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		local1.glLightfv(16385, 4608, local55, 0);
		local1.glEnable(16385);
		anInt5642 = -1;
		anInt5643 = -1;
		method4517();
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IFFF)V")
	public static void method4524(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		if (anInt5642 == arg0 && aFloat165 == arg1 && aFloat163 == arg2 && aFloat164 == arg3) {
			return;
		}
		anInt5642 = arg0;
		aFloat165 = arg1;
		aFloat163 = arg2;
		aFloat164 = arg3;
		@Pc(25) GL local25 = Static251.aGL1;
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

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "([F)V")
	public static void method4525(@OriginalArg(0) float[] arg0) {
		if (arg0 == null) {
			arg0 = aFloatArray27;
		}
		@Pc(5) GL local5 = Static251.aGL1;
		local5.glFogfv(2918, arg0, 0);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(FFF)V")
	public static void method4526(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		if (aFloatArray25[0] == arg0 && aFloatArray25[1] == arg1 && aFloatArray25[2] == arg2) {
			return;
		}
		aFloatArray25[0] = arg0;
		aFloatArray25[1] = arg1;
		aFloatArray25[2] = arg2;
		aFloatArray26[0] = -arg0;
		aFloatArray26[1] = -arg1;
		aFloatArray26[2] = -arg2;
		anInt5640 = (int) (arg0 * 256.0F / arg1);
		anInt5646 = (int) (arg2 * 256.0F / arg1);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIZ)V")
	public static void method4527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (!arg2 && anInt5643 == arg0 && anInt5644 == arg1) {
			return;
		}
		anInt5643 = arg0;
		anInt5644 = arg1;
		@Pc(14) GL local14 = Static251.aGL1;
		aFloatArray27[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
		aFloatArray27[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
		aFloatArray27[2] = (float) (arg0 & 0xFF) / 255.0F;
		local14.glFogi(2917, 9729);
		local14.glFogf(2914, 0.95F);
		local14.glHint(3156, 4353);
		@Pc(67) int local67 = 3072 - arg1;
		if (local67 < 50) {
			local67 = 50;
		}
		local14.glFogf(2915, (float) local67);
		local14.glFogf(2916, (float) 3328);
		local14.glFogfv(2918, aFloatArray27, 0);
	}
}
