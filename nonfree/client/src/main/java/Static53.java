import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!br", name = "s", descriptor = "[Lclient!jd;")
	public static Class20[] aClass20Array2;

	@OriginalMember(owner = "client!br", name = "O", descriptor = "I")
	public static int anInt1297;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IIIII)V")
	public static void method1106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static676.anIntArrayArray62 != null) {
			Static676.anIntArrayArray62[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static75.aShortArrayArray4 != null) {
			Static75.aShortArrayArray4[arg0][arg1] = (short) arg3;
		}
		if (Static553.aByteArrayArray46 != null) {
			Static553.aByteArrayArray46[arg0][arg1] = (byte) arg4;
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(II[BI)[B")
	public static byte[] method1112(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(22) byte[] local22;
		if (arg0 > 0) {
			local22 = new byte[arg2];
			for (@Pc(24) int local24 = 0; local24 < arg2; local24++) {
				local22[local24] = arg1[arg0 + local24];
			}
		} else {
			local22 = arg1;
		}
		@Pc(46) Class200 local46 = new Class200();
		local46.method4507();
		local46.method4508((long) (arg2 * 8), local22);
		@Pc(60) byte[] local60 = new byte[64];
		local46.method4511(local60);
		return local60;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IIIBIIII)V")
	public static void method1114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg1 - arg3;
		@Pc(19) int local19 = arg0 - arg3;
		@Pc(23) int local23 = arg1 * arg1;
		@Pc(27) int local27 = arg0 * arg0;
		@Pc(31) int local31 = local15 * local15;
		@Pc(35) int local35 = local19 * local19;
		@Pc(39) int local39 = local27 << 1;
		@Pc(43) int local43 = local23 << 1;
		@Pc(47) int local47 = local35 << 1;
		@Pc(51) int local51 = local31 << 1;
		@Pc(55) int local55 = arg0 << 1;
		@Pc(59) int local59 = local19 << 1;
		@Pc(68) int local68 = local39 + (1 - local55) * local23;
		@Pc(77) int local77 = local27 - local43 * (local55 - 1);
		@Pc(86) int local86 = local47 + local31 * (1 - local59);
		@Pc(95) int local95 = local35 - local51 * (local59 - 1);
		@Pc(99) int local99 = local23 << 2;
		@Pc(103) int local103 = local27 << 2;
		@Pc(107) int local107 = local31 << 2;
		@Pc(111) int local111 = local35 << 2;
		@Pc(115) int local115 = local39 * 3;
		@Pc(121) int local121 = local43 * (local55 - 3);
		@Pc(125) int local125 = local47 * 3;
		@Pc(131) int local131 = (local59 - 3) * local51;
		@Pc(133) int local133 = local103;
		@Pc(139) int local139 = (arg0 - 1) * local99;
		@Pc(141) int local141 = local111;
		@Pc(147) int local147 = (local19 - 1) * local107;
		@Pc(151) int[] local151 = Static274.anIntArrayArray34[arg6];
		Static679.method9323(local151, arg4 - arg1, arg5, arg4 - local15);
		Static679.method9323(local151, arg4 - local15, arg2, local15 + arg4);
		Static679.method9323(local151, local15 + arg4, arg5, arg4 + arg1);
		while (local9 > 0) {
			@Pc(201) boolean local201 = local19 >= local9;
			if (local68 < 0) {
				while (local68 < 0) {
					local77 += local133;
					local68 += local115;
					local115 += local103;
					local7++;
					local133 += local103;
				}
			}
			if (local201) {
				if (local86 < 0) {
					while (local86 < 0) {
						local86 += local125;
						local95 += local141;
						local11++;
						local141 += local111;
						local125 += local111;
					}
				}
				if (local95 < 0) {
					local95 += local141;
					local86 += local125;
					local125 += local111;
					local141 += local111;
					local11++;
				}
				local95 += -local131;
				local86 += -local147;
				local131 -= local107;
				local147 -= local107;
			}
			if (local77 < 0) {
				local68 += local115;
				local77 += local133;
				local115 += local103;
				local133 += local103;
				local7++;
			}
			local77 += -local121;
			local68 += -local139;
			local121 -= local99;
			local9--;
			local139 -= local99;
			@Pc(335) int local335 = arg6 - local9;
			@Pc(339) int local339 = local9 + arg6;
			@Pc(343) int local343 = arg4 + local7;
			@Pc(348) int local348 = arg4 - local7;
			if (local201) {
				@Pc(373) int local373 = arg4 + local11;
				@Pc(378) int local378 = arg4 - local11;
				Static679.method9323(Static274.anIntArrayArray34[local335], local348, arg5, local378);
				Static679.method9323(Static274.anIntArrayArray34[local335], local378, arg2, local373);
				Static679.method9323(Static274.anIntArrayArray34[local335], local373, arg5, local343);
				Static679.method9323(Static274.anIntArrayArray34[local339], local348, arg5, local378);
				Static679.method9323(Static274.anIntArrayArray34[local339], local378, arg2, local373);
				Static679.method9323(Static274.anIntArrayArray34[local339], local373, arg5, local343);
			} else {
				Static679.method9323(Static274.anIntArrayArray34[local335], local348, arg5, local343);
				Static679.method9323(Static274.anIntArrayArray34[local339], local348, arg5, local343);
			}
		}
	}
}
