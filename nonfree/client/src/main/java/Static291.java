import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
	public static int anInt5431;

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
	public static int anInt5433;

	@OriginalMember(owner = "client!wf", name = "k", descriptor = "F")
	private static float aFloat54;

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
	private static int anInt5432 = -1;

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
	private static int anInt5434 = -1;

	@OriginalMember(owner = "client!wf", name = "e", descriptor = "F")
	private static float aFloat52 = -1.0F;

	@OriginalMember(owner = "client!wf", name = "f", descriptor = "[F")
	public static float[] aFloatArray31 = new float[4];

	@OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
	public static int anInt5435 = 16777215;

	@OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
	public static int anInt5436 = 13156520;

	@OriginalMember(owner = "client!wf", name = "i", descriptor = "F")
	private static float aFloat53 = -1.0F;

	@OriginalMember(owner = "client!wf", name = "j", descriptor = "[F")
	public static float[] aFloatArray32 = new float[4];

	@OriginalMember(owner = "client!wf", name = "l", descriptor = "[F")
	private static float[] aFloatArray33 = new float[4];

	@OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
	private static int anInt5437 = -1;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "()V")
	public static void method4309() {
		aFloatArray31 = null;
		aFloatArray33 = null;
		aFloatArray32 = null;
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "()V")
	private static void method4310() {
		method4313(anInt5435, 1.1523438F, 0.69921875F, 1.2F);
		method4317(-50.0F, -60.0F, -50.0F);
		method4312(anInt5436, 0, false);
	}

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "()V")
	public static void method4311() {
		@Pc(1) GL local1 = Static178.aGL1;
		local1.glLightfv(16384, 4611, aFloatArray31, 0);
		local1.glLightfv(16385, 4611, aFloatArray33, 0);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIZ)V")
	public static void method4312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (!arg2 && anInt5432 == arg0 && anInt5434 == arg1) {
			return;
		}
		anInt5432 = arg0;
		anInt5434 = arg1;
		@Pc(14) GL local14 = Static178.aGL1;
		aFloatArray32[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
		aFloatArray32[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
		aFloatArray32[2] = (float) (arg0 & 0xFF) / 255.0F;
		local14.glFogi(2917, 9729);
		local14.glFogf(2914, 0.95F);
		local14.glHint(3156, 4353);
		@Pc(67) int local67 = 3072 - arg1;
		if (local67 < 50) {
			local67 = 50;
		}
		local14.glFogf(2915, (float) local67);
		local14.glFogf(2916, (float) 3328);
		local14.glFogfv(2918, aFloatArray32, 0);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IFFF)V")
	public static void method4313(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		if (anInt5437 == arg0 && aFloat54 == arg1 && aFloat53 == arg2 && aFloat52 == arg3) {
			return;
		}
		anInt5437 = arg0;
		aFloat54 = arg1;
		aFloat53 = arg2;
		aFloat52 = arg3;
		@Pc(25) GL local25 = Static178.aGL1;
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

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "()F")
	public static float method4314() {
		return aFloat53;
	}

	@OriginalMember(owner = "client!wf", name = "e", descriptor = "()F")
	public static float method4315() {
		return aFloat54;
	}

	@OriginalMember(owner = "client!wf", name = "f", descriptor = "()V")
	public static void method4316() {
		@Pc(1) GL local1 = Static178.aGL1;
		local1.glColorMaterial(1028, 5634);
		local1.glEnable(2903);
		@Pc(27) float[] local27 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		local1.glLightfv(16384, 4608, local27, 0);
		local1.glEnable(16384);
		@Pc(55) float[] local55 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		local1.glLightfv(16385, 4608, local55, 0);
		local1.glEnable(16385);
		anInt5437 = -1;
		anInt5432 = -1;
		method4310();
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(FFF)V")
	public static void method4317(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		if (aFloatArray31[0] == arg0 && aFloatArray31[1] == arg1 && aFloatArray31[2] == arg2) {
			return;
		}
		aFloatArray31[0] = arg0;
		aFloatArray31[1] = arg1;
		aFloatArray31[2] = arg2;
		aFloatArray33[0] = -arg0;
		aFloatArray33[1] = -arg1;
		aFloatArray33[2] = -arg2;
		anInt5431 = (int) (arg0 * 256.0F / arg1);
		anInt5433 = (int) (arg2 * 256.0F / arg1);
	}

	@OriginalMember(owner = "client!wf", name = "g", descriptor = "()I")
	public static int method4318() {
		return anInt5437;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "([F)V")
	public static void method4319(@OriginalArg(0) float[] arg0) {
		if (arg0 == null) {
			arg0 = aFloatArray32;
		}
		@Pc(5) GL local5 = Static178.aGL1;
		local5.glFogfv(2918, arg0, 0);
	}
}
