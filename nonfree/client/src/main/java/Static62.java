import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!cu", name = "d", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_21 = new Class146(17, -1);

	@OriginalMember(owner = "client!cu", name = "e", descriptor = "I")
	public static int anInt1112 = 0;

	@OriginalMember(owner = "client!cu", name = "g", descriptor = "[Lclient!je;")
	public static final Class133[] aClass133Array1 = new Class133[8];

	@OriginalMember(owner = "client!cu", name = "h", descriptor = "I")
	public static int anInt1114 = 0;

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
	public static void method867(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		Static76.aString7 = arg1;
		Static160.aString55 = arg0;
		if (Static50.anInt812 != 3 && (Static76.aString7.equals("") || Static160.aString55.equals(""))) {
			Static179.method2497(3);
			return;
		}
		if (Static50.anInt812 != 1) {
			Static308.anInt5038 = 0;
			Static325.anInt5268 = -1;
		}
		Static188.aBoolean267 = false;
		Static179.method2497(-3);
		Static263.anInt4362 = 0;
		Static364.anInt6029 = 0;
		Static166.anInt3041 = 1;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIIIII)V")
	public static void method868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(13) int local13 = arg3 * arg3;
		@Pc(17) int local17 = arg1 * arg1;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg1 << 1;
		@Pc(38) int local38 = local21 + (1 - local29) * local13;
		@Pc(47) int local47 = local17 - local25 * (local29 - 1);
		@Pc(51) int local51 = local13 << 2;
		@Pc(55) int local55 = local17 << 2;
		@Pc(63) int local63 = local21 * 3;
		@Pc(71) int local71 = ((arg1 << 1) - 3) * local25;
		@Pc(77) int local77 = local55;
		@Pc(95) int local95;
		@Pc(104) int local104;
		if (arg0 >= Static254.anInt4211 && arg0 <= Static275.anInt4594) {
			local95 = Static39.method544(arg4 + arg3, anInt1114, Static207.anInt3632);
			local104 = Static39.method544(arg4 - arg3, anInt1114, Static207.anInt3632);
			Static249.method6044(Static267.anIntArrayArray50[arg0], arg2, local95, local104);
		}
		@Pc(118) int local118 = (arg1 - 1) * local51;
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local47 += local77;
					local38 += local63;
					local77 += local55;
					local63 += local55;
					local7++;
				}
			}
			if (local47 < 0) {
				local47 += local77;
				local38 += local63;
				local63 += local55;
				local7++;
				local77 += local55;
			}
			local47 += -local71;
			local38 += -local118;
			local71 -= local51;
			local118 -= local51;
			local9--;
			local95 = arg0 - local9;
			local104 = arg0 + local9;
			if (Static254.anInt4211 <= local104 && local95 <= Static275.anInt4594) {
				@Pc(217) int local217 = Static39.method544(arg4 + local7, anInt1114, Static207.anInt3632);
				@Pc(226) int local226 = Static39.method544(arg4 - local7, anInt1114, Static207.anInt3632);
				if (local95 >= Static254.anInt4211) {
					Static249.method6044(Static267.anIntArrayArray50[local95], arg2, local217, local226);
				}
				if (local104 <= Static275.anInt4594) {
					Static249.method6044(Static267.anIntArrayArray50[local104], arg2, local217, local226);
				}
			}
		}
	}
}
