import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!ij", name = "I", descriptor = "Lclient!wm;")
	public static Class390 aClass390_60;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "([BIII)[B")
	public static byte[] method4017(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) byte[] local9;
		if (arg2 <= 0) {
			local9 = arg0;
		} else {
			local9 = new byte[arg1];
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				local9[local16] = arg0[local16 + arg2];
			}
		}
		@Pc(38) Class135 local38 = new Class135();
		local38.method3280();
		local38.method3283((long) (arg1 * 8), local9);
		@Pc(57) byte[] local57 = new byte[64];
		local38.method3284(local57);
		return local57;
	}
}
