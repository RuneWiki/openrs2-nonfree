import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!fa", name = "w", descriptor = "I")
	public static int anInt2250;

	@OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
	public static int anInt2242 = 0;

	@OriginalMember(owner = "client!fa", name = "t", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_65 = new Class186(95, 6);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1665(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		Static345.method4818(arg1, arg0, arg2, 0, arg5, arg4, arg3);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIIII)V")
	public static void method1667(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(13) int local13 = arg2 * arg2;
		@Pc(17) int local17 = arg3 * arg3;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg3 << 1;
		@Pc(38) int local38 = local13 * (1 - local29) + local21;
		@Pc(47) int local47 = local17 - (local29 - 1) * local25;
		@Pc(51) int local51 = local13 << 2;
		@Pc(55) int local55 = local17 << 2;
		@Pc(63) int local63 = local21 * 3;
		@Pc(71) int local71 = ((arg3 << 1) - 3) * local25;
		@Pc(77) int local77 = local55;
		@Pc(83) int local83 = (arg3 - 1) * local51;
		@Pc(104) int local104;
		@Pc(112) int local112;
		if (Static388.anInt6740 <= arg4 && arg4 <= Static387.anInt6727) {
			local104 = Static360.method5003(Static198.anInt3778, Static414.anInt7043, arg0 + arg2);
			local112 = Static360.method5003(Static198.anInt3778, Static414.anInt7043, arg0 - arg2);
			Static335.method4533(local104, arg1, local112, Static162.anIntArrayArray58[arg4]);
		}
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local47 += local77;
					local38 += local63;
					local77 += local55;
					local7++;
					local63 += local55;
				}
			}
			if (local47 < 0) {
				local38 += local63;
				local47 += local77;
				local63 += local55;
				local77 += local55;
				local7++;
			}
			local47 += -local71;
			local38 += -local83;
			local9--;
			local71 -= local51;
			local83 -= local51;
			local104 = arg4 - local9;
			local112 = local9 + arg4;
			if (local112 >= Static388.anInt6740 && local104 <= Static387.anInt6727) {
				@Pc(219) int local219 = Static360.method5003(Static198.anInt3778, Static414.anInt7043, local7 + arg0);
				@Pc(227) int local227 = Static360.method5003(Static198.anInt3778, Static414.anInt7043, arg0 - local7);
				if (Static388.anInt6740 <= local104) {
					Static335.method4533(local219, arg1, local227, Static162.anIntArrayArray58[local104]);
				}
				if (local112 <= Static387.anInt6727) {
					Static335.method4533(local219, arg1, local227, Static162.anIntArrayArray58[local112]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IC)Z")
	public static boolean method1668(@OriginalArg(1) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V")
	public static void method1669() {
		Static83.anInt1893 = 0;
		Static126.aClass258_19.method5527();
		Static346.aBoolean427 = false;
	}
}
