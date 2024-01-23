import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!ui", name = "z", descriptor = "Lclient!ed;")
	public static Class26 aClass26_3;

	@OriginalMember(owner = "client!ui", name = "A", descriptor = "I")
	public static int anInt4195;

	@OriginalMember(owner = "client!ui", name = "E", descriptor = "Lclient!pa;")
	public static Class86 aClass86_76;

	@OriginalMember(owner = "client!ui", name = "F", descriptor = "Lclient!v;")
	public static Class86_Sub1 aClass86_Sub1_41;

	@OriginalMember(owner = "client!ui", name = "G", descriptor = "[Lclient!di;")
	public static Class1_Sub9[] aClass1_Sub9Array1;

	@OriginalMember(owner = "client!ui", name = "H", descriptor = "[Lclient!ne;")
	public static Class78[] aClass78Array8;

	@OriginalMember(owner = "client!ui", name = "I", descriptor = "I")
	public static int anInt4196;

	@OriginalMember(owner = "client!ui", name = "p", descriptor = "Lclient!tb;")
	public static Class1_Sub25 aClass1_Sub25_1 = new Class1_Sub25(0, 0);

	@OriginalMember(owner = "client!ui", name = "r", descriptor = "Lclient!vb;")
	public static Class121 aClass121_5 = new Class121();

	@OriginalMember(owner = "client!ui", name = "v", descriptor = "I")
	public static int anInt4194 = 0;

	@OriginalMember(owner = "client!ui", name = "x", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1334 = Static186.method3527(":");

	@OriginalMember(owner = "client!ui", name = "y", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1335 = Static186.method3527("titlebg");

	@OriginalMember(owner = "client!ui", name = "B", descriptor = "J")
	public static long aLong161 = 0L;

	@OriginalMember(owner = "client!ui", name = "K", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1336 = Static186.method3527("; Expires=");

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILjava/awt/Color;ZILclient!hh;)V")
	public static void method3298(@OriginalArg(0) int arg0, @OriginalArg(1) Color arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class50 arg3) {
		try {
			@Pc(6) Graphics local6 = Static193.aCanvas4.getGraphics();
			if (Static28.aFont1 == null) {
				Static28.aFont1 = new Font("Helvetica", 1, 13);
				Static118.aFontMetrics1 = Static193.aCanvas4.getFontMetrics(Static28.aFont1);
			}
			if (arg2) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static185.anInt3844, Static48.anInt1023);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			try {
				if (Static206.anImage3 == null) {
					Static206.anImage3 = Static193.aCanvas4.createImage(304, 34);
				}
				@Pc(54) Graphics local54 = Static206.anImage3.getGraphics();
				local54.setColor(arg1);
				local54.drawRect(0, 0, 303, 33);
				local54.fillRect(2, 2, arg0 * 3, 30);
				local54.setColor(Color.black);
				local54.drawRect(1, 1, 301, 31);
				local54.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
				local54.setFont(Static28.aFont1);
				local54.setColor(Color.white);
				arg3.method1231(22, local54, (304 - arg3.method1242(Static118.aFontMetrics1)) / 2);
				local6.drawImage(Static206.anImage3, Static185.anInt3844 / 2 - 152, Static48.anInt1023 / 2 + -18, null);
			} catch (@Pc(131) Exception local131) {
				@Pc(137) int local137 = Static185.anInt3844 / 2 - 152;
				@Pc(143) int local143 = Static48.anInt1023 / 2 - 18;
				local6.setColor(arg1);
				local6.drawRect(local137, local143, 303, 33);
				local6.fillRect(local137 + 2, local143 - -2, arg0 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local137 + 1, local143 + 1, 301, 31);
				local6.fillRect(local137 + arg0 * 3 + 2, local143 + 2, 300 - arg0 * 3, 30);
				local6.setFont(Static28.aFont1);
				local6.setColor(Color.white);
				arg3.method1231(local143 + 22, local6, (304 - arg3.method1242(Static118.aFontMetrics1)) / 2 + local137);
			}
			if (Static162.aClass50_1088 != null) {
				local6.setFont(Static28.aFont1);
				local6.setColor(Color.white);
				Static162.aClass50_1088.method1231(Static48.anInt1023 / 2 - 26, local6, Static185.anInt3844 / 2 - Static162.aClass50_1088.method1242(Static118.aFontMetrics1) / 2);
			}
		} catch (@Pc(250) Exception local250) {
			Static193.aCanvas4.repaint();
		}
	}
}
