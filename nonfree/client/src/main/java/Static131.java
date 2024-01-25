import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
	public static int anInt2508;

	@OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
	public static int anInt2511;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIIB)V")
	public static void method2099(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 >= Static293.anInt4886 && arg0 <= Static137.anInt2576) {
			@Pc(19) int local19 = Static278.method3708(arg2, Static82.anInt1667, Static316.anInt5188);
			@Pc(25) int local25 = Static278.method3708(arg3, Static82.anInt1667, Static316.anInt5188);
			Static359.method4607(arg1, local25, local19, arg0);
		}
	}
}
