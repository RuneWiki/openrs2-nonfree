import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static453 {

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
	public static int anInt7762;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_183 = new Class81(94, -1);

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "[I")
	public static final int[] anIntArray515 = new int[500];

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)I")
	public static int method6378() {
		return Static419.anInt7122;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZILclient!ag;Ljava/lang/String;)Lclient!pc;")
	public static Class250 method6379(@OriginalArg(2) Class12_Sub1 arg0, @OriginalArg(3) String arg1) {
		@Pc(10) int local10 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local10);
		OpenGL.glProgramStringARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static542.anIntArray598, 0);
		if (Static542.anIntArray598[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class250(arg0, 34336, local10);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
