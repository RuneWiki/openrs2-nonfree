import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!of", name = "w", descriptor = "Lclient!g;")
	public static Class58 aClass58_12 = new Class58(4);

	@OriginalMember(owner = "client!of", name = "z", descriptor = "[I")
	public static int[] anIntArray321 = null;

	@OriginalMember(owner = "client!of", name = "A", descriptor = "[I")
	public static int[] anIntArray322 = new int[4];

	@OriginalMember(owner = "client!of", name = "B", descriptor = "I")
	public static int anInt3984 = -1;

	@OriginalMember(owner = "client!of", name = "C", descriptor = "[F")
	public static float[] aFloatArray26 = new float[4];

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIII)Lclient!of;")
	public static Class1_Sub1_Sub16 method3199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(29) long local29 = (long) arg0 * 67481L ^ (long) arg1 * 97549L ^ (long) arg2 * 475427L ^ (long) arg3 * 986053L ^ (long) arg4 * 32147369L ^ (long) arg5 * 76724863L;
		@Pc(35) Class1_Sub1_Sub16 local35 = (Class1_Sub1_Sub16) aClass58_12.method1233(local29);
		if (local35 == null) {
			local35 = new Class1_Sub1_Sub16(arg0, arg1, arg2, arg3, arg4, arg5);
			aClass58_12.method1229(local29, local35);
			return local35;
		} else {
			return local35;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lgl!javax/media/opengl/GL;IIII)Z")
	public static boolean method3203(@OriginalArg(0) GL arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static291.method4310(arg4);
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
}
