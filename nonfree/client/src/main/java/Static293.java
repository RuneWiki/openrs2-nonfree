import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "[I")
	public static int[] anIntArray604;

	@OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
	public static int anInt5846;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
	public static int anInt5839 = 0;

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "[Z")
	public static boolean[] aBooleanArray130 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
	public static int anInt5842 = 0;

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
	public static int anInt5844 = 0;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIZ)I")
	public static int method4799(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg2 / arg1;
		@Pc(11) int local11 = arg0 / arg1;
		@Pc(17) int local17 = arg1 - 1 & arg0;
		@Pc(23) int local23 = arg1 - 1 & arg2;
		@Pc(28) int local28 = Static6.method110(local3, local11);
		@Pc(35) int local35 = Static6.method110(local3 + 1, local11);
		@Pc(42) int local42 = Static6.method110(local3, local11 + 1);
		@Pc(51) int local51 = Static6.method110(local3 + 1, local11 + 1);
		@Pc(58) int local58 = Static85.method1309(local35, local23, arg1, local28);
		@Pc(65) int local65 = Static85.method1309(local51, local23, arg1, local42);
		return Static85.method1309(local65, local17, arg1, local58);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
	public static void method4800() {
		Static29.aClass98_7.method2571();
		Static28.aClass98_5.method2571();
		Static20.aClass98_3.method2571();
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IB)I")
	public static int method4801(@OriginalArg(0) int arg0) {
		@Pc(14) Class172 local14 = Static266.method4409(arg0);
		@Pc(17) int local17 = local14.anInt5442;
		@Pc(20) int local20 = local14.anInt5438;
		@Pc(23) int local23 = local14.anInt5445;
		@Pc(29) int local29 = Class3_Sub2_Sub6.anIntArray64[local20 - local17];
		return Static161.anIntArray347[local23] >> local17 & local29;
	}
}
