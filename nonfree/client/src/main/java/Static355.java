import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!lr", name = "f", descriptor = "I")
	public static int anInt5402;

	@OriginalMember(owner = "client!lr", name = "k", descriptor = "Lclient!hu;")
	public static Class157 aClass157_6;

	@OriginalMember(owner = "client!lr", name = "s", descriptor = "I")
	public static int anInt5409;

	@OriginalMember(owner = "client!lr", name = "t", descriptor = "I")
	public static int anInt5410;

	@OriginalMember(owner = "client!lr", name = "u", descriptor = "I")
	public static int anInt5411;

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "Lclient!bja;")
	public static final Class27 aClass27_23 = new Class27(14, 0, 4, 1);

	@OriginalMember(owner = "client!lr", name = "q", descriptor = "Lclient!fj;")
	public static final Class117 aClass117_10 = new Class117(8, 8);

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Ljava/lang/String;IILclient!pc;)Lclient!vea;")
	public static Class372 method4754(@OriginalArg(0) String arg0, @OriginalArg(3) Class33_Sub3 arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static179.anIntArray228, 0);
		if (Static179.anIntArray228[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class372(arg1, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILclient!lc;Ljava/lang/String;ZZ)V")
	public static void method4755(@OriginalArg(1) Class207 arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		Static306.method4297(arg2, arg0, "openjs", arg1, arg3);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(B[[I)V")
	public static void method4757(@OriginalArg(1) int[][] arg0) {
		Static172.anIntArrayArray17 = arg0;
	}
}
