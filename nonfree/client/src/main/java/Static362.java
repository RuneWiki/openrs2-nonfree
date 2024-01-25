import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "[I")
	private static final int[] anIntArray568 = new int[1];

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!ic;ILjava/lang/String;)Lclient!vc;")
	public static Class237 method5705(@OriginalArg(0) Class48_Sub2 arg0, @OriginalArg(2) String arg1) {
		@Pc(2) opengl local2 = arg0.anOpengl2;
		local2.glGenProgramsARB(1, anIntArray568, 0);
		@Pc(11) int local11 = anIntArray568[0];
		local2.glBindProgramARB(34336, local11);
		local2.glProgramStringARB(34336, 34933, arg1.length(), arg1);
		local2.glGetIntegerv(34379, anIntArray568, 0);
		if (anIntArray568[0] == -1) {
			local2.glBindProgramARB(34336, 0);
			return new Class237(arg0, 34336, local11);
		} else {
			local2.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
