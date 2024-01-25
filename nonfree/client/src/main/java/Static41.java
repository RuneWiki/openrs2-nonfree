import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "[I")
	public static final int[] anIntArray36 = new int[50];

	@OriginalMember(owner = "client!bu", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray4 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(IBIII)V")
	public static void method658(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) Class5_Sub2_Sub9 local16 = Static72.method1073(10, arg3);
		local16.method3026();
		local16.anInt3818 = arg1;
		local16.anInt3826 = arg2;
		local16.anInt3821 = arg0;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(IB)V")
	public static void method659(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = Static85.anInt1536 - Static287.anInt4470;
		if (local8 >= 100) {
			Static449.anInt7379 = 1;
			return;
		}
		@Pc(19) int local19 = (int) Static10.aFloat7;
		if (Static304.anInt4780 >> 8 > local19) {
			local19 = Static304.anInt4780 >> 8;
		}
		if (Static222.aBooleanArray12[4] && local19 < Static193.anIntArray184[4] + 128) {
			local19 = Static193.anIntArray184[4] + 128;
		}
		@Pc(56) int local56 = Static185.anInt3145 + (int) Static99.aFloat33 & 0x3FFF;
		Static306.method1857(local19, Static192.method2572(Static220.aClass2_Sub1_Sub3_Sub2_1.anInt7502, Static220.aClass2_Sub1_Sub3_Sub2_1.anInt7500, Static6.anInt131) - 50, Static300.anInt4681, Static45.anInt41, arg0, (local19 >> 3) * 3 + 600 << 0, local56);
		@Pc(105) float local105 = 1.0F - (float) ((100 - local8) * (100 - local8) * (100 - local8)) / 1000000.0F;
		Static393.anInt4184 = (int) ((float) (Static393.anInt4184 - Static240.anInt6962) * local105 + (float) Static240.anInt6962);
		Static248.anInt3998 = (int) (local105 * (float) (Static248.anInt3998 - Static457.anInt7466) + (float) Static457.anInt7466);
		Static444.anInt7360 = (int) (local105 * (float) (Static444.anInt7360 - Static310.anInt4822) + (float) Static310.anInt4822);
		Static116.anInt1977 = (int) ((float) Static273.anInt4300 + (float) (Static116.anInt1977 - Static273.anInt4300) * local105);
		@Pc(158) int local158 = Static442.anInt7328 - Static165.anInt2859;
		if (local158 > 8192) {
			local158 -= 16384;
		} else if (local158 < -8192) {
			local158 += 16384;
		}
		Static442.anInt7328 = (int) ((float) local158 * local105 + (float) Static165.anInt2859);
		Static442.anInt7328 &= 0x3FFF;
	}
}
