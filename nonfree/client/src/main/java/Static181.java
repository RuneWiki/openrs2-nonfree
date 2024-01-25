import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!hg", name = "w", descriptor = "Lclient!gf;")
	public static Class1_Sub21 aClass1_Sub21_1;

	@OriginalMember(owner = "client!hg", name = "x", descriptor = "Lclient!rn;")
	public static Class45 aClass45_3;

	@OriginalMember(owner = "client!hg", name = "p", descriptor = "Lclient!im;")
	public static final Class140 aClass140_58 = new Class140(18, -2);

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIII)I")
	public static int method2703(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg1;
		}
	}
}
