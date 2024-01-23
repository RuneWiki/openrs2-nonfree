import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!se", name = "k", descriptor = "Lclient!v;")
	public static Class86_Sub1 aClass86_Sub1_34;

	@OriginalMember(owner = "client!se", name = "M", descriptor = "Lclient!ee;")
	public static Class27 aClass27_7;

	@OriginalMember(owner = "client!se", name = "bb", descriptor = "I")
	public static int anInt3916;

	@OriginalMember(owner = "client!se", name = "kb", descriptor = "I")
	public static int anInt3922;

	@OriginalMember(owner = "client!se", name = "u", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1257 = Static186.method3527("Versteckt");

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(BIILclient!pa;)[Lclient!rh;")
	public static Class78_Sub1[] method3117(@OriginalArg(1) int arg0, @OriginalArg(3) Class86 arg1) {
		return Static139.method2305(arg1, arg0) ? Static70.method1017() : null;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "([Lclient!rh;[Lclient!rh;Z[Lclient!rh;Lclient!pa;[Lclient!hk;[Lclient!rh;)V")
	public static void method3123(@OriginalArg(0) Class78_Sub1[] arg0, @OriginalArg(1) Class78_Sub1[] arg1, @OriginalArg(3) Class78_Sub1[] arg2, @OriginalArg(4) Class86 arg3, @OriginalArg(5) Class1_Sub1_Sub8_Sub1[] arg4, @OriginalArg(6) Class78_Sub1[] arg5) {
		Static30.aClass78_Sub1Array1 = arg2;
		Static34.aClass1_Sub1_Sub8_Sub1Array5 = arg4;
		Static183.aClass78_Sub1Array5 = arg5;
		Static144.aClass78_Sub1Array4 = arg0;
		Static217.aClass78_Sub1Array8 = arg1;
		Static163.aClass86_61 = arg3;
		Static56.aClass75_5.method2243();
		@Pc(25) int local25 = Static163.aClass86_61.method3336(Static223.aClass50_1370);
		@Pc(30) int[] local30 = Static163.aClass86_61.method3308(local25);
		for (@Pc(36) int local36 = 0; local36 < local30.length; local36++) {
			Static56.aClass75_5.method2240(Static107.method1643(new Class1_Sub17(Static163.aClass86_61.method3325(local25, local30[local36]))));
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIB)V")
	public static void method3124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static32.aClass1_Sub17_Sub1_1.method2182(174);
		Static32.aClass1_Sub17_Sub1_1.method2166(arg0);
		Static32.aClass1_Sub17_Sub1_1.method2144(arg1);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIII)V")
	public static void method3125(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class93 local10 = Static186.method3524(arg2, arg0);
		if (local10 != null && local10.anObjectArray11 != null) {
			@Pc(19) Class1_Sub29 local19 = new Class1_Sub29();
			local19.anObjectArray33 = local10.anObjectArray11;
			local19.aClass93_119 = local10;
			Static144.method2381(local19);
		}
		Static58.anInt1154 = arg1;
		Static169.anInt3444 = arg2;
		Static234.aBoolean218 = true;
		Static138.anInt2812 = arg0;
		Static66.method999(local10);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(III)V")
	public static void method3130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class91 local7 = Static181.method2968(arg0);
		@Pc(10) int local10 = local7.anInt3503;
		@Pc(13) int local13 = local7.anInt3507;
		@Pc(16) int local16 = local7.anInt3510;
		@Pc(22) int local22 = Class1_Sub1_Sub4.anIntArray42[local16 - local13];
		if (arg1 < 0 || arg1 > local22) {
			arg1 = 0;
		}
		local22 <<= local13;
		Static209.method3278(~local22 & Static24.anIntArray49[local10] | local22 & arg1 << local13, local10);
	}
}
