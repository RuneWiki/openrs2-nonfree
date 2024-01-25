import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!fl", name = "m", descriptor = "Lclient!b;")
	public static Class20 aClass20_28;

	@OriginalMember(owner = "client!fl", name = "n", descriptor = "I")
	public static int anInt2066;

	@OriginalMember(owner = "client!fl", name = "p", descriptor = "F")
	public static float aFloat14;

	@OriginalMember(owner = "client!fl", name = "q", descriptor = "I")
	public static int anInt2067;

	@OriginalMember(owner = "client!fl", name = "l", descriptor = "Lclient!us;")
	public static final Class234 aClass234_45 = new Class234(5, -2);

	@OriginalMember(owner = "client!fl", name = "r", descriptor = "Z")
	public static boolean aBoolean156 = true;

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z[[BLclient!ir;)V")
	public static void method1721(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class117_Sub1 arg1) {
		for (@Pc(8) int local8 = 0; local8 < arg1.anInt2835; local8++) {
			Static381.method5665();
			for (@Pc(14) int local14 = 0; local14 < Static12.anInt161 >> 3; local14++) {
				for (@Pc(18) int local18 = 0; local18 < Static44.anInt787 >> 3; local18++) {
					@Pc(28) int local28 = Static81.anIntArrayArrayArray9[local8][local14][local18];
					if (local28 != -1) {
						@Pc(38) int local38 = local28 >> 24 & 0x3;
						if (!arg1.aBoolean215 || local38 == 0) {
							@Pc(52) int local52 = local28 >> 1 & 0x3;
							@Pc(58) int local58 = local28 >> 14 & 0x3FF;
							@Pc(64) int local64 = local28 >> 3 & 0x7FF;
							@Pc(75) int local75 = (local58 / 8 << 8) + (local64 / 8);
							for (@Pc(77) int local77 = 0; local77 < Static136.anIntArray273.length; local77++) {
								if (Static136.anIntArray273[local77] == local75 && arg0[local77] != null) {
									arg1.method2443(local52, Static160.aClass67Array3, (local58 & 0x7) * 8, local8, local38, (local64 & 0x7) * 8, Static347.aClass155_9, local18 * 8, local14 * 8, arg0[local77]);
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
