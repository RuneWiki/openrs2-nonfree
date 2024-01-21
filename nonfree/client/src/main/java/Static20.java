import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!da", name = "V", descriptor = "I")
	public static int anInt560;

	@OriginalMember(owner = "client!da", name = "Z", descriptor = "[I")
	public static int[] anIntArray58;

	@OriginalMember(owner = "client!da", name = "bb", descriptor = "I")
	public static int anInt563;

	@OriginalMember(owner = "client!da", name = "hb", descriptor = "[I")
	public static int[] anIntArray59;

	@OriginalMember(owner = "client!da", name = "pb", descriptor = "I")
	public static int anInt573;

	@OriginalMember(owner = "client!da", name = "W", descriptor = "Lclient!ja;")
	public static Class39 aClass39_333 = Static28.method504("(U5");

	@OriginalMember(owner = "client!da", name = "eb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_334 = Static28.method504("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!da", name = "lb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_335 = Static28.method504("::fpson");

	@OriginalMember(owner = "client!da", name = "mb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_336 = Static28.method504("blaugr-Un:");

	@OriginalMember(owner = "client!da", name = "e", descriptor = "(II)Lclient!ja;")
	public static Class39 method382(@OriginalArg(0) int arg0) {
		return arg0 < 999999999 ? Static29.method510(arg0) : Static69.aClass39_911;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BI)V")
	public static void method383(@OriginalArg(1) int arg0) {
		Static115.method2015();
		Static22.method420();
		@Pc(14) int local14 = Static91.method1639(arg0).anInt1305;
		if (local14 == 0) {
			return;
		}
		@Pc(24) int local24 = Static22.anIntArray64[arg0];
		if (local14 == 1) {
			if (local24 == 1) {
				Static57.method1028(0.9D);
				((Class10) Static57.anInterface1_1).method225(0.9D);
			}
			if (local24 == 2) {
				Static57.method1028(0.8D);
				((Class10) Static57.anInterface1_1).method225(0.8D);
			}
			if (local24 == 3) {
				Static57.method1028(0.7D);
				((Class10) Static57.anInterface1_1).method225(0.7D);
			}
			if (local24 == 4) {
				Static57.method1028(0.6D);
				((Class10) Static57.anInterface1_1).method225(0.6D);
			}
			Static26.method437();
		}
		if (local14 == 3) {
			@Pc(78) short local78 = 0;
			if (local24 == 0) {
				local78 = 255;
			}
			if (local24 == 1) {
				local78 = 192;
			}
			if (local24 == 2) {
				local78 = 128;
			}
			if (local24 == 3) {
				local78 = 64;
			}
			if (local24 == 4) {
				local78 = 0;
			}
			if (local78 != Static116.anInt2896) {
				if (Static116.anInt2896 == 0 && Static19.anInt518 != -1) {
					Static72.method528(local78, Static29.aClass20_Sub1_3, 0, Static19.anInt518);
					Static50.aBoolean69 = false;
				} else if (local78 == 0) {
					Static59.method1057();
					Static50.aBoolean69 = false;
				} else {
					Static113.method1988(local78);
				}
				Static116.anInt2896 = local78;
			}
		}
		if (local14 == 9) {
			Static129.anInt3149 = local24;
		}
		if (local14 == 6) {
			Static3.anInt20 = local24;
		}
		if (local14 == 10) {
			if (local24 == 0) {
				Static72.anInt794 = 127;
			}
			if (local24 == 1) {
				Static72.anInt794 = 96;
			}
			if (local24 == 2) {
				Static72.anInt794 = 64;
			}
			if (local24 == 3) {
				Static72.anInt794 = 32;
			}
			if (local24 == 4) {
				Static72.anInt794 = 0;
			}
		}
		if (local14 == 4) {
			if (local24 == 0) {
				Static70.anInt1731 = 127;
			}
			if (local24 == 1) {
				Static70.anInt1731 = 96;
			}
			if (local24 == 2) {
				Static70.anInt1731 = 64;
			}
			if (local24 == 3) {
				Static70.anInt1731 = 32;
			}
			if (local24 == 4) {
				Static70.anInt1731 = 0;
			}
		}
		if (local14 == 5) {
			Static2.anInt19 = local24;
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(JI)V")
	public static void method384(@OriginalArg(0) long arg0) {
		if (arg0 != 0L) {
			Static114.aClass4_Sub16_Sub1_3.method1499(110);
			Static114.aClass4_Sub16_Sub1_3.method1457(arg0);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!he;B)I")
	public static int method385(@OriginalArg(0) Class4_Sub5 arg0) {
		@Pc(17) Class4_Sub9 local17 = (Class4_Sub9) Static109.aClass42_11.method1055((long) arg0.anInt1212 + ((long) arg0.anInt1230 << 32));
		return local17 == null ? arg0.anInt1220 : local17.anInt1696;
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(Lclient!ae;I)V")
	public static void method386(@OriginalArg(0) Class4_Sub2_Sub1_Sub1 arg0) {
		arg0.anInt2648 = 0;
		@Pc(21) int local21 = arg0.anInt2650 * 128 + arg0.anInt2653 * 64;
		if (arg0.anInt2666 == 0) {
			arg0.anInt2644 = 1024;
		}
		@Pc(37) int local37 = arg0.anInt2668 * 128 + arg0.anInt2653 * 64;
		if (arg0.anInt2666 == 1) {
			arg0.anInt2644 = 1536;
		}
		if (arg0.anInt2666 == 2) {
			arg0.anInt2644 = 0;
		}
		if (arg0.anInt2666 == 3) {
			arg0.anInt2644 = 512;
		}
		@Pc(64) int local64 = arg0.anInt2654 - Static71.anInt1738;
		arg0.anInt2641 += (local21 - arg0.anInt2641) / local64;
		arg0.anInt2643 += (local37 - arg0.anInt2643) / local64;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILclient!ja;ILjava/awt/Color;)V")
	public static void method387(@OriginalArg(0) int arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(3) Color arg2) {
		try {
			@Pc(2) Graphics local2 = Static8.aCanvas1.getGraphics();
			if (Static47.aFont1 == null) {
				Static47.aFont1 = new Font("Helvetica", 1, 13);
				Static83.aFontMetrics1 = Static8.aCanvas1.getFontMetrics(Static47.aFont1);
			}
			if (Static58.aBoolean86) {
				Static58.aBoolean86 = false;
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static99.anInt2490, Static115.anInt2885);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			try {
				if (Static113.anImage4 == null) {
					Static113.anImage4 = Static8.aCanvas1.createImage(304, 34);
				}
				@Pc(47) Graphics local47 = Static113.anImage4.getGraphics();
				local47.setColor(arg2);
				local47.drawRect(0, 0, 303, 33);
				local47.fillRect(2, 2, arg0 * 3, 30);
				local47.setColor(Color.black);
				local47.drawRect(1, 1, 301, 31);
				local47.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
				local47.setFont(Static47.aFont1);
				local47.setColor(Color.white);
				arg1.method936(local47, 22, (304 - arg1.method962(Static83.aFontMetrics1)) / 2);
				local2.drawImage(Static113.anImage4, Static99.anInt2490 / 2 - 152, Static115.anInt2885 / 2 + -18, null);
			} catch (@Pc(125) Exception local125) {
				@Pc(131) int local131 = Static115.anInt2885 / 2 - 18;
				@Pc(137) int local137 = Static99.anInt2490 / 2 - 152;
				local2.setColor(arg2);
				local2.drawRect(local137, local131, 303, 33);
				local2.fillRect(local137 + 2, local131 - -2, arg0 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local137 + 1, local131 + 1, 301, 31);
				local2.fillRect(local137 + arg0 * 3 + 2, local131 - -2, 300 - arg0 * 3, 30);
				local2.setFont(Static47.aFont1);
				local2.setColor(Color.white);
				arg1.method936(local2, local131 + 22, (304 - arg1.method962(Static83.aFontMetrics1)) / 2 + local137);
			}
		} catch (@Pc(216) Exception local216) {
			Static8.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!da", name = "e", descriptor = "(B)V")
	public static void method388() {
		aClass39_334 = null;
		aClass39_336 = null;
		aClass39_333 = null;
		aClass39_335 = null;
		anIntArray59 = null;
		anIntArray58 = null;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIB)V")
	public static void method389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = 1;
		@Pc(6) int[] local6 = new int[4];
		@Pc(13) int[] local13 = new int[4];
		local13[0] = arg1;
		local6[0] = arg0;
		for (@Pc(23) int local23 = 0; local23 < 4; local23++) {
			if (arg1 != Static49.anIntArray137[local23]) {
				local13[local3] = Static49.anIntArray137[local23];
				local6[local3] = Static130.anIntArray366[local23];
				local3++;
			}
		}
		Static49.anIntArray137 = local13;
		Static130.anIntArray366 = local6;
		Static103.method1848(Static130.anIntArray366, Static106.aClass76Array1.length - 1, 0, Static49.anIntArray137, Static106.aClass76Array1);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!kc;")
	public static RuntimeException_Sub1 method390(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub1 local8;
		if (arg0 instanceof RuntimeException_Sub1) {
			local8 = (RuntimeException_Sub1) arg0;
			local8.aString5 = local8.aString5 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local8;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!kb;I)V")
	public static void method391(@OriginalArg(0) Class44 arg0) {
		Static102.aClass44_1 = arg0;
	}
}
