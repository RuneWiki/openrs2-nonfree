import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
	public static int anInt653;

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
	public static int anInt658;

	@OriginalMember(owner = "client!ce", name = "m", descriptor = "F")
	private static float aFloat7;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "F")
	private static float aFloat5 = -1.0F;

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
	private static int anInt654 = -1;

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
	public static int anInt655 = 16777215;

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
	private static int anInt656 = -1;

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
	public static int anInt657 = 13156520;

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "[F")
	public static float[] aFloatArray3 = new float[4];

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "[F")
	private static float[] aFloatArray4 = new float[4];

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
	private static int anInt659 = -1;

	@OriginalMember(owner = "client!ce", name = "k", descriptor = "[F")
	public static float[] aFloatArray5 = new float[4];

	@OriginalMember(owner = "client!ce", name = "l", descriptor = "F")
	private static float aFloat6 = -1.0F;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "()V")
	public static void method553() {
		@Pc(1) GL local1 = Static277.aGL1;
		local1.glLightfv(16384, 4611, aFloatArray5, 0);
		local1.glLightfv(16385, 4611, aFloatArray4, 0);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(FFF)V")
	public static void method554(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		if (aFloatArray5[0] == arg0 && aFloatArray5[1] == arg1 && aFloatArray5[2] == arg2) {
			return;
		}
		aFloatArray5[0] = arg0;
		aFloatArray5[1] = arg1;
		aFloatArray5[2] = arg2;
		aFloatArray4[0] = -arg0;
		aFloatArray4[1] = -arg1;
		aFloatArray4[2] = -arg2;
		anInt658 = (int) (arg0 * 256.0F / arg1);
		anInt653 = (int) (arg2 * 256.0F / arg1);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IFFF)V")
	public static void method555(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		if (anInt654 == arg0 && aFloat7 == arg1 && aFloat5 == arg2 && aFloat6 == arg3) {
			return;
		}
		anInt654 = arg0;
		aFloat7 = arg1;
		aFloat5 = arg2;
		aFloat6 = arg3;
		@Pc(25) GL local25 = Static277.aGL1;
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

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "([F)V")
	public static void method556(@OriginalArg(0) float[] arg0) {
		if (arg0 == null) {
			arg0 = aFloatArray3;
		}
		@Pc(5) GL local5 = Static277.aGL1;
		local5.glFogfv(2918, arg0, 0);
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "()F")
	public static float method557() {
		return aFloat5;
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "()V")
	private static void method558() {
		method555(anInt655, 1.1523438F, 0.69921875F, 1.2F);
		method554(-50.0F, -60.0F, -50.0F);
		method559(anInt657, 0, false);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIZ)V")
	public static void method559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (!arg2 && anInt659 == arg0 && anInt656 == arg1) {
			return;
		}
		anInt659 = arg0;
		anInt656 = arg1;
		@Pc(14) GL local14 = Static277.aGL1;
		aFloatArray3[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
		aFloatArray3[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
		aFloatArray3[2] = (float) (arg0 & 0xFF) / 255.0F;
		local14.glFogi(2917, 9729);
		local14.glFogf(2914, 0.95F);
		local14.glHint(3156, 4353);
		@Pc(67) int local67 = 3072 - arg1;
		if (local67 < 50) {
			local67 = 50;
		}
		local14.glFogf(2915, (float) local67);
		local14.glFogf(2916, (float) 3328);
		local14.glFogfv(2918, aFloatArray3, 0);
	}

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "()F")
	public static float method561() {
		return aFloat7;
	}

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "()I")
	public static int method562() {
		return anInt654;
	}

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "()V")
	public static void method563() {
		@Pc(1) GL local1 = Static277.aGL1;
		local1.glColorMaterial(1028, 5634);
		local1.glEnable(2903);
		@Pc(27) float[] local27 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		local1.glLightfv(16384, 4608, local27, 0);
		local1.glEnable(16384);
		@Pc(55) float[] local55 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		local1.glLightfv(16385, 4608, local55, 0);
		local1.glEnable(16385);
		anInt654 = -1;
		anInt659 = -1;
		method558();
	}
}
