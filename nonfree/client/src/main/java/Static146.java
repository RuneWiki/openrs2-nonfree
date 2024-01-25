import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!es", name = "i", descriptor = "I")
	public static int anInt2945;

	@OriginalMember(owner = "client!es", name = "q", descriptor = "I")
	public static int anInt2951;

	@OriginalMember(owner = "client!es", name = "s", descriptor = "I")
	public static int anInt2953;

	@OriginalMember(owner = "client!es", name = "p", descriptor = "I")
	public static int anInt2950 = -50;

	@OriginalMember(owner = "client!es", name = "w", descriptor = "I")
	public static int anInt2956 = 1;

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(ILjava/lang/String;BLclient!dia;)Lclient!td;")
	public static Class331 method2735(@OriginalArg(1) String arg0, @OriginalArg(3) Class13_Sub2 arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static570.anIntArray797, 0);
		if (Static570.anIntArray797[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class331(arg1, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
