import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static442 {

	@OriginalMember(owner = "client!pw", name = "eb", descriptor = "I")
	public static int anInt8212;

	@OriginalMember(owner = "client!pw", name = "H", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_188 = new Class215(23, 6);

	@OriginalMember(owner = "client!pw", name = "jb", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_189 = new Class215(2, 6);

	@OriginalMember(owner = "client!pw", name = "nb", descriptor = "[I")
	public static final int[] anIntArray540 = new int[3];

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(Lclient!qo;I[Lclient!tba;)Lclient!dw;")
	public static Class81 method7011(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(2) Class324[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			if (arg1[local7] == null || arg1[local7].aLong238 <= 0L) {
				return null;
			}
		}
		@Pc(33) long local33 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(35) int local35 = 0; local35 < arg1.length; local35++) {
			OpenGL.glAttachObjectARB(local33, arg1[local35].aLong238);
		}
		OpenGL.glLinkProgramARB(local33);
		OpenGL.glGetObjectParameterivARB(local33, 35714, Static457.anIntArray552, 0);
		if (Static457.anIntArray552[0] == 0) {
			if (Static457.anIntArray552[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local33, 35716, Static457.anIntArray552, 1);
			if (Static457.anIntArray552[1] > 1) {
				@Pc(88) byte[] local88 = new byte[Static457.anIntArray552[1]];
				OpenGL.glGetInfoLogARB(local33, Static457.anIntArray552[1], Static457.anIntArray552, 0, local88, 0);
				System.out.println(new String(local88));
			}
			if (Static457.anIntArray552[0] == 0) {
				for (@Pc(109) int local109 = 0; local109 < arg1.length; local109++) {
					OpenGL.glDetachObjectARB(local33, arg1[local109].aLong238);
				}
				OpenGL.glDeleteObjectARB(local33);
				return null;
			}
		}
		return new Class81(arg0, local33, arg1);
	}
}
