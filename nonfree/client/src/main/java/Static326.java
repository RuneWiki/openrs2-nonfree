import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!laa", name = "E", descriptor = "Lclient!ee;")
	public static Class81 aClass81_7;

	@OriginalMember(owner = "client!laa", name = "A", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_216 = new Class179(115, 3);

	@OriginalMember(owner = "client!laa", name = "G", descriptor = "[I")
	public static final int[] anIntArray329 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(BILclient!oaa;[B)Lclient!su;")
	public static Class327 method4631(@OriginalArg(1) int arg0, @OriginalArg(2) Class132_Sub1_Sub1 arg1, @OriginalArg(3) byte[] arg2) {
		if (arg2 == null || arg2.length == 0) {
			return null;
		}
		@Pc(18) long local18 = OpenGL.glCreateShaderObjectARB(arg0);
		OpenGL.glShaderSourceRawARB(local18, arg2);
		OpenGL.glCompileShaderARB(local18);
		OpenGL.glGetObjectParameterivARB(local18, 35713, Static236.anIntArray252, 0);
		if (Static236.anIntArray252[0] == 0) {
			if (Static236.anIntArray252[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local18, 35716, Static236.anIntArray252, 1);
			if (Static236.anIntArray252[1] > 1) {
				@Pc(56) byte[] local56 = new byte[Static236.anIntArray252[1]];
				OpenGL.glGetInfoLogARB(local18, Static236.anIntArray252[1], Static236.anIntArray252, 0, local56, 0);
				System.out.println(new String(local56));
			}
			if (Static236.anIntArray252[0] == 0) {
				OpenGL.glDeleteObjectARB(local18);
				return null;
			}
		}
		return new Class327(arg1, local18, arg0);
	}
}
