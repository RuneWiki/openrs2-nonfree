import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
	public static int anInt394;

	@OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
	public static int anInt401;

	@OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
	public static int anInt392 = 0;

	@OriginalMember(owner = "client!bb", name = "u", descriptor = "Lclient!s;")
	public static final Class217 aClass217_12 = new Class217(33, 20);

	@OriginalMember(owner = "client!bb", name = "v", descriptor = "[I")
	public static final int[] anIntArray37 = new int[100];

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!ph;I)V")
	public static void method325(@OriginalArg(0) Class187 arg0) {
		Static288.aClass187_89 = arg0;
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(II)Lclient!eq;")
	public static Class70 method326(@OriginalArg(1) int arg0) {
		@Pc(10) Class70 local10 = (Class70) Static265.aClass267_46.method6014((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static49.aClass187_12.method4300(0, arg0);
		local10 = new Class70();
		if (local20 != null) {
			local10.method1777(new Class10_Sub8(local20));
		}
		local10.method1776();
		Static265.aClass267_46.method6008(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BIIIIII)V")
	public static void method327(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static360.method4841(Static160.anInt3220, Static319.anInt5496, arg2);
		@Pc(17) int local17 = Static360.method4841(Static160.anInt3220, Static319.anInt5496, arg5);
		@Pc(23) int local23 = Static360.method4841(Static146.anInt3034, Static115.anInt2362, arg1);
		@Pc(29) int local29 = Static360.method4841(Static146.anInt3034, Static115.anInt2362, arg4);
		@Pc(38) int local38 = Static360.method4841(Static160.anInt3220, Static319.anInt5496, arg2 + arg3);
		@Pc(47) int local47 = Static360.method4841(Static160.anInt3220, Static319.anInt5496, arg5 - arg3);
		for (@Pc(49) int local49 = local11; local49 < local38; local49++) {
			Static212.method3267(local23, local29, arg0, Class10_Sub10_Sub1.lb[local49]);
		}
		for (@Pc(69) int local69 = local17; local69 > local47; local69--) {
			Static212.method3267(local23, local29, arg0, Class10_Sub10_Sub1.lb[local69]);
		}
		@Pc(91) int local91 = Static360.method4841(Static146.anInt3034, Static115.anInt2362, arg3 + arg1);
		@Pc(100) int local100 = Static360.method4841(Static146.anInt3034, Static115.anInt2362, arg4 - arg3);
		for (@Pc(102) int local102 = local38; local102 <= local47; local102++) {
			@Pc(110) int[] local110 = Class10_Sub10_Sub1.lb[local102];
			Static212.method3267(local23, local91, arg0, local110);
			Static212.method3267(local100, local29, arg0, local110);
		}
	}
}
