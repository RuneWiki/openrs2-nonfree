import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
	private static int anInt3165 = 0;

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "[I")
	private static int[] anIntArray226 = new int[4];

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "[I")
	private static int[] anIntArray227 = new int[1];

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "[I")
	private static int[] anIntArray228 = new int[4];

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(FFFFFFII)V")
	public static void method2587(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(1) GL local1 = Static60.aGL1;
		local1.glMatrixMode(5889);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glOrtho((double) arg0, (double) arg1, (double) arg2, (double) arg3, (double) arg4, (double) arg5);
		local1.glMatrixMode(5888);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glGetIntegerv(2978, anIntArray228, 0);
		local1.glViewport(0, 0, arg6, arg7);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "()V")
	public static void method2588() {
		@Pc(1) GL local1 = Static60.aGL1;
		local1.glMatrixMode(5889);
		local1.glPopMatrix();
		local1.glMatrixMode(5888);
		local1.glPopMatrix();
		local1.glViewport(anIntArray228[0], anIntArray228[1], anIntArray228[2], anIntArray228[3]);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(FFFFII)V")
	public static void method2589(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		method2587(arg0, arg1, arg2, arg3, -1.0F, 1.0F, arg4, arg5);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
	public static void method2590(@OriginalArg(0) int arg0) {
		anIntArray227[0] = arg0;
		Static60.aGL1.glDeleteFramebuffersEXT(1, anIntArray227, 0);
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "()V")
	public static void method2591() {
		Static60.aGL1.glBindFramebufferEXT(36160, --anInt3165 > 0 ? anIntArray226[anInt3165 - 1] : 0);
	}

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "()Z")
	public static boolean method2592() {
		@Pc(1) GL local1 = Static60.aGL1;
		@Pc(5) int local5 = local1.glCheckFramebufferStatusEXT(36160);
		return local5 == 36053;
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V")
	public static void method2593(@OriginalArg(0) int arg0) {
		anIntArray226[anInt3165++] = arg0;
		Static60.aGL1.glBindFramebufferEXT(36160, arg0);
	}

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "(I)V")
	public static void method2594(@OriginalArg(0) int arg0) {
		anIntArray227[0] = arg0;
		Static60.aGL1.glDeleteRenderbuffersEXT(1, anIntArray227, 0);
	}

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "()I")
	public static int method2595() {
		Static60.aGL1.glGenRenderbuffersEXT(1, anIntArray227, 0);
		return anIntArray227[0];
	}

	@OriginalMember(owner = "client!lg", name = "f", descriptor = "()I")
	public static int method2597() {
		Static60.aGL1.glGenFramebuffersEXT(1, anIntArray227, 0);
		return anIntArray227[0];
	}
}
