import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!cg", name = "k", descriptor = "I")
	public static int anInt1321;

	@OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
	public static int anInt1323;

	@OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
	public static int anInt1324;

	@OriginalMember(owner = "client!cg", name = "j", descriptor = "Lclient!hv;")
	public static final Class146 aClass146_6 = new Class146(2, 2);

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I[Lclient!kd;Lclient!dia;)Lclient!oca;")
	public static Class249 method1361(@OriginalArg(1) Class184[] arg0, @OriginalArg(2) Class13_Sub2 arg1) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] == null || arg0[local5].aLong158 <= 0L) {
				return null;
			}
		}
		@Pc(32) long local32 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(34) int local34 = 0; local34 < arg0.length; local34++) {
			OpenGL.glAttachObjectARB(local32, arg0[local34].aLong158);
		}
		OpenGL.glLinkProgramARB(local32);
		OpenGL.glGetObjectParameterivARB(local32, 35714, Static376.anIntArray523, 0);
		if (Static376.anIntArray523[0] == 0) {
			if (Static376.anIntArray523[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local32, 35716, Static376.anIntArray523, 1);
			if (Static376.anIntArray523[1] > 1) {
				@Pc(87) byte[] local87 = new byte[Static376.anIntArray523[1]];
				OpenGL.glGetInfoLogARB(local32, Static376.anIntArray523[1], Static376.anIntArray523, 0, local87, 0);
				System.out.println(new String(local87));
			}
			if (Static376.anIntArray523[0] == 0) {
				for (@Pc(111) int local111 = 0; local111 < arg0.length; local111++) {
					OpenGL.glDetachObjectARB(local32, arg0[local111].aLong158);
				}
				OpenGL.glDeleteObjectARB(local32);
				return null;
			}
		}
		return new Class249(arg1, local32, arg0);
	}
}
