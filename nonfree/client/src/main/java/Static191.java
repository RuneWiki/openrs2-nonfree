import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!gj", name = "o", descriptor = "Lclient!tf;")
	public static Class17 aClass17_30;

	@OriginalMember(owner = "client!gj", name = "u", descriptor = "Lclient!tf;")
	public static Class17 aClass17_31;

	@OriginalMember(owner = "client!gj", name = "x", descriptor = "Lclient!cr;")
	public static Class51 aClass51_2;

	@OriginalMember(owner = "client!gj", name = "v", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_74 = new Class151(115, 0);

	@OriginalMember(owner = "client!gj", name = "w", descriptor = "I")
	public static int anInt3219 = 0;

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "(II)Z")
	public static boolean method2969(@OriginalArg(1) int arg0) {
		for (@Pc(17) Class4_Sub5_Sub17 local17 = (Class4_Sub5_Sub17) Static87.aClass163_14.method3639(); local17 != null; local17 = (Class4_Sub5_Sub17) Static87.aClass163_14.method3640()) {
			if (Static98.method1982(local17.anInt7673) && local17.aLong226 == (long) arg0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)V")
	public static void method2971() {
		@Pc(7) int local7 = Static518.anInt10290;
		@Pc(9) int[] local9 = Static489.anIntArray519;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class3_Sub1_Sub2_Sub2_Sub1 local19 = Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[local9[local11]];
			if (local19 != null) {
				Static519.method7022(local19, local19.method8514());
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)Lclient!qja;")
	public static Class3_Sub1_Sub5 method2972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class73 local7 = Static267.aClass73ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass3_Sub1_Sub5_1 == null ? null : local7.aClass3_Sub1_Sub5_1;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIII)V")
	public static void method2974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 >= Static472.anInt7503 && arg3 <= Static257.anInt4172 && arg4 >= Static73.anInt1542 && Static527.anInt8177 >= arg2) {
			Static433.method5970(arg3, arg0, arg1, arg2, arg4);
		} else {
			Static475.method6533(arg0, arg1, arg2, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2975(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(15) Class4_Sub27 local15 = null;
		for (@Pc(20) Class4_Sub27 local20 = (Class4_Sub27) Static26.aClass163_13.method3639(); local20 != null; local20 = (Class4_Sub27) Static26.aClass163_13.method3640()) {
			if (arg0 == local20.anInt4668 && arg3 == local20.anInt4663 && local20.anInt4666 == arg4 && local20.anInt4662 == arg6) {
				local15 = local20;
				break;
			}
		}
		if (local15 == null) {
			local15 = new Class4_Sub27();
			local15.anInt4668 = arg0;
			local15.anInt4662 = arg6;
			local15.anInt4663 = arg3;
			local15.anInt4666 = arg4;
			if (arg3 >= 0 && arg4 >= 0 && Static224.anInt3557 > arg3 && Static267.anInt4309 > arg4) {
				Static464.method6459(local15);
			}
			Static26.aClass163_13.method3646(local15);
		}
		local15.aBoolean347 = true;
		local15.aBoolean348 = false;
		local15.anInt4660 = arg2;
		local15.anInt4665 = arg5;
		local15.anInt4659 = arg1;
	}
}
