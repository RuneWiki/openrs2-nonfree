import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "I")
	public static int anInt6787;

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "I")
	public static int anInt6785 = 0;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method5835(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = Static274.anInt4964;
		@Pc(9) int[] local9 = Static70.anIntArray392;
		@Pc(11) boolean local11 = false;
		for (@Pc(13) int local13 = 0; local13 < local7; local13++) {
			@Pc(21) Class4_Sub1_Sub2_Sub1_Sub2 local21 = Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[local9[local13]];
			if (local21 != null && local21 != Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2 && local21.aString63 != null && local21.aString63.equalsIgnoreCase(arg1)) {
				@Pc(56) Class3_Sub14 local56;
				if (arg0 == 1) {
					local56 = Static139.method2308(Static146.aClass130_44, Static24.aClass233_1);
					local56.aClass3_Sub3_Sub2_2.method4216(0);
					local56.aClass3_Sub3_Sub2_2.method4226(local9[local13]);
					Static562.method8096(local56);
				} else if (arg0 == 4) {
					local56 = Static139.method2308(Static454.aClass130_111, Static24.aClass233_1);
					local56.aClass3_Sub3_Sub2_2.method4253(local9[local13]);
					local56.aClass3_Sub3_Sub2_2.method4216(0);
					Static562.method8096(local56);
				} else if (arg0 == 5) {
					local56 = Static139.method2308(Static48.aClass130_21, Static24.aClass233_1);
					local56.aClass3_Sub3_Sub2_2.method4226(local9[local13]);
					local56.aClass3_Sub3_Sub2_2.method4203(0);
					Static562.method8096(local56);
				} else if (arg0 == 6) {
					local56 = Static139.method2308(Static544.aClass130_122, Static24.aClass233_1);
					local56.aClass3_Sub3_Sub2_2.method4240(0);
					local56.aClass3_Sub3_Sub2_2.method4253(local9[local13]);
					Static562.method8096(local56);
				} else if (arg0 == 7) {
					local56 = Static139.method2308(Static104.aClass130_39, Static24.aClass233_1);
					local56.aClass3_Sub3_Sub2_2.method4226(local9[local13]);
					local56.aClass3_Sub3_Sub2_2.method4216(0);
					Static562.method8096(local56);
				}
				local11 = true;
				break;
			}
		}
		if (!local11) {
			Static612.method8491(Static59.aClass43_21.method1598(Static325.anInt6083) + arg1);
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IZ)V")
	public static void method5836(@OriginalArg(1) boolean arg0) {
		if (Static101.aClass59_1 == null) {
			Static474.method7123();
		}
		if (arg0) {
			Static101.aClass59_1.method1953();
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)[Lclient!hfa;")
	public static Class136[] method5837() {
		return new Class136[] { Static624.aClass136_1, Static624.aClass136_2, Static624.aClass136_3, Static624.aClass136_4, Static624.aClass136_5, Static624.aClass136_6, Static624.aClass136_7, Static624.aClass136_8, Static624.aClass136_9, Static624.aClass136_10, Static624.aClass136_11, Static624.aClass136_12, Static624.aClass136_13, Static624.aClass136_14 };
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(III)I")
	public static int method5838(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) byte local20;
		if (arg0 > 20000) {
			Static103.method2140();
			local20 = 4;
		} else if (arg0 > 10000) {
			local20 = 3;
			Static481.method7182();
		} else if (arg0 > 5000) {
			local20 = 2;
			Static634.method8680();
		} else {
			Static154.method2818();
			local20 = 1;
		}
		if (Static262.aClass3_Sub27_12.aClass21_Sub1_1.method1025() != arg1) {
			Static262.aClass3_Sub27_12.method3234(arg1, Static262.aClass3_Sub27_12.aClass21_Sub1_2);
			Static441.method6865(false, arg1);
		}
		Static108.method2177();
		return local20;
	}
}
