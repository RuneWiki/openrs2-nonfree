import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static667 {

	@OriginalMember(owner = "client!wo", name = "z", descriptor = "I")
	public static int anInt10615;

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "[S")
	private static final short[] aShortArray162 = new short[] { -10304, 9104, 25485, 4620, 4540 };

	@OriginalMember(owner = "client!wo", name = "h", descriptor = "Z")
	public static final boolean aBoolean773 = false;

	@OriginalMember(owner = "client!wo", name = "i", descriptor = "[S")
	private static final short[] aShortArray163 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!wo", name = "l", descriptor = "[S")
	private static final short[] aShortArray164 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!wo", name = "t", descriptor = "I")
	public static int anInt10610 = 0;

	@OriginalMember(owner = "client!wo", name = "B", descriptor = "[[S")
	public static final short[][] aShortArrayArray21 = new short[][] { aShortArray164, aShortArray162, aShortArray163 };

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "(B)V")
	public static void method9094() {
		Static498.method7844((long) Static62.anInt1184, Static607.aClass101_15);
		if (Static567.anInt9844 != -1) {
			Static254.method4443(Static567.anInt9844);
		}
		for (@Pc(19) int local19 = 0; local19 < Static254.anInt4901; local19++) {
			if (Static561.aBooleanArray58[local19]) {
				Static531.aBooleanArray54[local19] = true;
			}
			Static520.aBooleanArray52[local19] = Static561.aBooleanArray58[local19];
			Static561.aBooleanArray58[local19] = false;
		}
		Static317.anInt7576 = Static62.anInt1184;
		if (Static567.anInt9844 != -1) {
			Static254.anInt4901 = 0;
			Static9.method139();
		}
		Static607.aClass101_15.la();
		Static369.method9408(Static607.aClass101_15);
		@Pc(66) int local66 = Static470.method4887();
		if (local66 == -1) {
			local66 = Static113.anInt2045;
		}
		if (local66 == -1) {
			local66 = Static303.anInt5522;
		}
		Static626.method9302(local66);
		Static87.anInt1634 = 0;
	}
}
