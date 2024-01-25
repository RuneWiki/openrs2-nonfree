import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!pl", name = "s", descriptor = "I")
	public static int anInt7729;

	@OriginalMember(owner = "client!pl", name = "t", descriptor = "Lclient!qh;")
	public static Class197 aClass197_3;

	@OriginalMember(owner = "client!pl", name = "u", descriptor = "Lclient!ci;")
	public static Class42 aClass42_7;

	@OriginalMember(owner = "client!pl", name = "r", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_148 = new Class254(78, 11);

	@OriginalMember(owner = "client!pl", name = "v", descriptor = "[Z")
	public static final boolean[] aBooleanArray26 = new boolean[8];

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/lang/String;ILclient!qg;I)Lclient!ub;")
	public static Class235 method5955(@OriginalArg(0) String arg0, @OriginalArg(2) Class121_Sub2 arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static313.anIntArray400, 0);
		if (Static313.anIntArray400[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class235(arg1, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
