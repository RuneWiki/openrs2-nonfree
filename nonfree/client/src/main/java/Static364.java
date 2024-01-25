import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "([IILclient!sq;II[I)Lclient!ob;")
	public static Class156_Sub1 method4004(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class46_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[] arg4) {
		@Pc(4) byte[] local4 = new byte[arg1 * arg3];
		for (@Pc(6) int local6 = 0; local6 < arg1; local6++) {
			@Pc(22) int local22 = arg3 * local6 + arg0[local6];
			for (@Pc(24) int local24 = 0; local24 < arg4[local6]; local24++) {
				local4[local22++] = -1;
			}
		}
		return new Class156_Sub1(arg2, arg3, arg1, local4);
	}
}
