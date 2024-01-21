import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!c", name = "a", descriptor = "Lclient!oc;")
	public static Class3_Sub1_Sub1_Sub4 aClass3_Sub1_Sub1_Sub4_9;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "Lclient!kd;")
	public static Class44_Sub1 aClass44_Sub1_14;

	@OriginalMember(owner = "client!c", name = "j", descriptor = "Lclient!kd;")
	public static Class44_Sub1 aClass44_Sub1_15;

	@OriginalMember(owner = "client!c", name = "t", descriptor = "I")
	public static int anInt307;

	@OriginalMember(owner = "client!c", name = "c", descriptor = "Lclient!oa;")
	public static Class56 aClass56_175 = Static33.method650("sl_back");

	@OriginalMember(owner = "client!c", name = "u", descriptor = "Lclient!oa;")
	private static Class56 aClass56_180 = Static33.method650("Too many incorrect logins from your address)3");

	@OriginalMember(owner = "client!c", name = "d", descriptor = "Lclient!oa;")
	public static Class56 aClass56_176 = aClass56_180;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "Z")
	public static boolean aBoolean17 = false;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "I")
	public static int anInt300 = -1;

	@OriginalMember(owner = "client!c", name = "i", descriptor = "Lclient!oa;")
	public static Class56 aClass56_177 = Static33.method650("(U");

	@OriginalMember(owner = "client!c", name = "m", descriptor = "Lclient!oa;")
	public static Class56 aClass56_178 = Static33.method650(")4l");

	@OriginalMember(owner = "client!c", name = "o", descriptor = "I")
	public static int anInt304 = 0;

	@OriginalMember(owner = "client!c", name = "p", descriptor = "Lclient!oa;")
	public static Class56 aClass56_179 = Static33.method650("Mitteilung");

	@OriginalMember(owner = "client!c", name = "q", descriptor = "I")
	public static int anInt305 = -1;

	@OriginalMember(owner = "client!c", name = "r", descriptor = "[I")
	public static int[] anIntArray26 = new int[50];

	@OriginalMember(owner = "client!c", name = "s", descriptor = "I")
	public static int anInt306 = 0;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)Lclient!ke;")
	public static Class3_Sub1_Sub8 method239(@OriginalArg(1) int arg0) {
		@Pc(6) Class3_Sub1_Sub8 local6 = (Class3_Sub1_Sub8) Static80.aClass52_42.method1342((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static88.aClass44_52.method1146(10, arg0);
		local6 = new Class3_Sub1_Sub8();
		local6.anInt1734 = arg0;
		if (local20 != null) {
			local6.method1186(new Class3_Sub2(local20));
		}
		local6.method1194();
		if (local6.anInt1762 != -1) {
			local6.method1189(method239(local6.anInt1774), method239(local6.anInt1762));
		}
		if (!Static108.aBoolean135 && local6.aBoolean82) {
			local6.aClass56Array6 = null;
			local6.aClass56_944 = Static113.aClass56_1553;
			local6.anInt1758 = 0;
			local6.aClass56Array7 = null;
		}
		Static80.aClass52_42.method1344(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III)Lclient!oa;")
	public static Class56 method240(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = arg1 - arg0;
		if (local4 < -9) {
			return Static41.aClass56_653;
		} else if (local4 < -6) {
			return Static28.aClass56_413;
		} else if (local4 < -3) {
			return Static126.aClass56_1704;
		} else if (local4 < 0) {
			return Static119.aClass56_1627;
		} else if (local4 > 9) {
			return Static50.aClass56_803;
		} else if (local4 > 6) {
			return Static65.aClass56_984;
		} else if (local4 > 3) {
			return Static70.aClass56_1022;
		} else if (local4 > 0) {
			return Static98.aClass56_1404;
		} else {
			return Static50.aClass56_801;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V")
	public static void method241() {
		aClass56_179 = null;
		aClass44_Sub1_15 = null;
		aClass56_177 = null;
		aClass56_178 = null;
		aClass3_Sub1_Sub1_Sub4_9 = null;
		aClass56_180 = null;
		aClass44_Sub1_14 = null;
		aClass56_175 = null;
		anIntArray26 = null;
		aClass56_176 = null;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILjava/awt/Color;Lclient!oa;I)V")
	public static void method242(@OriginalArg(1) Color arg0, @OriginalArg(2) Class56 arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(6) Graphics local6 = Static59.aCanvas1.getGraphics();
			if (Static31.aFont1 == null) {
				Static31.aFont1 = new Font("Helvetica", 1, 13);
				Static102.aFontMetrics56 = Static59.aCanvas1.getFontMetrics(Static31.aFont1);
			}
			if (Static80.aBoolean98) {
				Static80.aBoolean98 = false;
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static31.anInt927, Static26.anInt765);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			try {
				if (Static75.anImage4 == null) {
					Static75.anImage4 = Static59.aCanvas1.createImage(304, 34);
				}
				@Pc(51) Graphics local51 = Static75.anImage4.getGraphics();
				local51.setColor(arg0);
				local51.drawRect(0, 0, 303, 33);
				local51.fillRect(2, 2, arg2 * 3, 30);
				local51.setColor(Color.black);
				local51.drawRect(1, 1, 301, 31);
				local51.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
				local51.setFont(Static31.aFont1);
				local51.setColor(Color.white);
				arg1.method1432(22, (304 - arg1.method1455(Static102.aFontMetrics56)) / 2, local51);
				local6.drawImage(Static75.anImage4, Static31.anInt927 / 2 - 152, Static26.anInt765 / 2 + -18, null);
			} catch (@Pc(128) Exception local128) {
				@Pc(134) int local134 = Static31.anInt927 / 2 - 152;
				@Pc(140) int local140 = Static26.anInt765 / 2 - 18;
				local6.setColor(arg0);
				local6.drawRect(local134, local140, 303, 33);
				local6.fillRect(local134 + 2, local140 + 2, arg2 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local134 + 1, local140 + 1, 301, 31);
				local6.fillRect(arg2 * 3 + local134 + 2, local140 - -2, 300 - arg2 * 3, 30);
				local6.setFont(Static31.aFont1);
				local6.setColor(Color.white);
				arg1.method1432(local140 + 22, (-arg1.method1455(Static102.aFontMetrics56) + 304) / 2 + local134, local6);
			}
		} catch (@Pc(219) Exception local219) {
			Static59.aCanvas1.repaint();
		}
	}
}
