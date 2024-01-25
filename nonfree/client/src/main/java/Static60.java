import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "[I")
	private static final int[] anIntArray167 = new int[2];

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lclient!h;ILjava/lang/String;)Lclient!dr;")
	public static Class46 method1515(@OriginalArg(0) Class32_Sub2 arg0, @OriginalArg(2) String arg1) {
		@Pc(2) opengl local2 = arg0.anOpengl2;
		@Pc(6) int local6 = local2.glCreateShaderObjectARB(35632);
		local2.glShaderSourceARB(local6, 1, new String[] { arg1 }, new int[] { arg1.length() }, 0);
		local2.glCompileShaderARB(local6);
		local2.glGetObjectParameterivARB(local6, 35713, anIntArray167, 0);
		if (anIntArray167[0] == 0) {
			if (anIntArray167[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			local2.glGetObjectParameterivARB(local6, 35716, anIntArray167, 1);
			if (anIntArray167[1] > 1) {
				@Pc(60) byte[] local60 = new byte[anIntArray167[1]];
				local2.glGetInfoLogARB(local6, anIntArray167[1], anIntArray167, 0, local60, 0);
				System.out.println(new String(local60));
			}
			if (anIntArray167[0] == 0) {
				local2.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class46(arg0, local6, 35632);
	}
}
