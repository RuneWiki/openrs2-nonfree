import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static420 {

	@OriginalMember(owner = "client!paa", name = "P", descriptor = "[I")
	public static int[] anIntArray408;

	@OriginalMember(owner = "client!paa", name = "Q", descriptor = "[[I")
	public static final int[][] anIntArrayArray37 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!paa", name = "S", descriptor = "I")
	public static int anInt7795 = 0;

	@OriginalMember(owner = "client!paa", name = "T", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray5 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!paa", name = "d", descriptor = "(I)I")
	public static int method6590() {
		@Pc(7) Class5 local7 = Static467.aClass5_13;
		@Pc(9) boolean local9 = false;
		if (Static87.aClass6_Sub33_6.aClass14_Sub8_1.method2640() != 0) {
			@Pc(21) Canvas local21 = new Canvas();
			local21.setSize(100, 100);
			local9 = true;
			local7 = Static635.method8714(0, local21, (Interface7) null, 0, (Class223) null);
		}
		@Pc(38) long local38 = Static582.method8056();
		for (@Pc(40) int local40 = 0; local40 < 10000; local40++) {
			local7.method6114();
		}
		@Pc(67) int local67 = (int) (Static582.method8056() - local38);
		local7.method6123(100, 100, 0, -16777216, 0);
		if (local9) {
			local7.method6106();
		}
		return local67;
	}
}
