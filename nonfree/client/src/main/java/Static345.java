import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!rh", name = "v", descriptor = "I")
	public static int anInt6297;

	@OriginalMember(owner = "client!rh", name = "wb", descriptor = "[Lclient!li;")
	public static Class152[] aClass152Array1;

	@OriginalMember(owner = "client!rh", name = "y", descriptor = "[I")
	public static final int[] anIntArray458 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!rh", name = "U", descriptor = "I")
	public static int anInt6315 = 0;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4961(@OriginalArg(1) String arg0) {
		System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZIIII)Lclient!s;")
	public static Class1_Sub38 method4974(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class1_Sub38 local12 = new Class1_Sub38();
		local12.anInt6527 = arg3;
		local12.anInt6524 = arg2;
		Static81.aClass51_5.method931(local12, (long) arg1);
		Static252.method3609(arg3);
		@Pc(33) Class229 local33 = Static203.method1670(arg1);
		if (local33 != null) {
			Static373.method5289(local33);
		}
		if (Static405.aClass229_12 != null) {
			Static373.method5289(Static405.aClass229_12);
			Static405.aClass229_12 = null;
		}
		Static177.method2858();
		if (local33 != null) {
			Static319.method4586(local33, !arg0);
		}
		if (!arg0) {
			Static354.method5065(arg3);
		}
		if (!arg0 && Static246.anInt4292 != -1) {
			Static143.method2301(Static246.anInt4292, 1);
		}
		return local12;
	}
}
