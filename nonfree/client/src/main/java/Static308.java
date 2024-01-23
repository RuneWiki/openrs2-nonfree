import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!wm", name = "f", descriptor = "I")
	public static int anInt5870;

	@OriginalMember(owner = "client!wm", name = "g", descriptor = "Lclient!vh;")
	public static Class177 aClass177_8;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "I")
	public static int anInt5865 = -1;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(BI)V")
	public static void method4714(@OriginalArg(1) int arg0) {
		Static237.anIntArray377 = new int[arg0];
		Static307.anIntArray488 = new int[arg0];
		Static1.anIntArray1 = new int[arg0];
		Static148.anIntArray236 = new int[arg0];
		Static241.anIntArray379 = new int[arg0];
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IZ)I")
	public static int method4715(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(28) int local28 = local22 | local22 >>> 8;
		@Pc(38) int local38 = local28 | local28 >>> 16;
		return local38 + 1;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method4717(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(21) int local21 = 0; local21 < Static149.anInt2911; local21++) {
			if (arg0.equalsIgnoreCase(Static135.aStringArray15[local21])) {
				return local21;
			}
		}
		return -1;
	}
}
