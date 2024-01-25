import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static203 {

	@OriginalMember(owner = "client!ih", name = "L", descriptor = "I")
	public static int anInt4549;

	@OriginalMember(owner = "client!ih", name = "M", descriptor = "Lclient!cm;")
	public static Class3_Sub11 aClass3_Sub11_3;

	@OriginalMember(owner = "client!ih", name = "N", descriptor = "F")
	public static float aFloat148;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!uj;Lclient!uj;B)V")
	public static void method3790(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1) {
		if (arg1.aClass3_283 != null) {
			arg1.method7820();
		}
		arg1.aClass3_283 = arg0.aClass3_283;
		arg1.aClass3_284 = arg0;
		arg1.aClass3_283.aClass3_284 = arg1;
		arg1.aClass3_284.aClass3_283 = arg1;
	}
}
