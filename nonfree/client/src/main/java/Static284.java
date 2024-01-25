import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!ks", name = "i", descriptor = "Lclient!xa;")
	public static Class37 aClass37_32;

	@OriginalMember(owner = "client!ks", name = "o", descriptor = "Lclient!oo;")
	public static Class247 aClass247_7;

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ZI[BI)[B")
	public static byte[] method6244(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(10) byte[] local10;
		if (arg2 <= 0) {
			local10 = arg1;
		} else {
			local10 = new byte[arg0];
			for (@Pc(16) int local16 = 0; local16 < arg0; local16++) {
				local10[local16] = arg1[arg2 + local16];
			}
		}
		@Pc(33) Class262 local33 = new Class262();
		local33.method6742();
		local33.method6741((long) (arg0 * 8), local10);
		@Pc(47) byte[] local47 = new byte[64];
		local33.method6743(local47);
		return local47;
	}
}
