import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static562 {

	@OriginalMember(owner = "client!tw", name = "h", descriptor = "I")
	public static int anInt9399;

	@OriginalMember(owner = "client!tw", name = "b", descriptor = "I")
	public static int anInt9393 = 0;

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(Lclient!wq;I)I")
	public static int method8095(@OriginalArg(0) Class376 arg0) {
		if (Static637.aClass376_13 == arg0) {
			return 5120;
		} else if (arg0 == Static637.aClass376_14) {
			return 5122;
		} else if (Static637.aClass376_15 == arg0) {
			return 5124;
		} else if (arg0 == Static637.aClass376_16) {
			return 5121;
		} else if (arg0 == Static637.aClass376_17) {
			return 5123;
		} else if (arg0 == Static637.aClass376_18) {
			return 5125;
		} else if (arg0 == Static637.aClass376_19) {
			return 5131;
		} else if (arg0 == Static637.aClass376_20) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(Lclient!dk;B)V")
	public static void method8096(@OriginalArg(0) Class3_Sub14 arg0) {
		Static265.aClass223_21.method5868(arg0);
		arg0.anInt2268 = arg0.aClass3_Sub3_Sub2_2.anInt4736;
		Static629.anInt10094 += arg0.anInt2268;
		arg0.aClass3_Sub3_Sub2_2.anInt4736 = 0;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIIII)V")
	public static void method8099(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 - arg1 >= Static630.anInt10099 && arg1 + arg0 <= Static16.anInt4339 && arg3 - arg1 >= Static11.anInt9803 && Static149.anInt2949 >= arg1 + arg3) {
			Static275.method4483(arg2, arg1, arg0, arg3);
		} else {
			Static222.method3717(arg1, arg0, arg2, arg3);
		}
	}
}
