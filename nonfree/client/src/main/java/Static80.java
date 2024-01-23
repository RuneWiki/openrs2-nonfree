import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!g", name = "i", descriptor = "[Lclient!el;")
	public static Class45[] aClass45Array1;

	@OriginalMember(owner = "client!g", name = "f", descriptor = "I")
	public static int anInt1772 = 0;

	@OriginalMember(owner = "client!g", name = "m", descriptor = "[Lclient!nb;")
	public static Class11_Sub5[] aClass11_Sub5Array1 = new Class11_Sub5[4];

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIZ)I")
	public static int method1666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return arg0;
		} else if (local7 == 2) {
			return 1023 - arg1;
		} else {
			return 1023 - arg0;
		}
	}
}
