import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!on", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray223 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!on", name = "f", descriptor = "[I")
	public static final int[] anIntArray719 = new int[13];

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(B)V")
	public static void method5760() {
		if (Static307.aFloat18 > Static307.aFloat17) {
			Static307.aFloat17 = (float) ((double) Static307.aFloat17 + (double) Static307.aFloat17 / 30.0D);
			if (Static307.aFloat18 < Static307.aFloat17) {
				Static307.aFloat17 = Static307.aFloat18;
			}
			Static323.method5376();
			Static307.anInt1191 = (int) Static307.aFloat17 >> 1;
			Static307.aByteArrayArrayArray6 = Static212.method3767(Static307.anInt1191);
		} else if (Static307.aFloat17 > Static307.aFloat18) {
			Static307.aFloat17 = (float) ((double) Static307.aFloat17 - (double) Static307.aFloat17 / 30.0D);
			if (Static307.aFloat17 < Static307.aFloat18) {
				Static307.aFloat17 = Static307.aFloat18;
			}
			Static323.method5376();
			Static307.anInt1191 = (int) Static307.aFloat17 >> 1;
			Static307.aByteArrayArrayArray6 = Static212.method3767(Static307.anInt1191);
		}
		if (Static17.anInt6198 != -1 && Static192.anInt3645 != -1) {
			@Pc(80) int local80 = Static17.anInt6198 - Static61.anInt1126;
			if (local80 < 2 || local80 > 2) {
				local80 >>= 0x4;
			}
			@Pc(97) int local97 = Static192.anInt3645 - Static23.anInt371;
			Static61.anInt1126 += local80;
			if (local97 < 2 || local97 > 2) {
				local97 >>= 0x4;
			}
			Static23.anInt371 += local97;
			if (local80 == 0 && local97 == 0) {
				Static192.anInt3645 = -1;
				Static17.anInt6198 = -1;
			}
			Static323.method5376();
		}
		if (Static41.anInt6388 > 0) {
			Static297.anInt5578--;
			if (Static297.anInt5578 == 0) {
				Static297.anInt5578 = 100;
				Static41.anInt6388--;
			}
		} else {
			Static204.anInt3768 = -1;
			Static151.anInt2868 = -1;
		}
		if (!Static343.aBoolean414 || Static225.aClass211_25 == null) {
			return;
		}
		for (@Pc(163) Class6_Sub41 local163 = (Class6_Sub41) Static225.aClass211_25.method5594(); local163 != null; local163 = (Class6_Sub41) Static225.aClass211_25.method5582()) {
			@Pc(171) Class165 local171 = Static345.method5701(local163.aClass6_Sub35_1.anInt5312);
			if (Static301.anInt5701 == 0 && local163.method5462(Static7.anInt149, Static79.anInt1449)) {
				if (local171.aStringArray31 != null) {
					if (local171.aStringArray31[4] != null) {
						Static52.method870(local171.anInt4700, local171.aStringArray31[4], 1006, 0, -1, local171.aString196, (long) local163.aClass6_Sub35_1.anInt5312);
					}
					if (local171.aStringArray31[3] != null) {
						Static52.method870(local171.anInt4700, local171.aStringArray31[3], 1007, 0, -1, local171.aString196, (long) local163.aClass6_Sub35_1.anInt5312);
					}
					if (local171.aStringArray31[2] != null) {
						Static52.method870(local171.anInt4700, local171.aStringArray31[2], 1011, 0, -1, local171.aString196, (long) local163.aClass6_Sub35_1.anInt5312);
					}
					if (local171.aStringArray31[1] != null) {
						Static52.method870(local171.anInt4700, local171.aStringArray31[1], 1009, 0, -1, local171.aString196, (long) local163.aClass6_Sub35_1.anInt5312);
					}
					if (local171.aStringArray31[0] != null) {
						Static52.method870(local171.anInt4700, local171.aStringArray31[0], 1012, 0, -1, local171.aString196, (long) local163.aClass6_Sub35_1.anInt5312);
					}
				}
				if (!local163.aClass6_Sub35_1.aBoolean367) {
					local163.aClass6_Sub35_1.aBoolean367 = true;
					Static140.method2657(15, local163.aClass6_Sub35_1.anInt5312, local171.anInt4700);
				}
				if (local163.aClass6_Sub35_1.aBoolean367) {
					Static140.method2657(17, local163.aClass6_Sub35_1.anInt5312, local171.anInt4700);
				}
			} else if (local163.aClass6_Sub35_1.aBoolean367) {
				local163.aClass6_Sub35_1.aBoolean367 = false;
				Static140.method2657(16, local163.aClass6_Sub35_1.anInt5312, local171.anInt4700);
			}
		}
	}
}
