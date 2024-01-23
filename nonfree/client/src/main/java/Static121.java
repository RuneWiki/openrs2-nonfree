import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "[I")
	private static int[] anIntArray276 = new int[4];

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "[I")
	private static int[] anIntArray277 = new int[4];

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
	private static int anInt2269 = 0;

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "[I")
	private static int[] anIntArray278 = new int[1];

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V")
	public static void method2012(@OriginalArg(0) int arg0) {
		anIntArray278[0] = arg0;
		Static283.aGL1.glDeleteFramebuffersEXT(1, anIntArray278, 0);
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V")
	public static void method2013(@OriginalArg(0) int arg0) {
		anIntArray278[0] = arg0;
		Static283.aGL1.glDeleteRenderbuffersEXT(1, anIntArray278, 0);
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "()Z")
	public static boolean method2014() {
		@Pc(1) GL local1 = Static283.aGL1;
		@Pc(5) int local5 = local1.glCheckFramebufferStatusEXT(36160);
		return local5 == 36053;
	}

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "()I")
	public static int method2015() {
		Static283.aGL1.glGenRenderbuffersEXT(1, anIntArray278, 0);
		return anIntArray278[0];
	}

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "()V")
	public static void method2016() {
		Static283.aGL1.glBindFramebufferEXT(36160, --anInt2269 > 0 ? anIntArray276[anInt2269 - 1] : 0);
	}

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "()V")
	public static void method2017() {
		@Pc(1) GL local1 = Static283.aGL1;
		local1.glMatrixMode(5889);
		local1.glPopMatrix();
		local1.glMatrixMode(5888);
		local1.glPopMatrix();
		local1.glViewport(anIntArray277[0], anIntArray277[1], anIntArray277[2], anIntArray277[3]);
	}

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "()I")
	public static int method2018() {
		Static283.aGL1.glGenFramebuffersEXT(1, anIntArray278, 0);
		return anIntArray278[0];
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(FFFFII)V")
	public static void method2019(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		method2021(arg0, arg1, arg2, arg3, -1.0F, 1.0F, arg4, arg5);
	}

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)V")
	public static void method2020(@OriginalArg(0) int arg0) {
		anIntArray276[anInt2269++] = arg0;
		Static283.aGL1.glBindFramebufferEXT(36160, arg0);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(FFFFFFII)V")
	public static void method2021(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(1) GL local1 = Static283.aGL1;
		local1.glMatrixMode(5889);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glOrtho((double) arg0, (double) arg1, (double) arg2, (double) arg3, (double) arg4, (double) arg5);
		local1.glMatrixMode(5888);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glGetIntegerv(2978, anIntArray277, 0);
		local1.glViewport(0, 0, arg6, arg7);
	}
}
