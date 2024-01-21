import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!te", name = "b", descriptor = "Lclient!t;")
	public static Class70 aClass70_1;

	@OriginalMember(owner = "client!te", name = "u", descriptor = "Lclient!ea;")
	public static Class20 aClass20_55;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "[I")
	public static int[] anIntArray308 = new int[25];

	@OriginalMember(owner = "client!te", name = "d", descriptor = "[I")
	public static int[] anIntArray309 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!te", name = "e", descriptor = "Lclient!ec;")
	private static Class22 aClass22_883 = Static60.method1113("glow2:");

	@OriginalMember(owner = "client!te", name = "f", descriptor = "I")
	public static int anInt2833 = 0;

	@OriginalMember(owner = "client!te", name = "h", descriptor = "I")
	public static int anInt2835 = -1;

	@OriginalMember(owner = "client!te", name = "j", descriptor = "Lclient!ec;")
	public static Class22 aClass22_884 = Static60.method1113("<col=ffff00>");

	@OriginalMember(owner = "client!te", name = "l", descriptor = "Lclient!ec;")
	public static Class22 aClass22_885 = Static60.method1113("mapback");

	@OriginalMember(owner = "client!te", name = "m", descriptor = "Lclient!ja;")
	public static Class33 aClass33_31 = new Class33(30);

	@OriginalMember(owner = "client!te", name = "n", descriptor = "[Lclient!p;")
	public static Class4_Sub1_Sub3_Sub4[] aClass4_Sub1_Sub3_Sub4Array1 = new Class4_Sub1_Sub3_Sub4[4];

	@OriginalMember(owner = "client!te", name = "o", descriptor = "[I")
	public static int[] anIntArray310 = new int[2048];

	@OriginalMember(owner = "client!te", name = "p", descriptor = "Lclient!ec;")
	public static Class22 aClass22_886 = aClass22_883;

	@OriginalMember(owner = "client!te", name = "r", descriptor = "Lclient!ec;")
	public static Class22 aClass22_887 = Static60.method1113("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!te", name = "s", descriptor = "I")
	public static int anInt2839 = -1;

	@OriginalMember(owner = "client!te", name = "t", descriptor = "Lclient!ec;")
	public static Class22 aClass22_888 = aClass22_883;

	@OriginalMember(owner = "client!te", name = "v", descriptor = "I")
	public static int anInt2840 = 0;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)V")
	public static void method1824() {
		if (Static89.aBooleanArray18[98]) {
			Static112.anInt2779 += (12 - Static112.anInt2779) / 2;
		} else if (Static89.aBooleanArray18[99]) {
			Static112.anInt2779 += (-Static112.anInt2779 - 12) / 2;
		} else {
			Static112.anInt2779 /= 2;
		}
		Static111.anInt2766 += Static112.anInt2779 / 2;
		if (Static111.anInt2766 < 128) {
			Static111.anInt2766 = 128;
		}
		if (Static111.anInt2766 > 383) {
			Static111.anInt2766 = 383;
		}
		if (Static89.aBooleanArray18[96]) {
			Static91.anInt2416 += (-Static91.anInt2416 - 24) / 2;
		} else if (Static89.aBooleanArray18[97]) {
			Static91.anInt2416 += (24 - Static91.anInt2416) / 2;
		} else {
			Static91.anInt2416 /= 2;
		}
		Static111.anInt2754 = Static111.anInt2754 + Static91.anInt2416 / 2 & 0x7FF;
		@Pc(104) int local104 = Static111.anInt2760 + Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt2500;
		@Pc(109) int local109 = Static11.anInt2986 + Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt2462;
		if (Static49.anInt1328 - local104 < -500 || Static49.anInt1328 - local104 > 500 || Static89.anInt2374 - local109 < -500 || Static89.anInt2374 - local109 > 500) {
			Static89.anInt2374 = local109;
			Static49.anInt1328 = local104;
		}
		if (Static49.anInt1328 != local104) {
			Static49.anInt1328 += (local104 - Static49.anInt1328) / 16;
		}
		if (local109 != Static89.anInt2374) {
			Static89.anInt2374 += (local109 - Static89.anInt2374) / 16;
		}
		@Pc(180) int local180 = Static49.anInt1328 >> 7;
		@Pc(182) int local182 = 0;
		@Pc(186) int local186 = Static89.anInt2374 >> 7;
		@Pc(192) int local192 = Static69.method1173(Static37.anInt895, Static49.anInt1328, Static89.anInt2374);
		@Pc(214) int local214;
		if (local180 > 3 && local186 > 3 && local180 < 100 && local186 < 100) {
			for (local214 = local180 - 4; local214 <= local180 + 4; local214++) {
				for (@Pc(220) int local220 = local186 - 4; local220 <= local186 + 4; local220++) {
					@Pc(224) int local224 = Static37.anInt895;
					if (local224 < 3 && (Static3.aByteArrayArrayArray1[1][local214][local220] & 0x2) == 2) {
						local224++;
					}
					@Pc(253) int local253 = local192 - Static57.anIntArrayArrayArray4[local224][local214][local220];
					if (local253 > local182) {
						local182 = local253;
					}
				}
			}
		}
		local214 = local182 * 192;
		if (local214 > 98048) {
			local214 = 98048;
		}
		if (local214 < 32768) {
			local214 = 32768;
		}
		if (local214 > Static22.anInt2807) {
			Static22.anInt2807 += (local214 - Static22.anInt2807) / 24;
		} else if (Static22.anInt2807 > local214) {
			Static22.anInt2807 += (local214 - Static22.anInt2807) / 80;
		}
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(Z)V")
	public static void method1825() {
		aClass70_1 = null;
		aClass22_883 = null;
		anIntArray310 = null;
		aClass22_885 = null;
		aClass22_887 = null;
		aClass4_Sub1_Sub3_Sub4Array1 = null;
		aClass33_31 = null;
		aClass20_55 = null;
		aClass22_884 = null;
		aClass22_888 = null;
		anIntArray308 = null;
		aClass22_886 = null;
		anIntArray309 = null;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
	public static void method1826() {
		for (@Pc(15) Class4_Sub5 local15 = (Class4_Sub5) Static39.aClass82_4.method2025(); local15 != null; local15 = (Class4_Sub5) Static39.aClass82_4.method2023()) {
			if (local15.anInt537 == -1) {
				local15.anInt538 = 0;
				Static5.method43(local15);
			} else {
				local15.method1999();
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
	public static void method1827() {
		@Pc(5) Class57 local5 = Static33.aClass57_1;
		synchronized (Static33.aClass57_1) {
			Static72.anInt1920 = Static68.anInt499;
			Static72.anInt1914 = Static105.anInt2637;
			Static117.anInt2876 = Static38.anInt950;
			Static65.anInt1845 = Static133.anInt3140;
			Static8.anInt2382 = Static128.anInt3045;
			Static55.anInt1118 = Static13.anInt269;
			Static70.aLong57 = Static27.aLong26;
			Static133.anInt3140 = 0;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!ec;ILjava/awt/Color;I)V")
	public static void method1828(@OriginalArg(0) Class22 arg0, @OriginalArg(2) Color arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(2) Graphics local2 = Static89.aCanvas1.getGraphics();
			if (Static28.aFont1 == null) {
				Static28.aFont1 = new Font("Helvetica", 1, 13);
				Static93.aFontMetrics1 = Static89.aCanvas1.getFontMetrics(Static28.aFont1);
			}
			if (Static1.aBoolean1) {
				Static1.aBoolean1 = false;
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static121.anInt2947, Static29.anInt685);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			try {
				if (Static84.anImage4 == null) {
					Static84.anImage4 = Static89.aCanvas1.createImage(304, 34);
				}
				@Pc(47) Graphics local47 = Static84.anImage4.getGraphics();
				local47.setColor(arg1);
				local47.drawRect(0, 0, 303, 33);
				local47.fillRect(2, 2, arg2 * 3, 30);
				local47.setColor(Color.black);
				local47.drawRect(1, 1, 301, 31);
				local47.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
				local47.setFont(Static28.aFont1);
				local47.setColor(Color.white);
				arg0.method462((304 - arg0.method461(Static93.aFontMetrics1)) / 2, 22, local47);
				local2.drawImage(Static84.anImage4, Static121.anInt2947 / 2 - 152, Static29.anInt685 / 2 - 18, null);
			} catch (@Pc(126) Exception local126) {
				@Pc(132) int local132 = Static29.anInt685 / 2 - 18;
				@Pc(138) int local138 = Static121.anInt2947 / 2 - 152;
				local2.setColor(arg1);
				local2.drawRect(local138, local132, 303, 33);
				local2.fillRect(local138 + 2, local132 + 2, arg2 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local138 + 1, local132 + 1, 301, 31);
				local2.fillRect(arg2 * 3 + local138 + 2, local132 + 2, 300 - arg2 * 3, 30);
				local2.setFont(Static28.aFont1);
				local2.setColor(Color.white);
				arg0.method462(local138 + (304 - arg0.method461(Static93.aFontMetrics1)) / 2, local132 - -22, local2);
			}
		} catch (@Pc(220) Exception local220) {
			Static89.aCanvas1.repaint();
		}
	}
}
