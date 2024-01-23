import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
	public static int anInt1345;

	@OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
	public static int anInt1349;

	@OriginalMember(owner = "client!ek", name = "k", descriptor = "F")
	private static float aFloat32;

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "F")
	private static float aFloat30 = -1.0F;

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
	private static int anInt1346 = -1;

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "[F")
	public static float[] aFloatArray12 = new float[4];

	@OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
	private static int anInt1347 = -1;

	@OriginalMember(owner = "client!ek", name = "f", descriptor = "F")
	private static float aFloat31 = -1.0F;

	@OriginalMember(owner = "client!ek", name = "g", descriptor = "I")
	public static int anInt1348 = 13156520;

	@OriginalMember(owner = "client!ek", name = "i", descriptor = "[F")
	private static float[] aFloatArray13 = new float[4];

	@OriginalMember(owner = "client!ek", name = "j", descriptor = "[F")
	public static float[] aFloatArray14 = new float[4];

	@OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
	private static int anInt1350 = -1;

	@OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
	public static int anInt1351 = 16777215;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "()F")
	public static float method1140() {
		return aFloat32;
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "()F")
	public static float method1141() {
		return aFloat31;
	}

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "()I")
	public static int method1142() {
		return anInt1350;
	}

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "()V")
	private static void method1143() {
		method1149(anInt1351, 1.1523438F, 0.69921875F, 1.2F);
		method1146(-50.0F, -60.0F, -50.0F);
		method1145(anInt1348, 0, false);
	}

	@OriginalMember(owner = "client!ek", name = "e", descriptor = "()V")
	public static void method1144() {
		@Pc(1) GL local1 = Static71.aGL1;
		local1.glColorMaterial(1028, 5634);
		local1.glEnable(2903);
		@Pc(27) float[] local27 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		local1.glLightfv(16384, 4608, local27, 0);
		local1.glEnable(16384);
		@Pc(55) float[] local55 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		local1.glLightfv(16385, 4608, local55, 0);
		local1.glEnable(16385);
		anInt1350 = -1;
		anInt1346 = -1;
		method1143();
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIZ)V")
	public static void method1145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (!arg2 && anInt1346 == arg0 && anInt1347 == arg1) {
			return;
		}
		anInt1346 = arg0;
		anInt1347 = arg1;
		@Pc(14) GL local14 = Static71.aGL1;
		aFloatArray12[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
		aFloatArray12[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
		aFloatArray12[2] = (float) (arg0 & 0xFF) / 255.0F;
		local14.glFogi(2917, 9729);
		local14.glFogf(2914, 0.95F);
		local14.glHint(3156, 4353);
		@Pc(67) int local67 = 3072 - arg1;
		if (local67 < 50) {
			local67 = 50;
		}
		local14.glFogf(2915, (float) local67);
		local14.glFogf(2916, (float) 3328);
		local14.glFogfv(2918, aFloatArray12, 0);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(FFF)V")
	public static void method1146(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		if (aFloatArray14[0] == arg0 && aFloatArray14[1] == arg1 && aFloatArray14[2] == arg2) {
			return;
		}
		aFloatArray14[0] = arg0;
		aFloatArray14[1] = arg1;
		aFloatArray14[2] = arg2;
		aFloatArray13[0] = -arg0;
		aFloatArray13[1] = -arg1;
		aFloatArray13[2] = -arg2;
		anInt1345 = (int) (arg0 * 256.0F / arg1);
		anInt1349 = (int) (arg2 * 256.0F / arg1);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "([F)V")
	public static void method1148(@OriginalArg(0) float[] arg0) {
		if (arg0 == null) {
			arg0 = aFloatArray12;
		}
		@Pc(5) GL local5 = Static71.aGL1;
		local5.glFogfv(2918, arg0, 0);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IFFF)V")
	public static void method1149(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		if (anInt1350 == arg0 && aFloat32 == arg1 && aFloat31 == arg2 && aFloat30 == arg3) {
			return;
		}
		anInt1350 = arg0;
		aFloat32 = arg1;
		aFloat31 = arg2;
		aFloat30 = arg3;
		@Pc(25) GL local25 = Static71.aGL1;
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

	@OriginalMember(owner = "client!ek", name = "g", descriptor = "()V")
	public static void method1150() {
		@Pc(1) GL local1 = Static71.aGL1;
		local1.glLightfv(16384, 4611, aFloatArray14, 0);
		local1.glLightfv(16385, 4611, aFloatArray13, 0);
	}
}
