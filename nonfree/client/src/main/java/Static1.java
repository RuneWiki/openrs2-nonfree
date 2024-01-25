import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I[BII)[B")
	public static byte[] method1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(13) byte[] local13;
		if (arg2 > 0) {
			local13 = new byte[arg0];
			for (@Pc(15) int local15 = 0; local15 < arg0; local15++) {
				local13[local15] = arg1[arg2 + local15];
			}
		} else {
			local13 = arg1;
		}
		@Pc(41) Class359 local41 = new Class359();
		local41.method7916();
		local41.method7918(local13, (long) (arg0 * 8));
		@Pc(63) byte[] local63 = new byte[64];
		local41.method7920(local63);
		return local63;
	}
}
