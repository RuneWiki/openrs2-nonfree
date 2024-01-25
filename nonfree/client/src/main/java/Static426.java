import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static426 {

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
	public static int anInt7294;

	@OriginalMember(owner = "client!vj", name = "h", descriptor = "[Lclient!f;")
	public static Class22[] aClass22Array25;

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "Lclient!eo;")
	public static Class68 aClass68_13 = null;

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "Z")
	public static boolean aBoolean504 = false;

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)Lclient!ps;")
	public static Class13_Sub5 method5665() {
		@Pc(16) Class13_Sub5 local16 = (Class13_Sub5) Static453.aClass40_7.method1192();
		if (local16 == null) {
			return new Class13_Sub5();
		} else {
			Static258.anInt7455--;
			return local16;
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILclient!gk;[Lclient!go;)Lclient!ss;")
	public static Class213 method5667(@OriginalArg(1) Class75_Sub2 arg0, @OriginalArg(2) Class86[] arg1) {
		for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
			if (arg1[local5] == null || arg1[local5].aLong89 <= 0L) {
				return null;
			}
		}
		@Pc(26) long local26 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(33) int local33 = 0; local33 < arg1.length; local33++) {
			OpenGL.glAttachObjectARB(local26, arg1[local33].aLong89);
		}
		OpenGL.glLinkProgramARB(local26);
		OpenGL.glGetObjectParameterivARB(local26, 35714, Static381.anIntArray233, 0);
		if (Static381.anIntArray233[0] == 0) {
			if (Static381.anIntArray233[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local26, 35716, Static381.anIntArray233, 1);
			if (Static381.anIntArray233[1] > 1) {
				@Pc(84) byte[] local84 = new byte[Static381.anIntArray233[1]];
				OpenGL.glGetInfoLogARB(local26, Static381.anIntArray233[1], Static381.anIntArray233, 0, local84, 0);
				System.out.println(new String(local84));
			}
			if (Static381.anIntArray233[0] == 0) {
				for (@Pc(105) int local105 = 0; local105 < arg1.length; local105++) {
					OpenGL.glDetachObjectARB(local26, arg1[local105].aLong89);
				}
				OpenGL.glDeleteObjectARB(local26);
				return null;
			}
		}
		return new Class213(arg0, local26, arg1);
	}
}
