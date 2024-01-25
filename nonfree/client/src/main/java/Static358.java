import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILclient!po;I[IB[I)Lclient!ar;")
	public static Class15_Sub1 method465(@OriginalArg(0) int arg0, @OriginalArg(1) Class59_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int[] arg4) {
		@Pc(4) byte[] local4 = new byte[arg0 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg0; local12++) {
			@Pc(23) int local23 = arg3[local12] + arg2 * local12;
			for (@Pc(25) int local25 = 0; local25 < arg4[local12]; local25++) {
				local4[local23++] = -1;
			}
		}
		return new Class15_Sub1(arg1, arg2, arg0, local4);
	}
}
