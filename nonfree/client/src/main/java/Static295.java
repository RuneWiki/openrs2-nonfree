import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static295 {

	@OriginalMember(owner = "client!wj", name = "n", descriptor = "I")
	public static int anInt5480;

	@OriginalMember(owner = "client!wj", name = "o", descriptor = "F")
	public static float aFloat55;

	@OriginalMember(owner = "client!wj", name = "q", descriptor = "I")
	public static int anInt5481;

	@OriginalMember(owner = "client!wj", name = "r", descriptor = "Lclient!lc;")
	public static Class98 aClass98_172;

	@OriginalMember(owner = "client!wj", name = "l", descriptor = "Lclient!dh;")
	public static Class33 aClass33_40 = new Class33(100);

	@OriginalMember(owner = "client!wj", name = "m", descriptor = "I")
	public static int anInt5479 = 0;

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(Z)V")
	public static void method4350() {
		aClass33_40 = null;
		aClass98_172 = null;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!p;I)Lclient!rk;")
	public static Class95_Sub3 method4351(@OriginalArg(0) Class4_Sub17 arg0) {
		return new Class95_Sub3(arg0.method1869(), arg0.method1869(), arg0.method1869(), arg0.method1869(), arg0.method1835(), arg0.method1874());
	}
}
