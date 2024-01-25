import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static499 {

	@OriginalMember(owner = "client!ti", name = "h", descriptor = "[I")
	public static int[] anIntArray639 = new int[1];

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(I[Lclient!hba;Lclient!en;)Lclient!kba;")
	public static Class164 method7167(@OriginalArg(1) Class123[] arg0, @OriginalArg(2) Class90_Sub1 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] == null || arg0[local7].aLong79 <= 0L) {
				return null;
			}
		}
		@Pc(29) long local29 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(31) int local31 = 0; local31 < arg0.length; local31++) {
			OpenGL.glAttachObjectARB(local29, arg0[local31].aLong79);
		}
		OpenGL.glLinkProgramARB(local29);
		OpenGL.glGetObjectParameterivARB(local29, 35714, Static418.anIntArray509, 0);
		if (Static418.anIntArray509[0] == 0) {
			if (Static418.anIntArray509[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local29, 35716, Static418.anIntArray509, 1);
			if (Static418.anIntArray509[1] > 1) {
				@Pc(94) byte[] local94 = new byte[Static418.anIntArray509[1]];
				OpenGL.glGetInfoLogARB(local29, Static418.anIntArray509[1], Static418.anIntArray509, 0, local94, 0);
				System.out.println(new String(local94));
			}
			if (Static418.anIntArray509[0] == 0) {
				for (@Pc(115) int local115 = 0; local115 < arg0.length; local115++) {
					OpenGL.glDetachObjectARB(local29, arg0[local115].aLong79);
				}
				OpenGL.glDeleteObjectARB(local29);
				return null;
			}
		}
		return new Class164(arg1, local29, arg0);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)V")
	public static void method7169(@OriginalArg(1) int arg0) {
		Static70.anInt1184 = arg0;
		Static342.aClass330_35.method7688();
	}
}
