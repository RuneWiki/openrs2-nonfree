import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(III[I[ILclient!vj;)Lclient!eca;")
	public static Class81_Sub1 method7904(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Class45_Sub3 arg4) {
		@Pc(10) byte[] local10 = new byte[arg0 * arg1];
		for (@Pc(17) int local17 = 0; local17 < arg0; local17++) {
			@Pc(27) int local27 = arg1 * local17 + arg3[local17];
			for (@Pc(29) int local29 = 0; local29 < arg2[local17]; local29++) {
				local10[local27++] = -1;
			}
		}
		return new Class81_Sub1(arg4, arg1, arg0, local10);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(III)Z")
	public static boolean method7905(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x580) != 0;
	}
}
