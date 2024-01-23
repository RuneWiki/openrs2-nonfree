import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "[I")
	private static int[] anIntArray27 = new int[4];

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
	private static int anInt454 = 0;

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "[I")
	private static int[] anIntArray28 = new int[4];

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "[I")
	private static int[] anIntArray29 = new int[1];

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "()I")
	public static int method365() {
		Static296.aGL1.glGenFramebuffersEXT(1, anIntArray29, 0);
		return anIntArray29[0];
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "()Z")
	public static boolean method367() {
		@Pc(1) GL local1 = Static296.aGL1;
		@Pc(5) int local5 = local1.glCheckFramebufferStatusEXT(36160);
		return local5 == 36053;
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "()V")
	public static void method368() {
		Static296.aGL1.glBindFramebufferEXT(36160, --anInt454 > 0 ? anIntArray28[anInt454 - 1] : 0);
	}

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "()V")
	public static void method369() {
		@Pc(1) GL local1 = Static296.aGL1;
		local1.glMatrixMode(5889);
		local1.glPopMatrix();
		local1.glMatrixMode(5888);
		local1.glPopMatrix();
		local1.glViewport(anIntArray27[0], anIntArray27[1], anIntArray27[2], anIntArray27[3]);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(FFFFII)V")
	public static void method370(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		method374(arg0, arg1, arg2, arg3, -1.0F, 1.0F, arg4, arg5);
	}

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "()I")
	public static int method371() {
		Static296.aGL1.glGenRenderbuffersEXT(1, anIntArray29, 0);
		return anIntArray29[0];
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
	public static void method372(@OriginalArg(0) int arg0) {
		anIntArray29[0] = arg0;
		Static296.aGL1.glDeleteFramebuffersEXT(1, anIntArray29, 0);
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V")
	public static void method373(@OriginalArg(0) int arg0) {
		anIntArray28[anInt454++] = arg0;
		Static296.aGL1.glBindFramebufferEXT(36160, arg0);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(FFFFFFII)V")
	public static void method374(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(1) GL local1 = Static296.aGL1;
		local1.glMatrixMode(5889);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glOrtho((double) arg0, (double) arg1, (double) arg2, (double) arg3, (double) arg4, (double) arg5);
		local1.glMatrixMode(5888);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glGetIntegerv(2978, anIntArray27, 0);
		local1.glViewport(0, 0, arg6, arg7);
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V")
	public static void method375(@OriginalArg(0) int arg0) {
		anIntArray29[0] = arg0;
		Static296.aGL1.glDeleteRenderbuffersEXT(1, anIntArray29, 0);
	}
}
