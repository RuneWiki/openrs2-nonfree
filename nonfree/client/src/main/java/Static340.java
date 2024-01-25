import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
	public static int anInt3935;

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "Z")
	public static boolean aBoolean337;

	@OriginalMember(owner = "client!wa", name = "i", descriptor = "Lclient!qj;")
	public static Class165 aClass165_60;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "[I")
	public static final int[] anIntArray471 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
	public static int anInt3938 = 0;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "([[IB)V")
	public static void method3660(@OriginalArg(0) int[][] arg0) {
		Static327.anIntArrayArray63 = arg0;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method3661(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static227.anInt4474; local11++) {
			if (arg0.equalsIgnoreCase(Static66.aStringArray6[local11])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static94.aStringArray12[local11])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZI)Lclient!to;")
	public static Class199 method3663(@OriginalArg(1) int arg0) {
		@Pc(10) Class199 local10 = (Class199) Static234.aClass140_122.method3816((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static82.aClass165_27.method4508(arg0, 4);
		local10 = new Class199();
		if (local24 != null) {
			local10.method5147(new Class1_Sub7(local24), arg0);
		}
		local10.method5144(arg0);
		Static234.aClass140_122.method3817((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(BLclient!eb;)Lclient!s;")
	public static Class10_Sub4 method3664(@OriginalArg(1) Class1_Sub7 arg0) {
		return new Class10_Sub4(arg0.method3090(), arg0.method3090(), arg0.method3090(), arg0.method3090(), arg0.method3090(), arg0.method3090(), arg0.method3090(), arg0.method3090(), arg0.method3137(), arg0.method3141());
	}
}
