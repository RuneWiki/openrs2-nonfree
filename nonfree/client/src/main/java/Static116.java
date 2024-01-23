import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!ib", name = "y", descriptor = "Lclient!dj;")
	public static Class40 aClass40_11 = new Class40(4);

	@OriginalMember(owner = "client!ib", name = "A", descriptor = "[I")
	public static int[] anIntArray194 = null;

	@OriginalMember(owner = "client!ib", name = "D", descriptor = "[I")
	public static int[] anIntArray195 = new int[4];

	@OriginalMember(owner = "client!ib", name = "E", descriptor = "I")
	public static int anInt2322 = -1;

	@OriginalMember(owner = "client!ib", name = "H", descriptor = "[F")
	public static float[] aFloatArray23 = new float[4];

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lgl!javax/media/opengl/GL;IIII)Z")
	public static boolean method1838(@OriginalArg(0) GL arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static94.method1600(arg4);
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

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(IIIIII)Lclient!ib;")
	public static Class4_Sub3_Sub10 method1839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(29) long local29 = (long) arg0 * 67481L ^ (long) arg1 * 97549L ^ (long) arg2 * 475427L ^ (long) arg3 * 986053L ^ (long) arg4 * 32147369L ^ (long) arg5 * 76724863L;
		@Pc(35) Class4_Sub3_Sub10 local35 = (Class4_Sub3_Sub10) aClass40_11.method889(local29);
		if (local35 == null) {
			local35 = new Class4_Sub3_Sub10(arg0, arg1, arg2, arg3, arg4, arg5);
			aClass40_11.method888(local29, local35);
			return local35;
		} else {
			return local35;
		}
	}
}
