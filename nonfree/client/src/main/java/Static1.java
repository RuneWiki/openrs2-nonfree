import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!aa", name = "q", descriptor = "I")
	public static int anInt16;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)Lclient!on;")
	public static Class146 method16(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static265.aClass146ArrayArray41[local7] == null || Static265.aClass146ArrayArray41[local7][local16] == null) {
			@Pc(30) boolean local30 = Static265.method5886(local7);
			if (!local30) {
				return null;
			}
		}
		return Static265.aClass146ArrayArray41[local7][local16];
	}
}
