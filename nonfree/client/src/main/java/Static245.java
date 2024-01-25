import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!lr", name = "H", descriptor = "I")
	public static int anInt3960;

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method3167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (arg0 == arg5 && arg3 == arg2 && arg4 == arg7 && arg6 == arg1) {
			Static226.method2982(arg8, arg1, arg3, arg0, arg7);
			return;
		}
		@Pc(32) int local32 = arg0;
		@Pc(34) int local34 = arg3;
		@Pc(38) int local38 = arg0 * 3;
		@Pc(42) int local42 = arg3 * 3;
		@Pc(46) int local46 = arg5 * 3;
		@Pc(50) int local50 = arg2 * 3;
		@Pc(54) int local54 = arg4 * 3;
		@Pc(58) int local58 = arg6 * 3;
		@Pc(67) int local67 = arg7 + local46 - arg0 - local54;
		@Pc(77) int local77 = arg1 + local50 - local58 - arg3;
		@Pc(87) int local87 = local54 + local38 - local46 - local46;
		@Pc(97) int local97 = local42 + local58 - local50 - local50;
		@Pc(102) int local102 = local46 - local38;
		@Pc(107) int local107 = local50 - local42;
		for (@Pc(109) int local109 = 128; local109 <= 4096; local109 += 128) {
			@Pc(117) int local117 = local109 * local109 >> 12;
			@Pc(123) int local123 = local109 * local117 >> 12;
			@Pc(127) int local127 = local123 * local67;
			@Pc(131) int local131 = local123 * local77;
			@Pc(135) int local135 = local87 * local117;
			@Pc(139) int local139 = local117 * local97;
			@Pc(143) int local143 = local109 * local102;
			@Pc(147) int local147 = local109 * local107;
			@Pc(157) int local157 = arg0 + (local143 + local135 + local127 >> 12);
			@Pc(168) int local168 = (local147 + local131 + local139 >> 12) + arg3;
			Static226.method2982(arg8, local168, local34, local32, local157);
			local32 = local157;
			local34 = local168;
		}
	}

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "(B)V")
	public static void method3168() {
		for (@Pc(3) int local3 = 0; local3 < Static424.anInt7114; local3++) {
			@Pc(9) int local9 = Static218.anIntArray351[local3];
			@Pc(16) Class5_Sub7 local16 = (Class5_Sub7) Static380.aClass252_36.method5659((long) local9);
			if (local16 != null) {
				@Pc(21) Class2_Sub1_Sub3_Sub1 local21 = local16.aClass2_Sub1_Sub3_Sub1_1;
				Static186.method2537(local21, local21.aClass131_1.anInt3463);
			}
		}
	}

	@OriginalMember(owner = "client!lr", name = "f", descriptor = "(I)V")
	public static void method3169() {
		if (Static351.aBoolean390) {
			Static351.aBoolean390 = false;
			Static66.aClass49_6 = null;
			Static306.aClass49_11 = null;
		}
	}
}
