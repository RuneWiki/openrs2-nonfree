import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!mh", name = "W", descriptor = "Lclient!nb;")
	public static Class15 aClass15_23;

	@OriginalMember(owner = "client!mh", name = "R", descriptor = "I")
	public static int anInt2947 = 0;

	@OriginalMember(owner = "client!mh", name = "T", descriptor = "I")
	public static volatile int anInt2949 = 0;

	@OriginalMember(owner = "client!mh", name = "V", descriptor = "[I")
	public static int[] anIntArray312 = new int[1000];

	@OriginalMember(owner = "client!mh", name = "X", descriptor = "[I")
	public static int[] anIntArray313 = new int[2048];

	@OriginalMember(owner = "client!mh", name = "Y", descriptor = "Lclient!i;")
	private static Class41 aClass41_826 = Static184.method2923("Your profile will be transferred in:");

	@OriginalMember(owner = "client!mh", name = "ab", descriptor = "Lclient!i;")
	public static Class41 aClass41_827 = Static184.method2923("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!mh", name = "cb", descriptor = "I")
	public static int anInt2953 = 0;

	@OriginalMember(owner = "client!mh", name = "db", descriptor = "Lclient!i;")
	public static Class41 aClass41_828 = Static184.method2923("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!mh", name = "fb", descriptor = "Lclient!i;")
	public static Class41 aClass41_829 = aClass41_826;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIILclient!dj;)V")
	public static void method2063(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class12_Sub3_Sub1 arg3) {
		if (arg3 == Static213.aClass12_Sub3_Sub1_1 || Static179.anInt4150 >= 400) {
			return;
		}
		@Pc(65) Class41 local65;
		if (arg3.anInt1205 == 0) {
			local65 = Static149.method2324(new Class41[] { arg3.aClass41_362, Static151.method2360(arg3.anInt1203, Static213.aClass12_Sub3_Sub1_1.anInt1203), Static61.aClass41_478, Static130.aClass41_1037, Static152.method2471(arg3.anInt1203), Static91.aClass41_666 });
		} else {
			local65 = Static149.method2324(new Class41[] { arg3.aClass41_362, Static61.aClass41_478, Static128.aClass41_839, Static152.method2471(arg3.anInt1205), Static91.aClass41_666 });
		}
		@Pc(105) int local105;
		if (Static26.anInt665 == 1) {
			Static85.method1530(arg1, Static33.aClass41_232, (short) 31, (long) arg0, Static149.method2324(new Class41[] { Static68.aClass41_561, Static45.aClass41_387, local65 }), arg2);
		} else if (!Static9.aBoolean16) {
			for (local105 = 7; local105 >= 0; local105--) {
				if (Static115.aClass41Array60[local105] != null) {
					@Pc(117) short local117 = 0;
					if (Static43.anInt1295 == 0 && Static115.aClass41Array60[local105].method1413(Static143.aClass41_904)) {
						if (arg3.anInt1203 > Static213.aClass12_Sub3_Sub1_1.anInt1203) {
							local117 = 2000;
						}
						if (Static213.aClass12_Sub3_Sub1_1.anInt1207 != 0 && arg3.anInt1207 != 0) {
							if (arg3.anInt1207 == Static213.aClass12_Sub3_Sub1_1.anInt1207) {
								local117 = 2000;
							} else {
								local117 = 0;
							}
						}
					} else if (Static179.aBooleanArray21[local105]) {
						local117 = 2000;
					}
					@Pc(174) short local174 = Static22.aShortArray14[local105];
					@Pc(179) short local179 = (short) (local174 + local117);
					Static85.method1530(arg1, Static115.aClass41Array60[local105], local179, (long) arg0, Static149.method2324(new Class41[] { Static77.aClass41_596, local65 }), arg2);
				}
			}
		} else if ((Static101.anInt2453 & 0x8) == 8) {
			Static85.method1530(arg1, Static177.aClass41_1092, (short) 23, (long) arg0, Static149.method2324(new Class41[] { Static26.aClass41_174, Static45.aClass41_387, local65 }), arg2);
		}
		for (local105 = 0; local105 < Static179.anInt4150; local105++) {
			if (Static48.aShortArray34[local105] == 10) {
				Static177.aClass41Array63[local105] = Static149.method2324(new Class41[] { Static77.aClass41_596, local65 });
				return;
			}
		}
	}
}
