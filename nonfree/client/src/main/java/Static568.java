import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static568 {

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "F")
	public static float aFloat195;

	@OriginalMember(owner = "client!wfa", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString113 = null;

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(Ljava/lang/String;IBLclient!ap;)Lclient!dl;")
	public static Class72 method8021(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class9_Sub2 arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg1);
		OpenGL.glShaderSourceARB(local6, arg0);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static272.anIntArray395, 0);
		if (Static272.anIntArray395[0] == 0) {
			if (Static272.anIntArray395[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static272.anIntArray395, 1);
			if (Static272.anIntArray395[1] > 1) {
				@Pc(55) byte[] local55 = new byte[Static272.anIntArray395[1]];
				OpenGL.glGetInfoLogARB(local6, Static272.anIntArray395[1], Static272.anIntArray395, 0, local55, 0);
				System.out.println(new String(local55));
			}
			if (Static272.anIntArray395[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class72(arg2, local6, arg1);
	}
}
