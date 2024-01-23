import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!am", name = "g", descriptor = "Lclient!cg;")
	public static Class22 aClass22_6;

	@OriginalMember(owner = "client!am", name = "h", descriptor = "[[B")
	public static byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "I")
	public static int anInt287 = -1;

	@OriginalMember(owner = "client!am", name = "d", descriptor = "Z")
	public static boolean aBoolean23 = false;

	@OriginalMember(owner = "client!am", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString12 = "Mechscape is loading - please wait...";

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIII)V")
	public static void method237(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			Static175.aClass4_Sub24_Sub1_1.method3123(68);
			Static175.aClass4_Sub24_Sub1_1.method3116(5);
		}
		if (arg2 == 1) {
			Static175.aClass4_Sub24_Sub1_1.method3123(229);
			Static175.aClass4_Sub24_Sub1_1.method3116(19);
		}
		Static175.aClass4_Sub24_Sub1_1.method3105(Static269.anInt5357 + arg1);
		Static175.aClass4_Sub24_Sub1_1.method3097(Static113.aBooleanArray18[82] ? 1 : 0);
		Static175.aClass4_Sub24_Sub1_1.method3112(Static105.anInt2105 + arg0);
		Static11.anInt279 = arg1;
		Static274.anInt5438 = arg0;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(III)Lclient!jo;")
	public static Class86 method239(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class86 local9 = new Class86();
		for (@Pc(19) Class4_Sub2_Sub18 local19 = (Class4_Sub2_Sub18) Static154.aClass163_23.method4192(); local19 != null; local19 = (Class4_Sub2_Sub18) Static154.aClass163_23.method4183()) {
			if (local19.aBoolean283 && local19.method3543(arg0, arg1)) {
				local9.method2185(local19);
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!qe;III)V")
	public static void method240(@OriginalArg(0) Class13_Sub5_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg0.anInt5305 && arg2 != -1) {
			@Pc(22) Class186 local22 = Static51.method992(arg2);
			@Pc(25) int local25 = local22.anInt5814;
			if (local25 == 1) {
				arg0.anInt5333 = 0;
				arg0.anInt5247 = 1;
				arg0.anInt5309 = 0;
				arg0.anInt5249 = 0;
				arg0.anInt5251 = arg1;
				Static229.method3598(arg0 == Static72.aClass13_Sub5_Sub1_1, arg0.anInt5294, local22, arg0.anInt5334, arg0.anInt5249);
			}
			if (local25 == 2) {
				arg0.anInt5309 = 0;
			}
		} else if (arg2 == -1 || arg0.anInt5305 == -1 || Static51.method992(arg2).anInt5807 >= Static51.method992(arg0.anInt5305).anInt5807) {
			arg0.anInt5309 = 0;
			arg0.anInt5333 = 0;
			arg0.anInt5316 = arg0.anInt5271;
			arg0.anInt5247 = 1;
			arg0.anInt5249 = 0;
			arg0.anInt5251 = arg1;
			arg0.anInt5305 = arg2;
			if (arg0.anInt5305 != -1) {
				Static229.method3598(arg0 == Static72.aClass13_Sub5_Sub1_1, arg0.anInt5294, Static51.method992(arg0.anInt5305), arg0.anInt5334, arg0.anInt5249);
			}
		}
	}
}
