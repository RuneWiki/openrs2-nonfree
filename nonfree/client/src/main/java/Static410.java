import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!oo", name = "m", descriptor = "Lclient!us;")
	public static final Class344 aClass344_89 = new Class344(39, 15);

	@OriginalMember(owner = "client!oo", name = "q", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_92 = new Class218(72, -1);

	@OriginalMember(owner = "client!oo", name = "r", descriptor = "I")
	public static int anInt7690 = -1;

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IIIIIII)V")
	public static void method6439(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static472.anInt6105 <= arg3 && arg0 <= Static202.anInt4720 && arg2 >= Static246.anInt5506 && Static583.anInt9761 >= arg5) {
			if (arg1 == 1) {
				Static149.method3260(arg5, arg3, arg2, arg4, arg0);
			} else {
				Static508.method7384(arg2, arg4, arg0, arg3, arg5, arg1);
			}
		} else if (arg1 == 1) {
			Static646.method8659(arg4, arg2, arg5, arg3, arg0);
		} else {
			Static412.method6447(arg5, arg4, arg0, arg3, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Z)V")
	public static void method6440() throws Exception_Sub1 {
		if (Static178.anInt4220 == 1) {
			Static67.aClass33_5.method6217(Static640.anInt10507, Static613.anInt10162);
		} else {
			Static67.aClass33_5.method6217(0, 0);
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)V")
	public static void method6442(@OriginalArg(1) int arg0) {
		@Pc(13) Class3_Sub1_Sub21 local13 = Static57.method8561(arg0, 10);
		local13.method8628();
	}
}
