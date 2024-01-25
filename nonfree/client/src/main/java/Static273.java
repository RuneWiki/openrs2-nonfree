import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!jea", name = "o", descriptor = "I")
	public static int anInt4769;

	@OriginalMember(owner = "client!jea", name = "l", descriptor = "Lclient!el;")
	public static final Class109 aClass109_105 = new Class109(60, 2);

	@OriginalMember(owner = "client!jea", name = "b", descriptor = "I")
	public static int anInt4776 = -1;

	@OriginalMember(owner = "client!jea", name = "b", descriptor = "(I)I")
	public static int method4046() {
		return Static339.anInt6034;
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(II)V")
	public static void method4048(@OriginalArg(1) int arg0) {
		Static75.anIntArray55 = new int[arg0];
		Static203.anIntArray193 = new int[arg0];
		Static163.anIntArray143 = new int[arg0];
		Static596.anIntArray553 = new int[arg0];
		Static246.anIntArray241 = new int[arg0];
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method4049(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg4; local7 <= arg2; local7++) {
			for (@Pc(13) int local13 = arg3; local13 <= arg1; local13++) {
				if (Static300.anIntArrayArray34[local7][local13] == arg0 && Static555.anIntArrayArray50[local7][local13] <= 1) {
					return true;
				}
			}
		}
		if (false) {
			return true;
		} else {
			return false;
		}
	}
}
