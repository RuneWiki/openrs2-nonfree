import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static485 {

	@OriginalMember(owner = "client!sp", name = "w", descriptor = "Lclient!fg;")
	public static Class3_Sub14_Sub1 aClass3_Sub14_Sub1_2;

	@OriginalMember(owner = "client!sp", name = "z", descriptor = "[I")
	public static final int[] anIntArray585 = new int[50];

	@OriginalMember(owner = "client!sp", name = "A", descriptor = "I")
	public static int anInt9061 = 0;

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!dt;I)Z")
	public static boolean method7416(@OriginalArg(0) Class70 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean184) {
			return false;
		} else if (!arg0.method2132(Static87.anInterface15_2)) {
			return false;
		} else if (Static8.aClass25_1.method946((long) arg0.anInt2373) == null) {
			return Static516.aClass25_15.method946((long) arg0.anInt2390) == null;
		} else {
			return false;
		}
	}
}
