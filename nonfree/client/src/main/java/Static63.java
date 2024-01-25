import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "[I")
	private static final int[] anIntArray124 = new int[1];

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lclient!ks;ILjava/lang/String;)Lclient!dr;")
	public static Class39 method1479(@OriginalArg(0) Class63_Sub1 arg0, @OriginalArg(2) String arg1) {
		@Pc(2) opengl local2 = arg0.anOpengl1;
		local2.glGenProgramsARB(1, anIntArray124, 0);
		@Pc(11) int local11 = anIntArray124[0];
		local2.glBindProgramARB(34336, local11);
		local2.glProgramStringARB(34336, 34933, arg1.length(), arg1);
		local2.glGetIntegerv(34379, anIntArray124, 0);
		if (anIntArray124[0] == -1) {
			local2.glBindProgramARB(34336, 0);
			return new Class39(arg0, 34336, local11);
		} else {
			local2.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
