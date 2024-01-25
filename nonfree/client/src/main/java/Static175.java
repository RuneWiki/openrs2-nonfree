import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "[I")
	private static final int[] anIntArray324 = new int[1];

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!ig;ILjava/lang/String;)Lclient!lc;")
	public static Class119 method3464(@OriginalArg(0) Class47_Sub2 arg0, @OriginalArg(2) String arg1) {
		@Pc(2) opengl local2 = arg0.anOpengl2;
		local2.glGenProgramsARB(1, anIntArray324, 0);
		@Pc(11) int local11 = anIntArray324[0];
		local2.glBindProgramARB(34336, local11);
		local2.glProgramStringARB(34336, 34933, arg1.length(), arg1);
		local2.glGetIntegerv(34379, anIntArray324, 0);
		if (anIntArray324[0] == -1) {
			local2.glBindProgramARB(34336, 0);
			return new Class119(arg0, 34336, local11);
		} else {
			local2.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
