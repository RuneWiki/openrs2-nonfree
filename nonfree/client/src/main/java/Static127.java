import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!ega", name = "n", descriptor = "[I")
	public static int[] anIntArray170;

	@OriginalMember(owner = "client!ega", name = "t", descriptor = "[I")
	public static int[] anIntArray172;

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(II)S")
	public static short method2248(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = arg0 >> 10 & 0x3F;
		@Pc(20) int local20 = arg0 >> 3 & 0x70;
		@Pc(24) int local24 = arg0 & 0x7F;
		@Pc(42) int local42 = local24 > 64 ? local20 * (127 - local24) >> 7 : local24 * local20 >> 7;
		@Pc(46) int local46 = local42 + local24;
		@Pc(57) int local57;
		if (local46 == 0) {
			local57 = local42 << 1;
		} else {
			local57 = (local42 << 8) / local46;
		}
		return (short) (local14 << 10 | local57 >> 4 << 7 | local46);
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(B)V")
	public static void method2249() {
		Static561.anIntArray583 = Static140.method2403(0.4F);
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(IZ)I")
	public static int method2250(@OriginalArg(1) boolean arg0) {
		@Pc(10) int local10 = Static424.anInt7715;
		if (local10 == 0) {
			return arg0 ? 0 : Static2.anInt5;
		} else if (local10 == 1) {
			return Static2.anInt5;
		} else if (local10 == 2) {
			return 0;
		} else {
			return 0;
		}
	}
}
