import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "[S")
	public static short[] aShortArray108;

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
	public static int anInt4580 = 1;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(III)I")
	public static int method4060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg1 >>> 24;
		@Pc(30) int local30 = ((arg1 & 0xFF00FF) * local12 & 0xFF00FF00 | local12 * (arg1 & 0xFF00) & 0xFF0000) >>> 8;
		@Pc(34) int local34 = 255 - local12;
		return (((arg0 & 0xFF00) * local34 & 0xFF0000 | local34 * (arg0 & 0xFF00FF) & 0xFF00FF00) >>> 8) + local30;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!gfa;)V")
	public static void method4061(@OriginalArg(0) Class9_Sub1 arg0) {
		if (arg0 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < 2; local4++) {
			@Pc(37) int local37;
			for (@Pc(7) int local7 = 0; local7 < Static332.anIntArray459[local4]; local7++) {
				if (Static499.aClass9_Sub1ArrayArray3[local4][local7] == arg0) {
					Static604.method5912(Static499.aClass9_Sub1ArrayArray3[local4], local7 + 1, Static499.aClass9_Sub1ArrayArray3[local4], local7, Static332.anIntArray459[local4] - local7 - 1);
					local37 = Static332.anIntArray459[local4]--;
					return;
				}
			}
			for (@Pc(49) int local49 = 0; local49 < Static343.anIntArray471[local4]; local49++) {
				if (Static239.aClass9_Sub1ArrayArray2[local4][local49] == arg0) {
					Static604.method5912(Static239.aClass9_Sub1ArrayArray2[local4], local49 + 1, Static239.aClass9_Sub1ArrayArray2[local4], local49, Static343.anIntArray471[local4] - local49 - 1);
					local37 = Static343.anIntArray471[local4]--;
					return;
				}
			}
			for (@Pc(91) int local91 = 0; local91 < Static1.anIntArray1[local4]; local91++) {
				if (Static225.aClass9_Sub1ArrayArray1[local4][local91] == arg0) {
					Static604.method5912(Static225.aClass9_Sub1ArrayArray1[local4], local91 + 1, Static225.aClass9_Sub1ArrayArray1[local4], local91, Static1.anIntArray1[local4] - local91 - 1);
					local37 = Static1.anIntArray1[local4]--;
					return;
				}
			}
		}
	}
}
