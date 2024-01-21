import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!w", name = "n", descriptor = "Lclient!le;")
	public static Class36 aClass36_37;

	@OriginalMember(owner = "client!w", name = "y", descriptor = "[I")
	public static int[] anIntArray299;

	@OriginalMember(owner = "client!w", name = "b", descriptor = "I")
	public static int anInt3147 = 0;

	@OriginalMember(owner = "client!w", name = "c", descriptor = "I")
	public static int anInt3148 = 0;

	@OriginalMember(owner = "client!w", name = "k", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1320 = Static34.method846(" (X");

	@OriginalMember(owner = "client!w", name = "l", descriptor = "I")
	public static int anInt3152 = 0;

	@OriginalMember(owner = "client!w", name = "m", descriptor = "Lclient!rc;")
	private static Class55 aClass55_1321 = Static34.method846("Moderator option: Mute player for 48 hours: <ON>");

	@OriginalMember(owner = "client!w", name = "u", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1322 = Static34.method846("Lade Spiel)2Fenster )2 ");

	@OriginalMember(owner = "client!w", name = "z", descriptor = "Lclient!rc;")
	private static Class55 aClass55_1323 = Static34.method846("Loaded input handler");

	@OriginalMember(owner = "client!w", name = "J", descriptor = "I")
	public static int anInt3162 = 99;

	@OriginalMember(owner = "client!w", name = "N", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1324 = aClass55_1321;

	@OriginalMember(owner = "client!w", name = "U", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1325 = aClass55_1323;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIBI)Z")
	public static boolean method2037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg1 >> 14 & 0x7FFF;
		@Pc(23) int local23 = Static109.aClass34_1.method1022(Static56.anInt1718, arg2, arg0, arg1);
		if (local23 == -1) {
			return false;
		}
		@Pc(33) int local33 = local23 & 0x1F;
		@Pc(39) int local39 = local23 >> 6 & 0x3;
		if (local33 == 10 || local33 == 11 || local33 == 22) {
			@Pc(76) Class6_Sub2_Sub15 local76 = Static8.method333(local16);
			@Pc(89) int local89;
			@Pc(92) int local92;
			if (local39 == 0 || local39 == 2) {
				local92 = local76.anInt2984;
				local89 = local76.anInt2981;
			} else {
				local89 = local76.anInt2984;
				local92 = local76.anInt2981;
			}
			@Pc(103) int local103 = local76.anInt3017;
			if (local39 != 0) {
				local103 = (local103 >> 4 - local39) + (local103 << local39 & 0xF);
			}
			Static75.method1436(arg0, 0, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray256[0], true, local103, 0, local92, 2, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray255[0], local89, arg2);
		} else {
			Static75.method1436(arg0, local33 + 1, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray256[0], true, 0, local39, 0, 2, Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray255[0], 0, arg2);
		}
		Static19.anInt946 = 2;
		Static64.anInt1921 = Static23.anInt1030;
		Static11.anInt696 = Static68.anInt2013;
		Static111.anInt3172 = 0;
		return true;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!rc;ILjava/awt/Color;I)V")
	public static void method2038(@OriginalArg(0) Class55 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Color arg2) {
		try {
			@Pc(6) Graphics local6 = Static32.aCanvas1.getGraphics();
			if (Static109.aFont1 == null) {
				Static109.aFont1 = new Font("Helvetica", 1, 13);
				Static33.aFontMetrics1 = Static32.aCanvas1.getFontMetrics(Static109.aFont1);
			}
			if (Static52.aBoolean74) {
				Static52.aBoolean74 = false;
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static88.anInt3261, Static9.anInt419);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			try {
				if (Static86.anImage4 == null) {
					Static86.anImage4 = Static32.aCanvas1.createImage(304, 34);
				}
				@Pc(60) Graphics local60 = Static86.anImage4.getGraphics();
				local60.setColor(arg2);
				local60.drawRect(0, 0, 303, 33);
				local60.fillRect(2, 2, arg1 * 3, 30);
				local60.setColor(Color.black);
				local60.drawRect(1, 1, 301, 31);
				local60.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
				local60.setFont(Static109.aFont1);
				local60.setColor(Color.white);
				arg0.method1641(local60, (304 - arg0.method1652(Static33.aFontMetrics1)) / 2, 22);
				local6.drawImage(Static86.anImage4, Static88.anInt3261 / 2 - 152, Static9.anInt419 / 2 - 18, null);
			} catch (@Pc(137) Exception local137) {
				@Pc(143) int local143 = Static88.anInt3261 / 2 - 152;
				@Pc(149) int local149 = Static9.anInt419 / 2 - 18;
				local6.setColor(arg2);
				local6.drawRect(local143, local149, 303, 33);
				local6.fillRect(local143 + 2, local149 + 2, arg1 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local143 + 1, local149 + 1, 301, 31);
				local6.fillRect(local143 + arg1 * 3 + 2, local149 + 2, 300 - arg1 * 3, 30);
				local6.setFont(Static109.aFont1);
				local6.setColor(Color.white);
				arg0.method1641(local6, (304 - arg0.method1652(Static33.aFontMetrics1)) / 2 + local143, local149 + 22);
			}
		} catch (@Pc(229) Exception local229) {
			Static32.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
	public static void method2039() {
		aClass36_37 = null;
		aClass55_1320 = null;
		aClass55_1322 = null;
		aClass55_1325 = null;
		aClass55_1321 = null;
		anIntArray299 = null;
		aClass55_1324 = null;
		aClass55_1323 = null;
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(B)V")
	public static void method2040() {
		Static58.aClass36_22.method1155();
	}
}
