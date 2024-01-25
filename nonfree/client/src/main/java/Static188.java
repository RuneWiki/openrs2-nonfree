import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!jl", name = "D", descriptor = "Z")
	public static boolean aBoolean267 = false;

	@OriginalMember(owner = "client!jl", name = "N", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_51 = new Class146(51, 4);

	@OriginalMember(owner = "client!jl", name = "O", descriptor = "Z")
	public static boolean aBoolean268 = false;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIZI)I")
	public static int method2764(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(13) Class4_Sub25 local13 = Static242.method3222(arg2, arg0);
		if (local13 == null) {
			return -1;
		} else if (arg1 >= 0 && local13.anIntArray345.length > arg1) {
			return local13.anIntArray345[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "(III)V")
	public static void method2765(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static432.aClass75ArrayArrayArray6[0][arg1][arg2] != null && Static432.aClass75ArrayArrayArray6[0][arg1][arg2].aClass75_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static432.aClass75ArrayArrayArray6[local22][arg1][arg2] == null) {
				@Pc(46) Class75 local46 = Static432.aClass75ArrayArrayArray6[local22][arg1][arg2] = new Class75(local22, arg1, arg2);
				if (local20) {
					local46.aByte29++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIIIBI)V")
	public static void method2766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 >= Static62.anInt1114 && Static207.anInt3632 >= arg6 && Static254.anInt4211 <= arg4 && arg3 <= Static275.anInt4594) {
			Static446.method5929(arg1, arg4, arg6, arg2, arg3, arg5, arg0);
		} else {
			Static354.method4684(arg3, arg6, arg2, arg1, arg4, arg0, arg5);
		}
	}
}
