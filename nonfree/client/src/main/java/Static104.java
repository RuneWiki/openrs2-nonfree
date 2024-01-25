import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!dw", name = "i", descriptor = "I")
	public static int anInt1828;

	@OriginalMember(owner = "client!dw", name = "v", descriptor = "I")
	public static int anInt1836;

	@OriginalMember(owner = "client!dw", name = "r", descriptor = "[I")
	public static final int[] anIntArray161 = new int[2];

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)V")
	public static void method1542() {
		Static309.method4430(Static417.aClass162_17, (long) Static532.anInt8757);
		if (Static122.anInt2094 != -1) {
			Static366.method5156(Static122.anInt2094);
		}
		for (@Pc(17) int local17 = 0; local17 < Static292.anInt4935; local17++) {
			if (Static255.aBooleanArray17[local17]) {
				Static217.aBooleanArray11[local17] = true;
			}
			Static232.aBooleanArray16[local17] = Static255.aBooleanArray17[local17];
			Static255.aBooleanArray17[local17] = false;
		}
		Static79.anInt7837 = Static532.anInt8757;
		if (Static122.anInt2094 != -1) {
			Static292.anInt4935 = 0;
			Static418.method5619();
		}
		Static417.aClass162_17.JA();
		Static435.method5712(Static417.aClass162_17);
		@Pc(65) int local65 = Static123.method1660();
		if (local65 == -1) {
			local65 = Static409.anInt6677;
		}
		if (local65 == -1) {
			local65 = Static36.anInt668;
		}
		Static584.method7572(local65);
		Static534.anInt8792 = 0;
	}
}
