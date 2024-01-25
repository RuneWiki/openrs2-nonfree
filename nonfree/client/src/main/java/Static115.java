import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!eb", name = "I", descriptor = "Ljava/lang/String;")
	public static String aString10 = null;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZI)Z")
	public static boolean method1815(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(Z)V")
	public static void method1816() {
		Static526.anInt9112 = -1;
		Static18.anInt5702 = 1;
		if (Static299.aString45 == null) {
			Static36.method607(35);
		} else {
			@Pc(24) Class6_Sub12 local24 = new Class6_Sub12(Static404.method5837(Static207.method3393(Static299.aString45)));
			@Pc(28) long local28 = local24.method6016();
			Static326.aLong152 = local24.method6016();
			Static278.method4182("", true, Static383.method5604(local28));
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II[BLclient!mc;)Lclient!ch;")
	public static Class53 method1818(@OriginalArg(2) byte[] arg0, @OriginalArg(3) Class90_Sub3_Sub1 arg1) {
		if (arg0 == null) {
			return null;
		}
		@Pc(9) int local9 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local9);
		OpenGL.glProgramRawARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static251.anIntArray384, 0);
		if (Static251.anIntArray384[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class53(arg1, 34336, local9);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
