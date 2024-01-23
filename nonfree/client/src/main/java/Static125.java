import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!im", name = "k", descriptor = "[Lclient!ma;")
	public static Class56[] aClass56Array3;

	@OriginalMember(owner = "client!im", name = "h", descriptor = "Lclient!jh;")
	public static Class97 aClass97_1 = new Class97();

	@OriginalMember(owner = "client!im", name = "m", descriptor = "Lclient!cc;")
	public static Class26 aClass26_23 = new Class26(64);

	@OriginalMember(owner = "client!im", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString139 = "Face here";

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method1927(@OriginalArg(1) Component arg0) {
		@Pc(1) Method local1 = Static215.aMethod2;
		if (local1 != null) {
			try {
				local1.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(20) Throwable local20) {
			}
		}
		arg0.addKeyListener(Static275.aClass164_1);
		arg0.addFocusListener(Static275.aClass164_1);
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(BI)Lclient!gb;")
	public static Class63_Sub1 method1928(@OriginalArg(1) int arg0) {
		return Static258.aBoolean339 && Static243.anInt4616 <= arg0 && Static39.anInt645 >= arg0 ? Static75.aClass63_Sub1Array1[arg0 - Static243.anInt4616] : null;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IBIII)V")
	public static void method1929(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static138.anInt2644 < 100) {
			Static124.method1923();
		}
		if (Static94.aBoolean138) {
			Static104.method1694(arg2, arg1, arg2 + arg3, arg0 + arg1);
		} else {
			Static270.method4246(arg2, arg1, arg3 + arg2, arg1 + arg0);
		}
		@Pc(47) int local47;
		@Pc(59) int local59;
		if (Static138.anInt2644 < 100) {
			local47 = arg3 / 2 + arg2;
			local59 = arg1 + arg0 / 2 - 18 - 20;
			if (Static94.aBoolean138) {
				Static104.method1702(arg2, arg1, arg3, arg0, 0);
				Static104.method1691(local47 - 152, local59, 304, 34, 9179409);
				Static104.method1702(local47 - 150, local59 - -2, Static138.anInt2644 * 3, 30, 9179409);
			} else {
				Static270.method4242(arg2, arg1, arg3, arg0, 0);
				Static270.method4259(local47 - 152, local59, 304, 34, 9179409);
				Static270.method4242(local47 - 150, local59 + 2, Static138.anInt2644 * 3, 30, 9179409);
			}
			Static211.aClass4_Sub3_Sub5_3.method2278(Static55.aString68, local47, local59 + 20, 16777215, -1);
			return;
		}
		Static302.anInt5684 = (int) ((float) (arg0 * 2) / Static121.aFloat68);
		Static187.anInt3546 = Static275.anInt5232 - (int) ((float) arg0 / Static121.aFloat68);
		Static131.anInt2542 = Static22.anInt331 - (int) ((float) arg3 / Static121.aFloat68);
		Static281.anInt5332 = (int) ((float) (arg3 * 2) / Static121.aFloat68);
		@Pc(169) int local169 = Static22.anInt331 - (int) ((float) arg3 / Static121.aFloat68);
		local47 = Static275.anInt5232 - (int) ((float) arg0 / Static121.aFloat68);
		local59 = (int) ((float) arg3 / Static121.aFloat68) + Static22.anInt331;
		@Pc(198) int local198 = (int) ((float) arg0 / Static121.aFloat68) + Static275.anInt5232;
		@Pc(218) Class114 local218;
		if (Static94.aBoolean138) {
			if (Static92.aClass4_Sub3_Sub14_Sub1_2 == null || arg3 != Static92.aClass4_Sub3_Sub14_Sub1_2.anInt5610 || Static92.aClass4_Sub3_Sub14_Sub1_2.anInt5609 != arg0) {
				Static92.aClass4_Sub3_Sub14_Sub1_2 = null;
				Static92.aClass4_Sub3_Sub14_Sub1_2 = new Class4_Sub3_Sub14_Sub1(arg3, arg0);
			}
			Static270.method4261(Static92.aClass4_Sub3_Sub14_Sub1_2.anIntArray241, arg3, arg0);
			Static121.method2408(local169, local47, local59, local198, 0, 0, arg3, arg0 + 1);
			Static121.method2410();
			local218 = Static121.method2404();
			Static11.method193(local218, arg2, arg1);
			Static92.aClass4_Sub3_Sub14_Sub1_2.method2170();
			Static104.method1698(Static92.aClass4_Sub3_Sub14_Sub1_2.anIntArray241, arg2, arg1, arg3, arg0);
			Static270.anIntArray561 = null;
		} else {
			Static121.method2408(local169, local47, local59, local198, arg2, arg1, arg3 + arg2, arg0 + 1 + arg1);
			Static121.method2410();
			local218 = Static121.method2404();
			Static11.method193(local218, 0, 0);
		}
		if (Static145.anInt2853 > 0) {
			Static216.anInt4216--;
			if (Static216.anInt4216 == 0) {
				Static216.anInt4216 = 20;
				Static145.anInt2853--;
			}
		}
		if (!Static132.aBoolean176) {
			return;
		}
		@Pc(310) int local310 = arg3 + arg2 - 5;
		@Pc(312) int local312 = 16776960;
		@Pc(318) int local318 = arg1 + arg0 - 8;
		Static197.aClass4_Sub3_Sub5_2.method2282("Fps:" + Static113.anInt2295, local310, local318, 16776960, -1);
		@Pc(334) Runtime local334 = Runtime.getRuntime();
		@Pc(335) int local335 = local318 - 15;
		@Pc(344) int local344 = (int) ((local334.totalMemory() - local334.freeMemory()) / 1024L);
		if (local344 > 65536) {
			local312 = 16711680;
		}
		Static197.aClass4_Sub3_Sub5_2.method2282("Mem:" + local344 + "k", local310, local335, local312, -1);
		local318 = local335 - 15;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V")
	public static void method1930() {
		Static24.aClass4_Sub3_Sub10_2 = null;
		Static3.aClass4_Sub3_Sub10_1 = null;
		Static82.aClass4_Sub3_Sub10_3 = null;
		Static130.aClass4_Sub3_Sub10_4 = null;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIIZ)V")
	public static void method1931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static48.anInt902 <= arg0 && Static131.anInt2553 >= arg0) {
			@Pc(20) int local20 = Static3.method9(Static156.anInt3086, arg1, Static218.anInt4231);
			@Pc(26) int local26 = Static3.method9(Static156.anInt3086, arg2, Static218.anInt4231);
			Static22.method306(arg0, arg3, local26, local20);
		}
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(I)V")
	public static void method1933() {
		if (Static154.aClass53_Sub1_Sub1_2 != null && Static154.aClass53_Sub1_Sub1_2.anInt3974 + 64 - Static154.aClass53_Sub1_Sub1_2.method3324() * 64 >> 7 == Static239.anInt4507 && Static154.aClass53_Sub1_Sub1_2.anInt4002 + 64 - Static154.aClass53_Sub1_Sub1_2.method3324() * 64 >> 7 == Static102.anInt2140) {
			Static105.aBoolean147 = false;
			Static239.anInt4507 = 0;
		}
		@Pc(46) int local46;
		for (local46 = 0; local46 < 104; local46++) {
			for (@Pc(53) int local53 = 0; local53 < 104; local53++) {
				Static10.anIntArrayArray2[local46][local53] = 0;
			}
		}
		for (local46 = 0; local46 < Static129.anInt2510; local46++) {
			@Pc(92) Class53_Sub1_Sub1 local92 = Static182.aClass53_Sub1_Sub1Array1[Static172.anIntArray317[local46]];
			if (local92 != null) {
				local92.aBoolean281 = false;
			}
		}
		for (local46 = 0; local46 < Static236.anInt4452; local46++) {
			@Pc(112) Class53_Sub1_Sub2 local112 = Static110.aClass53_Sub1_Sub2Array1[Static278.anIntArray595[local46]];
			if (local112 != null) {
				local112.aBoolean281 = false;
			}
		}
	}
}
