import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!mu", name = "f", descriptor = "[I")
	public static final int[] anIntArray409 = new int[4096];

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(ILclient!kw;ZLjava/lang/String;)Lclient!ft;")
	public static Class117 method5895(@OriginalArg(1) Class5_Sub2 arg0, @OriginalArg(3) String arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static384.anIntArray438, 0);
		if (Static384.anIntArray438[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class117(arg0, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(ILclient!sl;)Lclient!wr;")
	public static Class377 method5897(@OriginalArg(1) Class3_Sub3 arg0) {
		@Pc(14) int local14 = arg0.method4207();
		return new Class377(local14);
	}
}
