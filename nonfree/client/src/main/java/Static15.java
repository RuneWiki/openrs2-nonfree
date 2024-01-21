import java.awt.Frame;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!db", name = "zb", descriptor = "Z")
	public static boolean aBoolean24;

	@OriginalMember(owner = "client!db", name = "Bb", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!db", name = "tb", descriptor = "Lclient!mc;")
	private static Class42 aClass42_303 = Static23.method501("K");

	@OriginalMember(owner = "client!db", name = "S", descriptor = "Lclient!mc;")
	public static Class42 aClass42_298 = aClass42_303;

	@OriginalMember(owner = "client!db", name = "T", descriptor = "[Lclient!mc;")
	public static Class42[] aClass42Array4 = new Class42[100];

	@OriginalMember(owner = "client!db", name = "W", descriptor = "Lclient!mc;")
	public static Class42 aClass42_299 = Static23.method501("p11_full");

	@OriginalMember(owner = "client!db", name = "qb", descriptor = "Lclient!mc;")
	private static Class42 aClass42_302 = Static23.method501("Loaded textures");

	@OriginalMember(owner = "client!db", name = "db", descriptor = "Lclient!mc;")
	public static Class42 aClass42_300 = aClass42_302;

	@OriginalMember(owner = "client!db", name = "gb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_301 = aClass42_303;

	@OriginalMember(owner = "client!db", name = "hb", descriptor = "I")
	public static int anInt544 = 1;

	@OriginalMember(owner = "client!db", name = "rb", descriptor = "Lclient!kc;")
	public static Class37 aClass37_8 = new Class37(64);

	@OriginalMember(owner = "client!db", name = "sb", descriptor = "[Lclient!aa;")
	public static Class1_Sub1_Sub1_Sub1[] aClass1_Sub1_Sub1_Sub1Array7 = new Class1_Sub1_Sub1_Sub1[1000];

	@OriginalMember(owner = "client!db", name = "wb", descriptor = "[Lclient!p;")
	public static Class33_Sub1[] aClass33_Sub1Array1 = new Class33_Sub1[256];

	@OriginalMember(owner = "client!db", name = "xb", descriptor = "[Z")
	public static boolean[] aBooleanArray4 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, true, false, false };

	@OriginalMember(owner = "client!db", name = "yb", descriptor = "[Lclient!pc;")
	public static Class1_Sub1_Sub8_Sub3[] aClass1_Sub1_Sub8_Sub3Array1 = new Class1_Sub1_Sub8_Sub3[4];

	@OriginalMember(owner = "client!db", name = "Ab", descriptor = "Lclient!mc;")
	private static Class42 aClass42_304 = Static23.method501("Close");

	@OriginalMember(owner = "client!db", name = "Cb", descriptor = "[I")
	public static int[] anIntArray40 = new int[100];

	@OriginalMember(owner = "client!db", name = "Db", descriptor = "Lclient!mc;")
	public static Class42 aClass42_305 = aClass42_304;

	@OriginalMember(owner = "client!db", name = "Eb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_306 = Static23.method501(":tradereq:");

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ZZ)V")
	public static void method393(@OriginalArg(1) boolean arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static91.anInt2403; local7++) {
			@Pc(17) int local17 = (Static98.anIntArray375[local7] << 14) + 536870912;
			@Pc(23) Class1_Sub1_Sub8_Sub1_Sub1 local23 = Static8.aClass1_Sub1_Sub8_Sub1_Sub1Array1[Static98.anIntArray375[local7]];
			if (local23 != null && local23.method1763() && local23.aClass1_Sub1_Sub6_1.aBoolean35 == arg0 && local23.aClass1_Sub1_Sub6_1.method547()) {
				@Pc(48) int local48 = local23.anInt2576 >> 7;
				@Pc(53) int local53 = local23.anInt2583 >> 7;
				if (local48 >= 0 && local48 < 104 && local53 >= 0 && local53 < 104) {
					if (local23.anInt2599 == 1 && (local23.anInt2576 & 0x7F) == 64 && (local23.anInt2583 & 0x7F) == 64) {
						if (Static93.anInt2455 == Static74.anIntArrayArray20[local48][local53]) {
							continue;
						}
						Static74.anIntArrayArray20[local48][local53] = Static93.anInt2455;
					}
					if (!local23.aClass1_Sub1_Sub6_1.aBoolean36) {
						local17 += Integer.MIN_VALUE;
					}
					Static88.aClass20_1.method456(Static82.anInt2165, local23.anInt2576, local23.anInt2583, Static104.method1821(local23.anInt2599 * 64 + local23.anInt2583 - 64, Static82.anInt2165, local23.anInt2576 + (local23.anInt2599 - 1) * 64), local23.anInt2599 * 64 - 4, local23, local23.anInt2564, local17, local23.aBoolean141);
				}
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "f", descriptor = "(I)V")
	public static void method394() {
		aBooleanArray4 = null;
		aClass1_Sub1_Sub1_Sub1Array7 = null;
		aClass42Array4 = null;
		aFrame1 = null;
		aClass42_300 = null;
		aClass37_8 = null;
		aClass33_Sub1Array1 = null;
		anIntArray40 = null;
		aClass42_299 = null;
		aClass42_302 = null;
		aClass42_303 = null;
		aClass42_298 = null;
		aClass42_306 = null;
		aClass42_305 = null;
		aClass42_304 = null;
		aClass42_301 = null;
		aClass1_Sub1_Sub8_Sub3Array1 = null;
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(B)Z")
	public static boolean method396() {
		return Static30.aClass14_1 != null;
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(B)V")
	public static void method397() {
		try {
			@Pc(6) Graphics local6 = Static89.aCanvas1.getGraphics();
			Static45.aClass31_26.method993(17, local6, 357);
		} catch (@Pc(14) Exception local14) {
			Static89.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IJ)V")
	public static void method398(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < Static8.anInt239; local17++) {
			if (arg0 == Static87.aLongArray5[local17]) {
				Static8.anInt239--;
				Static89.aBoolean132 = true;
				for (@Pc(37) int local37 = local17; local37 < Static8.anInt239; local37++) {
					Static8.aClass42Array3[local37] = Static8.aClass42Array3[local37 + 1];
					Static109.anIntArray408[local37] = Static109.anIntArray408[local37 + 1];
					Static87.aLongArray5[local37] = Static87.aLongArray5[local37 + 1];
				}
				Static98.aClass1_Sub8_Sub1_3.method1236(48);
				Static98.aClass1_Sub8_Sub1_3.method1193(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIII)I")
	public static int method400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = 256 - arg1;
		return (arg1 * (arg2 & 0xFF00) + local8 * (arg0 & 0xFF00) & 0xFF0000) + (arg1 * (arg2 & 0xFF00FF) + (arg0 & 0xFF00FF) * local8 & 0xFF00FF00) >> 8;
	}

	@OriginalMember(owner = "client!db", name = "h", descriptor = "(I)V")
	public static void method402() {
		Static33.aClass38_1.anInt1431 = 0;
		Static52.aBoolean84 = true;
		Static107.anInt2709 = 0;
		Static52.aBoolean83 = true;
		Static75.aLong43 = 0L;
		Static101.method1767();
		Static98.aClass1_Sub8_Sub1_3.anInt1692 = 0;
		Static35.anInt871 = -1;
		Static80.aClass1_Sub8_Sub1_2.anInt1692 = 0;
		Static88.anInt2328 = -1;
		Static83.anInt2216 = 0;
		Static84.anInt2244 = 0;
		Static97.anInt2477 = 0;
		Static97.anInt2472 = -1;
		Static51.anInt1383 = -1;
		Static10.aBoolean13 = false;
		Static25.anInt732 = 0;
		Static6.anInt140 = 0;
		Static24.method507(0);
		for (@Pc(1671) int local1671 = 0; local1671 < 100; local1671++) {
			aClass42Array4[local1671] = null;
		}
		Static61.anInt1459 = 0;
		Static12.anInt362 = 0;
		Static74.anInt1894 = (int) (Math.random() * 30.0D) - 20;
		Static72.anInt2003 = -1;
		Static80.anInt2116 = (int) (Math.random() * 120.0D) - 60;
		Static79.anInt2016 = 0;
		Static30.anInt833 = 0;
		Static68.anInt1662 = (int) (Math.random() * 80.0D) - 40;
		Static105.anInt2732 = (int) (Math.random() * 100.0D) - 50;
		Static35.anInt874 = 0;
		Static31.anInt2252 = (int) (Math.random() * 110.0D) - 55;
		Static36.anInt897 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		Static27.anInt770 = 0;
		Static91.anInt2403 = 0;
		Static65.anInt1577 = 0;
		for (@Pc(1750) int local1750 = 0; local1750 < 2048; local1750++) {
			Static33.aClass1_Sub1_Sub8_Sub1_Sub2Array1[local1750] = null;
			Static79.aClass1_Sub8Array1[local1750] = null;
		}
		for (@Pc(1768) int local1768 = 0; local1768 < 32768; local1768++) {
			Static8.aClass1_Sub1_Sub8_Sub1_Sub1Array1[local1768] = null;
		}
		Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1 = Static33.aClass1_Sub1_Sub8_Sub1_Sub2Array1[2047] = new Class1_Sub1_Sub8_Sub1_Sub2();
		Static43.aClass22_8.method523();
		Static24.aClass22_6.method523();
		@Pc(1798) int local1798;
		for (@Pc(1794) int local1794 = 0; local1794 < 4; local1794++) {
			for (local1798 = 0; local1798 < 104; local1798++) {
				for (@Pc(1802) int local1802 = 0; local1802 < 104; local1802++) {
					Static93.aClass22ArrayArrayArray1[local1794][local1798][local1802] = null;
				}
			}
		}
		Static33.aClass22_7 = new Class22();
		Static8.anInt239 = 0;
		Static99.anInt2518 = 0;
		Static59.method1418(Static45.anInt1850);
		Static45.anInt1850 = -1;
		Static59.method1418(Static108.anInt2745);
		Static108.anInt2745 = -1;
		Static59.method1418(Static108.anInt2743);
		Static108.anInt2743 = -1;
		Static59.method1418(Static43.anInt1144);
		Static43.anInt1144 = -1;
		Static59.method1418(Static57.anInt2701);
		Static57.anInt2701 = -1;
		Static59.method1418(Static29.anInt819);
		Static29.anInt819 = -1;
		Static59.method1418(Static29.anInt824);
		Static25.aClass42_396 = null;
		Static108.anInt2748 = 3;
		Static106.anInt2737 = 0;
		Static60.anInt1444 = 0;
		Static36.anInt903 = -1;
		Static10.aBoolean13 = false;
		Static82.aBoolean117 = false;
		Static62.aBoolean87 = false;
		Static29.anInt824 = -1;
		Static98.aClass29_1.method634(false, new int[5], null, -1);
		for (local1798 = 0; local1798 < 5; local1798++) {
			Static56.aClass42Array9[local1798] = null;
			Static62.aBooleanArray9[local1798] = false;
		}
		Static34.aBoolean43 = true;
	}
}
