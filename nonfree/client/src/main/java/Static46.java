import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!bu", name = "B", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_23 = new Class40(91, 3);

	@OriginalMember(owner = "client!bu", name = "D", descriptor = "I")
	public static int anInt806 = -1;

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(B[Lclient!pc;Lclient!pea;)Lclient!og;")
	public static Class227 method647(@OriginalArg(1) Class241[] arg0, @OriginalArg(2) Class121_Sub3 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] == null || arg0[local7].aLong174 <= 0L) {
				return null;
			}
		}
		@Pc(29) long local29 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(36) int local36 = 0; local36 < arg0.length; local36++) {
			OpenGL.glAttachObjectARB(local29, arg0[local36].aLong174);
		}
		OpenGL.glLinkProgramARB(local29);
		OpenGL.glGetObjectParameterivARB(local29, 35714, Static241.anIntArray426, 0);
		if (Static241.anIntArray426[0] == 0) {
			if (Static241.anIntArray426[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local29, 35716, Static241.anIntArray426, 1);
			if (Static241.anIntArray426[1] > 1) {
				@Pc(91) byte[] local91 = new byte[Static241.anIntArray426[1]];
				OpenGL.glGetInfoLogARB(local29, Static241.anIntArray426[1], Static241.anIntArray426, 0, local91, 0);
				System.out.println(new String(local91));
			}
			if (Static241.anIntArray426[0] == 0) {
				for (@Pc(115) int local115 = 0; local115 < arg0.length; local115++) {
					OpenGL.glDetachObjectARB(local29, arg0[local115].aLong174);
				}
				OpenGL.glDeleteObjectARB(local29);
				return null;
			}
		}
		return new Class227(arg1, local29, arg0);
	}
}
