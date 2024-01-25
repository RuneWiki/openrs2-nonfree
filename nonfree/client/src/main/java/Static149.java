import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!gb", name = "V", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_374 = new Class305(3, 5);

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILclient!vk;[[B)V")
	public static void method6357(@OriginalArg(1) Class102_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt9074; local12++) {
			Static422.method6584();
			for (@Pc(18) int local18 = 0; local18 < Static237.anInt4563 >> 3; local18++) {
				for (@Pc(22) int local22 = 0; local22 < Static373.anInt6694 >> 3; local22++) {
					@Pc(32) int local32 = Static329.anIntArrayArrayArray18[local12][local18][local22];
					if (local32 != -1) {
						@Pc(41) int local41 = local32 >> 24 & 0x3;
						if (!arg0.aBoolean681 || local41 == 0) {
							@Pc(52) int local52 = local32 >> 1 & 0x3;
							@Pc(58) int local58 = local32 >> 14 & 0x3FF;
							@Pc(64) int local64 = local32 >> 3 & 0x7FF;
							@Pc(74) int local74 = local64 / 8 + (local58 / 8 << 8);
							for (@Pc(76) int local76 = 0; local76 < Static378.anIntArray656.length; local76++) {
								if (local74 == Static378.anIntArray656[local76] && arg1[local76] != null) {
									arg0.method7857(local41, local52, (local64 & 0x7) * 8, local22 * 8, Static455.aClass4_11, (local58 & 0x7) * 8, arg1[local76], local18 * 8, Static362.aClass243Array5, local12);
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
