import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
	public static int anInt1795 = 0;

	@OriginalMember(owner = "client!cj", name = "k", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_44 = new Class272(105, 12);

	@OriginalMember(owner = "client!cj", name = "l", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_32 = new Class298(4, 6);

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IBI)V")
	public static void method1528(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class3_Sub3_Sub7 local15 = Static363.method5457(arg0, 14);
		local15.method839();
		local15.anInt1088 = arg1;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIIII)V")
	public static void method1530(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 - arg4 >= Static110.anInt2597 && Static459.anInt7524 >= arg4 + arg1 && Static385.anInt6630 <= arg2 - arg4 && arg2 + arg4 <= Static69.anInt1918) {
			Static463.method6423(arg1, arg5, arg0, arg2, arg3, arg4);
		} else {
			Static17.method296(arg1, arg2, arg5, arg4, arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)V")
	public static void method1532() {
		for (@Pc(13) Class3_Sub44 local13 = (Class3_Sub44) Static187.aClass130_15.method3543(); local13 != null; local13 = (Class3_Sub44) Static187.aClass130_15.method3551()) {
			if (Static186.method3191(local13.anInt7685)) {
				Static425.method6057(local13);
			}
		}
		if (Static151.anInt3123 == 1) {
			Static47.method788();
			return;
		}
		Static482.method6578(Static32.anInt717, Static50.anInt1065, Static324.anInt5822, Static343.anInt6039);
		@Pc(54) int local54 = Static159.aClass58_7.method1767(Static48.aClass33_26.method797(Static131.anInt2839));
		for (@Pc(59) Class3_Sub44 local59 = (Class3_Sub44) Static187.aClass130_15.method3543(); local59 != null; local59 = (Class3_Sub44) Static187.aClass130_15.method3551()) {
			@Pc(65) int local65 = Static373.method5518(local59);
			if (local65 > local54) {
				local54 = local65;
			}
		}
		Static32.anInt717 = Static151.anInt3123 * 16 + (Static490.aBoolean625 ? 26 : 22);
		Static324.anInt5822 = local54 + 8;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IILclient!mu;ZI)V")
	public static void method1534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub34 arg2, @OriginalArg(4) int arg3) {
		arg2.aClass3_Sub11_Sub1_2.method3101(arg1);
		arg2.aClass3_Sub11_Sub1_2.method3095(arg0);
		arg2.aClass3_Sub11_Sub1_2.method3095(arg3);
	}
}
