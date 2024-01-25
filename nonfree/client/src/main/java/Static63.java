import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!cw", name = "p", descriptor = "[I")
	public static int[] anIntArray87;

	@OriginalMember(owner = "client!cw", name = "u", descriptor = "I")
	public static int anInt1320;

	@OriginalMember(owner = "client!cw", name = "z", descriptor = "Lclient!gl;")
	public static Class94 aClass94_2;

	@OriginalMember(owner = "client!cw", name = "n", descriptor = "[I")
	public static final int[] anIntArray86 = new int[14];

	@OriginalMember(owner = "client!cw", name = "w", descriptor = "Lclient!ff;")
	public static final Class83 aClass83_9 = new Class83(4);

	@OriginalMember(owner = "client!cw", name = "C", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_19 = new Class237(96, 10);

	@OriginalMember(owner = "client!cw", name = "D", descriptor = "I")
	public static int anInt1323 = 0;

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(IIZIII)V")
	public static void method1108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static85.method1427(Static212.anInt452, arg3, Static305.anInt5429);
		@Pc(22) int local22 = Static85.method1427(Static212.anInt452, arg1, Static305.anInt5429);
		@Pc(28) int local28 = Static85.method1427(Static221.anInt4001, arg2, Static83.anInt7380);
		@Pc(34) int local34 = Static85.method1427(Static221.anInt4001, arg4, Static83.anInt7380);
		for (@Pc(36) int local36 = local11; local36 <= local22; local36++) {
			Static217.method3280(Static59.anIntArrayArray34[local36], local28, arg0, local34);
		}
	}
}
