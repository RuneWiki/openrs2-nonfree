import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!hd", name = "r", descriptor = "[I")
	public static int[] anIntArray202;

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)V")
	public static void method2264() {
		for (@Pc(7) int local7 = 0; local7 < Static237.aClass241ArrayArray1.length; local7++) {
			for (@Pc(11) int local11 = 0; local11 < Static237.aClass241ArrayArray1[local7].length; local11++) {
				Static237.aClass241ArrayArray1[local7][local11] = Static181.aClass241_1;
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIIZI)V")
	public static void method2265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg1 - arg3;
		@Pc(21) int local21 = arg0 - arg3;
		@Pc(25) int local25 = arg1 * arg1;
		@Pc(29) int local29 = arg0 * arg0;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg0 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(74) int local74 = (1 - local57) * local25 + local41;
		@Pc(83) int local83 = local29 - local45 * (local57 - 1);
		@Pc(92) int local92 = local49 + (1 - local61) * local33;
		@Pc(101) int local101 = local37 - (local61 - 1) * local53;
		@Pc(105) int local105 = local25 << 2;
		@Pc(109) int local109 = local29 << 2;
		@Pc(113) int local113 = local33 << 2;
		@Pc(117) int local117 = local37 << 2;
		@Pc(121) int local121 = local41 * 3;
		@Pc(127) int local127 = (local57 - 3) * local45;
		@Pc(131) int local131 = local49 * 3;
		@Pc(137) int local137 = local53 * (local61 - 3);
		@Pc(139) int local139 = local109;
		@Pc(145) int local145 = (arg0 - 1) * local105;
		@Pc(147) int local147 = local117;
		@Pc(153) int local153 = local113 * (local21 - 1);
		@Pc(157) int[] local157 = Static283.anIntArrayArray30[arg4];
		Static23.method323(local157, arg6 - arg1, arg2, arg6 - local16);
		Static23.method323(local157, arg6 - local16, arg5, local16 + arg6);
		Static23.method323(local157, local16 + arg6, arg2, arg1 + arg6);
		while (local9 > 0) {
			@Pc(199) boolean local199 = local9 <= local21;
			if (local74 < 0) {
				while (local74 < 0) {
					local83 += local139;
					local74 += local121;
					local139 += local109;
					local7++;
					local121 += local109;
				}
			}
			if (local199) {
				if (local92 < 0) {
					while (local92 < 0) {
						local101 += local147;
						local92 += local131;
						local11++;
						local147 += local117;
						local131 += local117;
					}
				}
				if (local101 < 0) {
					local101 += local147;
					local92 += local131;
					local147 += local117;
					local131 += local117;
					local11++;
				}
				local101 += -local137;
				local92 += -local153;
				local137 -= local113;
				local153 -= local113;
			}
			if (local83 < 0) {
				local83 += local139;
				local74 += local121;
				local121 += local109;
				local139 += local109;
				local7++;
			}
			local74 += -local145;
			local83 += -local127;
			local127 -= local105;
			local145 -= local105;
			local9--;
			@Pc(342) int local342 = arg4 - local9;
			@Pc(346) int local346 = arg4 + local9;
			@Pc(350) int local350 = arg6 + local7;
			@Pc(354) int local354 = arg6 - local7;
			if (local199) {
				@Pc(360) int local360 = local11 + arg6;
				@Pc(365) int local365 = arg6 - local11;
				Static23.method323(Static283.anIntArrayArray30[local342], local354, arg2, local365);
				Static23.method323(Static283.anIntArrayArray30[local342], local365, arg5, local360);
				Static23.method323(Static283.anIntArrayArray30[local342], local360, arg2, local350);
				Static23.method323(Static283.anIntArrayArray30[local346], local354, arg2, local365);
				Static23.method323(Static283.anIntArrayArray30[local346], local365, arg5, local360);
				Static23.method323(Static283.anIntArrayArray30[local346], local360, arg2, local350);
			} else {
				Static23.method323(Static283.anIntArrayArray30[local342], local354, arg2, local350);
				Static23.method323(Static283.anIntArrayArray30[local346], local354, arg2, local350);
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method2267(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class1_Sub1_Sub1 local8 = Static190.method3007(arg0, 2);
		local8.method32();
		local8.aString1 = arg1;
	}
}
