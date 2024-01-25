import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!bd", name = "m", descriptor = "[I")
	public static final int[] anIntArray47 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!bd", name = "n", descriptor = "[I")
	public static final int[] anIntArray48 = new int[5];

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
	public static void method462() {
		Static373.anInt4900 = 0;
		Static248.aClass14_35.method305();
		Static123.aBoolean212 = false;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IBI)V")
	public static void method463(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(25) int local25;
		if (arg1 != Static429.anInt6518) {
			Static365.anIntArray535 = new int[arg1];
			for (local25 = 0; local25 < arg1; local25++) {
				Static365.anIntArray535[local25] = (local25 << 12) / arg1;
			}
			Static238.anInt4577 = arg1 * 32;
			Static303.anInt5406 = arg1 - 1;
			Static429.anInt6518 = arg1;
		}
		if (arg0 == Static51.anInt1129) {
			return;
		}
		if (Static429.anInt6518 == arg0) {
			Static318.anIntArray565 = Static365.anIntArray535;
		} else {
			Static318.anIntArray565 = new int[arg0];
			for (local25 = 0; local25 < arg0; local25++) {
				Static318.anIntArray565[local25] = (local25 << 12) / arg0;
			}
		}
		Static246.anInt4669 = arg0 - 1;
		Static51.anInt1129 = arg0;
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(B)V")
	public static void method464() {
		if (Static73.aString14.toLowerCase().indexOf("microsoft") != -1) {
			Static156.anIntArray284[192] = 58;
			Static156.anIntArray284[189] = 26;
			Static156.anIntArray284[187] = 27;
			Static156.anIntArray284[186] = 57;
			Static156.anIntArray284[222] = 59;
			Static156.anIntArray284[219] = 42;
			Static156.anIntArray284[188] = 71;
			Static156.anIntArray284[220] = 74;
			Static156.anIntArray284[190] = 72;
			Static156.anIntArray284[191] = 73;
			Static156.anIntArray284[223] = 28;
			Static156.anIntArray284[221] = 43;
			return;
		}
		if (Static73.aMethod2 == null) {
			Static156.anIntArray284[222] = 59;
			Static156.anIntArray284[192] = 58;
		} else {
			Static156.anIntArray284[192] = 28;
			Static156.anIntArray284[222] = 58;
			Static156.anIntArray284[520] = 59;
		}
		Static156.anIntArray284[46] = 72;
		Static156.anIntArray284[44] = 71;
		Static156.anIntArray284[47] = 73;
		Static156.anIntArray284[91] = 42;
		Static156.anIntArray284[45] = 26;
		Static156.anIntArray284[59] = 57;
		Static156.anIntArray284[92] = 74;
		Static156.anIntArray284[61] = 27;
		Static156.anIntArray284[93] = 43;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(CI)Z")
	public static boolean method465(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
