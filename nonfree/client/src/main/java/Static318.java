import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!me", name = "n", descriptor = "[I")
	public static final int[] anIntArray349 = new int[2];

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method4988(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(7) int local7 = Static57.anInt1513;
		@Pc(9) int[] local9 = Static447.anIntArray571;
		@Pc(11) boolean local11 = false;
		for (@Pc(13) int local13 = 0; local13 < local7; local13++) {
			@Pc(21) Class21_Sub1_Sub1_Sub1_Sub2 local21 = Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1[local9[local13]];
			if (local21 != null && local21 != Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2 && local21.aString87 != null && local21.aString87.equalsIgnoreCase(arg1)) {
				local11 = true;
				@Pc(51) Class4_Sub39 local51;
				if (arg0 == 1) {
					local51 = Static32.method999(Static402.aClass356_1, Static55.aClass344_12);
					local51.aClass4_Sub13_Sub2_1.method6999(local9[local13]);
					local51.aClass4_Sub13_Sub2_1.method6996(0);
					Static50.method1166(local51);
				} else if (arg0 == 4) {
					local51 = Static32.method999(Static402.aClass356_1, Static46.aClass344_10);
					local51.aClass4_Sub13_Sub2_1.method7044(local9[local13]);
					local51.aClass4_Sub13_Sub2_1.method6996(0);
					Static50.method1166(local51);
				} else if (arg0 == 5) {
					local51 = Static32.method999(Static402.aClass356_1, Static442.aClass344_81);
					local51.aClass4_Sub13_Sub2_1.method7044(local9[local13]);
					local51.aClass4_Sub13_Sub2_1.method7051(0);
					Static50.method1166(local51);
				} else if (arg0 == 6) {
					local51 = Static32.method999(Static402.aClass356_1, Static311.aClass344_50);
					local51.aClass4_Sub13_Sub2_1.method6996(0);
					local51.aClass4_Sub13_Sub2_1.method7044(local9[local13]);
					Static50.method1166(local51);
				} else if (arg0 == 7) {
					local51 = Static32.method999(Static402.aClass356_1, Static278.aClass344_46);
					local51.aClass4_Sub13_Sub2_1.method7044(local9[local13]);
					local51.aClass4_Sub13_Sub2_1.method7052(0);
					Static50.method1166(local51);
				}
				break;
			}
		}
		if (!local11) {
			Static412.method6231(Static223.aClass152_25.method3624(Static142.anInt3088) + arg1);
		}
	}
}
