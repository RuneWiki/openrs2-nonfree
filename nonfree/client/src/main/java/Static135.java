import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!kj", name = "H", descriptor = "Lclient!fa;")
	public static Class53 aClass53_2 = new Class53(4);

	@OriginalMember(owner = "client!kj", name = "L", descriptor = "I")
	public static int anInt2762 = -1;

	@OriginalMember(owner = "client!kj", name = "M", descriptor = "[F")
	public static float[] aFloatArray19 = new float[4];

	@OriginalMember(owner = "client!kj", name = "N", descriptor = "[I")
	public static int[] anIntArray206 = new int[4];

	@OriginalMember(owner = "client!kj", name = "O", descriptor = "[I")
	public static int[] anIntArray207 = null;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIIII)Lclient!kj;")
	public static Class2_Sub3_Sub12 method2348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(29) long local29 = (long) arg0 * 67481L ^ (long) arg1 * 97549L ^ (long) arg2 * 475427L ^ (long) arg3 * 986053L ^ (long) arg4 * 32147369L ^ (long) arg5 * 76724863L;
		@Pc(35) Class2_Sub3_Sub12 local35 = (Class2_Sub3_Sub12) aClass53_2.method1254(local29);
		if (local35 == null) {
			local35 = new Class2_Sub3_Sub12(arg0, arg1, arg2, arg3, arg4, arg5);
			aClass53_2.method1258(local29, local35);
			return local35;
		} else {
			return local35;
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lgl!javax/media/opengl/GL;IIII)Z")
	public static boolean method2349(@OriginalArg(0) GL arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static60.method1157(arg4);
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
