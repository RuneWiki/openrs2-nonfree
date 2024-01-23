import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!li", name = "d", descriptor = "I")
	public static int anInt3331;

	@OriginalMember(owner = "client!li", name = "h", descriptor = "I")
	public static int anInt3333;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString189 = "wave2:";

	@OriginalMember(owner = "client!li", name = "c", descriptor = "[I")
	public static int[] anIntArray299 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!li", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString190 = "wave:";

	@OriginalMember(owner = "client!li", name = "f", descriptor = "Z")
	public static boolean aBoolean241 = false;

	@OriginalMember(owner = "client!li", name = "i", descriptor = "I")
	public static int anInt3334 = -1;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIII)Lclient!hm;")
	public static Class1_Sub17 method2704(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class1_Sub17 local9 = new Class1_Sub17();
		local9.anInt2431 = arg2;
		local9.anInt2430 = arg1;
		Static256.aClass70_17.method2084((long) arg0, local9);
		Static127.method2192(arg2);
		@Pc(28) Class71 local28 = Static56.method1058(arg0);
		if (local28 != null) {
			Static160.method2779(local28);
		}
		if (Static3.aClass71_1 != null) {
			Static160.method2779(Static3.aClass71_1);
			Static3.aClass71_1 = null;
		}
		@Pc(45) int local45 = Static134.anInt2945;
		@Pc(47) int local47;
		for (local47 = 0; local47 < local45; local47++) {
			if (Static26.method531(Static61.aShortArray23[local47])) {
				Static150.method2613(local47);
			}
		}
		if (Static134.anInt2945 == 1) {
			Static14.aBoolean23 = false;
			Static75.method1309(Static116.anInt5594, Static276.anInt2924, Static88.anInt1955, Static279.anInt5379);
		} else {
			Static75.method1309(Static116.anInt5594, Static276.anInt2924, Static88.anInt1955, Static279.anInt5379);
			local47 = Static134.aClass1_Sub2_Sub1_3.method451(Static185.aString226);
			for (@Pc(102) int local102 = 0; local102 < Static134.anInt2945; local102++) {
				@Pc(115) int local115 = Static134.aClass1_Sub2_Sub1_3.method451(Static132.method2239(local102));
				if (local47 < local115) {
					local47 = local115;
				}
			}
			Static276.anInt2924 = Static134.anInt2945 * 15 + (Static221.aBoolean340 ? 26 : 22);
			Static116.anInt5594 = local47 + 8;
		}
		if (local28 != null) {
			Static239.method3686(false, local28);
		}
		Static77.method1355(arg2);
		if (Static116.anInt5593 != -1) {
			Static90.method1588(1, Static116.anInt5593);
		}
		return local9;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	public static void method2705(@OriginalArg(0) Component arg0) {
		@Pc(6) Method local6 = Static288.aMethod2;
		if (local6 != null) {
			try {
				local6.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(20) Throwable local20) {
			}
		}
		arg0.addKeyListener(Static57.aClass94_1);
		arg0.addFocusListener(Static57.aClass94_1);
	}
}
