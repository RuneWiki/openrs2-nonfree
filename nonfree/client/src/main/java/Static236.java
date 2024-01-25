import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!iw", name = "e", descriptor = "I")
	public static int anInt4818;

	@OriginalMember(owner = "client!iw", name = "f", descriptor = "Lclient!xa;")
	public static Class66 aClass66_23;

	@OriginalMember(owner = "client!iw", name = "d", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_87 = new Class254(10, -1);

	@OriginalMember(owner = "client!iw", name = "h", descriptor = "Lclient!gl;")
	public static final Class117 aClass117_8 = new Class117(14, 7);

	@OriginalMember(owner = "client!iw", name = "i", descriptor = "J")
	public static long aLong100 = 0L;

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIIBI)V")
	public static void method4130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static96.anInt2302 <= arg1 && arg1 <= Static289.anInt5545) {
			@Pc(11) int local11 = Static501.method4264(arg3, Class179_Sub2.lb, Static376.anInt7071);
			@Pc(17) int local17 = Static501.method4264(arg0, Class179_Sub2.lb, Static376.anInt7071);
			Static228.method4071(arg2, local11, arg1, local17);
		}
	}
}
