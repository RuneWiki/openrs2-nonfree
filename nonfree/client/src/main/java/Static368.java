import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "([IILclient!h;I[II)Lclient!kk;")
	public static Class52_Sub2 method3166(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class32_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		@Pc(4) byte[] local4 = new byte[arg4 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg4; local12++) {
			@Pc(27) int local27 = arg3[local12] + local12 * arg2;
			for (@Pc(29) int local29 = 0; local29 < arg0[local12]; local29++) {
				local4[local27++] = -1;
			}
		}
		return new Class52_Sub2(arg1, arg2, arg4, local4);
	}
}
