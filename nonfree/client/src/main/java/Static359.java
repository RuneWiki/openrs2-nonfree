import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(II[IILclient!se;[I)Lclient!gl;")
	public static Class74_Sub1 method1780(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class122_Sub2 arg3, @OriginalArg(5) int[] arg4) {
		@Pc(4) byte[] local4 = new byte[arg2 * arg0];
		for (@Pc(12) int local12 = 0; local12 < arg2; local12++) {
			@Pc(23) int local23 = arg1[local12] + local12 * arg0;
			for (@Pc(25) int local25 = 0; local25 < arg4[local12]; local25++) {
				local4[local23++] = -1;
			}
		}
		return new Class74_Sub1(arg3, arg0, arg2, local4);
	}
}
