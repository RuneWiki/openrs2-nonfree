import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!ms", name = "j", descriptor = "I")
	public static int anInt6650;

	@OriginalMember(owner = "client!ms", name = "h", descriptor = "Lclient!st;")
	public static final Class314 aClass314_101 = new Class314(65, 4);

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIIBIII)V")
	public static void method5784(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg6 - arg5;
		@Pc(21) int local21 = arg0 - arg5;
		@Pc(25) int local25 = arg6 * arg6;
		@Pc(29) int local29 = arg0 * arg0;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg0 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(70) int local70 = (1 - local57) * local25 + local41;
		@Pc(79) int local79 = local29 - (local57 - 1) * local45;
		@Pc(87) int local87 = local49 + (1 - local61) * local33;
		@Pc(95) int local95 = local37 - local53 * (local61 - 1);
		@Pc(107) int local107 = local25 << 2;
		@Pc(111) int local111 = local29 << 2;
		@Pc(115) int local115 = local33 << 2;
		@Pc(119) int local119 = local37 << 2;
		@Pc(123) int local123 = local41 * 3;
		@Pc(129) int local129 = local45 * (local57 - 3);
		@Pc(133) int local133 = local49 * 3;
		@Pc(139) int local139 = (local61 - 3) * local53;
		@Pc(141) int local141 = local111;
		@Pc(147) int local147 = local107 * (arg0 - 1);
		@Pc(149) int local149 = local119;
		@Pc(155) int local155 = local115 * (local21 - 1);
		@Pc(159) int[] local159 = Static71.anIntArrayArray5[arg1];
		Static82.method1400(arg2, arg4 - arg6, -local16 + arg4, local159);
		Static82.method1400(arg3, arg4 - local16, arg4 - -local16, local159);
		Static82.method1400(arg2, local16 + arg4, arg6 + arg4, local159);
		while (local9 > 0) {
			@Pc(201) boolean local201 = local21 >= local9;
			if (local201) {
				if (local87 < 0) {
					while (local87 < 0) {
						local95 += local149;
						local87 += local133;
						local133 += local119;
						local11++;
						local149 += local119;
					}
				}
				if (local95 < 0) {
					local95 += local149;
					local87 += local133;
					local149 += local119;
					local11++;
					local133 += local119;
				}
				local95 += -local139;
				local87 += -local155;
				local155 -= local115;
				local139 -= local115;
			}
			if (local70 < 0) {
				while (local70 < 0) {
					local70 += local123;
					local79 += local141;
					local141 += local111;
					local7++;
					local123 += local111;
				}
			}
			if (local79 < 0) {
				local79 += local141;
				local70 += local123;
				local123 += local111;
				local141 += local111;
				local7++;
			}
			local70 += -local147;
			local79 += -local129;
			local129 -= local107;
			local9--;
			local147 -= local107;
			@Pc(341) int local341 = arg1 - local9;
			@Pc(346) int local346 = arg1 + local9;
			@Pc(350) int local350 = local7 + arg4;
			@Pc(354) int local354 = arg4 - local7;
			if (local201) {
				@Pc(361) int local361 = arg4 + local11;
				@Pc(366) int local366 = arg4 - local11;
				Static82.method1400(arg2, local354, local366, Static71.anIntArrayArray5[local341]);
				Static82.method1400(arg3, local366, local361, Static71.anIntArrayArray5[local341]);
				Static82.method1400(arg2, local361, local350, Static71.anIntArrayArray5[local341]);
				Static82.method1400(arg2, local354, local366, Static71.anIntArrayArray5[local346]);
				Static82.method1400(arg3, local366, local361, Static71.anIntArrayArray5[local346]);
				Static82.method1400(arg2, local361, local350, Static71.anIntArrayArray5[local346]);
			} else {
				Static82.method1400(arg2, local354, local350, Static71.anIntArrayArray5[local341]);
				Static82.method1400(arg2, local354, local350, Static71.anIntArrayArray5[local346]);
			}
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIIIIIIB)V")
	public static void method5785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		Static537.method7780(arg0, arg3, arg2, 0, arg1, arg5, arg4);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method5787(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) long local10 = 0L;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + (long) arg0.charAt(local12) - local10;
		}
		return local10;
	}
}
