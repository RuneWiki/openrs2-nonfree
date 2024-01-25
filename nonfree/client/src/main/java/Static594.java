import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static594 {

	@OriginalMember(owner = "client!ub", name = "C", descriptor = "[Lclient!fe;")
	public static Class23_Sub2_Sub1[] aClass23_Sub2_Sub1Array1;

	@OriginalMember(owner = "client!ub", name = "E", descriptor = "I")
	public static int anInt9371;

	@OriginalMember(owner = "client!ub", name = "x", descriptor = "I")
	public static int anInt9366 = 0;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZI)V")
	public static void method7954(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static277.anInt5201 != -1) {
				Static452.method6501(Static277.anInt5201);
			}
			for (@Pc(25) Class3_Sub28 local25 = (Class3_Sub28) Static222.aClass62_21.method1680(); local25 != null; local25 = (Class3_Sub28) Static222.aClass62_21.method1681()) {
				if (!local25.method8771()) {
					local25 = (Class3_Sub28) Static222.aClass62_21.method1680();
					if (local25 == null) {
						break;
					}
				}
				Static414.method5937(true, local25, false);
			}
			Static277.anInt5201 = -1;
			Static222.aClass62_21 = new Class62(8);
			Static180.method2976();
			Static277.anInt5201 = Static177.anInt3331;
			Static345.method5204(false);
			Static517.method7334();
			Static543.method7510(Static277.anInt5201);
		}
		Static33.aString9 = "";
		Static69.aString16 = "";
		Static520.aBoolean516 = false;
		Static241.method3897();
		Static267.anInt5035 = -1;
		Static445.method6441(Static503.anInt8458);
		Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2 = new Class23_Sub2_Sub1_Sub2_Sub1();
		Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10109 = Static406.anInt6924 * 512 / 2;
		Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10108 = Static251.anInt4680 * 512 / 2;
		Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anIntArray659[0] = Static251.anInt4680 / 2;
		Static663.anInt10236 = 0;
		Static97.anInt2082 = 0;
		Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anIntArray660[0] = Static406.anInt6924 / 2;
		if (Static378.anInt6662 == 2) {
			Static97.anInt2082 = Static215.anInt6266 << 9;
			Static663.anInt10236 = Static480.anInt8125 << 9;
		} else {
			Static25.method793();
		}
		Static225.method3512();
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)I")
	public static int method7955(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg1 + arg0 * 57;
		@Pc(21) int local21 = local15 ^ local15 << 13;
		@Pc(35) int local35 = local21 * (local21 * local21 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local35 >> 19 & 0xFF;
	}
}
