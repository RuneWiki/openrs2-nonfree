import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!jia", name = "c", descriptor = "Ljava/lang/Thread;")
	public static Thread aThread1;

	@OriginalMember(owner = "client!jia", name = "b", descriptor = "I")
	public static final int anInt4830 = 1408;

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(I)[Lclient!vk;")
	public static Class372[] method4036() {
		return new Class372[] { Static128.aClass372_4, Static160.aClass372_6, Static150.aClass372_5 };
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(IIIIIIB)V")
	public static void method4037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) int local9 = arg1 + arg5;
		@Pc(14) int local14 = arg3 - arg1;
		for (@Pc(16) int local16 = arg5; local16 < local9; local16++) {
			Static679.method9323(Static274.anIntArrayArray34[local16], arg0, arg2, arg4);
		}
		@Pc(38) int local38 = arg1 + arg0;
		for (@Pc(40) int local40 = arg3; local40 > local14; local40--) {
			Static679.method9323(Static274.anIntArrayArray34[local40], arg0, arg2, arg4);
		}
		@Pc(59) int local59 = arg4 - arg1;
		for (@Pc(65) int local65 = local9; local65 <= local14; local65++) {
			@Pc(71) int[] local71 = Static274.anIntArrayArray34[local65];
			Static679.method9323(local71, arg0, arg2, local38);
			Static679.method9323(local71, local59, arg2, arg4);
		}
	}
}
