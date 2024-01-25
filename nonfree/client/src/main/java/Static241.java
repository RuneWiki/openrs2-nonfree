import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!iaa", name = "m", descriptor = "[J")
	public static long[] aLongArray8;

	@OriginalMember(owner = "client!iaa", name = "t", descriptor = "I")
	public static int anInt4556;

	@OriginalMember(owner = "client!iaa", name = "i", descriptor = "[I")
	public static final int[] anIntArray294 = new int[] { 3, 7, 15 };

	@OriginalMember(owner = "client!iaa", name = "k", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_85 = new Class126(10, 0);

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ZZ)V")
	public static void method3895(@OriginalArg(1) boolean arg0) {
		@Pc(5) int local5 = Static426.anInt7224;
		@Pc(7) int local7 = Static591.anInt9343;
		if (arg0 && Static148.aBoolean221) {
			local5 <<= 0x1;
			local7 = -local5;
		}
		Static582.aClass16_12.f(local7, local5);
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method3896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg5 == arg4) {
			Static626.method8268(arg5, arg2, arg6, arg3, arg0, arg1);
		} else if (Static303.anInt9951 <= arg3 - arg5 && arg5 + arg3 <= Static408.anInt6951 && Static255.anInt4818 <= arg6 - arg4 && arg4 + arg6 <= Static658.anInt10079) {
			Static677.method8743(arg1, arg2, arg5, arg3, arg0, arg4, arg6);
		} else {
			Static457.method6561(arg3, arg5, arg0, arg6, arg1, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!iaa", name = "b", descriptor = "(I)V")
	public static void method3897() {
		Static482.aClass3_Sub6_Sub16_3 = new Class3_Sub6_Sub16(Static569.aClass335_4.method7694(Static319.anInt5939), "", Static267.anInt5035, 1004, -1, 0L, 0, 0, true, false, 0L, true);
	}
}
