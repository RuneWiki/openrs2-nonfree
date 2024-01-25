import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "[I")
	private static final int[] anIntArray154 = new int[2];

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!hj;ILjava/lang/String;)Lclient!dk;")
	public static Class40 method1326(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(2) String arg1) {
		@Pc(2) opengl local2 = arg0.anOpengl1;
		@Pc(6) int local6 = local2.glCreateShaderObjectARB(35632);
		local2.glShaderSourceARB(local6, 1, new String[] { arg1 }, new int[] { arg1.length() }, 0);
		local2.glCompileShaderARB(local6);
		local2.glGetObjectParameterivARB(local6, 35713, anIntArray154, 0);
		if (anIntArray154[0] == 0) {
			if (anIntArray154[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			local2.glGetObjectParameterivARB(local6, 35716, anIntArray154, 1);
			if (anIntArray154[1] > 1) {
				@Pc(60) byte[] local60 = new byte[anIntArray154[1]];
				local2.glGetInfoLogARB(local6, anIntArray154[1], anIntArray154, 0, local60, 0);
				System.out.println(new String(local60));
			}
			if (anIntArray154[0] == 0) {
				local2.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class40(arg0, local6, 35632);
	}
}
