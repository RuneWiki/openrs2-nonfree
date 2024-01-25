import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "[I")
	private static final int[] anIntArray405 = new int[1];

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!ao;ILjava/lang/String;)Lclient!rf;")
	public static Class169 method4878(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(2) String arg1) {
		@Pc(2) opengl local2 = arg0.anOpengl1;
		local2.glGenProgramsARB(1, anIntArray405, 0);
		@Pc(11) int local11 = anIntArray405[0];
		local2.glBindProgramARB(34336, local11);
		local2.glProgramStringARB(34336, 34933, arg1.length(), arg1);
		local2.glGetIntegerv(34379, anIntArray405, 0);
		if (anIntArray405[0] == -1) {
			local2.glBindProgramARB(34336, 0);
			return new Class169(arg0, 34336, local11);
		} else {
			local2.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
