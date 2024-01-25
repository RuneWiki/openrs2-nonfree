import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "[I")
	private static final int[] anIntArray479 = new int[1];

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!nf;ILjava/lang/String;)Lclient!qm;")
	public static Class170 method4483(@OriginalArg(0) Class105_Sub1 arg0, @OriginalArg(2) String arg1) {
		@Pc(2) opengl local2 = arg0.anOpengl1;
		local2.glGenProgramsARB(1, anIntArray479, 0);
		@Pc(11) int local11 = anIntArray479[0];
		local2.glBindProgramARB(34336, local11);
		local2.glProgramStringARB(34336, 34933, arg1.length(), arg1);
		local2.glGetIntegerv(34379, anIntArray479, 0);
		if (anIntArray479[0] == -1) {
			local2.glBindProgramARB(34336, 0);
			return new Class170(arg0, 34336, local11);
		} else {
			local2.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
