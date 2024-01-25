import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static10 {

	@OriginalMember(owner = "client!aea", name = "k", descriptor = "F")
	public static float aFloat2;

	@OriginalMember(owner = "client!aea", name = "l", descriptor = "Lclient!om;")
	public static Class246 aClass246_11;

	@OriginalMember(owner = "client!aea", name = "q", descriptor = "[Lclient!f;")
	public static Class46[] aClass46Array1;

	@OriginalMember(owner = "client!aea", name = "r", descriptor = "I")
	public static int anInt123;

	@OriginalMember(owner = "client!aea", name = "n", descriptor = "[I")
	public static final int[] anIntArray17 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!aea", name = "o", descriptor = "[I")
	public static final int[] anIntArray18 = new int[50];

	@OriginalMember(owner = "client!aea", name = "p", descriptor = "[I")
	public static final int[] anIntArray19 = new int[2048];

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(ILclient!cd;)Z")
	public static boolean method121(@OriginalArg(1) Class40 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean94) {
			return false;
		} else if (!arg0.method1125(Static284.anInterface21_2)) {
			return false;
		} else if (Static586.aClass310_40.method6601((long) arg0.anInt1379) == null) {
			return Static97.aClass310_8.method6601((long) arg0.anInt1395) == null;
		} else {
			return false;
		}
	}
}
