import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!rf", name = "T", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_1293 = Static151.method2243("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!rf", name = "V", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1294 = aClass62_1293;

	@OriginalMember(owner = "client!rf", name = "W", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_1295 = Static151.method2243("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!rf", name = "X", descriptor = "I")
	public static int anInt3663 = 0;

	@OriginalMember(owner = "client!rf", name = "pb", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1296 = aClass62_1295;

	@OriginalMember(owner = "client!rf", name = "qb", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1297 = aClass62_1293;

	@OriginalMember(owner = "client!rf", name = "tb", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray7 = new int[4][105][105];

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(I[B)V")
	public static void method2524(@OriginalArg(1) byte[] arg0) {
		@Pc(7) int local7 = 0;
		while (true) {
			while (arg0.length > local7) {
				@Pc(21) int local21 = (arg0[local7++] & 0xFF) * 64 - Static24.anInt573;
				@Pc(33) int local33 = (arg0[local7++] & 0xFF) * 64 - Static128.anInt142;
				@Pc(83) byte local83;
				@Pc(61) int local61;
				if (local21 > 0 && local33 > 0 && local21 + 64 < Static173.anInt3686 && local33 + 64 < Static104.anInt2340) {
					local61 = local21 >> 6;
					@Pc(70) int local70 = Static104.anInt2340 - local33 - 1 >> 6;
					for (@Pc(72) int local72 = 0; local72 < 64; local72++) {
						for (@Pc(76) int local76 = -64; local76 < 0; local76++) {
							local83 = arg0[local7++];
							if (local83 != 0) {
								if (Static139.aByteArrayArrayArray12[local61][local70] == null) {
									Static139.aByteArrayArrayArray12[local61][local70] = new byte[4096];
								}
								Static139.aByteArrayArrayArray12[local61][local70][local72 + (-(local76 + 1) << 6)] = local83;
								@Pc(118) byte local118 = arg0[local7++];
								if (Static20.aByteArrayArrayArray3[local61][local70] == null) {
									Static20.aByteArrayArrayArray3[local61][local70] = new byte[4096];
								}
								Static20.aByteArrayArrayArray3[local61][local70][local72 + (-(local76 + 1) << 6)] = local118;
							}
						}
					}
				} else {
					for (local61 = -4096; local61 < 0; local61++) {
						local83 = arg0[local7++];
						if (local83 != 0) {
							local7++;
						}
					}
				}
			}
			return;
		}
	}
}
