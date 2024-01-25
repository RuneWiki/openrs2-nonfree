import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!pi", name = "k", descriptor = "F")
	public static float aFloat45;

	@OriginalMember(owner = "client!pi", name = "l", descriptor = "Ljava/lang/Object;")
	public static Object anObject4;

	@OriginalMember(owner = "client!pi", name = "o", descriptor = "Lclient!qq;")
	public static Class28 aClass28_42;

	@OriginalMember(owner = "client!pi", name = "p", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray18;

	@OriginalMember(owner = "client!pi", name = "j", descriptor = "Lclient!ft;")
	public static final Class88 aClass88_23 = new Class88();

	@OriginalMember(owner = "client!pi", name = "m", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_32 = new Class25(31, 3);

	@OriginalMember(owner = "client!pi", name = "n", descriptor = "Lclient!cm;")
	public static final Class44 aClass44_2 = new Class44("runescape", 0);

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIII)I")
	public static int method1990(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = 255 - arg2;
		@Pc(30) int local30 = (arg2 * (arg1 & 0xFF00) & 0xFF0000 | (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >>> 8;
		return ((local12 * (arg0 & 0xFF00) & 0xFF0000 | (arg0 & 0xFF00FF) * local12 & 0xFF00FF00) >>> 8) + local30;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)Z")
	public static boolean method1992() {
		if (Static89.aBoolean121) {
			try {
				Static453.method333(Static165.aClass103_3.anApplet1, "showVideoAd");
				return true;
			} catch (@Pc(19) Throwable local19) {
			}
		}
		return false;
	}
}
