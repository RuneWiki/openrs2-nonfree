import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "[S")
	public static short[] aShortArray113;

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(III)V")
	public static void method7164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static389.aClass346ArrayArrayArray2[0][arg1][arg2] != null && Static389.aClass346ArrayArrayArray2[0][arg1][arg2].aClass346_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static389.aClass346ArrayArrayArray2[local22][arg1][arg2] == null) {
				@Pc(44) Class346 local44 = Static389.aClass346ArrayArrayArray2[local22][arg1][arg2] = new Class346(local22);
				if (local20) {
					local44.aByte121++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oga", name = "b", descriptor = "(III)Z")
	public static boolean method7165(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static186.method3177(arg0, arg1) & Static490.method6858(arg0, arg1);
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(II)V")
	public static void method7167(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub3_Sub13 local8 = Static382.method5650(10, arg0);
		local8.method6095();
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(Lclient!ha;III[Z)V")
	public static void method7168(@OriginalArg(0) Class2_Sub3_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static421.aClass67Array7 == Static592.aClass67Array4) {
			return;
		}
		@Pc(10) int local10 = Static569.aClass67Array8[arg1].method6711(arg3, arg2);
		for (@Pc(12) int local12 = 0; local12 <= arg1; local12++) {
			if (arg4 == null || arg4[local12]) {
				@Pc(23) Class67 local23 = Static569.aClass67Array8[local12];
				if (local23 != null) {
					local23.DA(arg0, arg2, local10 - local23.method6711(arg3, arg2), arg3, 0, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method7170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg8 == arg3 && arg1 == arg0 && arg2 == arg5 && arg7 == arg6) {
			Static595.method8000(arg6, arg0, arg4, arg2, arg8);
			return;
		}
		@Pc(39) int local39 = arg8;
		@Pc(41) int local41 = arg0;
		@Pc(45) int local45 = arg8 * 3;
		@Pc(49) int local49 = arg0 * 3;
		@Pc(53) int local53 = arg3 * 3;
		@Pc(57) int local57 = arg1 * 3;
		@Pc(61) int local61 = arg5 * 3;
		@Pc(65) int local65 = arg7 * 3;
		@Pc(75) int local75 = local53 + arg2 - local61 - arg8;
		@Pc(84) int local84 = local57 + arg6 - local65 - arg0;
		@Pc(94) int local94 = local61 + local45 - local53 - local53;
		@Pc(104) int local104 = local65 + local49 - local57 - local57;
		@Pc(109) int local109 = local53 - local45;
		@Pc(114) int local114 = local57 - local49;
		for (@Pc(116) int local116 = 128; local116 <= 4096; local116 += 128) {
			@Pc(124) int local124 = local116 * local116 >> 12;
			@Pc(130) int local130 = local124 * local116 >> 12;
			@Pc(134) int local134 = local130 * local75;
			@Pc(138) int local138 = local84 * local130;
			@Pc(142) int local142 = local124 * local94;
			@Pc(146) int local146 = local124 * local104;
			@Pc(150) int local150 = local109 * local116;
			@Pc(154) int local154 = local114 * local116;
			@Pc(164) int local164 = arg8 + (local150 + local142 + local134 >> 12);
			@Pc(176) int local176 = arg0 + (local154 + local138 + local146 >> 12);
			Static595.method8000(local176, local41, arg4, local164, local39);
			local41 = local176;
			local39 = local164;
		}
	}
}
