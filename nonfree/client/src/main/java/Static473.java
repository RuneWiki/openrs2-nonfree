import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static473 {

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
	public static int anInt8858;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIZIIIIIIIIII)V")
	public static void method7261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (Static224.aClass4Array3 == null) {
			return;
		}
		@Pc(8) Class2_Sub2_Sub1 local8 = null;
		@Pc(14) int local14;
		if (arg12 >= 0) {
			local14 = arg12 - 1;
			@Pc(21) Class3_Sub46 local21 = (Class3_Sub46) Static331.aClass25_25.method946((long) local14);
			if (local21 != null) {
				local8 = local21.aClass2_Sub2_Sub1_Sub2_2;
			}
		} else {
			local14 = -arg12 - 1;
			if (local14 == Static381.anInt1560) {
				local8 = Static443.aClass2_Sub2_Sub1_Sub1_2;
			} else {
				local8 = Static378.aClass2_Sub2_Sub1_Sub1Array10[local14];
			}
		}
		if (local8 == null) {
			return;
		}
		@Pc(55) Class292 local55 = Static253.aClass146_2.method3356(arg1);
		@Pc(66) int local66;
		@Pc(69) int local69;
		if (arg7 == 1 || arg7 == 3) {
			local66 = local55.anInt8734;
			local69 = local55.anInt8775;
		} else {
			local69 = local55.anInt8734;
			local66 = local55.anInt8775;
		}
		@Pc(83) int local83 = arg5 + (local69 >> 1);
		@Pc(91) int local91 = (local69 + 1 >> 1) + arg5;
		@Pc(97) int local97 = (local66 >> 1) + arg9;
		@Pc(105) int local105 = (local66 + 1 >> 1) + arg9;
		@Pc(109) Class4 local109 = Static224.aClass4Array3[arg0];
		@Pc(133) int local133 = local109.JA(local83, local97) + local109.JA(local91, local97) + local109.JA(local83, local105) + local109.JA(local91, local105) >> 2;
		@Pc(137) Class3_Sub25 local137 = new Class3_Sub25();
		local137.anInt4623 = arg7;
		local137.anInt4611 = arg5;
		local137.anInt4612 = arg3;
		local137.anInt4621 = arg9;
		local137.anInt4614 = local8.aByte103;
		local137.anInt4619 = arg1;
		local137.anInt4615 = Static129.anInt10429 + arg10;
		@Pc(167) int local167;
		if (arg11 < arg8) {
			local167 = arg8;
			arg8 = arg11;
			arg11 = local167;
		}
		local137.anInt4617 = Static129.anInt10429 + arg2;
		local137.anInt4610 = arg11 + arg5;
		if (arg4 < arg6) {
			local167 = arg6;
			arg6 = arg4;
			arg4 = local167;
		}
		local137.anInt4613 = arg5 + arg8;
		local137.anInt4607 = arg6 + arg9;
		local137.anInt4609 = local133;
		local137.anInt4618 = (local66 << 8) + (local137.anInt4621 << 9);
		local137.anInt4608 = arg4 + arg9;
		local137.anInt4606 = (local69 << 8) + (local137.anInt4611 << 9);
		Static533.aClass183_58.method4792(local137);
		local8.aClass3_Sub25_3 = local137;
	}
}
