import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!ui", name = "j", descriptor = "[[S")
	public static final short[][] aShortArrayArray5 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method5452(@OriginalArg(1) String arg0) {
		@Pc(9) String local9 = Static414.method5553(Static353.method4997(arg0));
		if (local9 == null) {
			local9 = "";
		}
		return local9;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)I")
	public static int method5454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0 >>> 24;
		@Pc(12) int local12 = 255 - local7;
		@Pc(30) int local30 = ((arg0 & 0xFF00) * local7 & 0xFF0000 | local7 * (arg0 & 0xFF00FF) & 0xFF00FF00) >>> 8;
		return local30 + ((local12 * (arg1 & 0xFF00) & 0xFF0000 | local12 * (arg1 & 0xFF00FF) & 0xFF00FF00) >>> 8);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(BZ)V")
	public static void method5458() {
		Static414.method5552(Static326.aClass92_196);
		for (@Pc(17) Class3_Sub40 local17 = (Class3_Sub40) Static30.aClass127_3.method3248(); local17 != null; local17 = (Class3_Sub40) Static30.aClass127_3.method3252()) {
			if (!local17.method5985()) {
				local17 = (Class3_Sub40) Static30.aClass127_3.method3248();
				if (local17 == null) {
					break;
				}
			}
			if (local17.anInt6670 == 0) {
				Static316.method4612(true, true, local17);
			}
		}
		if (Static426.aClass68_13 != null) {
			Static442.method5899(Static426.aClass68_13);
			Static426.aClass68_13 = null;
		}
	}
}
