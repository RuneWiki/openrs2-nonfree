import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "[I")
	private static int[] anIntArray291 = new int[4];

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "[I")
	private static int[] anIntArray292 = new int[1];

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "[I")
	private static int[] anIntArray293 = new int[4];

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
	private static int anInt3673 = 0;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "()I")
	public static int method2957() {
		Static291.aGL1.glGenFramebuffersEXT(1, anIntArray292, 0);
		return anIntArray292[0];
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
	public static void method2958(@OriginalArg(0) int arg0) {
		anIntArray293[anInt3673++] = arg0;
		Static291.aGL1.glBindFramebufferEXT(36160, arg0);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(FFFFFFII)V")
	public static void method2959(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(1) GL local1 = Static291.aGL1;
		local1.glMatrixMode(5889);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glOrtho((double) arg0, (double) arg1, (double) arg2, (double) arg3, (double) arg4, (double) arg5);
		local1.glMatrixMode(5888);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glGetIntegerv(2978, anIntArray291, 0);
		local1.glViewport(0, 0, arg6, arg7);
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "()Z")
	public static boolean method2960() {
		@Pc(1) GL local1 = Static291.aGL1;
		@Pc(5) int local5 = local1.glCheckFramebufferStatusEXT(36160);
		return local5 == 36053;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(FFFFII)V")
	public static void method2962(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		method2959(arg0, arg1, arg2, arg3, -1.0F, 1.0F, arg4, arg5);
	}

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "()I")
	public static int method2963() {
		Static291.aGL1.glGenRenderbuffersEXT(1, anIntArray292, 0);
		return anIntArray292[0];
	}

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "()V")
	public static void method2964() {
		Static291.aGL1.glBindFramebufferEXT(36160, --anInt3673 > 0 ? anIntArray293[anInt3673 - 1] : 0);
	}

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "()V")
	public static void method2965() {
		@Pc(1) GL local1 = Static291.aGL1;
		local1.glMatrixMode(5889);
		local1.glPopMatrix();
		local1.glMatrixMode(5888);
		local1.glPopMatrix();
		local1.glViewport(anIntArray291[0], anIntArray291[1], anIntArray291[2], anIntArray291[3]);
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V")
	public static void method2966(@OriginalArg(0) int arg0) {
		anIntArray292[0] = arg0;
		Static291.aGL1.glDeleteFramebuffersEXT(1, anIntArray292, 0);
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)V")
	public static void method2967(@OriginalArg(0) int arg0) {
		anIntArray292[0] = arg0;
		Static291.aGL1.glDeleteRenderbuffersEXT(1, anIntArray292, 0);
	}
}
