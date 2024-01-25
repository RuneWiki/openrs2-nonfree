import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!ld", name = "q", descriptor = "Lclient!qs;")
	public static Class211 aClass211_59;

	@OriginalMember(owner = "client!ld", name = "W", descriptor = "Lclient!za;")
	public static Class106 aClass106_8;

	@OriginalMember(owner = "client!ld", name = "r", descriptor = "Lclient!bu;")
	public static final Class38 aClass38_19 = new Class38(512);

	@OriginalMember(owner = "client!ld", name = "D", descriptor = "Z")
	public static boolean aBoolean283 = false;

	@OriginalMember(owner = "client!ld", name = "J", descriptor = "I")
	public static final int anInt4498 = 1337;

	@OriginalMember(owner = "client!ld", name = "X", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_99 = new Class263(0, -2);

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Ljava/lang/String;IBLjava/lang/String;ILjava/lang/String;)V")
	public static void method3471(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		Static118.method2011(null, arg1, arg2, arg0, arg3, -1, arg4);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIII)I")
	public static int method3475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static396.aClass96Array5 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg0 >> 7;
		@Pc(15) int local15 = arg1 >> 7;
		if (local11 < 0 || local15 < 0 || local11 > Static209.anInt4283 - 1 || local15 > Static211.anInt4295 - 1) {
			return 0;
		}
		@Pc(49) int local49 = arg2;
		if (arg2 < 3 && (Static110.aByteArrayArrayArray20[1][local11][local15] & 0x2) != 0) {
			local49 = arg2 + 1;
		}
		return Static396.aClass96Array5[local49].ca(arg0, arg1);
	}
}
