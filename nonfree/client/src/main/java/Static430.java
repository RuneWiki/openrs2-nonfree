import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static430 {

	@OriginalMember(owner = "client!pj", name = "be", descriptor = "Z")
	public static boolean aBoolean476 = false;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(III[B)[B")
	public static byte[] method6207(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(12) byte[] local12;
		if (arg1 <= 0) {
			local12 = arg2;
		} else {
			local12 = new byte[arg0];
			for (@Pc(19) int local19 = 0; local19 < arg0; local19++) {
				local12[local19] = arg2[local19 + arg1];
			}
		}
		@Pc(37) Class253 local37 = new Class253();
		local37.method5638();
		local37.method5636(local12, (long) (arg0 * 8));
		@Pc(60) byte[] local60 = new byte[64];
		local37.method5639(local60);
		return local60;
	}
}
