import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!ku", name = "R", descriptor = "[[I")
	public static int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(III)Z")
	public static boolean method4167(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x580) != 0;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(BIIIII)V")
	public static void method4168(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static57.method966(Static71.anInt1350, Static120.anInt2491, arg0);
		@Pc(17) int local17 = Static57.method966(Static71.anInt1350, Static120.anInt2491, arg4);
		@Pc(23) int local23 = Static57.method966(Static194.anInt3788, Static330.anInt6025, arg2);
		@Pc(29) int local29 = Static57.method966(Static194.anInt3788, Static330.anInt6025, arg1);
		for (@Pc(34) int local34 = local11; local34 <= local17; local34++) {
			Static329.method4871(local23, local29, anIntArrayArray25[local34], arg3);
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(II)V")
	public static void method4170(@OriginalArg(1) int arg0) {
		@Pc(14) Class1_Sub8_Sub9 local14 = Static465.method6470(arg0, 9);
		local14.method4835();
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(BII)Z")
	public static boolean method4171(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
