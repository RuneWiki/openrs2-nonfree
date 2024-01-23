import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "[I")
	private static int[] anIntArray15 = new int[4];

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "[I")
	private static int[] anIntArray16 = new int[1];

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "[I")
	private static int[] anIntArray17 = new int[4];

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
	private static int anInt225 = 0;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(FFFFFFII)V")
	public static void method183(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(1) GL local1 = Static156.aGL1;
		local1.glMatrixMode(5889);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glOrtho((double) arg0, (double) arg1, (double) arg2, (double) arg3, (double) arg4, (double) arg5);
		local1.glMatrixMode(5888);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glGetIntegerv(2978, anIntArray17, 0);
		local1.glViewport(0, 0, arg6, arg7);
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "()I")
	public static int method185() {
		Static156.aGL1.glGenFramebuffersEXT(1, anIntArray16, 0);
		return anIntArray16[0];
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
	public static void method186(@OriginalArg(0) int arg0) {
		anIntArray16[0] = arg0;
		Static156.aGL1.glDeleteFramebuffersEXT(1, anIntArray16, 0);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(FFFFII)V")
	public static void method187(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		method183(arg0, arg1, arg2, arg3, -1.0F, 1.0F, arg4, arg5);
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "()Z")
	public static boolean method188() {
		@Pc(1) GL local1 = Static156.aGL1;
		@Pc(5) int local5 = local1.glCheckFramebufferStatusEXT(36160);
		return local5 == 36053;
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)V")
	public static void method189(@OriginalArg(0) int arg0) {
		anIntArray16[0] = arg0;
		Static156.aGL1.glDeleteRenderbuffersEXT(1, anIntArray16, 0);
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "(I)V")
	public static void method190(@OriginalArg(0) int arg0) {
		anIntArray15[anInt225++] = arg0;
		Static156.aGL1.glBindFramebufferEXT(36160, arg0);
	}

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "()I")
	public static int method191() {
		Static156.aGL1.glGenRenderbuffersEXT(1, anIntArray16, 0);
		return anIntArray16[0];
	}

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "()V")
	public static void method192() {
		@Pc(1) GL local1 = Static156.aGL1;
		local1.glMatrixMode(5889);
		local1.glPopMatrix();
		local1.glMatrixMode(5888);
		local1.glPopMatrix();
		local1.glViewport(anIntArray17[0], anIntArray17[1], anIntArray17[2], anIntArray17[3]);
	}

	@OriginalMember(owner = "client!ao", name = "f", descriptor = "()V")
	public static void method193() {
		Static156.aGL1.glBindFramebufferEXT(36160, --anInt225 > 0 ? anIntArray15[anInt225 - 1] : 0);
	}
}
