import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "I")
	public static int anInt4281;

	@OriginalMember(owner = "client!jp", name = "f", descriptor = "Lclient!tca;")
	public static Class322 aClass322_4;

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray24 = new String[100];

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "Lclient!mea;")
	public static final Class222 aClass222_7 = new Class222("", 12);

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "Z")
	public static boolean aBoolean319 = false;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IILclient!kd;[B)Lclient!tb;")
	public static Class319 method3653(@OriginalArg(2) Class162_Sub1_Sub2 arg0, @OriginalArg(3) byte[] arg1) {
		if (arg1 == null) {
			return null;
		}
		@Pc(9) int local9 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local9);
		OpenGL.glProgramRawARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static297.anIntArray341, 0);
		if (Static297.anIntArray341[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class319(arg0, 34336, local9);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
