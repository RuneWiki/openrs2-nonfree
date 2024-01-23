import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!sg", name = "i", descriptor = "[I")
	public static int[] anIntArray504;

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1306 = Static200.method3116("<col=00ffff>");

	@OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
	public static int anInt3848 = 0;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)V")
	public static void method2861(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static87.aBooleanArray13[arg0]) {
			return;
		}
		Static10.aClass7_2.method3225(arg0);
		if (Static82.aClass6ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(25) boolean local25 = true;
		for (@Pc(32) int local32 = 0; local32 < Static82.aClass6ArrayArray1[arg0].length; local32++) {
			if (Static82.aClass6ArrayArray1[arg0][local32] != null) {
				if (Static82.aClass6ArrayArray1[arg0][local32].anInt233 == 2) {
					local25 = false;
				} else {
					Static82.aClass6ArrayArray1[arg0][local32] = null;
				}
			}
		}
		if (local25) {
			Static82.aClass6ArrayArray1[arg0] = null;
		}
		Static87.aBooleanArray13[arg0] = false;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
	public static void method2862() {
		@Pc(8) int[] local8 = new int[Static203.anInt4318];
		@Pc(10) int local10 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static203.anInt4318; local18++) {
			@Pc(24) Class1_Sub1_Sub18 local24 = Static191.method2990(local18);
			if (local24.anInt2984 >= 0 || local24.anInt3021 >= 0) {
				local8[local10++] = local18;
			}
		}
		Static186.anIntArray516 = new int[local10];
		for (@Pc(51) int local51 = 0; local51 < local10; local51++) {
			Static186.anIntArray516[local51] = local8[local51];
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IZ)Z")
	public static boolean method2863(@OriginalArg(0) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZILclient!kh;ILjava/awt/Color;)V")
	public static void method2865(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class60 arg2, @OriginalArg(4) Color arg3) {
		try {
			@Pc(6) Graphics local6 = Static78.aCanvas1.getGraphics();
			if (Static177.aFont1 == null) {
				Static177.aFont1 = new Font("Helvetica", 1, 13);
				Static54.aFontMetrics1 = Static78.aCanvas1.getFontMetrics(Static177.aFont1);
			}
			if (arg0) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static88.anInt2058, Static112.anInt2563);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			try {
				if (Static148.anImage44 == null) {
					Static148.anImage44 = Static78.aCanvas1.createImage(304, 34);
				}
				@Pc(54) Graphics local54 = Static148.anImage44.getGraphics();
				local54.setColor(arg3);
				local54.drawRect(0, 0, 303, 33);
				local54.fillRect(2, 2, arg1 * 3, 30);
				local54.setColor(Color.black);
				local54.drawRect(1, 1, 301, 31);
				local54.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
				local54.setFont(Static177.aFont1);
				local54.setColor(Color.white);
				arg2.method1824((304 - arg2.method1830(Static54.aFontMetrics1)) / 2, 22, local54);
				local6.drawImage(Static148.anImage44, Static88.anInt2058 / 2 - 152, Static112.anInt2563 / 2 + -18, null);
			} catch (@Pc(132) Exception local132) {
				@Pc(138) int local138 = Static88.anInt2058 / 2 - 152;
				@Pc(144) int local144 = Static112.anInt2563 / 2 - 18;
				local6.setColor(arg3);
				local6.drawRect(local138, local144, 303, 33);
				local6.fillRect(local138 + 2, local144 + 2, arg1 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local138 + 1, local144 + 1, 301, 31);
				local6.fillRect(arg1 * 3 + local138 + 2, local144 + 2, 300 - arg1 * 3, 30);
				local6.setFont(Static177.aFont1);
				local6.setColor(Color.white);
				arg2.method1824((304 - arg2.method1830(Static54.aFontMetrics1)) / 2 + local138, local144 - -22, local6);
			}
			if (Static42.aClass60_316 != null) {
				local6.setFont(Static177.aFont1);
				local6.setColor(Color.white);
				Static42.aClass60_316.method1824(Static88.anInt2058 / 2 - Static42.aClass60_316.method1830(Static54.aFontMetrics1) / 2, Static112.anInt2563 / 2 + -26, local6);
			}
		} catch (@Pc(256) Exception local256) {
			Static78.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIBI)V")
	public static void method2866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static76.method1363(arg1, arg0, arg3 + arg1, arg0 + arg2);
		Static76.method1367(arg1, arg0, arg3, arg2, 0);
		if (Static41.anInt971 < 100) {
			return;
		}
		if (Static160.aClass1_Sub1_Sub6_4 == null) {
			@Pc(34) Class1_Sub1_Sub6_Sub1 local34 = new Class1_Sub1_Sub6_Sub1(arg3, arg2);
			Static76.method1359(local34.anIntArray366, arg3, arg2);
			Static134.method2229(Static211.anInt3462, 0, Static30.anInt724, arg2, 0, 0, arg3, 0);
			Static160.aClass1_Sub1_Sub6_4 = local34;
			Static21.aClass5_1.method1979();
		}
		Static160.aClass1_Sub1_Sub6_4.method2166(arg1, arg0);
		@Pc(66) int local66 = arg1 + Static11.anInt4742 * arg3 / Static211.anInt3462;
		@Pc(74) int local74 = arg0 + Static38.anInt878 * arg2 / Static30.anInt724;
		@Pc(80) int local80 = Static91.anInt2142 * arg3 / Static211.anInt3462;
		@Pc(86) int local86 = arg2 * Static63.anInt1581 / Static30.anInt724;
		Static76.method1368(local66, local74, local80, local86, 16711680, 128);
		Static76.method1374(local66, local74, local80, local86, 16711680);
		if (Static216.anInt4616 <= 0 || Static216.anInt4616 % 10 >= 5) {
			return;
		}
		for (@Pc(121) Class1_Sub20 local121 = (Class1_Sub20) Static137.aClass19_19.method609(); local121 != null; local121 = (Class1_Sub20) Static137.aClass19_19.method615()) {
			if (local121.anInt3104 == Static164.anInt3599) {
				@Pc(137) int local137 = arg1 + arg3 * local121.anInt3103 / Static211.anInt3462;
				@Pc(146) int local146 = arg2 * local121.anInt3106 / Static30.anInt724 + arg0;
				Static76.method1367(local137 - 2, local146 + -2, 4, 4, 16776960);
			}
		}
	}
}
