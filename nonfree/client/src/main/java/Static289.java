import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!jv", name = "f", descriptor = "[B")
	public static byte[] aByteArray50;

	@OriginalMember(owner = "client!jv", name = "c", descriptor = "[J")
	public static final long[] aLongArray11 = new long[10];

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(III)V")
	public static void method3978(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) int local20;
		if (Static421.anInt7443 != arg1) {
			Static207.anIntArray185 = new int[arg1];
			for (local20 = 0; local20 < arg1; local20++) {
				Static207.anIntArray185[local20] = (local20 << 12) / arg1;
			}
			Static146.anInt2428 = arg1 * 32;
			Static575.anInt9380 = arg1 - 1;
			Static421.anInt7443 = arg1;
		}
		if (Static378.anInt6579 == arg0) {
			return;
		}
		if (Static421.anInt7443 == arg0) {
			Static508.anIntArray471 = Static207.anIntArray185;
		} else {
			Static508.anIntArray471 = new int[arg0];
			for (local20 = 0; local20 < arg0; local20++) {
				Static508.anIntArray471[local20] = (local20 << 12) / arg0;
			}
		}
		Static442.anInt7781 = arg0 - 1;
		Static378.anInt6579 = arg0;
	}
}
