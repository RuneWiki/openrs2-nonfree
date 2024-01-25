import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
	public static int anInt5976;

	@OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
	public static int anInt5978;

	@OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
	public static int anInt5975 = 0;

	@OriginalMember(owner = "client!qc", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString56 = "";

	@OriginalMember(owner = "client!qc", name = "t", descriptor = "[I")
	public static final int[] anIntArray559 = new int[8];

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I[[BLclient!dv;)V")
	public static void method4589(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class29_Sub1 arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg1.anInt2050; local1++) {
			Static326.method4622();
			for (@Pc(6) int local6 = 0; local6 < Static209.anInt4283 >> 3; local6++) {
				for (@Pc(9) int local9 = 0; local9 < Static211.anInt4295 >> 3; local9++) {
					@Pc(18) int local18 = Static334.anIntArrayArrayArray14[local1][local6][local9];
					if (local18 != -1) {
						@Pc(28) int local28 = local18 >> 24 & 0x3;
						if (!arg1.aBoolean128 || local28 == 0) {
							@Pc(42) int local42 = local18 >> 1 & 0x3;
							@Pc(48) int local48 = local18 >> 14 & 0x3FF;
							@Pc(54) int local54 = local18 >> 3 & 0x7FF;
							@Pc(64) int local64 = (local48 / 8 << 8) + local54 / 8;
							for (@Pc(66) int local66 = 0; local66 < Static168.anIntArray147.length; local66++) {
								if (local64 == Static168.anIntArray147[local66] && arg0[local66] != null) {
									arg1.method1552((local48 & 0x7) * 8, local28, local1, Static19.aClass120Array1, Static30.aClass106_3, local6 * 8, local9 * 8, local42, (local54 & 0x7) * 8, arg0[local66]);
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
