import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!bf;ILjava/lang/String;)Lclient!kd;", line = 6)
	public static Class122 method3327(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(2) String arg1) {
		@Pc(2) opengl local2 = arg0.anOpengl1;
		local2.glGenProgramsARB(1, Class122.anIntArray202, 0);
		@Pc(11) int local11 = Class122.anIntArray202[0];
		local2.glBindProgramARB(34336, local11);
		local2.glProgramStringARB(34336, 34933, arg1.length(), arg1);
		local2.glGetIntegerv(34379, Class122.anIntArray202, 0);
		if (Class122.anIntArray202[0] == -1) {
			local2.glBindProgramARB(34336, 0);
			return new Class122(arg0, 34336, local11);
		} else {
			local2.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
