import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static605 {

	@OriginalMember(owner = "client!tca", name = "K", descriptor = "Ljava/lang/Object;")
	public static Object anObject14;

	@OriginalMember(owner = "client!tca", name = "fb", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray10;

	@OriginalMember(owner = "client!tca", name = "ob", descriptor = "I")
	public static int anInt9403;

	@OriginalMember(owner = "client!tca", name = "Z", descriptor = "Lclient!lk;")
	public static Class225 aClass225_181 = new Class225(12, 7);

	@OriginalMember(owner = "client!tca", name = "ub", descriptor = "[C")
	public static final char[] aCharArray8 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!tca", name = "g", descriptor = "(B)V")
	public static void method8286() {
		Static161.method2381();
	}

	@OriginalMember(owner = "client!tca", name = "l", descriptor = "(I)V")
	public static void method8287() {
		if (Static214.anApplet1 == null) {
			return;
		}
		try {
			@Pc(13) String local13 = Static214.anApplet1.getParameter("cookiehost");
			@Pc(21) int local21 = (int) (Static567.method7863() / 86400000L) - 11745;
			@Pc(45) String local45 = "usrdob=" + local21 + "; version=1; path=/; domain=" + local13;
			Static736.method7133("document.cookie=\"" + local45 + "\"", Static214.anApplet1);
		} catch (@Pc(61) Throwable local61) {
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IZ)Lclient!via;")
	public static Class386 method8292(@OriginalArg(0) int arg0) {
		@Pc(14) Class386[] local14 = Static417.method6112();
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class386 local22 = local14[local16];
			if (arg0 == local22.anInt10494) {
				return local22;
			}
		}
		return null;
	}
}
