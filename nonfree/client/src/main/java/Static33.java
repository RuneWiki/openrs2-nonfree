import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bc", name = "x", descriptor = "[[[Lclient!cja;")
	public static Class58[][][] aClass58ArrayArrayArray1;

	@OriginalMember(owner = "client!bc", name = "p", descriptor = "Z")
	public static boolean aBoolean71 = true;

	@OriginalMember(owner = "client!bc", name = "w", descriptor = "Lclient!pha;")
	public static final Class276 aClass276_2 = new Class276("", 10);

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "([Lclient!ec;Lclient!ko;Z)Lclient!gl;")
	public static Class128 method781(@OriginalArg(0) Class82[] arg0, @OriginalArg(1) Class137_Sub1_Sub1 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] == null || arg0[local7].aLong66 <= 0L) {
				return null;
			}
		}
		@Pc(29) long local29 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(31) int local31 = 0; local31 < arg0.length; local31++) {
			OpenGL.glAttachObjectARB(local29, arg0[local31].aLong66);
		}
		OpenGL.glLinkProgramARB(local29);
		OpenGL.glGetObjectParameterivARB(local29, 35714, Static477.anIntArray630, 0);
		if (Static477.anIntArray630[0] == 0) {
			if (Static477.anIntArray630[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local29, 35716, Static477.anIntArray630, 1);
			if (Static477.anIntArray630[1] > 1) {
				@Pc(92) byte[] local92 = new byte[Static477.anIntArray630[1]];
				OpenGL.glGetInfoLogARB(local29, Static477.anIntArray630[1], Static477.anIntArray630, 0, local92, 0);
				System.out.println(new String(local92));
			}
			if (Static477.anIntArray630[0] == 0) {
				for (@Pc(113) int local113 = 0; local113 < arg0.length; local113++) {
					OpenGL.glDetachObjectARB(local29, arg0[local113].aLong66);
				}
				OpenGL.glDeleteObjectARB(local29);
				return null;
			}
		}
		return new Class128(arg1, local29, arg0);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BI)V")
	public static void method799(@OriginalArg(1) int arg0) {
		for (@Pc(10) Class14 local10 = Static476.aClass187_59.method4079(); local10 != null; local10 = Static476.aClass187_59.method4084()) {
			if ((local10.aLong305 >> 48 & 0xFFFFL) == (long) arg0) {
				local10.method9315();
			}
		}
	}
}
