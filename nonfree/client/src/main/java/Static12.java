import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!al", name = "E", descriptor = "I")
	public static int anInt317;

	@OriginalMember(owner = "client!al", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString17 = "flash2:";

	@OriginalMember(owner = "client!al", name = "P", descriptor = "[I")
	public static int[] anIntArray14 = new int[100];

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(BLclient!jd;Lclient!jd;)V")
	public static void method275(@OriginalArg(1) Class84 arg0, @OriginalArg(2) Class84 arg1) {
		Static144.aClass84_58 = arg0;
		Static124.aClass84_52 = arg1;
		Static122.anInt2601 = Static124.aClass84_52.method2116(3);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IZIZI)V")
	public static void method278(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		Static177.method3090(Static278.aClass132_Sub1Array2.length - 1, 0, arg3, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(III)I")
	public static int method279(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(36) int local36 = Static118.method2182(arg0 + 91923, 4, arg1 + 45365) + (Static118.method2182(arg0 + 37821, 2, arg1 + 10294) - 128 >> 1) + (Static118.method2182(arg0, 1, arg1) + -128 >> 2) - 128;
		local36 = (int) ((double) local36 * 0.3D) + 35;
		if (local36 < 10) {
			local36 = 10;
		} else if (local36 > 60) {
			local36 = 60;
		}
		return local36;
	}
}
