import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "[I")
	private static int[] anIntArray47 = new int[4];

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "[I")
	private static int[] anIntArray48 = new int[1];

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
	private static int anInt537 = 0;

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "[I")
	private static int[] anIntArray49 = new int[4];

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "()V")
	public static void method446() {
		@Pc(1) GL local1 = Static178.aGL1;
		local1.glMatrixMode(5889);
		local1.glPopMatrix();
		local1.glMatrixMode(5888);
		local1.glPopMatrix();
		local1.glViewport(anIntArray49[0], anIntArray49[1], anIntArray49[2], anIntArray49[3]);
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "()I")
	public static int method447() {
		Static178.aGL1.glGenRenderbuffersEXT(1, anIntArray48, 0);
		return anIntArray48[0];
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
	public static void method448(@OriginalArg(0) int arg0) {
		anIntArray48[0] = arg0;
		Static178.aGL1.glDeleteFramebuffersEXT(1, anIntArray48, 0);
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "()Z")
	public static boolean method449() {
		@Pc(1) GL local1 = Static178.aGL1;
		@Pc(5) int local5 = local1.glCheckFramebufferStatusEXT(36160);
		return local5 == 36053;
	}

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "()V")
	public static void method450() {
		Static178.aGL1.glBindFramebufferEXT(36160, --anInt537 > 0 ? anIntArray47[anInt537 - 1] : 0);
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
	public static void method451(@OriginalArg(0) int arg0) {
		anIntArray47[anInt537++] = arg0;
		Static178.aGL1.glBindFramebufferEXT(36160, arg0);
	}

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "()I")
	public static int method452() {
		Static178.aGL1.glGenFramebuffersEXT(1, anIntArray48, 0);
		return anIntArray48[0];
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(FFFFFFII)V")
	public static void method453(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(1) GL local1 = Static178.aGL1;
		local1.glMatrixMode(5889);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glOrtho((double) arg0, (double) arg1, (double) arg2, (double) arg3, (double) arg4, (double) arg5);
		local1.glMatrixMode(5888);
		local1.glPushMatrix();
		local1.glLoadIdentity();
		local1.glGetIntegerv(2978, anIntArray49, 0);
		local1.glViewport(0, 0, arg6, arg7);
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)V")
	public static void method454(@OriginalArg(0) int arg0) {
		anIntArray48[0] = arg0;
		Static178.aGL1.glDeleteRenderbuffersEXT(1, anIntArray48, 0);
	}

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "()V")
	public static void method455() {
		anIntArray48 = null;
		anIntArray49 = null;
		anIntArray47 = null;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(FFFFII)V")
	public static void method456(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		method453(arg0, arg1, arg2, arg3, -1.0F, 1.0F, arg4, arg5);
	}
}
