import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "Lclient!gh;")
	public static Class34 aClass34_1;

	@OriginalMember(owner = "client!uc", name = "k", descriptor = "Lclient!a;")
	public static Class1 aClass1_4;

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "Lclient!sg;")
	public static final Class91 aClass91_14 = new Class91(500);

	@OriginalMember(owner = "client!uc", name = "p", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1101 = Static181.method2795("; Max)2Age=");

	@OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
	public static int anInt3781 = 0;

	@OriginalMember(owner = "client!uc", name = "r", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_1102 = Static181.method2795("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!uc", name = "s", descriptor = "Lclient!qe;")
	public static Class83 aClass83_1103 = aClass83_1102;

	@OriginalMember(owner = "client!uc", name = "t", descriptor = "I")
	public static int anInt3782 = 0;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZILclient!qe;ILjava/awt/Color;)V")
	public static void method2870(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class83 arg2, @OriginalArg(4) Color arg3) {
		try {
			@Pc(2) Graphics local2 = Static69.aCanvas1.getGraphics();
			if (Static159.aFont1 == null) {
				Static159.aFont1 = new Font("Helvetica", 1, 13);
				Static210.aFontMetrics1 = Static69.aCanvas1.getFontMetrics(Static159.aFont1);
			}
			if (arg0) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static89.anInt4290, Static190.anInt3767);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			try {
				if (Static93.anImage3 == null) {
					Static93.anImage3 = Static69.aCanvas1.createImage(304, 34);
				}
				@Pc(45) Graphics local45 = Static93.anImage3.getGraphics();
				local45.setColor(arg3);
				local45.drawRect(0, 0, 303, 33);
				local45.fillRect(2, 2, arg1 * 3, 30);
				local45.setColor(Color.black);
				local45.drawRect(1, 1, 301, 31);
				local45.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
				local45.setFont(Static159.aFont1);
				local45.setColor(Color.white);
				arg2.method2429(22, (304 - arg2.method2389(Static210.aFontMetrics1)) / 2, local45);
				local2.drawImage(Static93.anImage3, Static89.anInt4290 / 2 - 152, Static190.anInt3767 / 2 + -18, null);
			} catch (@Pc(128) Exception local128) {
				@Pc(134) int local134 = Static89.anInt4290 / 2 - 152;
				@Pc(140) int local140 = Static190.anInt3767 / 2 - 18;
				local2.setColor(arg3);
				local2.drawRect(local134, local140, 303, 33);
				local2.fillRect(local134 + 2, local140 + 2, arg1 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local134 + 1, local140 + 1, 301, 31);
				local2.fillRect(arg1 * 3 + local134 + 2, local140 + 2, 300 - arg1 * 3, 30);
				local2.setFont(Static159.aFont1);
				local2.setColor(Color.white);
				arg2.method2429(local140 + 22, local134 - -((304 - arg2.method2389(Static210.aFontMetrics1)) / 2), local2);
			}
			if (Static163.aClass83_961 != null) {
				local2.setFont(Static159.aFont1);
				local2.setColor(Color.white);
				Static163.aClass83_961.method2429(Static190.anInt3767 / 2 - 26, Static89.anInt4290 / 2 + -(Static163.aClass83_961.method2389(Static210.aFontMetrics1) / 2), local2);
			}
		} catch (@Pc(247) Exception local247) {
			Static69.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)I")
	public static int method2871(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
