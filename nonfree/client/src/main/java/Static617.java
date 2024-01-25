import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static617 {

	@OriginalMember(owner = "client!tj", name = "j", descriptor = "Lclient!lb;")
	public static Class221 aClass221_152;

	@OriginalMember(owner = "client!tj", name = "l", descriptor = "I")
	public static int anInt9981;

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(BII)V")
	public static void method8394(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static407.anInt7261 = arg1 - Static654.anInt8150;
		Static332.anInt5824 = arg0 - Static654.anInt8153;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lclient!oba;I)V")
	public static void method8395(@OriginalArg(0) Class19_Sub1_Sub3_Sub2_Sub2 arg0) {
		@Pc(19) Class3_Sub49 local19 = (Class3_Sub49) Static81.aClass136_7.method3503((long) arg0.anInt7796);
		if (local19 == null) {
			Static119.method2062(arg0, arg0.anIntArray430[0], (Class144) null, arg0.lb[0], (Class19_Sub1_Sub3_Sub2_Sub1) null, 0, arg0.aByte146);
		} else {
			local19.method8352();
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method8399(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static22.anInt373 >= 200 && !Static608.aBoolean714 || Static22.anInt373 >= 200) {
			Static332.method4975(Static476.aClass279_11.method6992(Static141.anInt2658));
			return;
		}
		@Pc(40) String local40 = Static282.method4264(arg0);
		if (local40 == null) {
			return;
		}
		@Pc(90) String local90;
		for (@Pc(46) int local46 = 0; local46 < Static22.anInt373; local46++) {
			@Pc(56) String local56 = Static282.method4264(Static432.aStringArray29[local46]);
			if (local56 != null && local56.equals(local40)) {
				Static332.method4975(arg0 + Static476.aClass279_38.method6992(Static141.anInt2658));
				return;
			}
			if (Static604.aStringArray38[local46] != null) {
				local90 = Static282.method4264(Static604.aStringArray38[local46]);
				if (local90 != null && local90.equals(local40)) {
					Static332.method4975(arg0 + Static476.aClass279_38.method6992(Static141.anInt2658));
					return;
				}
			}
		}
		for (@Pc(124) int local124 = 0; local124 < Static299.anInt6884; local124++) {
			local90 = Static282.method4264(Static383.aStringArray25[local124]);
			if (local90 != null && local90.equals(local40)) {
				Static332.method4975(Static476.aClass279_43.method6992(Static141.anInt2658) + arg0 + Static476.aClass279_44.method6992(Static141.anInt2658));
				return;
			}
			if (Static301.aStringArray17[local124] != null) {
				@Pc(173) String local173 = Static282.method4264(Static301.aStringArray17[local124]);
				if (local173 != null && local173.equals(local40)) {
					Static332.method4975(Static476.aClass279_43.method6992(Static141.anInt2658) + arg0 + Static476.aClass279_44.method6992(Static141.anInt2658));
					return;
				}
			}
		}
		if (Static282.method4264(Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aString109).equals(local40)) {
			Static332.method4975(Static476.aClass279_41.method6992(Static141.anInt2658));
			return;
		}
		@Pc(237) Class400 local237 = Static81.method1057();
		@Pc(243) Class3_Sub48 local243 = Static89.method1200(Static541.aClass286_63, local237.aClass399_2);
		local243.aClass3_Sub28_Sub2_1.method5329(Static605.method8305(arg0));
		local243.aClass3_Sub28_Sub2_1.method5283(arg0);
		local237.method9223(local243);
	}
}
