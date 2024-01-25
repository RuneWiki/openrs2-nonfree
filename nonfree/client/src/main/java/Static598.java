import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static598 {

	@OriginalMember(owner = "client!vd", name = "o", descriptor = "Lclient!pd;")
	public static final Class250 aClass250_15 = new Class250(1);

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "([BIILclient!no;)Lclient!fk;")
	public static Class102 method8398(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class100_Sub1_Sub2 arg2) {
		if (arg0 == null || arg0.length == 0) {
			return null;
		}
		@Pc(13) long local13 = OpenGL.glCreateShaderObjectARB(arg1);
		OpenGL.glShaderSourceRawARB(local13, arg0);
		OpenGL.glCompileShaderARB(local13);
		OpenGL.glGetObjectParameterivARB(local13, 35713, Static293.anIntArray351, 0);
		if (Static293.anIntArray351[0] == 0) {
			if (Static293.anIntArray351[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local13, 35716, Static293.anIntArray351, 1);
			if (Static293.anIntArray351[1] > 1) {
				@Pc(52) byte[] local52 = new byte[Static293.anIntArray351[1]];
				OpenGL.glGetInfoLogARB(local13, Static293.anIntArray351[1], Static293.anIntArray351, 0, local52, 0);
				System.out.println(new String(local52));
			}
			if (Static293.anIntArray351[0] == 0) {
				OpenGL.glDeleteObjectARB(local13);
				return null;
			}
		}
		return new Class102(arg2, local13, arg1);
	}
}
