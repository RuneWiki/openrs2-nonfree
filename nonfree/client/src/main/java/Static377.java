import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!nha", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString78 = null;

	@OriginalMember(owner = "client!nha", name = "c", descriptor = "I")
	public static int anInt5908 = -1;

	@OriginalMember(owner = "client!nha", name = "d", descriptor = "Z")
	public static volatile boolean aBoolean430 = true;

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(III)B")
	public static byte method5063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(B)Z")
	public static boolean method5064() {
		if (Static418.aBoolean471) {
			try {
				Static651.method4296("showVideoAd", Static617.anApplet2);
				return true;
			} catch (@Pc(18) Throwable local18) {
			}
		}
		return false;
	}
}
