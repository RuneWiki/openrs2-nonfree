import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!po", name = "e", descriptor = "[[B")
	public static byte[][] aByteArrayArray22;

	@OriginalMember(owner = "client!po", name = "h", descriptor = "I")
	public static int anInt6927;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Ljava/lang/String;Lclient!us;II)Lclient!kk;")
	public static Class188 method5922(@OriginalArg(0) String arg0, @OriginalArg(1) Class43_Sub3 arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static257.anIntArray373, 0);
		if (Static257.anIntArray373[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class188(arg1, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
