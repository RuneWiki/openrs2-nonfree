import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
	public static int anInt5676;

	@OriginalMember(owner = "client!jl", name = "l", descriptor = "I")
	public static int anInt5684;

	@OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
	public static int anInt5681 = -2;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIZI)I")
	public static int method4909(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(10) Class2_Sub24 local10 = Static628.method9105(arg1, arg2);
		if (local10 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(21) int local21 = 0;
			for (@Pc(23) int local23 = 0; local23 < local10.anIntArray264.length; local23++) {
				if (arg0 == local10.anIntArray263[local23]) {
					local21 += local10.anIntArray264[local23];
				}
			}
			return local21;
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIIIB)V")
	public static void method4912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(11) int local11 = Static317.method5515(Static237.anInt5159, arg5, Static380.anInt7421);
		@Pc(17) int local17 = Static317.method5515(Static237.anInt5159, arg1, Static380.anInt7421);
		@Pc(34) int local34 = Static317.method5515(Static38.anInt823, arg0, Static161.anInt7734);
		@Pc(40) int local40 = Static317.method5515(Static38.anInt823, arg3, Static161.anInt7734);
		@Pc(48) int local48 = Static317.method5515(Static237.anInt5159, arg5 + arg2, Static380.anInt7421);
		@Pc(57) int local57 = Static317.method5515(Static237.anInt5159, arg1 - arg2, Static380.anInt7421);
		for (@Pc(59) int local59 = local11; local59 < local48; local59++) {
			Static280.method5108(local40, Static208.anIntArrayArray20[local59], local34, arg4);
		}
		for (@Pc(79) int local79 = local17; local79 > local57; local79--) {
			Static280.method5108(local40, Static208.anIntArrayArray20[local79], local34, arg4);
		}
		@Pc(101) int local101 = Static317.method5515(Static38.anInt823, arg2 + arg0, Static161.anInt7734);
		@Pc(110) int local110 = Static317.method5515(Static38.anInt823, arg3 - arg2, Static161.anInt7734);
		for (@Pc(112) int local112 = local48; local112 <= local57; local112++) {
			@Pc(118) int[] local118 = Static208.anIntArrayArray20[local112];
			Static280.method5108(local101, local118, local34, arg4);
			Static280.method5108(local40, local118, local110, arg4);
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IZIII)Z")
	public static boolean method4913(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static476.aByteArrayArrayArray5[0][arg1][arg0] & 0x2) != 0) {
			return true;
		} else if ((Static476.aByteArrayArrayArray5[arg3][arg1][arg0] & 0x10) == 0) {
			return arg2 == Static392.method6461(arg3, arg0, arg1);
		} else {
			return false;
		}
	}
}
