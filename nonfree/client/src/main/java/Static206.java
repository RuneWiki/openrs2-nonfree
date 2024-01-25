import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!mq", name = "J", descriptor = "I")
	public static int anInt4117;

	@OriginalMember(owner = "client!mq", name = "L", descriptor = "I")
	public static int anInt4119;

	@OriginalMember(owner = "client!mq", name = "O", descriptor = "I")
	public static int anInt4122;

	@OriginalMember(owner = "client!mq", name = "H", descriptor = "I")
	public static int anInt4115 = 0;

	@OriginalMember(owner = "client!mq", name = "M", descriptor = "I")
	public static int anInt4120 = -1;

	@OriginalMember(owner = "client!mq", name = "P", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray37 = new String[100];

	@OriginalMember(owner = "client!mq", name = "f", descriptor = "(I)V")
	public static void method3668() {
		Static245.method4226(Static60.aClass26_13);
		Static179.anInt3659++;
		if (Static263.aBoolean381 && Static250.aBoolean359) {
			@Pc(31) int local31 = Static240.anInt6396;
			@Pc(33) int local33 = Static100.anInt2436;
			local31 -= Static168.anInt3512;
			if (Static314.anInt6024 > local31) {
				local31 = Static314.anInt6024;
			}
			local33 -= Static46.anInt1319;
			if (Static122.anInt2754 > local33) {
				local33 = Static122.anInt2754;
			}
			if (local31 + Static60.aClass26_13.anInt523 > Static298.aClass26_28.anInt523 + Static314.anInt6024) {
				local31 = Static298.aClass26_28.anInt523 + Static314.anInt6024 - Static60.aClass26_13.anInt523;
			}
			if (local33 + Static60.aClass26_13.anInt515 > Static122.anInt2754 + Static298.aClass26_28.anInt515) {
				local33 = Static122.anInt2754 + Static298.aClass26_28.anInt515 - Static60.aClass26_13.anInt515;
			}
			@Pc(100) int local100 = local31 - Static172.anInt2671;
			@Pc(104) int local104 = local33 - Static234.anInt4653;
			@Pc(107) int local107 = Static60.aClass26_13.anInt503;
			if (Static60.aClass26_13.anInt524 < Static179.anInt3659 && (local100 > local107 || -local107 > local100 || local104 > local107 || -local107 > local104)) {
				Static326.aBoolean455 = true;
			}
			@Pc(152) int local152 = local31 + Static298.aClass26_28.anInt533 - Static314.anInt6024;
			@Pc(160) int local160 = Static298.aClass26_28.anInt499 + local33 - Static122.anInt2754;
			@Pc(169) Class7_Sub25 local169;
			if (Static60.aClass26_13.anObjectArray24 != null && Static326.aBoolean455) {
				local169 = new Class7_Sub25();
				local169.aClass26_22 = Static60.aClass26_13;
				local169.anObjectArray34 = Static60.aClass26_13.anObjectArray24;
				local169.anInt3894 = local152;
				local169.anInt3895 = local160;
				Static83.method1766(local169);
			}
			if (Static180.anInt3668 == 0) {
				if (Static326.aBoolean455) {
					if (Static60.aClass26_13.anObjectArray2 != null) {
						local169 = new Class7_Sub25();
						local169.anInt3894 = local152;
						local169.aClass26_22 = Static60.aClass26_13;
						local169.anInt3895 = local160;
						local169.anObjectArray34 = Static60.aClass26_13.anObjectArray2;
						local169.aClass26_23 = Static76.aClass26_14;
						Static83.method1766(local169);
					}
					if (Static76.aClass26_14 != null && Static45.method1028(Static60.aClass26_13) != null) {
						Static29.aClass7_Sub3_Sub2_1.method2799(65);
						Static29.aClass7_Sub3_Sub2_1.method2765(Static60.aClass26_13.anInt492);
						Static29.aClass7_Sub3_Sub2_1.method2788(Static60.aClass26_13.anInt550);
						Static29.aClass7_Sub3_Sub2_1.method2733(Static76.aClass26_14.anInt492);
						Static29.aClass7_Sub3_Sub2_1.method2780(Static76.aClass26_14.anInt550);
					}
				} else if ((Static214.anInt4265 == 1 || Static46.method1057()) && Static33.anInt735 > 2) {
					Static17.method4464(2);
				} else if (Static252.method5170()) {
					Static17.method4464(1);
				}
				Static60.aClass26_13 = null;
			}
		} else if (Static179.anInt3659 > 1) {
			Static60.aClass26_13 = null;
		}
	}
}
