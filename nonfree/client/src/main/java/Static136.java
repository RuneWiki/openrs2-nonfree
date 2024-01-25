import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "[I")
	private static final int[] anIntArray316 = new int[1];

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!hj;ILjava/lang/String;)Lclient!ii;")
	public static Class93 method2630(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(2) String arg1) {
		@Pc(2) opengl local2 = arg0.anOpengl1;
		local2.glGenProgramsARB(1, anIntArray316, 0);
		@Pc(11) int local11 = anIntArray316[0];
		local2.glBindProgramARB(34336, local11);
		local2.glProgramStringARB(34336, 34933, arg1.length(), arg1);
		local2.glGetIntegerv(34379, anIntArray316, 0);
		if (anIntArray316[0] == -1) {
			local2.glBindProgramARB(34336, 0);
			return new Class93(arg0, 34336, local11);
		} else {
			local2.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
