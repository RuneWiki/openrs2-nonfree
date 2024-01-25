import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "Lclient!wt;")
	public static Class392 aClass392_1;

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!lf;BILjava/lang/String;)Lclient!mja;")
	public static Class232 method5599(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(11) long local11 = OpenGL.glCreateShaderObjectARB(arg1);
		OpenGL.glShaderSourceARB(local11, arg2);
		OpenGL.glCompileShaderARB(local11);
		OpenGL.glGetObjectParameterivARB(local11, 35713, Static495.anIntArray422, 0);
		if (Static495.anIntArray422[0] == 0) {
			if (Static495.anIntArray422[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local11, 35716, Static495.anIntArray422, 1);
			if (Static495.anIntArray422[1] > 1) {
				@Pc(52) byte[] local52 = new byte[Static495.anIntArray422[1]];
				OpenGL.glGetInfoLogARB(local11, Static495.anIntArray422[1], Static495.anIntArray422, 0, local52, 0);
				System.out.println(new String(local52));
			}
			if (Static495.anIntArray422[0] == 0) {
				OpenGL.glDeleteObjectARB(local11);
				return null;
			}
		}
		return new Class232(arg0, local11, arg1);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)I")
	public static int method5601() {
		@Pc(10) Class295 local10 = Static324.aClass295_30;
		synchronized (Static324.aClass295_30) {
			return Static324.aClass295_30.method6461();
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)I")
	public static int method5602(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
