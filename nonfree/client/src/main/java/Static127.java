import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "[I")
	public static int[] anIntArray499;

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
	public static int anInt2944;

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "[[I")
	public static int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!wc", name = "o", descriptor = "[Lclient!ue;")
	public static Class1_Sub2_Sub2_Sub4[] aClass1_Sub2_Sub2_Sub4Array10;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "[Z")
	public static boolean[] aBooleanArray14 = new boolean[5];

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
	public static int anInt2945 = 0;

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
	public static int anInt2946 = 0;

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1420 = Static78.method1313("(U2");

	@OriginalMember(owner = "client!wc", name = "m", descriptor = "Lclient!gb;")
	public static Class27 aClass27_2 = new Class27();

	@OriginalMember(owner = "client!wc", name = "p", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1421 = Static78.method1313("Anmelde)2Zeitlimit -Uberschritten)3");

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)Lclient!wa;")
	public static Class19 method2039() {
		try {
			return (Class19) Class.forName("Class19_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class19_Sub1();
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!fc;ILjava/awt/Color;I)V")
	public static void method2040(@OriginalArg(0) Class25 arg0, @OriginalArg(2) Color arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(2) Graphics local2 = Static119.aCanvas1.getGraphics();
			if (Static37.aFont1 == null) {
				Static37.aFont1 = new Font("Helvetica", 1, 13);
				Static112.aFontMetrics1 = Static119.aCanvas1.getFontMetrics(Static37.aFont1);
			}
			if (Static60.aBoolean54) {
				Static60.aBoolean54 = false;
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static11.anInt276, Static77.anInt1676);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			try {
				if (Static53.anImage5 == null) {
					Static53.anImage5 = Static119.aCanvas1.createImage(304, 34);
				}
				@Pc(47) Graphics local47 = Static53.anImage5.getGraphics();
				local47.setColor(arg1);
				local47.drawRect(0, 0, 303, 33);
				local47.fillRect(2, 2, arg2 * 3, 30);
				local47.setColor(Color.black);
				local47.drawRect(1, 1, 301, 31);
				local47.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
				local47.setFont(Static37.aFont1);
				local47.setColor(Color.white);
				arg0.method800((304 - arg0.method759(Static112.aFontMetrics1)) / 2, 22, local47);
				local2.drawImage(Static53.anImage5, Static11.anInt276 / 2 - 152, Static77.anInt1676 / 2 + -18, null);
			} catch (@Pc(125) Exception local125) {
				@Pc(131) int local131 = Static11.anInt276 / 2 - 152;
				@Pc(137) int local137 = Static77.anInt1676 / 2 - 18;
				local2.setColor(arg1);
				local2.drawRect(local131, local137, 303, 33);
				local2.fillRect(local131 + 2, local137 + 2, arg2 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local131 + 1, local137 + 1, 301, 31);
				local2.fillRect(arg2 * 3 + local131 + 2, local137 - -2, 300 - arg2 * 3, 30);
				local2.setFont(Static37.aFont1);
				local2.setColor(Color.white);
				arg0.method800((304 - arg0.method759(Static112.aFontMetrics1)) / 2 + local131, local137 + 22, local2);
			}
		} catch (@Pc(216) Exception local216) {
			Static119.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V")
	public static void method2041() {
		aClass25_1421 = null;
		aClass1_Sub2_Sub2_Sub4Array10 = null;
		aBooleanArray14 = null;
		anIntArrayArray30 = null;
		anIntArray499 = null;
		aClass25_1420 = null;
		aClass27_2 = null;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!ue;B)V")
	public static void method2042(@OriginalArg(0) Class1_Sub2_Sub2_Sub4 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static80.anIntArray323.length; local3++) {
			Static80.anIntArray323[local3] = 0;
		}
		@Pc(37) int local37;
		for (@Pc(27) int local27 = 0; local27 < 5000; local27++) {
			local37 = (int) ((double) 256 * Math.random() * 128.0D);
			Static80.anIntArray323[local37] = (int) (Math.random() * 256.0D);
		}
		@Pc(56) int local56;
		@Pc(60) int local60;
		@Pc(68) int local68;
		for (local37 = 0; local37 < 20; local37++) {
			for (local56 = 1; local56 < 255; local56++) {
				for (local60 = 1; local60 < 127; local60++) {
					local68 = (local56 << 7) + local60;
					Static84.anIntArray335[local68] = (Static80.anIntArray323[local68 - 1] + Static80.anIntArray323[local68 + 1] + Static80.anIntArray323[local68 + -128] + Static80.anIntArray323[local68 + 128]) / 4;
				}
			}
			@Pc(110) int[] local110 = Static80.anIntArray323;
			Static80.anIntArray323 = Static84.anIntArray335;
			Static84.anIntArray335 = local110;
		}
		if (arg0 == null) {
			return;
		}
		local56 = 0;
		for (local60 = 0; local60 < arg0.anInt2758; local60++) {
			for (local68 = 0; local68 < arg0.anInt2756; local68++) {
				if (arg0.aByteArray39[local56++] != 0) {
					@Pc(146) int local146 = arg0.anInt2759 + local68 + 16;
					@Pc(153) int local153 = arg0.anInt2757 + local60 + 16;
					@Pc(159) int local159 = (local153 << 7) + local146;
					Static80.anIntArray323[local159] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IILclient!mf;Lclient!rb;)V")
	public static void method2043(@OriginalArg(0) int arg0, @OriginalArg(2) Class56_Sub1 arg1, @OriginalArg(3) Class70 arg2) {
		@Pc(7) Class1_Sub15 local7 = new Class1_Sub15();
		local7.aClass56_Sub1_14 = arg1;
		local7.aLong184 = arg0;
		local7.anInt2097 = 1;
		local7.aClass70_3 = arg2;
		@Pc(30) Class2 local30 = Static7.aClass2_2;
		synchronized (Static7.aClass2_2) {
			Static7.aClass2_2.method33(local7);
		}
		Static50.method986();
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)V")
	public static void method2044(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		for (@Pc(13) int local13 = 0; local13 < 100; local13++) {
			if (Static97.aClass25Array20[local13] != null) {
				@Pc(29) int local29 = Static7.anInt166 + 4 + 70 - local7 * 14;
				@Pc(33) int local33 = Static122.anIntArray495[local13];
				if (local29 < -20) {
					break;
				}
				if (local33 == 0) {
					local7++;
				}
				@Pc(43) Class25 local43 = Static118.aClass25Array23[local13];
				if (local43 != null && local43.method797(Static77.aClass25_810)) {
					local43 = local43.method794(5);
				}
				if (local43 != null && local43.method797(Static38.aClass25_448)) {
					local43 = local43.method794(5);
				}
				if ((local33 == 1 || local33 == 2) && (local33 == 1 || Static82.anInt1811 == 0 || Static82.anInt1811 == 1 && Static31.method704(local43))) {
					if (local29 - 14 < arg1 && arg1 <= local29 && !local43.method787(Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.aClass25_1384)) {
						if (Static5.anInt108 >= 1) {
							Static80.method1365(0, 56, 0, 0, Static116.method1859(new Class25[] { Static50.aClass25_516, local43 }), Static3.aClass25_40);
						}
						Static80.method1365(0, 54, 0, 0, Static116.method1859(new Class25[] { Static50.aClass25_516, local43 }), Static11.aClass25_153);
						Static80.method1365(0, 4, 0, 0, Static116.method1859(new Class25[] { Static50.aClass25_516, local43 }), Static96.aClass25_1373);
					}
					local7++;
				}
				if ((local33 == 3 || local33 == 7) && Static65.anInt1449 == 0 && (local33 == 7 || Static80.anInt1785 == 0 || Static80.anInt1785 == 1 && Static31.method704(local43))) {
					local7++;
					if (arg1 > local29 - 14 && local29 >= arg1) {
						if (Static5.anInt108 >= 1) {
							Static80.method1365(0, 56, 0, 0, Static116.method1859(new Class25[] { Static50.aClass25_516, local43 }), Static3.aClass25_40);
						}
						Static80.method1365(0, 54, 0, 0, Static116.method1859(new Class25[] { Static50.aClass25_516, local43 }), Static11.aClass25_153);
						Static80.method1365(0, 4, 0, 0, Static116.method1859(new Class25[] { Static50.aClass25_516, local43 }), Static96.aClass25_1373);
					}
				}
				if (local33 == 4 && (Static11.anInt279 == 0 || Static11.anInt279 == 1 && Static31.method704(local43))) {
					local7++;
					if (arg1 > local29 - 14 && local29 >= arg1) {
						Static80.method1365(0, 55, 0, 0, Static116.method1859(new Class25[] { Static50.aClass25_516, local43 }), Static120.aClass25_1383);
					}
				}
				if ((local33 == 5 || local33 == 6) && Static65.anInt1449 == 0 && Static80.anInt1785 < 2) {
					local7++;
				}
				if (local33 == 8 && (Static11.anInt279 == 0 || Static11.anInt279 == 1 && Static31.method704(local43))) {
					local7++;
					if (arg1 > local29 - 14 && local29 >= arg1) {
						Static80.method1365(0, 10, 0, 0, Static116.method1859(new Class25[] { Static50.aClass25_516, local43 }), Static83.aClass25_905);
					}
				}
			}
		}
	}
}
