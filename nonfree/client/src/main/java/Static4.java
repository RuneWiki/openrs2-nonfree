import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "[I")
	private static final int[] anIntArray2 = new int[1];

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!ge;ILjava/lang/String;)Lclient!ad;")
	public static Class5 method52(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(2) String arg1) {
		@Pc(2) opengl local2 = arg0.anOpengl1;
		local2.glGenProgramsARB(1, anIntArray2, 0);
		@Pc(11) int local11 = anIntArray2[0];
		local2.glBindProgramARB(34336, local11);
		local2.glProgramStringARB(34336, 34933, arg1.length(), arg1);
		local2.glGetIntegerv(34379, anIntArray2, 0);
		if (anIntArray2[0] == -1) {
			local2.glBindProgramARB(34336, 0);
			return new Class5(arg0, 34336, local11);
		} else {
			local2.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
