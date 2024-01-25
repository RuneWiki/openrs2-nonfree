import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "[I")
	public static final int[] anIntArray190 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "[I")
	public static final int[] anIntArray191 = new int[25];

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V")
	public static void method3167() {
		Static83.aBoolean604 = false;
		Static594.method8139();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "([Lclient!ci;BLclient!eq;)Lclient!ua;")
	public static Class326 method3168(@OriginalArg(0) Class45[] arg0, @OriginalArg(2) Class33_Sub3 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] == null || arg0[local7].aLong40 <= 0L) {
				return null;
			}
		}
		@Pc(29) long local29 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(31) int local31 = 0; local31 < arg0.length; local31++) {
			OpenGL.glAttachObjectARB(local29, arg0[local31].aLong40);
		}
		OpenGL.glLinkProgramARB(local29);
		OpenGL.glGetObjectParameterivARB(local29, 35714, Static185.anIntArray238, 0);
		if (Static185.anIntArray238[0] == 0) {
			if (Static185.anIntArray238[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local29, 35716, Static185.anIntArray238, 1);
			if (Static185.anIntArray238[1] > 1) {
				@Pc(91) byte[] local91 = new byte[Static185.anIntArray238[1]];
				OpenGL.glGetInfoLogARB(local29, Static185.anIntArray238[1], Static185.anIntArray238, 0, local91, 0);
				System.out.println(new String(local91));
			}
			if (Static185.anIntArray238[0] == 0) {
				for (@Pc(112) int local112 = 0; local112 < arg0.length; local112++) {
					OpenGL.glDetachObjectARB(local29, arg0[local112].aLong40);
				}
				OpenGL.glDeleteObjectARB(local29);
				return null;
			}
		}
		return new Class326(arg1, local29, arg0);
	}
}
