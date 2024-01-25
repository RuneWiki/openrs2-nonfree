import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!qg", name = "s", descriptor = "Lclient!um;")
	public static Class244 aClass244_6;

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_192 = new Class214(56, 9);

	@OriginalMember(owner = "client!qg", name = "w", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_193 = new Class214(94, 6);

	@OriginalMember(owner = "client!qg", name = "z", descriptor = "J")
	public static long aLong162 = 0L;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIB)V")
	public static void method4183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(12) int local12 = -arg1;
		Static298.method3891(arg1 + arg2, arg2 + -arg1, Static106.anIntArrayArray46[arg0], arg3);
		@Pc(32) int local32 = -1;
		while (local9 > local7) {
			local32 += 2;
			local7++;
			local12 += local32;
			if (local12 >= 0) {
				local9--;
				local12 -= local9 << 1;
				@Pc(58) int[] local58 = Static106.anIntArrayArray46[local9 + arg0];
				@Pc(65) int[] local65 = Static106.anIntArrayArray46[arg0 - local9];
				@Pc(70) int local70 = arg2 + local7;
				@Pc(75) int local75 = arg2 - local7;
				Static298.method3891(local70, local75, local58, arg3);
				Static298.method3891(local70, local75, local65, arg3);
			}
			@Pc(93) int local93 = local9 + arg2;
			@Pc(98) int local98 = arg2 - local9;
			@Pc(105) int[] local105 = Static106.anIntArrayArray46[arg0 + local7];
			@Pc(112) int[] local112 = Static106.anIntArrayArray46[arg0 - local7];
			Static298.method3891(local93, local98, local105, arg3);
			Static298.method3891(local93, local98, local112, arg3);
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
	public static void method4184() {
		Static5.method94(Static75.aClass137_68);
		Static75.aClass1_Sub11_Sub1_1.method4445(Static330.method4209());
		Static75.aClass1_Sub11_Sub1_1.method4448(Static126.anInt2202);
		Static75.aClass1_Sub11_Sub1_1.method4448(Static92.anInt1618);
		Static75.aClass1_Sub11_Sub1_1.method4445(Static336.aClass106_Sub1_1.anInt5675);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(BLclient!ic;Lclient!ic;)I")
	public static int method4186(@OriginalArg(1) Class113 arg0, @OriginalArg(2) Class113 arg1) {
		@Pc(5) int local5 = 0;
		if (arg0.method2253(Static421.anInt6819)) {
			local5++;
		}
		if (arg0.method2253(Static132.anInt2275)) {
			local5++;
		}
		if (arg0.method2253(Static130.anInt2247)) {
			local5++;
		}
		if (arg1.method2253(Static421.anInt6819)) {
			local5++;
		}
		if (arg1.method2253(Static132.anInt2275)) {
			local5++;
		}
		if (arg1.method2253(Static130.anInt2247)) {
			local5++;
		}
		return local5;
	}
}
