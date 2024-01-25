import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static597 {

	@OriginalMember(owner = "client!sm", name = "m", descriptor = "[I")
	public static int[] anIntArray659;

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "(I)V")
	public static void method7694() {
		Static315.aBoolean335 = false;
		Static402.method5423();
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(Z)V")
	public static void method7695() {
		if (Static60.aString27.toLowerCase().indexOf("microsoft") != -1) {
			Static463.anIntArray539[186] = 57;
			Static463.anIntArray539[222] = 59;
			Static463.anIntArray539[190] = 72;
			Static463.anIntArray539[220] = 74;
			Static463.anIntArray539[191] = 73;
			Static463.anIntArray539[192] = 58;
			Static463.anIntArray539[188] = 71;
			Static463.anIntArray539[187] = 27;
			Static463.anIntArray539[189] = 26;
			Static463.anIntArray539[221] = 43;
			Static463.anIntArray539[223] = 28;
			Static463.anIntArray539[219] = 42;
			return;
		}
		Static463.anIntArray539[45] = 26;
		Static463.anIntArray539[61] = 27;
		Static463.anIntArray539[91] = 42;
		Static463.anIntArray539[44] = 71;
		Static463.anIntArray539[59] = 57;
		Static463.anIntArray539[93] = 43;
		Static463.anIntArray539[46] = 72;
		Static463.anIntArray539[47] = 73;
		Static463.anIntArray539[92] = 74;
		if (Static60.aMethod1 == null) {
			Static463.anIntArray539[222] = 59;
			Static463.anIntArray539[192] = 58;
		} else {
			Static463.anIntArray539[192] = 28;
			Static463.anIntArray539[222] = 58;
			Static463.anIntArray539[520] = 59;
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIII)I")
	public static int method7696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return 7 - arg1;
		} else if (local7 == 2) {
			return 7 - arg2;
		} else {
			return arg1;
		}
	}
}
