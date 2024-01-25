import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static533 {

	@OriginalMember(owner = "client!ui", name = "x", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet1;

	@OriginalMember(owner = "client!ui", name = "z", descriptor = "I")
	public static int anInt9769;

	@OriginalMember(owner = "client!ui", name = "t", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_137 = new Class90(37, -2);

	@OriginalMember(owner = "client!ui", name = "A", descriptor = "I")
	public static int anInt9770 = 0;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(CI)C")
	public static char method7515(@OriginalArg(0) char arg0) {
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

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)I")
	public static int method7517(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local12 *= arg1;
			}
			arg0 >>= 0x1;
			arg1 *= arg1;
		}
		if (arg0 == 1) {
			return arg1 * local12;
		} else {
			return local12;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
	public static void method7519() {
		for (@Pc(11) int local11 = 0; local11 < 100; local11++) {
			Static155.aBooleanArray6[local11] = true;
		}
	}
}
