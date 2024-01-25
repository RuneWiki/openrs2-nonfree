import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static272 {

	@OriginalMember(owner = "client!no", name = "i", descriptor = "Lclient!de;")
	private static final Class50 aClass50_21 = new Class50(4, 1, 1, 1);

	@OriginalMember(owner = "client!no", name = "m", descriptor = "I")
	public static int anInt4438 = -1;

	@OriginalMember(owner = "client!no", name = "s", descriptor = "I")
	public static int anInt4442 = -60;

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!dk;ILclient!za;Lclient!dk;)V")
	public static void method3656(@OriginalArg(0) Class54 arg0, @OriginalArg(2) Class163 arg1, @OriginalArg(3) Class54 arg2) {
		Static251.aClass141_6 = Static69.method1057(Static129.anInt2330, arg2);
		Static46.aClass92_2 = arg1.method5537(Static251.aClass141_6, Static461.method256(arg0, Static129.anInt2330));
		Static278.aClass141_8 = Static69.method1057(Static224.anInt3665, arg2);
		Static43.aClass92_1 = arg1.method5537(Static278.aClass141_8, Static461.method256(arg0, Static224.anInt3665));
		Static241.aClass141_5 = Static69.method1057(Static314.anInt5421, arg2);
		Static143.aClass92_3 = arg1.method5537(Static241.aClass141_5, Static461.method256(arg0, Static314.anInt5421));
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(BI)I")
	public static int method3657(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!no", name = "c", descriptor = "(B)[Lclient!de;")
	public static Class50[] method3659() {
		return new Class50[] { Static303.aClass50_22, Static147.aClass50_8, Static207.aClass50_14, aClass50_21, Static396.aClass50_30, Static258.aClass50_19, Static157.aClass50_9, Static186.aClass50_28, Static397.aClass50_25, Static402.aClass50_26, Static99.aClass50_7, Static449.aClass50_29, Static103.aClass50_6, Static72.aClass50_3 };
	}
}
