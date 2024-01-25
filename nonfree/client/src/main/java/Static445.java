import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static445 {

	@OriginalMember(owner = "client!pv", name = "m", descriptor = "[Lclient!td;")
	public static Class24[] aClass24Array15;

	@OriginalMember(owner = "client!pv", name = "n", descriptor = "I")
	public static int anInt7955;

	@OriginalMember(owner = "client!pv", name = "g", descriptor = "Lclient!ufa;")
	public static final Class337 aClass337_12 = new Class337(2, 16);

	@OriginalMember(owner = "client!pv", name = "h", descriptor = "I")
	public static int anInt7952 = 0;

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IB)I")
	public static int method6913(@OriginalArg(0) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)V")
	public static void method6914() {
		if (Static407.aClass135_14 != Static2.aClass135_1) {
			try {
				Static646.method3052(Static116.aClient1, "tbrefresh");
			} catch (@Pc(21) Throwable local21) {
			}
		}
	}
}
