import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!ef", name = "B", descriptor = "J")
	public static long aLong74;

	@OriginalMember(owner = "client!ef", name = "G", descriptor = "Lclient!jf;")
	public static Class173 aClass173_4;

	@OriginalMember(owner = "client!ef", name = "J", descriptor = "Lclient!hl;")
	public static Class140 aClass140_2;

	@OriginalMember(owner = "client!ef", name = "E", descriptor = "J")
	public static long aLong75 = 0L;

	@OriginalMember(owner = "client!ef", name = "F", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_69 = new Class363(87, 6);

	@OriginalMember(owner = "client!ef", name = "I", descriptor = "[I")
	public static final int[] anIntArray141 = new int[1000];

	@OriginalMember(owner = "client!ef", name = "L", descriptor = "[I")
	public static final int[] anIntArray142 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1743(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg1 - arg4;
		@Pc(21) int local21 = arg3 - arg4;
		@Pc(25) int local25 = arg1 * arg1;
		@Pc(29) int local29 = arg3 * arg3;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg3 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(69) int local69 = local41 + local25 * (1 - local57);
		@Pc(78) int local78 = local29 - local45 * (local57 - 1);
		@Pc(95) int local95 = (1 - local61) * local33 + local49;
		@Pc(103) int local103 = local37 - local53 * (local61 - 1);
		@Pc(107) int local107 = local25 << 2;
		@Pc(111) int local111 = local29 << 2;
		@Pc(115) int local115 = local33 << 2;
		@Pc(119) int local119 = local37 << 2;
		@Pc(123) int local123 = local41 * 3;
		@Pc(129) int local129 = (local57 - 3) * local45;
		@Pc(133) int local133 = local49 * 3;
		@Pc(139) int local139 = local53 * (local61 - 3);
		@Pc(141) int local141 = local111;
		@Pc(147) int local147 = (arg3 - 1) * local107;
		@Pc(149) int local149 = local119;
		@Pc(155) int local155 = (local21 - 1) * local115;
		@Pc(159) int[] local159 = Static582.anIntArrayArray69[arg5];
		Static276.method3099(arg0 - arg1, local159, arg2, arg0 - local16);
		Static276.method3099(arg0 - local16, local159, arg6, arg0 + local16);
		Static276.method3099(arg0 + local16, local159, arg2, arg0 + arg1);
		while (local9 > 0) {
			@Pc(207) boolean local207 = local9 <= local21;
			if (local207) {
				if (local95 < 0) {
					while (local95 < 0) {
						local103 += local149;
						local95 += local133;
						local149 += local119;
						local11++;
						local133 += local119;
					}
				}
				if (local103 < 0) {
					local95 += local133;
					local103 += local149;
					local149 += local119;
					local11++;
					local133 += local119;
				}
				local103 += -local139;
				local95 += -local155;
				local139 -= local115;
				local155 -= local115;
			}
			if (local69 < 0) {
				while (local69 < 0) {
					local69 += local123;
					local78 += local141;
					local141 += local111;
					local123 += local111;
					local7++;
				}
			}
			if (local78 < 0) {
				local69 += local123;
				local78 += local141;
				local123 += local111;
				local141 += local111;
				local7++;
			}
			local78 += -local129;
			local69 += -local147;
			local9--;
			local147 -= local107;
			local129 -= local107;
			@Pc(344) int local344 = arg5 - local9;
			@Pc(349) int local349 = arg5 + local9;
			@Pc(353) int local353 = local7 + arg0;
			@Pc(358) int local358 = arg0 - local7;
			if (local207) {
				@Pc(364) int local364 = local11 + arg0;
				@Pc(369) int local369 = arg0 - local11;
				Static276.method3099(local358, Static582.anIntArrayArray69[local344], arg2, local369);
				Static276.method3099(local369, Static582.anIntArrayArray69[local344], arg6, local364);
				Static276.method3099(local364, Static582.anIntArrayArray69[local344], arg2, local353);
				Static276.method3099(local358, Static582.anIntArrayArray69[local349], arg2, local369);
				Static276.method3099(local369, Static582.anIntArrayArray69[local349], arg6, local364);
				Static276.method3099(local364, Static582.anIntArrayArray69[local349], arg2, local353);
			} else {
				Static276.method3099(local358, Static582.anIntArrayArray69[local344], arg2, local353);
				Static276.method3099(local358, Static582.anIntArrayArray69[local349], arg2, local353);
			}
		}
	}

	@OriginalMember(owner = "client!ef", name = "k", descriptor = "(I)V")
	public static void method1745() {
		for (@Pc(3) int local3 = 0; local3 < Static423.aClass216ArrayArray1.length; local3++) {
			for (@Pc(12) int local12 = 0; local12 < Static423.aClass216ArrayArray1[local3].length; local12++) {
				Static423.aClass216ArrayArray1[local3][local12] = Static510.aClass216_1;
			}
		}
	}
}
