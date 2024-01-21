import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
	public static int anInt2050;

	@OriginalMember(owner = "client!jd", name = "i", descriptor = "[Lclient!he;")
	public static Class1_Sub1_Sub5_Sub2[] aClass1_Sub1_Sub5_Sub2Array10;

	@OriginalMember(owner = "client!jd", name = "m", descriptor = "Lclient!he;")
	public static Class1_Sub1_Sub5_Sub2 aClass1_Sub1_Sub5_Sub2_7;

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
	public static int anInt2055 = 0;

	@OriginalMember(owner = "client!jd", name = "l", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1315 = Static69.method1153("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!jd", name = "r", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1316 = Static69.method1153("backvmid3");

	@OriginalMember(owner = "client!jd", name = "s", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1317 = Static69.method1153("*6n");

	@OriginalMember(owner = "client!jd", name = "t", descriptor = "I")
	public static int anInt2061 = 0;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V")
	public static void method1458() {
		aClass64_1315 = null;
		aClass64_1317 = null;
		aClass1_Sub1_Sub5_Sub2_7 = null;
		aClass1_Sub1_Sub5_Sub2Array10 = null;
		aClass64_1316 = null;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)V")
	public static void method1460(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub14 local10 = (Class1_Sub14) Static110.aClass58_8.method1380((long) arg0);
		if (local10 != null) {
			local10.method2076();
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BJ)V")
	public static void method1461(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static73.anInt1656 >= 100) {
			Static71.method1178(Static60.aClass64_862, Static109.aClass64_1647, 0);
			return;
		}
		@Pc(27) Class64 local27 = Static34.method565(arg0).method1478();
		for (@Pc(34) int local34 = 0; local34 < Static73.anInt1656; local34++) {
			if (Static69.aLongArray5[local34] == arg0) {
				Static71.method1178(Static60.aClass64_862, Static82.method1383(new Class64[] { local27, Static58.aClass64_822 }), 0);
				return;
			}
		}
		for (@Pc(73) int local73 = 0; local73 < Static106.anInt2498; local73++) {
			if (arg0 == Static14.aLongArray1[local73]) {
				Static71.method1178(Static60.aClass64_862, Static82.method1383(new Class64[] { Static40.aClass64_606, local27, Static68.aClass64_967 }), 0);
				return;
			}
		}
		if (!local27.method1496(Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.aClass64_1543)) {
			Static69.aLongArray5[Static73.anInt1656++] = arg0;
			Static19.aBoolean41 = true;
			Static49.aClass1_Sub6_Sub1_1.method1877(90);
			Static49.aClass1_Sub6_Sub1_1.method1830(arg0);
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method1462(@OriginalArg(0) Component arg0) {
		@Pc(5) Method local5 = Static35.aMethod1;
		if (local5 != null) {
			try {
				local5.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(19) Throwable local19) {
			}
		}
		arg0.addKeyListener(Static74.aClass69_1);
		arg0.addFocusListener(Static74.aClass69_1);
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)V")
	public static void method1463() {
		if (!Static61.aBoolean81) {
			return;
		}
		Static6.anIntArray47 = null;
		Static102.anIntArray342 = null;
		Static105.aClass37_35 = null;
		Static15.aClass1_Sub1_Sub5_Sub2_1 = null;
		Static61.aClass37_21 = null;
		Static98.aClass37_30 = null;
		Static52.anIntArray449 = null;
		Static20.aClass1_Sub1_Sub5_Sub3_4 = null;
		Static51.aClass37_16 = null;
		Static77.aClass37_28 = null;
		Static62.aClass37_23 = null;
		Static20.aClass37_9 = null;
		Static92.aClass1_Sub1_Sub5_Sub3_16 = null;
		Static58.aClass37_19 = null;
		Static15.aClass1_Sub1_Sub5_Sub3Array1 = null;
		Static34.anIntArray120 = null;
		Static64.aClass1_Sub1_Sub5_Sub2_4 = null;
		Static52.anIntArray448 = null;
		Static94.aClass37_29 = null;
		Static64.anIntArray228 = null;
		Static51.anIntArray166 = null;
		Static49.anIntArray162 = null;
		Static65.method1107();
		Static69.method1140(true);
		Static61.aBoolean81 = false;
	}
}
