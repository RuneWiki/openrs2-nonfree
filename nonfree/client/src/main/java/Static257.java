import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "Lclient!bn;")
	public static final Class24 aClass24_1 = Static360.method5112();

	@OriginalMember(owner = "client!mt", name = "e", descriptor = "I")
	public static int anInt4778 = -1;

	@OriginalMember(owner = "client!mt", name = "f", descriptor = "Z")
	public static boolean aBoolean357 = false;

	@OriginalMember(owner = "client!mt", name = "g", descriptor = "Lclient!ad;")
	public static final Class5 aClass5_42 = new Class5(64);

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIIII)V")
	public static void method3887(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(12) int local12 = -arg2;
		Static15.method463(arg0, Static376.anIntArrayArray64[arg1], arg3 - arg2, arg3 - -arg2);
		@Pc(35) int local35 = -1;
		while (local7 < local9) {
			local35 += 2;
			local7++;
			local12 += local35;
			if (local12 >= 0) {
				local9--;
				local12 -= local9 << 1;
				@Pc(58) int[] local58 = Static376.anIntArrayArray64[local9 + arg1];
				@Pc(65) int[] local65 = Static376.anIntArrayArray64[arg1 - local9];
				@Pc(70) int local70 = arg3 + local7;
				@Pc(75) int local75 = arg3 - local7;
				Static15.method463(arg0, local58, local75, local70);
				Static15.method463(arg0, local65, local75, local70);
			}
			@Pc(91) int local91 = local9 + arg3;
			@Pc(96) int local96 = arg3 - local9;
			@Pc(102) int[] local102 = Static376.anIntArrayArray64[local7 + arg1];
			@Pc(109) int[] local109 = Static376.anIntArrayArray64[arg1 - local7];
			Static15.method463(arg0, local102, local96, local91);
			Static15.method463(arg0, local109, local96, local91);
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIII)Z")
	public static boolean method3888(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Interface12 local9 = (Interface12) Static391.method5292(arg0, arg2, arg1);
		@Pc(11) boolean local11 = true;
		if (local9 != null) {
			local11 = Static319.method4635(local9) & true;
		}
		local9 = (Interface12) Static372.method1267(arg0, arg2, arg1, wk.class);
		if (local9 != null) {
			local11 &= Static319.method4635(local9);
		}
		local9 = (Interface12) Static11.method399(arg0, arg2, arg1);
		if (local9 != null) {
			local11 &= Static319.method4635(local9);
		}
		return local11;
	}
}
