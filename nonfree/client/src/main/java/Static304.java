import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "Lclient!pk;")
	public static final Class183 aClass183_39 = new Class183();

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
	public static int anInt5369 = 0;

	@OriginalMember(owner = "client!ph", name = "i", descriptor = "Lclient!uu;")
	public static Class247 aClass247_16 = null;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!jj;IIII)V")
	public static void method4115(@OriginalArg(0) Class120 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static227.method3448(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static422.anInt6945) {
			Static227.method3448(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static227.method3448(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static171.anInt3361) {
			Static227.method3448(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static171.anInt3361) {
			Static227.method3448(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static422.anInt6945 && arg4 <= Static171.anInt3361) {
			Static227.method3448(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static227.method3448(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static422.anInt6945 && arg4 > 0) {
			Static227.method3448(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IZ)V")
	public static void method4119() {
		@Pc(1) Class68 local1 = Static442.aClass68_58;
		synchronized (Static442.aClass68_58) {
			Static442.aClass68_58.method1788(5);
		}
		local1 = Static190.aClass68_20;
		synchronized (Static190.aClass68_20) {
			Static190.aClass68_20.method1788(5);
		}
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(II)I")
	public static int method4122(@OriginalArg(0) int arg0) {
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
}
