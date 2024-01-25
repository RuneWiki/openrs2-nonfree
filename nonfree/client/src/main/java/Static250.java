import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!iu", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString81 = null;

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(ILclient!qo;Ljava/lang/String;Z)Lclient!pl;")
	public static Class264 method6312(@OriginalArg(1) Class20_Sub3 arg0, @OriginalArg(2) String arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static283.anIntArray341, 0);
		if (Static283.anIntArray341[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class264(arg0, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
