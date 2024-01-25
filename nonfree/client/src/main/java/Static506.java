import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static506 {

	@OriginalMember(owner = "client!pn", name = "f", descriptor = "I")
	public static int anInt8059;

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!vaa;II[B)Lclient!qp;")
	public static Class315 method6895(@OriginalArg(0) Class22_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		if (arg2 == null || arg2.length == 0) {
			return null;
		}
		@Pc(16) long local16 = OpenGL.glCreateShaderObjectARB(arg1);
		OpenGL.glShaderSourceRawARB(local16, arg2);
		OpenGL.glCompileShaderARB(local16);
		OpenGL.glGetObjectParameterivARB(local16, 35713, Static606.anIntArray662, 0);
		if (Static606.anIntArray662[0] == 0) {
			if (Static606.anIntArray662[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local16, 35716, Static606.anIntArray662, 1);
			if (Static606.anIntArray662[1] > 1) {
				@Pc(64) byte[] local64 = new byte[Static606.anIntArray662[1]];
				OpenGL.glGetInfoLogARB(local16, Static606.anIntArray662[1], Static606.anIntArray662, 0, local64, 0);
				System.out.println(new String(local64));
			}
			if (Static606.anIntArray662[0] == 0) {
				OpenGL.glDeleteObjectARB(local16);
				return null;
			}
		}
		return new Class315(arg0, local16, arg1);
	}
}
