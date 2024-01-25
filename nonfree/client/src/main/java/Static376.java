import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IBI[ILclient!cg;[I)Lclient!rf;")
	public static Class124_Sub2 method4786(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class37_Sub1 arg3, @OriginalArg(5) int[] arg4) {
		@Pc(4) byte[] local4 = new byte[arg1 * arg0];
		for (@Pc(6) int local6 = 0; local6 < arg0; local6++) {
			@Pc(21) int local21 = arg2[local6] + local6 * arg1;
			for (@Pc(23) int local23 = 0; local23 < arg4[local6]; local23++) {
				local4[local21++] = -1;
			}
		}
		return new Class124_Sub2(arg3, arg1, arg0, local4);
	}
}
