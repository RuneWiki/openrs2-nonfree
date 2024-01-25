import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static638 {

	@OriginalMember(owner = "client!vj", name = "H", descriptor = "Lclient!uu;")
	public static Class239 aClass239_10;

	@OriginalMember(owner = "client!vj", name = "v", descriptor = "[I")
	public static final int[] anIntArray837 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!vj", name = "w", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_145 = new Class218(1, 4);

	@OriginalMember(owner = "client!vj", name = "D", descriptor = "I")
	public static int anInt9655 = 0;

	@OriginalMember(owner = "client!vj", name = "G", descriptor = "Z")
	public static boolean aBoolean742 = false;

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)V")
	public static void method8433(@OriginalArg(1) int arg0) {
		Static122.anInt2525 = 3;
		Static43.anInt1024 = 100;
		Static246.anInt4481 = -1;
		Static30.anInt575 = arg0;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(BIIII)V")
	public static void method8434(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static374.anInt5986 <= arg1 && Static84.anInt1667 >= arg1) {
			@Pc(24) int local24 = Static120.method2296(arg3, Static7.anInt93, Static115.anInt2377);
			@Pc(30) int local30 = Static120.method2296(arg2, Static7.anInt93, Static115.anInt2377);
			Static342.method5136(local24, local30, arg0, arg1);
		}
	}
}
