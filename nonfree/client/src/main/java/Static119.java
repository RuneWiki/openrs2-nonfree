import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "Lclient!ve;")
	public static Class69 aClass69_28;

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
	public static int anInt2660;

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "[Lclient!od;")
	public static Class1_Sub2_Sub8_Sub3[] aClass1_Sub2_Sub8_Sub3Array13;

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "Ljava/lang/Object;")
	public static final Object anObject1 = new Object();

	@OriginalMember(owner = "client!mb", name = "m", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_784 = Static81.method1507("Loaded input handler");

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "Lclient!dj;")
	public static Class24 aClass24_782 = aClass24_784;

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_783 = Static81.method1507("Fehler beim Laden Ihres Spielcharakters)3");

	@OriginalMember(owner = "client!mb", name = "n", descriptor = "Lclient!s;")
	public static final Class87 aClass87_17 = new Class87();

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
	public static void method2023() {
		for (@Pc(7) int local7 = 0; local7 < Static24.anInt663; local7++) {
			@Pc(18) int local18 = Static127.anIntArray222[local7];
			@Pc(22) Class5_Sub2_Sub1 local22 = Static110.aClass5_Sub2_Sub1Array1[local18];
			@Pc(26) int local26 = Static192.aClass1_Sub7_Sub1_31.method2771();
			if ((local26 & 0x20) != 0) {
				local26 += Static192.aClass1_Sub7_Sub1_31.method2771() << 8;
			}
			Static12.method300(local26, local22, local18);
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IB)I")
	public static int method2024(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!vc;IIII)V")
	public static void method2025(@OriginalArg(0) Class98 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static103.anInt2308 >= 3) {
			Static90.method3493(arg2, arg3, arg0.anIntArray387, arg0.anIntArray389);
		} else {
			Static174.aClass1_Sub2_Sub8_Sub3_5.method2349(arg2, arg3, arg0.anInt4400, arg0.anInt4403, Static174.aClass1_Sub2_Sub8_Sub3_5.anInt3022 / 2, Static174.aClass1_Sub2_Sub8_Sub3_5.anInt3017 / 2, Static66.anInt1655, arg0.anIntArray387, arg0.anIntArray389);
		}
		Static163.aBooleanArray17[arg1] = true;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!ve;IBZIII)V")
	public static void method2026(@OriginalArg(0) Class69 arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int arg2) {
		Static16.anInt377 = arg2;
		Static47.anInt1175 = 0;
		Static91.anInt2111 = 1;
		Static103.anInt2312 = 2;
		Static116.anInt2596 = arg1;
		Static120.aClass69_29 = arg0;
		Static152.aBoolean156 = false;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!dj;Ljava/awt/Color;BIZ)V")
	public static void method2027(@OriginalArg(0) Class24 arg0, @OriginalArg(1) Color arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		try {
			@Pc(2) Graphics local2 = Static8.aCanvas1.getGraphics();
			if (Static64.aFont1 == null) {
				Static64.aFont1 = new Font("Helvetica", 1, 13);
				Static108.aFontMetrics1 = Static8.aCanvas1.getFontMetrics(Static64.aFont1);
			}
			if (arg3) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static116.anInt2589, Static147.anInt3283);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			try {
				if (Static96.anImage4 == null) {
					Static96.anImage4 = Static8.aCanvas1.createImage(304, 34);
				}
				@Pc(45) Graphics local45 = Static96.anImage4.getGraphics();
				local45.setColor(arg1);
				local45.drawRect(0, 0, 303, 33);
				local45.fillRect(2, 2, arg2 * 3, 30);
				local45.setColor(Color.black);
				local45.drawRect(1, 1, 301, 31);
				local45.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
				local45.setFont(Static64.aFont1);
				local45.setColor(Color.white);
				arg0.method782(22, local45, (304 - arg0.method774(Static108.aFontMetrics1)) / 2);
				local2.drawImage(Static96.anImage4, Static116.anInt2589 / 2 - 152, Static147.anInt3283 / 2 + -18, null);
			} catch (@Pc(126) Exception local126) {
				@Pc(132) int local132 = Static147.anInt3283 / 2 - 18;
				@Pc(138) int local138 = Static116.anInt2589 / 2 - 152;
				local2.setColor(arg1);
				local2.drawRect(local138, local132, 303, 33);
				local2.fillRect(local138 + 2, local132 + 2, arg2 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local138 + 1, local132 + 1, 301, 31);
				local2.fillRect(local138 + arg2 * 3 + 2, local132 + 2, 300 - arg2 * 3, 30);
				local2.setFont(Static64.aFont1);
				local2.setColor(Color.white);
				arg0.method782(local132 + 22, local2, local138 + (304 - arg0.method774(Static108.aFontMetrics1)) / 2);
			}
		} catch (@Pc(219) Exception local219) {
			Static8.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(Z)V")
	public static void method2029() {
		Static74.aClass86_27.method2817();
	}
}
