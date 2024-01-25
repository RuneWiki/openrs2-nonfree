import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!gj", name = "o", descriptor = "Lclient!mk;")
	public static Class70 aClass70_6;

	@OriginalMember(owner = "client!gj", name = "C", descriptor = "[I")
	public static int[] anIntArray332;

	@OriginalMember(owner = "client!gj", name = "E", descriptor = "Z")
	public static boolean aBoolean170;

	@OriginalMember(owner = "client!gj", name = "y", descriptor = "Lclient!gk;")
	public static final Class7_Sub11 aClass7_Sub11_1 = new Class7_Sub11(0, 0);

	@OriginalMember(owner = "client!gj", name = "D", descriptor = "Lclient!ik;")
	public static final Class103 aClass103_22 = new Class103(50);

	@OriginalMember(owner = "client!gj", name = "G", descriptor = "Z")
	public static boolean aBoolean171 = false;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILclient!qo;II)V")
	public static void method2049(@OriginalArg(1) Class22_Sub2_Sub1_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt5133 == arg2 && arg2 != -1) {
			@Pc(10) Class170 local10 = Static261.method4379(arg2);
			@Pc(13) int local13 = local10.anInt4968;
			if (local13 == 1) {
				arg0.anInt5117 = 0;
				arg0.anInt5137 = 0;
				arg0.anInt5143 = 1;
				arg0.anInt5120 = 0;
				arg0.anInt5093 = arg1;
				Static219.method3870(local10, arg0.anInt5967, false, arg0.anInt5117, arg0.anInt5973);
			}
			if (local13 == 2) {
				arg0.anInt5120 = 0;
			}
		} else if (arg2 == -1 || arg0.anInt5133 == -1 || Static261.method4379(arg2).anInt4963 >= Static261.method4379(arg0.anInt5133).anInt4963) {
			arg0.anInt5137 = 0;
			arg0.anInt5117 = 0;
			arg0.anInt5093 = arg1;
			arg0.anInt5133 = arg2;
			arg0.anInt5144 = arg0.anInt5151;
			arg0.anInt5143 = 1;
			arg0.anInt5120 = 0;
			if (arg0.anInt5133 != -1) {
				Static219.method3870(Static261.method4379(arg0.anInt5133), arg0.anInt5967, false, arg0.anInt5117, arg0.anInt5973);
			}
		}
	}
}
