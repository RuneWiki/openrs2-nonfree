import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static400 {

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
	public static int anInt6500;

	@OriginalMember(owner = "client!ub", name = "q", descriptor = "I")
	public static int anInt6511 = 0;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!ug;[Lclient!sl;I)Lclient!me;")
	public static Class168 method5265(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) Class228[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			if (arg1[local7] == null || arg1[local7].aLong185 <= 0L) {
				return null;
			}
		}
		@Pc(29) long local29 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(31) int local31 = 0; local31 < arg1.length; local31++) {
			OpenGL.glAttachObjectARB(local29, arg1[local31].aLong185);
		}
		OpenGL.glLinkProgramARB(local29);
		OpenGL.glGetObjectParameterivARB(local29, 35714, Static18.anIntArray18, 0);
		if (Static18.anIntArray18[0] == 0) {
			if (Static18.anIntArray18[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local29, 35716, Static18.anIntArray18, 1);
			if (Static18.anIntArray18[1] > 1) {
				@Pc(84) byte[] local84 = new byte[Static18.anIntArray18[1]];
				OpenGL.glGetInfoLogARB(local29, Static18.anIntArray18[1], Static18.anIntArray18, 0, local84, 0);
				System.out.println(new String(local84));
			}
			if (Static18.anIntArray18[0] == 0) {
				for (@Pc(105) int local105 = 0; local105 < arg1.length; local105++) {
					OpenGL.glDetachObjectARB(local29, arg1[local105].aLong185);
				}
				OpenGL.glDeleteObjectARB(local29);
				return null;
			}
		}
		return new Class168(arg0, local29, arg1);
	}
}
