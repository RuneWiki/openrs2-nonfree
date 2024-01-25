import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(BLclient!hj;[III[I)Lclient!ir;")
	public static Class97_Sub1 method2693(@OriginalArg(1) Class2_Sub1 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		@Pc(4) byte[] local4 = new byte[arg3 * arg2];
		for (@Pc(6) int local6 = 0; local6 < arg2; local6++) {
			@Pc(18) int local18 = local6 * arg3 + arg4[local6];
			for (@Pc(20) int local20 = 0; local20 < arg1[local6]; local20++) {
				local4[local18++] = -1;
			}
		}
		return new Class97_Sub1(arg0, arg3, arg2, local4);
	}
}
