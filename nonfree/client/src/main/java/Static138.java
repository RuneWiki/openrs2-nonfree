import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!fba", name = "I", descriptor = "Lclient!f;")
	public static Class14 aClass14_9;

	@OriginalMember(owner = "client!fba", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString13 = null;

	@OriginalMember(owner = "client!fba", name = "H", descriptor = "I")
	public static int anInt3001 = 0;

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(BILclient!vj;Ljava/lang/String;)Lclient!vk;")
	public static Class351 method2696(@OriginalArg(2) Class45_Sub3 arg0, @OriginalArg(3) String arg1) {
		@Pc(13) int local13 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local13);
		OpenGL.glProgramStringARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static16.anIntArray19, 0);
		if (Static16.anIntArray19[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class351(arg0, 34336, local13);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!fba", name = "c", descriptor = "(II)I")
	public static int method2697(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
