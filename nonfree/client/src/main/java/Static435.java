import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static435 {

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
	public static int anInt6852 = 500;

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "Lclient!ei;")
	public static final Class91 aClass91_3 = new Class91();

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
	public static int anInt6854 = 0;

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIB)V")
	public static void method6037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(12) int local12 = -arg0;
		@Pc(14) int local14 = -1;
		Static559.method7424(arg3, Static172.anIntArrayArray17[arg2], arg0 + arg1, arg1 + -arg0);
		while (local9 > local7) {
			local14 += 2;
			local7++;
			local12 += local14;
			if (local12 >= 0) {
				local9--;
				local12 -= local9 << 1;
				@Pc(58) int[] local58 = Static172.anIntArrayArray17[local9 + arg2];
				@Pc(65) int[] local65 = Static172.anIntArrayArray17[arg2 - local9];
				@Pc(69) int local69 = local7 + arg1;
				@Pc(74) int local74 = arg1 - local7;
				Static559.method7424(arg3, local58, local69, local74);
				Static559.method7424(arg3, local65, local69, local74);
			}
			@Pc(90) int local90 = arg1 + local9;
			@Pc(94) int local94 = arg1 - local9;
			@Pc(101) int[] local101 = Static172.anIntArrayArray17[arg2 + local7];
			@Pc(108) int[] local108 = Static172.anIntArrayArray17[arg2 - local7];
			Static559.method7424(arg3, local101, local90, local94);
			Static559.method7424(arg3, local108, local90, local94);
		}
	}
}
