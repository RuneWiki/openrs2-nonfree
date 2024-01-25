import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static391 {

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "([Lclient!bba;Lclient!kga;B)Lclient!fr;")
	public static Class107 method6206(@OriginalArg(0) Class27[] arg0, @OriginalArg(1) Class44_Sub3 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] == null || arg0[local7].aLong19 <= 0L) {
				return null;
			}
		}
		@Pc(35) long local35 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(37) int local37 = 0; local37 < arg0.length; local37++) {
			OpenGL.glAttachObjectARB(local35, arg0[local37].aLong19);
		}
		OpenGL.glLinkProgramARB(local35);
		OpenGL.glGetObjectParameterivARB(local35, 35714, Static462.anIntArray471, 0);
		if (Static462.anIntArray471[0] == 0) {
			if (Static462.anIntArray471[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local35, 35716, Static462.anIntArray471, 1);
			if (Static462.anIntArray471[1] > 1) {
				@Pc(86) byte[] local86 = new byte[Static462.anIntArray471[1]];
				OpenGL.glGetInfoLogARB(local35, Static462.anIntArray471[1], Static462.anIntArray471, 0, local86, 0);
				System.out.println(new String(local86));
			}
			if (Static462.anIntArray471[0] == 0) {
				for (@Pc(110) int local110 = 0; local110 < arg0.length; local110++) {
					OpenGL.glDetachObjectARB(local35, arg0[local110].aLong19);
				}
				OpenGL.glDeleteObjectARB(local35);
				return null;
			}
		}
		return new Class107(arg1, local35, arg0);
	}
}
