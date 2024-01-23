import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!qh", name = "E", descriptor = "Lclient!ml;")
	public static Class73 aClass73_1;

	@OriginalMember(owner = "client!qh", name = "H", descriptor = "I")
	public static int anInt4301;

	@OriginalMember(owner = "client!qh", name = "C", descriptor = "I")
	public static int anInt4297 = 0;

	@OriginalMember(owner = "client!qh", name = "K", descriptor = "[C")
	public static char[] aCharArray4 = new char[128];

	@OriginalMember(owner = "client!qh", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString290 = "white:";

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIZB)V")
	public static void method3249(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		if (arg1 < 1) {
			arg1 = 1;
		}
		Static151.anInt3623 = (short) arg1;
		if (arg0 < 1) {
			arg0 = 1;
		}
		Static105.anInt2828 = (short) arg0;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Ljava/lang/String;IZBLjava/awt/Color;)V")
	public static void method3250(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Color arg3) {
		try {
			@Pc(2) Graphics local2 = Static98.aCanvas1.getGraphics();
			if (Static236.aFont1 == null) {
				Static236.aFont1 = new Font("Helvetica", 1, 13);
				Static174.aFontMetrics1 = Static98.aCanvas1.getFontMetrics(Static236.aFont1);
			}
			if (arg2) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static200.anInt4411, Static251.anInt5352);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			try {
				if (Static105.anImage1 == null) {
					Static105.anImage1 = Static98.aCanvas1.createImage(304, 34);
				}
				@Pc(50) Graphics local50 = Static105.anImage1.getGraphics();
				local50.setColor(arg3);
				local50.drawRect(0, 0, 303, 33);
				local50.fillRect(2, 2, arg1 * 3, 30);
				local50.setColor(Color.black);
				local50.drawRect(1, 1, 301, 31);
				local50.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
				local50.setFont(Static236.aFont1);
				local50.setColor(Color.white);
				local50.drawString(arg0, (304 - Static174.aFontMetrics1.stringWidth(arg0)) / 2, 22);
				local2.drawImage(Static105.anImage1, Static200.anInt4411 / 2 - 152, Static251.anInt5352 / 2 - 18, null);
			} catch (@Pc(125) Exception local125) {
				@Pc(131) int local131 = Static200.anInt4411 / 2 - 152;
				@Pc(137) int local137 = Static251.anInt5352 / 2 - 18;
				local2.setColor(arg3);
				local2.drawRect(local131, local137, 303, 33);
				local2.fillRect(local131 + 2, local137 - -2, arg1 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local131 + 1, local137 - -1, 301, 31);
				local2.fillRect(local131 + arg1 * 3 + 2, local137 + 2, 300 - arg1 * 3, 30);
				local2.setFont(Static236.aFont1);
				local2.setColor(Color.white);
				local2.drawString(arg0, local131 + (304 - Static174.aFontMetrics1.stringWidth(arg0)) / 2, local137 + 22);
			}
			if (Static210.aString325 != null) {
				local2.setFont(Static236.aFont1);
				local2.setColor(Color.white);
				local2.drawString(Static210.aString325, Static200.anInt4411 / 2 - Static174.aFontMetrics1.stringWidth(Static210.aString325) / 2, Static251.anInt5352 / 2 + -26);
			}
		} catch (@Pc(240) Exception local240) {
			Static98.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIII)V")
	public static void method3252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) Class1_Sub23 local16 = (Class1_Sub23) Static249.aClass140_17.method4014((long) arg3);
		if (local16 == null) {
			local16 = new Class1_Sub23();
			Static249.aClass140_17.method4011(local16, (long) arg3);
		}
		if (local16.anIntArray342.length <= arg0) {
			@Pc(42) int[] local42 = new int[arg0 + 1];
			@Pc(47) int[] local47 = new int[arg0 + 1];
			for (@Pc(49) int local49 = 0; local49 < local16.anIntArray342.length; local49++) {
				local42[local49] = local16.anIntArray342[local49];
				local47[local49] = local16.anIntArray343[local49];
			}
			for (@Pc(79) int local79 = local16.anIntArray342.length; local79 < arg0; local79++) {
				local42[local79] = -1;
				local47[local79] = 0;
			}
			local16.anIntArray343 = local47;
			local16.anIntArray342 = local42;
		}
		local16.anIntArray342[arg0] = arg2;
		local16.anIntArray343[arg0] = arg1;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)V")
	public static void method3253(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2_Sub18 local10 = Static13.method232(arg0, 1);
		local10.method3805();
	}
}
