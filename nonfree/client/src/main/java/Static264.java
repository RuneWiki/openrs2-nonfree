import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "J")
	public static long aLong133;

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "[I")
	public static final int[] anIntArray261 = new int[] { 1, 4, 1, 2 };

	@OriginalMember(owner = "client!jba", name = "c", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_170 = new Class179(85, 20);

	@OriginalMember(owner = "client!jba", name = "f", descriptor = "I")
	public static int anInt4577 = 0;

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IIIIII)V")
	public static void method3895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(13) int local13 = arg4 * arg4;
		@Pc(17) int local17 = arg0 * arg0;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg0 << 1;
		@Pc(39) int local39 = local13 * (1 - local29) + local21;
		@Pc(48) int local48 = local17 - local25 * (local29 - 1);
		@Pc(56) int local56 = local13 << 2;
		@Pc(60) int local60 = local17 << 2;
		@Pc(68) int local68 = local21 * 3;
		@Pc(76) int local76 = ((arg0 << 1) - 3) * local25;
		@Pc(82) int local82 = local60;
		@Pc(88) int local88 = local56 * (arg0 - 1);
		@Pc(106) int local106;
		@Pc(115) int local115;
		if (arg2 >= Static55.anInt4238 && arg2 <= Static292.anInt4921) {
			local106 = Static154.method2176(arg4 + arg3, Static153.anInt2554, Static502.anInt8456);
			local115 = Static154.method2176(arg3 - arg4, Static153.anInt2554, Static502.anInt8456);
			Static270.method3998(arg1, local115, local106, Static173.anIntArrayArray15[arg2]);
		}
		while (local9 > 0) {
			if (local39 < 0) {
				while (local39 < 0) {
					local39 += local68;
					local48 += local82;
					local82 += local60;
					local7++;
					local68 += local60;
				}
			}
			if (local48 < 0) {
				local48 += local82;
				local39 += local68;
				local82 += local60;
				local68 += local60;
				local7++;
			}
			local48 += -local76;
			local39 += -local88;
			local9--;
			local76 -= local56;
			local88 -= local56;
			local106 = arg2 - local9;
			local115 = arg2 + local9;
			if (local115 >= Static55.anInt4238 && Static292.anInt4921 >= local106) {
				@Pc(219) int local219 = Static154.method2176(local7 + arg3, Static153.anInt2554, Static502.anInt8456);
				@Pc(228) int local228 = Static154.method2176(arg3 - local7, Static153.anInt2554, Static502.anInt8456);
				if (local106 >= Static55.anInt4238) {
					Static270.method3998(arg1, local228, local219, Static173.anIntArrayArray15[local106]);
				}
				if (local115 <= Static292.anInt4921) {
					Static270.method3998(arg1, local228, local219, Static173.anIntArrayArray15[local115]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IIII)V")
	public static void method3896(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		@Pc(3) int local3 = arg1 << 3;
		@Pc(15) int local15 = arg0 << 3;
		Static132.aFloat14 = (float) local15;
		Static228.aFloat26 = (float) local3;
		if (Static407.anInt6820 == 2) {
			Static672.anInt10375 = local3;
			Static536.anInt8770 = 0;
			Static598.anInt9788 = local15;
		}
		Static678.method9178();
		Static70.aBoolean70 = true;
	}
}
