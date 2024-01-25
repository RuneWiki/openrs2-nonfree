import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!hia", name = "e", descriptor = "Lclient!oh;")
	public static Class237 aClass237_57;

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "Z")
	public static boolean aBoolean341 = false;

	@OriginalMember(owner = "client!hia", name = "b", descriptor = "[I")
	public static final int[] anIntArray259 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!hia", name = "f", descriptor = "[I")
	public static final int[] anIntArray260 = new int[13];

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(Lclient!nv;Ljava/lang/String;II)Lclient!pi;")
	public static Class256 method3781(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) String arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static358.anIntArray384, 0);
		if (Static358.anIntArray384[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class256(arg0, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
