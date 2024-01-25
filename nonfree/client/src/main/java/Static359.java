import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static359 {

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIZILclient!ik;)V")
	public static void method5010(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) Class182 arg3) {
		if (arg1 <= 0) {
			Static356.method4981(arg0, arg3, arg2);
			return;
		}
		Static313.aBoolean333 = false;
		Static144.anInt2671 = arg2;
		Static243.aClass3_Sub33_Sub3_1 = null;
		Static390.anInt6077 = 0;
		Static599.anInt9088 = 1;
		Static224.aClass182_61 = arg3;
		Static576.anInt10894 = arg0;
		Static344.anInt5509 = Static708.aClass3_Sub33_Sub3_4.method7903() / arg1;
		if (Static344.anInt5509 < 1) {
			Static344.anInt5509 = 1;
			return;
		}
	}
}
