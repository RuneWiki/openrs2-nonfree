import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!kr", name = "A", descriptor = "Lclient!ko;")
	public static final Class142 aClass142_21 = new Class142();

	@OriginalMember(owner = "client!kr", name = "F", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_198 = new Class12(20, 8);

	@OriginalMember(owner = "client!kr", name = "J", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_199 = new Class12(49, -1);

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IILclient!qg;Ljava/lang/String;)Lclient!we;")
	public static Class259 method3232(@OriginalArg(1) int arg0, @OriginalArg(2) Class121_Sub2 arg1, @OriginalArg(3) String arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg0);
		OpenGL.glShaderSourceARB(local6, arg2);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static299.anIntArray381, 0);
		if (Static299.anIntArray381[0] == 0) {
			if (Static299.anIntArray381[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static299.anIntArray381, 1);
			if (Static299.anIntArray381[1] > 1) {
				@Pc(50) byte[] local50 = new byte[Static299.anIntArray381[1]];
				OpenGL.glGetInfoLogARB(local6, Static299.anIntArray381[1], Static299.anIntArray381, 0, local50, 0);
				System.out.println(new String(local50));
			}
			if (Static299.anIntArray381[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class259(arg1, local6, arg0);
	}
}
