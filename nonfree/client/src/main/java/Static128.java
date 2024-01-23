import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!jg", name = "A", descriptor = "Lclient!nb;")
	public static Class111 aClass111_8 = new Class111(4);

	@OriginalMember(owner = "client!jg", name = "E", descriptor = "[I")
	public static int[] anIntArray217 = null;

	@OriginalMember(owner = "client!jg", name = "F", descriptor = "[F")
	public static float[] aFloatArray16 = new float[4];

	@OriginalMember(owner = "client!jg", name = "G", descriptor = "[I")
	public static int[] anIntArray218 = new int[4];

	@OriginalMember(owner = "client!jg", name = "H", descriptor = "I")
	public static int anInt2569 = -1;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lgl!javax/media/opengl/GL;IIII)Z")
	public static boolean method2089(@OriginalArg(0) GL arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static251.method3892(arg4);
		arg0.glFramebufferTexture2DEXT(36160, 36064, arg2, arg1, 0);
		arg0.glReadBuffer(36064);
		@Pc(15) int local15 = arg0.glCheckFramebufferStatusEXT(36160);
		if (local15 == 36053) {
			arg0.glCopyTexImage2D(3553, 0, 6407, 0, 0, arg3, arg3, 0);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIII)Lclient!jg;")
	public static Class4_Sub2_Sub11 method2090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(29) long local29 = (long) arg0 * 67481L ^ (long) arg1 * 97549L ^ (long) arg2 * 475427L ^ (long) arg3 * 986053L ^ (long) arg4 * 32147369L ^ (long) arg5 * 76724863L;
		@Pc(35) Class4_Sub2_Sub11 local35 = (Class4_Sub2_Sub11) aClass111_8.method2890(local29);
		if (local35 == null) {
			local35 = new Class4_Sub2_Sub11(arg0, arg1, arg2, arg3, arg4, arg5);
			aClass111_8.method2886(local29, local35);
			return local35;
		} else {
			return local35;
		}
	}
}
