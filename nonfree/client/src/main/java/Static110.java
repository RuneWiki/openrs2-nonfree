import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!ee", name = "i", descriptor = "F")
	public static float aFloat27;

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
	public static int anInt2599 = 0;

	@OriginalMember(owner = "client!ee", name = "k", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_34 = new Class276(34, 8);

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIII)V")
	public static void method2296(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(13) int local13 = arg3 * arg3;
		@Pc(17) int local17 = arg1 * arg1;
		@Pc(21) int local21 = local17 << 1;
		@Pc(29) int local29 = local13 << 1;
		@Pc(33) int local33 = arg1 << 1;
		@Pc(41) int local41 = local21 + (1 - local33) * local13;
		@Pc(50) int local50 = local17 - (local33 - 1) * local29;
		@Pc(54) int local54 = local13 << 2;
		@Pc(58) int local58 = local17 << 2;
		@Pc(66) int local66 = local21 * 3;
		@Pc(74) int local74 = local29 * ((arg1 << 1) - 3);
		@Pc(80) int local80 = local58;
		@Pc(104) int local104;
		@Pc(112) int local112;
		if (Static55.anInt1303 <= arg4 && Static208.anInt4309 >= arg4) {
			local104 = Static44.method1168(Static35.anInt993, Static535.anInt9696, arg2 + arg3);
			local112 = Static44.method1168(Static35.anInt993, Static535.anInt9696, arg2 - arg3);
			Static426.method6794(local104, Static333.anIntArrayArray56[arg4], local112, arg0);
		}
		@Pc(126) int local126 = (arg1 - 1) * local54;
		while (local9 > 0) {
			if (local41 < 0) {
				while (local41 < 0) {
					local50 += local80;
					local41 += local66;
					local66 += local58;
					local7++;
					local80 += local58;
				}
			}
			if (local50 < 0) {
				local41 += local66;
				local50 += local80;
				local66 += local58;
				local80 += local58;
				local7++;
			}
			local41 += -local126;
			local50 += -local74;
			local74 -= local54;
			local126 -= local54;
			local9--;
			local104 = arg4 - local9;
			local112 = arg4 + local9;
			if (Static55.anInt1303 <= local112 && Static208.anInt4309 >= local104) {
				@Pc(222) int local222 = Static44.method1168(Static35.anInt993, Static535.anInt9696, local7 + arg2);
				@Pc(230) int local230 = Static44.method1168(Static35.anInt993, Static535.anInt9696, arg2 - local7);
				if (local104 >= Static55.anInt1303) {
					Static426.method6794(local222, Static333.anIntArrayArray56[local104], local230, arg0);
				}
				if (Static208.anInt4309 >= local112) {
					Static426.method6794(local222, Static333.anIntArrayArray56[local112], local230, arg0);
				}
			}
		}
	}
}
