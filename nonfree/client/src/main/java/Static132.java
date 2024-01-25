import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
	public static int anInt2647 = 0;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IILclient!jc;[B)Lclient!kga;")
	public static Class195 method2372(@OriginalArg(0) int arg0, @OriginalArg(2) Class65_Sub2_Sub2 arg1, @OriginalArg(3) byte[] arg2) {
		if (arg2 == null || arg2.length == 0) {
			return null;
		}
		@Pc(18) long local18 = OpenGL.glCreateShaderObjectARB(arg0);
		OpenGL.glShaderSourceRawARB(local18, arg2);
		OpenGL.glCompileShaderARB(local18);
		OpenGL.glGetObjectParameterivARB(local18, 35713, Static370.anIntArray482, 0);
		if (Static370.anIntArray482[0] == 0) {
			if (Static370.anIntArray482[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local18, 35716, Static370.anIntArray482, 1);
			if (Static370.anIntArray482[1] > 1) {
				@Pc(57) byte[] local57 = new byte[Static370.anIntArray482[1]];
				OpenGL.glGetInfoLogARB(local18, Static370.anIntArray482[1], Static370.anIntArray482, 0, local57, 0);
				System.out.println(new String(local57));
			}
			if (Static370.anIntArray482[0] == 0) {
				OpenGL.glDeleteObjectARB(local18);
				return null;
			}
		}
		return new Class195(arg1, local18, arg0);
	}
}
