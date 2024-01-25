import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static503 {

	@OriginalMember(owner = "client!te", name = "S", descriptor = "Lclient!ll;")
	public static Class198 aClass198_12;

	@OriginalMember(owner = "client!te", name = "I", descriptor = "Lclient!jn;")
	public static final Class167 aClass167_55 = new Class167(8);

	@OriginalMember(owner = "client!te", name = "P", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_90 = new Class344(28, 7);

	@OriginalMember(owner = "client!te", name = "R", descriptor = "I")
	public static int anInt9410 = 64;

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(II)V")
	public static void method7241(@OriginalArg(0) int arg0) {
		if (Static420.method6283(arg0)) {
			Static216.method3515(-1, Static535.aClass155ArrayArray2[arg0]);
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BIIZI)V")
	public static void method7242(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		Static268.aLong141 = 0L;
		@Pc(16) int local16 = Static578.method8122();
		if (arg1 == 3 || local16 == 3) {
			arg2 = true;
		}
		if (!Static39.aClass7_2.method7802()) {
			arg2 = true;
		}
		Static520.method8287(arg0, arg1, arg2, local16, arg3);
	}
}
