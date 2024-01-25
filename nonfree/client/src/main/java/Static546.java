import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static546 {

	@OriginalMember(owner = "client!wv", name = "l", descriptor = "[[[Lclient!sk;")
	public static Class262[][][] aClass262ArrayArrayArray4;

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(ZI)I")
	public static int method7804(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(33) int local33 = (arg0 * local24 >> 12) + 40960;
		return local13 * local33 >> 12;
	}
}
