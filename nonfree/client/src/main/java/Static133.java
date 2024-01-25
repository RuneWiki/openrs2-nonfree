import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!ii", name = "z", descriptor = "Lclient!ap;")
	public static Class15 aClass15_7;

	@OriginalMember(owner = "client!ii", name = "B", descriptor = "I")
	public static int anInt4651;

	@OriginalMember(owner = "client!ii", name = "v", descriptor = "J")
	public static long aLong140 = 0L;

	@OriginalMember(owner = "client!ii", name = "w", descriptor = "[Lclient!om;")
	public static final Class14_Sub2_Sub15[] aClass14_Sub2_Sub15Array4 = new Class14_Sub2_Sub15[14];

	@OriginalMember(owner = "client!ii", name = "y", descriptor = "[I")
	public static final int[] anIntArray420 = new int[4096];

	@OriginalMember(owner = "client!ii", name = "C", descriptor = "[[S")
	public static final short[][] aShortArrayArray9 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(III)I")
	public static int method4167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = 0;
		while (arg0 > 0) {
			local15 = local15 << 1 | arg1 & 0x1;
			arg1 >>>= 0x1;
			arg0--;
		}
		return local15;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)V")
	public static void method4170() {
		Static256.aClass11_110.method215(5);
	}
}
