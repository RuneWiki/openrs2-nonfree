import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!ka", name = "G", descriptor = "I")
	public static int anInt2808;

	@OriginalMember(owner = "client!ka", name = "x", descriptor = "I")
	public static int anInt2803 = 0;

	@OriginalMember(owner = "client!ka", name = "A", descriptor = "[Z")
	public static boolean[] aBooleanArray10 = new boolean[8];

	@OriginalMember(owner = "client!ka", name = "B", descriptor = "[I")
	public static int[] anIntArray235 = new int[14];

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZ)V")
	public static void method2415(@OriginalArg(1) boolean arg0) {
		@Pc(13) byte local13;
		@Pc(11) byte[][] local11;
		if (Static156.aBoolean211 && arg0) {
			local11 = Static115.aByteArrayArray5;
			local13 = 1;
		} else {
			local13 = 4;
			local11 = Static54.aByteArrayArray2;
		}
		@Pc(21) int[] local21 = null;
		for (@Pc(23) int local23 = 0; local23 < local13; local23++) {
			Static115.method2067();
			for (@Pc(32) int local32 = 0; local32 < 13; local32++) {
				for (@Pc(37) int local37 = 0; local37 < 13; local37++) {
					@Pc(44) boolean local44 = false;
					@Pc(52) int local52 = Static4.anIntArrayArrayArray1[local23][local32][local37];
					if (local52 != -1) {
						@Pc(63) int local63 = local52 >> 24 & 0x3;
						if (!arg0 || local63 == 0) {
							@Pc(74) int local74 = local52 >> 1 & 0x3;
							@Pc(80) int local80 = local52 >> 14 & 0x3FF;
							@Pc(86) int local86 = local52 >> 3 & 0x7FF;
							@Pc(96) int local96 = local86 / 8 + (local80 / 8 << 8);
							for (@Pc(98) int local98 = 0; local98 < Static224.anIntArray348.length; local98++) {
								if (Static224.anIntArray348[local98] == local96 && local11[local98] != null) {
									local44 = true;
									@Pc(142) int[] local142 = Static170.method2896(local11[local98], local23, local63, local74, local86, Static240.aClass118Array1, local37 * 8, arg0, local32 * 8, local80);
									if (local21 == null && local142 != null) {
										local21 = local142;
									}
									break;
								}
							}
						}
					}
					if (!local44) {
						Static251.method3962(local23, 8, local32 * 8, local37 * 8, 8);
					}
				}
			}
		}
		if (local21 == null) {
			Static269.anInt2494 = -1;
			return;
		}
		Static175.anInt3404 = local21[1];
		Static309.anInt5628 = local21[3];
		Static134.anInt5655 = local21[4];
		Static45.anInt932 = local21[2];
		Static269.anInt2494 = local21[0];
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!nk;)V")
	public static void method2418(@OriginalArg(1) Class121 arg0) {
		Static255.aClass121_113 = arg0;
	}
}
