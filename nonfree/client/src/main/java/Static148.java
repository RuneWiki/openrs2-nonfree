import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static148 {

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "[S")
	public static short[] aShortArray90;

	@OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
	public static int anInt6292;

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
	public static int anInt6290 = -1;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IC)C")
	public static char method5169(@OriginalArg(1) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZBZ)V")
	public static void method5176(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			Static24.anInt435--;
			if (Static24.anInt435 == 0) {
				Static323.anIntArray198 = null;
			}
		}
		if (!arg0) {
			return;
		}
		Static184.anInt3737--;
		if (Static184.anInt3737 == 0) {
			Static107.anIntArray200 = null;
			return;
		}
	}
}
