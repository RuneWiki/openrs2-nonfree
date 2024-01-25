import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!es", name = "a", descriptor = "[I")
	private static final int[] anIntArray192 = new int[2];

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Lclient!ao;ILjava/lang/String;)Lclient!es;")
	public static Class59 method1817(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(2) String arg1) {
		@Pc(2) opengl local2 = arg0.anOpengl1;
		@Pc(6) int local6 = local2.glCreateShaderObjectARB(35632);
		local2.glShaderSourceARB(local6, 1, new String[] { arg1 }, new int[] { arg1.length() }, 0);
		local2.glCompileShaderARB(local6);
		local2.glGetObjectParameterivARB(local6, 35713, anIntArray192, 0);
		if (anIntArray192[0] == 0) {
			if (anIntArray192[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			local2.glGetObjectParameterivARB(local6, 35716, anIntArray192, 1);
			if (anIntArray192[1] > 1) {
				@Pc(60) byte[] local60 = new byte[anIntArray192[1]];
				local2.glGetInfoLogARB(local6, anIntArray192[1], anIntArray192, 0, local60, 0);
				System.out.println(new String(local60));
			}
			if (anIntArray192[0] == 0) {
				local2.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class59(arg0, local6, 35632);
	}
}
