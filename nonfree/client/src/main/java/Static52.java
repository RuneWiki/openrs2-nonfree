import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!kc", name = "p", descriptor = "Z")
	public static boolean aBoolean83;

	@OriginalMember(owner = "client!kc", name = "t", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!kc", name = "u", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "Lclient!mc;")
	private static Class42 aClass42_743 = Static23.method501(" more options");

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "[I")
	public static int[] anIntArray208 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "Lclient!mc;")
	public static Class42 aClass42_744 = aClass42_743;

	@OriginalMember(owner = "client!kc", name = "o", descriptor = "[I")
	public static int[] anIntArray209 = new int[100];

	@OriginalMember(owner = "client!kc", name = "s", descriptor = "Lclient!mc;")
	private static Class42 aClass42_746 = Static23.method501("flash1:");

	@OriginalMember(owner = "client!kc", name = "q", descriptor = "Lclient!mc;")
	public static Class42 aClass42_745 = aClass42_746;

	@OriginalMember(owner = "client!kc", name = "r", descriptor = "Z")
	public static boolean aBoolean84 = true;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZ)I")
	public static int method973(@OriginalArg(0) int arg0) {
		@Pc(7) Class1_Sub1_Sub15 local7 = Static36.method618(arg0);
		@Pc(10) int local10 = local7.anInt2437;
		@Pc(13) int local13 = local7.anInt2434;
		@Pc(21) int local21 = local7.anInt2429;
		@Pc(27) int local27 = Class1_Sub1_Sub7.anIntArray123[local13 - local21];
		return Static51.anIntArray200[local10] >> local21 & local27;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIII)I")
	public static int method974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
	public static void method975() {
		aClass42_746 = null;
		aClass42_743 = null;
		aClass42_745 = null;
		anIntArray209 = null;
		anIntArrayArrayArray7 = null;
		Class37.anIntArray207 = null;
		aByteArrayArrayArray6 = null;
		anIntArray208 = null;
		aClass42_744 = null;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILclient!mc;Ljava/awt/Color;)V")
	public static void method977(@OriginalArg(0) int arg0, @OriginalArg(2) Class42 arg1, @OriginalArg(3) Color arg2) {
		try {
			@Pc(2) Graphics local2 = Static89.aCanvas1.getGraphics();
			if (Static16.aFont1 == null) {
				Static16.aFont1 = new Font("Helvetica", 1, 13);
				Static69.aFontMetrics1 = Static89.aCanvas1.getFontMetrics(Static16.aFont1);
			}
			if (Static91.aBoolean134) {
				Static91.aBoolean134 = false;
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static12.anInt367, Static99.anInt2511);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			try {
				if (Static84.anImage4 == null) {
					Static84.anImage4 = Static89.aCanvas1.createImage(304, 34);
				}
				@Pc(55) Graphics local55 = Static84.anImage4.getGraphics();
				local55.setColor(arg2);
				local55.drawRect(0, 0, 303, 33);
				local55.fillRect(2, 2, arg0 * 3, 30);
				local55.setColor(Color.black);
				local55.drawRect(1, 1, 301, 31);
				local55.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
				local55.setFont(Static16.aFont1);
				local55.setColor(Color.white);
				arg1.method1057(local55, (304 - arg1.method1063(Static69.aFontMetrics1)) / 2, 22);
				local2.drawImage(Static84.anImage4, Static12.anInt367 / 2 - 152, Static99.anInt2511 / 2 + -18, null);
			} catch (@Pc(133) Exception local133) {
				@Pc(139) int local139 = Static12.anInt367 / 2 - 152;
				@Pc(145) int local145 = Static99.anInt2511 / 2 - 18;
				local2.setColor(arg2);
				local2.drawRect(local139, local145, 303, 33);
				local2.fillRect(local139 + 2, local145 + 2, arg0 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local139 + 1, local145 + 1, 301, 31);
				local2.fillRect(local139 + arg0 * 3 + 2, local145 + 2, 300 - arg0 * 3, 30);
				local2.setFont(Static16.aFont1);
				local2.setColor(Color.white);
				arg1.method1057(local2, (304 - arg1.method1063(Static69.aFontMetrics1)) / 2 + local139, local145 - -22);
			}
		} catch (@Pc(224) Exception local224) {
			Static89.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BJ)V")
	public static void method979(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(7) InterruptedException local7) {
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method980(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(Static73.aClass62_1);
		arg0.removeMouseMotionListener(Static73.aClass62_1);
	}
}
