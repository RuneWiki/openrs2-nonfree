import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!s", name = "N", descriptor = "Lclient!da;")
	public static Class14 aClass14_4;

	@OriginalMember(owner = "client!s", name = "R", descriptor = "D")
	public static double aDouble11;

	@OriginalMember(owner = "client!s", name = "M", descriptor = "[Lclient!ai;")
	public static final Class6_Sub1[] aClass6_Sub1Array1 = new Class6_Sub1[4];

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(I)V")
	public static void method2816() {
		@Pc(5) Object local5 = Static197.anObject4;
		synchronized (Static197.anObject4) {
			if (Static210.anInt4461 == 0) {
				Static153.aClass14_3.method625(new Class35(), 5);
			}
			Static210.anInt4461 = 600;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IBIII)V")
	public static void method2817(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static26.anInt775 == 1) {
			Static189.aClass1_Sub2_Sub5_Sub3Array12[Static184.anInt4067 / 100].method1315(Static93.anInt2338 - 8, Static30.anInt880 - 8);
		}
		if (Static26.anInt775 == 2) {
			Static189.aClass1_Sub2_Sub5_Sub3Array12[Static184.anInt4067 / 100 + 4].method1315(Static93.anInt2338 - 8, Static30.anInt880 - 8);
		}
		Static178.method3022();
		if (!Static172.aBoolean154) {
			return;
		}
		@Pc(51) int local51 = arg1 + 512 - 5;
		@Pc(55) int local55 = arg2 + 20;
		Static200.aClass1_Sub2_Sub5_Sub4_Sub1_5.method1602(Static109.method2004(new Class65[] { Static114.aClass65_1619, Static118.method2250(Static81.anInt2015) }), local51, local55, 16776960, -1);
		@Pc(77) Runtime local77 = Runtime.getRuntime();
		@Pc(79) int local79 = 16776960;
		@Pc(80) int local80 = local55 + 15;
		@Pc(90) int local90 = (int) ((local77.totalMemory() - local77.freeMemory()) / 1024L);
		if (local90 > 32768 && Static13.aBoolean36) {
			local79 = 16711680;
		}
		if (local90 > 65536 && !Static13.aBoolean36) {
			local79 = 16711680;
		}
		Static200.aClass1_Sub2_Sub5_Sub4_Sub1_5.method1602(Static109.method2004(new Class65[] { Static107.aClass65_1549, Static118.method2250(local90), Static45.aClass65_725 }), local51, local80, local79, -1);
		local55 = local80 + 15;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(JB)V")
	public static void method2818(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(16) InterruptedException local16) {
		}
	}

	@OriginalMember(owner = "client!s", name = "e", descriptor = "(I)V")
	public static void method2820() {
		Static108.aClass67_5.method2568();
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ZIZ)I")
	public static int method2821() {
		return Static149.anInt3501 + Static205.anInt4357;
	}
}
