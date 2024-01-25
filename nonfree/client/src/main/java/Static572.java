import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static572 {

	@OriginalMember(owner = "client!tea", name = "e", descriptor = "[I")
	public static int[] anIntArray632;

	@OriginalMember(owner = "client!tea", name = "g", descriptor = "Lclient!tha;")
	public static Class41 aClass41_1;

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(III)Lclient!et;")
	public static Class3_Sub1_Sub4 method7588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class73 local7 = Static267.aClass73ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass3_Sub1_Sub4_1;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(IILjava/lang/String;Lclient!pc;)Lclient!qba;")
	public static Class297 method7590(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class33_Sub3 arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg0);
		OpenGL.glShaderSourceARB(local6, arg1);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static13.anIntArray15, 0);
		if (Static13.anIntArray15[0] == 0) {
			if (Static13.anIntArray15[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static13.anIntArray15, 1);
			if (Static13.anIntArray15[1] > 1) {
				@Pc(50) byte[] local50 = new byte[Static13.anIntArray15[1]];
				OpenGL.glGetInfoLogARB(local6, Static13.anIntArray15[1], Static13.anIntArray15, 0, local50, 0);
				System.out.println(new String(local50));
			}
			if (Static13.anIntArray15[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class297(arg2, local6, arg0);
	}
}
