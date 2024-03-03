import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IB)Lclient!rt;", line = 20)
	public static Class209 method2486(@OriginalArg(0) int arg0) {
		@Pc(8) Class209[] local8 = Static144.method2772();
		for (@Pc(15) int local15 = 0; local15 < local8.length; local15++) {
			@Pc(21) Class209 local21 = local8[local15];
			if (local21.anInt5791 == arg0) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZLjava/lang/String;)Z", line = 59)
	public static boolean method2487(@OriginalArg(1) String arg0) {
		return Static317.method5767(arg0);
	}
}
