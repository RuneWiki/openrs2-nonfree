import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static526 {

	@OriginalMember(owner = "client!vw", name = "I", descriptor = "Lclient!ne;")
	public static final Class206 aClass206_5 = new Class206();

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(Lclient!lh;[BII)Lclient!qg;")
	public static Class244 method7193(@OriginalArg(0) Class62_Sub1_Sub2 arg0, @OriginalArg(1) byte[] arg1) {
		if (arg1 == null) {
			return null;
		}
		@Pc(9) int local9 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local9);
		OpenGL.glProgramRawARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static454.anIntArray595, 0);
		if (Static454.anIntArray595[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class244(arg0, 34336, local9);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!vw", name = "b", descriptor = "(B)V")
	public static void method7197() {
		Static137.method1269();
		Static227.aClass227ArrayArray1 = null;
		Static232.aClass92_2 = null;
		Static465.aClass92_4 = null;
		Static122.aClass92_1 = null;
		Static206.aClass62_24 = null;
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(ZI)V")
	public static void method7199(@OriginalArg(1) int arg0) {
		@Pc(14) Class5_Sub2_Sub7 local14 = Static144.method2728(arg0, 5);
		local14.method1324();
	}
}
