import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
	public static int anInt2138;

	@OriginalMember(owner = "client!ta", name = "k", descriptor = "[[B")
	public static byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V", line = 4)
	public static void method1466() {
		aByteArrayArray10 = null;
		Class57.anIntArrayArrayArray8 = null;
		Class57.aClass40_612 = null;
		Class57.aClass44ArrayArrayArray1 = null;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/awt/Color;Lclient!o;II)V", line = 32)
	public static void method1467(@OriginalArg(0) Color arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) int arg2) {
		if (Static20.aFont1 == null) {
			Static20.aFont1 = new Font("Helvetica", 1, 13);
			Static24.aFontMetrics1 = Static7.method185().getFontMetrics(Static20.aFont1);
		}
		if (Class1.aBoolean1) {
			Class1.aBoolean1 = false;
			Static23.aGraphics1.setColor(Color.black);
			Static23.aGraphics1.fillRect(0, 0, Static77.anInt1991, Static70.anInt2154);
		}
		if (arg0 == null) {
			arg0 = new Color(140, 17, 17);
		}
		try {
			if (Static71.anImage4 == null) {
				Static71.anImage4 = Static7.method185().createImage(304, 34);
			}
			@Pc(58) Graphics local58 = Static71.anImage4.getGraphics();
			local58.setColor(arg0);
			local58.drawRect(0, 0, 303, 33);
			local58.fillRect(2, 2, arg2 * 3, 30);
			local58.setColor(Color.black);
			local58.drawRect(1, 1, 301, 31);
			local58.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
			local58.setFont(Static20.aFont1);
			local58.setColor(Color.white);
			arg1.method1194(22, local58, (304 - arg1.method1181(Static24.aFontMetrics1)) / 2);
			Static23.aGraphics1.drawImage(Static71.anImage4, Static77.anInt1991 / 2 - 152, Static70.anInt2154 / 2 + -18, null);
		} catch (@Pc(135) Exception local135) {
			@Pc(141) int local141 = Static77.anInt1991 / 2 - 152;
			@Pc(147) int local147 = Static70.anInt2154 / 2 - 18;
			Static23.aGraphics1.setColor(arg0);
			Static23.aGraphics1.drawRect(local141, local147, 303, 33);
			Static23.aGraphics1.fillRect(local141 + 2, local147 - -2, arg2 * 3, 30);
			Static23.aGraphics1.setColor(Color.black);
			Static23.aGraphics1.drawRect(local141 + 1, local147 - -1, 301, 31);
			Static23.aGraphics1.fillRect(local141 + arg2 * 3 + 2, local147 + 2, 300 - arg2 * 3, 30);
			Static23.aGraphics1.setFont(Static20.aFont1);
			Static23.aGraphics1.setColor(Color.white);
			arg1.method1194(local147 + 22, Static23.aGraphics1, (304 - arg1.method1181(Static24.aFontMetrics1)) / 2 + local141);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!ke;II)V", line = 97)
	public static void method1468(@OriginalArg(0) Class2_Sub2_Sub12_Sub1 arg0, @OriginalArg(1) int arg1) {
		if (arg0.anInt2275 < 128 || arg0.anInt2284 < 128 || arg0.anInt2275 >= 13184 || arg0.anInt2284 >= 13184) {
			arg0.anInt2297 = 0;
			arg0.anInt2277 = 0;
			arg0.anInt2302 = -1;
			arg0.anInt2307 = -1;
			arg0.anInt2275 = arg0.anInt2278 * 64 + arg0.anIntArray492[0] * 128;
			arg0.anInt2284 = arg0.anInt2278 * 64 + arg0.anIntArray496[0] * 128;
			arg0.method1543();
		}
		if (Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1 == arg0 && (arg0.anInt2275 < 1536 || arg0.anInt2284 < 1536 || arg0.anInt2275 >= 11776 || arg0.anInt2284 >= 11776)) {
			arg0.anInt2302 = -1;
			arg0.anInt2277 = 0;
			arg0.anInt2307 = -1;
			arg0.anInt2297 = 0;
			arg0.anInt2275 = arg0.anIntArray492[0] * 128 + arg0.anInt2278 * 64;
			arg0.anInt2284 = arg0.anIntArray496[0] * 128 + arg0.anInt2278 * 64;
			arg0.method1543();
		}
		if (Class24.anInt2511 < arg0.anInt2277) {
			Static3.method25(arg0);
		} else if (arg0.anInt2297 >= Class24.anInt2511) {
			Static1.method4(arg0);
		} else {
			Static40.method1240(arg0);
		}
		Static56.method1040(arg0);
		Static88.method1553(arg0);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZI)Lclient!v;", line = 158)
	public static Class2_Sub2_Sub15 method1469(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub2_Sub15 local10 = (Class2_Sub2_Sub15) Class62.aClass47_22.method1325((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static63.aClass5_5.method68(arg0, 3);
		local10 = new Class2_Sub2_Sub15();
		if (local20 != null) {
			local10.method1587(new Class2_Sub3(local20));
		}
		Class62.aClass47_22.method1332((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BI)Lclient!ia;", line = 208)
	public static Class2_Sub2_Sub10 method1470(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub2_Sub10 local10 = (Class2_Sub2_Sub10) Class2_Sub2_Sub9.aClass47_11.method1325((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static67.aClass5_23.method68(arg0, 6);
		local10 = new Class2_Sub2_Sub10();
		local10.anInt1033 = arg0;
		if (local25 != null) {
			local10.method767(new Class2_Sub3(local25));
		}
		local10.method772();
		if (local10.aBoolean83) {
			local10.aBoolean77 = false;
			local10.aBoolean79 = false;
		}
		Class2_Sub2_Sub9.aClass47_11.method1332((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!ud;Lclient!ud;BLclient!ud;)V", line = 248)
	public static void method1471(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(3) Class5 arg2) {
		Static74.aClass5_26 = arg2;
		Static49.aClass5_17 = arg1;
		Static54.aClass5_20 = arg0;
		Static46.aClass2_Sub2_Sub13ArrayArray1 = new Class2_Sub2_Sub13[Static49.aClass5_17.method71()][];
		Static84.aBooleanArray31 = new boolean[Static49.aClass5_17.method71()];
	}
}
