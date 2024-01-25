import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!aq", name = "i", descriptor = "[I")
	public static final int[] anIntArray48 = new int[1000];

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(BB)Z")
	public static boolean method287(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			return false;
		} else {
			return local7 < 128 || local7 >= 160 || Static279.aCharArray4[local7 - 128] != '\u0000';
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(ZII)Z")
	public static boolean method290(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(BII)Z")
	public static boolean method291(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static172.method2259(arg1, arg0) || Static511.method7272(arg0, arg1);
	}
}
