import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static316 {

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "Lclient!ps;")
	public static Class2_Sub31 aClass2_Sub31_1;

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "I")
	public static int anInt6233;

	@OriginalMember(owner = "client!tp", name = "e", descriptor = "I")
	public static int anInt6235;

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "[I")
	public static final int[] anIntArray486 = new int[14];

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lclient!fc;B)Z")
	public static boolean method5254(@OriginalArg(0) Class66 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean155) {
			return false;
		} else if (!arg0.method1811()) {
			return false;
		} else if (Static76.aClass41_9.method902((long) arg0.anInt1734) == null) {
			return Static19.aClass41_2.method902((long) arg0.anInt1764) == null;
		} else {
			return false;
		}
	}
}
