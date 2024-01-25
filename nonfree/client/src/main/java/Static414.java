import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

	@OriginalMember(owner = "client!oaa", name = "r", descriptor = "I")
	public static int anInt7188;

	@OriginalMember(owner = "client!oaa", name = "p", descriptor = "I")
	public static int anInt7189;

	@OriginalMember(owner = "client!oaa", name = "i", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_125 = new Class322(116, 5);

	@OriginalMember(owner = "client!oaa", name = "j", descriptor = "I")
	public static final int anInt7186 = 5000;

	@OriginalMember(owner = "client!oaa", name = "l", descriptor = "I")
	public static int anInt7187 = 0;

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIIIIIII)V")
	private static void method6393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(11) int local11 = Static9.method118(Static223.anInt4380, Static605.anInt9561, arg6);
		@Pc(17) int local17 = Static9.method118(Static223.anInt4380, Static605.anInt9561, arg7);
		@Pc(23) int local23 = Static9.method118(Static8.anInt136, Static398.anInt6878, arg0);
		@Pc(29) int local29 = Static9.method118(Static8.anInt136, Static398.anInt6878, arg4);
		@Pc(38) int local38 = Static9.method118(Static223.anInt4380, Static605.anInt9561, arg6 + arg5);
		@Pc(47) int local47 = Static9.method118(Static223.anInt4380, Static605.anInt9561, arg7 - arg5);
		for (@Pc(49) int local49 = local11; local49 < local38; local49++) {
			Static367.method5559(-7, local23, arg3, Static36.anIntArrayArray4[local49], local29);
		}
		if (arg2 > -40) {
			method6393(-41, 4, 71, -18, -8, 94, 27, 61);
		}
		for (@Pc(85) int local85 = local17; local85 > local47; local85--) {
			Static367.method5559(-7, local23, arg3, Static36.anIntArrayArray4[local85], local29);
		}
		@Pc(110) int local110 = Static9.method118(Static8.anInt136, Static398.anInt6878, arg0 + arg5);
		@Pc(119) int local119 = Static9.method118(Static8.anInt136, Static398.anInt6878, arg4 - arg5);
		for (@Pc(121) int local121 = local38; local121 <= local47; local121++) {
			@Pc(129) int[] local129 = Static36.anIntArrayArray4[local121];
			Static367.method5559(-7, local23, arg3, local129, local110);
			Static367.method5559(-7, local110, arg1, local129, local119);
			Static367.method5559(-7, local119, arg3, local129, local29);
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIIIBIII)V")
	public static void method6394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static398.anInt6878 <= arg0 && Static8.anInt136 >= arg2 && Static605.anInt9561 <= arg6 && Static223.anInt4380 >= arg5) {
			Static180.method3414(arg1, arg0, arg3, arg6, arg4, arg5, arg2);
		} else {
			method6393(arg0, arg4, -85, arg3, arg2, arg1, arg6, arg5);
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I)V")
	public static void method6396() {
		for (@Pc(11) Class6_Sub2_Sub2 local11 = (Class6_Sub2_Sub2) Static228.aClass82_5.method2071(); local11 != null; local11 = (Class6_Sub2_Sub2) Static228.aClass82_5.method2078()) {
			if (local11.anInt618 > 1) {
				local11.anInt618 = 0;
				Static519.aClass359_58.method8515(((Class6_Sub2_Sub11) local11.aClass82_1.aClass6_Sub2_17.aClass6_Sub2_65).aLong170, local11);
				local11.aClass82_1.method2075();
			}
		}
		Static574.anInt9192 = 0;
		Static539.anInt8776 = 0;
		Static116.aClass340_17.method8129();
		Static548.aClass74_63.method1398();
		Static228.aClass82_5.method2075();
		Static484.aBoolean623 = false;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ZIII[ILclient!ml;II)Lclient!gda;")
	public static Class44_Sub1_Sub1 method6397(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int[] arg2, @OriginalArg(5) Class75_Sub3 arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg3.aBoolean495 || Static232.method4114(arg1) && Static232.method4114(arg5)) {
			return new Class44_Sub1_Sub1(arg3, 3553, arg1, arg5, false, arg2, arg0, 0);
		} else if (arg3.aBoolean492) {
			return new Class44_Sub1_Sub1(arg3, 34037, arg1, arg5, false, arg2, arg0, 0);
		} else {
			return new Class44_Sub1_Sub1(arg3, arg1, arg5, Static314.method4970(arg1), Static314.method4970(arg5), arg2);
		}
	}
}
