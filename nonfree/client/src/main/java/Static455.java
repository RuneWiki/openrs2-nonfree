import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static455 {

	@OriginalMember(owner = "client!wv", name = "C", descriptor = "[Lclient!bt;")
	public static Class26_Sub2[] aClass26_Sub2Array5;

	@OriginalMember(owner = "client!wv", name = "A", descriptor = "Lclient!lg;")
	public static final Class146 aClass146_8 = new Class146(8, -1);

	@OriginalMember(owner = "client!wv", name = "B", descriptor = "[Lclient!oc;")
	public static final Class174[] aClass174Array3 = new Class174[2048];

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(II)V")
	public static void method4430(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub2_Sub1 local8 = Static258.method5559(arg0, 4);
		local8.method195();
	}

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "(II)V")
	public static void method4431(@OriginalArg(0) int arg0) {
		if (Static151.anInt2579 == arg0) {
			return;
		}
		if (Static151.anInt2579 == 0) {
			Static375.method5139();
		}
		if (arg0 == 40) {
			Static103.method1573();
		}
		if (arg0 != 40 && Static190.aClass161_2 != null) {
			Static190.aClass161_2.method3764();
			Static190.aClass161_2 = null;
		}
		if (Static151.anInt2579 == 25 || Static151.anInt2579 == 28) {
			Static147.aClass250_27.anInt7316 = 2;
			Static96.aClass250_20.anInt7316 = 2;
			Static82.aClass250_17.anInt7316 = 2;
			Static181.aClass250_41.anInt7316 = 2;
			Static383.aClass250_75.anInt7316 = 2;
			Static10.aClass250_3.anInt7316 = 2;
			Static412.aClass250_86.anInt7316 = 2;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static12.anInt324 = 0;
			Static295.anInt5212 = 0;
			Static113.anInt5756 = 1;
			Static120.anInt2114 = 0;
			Static135.anInt2312 = 1;
			Static157.method2372(true);
			Static147.aClass250_27.anInt7316 = 1;
			Static96.aClass250_20.anInt7316 = 1;
			Static82.aClass250_17.anInt7316 = 1;
			Static181.aClass250_41.anInt7316 = 1;
			Static383.aClass250_75.anInt7316 = 1;
			Static10.aClass250_3.anInt7316 = 1;
			Static412.aClass250_86.anInt7316 = 1;
		}
		if (arg0 == 25 || arg0 == 10) {
			Static9.method238();
		}
		if (arg0 == 5) {
			Static386.method5275(Static276.aClass109_10, Static384.aClass250_76);
		} else {
			Static193.method909();
		}
		@Pc(152) boolean local152 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		@Pc(169) boolean local169 = Static151.anInt2579 == 5 || Static151.anInt2579 == 10 || Static151.anInt2579 == 28;
		if (local152 != local169) {
			if (local152) {
				Static369.anInt6297 = Static174.anInt3176;
				if (Static389.aClass128_Sub1_1.anInt3559 == 0) {
					Static451.method6036();
				} else {
					Static153.method5065(Static174.anInt3176, Static389.aClass128_Sub1_1.anInt3559, Static260.aClass250_56);
				}
				Static63.aClass94_2.method1916(false);
			} else {
				Static451.method6036();
				Static63.aClass94_2.method1916(true);
			}
		}
		if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
			Static276.aClass109_10.method4737();
		}
		Static151.anInt2579 = arg0;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IB)V")
	public static void method4435(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub2_Sub1 local8 = Static258.method5559(arg0, 6);
		local8.method195();
	}
}
