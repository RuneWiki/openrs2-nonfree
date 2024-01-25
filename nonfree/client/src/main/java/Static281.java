import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
	public static int anInt5275;

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
	public static int anInt5277 = 0;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!bt;BILjava/lang/String;)Lclient!j;")
	public static Class117 method4418(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(3) String arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static9.anIntArray12, 0);
		if (Static9.anIntArray12[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class117(arg0, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IBLjava/lang/Object;I)[B")
	public static byte[] method4419(@OriginalArg(0) int arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return Static257.method4211(local13, arg0);
		} else if (arg1 instanceof Class174) {
			@Pc(25) Class174 local25 = (Class174) arg1;
			return local25.method4355(arg0);
		} else {
			throw new IllegalArgumentException();
		}
	}
}
