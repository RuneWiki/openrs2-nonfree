import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "([[BLclient!ms;I)V")
	public static void method2625(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class210_Sub1 arg1) {
		for (@Pc(14) int local14 = 0; local14 < arg1.anInt6938; local14++) {
			Static245.method4396();
			for (@Pc(22) int local22 = 0; local22 < Static306.anInt6176 >> 3; local22++) {
				for (@Pc(26) int local26 = 0; local26 < Static108.anInt2930 >> 3; local26++) {
					@Pc(36) int local36 = Static316.anIntArrayArrayArray2[local14][local22][local26];
					if (local36 != -1) {
						@Pc(46) int local46 = local36 >> 24 & 0x3;
						if (!arg1.aBoolean553 || local46 == 0) {
							@Pc(57) int local57 = local36 >> 1 & 0x3;
							@Pc(63) int local63 = local36 >> 14 & 0x3FF;
							@Pc(69) int local69 = local36 >> 3 & 0x7FF;
							@Pc(80) int local80 = (local63 / 8 << 8) + (local69 / 8);
							for (@Pc(82) int local82 = 0; local82 < Static228.anIntArray215.length; local82++) {
								if (local80 == Static228.anIntArray215[local82] && arg0[local82] != null) {
									arg1.method5808(Static313.aClass258Array1, local14, local46, arg0[local82], local26 * 8, local22 * 8, (local63 & 0x7) * 8, (local69 & 0x7) * 8, local57, Static467.aClass5_13);
									break;
								}
							}
						}
					}
				}
			}
		}
	}
}
