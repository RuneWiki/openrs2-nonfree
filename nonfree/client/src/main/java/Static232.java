import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!hea", name = "e", descriptor = "Lclient!hea;")
	public static final Class151 aClass151_1 = new Class151();

	@OriginalMember(owner = "client!hea", name = "f", descriptor = "Lclient!hea;")
	public static final Class151 aClass151_2 = new Class151();

	@OriginalMember(owner = "client!hea", name = "d", descriptor = "Lclient!hea;")
	public static final Class151 aClass151_3 = new Class151();

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "Z")
	public static boolean aBoolean330 = true;

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(B)Lclient!rha;")
	public static Class2_Sub23_Sub5 method3319() {
		return Static442.aClass2_Sub23_Sub5_3;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(Lclient!mba;I[Lclient!su;)Lclient!ma;")
	public static Class235 method3320(@OriginalArg(0) Class145_Sub1_Sub1 arg0, @OriginalArg(2) Class345[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			if (arg1[local7] == null || arg1[local7].aLong294 <= 0L) {
				return null;
			}
		}
		@Pc(35) long local35 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(37) int local37 = 0; local37 < arg1.length; local37++) {
			OpenGL.glAttachObjectARB(local35, arg1[local37].aLong294);
		}
		if (-18014 != -18014) {
			method3318(true);
		}
		OpenGL.glLinkProgramARB(local35);
		OpenGL.glGetObjectParameterivARB(local35, 35714, Static138.anIntArray172, 0);
		if (Static138.anIntArray172[0] == 0) {
			if (Static138.anIntArray172[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local35, 35716, Static138.anIntArray172, 1);
			if (Static138.anIntArray172[1] > 1) {
				@Pc(111) byte[] local111 = new byte[Static138.anIntArray172[1]];
				OpenGL.glGetInfoLogARB(local35, Static138.anIntArray172[1], Static138.anIntArray172, 0, local111, 0);
				System.out.println(new String(local111));
			}
			if (Static138.anIntArray172[0] == 0) {
				for (@Pc(132) int local132 = 0; local132 < arg1.length; local132++) {
					OpenGL.glDetachObjectARB(local35, arg1[local132].aLong294);
				}
				OpenGL.glDeleteObjectARB(local35);
				return null;
			}
		}
		return new Class235(arg0, local35, arg1);
	}
}
