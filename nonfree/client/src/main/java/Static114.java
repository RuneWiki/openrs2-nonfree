import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!li", name = "S", descriptor = "I")
	private static int anInt655;

	@OriginalMember(owner = "client!li", name = "d", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_239 = Static161.method2452("Art");

	@OriginalMember(owner = "client!li", name = "j", descriptor = "[Lclient!dc;")
	public static final Class20[] aClass20Array4 = new Class20[100];

	@OriginalMember(owner = "client!li", name = "I", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_242 = Static161.method2452("Select");

	@OriginalMember(owner = "client!li", name = "p", descriptor = "Lclient!dc;")
	public static Class20 aClass20_240 = aClass20_242;

	@OriginalMember(owner = "client!li", name = "B", descriptor = "[Lclient!lg;")
	public static final Class1_Sub5[] aClass1_Sub5Array2 = new Class1_Sub5[4];

	@OriginalMember(owner = "client!li", name = "F", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_241 = Static161.method2452("Registrierter Benutzer");

	@OriginalMember(owner = "client!li", name = "H", descriptor = "I")
	public static int anInt648 = 0;

	@OriginalMember(owner = "client!li", name = "P", descriptor = "[I")
	public static final int[] anIntArray42 = new int[] { 2, 2, 4, 0, 1, 8, 0 };

	@OriginalMember(owner = "client!li", name = "Q", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_243 = Static161.method2452("hitmarks");

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IZ)Lclient!b;")
	public static Class5_Sub2_Sub4 method496(@OriginalArg(0) int arg0) {
		@Pc(10) Class5_Sub2_Sub4 local10 = (Class5_Sub2_Sub4) Static83.aClass8_17.method227((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static138.aClass23_76.method738(arg0, 4);
		local10 = new Class5_Sub2_Sub4();
		if (local20 != null) {
			local10.method209(new Class5_Sub6(local20), arg0);
		}
		Static83.aClass8_17.method232((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(III)Z")
	public static boolean method499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		@Pc(28) Class5_Sub2_Sub7 local28 = Static63.method1046(arg0);
		return local28.method432(arg1);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ZILclient!se;)V")
	public static void method500(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class5_Sub25 arg1) {
		@Pc(11) int local11 = arg1.anInt3526;
		@Pc(15) int local15 = (int) arg1.aLong253;
		arg1.method3207();
		if (arg0) {
			Static93.method2412(local11);
		}
		Static5.method131(local11);
		@Pc(30) Class69 local30 = Static157.method2392(local15);
		if (local30 != null) {
			Static184.method2779(local30);
		}
		Static104.aBoolean95 = false;
		Static85.anInt1879 = 0;
		Static213.method3132(Static198.anInt3862, Static130.anInt2714, Static218.anInt4221, Static8.anInt207);
		if (Static130.anInt2715 != -1) {
			Static125.method1962(Static130.anInt2715, 1);
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Ljava/awt/Color;IIZLclient!dc;)V")
	public static void method502(@OriginalArg(0) Color arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class20 arg3) {
		try {
			@Pc(2) Graphics local2 = Static198.aCanvas1.getGraphics();
			if (Static36.aFont1 == null) {
				Static36.aFont1 = new Font("Helvetica", 1, 13);
				Static30.aFontMetrics1 = Static198.aCanvas1.getFontMetrics(Static36.aFont1);
			}
			if (arg2) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static101.anInt2163, Static90.anInt1933);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			try {
				if (Static218.anImage4 == null) {
					Static218.anImage4 = Static198.aCanvas1.createImage(304, 34);
				}
				@Pc(45) Graphics local45 = Static218.anImage4.getGraphics();
				local45.setColor(arg0);
				local45.drawRect(0, 0, 303, 33);
				local45.fillRect(2, 2, arg1 * 3, 30);
				local45.setColor(Color.black);
				local45.drawRect(1, 1, 301, 31);
				local45.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
				local45.setFont(Static36.aFont1);
				local45.setColor(Color.white);
				arg3.method575(22, local45, (304 - arg3.method552(Static30.aFontMetrics1)) / 2);
				local2.drawImage(Static218.anImage4, Static101.anInt2163 / 2 - 152, Static90.anInt1933 / 2 + -18, null);
			} catch (@Pc(128) Exception local128) {
				@Pc(134) int local134 = Static101.anInt2163 / 2 - 152;
				@Pc(140) int local140 = Static90.anInt1933 / 2 - 18;
				local2.setColor(arg0);
				local2.drawRect(local134, local140, 303, 33);
				local2.fillRect(local134 + 2, local140 - -2, arg1 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local134 + 1, local140 - -1, 301, 31);
				local2.fillRect(arg1 * 3 + local134 + 2, local140 - -2, 300 - arg1 * 3, 30);
				local2.setFont(Static36.aFont1);
				local2.setColor(Color.white);
				arg3.method575(local140 + 22, local2, local134 + (304 - arg3.method552(Static30.aFontMetrics1)) / 2);
			}
			if (Static116.aClass20_905 != null) {
				local2.setFont(Static36.aFont1);
				local2.setColor(Color.white);
				Static116.aClass20_905.method575(Static90.anInt1933 / 2 - 26, local2, Static101.anInt2163 / 2 - Static116.aClass20_905.method552(Static30.aFontMetrics1) / 2);
			}
		} catch (@Pc(251) Exception local251) {
			Static198.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!wa;II)Z")
	public static boolean method506(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1) {
		@Pc(15) byte[] local15 = arg0.method726(arg1);
		if (local15 == null) {
			return false;
		} else {
			Static33.method540(local15);
			return true;
		}
	}
}
