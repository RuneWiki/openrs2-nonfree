import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!je", name = "O", descriptor = "J")
	public static long aLong50;

	@OriginalMember(owner = "client!je", name = "V", descriptor = "Z")
	public static boolean aBoolean51;

	@OriginalMember(owner = "client!je", name = "X", descriptor = "[Lclient!vd;")
	public static Class5_Sub2_Sub1_Sub4[] aClass5_Sub2_Sub1_Sub4Array4;

	@OriginalMember(owner = "client!je", name = "Z", descriptor = "Lclient!gf;")
	public static Class30 aClass30_7;

	@OriginalMember(owner = "client!je", name = "ab", descriptor = "Lclient!ff;")
	public static Class26 aClass26_7;

	@OriginalMember(owner = "client!je", name = "g", descriptor = "Lclient!ge;")
	public static Class29 aClass29_15 = new Class29(100);

	@OriginalMember(owner = "client!je", name = "D", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1 = new int[4][13][13];

	@OriginalMember(owner = "client!je", name = "G", descriptor = "Lclient!r;")
	public static Class61 aClass61_460 = Static129.method2060("");

	@OriginalMember(owner = "client!je", name = "Q", descriptor = "[I")
	public static int[] anIntArray217 = new int[128];

	@OriginalMember(owner = "client!je", name = "R", descriptor = "Lclient!r;")
	public static Class61 aClass61_461 = Static129.method2060("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!je", name = "S", descriptor = "[Z")
	public static boolean[] aBooleanArray8 = new boolean[100];

	@OriginalMember(owner = "client!je", name = "T", descriptor = "Lclient!e;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!je", name = "U", descriptor = "I")
	public static int anInt1457 = 0;

	@OriginalMember(owner = "client!je", name = "W", descriptor = "I")
	public static int anInt1458 = 0;

	@OriginalMember(owner = "client!je", name = "Y", descriptor = "I")
	public static int anInt1459 = 0;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
	public static void method1019() {
		for (@Pc(15) Class5_Sub3 local15 = (Class5_Sub3) Static112.aClass58_64.method1669(); local15 != null; local15 = (Class5_Sub3) Static112.aClass58_64.method1664()) {
			if (local15.aClass5_Sub5_Sub2_2 != null) {
				Static85.aClass5_Sub5_Sub4_2.method1569(local15.aClass5_Sub5_Sub2_2);
				local15.aClass5_Sub5_Sub2_2 = null;
			}
			if (local15.aClass5_Sub5_Sub2_1 != null) {
				Static85.aClass5_Sub5_Sub4_2.method1569(local15.aClass5_Sub5_Sub2_1);
				local15.aClass5_Sub5_Sub2_1 = null;
			}
		}
		Static112.aClass58_64.method1668();
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIIILclient!ke;)V")
	public static void method1020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class5_Sub11 arg6) {
		if (Static2.aBoolean1) {
			Static116.anInt2989 = 32;
		} else {
			Static116.anInt2989 = 0;
		}
		Static2.aBoolean1 = false;
		@Pc(130) int local130;
		if (Static8.anInt190 != 0) {
			if (arg5 <= arg1 && arg5 + 16 > arg1 && arg3 >= arg0 && arg3 < arg0 + 16) {
				arg6.anInt1660 -= 4;
				Static24.method505(arg6);
			} else if (arg1 >= arg5 && arg1 < arg5 + 16 && arg4 + arg0 - 16 <= arg3 && arg3 < arg0 + arg4) {
				arg6.anInt1660 += 4;
				Static24.method505(arg6);
			} else if (arg1 >= arg5 - Static116.anInt2989 && arg5 + Static116.anInt2989 + 16 > arg1 && arg3 >= arg0 + 16 && arg3 < arg4 + arg0 - 16) {
				local130 = arg4 * (arg4 - 32) / arg2;
				if (local130 < 8) {
					local130 = 8;
				}
				@Pc(142) int local142 = arg4 - local130 - 32;
				@Pc(152) int local152 = arg3 - arg0 - local130 / 2 - 16;
				arg6.anInt1660 = local152 * (arg2 - arg4) / local142;
				Static24.method505(arg6);
				Static2.aBoolean1 = true;
			}
		}
		if (Static90.anInt2381 == 0) {
			return;
		}
		local130 = arg6.anInt1653;
		if (arg5 - local130 <= arg1 && arg3 >= arg0 && arg5 + 16 > arg1 && arg0 + arg4 >= arg3) {
			arg6.anInt1660 += Static90.anInt2381 * 45;
			Static24.method505(arg6);
			return;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/awt/Color;IILclient!r;)V")
	public static void method1021(@OriginalArg(0) Color arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class61 arg2) {
		try {
			@Pc(6) Graphics local6 = Static4.aCanvas2.getGraphics();
			if (Static105.aFont32 == null) {
				Static105.aFont32 = new Font("Helvetica", 1, 13);
				Static85.aFontMetrics1 = Static4.aCanvas2.getFontMetrics(Static105.aFont32);
			}
			if (Static58.aBoolean50) {
				Static58.aBoolean50 = false;
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static4.anInt2610, Static75.anInt1775);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			try {
				if (Static31.anImage1 == null) {
					Static31.anImage1 = Static4.aCanvas2.createImage(304, 34);
				}
				@Pc(51) Graphics local51 = Static31.anImage1.getGraphics();
				local51.setColor(arg0);
				local51.drawRect(0, 0, 303, 33);
				local51.fillRect(2, 2, arg1 * 3, 30);
				local51.setColor(Color.black);
				local51.drawRect(1, 1, 301, 31);
				local51.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
				local51.setFont(Static105.aFont32);
				local51.setColor(Color.white);
				arg2.method1738((304 - arg2.method1722(Static85.aFontMetrics1)) / 2, local51, 22);
				local6.drawImage(Static31.anImage1, Static4.anInt2610 / 2 - 152, Static75.anInt1775 / 2 - 18, null);
			} catch (@Pc(132) Exception local132) {
				@Pc(138) int local138 = Static4.anInt2610 / 2 - 152;
				@Pc(144) int local144 = Static75.anInt1775 / 2 - 18;
				local6.setColor(arg0);
				local6.drawRect(local138, local144, 303, 33);
				local6.fillRect(local138 + 2, local144 + 2, arg1 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local138 + 1, local144 + 1, 301, 31);
				local6.fillRect(local138 + arg1 * 3 + 2, local144 - -2, 300 - arg1 * 3, 30);
				local6.setFont(Static105.aFont32);
				local6.setColor(Color.white);
				arg2.method1738((304 - arg2.method1722(Static85.aFontMetrics1)) / 2 + local138, local6, local144 + 22);
			}
		} catch (@Pc(221) Exception local221) {
			Static4.aCanvas2.repaint();
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
	public static void method1022() {
		anIntArray217 = null;
		aClass26_7 = null;
		aClass5_Sub2_Sub1_Sub4Array4 = null;
		aClass61_461 = null;
		anIntArrayArrayArray1 = null;
		aClass29_15 = null;
		aClass30_7 = null;
		aBooleanArray8 = null;
		aClass61_460 = null;
	}
}
