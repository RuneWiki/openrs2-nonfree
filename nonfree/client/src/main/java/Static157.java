import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!im", name = "e", descriptor = "I")
	public static int anInt2868;

	@OriginalMember(owner = "client!im", name = "g", descriptor = "I")
	public static int anInt2870 = -1;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIIII)V")
	public static void method2352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(13) int local13 = arg3 * arg3;
		@Pc(17) int local17 = arg0 * arg0;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg0 << 1;
		@Pc(38) int local38 = local21 + local13 * (1 - local29);
		@Pc(51) int local51 = local17 - (local29 - 1) * local25;
		@Pc(55) int local55 = local13 << 2;
		@Pc(59) int local59 = local17 << 2;
		@Pc(67) int local67 = local21 * 3;
		@Pc(75) int local75 = local25 * ((arg0 << 1) - 3);
		@Pc(81) int local81 = local59;
		@Pc(87) int local87 = (arg0 - 1) * local55;
		Static382.method5419(Static369.anIntArrayArray35[arg2], arg1 - arg3, arg3 + arg1, arg4);
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local38 += local67;
					local51 += local81;
					local81 += local59;
					local7++;
					local67 += local59;
				}
			}
			if (local51 < 0) {
				local38 += local67;
				local51 += local81;
				local81 += local59;
				local7++;
				local67 += local59;
			}
			local38 += -local87;
			local51 += -local75;
			local9--;
			local87 -= local55;
			local75 -= local55;
			@Pc(170) int local170 = arg2 - local9;
			@Pc(174) int local174 = local9 + arg2;
			@Pc(179) int local179 = arg1 + local7;
			@Pc(184) int local184 = arg1 - local7;
			Static382.method5419(Static369.anIntArrayArray35[local170], local184, local179, arg4);
			Static382.method5419(Static369.anIntArrayArray35[local174], local184, local179, arg4);
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Ljava/lang/String;IZZ)I")
	public static int method2353(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg0.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(41) char local41 = arg0.charAt(local35);
			if (local35 == 0) {
				if (local41 == '-') {
					local26 = true;
					continue;
				}
				if (local41 == '+') {
					continue;
				}
			}
			@Pc(90) int local90;
			if (local41 >= '0' && local41 <= '9') {
				local90 = local41 - '0';
			} else if (local41 >= 'A' && local41 <= 'Z') {
				local90 = local41 - '7';
			} else if (local41 >= 'a' && local41 <= 'z') {
				local90 = local41 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local90 >= arg1) {
				throw new NumberFormatException();
			}
			if (local26) {
				local90 = -local90;
			}
			@Pc(119) int local119 = local30 * arg1 + local90;
			if (local30 != local119 / arg1) {
				throw new NumberFormatException();
			}
			local30 = local119;
			local28 = true;
		}
		if (!local28) {
			throw new NumberFormatException();
		}
		return local30;
	}
}
