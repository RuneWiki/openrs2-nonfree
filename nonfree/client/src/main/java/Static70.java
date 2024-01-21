import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!ih", name = "Hb", descriptor = "I")
	public static int anInt1833;

	@OriginalMember(owner = "client!ih", name = "I", descriptor = "Lclient!kb;")
	private static Class46 aClass46_624 = Static65.method1172("No response from server)3");

	@OriginalMember(owner = "client!ih", name = "hb", descriptor = "Lclient!pe;")
	public static Class64 aClass64_2 = new Class64();

	@OriginalMember(owner = "client!ih", name = "nb", descriptor = "Lclient!kb;")
	public static Class46 aClass46_626 = aClass46_624;

	@OriginalMember(owner = "client!ih", name = "Ib", descriptor = "Lclient!nb;")
	public static Class57 aClass57_16 = new Class57(50);

	@OriginalMember(owner = "client!ih", name = "Jb", descriptor = "I")
	public static int anInt1834 = 0;

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(IIII)V")
	public static void method1204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
			for (local11 = 0; local11 < 8; local11++) {
				Static133.anIntArrayArrayArray8[arg1][local7 + arg0][local11 + arg2] = 0;
			}
		}
		if (arg0 > 0) {
			for (local11 = 1; local11 < 8; local11++) {
				Static133.anIntArrayArrayArray8[arg1][arg0][local11 + arg2] = Static133.anIntArrayArrayArray8[arg1][arg0 - 1][arg2 + local11];
			}
		}
		if (arg2 > 0) {
			for (local11 = 1; local11 < 8; local11++) {
				Static133.anIntArrayArrayArray8[arg1][local11 + arg0][arg2] = Static133.anIntArrayArrayArray8[arg1][arg0 + local11][arg2 - 1];
			}
		}
		if (arg0 > 0 && Static133.anIntArrayArrayArray8[arg1][arg0 - 1][arg2] != 0) {
			Static133.anIntArrayArrayArray8[arg1][arg0][arg2] = Static133.anIntArrayArrayArray8[arg1][arg0 - 1][arg2];
		} else if (arg2 > 0 && Static133.anIntArrayArrayArray8[arg1][arg0][arg2 - 1] != 0) {
			Static133.anIntArrayArrayArray8[arg1][arg0][arg2] = Static133.anIntArrayArrayArray8[arg1][arg0][arg2 - 1];
		} else if (arg0 > 0 && arg2 > 0 && Static133.anIntArrayArrayArray8[arg1][arg0 - 1][arg2 - 1] != 0) {
			Static133.anIntArrayArrayArray8[arg1][arg0][arg2] = Static133.anIntArrayArrayArray8[arg1][arg0 - 1][arg2 - 1];
		}
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(II)V")
	public static void method1205(@OriginalArg(1) int arg0) {
		Static160.anInt3569 = arg0;
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(I)V")
	public static void method1211() {
		aClass46_626 = null;
		aClass46_624 = null;
		aClass57_16 = null;
		aClass64_2 = null;
	}
}
