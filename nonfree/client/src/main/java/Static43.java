import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
	public static int anInt5196;

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "Lclient!ng;")
	public static final Class167 aClass167_74 = new Class167(5);

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_196 = new Class137(20, 8);

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "Lclient!ai;")
	public static final Class6 aClass6_3 = new Class6("stellardawn", 1);

	@OriginalMember(owner = "client!cb", name = "q", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray44 = new String[100];

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
	public static int anInt5197 = -1;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIB)V")
	public static void method4049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			Static5.method94(Static75.aClass137_69);
		}
		if (arg2 == 1) {
			Static5.method94(Static76.aClass137_70);
		}
		Static75.aClass1_Sub11_Sub1_1.method4454(Static321.aClass31_4.method3798(82) ? 1 : 0);
		Static75.aClass1_Sub11_Sub1_1.method4448(Static278.anInt4392 + arg0);
		Static75.aClass1_Sub11_Sub1_1.method4474(Static101.anInt6646 + arg1);
		Static18.aBoolean29 = false;
		Static313.anInt5206 = arg0;
		Static174.anInt2859 = arg1;
		Static124.method1715();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!m;ILjava/awt/Canvas;)Lclient!qa;")
	public static Class128 method4050(@OriginalArg(0) int arg0, @OriginalArg(1) Interface8 arg1, @OriginalArg(3) Canvas arg2) {
		return new Class128_Sub1(arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIZI)V")
	public static void method4052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (Static271.anInt4271 <= arg5 && arg3 <= Static13.anInt263 && arg1 >= Static74.anInt1413 && Static149.anInt7384 >= arg2) {
			if (arg4 == 1) {
				Static266.method2727(arg3, arg2, arg1, arg5, arg0);
			} else {
				Static102.method1467(arg5, arg2, arg4, arg3, arg0, arg1);
			}
		} else if (arg4 == 1) {
			Static157.method2196(arg2, arg5, arg3, arg1, arg0);
		} else {
			Static11.method183(arg1, arg3, arg2, arg5, arg0, arg4);
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!sq;I)Lclient!lg;")
	public static Class146 method4054(@OriginalArg(0) int arg0, @OriginalArg(1) Class20_Sub3 arg1) {
		@Pc(15) Class146 local15;
		if (Static120.aClass146_4 == null) {
			local15 = new Class146();
		} else {
			local15 = Static120.aClass146_4;
			Static120.aClass146_4 = Static120.aClass146_4.aClass146_3;
			Static31.anInt625--;
			local15.aClass146_3 = null;
		}
		local15.anInt3663 = arg0;
		local15.aClass20_Sub3_1 = arg1;
		return local15;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(IIIB)V")
	public static void method4055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class1_Sub3_Sub13 local10 = Static397.method4998(9, arg2);
		local10.method3459();
		local10.anInt4297 = arg0;
		local10.anInt4301 = arg1;
	}
}
