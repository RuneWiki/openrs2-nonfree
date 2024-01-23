import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!jj", name = "j", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!jj", name = "l", descriptor = "I")
	public static int anInt3685;

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "Lclient!qb;")
	public static Class142 aClass142_18 = new Class142(16);

	@OriginalMember(owner = "client!jj", name = "k", descriptor = "I")
	public static int anInt3684 = -1;

	@OriginalMember(owner = "client!jj", name = "m", descriptor = "I")
	public static int anInt3686 = 0;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V")
	public static void method3147() {
		@Pc(8) int local8 = Static300.method4552();
		if (local8 == 0) {
			Static257.aByteArrayArrayArray20 = null;
			Static240.method3686(0);
		} else if (local8 == 1) {
			Static281.method4344((byte) 0);
			Static240.method3686(512);
			if (Static104.aByteArrayArrayArray3 != null) {
				Static13.method172();
			}
		} else {
			Static281.method4344((byte) (Static188.anInt3597 - 4 & 0xFF));
			Static240.method3686(2);
		}
		Static49.anInt965 = Static65.anInt1300;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILclient!nk;)V")
	public static void method3148(@OriginalArg(1) Class121 arg0) {
		Static229.aClass121_99 = arg0;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIBIIIII)V")
	public static void method3149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = arg5 + arg0;
		@Pc(15) int local15 = arg1 - arg0;
		@Pc(17) int local17;
		for (local17 = arg5; local17 < local10; local17++) {
			Static273.method4257(arg2, Static183.anIntArrayArray26[local17], arg3, arg6);
		}
		@Pc(36) int local36 = arg6 - arg0;
		@Pc(40) int local40 = arg0 + arg2;
		for (local17 = arg1; local17 > local15; local17--) {
			Static273.method4257(arg2, Static183.anIntArrayArray26[local17], arg3, arg6);
		}
		for (local17 = local10; local17 <= local15; local17++) {
			@Pc(76) int[] local76 = Static183.anIntArrayArray26[local17];
			Static273.method4257(arg2, local76, arg3, local40);
			Static273.method4257(local40, local76, arg4, local36);
			Static273.method4257(local36, local76, arg3, arg6);
		}
	}
}
