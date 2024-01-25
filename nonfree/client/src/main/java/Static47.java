import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "[I")
	public static final int[] anIntArray37 = new int[25];

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "[I")
	public static final int[] anIntArray38 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILclient!en;ILjava/lang/String;)Lclient!afa;")
	public static Class10 method748(@OriginalArg(1) Class90_Sub1 arg0, @OriginalArg(3) String arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static16.anIntArray15, 0);
		if (Static16.anIntArray15[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class10(arg0, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
