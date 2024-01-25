import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static482 {

	@OriginalMember(owner = "client!sj", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString85;

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
	public static int anInt8150 = -1;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V")
	public static void method6632() {
		if (Static3.aClass11_1 != null) {
			Static3.aClass11_1.method6286();
		}
		if (Static35.aClass11_3 != null) {
			Static35.aClass11_3.method6286();
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Ljava/lang/String;ILclient!jaa;I)Lclient!hr;")
	public static Class137 method6640(@OriginalArg(0) String arg0, @OriginalArg(2) Class14_Sub3 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg2);
		OpenGL.glShaderSourceARB(local6, arg0);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static14.anIntArray31, 0);
		if (Static14.anIntArray31[0] == 0) {
			if (Static14.anIntArray31[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static14.anIntArray31, 1);
			if (Static14.anIntArray31[1] > 1) {
				@Pc(53) byte[] local53 = new byte[Static14.anIntArray31[1]];
				OpenGL.glGetInfoLogARB(local6, Static14.anIntArray31[1], Static14.anIntArray31, 0, local53, 0);
				System.out.println(new String(local53));
			}
			if (Static14.anIntArray31[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class137(arg1, local6, arg2);
	}
}
