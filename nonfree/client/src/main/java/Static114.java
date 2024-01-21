import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!of", name = "d", descriptor = "I")
	public static int anInt2920;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "Lclient!eh;")
	public static Class28 aClass28_942 = Static170.method3101("(U5");

	@OriginalMember(owner = "client!of", name = "e", descriptor = "I")
	public static int anInt2921 = 0;

	@OriginalMember(owner = "client!of", name = "f", descriptor = "I")
	public static int anInt2922 = 0;

	@OriginalMember(owner = "client!of", name = "g", descriptor = "Lclient!eh;")
	public static Class28 aClass28_943 = Static170.method3101("titlebutton");

	@OriginalMember(owner = "client!of", name = "h", descriptor = "[I")
	public static int[] anIntArray509 = new int[200];

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V")
	public static void method2282() {
		anIntArray509 = null;
		aClass28_942 = null;
		aClass28_943 = null;
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(B)V")
	public static void method2283() {
		@Pc(7) int local7 = 0;
		@Pc(10) int[] local10 = new int[Static27.anInt878];
		for (@Pc(12) int local12 = 0; local12 < Static27.anInt878; local12++) {
			@Pc(18) Class3_Sub2_Sub10 local18 = Static76.method1736(local12);
			if (local18.anInt1868 >= 0 || local18.anInt1892 >= 0) {
				local10[local7++] = local12;
			}
		}
		Static96.anIntArray696 = new int[local7];
		for (@Pc(53) int local53 = 0; local53 < local7; local53++) {
			Static96.anIntArray696[local53] = local10[local53];
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IBII)V")
	public static void method2284(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
			for (local16 = 0; local16 < 8; local16++) {
				Static90.anIntArrayArrayArray31[arg0][local7 + arg2][local16 + arg1] = 0;
			}
		}
		if (arg2 > 0) {
			for (local16 = 1; local16 < 8; local16++) {
				Static90.anIntArrayArrayArray31[arg0][arg2][local16 + arg1] = Static90.anIntArrayArrayArray31[arg0][arg2 - 1][local16 + arg1];
			}
		}
		if (arg1 > 0) {
			for (local16 = 1; local16 < 8; local16++) {
				Static90.anIntArrayArrayArray31[arg0][arg2 + local16][arg1] = Static90.anIntArrayArrayArray31[arg0][local16 + arg2][arg1 - 1];
			}
		}
		if (arg2 > 0 && Static90.anIntArrayArrayArray31[arg0][arg2 - 1][arg1] != 0) {
			Static90.anIntArrayArrayArray31[arg0][arg2][arg1] = Static90.anIntArrayArrayArray31[arg0][arg2 - 1][arg1];
		} else if (arg1 > 0 && Static90.anIntArrayArrayArray31[arg0][arg2][arg1 - 1] != 0) {
			Static90.anIntArrayArrayArray31[arg0][arg2][arg1] = Static90.anIntArrayArrayArray31[arg0][arg2][arg1 - 1];
		} else if (arg2 > 0 && arg1 > 0 && Static90.anIntArrayArrayArray31[arg0][arg2 - 1][arg1 - 1] != 0) {
			Static90.anIntArrayArrayArray31[arg0][arg2][arg1] = Static90.anIntArrayArrayArray31[arg0][arg2 - 1][arg1 - 1];
		}
	}
}
