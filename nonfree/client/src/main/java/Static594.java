import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static594 {

	@OriginalMember(owner = "client!wv", name = "p", descriptor = "Lclient!jea;")
	public static Class170 aClass170_1;

	@OriginalMember(owner = "client!wv", name = "l", descriptor = "I")
	public static int anInt10250 = 1;

	@OriginalMember(owner = "client!wv", name = "v", descriptor = "I")
	public static int anInt10259 = 1;

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IILclient!wt;)V")
	public static void method8374(@OriginalArg(0) int arg0, @OriginalArg(2) Class365 arg1) {
		if (Static459.anInt8551 >= 50 || (arg1 == null || arg1.anIntArrayArray59 == null || arg1.anIntArrayArray59.length <= arg0 || arg1.anIntArrayArray59[arg0] == null)) {
			return;
		}
		@Pc(30) int local30 = arg1.anIntArrayArray59[arg0][0];
		@Pc(34) int local34 = local30 >> 8;
		@Pc(53) int local53;
		if (arg1.anIntArrayArray59[arg0].length > 1) {
			local53 = (int) ((double) arg1.anIntArrayArray59[arg0].length * Math.random());
			if (local53 > 0) {
				local34 = arg1.anIntArrayArray59[arg0][local53];
			}
		}
		@Pc(71) int local71 = local30 >> 5 & 0x7;
		local53 = 256;
		if (arg1.anIntArray554 != null && arg1.anIntArray553 != null) {
			local53 = Static392.method6208(arg1.anIntArray554[arg0], arg1.anIntArray553[arg0]);
		}
		if (arg1.aBoolean722) {
			Static190.method3334(255, 0, local34, false, local53, local71);
		} else {
			Static212.method3531(local34, 255, local53, 0, local71);
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(II)V")
	public static void method8376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class53 local7 = Static60.aClass53ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class53 local28 = Static60.aClass53ArrayArrayArray1[local9][arg0][arg1] = Static60.aClass53ArrayArrayArray1[local9 + 1][arg0][arg1];
			if (local28 != null) {
				for (@Pc(33) Class289 local33 = local28.aClass289_1; local33 != null; local33 = local33.aClass289_3) {
					@Pc(37) Class1_Sub4_Sub2 local37 = local33.aClass1_Sub4_Sub2_1;
					if (local37.aShort121 == arg0 && local37.aShort120 == arg1) {
						local37.aByte126--;
					}
				}
				if (local28.aClass1_Sub4_Sub4_1 != null) {
					local28.aClass1_Sub4_Sub4_1.aByte126--;
				}
				if (local28.aClass1_Sub4_Sub5_2 != null) {
					local28.aClass1_Sub4_Sub5_2.aByte126--;
				}
				if (local28.aClass1_Sub4_Sub5_1 != null) {
					local28.aClass1_Sub4_Sub5_1.aByte126--;
				}
				if (local28.aClass1_Sub4_Sub1_2 != null) {
					local28.aClass1_Sub4_Sub1_2.aByte126--;
				}
				if (local28.aClass1_Sub4_Sub1_1 != null) {
					local28.aClass1_Sub4_Sub1_1.aByte126--;
				}
			}
		}
		if (Static60.aClass53ArrayArrayArray1[0][arg0][arg1] == null) {
			Static60.aClass53ArrayArrayArray1[0][arg0][arg1] = new Class53(0);
			Static60.aClass53ArrayArrayArray1[0][arg0][arg1].aByte13 = 1;
		}
		Static60.aClass53ArrayArrayArray1[0][arg0][arg1].aClass53_1 = local7;
		Static60.aClass53ArrayArrayArray1[3][arg0][arg1] = null;
	}
}
