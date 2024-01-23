import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!b", name = "a", descriptor = "[I")
	private static int[] anIntArray22 = new int[1];

	@OriginalMember(owner = "client!b", name = "b", descriptor = "[I")
	private static int[] anIntArray23 = new int[4];

	@OriginalMember(owner = "client!b", name = "c", descriptor = "[I")
	private static int[] anIntArray24 = new int[4];

	@OriginalMember(owner = "client!b", name = "d", descriptor = "I")
	private static int anInt227 = 0;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "()I")
	public static int method207() {
		Static94.aGL1.glGenRenderbuffersEXT(1, anIntArray22, 0);
		return anIntArray22[0];
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "()V")
	public static void method209() {
		@Pc(1) GL local1 = Static94.aGL1;
		local1.glMatrixMode(5889);
		local1.glPopMatrix();
		local1.glMatrixMode(5888);
		local1.glPopMatrix();
		local1.glViewport(anIntArray23[0], anIntArray23[1], anIntArray23[2], anIntArray23[3]);
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "()I")
	public static int method210() {
		Static94.aGL1.glGenFramebuffersEXT(1, anIntArray22, 0);
		return anIntArray22[0];
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
	public static void method211(@OriginalArg(0) int arg0) {
		anIntArray22[0] = arg0;
		Static94.aGL1.glDeleteFramebuffersEXT(1, anIntArray22, 0);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(FFFFFFII)V")
	public static void method212(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(1) GL local1 = Static94.aGL1;
		local1.glMatrixMode(5889);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glOrtho((double) arg0, (double) arg1, (double) arg2, (double) arg3, (double) arg4, (double) arg5);
		local1.glMatrixMode(5888);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glGetIntegerv(2978, anIntArray23, 0);
		local1.glViewport(0, 0, arg6, arg7);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(FFFFII)V")
	public static void method213(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		method212(arg0, arg1, arg2, arg3, -1.0F, 1.0F, arg4, arg5);
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V")
	public static void method214(@OriginalArg(0) int arg0) {
		anIntArray22[0] = arg0;
		Static94.aGL1.glDeleteRenderbuffersEXT(1, anIntArray22, 0);
	}

	@OriginalMember(owner = "client!b", name = "e", descriptor = "()V")
	public static void method215() {
		Static94.aGL1.glBindFramebufferEXT(36160, --anInt227 > 0 ? anIntArray24[anInt227 - 1] : 0);
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V")
	public static void method216(@OriginalArg(0) int arg0) {
		anIntArray24[anInt227++] = arg0;
		Static94.aGL1.glBindFramebufferEXT(36160, arg0);
	}

	@OriginalMember(owner = "client!b", name = "f", descriptor = "()Z")
	public static boolean method217() {
		@Pc(1) GL local1 = Static94.aGL1;
		@Pc(5) int local5 = local1.glCheckFramebufferStatusEXT(36160);
		return local5 == 36053;
	}
}
