import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!ega", name = "k", descriptor = "I")
	public static int anInt2525;

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(Lclient!fc;I[Lclient!fo;)Lclient!nw;")
	public static Class255 method2342(@OriginalArg(0) Class101_Sub1_Sub1 arg0, @OriginalArg(2) Class110[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			if (arg1[local7] == null || arg1[local7].aLong91 <= 0L) {
				return null;
			}
		}
		@Pc(29) long local29 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(31) int local31 = 0; local31 < arg1.length; local31++) {
			OpenGL.glAttachObjectARB(local29, arg1[local31].aLong91);
		}
		OpenGL.glLinkProgramARB(local29);
		OpenGL.glGetObjectParameterivARB(local29, 35714, Static516.anIntArray464, 0);
		if (Static516.anIntArray464[0] == 0) {
			if (Static516.anIntArray464[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local29, 35716, Static516.anIntArray464, 1);
			if (Static516.anIntArray464[1] > 1) {
				@Pc(95) byte[] local95 = new byte[Static516.anIntArray464[1]];
				OpenGL.glGetInfoLogARB(local29, Static516.anIntArray464[1], Static516.anIntArray464, 0, local95, 0);
				System.out.println(new String(local95));
			}
			if (Static516.anIntArray464[0] == 0) {
				for (@Pc(119) int local119 = 0; local119 < arg1.length; local119++) {
					OpenGL.glDetachObjectARB(local29, arg1[local119].aLong91);
				}
				OpenGL.glDeleteObjectARB(local29);
				return null;
			}
		}
		return new Class255(arg0, local29, arg1);
	}
}
