import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static675 {

	@OriginalMember(owner = "client!wv", name = "A", descriptor = "I")
	public static int anInt10615;

	@OriginalMember(owner = "client!wv", name = "hb", descriptor = "I")
	public static int anInt10637;

	@OriginalMember(owner = "client!wv", name = "Wb", descriptor = "F")
	public static float aFloat200;

	@OriginalMember(owner = "client!wv", name = "pb", descriptor = "I")
	public static int anInt10641 = 0;

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "([BB)V")
	public static void method8822(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class5_Sub15 local12 = new Class5_Sub15(arg0);
		while (true) {
			while (true) {
				@Pc(16) int local16 = local12.method3642();
				if (local16 == 0) {
					return;
				}
				if (local16 == 1) {
					@Pc(28) int[] local28 = Static287.anIntArray266 = new int[6];
					local28[0] = local12.method3698();
					local28[1] = local12.method3698();
					local28[2] = local12.method3698();
					local28[3] = local12.method3698();
					local28[4] = local12.method3698();
					local28[5] = local12.method3698();
				} else {
					@Pc(79) int local79;
					@Pc(84) int local84;
					if (local16 == 4) {
						local79 = local12.method3642();
						Static273.anIntArray254 = new int[local79];
						for (local84 = 0; local84 < local79; local84++) {
							Static273.anIntArray254[local84] = local12.method3698();
							if (Static273.anIntArray254[local84] == 65535) {
								Static273.anIntArray254[local84] = -1;
							}
						}
					} else if (local16 == 5) {
						local79 = local12.method3642();
						Static179.anIntArray169 = new int[local79];
						for (local84 = 0; local84 < local79; local84++) {
							Static179.anIntArray169[local84] = local12.method3698();
							if (Static179.anIntArray169[local84] == 65535) {
								Static179.anIntArray169[local84] = -1;
							}
						}
					}
				}
			}
		}
	}
}
