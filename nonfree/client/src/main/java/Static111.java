import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!ge", name = "V", descriptor = "Lclient!fc;")
	public static Class71 aClass71_24;

	@OriginalMember(owner = "client!ge", name = "Q", descriptor = "Lclient!lm;")
	public static final Class144 aClass144_5 = new Class144("", 11);

	@OriginalMember(owner = "client!ge", name = "U", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_63 = new Class77(72, -2);

	@OriginalMember(owner = "client!ge", name = "W", descriptor = "Z")
	public static boolean aBoolean174 = false;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!ms;Z)Ljava/lang/String;")
	public static String method2140(@OriginalArg(0) Class155 arg0) {
		if (Static41.method878(arg0).method5123() == 0) {
			return null;
		} else if (arg0.aString38 == null || arg0.aString38.trim().length() == 0) {
			return Static218.aBoolean304 ? "Hidden-use" : null;
		} else {
			return arg0.aString38;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IBII)V")
	public static void method2141(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 << 3;
		@Pc(11) int local11 = arg0 << 3;
		Static18.aFloat8 = local7;
		if (Static283.anInt5017 == 2) {
			Static315.anInt5585 = 0;
			Static278.anInt1556 = local11;
			Static392.anInt6749 = local7;
		}
		Static295.aFloat73 = local11;
		Static203.method3381();
		Static92.aBoolean149 = true;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(CB)Z")
	public static boolean method2142(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static389.method5717(arg0)) {
			return true;
		} else {
			@Pc(25) char[] local25 = Static258.aCharArray7;
			for (@Pc(27) int local27 = 0; local27 < local25.length; local27++) {
				@Pc(33) char local33 = local25[local27];
				if (arg0 == local33) {
					return true;
				}
			}
			@Pc(49) char[] local49 = Static175.aCharArray8;
			for (@Pc(51) int local51 = 0; local51 < local49.length; local51++) {
				@Pc(57) char local57 = local49[local51];
				if (arg0 == local57) {
					return true;
				}
			}
			return false;
		}
	}
}
