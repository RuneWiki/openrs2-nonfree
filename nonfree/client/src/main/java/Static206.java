import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!pm", name = "p", descriptor = "Lclient!pk;")
	public static Class132 aClass132_71;

	@OriginalMember(owner = "client!pm", name = "s", descriptor = "I")
	public static int anInt4276;

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "[I")
	public static int[] anIntArray328 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "[I")
	public static int[] anIntArray329 = new int[64];

	@OriginalMember(owner = "client!pm", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString151 = "RuneScape is loading - please wait...";

	@OriginalMember(owner = "client!pm", name = "k", descriptor = "I")
	public static int anInt4270 = 0;

	@OriginalMember(owner = "client!pm", name = "l", descriptor = "I")
	public static int anInt4271 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!pm", name = "n", descriptor = "I")
	public static int anInt4273 = 0;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V")
	public static void method3267() {
		if (Static95.aClass92_4 != null) {
			Static95.aClass92_4.method2176();
			Static95.aClass92_4 = null;
		}
		Static123.method1978();
		Static242.method3646();
		@Pc(18) int local18;
		for (local18 = 0; local18 < 4; local18++) {
			Static159.aClass112Array1[local18].method2540();
		}
		Static15.method286(false);
		System.gc();
		Static258.method3881();
		Static140.aBoolean230 = false;
		Static236.anInt4769 = -1;
		Static132.method2137(true);
		Static207.aBoolean349 = false;
		Static130.anInt2601 = 0;
		Static250.anInt4960 = 0;
		Static49.anInt1089 = 0;
		Static42.anInt957 = 0;
		for (local18 = 0; local18 < Static245.aClass18Array1.length; local18++) {
			Static245.aClass18Array1[local18] = null;
		}
		Static135.anInt2729 = 0;
		Static61.anInt1336 = 0;
		for (local18 = 0; local18 < 2048; local18++) {
			Static230.aClass36_Sub3_Sub1Array1[local18] = null;
			Static44.aClass8_Sub2Array1[local18] = null;
		}
		for (local18 = 0; local18 < 32768; local18++) {
			Static48.aClass36_Sub3_Sub2Array1[local18] = null;
		}
		for (local18 = 0; local18 < 4; local18++) {
			for (@Pc(115) int local115 = 0; local115 < 104; local115++) {
				for (@Pc(122) int local122 = 0; local122 < 104; local122++) {
					Static124.aClass182ArrayArrayArray1[local18][local115][local122] = null;
				}
			}
		}
		Static162.method2643();
		Static182.anInt3573 = 0;
		Static161.method2570();
		Static179.method2743(true);
		try {
			Static304.method1290(Static199.aClass17_3.anApplet1, "loggedout");
		} catch (@Pc(159) Throwable local159) {
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIII)V")
	public static void method3268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 <= arg2) {
			Static19.method343(arg1, arg3, Static181.anIntArrayArray19[arg0], arg2);
		} else {
			Static19.method343(arg2, arg3, Static181.anIntArrayArray19[arg0], arg1);
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(III)Z")
	public static boolean method3270(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!Static147.aBoolean246) {
			return false;
		}
		@Pc(14) int local14 = arg0 >> 16;
		@Pc(18) int local18 = arg0 & 0xFFFF;
		if (Static210.aClass159ArrayArray6[local14] == null || Static210.aClass159ArrayArray6[local14][local18] == null) {
			return false;
		}
		@Pc(38) Class159 local38 = Static210.aClass159ArrayArray6[local14][local18];
		@Pc(48) int local48;
		if (arg1 == -1 && local38.anInt5197 == 0) {
			for (local48 = 0; local48 < Static185.anInt3679; local48++) {
				if (Static204.aShortArray34[local48] == 19 || Static204.aShortArray34[local48] == 1004 || Static204.aShortArray34[local48] == 9 || Static204.aShortArray34[local48] == 42 || Static204.aShortArray34[local48] == 25) {
					for (@Pc(92) Class159 local92 = Static82.method1361(Static190.anIntArray283[local48]); local92 != null; local92 = Static215.method3368(local92)) {
						if (local92.anInt5199 == local38.anInt5199) {
							return true;
						}
					}
				}
			}
		} else {
			for (local48 = 0; local48 < Static185.anInt3679; local48++) {
				if (arg1 == Static243.anIntArray368[local48] && local38.anInt5199 == Static190.anIntArray283[local48] && (Static204.aShortArray34[local48] == 19 || Static204.aShortArray34[local48] == 1004 || Static204.aShortArray34[local48] == 9 || Static204.aShortArray34[local48] == 42 || Static204.aShortArray34[local48] == 25)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "()V")
	public static void method3271() {
		for (@Pc(1) int local1 = 0; local1 < Static295.anInt3736; local1++) {
			@Pc(8) Class170 local8 = Static174.aClass170Array1[local1];
			Static108.method1774(local8);
			Static174.aClass170Array1[local1] = null;
		}
		Static295.anInt3736 = 0;
	}
}
