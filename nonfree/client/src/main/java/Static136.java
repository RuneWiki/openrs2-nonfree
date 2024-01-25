import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "([Lclient!nt;Lclient!mh;B)Lclient!pi;")
	public static Class227 method5800(@OriginalArg(0) Class205[] arg0, @OriginalArg(1) Class4_Sub3 arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
			if (arg0[local12] == null || arg0[local12].aLong163 <= 0L) {
				return null;
			}
		}
		@Pc(40) long local40 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(42) int local42 = 0; local42 < arg0.length; local42++) {
			OpenGL.glAttachObjectARB(local40, arg0[local42].aLong163);
		}
		OpenGL.glLinkProgramARB(local40);
		OpenGL.glGetObjectParameterivARB(local40, 35714, Static418.anIntArray654, 0);
		if (Static418.anIntArray654[0] == 0) {
			if (Static418.anIntArray654[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local40, 35716, Static418.anIntArray654, 1);
			if (Static418.anIntArray654[1] > 1) {
				@Pc(95) byte[] local95 = new byte[Static418.anIntArray654[1]];
				OpenGL.glGetInfoLogARB(local40, Static418.anIntArray654[1], Static418.anIntArray654, 0, local95, 0);
				System.out.println(new String(local95));
			}
			if (Static418.anIntArray654[0] == 0) {
				for (@Pc(116) int local116 = 0; local116 < arg0.length; local116++) {
					OpenGL.glDetachObjectARB(local40, arg0[local116].aLong163);
				}
				OpenGL.glDeleteObjectARB(local40);
				return null;
			}
		}
		return new Class227(arg1, local40, arg0);
	}
}
