import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!fga", name = "g", descriptor = "Lclient!qda;")
	public static Class273 aClass273_1;

	@OriginalMember(owner = "client!fga", name = "h", descriptor = "F")
	public static float aFloat85;

	@OriginalMember(owner = "client!fga", name = "b", descriptor = "Lclient!iga;")
	public static final Class159 aClass159_3 = new Class159(1);

	@OriginalMember(owner = "client!fga", name = "d", descriptor = "I")
	public static int anInt3490 = 100;

	@OriginalMember(owner = "client!fga", name = "f", descriptor = "I")
	public static int anInt3492 = -50;

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(IIIIB)V")
	public static void method2871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static306.anInt5020 <= arg3 && Static252.anInt4988 >= arg3) {
			@Pc(23) int local23 = Static108.method1816(Static177.anInt3963, arg1, Static570.anInt9385);
			@Pc(29) int local29 = Static108.method1816(Static177.anInt3963, arg0, Static570.anInt9385);
			Static6.method113(arg3, local29, local23, arg2);
		}
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(I)V")
	public static void method2872() {
		Static313.aClass2_Sub34_Sub2_1.method6927();
		@Pc(13) int local13 = Static313.aClass2_Sub34_Sub2_1.method6925(8);
		@Pc(22) int local22;
		if (Static228.anInt4647 > local13) {
			for (local22 = local13; local22 < Static228.anInt4647; local22++) {
				Static82.anIntArray156[Static616.anInt10012++] = Static160.anIntArray256[local22];
			}
		}
		if (Static228.anInt4647 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static228.anInt4647 = 0;
		for (local22 = 0; local22 < local13; local22++) {
			@Pc(56) int local56 = Static160.anIntArray256[local22];
			@Pc(64) Class11_Sub1_Sub1_Sub2_Sub2 local64 = ((Class2_Sub51) Static357.aClass222_23.method5468((long) local56)).aClass11_Sub1_Sub1_Sub2_Sub2_2;
			@Pc(69) int local69 = Static313.aClass2_Sub34_Sub2_1.method6925(1);
			if (local69 == 0) {
				Static160.anIntArray256[Static228.anInt4647++] = local56;
				local64.anInt3248 = Static224.anInt4611;
			} else {
				@Pc(92) int local92 = Static313.aClass2_Sub34_Sub2_1.method6925(2);
				if (local92 == 0) {
					Static160.anIntArray256[Static228.anInt4647++] = local56;
					local64.anInt3248 = Static224.anInt4611;
					Static105.anIntArray190[Static549.anInt9102++] = local56;
				} else {
					@Pc(139) int local139;
					@Pc(149) int local149;
					if (local92 == 1) {
						Static160.anIntArray256[Static228.anInt4647++] = local56;
						local64.anInt3248 = Static224.anInt4611;
						local139 = Static313.aClass2_Sub34_Sub2_1.method6925(3);
						local64.method2782(local139, 1);
						local149 = Static313.aClass2_Sub34_Sub2_1.method6925(1);
						if (local149 == 1) {
							Static105.anIntArray190[Static549.anInt9102++] = local56;
						}
					} else if (local92 == 2) {
						Static160.anIntArray256[Static228.anInt4647++] = local56;
						local64.anInt3248 = Static224.anInt4611;
						if (Static313.aClass2_Sub34_Sub2_1.method6925(1) == 1) {
							local139 = Static313.aClass2_Sub34_Sub2_1.method6925(3);
							local64.method2782(local139, 2);
							local149 = Static313.aClass2_Sub34_Sub2_1.method6925(3);
							local64.method2782(local149, 2);
						} else {
							local139 = Static313.aClass2_Sub34_Sub2_1.method6925(3);
							local64.method2782(local139, 0);
						}
						local139 = Static313.aClass2_Sub34_Sub2_1.method6925(1);
						if (local139 == 1) {
							Static105.anIntArray190[Static549.anInt9102++] = local56;
						}
					} else if (local92 == 3) {
						Static82.anIntArray156[Static616.anInt10012++] = local56;
					}
				}
			}
		}
	}
}
