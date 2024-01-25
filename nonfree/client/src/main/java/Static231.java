import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "F")
	public static float aFloat106;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "[Lclient!fo;")
	public static final Class111[] aClass111Array1 = new Class111[14];

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_33 = new Class344(32, 7);

	@OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
	public static int anInt4893 = -1;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method3754(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class182 local7 = Static571.aClass182ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class192 local13 = local7.aClass192_2; local13 != null; local13 = local13.aClass192_3) {
			@Pc(17) Class21_Sub1_Sub1 local17 = local13.aClass21_Sub1_Sub1_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort119 == arg1 && local17.aShort121 == arg2) {
				Static18.method815(local17, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZIIB)V")
	public static void method3755(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static453.anInt8614 == 0) {
			Static312.method4930(false);
		} else {
			Static241.anInt5030 = Static453.anInt8614;
			Static146.method2531(0);
		}
		Static450.aBoolean604 = arg1;
		Static36.anInt1226 = arg3;
		Static158.anInt3337 = arg0;
		Static572.method7757(arg2);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(BI)V")
	public static void method3759(@OriginalArg(1) int arg0) {
		if (Static9.anInt758 == arg0) {
			return;
		}
		if (arg0 == 13) {
			if (Static67.aString22 == null) {
				Static183.method3009(Static422.aString169, Static544.aString215, Static313.anInt6277);
			} else {
				Static367.method5535(Static313.anInt6277);
			}
		}
		if (arg0 != 13 && Static58.aClass36_1 != null) {
			Static58.aClass36_1.method1992();
			Static58.aClass36_1 = null;
		}
		if (arg0 == 3) {
			Static189.method3134(Static446.anInt8493 != Static162.anInt3366);
		}
		if (arg0 == 7) {
			Static101.method1934(Static588.anInt10538 != Static446.anInt8493);
		}
		if (arg0 == 5) {
			if (Static67.aString22 == null) {
				Static56.method1305(Static544.aString215, Static422.aString169);
			} else {
				Static521.method7393();
			}
		} else if (arg0 == 6) {
			if (Static67.aString22 == null) {
				Static183.method3009(Static422.aString169, Static544.aString215, Static313.anInt6277);
			} else {
				Static367.method5535(Static313.anInt6277);
			}
		} else if (arg0 == 9) {
			if (Static67.aString22 == null) {
				Static183.method3009(Static422.aString169, Static544.aString215, Static313.anInt6277);
			} else {
				Static367.method5535(Static313.anInt6277);
			}
		} else if (arg0 == 12) {
			if (Static67.aString22 == null) {
				Static56.method1305(Static544.aString215, Static422.aString169);
			} else {
				Static521.method7393();
			}
		}
		if (Static364.method5492(Static9.anInt758)) {
			Static196.aClass348_49.anInt10233 = 2;
			Static364.aClass348_77.anInt10233 = 2;
			Static7.aClass348_6.anInt10233 = 2;
			Static249.aClass348_41.anInt10233 = 2;
			Static384.aClass348_92.anInt10233 = 2;
			Static377.aClass348_85.anInt10233 = 2;
			Static325.aClass348_68.anInt10233 = 2;
		}
		if (Static364.method5492(arg0)) {
			Static528.anInt9683 = 1;
			Static279.anInt5791 = 0;
			Static106.anInt2491 = 0;
			Static89.anInt2296 = 1;
			Static179.anInt3762 = 0;
			Static312.method4930(true);
			Static196.aClass348_49.anInt10233 = 1;
			Static364.aClass348_77.anInt10233 = 1;
			Static7.aClass348_6.anInt10233 = 1;
			Static249.aClass348_41.anInt10233 = 1;
			Static384.aClass348_92.anInt10233 = 1;
			Static377.aClass348_85.anInt10233 = 1;
			Static325.aClass348_68.anInt10233 = 1;
		}
		if (arg0 == 11 || arg0 == 3) {
			Static220.method7178();
		}
		@Pc(223) boolean local223 = arg0 == 2 || Static299.method4770(arg0) || Static254.method4045(arg0);
		@Pc(238) boolean local238 = Static9.anInt758 == 2 || Static299.method4770(Static9.anInt758) || Static254.method4045(Static9.anInt758);
		if (local238 != local223) {
			if (local223) {
				Static269.anInt5657 = Static542.anInt9889;
				if (Static455.aClass4_Sub35_Sub1_1.anInt9927 == 0) {
					Static283.method4490();
				} else {
					Static195.method6870(Static326.aClass348_69, Static455.aClass4_Sub35_Sub1_1.anInt9927, Static542.anInt9889);
					Static159.method2601();
				}
				Static433.aClass72_3.method1859(false);
			} else {
				Static283.method4490();
				Static433.aClass72_3.method1859(true);
			}
		}
		if (Static364.method5492(arg0) || arg0 == 13) {
			Static39.aClass7_2.method7830();
		}
		Static9.anInt758 = arg0;
	}
}
