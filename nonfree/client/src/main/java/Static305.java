import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!mj", name = "z", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_88 = new Class45(30, -2);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIII)V")
	public static void method4964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(13) int local13 = arg0 * arg0;
		@Pc(17) int local17 = arg3 * arg3;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg3 << 1;
		@Pc(37) int local37 = local21 + (1 - local29) * local13;
		@Pc(46) int local46 = local17 - local25 * (local29 - 1);
		@Pc(50) int local50 = local13 << 2;
		@Pc(54) int local54 = local17 << 2;
		@Pc(65) int local65 = local21 * 3;
		@Pc(73) int local73 = ((arg3 << 1) - 3) * local25;
		@Pc(79) int local79 = local54;
		Static118.method2461(Static228.anIntArrayArray46[arg2], arg0 + arg1, arg4, arg1 - arg0);
		@Pc(98) int local98 = local50 * (arg3 - 1);
		while (local9 > 0) {
			if (local37 < 0) {
				while (local37 < 0) {
					local46 += local79;
					local37 += local65;
					local7++;
					local79 += local54;
					local65 += local54;
				}
			}
			if (local46 < 0) {
				local37 += local65;
				local46 += local79;
				local65 += local54;
				local7++;
				local79 += local54;
			}
			local37 += -local98;
			local46 += -local73;
			local9--;
			local73 -= local50;
			local98 -= local50;
			@Pc(166) int local166 = arg2 - local9;
			@Pc(170) int local170 = local9 + arg2;
			@Pc(175) int local175 = arg1 + local7;
			@Pc(180) int local180 = arg1 - local7;
			Static118.method2461(Static228.anIntArrayArray46[local166], local175, arg4, local180);
			Static118.method2461(Static228.anIntArrayArray46[local170], local175, arg4, local180);
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IB)I")
	public static int method4965(@OriginalArg(0) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(IZ)V")
	public static void method4966(@OriginalArg(0) int arg0) {
		if (Static375.anInt6904 == arg0) {
			return;
		}
		Static37.anInt7512 = Static329.anInt6247 = Static37.anIntArray502[arg0];
		Static473.method7141();
		Static116.anIntArrayArrayArray2 = new int[4][Static37.anInt7512 >> 3][Static329.anInt6247 >> 3];
		Static507.anIntArrayArray84 = new int[Static37.anInt7512][Static329.anInt6247];
		Static236.anIntArrayArray47 = new int[Static37.anInt7512][Static329.anInt6247];
		for (@Pc(36) int local36 = 0; local36 < 4; local36++) {
			Static510.aClass184Array1[local36] = Static387.method6124(Static329.anInt6247, Static37.anInt7512);
		}
		Static245.aByteArrayArrayArray19 = new byte[4][Static37.anInt7512][Static329.anInt6247];
		Static337.method5385(Static329.anInt6247, Static37.anInt7512);
		Static352.method5519(Static243.aClass42_4, Static329.anInt6247 >> 3, Static37.anInt7512 >> 3);
		Static375.anInt6904 = arg0;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4967(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 >= Static251.anInt5168 && arg1 <= Static341.anInt6481 && arg3 >= Static507.anInt9124 && Static234.anInt4897 >= arg0) {
			Static374.method5768(arg2, arg5, arg3, arg6, arg4, arg0, arg1);
		} else {
			Static318.method5064(arg5, arg2, arg0, arg6, arg3, arg4, arg1);
		}
	}
}
