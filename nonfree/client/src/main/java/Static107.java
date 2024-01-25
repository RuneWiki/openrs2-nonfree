import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!ew", name = "d", descriptor = "Z")
	public static boolean aBoolean183;

	@OriginalMember(owner = "client!ew", name = "c", descriptor = "[I")
	public static final int[] anIntArray152 = new int[1];

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(16) int local16 = Static241.method3467(arg5, Static142.anInt2163, Static182.anInt3402);
		@Pc(22) int local22 = Static241.method3467(arg0, Static142.anInt2163, Static182.anInt3402);
		@Pc(28) int local28 = Static241.method3467(arg3, Static281.anInt4757, Static457.anInt7264);
		@Pc(34) int local34 = Static241.method3467(arg1, Static281.anInt4757, Static457.anInt7264);
		@Pc(43) int local43 = Static241.method3467(arg5 + arg4, Static142.anInt2163, Static182.anInt3402);
		@Pc(51) int local51 = Static241.method3467(arg0 - arg4, Static142.anInt2163, Static182.anInt3402);
		for (@Pc(53) int local53 = local16; local53 < local43; local53++) {
			Static298.method3977(local28, arg2, local34, Static194.anIntArrayArray28[local53]);
		}
		for (@Pc(69) int local69 = local22; local69 > local51; local69--) {
			Static298.method3977(local28, arg2, local34, Static194.anIntArrayArray28[local69]);
		}
		@Pc(91) int local91 = Static241.method3467(arg4 + arg3, Static281.anInt4757, Static457.anInt7264);
		@Pc(100) int local100 = Static241.method3467(arg1 - arg4, Static281.anInt4757, Static457.anInt7264);
		for (@Pc(102) int local102 = local43; local102 <= local51; local102++) {
			@Pc(108) int[] local108 = Static194.anIntArrayArray28[local102];
			Static298.method3977(local28, arg2, local91, local108);
			Static298.method3977(local91, arg6, local100, local108);
			Static298.method3977(local100, arg2, local34, local108);
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(ZLclient!hm;II)V")
	public static void method1330(@OriginalArg(1) Class107 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class73 local8 = arg0.method2116(Static186.aClass117_3);
		if (local8 == null) {
			return;
		}
		Static186.aClass117_3.ba(arg1, arg2, arg0.anInt2648 + arg1, arg0.anInt2606 + arg2);
		if (Static61.anInt7291 >= 3) {
			Static186.aClass117_3.ra(-16777216, local8, arg1, arg2);
		} else {
			Static366.aClass85_19.method5402((float) arg0.anInt2648 / 2.0F + (float) arg1, (float) arg2 + (float) arg0.anInt2606 / 2.0F, ((int) -Static99.aFloat9 & 0x3FFF) << 2, local8, arg1, arg2);
		}
	}
}
