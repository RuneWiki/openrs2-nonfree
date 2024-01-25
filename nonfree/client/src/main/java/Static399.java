import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static399 {

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "([IIILclient!mi;[II)Lclient!ft;")
	public static Class38_Sub2 method1787(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class155_Sub1 arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		@Pc(4) byte[] local4 = new byte[arg4 * arg1];
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			@Pc(27) int local27 = arg0[local12] + arg4 * local12;
			for (@Pc(29) int local29 = 0; local29 < arg3[local12]; local29++) {
				local4[local27++] = -1;
			}
		}
		return new Class38_Sub2(arg2, arg4, arg1, local4);
	}
}
