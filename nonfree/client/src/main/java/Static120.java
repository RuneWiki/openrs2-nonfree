import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!fq", name = "c", descriptor = "I")
	public static int anInt2052;

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "S")
	public static short aShort19 = 256;

	@OriginalMember(owner = "client!fq", name = "f", descriptor = "[I")
	public static final int[] anIntArray152 = new int[] { 4, 4, 1, 2, 6, 4, 2, 47, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!fq", name = "m", descriptor = "[Z")
	public static final boolean[] aBooleanArray3 = new boolean[100];

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
	public static void method1949() {
		@Pc(15) int local15 = Static434.aClass165_Sub1_1.method3398(Static404.anInt2752);
		if (local15 == 0) {
			Static419.aByteArrayArrayArray17 = null;
			Static462.method3622(0);
		} else if (local15 == 1) {
			Static168.method5040((byte) 0);
			Static462.method3622(512);
			if (Static326.aByteArrayArrayArray15 != null) {
				Static423.method5786();
			}
		} else {
			Static168.method5040((byte) (Static383.anInt6623 - 4 & 0xFF));
			Static462.method3622(2);
		}
		Static124.anInt2076 = Static204.anInt3498;
	}
}
