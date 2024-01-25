import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!fda", name = "b", descriptor = "F")
	public static float aFloat30;

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(I)V")
	public static void method2183() {
		for (@Pc(7) int local7 = 0; local7 < Static251.aClass283ArrayArray1.length; local7++) {
			for (@Pc(11) int local11 = 0; local11 < Static251.aClass283ArrayArray1[local7].length; local11++) {
				Static251.aClass283ArrayArray1[local7][local11] = Static85.aClass283_1;
			}
		}
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(IIIIIII)V")
	public static void method2184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static127.method3838(arg0);
		@Pc(12) int local12 = 0;
		@Pc(17) int local17 = arg0 - arg5;
		if (local17 < 0) {
			local17 = 0;
		}
		@Pc(26) int local26 = arg0;
		@Pc(29) int local29 = -arg0;
		@Pc(31) int local31 = local17;
		@Pc(34) int local34 = -local17;
		@Pc(36) int local36 = -1;
		@Pc(38) int local38 = -1;
		@Pc(42) int[] local42 = Static447.anIntArrayArray99[arg1];
		@Pc(47) int local47 = arg3 - local17;
		@Pc(55) int local55 = local17 + arg3;
		Static424.method6216(local47, arg4, arg3 - arg0, local42);
		Static424.method6216(local55, arg2, local47, local42);
		Static424.method6216(arg3 + arg0, arg4, local55, local42);
		while (local26 > local12) {
			local38 += 2;
			local36 += 2;
			local29 += local36;
			local34 += local38;
			if (local34 >= 0 && local31 >= 1) {
				Static359.anIntArray644[local31] = local12;
				local31--;
				local34 -= local31 << 1;
			}
			local12++;
			@Pc(133) int[] local133;
			@Pc(140) int[] local140;
			@Pc(144) int local144;
			@Pc(149) int local149;
			@Pc(154) int local154;
			@Pc(158) int local158;
			@Pc(163) int local163;
			if (local29 >= 0) {
				local26--;
				local29 -= local26 << 1;
				if (local26 < local17) {
					local133 = Static447.anIntArrayArray99[arg1 + local26];
					local140 = Static447.anIntArrayArray99[arg1 - local26];
					local144 = Static359.anIntArray644[local26];
					local149 = arg3 + local12;
					local154 = arg3 - local12;
					local158 = local144 + arg3;
					local163 = arg3 - local144;
					Static424.method6216(local163, arg4, local154, local133);
					Static424.method6216(local158, arg2, local163, local133);
					Static424.method6216(local149, arg4, local158, local133);
					Static424.method6216(local163, arg4, local154, local140);
					Static424.method6216(local158, arg2, local163, local140);
					Static424.method6216(local149, arg4, local158, local140);
				} else {
					local133 = Static447.anIntArrayArray99[local26 + arg1];
					local140 = Static447.anIntArrayArray99[arg1 - local26];
					local144 = arg3 + local12;
					local149 = arg3 - local12;
					Static424.method6216(local144, arg4, local149, local133);
					Static424.method6216(local144, arg4, local149, local140);
				}
			}
			local133 = Static447.anIntArrayArray99[local12 + arg1];
			local140 = Static447.anIntArrayArray99[arg1 - local12];
			local144 = arg3 + local26;
			local149 = arg3 - local26;
			if (local17 <= local12) {
				Static424.method6216(local144, arg4, local149, local133);
				Static424.method6216(local144, arg4, local149, local140);
			} else {
				local154 = local12 > local31 ? Static359.anIntArray644[local12] : local31;
				local158 = arg3 + local154;
				local163 = arg3 - local154;
				Static424.method6216(local163, arg4, local149, local133);
				Static424.method6216(local158, arg2, local163, local133);
				Static424.method6216(local144, arg4, local158, local133);
				Static424.method6216(local163, arg4, local149, local140);
				Static424.method6216(local158, arg2, local163, local140);
				Static424.method6216(local144, arg4, local158, local140);
			}
		}
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(III)Z")
	public static boolean method2185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static500.method5191(arg0, arg1) | (arg1 & 0x10000) != 0 || Static178.method2662(arg1, arg0)) {
			return true;
		} else {
			return (arg0 & 0x37) == 0 && Static290.method6966(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!fda", name = "b", descriptor = "(III)Z")
	public static boolean method2186(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}
}
