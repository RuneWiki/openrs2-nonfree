import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!fj", name = "e", descriptor = "[[B")
	public static byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
	public static int anInt3389;

	@OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
	public static int anInt3390 = 0;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "([[BLclient!el;I)V")
	public static void method2965(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class104_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg0.length;
		@Pc(36) int local36;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(23) byte[] local23 = arg0[local17];
			if (local23 != null) {
				@Pc(30) Class5_Sub41 local30 = new Class5_Sub41(local23);
				local36 = Static611.anIntArray552[local17] >> 8;
				@Pc(42) int local42 = Static611.anIntArray552[local17] & 0xFF;
				@Pc(49) int local49 = local36 * 64 - Static153.anInt3147;
				@Pc(55) int local55 = local42 * 64 - Static201.anInt3839;
				Static250.method3863();
				arg1.method2585(local49, Static201.anInt3839, local30, local55, Static275.aClass106Array1, Static153.anInt3147);
				arg1.method2594(local55, local12, local49, Static208.aClass65_7, local30);
				if (!arg1.aBoolean248 && local36 == Static427.anInt7491 / 8 && Static436.anInt7546 / 8 == local42 && local12[0] != -1) {
					Static424.aClass20_1 = Static62.aClass393_1.method9019(local12[3], local12[1], local12[2], local12[0], Static230.aClass122_1);
					Static487.anInt8173 = local12[4];
				}
			}
		}
		for (@Pc(128) int local128 = 0; local128 < local15; local128++) {
			@Pc(140) int local140 = (Static611.anIntArray552[local128] >> 8) * 64 - Static153.anInt3147;
			local36 = (Static611.anIntArray552[local128] & 0xFF) * 64 - Static201.anInt3839;
			@Pc(154) byte[] local154 = arg0[local128];
			if (local154 == null && Static436.anInt7546 < 800) {
				Static250.method3863();
				arg1.method2584(local36, local140);
			}
		}
	}
}
