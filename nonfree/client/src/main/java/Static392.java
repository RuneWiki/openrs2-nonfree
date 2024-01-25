import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!mh", name = "m", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_123 = new Class186(139, -1);

	@OriginalMember(owner = "client!mh", name = "p", descriptor = "Z")
	public static boolean aBoolean553 = false;

	@OriginalMember(owner = "client!mh", name = "j", descriptor = "B")
	public static byte aByte109 = -6;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILclient!gia;BLjava/lang/String;)Lclient!nca;")
	public static Class250 method5907(@OriginalArg(1) Class67_Sub2 arg0, @OriginalArg(3) String arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static142.anIntArray127, 0);
		if (Static142.anIntArray127[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class250(arg0, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
