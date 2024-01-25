import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static254 {

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "Lclient!lf;")
	public static Class90 aClass90_15;

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
	public static int anInt4895;

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
	public static int anInt4896;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "[Lclient!ke;")
	public static final Class5_Sub3_Sub3_Sub1[] aClass5_Sub3_Sub3_Sub1Array1 = new Class5_Sub3_Sub3_Sub1[2048];

	@OriginalMember(owner = "client!qk", name = "f", descriptor = "[B")
	public static final byte[] aByteArray81 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIIB)V")
	public static void method4509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg3 == arg4) {
			Static302.method4315(arg1, arg0, arg2, arg4);
		} else if (Static106.anInt2157 <= arg0 - arg4 && Static251.anInt6512 >= arg0 + arg4 && arg1 - arg3 >= Static49.anInt1124 && Static291.anInt5657 >= arg1 + arg3) {
			Static222.method4057(arg4, arg2, arg3, arg0, arg1);
		} else {
			Static202.method3770(arg4, arg2, arg0, arg3, arg1);
		}
	}
}
