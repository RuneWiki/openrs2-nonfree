import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static26 {

	@OriginalMember(owner = "client!cg", name = "Q", descriptor = "I")
	public static int anInt596;

	@OriginalMember(owner = "client!cg", name = "T", descriptor = "Lclient!qd;")
	public static Class68 aClass68_2;

	@OriginalMember(owner = "client!cg", name = "W", descriptor = "[[Lclient!h;")
	public static Class33[][] aClass33ArrayArray1;

	@OriginalMember(owner = "client!cg", name = "N", descriptor = "I")
	public static int anInt594 = 0;

	@OriginalMember(owner = "client!cg", name = "P", descriptor = "Lclient!nd;")
	public static Class59 aClass59_3 = new Class59();

	@OriginalMember(owner = "client!cg", name = "R", descriptor = "I")
	public static int anInt597 = 0;

	@OriginalMember(owner = "client!cg", name = "S", descriptor = "Lclient!nb;")
	public static Class57 aClass57_6 = new Class57(64);

	@OriginalMember(owner = "client!cg", name = "X", descriptor = "Lclient!nb;")
	public static Class57 aClass57_7 = new Class57(64);

	@OriginalMember(owner = "client!cg", name = "Y", descriptor = "Z")
	public static volatile boolean aBoolean20 = false;

	@OriginalMember(owner = "client!cg", name = "Z", descriptor = "I")
	public static int anInt600 = 0;

	@OriginalMember(owner = "client!cg", name = "ab", descriptor = "Lclient!kb;")
	public static Class46 aClass46_160 = Static65.method1172("ams");

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BLclient!h;)Lclient!kb;")
	public static Class46 method436(@OriginalArg(1) Class33 arg0) {
		if (Static140.method221(Static157.method2541(arg0)) == 0) {
			return null;
		} else if (arg0.aClass46_489 == null || arg0.aClass46_489.method1379().method1376() == 0) {
			return Static118.aBoolean118 ? Static36.aClass46_286 : null;
		} else {
			return arg0.aClass46_489;
		}
	}

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "(B)V")
	public static void method437() {
		aClass33ArrayArray1 = null;
		aClass57_7 = null;
		aClass59_3 = null;
		aClass46_160 = null;
		aClass68_2 = null;
		aClass57_6 = null;
	}
}
