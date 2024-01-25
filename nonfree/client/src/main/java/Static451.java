import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_13 = new Class363(35, 3);

	@OriginalMember(owner = "client!rba", name = "d", descriptor = "Z")
	public static boolean aBoolean23 = false;

	@OriginalMember(owner = "client!rba", name = "i", descriptor = "I")
	public static int anInt484 = 0;

	@OriginalMember(owner = "client!rba", name = "l", descriptor = "I")
	public static int anInt487 = 0;

	@OriginalMember(owner = "client!rba", name = "m", descriptor = "I")
	public static int anInt488 = 0;

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(Lclient!lo;)V")
	public static void method310(@OriginalArg(0) Class6_Sub1 arg0) {
		if (arg0 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < 2; local4++) {
			@Pc(37) int local37;
			for (@Pc(7) int local7 = 0; local7 < Static26.anIntArray39[local4]; local7++) {
				if (Static3.aClass6_Sub1ArrayArray1[local4][local7] == arg0) {
					Static598.method1131(Static3.aClass6_Sub1ArrayArray1[local4], local7 + 1, Static3.aClass6_Sub1ArrayArray1[local4], local7, Static26.anIntArray39[local4] - local7 - 1);
					local37 = Static26.anIntArray39[local4]--;
					return;
				}
			}
			for (@Pc(49) int local49 = 0; local49 < Static142.anIntArray179[local4]; local49++) {
				if (Static312.aClass6_Sub1ArrayArray3[local4][local49] == arg0) {
					Static598.method1131(Static312.aClass6_Sub1ArrayArray3[local4], local49 + 1, Static312.aClass6_Sub1ArrayArray3[local4], local49, Static142.anIntArray179[local4] - local49 - 1);
					local37 = Static142.anIntArray179[local4]--;
					return;
				}
			}
			for (@Pc(91) int local91 = 0; local91 < Static53.anIntArray64[local4]; local91++) {
				if (Static54.aClass6_Sub1ArrayArray2[local4][local91] == arg0) {
					Static598.method1131(Static54.aClass6_Sub1ArrayArray2[local4], local91 + 1, Static54.aClass6_Sub1ArrayArray2[local4], local91, Static53.anIntArray64[local4] - local91 - 1);
					local37 = Static53.anIntArray64[local4]--;
					return;
				}
			}
		}
	}
}
