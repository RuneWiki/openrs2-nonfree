import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIIIIIIIBI)V")
	public static void method2557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (arg8 == arg3 && arg1 == arg7 && arg2 == arg4 && arg6 == arg5) {
			Static322.method5018(arg3, arg2, arg5, arg1, arg0);
			return;
		}
		@Pc(41) int local41 = arg3;
		@Pc(43) int local43 = arg1;
		@Pc(47) int local47 = arg3 * 3;
		@Pc(51) int local51 = arg1 * 3;
		@Pc(55) int local55 = arg8 * 3;
		@Pc(59) int local59 = arg7 * 3;
		@Pc(63) int local63 = arg4 * 3;
		@Pc(67) int local67 = arg6 * 3;
		@Pc(76) int local76 = local55 + arg2 - local63 - arg3;
		@Pc(85) int local85 = arg5 + local59 - arg1 - local67;
		@Pc(94) int local94 = local47 + local63 - local55 - local55;
		@Pc(104) int local104 = local67 + local51 - local59 - local59;
		@Pc(109) int local109 = local55 - local47;
		@Pc(113) int local113 = local59 - local51;
		for (@Pc(115) int local115 = 128; local115 <= 4096; local115 += 128) {
			@Pc(123) int local123 = local115 * local115 >> 12;
			@Pc(129) int local129 = local115 * local123 >> 12;
			@Pc(133) int local133 = local76 * local129;
			@Pc(137) int local137 = local85 * local129;
			@Pc(141) int local141 = local94 * local123;
			@Pc(145) int local145 = local123 * local104;
			@Pc(149) int local149 = local115 * local109;
			@Pc(153) int local153 = local113 * local115;
			@Pc(164) int local164 = (local141 + local133 + local149 >> 12) + arg3;
			@Pc(175) int local175 = arg1 + (local153 + local145 + local137 >> 12);
			Static322.method5018(local41, local164, local175, local43, arg0);
			local43 = local175;
			local41 = local164;
		}
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(B[B)V")
	public static void method2558(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class5_Sub15 local8 = new Class5_Sub15(arg0);
		@Pc(14) boolean local14 = false;
		while (true) {
			while (true) {
				@Pc(18) int local18 = local8.method3642();
				if (local18 == 0) {
					if (local14) {
						return;
					}
					if (Static502.anIntArray466 == null) {
						Static221.anIntArray195 = new int[4];
						Static467.anInt8128 = 4;
						Static502.anIntArray466 = new int[4];
					}
					for (local18 = 0; local18 < Static502.anIntArray466.length; local18++) {
						Static502.anIntArray466[local18] = 0;
						Static221.anIntArray195[local18] = local18 * 20;
					}
					return;
				}
				if (local18 == 1) {
					if (Static502.anIntArray466 == null) {
						Static502.anIntArray466 = new int[4];
						Static467.anInt8128 = 4;
						Static221.anIntArray195 = new int[4];
					}
					for (@Pc(65) int local65 = 0; local65 < Static502.anIntArray466.length; local65++) {
						Static502.anIntArray466[local65] = local8.method3638();
						Static221.anIntArray195[local65] = local8.method3638();
					}
					local14 = true;
				} else if (local18 == 2) {
					Static50.anInt772 = local8.method3698();
				} else if (local18 == 3) {
					Static467.anInt8128 = local8.method3642();
					Static502.anIntArray466 = new int[Static467.anInt8128];
					Static221.anIntArray195 = new int[Static467.anInt8128];
				}
			}
		}
	}
}
