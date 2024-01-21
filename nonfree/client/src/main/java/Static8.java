import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!bb", name = "R", descriptor = "I")
	public static int anInt207;

	@OriginalMember(owner = "client!bb", name = "S", descriptor = "Lclient!kc;")
	public static Class43 aClass43_1;

	@OriginalMember(owner = "client!bb", name = "U", descriptor = "[Lclient!id;")
	public static Class3_Sub1_Sub1_Sub2[] aClass3_Sub1_Sub1_Sub2Array9;

	@OriginalMember(owner = "client!bb", name = "L", descriptor = "Lclient!oa;")
	public static Class56 aClass56_111 = Static33.method650("weiss:");

	@OriginalMember(owner = "client!bb", name = "Q", descriptor = "I")
	public static int anInt206 = 0;

	@OriginalMember(owner = "client!bb", name = "T", descriptor = "I")
	public static int anInt208 = 0;

	@OriginalMember(owner = "client!bb", name = "W", descriptor = "[[[Lclient!ja;")
	public static Class37[][][] aClass37ArrayArrayArray1 = new Class37[4][104][104];

	@OriginalMember(owner = "client!bb", name = "hb", descriptor = "Lclient!oa;")
	private static Class56 aClass56_114 = Static33.method650("Your profile will be transferred in:");

	@OriginalMember(owner = "client!bb", name = "X", descriptor = "Lclient!oa;")
	public static Class56 aClass56_112 = aClass56_114;

	@OriginalMember(owner = "client!bb", name = "Y", descriptor = "Lclient!oa;")
	public static Class56 aClass56_113 = Static33.method650("Freie Welt");

	@OriginalMember(owner = "client!bb", name = "Z", descriptor = "[I")
	public static int[] anIntArray8 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!bb", name = "ab", descriptor = "I")
	public static int anInt210 = 0;

	@OriginalMember(owner = "client!bb", name = "ib", descriptor = "Lclient!oa;")
	public static Class56 aClass56_115 = Static33.method650("(U4");

	@OriginalMember(owner = "client!bb", name = "mb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_116 = Static33.method650("Wen m-Ochten Sie entfernen?");

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "(B)V")
	public static void method170() {
		Static115.method1895();
		if (Static69.anInt1924 == 1) {
			aClass3_Sub1_Sub1_Sub2Array9[Static24.anInt705 / 100].method967(Static91.anInt2390 - 8 - 4, -8 + -4 + Static9.anInt224);
		}
		if (Static69.anInt1924 == 2) {
			aClass3_Sub1_Sub1_Sub2Array9[Static24.anInt705 / 100 + 4].method967(Static91.anInt2390 - 12, -8 + -4 + Static9.anInt224);
		}
		if (Static109.anInt1693 != -1) {
			Static21.method467(Static109.anInt1693);
			Static30.method628(4, 512, Static109.anInt1693, 334);
		}
		if (Static57.anInt1607 != -1) {
			Static21.method467(Static57.anInt1607);
			Static30.method628(0, 512, Static57.anInt1607, 334);
		}
		Static35.method668();
		if (!Static122.aBoolean163) {
			Static46.method1519();
			Static45.method815();
		} else if (Static42.anInt1117 == 0) {
			Static56.method1062();
		}
		if (Static102.anInt3225 == 1) {
			Static16.aClass3_Sub1_Sub1_Sub2_1.method967(472, 296);
		}
		@Pc(137) int local137;
		if (Static50.aBoolean63) {
			@Pc(115) byte local115 = 20;
			@Pc(117) int local117 = 16776960;
			Static80.aClass3_Sub1_Sub1_Sub1_4.method730(Static84.method1524(new Class56[] { Static5.aClass56_54, Static111.method1851(Static83.anInt2256) }), 20, 16776960);
			local137 = local115 + 15;
			@Pc(139) Runtime local139 = Runtime.getRuntime();
			@Pc(148) int local148 = (int) ((local139.totalMemory() - local139.freeMemory()) / 1024L);
			if (local148 > 32768 && Static77.aBoolean169) {
				local117 = 16711680;
			}
			if (local148 > 65536 && !Static77.aBoolean169) {
				local117 = 16711680;
			}
			Static80.aClass3_Sub1_Sub1_Sub1_4.method730(Static84.method1524(new Class56[] { Static40.aClass56_618, Static111.method1851(local148), Static47.aClass56_766 }), 35, local117);
			local137 += 15;
			if (Static94.aBoolean116) {
				Static80.aClass3_Sub1_Sub1_Sub1_4.method730(Static80.aClass56_1165, 50, 16711680);
				Static94.aBoolean116 = false;
				local137 += 15;
			}
			if (Static65.aBoolean83) {
				Static80.aClass3_Sub1_Sub1_Sub1_4.method730(Static60.aClass56_943, local137, 16711680);
				Static65.aBoolean83 = false;
				local137 += 15;
			}
			if (Static59.aBoolean79) {
				Static80.aClass3_Sub1_Sub1_Sub1_4.method730(Static27.aClass56_406, local137, 16711680);
				Static59.aBoolean79 = false;
				local137 += 15;
			}
		}
		if (Static106.anInt2633 == 0) {
			return;
		}
		@Pc(225) int local225 = Static106.anInt2633 / 50;
		local137 = local225 / 60;
		@Pc(233) int local233 = local225 % 60;
		if (local233 < 10) {
			Static80.aClass3_Sub1_Sub1_Sub1_4.method738(Static84.method1524(new Class56[] { Static47.aClass56_763, Static111.method1851(local137), Static18.aClass56_245, Static111.method1851(local233) }), 4, 329, 16776960);
		} else {
			Static80.aClass3_Sub1_Sub1_Sub1_4.method738(Static84.method1524(new Class56[] { Static47.aClass56_763, Static111.method1851(local137), Static105.aClass56_1442, Static111.method1851(local233) }), 4, 329, 16776960);
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BLclient!wb;I)V")
	public static void method171(@OriginalArg(1) Class3_Sub1_Sub2_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anInt3142 > Static98.anInt2566) {
			Static95.method1669(arg0);
		} else if (arg0.anInt3195 >= Static98.anInt2566) {
			Static69.method1276(arg0);
		} else {
			Static62.method1207(arg0);
		}
		if (arg0.anInt3187 < 128 || arg0.anInt3196 < 128 || arg0.anInt3187 >= 13184 || arg0.anInt3196 >= 13184) {
			arg0.anInt3149 = -1;
			arg0.anInt3198 = -1;
			arg0.anInt3196 = arg0.anIntArray336[0] * 128 + arg0.anInt3190 * 64;
			arg0.anInt3142 = 0;
			arg0.anInt3187 = arg0.anInt3190 * 64 + arg0.anIntArray332[0] * 128;
			arg0.anInt3195 = 0;
			arg0.method2032();
		}
		if (Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1 == arg0 && (arg0.anInt3187 < 1536 || arg0.anInt3196 < 1536 || arg0.anInt3187 >= 11776 || arg0.anInt3196 >= 11776)) {
			arg0.anInt3196 = arg0.anInt3190 * 64 + arg0.anIntArray336[0] * 128;
			arg0.anInt3195 = 0;
			arg0.anInt3142 = 0;
			arg0.anInt3187 = arg0.anIntArray332[0] * 128 + arg0.anInt3190 * 64;
			arg0.anInt3198 = -1;
			arg0.anInt3149 = -1;
			arg0.method2032();
		}
		Static87.method1608(arg0);
		Static21.method469(arg0);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIILclient!gb;)V")
	public static void method173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class3_Sub1_Sub1_Sub1 arg3) {
		Static16.aClass30_4.method813();
		Static12.aClass3_Sub1_Sub1_Sub4_9.method1504(0, 0);
		arg3.method728(Static49.aClass56_836, 55, 28, 16777215, true);
		if (arg0 == 0) {
			arg3.method728(Static76.aClass56_1119, 55, 41, 65280, true);
		}
		if (arg0 == 1) {
			arg3.method728(Static62.aClass56_960, 55, 41, 16776960, true);
		}
		if (arg0 == 2) {
			arg3.method728(Static75.aClass56_1088, 55, 41, 16711680, true);
		}
		if (arg0 == 3) {
			arg3.method728(Static116.aClass56_1598, 55, 41, 65535, true);
		}
		arg3.method728(Static105.aClass56_1438, 184, 28, 16777215, true);
		if (arg1 == 0) {
			arg3.method728(Static76.aClass56_1119, 184, 41, 65280, true);
		}
		if (arg1 == 1) {
			arg3.method728(Static62.aClass56_960, 184, 41, 16776960, true);
		}
		if (arg1 == 2) {
			arg3.method728(Static75.aClass56_1088, 184, 41, 16711680, true);
		}
		arg3.method728(Static52.aClass56_849, 324, 28, 16777215, true);
		if (arg2 == 0) {
			arg3.method728(Static76.aClass56_1119, 324, 41, 65280, true);
		}
		if (arg2 == 1) {
			arg3.method728(Static62.aClass56_960, 324, 41, 16776960, true);
		}
		if (arg2 == 2) {
			arg3.method728(Static75.aClass56_1088, 324, 41, 16711680, true);
		}
		arg3.method734(Static61.aClass56_954, 417, 17, 85, 25, 16777215, true, 1, 1, 0);
		try {
			@Pc(169) Graphics local169 = Static59.aCanvas1.getGraphics();
			Static16.aClass30_4.method811(453, 0, local169);
		} catch (@Pc(177) Exception local177) {
			Static59.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)V")
	public static void method174() {
		aClass56_111 = null;
		aClass56_115 = null;
		aClass37ArrayArrayArray1 = null;
		aClass56_116 = null;
		aClass56_114 = null;
		aClass56_112 = null;
		aClass56_113 = null;
		aClass3_Sub1_Sub1_Sub2Array9 = null;
		aClass43_1 = null;
		anIntArray8 = null;
	}

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "(B)V")
	public static void method175() {
		for (@Pc(15) Class3_Sub1_Sub2_Sub7 local15 = (Class3_Sub1_Sub2_Sub7) Static82.aClass37_10.method989(); local15 != null; local15 = (Class3_Sub1_Sub2_Sub7) Static82.aClass37_10.method990()) {
			if (Static94.anInt2470 != local15.anInt3090 || local15.aBoolean166) {
				local15.method2055();
			} else if (local15.anInt3082 <= Static98.anInt2566) {
				local15.method1997(Static44.anInt1163);
				if (local15.aBoolean166) {
					local15.method2055();
				} else {
					Static116.aClass14_1.method448(local15.anInt3090, local15.anInt3076, local15.anInt3088, local15.anInt3080, 60, local15, 0, -1, false);
				}
			}
		}
	}
}
