import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "A", descriptor = "[Lclient!kw;")
	public static Class178[] aClass178Array1;

	@OriginalMember(owner = "client!ab", name = "B", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_2 = new Class397(33, 5);

	@OriginalMember(owner = "client!ab", name = "E", descriptor = "[I")
	public static final int[] anIntArray4 = new int[8];

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(BLclient!aq;Ljava/lang/String;I)Lclient!jf;")
	public static Class191 method66(@OriginalArg(1) Class22_Sub1 arg0, @OriginalArg(2) String arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static495.anIntArray576, 0);
		if (Static495.anIntArray576[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class191(arg0, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
