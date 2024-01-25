import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray1 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "Lclient!in;")
	public static final Class168 aClass168_4 = new Class168();

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "[I")
	public static final int[] anIntArray209 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
	public static int anInt2451 = 0;

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)I")
	public static int method2072() {
		@Pc(15) byte local15;
		if (Static189.anInt3553 < 96) {
			local15 = 1;
			Static126.method2100();
		} else {
			@Pc(23) int local23 = Static482.method7139();
			if (local23 <= 100) {
				Static501.method7348();
				local15 = 4;
			} else if (local23 <= 500) {
				local15 = 3;
				Static424.method6264();
			} else if (local23 <= 1000) {
				Static597.method8448();
				local15 = 2;
			} else {
				local15 = 1;
				Static126.method2100();
			}
		}
		if (Static56.aClass14_Sub22_5.aClass21_Sub21_2.method7541() != 0) {
			Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub21_1, 0);
			Static155.method2506(0, false);
		}
		Static169.method2762();
		return local15;
	}
}
