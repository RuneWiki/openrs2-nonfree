import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!oga", name = "c", descriptor = "J")
	public static long aLong189;

	@OriginalMember(owner = "client!oga", name = "b", descriptor = "Lclient!ft;")
	public static final Class110 aClass110_29 = new Class110(2, 14);

	@OriginalMember(owner = "client!oga", name = "d", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_96 = new Class276(47, -1);

	@OriginalMember(owner = "client!oga", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray59 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!oga", name = "b", descriptor = "(B)V")
	public static void method6087() {
		@Pc(10) int local10 = Static455.anInt8611;
		@Pc(12) int[] local12 = Static492.anIntArray589;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(21) Class2_Sub2_Sub1_Sub1 local21 = Static378.aClass2_Sub2_Sub1_Sub1Array10[local12[local14]];
			if (local21 != null) {
				Static86.method1923(local21, local21.method6311());
			}
		}
	}
}
