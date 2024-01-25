import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static438 {

	@OriginalMember(owner = "client!qm", name = "p", descriptor = "Lclient!naa;")
	public static Class237 aClass237_2;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "([[BBLclient!eda;)V")
	public static void method6222(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class85_Sub1 arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.anInt2678; local3++) {
			Static464.method6712();
			for (@Pc(17) int local17 = 0; local17 < Static38.anInt740 >> 3; local17++) {
				for (@Pc(21) int local21 = 0; local21 < Static38.anInt741 >> 3; local21++) {
					@Pc(31) int local31 = Static536.anIntArrayArrayArray22[local3][local17][local21];
					if (local31 != -1) {
						@Pc(41) int local41 = local31 >> 24 & 0x3;
						if (!arg1.aBoolean215 || local41 == 0) {
							@Pc(55) int local55 = local31 >> 1 & 0x3;
							@Pc(61) int local61 = local31 >> 14 & 0x3FF;
							@Pc(67) int local67 = local31 >> 3 & 0x7FF;
							@Pc(77) int local77 = local67 / 8 + (local61 / 8 << 8);
							for (@Pc(79) int local79 = 0; local79 < Static380.anIntArray543.length; local79++) {
								if (Static380.anIntArray543[local79] == local77 && arg0[local79] != null) {
									arg1.method2391(arg0[local79], local21 * 8, local17 * 8, (local67 & 0x7) * 8, local3, Static15.aClass84Array1, local41, (local61 & 0x7) * 8, local55, Static185.aClass66_14);
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
