import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!i", name = "b", descriptor = "[I")
	private static final int[] anIntArray162 = new int[2];

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!tb;ILjava/lang/String;)Lclient!i;")
	public static Class99 method1901(@OriginalArg(0) Class129_Sub2 arg0, @OriginalArg(2) String arg1) {
		@Pc(2) opengl local2 = arg0.anOpengl2;
		@Pc(6) int local6 = local2.glCreateShaderObjectARB(35632);
		local2.glShaderSourceARB(local6, 1, new String[] { arg1 }, new int[] { arg1.length() }, 0);
		local2.glCompileShaderARB(local6);
		local2.glGetObjectParameterivARB(local6, 35713, anIntArray162, 0);
		if (anIntArray162[0] == 0) {
			if (anIntArray162[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			local2.glGetObjectParameterivARB(local6, 35716, anIntArray162, 1);
			if (anIntArray162[1] > 1) {
				@Pc(60) byte[] local60 = new byte[anIntArray162[1]];
				local2.glGetInfoLogARB(local6, anIntArray162[1], anIntArray162, 0, local60, 0);
				System.out.println(new String(local60));
			}
			if (anIntArray162[0] == 0) {
				local2.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class99(arg0, local6, 35632);
	}
}
