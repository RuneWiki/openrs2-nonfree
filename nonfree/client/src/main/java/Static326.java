import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!nm", name = "h", descriptor = "I")
	public static int anInt8697 = 999999;

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!mh;ILjava/lang/String;I)Lclient!nb;")
	public static Class194 method7612(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(2) String arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static134.anIntArray236, 0);
		if (Static134.anIntArray236[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class194(arg0, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
