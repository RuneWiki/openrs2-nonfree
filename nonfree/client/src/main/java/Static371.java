import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I[I[IIILclient!ao;)Lclient!uq;")
	public static Class77_Sub2 method5715(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class4_Sub1 arg4) {
		@Pc(10) byte[] local10 = new byte[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg2; local12++) {
			@Pc(23) int local23 = arg0[local12] + local12 * arg3;
			for (@Pc(25) int local25 = 0; local25 < arg1[local12]; local25++) {
				local10[local23++] = -1;
			}
		}
		return new Class77_Sub2(arg4, arg3, arg2, local10);
	}
}
