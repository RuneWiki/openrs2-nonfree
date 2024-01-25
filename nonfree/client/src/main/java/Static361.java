import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "([ILclient!ge;II[II)Lclient!fn;")
	public static Class74_Sub1 method1548(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class81_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) byte[] local4 = new byte[arg3 * arg2];
		for (@Pc(6) int local6 = 0; local6 < arg2; local6++) {
			@Pc(17) int local17 = arg3 * local6 + arg0[local6];
			for (@Pc(19) int local19 = 0; local19 < arg4[local6]; local19++) {
				local4[local17++] = -1;
			}
		}
		return new Class74_Sub1(arg1, arg3, arg2, local4);
	}
}
