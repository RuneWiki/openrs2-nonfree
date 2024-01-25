import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "J")
	public static long aLong120 = 0L;

	@OriginalMember(owner = "client!hq", name = "f", descriptor = "I")
	public static int anInt4226 = -1;

	@OriginalMember(owner = "client!hq", name = "x", descriptor = "I")
	public static int anInt4237 = 0;

	@OriginalMember(owner = "client!hq", name = "B", descriptor = "I")
	public static int anInt4241 = 500;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)V")
	public static void method3714() {
		Static51.anInt1431 = 0;
		Static300.anInt5337 = -1;
		Static176.anInt3422 = -1;
		Static520.anInt9372 = -1;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIII)V")
	public static void method3717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(12) int local12 = -arg0;
		@Pc(14) int local14 = -1;
		@Pc(22) int local22 = Static269.method4423(Static630.anInt10099, Static16.anInt4339, arg0 + arg1);
		@Pc(31) int local31 = Static269.method4423(Static630.anInt10099, Static16.anInt4339, arg1 - arg0);
		Static611.method8472(local22, local31, Static460.anIntArrayArray53[arg3], arg2);
		while (local7 < local9) {
			local14 += 2;
			local12 += local14;
			@Pc(60) int local60;
			@Pc(64) int local64;
			@Pc(83) int local83;
			@Pc(94) int local94;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local60 = arg3 - local9;
				local64 = local9 + arg3;
				if (local64 >= Static11.anInt9803 && local60 <= Static149.anInt2949) {
					local83 = Static269.method4423(Static630.anInt10099, Static16.anInt4339, arg1 + local7);
					local94 = Static269.method4423(Static630.anInt10099, Static16.anInt4339, arg1 - local7);
					if (Static149.anInt2949 >= local64) {
						Static611.method8472(local83, local94, Static460.anIntArrayArray53[local64], arg2);
					}
					if (local60 >= Static11.anInt9803) {
						Static611.method8472(local83, local94, Static460.anIntArrayArray53[local60], arg2);
					}
				}
			}
			local7++;
			local60 = arg3 - local7;
			local64 = local7 + arg3;
			if (Static11.anInt9803 <= local64 && local60 <= Static149.anInt2949) {
				local83 = Static269.method4423(Static630.anInt10099, Static16.anInt4339, arg1 + local9);
				local94 = Static269.method4423(Static630.anInt10099, Static16.anInt4339, arg1 - local9);
				if (Static149.anInt2949 >= local64) {
					Static611.method8472(local83, local94, Static460.anIntArrayArray53[local64], arg2);
				}
				if (local60 >= Static11.anInt9803) {
					Static611.method8472(local83, local94, Static460.anIntArrayArray53[local60], arg2);
				}
			}
		}
	}
}
