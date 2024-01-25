import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static554 {

	@OriginalMember(owner = "client!su", name = "c", descriptor = "I")
	public static int anInt9288;

	@OriginalMember(owner = "client!su", name = "g", descriptor = "[I")
	public static int[] anIntArray624;

	@OriginalMember(owner = "client!su", name = "f", descriptor = "I")
	public static int anInt9291 = 0;

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(III)Z")
	public static boolean method7830(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0xC580) != 0;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(II)V")
	public static void method7831(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = Static90.anInt1698 - Static520.anInt9404;
		if (local8 >= 100) {
			Static258.anInt4491 = -1;
			Static601.anInt9806 = -1;
			Static407.anInt6820 = 1;
			return;
		}
		@Pc(21) int local21 = (int) Static132.aFloat14;
		if (Static536.anInt8763 >> 8 > local21) {
			local21 = Static536.anInt8763 >> 8;
		}
		if (Static542.aBooleanArray30[4] && Static615.anIntArray665[4] + 128 > local21) {
			local21 = Static615.anIntArray665[4] + 128;
		}
		@Pc(59) int local59 = (int) Static228.aFloat26 + Static424.anInt7319 & 0x3FFF;
		Static508.method8439(Static162.anInt2757, local59, local21, Static674.anInt9799, arg0, Static284.method4118(Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt10006, Static253.anInt4353, Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt10001) - 200, (local21 >> 3) * 3 + 600 << 2);
		@Pc(104) float local104 = 1.0F - (float) ((100 - local8) * (100 - local8) * (100 - local8)) / 1000000.0F;
		Static542.anInt9140 = (int) (local104 * (float) (Static542.anInt9140 - Static589.anInt9655) + (float) Static589.anInt9655);
		Static170.anInt2855 = (int) ((float) (Static170.anInt2855 - Static514.anInt8545) * local104 + (float) Static514.anInt8545);
		Static598.anInt9788 = (int) ((float) Static254.anInt4367 + (float) (Static598.anInt9788 - Static254.anInt4367) * local104);
		Static23.anInt564 = (int) ((float) (Static23.anInt564 - Static291.anInt4913) * local104 + (float) Static291.anInt4913);
		@Pc(155) int local155 = Static672.anInt10375 - Static267.anInt4660;
		if (local155 > 8192) {
			local155 -= 16384;
		} else if (local155 < -8192) {
			local155 += 16384;
		}
		Static672.anInt10375 = (int) (local104 * (float) local155 + (float) Static267.anInt4660);
		Static672.anInt10375 &= 0x3FFF;
	}
}
