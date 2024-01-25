import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!jd", name = "x", descriptor = "Lclient!di;")
	public static final Class54 aClass54_107 = new Class54(73, 16);

	@OriginalMember(owner = "client!jd", name = "z", descriptor = "Z")
	public static boolean aBoolean480 = false;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)Z")
	public static boolean method5736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static2.method68(arg1, arg0) || Static117.method2084(arg1, arg0);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!ef;IILjava/lang/String;)Lclient!ji;")
	public static Class130 method5745(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		@Pc(11) long local11 = OpenGL.glCreateShaderObjectARB(arg1);
		OpenGL.glShaderSourceARB(local11, arg2);
		OpenGL.glCompileShaderARB(local11);
		OpenGL.glGetObjectParameterivARB(local11, 35713, Static38.anIntArray541, 0);
		if (Static38.anIntArray541[0] == 0) {
			if (Static38.anIntArray541[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local11, 35716, Static38.anIntArray541, 1);
			if (Static38.anIntArray541[1] > 1) {
				@Pc(49) byte[] local49 = new byte[Static38.anIntArray541[1]];
				OpenGL.glGetInfoLogARB(local11, Static38.anIntArray541[1], Static38.anIntArray541, 0, local49, 0);
				System.out.println(new String(local49));
			}
			if (Static38.anIntArray541[0] == 0) {
				OpenGL.glDeleteObjectARB(local11);
				return null;
			}
		}
		return new Class130(arg0, local11, arg1);
	}
}
