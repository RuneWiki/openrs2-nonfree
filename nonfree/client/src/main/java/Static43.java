import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!bj", name = "Z", descriptor = "Lclient!qg;")
	public static Class283 aClass283_1;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)V")
	public static void method684(@OriginalArg(1) int arg0) {
		Static27.anInt643 = -1;
		Static40.anInt794 = arg0;
		Static160.anInt2883 = -1;
		Static61.method909();
	}

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "(II)V")
	public static void method694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class53 local7 = Static28.aClass53ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class53 local28 = Static28.aClass53ArrayArrayArray1[local9][arg0][arg1] = Static28.aClass53ArrayArrayArray1[local9 + 1][arg0][arg1];
			if (local28 != null) {
				for (@Pc(33) Class325 local33 = local28.aClass325_1; local33 != null; local33 = local33.aClass325_3) {
					@Pc(37) Class13_Sub1_Sub1 local37 = local33.aClass13_Sub1_Sub1_1;
					if (local37.aShort117 == arg0 && local37.aShort119 == arg1) {
						local37.aByte127--;
					}
				}
				if (local28.aClass13_Sub1_Sub2_1 != null) {
					local28.aClass13_Sub1_Sub2_1.aByte127--;
				}
				if (local28.aClass13_Sub1_Sub4_1 != null) {
					local28.aClass13_Sub1_Sub4_1.aByte127--;
				}
				if (local28.aClass13_Sub1_Sub4_2 != null) {
					local28.aClass13_Sub1_Sub4_2.aByte127--;
				}
				if (local28.aClass13_Sub1_Sub3_2 != null) {
					local28.aClass13_Sub1_Sub3_2.aByte127--;
				}
				if (local28.aClass13_Sub1_Sub3_1 != null) {
					local28.aClass13_Sub1_Sub3_1.aByte127--;
				}
			}
		}
		if (Static28.aClass53ArrayArrayArray1[0][arg0][arg1] == null) {
			Static28.aClass53ArrayArrayArray1[0][arg0][arg1] = new Class53(0);
			Static28.aClass53ArrayArrayArray1[0][arg0][arg1].aByte28 = 1;
		}
		Static28.aClass53ArrayArrayArray1[0][arg0][arg1].aClass53_1 = local7;
		Static28.aClass53ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIII)I")
	public static int method702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 4095 - arg1;
		} else if (local3 == 2) {
			return 4095 - arg2;
		} else {
			return arg1;
		}
	}
}
