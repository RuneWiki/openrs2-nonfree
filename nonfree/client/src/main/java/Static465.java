import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static465 {

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "I")
	public static int anInt7847;

	@OriginalMember(owner = "client!qa", name = "t", descriptor = "Lclient!mha;")
	public static Class229 aClass229_1;

	@OriginalMember(owner = "client!qa", name = "y", descriptor = "[I")
	public static int[] anIntArray444 = new int[1];

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lclient!kga;Lclient!jc;Z)Lclient!hia;")
	public static Class149 method6639(@OriginalArg(0) Class195[] arg0, @OriginalArg(1) Class65_Sub2_Sub2 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] == null || arg0[local7].aLong154 <= 0L) {
				return null;
			}
		}
		@Pc(29) long local29 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(31) int local31 = 0; local31 < arg0.length; local31++) {
			OpenGL.glAttachObjectARB(local29, arg0[local31].aLong154);
		}
		OpenGL.glLinkProgramARB(local29);
		OpenGL.glGetObjectParameterivARB(local29, 35714, Static582.anIntArray610, 0);
		if (Static582.anIntArray610[0] == 0) {
			if (Static582.anIntArray610[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local29, 35716, Static582.anIntArray610, 1);
			if (Static582.anIntArray610[1] > 1) {
				@Pc(92) byte[] local92 = new byte[Static582.anIntArray610[1]];
				OpenGL.glGetInfoLogARB(local29, Static582.anIntArray610[1], Static582.anIntArray610, 0, local92, 0);
				System.out.println(new String(local92));
			}
			if (Static582.anIntArray610[0] == 0) {
				for (@Pc(113) int local113 = 0; local113 < arg0.length; local113++) {
					OpenGL.glDetachObjectARB(local29, arg0[local113].aLong154);
				}
				OpenGL.glDeleteObjectARB(local29);
				return null;
			}
		}
		return new Class149(arg1, local29, arg0);
	}
}
