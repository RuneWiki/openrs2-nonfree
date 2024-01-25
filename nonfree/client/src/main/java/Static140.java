import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "I")
	public static int anInt2479;

	@OriginalMember(owner = "client!gu", name = "g", descriptor = "Lclient!fo;")
	public static Class82 aClass82_37;

	@OriginalMember(owner = "client!gu", name = "i", descriptor = "I")
	public static int anInt2485;

	@OriginalMember(owner = "client!gu", name = "j", descriptor = "I")
	public static int anInt2486;

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "I")
	public static int anInt2478 = -1;

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIIBII)V")
	public static void method2134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(18) int local18 = arg1 * arg1;
		@Pc(22) int local22 = arg2 * arg2;
		@Pc(26) int local26 = local22 << 1;
		@Pc(30) int local30 = local18 << 1;
		@Pc(34) int local34 = arg2 << 1;
		@Pc(43) int local43 = local26 + (1 - local34) * local18;
		@Pc(51) int local51 = local22 - local30 * (local34 - 1);
		@Pc(55) int local55 = local18 << 2;
		@Pc(59) int local59 = local22 << 2;
		@Pc(67) int local67 = local26 * 3;
		@Pc(75) int local75 = local30 * ((arg2 << 1) - 3);
		@Pc(81) int local81 = local59;
		@Pc(87) int local87 = local55 * (arg2 - 1);
		Static2.method38(arg1 + arg0, arg3, Static67.anIntArrayArray13[arg4], arg0 - arg1);
		while (local9 > 0) {
			if (local43 < 0) {
				while (local43 < 0) {
					local43 += local67;
					local51 += local81;
					local67 += local59;
					local7++;
					local81 += local59;
				}
			}
			if (local51 < 0) {
				local51 += local81;
				local43 += local67;
				local81 += local59;
				local67 += local59;
				local7++;
			}
			local51 += -local75;
			local43 += -local87;
			local75 -= local55;
			local87 -= local55;
			local9--;
			@Pc(171) int local171 = arg4 - local9;
			@Pc(176) int local176 = arg4 + local9;
			@Pc(180) int local180 = local7 + arg0;
			@Pc(185) int local185 = arg0 - local7;
			Static2.method38(local180, arg3, Static67.anIntArrayArray13[local171], local185);
			Static2.method38(local180, arg3, Static67.anIntArrayArray13[local176], local185);
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(II)S")
	public static short method2138(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(22) int local22 = arg0 >> 3 & 0x70;
		@Pc(26) int local26 = arg0 & 0x7F;
		@Pc(43) int local43 = local26 > 64 ? local22 * (127 - local26) >> 7 : local26 * local22 >> 7;
		@Pc(47) int local47 = local43 + local26;
		@Pc(55) int local55;
		if (local47 == 0) {
			local55 = local43 << 1;
		} else {
			local55 = (local43 << 8) / local47;
		}
		return (short) (local55 >> 4 << 7 | local9 << 10 | local47);
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIIII)I")
	public static int method2141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(21) int local21 = 65536 - Class1_Sub4_Sub8_Sub1.anIntArray49[arg3 * 8192 / arg1] >> 1;
		return (arg2 * (65536 - local21) >> 16) + (arg0 * local21 >> 16);
	}
}
