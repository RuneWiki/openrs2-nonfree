import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static558 {

	@OriginalMember(owner = "client!vi", name = "J", descriptor = "I")
	public static int anInt10185;

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(II)I")
	public static int method7915(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "(II)Lclient!is;")
	public static Class155 method7916(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static535.aClass155ArrayArray2[local7] == null || Static535.aClass155ArrayArray2[local7][local16] == null) {
			@Pc(30) boolean local30 = Static420.method6283(local7);
			if (!local30) {
				return null;
			}
		}
		return Static535.aClass155ArrayArray2[local7][local16];
	}
}
