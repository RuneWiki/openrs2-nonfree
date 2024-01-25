import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "Lclient!r;")
	public static Class134 aClass134_1;

	@OriginalMember(owner = "client!aj", name = "j", descriptor = "[Lclient!rk;")
	public static final Class290[] aClass290Array2 = new Class290[14];

	@OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
	public static int anInt203 = 0;

	@OriginalMember(owner = "client!aj", name = "p", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_5 = new Class70(2, -1);

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(II[[[BIILclient!r;IIIIIII)V")
	public static void method151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class134 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg3 == 0 || arg8 == 0) {
			return;
		}
		if (arg3 == 9) {
			arg10 = arg10 + 1 & 0x3;
			arg3 = 1;
		}
		if (arg3 == 10) {
			arg3 = 1;
			arg10 = arg10 + 3 & 0x3;
		}
		if (arg3 == 11) {
			arg10 = arg10 + 3 & 0x3;
			arg3 = 8;
		}
		arg5.IA(arg9, arg11, arg6, arg7, arg0, arg4, arg2[arg3 - 1][arg10], arg8, arg1);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILclient!vg;)V")
	public static void method155(@OriginalArg(1) Class341 arg0) {
		@Pc(15) Class341 local15 = Static157.method2282(arg0);
		@Pc(23) int local23;
		@Pc(20) int local20;
		if (local15 == null) {
			local23 = Static130.anInt2566;
			local20 = Static499.anInt4149;
		} else {
			local20 = local15.anInt9248;
			local23 = local15.anInt9300;
		}
		Static546.method7461(arg0, false, local20, local23);
		Static227.method3464(local20, arg0, local23);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!vg;B)V")
	public static void method156(@OriginalArg(0) Class341 arg0) {
		if (!Static573.aBoolean740) {
			return;
		}
		if (arg0.anObjectArray19 != null) {
			@Pc(18) Class341 local18 = Static49.method751(Static48.anInt840, Static84.anInt8888);
			if (local18 != null) {
				@Pc(24) Class1_Sub15 local24 = new Class1_Sub15();
				local24.anObjectArray1 = arg0.anObjectArray19;
				local24.aClass341_9 = local18;
				local24.aClass341_10 = arg0;
				Static80.method1451(local24);
			}
		}
		@Pc(41) Class1_Sub11 local41 = Static276.method3885(Static426.aClass70_74, Static481.aClass276_2);
		local41.aClass1_Sub35_Sub2_1.method5792(arg0.anInt9306);
		local41.aClass1_Sub35_Sub2_1.method5740(arg0.anInt9328);
		local41.aClass1_Sub35_Sub2_1.method5776(Static78.anInt1494);
		local41.aClass1_Sub35_Sub2_1.method5803(Static48.anInt840);
		local41.aClass1_Sub35_Sub2_1.method5764(arg0.anInt9270);
		local41.aClass1_Sub35_Sub2_1.method5764(Static84.anInt8888);
		Static48.method743(local41);
	}
}
