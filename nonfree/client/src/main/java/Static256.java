import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!ika", name = "b", descriptor = "Lclient!el;")
	public static final Class109 aClass109_97 = new Class109(58, 7);

	@OriginalMember(owner = "client!ika", name = "r", descriptor = "Lclient!el;")
	public static final Class109 aClass109_98 = new Class109(2, 1);

	@OriginalMember(owner = "client!ika", name = "d", descriptor = "[S")
	public static short[] aShortArray48 = new short[256];

	@OriginalMember(owner = "client!ika", name = "A", descriptor = "Lclient!to;")
	public static Class333 aClass333_3 = null;

	@OriginalMember(owner = "client!ika", name = "u", descriptor = "Lclient!el;")
	public static final Class109 aClass109_99 = new Class109(42, -2);

	@OriginalMember(owner = "client!ika", name = "b", descriptor = "(IIII)V")
	public static void method3779(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int local3 = arg1 << 3;
		@Pc(7) int local7 = arg0 << 3;
		Static429.aFloat132 = (float) local3;
		Static138.aFloat18 = (float) local7;
		if (Static79.anInt1216 == 2) {
			Static649.anInt5976 = local7;
			Static313.anInt5549 = 0;
			Static159.anInt2475 = local3;
		}
		Static369.method5420();
		Static258.aBoolean347 = true;
	}

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(IIII)I")
	public static int method3781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(14) int local14 = 255 - arg2;
		@Pc(32) int local32 = ((arg0 & 0xFF00) * arg2 & 0xFF0000 | arg2 * (arg0 & 0xFF00FF) & 0xFF00FF00) >>> 8;
		return (((arg1 & 0xFF00) * local14 & 0xFF0000 | local14 * (arg1 & 0xFF00FF) & 0xFF00FF00) >>> 8) + local32;
	}

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(IBI)Z")
	public static boolean method3785(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x70000) != 0 | Static583.method8399(arg1, arg0) || Static62.method872(arg0, arg1);
	}
}
