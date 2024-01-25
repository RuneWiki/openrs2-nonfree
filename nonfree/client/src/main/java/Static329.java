import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static329 {

	@OriginalMember(owner = "client!mga", name = "x", descriptor = "I")
	public static int anInt7877 = 0;

	@OriginalMember(owner = "client!mga", name = "y", descriptor = "J")
	public static long aLong225 = 0L;

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(Lclient!gb;I)I")
	public static int method6551(@OriginalArg(0) Class108 arg0) {
		if (Static164.aClass108_3 == arg0) {
			return 5890;
		} else if (arg0 == Static425.aClass108_4) {
			return 34167;
		} else if (Static160.aClass108_2 == arg0) {
			return 34168;
		} else if (Static62.aClass108_1 == arg0) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(III)Z")
	public static boolean method6552(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}
}
