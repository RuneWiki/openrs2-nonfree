import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "[I")
	private static int[] anIntArray362 = new int[4];

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "[I")
	private static int[] anIntArray363 = new int[1];

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
	private static int anInt2931 = 0;

	@OriginalMember(owner = "client!ll", name = "d", descriptor = "[I")
	private static int[] anIntArray364 = new int[4];

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(FFFFII)V")
	public static void method2442(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		method2447(arg0, arg1, arg2, arg3, -1.0F, 1.0F, arg4, arg5);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V")
	public static void method2443(@OriginalArg(0) int arg0) {
		anIntArray363[0] = arg0;
		Static240.aGL1.glDeleteFramebuffersEXT(1, anIntArray363, 0);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "()I")
	public static int method2444() {
		Static240.aGL1.glGenRenderbuffersEXT(1, anIntArray363, 0);
		return anIntArray363[0];
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(I)V")
	public static void method2445(@OriginalArg(0) int arg0) {
		anIntArray362[anInt2931++] = arg0;
		Static240.aGL1.glBindFramebufferEXT(36160, arg0);
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "()V")
	public static void method2446() {
		Static240.aGL1.glBindFramebufferEXT(36160, --anInt2931 > 0 ? anIntArray362[anInt2931 - 1] : 0);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(FFFFFFII)V")
	public static void method2447(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(1) GL local1 = Static240.aGL1;
		local1.glMatrixMode(5889);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glOrtho((double) arg0, (double) arg1, (double) arg2, (double) arg3, (double) arg4, (double) arg5);
		local1.glMatrixMode(5888);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glGetIntegerv(2978, anIntArray364, 0);
		local1.glViewport(0, 0, arg6, arg7);
	}

	@OriginalMember(owner = "client!ll", name = "d", descriptor = "()Z")
	public static boolean method2449() {
		@Pc(1) GL local1 = Static240.aGL1;
		@Pc(5) int local5 = local1.glCheckFramebufferStatusEXT(36160);
		return local5 == 36053;
	}

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "(I)V")
	public static void method2450(@OriginalArg(0) int arg0) {
		anIntArray363[0] = arg0;
		Static240.aGL1.glDeleteRenderbuffersEXT(1, anIntArray363, 0);
	}

	@OriginalMember(owner = "client!ll", name = "e", descriptor = "()V")
	public static void method2451() {
		@Pc(1) GL local1 = Static240.aGL1;
		local1.glMatrixMode(5889);
		local1.glPopMatrix();
		local1.glMatrixMode(5888);
		local1.glPopMatrix();
		local1.glViewport(anIntArray364[0], anIntArray364[1], anIntArray364[2], anIntArray364[3]);
	}

	@OriginalMember(owner = "client!ll", name = "f", descriptor = "()I")
	public static int method2452() {
		Static240.aGL1.glGenFramebuffersEXT(1, anIntArray363, 0);
		return anIntArray363[0];
	}
}
