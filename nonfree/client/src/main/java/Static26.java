import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!ed", name = "z", descriptor = "[I")
	public static int[] anIntArray415;

	@OriginalMember(owner = "client!ed", name = "C", descriptor = "Lclient!mc;")
	public static Class33_Sub1 aClass33_Sub1_50;

	@OriginalMember(owner = "client!ed", name = "E", descriptor = "I")
	public static int anInt2915;

	@OriginalMember(owner = "client!ed", name = "P", descriptor = "I")
	public static int anInt2923;

	@OriginalMember(owner = "client!ed", name = "y", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1350 = Static24.method441("Texturen geladen)3");

	@OriginalMember(owner = "client!ed", name = "B", descriptor = "Lclient!qa;")
	public static Class2_Sub8_Sub1 aClass2_Sub8_Sub1_31 = new Class2_Sub8_Sub1(5000);

	@OriginalMember(owner = "client!ed", name = "D", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1351 = Static24.method441("(Udns");

	@OriginalMember(owner = "client!ed", name = "H", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1352 = Static24.method441("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!ed", name = "Q", descriptor = "Lclient!ab;")
	public static Class2_Sub1_Sub2 aClass2_Sub1_Sub2_29 = new Class2_Sub1_Sub2();

	@OriginalMember(owner = "client!ed", name = "R", descriptor = "I")
	public static int anInt2924 = 0;

	@OriginalMember(owner = "client!ed", name = "S", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1353 = Static24.method441("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <ON>");

	@OriginalMember(owner = "client!ed", name = "T", descriptor = "[I")
	public static int[] anIntArray416 = new int[2000];

	@OriginalMember(owner = "client!ed", name = "U", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1354 = Static24.method441("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!ed", name = "V", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1355 = Static24.method441("overlay_multiway");

	@OriginalMember(owner = "client!ed", name = "X", descriptor = "Lclient!wb;")
	private static Class65 aClass65_1357 = Static24.method441("Loading title screen )2 ");

	@OriginalMember(owner = "client!ed", name = "W", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1356 = aClass65_1357;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!b;BI[B)V")
	public static void method1801(@OriginalArg(0) Class5 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) Class2_Sub9 local7 = new Class2_Sub9();
		local7.aByteArray36 = arg2;
		local7.aLong82 = arg1;
		local7.anInt1142 = 0;
		local7.aClass5_1 = arg0;
		@Pc(27) Class52 local27 = Static62.aClass52_8;
		synchronized (Static62.aClass52_8) {
			Static62.aClass52_8.method1593(local7);
		}
		Static98.method1692();
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "(I)V")
	public static void method1802() {
		for (@Pc(3) int local3 = 0; local3 < Static98.anInt2765; local3++) {
			@Pc(11) int local11 = Static19.anIntArray256[local3]--;
			if (Static19.anIntArray256[local3] >= -10) {
				@Pc(78) Class35 local78 = Static30.aClass35Array1[local3];
				if (local78 == null) {
					local78 = Static112.method964(Static25.aClass33_Sub1_13, Static85.anIntArray320[local3]);
					if (local78 == null) {
						continue;
					}
					Static19.anIntArray256[local3] += local78.method966();
					Static30.aClass35Array1[local3] = local78;
				}
				if (Static19.anIntArray256[local3] < 0) {
					@Pc(203) int local203;
					if (Static105.anIntArray410[local3] == 0) {
						local203 = Static21.anInt2499;
					} else {
						@Pc(122) int local122 = (Static105.anIntArray410[local3] & 0xFF) * 128;
						@Pc(130) int local130 = Static105.anIntArray410[local3] >> 16 & 0xFF;
						@Pc(138) int local138 = Static105.anIntArray410[local3] >> 8 & 0xFF;
						@Pc(148) int local148 = local130 * 128 + 64 - Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anInt1518;
						@Pc(158) int local158 = local138 * 128 + 64 - Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anInt1562;
						if (local148 < 0) {
							local148 = -local148;
						}
						if (local158 < 0) {
							local158 = -local158;
						}
						@Pc(177) int local177 = local158 + local148 - 128;
						if (local177 > local122) {
							Static19.anIntArray256[local3] = -100;
							continue;
						}
						if (local177 < 0) {
							local177 = 0;
						}
						local203 = Static83.anInt2378 * (local122 - local177) / local122;
					}
					@Pc(212) Class2_Sub4_Sub1 local212 = local78.method965().method1239(Static99.aClass12_3);
					@Pc(217) Class2_Sub10_Sub1 local217 = Static113.method1321(local212, local203);
					local217.method1318(Static104.anIntArray409[local3] - 1);
					Static8.aClass2_Sub10_Sub2_1.method1677(local217);
					Static19.anIntArray256[local3] = -100;
				}
			} else {
				Static98.anInt2765--;
				for (@Pc(25) int local25 = local3; local25 < Static98.anInt2765; local25++) {
					Static85.anIntArray320[local25] = Static85.anIntArray320[local25 + 1];
					Static30.aClass35Array1[local25] = Static30.aClass35Array1[local25 + 1];
					Static104.anIntArray409[local25] = Static104.anIntArray409[local25 + 1];
					Static19.anIntArray256[local25] = Static19.anIntArray256[local25 + 1];
					Static105.anIntArray410[local25] = Static105.anIntArray410[local25 + 1];
				}
				local3--;
			}
		}
		if (Static71.anInt2165 <= 0) {
			return;
		}
		Static71.anInt2165 -= 20;
		if (Static71.anInt2165 < 0) {
			Static71.anInt2165 = 0;
		}
		if (Static71.anInt2165 == 0 && Static97.anInt2711 != 0 && Static15.anInt478 != -1) {
			Static57.method1003(Static15.anInt478, aClass33_Sub1_50, 0, Static97.anInt2711);
			return;
		}
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "(B)V")
	public static void method1804() {
		aClass33_Sub1_50 = null;
		aClass2_Sub8_Sub1_31 = null;
		aClass2_Sub1_Sub2_29 = null;
		anIntArray416 = null;
		aClass65_1351 = null;
		aClass65_1353 = null;
		aClass65_1355 = null;
		aClass65_1356 = null;
		aClass65_1354 = null;
		aClass65_1357 = null;
		aClass65_1350 = null;
		aClass65_1352 = null;
		anIntArray415 = null;
	}

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "(I)V")
	public static void method1805() {
		try {
			@Pc(6) Graphics local6 = Static70.aCanvas1.getGraphics();
			Static7.aClass15_9.method1104(4, local6, 4);
		} catch (@Pc(14) Exception local14) {
			Static70.aCanvas1.repaint();
		}
	}
}
