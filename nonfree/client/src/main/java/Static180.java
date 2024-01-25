import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!ld", name = "P", descriptor = "I")
	public static int anInt3594;

	@OriginalMember(owner = "client!ld", name = "N", descriptor = "[I")
	public static final int[] anIntArray294 = new int[13];

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIBIIIII)V")
	public static void method3292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 < 1 || arg6 < 1 || arg4 > Static95.anInt6381 - 2 || Static237.anInt4532 - 2 < arg6) {
			return;
		}
		if (!Static257.method4680() && !Static85.method1908(arg7, arg6, Static69.anInt1511, arg4)) {
			return;
		}
		if (Static275.aClass8ArrayArrayArray4 == null) {
			return;
		}
		@Pc(45) int local45 = arg7;
		if (arg7 < 3 && Static222.method3911(arg6, arg4)) {
			local45 = arg7 + 1;
		}
		Static241.method4167(Static147.aClass4_2, arg1, arg6, Static169.aClass151Array1[arg7], arg4, arg7, local45);
		if (arg0 >= 0) {
			@Pc(71) boolean local71 = Static89.aBoolean169;
			Static89.aBoolean169 = true;
			Static122.method3994(arg2, arg4, false, false, arg0, Static169.aClass151Array1[arg7], arg7, arg5, local45, Static147.aClass4_2, arg3, arg6);
			Static89.aBoolean169 = local71;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIII)I")
	public static int method3293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg2 & 0x1) == 1) {
			@Pc(8) int local8 = arg5;
			arg5 = arg1;
			arg1 = local8;
		}
		@Pc(16) int local16 = arg0 & 0x3;
		if (local16 == 0) {
			return arg3;
		} else if (local16 == 1) {
			return arg4;
		} else if (local16 == 2) {
			return 8 - arg5 - arg3;
		} else {
			return 1 + 7 - arg1 - arg4;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IC)Z")
	public static boolean method3294(@OriginalArg(1) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}
}
