import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!nc", name = "r", descriptor = "Lclient!jd;")
	public static Class49 aClass49_1;

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
	public static int anInt2825 = 0;

	@OriginalMember(owner = "client!nc", name = "w", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_993 = Static151.method2243("Fps:");

	@OriginalMember(owner = "client!nc", name = "z", descriptor = "I")
	public static int anInt2829 = 0;

	@OriginalMember(owner = "client!nc", name = "D", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_995 = Static151.method2243("Please try again)3");

	@OriginalMember(owner = "client!nc", name = "A", descriptor = "Lclient!mb;")
	public static Class62 aClass62_994 = aClass62_995;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)I")
	public static int method2001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
	public static int method2002(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) int local6 = arg0.getKeyChar();
		if (local6 == 8364) {
			return 128;
		} else {
			if (local6 <= 0 || local6 >= 256) {
				local6 = -1;
			}
			return local6;
		}
	}
}
