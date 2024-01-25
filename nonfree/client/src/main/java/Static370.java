import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!vk", name = "h", descriptor = "Lclient!b;")
	public static Class20 aClass20_96;

	@OriginalMember(owner = "client!vk", name = "i", descriptor = "I")
	public static int anInt6182;

	@OriginalMember(owner = "client!vk", name = "f", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_96 = new Class57("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILclient!ir;[[B)V")
	public static void method5529(@OriginalArg(1) Class117_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg1.length;
		@Pc(36) int local36;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(23) byte[] local23 = arg1[local17];
			if (local23 != null) {
				@Pc(30) Class3_Sub5 local30 = new Class3_Sub5(local23);
				local36 = Static136.anIntArray273[local17] >> 8;
				@Pc(42) int local42 = Static136.anIntArray273[local17] & 0xFF;
				@Pc(49) int local49 = local36 * 64 - Static21.anInt265;
				@Pc(56) int local56 = local42 * 64 - Static103.anInt2044;
				Static381.method5665();
				arg0.method2432(Static160.aClass67Array3, Static103.anInt2044, Static21.anInt265, local49, local30, local56);
				arg0.method2444(Static347.aClass155_9, local56, local49, local12, local30);
				if (!arg0.aBoolean215 && local36 == Static1.anInt10 / 8 && local42 == Static336.anInt2336 / 8) {
					if (local12[0] == -1) {
						Static29.aClass101_3 = null;
					} else {
						Static29.aClass101_3 = Static66.aClass182_1.method4248(local12[2], local12[1], local12[0], Static253.aClass218_1, local12[3]);
						Static251.anInt4519 = local12[4];
					}
				}
			}
		}
		for (@Pc(132) int local132 = 0; local132 < local15; local132++) {
			@Pc(145) int local145 = (Static136.anIntArray273[local132] >> 8) * 64 - Static21.anInt265;
			local36 = (Static136.anIntArray273[local132] & 0xFF) * 64 - Static103.anInt2044;
			@Pc(160) byte[] local160 = arg1[local132];
			if (local160 == null && Static336.anInt2336 < 800) {
				Static381.method5665();
				arg0.method2434(local36, local145);
			}
		}
	}
}
