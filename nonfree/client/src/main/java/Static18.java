import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!as", name = "s", descriptor = "I")
	public static int anInt314;

	@OriginalMember(owner = "client!as", name = "o", descriptor = "Lclient!ss;")
	public static final Class213 aClass213_3 = new Class213(10, 7);

	@OriginalMember(owner = "client!as", name = "r", descriptor = "[I")
	public static final int[] anIntArray28 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!as", name = "u", descriptor = "Lclient!ud;")
	public static final Class225 aClass225_1 = new Class225("LIVE", 0);

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(II)V")
	public static void method211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class188 local7 = Static45.aClass188ArrayArrayArray5[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class188 local28 = Static45.aClass188ArrayArrayArray5[local9][arg0][arg1] = Static45.aClass188ArrayArrayArray5[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte44--;
				for (@Pc(40) Class168 local40 = local28.aClass168_2; local40 != null; local40 = local40.aClass168_1) {
					@Pc(44) Class1_Sub2 local44 = local40.aClass1_Sub2_1;
					if (local44.aShort95 == arg0 && local44.aShort96 == arg1) {
						local44.aByte73--;
					}
				}
			}
		}
		if (Static45.aClass188ArrayArrayArray5[0][arg0][arg1] == null) {
			Static45.aClass188ArrayArrayArray5[0][arg0][arg1] = new Class188(0, arg0, arg1);
			Static45.aClass188ArrayArrayArray5[0][arg0][arg1].aByte43 = 1;
		}
		Static45.aClass188ArrayArrayArray5[0][arg0][arg1].aClass188_1 = local7;
		Static45.aClass188ArrayArrayArray5[3][arg0][arg1] = null;
	}
}
