import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!ds", name = "d", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_58 = new Class214(1, -1);

	@OriginalMember(owner = "client!ds", name = "j", descriptor = "[I")
	public static final int[] anIntArray71 = new int[2];

	@OriginalMember(owner = "client!ds", name = "l", descriptor = "I")
	public static int anInt1462 = 0;

	@OriginalMember(owner = "client!ds", name = "m", descriptor = "[[I")
	public static final int[][] anIntArrayArray37 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!ds", name = "n", descriptor = "I")
	public static int anInt1463 = -1;

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIIII)V")
	public static void method1219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(13) int local13 = arg1 * arg1;
		@Pc(17) int local17 = arg2 * arg2;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg2 << 1;
		@Pc(37) int local37 = local21 + (1 - local29) * local13;
		@Pc(54) int local54 = local17 - local25 * (local29 - 1);
		@Pc(58) int local58 = local13 << 2;
		@Pc(62) int local62 = local17 << 2;
		@Pc(70) int local70 = local21 * 3;
		@Pc(78) int local78 = local25 * ((arg2 << 1) - 3);
		@Pc(84) int local84 = local62;
		@Pc(98) int local98;
		@Pc(107) int local107;
		if (Static74.anInt1413 <= arg0 && Static149.anInt7384 >= arg0) {
			local98 = Static63.method971(Static271.anInt4271, arg4 + arg1, Static13.anInt263);
			local107 = Static63.method971(Static271.anInt4271, arg4 - arg1, Static13.anInt263);
			Static298.method3891(local98, local107, Static106.anIntArrayArray46[arg0], arg3);
		}
		@Pc(121) int local121 = (arg2 - 1) * local58;
		while (local9 > 0) {
			if (local37 < 0) {
				while (local37 < 0) {
					local54 += local84;
					local37 += local70;
					local7++;
					local84 += local62;
					local70 += local62;
				}
			}
			if (local54 < 0) {
				local37 += local70;
				local54 += local84;
				local70 += local62;
				local84 += local62;
				local7++;
			}
			local54 += -local78;
			local37 += -local121;
			local121 -= local58;
			local9--;
			local78 -= local58;
			local98 = arg0 - local9;
			local107 = local9 + arg0;
			if (Static74.anInt1413 <= local107 && local98 <= Static149.anInt7384) {
				@Pc(217) int local217 = Static63.method971(Static271.anInt4271, local7 + arg4, Static13.anInt263);
				@Pc(226) int local226 = Static63.method971(Static271.anInt4271, arg4 - local7, Static13.anInt263);
				if (Static74.anInt1413 <= local98) {
					Static298.method3891(local217, local226, Static106.anIntArrayArray46[local98], arg3);
				}
				if (Static149.anInt7384 >= local107) {
					Static298.method3891(local217, local226, Static106.anIntArrayArray46[local107], arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1220(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5) {
		Static22.method400(arg2, 0, arg3, arg5, arg0, arg4, arg1);
	}
}
