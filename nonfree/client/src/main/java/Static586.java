import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static586 {

	@OriginalMember(owner = "client!tv", name = "e", descriptor = "I")
	public static int anInt9800;

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "Lclient!el;")
	public static final Class109 aClass109_208 = new Class109(3, 10);

	@OriginalMember(owner = "client!tv", name = "g", descriptor = "Z")
	public static boolean aBoolean749 = false;

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lclient!ffa;B[Lclient!wj;)Lclient!vc;")
	public static Class364 method8421(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Class388[] arg2) {
		for (@Pc(7) int local7 = 0; local7 < arg2.length; local7++) {
			if (arg2[local7] == null || arg2[local7].aLong310 <= 0L) {
				return null;
			}
		}
		@Pc(39) long local39 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(41) int local41 = 0; local41 < arg2.length; local41++) {
			OpenGL.glAttachObjectARB(local39, arg2[local41].aLong310);
		}
		OpenGL.glLinkProgramARB(local39);
		OpenGL.glGetObjectParameterivARB(local39, 35714, Static33.anIntArray35, 0);
		if (arg1 > -117) {
			method8420(-103);
		}
		if (Static33.anIntArray35[0] == 0) {
			if (Static33.anIntArray35[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local39, 35716, Static33.anIntArray35, 1);
			if (Static33.anIntArray35[1] > 1) {
				@Pc(113) byte[] local113 = new byte[Static33.anIntArray35[1]];
				OpenGL.glGetInfoLogARB(local39, Static33.anIntArray35[1], Static33.anIntArray35, 0, local113, 0);
				System.out.println(new String(local113));
			}
			if (Static33.anIntArray35[0] == 0) {
				for (@Pc(134) int local134 = 0; local134 < arg2.length; local134++) {
					OpenGL.glDetachObjectARB(local39, arg2[local134].aLong310);
				}
				OpenGL.glDeleteObjectARB(local39);
				return null;
			}
		}
		return new Class364(arg0, local39, arg2);
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(III)V")
	public static void method8422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(21) Class5_Sub50 local21 = Static457.method6722(Static636.aClass387_118, Static80.aClass313_1);
		local21.aClass5_Sub23_Sub2_2.method8492(arg1);
		local21.aClass5_Sub23_Sub2_2.method8530(arg0);
		Static494.method7120(local21);
	}
}
