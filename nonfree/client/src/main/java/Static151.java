import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!faa", name = "l", descriptor = "[S")
	public static final short[] aShortArray43 = new short[] { 47, 8, 4, 52, 11, 13, 12, 21 };

	@OriginalMember(owner = "client!faa", name = "p", descriptor = "[Lclient!pq;")
	public static final Class14_Sub44[] aClass14_Sub44Array1 = new Class14_Sub44[1024];

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "([[BLclient!rr;I)V")
	public static void method2384(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class49_Sub1 arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg1.anInt9077; local12++) {
			Static299.method4404();
			for (@Pc(18) int local18 = 0; local18 < Static26.anInt462 >> 3; local18++) {
				for (@Pc(22) int local22 = 0; local22 < Static445.anInt6140 >> 3; local22++) {
					@Pc(32) int local32 = Static333.anIntArrayArrayArray4[local12][local18][local22];
					if (local32 != -1) {
						@Pc(42) int local42 = local32 >> 24 & 0x3;
						if (!arg1.aBoolean636 || local42 == 0) {
							@Pc(56) int local56 = local32 >> 1 & 0x3;
							@Pc(62) int local62 = local32 >> 14 & 0x3FF;
							@Pc(68) int local68 = local32 >> 3 & 0x7FF;
							@Pc(78) int local78 = local68 / 8 + (local62 / 8 << 8);
							for (@Pc(80) int local80 = 0; local80 < Static332.anIntArray455.length; local80++) {
								if (Static332.anIntArray455[local80] == local78 && arg0[local80] != null) {
									arg1.method7523(arg0[local80], local56, (local62 & 0x7) * 8, Static677.aClass137_47, local42, local12, local22 * 8, (local68 & 0x7) * 8, Static226.aClass226Array3, local18 * 8);
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
