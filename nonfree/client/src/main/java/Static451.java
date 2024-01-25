import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!qaa", name = "f", descriptor = "I")
	public static int anInt7592;

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "[Lclient!tda;")
	public static final Interface24[] anInterface24Array4 = new Interface24[128];

	@OriginalMember(owner = "client!qaa", name = "d", descriptor = "I")
	public static int anInt7590 = 0;

	@OriginalMember(owner = "client!qaa", name = "g", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray9 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(III)V")
	public static void method6701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static571.anInt9391 != 0) {
			if (arg1 >= 0) {
				Static68.anIntArray95[arg1] = arg0;
			} else {
				for (@Pc(16) int local16 = 0; local16 < 16; local16++) {
					Static68.anIntArray95[local16] = arg0;
				}
			}
		}
		Static275.aClass5_Sub16_Sub1_5.method2576(arg1, arg0);
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ILjava/awt/Color;BLjava/awt/Color;Ljava/lang/String;Ljava/awt/Color;)V")
	public static void method6703(@OriginalArg(0) int arg0, @OriginalArg(1) Color arg1, @OriginalArg(3) Color arg2, @OriginalArg(4) String arg3, @OriginalArg(5) Color arg4) {
		try {
			@Pc(6) Graphics local6 = Static181.aCanvas3.getGraphics();
			if (Static328.aFont2 == null) {
				Static328.aFont2 = new Font("Helvetica", 1, 13);
			}
			if (arg4 == null) {
				arg4 = new Color(140, 17, 17);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			if (arg2 == null) {
				arg2 = new Color(255, 255, 255);
			}
			try {
				if (Static357.anImage13 == null) {
					Static357.anImage13 = Static181.aCanvas3.createImage(Static254.anInt4283, Static438.anInt7403);
				}
				@Pc(60) Graphics local60 = Static357.anImage13.getGraphics();
				local60.setColor(Color.black);
				local60.fillRect(0, 0, Static254.anInt4283, Static438.anInt7403);
				@Pc(75) int local75 = Static254.anInt4283 / 2 - 152;
				@Pc(81) int local81 = Static438.anInt7403 / 2 - 18;
				local60.setColor(arg1);
				local60.drawRect(local75, local81, 303, 33);
				local60.setColor(arg4);
				local60.fillRect(local75 + 2, local81 + 2, arg0 * 3, 30);
				local60.setColor(Color.black);
				local60.drawRect(local75 + 1, local81 + 1, 301, 31);
				local60.fillRect(arg0 * 3 + local75 + 2, local81 + 2, 300 - arg0 * 3, 30);
				local60.setFont(Static328.aFont2);
				local60.setColor(arg2);
				local60.drawString(arg3, local75 + (304 - arg3.length() * 6) / 2, local81 - -22);
				if (Static646.aString146 != null) {
					local60.setFont(Static328.aFont2);
					local60.setColor(arg2);
					local60.drawString(Static646.aString146, Static254.anInt4283 / 2 - Static646.aString146.length() * 6 / 2, Static438.anInt7403 / 2 + -26);
				}
				local6.drawImage(Static357.anImage13, 0, 0, (ImageObserver) null);
			} catch (@Pc(195) Exception local195) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static254.anInt4283, Static438.anInt7403);
				@Pc(210) int local210 = Static254.anInt4283 / 2 - 152;
				@Pc(216) int local216 = Static438.anInt7403 / 2 - 18;
				local6.setColor(arg1);
				local6.drawRect(local210, local216, 303, 33);
				local6.setColor(arg4);
				local6.fillRect(local210 + 2, local216 + 2, arg0 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local210 + 1, local216 - -1, 301, 31);
				local6.fillRect(arg0 * 3 + local210 + 2, local216 - -2, 300 - arg0 * 3, 30);
				local6.setFont(Static328.aFont2);
				local6.setColor(arg2);
				if (Static646.aString146 != null) {
					local6.setFont(Static328.aFont2);
					local6.setColor(arg2);
					local6.drawString(Static646.aString146, Static254.anInt4283 / 2 - Static646.aString146.length() * 6 / 2, Static438.anInt7403 / 2 + -26);
				}
				local6.drawString(arg3, local210 + (304 - arg3.length() * 6) / 2, local216 + 22);
			}
		} catch (@Pc(323) Exception local323) {
			Static181.aCanvas3.repaint();
		}
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ZB)V")
	public static void method6704(@OriginalArg(0) boolean arg0) {
		if (arg0 && Static203.aClass5_Sub4_Sub1_2 != null) {
			Static513.anInt8592 = Static203.aClass5_Sub4_Sub1_2.anInt521;
		} else {
			Static513.anInt8592 = -1;
		}
		Static157.aClass357_6 = null;
		Static173.aClass306_13 = null;
		Static88.anInt1458 = 0;
		Static203.aClass5_Sub4_Sub1_2 = null;
		Static203.method142();
		Static203.aClass306_2.method7315();
		Static453.aClass262_6 = null;
		Static413.aClass262_5 = null;
		Static245.aClass262_2 = null;
		Static272.aClass262_3 = null;
		Static639.aClass262_8 = null;
		Static486.anInt8186 = -1;
		Static493.aClass262_7 = null;
		Static173.aClass262_1 = null;
		Static334.aClass262_4 = null;
		Static619.aClass44_37 = null;
		Static100.anInt1573 = -1;
		Static203.aClass383_2 = null;
		if (Static203.aClass273_2 != null) {
			Static203.aClass273_2.method6534();
			Static203.aClass273_2.method6530(128, 64);
		}
		if (Static203.aClass56_2 != null) {
			Static203.aClass56_2.method1170(64, 64);
		}
		if (Static203.aClass371_2 != null) {
			Static203.aClass371_2.method8558(64);
		}
		Static386.aClass338_1.method8032(64);
	}
}
