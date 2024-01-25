import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!hn", name = "G", descriptor = "I")
	public static int anInt4224;

	@OriginalMember(owner = "client!hn", name = "s", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_57 = new Class67("flash1:", "blinken1:", "clignotant1:", "flash1:");

	@OriginalMember(owner = "client!hn", name = "v", descriptor = "[Z")
	public static final boolean[] aBooleanArray21 = new boolean[8];

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)I")
	public static int method3482() {
		return 2;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(BJ)V")
	public static void method3487(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(7) InterruptedException local7) {
		}
	}
}
