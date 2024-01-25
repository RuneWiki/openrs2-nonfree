import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IB)V")
	public static void method5947(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static206.anInt4562 = arg0;
		Static493.aClass4_Sub4Array139 = new Class4_Sub4[Static215.anIntArray427[Static206.anInt4562] + 1];
		Static486.anInt7912 = 0;
		Static510.anInt8899 = 0;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static73.method7829(arg4, Static269.anInt5577, Static81.anInt1788);
		@Pc(17) int local17 = Static73.method7829(arg5, Static269.anInt5577, Static81.anInt1788);
		@Pc(23) int local23 = Static73.method7829(arg2, Static190.anInt4314, Static145.anInt2941);
		@Pc(29) int local29 = Static73.method7829(arg6, Static190.anInt4314, Static145.anInt2941);
		@Pc(38) int local38 = Static73.method7829(arg4 + arg0, Static269.anInt5577, Static81.anInt1788);
		@Pc(47) int local47 = Static73.method7829(arg5 - arg0, Static269.anInt5577, Static81.anInt1788);
		for (@Pc(53) int local53 = local11; local53 < local38; local53++) {
			Static257.method4540(Static68.anIntArrayArray24[local53], arg3, local23, local29);
		}
		for (@Pc(73) int local73 = local17; local73 > local47; local73--) {
			Static257.method4540(Static68.anIntArrayArray24[local73], arg3, local23, local29);
		}
		@Pc(99) int local99 = Static73.method7829(arg0 + arg2, Static190.anInt4314, Static145.anInt2941);
		@Pc(108) int local108 = Static73.method7829(arg6 - arg0, Static190.anInt4314, Static145.anInt2941);
		for (@Pc(110) int local110 = local38; local110 <= local47; local110++) {
			@Pc(116) int[] local116 = Static68.anIntArrayArray24[local110];
			Static257.method4540(local116, arg3, local23, local99);
			Static257.method4540(local116, arg1, local99, local108);
			Static257.method4540(local116, arg3, local108, local29);
		}
	}
}
