import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static593 {

	@OriginalMember(owner = "client!uba", name = "I", descriptor = "Lclient!wia;")
	public static Class386 aClass386_123;

	@OriginalMember(owner = "client!uba", name = "L", descriptor = "I")
	public static int anInt10137 = 0;

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "([BBLclient!ko;I)Lclient!ec;")
	public static Class82 method8427(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class137_Sub1_Sub1 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null || arg0.length == 0) {
			return null;
		}
		@Pc(13) long local13 = OpenGL.glCreateShaderObjectARB(arg2);
		OpenGL.glShaderSourceRawARB(local13, arg0);
		OpenGL.glCompileShaderARB(local13);
		OpenGL.glGetObjectParameterivARB(local13, 35713, Static366.anIntArray491, 0);
		if (Static366.anIntArray491[0] == 0) {
			if (Static366.anIntArray491[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local13, 35716, Static366.anIntArray491, 1);
			if (Static366.anIntArray491[1] > 1) {
				@Pc(49) byte[] local49 = new byte[Static366.anIntArray491[1]];
				OpenGL.glGetInfoLogARB(local13, Static366.anIntArray491[1], Static366.anIntArray491, 0, local49, 0);
				System.out.println(new String(local49));
			}
			if (Static366.anIntArray491[0] == 0) {
				OpenGL.glDeleteObjectARB(local13);
				return null;
			}
		}
		return new Class82(arg1, local13, arg2);
	}
}
