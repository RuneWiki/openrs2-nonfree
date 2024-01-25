import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!op", name = "d", descriptor = "I")
	public static int anInt5277;

	@OriginalMember(owner = "client!op", name = "e", descriptor = "[S")
	public static short[] aShortArray92;

	@OriginalMember(owner = "client!op", name = "g", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_82 = new Class217(17, 8);

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Lclient!at;III)V")
	public static void method4127(@OriginalArg(0) Class7_Sub2_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt4366 == arg1 && arg1 != -1) {
			@Pc(90) Class128 local90 = Static301.aClass170_3.method3936(arg1);
			@Pc(93) int local93 = local90.anInt3973;
			if (local93 == 1) {
				arg0.anInt4327 = 0;
				arg0.anInt4387 = arg2;
				arg0.anInt4336 = 1;
				arg0.anInt4333 = 0;
				arg0.anInt4397 = 0;
				Static135.method2140(arg0.anInt4327, local90, arg0.anInt4321, false, arg0.anInt4318, arg0.aByte77);
			}
			if (local93 == 2) {
				arg0.anInt4333 = 0;
				return;
			}
		} else if (arg1 == -1 || arg0.anInt4366 == -1 || Static301.aClass170_3.method3936(arg1).anInt3977 >= Static301.aClass170_3.method3936(arg0.anInt4366).anInt3977) {
			arg0.anInt4327 = 0;
			arg0.anInt4333 = 0;
			arg0.anInt4336 = 1;
			arg0.anInt4403 = arg0.anInt4404;
			arg0.anInt4387 = arg2;
			arg0.anInt4366 = arg1;
			arg0.anInt4397 = 0;
			if (arg0.anInt4366 != -1) {
				Static135.method2140(arg0.anInt4327, Static301.aClass170_3.method3936(arg0.anInt4366), arg0.anInt4321, false, arg0.anInt4318, arg0.aByte77);
				return;
			}
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(II)I")
	public static int method4128(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
