import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static61 {

	@OriginalMember(owner = "client!dn", name = "j", descriptor = "Lclient!nq;")
	public static Class144 aClass144_22;

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
	public static int anInt1143 = 0;

	@OriginalMember(owner = "client!dn", name = "i", descriptor = "J")
	public static long aLong36 = 0L;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IB)Lclient!pg;")
	public static Class157_Sub1 method915(@OriginalArg(0) int arg0) {
		return Static103.aBoolean113 && Static232.anInt4702 <= arg0 && Static284.anInt5615 >= arg0 ? Static80.aClass157_Sub1Array7[arg0 - Static232.anInt4702] : null;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIII)I")
	public static int method917(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 >= arg0) {
			return arg1 <= arg2 ? arg1 : arg2;
		} else {
			return arg0;
		}
	}
}
