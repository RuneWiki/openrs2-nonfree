import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!hi", name = "C", descriptor = "Lclient!lf;")
	public static Class197 aClass197_3;

	@OriginalMember(owner = "client!hi", name = "x", descriptor = "J")
	public static long aLong219 = -1L;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BF)F")
	public static float method7242(@OriginalArg(1) float arg0) {
		return arg0 * arg0 * arg0 * (arg0 * (arg0 * 6.0F - 15.0F) + 10.0F);
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IZIZI)Lclient!pe;")
	public static Class254 method7244(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) Class294 local10 = null;
		if (Static589.aClass9_5 != null) {
			local10 = new Class294(arg1, Static589.aClass9_5, Static380.aClass9Array1[arg1], 1000000);
		}
		Static104.aClass62_Sub1Array1[arg1] = Static506.aClass343_2.method8130(arg1, Static317.aClass294_12, local10);
		if (arg2) {
			Static104.aClass62_Sub1Array1[arg1].method2089();
		}
		return new Class254(Static104.aClass62_Sub1Array1[arg1], arg0, 1);
	}
}
