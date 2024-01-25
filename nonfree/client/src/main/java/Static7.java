import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static7 {

	@OriginalMember(owner = "client!ada", name = "J", descriptor = "Lclient!wm;")
	public static Class390 aClass390_1;

	@OriginalMember(owner = "client!ada", name = "M", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!ada", name = "U", descriptor = "I")
	public static int anInt114;

	@OriginalMember(owner = "client!ada", name = "H", descriptor = "S")
	public static short aShort1 = 205;

	@OriginalMember(owner = "client!ada", name = "g", descriptor = "(I)V")
	public static void method106() {
		if (Static39.aClass255_1 != null) {
			Static39.aClass255_1.method7451();
		}
		if (Static345.aClass255_3 != null) {
			Static345.aClass255_3.method7451();
		}
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(IC)C")
	public static char method107(@OriginalArg(1) char arg0) {
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
}
