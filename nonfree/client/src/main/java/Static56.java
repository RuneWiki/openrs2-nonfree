import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "[I")
	public static int[] anIntArray110;

	@OriginalMember(owner = "client!fj", name = "f", descriptor = "Lclient!gi;")
	public static Class38 aClass38_1;

	@OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
	public static int anInt1166;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_399 = Static161.method2452("<col=ffffff> )4 ");

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
	public static int anInt1162 = 99;

	@OriginalMember(owner = "client!fj", name = "h", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_400 = Static161.method2452(" has logged in)3");

	@OriginalMember(owner = "client!fj", name = "i", descriptor = "Lclient!dc;")
	public static Class20 aClass20_401 = aClass20_400;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!dc;Lclient!dc;Lclient!dc;B)V")
	public static void method950(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) Class20 arg2) {
		Static17.aClass20_158 = arg1;
		Static17.aClass20_157 = arg2;
		Static17.aClass20_160 = arg0;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIZIBLclient!dj;I)V")
	public static void method952(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte arg3, @OriginalArg(5) Class23_Sub1 arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = (long) ((arg5 << 16) + arg2);
		@Pc(13) Class5_Sub2_Sub26 local13 = (Class5_Sub2_Sub26) Static18.aClass75_2.method2072(local7);
		if (local13 != null) {
			return;
		}
		local13 = (Class5_Sub2_Sub26) Static86.aClass75_9.method2072(local7);
		if (local13 != null) {
			return;
		}
		local13 = (Class5_Sub2_Sub26) Static59.aClass75_6.method2072(local7);
		if (local13 == null) {
			if (!arg1) {
				local13 = (Class5_Sub2_Sub26) Static178.aClass75_14.method2072(local7);
				if (local13 != null) {
					return;
				}
			}
			local13 = new Class5_Sub2_Sub26();
			local13.aClass23_Sub1_27 = arg4;
			local13.aByte14 = arg3;
			local13.anInt3985 = arg0;
			if (arg1) {
				Static18.aClass75_2.method2069(local13, local7);
				Static26.anInt4032++;
			} else {
				Static217.aClass32_2.method919(local13);
				Static59.aClass75_6.method2069(local13, local7);
				Static129.anInt2691++;
			}
		} else if (arg1) {
			local13.method3014();
			Static18.aClass75_2.method2069(local13, local7);
			Static26.anInt4032++;
			Static129.anInt2691--;
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIIBIII)V")
	public static void method953(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 == arg1) {
			Static209.method3116(arg6, arg5, arg2, arg4, arg0, arg3);
		} else if (arg0 - arg3 >= Static27.anInt493 && arg3 + arg0 <= Static72.anInt1572 && arg5 - arg1 >= Static173.anInt3464 && Static174.anInt3493 >= arg1 + arg5) {
			Static107.method1725(arg2, arg0, arg6, arg3, arg5, arg4, arg1);
		} else {
			Static189.method2823(arg5, arg1, arg4, arg3, arg2, arg0, arg6);
		}
	}
}
