import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static288 {

	@OriginalMember(owner = "client!kr", name = "e", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray86;

	@OriginalMember(owner = "client!kr", name = "f", descriptor = "I")
	public static int anInt5200;

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "Lclient!kp;")
	public static Class196 aClass196_3 = null;

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lclient!pl;I[ILclient!pl;)V")
	public static void method4276(@OriginalArg(0) Class259 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class259 arg2) {
		if (arg1 != null) {
			Static510.anIntArray605 = arg1;
		}
		Static290.aClass259_87 = arg2;
		Static312.aClass259_97 = arg0;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V")
	public static void method4277() {
		Static493.aClass313_53.method6977();
		Static167.aClass313_21.method6977();
		Static545.aClass313_56.method6977();
		Static545.aClass313_57.method6977();
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IB)I")
	public static int method4279(@OriginalArg(0) int arg0) {
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
}
