import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!bm", name = "H", descriptor = "Lclient!db;")
	public static final Class64 aClass64_53 = new Class64(33, 12);

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!eh;Z)Lclient!qg;")
	public static Class282 method720(@OriginalArg(0) Class4_Sub9 arg0) {
		@Pc(12) int local12 = arg0.method6026();
		return new Class282(local12);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(III)Z")
	public static boolean method723(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x580) != 0;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILclient!oa;)V")
	public static void method724(@OriginalArg(1) Class66 arg0) {
		@Pc(7) int local7 = Static473.anInt7981;
		@Pc(9) int local9 = Static333.anInt5926;
		@Pc(11) int local11 = Static100.anInt9640;
		@Pc(13) int local13 = Static35.anInt711;
		arg0.method6794(local11, local7, local13, local9, -10660793);
		arg0.method6794(local11 - 2, local7 - -1, 16, local9 + 1, -16777216);
		arg0.method6822(local7 + 1, -16777216, -19 + local13, local9 + 18, local11 + -2);
		Static65.aClass91_4.method7451(local7 + 3, -10660793, -1, Static275.aClass198_23.method4407(Static56.anInt953), local9 + 14);
		@Pc(72) int local72 = Static86.aClass50_1.method7100();
		@Pc(76) int local76 = Static86.aClass50_1.method7102();
		@Pc(78) int local78 = 0;
		for (@Pc(83) Class4_Sub18 local83 = (Class4_Sub18) Static354.aClass124_32.method3267(); local83 != null; local83 = (Class4_Sub18) Static354.aClass124_32.method3273()) {
			@Pc(99) int local99 = local9 + (-local78 + Static300.anInt5730 - 1) * 16 + 31;
			@Pc(101) short local101 = -1;
			if (local72 > local7 && local72 < local11 + local7 && local76 > local99 - 13 && local99 + 3 > local76 && local83.aBoolean249) {
				local101 = -256;
			}
			@Pc(134) int[] local134 = null;
			if (Static165.method3185(local83.anInt3158)) {
				local134 = Static195.aClass99_1.method2798((int) local83.aLong74).anIntArray476;
			} else if (local83.anInt3157 != -1) {
				local134 = Static195.aClass99_1.method2798(local83.anInt3157).anIntArray476;
			} else if (Static543.method7528(local83.anInt3158)) {
				@Pc(174) Class4_Sub50 local174 = (Class4_Sub50) Static106.aClass183_8.method4289((long) local83.aLong74);
				if (local174 != null) {
					@Pc(179) Class10_Sub1_Sub2_Sub1 local179 = local174.aClass10_Sub1_Sub2_Sub1_1;
					@Pc(182) Class54 local182 = local179.aClass54_1;
					if (local182.anIntArray150 != null) {
						local182 = local182.method1118(Static511.aClass335_2);
					}
					if (local182 != null) {
						local134 = local182.anIntArray152;
					}
				}
			} else if (Static226.method3959(local83.anInt3158)) {
				@Pc(214) Class25 local214;
				if (local83.anInt3158 == 1010) {
					local214 = Static553.aClass288_4.method6419((int) local83.aLong74);
				} else {
					local214 = Static553.aClass288_4.method6419((int) (local83.aLong74 >>> 32 & 0x7FFFFFFFL));
				}
				if (local214.anIntArray115 != null) {
					local214 = local214.method578(Static511.aClass335_2);
				}
				if (local214 != null) {
					local134 = local214.anIntArray113;
				}
			}
			@Pc(243) String local243 = Static23.method438(local83);
			if (local134 != null) {
				local243 = local243 + Static315.method4804(local134);
			}
			Static65.aClass91_4.method7464(local99, local7 + 3, Static367.aClass13Array24, Static23.anIntArray106, local243, local101);
			local78++;
			if (local83.aBoolean248) {
				Static399.aClass13_29.method8019(Static195.aClass196_5.method4386(local243) + local7 + 5, local99 + -12);
			}
		}
		Static428.method6114(Static100.anInt9640, Static333.anInt5926, Static473.anInt7981, Static35.anInt711);
	}
}
