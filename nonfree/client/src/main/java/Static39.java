import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!ef", name = "db", descriptor = "I")
	public static int anInt1129;

	@OriginalMember(owner = "client!ef", name = "S", descriptor = "Lclient!ai;")
	public static Class6 aClass6_301 = Static38.method685("<)4col> x");

	@OriginalMember(owner = "client!ef", name = "X", descriptor = "Lclient!ai;")
	public static Class6 aClass6_302 = Static38.method685(" (X");

	@OriginalMember(owner = "client!ef", name = "Z", descriptor = "I")
	public static volatile int anInt1125 = 0;

	@OriginalMember(owner = "client!ef", name = "gb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_303 = Static38.method685("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!ef", name = "hb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_304 = Static38.method685("welle2:");

	@OriginalMember(owner = "client!ef", name = "ib", descriptor = "Lclient!ai;")
	public static Class6 aClass6_305 = Static38.method685("AUS");

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILclient!me;)V")
	public static void method704(@OriginalArg(1) Class2_Sub13 arg0) {
		if (Static180.aClass38_5 != null) {
			try {
				Static180.aClass38_5.method1161(0L);
				Static180.aClass38_5.method1162(24, arg0.anInt2154, arg0.aByteArray14);
			} catch (@Pc(21) Exception local21) {
			}
		}
		arg0.anInt2154 += 24;
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)Lclient!bi;")
	public static Class2_Sub3_Sub3 method705(@OriginalArg(1) int arg0) {
		@Pc(6) Class2_Sub3_Sub3 local6 = (Class2_Sub3_Sub3) Static81.aClass17_10.method505((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static41.aClass10_45.method1605(arg0, 16);
		local6 = new Class2_Sub3_Sub3();
		if (local20 != null) {
			local6.method320(new Class2_Sub13(local20));
		}
		Static81.aClass17_10.method508((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(III)I")
	public static int method706(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) long local10 = (long) (arg1 + (arg0 << 16));
		return Static139.aClass2_Sub3_Sub18_1 != null && Static139.aClass2_Sub3_Sub18_1.aLong241 == local10 ? Static88.aClass2_Sub13_3.anInt2154 * 99 / (Static88.aClass2_Sub13_3.aByteArray14.length - Static139.aClass2_Sub3_Sub18_1.aByte9) + 1 : 0;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!ai;Ljava/awt/Color;IB)V")
	public static void method707(@OriginalArg(0) Class6 arg0, @OriginalArg(1) Color arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(6) Graphics local6 = Static121.aCanvas1.getGraphics();
			if (Static138.aFont1 == null) {
				Static138.aFont1 = new Font("Helvetica", 1, 13);
				Static41.aFontMetrics1 = Static121.aCanvas1.getFontMetrics(Static138.aFont1);
			}
			if (Static76.aBoolean67) {
				Static76.aBoolean67 = false;
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static172.anInt4038, Static174.anInt4037);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			try {
				if (Static25.anImage1 == null) {
					Static25.anImage1 = Static121.aCanvas1.createImage(304, 34);
				}
				@Pc(51) Graphics local51 = Static25.anImage1.getGraphics();
				local51.setColor(arg1);
				local51.drawRect(0, 0, 303, 33);
				local51.fillRect(2, 2, arg2 * 3, 30);
				local51.setColor(Color.black);
				local51.drawRect(1, 1, 301, 31);
				local51.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
				local51.setFont(Static138.aFont1);
				local51.setColor(Color.white);
				arg0.method125(22, (304 - arg0.method101(Static41.aFontMetrics1)) / 2, local51);
				local6.drawImage(Static25.anImage1, Static172.anInt4038 / 2 - 152, Static174.anInt4037 / 2 - 18, null);
			} catch (@Pc(134) Exception local134) {
				@Pc(140) int local140 = Static172.anInt4038 / 2 - 152;
				@Pc(146) int local146 = Static174.anInt4037 / 2 - 18;
				local6.setColor(arg1);
				local6.drawRect(local140, local146, 303, 33);
				local6.fillRect(local140 + 2, local146 + 2, arg2 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local140 + 1, local146 + 1, 301, 31);
				local6.fillRect(local140 + arg2 * 3 + 2, local146 + 2, 300 - arg2 * 3, 30);
				local6.setFont(Static138.aFont1);
				local6.setColor(Color.white);
				arg0.method125(local146 + 22, (-arg0.method101(Static41.aFontMetrics1) + 304) / 2 + local140, local6);
			}
		} catch (@Pc(225) Exception local225) {
			Static121.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(B)V")
	public static void method708() {
		aClass6_304 = null;
		aClass6_305 = null;
		aClass6_302 = null;
		aClass6_303 = null;
		aClass6_301 = null;
	}
}
