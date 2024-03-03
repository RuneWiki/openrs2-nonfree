import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!la", name = "k", descriptor = "I")
	public static int anInt3552;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II[BIII)Z", line = 50)
	public static boolean method3512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(17) Class2_Sub4 local17 = new Class2_Sub4(arg2);
		@Pc(19) int local19 = -1;
		label56: while (true) {
			@Pc(23) int local23 = local17.method4840();
			if (local23 == 0) {
				return local7;
			}
			local19 += local23;
			@Pc(31) int local31 = 0;
			@Pc(33) boolean local33 = false;
			while (true) {
				@Pc(39) int local39;
				while (!local33) {
					local39 = local17.method4818();
					if (local39 == 0) {
						continue label56;
					}
					local31 += local39 - 1;
					@Pc(66) int local66 = local31 & 0x3F;
					@Pc(72) int local72 = local31 >> 6 & 0x3F;
					@Pc(78) int local78 = local17.method4816() >> 2;
					@Pc(82) int local82 = arg1 + local72;
					@Pc(86) int local86 = local66 + arg0;
					if (local82 > 0 && local86 > 0 && local82 < arg4 - 1 && arg3 - 1 > local86) {
						@Pc(112) Class41 local112 = Static334.aClass202_4.method5164(local19);
						if (local78 != 22 || Static203.aClass177_Sub1_2.aBoolean359 || local112.anInt1334 != 0 || local112.anInt1323 == 1 || local112.aBoolean117) {
							if (!local112.method1531()) {
								Class206.anInt5730++;
								local7 = false;
							}
							local33 = true;
						}
					}
				}
				local39 = local17.method4818();
				if (local39 == 0) {
					break;
				}
				local17.method4816();
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILclient!wm;Lclient!ur;ZIII)V", line = 136)
	public static void method3513(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1, @OriginalArg(2) Class130 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3) {
			Static232.aClass13_14.method6386((Static231.anInt4656 - Static232.aClass13_14.method6400()) / 2, (Static161.anInt3295 - Static232.aClass13_14.method6385()) / 2);
			Static310.aClass13_21.method6386((Static231.anInt4656 - Static310.aClass13_21.method6400()) / 2, 18);
		}
		arg2.method5901((Class2_Sub26.aClass50_3 == Class226.aClass50_4 ? Class11_Sub5_Sub2.aClass79_99 : Class11_Sub5_Sub2.aClass79_98).method2269(Class197.anInt5569), -1, Static161.anInt3295 / 2 - 26, arg0, Static231.anInt4656 / 2);
		@Pc(58) int local58 = Static161.anInt3295 / 2 - 18;
		arg1.method2838(Static231.anInt4656 / 2 - 152, local58, 304, 34, arg4, 0);
		arg1.method2838(Static231.anInt4656 / 2 - 151, local58 + 1, 302, 32, 0, 0);
		arg1.method2903(Static231.anInt4656 / 2 - 150, local58 + 2, Class2_Sub3_Sub15.anInt2647 * 3, 30, arg5, 0);
		arg1.method2903(Static231.anInt4656 / 2 + Class2_Sub3_Sub15.anInt2647 * 3 - 150, local58 + 2, 300 - Class2_Sub3_Sub15.anInt2647 * 3, 30, 0, 0);
		arg2.method5901(Class43.aString13, -1, Static161.anInt3295 / 2 + 4, arg0, Static231.anInt4656 / 2);
	}
}
