import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!gda", name = "S", descriptor = "I")
	public static int anInt3287;

	@OriginalMember(owner = "client!gda", name = "U", descriptor = "Lclient!ak;")
	public static Class3_Sub6_Sub1 aClass3_Sub6_Sub1_1;

	@OriginalMember(owner = "client!gda", name = "K", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_100 = new Class272(47, 5);

	@OriginalMember(owner = "client!gda", name = "V", descriptor = "Z")
	public static boolean aBoolean268 = false;

	@OriginalMember(owner = "client!gda", name = "W", descriptor = "I")
	public static int anInt3289 = -1;

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(FIFF)I")
	public static int method2911(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(12) float local12 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(21) float local21 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(39) float local39 = arg1 < 0.0F ? -arg1 : arg1;
		if (local12 < local21 && local39 < local21) {
			return arg0 > 0.0F ? 0 : 1;
		} else if (local12 < local39 && local39 > local21) {
			return arg1 > 0.0F ? 2 : 3;
		} else if (arg2 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
