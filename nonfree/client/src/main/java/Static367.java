import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!mm;[I[IIIB)Lclient!re;")
	public static Class46_Sub2 method4833(@OriginalArg(0) Class55_Sub1 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(4) byte[] local4 = new byte[arg4 * arg3];
		for (@Pc(6) int local6 = 0; local6 < arg3; local6++) {
			@Pc(21) int local21 = arg4 * local6 + arg2[local6];
			for (@Pc(23) int local23 = 0; local23 < arg1[local6]; local23++) {
				local4[local21++] = -1;
			}
		}
		return new Class46_Sub2(arg0, arg4, arg3, local4);
	}
}
