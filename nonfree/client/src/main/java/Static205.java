import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static205 {

	@OriginalMember(owner = "client!im", name = "w", descriptor = "Lclient!dn;")
	public static Class69 aClass69_73;

	@OriginalMember(owner = "client!im", name = "v", descriptor = "J")
	public static long aLong179 = 0L;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(III)I")
	public static int method5908(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}
}
