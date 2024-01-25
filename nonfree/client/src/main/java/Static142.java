import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!eu", name = "j", descriptor = "I")
	public static int anInt3372;

	@OriginalMember(owner = "client!eu", name = "l", descriptor = "Lclient!ufa;")
	public static Class4 aClass4_10;

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(ZLclient!ac;)V")
	public static void method2805(@OriginalArg(1) Class5_Sub1 arg0) {
		@Pc(12) byte[] local12;
		if (Static313.anObject14 == null) {
			@Pc(5) Class78_Sub2_Sub1 local5 = new Class78_Sub2_Sub1();
			local12 = local5.method4427();
			Static313.anObject14 = Static591.method8149(local12);
		}
		if (Static249.anObject11 == null) {
			@Pc(27) Class78_Sub1_Sub1 local27 = new Class78_Sub1_Sub1();
			local12 = local27.method2597();
			Static249.anObject11 = Static591.method8149(local12);
		}
		@Pc(42) Class135 local42 = arg0.aClass135_1;
		if (local42.method3846() && Static458.anObject18 == null) {
			local12 = Static362.method5841(16.0F, 0.5F, 0.6F, new Class53_Sub1(419684), 4.0F, 4.0F);
			Static458.anObject18 = Static591.method8149(local12);
		}
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2806(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class6_Sub36 local7 = null;
		for (@Pc(12) Class6_Sub36 local12 = (Class6_Sub36) Static354.aClass163_40.method4966(); local12 != null; local12 = (Class6_Sub36) Static354.aClass163_40.method4965()) {
			if (local12.anInt7724 == arg6 && local12.anInt7720 == arg0 && local12.anInt7721 == arg2 && arg3 == local12.anInt7726) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class6_Sub36();
			local7.anInt7721 = arg2;
			local7.anInt7726 = arg3;
			local7.anInt7724 = arg6;
			local7.anInt7720 = arg0;
			if (arg0 >= 0 && arg2 >= 0 && arg0 < Static306.anInt6176 && arg2 < Static108.anInt2930) {
				Static145.method2842(local7);
			}
			Static354.aClass163_40.method4967(local7);
		}
		local7.anInt7730 = arg1;
		local7.aBoolean609 = false;
		local7.anInt7722 = arg4;
		local7.aBoolean608 = true;
		local7.anInt7728 = arg5;
	}
}
