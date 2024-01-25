import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static301 {

	@OriginalMember(owner = "client!ln", name = "J", descriptor = "I")
	public static int anInt6078;

	@OriginalMember(owner = "client!ln", name = "N", descriptor = "J")
	public static long aLong158;

	@OriginalMember(owner = "client!ln", name = "O", descriptor = "Z")
	public static boolean aBoolean426 = false;

	@OriginalMember(owner = "client!ln", name = "R", descriptor = "[I")
	public static int[] anIntArray332 = new int[2];

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!hp;I)I")
	public static int method4796(@OriginalArg(0) Class143 arg0) {
		if (arg0 == Static278.aClass143_2) {
			return 9216;
		} else if (arg0 == Static424.aClass143_3) {
			return 34065;
		} else if (arg0 == Static153.aClass143_1) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
