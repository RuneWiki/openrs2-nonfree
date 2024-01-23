import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "[I")
	private static int[] anIntArray377 = new int[4];

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "[I")
	private static int[] anIntArray378 = new int[1];

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
	private static int anInt4971 = 0;

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "[I")
	private static int[] anIntArray379 = new int[4];

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "()Z")
	public static boolean method3764() {
		@Pc(1) GL local1 = Static116.aGL1;
		@Pc(5) int local5 = local1.glCheckFramebufferStatusEXT(36160);
		return local5 == 36053;
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "()I")
	public static int method3766() {
		Static116.aGL1.glGenFramebuffersEXT(1, anIntArray378, 0);
		return anIntArray378[0];
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "()V")
	public static void method3767() {
		@Pc(1) GL local1 = Static116.aGL1;
		local1.glMatrixMode(5889);
		local1.glPopMatrix();
		local1.glMatrixMode(5888);
		local1.glPopMatrix();
		local1.glViewport(anIntArray377[0], anIntArray377[1], anIntArray377[2], anIntArray377[3]);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(FFFFII)V")
	public static void method3768(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		method3771(arg0, arg1, arg2, arg3, -1.0F, 1.0F, arg4, arg5);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
	public static void method3769(@OriginalArg(0) int arg0) {
		anIntArray379[anInt4971++] = arg0;
		Static116.aGL1.glBindFramebufferEXT(36160, arg0);
	}

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "()V")
	public static void method3770() {
		Static116.aGL1.glBindFramebufferEXT(36160, --anInt4971 > 0 ? anIntArray379[anInt4971 - 1] : 0);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(FFFFFFII)V")
	public static void method3771(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(1) GL local1 = Static116.aGL1;
		local1.glMatrixMode(5889);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glOrtho((double) arg0, (double) arg1, (double) arg2, (double) arg3, (double) arg4, (double) arg5);
		local1.glMatrixMode(5888);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glGetIntegerv(2978, anIntArray377, 0);
		local1.glViewport(0, 0, arg6, arg7);
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V")
	public static void method3772(@OriginalArg(0) int arg0) {
		anIntArray378[0] = arg0;
		Static116.aGL1.glDeleteRenderbuffersEXT(1, anIntArray378, 0);
	}

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "()I")
	public static int method3773() {
		Static116.aGL1.glGenRenderbuffersEXT(1, anIntArray378, 0);
		return anIntArray378[0];
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)V")
	public static void method3774(@OriginalArg(0) int arg0) {
		anIntArray378[0] = arg0;
		Static116.aGL1.glDeleteFramebuffersEXT(1, anIntArray378, 0);
	}
}
