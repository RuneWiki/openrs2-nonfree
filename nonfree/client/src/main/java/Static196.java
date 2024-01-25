import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!ji", name = "w", descriptor = "Lclient!st;")
	public static Class232 aClass232_1;

	@OriginalMember(owner = "client!ji", name = "B", descriptor = "Lclient!iv;")
	public static Class126 aClass126_1;

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "Lclient!co;")
	public static final Class42 aClass42_1 = new Class42();

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIII)V")
	public static void method2784(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(7) int local7 = arg0 << 3;
		@Pc(11) int local11 = arg1 << 3;
		Static37.aFloat9 = local11;
		if (Static25.anInt7273 == 2) {
			Static144.anInt2665 = local11;
			Static68.anInt1160 = 0;
			Static213.anInt3662 = local7;
		}
		Static234.aFloat30 = local7;
		Static193.method2765();
		Static94.aBoolean395 = true;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIII)V")
	public static void method2786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = arg0;
		@Pc(18) int local18 = arg2 * arg2;
		@Pc(22) int local22 = arg0 * arg0;
		@Pc(26) int local26 = local22 << 1;
		@Pc(30) int local30 = local18 << 1;
		@Pc(34) int local34 = arg0 << 1;
		@Pc(43) int local43 = local26 + local18 * (1 - local34);
		@Pc(51) int local51 = local22 - (local34 - 1) * local30;
		@Pc(55) int local55 = local18 << 2;
		@Pc(59) int local59 = local22 << 2;
		@Pc(67) int local67 = local26 * 3;
		@Pc(75) int local75 = local30 * ((arg0 << 1) - 3);
		@Pc(81) int local81 = local59;
		Static215.method3035(arg4 - arg2, arg2 + arg4, Static46.anIntArrayArray24[arg3], arg1);
		@Pc(100) int local100 = (arg0 - 1) * local55;
		while (local14 > 0) {
			if (local43 < 0) {
				while (local43 < 0) {
					local43 += local67;
					local51 += local81;
					local81 += local59;
					local12++;
					local67 += local59;
				}
			}
			if (local51 < 0) {
				local51 += local81;
				local43 += local67;
				local81 += local59;
				local67 += local59;
				local12++;
			}
			local43 += -local100;
			local51 += -local75;
			local75 -= local55;
			local100 -= local55;
			local14--;
			@Pc(171) int local171 = arg3 - local14;
			@Pc(176) int local176 = arg3 + local14;
			@Pc(181) int local181 = arg4 + local12;
			@Pc(185) int local185 = arg4 - local12;
			Static215.method3035(local185, local181, Static46.anIntArrayArray24[local171], arg1);
			Static215.method3035(local185, local181, Static46.anIntArrayArray24[local176], arg1);
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZZ)Z")
	public static boolean method2794(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
	public static void method2795(@OriginalArg(0) int arg0) {
		Static405.anInt7034 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static212.anInt3636; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static104.anInt1675; local6++) {
				if (Static175.aClass36ArrayArrayArray1[arg0][local3][local6] == null) {
					Static175.aClass36ArrayArrayArray1[arg0][local3][local6] = new Class36(arg0, local3, local6);
				}
			}
		}
	}
}
