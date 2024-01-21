import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!ue", name = "I", descriptor = "[I")
	public static int[] anIntArray332;

	@OriginalMember(owner = "client!ue", name = "P", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!ue", name = "E", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1353 = Static14.method2017("chatback");

	@OriginalMember(owner = "client!ue", name = "F", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1354 = Static14.method2017("backhmid1");

	@OriginalMember(owner = "client!ue", name = "H", descriptor = "[I")
	public static int[] anIntArray331 = new int[2000];

	@OriginalMember(owner = "client!ue", name = "J", descriptor = "I")
	public static int anInt2739 = 0;

	@OriginalMember(owner = "client!ue", name = "Q", descriptor = "[I")
	public static int[] anIntArray333 = new int[25];

	@OriginalMember(owner = "client!ue", name = "W", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1355 = Static14.method2017("Freund hinzuf-Ugen");

	@OriginalMember(owner = "client!ue", name = "ab", descriptor = "I")
	public static int anInt2749 = 0;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IB)Z")
	public static boolean method1938(@OriginalArg(0) int arg0) {
		return (arg0 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(B)V")
	public static void method1939() {
		try {
			@Pc(6) Graphics local6 = aCanvas1.getGraphics();
			Static77.aClass14_26.method1470(0, local6, 4);
			Static3.aClass14_18.method1470(0, local6, 357);
			Static17.aClass14_5.method1470(722, local6, 4);
			Static43.aClass14_15.method1470(743, local6, 205);
			Static63.aClass14_23.method1470(0, local6, 0);
			Static3.aClass14_17.method1470(516, local6, 4);
			Static34.aClass14_9.method1470(516, local6, 205);
			Static52.aClass14_20.method1470(496, local6, 357);
			Static9.aClass14_4.method1470(0, local6, 338);
		} catch (@Pc(70) Exception local70) {
			aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!kc;ILclient!ac;Lclient!kc;)[Lclient!nd;")
	public static Class2_Sub1_Sub1_Sub3[] method1940(@OriginalArg(0) Class36 arg0, @OriginalArg(2) Class3 arg1, @OriginalArg(3) Class36 arg2) {
		@Pc(8) int local8 = arg1.method932(arg0);
		@Pc(22) int local22 = arg1.method936(local8, arg2);
		return Static53.method1008(local22, local8, arg1);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZII)I")
	public static int method1941(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		arg0 = (arg1 & 0x7F) * arg0 / 128;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "(B)V")
	public static void method1942() {
		Static26.aClass22_7.method716();
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V")
	public static void method1943() {
		for (@Pc(10) Class2_Sub9 local10 = (Class2_Sub9) Static20.aClass8_1.method175(); local10 != null; local10 = (Class2_Sub9) Static20.aClass8_1.method173()) {
			if (local10.aClass2_Sub3_Sub1_2 != null) {
				Static100.aClass2_Sub3_Sub2_1.method2061(local10.aClass2_Sub3_Sub1_2);
				local10.aClass2_Sub3_Sub1_2 = null;
			}
			if (local10.aClass2_Sub3_Sub1_1 != null) {
				Static100.aClass2_Sub3_Sub2_1.method2061(local10.aClass2_Sub3_Sub1_1);
				local10.aClass2_Sub3_Sub1_1 = null;
			}
		}
		Static20.aClass8_1.method179();
	}

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "(I)V")
	public static void method1944() {
		aClass36_1354 = null;
		aCanvas1 = null;
		anIntArray333 = null;
		anIntArray331 = null;
		anIntArray332 = null;
		aClass36_1355 = null;
		aClass36_1353 = null;
	}
}
