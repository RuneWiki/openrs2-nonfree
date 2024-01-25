import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!afa", name = "O", descriptor = "Lclient!fga;")
	public static final Class108 aClass108_4 = new Class108();

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(ILclient!eea;[BI)Lclient!ib;")
	public static Class154 method283(@OriginalArg(1) Class87_Sub1_Sub1 arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null || arg1.length == 0) {
			return null;
		}
		@Pc(21) long local21 = OpenGL.glCreateShaderObjectARB(arg2);
		OpenGL.glShaderSourceRawARB(local21, arg1);
		OpenGL.glCompileShaderARB(local21);
		OpenGL.glGetObjectParameterivARB(local21, 35713, Static479.anIntArray693, 0);
		if (Static479.anIntArray693[0] == 0) {
			if (Static479.anIntArray693[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local21, 35716, Static479.anIntArray693, 1);
			if (Static479.anIntArray693[1] > 1) {
				@Pc(57) byte[] local57 = new byte[Static479.anIntArray693[1]];
				OpenGL.glGetInfoLogARB(local21, Static479.anIntArray693[1], Static479.anIntArray693, 0, local57, 0);
				System.out.println(new String(local57));
			}
			if (Static479.anIntArray693[0] == 0) {
				OpenGL.glDeleteObjectARB(local21);
				return null;
			}
		}
		return new Class154(arg0, local21, arg2);
	}
}
