import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!lu", name = "d", descriptor = "Lclient!gi;")
	public static Class120 aClass120_1;

	@OriginalMember(owner = "client!lu", name = "l", descriptor = "[Lclient!ufa;")
	public static Class4[] aClass4Array8;

	@OriginalMember(owner = "client!lu", name = "e", descriptor = "I")
	public static int anInt6626 = 0;

	@OriginalMember(owner = "client!lu", name = "g", descriptor = "F")
	public static float aFloat131 = 1.0F;

	@OriginalMember(owner = "client!lu", name = "k", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_111 = new Class73(5, 6);

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!ac;[Lclient!v;Z)Lclient!uj;")
	public static Class342 method5541(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) Class349[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			if (arg1[local7] == null || arg1[local7].aLong260 <= 0L) {
				return null;
			}
		}
		@Pc(35) long local35 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(37) int local37 = 0; local37 < arg1.length; local37++) {
			OpenGL.glAttachObjectARB(local35, arg1[local37].aLong260);
		}
		OpenGL.glLinkProgramARB(local35);
		OpenGL.glGetObjectParameterivARB(local35, 35714, Static282.anIntArray264, 0);
		if (Static282.anIntArray264[0] == 0) {
			if (Static282.anIntArray264[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local35, 35716, Static282.anIntArray264, 1);
			if (Static282.anIntArray264[1] > 1) {
				@Pc(103) byte[] local103 = new byte[Static282.anIntArray264[1]];
				OpenGL.glGetInfoLogARB(local35, Static282.anIntArray264[1], Static282.anIntArray264, 0, local103, 0);
				System.out.println(new String(local103));
			}
			if (Static282.anIntArray264[0] == 0) {
				for (@Pc(124) int local124 = 0; local124 < arg1.length; local124++) {
					OpenGL.glDetachObjectARB(local35, arg1[local124].aLong260);
				}
				OpenGL.glDeleteObjectARB(local35);
				return null;
			}
		}
		return new Class342(arg0, local35, arg1);
	}
}
