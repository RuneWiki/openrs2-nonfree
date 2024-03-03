import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!bf;ILjava/lang/String;)Lclient!cg;", line = 4)
	public static Class35 method1280(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(2) String arg1) {
		@Pc(2) opengl local2 = arg0.anOpengl1;
		@Pc(6) int local6 = local2.glCreateShaderObjectARB(35632);
		local2.glShaderSourceARB(local6, 1, new String[] { arg1 }, new int[] { arg1.length() }, 0);
		local2.glCompileShaderARB(local6);
		local2.glGetObjectParameterivARB(local6, 35713, Class35.anIntArray84, 0);
		if (Class35.anIntArray84[0] == 0) {
			if (Class35.anIntArray84[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			local2.glGetObjectParameterivARB(local6, 35716, Class35.anIntArray84, 1);
			if (Class35.anIntArray84[1] > 1) {
				@Pc(60) byte[] local60 = new byte[Class35.anIntArray84[1]];
				local2.glGetInfoLogARB(local6, Class35.anIntArray84[1], Class35.anIntArray84, 0, local60, 0);
				System.out.println(new String(local60));
			}
			if (Class35.anIntArray84[0] == 0) {
				local2.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class35(arg0, local6, 35632);
	}
}
