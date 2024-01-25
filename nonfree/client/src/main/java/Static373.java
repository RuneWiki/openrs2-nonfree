import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!ks;[IIBI[I)Lclient!ij;")
	public static Class92_Sub1 method2756(@OriginalArg(0) Class63_Sub1 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		@Pc(4) byte[] local4 = new byte[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg2; local12++) {
			@Pc(27) int local27 = arg1[local12] + local12 * arg3;
			for (@Pc(29) int local29 = 0; local29 < arg4[local12]; local29++) {
				local4[local27++] = -1;
			}
		}
		return new Class92_Sub1(arg0, arg3, arg2, local4);
	}
}
