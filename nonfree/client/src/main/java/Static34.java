import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
	public static int anInt732;

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
	public static int anInt733;

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "F")
	private static float aFloat20;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "[F")
	public static float[] aFloatArray9 = new float[4];

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
	private static int anInt727 = -1;

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
	public static int anInt728 = 16777215;

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
	private static int anInt729 = -1;

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
	public static int anInt730 = 13156520;

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
	private static int anInt731 = -1;

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "[F")
	public static float[] aFloatArray10 = new float[4];

	@OriginalMember(owner = "client!cc", name = "k", descriptor = "F")
	private static float aFloat21 = -1.0F;

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "F")
	private static float aFloat22 = -1.0F;

	@OriginalMember(owner = "client!cc", name = "m", descriptor = "[F")
	private static float[] aFloatArray11 = new float[4];

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "()F")
	public static float method622() {
		return aFloat20;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIZ)V")
	public static void method623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (!arg2 && anInt727 == arg0 && anInt731 == arg1) {
			return;
		}
		anInt727 = arg0;
		anInt731 = arg1;
		@Pc(14) GL local14 = Static240.aGL1;
		aFloatArray9[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
		aFloatArray9[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
		aFloatArray9[2] = (float) (arg0 & 0xFF) / 255.0F;
		local14.glFogi(2917, 9729);
		local14.glFogf(2914, 0.95F);
		local14.glHint(3156, 4353);
		@Pc(67) int local67 = 3072 - arg1;
		if (local67 < 50) {
			local67 = 50;
		}
		local14.glFogf(2915, (float) local67);
		local14.glFogf(2916, (float) 3328);
		local14.glFogfv(2918, aFloatArray9, 0);
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "()V")
	public static void method624() {
		@Pc(1) GL local1 = Static240.aGL1;
		local1.glColorMaterial(1028, 5634);
		local1.glEnable(2903);
		@Pc(27) float[] local27 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		local1.glLightfv(16384, 4608, local27, 0);
		local1.glEnable(16384);
		@Pc(55) float[] local55 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		local1.glLightfv(16385, 4608, local55, 0);
		local1.glEnable(16385);
		anInt729 = -1;
		anInt727 = -1;
		method629();
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "()V")
	public static void method625() {
		@Pc(1) GL local1 = Static240.aGL1;
		local1.glLightfv(16384, 4611, aFloatArray10, 0);
		local1.glLightfv(16385, 4611, aFloatArray11, 0);
	}

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "()F")
	public static float method626() {
		return aFloat21;
	}

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "()I")
	public static int method627() {
		return anInt729;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(FFF)V")
	public static void method628(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		if (aFloatArray10[0] == arg0 && aFloatArray10[1] == arg1 && aFloatArray10[2] == arg2) {
			return;
		}
		aFloatArray10[0] = arg0;
		aFloatArray10[1] = arg1;
		aFloatArray10[2] = arg2;
		aFloatArray11[0] = -arg0;
		aFloatArray11[1] = -arg1;
		aFloatArray11[2] = -arg2;
		anInt733 = (int) (arg0 * 256.0F / arg1);
		anInt732 = (int) (arg2 * 256.0F / arg1);
	}

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "()V")
	private static void method629() {
		method632(anInt728, 1.1523438F, 0.69921875F, 1.2F);
		method628(-50.0F, -60.0F, -50.0F);
		method623(anInt730, 0, false);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "([F)V")
	public static void method630(@OriginalArg(0) float[] arg0) {
		if (arg0 == null) {
			arg0 = aFloatArray9;
		}
		@Pc(5) GL local5 = Static240.aGL1;
		local5.glFogfv(2918, arg0, 0);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IFFF)V")
	public static void method632(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		if (anInt729 == arg0 && aFloat20 == arg1 && aFloat21 == arg2 && aFloat22 == arg3) {
			return;
		}
		anInt729 = arg0;
		aFloat20 = arg1;
		aFloat21 = arg2;
		aFloat22 = arg3;
		@Pc(25) GL local25 = Static240.aGL1;
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
