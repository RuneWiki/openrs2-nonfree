import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray4;

	@OriginalMember(owner = "client!fj", name = "d", descriptor = "Lclient!uu;")
	public static Class250 aClass250_37;

	@OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
	public static int anInt1973;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZI)I")
	public static int method1819(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILclient!nq;ILjava/lang/String;)Lclient!sh;")
	public static Class221 method1820(@OriginalArg(1) Class167_Sub1 arg0, @OriginalArg(3) String arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static240.anIntArray392, 0);
		if (Static240.anIntArray392[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class221(arg0, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
