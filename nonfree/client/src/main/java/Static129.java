import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!je", name = "a", descriptor = "Lclient!nk;")
	public static Class121 aClass121_60;

	@OriginalMember(owner = "client!je", name = "d", descriptor = "[I")
	public static int[] anIntArray223;

	@OriginalMember(owner = "client!je", name = "i", descriptor = "[I")
	public static int[] anIntArray224;

	@OriginalMember(owner = "client!je", name = "j", descriptor = "I")
	public static int anInt2589;

	@OriginalMember(owner = "client!je", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString149 = null;

	@OriginalMember(owner = "client!je", name = "l", descriptor = "[[I")
	public static int[][] anIntArrayArray20 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(JI)V")
	public static void method2229(@OriginalArg(0) long arg0) {
		if (Static167.anInt3292 == 1 || Static167.anInt3292 == 5) {
			Static288.method4409(arg0);
		} else if (Static167.anInt3292 == 2) {
			Static145.method2483();
		} else {
			Static157.method1369();
		}
		if (!Static249.aBoolean307) {
			Static164.aStringArray25[0] = Static117.aString140;
			Static21.anIntArray19[0] = Static41.anInt850;
			Static17.aShortArray2[0] = 1009;
			if (Static304.anInt5397 != 0) {
				Static49.anInt962 = Static152.anInt728;
				Static11.anInt163 = Static33.anInt577;
			} else if (Static83.anInt1652 == 0) {
				Static11.anInt163 = Static247.anInt4467;
				Static49.anInt962 = Static222.anInt4105;
			} else {
				Static49.anInt962 = Static282.anInt5092;
				Static11.anInt163 = Static238.anInt4321;
			}
			Static73.aStringArray6[0] = "";
			Static110.anInt2281 = 1;
		}
		Static158.method2714((long) Static313.anInt2966);
		if (Static270.anInt4897 != -1) {
			Static248.method3926(Static270.anInt4897);
		}
		@Pc(88) int local88;
		for (local88 = 0; local88 < Static293.anInt5272; local88++) {
			if (Static304.aBooleanArray23[local88]) {
				Static116.aBooleanArray8[local88] = true;
			}
			Static307.aBooleanArray25[local88] = Static304.aBooleanArray23[local88];
			Static304.aBooleanArray23[local88] = false;
		}
		Static308.anInt5489 = -1;
		Static73.aClass66_15 = null;
		if (Static156.aBoolean211) {
			Static282.aBoolean348 = true;
		}
		Static82.aClass66_18 = null;
		Static92.anInt5553 = Static313.anInt2966;
		Static34.anInt4474 = -1;
		if (Static270.anInt4897 != -1) {
			Static293.anInt5272 = 0;
			Static264.method4163();
		}
		if (Static156.aBoolean211) {
			Static119.method2126();
		} else {
			Static25.method412();
		}
		Static222.method3457();
		if (Static249.aBoolean307) {
			if (Static41.aBoolean46) {
				Static186.method3047();
			} else {
				Static17.method246();
			}
		} else if (Static73.aClass66_15 != null) {
			Static192.method3132(Static73.aClass66_15, Static257.anInt4698, Static296.anInt5310);
		} else if (Static308.anInt5489 != -1) {
			Static192.method3132(null, Static34.anInt4474, Static308.anInt5489);
		}
		local88 = Static249.aBoolean307 ? -1 : Static164.method2814();
		if (local88 == -1) {
			local88 = Static133.anInt2677;
		}
		Static268.method4202(local88);
		if (Static200.anInt3852 == 1) {
			Static200.anInt3852 = 2;
		}
		if (Static134.anInt5660 == 1) {
			Static134.anInt5660 = 2;
		}
		if (Static301.anInt5354 == 3) {
			for (@Pc(212) int local212 = 0; local212 < Static293.anInt5272; local212++) {
				if (Static307.aBooleanArray25[local212]) {
					if (Static156.aBoolean211) {
						Static119.method2122(Static294.anIntArray467[local212], Static217.anIntArray342[local212], Static233.anIntArray365[local212], Static46.anIntArray57[local212], 16711935, 128);
					} else {
						Static25.method397(Static294.anIntArray467[local212], Static217.anIntArray342[local212], Static233.anIntArray365[local212], Static46.anIntArray57[local212], 16711935, 128);
					}
				} else if (Static116.aBooleanArray8[local212]) {
					if (Static156.aBoolean211) {
						Static119.method2122(Static294.anIntArray467[local212], Static217.anIntArray342[local212], Static233.anIntArray365[local212], Static46.anIntArray57[local212], 16711680, 128);
					} else {
						Static25.method397(Static294.anIntArray467[local212], Static217.anIntArray342[local212], Static233.anIntArray365[local212], Static46.anIntArray57[local212], 16711680, 128);
					}
				}
			}
		}
		Static55.method977(Static90.aClass15_Sub5_Sub2_2.anInt5559, Static81.anInt1635, Static65.anInt1300, Static90.aClass15_Sub5_Sub2_2.anInt5557);
		Static81.anInt1635 = 0;
	}
}
