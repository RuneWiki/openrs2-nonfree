import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "S")
	public static short aShort61 = 32767;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "([BIII)[B")
	public static byte[] method4463(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) byte[] local11;
		if (arg1 > 0) {
			local11 = new byte[arg2];
			for (@Pc(13) int local13 = 0; local13 < arg2; local13++) {
				local11[local13] = arg0[local13 + arg1];
			}
		} else {
			local11 = arg0;
		}
		@Pc(45) Class198 local45 = new Class198();
		local45.method4241();
		local45.method4243(local11, (long) (arg2 * 8));
		@Pc(59) byte[] local59 = new byte[64];
		local45.method4242(local59);
		return local59;
	}
}
