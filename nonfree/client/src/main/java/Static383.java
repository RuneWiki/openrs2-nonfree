import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(II)Lclient!or;")
	public static Class260 method5492(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static489.aClass260ArrayArray3[local7] == null || Static489.aClass260ArrayArray3[local7][local11] == null) {
			@Pc(25) boolean local25 = Static27.method666(local7);
			if (!local25) {
				return null;
			}
		}
		return Static489.aClass260ArrayArray3[local7][local11];
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(II)Z")
	public static boolean method5493(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}
}
