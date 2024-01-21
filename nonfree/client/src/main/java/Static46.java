import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!ee", name = "pb", descriptor = "Lclient!ph;")
	public static Class72 aClass72_2;

	@OriginalMember(owner = "client!ee", name = "hb", descriptor = "[I")
	public static final int[] anIntArray115 = new int[100];

	@OriginalMember(owner = "client!ee", name = "jb", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_747 = Static118.method2249("Close");

	@OriginalMember(owner = "client!ee", name = "lb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_748 = Static118.method2249("Spiel)2Engine wird gestartet)3)3)3");

	@OriginalMember(owner = "client!ee", name = "ob", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_749 = Static118.method2249("Benutzen");

	@OriginalMember(owner = "client!ee", name = "sb", descriptor = "[I")
	public static final int[] anIntArray116 = new int[200];

	@OriginalMember(owner = "client!ee", name = "ub", descriptor = "Lclient!oc;")
	public static Class65 aClass65_750 = aClass65_747;

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "(I)V")
	public static void method785() {
		if (!Static198.aBoolean168) {
			Static162.aShortArray52[0] = 1002;
			Static101.anInt2533 = 1;
			Static161.aClass65Array51[0] = Static179.aClass65_2404;
			Static198.aClass65Array62[0] = Static117.aClass65_1665;
		}
		if (Static28.anInt856 != -1) {
			Static154.method2697(Static28.anInt856);
		}
		for (@Pc(34) int local34 = 0; local34 < Static126.anInt3109; local34++) {
			if (Static197.aBooleanArray18[local34]) {
				Static57.aBooleanArray8[local34] = true;
			}
			Static45.aBooleanArray7[local34] = Static197.aBooleanArray18[local34];
			Static197.aBooleanArray18[local34] = false;
		}
		Static161.anInt3643 = -1;
		Static20.anInt621 = Static174.anInt3887;
		Static207.anInt4418 = -1;
		Static170.aClass97_12 = null;
		if (Static28.anInt856 != -1) {
			Static126.anInt3109 = 0;
			Static78.method1380(0, Static28.anInt856, Static176.anInt3920, -1, 0, 0, Static33.anInt972, 0);
		}
		Static194.method3108();
		Static179.method3028();
		if (Static198.aBoolean168) {
			Static99.method1885();
		} else if (Static207.anInt4418 != -1) {
			Static26.method472(Static207.anInt4418, Static161.anInt3643);
		}
		if (Static148.anInt3489 == 3) {
			for (@Pc(108) int local108 = 0; local108 < Static126.anInt3109; local108++) {
				if (Static45.aBooleanArray7[local108]) {
					Static194.method3105(Static195.anIntArray481[local108], Static168.anIntArray351[local108], Static105.anIntArray295[local108], Static183.anIntArray449[local108], 16711935, 128);
				} else if (Static57.aBooleanArray8[local108]) {
					Static194.method3105(Static195.anIntArray481[local108], Static168.anIntArray351[local108], Static105.anIntArray295[local108], Static183.anIntArray449[local108], 16711680, 128);
				}
			}
		}
		Static51.method892(Static201.aClass6_Sub4_Sub1_3.anInt3934, Static207.anInt4425, Static201.aClass6_Sub4_Sub1_3.anInt3976, Static160.anInt2781);
		Static160.anInt2781 = 0;
	}

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "(I)V")
	public static void method788() {
		@Pc(6) Object local6 = Static197.anObject4;
		synchronized (Static197.anObject4) {
			if (Static210.anInt4461 != 0) {
				Static210.anInt4461 = 1;
				try {
					Static197.anObject4.wait();
				} catch (@Pc(16) InterruptedException local16) {
				}
			}
		}
	}
}
