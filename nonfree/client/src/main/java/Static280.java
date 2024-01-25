import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!nn", name = "g", descriptor = "Lclient!qc;")
	public static Class196 aClass196_3;

	@OriginalMember(owner = "client!nn", name = "d", descriptor = "Z")
	public static boolean aBoolean333 = false;

	@OriginalMember(owner = "client!nn", name = "f", descriptor = "I")
	public static int anInt4669 = -1;

	@OriginalMember(owner = "client!nn", name = "h", descriptor = "[I")
	public static final int[] anIntArray313 = new int[1];

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (Static399.anInt2866 <= arg2 && arg3 <= Static372.anInt6316 && Static316.anInt5349 <= arg1 && Static418.anInt7030 >= arg4) {
			Static277.method4102(arg1, arg4, arg5, arg2, arg6, arg3, arg0);
		} else {
			Static385.method5387(arg0, arg6, arg3, arg4, arg5, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIIIFIZI)[I")
	public static int[] method3859(@OriginalArg(4) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class3_Sub4_Sub32 local10 = new Class3_Sub4_Sub32();
		local10.anInt5851 = 8;
		local10.anInt5858 = (int) (arg0 * 4096.0F);
		local10.anInt5857 = 8;
		local10.aBoolean411 = true;
		local10.anInt5855 = 4;
		local10.anInt5860 = 35;
		local10.method6146();
		Static110.method1806(2048, 1);
		local10.method4858(0, local6);
		return local6;
	}
}
