import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIILclient!ic;[I[I)Lclient!te;")
	public static Class8_Sub2 method5372(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class48_Sub2 arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int[] arg4) {
		@Pc(4) byte[] local4 = new byte[arg1 * arg0];
		for (@Pc(6) int local6 = 0; local6 < arg0; local6++) {
			@Pc(21) int local21 = arg1 * local6 + arg3[local6];
			for (@Pc(23) int local23 = 0; local23 < arg4[local6]; local23++) {
				local4[local21++] = -1;
			}
		}
		return new Class8_Sub2(arg2, arg1, arg0, local4);
	}
}
