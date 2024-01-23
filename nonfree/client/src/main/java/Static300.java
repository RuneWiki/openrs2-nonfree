import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
	public static int anInt5786;

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "Lclient!en;")
	public static Class44 aClass44_26 = new Class44();

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Z)V")
	public static void method4557() {
		if (!Static116.aBoolean184 || Static143.aBoolean224) {
			return;
		}
		@Pc(18) Class2_Sub13[][][] local18 = Static52.aClass2_Sub13ArrayArrayArray1;
		for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
			@Pc(32) Class2_Sub13[][] local32 = local18[local20];
			for (@Pc(34) int local34 = 0; local34 < local32.length; local34++) {
				for (@Pc(44) int local44 = 0; local44 < local32[local34].length; local44++) {
					@Pc(56) Class2_Sub13 local56 = local32[local34][local44];
					if (local56 != null) {
						@Pc(72) Class15_Sub5_Sub2 local72;
						if (local56.aClass191_1 != null && local56.aClass191_1.aClass15_10 instanceof Class15_Sub5_Sub2) {
							local72 = (Class15_Sub5_Sub2) local56.aClass191_1.aClass15_10;
							if ((local56.aClass191_1.aLong209 & Long.MIN_VALUE) == 0L) {
								local72.method2377(false, true, true, false, true, true);
							} else {
								local72.method2377(true, true, true, true, true, true);
							}
						}
						if (local56.aClass147_1 != null) {
							if (local56.aClass147_1.aClass15_5 instanceof Class15_Sub5_Sub2) {
								local72 = (Class15_Sub5_Sub2) local56.aClass147_1.aClass15_5;
								if ((Long.MIN_VALUE & local56.aClass147_1.aLong178) == 0L) {
									local72.method2377(false, true, true, false, true, true);
								} else {
									local72.method2377(true, true, true, true, true, true);
								}
							}
							if (local56.aClass147_1.aClass15_4 instanceof Class15_Sub5_Sub2) {
								local72 = (Class15_Sub5_Sub2) local56.aClass147_1.aClass15_4;
								if ((local56.aClass147_1.aLong178 & Long.MIN_VALUE) == 0L) {
									local72.method2377(false, true, true, false, true, true);
								} else {
									local72.method2377(true, true, true, true, true, true);
								}
							}
						}
						if (local56.aClass122_1 != null) {
							if (local56.aClass122_1.aClass15_3 instanceof Class15_Sub5_Sub2) {
								local72 = (Class15_Sub5_Sub2) local56.aClass122_1.aClass15_3;
								if ((local56.aClass122_1.aLong142 & Long.MIN_VALUE) == 0L) {
									local72.method2377(false, true, true, false, true, true);
								} else {
									local72.method2377(true, true, true, true, true, true);
								}
							}
							if (local56.aClass122_1.aClass15_2 instanceof Class15_Sub5_Sub2) {
								local72 = (Class15_Sub5_Sub2) local56.aClass122_1.aClass15_2;
								if ((Long.MIN_VALUE & local56.aClass122_1.aLong142) == 0L) {
									local72.method2377(false, true, true, false, true, true);
								} else {
									local72.method2377(true, true, true, true, true, true);
								}
							}
						}
						for (@Pc(268) int local268 = 0; local268 < local56.anInt1544; local268++) {
							if (local56.aClass170Array1[local268].aClass15_9 instanceof Class15_Sub5_Sub2) {
								@Pc(287) Class15_Sub5_Sub2 local287 = (Class15_Sub5_Sub2) local56.aClass170Array1[local268].aClass15_9;
								if ((Long.MIN_VALUE & local56.aClass170Array1[local268].aLong195) == 0L) {
									local287.method2377(false, true, true, false, true, true);
								} else {
									local287.method2377(true, true, true, true, true, true);
								}
							}
						}
					}
				}
			}
		}
		Static143.aBoolean224 = true;
	}
}
