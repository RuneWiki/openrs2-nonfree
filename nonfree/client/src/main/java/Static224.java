import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!hp", name = "I", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_56 = new Class289(67, 0);

	@OriginalMember(owner = "client!hp", name = "L", descriptor = "[I")
	public static final int[] anIntArray215 = new int[2048];

	@OriginalMember(owner = "client!hp", name = "P", descriptor = "[Z")
	public static final boolean[] aBooleanArray12 = new boolean[100];

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(DB)V")
	public static void method3271(@OriginalArg(0) double arg0) {
		Static621.aClass207_37.method8211(Static467.aClass207_29);
		Static621.aClass207_37.method8209(0, 0, (int) arg0);
		Static367.aClass132_7.method7517(Static621.aClass207_37);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!oaa;I[BI)Lclient!eca;")
	public static Class78 method3272(@OriginalArg(0) Class132_Sub1_Sub1 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg1 == null) {
			return null;
		}
		@Pc(14) int local14 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local14);
		OpenGL.glProgramRawARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static16.anIntArray14, 0);
		if (Static16.anIntArray14[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class78(arg0, 34336, local14);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(BI)Z")
	public static boolean method3273(@OriginalArg(1) int arg0) {
		return arg0 == 4 || arg0 == 8 || arg0 == 11;
	}
}
