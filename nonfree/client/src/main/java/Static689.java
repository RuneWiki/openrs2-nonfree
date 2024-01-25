import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static689 {

	@OriginalMember(owner = "client!ww", name = "P", descriptor = "I")
	public static int anInt11198 = -2;

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(ILclient!jc;)Lclient!gh;")
	public static Class132 method9504(@OriginalArg(1) Class14_Sub21 arg0) {
		@Pc(10) Class258 local10 = Static428.method6432()[arg0.method7695(125)];
		@Pc(17) Class205 local17 = Static43.method711()[arg0.method7695(114)];
		@Pc(21) int local21 = arg0.method7752();
		@Pc(25) int local25 = arg0.method7752();
		@Pc(29) int local29 = arg0.method7717(-1978450544);
		@Pc(38) int local38 = arg0.method7717(-1978450544);
		@Pc(42) int local42 = arg0.method7752();
		@Pc(46) int local46 = arg0.method7748();
		@Pc(50) int local50 = arg0.method7748();
		return new Class132(local10, local17, local21, local25, local29, local38, local42, local46, local50);
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IIIIIIII)V")
	public static void method9506(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(5) Class14_Sub3 local5 = null;
		for (@Pc(10) Class14_Sub3 local10 = (Class14_Sub3) Static461.aClass32_44.method584(); local10 != null; local10 = (Class14_Sub3) Static461.aClass32_44.method577()) {
			if (local10.anInt231 == arg3 && local10.anInt233 == arg4 && local10.anInt224 == arg0 && local10.anInt227 == arg1) {
				local5 = local10;
				break;
			}
		}
		if (local5 == null) {
			local5 = new Class14_Sub3();
			local5.anInt233 = arg4;
			local5.anInt231 = arg3;
			local5.anInt227 = arg1;
			local5.anInt224 = arg0;
			if (arg4 >= 0 && arg0 >= 0 && arg4 < Static380.anInt6689 && arg0 < Static542.anInt9214) {
				Static607.method8541(local5);
			}
			Static461.aClass32_44.method582(local5);
		}
		local5.aBoolean19 = true;
		local5.anInt232 = arg5;
		local5.anInt230 = arg6;
		local5.anInt225 = arg2;
		local5.aBoolean18 = false;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IC)Z")
	public static boolean method9507(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}
}
