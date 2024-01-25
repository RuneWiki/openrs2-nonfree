import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!hi", name = "e", descriptor = "F")
	public static float aFloat31;

	@OriginalMember(owner = "client!hi", name = "f", descriptor = "F")
	public static float aFloat32;

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "[I")
	public static final int[] anIntArray263 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIBLclient!vj;)Lclient!mk;")
	public static Class112_Sub2_Sub1 method3210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class172_Sub2 arg4) {
		if (arg4.aBoolean619 || Static137.method2172(arg2) && Static137.method2172(arg0)) {
			return new Class112_Sub2_Sub1(arg4, 3553, arg3, arg1, arg2, arg0, true);
		} else if (arg4.aBoolean607) {
			return new Class112_Sub2_Sub1(arg4, 34037, arg3, arg1, arg2, arg0, true);
		} else {
			return new Class112_Sub2_Sub1(arg4, arg3, arg1, arg2, arg0, Static288.method4088(arg2), Static288.method4088(arg0), true);
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method3216(@OriginalArg(0) String arg0) {
		if (!Static446.aBoolean648) {
			return;
		}
		@Pc(8) boolean local8 = false;
		@Pc(10) int local10 = Static160.anInt3271;
		@Pc(12) int[] local12 = Static162.anIntArray212;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(26) Class7_Sub2_Sub3_Sub2 local26 = Static361.aClass7_Sub2_Sub3_Sub2Array1[local12[local14]];
			if (local26 != null && local26 != Static379.aClass7_Sub2_Sub3_Sub2_2 && local26.aString36 != null && local26.aString36.equalsIgnoreCase(arg0)) {
				Static30.method641(Static45.aClass217_20);
				Static302.aClass3_Sub7_Sub1_2.method2614(Static213.anInt4082);
				Static302.aClass3_Sub7_Sub1_2.method2587(Static338.anInt5764);
				Static302.aClass3_Sub7_Sub1_2.method2587(local12[local14]);
				Static302.aClass3_Sub7_Sub1_2.method2636(Static129.anInt2687);
				Static302.aClass3_Sub7_Sub1_2.method2624(0);
				Static439.method5750(true, local26.anIntArray288[0], 0, local26.method3499(), local26.method3499(), -2, local26.anIntArray287[0], 0);
				local8 = true;
				break;
			}
		}
		if (!local8) {
			Static155.method2520(Static54.aClass189_38.method4262(Static53.anInt1454) + arg0);
		}
		if (Static446.aBoolean648) {
			Static70.method1396();
		}
	}
}
