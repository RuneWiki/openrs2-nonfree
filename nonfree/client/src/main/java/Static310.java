import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!ph", name = "u", descriptor = "F")
	public static float aFloat99;

	@OriginalMember(owner = "client!ph", name = "H", descriptor = "Lclient!mf;")
	public static final Class163 aClass163_37 = new Class163();

	@OriginalMember(owner = "client!ph", name = "O", descriptor = "Lclient!os;")
	public static final Class182 aClass182_191 = new Class182("Drop", "Fallen lassen", "Poser", "Largar");

	@OriginalMember(owner = "client!ph", name = "R", descriptor = "I")
	public static int anInt5396 = -1;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILclient!nn;Z)Ljava/lang/String;")
	public static String method4281(@OriginalArg(1) Class10_Sub8 arg0) {
		try {
			@Pc(7) int local7 = arg0.method2469();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(15) byte[] local15 = new byte[local7];
			arg0.anInt2989 += Static379.aClass257_2.method5672(local7, 0, arg0.aByteArray44, local15, arg0.anInt2989);
			return Static254.method3689(0, local15, local7);
		} catch (@Pc(39) Exception local39) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIBI)V")
	public static void method4283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static337.aClass10_Sub8_Sub2_2.anInt2989 = 0;
		Static337.aClass10_Sub8_Sub2_2.method2458(Static53.aClass216_7.anInt6089);
		Static337.aClass10_Sub8_Sub2_2.method2458(arg1);
		Static337.aClass10_Sub8_Sub2_2.method2458(arg2);
		Static337.aClass10_Sub8_Sub2_2.method2509(arg0);
		Static337.aClass10_Sub8_Sub2_2.method2509(arg3);
		Static113.anInt2280 = -3;
		Static268.anInt4867 = 1;
		Static241.anInt4381 = 0;
		Static284.anInt4990 = 0;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIBI)V")
	public static void method4305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 >= Static115.anInt2362 && Static146.anInt3034 >= arg3 && arg0 >= Static319.anInt5496 && Static160.anInt3220 >= arg2) {
			Static141.method2400(arg1, arg0, arg2, arg3, arg4);
		} else {
			Static59.method1023(arg0, arg2, arg3, arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!bj;B)V")
	public static void method4308(@OriginalArg(0) Class27 arg0) {
		Static337.aClass10_Sub8_Sub2_2.method2530(arg0.method450());
	}
}
