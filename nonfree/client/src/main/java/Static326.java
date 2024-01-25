import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!qg", name = "p", descriptor = "I")
	public static int anInt5571;

	@OriginalMember(owner = "client!qg", name = "m", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_143 = new Class12(101, 8);

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "(I)V")
	public static void method4381() {
		Static87.aClass124ArrayArray7 = new Class124[Static359.aClass82_84.method1825()][];
		Static46.aClass124ArrayArray1 = new Class124[Static359.aClass82_84.method1825()][];
		Static288.aBooleanArray16 = new boolean[Static359.aClass82_84.method1825()];
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIBIII)V")
	public static void method4382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(13) int local13 = arg2 * arg2;
		@Pc(17) int local17 = arg0 * arg0;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg0 << 1;
		@Pc(37) int local37 = local13 * (1 - local29) + local21;
		@Pc(46) int local46 = local17 - local25 * (local29 - 1);
		@Pc(50) int local50 = local13 << 2;
		@Pc(54) int local54 = local17 << 2;
		@Pc(62) int local62 = local21 * 3;
		@Pc(70) int local70 = ((arg0 << 1) - 3) * local25;
		@Pc(76) int local76 = local54;
		@Pc(104) int local104;
		@Pc(113) int local113;
		if (Static289.anInt5053 <= arg1 && Static93.anInt1676 >= arg1) {
			local104 = Static412.method5316(Static427.anInt7214, Static434.anInt7302, arg4 + arg2);
			local113 = Static412.method5316(Static427.anInt7214, Static434.anInt7302, arg4 - arg2);
			Static2.method38(local104, arg3, Static67.anIntArrayArray13[arg1], local113);
		}
		@Pc(127) int local127 = (arg0 - 1) * local50;
		while (local9 > 0) {
			if (local37 < 0) {
				while (local37 < 0) {
					local37 += local62;
					local46 += local76;
					local62 += local54;
					local76 += local54;
					local7++;
				}
			}
			if (local46 < 0) {
				local37 += local62;
				local46 += local76;
				local7++;
				local76 += local54;
				local62 += local54;
			}
			local37 += -local127;
			local46 += -local70;
			local127 -= local50;
			local9--;
			local70 -= local50;
			local104 = arg1 - local9;
			local113 = local9 + arg1;
			if (local113 >= Static289.anInt5053 && local104 <= Static93.anInt1676) {
				@Pc(229) int local229 = Static412.method5316(Static427.anInt7214, Static434.anInt7302, local7 + arg4);
				@Pc(237) int local237 = Static412.method5316(Static427.anInt7214, Static434.anInt7302, arg4 - local7);
				if (Static289.anInt5053 <= local104) {
					Static2.method38(local229, arg3, Static67.anIntArrayArray13[local104], local237);
				}
				if (local113 <= Static93.anInt1676) {
					Static2.method38(local229, arg3, Static67.anIntArrayArray13[local113], local237);
				}
			}
		}
	}
}
