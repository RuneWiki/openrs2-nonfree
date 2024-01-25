import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "[I")
	private static final int[] anIntArray225 = new int[2];

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!ic;ILjava/lang/String;)Lclient!hr;")
	public static Class101 method2380(@OriginalArg(0) Class48_Sub2 arg0, @OriginalArg(2) String arg1) {
		@Pc(2) opengl local2 = arg0.anOpengl2;
		@Pc(6) int local6 = local2.glCreateShaderObjectARB(35632);
		local2.glShaderSourceARB(local6, 1, new String[] { arg1 }, new int[] { arg1.length() }, 0);
		local2.glCompileShaderARB(local6);
		local2.glGetObjectParameterivARB(local6, 35713, anIntArray225, 0);
		if (anIntArray225[0] == 0) {
			if (anIntArray225[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			local2.glGetObjectParameterivARB(local6, 35716, anIntArray225, 1);
			if (anIntArray225[1] > 1) {
				@Pc(60) byte[] local60 = new byte[anIntArray225[1]];
				local2.glGetInfoLogARB(local6, anIntArray225[1], anIntArray225, 0, local60, 0);
				System.out.println(new String(local60));
			}
			if (anIntArray225[0] == 0) {
				local2.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class101(arg0, local6, 35632);
	}
}
