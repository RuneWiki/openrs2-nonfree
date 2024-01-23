import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static263 {

	@OriginalMember(owner = "client!tb", name = "n", descriptor = "Z")
	public static boolean aBoolean329;

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "Lclient!jl;")
	public static Class89 aClass89_42 = new Class89(5);

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
	public static int anInt5294 = -1;

	@OriginalMember(owner = "client!tb", name = "l", descriptor = "[I")
	public static int[] anIntArray479 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
	public static int anInt5300 = 0;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V")
	public static void method4011() {
		Static34.aClass191ArrayArray1 = new Class191[Static130.aClass168_99.method4075()][];
		Static103.aBooleanArray17 = new boolean[Static130.aClass168_99.method4075()];
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)I")
	public static int method4012(@OriginalArg(0) int arg0) {
		if (arg0 > 0) {
			return 1;
		} else if (arg0 < 0) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
	public static void method4013() {
		Static111.aClass186_7 = new Class186(32);
	}
}
