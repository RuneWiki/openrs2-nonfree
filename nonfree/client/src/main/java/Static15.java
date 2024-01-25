import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!ao", name = "u", descriptor = "Lclient!ab;")
	public static Class3_Sub1 aClass3_Sub1_1;

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(IZ)I")
	public static int method329(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(II)Z")
	public static boolean method333(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(BLjava/lang/String;I)V")
	public static void method334(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = Static160.anInt3271;
		@Pc(7) int[] local7 = Static162.anIntArray212;
		@Pc(9) boolean local9 = false;
		for (@Pc(15) int local15 = 0; local15 < local5; local15++) {
			@Pc(22) Class7_Sub2_Sub3_Sub2 local22 = Static361.aClass7_Sub2_Sub3_Sub2Array1[local7[local15]];
			if (local22 != null && Static379.aClass7_Sub2_Sub3_Sub2_2 != local22 && local22.aString36 != null && local22.aString36.equalsIgnoreCase(arg0)) {
				local9 = true;
				if (arg1 == 1) {
					Static30.method641(Static392.aClass217_100);
					Static302.aClass3_Sub7_Sub1_2.method2601(0);
					Static302.aClass3_Sub7_Sub1_2.method2599(local7[local15]);
				} else if (arg1 == 4) {
					Static30.method641(Static290.aClass217_81);
					Static302.aClass3_Sub7_Sub1_2.method2614(local7[local15]);
					Static302.aClass3_Sub7_Sub1_2.method2633(0);
				} else if (arg1 == 5) {
					Static30.method641(Static307.aClass217_86);
					Static302.aClass3_Sub7_Sub1_2.method2628(0);
					Static302.aClass3_Sub7_Sub1_2.method2599(local7[local15]);
				} else if (arg1 == 6) {
					Static30.method641(Static113.aClass217_89);
					Static302.aClass3_Sub7_Sub1_2.method2599(local7[local15]);
					Static302.aClass3_Sub7_Sub1_2.method2601(0);
				} else if (arg1 == 7) {
					Static30.method641(Static301.aClass217_45);
					Static302.aClass3_Sub7_Sub1_2.method2628(0);
					Static302.aClass3_Sub7_Sub1_2.method2599(local7[local15]);
				}
				break;
			}
		}
		if (!local9) {
			Static155.method2520(Static54.aClass189_38.method4262(Static53.anInt1454) + arg0);
		}
	}
}
