import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static508 {

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIII)V")
	public static void method7384(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(20) int local20 = arg4 - arg5;
		@Pc(24) int local24 = arg0 + arg5;
		for (@Pc(26) int local26 = arg0; local26 < local24; local26++) {
			Static580.method8027(Static104.anIntArrayArray24[local26], arg2, arg3, arg1);
		}
		@Pc(49) int local49 = arg3 + arg5;
		@Pc(53) int local53 = arg2 - arg5;
		for (@Pc(55) int local55 = arg4; local55 > local20; local55--) {
			Static580.method8027(Static104.anIntArrayArray24[local55], arg2, arg3, arg1);
		}
		for (@Pc(77) int local77 = local24; local77 <= local20; local77++) {
			@Pc(83) int[] local83 = Static104.anIntArrayArray24[local77];
			Static580.method8027(local83, local49, arg3, arg1);
			Static580.method8027(local83, arg2, local53, arg1);
		}
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(Lclient!tn;I)Lclient!cm;")
	public static Class41_Sub2 method7389(@OriginalArg(0) Class3_Sub15 arg0) {
		@Pc(19) Class41 local19 = Static465.method6957(arg0);
		@Pc(23) int local23 = arg0.method8402();
		@Pc(27) int local27 = arg0.method8402();
		return new Class41_Sub2(local19.aClass117_13, local19.aClass178_12, local19.anInt9780, local19.anInt9781, local19.anInt9779, local19.anInt9773, local19.anInt9775, local19.anInt9771, local19.anInt9777, local23, local27);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIBI)V")
	public static void method7392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(13) int local13 = arg3 * arg3;
		@Pc(17) int local17 = arg0 * arg0;
		@Pc(21) int local21 = local17 << 1;
		@Pc(29) int local29 = local13 << 1;
		@Pc(33) int local33 = arg0 << 1;
		@Pc(42) int local42 = local13 * (1 - local33) + local21;
		@Pc(51) int local51 = local17 - (local33 - 1) * local29;
		@Pc(55) int local55 = local13 << 2;
		@Pc(59) int local59 = local17 << 2;
		@Pc(67) int local67 = local21 * 3;
		@Pc(75) int local75 = local29 * ((arg0 << 1) - 3);
		@Pc(81) int local81 = local59;
		@Pc(95) int local95;
		@Pc(104) int local104;
		if (Static246.anInt5506 <= arg1 && Static583.anInt9761 >= arg1) {
			local95 = Static429.method6586(arg3 + arg4, Static202.anInt4720, Static472.anInt6105);
			local104 = Static429.method6586(arg4 - arg3, Static202.anInt4720, Static472.anInt6105);
			Static580.method8027(Static104.anIntArrayArray24[arg1], local95, local104, arg2);
		}
		@Pc(118) int local118 = (arg0 - 1) * local55;
		while (local9 > 0) {
			if (local42 < 0) {
				while (local42 < 0) {
					local51 += local81;
					local42 += local67;
					local67 += local59;
					local81 += local59;
					local7++;
				}
			}
			if (local51 < 0) {
				local51 += local81;
				local42 += local67;
				local7++;
				local81 += local59;
				local67 += local59;
			}
			local42 += -local118;
			local51 += -local75;
			local118 -= local55;
			local75 -= local55;
			local9--;
			local95 = arg1 - local9;
			local104 = arg1 + local9;
			if (Static246.anInt5506 <= local104 && Static583.anInt9761 >= local95) {
				@Pc(214) int local214 = Static429.method6586(arg4 + local7, Static202.anInt4720, Static472.anInt6105);
				@Pc(223) int local223 = Static429.method6586(arg4 - local7, Static202.anInt4720, Static472.anInt6105);
				if (Static246.anInt5506 <= local95) {
					Static580.method8027(Static104.anIntArrayArray24[local95], local214, local223, arg2);
				}
				if (local104 <= Static583.anInt9761) {
					Static580.method8027(Static104.anIntArrayArray24[local104], local214, local223, arg2);
				}
			}
		}
	}
}
