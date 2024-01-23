import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!qh", name = "z", descriptor = "Lclient!mi;")
	public static Class112 aClass112_11 = new Class112(4);

	@OriginalMember(owner = "client!qh", name = "F", descriptor = "[F")
	public static float[] aFloatArray29 = new float[4];

	@OriginalMember(owner = "client!qh", name = "I", descriptor = "I")
	public static int anInt4265 = -1;

	@OriginalMember(owner = "client!qh", name = "J", descriptor = "[I")
	public static int[] anIntArray478 = new int[4];

	@OriginalMember(owner = "client!qh", name = "K", descriptor = "[I")
	public static int[] anIntArray479 = null;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIII)Lclient!qh;")
	public static Class1_Sub5_Sub18 method3647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(29) long local29 = (long) arg0 * 67481L ^ (long) arg1 * 97549L ^ (long) arg2 * 475427L ^ (long) arg3 * 986053L ^ (long) arg4 * 32147369L ^ (long) arg5 * 76724863L;
		@Pc(35) Class1_Sub5_Sub18 local35 = (Class1_Sub5_Sub18) aClass112_11.method2951(local29);
		if (local35 == null) {
			local35 = new Class1_Sub5_Sub18(arg0, arg1, arg2, arg3, arg4, arg5);
			aClass112_11.method2950(local29, local35);
			return local35;
		} else {
			return local35;
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lgl!javax/media/opengl/GL;IIII)Z")
	public static boolean method3649(@OriginalArg(0) GL arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static71.method1400(arg4);
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
