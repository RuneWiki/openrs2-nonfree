import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "Lclient!vm;")
	public static Class345 aClass345_1;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
	public static int anInt2342 = 0;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(CB)Z")
	public static boolean method2019(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIII)I")
	public static int method2021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg2 & 0x3;
		if (local8 == 0) {
			return arg0;
		} else if (local8 == 1) {
			return 7 - arg1;
		} else if (local8 == 2) {
			return 7 - arg0;
		} else {
			return arg1;
		}
	}
}
