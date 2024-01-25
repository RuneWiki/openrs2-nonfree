import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "Lclient!lu;")
	public static Class199 aClass199_3;

	@OriginalMember(owner = "client!pr", name = "i", descriptor = "Lclient!sq;")
	public static final Class316 aClass316_15 = new Class316(7, 0, 1, 1);

	@OriginalMember(owner = "client!pr", name = "j", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_83 = new Class257(32, 3);

	@OriginalMember(owner = "client!pr", name = "l", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_110 = new Class71(66, 8);

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V")
	public static void method6741() {
		Static72.method1882();
		Static513.aBoolean642 = false;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IB)V")
	public static void method6742(@OriginalArg(0) int arg0) {
		Static527.method7467();
		@Pc(17) int local17 = Static198.aClass161_1.method4576(arg0).anInt9192;
		if (local17 == 0) {
			return;
		}
		@Pc(25) int local25 = Static420.aClass77_1.anIntArray137[arg0];
		if (local17 == 5) {
			Static580.anInt5357 = local25;
		}
		if (local17 == 6) {
			Static624.anInt10431 = local25;
		}
	}
}
