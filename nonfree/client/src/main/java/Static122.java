import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!fp", name = "T", descriptor = "I")
	public static int anInt2129;

	@OriginalMember(owner = "client!fp", name = "Z", descriptor = "Ljava/lang/Object;")
	public static Object anObject3;

	@OriginalMember(owner = "client!fp", name = "M", descriptor = "Lclient!go;")
	public static final Class97 aClass97_3 = new Class97(2, 4, 4, 0);

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIILclient!ic;IIZ)V")
	public static void method1693(@OriginalArg(3) Class113 arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2) {
		Static442.anInt7354 = 2;
		Static356.anInt5885 = 1;
		Static402.aBoolean534 = false;
		Static81.anInt1504 = 0;
		Static436.aClass113_131 = arg0;
		Static156.anInt2618 = arg1;
		Static218.anInt5620 = arg2;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!me;IIIIIILclient!me;II)V")
	public static void method1694(@OriginalArg(0) Class20_Sub3_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) Class20_Sub3_Sub3 arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) int local7 = arg0.method4683();
		if (local7 == -1) {
			return;
		}
		@Pc(20) Class49 local20 = (Class49) Static22.aClass167_5.method3386((long) local7);
		if (local20 == null) {
			@Pc(32) Class100[] local32 = Static458.method1923(Static169.aClass113_55, local7);
			if (local32 == null) {
				return;
			}
			local20 = Static213.aClass128_22.method3540(local32[0]);
			Static22.aClass167_5.method3392(local20, (long) local7);
		}
		Static22.method400(arg3 >> 1, arg4.method4678() * 64, 0, arg6 >> 1, arg4.anInt6616, arg4.aByte89, arg4.anInt6613);
		@Pc(79) int local79 = arg5 + Static80.anIntArray72[0] - 18;
		@Pc(87) int local87 = local79 + arg2 / 4 * 18;
		@Pc(97) int local97 = arg1 + Static80.anIntArray72[1] - 16 - 54;
		@Pc(105) int local105 = local97 + arg2 % 4 * 18;
		local20.method5636(local87, local105);
		if (arg0 == arg4) {
			Static213.aClass128_22.method3551(local87 - 1, local105 + -1, 18, 18, -256);
		}
		@Pc(127) Class13_Sub6 local127 = Static306.method3995();
		local127.anInt5964 = local87 + 16;
		local127.aClass20_Sub3_Sub3_1 = arg0;
		local127.anInt5962 = local105 + 16;
		local127.anInt5956 = local87;
		local127.anInt5966 = local105;
		Static397.aClass227_6.method4832(local127);
	}
}
