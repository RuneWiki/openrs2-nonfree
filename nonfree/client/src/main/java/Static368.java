import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
	public static int anInt5940;

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "F")
	public static float aFloat120 = 1.0F;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
	public static void method5382() {
		Static90.aClass13_18.xa(((float) Static24.aClass3_Sub22_4.aClass6_Sub1_1.method146() * 0.1F + 0.7F) * 1.1523438F);
		Static90.aClass13_18.ZA(Static131.anInt2695, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		Static90.aClass13_18.L(Static247.anInt4490, -1, 0);
		Static90.aClass13_18.method8462(Static194.aClass35_1);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIII)V")
	public static void method5383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg5 - arg4;
		@Pc(14) int local14 = arg4 + arg3;
		for (@Pc(16) int local16 = arg3; local16 < local14; local16++) {
			Static483.method7014(Static392.anIntArrayArray39[local16], arg1, arg2, arg0);
		}
		@Pc(39) int local39 = arg2 - arg4;
		@Pc(44) int local44 = arg1 + arg4;
		for (@Pc(46) int local46 = arg5; local46 > local10; local46--) {
			Static483.method7014(Static392.anIntArrayArray39[local46], arg1, arg2, arg0);
		}
		for (@Pc(67) int local67 = local14; local67 <= local10; local67++) {
			@Pc(73) int[] local73 = Static392.anIntArrayArray39[local67];
			Static483.method7014(local73, arg1, local44, arg0);
			Static483.method7014(local73, local39, arg2, arg0);
		}
	}
}
