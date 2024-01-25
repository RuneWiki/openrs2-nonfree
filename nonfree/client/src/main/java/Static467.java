import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static467 {

	@OriginalMember(owner = "client!ru", name = "d", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_120 = new Class90(18, 6);

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIIBI)V")
	public static void method6807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static572.anInt10057 / (float) Static572.anInt10062;
		@Pc(11) int local11 = arg3;
		@Pc(13) int local13 = arg0;
		if (local9 < 1.0F) {
			local13 = (int) ((float) arg3 * local9);
		} else {
			local11 = (int) ((float) arg0 / local9);
		}
		@Pc(40) int local40 = arg1 - (arg3 - local11) / 2;
		@Pc(54) int local54 = arg2 - (arg0 - local13) / 2;
		Static465.anInt8867 = -1;
		Static555.anInt10135 = Static572.anInt10057 - local54 * Static572.anInt10057 / local13;
		Static43.anInt2490 = local40 * Static572.anInt10062 / local11;
		Static315.anInt6308 = -1;
		Static279.method4473();
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(JI)V")
	public static void method6808(@OriginalArg(0) long arg0) {
		@Pc(6) Class4_Sub39 local6 = Static504.method7252();
		local6.aClass4_Sub13_Sub2_1.method7052(Static58.aClass195_8.anInt5991);
		local6.aClass4_Sub13_Sub2_1.method7020(arg0);
		local6.aClass4_Sub13_Sub2_1.method7052(Static142.anInt3088);
		Static50.method1166(local6);
		Static457.anInt8737 = -3;
		Static232.anInt4898 = 1;
		Static209.anInt4424 = 0;
		Static423.anInt8145 = 0;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(ZI)Z")
	public static boolean method6810(@OriginalArg(1) int arg0) {
		for (@Pc(15) Class4_Sub36 local15 = (Class4_Sub36) Static593.aClass22_65.method895(); local15 != null; local15 = (Class4_Sub36) Static593.aClass22_65.method889()) {
			if (Static208.method3402(local15.anInt7137) && (long) arg0 == local15.aLong194) {
				return true;
			}
		}
		return false;
	}
}
