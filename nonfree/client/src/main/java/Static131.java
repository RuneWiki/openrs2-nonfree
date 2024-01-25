import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "[I")
	private static final int[] anIntArray225 = new int[1];

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!cg;ILjava/lang/String;)Lclient!hr;")
	public static Class97 method2546(@OriginalArg(0) Class37_Sub1 arg0, @OriginalArg(2) String arg1) {
		@Pc(2) opengl local2 = arg0.anOpengl1;
		local2.glGenProgramsARB(1, anIntArray225, 0);
		@Pc(11) int local11 = anIntArray225[0];
		local2.glBindProgramARB(34336, local11);
		local2.glProgramStringARB(34336, 34933, arg1.length(), arg1);
		local2.glGetIntegerv(34379, anIntArray225, 0);
		if (anIntArray225[0] == -1) {
			local2.glBindProgramARB(34336, 0);
			return new Class97(arg0, 34336, local11);
		} else {
			local2.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
