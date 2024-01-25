import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "[I")
	private static final int[] anIntArray767 = new int[1];

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!qi;ILjava/lang/String;)Lclient!ut;")
	public static Class233 method5474(@OriginalArg(0) Class82_Sub2 arg0, @OriginalArg(2) String arg1) {
		@Pc(2) opengl local2 = arg0.anOpengl2;
		local2.glGenProgramsARB(1, anIntArray767, 0);
		@Pc(11) int local11 = anIntArray767[0];
		local2.glBindProgramARB(34336, local11);
		local2.glProgramStringARB(34336, 34933, arg1.length(), arg1);
		local2.glGetIntegerv(34379, anIntArray767, 0);
		if (anIntArray767[0] == -1) {
			local2.glBindProgramARB(34336, 0);
			return new Class233(arg0, 34336, local11);
		} else {
			local2.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
