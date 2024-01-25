import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!fr", name = "e", descriptor = "B")
	public static byte aByte19;

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "I")
	public static int anInt2415 = 0;

	@OriginalMember(owner = "client!fr", name = "f", descriptor = "[[S")
	public static final short[][] aShortArrayArray2 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!fr", name = "h", descriptor = "I")
	public static final int anInt2419 = 4;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)I")
	public static int method1777(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IBI)Z")
	public static boolean method1778(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method1779(@OriginalArg(0) String arg0) {
		if (!Static428.aBoolean637) {
			return;
		}
		@Pc(10) boolean local10 = false;
		@Pc(12) int local12 = Static348.anInt6137;
		@Pc(14) int[] local14 = Static348.anIntArray412;
		for (@Pc(16) int local16 = 0; local16 < local12; local16++) {
			@Pc(24) Class4_Sub2_Sub2_Sub1 local24 = Static129.aClass4_Sub2_Sub2_Sub1Array27[local14[local16]];
			if (local24 != null && Static231.aClass4_Sub2_Sub2_Sub1_2 != local24 && local24.aString48 != null && local24.aString48.equalsIgnoreCase(arg0)) {
				Static448.method6059(Static265.aClass44_88);
				Static98.aClass2_Sub20_Sub1_1.method3740(Static443.anInt7737);
				Static98.aClass2_Sub20_Sub1_1.method3728(0);
				Static98.aClass2_Sub20_Sub1_1.method3726(Static255.anInt4805);
				Static98.aClass2_Sub20_Sub1_1.method3697(Static245.anInt4645);
				Static98.aClass2_Sub20_Sub1_1.method3687(local14[local16]);
				Static437.method5919(-2, local24.method5118(), local24.anIntArray437[0], 0, local24.method5118(), true, local24.anIntArray436[0], 0);
				local10 = true;
				break;
			}
		}
		if (!local10) {
			Static165.method4929(Static419.aClass256_155.method5720(Static272.anInt7537) + arg0);
		}
		if (Static428.aBoolean637) {
			Static342.method4802();
		}
	}
}
