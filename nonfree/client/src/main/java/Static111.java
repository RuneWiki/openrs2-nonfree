import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "Lclient!im;")
	public static Class149 aClass149_11;

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_172 = new Class56(104, -1);

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "[I")
	public static final int[] anIntArray568 = new int[64];

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
	public static int anInt8659 = 0;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILclient!wp;I)I")
	public static int method7201(@OriginalArg(0) int arg0, @OriginalArg(1) Class361 arg1) {
		if (!Static71.method1520(arg1).method5122(arg0) && arg1.anObjectArray4 == null) {
			return -1;
		} else if (arg1.anIntArray632 == null || arg0 >= arg1.anIntArray632.length) {
			return -1;
		} else {
			return arg1.anIntArray632[arg0];
		}
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V")
	public static void method7204() {
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			Static413.aClass359Array1[local7] = null;
		}
		Static389.anInt410 = 0;
	}
}
