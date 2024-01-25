import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!bga", name = "e", descriptor = "[[Lclient!ir;")
	public static Class182[][] aClass182ArrayArray1;

	@OriginalMember(owner = "client!bga", name = "b", descriptor = "Z")
	public static boolean aBoolean106 = false;

	@OriginalMember(owner = "client!bga", name = "d", descriptor = "Z")
	public static boolean aBoolean107 = true;

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(I)V")
	public static void method1231() {
		Static176.anInt3321 = 0;
		@Pc(18) boolean local18 = Static67.aClass3_Sub17_Sub2_4.method4888() == 1;
		@Pc(22) int local22 = Static67.aClass3_Sub17_Sub2_4.method4879();
		@Pc(36) int local36 = Static67.aClass3_Sub17_Sub2_4.method4850();
		@Pc(40) int local40 = Static67.aClass3_Sub17_Sub2_4.method4858();
		Static390.method5662();
		Static139.method2419(local36);
		@Pc(52) int local52 = (Static548.anInt8905 - Static67.aClass3_Sub17_Sub2_4.lb) / 16;
		Static192.anIntArrayArray39 = new int[local52][4];
		@Pc(62) int local62;
		for (@Pc(58) int local58 = 0; local58 < local52; local58++) {
			for (local62 = 0; local62 < 4; local62++) {
				Static192.anIntArrayArray39[local58][local62] = Static67.aClass3_Sub17_Sub2_4.method4868();
			}
		}
		Static489.anIntArray535 = new int[local52];
		Static284.anIntArray343 = null;
		Static618.aByteArrayArray24 = new byte[local52][];
		Static316.aByteArrayArray16 = null;
		Static169.aByteArrayArray6 = new byte[local52][];
		Static143.aByteArrayArray4 = new byte[local52][];
		Static287.aByteArrayArray11 = new byte[local52][];
		Static384.anIntArray27 = new int[local52];
		Static63.anIntArray539 = new int[local52];
		Static663.anIntArray662 = new int[local52];
		Static442.anIntArray464 = new int[local52];
		local52 = 0;
		for (local62 = (local22 - (Static251.anInt4680 >> 4)) / 8; local62 <= ((Static251.anInt4680 >> 4) + local22) / 8; local62++) {
			for (@Pc(133) int local133 = (local40 - (Static406.anInt6924 >> 4)) / 8; local133 <= ((Static406.anInt6924 >> 4) + local40) / 8; local133++) {
				Static442.anIntArray464[local52] = (local62 << 8) + local133;
				Static384.anIntArray27[local52] = Static673.aClass143_110.method3131("m" + local62 + "_" + local133);
				Static63.anIntArray539[local52] = Static673.aClass143_110.method3131("l" + local62 + "_" + local133);
				Static663.anIntArray662[local52] = Static673.aClass143_110.method3131("um" + local62 + "_" + local133);
				Static489.anIntArray535[local52] = Static673.aClass143_110.method3131("ul" + local62 + "_" + local133);
				local52++;
			}
		}
		Static271.method4330(11, local22, local18, local40);
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(BIIII)I")
	public static int method1233(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = arg3 & 0xF;
		@Pc(19) int local19 = local12 < 8 ? arg2 : arg0;
		@Pc(38) int local38 = local12 >= 4 ? (local12 == 12 || local12 == 14 ? arg2 : arg1) : arg0;
		return ((local12 & 0x2) == 0 ? local38 : -local38) + ((local12 & 0x1) == 0 ? local19 : -local19);
	}
}
