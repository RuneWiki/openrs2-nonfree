import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static324 {

	@OriginalMember(owner = "client!mj", name = "q", descriptor = "I")
	public static int anInt5951;

	@OriginalMember(owner = "client!mj", name = "m", descriptor = "Lclient!go;")
	public static final Class121 aClass121_11 = new Class121(10, 2, 2, 0);

	@OriginalMember(owner = "client!mj", name = "r", descriptor = "Lclient!em;")
	public static final Class83 aClass83_120 = new Class83(113, 12);

	@OriginalMember(owner = "client!mj", name = "s", descriptor = "I")
	public static int anInt5952 = 0;

	@OriginalMember(owner = "client!mj", name = "t", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_71 = new Class208(21, 8);

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(Z)V")
	public static void method4818() {
		if (Static203.aClass246_1 != null) {
			Static520.aClass247_5 = new Class247();
			Static520.aClass247_5.method5331(Static481.aLong221, Static203.aClass246_1.aClass253_2.method5453(Static161.anInt3095), Static203.aClass246_1.anInt6557, Static203.aClass246_1);
			Static567.aThread9 = new Thread(Static520.aClass247_5, "");
			Static567.aThread9.start();
		}
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(III)Z")
	public static boolean method4819(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static575.method7748(arg0, arg1) | Static480.method6648(arg1, arg0) | Static579.method7769(arg0, arg1)) & Static567.method5561(arg0, arg1);
	}
}
