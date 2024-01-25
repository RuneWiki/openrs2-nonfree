import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "[S")
	public static short[] aShortArray95;

	@OriginalMember(owner = "client!ll", name = "d", descriptor = "I")
	public static int anInt5077;

	@OriginalMember(owner = "client!ll", name = "k", descriptor = "I")
	public static int anInt5082;

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "Ljava/lang/Object;")
	public static volatile Object anObject15 = null;

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(II)I")
	public static int method4403(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 & 0x3F;
		@Pc(13) int local13 = arg0 >> 6 & 0x3;
		if (local7 == 18) {
			if (local13 == 0) {
				return 1;
			}
			if (local13 == 1) {
				return 2;
			}
			if (local13 == 2) {
				return 4;
			}
			if (local13 == 3) {
				return 8;
			}
		} else if (local7 == 19 || local7 == 21) {
			if (local13 == 0) {
				return 16;
			}
			if (local13 == 1) {
				return 32;
			}
			if (local13 == 2) {
				return 64;
			}
			if (local13 == 3) {
				return 128;
			}
		}
		return 0;
	}
}
