import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "Z")
	public static boolean aBoolean57 = false;

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "Z")
	public static boolean aBoolean58 = true;

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "Lclient!ofa;")
	public static Class265 aClass265_3 = null;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "([Lclient!mja;BLclient!lf;)Lclient!gw;")
	public static Class142 method801(@OriginalArg(0) Class232[] arg0, @OriginalArg(2) Class95_Sub3 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] == null || arg0[local7].aLong173 <= 0L) {
				return null;
			}
		}
		@Pc(33) long local33 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(35) int local35 = 0; local35 < arg0.length; local35++) {
			OpenGL.glAttachObjectARB(local33, arg0[local35].aLong173);
		}
		OpenGL.glLinkProgramARB(local33);
		OpenGL.glGetObjectParameterivARB(local33, 35714, Static334.anIntArray440, 0);
		if (Static334.anIntArray440[0] == 0) {
			if (Static334.anIntArray440[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local33, 35716, Static334.anIntArray440, 1);
			if (Static334.anIntArray440[1] > 1) {
				@Pc(95) byte[] local95 = new byte[Static334.anIntArray440[1]];
				OpenGL.glGetInfoLogARB(local33, Static334.anIntArray440[1], Static334.anIntArray440, 0, local95, 0);
				System.out.println(new String(local95));
			}
			if (Static334.anIntArray440[0] == 0) {
				for (@Pc(116) int local116 = 0; local116 < arg0.length; local116++) {
					OpenGL.glDetachObjectARB(local33, arg0[local116].aLong173);
				}
				OpenGL.glDeleteObjectARB(local33);
				return null;
			}
		}
		return new Class142(arg1, local33, arg0);
	}
}
