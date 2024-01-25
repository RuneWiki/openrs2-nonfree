import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static579 {

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(Lclient!jm;[[BI)V")
	public static void method8071(@OriginalArg(0) Class199_Sub1 arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int arg2) {
		@Pc(13) int local13;
		@Pc(17) int local17;
		@Pc(27) int local27;
		@Pc(36) int local36;
		for (@Pc(7) int local7 = 0; local7 < arg0.anInt4694; local7++) {
			Static165.method2505();
			for (local13 = 0; local13 < Static426.anInt6942 >> 3; local13++) {
				for (local17 = 0; local17 < Static280.anInt6752 >> 3; local17++) {
					local27 = Static675.anIntArrayArrayArray26[local7][local13][local17];
					if (local27 != -1) {
						local36 = local27 >> 24 & 0x3;
						if (!arg0.aBoolean406 || local36 == 0) {
							@Pc(49) int local49 = local27 >> 1 & 0x3;
							@Pc(55) int local55 = local27 >> 14 & 0x3FF;
							@Pc(61) int local61 = local27 >> 3 & 0x7FF;
							@Pc(72) int local72 = (local55 / 8 << 8) + (local61 / 8);
							for (@Pc(74) int local74 = 0; local74 < Static148.anIntArray187.length; local74++) {
								if (Static148.anIntArray187[local74] == local72 && arg1[local74] != null) {
									@Pc(96) Class2_Sub20 local96 = new Class2_Sub20(arg1[local74]);
									arg0.method4267(local36, local55, local49, local13 * 8, Static626.aClass226Array1, local61, local7, local17 * 8, local96);
									arg0.method4278(local55, local13 * 8, local49, local17 * 8, local61, local7, local96, Static396.aClass145_6, local36);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (local13 = 0; local13 < arg0.anInt4694; local13++) {
			Static165.method2505();
			for (local17 = 0; local17 < Static426.anInt6942 >> 3; local17++) {
				for (local27 = 0; local27 < Static280.anInt6752 >> 3; local27++) {
					local36 = Static675.anIntArrayArrayArray26[local13][local17][local27];
					if (local36 == -1) {
						arg0.method4273(8, 8, local17 * 8, local27 * 8, local13);
					}
				}
			}
		}
		if (arg2 != -1221) {
			method8071((Class199_Sub1) null, (byte[][]) null, -29);
		}
	}
}
