import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
	public static int anInt5941;

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "Lclient!vh;")
	public static Class250 aClass250_70;

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "[I")
	public static int[] anIntArray469;

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "Z")
	public static boolean aBoolean386 = false;

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "Lclient!ff;")
	public static final Class83 aClass83_50 = new Class83(10);

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V")
	public static void method4806() {
		Static199.aClass83_32.method1667();
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)I")
	public static int method4808(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(48) int local48 = Static232.method3440(arg1 + 45365, arg0 + 91923, 4) + (Static232.method3440(arg1 + 10294, arg0 + 37821, 2) - 128 >> 1) + (Static232.method3440(arg1, arg0, 1) - 128 >> 2) - 128;
		local48 = (int) ((double) local48 * 0.3D) + 35;
		if (local48 < 10) {
			local48 = 10;
		} else if (local48 > 60) {
			local48 = 60;
		}
		return local48;
	}
}
