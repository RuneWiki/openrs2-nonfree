import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!rb", name = "h", descriptor = "Lclient!nf;")
	public static Class69_Sub1 aClass69_Sub1_163;

	@OriginalMember(owner = "client!rb", name = "i", descriptor = "[Lclient!mc;")
	public static Class63[] aClass63Array105;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1327 = Static81.method1507("lila:");

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_1329 = Static81.method1507("Login");

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "Lclient!dj;")
	public static Class24 aClass24_1328 = aClass24_1329;

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
	public static int anInt4675 = 0;

	@OriginalMember(owner = "client!rb", name = "l", descriptor = "I")
	public static int anInt4679 = 0;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIILclient!wd;IJZ)Z")
	public static boolean method3564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7, @OriginalArg(8) boolean arg8) {
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
		return Static127.method2122(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)I")
	public static int method3565(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIBLclient!vc;)V")
	public static void method3566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class98 arg2) {
		if (Static208.aClass98_21 != null || Static53.aBoolean73 || (arg2 == null || Static100.method1738(arg2) == null)) {
			return;
		}
		Static208.aClass98_21 = arg2;
		Static56.aClass98_8 = Static100.method1738(arg2);
		Static188.anInt4178 = arg0;
		Static190.anInt4266 = arg1;
		Static181.anInt4037 = 0;
		Static101.aBoolean108 = false;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!ve;B)V")
	public static void method3567(@OriginalArg(0) Class69 arg0) {
		Static53.aClass69_14 = arg0;
	}
}
