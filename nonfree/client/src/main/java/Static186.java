import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!me", name = "a", descriptor = "[I")
	private static final int[] anIntArray366 = new int[1];

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!h;ILjava/lang/String;)Lclient!me;")
	public static Class133 method3618(@OriginalArg(0) Class32_Sub2 arg0, @OriginalArg(2) String arg1) {
		@Pc(2) opengl local2 = arg0.anOpengl2;
		local2.glGenProgramsARB(1, anIntArray366, 0);
		@Pc(11) int local11 = anIntArray366[0];
		local2.glBindProgramARB(34336, local11);
		local2.glProgramStringARB(34336, 34933, arg1.length(), arg1);
		local2.glGetIntegerv(34379, anIntArray366, 0);
		if (anIntArray366[0] == -1) {
			local2.glBindProgramARB(34336, 0);
			return new Class133(arg0, 34336, local11);
		} else {
			local2.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
