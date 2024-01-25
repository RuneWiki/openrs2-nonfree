import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!cv", name = "D", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray34 = new String[100];

	@OriginalMember(owner = "client!cv", name = "F", descriptor = "[I")
	public static final int[] anIntArray373 = new int[8];

	@OriginalMember(owner = "client!cv", name = "G", descriptor = "I")
	public static int anInt5018 = 0;

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(IILjava/lang/String;Lclient!tt;)Lclient!up;")
	public static Class244 method3962(@OriginalArg(2) String arg0, @OriginalArg(3) Class200_Sub2 arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static378.anIntArray435, 0);
		if (Static378.anIntArray435[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class244(arg1, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
