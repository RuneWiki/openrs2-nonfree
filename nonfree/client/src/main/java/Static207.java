import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "[I")
	private static final int[] anIntArray347 = new int[2];

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!se;ILjava/lang/String;)Lclient!ne;")
	public static Class141 method3582(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(2) opengl local2 = arg0.anOpengl2;
		@Pc(6) int local6 = local2.glCreateShaderObjectARB(arg1);
		local2.glShaderSourceARB(local6, 1, new String[] { arg2 }, new int[] { arg2.length() }, 0);
		local2.glCompileShaderARB(local6);
		local2.glGetObjectParameterivARB(local6, 35713, anIntArray347, 0);
		if (anIntArray347[0] == 0) {
			if (anIntArray347[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			local2.glGetObjectParameterivARB(local6, 35716, anIntArray347, 1);
			if (anIntArray347[1] > 1) {
				@Pc(60) byte[] local60 = new byte[anIntArray347[1]];
				local2.glGetInfoLogARB(local6, anIntArray347[1], anIntArray347, 0, local60, 0);
				System.out.println(new String(local60));
			}
			if (anIntArray347[0] == 0) {
				local2.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class141(arg0, local6, arg1);
	}
}
