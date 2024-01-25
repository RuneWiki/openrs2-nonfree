import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static509 {

	@OriginalMember(owner = "client!rca", name = "i", descriptor = "[I")
	public static final int[] anIntArray546 = new int[] { 1, 4, 1, 2 };

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "([BLclient!oia;II)Lclient!wja;")
	public static Class391 method7192(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class16_Sub1_Sub2 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null || arg0.length == 0) {
			return null;
		}
		@Pc(18) long local18 = OpenGL.glCreateShaderObjectARB(arg2);
		OpenGL.glShaderSourceRawARB(local18, arg0);
		OpenGL.glCompileShaderARB(local18);
		OpenGL.glGetObjectParameterivARB(local18, 35713, Static535.anIntArray562, 0);
		if (Static535.anIntArray562[0] == 0) {
			if (Static535.anIntArray562[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local18, 35716, Static535.anIntArray562, 1);
			if (Static535.anIntArray562[1] > 1) {
				@Pc(59) byte[] local59 = new byte[Static535.anIntArray562[1]];
				OpenGL.glGetInfoLogARB(local18, Static535.anIntArray562[1], Static535.anIntArray562, 0, local59, 0);
				System.out.println(new String(local59));
			}
			if (Static535.anIntArray562[0] == 0) {
				OpenGL.glDeleteObjectARB(local18);
				return null;
			}
		}
		return new Class391(arg1, local18, arg2);
	}
}
