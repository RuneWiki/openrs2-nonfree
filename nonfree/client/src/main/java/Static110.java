import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "I")
	public static int anInt2172;

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IIIIII)V")
	public static void method1922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(16) int local16 = arg0 + 1;
		Static583.method7816(Static158.anIntArrayArray66[arg0], arg4, arg2, arg3);
		@Pc(25) int local25 = arg1 - 1;
		Static583.method7816(Static158.anIntArrayArray66[arg1], arg4, arg2, arg3);
		for (@Pc(33) int local33 = local16; local33 <= local25; local33++) {
			@Pc(39) int[] local39 = Static158.anIntArrayArray66[local33];
			local39[arg2] = local39[arg3] = arg4;
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Lclient!mr;I[BI)Lclient!si;")
	public static Class311 method1923(@OriginalArg(0) Class45_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg1);
		OpenGL.glShaderSourceRawARB(local6, arg2);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static241.anIntArray228, 0);
		if (Static241.anIntArray228[0] == 0) {
			if (Static241.anIntArray228[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static241.anIntArray228, 1);
			if (Static241.anIntArray228[1] > 1) {
				@Pc(43) byte[] local43 = new byte[Static241.anIntArray228[1]];
				OpenGL.glGetInfoLogARB(local6, Static241.anIntArray228[1], Static241.anIntArray228, 0, local43, 0);
				System.out.println(new String(local43));
			}
			if (Static241.anIntArray228[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class311(arg0, local6, arg1);
	}
}
