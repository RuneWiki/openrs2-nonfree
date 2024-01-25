import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!lf", name = "n", descriptor = "Lclient!jn;")
	public static Class176 aClass176_75;

	@OriginalMember(owner = "client!lf", name = "o", descriptor = "Lclient!f;")
	public static Class78 aClass78_10;

	@OriginalMember(owner = "client!lf", name = "q", descriptor = "Lclient!hq;")
	public static Class145 aClass145_5;

	@OriginalMember(owner = "client!lf", name = "r", descriptor = "I")
	public static int anInt5973;

	@OriginalMember(owner = "client!lf", name = "m", descriptor = "Lclient!iv;")
	public static final Class162 aClass162_17 = new Class162(8, 3);

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BI)I")
	public static int method5095(@OriginalArg(1) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)Lclient!eba;")
	public static Class4_Sub14 method5096() {
		@Pc(13) Class4_Sub14 local13 = Static191.method3338();
		local13.aClass173_35 = null;
		local13.anInt2414 = 0;
		local13.aClass4_Sub11_Sub1_3 = new Class4_Sub11_Sub1(5000);
		return local13;
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(III)Z")
	public static boolean method5098(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
	}
}
