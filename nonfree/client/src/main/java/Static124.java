import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
	public static int anInt2999;

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1489 = Static108.method1915("redstone2");

	@OriginalMember(owner = "client!vd", name = "k", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1495 = Static108.method1915("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1490 = aClass39_1495;

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1491 = Static108.method1915("Lade Texturen )2 ");

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1492 = Static108.method1915(":0");

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "[Lclient!pb;")
	public static Class1_Sub1_Sub4_Sub4[] aClass1_Sub1_Sub4_Sub4Array12 = new Class1_Sub1_Sub4_Sub4[1000];

	@OriginalMember(owner = "client!vd", name = "h", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1493 = Static108.method1915("bevor Sie die (WRegelversto-8 melden(W Option benutzen");

	@OriginalMember(owner = "client!vd", name = "i", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1494 = Static108.method1915("M");

	@OriginalMember(owner = "client!vd", name = "l", descriptor = "Z")
	public static volatile boolean aBoolean237 = true;

	@OriginalMember(owner = "client!vd", name = "m", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1496 = Static108.method1915("Aus");

	@OriginalMember(owner = "client!vd", name = "o", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1497 = Static108.method1915("redstone3");

	@OriginalMember(owner = "client!vd", name = "p", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1498 = Static108.method1915("mn");

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
	public static void method2076() {
		aClass39_1490 = null;
		aClass39_1498 = null;
		aClass39_1492 = null;
		aClass39_1493 = null;
		aClass39_1489 = null;
		aClass39_1497 = null;
		aClass1_Sub1_Sub4_Sub4Array12 = null;
		aClass39_1494 = null;
		aClass39_1496 = null;
		aClass39_1495 = null;
		aClass39_1491 = null;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(BII)V")
	public static void method2077(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class1_Sub1_Sub8 local7 = Static99.method1764(arg0);
		@Pc(10) int local10 = local7.anInt1123;
		@Pc(18) int local18 = local7.anInt1115;
		@Pc(21) int local21 = local7.anInt1119;
		@Pc(28) int local28 = Class39.anIntArray245[local18 - local21];
		if (arg1 < 0 || arg1 > local28) {
			arg1 = 0;
		}
		local28 <<= local21;
		Static44.anIntArray175[local10] = Static44.anIntArray175[local10] & ~local28 | arg1 << local21 & local28;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILjava/awt/Color;Lclient!kd;I)V")
	public static void method2078(@OriginalArg(0) int arg0, @OriginalArg(1) Color arg1, @OriginalArg(2) Class39 arg2) {
		try {
			@Pc(2) Graphics local2 = Static16.aCanvas10.getGraphics();
			if (Static116.aFont1 == null) {
				Static116.aFont1 = new Font("Helvetica", 1, 13);
				Static110.aFontMetrics1 = Static16.aCanvas10.getFontMetrics(Static116.aFont1);
			}
			if (Static119.aBoolean234) {
				Static119.aBoolean234 = false;
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static31.anInt1010, Static64.anInt1666);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			try {
				if (Static36.anImage3 == null) {
					Static36.anImage3 = Static16.aCanvas10.createImage(304, 34);
				}
				@Pc(52) Graphics local52 = Static36.anImage3.getGraphics();
				local52.setColor(arg1);
				local52.drawRect(0, 0, 303, 33);
				local52.fillRect(2, 2, arg0 * 3, 30);
				local52.setColor(Color.black);
				local52.drawRect(1, 1, 301, 31);
				local52.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
				local52.setFont(Static116.aFont1);
				local52.setColor(Color.white);
				arg2.method1178(22, local52, (304 - arg2.method1171(Static110.aFontMetrics1)) / 2);
				local2.drawImage(Static36.anImage3, Static31.anInt1010 / 2 - 152, Static64.anInt1666 / 2 - 18, null);
			} catch (@Pc(130) Exception local130) {
				@Pc(136) int local136 = Static31.anInt1010 / 2 - 152;
				@Pc(142) int local142 = Static64.anInt1666 / 2 - 18;
				local2.setColor(arg1);
				local2.drawRect(local136, local142, 303, 33);
				local2.fillRect(local136 + 2, local142 - -2, arg0 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local136 + 1, local142 + 1, 301, 31);
				local2.fillRect(arg0 * 3 + local136 + 2, local142 + 2, 300 - arg0 * 3, 30);
				local2.setFont(Static116.aFont1);
				local2.setColor(Color.white);
				arg2.method1178(local142 + 22, local2, (304 - arg2.method1171(Static110.aFontMetrics1)) / 2 + local136);
			}
		} catch (@Pc(220) Exception local220) {
			Static16.aCanvas10.repaint();
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)J")
	public static synchronized long method2079() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < Static114.aLong94) {
			Static108.aLong88 += Static114.aLong94 - local1;
		}
		Static114.aLong94 = local1;
		return Static108.aLong88 + local1;
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)V")
	public static void method2080() {
		@Pc(7) int local7 = Static89.anInt2108;
		@Pc(9) int local9 = Static108.anInt2712;
		@Pc(11) int local11 = Static36.anInt1081;
		@Pc(15) int local15 = Static122.anInt2971;
		Static15.method1503(local11, local7, local9, local15, 6116423);
		Static15.method1503(local11 + 1, local7 + 1, local9 - 2, 16, 0);
		Static15.method1504(local11 + 1, local7 + 18, local9 - 2, local15 + -19, 0);
		Static53.aClass1_Sub1_Sub4_Sub3_1.method753(Static36.aClass39_503, local11 + 3, local7 + 14, 6116423, -1);
		@Pc(60) int local60 = Static3.anInt150;
		@Pc(62) int local62 = Static29.anInt971;
		if (Static46.anInt2774 == 0) {
			local62 -= 4;
			local60 -= 4;
		}
		if (Static46.anInt2774 == 1) {
			local62 -= 553;
			local60 -= 205;
		}
		if (Static46.anInt2774 == 2) {
			local62 -= 17;
			local60 -= 357;
		}
		for (@Pc(83) int local83 = 0; local83 < Static110.anInt2795; local83++) {
			@Pc(87) int local87 = 16777215;
			@Pc(100) int local100 = (Static110.anInt2795 - local83 - 1) * 15 + local7 + 31;
			if (local11 < local62 && local9 + local11 > local62 && local60 > local100 - 13 && local100 + 3 > local60) {
				local87 = 16776960;
			}
			Static53.aClass1_Sub1_Sub4_Sub3_1.method753(Static50.aClass39Array13[local83], local11 + 3, local100, local87, 0);
		}
	}
}
