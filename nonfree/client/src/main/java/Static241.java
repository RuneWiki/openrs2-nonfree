import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!me", name = "h", descriptor = "I")
	public static int anInt4046 = -1;

	@OriginalMember(owner = "client!me", name = "j", descriptor = "Lclient!cp;")
	public static final Class42 aClass42_1 = new Class42();

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
	public static void method3216() {
		Static247.aClass4_Sub9_Sub2_2.method5047(Static179.aClass211_50.method4375());
		Static247.aClass4_Sub9_Sub2_2.method5047(Static284.aClass211_69.method4375());
		Static247.aClass4_Sub9_Sub2_2.method5047(Static170.aClass211_95.method4375());
		Static247.aClass4_Sub9_Sub2_2.method5047(Static37.aClass211_13.method4375());
		Static247.aClass4_Sub9_Sub2_2.method5047(Static277.aClass211_67.method4375());
		Static247.aClass4_Sub9_Sub2_2.method5047(Static280.aClass211_68.method4375());
		Static247.aClass4_Sub9_Sub2_2.method5047(Static231.aClass211_62.method4375());
		Static247.aClass4_Sub9_Sub2_2.method5047(Static8.aClass211_5.method4375());
		Static247.aClass4_Sub9_Sub2_2.method5047(Static13.aClass211_11.method4375());
		Static247.aClass4_Sub9_Sub2_2.method5047(Static172.aClass211_46.method4375());
		Static247.aClass4_Sub9_Sub2_2.method5047(Static226.aClass211_61.method4375());
		Static247.aClass4_Sub9_Sub2_2.method5047(Static268.aClass211_65.method4375());
		Static247.aClass4_Sub9_Sub2_2.method5047(Static4.aClass211_2.method4375());
		Static247.aClass4_Sub9_Sub2_2.method5047(Static57.aClass211_18.method4375());
		Static247.aClass4_Sub9_Sub2_2.method5047(Static399.aClass211_87.method4375());
		Static247.aClass4_Sub9_Sub2_2.method5047(Static10.aClass211_6.method4375());
		Static247.aClass4_Sub9_Sub2_2.method5047(Static81.aClass211_22.method4375());
		Static247.aClass4_Sub9_Sub2_2.method5047(Static108.aClass211_8.method4375());
		Static247.aClass4_Sub9_Sub2_2.method5047(Static11.aClass211_9.method4375());
		Static247.aClass4_Sub9_Sub2_2.method5047(Static391.aClass211_85.method4375());
		Static247.aClass4_Sub9_Sub2_2.method5047(Static75.aClass211_20.method4375());
		Static247.aClass4_Sub9_Sub2_2.method5047(Static291.aClass211_72.method4375());
		Static247.aClass4_Sub9_Sub2_2.method5047(Static405.aClass211_90.method4375());
		Static247.aClass4_Sub9_Sub2_2.method5047(Static359.aClass211_80.method4375());
		Static247.aClass4_Sub9_Sub2_2.method5047(Static120.aClass211_31.method4375());
		Static247.aClass4_Sub9_Sub2_2.method5047(Static40.aClass211_15.method4375());
		Static247.aClass4_Sub9_Sub2_2.method5047(Static327.aClass211_78.method4375());
		Static247.aClass4_Sub9_Sub2_2.method5047(Static43.aClass211_55.method4375());
		Static247.aClass4_Sub9_Sub2_2.method5047(Static23.aClass211_86.method4375());
		Static247.aClass4_Sub9_Sub2_2.method5047(Static271.aClass211_66.method4375());
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IB)V")
	public static void method3217(@OriginalArg(0) int arg0) {
		Static173.anInt3129 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(BLclient!rd;IBI)V")
	public static void method3219(@OriginalArg(1) Class8_Sub3_Sub1_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		@Pc(10) int local10 = arg0.anIntArray560[0];
		@Pc(15) int local15 = arg0.anIntArray559[0];
		if (local10 < 0 || local10 >= Static337.anInt5497 || local15 < 0 || local15 >= Static282.anInt4644 || (arg2 < 0 || Static337.anInt5497 <= arg2 || arg1 < 0 || arg1 >= Static282.anInt4644)) {
			return;
		}
		@Pc(69) int local69 = Static79.method1278(Static240.anIntArray339, local15, -4, 0, 0, arg0.method5894(), Static409.aClass128Array1[arg0.aByte99], 0, true, arg1, local10, arg2, Static388.anIntArray502, 0);
		if (local69 >= 1 && local69 <= 3) {
			for (@Pc(79) int local79 = 0; local79 < local69 - 1; local79++) {
				arg0.method4550(Static388.anIntArray502[local79], (byte) 2, Static240.anIntArray339[local79]);
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method3220(@OriginalArg(0) String arg0) {
		if (!arg0.equals("")) {
			Static448.method5935(Static144.aClass146_43);
			Static247.aClass4_Sub9_Sub2_2.method4999(Static109.method5003(arg0));
			Static247.aClass4_Sub9_Sub2_2.method5039(arg0);
		}
	}
}
