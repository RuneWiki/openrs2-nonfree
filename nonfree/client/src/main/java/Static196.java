import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "[I")
	private static int[] anIntArray314 = new int[4];

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "[I")
	private static int[] anIntArray315 = new int[4];

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
	private static int anInt3940 = 0;

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "[I")
	private static int[] anIntArray316 = new int[1];

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
	public static void method3185(@OriginalArg(0) int arg0) {
		anIntArray316[0] = arg0;
		Static251.aGL1.glDeleteFramebuffersEXT(1, anIntArray316, 0);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "()I")
	public static int method3186() {
		Static251.aGL1.glGenFramebuffersEXT(1, anIntArray316, 0);
		return anIntArray316[0];
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V")
	public static void method3187(@OriginalArg(0) int arg0) {
		anIntArray316[0] = arg0;
		Static251.aGL1.glDeleteRenderbuffersEXT(1, anIntArray316, 0);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(FFFFFFII)V")
	public static void method3188(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(1) GL local1 = Static251.aGL1;
		local1.glMatrixMode(5889);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glOrtho((double) arg0, (double) arg1, (double) arg2, (double) arg3, (double) arg4, (double) arg5);
		local1.glMatrixMode(5888);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glGetIntegerv(2978, anIntArray315, 0);
		local1.glViewport(0, 0, arg6, arg7);
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "()V")
	public static void method3189() {
		Static251.aGL1.glBindFramebufferEXT(36160, --anInt3940 > 0 ? anIntArray314[anInt3940 - 1] : 0);
	}

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "()V")
	public static void method3190() {
		@Pc(1) GL local1 = Static251.aGL1;
		local1.glMatrixMode(5889);
		local1.glPopMatrix();
		local1.glMatrixMode(5888);
		local1.glPopMatrix();
		local1.glViewport(anIntArray315[0], anIntArray315[1], anIntArray315[2], anIntArray315[3]);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(FFFFII)V")
	public static void method3192(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		method3188(arg0, arg1, arg2, arg3, -1.0F, 1.0F, arg4, arg5);
	}

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "()I")
	public static int method3193() {
		Static251.aGL1.glGenRenderbuffersEXT(1, anIntArray316, 0);
		return anIntArray316[0];
	}

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)V")
	public static void method3194(@OriginalArg(0) int arg0) {
		anIntArray314[anInt3940++] = arg0;
		Static251.aGL1.glBindFramebufferEXT(36160, arg0);
	}

	@OriginalMember(owner = "client!oh", name = "f", descriptor = "()Z")
	public static boolean method3195() {
		@Pc(1) GL local1 = Static251.aGL1;
		@Pc(5) int local5 = local1.glCheckFramebufferStatusEXT(36160);
		return local5 == 36053;
	}
}
