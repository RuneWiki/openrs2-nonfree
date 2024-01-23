import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "[I")
	public static int[] anIntArray373;

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
	public static int anInt4102;

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "F")
	public static float aFloat43;

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "I")
	public static int anInt4103;

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "Lclient!hk;")
	public static Class61 aClass61_1 = new Class61();

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "Z")
	public static boolean aBoolean272 = true;

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "[I")
	public static int[] anIntArray374 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "()V")
	public static void method3348() {
		for (@Pc(1) int local1 = 0; local1 < Static94.anInt1947; local1++) {
			@Pc(8) Class173 local8 = Static172.aClass173Array2[local1];
			Static121.method2052(local8);
			Static172.aClass173Array2[local1] = null;
		}
		Static94.anInt1947 = 0;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V")
	public static void method3349() {
		Static81.method3274(Static45.aClass22_6);
		Static103.anInt2190++;
		if (Static136.aBoolean187 && Static247.aBoolean304) {
			@Pc(25) int local25 = Static72.anInt1326;
			local25 -= Static220.anInt4359;
			@Pc(31) int local31 = Static117.anInt2589;
			local31 -= Static89.anInt1844;
			if (local31 < Static177.anInt3483) {
				local31 = Static177.anInt3483;
			}
			if (local25 < Static214.anInt4262) {
				local25 = Static214.anInt4262;
			}
			if (Static177.anInt3483 + Static207.aClass22_17.anInt602 < local31 - -Static45.aClass22_6.anInt602) {
				local31 = Static177.anInt3483 + Static207.aClass22_17.anInt602 - Static45.aClass22_6.anInt602;
			}
			@Pc(78) int local78 = local31 - Static263.anInt910;
			@Pc(81) int local81 = Static45.aClass22_6.anInt577;
			if (Static45.aClass22_6.anInt546 + local25 > Static207.aClass22_17.anInt546 + Static214.anInt4262) {
				local25 = Static207.aClass22_17.anInt546 + Static214.anInt4262 - Static45.aClass22_6.anInt546;
			}
			@Pc(106) int local106 = local25 + Static207.aClass22_17.anInt589 - Static214.anInt4262;
			@Pc(115) int local115 = local31 + Static207.aClass22_17.anInt547 - Static177.anInt3483;
			@Pc(120) int local120 = local25 - Static239.anInt4612;
			if (Static103.anInt2190 > Static45.aClass22_6.anInt599 && (local81 < local120 || -local81 > local120 || local78 > local81 || local78 < -local81)) {
				Static238.aBoolean300 = true;
			}
			@Pc(165) Class4_Sub22 local165;
			if (Static45.aClass22_6.anObjectArray15 != null && Static238.aBoolean300) {
				local165 = new Class4_Sub22();
				local165.anObjectArray32 = Static45.aClass22_6.anObjectArray15;
				local165.anInt3408 = local115;
				local165.anInt3402 = local106;
				local165.aClass22_15 = Static45.aClass22_6;
				Static125.method2089(local165);
			}
			if (Static71.anInt1316 == 0) {
				if (Static238.aBoolean300) {
					if (Static45.aClass22_6.anObjectArray23 != null) {
						local165 = new Class4_Sub22();
						local165.anInt3408 = local115;
						local165.aClass22_16 = Static68.aClass22_7;
						local165.anInt3402 = local106;
						local165.anObjectArray32 = Static45.aClass22_6.anObjectArray23;
						local165.aClass22_15 = Static45.aClass22_6;
						Static125.method2089(local165);
					}
					if (Static68.aClass22_7 != null && Static40.method679(Static45.aClass22_6) != null) {
						Static142.aClass4_Sub17_Sub1_3.method1905(27);
						Static142.aClass4_Sub17_Sub1_3.method1876(Static45.aClass22_6.anInt561);
						Static142.aClass4_Sub17_Sub1_3.method1843(Static45.aClass22_6.anInt596);
						Static142.aClass4_Sub17_Sub1_3.method1893(Static68.aClass22_7.anInt596);
						Static142.aClass4_Sub17_Sub1_3.method1855(Static68.aClass22_7.anInt561);
					}
				} else if ((Static76.anInt1445 == 1 || Static87.method1401(Static60.anInt1152 - 1)) && Static60.anInt1152 > 2) {
					Static145.method2346();
				} else if (Static60.anInt1152 > 0) {
					Static120.method2045();
				}
				Static45.aClass22_6 = null;
			}
		} else if (Static103.anInt2190 > 1) {
			Static45.aClass22_6 = null;
		}
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(B)V")
	public static void method3350() {
		aClass61_1 = null;
		anIntArray374 = null;
		anIntArray373 = null;
	}
}
