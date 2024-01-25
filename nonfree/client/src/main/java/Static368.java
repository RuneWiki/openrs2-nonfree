import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!vm", name = "p", descriptor = "I")
	public static int anInt5297;

	@OriginalMember(owner = "client!vm", name = "r", descriptor = "I")
	public static int anInt5299;

	@OriginalMember(owner = "client!vm", name = "s", descriptor = "I")
	public static int anInt5300 = 2;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(BLclient!ae;)Lclient!ae;")
	public static Class4 method4611(@OriginalArg(1) Class4 arg0) {
		if (arg0.anInt88 != -1) {
			return Static380.method5560(arg0.anInt88);
		}
		@Pc(24) int local24 = arg0.anInt94 >>> 16;
		@Pc(29) Class122 local29 = new Class122(Static12.aClass246_2);
		for (@Pc(34) Class2_Sub38 local34 = (Class2_Sub38) local29.method2875(); local34 != null; local34 = (Class2_Sub38) local29.method2878()) {
			if (local34.anInt4976 == local24) {
				return Static380.method5560((int) local34.aLong209);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(III)V")
	public static void method4612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class251 local7 = Static64.aClass251ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass1_Sub1_3 != null) {
			local7.aClass1_Sub1_3 = null;
		}
		if (local7.aClass1_Sub1_2 != null) {
			local7.aClass1_Sub1_2 = null;
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIZI)I")
	public static int method4613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 / arg2;
		@Pc(13) int local13 = arg0 & arg2 - 1;
		@Pc(17) int local17 = arg1 / arg2;
		@Pc(28) int local28 = arg2 - 1 & arg1;
		@Pc(33) int local33 = Static232.method3780(local7, local17);
		@Pc(40) int local40 = Static232.method3780(local7 + 1, local17);
		@Pc(47) int local47 = Static232.method3780(local7, local17 + 1);
		@Pc(56) int local56 = Static232.method3780(local7 + 1, local17 + 1);
		@Pc(63) int local63 = Static385.method5626(local40, local13, arg2, local33);
		@Pc(70) int local70 = Static385.method5626(local56, local13, arg2, local47);
		return Static385.method5626(local70, local28, arg2, local63);
	}

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "(III)Lclient!a;")
	public static Class1_Sub1 method4614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class251 local7 = Static64.aClass251ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass1_Sub1_3;
	}
}
