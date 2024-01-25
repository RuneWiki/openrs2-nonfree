import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
	public static int anInt540 = 0;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!hp;[Lclient!ne;I)Lclient!aw;")
	public static Class21 method480(@OriginalArg(0) Class134_Sub1_Sub1 arg0, @OriginalArg(1) Class234[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			if (arg1[local7] == null || arg1[local7].aLong192 <= 0L) {
				return null;
			}
		}
		@Pc(33) long local33 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(35) int local35 = 0; local35 < arg1.length; local35++) {
			OpenGL.glAttachObjectARB(local33, arg1[local35].aLong192);
		}
		OpenGL.glLinkProgramARB(local33);
		OpenGL.glGetObjectParameterivARB(local33, 35714, Static43.anIntArray84, 0);
		if (Static43.anIntArray84[0] == 0) {
			if (Static43.anIntArray84[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local33, 35716, Static43.anIntArray84, 1);
			if (Static43.anIntArray84[1] > 1) {
				@Pc(92) byte[] local92 = new byte[Static43.anIntArray84[1]];
				OpenGL.glGetInfoLogARB(local33, Static43.anIntArray84[1], Static43.anIntArray84, 0, local92, 0);
				System.out.println(new String(local92));
			}
			if (Static43.anIntArray84[0] == 0) {
				for (@Pc(116) int local116 = 0; local116 < arg1.length; local116++) {
					OpenGL.glDetachObjectARB(local33, arg1[local116].aLong192);
				}
				OpenGL.glDeleteObjectARB(local33);
				return null;
			}
		}
		return new Class21(arg0, local33, arg1);
	}
}
