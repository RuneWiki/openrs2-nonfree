import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
	public static int anInt4478 = 0;

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "[Lclient!ao;")
	public static Class12[] aClass12Array1 = new Class12[4];

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "Z")
	public static boolean aBoolean280 = false;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IILclient!cg;BLclient!cg;)Lclient!ti;")
	public static Class4_Sub2_Sub9_Sub2 method3498(@OriginalArg(1) int arg0, @OriginalArg(2) Class22 arg1, @OriginalArg(4) Class22 arg2) {
		return Static225.method3549(0, arg1, arg0) ? Static265.method4178(arg2.method665(arg0, 0)) : null;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V")
	public static void method3499() {
		Static291.anInt5649 = 0;
		Static105.anInt2109 = 0;
		Static156.method2538();
		Static193.method3166();
		Static106.method1796();
		Static57.method1075();
		@Pc(19) int local19;
		for (local19 = 0; local19 < Static105.anInt2109; local19++) {
			@Pc(26) int local26 = Static3.anIntArray3[local19];
			if (Static50.anInt1118 != Static100.aClass13_Sub5_Sub1Array1[local26].anInt5329) {
				if (Static100.aClass13_Sub5_Sub1Array1[local26].anInt4455 > 0) {
					Static174.method2881(Static100.aClass13_Sub5_Sub1Array1[local26]);
				}
				Static100.aClass13_Sub5_Sub1Array1[local26] = null;
			}
		}
		if (Static256.aClass4_Sub24_Sub1_3.anInt3822 != Static31.anInt653) {
			throw new RuntimeException("gpp1 pos:" + Static256.aClass4_Sub24_Sub1_3.anInt3822 + " psize:" + Static31.anInt653);
		}
		for (local19 = 0; local19 < Static85.anInt1730; local19++) {
			if (Static100.aClass13_Sub5_Sub1Array1[Static291.anIntArray457[local19]] == null) {
				throw new RuntimeException("gpp2 pos:" + local19 + " size:" + Static85.anInt1730);
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "(B)Lclient!na;")
	public static Class4_Sub2_Sub15 method3501() {
		@Pc(13) Class4_Sub2_Sub15 local13 = (Class4_Sub2_Sub15) Static92.aClass86_1.method2183();
		if (local13 != null) {
			local13.method4690();
			local13.method4697();
			return local13;
		}
		do {
			local13 = (Class4_Sub2_Sub15) Static100.aClass86_2.method2183();
			if (local13 == null) {
				return null;
			}
			if (local13.method2880() > Static61.method1150()) {
				return null;
			}
			local13.method4690();
			local13.method4697();
		} while ((Long.MIN_VALUE & local13.aLong212) == 0L);
		return local13;
	}
}
