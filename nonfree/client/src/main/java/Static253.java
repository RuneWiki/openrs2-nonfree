import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!of", name = "t", descriptor = "I")
	public static int anInt5659;

	@OriginalMember(owner = "client!of", name = "o", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_171 = new Class41(33, 12);

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIII)V")
	public static void method4970(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static185.anInt3302 == 1) {
			Static380.aClass5Array19[Static258.anInt4003 / 100].method5004(Static251.anInt4518 - 8, Static291.anInt5150 + -8);
		}
		if (Static185.anInt3302 == 2) {
			Static380.aClass5Array19[Static258.anInt4003 / 100 + 4].method5004(Static251.anInt4518 - 8, Static291.anInt5150 + -8);
		}
		Static352.method5353();
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ILclient!lk;I)V")
	public static void method4971(@OriginalArg(1) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (Static16.aClass20_1 == null) {
			return;
		}
		try {
			Static16.aClass20_1.method491(0L);
			Static16.aClass20_1.method500(24, arg0.aByteArray77, arg1);
		} catch (@Pc(18) Exception local18) {
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIII)V")
	public static void method4973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(13) int local13 = arg1 * arg1;
		@Pc(21) int local21 = arg2 * arg2;
		@Pc(25) int local25 = local21 << 1;
		@Pc(29) int local29 = local13 << 1;
		@Pc(33) int local33 = arg2 << 1;
		@Pc(42) int local42 = local25 + local13 * (1 - local33);
		@Pc(51) int local51 = local21 - (local33 - 1) * local29;
		@Pc(55) int local55 = local13 << 2;
		@Pc(59) int local59 = local21 << 2;
		@Pc(67) int local67 = local25 * 3;
		@Pc(75) int local75 = local29 * ((arg2 << 1) - 3);
		@Pc(81) int local81 = local59;
		@Pc(87) int local87 = local55 * (arg2 - 1);
		Static264.method4096(Static267.anIntArrayArray38[arg0], arg4, arg1 + arg3, -arg1 + arg3);
		while (local9 > 0) {
			if (local42 < 0) {
				while (local42 < 0) {
					local51 += local81;
					local42 += local67;
					local7++;
					local81 += local59;
					local67 += local59;
				}
			}
			if (local51 < 0) {
				local42 += local67;
				local51 += local81;
				local67 += local59;
				local81 += local59;
				local7++;
			}
			local42 += -local87;
			local51 += -local75;
			local87 -= local55;
			local9--;
			local75 -= local55;
			@Pc(174) int local174 = arg0 - local9;
			@Pc(178) int local178 = local9 + arg0;
			@Pc(182) int local182 = arg3 + local7;
			@Pc(187) int local187 = arg3 - local7;
			Static264.method4096(Static267.anIntArrayArray38[local174], arg4, local182, local187);
			Static264.method4096(Static267.anIntArrayArray38[local178], arg4, local182, local187);
		}
	}
}
