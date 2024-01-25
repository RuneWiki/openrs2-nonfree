import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "Lclient!bi;")
	public static Class31 aClass31_54;

	@OriginalMember(owner = "client!ba", name = "i", descriptor = "Lclient!mga;")
	public static final Class223 aClass223_36 = new Class223(10);

	@OriginalMember(owner = "client!ba", name = "k", descriptor = "[I")
	public static final int[] anIntArray417 = new int[200];

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIB)V")
	public static void method4008(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 1002) {
			Static205.method3630(Static455.aClass182_7, arg1, arg2);
		} else if (arg0 == 1008) {
			Static205.method3630(Static109.aClass182_2, arg1, arg2);
		} else if (arg0 == 1009) {
			Static205.method3630(Static481.aClass182_8, arg1, arg2);
		} else if (arg0 == 1007) {
			Static205.method3630(Static180.aClass182_3, arg1, arg2);
		} else if (arg0 == 1011) {
			Static205.method3630(Static231.aClass182_4, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIFIIZII)[I")
	public static int[] method4009(@OriginalArg(2) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class4_Sub4_Sub28 local10 = new Class4_Sub4_Sub28();
		local10.anInt7444 = 35;
		local10.aBoolean530 = true;
		local10.anInt7439 = 8;
		local10.anInt7445 = (int) (arg0 * 4096.0F);
		local10.anInt7442 = 4;
		local10.anInt7448 = 8;
		local10.method7894();
		Static162.method3175(2048, 1);
		local10.method6163(local6, 0);
		return local6;
	}
}
