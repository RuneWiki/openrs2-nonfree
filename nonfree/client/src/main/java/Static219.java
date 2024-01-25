import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!kq", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString36;

	@OriginalMember(owner = "client!kq", name = "j", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_57 = new Class177(61, 4);

	@OriginalMember(owner = "client!kq", name = "k", descriptor = "[[I")
	public static final int[][] anIntArrayArray36 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!kq", name = "m", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_58 = new Class177(30, 3);

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIIII)V")
	public static void method3421(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(13) int local13 = arg0 * arg0;
		@Pc(17) int local17 = arg3 * arg3;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg3 << 1;
		@Pc(39) int local39 = local13 * (1 - local29) + local21;
		@Pc(47) int local47 = local17 - local25 * (local29 - 1);
		@Pc(51) int local51 = local13 << 2;
		@Pc(55) int local55 = local17 << 2;
		@Pc(63) int local63 = local21 * 3;
		@Pc(71) int local71 = local25 * ((arg3 << 1) - 3);
		@Pc(82) int local82 = local55;
		@Pc(88) int local88 = (arg3 - 1) * local51;
		@Pc(106) int local106;
		@Pc(115) int local115;
		if (arg2 >= Static362.anInt6654 && arg2 <= Static164.anInt6595) {
			local106 = Static337.method4744(arg4 + arg0, Static70.anInt1843, Static105.anInt2417);
			local115 = Static337.method4744(arg4 - arg0, Static70.anInt1843, Static105.anInt2417);
			Static228.method3480(local115, arg1, Static60.anIntArrayArray14[arg2], local106);
		}
		while (local9 > 0) {
			if (local39 < 0) {
				while (local39 < 0) {
					local47 += local82;
					local39 += local63;
					local63 += local55;
					local7++;
					local82 += local55;
				}
			}
			if (local47 < 0) {
				local47 += local82;
				local39 += local63;
				local7++;
				local82 += local55;
				local63 += local55;
			}
			local39 += -local88;
			local47 += -local71;
			local88 -= local51;
			local9--;
			local71 -= local51;
			local106 = arg2 - local9;
			local115 = local9 + arg2;
			if (local115 >= Static362.anInt6654 && local106 <= Static164.anInt6595) {
				@Pc(222) int local222 = Static337.method4744(arg4 + local7, Static70.anInt1843, Static105.anInt2417);
				@Pc(231) int local231 = Static337.method4744(arg4 - local7, Static70.anInt1843, Static105.anInt2417);
				if (Static362.anInt6654 <= local106) {
					Static228.method3480(local231, arg1, Static60.anIntArrayArray14[local106], local222);
				}
				if (Static164.anInt6595 >= local115) {
					Static228.method3480(local231, arg1, Static60.anIntArrayArray14[local115], local222);
				}
			}
		}
	}
}
