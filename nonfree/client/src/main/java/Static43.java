import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_699 = Static118.method2249(" )2> <col=00ffff>");

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_700 = Static118.method2249("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
	public static int anInt1113 = 3;

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_701 = Static118.method2249("document)3cookie=(R");

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_702 = Static118.method2249("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BII)I")
	public static int method720(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local10 *= arg1;
			}
			arg0 >>= 0x1;
			arg1 *= arg1;
		}
		if (arg0 == 1) {
			return local10 * arg1;
		} else {
			return local10;
		}
	}
}
