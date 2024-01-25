import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!na", name = "a", descriptor = "([I[IBILclient!hd;I)Lclient!na;")
	public static Class64_Sub2 method3729(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class89_Sub1 arg3, @OriginalArg(5) int arg4) {
		@Pc(4) byte[] local4 = new byte[arg4 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg2; local12++) {
			@Pc(27) int local27 = arg1[local12] + local12 * arg4;
			for (@Pc(29) int local29 = 0; local29 < arg0[local12]; local29++) {
				local4[local27++] = -1;
			}
		}
		return new Class64_Sub2(arg3, arg4, arg2, local4);
	}
}
