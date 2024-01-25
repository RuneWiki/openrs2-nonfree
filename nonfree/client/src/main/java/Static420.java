import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static420 {

	@OriginalMember(owner = "client!vf", name = "x", descriptor = "Lclient!in;")
	public static Class109 aClass109_2;

	@OriginalMember(owner = "client!vf", name = "z", descriptor = "Lclient!jn;")
	public static Class80 aClass80_1;

	@OriginalMember(owner = "client!vf", name = "l", descriptor = "Lclient!bf;")
	public static final Class21 aClass21_16 = new Class21(8, 3);

	@OriginalMember(owner = "client!vf", name = "q", descriptor = "Lclient!sp;")
	public static final Class219 aClass219_7 = new Class219("WTWIP", 3);

	@OriginalMember(owner = "client!vf", name = "y", descriptor = "Z")
	public static final boolean aBoolean646 = false;

	@OriginalMember(owner = "client!vf", name = "A", descriptor = "Z")
	public static boolean aBoolean647 = false;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IZZI)V")
	public static void method5385(@OriginalArg(1) boolean arg0) {
		Static322.anInt5579 = 2;
		Static261.anInt4928 = 22050;
		Static422.aBoolean649 = arg0;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IZLclient!uu;)Ljava/lang/String;")
	public static String method5386(@OriginalArg(0) int arg0, @OriginalArg(2) Class247 arg1) {
		if (!Static53.method900(arg1).method3905(arg0) && arg1.anObjectArray15 == null) {
			return null;
		} else if (arg1.aStringArray37 == null || arg1.aStringArray37.length <= arg0 || arg1.aStringArray37[arg0] == null || arg1.aStringArray37[arg0].trim().length() == 0) {
			return Static415.aBoolean626 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray37[arg0];
		}
	}
}
