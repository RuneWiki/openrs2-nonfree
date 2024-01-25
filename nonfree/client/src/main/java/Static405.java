import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static405 {

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(II[IB[ILclient!fu;)Lclient!tk;")
	public static Class165_Sub2 method4897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Class63_Sub2 arg4) {
		@Pc(4) byte[] local4 = new byte[arg0 * arg1];
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			@Pc(27) int local27 = local12 * arg0 + arg2[local12];
			for (@Pc(29) int local29 = 0; local29 < arg3[local12]; local29++) {
				local4[local27++] = -1;
			}
		}
		return new Class165_Sub2(arg4, arg0, arg1, local4);
	}
}
