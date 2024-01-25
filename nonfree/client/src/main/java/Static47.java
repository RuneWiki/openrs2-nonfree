import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!cf", name = "l", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray7 = new String[100];

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZLjava/awt/Component;Z)Lclient!eb;")
	public static Class50 method887(@OriginalArg(1) Component arg0) {
		try {
			@Pc(32) Constructor local32 = Class.forName("Class50_Sub1").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class50) local32.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(50) Throwable local50) {
			return new Class50_Sub2(arg0, true);
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method888(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg2 < 0 || arg1 < 0 || Static373.anInt6324 - 1 <= arg2 || Static291.anInt5062 - 1 <= arg1) {
			return;
		}
		if (Static389.aClass227ArrayArrayArray3 == null) {
			return;
		}
		@Pc(41) Interface5 local41;
		if (arg0 == 0) {
			local41 = (Interface5) Static392.method5427(arg3, arg2, arg1);
			@Pc(47) Interface5 local47 = (Interface5) Static135.method2075(arg3, arg2, arg1);
			if (local41 != null && arg4 != 2) {
				if (local41 instanceof Class1_Sub3_Sub1) {
					((Class1_Sub3_Sub1) local41).aClass92_2.method2143(arg5);
				} else {
					Static85.method1525(arg0, arg5, arg2, local41.method6263(), arg1, arg3, arg6, arg4);
				}
			}
			if (local47 != null) {
				if (local47 instanceof Class1_Sub3_Sub1) {
					((Class1_Sub3_Sub1) local47).aClass92_2.method2143(arg5);
					return;
				}
				Static85.method1525(arg0, arg5, arg2, local47.method6263(), arg1, arg3, arg6, arg4);
				return;
			}
			return;
		}
		if (arg0 == 1) {
			local41 = (Interface5) Static222.method4446(arg3, arg2, arg1);
			if (local41 != null) {
				if (local41 instanceof Class1_Sub1_Sub1) {
					((Class1_Sub1_Sub1) local41).aClass92_1.method2143(arg5);
					return;
				}
				@Pc(135) int local135 = local41.method6263();
				if (arg4 != 4 && arg4 != 5) {
					if (arg4 == 6) {
						Static85.method1525(arg0, arg5, arg2, local135, arg1, arg3, arg6 + 4, 4);
						return;
					}
					if (arg4 == 7) {
						Static85.method1525(arg0, arg5, arg2, local135, arg1, arg3, (arg6 + 2 & 0x3) + 4, 4);
					} else if (arg4 == 8) {
						Static85.method1525(arg0, arg5, arg2, local135, arg1, arg3, arg6 + 4, 4);
						Static85.method1525(arg0, arg5, arg2, local135, arg1, arg3, (arg6 + 2 & 0x3) + 4, 4);
						return;
					}
					return;
				}
				Static85.method1525(arg0, arg5, arg2, local135, arg1, arg3, arg6, 4);
				return;
			}
			return;
		}
		if (arg0 != 2) {
			if (arg0 == 3) {
				local41 = (Interface5) Static112.method1824(arg3, arg2, arg1);
				if (local41 != null) {
					if (!(local41 instanceof Class1_Sub4_Sub1)) {
						Static85.method1525(arg0, arg5, arg2, local41.method6263(), arg1, arg3, arg6, arg4);
						return;
					}
					((Class1_Sub4_Sub1) local41).aClass92_3.method2143(arg5);
					return;
				}
			}
			return;
		}
		local41 = (Interface5) Static313.method4388(arg3, arg2, arg1, jt.class);
		if (local41 == null) {
			return;
		}
		if (arg4 == 11) {
			arg4 = 10;
		}
		if (local41 instanceof Class1_Sub2_Sub3) {
			((Class1_Sub2_Sub3) local41).aClass92_4.method2143(arg5);
			return;
		}
		Static85.method1525(arg0, arg5, arg2, local41.method6263(), arg1, arg3, arg6, arg4);
		return;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
	public static void method889() {
		Static301.aClass237_5.method5433();
		Static178.aClass231_4.method5385();
		Static421.aClass7_1.method143();
		Static9.aClass149_1.method3577();
		Static118.aClass19_1.method400();
		Static158.aClass272_1.method6271();
		Static444.aClass59_3.method1547();
		Static387.aClass201_2.method4776();
		Static256.aClass112_1.method2861();
		Static208.aClass159_1.method3762();
		Static212.aClass238_1.method5437();
		Static212.aClass45_3.method1257();
		Static462.aClass182_4.method4364();
		Static70.aClass15_1.method324();
		Static113.aClass206_2.method4881();
		Static335.aClass58_1.method1544();
		Static448.aClass172_1.method4196();
		Static84.aClass87_3.method2049();
		Static57.aClass98_1.method2341();
		Static227.aClass260_1.method5942();
		Static160.method2517();
		Static188.method2951();
		Static202.method3093();
		Static453.method6163();
		Static72.aClass268_12.method6173(5);
		Static313.aClass268_44.method6173(5);
		Static334.aClass268_46.method6173(5);
		Static437.aClass268_58.method6173(5);
		Static219.aClass268_31.method6173(5);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method891(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}
}
