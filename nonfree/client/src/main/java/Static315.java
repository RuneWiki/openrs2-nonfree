import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!pt", name = "d", descriptor = "I")
	public static int anInt5094;

	@OriginalMember(owner = "client!pt", name = "o", descriptor = "[Lclient!cm;")
	public static final Class4_Sub2_Sub6[] aClass4_Sub2_Sub6Array3 = new Class4_Sub2_Sub6[14];

	@OriginalMember(owner = "client!pt", name = "p", descriptor = "[I")
	public static final int[] anIntArray411 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIILclient!rd;)V")
	public static void method4080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class8_Sub3_Sub1_Sub1 arg2) {
		if (arg0 == arg2.anInt7365 && arg0 != -1) {
			@Pc(16) Class119 local16 = Static170.aClass125_3.method2389(arg0);
			@Pc(19) int local19 = local16.anInt3012;
			if (local19 == 1) {
				arg2.anInt7375 = 0;
				arg2.anInt7358 = 0;
				arg2.anInt7359 = arg1;
				arg2.anInt7382 = 1;
				arg2.anInt7373 = 0;
				Static334.method4419(arg2.anInt7339, local16, arg2.aByte99, arg2 == Static401.aClass8_Sub3_Sub1_Sub1_2, arg2.anInt7375, arg2.anInt7343);
			}
			if (local19 == 2) {
				arg2.anInt7358 = 0;
			}
		} else if (arg0 == -1 || arg2.anInt7365 == -1 || Static170.aClass125_3.method2389(arg0).anInt2999 >= Static170.aClass125_3.method2389(arg2.anInt7365).anInt2999) {
			arg2.anInt7428 = arg2.anInt7427;
			arg2.anInt7359 = arg1;
			arg2.anInt7375 = 0;
			arg2.anInt7358 = 0;
			arg2.anInt7382 = 1;
			arg2.anInt7365 = arg0;
			arg2.anInt7373 = 0;
			if (arg2.anInt7365 != -1) {
				Static334.method4419(arg2.anInt7339, Static170.aClass125_3.method2389(arg2.anInt7365), arg2.aByte99, arg2 == Static401.aClass8_Sub3_Sub1_Sub1_2, arg2.anInt7375, arg2.anInt7343);
			}
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(BI)Z")
	public static boolean method4081(@OriginalArg(1) int arg0) {
		return arg0 == 2 || arg0 == 6 || arg0 == 9;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(III)Z")
	public static boolean method4084(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static102.method1520(arg0, arg1) & Static118.method1692(arg0, arg1);
	}
}
