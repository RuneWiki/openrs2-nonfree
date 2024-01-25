import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static260 {

	@OriginalMember(owner = "client!om", name = "e", descriptor = "[I")
	public static final int[] anIntArray569 = new int[32];

	@OriginalMember(owner = "client!om", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString45 = null;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(B)V")
	public static void method4047() {
		Static129.aClass149_1.method3682();
		Static138.aClass78_1.method1814();
		if (Static30.aClass93_1 != null) {
			Static30.aClass93_1.method5590(Static170.aCanvas4);
		}
		Static384.aClient1.method867();
		Static170.aCanvas4.setBackground(Color.black);
		Static191.anInt3365 = -1;
		Static129.aClass149_1 = Static126.method2269(Static170.aCanvas4);
		Static138.aClass78_1 = Static63.method1164(Static170.aCanvas4);
		if (Static30.aClass93_1 != null) {
			Static30.aClass93_1.method5588(Static170.aCanvas4);
		}
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(I)V")
	public static void method4053() {
		Static176.method2855();
		Static321.aClass21_2 = null;
		Static362.aClass251ArrayArray1 = null;
		Static301.aClass21_1 = null;
		Static267.aClass82_6 = null;
		Static343.aClass21_3 = null;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(BZ)V")
	public static void method4054(@OriginalArg(1) boolean arg0) {
		Static137.method2397(Static335.anInt5875, arg0, Static226.anInt4223, Static263.anInt4662);
	}
}
