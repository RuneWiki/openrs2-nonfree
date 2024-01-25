import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!pu", name = "j", descriptor = "F")
	public static float aFloat131;

	@OriginalMember(owner = "client!pu", name = "l", descriptor = "I")
	public static int anInt6684;

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "I")
	public static int anInt6676 = 0;

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(II)I")
	public static int method5783(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 & 0x3F;
		@Pc(20) int local20 = arg0 >> 6 & 0x3;
		if (local7 == 18) {
			if (local20 == 0) {
				return 1;
			}
			if (local20 == 1) {
				return 2;
			}
			if (local20 == 2) {
				return 4;
			}
			if (local20 == 3) {
				return 8;
			}
		} else if (local7 == 19 || local7 == 21) {
			if (local20 == 0) {
				return 16;
			}
			if (local20 == 1) {
				return 32;
			}
			if (local20 == 2) {
				return 64;
			}
			if (local20 == 3) {
				return 128;
			}
		}
		return 0;
	}
}
