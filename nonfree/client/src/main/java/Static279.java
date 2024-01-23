import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
	public static int anInt5596;

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
	public static int anInt5594 = 0;

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
	public static int anInt5595 = -1;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IILclient!jj;)V")
	public static void method4290(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub18 arg1) {
		if (Static37.aClass66_5 == null) {
			return;
		}
		try {
			Static37.aClass66_5.method1538(0L);
			Static37.aClass66_5.method1539(arg1.aByteArray71, arg0, 24);
		} catch (@Pc(19) Exception local19) {
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IILclient!ak;Z)[Lclient!em;")
	public static Class48[] method4291(@OriginalArg(1) int arg0, @OriginalArg(2) Class7 arg1) {
		return Static139.method2193(arg1, arg0, 0) ? Static104.method2543() : null;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIILclient!j;IJZ)Z")
	public static boolean method4292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class6 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7, @OriginalArg(8) boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg4;
		@Pc(15) int local15 = arg1 + arg4;
		@Pc(19) int local19 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				local19 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				local15 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				local11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				local7 -= 128;
			}
		}
		local7 /= 128;
		local11 /= 128;
		local15 /= 128;
		local19 /= 128;
		return Static27.method458(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)Ljava/lang/String;")
	public static String method4293() {
		@Pc(15) String local15 = "www";
		if (Static243.anInt5013 != 0) {
			local15 = "www-wtqa";
		}
		@Pc(23) String local23 = "";
		if (Static266.aString179 != null) {
			local23 = "/p=" + Static266.aString179;
		}
		return "http://" + local15 + ".runescape.com/l=" + Static282.anInt5857 + "/a=" + Static129.anInt3918 + local23 + "/";
	}
}
