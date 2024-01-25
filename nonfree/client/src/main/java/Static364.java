import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(BI[I[IILclient!ig;)Lclient!nj;")
	public static Class118_Sub2 method3918(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class47_Sub2 arg4) {
		@Pc(4) byte[] local4 = new byte[arg0 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			@Pc(28) int local28 = arg0 * local12 + arg1[local12];
			for (@Pc(30) int local30 = 0; local30 < arg2[local12]; local30++) {
				local4[local28++] = -1;
			}
		}
		return new Class118_Sub2(arg4, arg0, arg3, local4);
	}
}
