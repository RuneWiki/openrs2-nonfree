import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!ek", name = "p", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_42 = new Class322(123, -1);

	@OriginalMember(owner = "client!ek", name = "m", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_38 = new Class241(28, 6);

	@OriginalMember(owner = "client!ek", name = "s", descriptor = "F")
	public static float aFloat51 = 1024.0F;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Ljava/lang/String;ILclient!ml;I)Lclient!v;")
	public static Class371 method2588(@OriginalArg(0) String arg0, @OriginalArg(2) Class75_Sub3 arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static124.anIntArray130, 0);
		if (Static124.anIntArray130[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class371(arg1, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
