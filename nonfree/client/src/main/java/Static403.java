import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BIILclient!qi;[I[I)Lclient!tg;")
	public static Class201_Sub2 method5173(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class82_Sub2 arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int[] arg4) {
		@Pc(4) byte[] local4 = new byte[arg0 * arg1];
		for (@Pc(6) int local6 = 0; local6 < arg0; local6++) {
			@Pc(21) int local21 = local6 * arg1 + arg3[local6];
			for (@Pc(23) int local23 = 0; local23 < arg4[local6]; local23++) {
				local4[local21++] = -1;
			}
		}
		return new Class201_Sub2(arg2, arg1, arg0, local4);
	}
}
