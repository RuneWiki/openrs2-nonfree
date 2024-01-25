import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!pl", name = "I", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_96 = new Class61(76, 7);

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Ljava/lang/String;")
	public static String method5914(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(14) int local14 = arg1.indexOf(arg0); local14 != -1; local14 = arg1.indexOf(arg0, arg2.length() + local14)) {
			arg1 = arg1.substring(0, local14) + arg2 + arg1.substring(local14 + arg0.length());
		}
		return arg1;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method5915(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = Static272.anInt5182;
		@Pc(9) int[] local9 = Static362.anIntArray519;
		@Pc(11) boolean local11 = false;
		for (@Pc(22) int local22 = 0; local22 < local7; local22++) {
			@Pc(30) Class10_Sub1_Sub2_Sub2 local30 = Static246.aClass10_Sub1_Sub2_Sub2Array1[local9[local22]];
			if (local30 != null && local30 != Static129.aClass10_Sub1_Sub2_Sub2_1 && local30.aString93 != null && local30.aString93.equalsIgnoreCase(arg1)) {
				local11 = true;
				@Pc(59) Class4_Sub41 local59;
				if (arg0 == 1) {
					local59 = Static128.method2707(Static519.aClass61_118, Class16_Sub3.lb);
					local59.aClass4_Sub9_Sub1_3.method6002(local9[local22]);
					local59.aClass4_Sub9_Sub1_3.method5993(0);
					Static551.method7603(local59);
				} else if (arg0 == 4) {
					local59 = Static128.method2707(Static289.aClass61_62, Class16_Sub3.lb);
					local59.aClass4_Sub9_Sub1_3.method6001(0);
					local59.aClass4_Sub9_Sub1_3.method6011(local9[local22]);
					Static551.method7603(local59);
				} else if (arg0 == 5) {
					local59 = Static128.method2707(Static427.aClass61_98, Class16_Sub3.lb);
					local59.aClass4_Sub9_Sub1_3.method6012(local9[local22]);
					local59.aClass4_Sub9_Sub1_3.method6001(0);
					Static551.method7603(local59);
				} else if (arg0 == 6) {
					local59 = Static128.method2707(Static98.aClass61_24, Class16_Sub3.lb);
					local59.aClass4_Sub9_Sub1_3.method6002(local9[local22]);
					local59.aClass4_Sub9_Sub1_3.method5970(0);
					Static551.method7603(local59);
				} else if (arg0 == 7) {
					local59 = Static128.method2707(Static550.aClass61_127, Class16_Sub3.lb);
					local59.aClass4_Sub9_Sub1_3.method5961(-345277664, 0);
					local59.aClass4_Sub9_Sub1_3.method6011(local9[local22]);
					Static551.method7603(local59);
				}
				break;
			}
		}
		if (!local11) {
			Static160.method3167(Static275.aClass198_20.method4407(Static56.anInt953) + arg1);
		}
	}

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "(I)V")
	public static void method5916() {
		for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
			Static72.aClass138Array1[local3] = null;
		}
		Static428.anInt7368 = 0;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(II[BIIII)Z")
	public static boolean method5917(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg1 % 8;
		@Pc(18) int local18;
		if (local9 == 0) {
			local18 = 0;
		} else {
			local18 = 8 - local9;
		}
		@Pc(31) int local31 = -((arg0 + 7) / 8);
		@Pc(40) int local40 = -((arg1 + 8 - 1) / 8);
		for (@Pc(42) int local42 = local31; local42 < 0; local42++) {
			for (@Pc(46) int local46 = local40; local46 < 0; local46++) {
				if (arg2[arg3] == 0) {
					return true;
				}
				arg3 += 8;
			}
			arg3 -= local18;
			if (arg2[arg3 - 1] == 0) {
				return true;
			}
			arg3 += arg4;
		}
		return false;
	}
}
