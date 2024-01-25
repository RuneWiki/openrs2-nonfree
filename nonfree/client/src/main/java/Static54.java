import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!bv", name = "e", descriptor = "I")
	public static int anInt256;

	@OriginalMember(owner = "client!bv", name = "d", descriptor = "I")
	public static int anInt255 = 0;

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!ig;)V")
	public static void method261(@OriginalArg(0) Class13_Sub1 arg0) {
		if (arg0 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < 2; local4++) {
			@Pc(37) int local37;
			for (@Pc(7) int local7 = 0; local7 < Static369.anIntArray426[local4]; local7++) {
				if (Static597.aClass13_Sub1ArrayArray3[local4][local7] == arg0) {
					Static653.method5395(Static597.aClass13_Sub1ArrayArray3[local4], local7 + 1, Static597.aClass13_Sub1ArrayArray3[local4], local7, Static369.anIntArray426[local4] - local7 - 1);
					local37 = Static369.anIntArray426[local4]--;
					Static116.aBoolean155 = true;
					return;
				}
			}
			for (@Pc(51) int local51 = 0; local51 < Static28.anIntArray63[local4]; local51++) {
				if (Static417.aClass13_Sub1ArrayArray2[local4][local51] == arg0) {
					Static653.method5395(Static417.aClass13_Sub1ArrayArray2[local4], local51 + 1, Static417.aClass13_Sub1ArrayArray2[local4], local51, Static28.anIntArray63[local4] - local51 - 1);
					local37 = Static28.anIntArray63[local4]--;
					return;
				}
			}
			for (@Pc(93) int local93 = 0; local93 < Static497.anIntArray571[local4]; local93++) {
				if (Static139.aClass13_Sub1ArrayArray1[local4][local93] == arg0) {
					Static653.method5395(Static139.aClass13_Sub1ArrayArray1[local4], local93 + 1, Static139.aClass13_Sub1ArrayArray1[local4], local93, Static497.anIntArray571[local4] - local93 - 1);
					local37 = Static497.anIntArray571[local4]--;
					return;
				}
			}
		}
	}
}
