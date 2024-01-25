import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "Z")
	public static boolean aBoolean589 = false;

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "Lclient!ng;")
	public static final Class140 aClass140_176 = new Class140(10);

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "[I")
	public static final int[] anIntArray811 = new int[8];

	@OriginalMember(owner = "client!mh", name = "j", descriptor = "[I")
	public static final int[] anIntArray812 = new int[1000];

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(CB)C")
	public static char method5707(@OriginalArg(0) char arg0) {
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

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V")
	public static void method5708() {
		if (Static123.anInt2380 != 2) {
			try {
				Static365.method4929(Static242.aClient1, "tbrefresh");
			} catch (@Pc(22) Throwable local22) {
			}
		}
	}
}
