import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
	public static int anInt906;

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "Lclient!cm;")
	public static final Class10_Sub11 aClass10_Sub11_1 = new Class10_Sub11(0, 0);

	@OriginalMember(owner = "client!cf", name = "q", descriptor = "I")
	public static final int anInt908 = 1406;

	@OriginalMember(owner = "client!cf", name = "r", descriptor = "[I")
	public static final int[] anIntArray73 = new int[32];

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!ig;B)V")
	public static void method853(@OriginalArg(0) Class24_Sub3_Sub2_Sub1 arg0) {
		for (@Pc(8) Class10_Sub23 local8 = (Class10_Sub23) Static104.aClass163_19.method3620(); local8 != null; local8 = (Class10_Sub23) Static104.aClass163_19.method3621()) {
			if (local8.aClass24_Sub3_Sub2_Sub1_1 == arg0) {
				if (local8.aClass10_Sub7_Sub1_2 != null) {
					Static461.aClass10_Sub7_Sub2_5.method1841(local8.aClass10_Sub7_Sub1_2);
					local8.aClass10_Sub7_Sub1_2 = null;
				}
				local8.method6033();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)[Lclient!lb;")
	public static Class151[] method854() {
		return new Class151[] { Static110.aClass151_5, Static8.aClass151_1, Static307.aClass151_9, Static57.aClass151_2, Static208.aClass151_6, Static460.aClass151_10 };
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 < 1 || arg4 < 1 || Static2.anInt7 - 2 < arg2 || Static17.anInt315 - 2 < arg4) {
			return;
		}
		@Pc(37) int local37 = arg3;
		if (arg3 < 3 && Static178.method2948(arg4, arg2)) {
			local37 = arg3 + 1;
		}
		if (!Static361.aClass85_Sub1_1.method2113(Static423.anInt7114) && !Static28.method367(local37, Static166.anInt3284, arg4, arg2)) {
			return;
		}
		if (Static309.aClass11ArrayArrayArray2 == null) {
			return;
		}
		Static356.aClass101_Sub1_1.method2440(Static412.aClass50_8, Static11.aClass220Array1[arg3], arg1, arg2, arg3, arg4);
		if (arg6 < 0) {
			return;
		}
		@Pc(81) boolean local81 = Static361.aClass85_Sub1_1.aBoolean165;
		Static361.aClass85_Sub1_1.aBoolean165 = true;
		Static356.aClass101_Sub1_1.method2448(arg4, arg0, Static11.aClass220Array1[arg3], arg6, arg2, arg3, arg7, Static412.aClass50_8, arg5, local37);
		Static361.aClass85_Sub1_1.aBoolean165 = local81;
		return;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIBI)V")
	public static void method858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(13) int local13 = arg4 * arg4;
		@Pc(17) int local17 = arg1 * arg1;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg1 << 1;
		@Pc(44) int local44 = local13 * (1 - local29) + local21;
		@Pc(52) int local52 = local17 - (local29 - 1) * local25;
		@Pc(56) int local56 = local13 << 2;
		@Pc(60) int local60 = local17 << 2;
		@Pc(68) int local68 = local21 * 3;
		@Pc(76) int local76 = ((arg1 << 1) - 3) * local25;
		@Pc(82) int local82 = local60;
		@Pc(88) int local88 = local56 * (arg1 - 1);
		Static212.method3267(arg2 - arg4, arg4 + arg2, arg3, Class10_Sub10_Sub1.lb[arg0]);
		while (local9 > 0) {
			if (local44 < 0) {
				while (local44 < 0) {
					local52 += local82;
					local44 += local68;
					local82 += local60;
					local7++;
					local68 += local60;
				}
			}
			if (local52 < 0) {
				local52 += local82;
				local44 += local68;
				local82 += local60;
				local7++;
				local68 += local60;
			}
			local52 += -local76;
			local44 += -local88;
			local76 -= local56;
			local88 -= local56;
			local9--;
			@Pc(174) int local174 = arg0 - local9;
			@Pc(178) int local178 = arg0 + local9;
			@Pc(182) int local182 = arg2 + local7;
			@Pc(187) int local187 = arg2 - local7;
			Static212.method3267(local187, local182, arg3, Class10_Sub10_Sub1.lb[local174]);
			Static212.method3267(local187, local182, arg3, Class10_Sub10_Sub1.lb[local178]);
		}
	}
}
