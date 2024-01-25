import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static478 {

	@OriginalMember(owner = "client!sba", name = "c", descriptor = "I")
	public static int anInt8315;

	@OriginalMember(owner = "client!sba", name = "r", descriptor = "Lclient!dd;")
	public static Class47 aClass47_4;

	@OriginalMember(owner = "client!sba", name = "u", descriptor = "I")
	public static int anInt8327;

	@OriginalMember(owner = "client!sba", name = "d", descriptor = "Lclient!ui;")
	public static final Class329 aClass329_54 = new Class329(7, 0, 1, 1);

	@OriginalMember(owner = "client!sba", name = "m", descriptor = "I")
	public static int anInt8321 = 0;

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(Lclient!pn;)V")
	public static void method6527(@OriginalArg(0) Class25_Sub2 arg0) {
		if (arg0 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < 2; local4++) {
			@Pc(37) int local37;
			for (@Pc(7) int local7 = 0; local7 < Static199.anIntArray186[local4]; local7++) {
				if (Static530.aClass25_Sub2ArrayArray5[local4][local7] == arg0) {
					Static604.method6223(Static530.aClass25_Sub2ArrayArray5[local4], local7 + 1, Static530.aClass25_Sub2ArrayArray5[local4], local7, Static199.anIntArray186[local4] - local7 - 1);
					local37 = Static199.anIntArray186[local4]--;
					return;
				}
			}
			for (@Pc(49) int local49 = 0; local49 < Static154.anIntArray135[local4]; local49++) {
				if (Static468.aClass25_Sub2ArrayArray4[local4][local49] == arg0) {
					Static604.method6223(Static468.aClass25_Sub2ArrayArray4[local4], local49 + 1, Static468.aClass25_Sub2ArrayArray4[local4], local49, Static154.anIntArray135[local4] - local49 - 1);
					local37 = Static154.anIntArray135[local4]--;
					return;
				}
			}
			for (@Pc(91) int local91 = 0; local91 < Static473.anIntArray482[local4]; local91++) {
				if (Static69.aClass25_Sub2ArrayArray3[local4][local91] == arg0) {
					Static604.method6223(Static69.aClass25_Sub2ArrayArray3[local4], local91 + 1, Static69.aClass25_Sub2ArrayArray3[local4], local91, Static473.anIntArray482[local4] - local91 - 1);
					local37 = Static473.anIntArray482[local4]--;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(II)V")
	public static void method6533(@OriginalArg(1) int arg0) {
		for (@Pc(14) Class3 local14 = Static573.aClass297_38.method6529(); local14 != null; local14 = Static573.aClass297_38.method6532()) {
			if ((local14.aLong262 >> 48 & 0xFFFFL) == (long) arg0) {
				local14.method8128();
			}
		}
	}
}
