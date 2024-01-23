import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!dc", name = "z", descriptor = "Lclient!fm;")
	public static Class49 aClass49_3 = new Class49(4);

	@OriginalMember(owner = "client!dc", name = "B", descriptor = "[I")
	public static int[] anIntArray93 = new int[4];

	@OriginalMember(owner = "client!dc", name = "C", descriptor = "[F")
	public static float[] aFloatArray6 = new float[4];

	@OriginalMember(owner = "client!dc", name = "D", descriptor = "[I")
	public static int[] anIntArray94 = null;

	@OriginalMember(owner = "client!dc", name = "F", descriptor = "I")
	public static int anInt1050 = -1;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lgl!javax/media/opengl/GL;IIII)Z")
	public static boolean method860(@OriginalArg(0) GL arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static277.method4212(arg4);
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

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(IIIIII)Lclient!dc;")
	public static Class1_Sub2_Sub7 method861(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(29) long local29 = (long) arg0 * 67481L ^ (long) arg1 * 97549L ^ (long) arg2 * 475427L ^ (long) arg3 * 986053L ^ (long) arg4 * 32147369L ^ (long) arg5 * 76724863L;
		@Pc(35) Class1_Sub2_Sub7 local35 = (Class1_Sub2_Sub7) aClass49_3.method1381(local29);
		if (local35 == null) {
			local35 = new Class1_Sub2_Sub7(arg0, arg1, arg2, arg3, arg4, arg5);
			aClass49_3.method1385(local35, local29);
			return local35;
		} else {
			return local35;
		}
	}
}
