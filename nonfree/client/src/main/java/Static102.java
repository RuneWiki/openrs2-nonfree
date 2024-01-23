import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!je", name = "ab", descriptor = "Lclient!sc;")
	private static Class107 aClass107_605 = Static231.method3737("Cancel");

	@OriginalMember(owner = "client!je", name = "W", descriptor = "Lclient!sc;")
	public static Class107 aClass107_604 = aClass107_605;

	@OriginalMember(owner = "client!je", name = "cb", descriptor = "[I")
	public static int[] anIntArray220 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(Z)V")
	public static void method1715() {
		@Pc(5) Object local5 = Static113.anObject1;
		synchronized (Static113.anObject1) {
			if (Static98.anInt2145 == 0) {
				Static117.aClass34_2.method1068(5, new Class91());
			}
			Static98.anInt2145 = 600;
		}
	}

	@OriginalMember(owner = "client!je", name = "g", descriptor = "(I)V")
	public static void method1720() {
		if (!Static40.aBoolean81) {
			Static210.aClass107Array28[0] = aClass107_604;
			Static168.aClass107Array21[0] = Static63.aClass107_427;
			Static8.anInt259 = 1;
			Static106.aShortArray30[0] = 1003;
		}
		if (Static157.anInt3442 != 0) {
			Static32.anInt604 = Static37.anInt767;
			Static11.anInt298 = Static1.anInt74;
		} else if (Static95.anInt2075 == 0) {
			Static32.anInt604 = Static220.anInt4822;
			Static11.anInt298 = Static181.anInt4311;
		} else {
			Static11.anInt298 = Static161.anInt3533;
			Static32.anInt604 = Static20.anInt2218;
		}
		if (Static77.anInt1732 != -1) {
			Static39.method747(Static77.anInt1732);
		}
		for (@Pc(52) int local52 = 0; local52 < Static14.anInt333; local52++) {
			if (Static39.aBooleanArray5[local52]) {
				Static175.aBooleanArray24[local52] = true;
			}
			Static20.aBooleanArray18[local52] = Static39.aBooleanArray5[local52];
			Static39.aBooleanArray5[local52] = false;
		}
		Static168.anInt3626 = -1;
		Static122.anInt2673 = -1;
		Static233.aClass86_17 = null;
		Static176.anInt3805 = Static128.anInt2802;
		if (Static77.anInt1732 != -1) {
			Static14.anInt333 = 0;
			Static84.method1419(-1, 0, 0, 0, Static77.anInt1732, Static180.anInt4990, 0, Static158.anInt3484);
		}
		Static205.method3241();
		Static12.method322();
		if (Static40.aBoolean81) {
			Static61.method1167();
		} else if (Static168.anInt3626 != -1) {
			Static104.method2413(Static122.anInt2673, Static168.anInt3626);
		}
		if (Static163.anInt3554 == 3) {
			for (@Pc(127) int local127 = 0; local127 < Static14.anInt333; local127++) {
				if (Static20.aBooleanArray18[local127]) {
					Static205.method3258(Static25.anIntArray45[local127], Static189.anIntArray347[local127], Static170.anIntArray328[local127], Static204.anIntArray232[local127], 16711935, 128);
				} else if (Static175.aBooleanArray24[local127]) {
					Static205.method3258(Static25.anIntArray45[local127], Static189.anIntArray347[local127], Static170.anIntArray328[local127], Static204.anIntArray232[local127], 16711680, 128);
				}
			}
		}
		Static182.method3006(Static191.anInt4237, Static204.aClass5_Sub5_Sub1_2.anInt3021, Static204.aClass5_Sub5_Sub1_2.anInt3044, Static204.anInt2498);
		Static204.anInt2498 = 0;
	}
}
