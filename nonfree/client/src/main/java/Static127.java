import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "[I")
	private static int[] anIntArray196 = new int[1];

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
	private static int anInt2515 = 0;

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "[I")
	private static int[] anIntArray197 = new int[4];

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "[I")
	private static int[] anIntArray198 = new int[4];

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(FFFFII)V")
	public static void method2232(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		method2241(arg0, arg1, arg2, arg3, -1.0F, 1.0F, arg4, arg5);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "()I")
	public static int method2233() {
		Static71.aGL1.glGenRenderbuffersEXT(1, anIntArray196, 0);
		return anIntArray196[0];
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
	public static void method2235(@OriginalArg(0) int arg0) {
		anIntArray196[0] = arg0;
		Static71.aGL1.glDeleteRenderbuffersEXT(1, anIntArray196, 0);
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "()Z")
	public static boolean method2236() {
		@Pc(1) GL local1 = Static71.aGL1;
		@Pc(5) int local5 = local1.glCheckFramebufferStatusEXT(36160);
		return local5 == 36053;
	}

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "()V")
	public static void method2237() {
		Static71.aGL1.glBindFramebufferEXT(36160, --anInt2515 > 0 ? anIntArray197[anInt2515 - 1] : 0);
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V")
	public static void method2238(@OriginalArg(0) int arg0) {
		anIntArray196[0] = arg0;
		Static71.aGL1.glDeleteFramebuffersEXT(1, anIntArray196, 0);
	}

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "()V")
	public static void method2239() {
		@Pc(1) GL local1 = Static71.aGL1;
		local1.glMatrixMode(5889);
		local1.glPopMatrix();
		local1.glMatrixMode(5888);
		local1.glPopMatrix();
		local1.glViewport(anIntArray198[0], anIntArray198[1], anIntArray198[2], anIntArray198[3]);
	}

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "()I")
	public static int method2240() {
		Static71.aGL1.glGenFramebuffersEXT(1, anIntArray196, 0);
		return anIntArray196[0];
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(FFFFFFII)V")
	public static void method2241(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(1) GL local1 = Static71.aGL1;
		local1.glMatrixMode(5889);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glOrtho((double) arg0, (double) arg1, (double) arg2, (double) arg3, (double) arg4, (double) arg5);
		local1.glMatrixMode(5888);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glGetIntegerv(2978, anIntArray198, 0);
		local1.glViewport(0, 0, arg6, arg7);
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)V")
	public static void method2242(@OriginalArg(0) int arg0) {
		anIntArray197[anInt2515++] = arg0;
		Static71.aGL1.glBindFramebufferEXT(36160, arg0);
	}
}
