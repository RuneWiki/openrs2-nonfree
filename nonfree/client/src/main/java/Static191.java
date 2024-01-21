import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!ua", name = "B", descriptor = "[I")
	public static int[] anIntArray364;

	@OriginalMember(owner = "client!ua", name = "Y", descriptor = "Lclient!oc;")
	public static Class71_Sub1 aClass71_Sub1_24;

	@OriginalMember(owner = "client!ua", name = "L", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_1381 = Static151.method2243("Password: ");

	@OriginalMember(owner = "client!ua", name = "P", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1382 = aClass62_1381;

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "(B)V")
	public static void method2738() {
		@Pc(7) int local7 = Static46.anInt1034;
		@Pc(9) int local9 = Static21.anInt505;
		@Pc(11) int local11 = Static157.anInt3335;
		@Pc(13) int local13 = Static145.anInt3129;
		Static212.method3103(local7, local9, local11, local13, 6116423);
		Static212.method3103(local7 + 1, local9 + 1, local11 - 2, 16, 0);
		Static212.method3106(local7 + 1, local9 - -18, local11 - 2, local13 + -19, 0);
		Static47.aClass2_Sub1_Sub12_3.method1366(Static140.aClass62_1055, local7 + 3, local9 + 14, 6116423, -1);
		@Pc(60) int local60 = Static163.anInt3446;
		@Pc(70) int local70 = Static32.anInt773;
		for (@Pc(72) int local72 = 0; local72 < Static51.anInt1111; local72++) {
			@Pc(76) int local76 = 16777215;
			@Pc(89) int local89 = (Static51.anInt1111 - local72 - 1) * 15 + local9 + 31;
			if (local60 > local7 && local60 < local7 + local11 && local89 - 13 < local70 && local89 + 3 > local70) {
				local76 = 16776960;
			}
			Static47.aClass2_Sub1_Sub12_3.method1366(Static114.method1772(local72), local7 + 3, local89, local76, 0);
		}
		Static94.method1427(Static46.anInt1034, Static157.anInt3335, Static145.anInt3129, Static21.anInt505);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIII)V")
	public static void method2740(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(13) int local13 = arg2 * arg2;
		@Pc(17) int local17 = arg0 * arg0;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = local13 << 2;
		@Pc(33) int local33 = local17 << 2;
		@Pc(41) int local41 = local25 * ((arg0 << 1) - 3);
		@Pc(49) int local49 = local21 * 3;
		@Pc(53) int local53 = arg0 << 1;
		@Pc(59) int local59 = local33;
		@Pc(67) int local67 = local21 + (1 - local53) * local13;
		@Pc(75) int local75 = local17 - (local53 - 1) * local25;
		@Pc(90) int local90;
		@Pc(99) int local99;
		if (Static154.anInt3307 <= arg1 && arg1 <= Static15.anInt353) {
			local90 = Static144.method2183(arg3 + arg2, Static122.anInt2718, Static153.anInt3279);
			local99 = Static144.method2183(arg3 - arg2, Static122.anInt2718, Static153.anInt3279);
			Static19.method345(arg4, Static55.anIntArrayArray8[arg1], local99, local90);
		}
		@Pc(113) int local113 = (arg0 - 1) * local29;
		while (local9 > 0) {
			if (local67 < 0) {
				while (local67 < 0) {
					local67 += local49;
					local49 += local33;
					local7++;
					local75 += local59;
					local59 += local33;
				}
			}
			if (local75 < 0) {
				local7++;
				local75 += local59;
				local59 += local33;
				local67 += local49;
				local49 += local33;
			}
			local75 += -local41;
			local67 += -local113;
			local9--;
			local113 -= local29;
			local41 -= local29;
			local90 = arg1 - local9;
			local99 = arg1 + local9;
			if (local99 >= Static154.anInt3307 && local90 <= Static15.anInt353) {
				@Pc(207) int local207 = Static144.method2183(arg3 + local7, Static122.anInt2718, Static153.anInt3279);
				@Pc(216) int local216 = Static144.method2183(arg3 - local7, Static122.anInt2718, Static153.anInt3279);
				if (Static154.anInt3307 <= local90) {
					Static19.method345(arg4, Static55.anIntArrayArray8[local90], local216, local207);
				}
				if (local99 <= Static15.anInt353) {
					Static19.method345(arg4, Static55.anIntArrayArray8[local99], local216, local207);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V")
	public static void method2743() {
		for (@Pc(10) Class2_Sub25 local10 = (Class2_Sub25) Static76.aClass13_3.method303(); local10 != null; local10 = (Class2_Sub25) Static76.aClass13_3.method309()) {
			if (local10.anInt4154 > 0) {
				local10.anInt4154--;
			}
			if (local10.anInt4154 != 0) {
				if (local10.anInt4162 > 0) {
					local10.anInt4162--;
				}
				if (local10.anInt4162 == 0 && local10.anInt4168 >= 1 && local10.anInt4163 >= 1 && local10.anInt4168 <= 102 && local10.anInt4163 <= 102 && (local10.anInt4155 < 0 || Static57.method794(local10.anInt4155, local10.anInt4161))) {
					Static73.method1018(local10.anInt4163, local10.anInt4159, local10.anInt4161, local10.anInt4165, local10.anInt4155, local10.anInt4168, local10.anInt4166);
					local10.anInt4162 = -1;
					if (local10.anInt4160 == local10.anInt4155 && local10.anInt4160 == -1) {
						local10.method3183();
					} else if (local10.anInt4160 == local10.anInt4155 && local10.anInt4164 == local10.anInt4165 && local10.anInt4158 == local10.anInt4161) {
						local10.method3183();
					}
				}
			} else if (local10.anInt4160 < 0 || Static57.method794(local10.anInt4160, local10.anInt4158)) {
				Static73.method1018(local10.anInt4163, local10.anInt4159, local10.anInt4158, local10.anInt4164, local10.anInt4160, local10.anInt4168, local10.anInt4166);
				local10.method3183();
			}
		}
	}
}
