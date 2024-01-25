import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!jt", name = "d", descriptor = "Z")
	public static boolean aBoolean379;

	@OriginalMember(owner = "client!jt", name = "s", descriptor = "Lclient!nj;")
	public static Class243 aClass243_1;

	@OriginalMember(owner = "client!jt", name = "j", descriptor = "J")
	public static long aLong139 = 0L;

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(B)V")
	public static void method4266() {
		for (@Pc(11) int local11 = 0; local11 < Static406.anInt7043; local11++) {
			@Pc(17) Class22 local17 = Static479.aClass22Array1[local11];
			if (local17.aByte5 == 3) {
				if (local17.aClass4_Sub13_Sub2_1 == null) {
					local17.anInt466 = Integer.MIN_VALUE;
				} else {
					Static430.aClass4_Sub13_Sub1_1.method2274(local17.aClass4_Sub13_Sub2_1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(III)I")
	public static int method4267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = arg1 >>> 31;
		return (arg1 + local15) / arg0 - local15;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(ILclient!qi;)Z")
	public static boolean method4268(@OriginalArg(1) Interface17 arg0) {
		@Pc(10) Class25 local10 = Static553.aClass288_4.method6419(arg0.method7743());
		if (local10.anInt594 == -1) {
			return true;
		} else {
			@Pc(27) Class34 local27 = Static279.aClass190_2.method4353(local10.anInt594);
			return local27.anInt836 == -1 ? true : local27.method731();
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(BI)V")
	public static void method4271(@OriginalArg(1) int arg0) {
		Static597.anInt9820 = -1;
		Static391.anInt6853 = 100;
		Static162.anInt3559 = 3;
		Static119.anInt2755 = arg0;
	}

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "(III)Lclient!dk;")
	public static Class10_Sub2 method4272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class100 local7 = Static309.aClass100ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass10_Sub2_2;
	}
}
