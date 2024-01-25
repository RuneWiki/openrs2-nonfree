import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ZIZ)V")
	public static void method3474(@OriginalArg(2) boolean arg0) {
		Static275.anInt5637--;
		if (Static275.anInt5637 == 0) {
			Static233.anIntArray394 = null;
		}
		if (!arg0) {
			return;
		}
		Static19.anInt314--;
		if (Static19.anInt314 == 0) {
			Static354.anIntArray519 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(B)V")
	public static void method3475() {
		Static251.aClass107_32.method3015();
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILjava/lang/String;C)I")
	public static int method3476(@OriginalArg(1) String arg0, @OriginalArg(2) char arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(19) int local19 = 0; local19 < local10; local19++) {
			if (arg1 == arg0.charAt(local19)) {
				local7++;
			}
		}
		return local7;
	}
}
