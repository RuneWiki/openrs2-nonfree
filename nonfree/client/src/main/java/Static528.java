import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static528 {

	@OriginalMember(owner = "client!uea", name = "e", descriptor = "[[I")
	public static int[][] anIntArrayArray57;

	@OriginalMember(owner = "client!uea", name = "i", descriptor = "Lclient!bj;")
	public static Class36 aClass36_2;

	@OriginalMember(owner = "client!uea", name = "j", descriptor = "Lclient!eda;")
	public static Class90 aClass90_133;

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "[I")
	public static final int[] anIntArray549 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!uea", name = "d", descriptor = "I")
	public static int anInt9683 = 1;

	@OriginalMember(owner = "client!uea", name = "f", descriptor = "I")
	public static int anInt9684 = 0;

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(III)V")
	public static void method7459(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class4_Sub6_Sub5 local8 = Static396.method6079(arg1, 6);
		local8.method2303();
		local8.anInt2865 = arg0;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(I)V")
	public static void method7460() {
		@Pc(7) int local7 = Static57.anInt1513;
		@Pc(9) int[] local9 = Static447.anIntArray571;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class21_Sub1_Sub1_Sub1_Sub2 local19 = Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1[local9[local11]];
			if (local19 != null) {
				Static552.method7771(local19.method3339(), local19);
			}
		}
	}
}
