import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
	public static int anInt45;

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "Lclient!eo;")
	public static Class1_Sub15 aClass1_Sub15_1;

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray1 = new int[6][];

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
	public static int anInt47 = 0;

	@OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
	public static int anInt48 = 0;

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "[I")
	public static final int[] anIntArray5 = new int[25];

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIII)I")
	public static int method39(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 1023 - arg0;
		} else {
			return 1023 - arg2;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)V")
	public static void method40() {
		Static117.aClass45Array1 = new Class45[50];
		Static113.anInt2513 = 0;
	}
}
