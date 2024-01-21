import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!vd", name = "W", descriptor = "I")
	public static int anInt4046;

	@OriginalMember(owner = "client!vd", name = "cb", descriptor = "I")
	public static int anInt4051;

	@OriginalMember(owner = "client!vd", name = "eb", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1398 = Static161.method2971("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!vd", name = "P", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1396 = aClass13_1398;

	@OriginalMember(owner = "client!vd", name = "Q", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1397 = Static161.method2971("cross");

	@OriginalMember(owner = "client!vd", name = "U", descriptor = "Z")
	public static boolean aBoolean316 = false;

	@OriginalMember(owner = "client!vd", name = "Z", descriptor = "I")
	public static int anInt4049 = 0;

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "(I)V")
	public static void method2963() {
		for (@Pc(8) Class1_Sub2_Sub2_Sub3 local8 = (Class1_Sub2_Sub2_Sub3) Static4.aClass82_1.method2849(); local8 != null; local8 = (Class1_Sub2_Sub2_Sub3) Static4.aClass82_1.method2855()) {
			if (Static156.anInt3696 != local8.anInt775 || Static78.anInt2168 > local8.anInt763) {
				local8.method3056();
			} else if (Static78.anInt2168 >= local8.anInt767) {
				if (local8.anInt768 > 0) {
					@Pc(36) Class1_Sub2_Sub2_Sub2_Sub1 local36 = Static181.aClass1_Sub2_Sub2_Sub2_Sub1Array1[local8.anInt768 - 1];
					if (local36 != null && local36.anInt2596 >= 0 && local36.anInt2596 < 13312 && local36.anInt2606 >= 0 && local36.anInt2606 < 13312) {
						local8.method684(Static78.anInt2168, local36.anInt2596, local36.anInt2606, Static66.method1449(local8.anInt775, local36.anInt2606, local36.anInt2596) - local8.anInt780);
					}
				}
				if (local8.anInt768 < 0) {
					@Pc(87) int local87 = -local8.anInt768 - 1;
					@Pc(92) Class1_Sub2_Sub2_Sub2_Sub2 local92;
					if (Static26.anInt947 == local87) {
						local92 = Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1;
					} else {
						local92 = Static45.aClass1_Sub2_Sub2_Sub2_Sub2Array1[local87];
					}
					if (local92 != null && local92.anInt2596 >= 0 && local92.anInt2596 < 13312 && local92.anInt2606 >= 0 && local92.anInt2606 < 13312) {
						local8.method684(Static78.anInt2168, local92.anInt2596, local92.anInt2606, Static66.method1449(local8.anInt775, local92.anInt2606, local92.anInt2596) - local8.anInt780);
					}
				}
				local8.method682(Static117.anInt3116);
				Static42.method1117(Static156.anInt3696, (int) local8.aDouble3, (int) local8.aDouble2, (int) local8.aDouble6, 60, local8, local8.anInt778, -1L, false);
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "(B)V")
	public static void method2964() {
		if (Static36.aString1.toLowerCase().indexOf("microsoft") != -1) {
			Static178.anIntArray445[192] = 58;
			Static178.anIntArray445[221] = 43;
			Static178.anIntArray445[220] = 74;
			Static178.anIntArray445[223] = 28;
			Static178.anIntArray445[189] = 26;
			Static178.anIntArray445[186] = 57;
			Static178.anIntArray445[191] = 73;
			Static178.anIntArray445[222] = 59;
			Static178.anIntArray445[190] = 72;
			Static178.anIntArray445[187] = 27;
			Static178.anIntArray445[219] = 42;
			Static178.anIntArray445[188] = 71;
			return;
		}
		Static178.anIntArray445[44] = 71;
		Static178.anIntArray445[92] = 74;
		Static178.anIntArray445[47] = 73;
		Static178.anIntArray445[46] = 72;
		Static178.anIntArray445[91] = 42;
		Static178.anIntArray445[93] = 43;
		Static178.anIntArray445[59] = 57;
		Static178.anIntArray445[45] = 26;
		if (Static36.aMethod1 == null) {
			Static178.anIntArray445[222] = 59;
			Static178.anIntArray445[192] = 58;
		} else {
			Static178.anIntArray445[222] = 58;
			Static178.anIntArray445[192] = 28;
			Static178.anIntArray445[520] = 59;
		}
		Static178.anIntArray445[61] = 27;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILclient!gi;I)V")
	public static void method2965(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub2_Sub2_Sub2 arg1) {
		if (Static78.anInt2168 < arg1.anInt2588) {
			Static37.method989(arg1);
		} else if (arg1.anInt2573 >= Static78.anInt2168) {
			Static182.method793(arg1);
		} else {
			Static66.method1451(arg1);
		}
		if (arg1.anInt2596 < 128 || arg1.anInt2606 < 128 || arg1.anInt2596 >= 13184 || arg1.anInt2606 >= 13184) {
			arg1.anInt2553 = -1;
			arg1.anInt2573 = 0;
			arg1.anInt2588 = 0;
			arg1.anInt2606 = arg1.anIntArray247[0] * 128 + arg1.anInt2583 * 64;
			arg1.anInt2596 = arg1.anIntArray246[0] * 128 + arg1.anInt2583 * 64;
			arg1.anInt2603 = -1;
			arg1.method1885();
		}
		if (Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1 == arg1 && (arg1.anInt2596 < 1536 || arg1.anInt2606 < 1536 || arg1.anInt2596 >= 11776 || arg1.anInt2606 >= 11776)) {
			arg1.anInt2573 = 0;
			arg1.anInt2588 = 0;
			arg1.anInt2553 = -1;
			arg1.anInt2596 = arg1.anIntArray246[0] * 128 + arg1.anInt2583 * 64;
			arg1.anInt2606 = arg1.anIntArray247[0] * 128 + arg1.anInt2583 * 64;
			arg1.anInt2603 = -1;
			arg1.method1885();
		}
		Static148.method2591(arg1);
		Static84.method1800(arg1);
	}

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "(B)V")
	public static void method2966() {
		aClass13_1396 = null;
		aClass13_1398 = null;
		aClass13_1397 = null;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method2968(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(Static140.aClass42_1);
		arg0.removeMouseMotionListener(Static140.aClass42_1);
		arg0.removeFocusListener(Static140.aClass42_1);
		Static184.anInt4079 = 0;
	}
}
