import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!cp", name = "d", descriptor = "I")
	public static int anInt996;

	@OriginalMember(owner = "client!cp", name = "e", descriptor = "Lclient!tq;")
	public static Class191 aClass191_26;

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(Lclient!fj;II)V")
	public static void method1095(@OriginalArg(0) Class62_Sub1_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (Static212.anInt4090 < arg0.anInt5296) {
			Static167.method3156(arg0);
		} else if (arg0.anInt5343 >= Static212.anInt4090) {
			Static303.method5320(arg0);
		} else {
			Static82.method2657(arg0, false);
			local7 = Static75.anInt1603;
			local9 = Static260.anInt5269;
		}
		if (arg0.anInt5289 < 128 || arg0.anInt5280 < 128 || Static95.anInt6381 * 128 - 128 <= arg0.anInt5289 || Static237.anInt4532 * 128 - 128 <= arg0.anInt5280) {
			arg0.anInt5322 = -1;
			arg0.anInt5296 = 0;
			arg0.anInt5321 = -1;
			arg0.anInt5343 = 0;
			arg0.anInt5289 = arg0.anIntArray397[0] * 128 + arg0.method4777() * 64;
			arg0.anInt5280 = arg0.anIntArray396[0] * 128 + arg0.method4777() * 64;
			arg0.method4780();
		}
		if (arg0 == Static41.aClass62_Sub1_Sub2_Sub2_2 && (arg0.anInt5289 < 1536 || arg0.anInt5280 < 1536 || (Static95.anInt6381 - 12) * 128 <= arg0.anInt5289 || (Static237.anInt4532 - 12) * 128 <= arg0.anInt5280)) {
			arg0.anInt5296 = 0;
			arg0.anInt5321 = -1;
			arg0.anInt5322 = -1;
			arg0.anInt5343 = 0;
			arg0.anInt5289 = arg0.anIntArray397[0] * 128 + arg0.method4777() * 64;
			arg0.anInt5280 = arg0.anIntArray396[0] * 128 + arg0.method4777() * 64;
			arg0.method4780();
		}
		@Pc(200) int local200 = Static79.method1812(arg0);
		Static169.method3188(local9, local7, local200, arg0);
		Static267.method4827(arg0);
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIILclient!fj;IILclient!fj;IIB)V")
	public static void method1096(@OriginalArg(2) int arg0, @OriginalArg(3) Class62_Sub1_Sub2 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class62_Sub1_Sub2 arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		@Pc(7) int local7 = arg4.method4769();
		if (local7 == -1) {
			return;
		}
		@Pc(22) Class31 local22 = (Class31) Static121.aClass119_77.method3311((long) local7);
		if (local22 == null) {
			@Pc(29) Class76[] local29 = Static361.method2367(Static59.aClass191_35, local7);
			if (local29 == null) {
				return;
			}
			local22 = Static147.aClass4_2.method4214(local29[0]);
			Static121.aClass119_77.method3308(local22, (long) local7);
		}
		Static43.method1051(arg1.anInt5289, arg1.anInt5280, arg5 >> 1, arg1.method4777() * 64, 0, arg6 >> 1);
		@Pc(78) int local78 = Static239.anIntArray366[0] + arg2 - 18;
		@Pc(86) int local86 = local78 + arg3 / 4 * 18;
		@Pc(97) int local97 = arg0 + Static239.anIntArray366[1] - 16 - 54;
		@Pc(105) int local105 = local97 + arg3 % 4 * 18;
		local22.method4377(local86, local105);
		if (arg4 == arg1) {
			Static147.aClass4_2.method4300(-256, 18, 18, local105 - 1, local86 - 1);
		}
		@Pc(127) Class55_Sub2 local127 = Static57.method1344();
		local127.anInt2388 = local105 + 16;
		local127.anInt2386 = local105;
		local127.anInt2387 = local86 + 16;
		local127.aClass62_Sub1_Sub2_1 = arg4;
		local127.anInt2389 = local86;
		Static348.aClass67_9.method2100(local127);
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(B)V")
	public static void method1098() {
		@Pc(6) Class148 local6 = Static129.aClass148_1;
		synchronized (Static129.aClass148_1) {
			Static129.aClass148_1.method4063();
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IBZII)V")
	public static void method1099(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static26.aLong14 = 0L;
		@Pc(8) int local8 = Static129.method2627();
		if (arg0 == 3 || local8 == 3) {
			arg1 = true;
		}
		if (!Static147.aClass4_2.method4231()) {
			arg1 = true;
		}
		Static302.method5306(arg2, arg0, arg3, arg1, local8);
	}
}
