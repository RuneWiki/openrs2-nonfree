import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!wh", name = "o", descriptor = "Lclient!cg;")
	public static Class22 aClass22_106;

	@OriginalMember(owner = "client!wh", name = "J", descriptor = "I")
	public static int anInt5783;

	@OriginalMember(owner = "client!wh", name = "K", descriptor = "F")
	public static float aFloat169;

	@OriginalMember(owner = "client!wh", name = "Z", descriptor = "[Lclient!gh;")
	public static Class58[] aClass58Array5;

	@OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
	public static int anInt5768 = 0;

	@OriginalMember(owner = "client!wh", name = "E", descriptor = "I")
	public static int anInt5779 = -1;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILclient!pi;)Lclient!kc;")
	public static Class5_Sub3 method4650(@OriginalArg(1) Class4_Sub24 arg0) {
		return new Class5_Sub3(arg0.method3072(), arg0.method3072(), arg0.method3072(), arg0.method3072(), arg0.method3072(), arg0.method3072(), arg0.method3072(), arg0.method3072(), arg0.method3063(), arg0.method3110());
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)Z")
	public static boolean method4651(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		@Pc(19) Class73 local19 = Static296.method4591(arg0);
		return local19.method1902(arg1);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIBII)V")
	public static void method4653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) Class171[] local3 = Static56.aClass171Array1;
		for (@Pc(5) int local5 = 0; local5 < local3.length; local5++) {
			@Pc(17) Class171 local17 = local3[local5];
			if (local17 != null && local17.anInt5452 == 2) {
				Static178.method2921((local17.anInt5458 - Static105.anInt2105 << 7) + local17.anInt5462, local17.anInt5457 * 2, (local17.anInt5454 - Static269.anInt5357 << 7) + local17.anInt5451, arg4 >> 1, arg2, arg3 >> 1, arg1);
				if (Static288.anInt5635 > -1 && Static50.anInt1118 % 20 < 10) {
					Static161.aClass4_Sub2_Sub4Array9[local17.anInt5450].method4142(arg5 + Static288.anInt5635 - 12, Static297.anInt5194 + arg0 + -28);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(B)V")
	public static void method4659() {
		Static133.anInterface2Array1 = null;
		Static220.method3408();
	}
}
