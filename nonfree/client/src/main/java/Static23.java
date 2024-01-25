import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "[I")
	private static final int[] anIntArray23 = new int[2];

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!nf;ILjava/lang/String;)Lclient!bf;")
	public static Class21 method399(@OriginalArg(0) Class105_Sub1 arg0, @OriginalArg(2) String arg1) {
		@Pc(2) opengl local2 = arg0.anOpengl1;
		@Pc(6) int local6 = local2.glCreateShaderObjectARB(35632);
		local2.glShaderSourceARB(local6, 1, new String[] { arg1 }, new int[] { arg1.length() }, 0);
		local2.glCompileShaderARB(local6);
		local2.glGetObjectParameterivARB(local6, 35713, anIntArray23, 0);
		if (anIntArray23[0] == 0) {
			if (anIntArray23[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			local2.glGetObjectParameterivARB(local6, 35716, anIntArray23, 1);
			if (anIntArray23[1] > 1) {
				@Pc(60) byte[] local60 = new byte[anIntArray23[1]];
				local2.glGetInfoLogARB(local6, anIntArray23[1], anIntArray23, 0, local60, 0);
				System.out.println(new String(local60));
			}
			if (anIntArray23[0] == 0) {
				local2.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class21(arg0, local6, 35632);
	}
}
