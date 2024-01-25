import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static244 {

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "I")
	public static int anInt5486;

	@OriginalMember(owner = "client!iq", name = "e", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!iq", name = "d", descriptor = "I")
	public static int anInt5487 = 1;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!tn;I)Lclient!pi;")
	public static Class71_Sub3 method4642(@OriginalArg(0) Class3_Sub15 arg0) {
		return new Class71_Sub3(arg0.method8444(), arg0.method8444(), arg0.method8444(), arg0.method8444(), arg0.method8421(), arg0.method8421(), arg0.method8401());
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IBIIII)V")
	public static void method4644(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 == arg4) {
			Static565.method7952(arg1, arg2, arg3, arg0);
		} else if (arg1 - arg3 >= Static472.anInt6105 && arg1 + arg3 <= Static202.anInt4720 && arg0 - arg4 >= Static246.anInt5506 && Static583.anInt9761 >= arg4 + arg0) {
			Static285.method4971(arg3, arg1, arg4, arg0, arg2);
		} else {
			Static508.method7392(arg4, arg0, arg2, arg3, arg1);
		}
	}
}
