import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "p", descriptor = "[I")
	public static int[] anIntArray28;

	@OriginalMember(owner = "client!ac", name = "Q", descriptor = "Lclient!gb;")
	public static Class20 aClass20_1;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "Lclient!wb;")
	private static Class65 aClass65_91 = Static24.method441("Off");

	@OriginalMember(owner = "client!ac", name = "N", descriptor = "Lclient!wb;")
	private static Class65 aClass65_98 = Static24.method441("shake:");

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "Lclient!wb;")
	public static Class65 aClass65_92 = aClass65_98;

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "[J")
	public static long[] aLongArray1 = new long[32];

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "Lclient!wb;")
	public static Class65 aClass65_93 = aClass65_91;

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "Lclient!s;")
	public static Class52 aClass52_1 = new Class52();

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "Lclient!wb;")
	public static Class65 aClass65_94 = Static24.method441("::");

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "[J")
	public static long[] aLongArray2 = new long[200];

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "Z")
	public static boolean aBoolean15 = false;

	@OriginalMember(owner = "client!ac", name = "o", descriptor = "Lclient!wb;")
	public static Class65 aClass65_95 = Static24.method441("leuchten2:");

	@OriginalMember(owner = "client!ac", name = "s", descriptor = "J")
	public static long aLong7 = 0L;

	@OriginalMember(owner = "client!ac", name = "B", descriptor = "Lclient!wb;")
	private static Class65 aClass65_97 = Static24.method441("Connecting to update server");

	@OriginalMember(owner = "client!ac", name = "u", descriptor = "Lclient!wb;")
	public static Class65 aClass65_96 = aClass65_97;

	@OriginalMember(owner = "client!ac", name = "L", descriptor = "Z")
	public static boolean aBoolean16 = false;

	@OriginalMember(owner = "client!ac", name = "P", descriptor = "Lclient!wb;")
	public static Class65 aClass65_99 = Static24.method441("Ignorieren");

	@OriginalMember(owner = "client!ac", name = "S", descriptor = "Lclient!wb;")
	private static Class65 aClass65_101 = Static24.method441("World");

	@OriginalMember(owner = "client!ac", name = "R", descriptor = "Lclient!wb;")
	public static Class65 aClass65_100 = aClass65_101;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V")
	public static void method89() {
		aClass65_96 = null;
		aClass52_1 = null;
		aClass20_1 = null;
		aClass65_99 = null;
		aClass65_98 = null;
		aClass65_92 = null;
		aClass65_94 = null;
		aLongArray2 = null;
		aLongArray1 = null;
		aClass65_93 = null;
		aClass65_95 = null;
		anIntArray28 = null;
		aClass65_100 = null;
		aClass65_101 = null;
		aClass65_91 = null;
		aClass65_97 = null;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
	public static void method90() {
		@Pc(18) int local18;
		for (@Pc(11) int local11 = -1; local11 < Static54.anInt1640; local11++) {
			if (local11 == -1) {
				local18 = 2047;
			} else {
				local18 = Static24.anIntArray99[local11];
			}
			@Pc(28) Class2_Sub1_Sub1_Sub2_Sub2 local28 = Static89.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local18];
			if (local28 != null && local28.anInt1531 > 0) {
				local28.anInt1531--;
				if (local28.anInt1531 == 0) {
					local28.aClass65_707 = null;
				}
			}
		}
		for (local18 = 0; local18 < Static51.anInt1482; local18++) {
			@Pc(61) int local61 = Static23.anIntArray92[local18];
			@Pc(65) Class2_Sub1_Sub1_Sub2_Sub1 local65 = Static24.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local61];
			if (local65 != null && local65.anInt1531 > 0) {
				local65.anInt1531--;
				if (local65.anInt1531 == 0) {
					local65.aClass65_707 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!wb;ZBLclient!wb;)V")
	public static void method94(@OriginalArg(0) Class65 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class65 arg2) {
		if (Static38.aBoolean74) {
			Static38.aBoolean74 = false;
			method95();
			Static81.method1799();
			Static98.method1697();
			Static27.method497();
			Static28.method506(Static103.anInt2811, Static85.anInt2454, Static110.aClass2_Sub1_Sub4_Sub4_3, Static42.anInt1350);
			Static108.method1773(-1, Static62.anIntArray253, Static89.anInt2549 == -1, Static37.anInt1223);
			Static79.aBoolean119 = true;
			Static92.aBoolean135 = true;
			Static24.aBoolean49 = true;
		}
		Static70.method1260();
		@Pc(43) short local43 = 151;
		@Pc(44) int local44 = local43 - 3;
		Static110.aClass2_Sub1_Sub4_Sub4_3.method1838(arg2, 257, 148, 0);
		Static110.aClass2_Sub1_Sub4_Sub4_3.method1838(arg2, 256, 147, 16777215);
		if (arg0 != null) {
			local44 += 15;
			if (arg1) {
				@Pc(74) int local74 = Static110.aClass2_Sub1_Sub4_Sub4_3.method1839(arg0) + 4;
				Static43.method1815(257 - local74 / 2, 152, local74, 11, 0);
			}
			Static110.aClass2_Sub1_Sub4_Sub4_3.method1838(arg0, 257, 163, 0);
			Static110.aClass2_Sub1_Sub4_Sub4_3.method1838(arg0, 256, 162, 16777215);
		}
		Static26.method1805();
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
	public static void method95() {
		try {
			@Pc(2) Graphics local2 = Static70.aCanvas1.getGraphics();
			Static50.aClass15_36.method1104(4, local2, 0);
			Static69.aClass15_49.method1104(357, local2, 0);
			Static82.aClass15_55.method1104(4, local2, 722);
			Static6.aClass15_7.method1104(205, local2, 743);
			Static29.aClass15_21.method1104(0, local2, 0);
			Static52.aClass15_38.method1104(4, local2, 516);
			Static93.aClass15_65.method1104(205, local2, 516);
			Static65.aClass15_44.method1104(357, local2, 496);
			Static15.aClass15_13.method1104(338, local2, 0);
		} catch (@Pc(63) Exception local63) {
			Static70.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)V")
	public static void method97(@OriginalArg(1) int arg0) {
		if (Static78.aClass14_2 == null) {
			return;
		}
		if (Static39.anInt1240 == 0) {
			if (Static27.anInt785 >= 0) {
				Static27.anInt785 = arg0;
				Static78.aClass14_2.method1549(arg0, 0);
			}
		} else if (Static74.aByteArray44 != null) {
			Static12.anInt414 = arg0;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "([BIII)Lclient!wb;")
	public static Class65 method100(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class65 local9 = new Class65();
		local9.anInt2878 = 0;
		local9.aByteArray70 = new byte[arg1];
		for (@Pc(18) int local18 = arg2; local18 < arg1 + arg2; local18++) {
			if (arg0[local18] != 0) {
				local9.aByteArray70[local9.anInt2878++] = arg0[local18];
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILclient!wb;)Z")
	public static boolean method102(@OriginalArg(1) Class65 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static32.anInt1047; local16++) {
			if (arg0.method1788(Static67.aClass65Array9[local16])) {
				return true;
			}
		}
		return arg0.method1788(Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.aClass65_726);
	}
}
