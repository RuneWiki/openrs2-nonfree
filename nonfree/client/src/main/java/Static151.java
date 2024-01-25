import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "Z")
	public static boolean aBoolean499;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "Lclient!vg;")
	public static Class252 aClass252_42 = new Class252(8);

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray46 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
	public static int anInt7436 = 0;

	@OriginalMember(owner = "client!hd", name = "h", descriptor = "Lclient!nv;")
	public static final Class177 aClass177_51 = new Class177();

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "Z")
	public static boolean aBoolean500 = false;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(CI)Z")
	public static boolean method5966(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static392.method5127(arg0)) {
			return true;
		} else {
			@Pc(20) char[] local20 = Static120.aCharArray2;
			for (@Pc(22) int local22 = 0; local22 < local20.length; local22++) {
				@Pc(28) char local28 = local20[local22];
				if (local28 == arg0) {
					return true;
				}
			}
			@Pc(44) char[] local44 = Static289.aCharArray5;
			for (@Pc(51) int local51 = 0; local51 < local44.length; local51++) {
				@Pc(57) char local57 = local44[local51];
				if (arg0 == local57) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIBIII)V")
	public static void method5967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static3.anInt45 <= arg1 && arg2 <= Static112.anInt1900 && arg5 >= Static356.anInt5817 && arg0 <= Static3.anInt46) {
			Static104.method1455(arg6, arg5, arg4, arg2, arg1, arg0, arg3);
		} else {
			Static417.method5502(arg3, arg6, arg4, arg1, arg5, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZ)V")
	public static void method5972() {
		Static400.aClass44_65.method1025(50);
		Static222.aClass44_33.method1025(50);
		Static304.aClass44_48.method1025(50);
		Static323.aClass44_51.method1025(50);
		Static445.aClass44_25.method1025(50);
	}
}
