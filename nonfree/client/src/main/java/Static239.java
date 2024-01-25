import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_67 = new Class186(22, 8);

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILclient!bl;ILjava/lang/String;)Lclient!uh;")
	public static Class243 method3725(@OriginalArg(0) int arg0, @OriginalArg(1) Class28_Sub1 arg1, @OriginalArg(3) String arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg0);
		OpenGL.glShaderSourceARB(local6, arg2);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static366.anIntArray539, 0);
		if (Static366.anIntArray539[0] == 0) {
			if (Static366.anIntArray539[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static366.anIntArray539, 1);
			if (Static366.anIntArray539[1] > 1) {
				@Pc(49) byte[] local49 = new byte[Static366.anIntArray539[1]];
				OpenGL.glGetInfoLogARB(local6, Static366.anIntArray539[1], Static366.anIntArray539, 0, local49, 0);
				System.out.println(new String(local49));
			}
			if (Static366.anIntArray539[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class243(arg1, local6, arg0);
	}
}
