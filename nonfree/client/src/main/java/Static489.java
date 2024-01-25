import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static489 {

	@OriginalMember(owner = "client!qo", name = "G", descriptor = "I")
	public static int anInt8756;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IILclient!qfa;Ljava/lang/String;)Lclient!mv;")
	public static Class237 method7252(@OriginalArg(1) int arg0, @OriginalArg(2) Class137_Sub3 arg1, @OriginalArg(3) String arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg0);
		OpenGL.glShaderSourceARB(local6, arg2);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static112.anIntArray176, 0);
		if (Static112.anIntArray176[0] == 0) {
			if (Static112.anIntArray176[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static112.anIntArray176, 1);
			if (Static112.anIntArray176[1] > 1) {
				@Pc(58) byte[] local58 = new byte[Static112.anIntArray176[1]];
				OpenGL.glGetInfoLogARB(local6, Static112.anIntArray176[1], Static112.anIntArray176, 0, local58, 0);
				System.out.println(new String(local58));
			}
			if (Static112.anIntArray176[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class237(arg1, local6, arg0);
	}
}
