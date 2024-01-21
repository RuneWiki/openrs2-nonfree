import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
	public static int anInt3563;

	@OriginalMember(owner = "client!ph", name = "s", descriptor = "[Lclient!rh;")
	public static Class1_Sub1_Sub1_Sub4[] aClass1_Sub1_Sub1_Sub4Array8;

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
	public static int anInt3557 = -1;

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1198 = Static49.method1293("Prepared visibility map");

	@OriginalMember(owner = "client!ph", name = "f", descriptor = "[I")
	public static int[] anIntArray337 = new int[100];

	@OriginalMember(owner = "client!ph", name = "z", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1199 = aClass70_1198;

	@OriginalMember(owner = "client!ph", name = "D", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1200 = Static49.method1293("::errortest");

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!u;Z)V")
	public static void method2652(@OriginalArg(0) Class76 arg0) {
		Static45.aClass76_42 = arg0;
	}

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "(I)V")
	public static void method2655() {
		aClass70_1198 = null;
		aClass1_Sub1_Sub1_Sub4Array8 = null;
		anIntArray337 = null;
		aClass70_1199 = null;
		aClass70_1200 = null;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIB)V")
	public static void method2656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static162.anInt4331 < 2 && Static58.anInt1876 == 0 && !Static167.aBoolean170) {
			return;
		}
		@Pc(51) Class70 local51;
		if (Static58.anInt1876 == 1 && Static162.anInt4331 < 2) {
			local51 = Static160.method3210(new Class70[] { Static170.aClass70_1480, Static3.aClass70_51, Static111.aClass70_1012, Static167.aClass70_1463 });
		} else if (Static167.aBoolean170 && Static162.anInt4331 < 2) {
			local51 = Static160.method3210(new Class70[] { Static161.aClass70_1436, Static3.aClass70_51, Static5.aClass70_59, Static167.aClass70_1463 });
		} else {
			local51 = Static158.method3173(Static162.anInt4331 - 1);
		}
		if (Static162.anInt4331 > 2) {
			local51 = Static160.method3210(new Class70[] { local51, Static143.aClass70_1290, Static34.method873(Static162.anInt4331 - 2), Static26.aClass70_250 });
		}
		@Pc(131) int local131 = Static124.aClass1_Sub1_Sub1_Sub2_Sub1_5.method2380(local51, arg1 + 4, arg0 + 15, Static49.aRandom1, Static67.anInt2094);
		Static169.method3346(arg1 + 4, arg0, 15, local131 + Static124.aClass1_Sub1_Sub1_Sub2_Sub1_5.method2374(local51));
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I")
	public static int method2659(@OriginalArg(1) KeyEvent arg0) {
		@Pc(6) int local6 = arg0.getKeyChar();
		if (local6 == 8364) {
			return 128;
		} else {
			if (local6 <= 0 || local6 >= 256) {
				local6 = -1;
			}
			return local6;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIII)Z")
	public static boolean method2661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = arg2 * Static114.anInt3121 + arg0 * Static66.anInt2085 >> 16;
		@Pc(19) int local19 = arg2 * Static66.anInt2085 - arg0 * Static114.anInt3121 >> 16;
		@Pc(29) int local29 = arg1 * Static161.anInt4213 + local19 * Static171.anInt4443 >> 16;
		@Pc(39) int local39 = arg1 * Static171.anInt4443 - local19 * Static161.anInt4213 >> 16;
		if (local29 >= 50 && local29 <= 3500) {
			@Pc(55) int local55 = Static16.anInt462 + (local9 << 9) / local29;
			@Pc(63) int local63 = Static121.anInt3318 + (local39 << 9) / local29;
			return local55 >= Static112.anInt4361 && local55 <= Static7.anInt283 && local63 >= Static6.anInt272 && local63 <= Static89.anInt2607;
		} else {
			return false;
		}
	}
}
