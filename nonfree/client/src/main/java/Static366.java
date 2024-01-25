import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BI[IILclient!ql;[I)Lclient!te;")
	public static Class84_Sub2 method5117(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class92_Sub2 arg3, @OriginalArg(5) int[] arg4) {
		@Pc(4) byte[] local4 = new byte[arg2 * arg0];
		for (@Pc(6) int local6 = 0; local6 < arg2; local6++) {
			@Pc(31) int local31 = arg0 * local6 + arg4[local6];
			for (@Pc(33) int local33 = 0; local33 < arg1[local6]; local33++) {
				local4[local31++] = -1;
			}
		}
		return new Class84_Sub2(arg3, arg0, arg2, local4);
	}
}
