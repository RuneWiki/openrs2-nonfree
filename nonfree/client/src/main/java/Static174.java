import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "[I")
	public static int[] anIntArray397 = new int[14];

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "[I")
	public static int[] anIntArray398 = new int[2];

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!nc;BII)V")
	public static void method2870(@OriginalArg(0) Class10_Sub5_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == arg0.anInt5061 && arg1 != -1) {
			@Pc(20) Class15 local20 = Static253.method4288(arg1);
			@Pc(23) int local23 = local20.anInt412;
			if (local23 == 1) {
				arg0.anInt5035 = 1;
				arg0.anInt5081 = 0;
				arg0.anInt5027 = arg2;
				arg0.anInt5049 = 0;
				arg0.anInt5051 = 0;
				Static158.method2622(arg0.anInt5073, arg0.anInt5049, local20, Static136.aClass10_Sub5_Sub1_1 == arg0, arg0.anInt5016);
			}
			if (local23 == 2) {
				arg0.anInt5051 = 0;
			}
		} else if (arg1 == -1 || arg0.anInt5061 == -1 || Static253.method4288(arg1).anInt420 >= Static253.method4288(arg0.anInt5061).anInt420) {
			arg0.anInt5027 = arg2;
			arg0.anInt5061 = arg1;
			arg0.anInt5051 = 0;
			arg0.anInt5049 = 0;
			arg0.anInt5035 = 1;
			arg0.anInt5081 = 0;
			arg0.anInt5021 = arg0.anInt5044;
			if (arg0.anInt5061 != -1) {
				Static158.method2622(arg0.anInt5073, arg0.anInt5049, Static253.method4288(arg0.anInt5061), Static136.aClass10_Sub5_Sub1_1 == arg0, arg0.anInt5016);
			}
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)V")
	public static void method2872() {
		if (Static187.aClass105_2 != null) {
			Static187.aClass105_2.method2781();
		}
		if (Static32.aClass105_1 != null) {
			Static32.aClass105_1.method2781();
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!wk;Lclient!wk;I)V")
	public static void method2873(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1) {
		if (arg1.aClass3_233 != null) {
			arg1.method5013();
		}
		arg1.aClass3_232 = arg0;
		arg1.aClass3_233 = arg0.aClass3_233;
		arg1.aClass3_233.aClass3_232 = arg1;
		arg1.aClass3_232.aClass3_233 = arg1;
	}
}
