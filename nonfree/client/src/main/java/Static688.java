import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static688 {

	@OriginalMember(owner = "client!wv", name = "V", descriptor = "Lclient!ui;")
	public static final Class359 aClass359_70 = new Class359(20);

	@OriginalMember(owner = "client!wv", name = "R", descriptor = "Lclient!ui;")
	public static final Class359 aClass359_71 = new Class359(4);

	@OriginalMember(owner = "client!wv", name = "S", descriptor = "I")
	public static int anInt10535 = 0;

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lclient!dga;II[B)Lclient!fb;")
	public static Class108 method9043(@OriginalArg(0) Class75_Sub1_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		if (arg2 == null || arg2.length == 0) {
			return null;
		}
		@Pc(23) long local23 = OpenGL.glCreateShaderObjectARB(arg1);
		OpenGL.glShaderSourceRawARB(local23, arg2);
		OpenGL.glCompileShaderARB(local23);
		OpenGL.glGetObjectParameterivARB(local23, 35713, Static415.anIntArray460, 0);
		if (Static415.anIntArray460[0] == 0) {
			if (Static415.anIntArray460[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local23, 35716, Static415.anIntArray460, 1);
			if (Static415.anIntArray460[1] > 1) {
				@Pc(71) byte[] local71 = new byte[Static415.anIntArray460[1]];
				OpenGL.glGetInfoLogARB(local23, Static415.anIntArray460[1], Static415.anIntArray460, 0, local71, 0);
				System.out.println(new String(local71));
			}
			if (Static415.anIntArray460[0] == 0) {
				OpenGL.glDeleteObjectARB(local23);
				return null;
			}
		}
		return new Class108(arg0, local23, arg1);
	}
}
