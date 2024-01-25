import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!go", name = "e", descriptor = "Z")
	public static boolean aBoolean452 = false;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(I)V")
	public static void method5377() {
		Static142.aBoolean211 = true;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IZIIII)I")
	public static int method5379(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static332.aClass154Array3 == null) {
			return 0;
		} else if (arg0 < 3) {
			@Pc(16) int local16 = arg2 >> 7;
			@Pc(20) int local20 = arg1 >> 7;
			if (arg4 < 0 || arg3 < 0 || arg4 > Static2.anInt7 - 1 || Static17.anInt315 - 1 < arg3) {
				return 0;
			} else if (local16 >= 1 && local20 >= 1 && local16 <= Static2.anInt7 - 1 && Static17.anInt315 - 1 >= local20) {
				@Pc(75) boolean local75 = (Static181.aByteArrayArrayArray15[1][arg2 >> 7][arg1 >> 7] & 0x2) != 0;
				@Pc(97) boolean local97;
				@Pc(113) boolean local113;
				if ((arg2 & 0x7F) == 0) {
					local97 = (Static181.aByteArrayArrayArray15[1][local16 - 1][arg1 >> 7] & 0x2) != 0;
					local113 = (Static181.aByteArrayArrayArray15[1][local16][arg1 >> 7] & 0x2) != 0;
					if (local113 != local97) {
						local75 = (Static181.aByteArrayArrayArray15[1][arg4][arg3] & 0x2) != 0;
					}
				}
				if ((arg1 & 0x7F) == 0) {
					local97 = (Static181.aByteArrayArrayArray15[1][arg2 >> 7][local20 - 1] & 0x2) != 0;
					local113 = (Static181.aByteArrayArrayArray15[1][arg2 >> 7][local20] & 0x2) != 0;
					if (local113 != local97) {
						local75 = (Static181.aByteArrayArrayArray15[1][arg4][arg3] & 0x2) != 0;
					}
				}
				if (local75) {
					arg0++;
				}
				return Static332.aClass154Array3[arg0].ca(arg2, arg1);
			} else {
				return 0;
			}
		} else {
			return Static332.aClass154Array3[arg0].ca(arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5380(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg4 + arg5;
		@Pc(14) int local14 = arg2 - arg4;
		for (@Pc(16) int local16 = arg5; local16 < local9; local16++) {
			Static212.method3267(arg1, arg6, arg0, Class10_Sub10_Sub1.lb[local16]);
		}
		for (@Pc(37) int local37 = arg2; local37 > local14; local37--) {
			Static212.method3267(arg1, arg6, arg0, Class10_Sub10_Sub1.lb[local37]);
		}
		@Pc(60) int local60 = arg1 + arg4;
		@Pc(65) int local65 = arg6 - arg4;
		for (@Pc(67) int local67 = local9; local67 <= local14; local67++) {
			@Pc(73) int[] local73 = Class10_Sub10_Sub1.lb[local67];
			Static212.method3267(arg1, local60, arg0, local73);
			Static212.method3267(local60, local65, arg3, local73);
			Static212.method3267(local65, arg6, arg0, local73);
		}
	}
}
