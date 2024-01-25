import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static314 {

	@OriginalMember(owner = "client!lo", name = "l", descriptor = "Lclient!pl;")
	public static Class259 aClass259_163;

	@OriginalMember(owner = "client!lo", name = "s", descriptor = "Lclient!pl;")
	public static Class259 aClass259_164;

	@OriginalMember(owner = "client!lo", name = "u", descriptor = "F")
	public static float aFloat257;

	@OriginalMember(owner = "client!lo", name = "q", descriptor = "[[Ljava/lang/String;")
	public static final String[][] aStringArrayArray20 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

	@OriginalMember(owner = "client!lo", name = "r", descriptor = "[I")
	public static final int[] anIntArray635 = new int[14];

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILclient!ec;)I")
	public static int method7316(@OriginalArg(1) Class88 arg0) {
		if (Static530.aClass88_15 == arg0) {
			return 6407;
		} else if (arg0 == Static356.aClass88_11) {
			return 6408;
		} else if (arg0 == Static104.aClass88_3) {
			return 6406;
		} else if (Static242.aClass88_10 == arg0) {
			return 6409;
		} else if (Static5.aClass88_1 == arg0) {
			return 6410;
		} else if (Static103.aClass88_2 == arg0) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}
}
