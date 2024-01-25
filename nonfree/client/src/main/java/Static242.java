import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!jc", name = "db", descriptor = "I")
	public static int anInt4524;

	@OriginalMember(owner = "client!jc", name = "G", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_76 = new Class286(43, 3);

	@OriginalMember(owner = "client!jc", name = "S", descriptor = "Lclient!ec;")
	public static final Class88 aClass88_10 = new Class88(1);

	@OriginalMember(owner = "client!jc", name = "ib", descriptor = "Z")
	public static boolean aBoolean363 = false;

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "(B)Z")
	public static boolean method3755() {
		if (Static590.aBoolean730) {
			try {
				Static602.method6577("showVideoAd", Static562.anApplet2);
				return true;
			} catch (@Pc(13) Throwable local13) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)Z")
	public static boolean method3758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)Z")
	public static boolean method3760(@OriginalArg(1) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}
}
