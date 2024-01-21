import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!i", name = "V", descriptor = "Lclient!rb;")
	public static Class55 aClass55_20;

	@OriginalMember(owner = "client!i", name = "X", descriptor = "[I")
	public static int[] anIntArray163;

	@OriginalMember(owner = "client!i", name = "F", descriptor = "Lclient!gd;")
	private static Class23 aClass23_713 = Static15.method178("New User");

	@OriginalMember(owner = "client!i", name = "I", descriptor = "Lclient!gd;")
	public static Class23 aClass23_714 = aClass23_713;

	@OriginalMember(owner = "client!i", name = "O", descriptor = "Lclient!oe;")
	public static Class45 aClass45_3 = new Class45();

	@OriginalMember(owner = "client!i", name = "P", descriptor = "Lclient!gd;")
	public static Class23 aClass23_716 = Static15.method178(")3");

	@OriginalMember(owner = "client!i", name = "Q", descriptor = "Lclient!gd;")
	public static Class23 aClass23_717 = Static15.method178("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!i", name = "R", descriptor = "Lclient!gd;")
	public static Class23 aClass23_718 = Static15.method178("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!i", name = "S", descriptor = "Lclient!hb;")
	public static Class1_Sub5_Sub1 aClass1_Sub5_Sub1_1 = new Class1_Sub5_Sub1(5000);

	@OriginalMember(owner = "client!i", name = "T", descriptor = "I")
	public static int anInt1381 = -1;

	@OriginalMember(owner = "client!i", name = "U", descriptor = "I")
	public static int anInt1382 = 0;

	@OriginalMember(owner = "client!i", name = "W", descriptor = "Lclient!gd;")
	private static Class23 aClass23_719 = Static15.method178("Walk here");

	@OriginalMember(owner = "client!i", name = "Y", descriptor = "Lclient!gd;")
	public static Class23 aClass23_720 = Static15.method178("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!i", name = "Z", descriptor = "Lclient!gd;")
	public static Class23 aClass23_721 = Static15.method178("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!i", name = "ab", descriptor = "Lclient!gd;")
	public static Class23 aClass23_722 = aClass23_719;

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(I)V")
	public static void method857() {
		aClass23_716 = null;
		aClass45_3 = null;
		aClass55_20 = null;
		aClass23_722 = null;
		aClass23_718 = null;
		aClass23_721 = null;
		aClass23_720 = null;
		aClass23_713 = null;
		anIntArray163 = null;
		aClass23_717 = null;
		aClass1_Sub5_Sub1_1 = null;
		aClass23_714 = null;
		aClass23_719 = null;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIB)I")
	public static int method858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg1 * 57 + arg0;
		@Pc(23) int local23 = local5 ^ local5 << 13;
		@Pc(37) int local37 = Integer.MAX_VALUE & local23 * (local23 * local23 * 15731 + 789221) + 1376312589;
		return local37 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(III[B[Lclient!q;IBIII)V")
	public static void method859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) Class50[] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		for (@Pc(6) int local6 = 0; local6 < 8; local6++) {
			for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
				if (arg6 + local6 > 0 && local6 + arg6 < 103 && local9 + arg8 > 0 && arg8 + local9 < 103) {
					arg4[arg0].anIntArrayArray44[local6 + arg6][arg8 + local9] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(77) Class1_Sub5 local77 = new Class1_Sub5(arg3);
		for (@Pc(79) int local79 = 0; local79 < 4; local79++) {
			for (@Pc(82) int local82 = 0; local82 < 64; local82++) {
				for (@Pc(85) int local85 = 0; local85 < 64; local85++) {
					if (arg7 == local79 && local82 >= arg1 && local82 < arg1 + 8 && local85 >= arg5 && arg5 + 8 > local85) {
						Static97.method1646(local77, arg6 + Static58.method1857(local82 & 0x7, local85 & 0x7, arg2), 0, 0, arg8 + Static42.method910(local85 & 0x7, local82 & 0x7, arg2), arg2, arg0);
					} else {
						Static97.method1646(local77, -1, 0, 0, -1, 0, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "([Lclient!q;Lclient!ud;Z[BII)V")
	public static void method860(@OriginalArg(0) Class50[] arg0, @OriginalArg(1) Class65 arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class1_Sub5 local8 = new Class1_Sub5(arg2);
		@Pc(10) int local10 = -1;
		while (true) {
			@Pc(18) int local18 = local8.method721();
			if (local18 == 0) {
				return;
			}
			local10 += local18;
			@Pc(29) int local29 = 0;
			while (true) {
				@Pc(33) int local33 = local8.method721();
				if (local33 == 0) {
					break;
				}
				local29 += local33 - 1;
				@Pc(50) int local50 = local29 >> 6 & 0x3F;
				@Pc(54) int local54 = local29 & 0x3F;
				@Pc(58) int local58 = local29 >> 12;
				@Pc(62) int local62 = local8.method716();
				@Pc(66) int local66 = local62 >> 2;
				@Pc(70) int local70 = local54 + arg4;
				@Pc(74) int local74 = arg3 + local50;
				@Pc(78) int local78 = local62 & 0x3;
				if (local74 > 0 && local70 > 0 && local74 < 103 && local70 < 103) {
					@Pc(95) int local95 = local58;
					@Pc(97) Class50 local97 = null;
					if ((Static95.aByteArrayArrayArray5[1][local74][local70] & 0x2) == 2) {
						local95 = local58 - 1;
					}
					if (local95 >= 0) {
						local97 = arg0[local95];
					}
					Static10.method109(local74, local97, local78, local10, arg1, local66, local58, local70);
				}
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BLclient!gd;ILjava/awt/Color;)V")
	public static void method861(@OriginalArg(1) Class23 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Color arg2) {
		try {
			@Pc(6) Graphics local6 = Static26.aCanvas1.getGraphics();
			if (Static29.aFont1 == null) {
				Static29.aFont1 = new Font("Helvetica", 1, 13);
				Static44.aFontMetrics1 = Static26.aCanvas1.getFontMetrics(Static29.aFont1);
			}
			if (Static54.aBoolean86) {
				Static54.aBoolean86 = false;
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static65.anInt1962, Static76.anInt2082);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			try {
				if (Static51.anImage1 == null) {
					Static51.anImage1 = Static26.aCanvas1.createImage(304, 34);
				}
				@Pc(56) Graphics local56 = Static51.anImage1.getGraphics();
				local56.setColor(arg2);
				local56.drawRect(0, 0, 303, 33);
				local56.fillRect(2, 2, arg1 * 3, 30);
				local56.setColor(Color.black);
				local56.drawRect(1, 1, 301, 31);
				local56.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
				local56.setFont(Static29.aFont1);
				local56.setColor(Color.white);
				arg0.method520(22, local56, (304 - arg0.method524(Static44.aFontMetrics1)) / 2);
				local6.drawImage(Static51.anImage1, Static65.anInt1962 / 2 - 152, Static76.anInt2082 / 2 - 18, null);
			} catch (@Pc(134) Exception local134) {
				@Pc(140) int local140 = Static65.anInt1962 / 2 - 152;
				@Pc(146) int local146 = Static76.anInt2082 / 2 - 18;
				local6.setColor(arg2);
				local6.drawRect(local140, local146, 303, 33);
				local6.fillRect(local140 + 2, local146 + 2, arg1 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local140 + 1, local146 + 1, 301, 31);
				local6.fillRect(local140 + arg1 * 3 + 2, local146 + 2, 300 - arg1 * 3, 30);
				local6.setFont(Static29.aFont1);
				local6.setColor(Color.white);
				arg0.method520(local146 + 22, local6, (304 - arg0.method524(Static44.aFontMetrics1)) / 2 + local140);
			}
		} catch (@Pc(225) Exception local225) {
			Static26.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BJ)V")
	public static void method862(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static14.method157(arg0 - 1L);
			Static14.method157(1L);
		} else {
			Static14.method157(arg0);
		}
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "(I)V")
	public static void method863() {
		Static79.aClass34_59.method1138();
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V")
	public static void method864(@OriginalArg(1) int arg0) {
		if (Static97.aClass11_1 == null) {
			return;
		}
		if (Static11.anInt219 != 0) {
			if (Static42.aByteArray7 == null) {
				return;
			}
			Static95.anInt2488 = arg0;
		} else if (Static19.anInt494 >= 0) {
			Static19.anInt494 = arg0;
			Static97.aClass11_1.method1107(arg0, 0);
			return;
		}
	}
}
