import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!bg", name = "j", descriptor = "Lclient!nm;")
	public static Class119 aClass119_7;

	@OriginalMember(owner = "client!bg", name = "n", descriptor = "[I")
	public static int[] anIntArray49;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "Lclient!ui;")
	public static Class175 aClass175_4 = new Class175(50);

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
	public static int anInt452 = 0;

	@OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
	public static int anInt456 = 2;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIIII)V")
	public static void method446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static306.method4566(arg3, Static231.anInt4333, Static218.anInt4086);
		@Pc(17) int local17 = Static306.method4566(arg5, Static231.anInt4333, Static218.anInt4086);
		@Pc(23) int local23 = Static306.method4566(arg0, Static188.anInt3598, Static289.anInt5245);
		@Pc(29) int local29 = Static306.method4566(arg1, Static188.anInt3598, Static289.anInt5245);
		@Pc(38) int local38 = Static306.method4566(arg3 + arg2, Static231.anInt4333, Static218.anInt4086);
		@Pc(47) int local47 = Static306.method4566(arg5 - arg2, Static231.anInt4333, Static218.anInt4086);
		@Pc(49) int local49;
		for (local49 = local11; local49 < local38; local49++) {
			Static103.method1978(arg4, local29, local23, Static40.anIntArrayArray6[local49]);
		}
		for (local49 = local17; local49 > local47; local49--) {
			Static103.method1978(arg4, local29, local23, Static40.anIntArrayArray6[local49]);
		}
		@Pc(100) int local100 = Static306.method4566(arg0 + arg2, Static188.anInt3598, Static289.anInt5245);
		@Pc(109) int local109 = Static306.method4566(arg1 - arg2, Static188.anInt3598, Static289.anInt5245);
		for (local49 = local38; local49 <= local47; local49++) {
			@Pc(122) int[] local122 = Static40.anIntArrayArray6[local49];
			Static103.method1978(arg4, local100, local23, local122);
			Static103.method1978(arg4, local29, local109, local122);
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)Lclient!ea;")
	public static Class39 method447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub16 local7 = Static254.aClass1_Sub16ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass39_1;
	}
}
