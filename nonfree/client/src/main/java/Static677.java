import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static677 {

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "([Lclient!hh;ILclient!pq;)Lclient!on;")
	public static Class260 method9169(@OriginalArg(0) Class142[] arg0, @OriginalArg(2) Class132_Sub3 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] == null || arg0[local7].aLong114 <= 0L) {
				return null;
			}
		}
		@Pc(33) long local33 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(35) int local35 = 0; local35 < arg0.length; local35++) {
			OpenGL.glAttachObjectARB(local33, arg0[local35].aLong114);
		}
		OpenGL.glLinkProgramARB(local33);
		OpenGL.glGetObjectParameterivARB(local33, 35714, Static577.anIntArray641, 0);
		if (Static577.anIntArray641[0] == 0) {
			if (Static577.anIntArray641[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local33, 35716, Static577.anIntArray641, 1);
			if (Static577.anIntArray641[1] > 1) {
				@Pc(92) byte[] local92 = new byte[Static577.anIntArray641[1]];
				OpenGL.glGetInfoLogARB(local33, Static577.anIntArray641[1], Static577.anIntArray641, 0, local92, 0);
				System.out.println(new String(local92));
			}
			if (Static577.anIntArray641[0] == 0) {
				for (@Pc(116) int local116 = 0; local116 < arg0.length; local116++) {
					OpenGL.glDetachObjectARB(local33, arg0[local116].aLong114);
				}
				OpenGL.glDeleteObjectARB(local33);
				return null;
			}
		}
		return new Class260(arg1, local33, arg0);
	}
}
