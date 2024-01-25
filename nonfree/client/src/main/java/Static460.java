import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static460 {

	@OriginalMember(owner = "client!pia", name = "eb", descriptor = "[B")
	public static final byte[] aByteArray73 = new byte[2048];

	@OriginalMember(owner = "client!pia", name = "b", descriptor = "(III)Z")
	public static boolean method6619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static317.method4991(arg1, arg0)) {
			return (arg0 & 0x9000) != 0 | Static545.method7550(arg0, arg1) | Static388.method5659(arg0, arg1) ? true : (Static619.method8223(arg1, arg0) | (arg0 & 0x2000) != 0 | Static239.method3853(arg0, arg1)) & (arg1 & 0x37) == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pia", name = "c", descriptor = "(III)Z")
	public static boolean method6620(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x34) != 0;
	}
}
