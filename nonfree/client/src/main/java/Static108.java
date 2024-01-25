import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!fh", name = "A", descriptor = "Lclient!sb;")
	public static Class212 aClass212_3;

	@OriginalMember(owner = "client!fh", name = "B", descriptor = "[[I")
	public static final int[][] anIntArrayArray23 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!fh", name = "P", descriptor = "[[S")
	public static final short[][] aShortArrayArray6 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!fh", name = "W", descriptor = "I")
	public static int anInt2361 = -50;

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "(Z)V")
	public static void method2009() {
		@Pc(7) int local7 = Static33.anInt606;
		@Pc(9) int[] local9 = Static99.anIntArray157;
		for (@Pc(16) int local16 = 0; local16 < local7; local16++) {
			@Pc(24) Class16_Sub1_Sub5_Sub1 local24 = Static267.aClass16_Sub1_Sub5_Sub1Array1[local9[local16]];
			if (local24 != null && local24.anInt6077 > 0) {
				local24.anInt6077--;
				if (local24.anInt6077 == 0) {
					local24.aString60 = null;
				}
			}
		}
		for (@Pc(50) int local50 = 0; local50 < Static12.anInt163; local50++) {
			@Pc(56) int local56 = Static342.anIntArray412[local50];
			@Pc(60) Class16_Sub1_Sub5_Sub2 local60 = Static143.aClass16_Sub1_Sub5_Sub2Array1[local56];
			if (local60 != null && local60.anInt6077 > 0) {
				local60.anInt6077--;
				if (local60.anInt6077 == 0) {
					local60.aString60 = null;
				}
			}
		}
	}
}
