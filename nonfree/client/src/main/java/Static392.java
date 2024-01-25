import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "Lclient!ha;")
	public static Class25 aClass25_21;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
	public static final int anInt7040 = 1405;

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
	public static int anInt7043 = -1;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "([Lclient!ud;ILclient!jj;)Lclient!vv;")
	public static Class308 method5719(@OriginalArg(0) Class289[] arg0, @OriginalArg(2) Class62_Sub3 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] == null || arg0[local7].aLong232 <= 0L) {
				return null;
			}
		}
		@Pc(29) long local29 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(31) int local31 = 0; local31 < arg0.length; local31++) {
			OpenGL.glAttachObjectARB(local29, arg0[local31].aLong232);
		}
		OpenGL.glLinkProgramARB(local29);
		OpenGL.glGetObjectParameterivARB(local29, 35714, Static265.anIntArray328, 0);
		if (Static265.anIntArray328[0] == 0) {
			if (Static265.anIntArray328[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local29, 35716, Static265.anIntArray328, 1);
			if (Static265.anIntArray328[1] > 1) {
				@Pc(85) byte[] local85 = new byte[Static265.anIntArray328[1]];
				OpenGL.glGetInfoLogARB(local29, Static265.anIntArray328[1], Static265.anIntArray328, 0, local85, 0);
				System.out.println(new String(local85));
			}
			if (Static265.anIntArray328[0] == 0) {
				for (@Pc(109) int local109 = 0; local109 < arg0.length; local109++) {
					OpenGL.glDetachObjectARB(local29, arg0[local109].aLong232);
				}
				OpenGL.glDeleteObjectARB(local29);
				return null;
			}
		}
		return new Class308(arg1, local29, arg0);
	}
}
