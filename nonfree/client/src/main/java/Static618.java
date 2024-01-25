import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static618 {

	@OriginalMember(owner = "client!wba", name = "n", descriptor = "Lclient!la;")
	public static Class207 aClass207_127;

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(BILjava/lang/String;)V")
	public static void method8801(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = Static320.anInt5442;
		@Pc(9) int[] local9 = Static278.anIntArray264;
		@Pc(11) boolean local11 = false;
		for (@Pc(13) int local13 = 0; local13 < local7; local13++) {
			@Pc(21) Class4_Sub2_Sub1_Sub1_Sub1 local21 = Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12[local9[local13]];
			if (local21 != null && Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2 != local21 && local21.aString17 != null && local21.aString17.equalsIgnoreCase(arg1)) {
				local11 = true;
				@Pc(50) Class5_Sub48 local50;
				if (arg0 == 1) {
					local50 = Static16.method232(Static497.aClass46_91, Static276.aClass251_2);
					local50.aClass5_Sub22_Sub1_2.method5961(local9[local13]);
					local50.aClass5_Sub22_Sub1_2.method5934(0);
					Static277.method4436(local50);
				} else if (arg0 == 4) {
					local50 = Static16.method232(Static396.aClass46_71, Static276.aClass251_2);
					local50.aClass5_Sub22_Sub1_2.method5904(local9[local13]);
					local50.aClass5_Sub22_Sub1_2.method5938(0);
					Static277.method4436(local50);
				} else if (arg0 == 5) {
					local50 = Static16.method232(Static400.aClass46_74, Static276.aClass251_2);
					local50.aClass5_Sub22_Sub1_2.method5961(local9[local13]);
					local50.aClass5_Sub22_Sub1_2.method5934(0);
					Static277.method4436(local50);
				} else if (arg0 == 6) {
					local50 = Static16.method232(Static261.aClass46_58, Static276.aClass251_2);
					local50.aClass5_Sub22_Sub1_2.method5904(local9[local13]);
					local50.aClass5_Sub22_Sub1_2.method5905(0);
					Static277.method4436(local50);
				} else if (arg0 == 7) {
					local50 = Static16.method232(Static513.aClass46_13, Static276.aClass251_2);
					local50.aClass5_Sub22_Sub1_2.method5918(local9[local13]);
					local50.aClass5_Sub22_Sub1_2.method5905(0);
					Static277.method4436(local50);
				}
				break;
			}
		}
		if (!local11) {
			Static141.method2041(Static174.aClass120_21.method2690(Static266.anInt4796) + arg1);
		}
	}
}
