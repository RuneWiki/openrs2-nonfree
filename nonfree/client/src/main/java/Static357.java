import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!nf;II[I[IB)Lclient!as;")
	public static Class15_Sub1 method320(@OriginalArg(0) Class105_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) byte[] local4 = new byte[arg1 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg2; local12++) {
			@Pc(27) int local27 = arg1 * local12 + arg4[local12];
			for (@Pc(29) int local29 = 0; local29 < arg3[local12]; local29++) {
				local4[local27++] = -1;
			}
		}
		return new Class15_Sub1(arg0, arg1, arg2, local4);
	}
}
