import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "Lclient!i;")
	public static Class2_Sub1_Sub7_Sub3_Sub1 aClass2_Sub1_Sub7_Sub3_Sub1_4;

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "Lclient!ca;")
	public static Class13_Sub1 aClass13_Sub1_18;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_990 = Static158.method3034("oder ung-Ultiges Passwort)3");

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_993 = Static158.method3034("Loading sprites )2 ");

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "Lclient!ob;")
	public static Class60 aClass60_991 = aClass60_993;

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
	public static int anInt3588 = 0;

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_992 = Static158.method3034("_");

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)Lclient!hh;")
	public static Class2_Sub1_Sub12 method2779(@OriginalArg(1) int arg0) {
		@Pc(14) Class2_Sub1_Sub12 local14 = (Class2_Sub1_Sub12) Static113.aClass89_43.method3437((long) arg0);
		if (local14 != null) {
			return local14;
		}
		local14 = Static60.method1400(arg0, Static70.aClass13_14, Static10.aClass13_4);
		if (local14 != null) {
			Static113.aClass89_43.method3432(local14, (long) arg0);
		}
		return local14;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIII)V")
	public static void method2780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static96.method2447(Static36.anInt1076, Static117.anInt951, arg1);
		@Pc(17) int local17 = Static96.method2447(Static36.anInt1076, Static117.anInt951, arg4);
		@Pc(23) int local23 = Static96.method2447(Static64.anInt1962, Static123.anInt3379, arg0);
		@Pc(33) int local33 = Static96.method2447(Static64.anInt1962, Static123.anInt3379, arg5);
		@Pc(42) int local42 = Static96.method2447(Static36.anInt1076, Static117.anInt951, arg1 + arg3);
		@Pc(51) int local51 = Static96.method2447(Static36.anInt1076, Static117.anInt951, arg4 - arg3);
		for (@Pc(53) int local53 = local11; local53 < local42; local53++) {
			Static163.method3070(local33, local23, arg2, Static42.anIntArrayArray8[local53]);
		}
		for (@Pc(69) int local69 = local17; local69 > local51; local69--) {
			Static163.method3070(local33, local23, arg2, Static42.anIntArrayArray8[local69]);
		}
		@Pc(91) int local91 = Static96.method2447(Static64.anInt1962, Static123.anInt3379, arg3 + arg0);
		@Pc(100) int local100 = Static96.method2447(Static64.anInt1962, Static123.anInt3379, arg5 - arg3);
		for (@Pc(102) int local102 = local42; local102 <= local51; local102++) {
			@Pc(108) int[] local108 = Static42.anIntArrayArray8[local102];
			Static163.method3070(local91, local23, arg2, local108);
			Static163.method3070(local33, local100, arg2, local108);
		}
	}
}
