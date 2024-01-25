import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static641 {

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "Lclient!o;")
	public static final Class260 aClass260_12 = new Class260(4);

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIIII)V")
	public static void method8993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = arg5;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21 = arg2 - arg4;
		@Pc(26) int local26 = arg5 - arg4;
		@Pc(30) int local30 = arg2 * arg2;
		@Pc(34) int local34 = arg5 * arg5;
		@Pc(38) int local38 = local21 * local21;
		@Pc(42) int local42 = local26 * local26;
		@Pc(46) int local46 = local34 << 1;
		@Pc(50) int local50 = local30 << 1;
		@Pc(54) int local54 = local42 << 1;
		@Pc(58) int local58 = local38 << 1;
		@Pc(62) int local62 = arg5 << 1;
		@Pc(66) int local66 = local26 << 1;
		@Pc(76) int local76 = local30 * (1 - local62) + local46;
		@Pc(85) int local85 = local34 - local50 * (local62 - 1);
		@Pc(94) int local94 = (1 - local66) * local38 + local54;
		@Pc(103) int local103 = local42 - (local66 - 1) * local58;
		@Pc(107) int local107 = local30 << 2;
		@Pc(111) int local111 = local34 << 2;
		@Pc(115) int local115 = local38 << 2;
		@Pc(119) int local119 = local42 << 2;
		@Pc(123) int local123 = local46 * 3;
		@Pc(129) int local129 = (local62 - 3) * local50;
		@Pc(133) int local133 = local54 * 3;
		@Pc(139) int local139 = local58 * (local66 - 3);
		@Pc(141) int local141 = local111;
		@Pc(147) int local147 = local107 * (arg5 - 1);
		@Pc(149) int local149 = local119;
		@Pc(155) int local155 = local115 * (local26 - 1);
		@Pc(159) int[] local159 = Static144.anIntArrayArray30[arg3];
		Static240.method4038(arg6 - local21, local159, arg0, arg6 - arg2);
		Static240.method4038(local21 + arg6, local159, arg1, arg6 - local21);
		Static240.method4038(arg2 + arg6, local159, arg0, arg6 + local21);
		while (local7 > 0) {
			@Pc(204) boolean local204 = local7 <= local26;
			if (local204) {
				if (local94 < 0) {
					while (local94 < 0) {
						local103 += local149;
						local94 += local133;
						local133 += local119;
						local16++;
						local149 += local119;
					}
				}
				if (local103 < 0) {
					local103 += local149;
					local94 += local133;
					local133 += local119;
					local149 += local119;
					local16++;
				}
				local103 += -local139;
				local94 += -local155;
				local155 -= local115;
				local139 -= local115;
			}
			if (local76 < 0) {
				while (local76 < 0) {
					local76 += local123;
					local85 += local141;
					local123 += local111;
					local141 += local111;
					local5++;
				}
			}
			if (local85 < 0) {
				local85 += local141;
				local76 += local123;
				local123 += local111;
				local5++;
				local141 += local111;
			}
			local76 += -local147;
			local85 += -local129;
			local129 -= local107;
			local147 -= local107;
			local7--;
			@Pc(350) int local350 = arg3 - local7;
			@Pc(354) int local354 = local7 + arg3;
			@Pc(359) int local359 = arg6 + local5;
			@Pc(364) int local364 = arg6 - local5;
			if (local204) {
				@Pc(388) int local388 = local16 + arg6;
				@Pc(393) int local393 = arg6 - local16;
				Static240.method4038(local393, Static144.anIntArrayArray30[local350], arg0, local364);
				Static240.method4038(local388, Static144.anIntArrayArray30[local350], arg1, local393);
				Static240.method4038(local359, Static144.anIntArrayArray30[local350], arg0, local388);
				Static240.method4038(local393, Static144.anIntArrayArray30[local354], arg0, local364);
				Static240.method4038(local388, Static144.anIntArrayArray30[local354], arg1, local393);
				Static240.method4038(local359, Static144.anIntArrayArray30[local354], arg0, local388);
			} else {
				Static240.method4038(local359, Static144.anIntArrayArray30[local350], arg0, local364);
				Static240.method4038(local359, Static144.anIntArrayArray30[local354], arg0, local364);
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(B[BLclient!md;I)Lclient!un;")
	public static Class368 method8996(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class144_Sub1_Sub2 arg1) {
		if (arg0 == null) {
			return null;
		}
		@Pc(24) int local24 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local24);
		OpenGL.glProgramRawARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static610.anIntArray546, 0);
		if (Static610.anIntArray546[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class368(arg1, 34336, local24);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(IIIIIIII)V")
	public static void method8997(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(19) int local19 = Static301.method5308(Static410.anInt7068, Static281.anInt5188, arg5);
		@Pc(25) int local25 = Static301.method5308(Static410.anInt7068, Static281.anInt5188, arg6);
		@Pc(31) int local31 = Static301.method5308(Static468.anInt7895, Static382.anInt6719, arg3);
		@Pc(37) int local37 = Static301.method5308(Static468.anInt7895, Static382.anInt6719, arg1);
		@Pc(45) int local45 = Static301.method5308(Static410.anInt7068, Static281.anInt5188, arg2 + arg5);
		@Pc(53) int local53 = Static301.method5308(Static410.anInt7068, Static281.anInt5188, arg6 - arg2);
		for (@Pc(55) int local55 = local19; local55 < local45; local55++) {
			Static240.method4038(local37, Static144.anIntArrayArray30[local55], arg4, local31);
		}
		for (@Pc(73) int local73 = local25; local73 > local53; local73--) {
			Static240.method4038(local37, Static144.anIntArrayArray30[local73], arg4, local31);
		}
		@Pc(99) int local99 = Static301.method5308(Static468.anInt7895, Static382.anInt6719, arg2 + arg3);
		@Pc(107) int local107 = Static301.method5308(Static468.anInt7895, Static382.anInt6719, arg1 - arg2);
		for (@Pc(109) int local109 = local45; local109 <= local53; local109++) {
			@Pc(117) int[] local117 = Static144.anIntArrayArray30[local109];
			Static240.method4038(local99, local117, arg4, local31);
			Static240.method4038(local107, local117, arg0, local99);
			Static240.method4038(local37, local117, arg4, local107);
		}
	}
}
