import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!mda", name = "c", descriptor = "Lclient!la;")
	public static Class208 aClass208_84;

	@OriginalMember(owner = "client!mda", name = "g", descriptor = "I")
	public static int anInt6291;

	@OriginalMember(owner = "client!mda", name = "d", descriptor = "Z")
	public static boolean aBoolean474 = false;

	@OriginalMember(owner = "client!mda", name = "f", descriptor = "Lclient!wh;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "I")
	public static int anInt6292 = 0;

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method5371(@OriginalArg(1) int arg0) {
		@Pc(17) Class5_Sub9 local17 = (Class5_Sub9) Static134.aClass291_12.method6993((long) arg0, 1);
		if (local17 != null) {
			@Pc(24) Class5_Sub12_Sub1 local24 = local17.aClass272_Sub1_1.method6471();
			if (local24 != null) {
				@Pc(31) double local31 = local17.aClass272_Sub1_1.method6456();
				if (local31 >= (double) local24.method1868() && (double) local24.method1866() >= local31) {
					return local24.method1871();
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(B)V")
	public static void method5373() {
		if (Static311.aClass175_1 != null) {
			Static311.aClass175_1.method4703();
		}
		if (Static536.aClass175_3 != null) {
			Static536.aClass175_3.method4703();
		}
	}
}
