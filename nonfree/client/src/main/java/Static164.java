import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "I")
	private static int anInt3566 = 0;

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "[I")
	private static int[] anIntArray324 = new int[1];

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "[I")
	private static int[] anIntArray325 = new int[4];

	@OriginalMember(owner = "client!lo", name = "d", descriptor = "[I")
	private static int[] anIntArray326 = new int[4];

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)V")
	public static void method2583(@OriginalArg(0) int arg0) {
		anIntArray324[0] = arg0;
		Static294.aGL1.glDeleteFramebuffersEXT(1, anIntArray324, 0);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(FFFFII)V")
	public static void method2584(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		method2587(arg0, arg1, arg2, arg3, -1.0F, 1.0F, arg4, arg5);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "()V")
	public static void method2585() {
		Static294.aGL1.glBindFramebufferEXT(36160, --anInt3566 > 0 ? anIntArray326[anInt3566 - 1] : 0);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(FFFFFFII)V")
	public static void method2587(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(1) GL local1 = Static294.aGL1;
		local1.glMatrixMode(5889);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glOrtho((double) arg0, (double) arg1, (double) arg2, (double) arg3, (double) arg4, (double) arg5);
		local1.glMatrixMode(5888);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glGetIntegerv(2978, anIntArray325, 0);
		local1.glViewport(0, 0, arg6, arg7);
	}

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "()I")
	public static int method2588() {
		Static294.aGL1.glGenFramebuffersEXT(1, anIntArray324, 0);
		return anIntArray324[0];
	}

	@OriginalMember(owner = "client!lo", name = "d", descriptor = "()Z")
	public static boolean method2589() {
		@Pc(1) GL local1 = Static294.aGL1;
		@Pc(5) int local5 = local1.glCheckFramebufferStatusEXT(36160);
		return local5 == 36053;
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)V")
	public static void method2590(@OriginalArg(0) int arg0) {
		anIntArray324[0] = arg0;
		Static294.aGL1.glDeleteRenderbuffersEXT(1, anIntArray324, 0);
	}

	@OriginalMember(owner = "client!lo", name = "e", descriptor = "()V")
	public static void method2591() {
		@Pc(1) GL local1 = Static294.aGL1;
		local1.glMatrixMode(5889);
		local1.glPopMatrix();
		local1.glMatrixMode(5888);
		local1.glPopMatrix();
		local1.glViewport(anIntArray325[0], anIntArray325[1], anIntArray325[2], anIntArray325[3]);
	}

	@OriginalMember(owner = "client!lo", name = "f", descriptor = "()I")
	public static int method2592() {
		Static294.aGL1.glGenRenderbuffersEXT(1, anIntArray324, 0);
		return anIntArray324[0];
	}

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "(I)V")
	public static void method2593(@OriginalArg(0) int arg0) {
		anIntArray326[anInt3566++] = arg0;
		Static294.aGL1.glBindFramebufferEXT(36160, arg0);
	}
}
