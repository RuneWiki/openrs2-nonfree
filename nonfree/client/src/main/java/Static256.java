import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!mu", name = "o", descriptor = "I")
	public static int anInt4776;

	@OriginalMember(owner = "client!mu", name = "t", descriptor = "Lclient!fs;")
	public static Class76 aClass76_50;

	@OriginalMember(owner = "client!mu", name = "f", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_99 = new Class83("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!mu", name = "i", descriptor = "J")
	public static long aLong156 = -1L;

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "([Lclient!wl;Lclient!fd;I)Lclient!ru;")
	public static Class210 method3694(@OriginalArg(0) Class267[] arg0, @OriginalArg(1) Class19_Sub2 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] == null || arg0[local7].aLong220 <= 0L) {
				return null;
			}
		}
		@Pc(31) long local31 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(33) int local33 = 0; local33 < arg0.length; local33++) {
			OpenGL.glAttachObjectARB(local31, arg0[local33].aLong220);
		}
		OpenGL.glLinkProgramARB(local31);
		OpenGL.glGetObjectParameterivARB(local31, 35714, Static156.anIntArray198, 0);
		if (Static156.anIntArray198[0] == 0) {
			if (Static156.anIntArray198[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local31, 35716, Static156.anIntArray198, 1);
			if (Static156.anIntArray198[1] > 1) {
				@Pc(89) byte[] local89 = new byte[Static156.anIntArray198[1]];
				OpenGL.glGetInfoLogARB(local31, Static156.anIntArray198[1], Static156.anIntArray198, 0, local89, 0);
				System.out.println(new String(local89));
			}
			if (Static156.anIntArray198[0] == 0) {
				for (@Pc(110) int local110 = 0; local110 < arg0.length; local110++) {
					OpenGL.glDetachObjectARB(local31, arg0[local110].aLong220);
				}
				OpenGL.glDeleteObjectARB(local31);
				return null;
			}
		}
		return new Class210(arg1, local31, arg0);
	}
}
