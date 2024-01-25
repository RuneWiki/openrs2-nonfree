import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static144 {

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
	public static int anInt2707;

	@OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
	public static int anInt2716;

	@OriginalMember(owner = "client!ha", name = "s", descriptor = "I")
	public static int anInt2719;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "[I")
	public static final int[] anIntArray186 = new int[2048];

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_85 = new Class186(42, 2);

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "J")
	public static long aLong68 = 0L;

	@OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
	public static int anInt2718 = -1;

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString25 = null;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)Z")
	public static boolean method2102(@OriginalArg(0) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)I")
	public static int method2104() {
		if (Static269.aFrame1 == null) {
			return Static51.aBoolean91 ? 2 : 1;
		} else {
			return 3;
		}
	}
}
