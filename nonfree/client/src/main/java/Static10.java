import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
	public static int anInt282;

	@OriginalMember(owner = "client!bc", name = "s", descriptor = "I")
	public static int anInt286;

	@OriginalMember(owner = "client!bc", name = "p", descriptor = "Lclient!he;")
	private static Class26 aClass26_161 = Static6.method100("Loaded interfaces");

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "Lclient!he;")
	public static Class26 aClass26_154 = aClass26_161;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "Lclient!he;")
	private static Class26 aClass26_155 = Static6.method100("Loading config )2 ");

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
	public static int anInt279 = 0;

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "Lclient!he;")
	private static Class26 aClass26_156 = Static6.method100("Please enter your username)3");

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "[I")
	public static int[] anIntArray32 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!bc", name = "m", descriptor = "Lclient!he;")
	private static Class26 aClass26_160 = Static6.method100("glow2:");

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "Lclient!he;")
	public static Class26 aClass26_157 = aClass26_160;

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "Lclient!he;")
	public static Class26 aClass26_158 = aClass26_160;

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "Lclient!he;")
	public static Class26 aClass26_159 = aClass26_156;

	@OriginalMember(owner = "client!bc", name = "q", descriptor = "Lclient!he;")
	public static Class26 aClass26_162 = aClass26_155;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
	public static void method164() {
		for (@Pc(6) Class3_Sub8 local6 = (Class3_Sub8) Static99.aClass65_70.method1958(); local6 != null; local6 = (Class3_Sub8) Static99.aClass65_70.method1962()) {
			if (local6.anInt1142 == -1) {
				local6.anInt1140 = 0;
				Static43.method1871(local6);
			} else {
				local6.method2201();
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)Z")
	public static boolean method165(@OriginalArg(1) int arg0) {
		return (arg0 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V")
	public static void method166() {
		for (@Pc(3) int local3 = -1; local3 < Static62.anInt1885; local3++) {
			@Pc(13) int local13;
			if (local3 == -1) {
				local13 = 2047;
			} else {
				local13 = Static117.anIntArray370[local3];
			}
			@Pc(21) Class3_Sub1_Sub5_Sub1_Sub1 local21 = Static38.aClass3_Sub1_Sub5_Sub1_Sub1Array1[local13];
			if (local21 != null) {
				Static20.method388(1, local21);
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I[BI)I")
	public static int method167(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static88.method1632(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!he;Ljava/awt/Color;ZI)V")
	public static void method168(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Color arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(6) Graphics local6 = Static58.aCanvas1.getGraphics();
			if (Static72.aFont1 == null) {
				Static72.aFont1 = new Font("Helvetica", 1, 13);
				Static11.aFontMetrics1 = Static58.aCanvas1.getFontMetrics(Static72.aFont1);
			}
			if (Static24.aBoolean47) {
				Static24.aBoolean47 = false;
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static96.anInt2603, Static93.anInt2527);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			try {
				if (Static107.anImage4 == null) {
					Static107.anImage4 = Static58.aCanvas1.createImage(304, 34);
				}
				@Pc(51) Graphics local51 = Static107.anImage4.getGraphics();
				local51.setColor(arg1);
				local51.drawRect(0, 0, 303, 33);
				local51.fillRect(2, 2, arg2 * 3, 30);
				local51.setColor(Color.black);
				local51.drawRect(1, 1, 301, 31);
				local51.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
				local51.setFont(Static72.aFont1);
				local51.setColor(Color.white);
				arg0.method831((304 - arg0.method836(Static11.aFontMetrics1)) / 2, 22, local51);
				local6.drawImage(Static107.anImage4, Static96.anInt2603 / 2 - 152, Static93.anInt2527 / 2 + -18, null);
			} catch (@Pc(133) Exception local133) {
				@Pc(139) int local139 = Static96.anInt2603 / 2 - 152;
				@Pc(145) int local145 = Static93.anInt2527 / 2 - 18;
				local6.setColor(arg1);
				local6.drawRect(local139, local145, 303, 33);
				local6.fillRect(local139 + 2, local145 - -2, arg2 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local139 + 1, local145 - -1, 301, 31);
				local6.fillRect(arg2 * 3 + local139 + 2, local145 + 2, 300 - arg2 * 3, 30);
				local6.setFont(Static72.aFont1);
				local6.setColor(Color.white);
				arg0.method831((304 - arg0.method836(Static11.aFontMetrics1)) / 2 + local139, local145 + 22, local6);
			}
		} catch (@Pc(224) Exception local224) {
			Static58.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!ef;Z)V")
	public static void method169(@OriginalArg(0) Class16 arg0) {
		Static1.aClass16_1 = arg0;
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V")
	public static void method170() {
		aClass26_156 = null;
		aClass26_160 = null;
		aClass26_158 = null;
		aClass26_155 = null;
		aClass26_157 = null;
		aClass26_154 = null;
		aClass26_159 = null;
		anIntArray32 = null;
		aClass26_162 = null;
		aClass26_161 = null;
	}
}
