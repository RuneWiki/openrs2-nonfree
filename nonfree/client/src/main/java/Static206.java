import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "[I")
	private static int[] anIntArray371 = new int[1];

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "[I")
	private static int[] anIntArray372 = new int[4];

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "[I")
	private static int[] anIntArray373 = new int[4];

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "I")
	private static int anInt4157 = 0;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "()V")
	public static void method3299() {
		Static277.aGL1.glBindFramebufferEXT(36160, --anInt4157 > 0 ? anIntArray372[anInt4157 - 1] : 0);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V")
	public static void method3300(@OriginalArg(0) int arg0) {
		anIntArray371[0] = arg0;
		Static277.aGL1.glDeleteRenderbuffersEXT(1, anIntArray371, 0);
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V")
	public static void method3301(@OriginalArg(0) int arg0) {
		anIntArray372[anInt4157++] = arg0;
		Static277.aGL1.glBindFramebufferEXT(36160, arg0);
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "()V")
	public static void method3302() {
		@Pc(1) GL local1 = Static277.aGL1;
		local1.glMatrixMode(5889);
		local1.glPopMatrix();
		local1.glMatrixMode(5888);
		local1.glPopMatrix();
		local1.glViewport(anIntArray373[0], anIntArray373[1], anIntArray373[2], anIntArray373[3]);
	}

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "()Z")
	public static boolean method3304() {
		@Pc(1) GL local1 = Static277.aGL1;
		@Pc(5) int local5 = local1.glCheckFramebufferStatusEXT(36160);
		return local5 == 36053;
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)V")
	public static void method3305(@OriginalArg(0) int arg0) {
		anIntArray371[0] = arg0;
		Static277.aGL1.glDeleteFramebuffersEXT(1, anIntArray371, 0);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(FFFFII)V")
	public static void method3306(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		method3307(arg0, arg1, arg2, arg3, -1.0F, 1.0F, arg4, arg5);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(FFFFFFII)V")
	public static void method3307(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(1) GL local1 = Static277.aGL1;
		local1.glMatrixMode(5889);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glOrtho((double) arg0, (double) arg1, (double) arg2, (double) arg3, (double) arg4, (double) arg5);
		local1.glMatrixMode(5888);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glGetIntegerv(2978, anIntArray373, 0);
		local1.glViewport(0, 0, arg6, arg7);
	}

	@OriginalMember(owner = "client!pm", name = "e", descriptor = "()I")
	public static int method3308() {
		Static277.aGL1.glGenFramebuffersEXT(1, anIntArray371, 0);
		return anIntArray371[0];
	}

	@OriginalMember(owner = "client!pm", name = "f", descriptor = "()I")
	public static int method3309() {
		Static277.aGL1.glGenRenderbuffersEXT(1, anIntArray371, 0);
		return anIntArray371[0];
	}
}
