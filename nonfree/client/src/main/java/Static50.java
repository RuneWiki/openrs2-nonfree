import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!fb", name = "F", descriptor = "[I")
	public static int[] anIntArray107 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!fb", name = "S", descriptor = "I")
	public static int anInt1313 = -1;

	@OriginalMember(owner = "client!fb", name = "T", descriptor = "[I")
	public static int[] anIntArray108 = new int[32];

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)V")
	public static void method936() {
		Static164.aClass2_Sub8_Sub1_2.method779();
		Static49.aClass40_14 = null;
		Static43.anInt1114 = 1;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!gg;Ljava/awt/Color;II)V")
	public static void method937(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Color arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(2) Graphics local2 = Static49.aCanvas1.getGraphics();
			if (Static172.aFont1 == null) {
				Static172.aFont1 = new Font("Helvetica", 1, 13);
				Static146.aFontMetrics1 = Static49.aCanvas1.getFontMetrics(Static172.aFont1);
			}
			if (Static116.aBoolean128) {
				Static116.aBoolean128 = false;
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static80.anInt2060, Static110.anInt2688);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			try {
				if (Static66.anImage3 == null) {
					Static66.anImage3 = Static49.aCanvas1.createImage(304, 34);
				}
				@Pc(47) Graphics local47 = Static66.anImage3.getGraphics();
				local47.setColor(arg1);
				local47.drawRect(0, 0, 303, 33);
				local47.fillRect(2, 2, arg2 * 3, 30);
				local47.setColor(Color.black);
				local47.drawRect(1, 1, 301, 31);
				local47.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
				local47.setFont(Static172.aFont1);
				local47.setColor(Color.white);
				arg0.method1111((304 - arg0.method1116(Static146.aFontMetrics1)) / 2, 22, local47);
				local2.drawImage(Static66.anImage3, Static80.anInt2060 / 2 - 152, Static110.anInt2688 / 2 + -18, null);
			} catch (@Pc(132) Exception local132) {
				@Pc(138) int local138 = Static110.anInt2688 / 2 - 18;
				@Pc(144) int local144 = Static80.anInt2060 / 2 - 152;
				local2.setColor(arg1);
				local2.drawRect(local144, local138, 303, 33);
				local2.fillRect(local144 + 2, local138 - -2, arg2 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local144 + 1, local138 + 1, 301, 31);
				local2.fillRect(local144 + arg2 * 3 + 2, local138 + 2, 300 - arg2 * 3, 30);
				local2.setFont(Static172.aFont1);
				local2.setColor(Color.white);
				arg0.method1111(local144 + (304 - arg0.method1116(Static146.aFontMetrics1)) / 2, local138 - -22, local2);
			}
		} catch (@Pc(222) Exception local222) {
			Static49.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZIILclient!jc;Lclient!jc;)Lclient!dc;")
	public static Class2_Sub4_Sub5 method938(@OriginalArg(1) int arg0, @OriginalArg(3) Class40 arg1, @OriginalArg(4) Class40 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(12) int[] local12 = arg2.method1780(arg0);
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(24) byte[] local24 = arg2.method1770(local12[local14], arg0);
			if (local24 == null) {
				local7 = false;
			} else {
				@Pc(44) int local44 = (local24[0] & 0xFF) << 8 | local24[1] & 0xFF;
				@Pc(60) byte[] local60 = arg1.method1770(0, local44);
				if (local60 == null) {
					local7 = false;
				}
			}
		}
		if (!local7) {
			return null;
		}
		try {
			return new Class2_Sub4_Sub5(arg2, arg1, arg0, false);
		} catch (@Pc(82) Exception local82) {
			return null;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BLclient!jc;)V")
	public static void method939(@OriginalArg(1) Class40 arg0) {
		Static180.aClass40_42 = arg0;
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(B)V")
	public static void method943() {
		anIntArray108 = null;
		anIntArray107 = null;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IB)V")
	public static void method944(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static131.method2109(arg0)) {
			return;
		}
		@Pc(18) Class24[] local18 = Static23.aClass24ArrayArray1[arg0];
		for (@Pc(24) int local24 = 0; local24 < local18.length; local24++) {
			@Pc(30) Class24 local30 = local18[local24];
			if (local30.anObjectArray1 != null) {
				@Pc(37) Class2_Sub21 local37 = new Class2_Sub21();
				local37.aClass24_9 = local30;
				local37.anObjectArray29 = local30.anObjectArray1;
				Static73.method1333(local37, 2000000);
			}
		}
	}
}
