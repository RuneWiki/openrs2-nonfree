import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!td", name = "c", descriptor = "I")
	public static int anInt6272;

	@OriginalMember(owner = "client!td", name = "b", descriptor = "[J")
	public static final long[] aLongArray8 = new long[100];

	@OriginalMember(owner = "client!td", name = "a", descriptor = "([Lclient!hm;IIIIZ)V")
	public static void method5057(@OriginalArg(0) Class107[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(23) Class107 local23 = arg0[local7];
			if (local23 != null && local23.anInt2624 == arg1) {
				Static48.method650(local23, arg3, arg4, arg2);
				Static100.method1175(local23, arg3, arg2);
				if (local23.anInt2663 > local23.lb - local23.anInt2648) {
					local23.anInt2663 = local23.lb - local23.anInt2648;
				}
				if (local23.anInt2663 < 0) {
					local23.anInt2663 = 0;
				}
				if (local23.anInt2646 > local23.anInt2597 - local23.anInt2606) {
					local23.anInt2646 = local23.anInt2597 - local23.anInt2606;
				}
				if (local23.anInt2646 < 0) {
					local23.anInt2646 = 0;
				}
				if (local23.anInt2598 == 0) {
					Static213.method3088(arg4, local23);
				}
			}
		}
	}
}
