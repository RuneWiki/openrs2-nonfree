import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static356 {

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "Lclient!h;")
	public static Class101_Sub1 aClass101_Sub1_1;

	@OriginalMember(owner = "client!rq", name = "d", descriptor = "I")
	public static final int anInt6055 = 1338;

	@OriginalMember(owner = "client!rq", name = "e", descriptor = "Lclient!gh;")
	public static Class89 aClass89_10 = null;

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIIB)V")
	public static void method4783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static337.aClass10_Sub8_Sub2_2.method2506(arg2);
		Static337.aClass10_Sub8_Sub2_2.method2497(arg0);
		Static337.aClass10_Sub8_Sub2_2.method2497(arg1);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Ljava/awt/Canvas;BILclient!l;)Lclient!za;")
	public static Class50 method4784(@OriginalArg(0) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface7 arg2) {
		return new Class50_Sub2(arg1, arg0, arg2);
	}
}
