import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "F")
	private static float aFloat157;

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
	public static int anInt5098;

	@OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
	public static int anInt5102;

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
	private static int anInt5097 = -1;

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "[F")
	public static float[] aFloatArray24 = new float[4];

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "F")
	private static float aFloat158 = -1.0F;

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
	private static int anInt5099 = -1;

	@OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
	public static int anInt5100 = 13156520;

	@OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
	public static int anInt5101 = 16777215;

	@OriginalMember(owner = "client!uf", name = "j", descriptor = "[F")
	private static float[] aFloatArray25 = new float[4];

	@OriginalMember(owner = "client!uf", name = "k", descriptor = "[F")
	public static float[] aFloatArray26 = new float[4];

	@OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
	private static int anInt5103 = -1;

	@OriginalMember(owner = "client!uf", name = "m", descriptor = "F")
	private static float aFloat159 = -1.0F;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "()V")
	public static void method4350() {
		@Pc(1) GL local1 = Static156.aGL1;
		local1.glLightfv(16384, 4611, aFloatArray26, 0);
		local1.glLightfv(16385, 4611, aFloatArray25, 0);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IFFF)V")
	public static void method4351(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		if (anInt5103 == arg0 && aFloat157 == arg1 && aFloat158 == arg2 && aFloat159 == arg3) {
			return;
		}
		anInt5103 = arg0;
		aFloat157 = arg1;
		aFloat158 = arg2;
		aFloat159 = arg3;
		@Pc(25) GL local25 = Static156.aGL1;
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

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "()V")
	private static void method4353() {
		method4351(anInt5101, 1.1523438F, 0.69921875F, 1.2F);
		method4354(-50.0F, -60.0F, -50.0F);
		method4358(anInt5100, 0, false);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(FFF)V")
	public static void method4354(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		if (aFloatArray26[0] == arg0 && aFloatArray26[1] == arg1 && aFloatArray26[2] == arg2) {
			return;
		}
		aFloatArray26[0] = arg0;
		aFloatArray26[1] = arg1;
		aFloatArray26[2] = arg2;
		aFloatArray25[0] = -arg0;
		aFloatArray25[1] = -arg1;
		aFloatArray25[2] = -arg2;
		anInt5102 = (int) (arg0 * 256.0F / arg1);
		anInt5098 = (int) (arg2 * 256.0F / arg1);
	}

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "()I")
	public static int method4355() {
		return anInt5103;
	}

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "()V")
	public static void method4356() {
		@Pc(1) GL local1 = Static156.aGL1;
		local1.glColorMaterial(1028, 5634);
		local1.glEnable(2903);
		@Pc(27) float[] local27 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		local1.glLightfv(16384, 4608, local27, 0);
		local1.glEnable(16384);
		@Pc(55) float[] local55 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		local1.glLightfv(16385, 4608, local55, 0);
		local1.glEnable(16385);
		anInt5103 = -1;
		anInt5099 = -1;
		method4353();
	}

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "()F")
	public static float method4357() {
		return aFloat158;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIZ)V")
	public static void method4358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (!arg2 && anInt5099 == arg0 && anInt5097 == arg1) {
			return;
		}
		anInt5099 = arg0;
		anInt5097 = arg1;
		@Pc(14) GL local14 = Static156.aGL1;
		aFloatArray24[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
		aFloatArray24[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
		aFloatArray24[2] = (float) (arg0 & 0xFF) / 255.0F;
		local14.glFogi(2917, 9729);
		local14.glFogf(2914, 0.95F);
		local14.glHint(3156, 4353);
		@Pc(67) int local67 = 3072 - arg1;
		if (local67 < 50) {
			local67 = 50;
		}
		local14.glFogf(2915, (float) local67);
		local14.glFogf(2916, (float) 3328);
		local14.glFogfv(2918, aFloatArray24, 0);
	}

	@OriginalMember(owner = "client!uf", name = "g", descriptor = "()F")
	public static float method4359() {
		return aFloat157;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "([F)V")
	public static void method4360(@OriginalArg(0) float[] arg0) {
		if (arg0 == null) {
			arg0 = aFloatArray24;
		}
		@Pc(5) GL local5 = Static156.aGL1;
		local5.glFogfv(2918, arg0, 0);
	}
}
