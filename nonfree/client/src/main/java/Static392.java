import jaggl.OpenGL;
import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!to", name = "c", descriptor = "Ljava/awt/Font;")
	public static Font aFont2;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ILclient!ht;Ljava/lang/String;I)Lclient!mc;")
	public static Class153 method5479(@OriginalArg(1) Class109_Sub1 arg0, @OriginalArg(2) String arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static158.anIntArray256, 0);
		if (Static158.anIntArray256[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class153(arg0, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!em;I)V")
	public static void method5481(@OriginalArg(0) Class1_Sub8 arg0) {
		if (!Static108.aBoolean111) {
			arg0.method6071();
			Static82.anInt1627--;
		}
	}
}
