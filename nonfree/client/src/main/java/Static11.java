import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ak", name = "h", descriptor = "I")
	public static int anInt180;

	@OriginalMember(owner = "client!ak", name = "i", descriptor = "Lclient!ja;")
	public static Class125 aClass125_1;

	@OriginalMember(owner = "client!ak", name = "g", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_8 = new Class25(39, 7);

	@OriginalMember(owner = "client!ak", name = "k", descriptor = "[J")
	public static final long[] aLongArray1 = new long[100];

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIB)V")
	public static void method147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17;
		if (arg1 != Static185.anInt4925) {
			Static53.anIntArray95 = new int[arg1];
			for (local17 = 0; local17 < arg1; local17++) {
				Static53.anIntArray95[local17] = (local17 << 12) / arg1;
			}
			Static319.anInt5200 = arg1 * 32;
			Static64.anInt1348 = arg1 - 1;
			Static185.anInt4925 = arg1;
		}
		if (arg0 == Static345.anInt5779) {
			return;
		}
		if (Static185.anInt4925 == arg0) {
			Static168.anIntArray278 = Static53.anIntArray95;
		} else {
			Static168.anIntArray278 = new int[arg0];
			for (local17 = 0; local17 < arg0; local17++) {
				Static168.anIntArray278[local17] = (local17 << 12) / arg0;
			}
		}
		Static345.anInt5779 = arg0;
		Static296.anInt4928 = arg0 - 1;
	}
}
